package org.apache.commons.lang;

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
    public void test0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0501");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("H", (int) (byte) -1, "hHHi!iHHi!hHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H" + "'", str4, "H");
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!" + "'", str1, "Hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!");
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hhhI!IhhI!hhhi!ihhi!!HI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHi!iHHi!HHHI!IHHI!!hi!!" + "'", str1, "HHHi!iHHi!HHHI!IHHI!!hi!!");
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hH", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hH" + "'", str2, "hH");
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("HHhhhi!ihhi!hi!!h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhhi!ihhi!hi!!h" + "'", str1, "Hhhhhi!ihhi!hi!!h");
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
        char[] charArray8 = new char[] {};
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray8);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("H", charArray8);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("hi!", charArray8);
        java.lang.Class<?> wildcardClass17 = charArray8.getClass();
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hi!" + "'", str12, "Hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "h" + "'", str14, "h");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hh", (int) ' ', (int) (short) 10, "hHHHI!IHHI!HI!!H");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end 32, length 2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("HhhI!IhhI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        char[] charArray6 = new char[] {};
        java.lang.String str7 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray6);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.initials("", charArray6);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray6);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray6);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("", charArray6);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray6);
        java.lang.Class<?> wildcardClass13 = charArray6.getClass();
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hi!" + "'", str10, "Hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "h" + "'", str12, "h");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        char[] charArray5 = new char[] {};
        java.lang.String str6 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray5);
        java.lang.String str7 = org.apache.commons.lang.WordUtils.initials("", charArray5);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray5);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalizeFully("Hh", charArray5);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("hhhhI!IhhI!HI!!h", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Hh" + "'", str9, "Hh");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hhhhI!IhhI!HI!!h" + "'", str10, "hhhhI!IhhI!HI!!h");
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("HHHi!iHHi!hi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhI!IhhI!HI!!" + "'", str1, "hhhI!IhhI!HI!!");
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        char[] charArray6 = new char[] {};
        java.lang.String str7 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray6);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.initials("", charArray6);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray6);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("hH", charArray6);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("hI!", charArray6);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("HI!", charArray6);
        java.lang.Class<?> wildcardClass13 = charArray6.getClass();
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Hi!" + "'", str9, "Hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hI!" + "'", str11, "hI!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HI!" + "'", str12, "HI!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HHHHi!iHHi!hi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHHi!iHHi!hi!!" + "'", str1, "hHHHi!iHHi!hi!!");
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hHHHi!iHHi!hi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hHHHi!iHHi!hi!!", 100, "hHHi!iHHi!hHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHHi!iHHi!hi!!" + "'", str4, "hHHHi!iHHi!hi!!");
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        char[] charArray7 = new char[] {};
        java.lang.String str8 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("hi!", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("", charArray7);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("HI!", charArray7);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("hH", charArray7);
        java.lang.Class<?> wildcardClass15 = charArray7.getClass();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HI!" + "'", str11, "HI!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HI!" + "'", str13, "HI!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hH" + "'", str14, "hH");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHi!", (int) (byte) -1, (int) '#', "HhH");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHi!" + "'", str4, "HHi!");
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hHh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("HHHi!iHHi!HhhhI!IhhI!HI!!h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhI!IhhI!hHHHi!iHHi!hi!!H" + "'", str1, "hhhI!IhhI!hHHHi!iHHi!hi!!H");
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHHi!iHHi!hHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHHi!iHHi!hHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!" + "'", str2, "hHHi!iHHi!hHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!");
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("Hhhhi!ihhi!hi!!h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHHHI!HHHI!IHHI!!", (int) (byte) 0, (int) 'a', "HH");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHHI!HHHI!IHHI!!" + "'", str4, "hHHHI!HHHI!IHHI!!");
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("HHHi!iHHi!HHHI!IHHI!!hi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhI!IhhI!hhhi!ihhi!!HI!!" + "'", str1, "hhhI!IhhI!hhhi!ihhi!!HI!!");
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHh", (int) (short) 100, 10, "hHi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end 100, length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hhhhI!IhhI!HI!!h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhhI!IhhI!HI!!h" + "'", str1, "hhhhI!IhhI!HI!!h");
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("HhI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhi!" + "'", str1, "Hhi!");
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("", (int) (short) 10, (int) '4', "HHhi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHHi!iHHi!HhhhI!IhhI!HI!!h", 1, 0, "hhi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhi!" + "'", str4, "Hhhi!");
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhhI!IhhI!!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhI!IhhI!!" + "'", str2, "hhhI!IhhI!!");
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhI!", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhI!" + "'", str2, "hhI!");
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!Hhhi!hhHI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhi!Hhhi!hhHI!" + "'", str1, "hhhi!Hhhi!hhHI!");
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hHHi!iHHi!hHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("", (int) (byte) -1, "HHHHi!iHHi!hi!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
        char[] charArray8 = new char[] {};
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("H", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("hhI!", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("hH", charArray8);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("hHHi!iHHi!!", charArray8);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("hH", charArray8);
        java.lang.Class<?> wildcardClass17 = charArray8.getClass();
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H" + "'", str12, "H");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hH" + "'", str16, "hH");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hhhi!Hhhi!hhHI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHI!hHHI!HHhi!" + "'", str1, "HHHI!hHHI!HHhi!");
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("Hhhhi!hhhi!ihhi!!", (int) (byte) -1, "HhH", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHhHhHhHhHhHhHhHiHhH!HhHhHhHhHhHhHhHiHhH!HhHiHhHhHhHhHhHiHhH!HhH!" + "'", str4, "HHhHhHhHhHhHhHhHiHhH!HhHhHhHhHhHhHhHiHhH!HhHiHhHhHhHhHhHiHhH!HhH!");
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!Hhhi!hhHI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!hhhi!hhhi!" + "'", str1, "Hhhi!hhhi!hhhi!");
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hhHHi!iHHi!HHHI!IHHI!!hi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("", (int) (byte) -1, (int) '#', "HhHI!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HHI!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHI!" + "'", str2, "HHI!");
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!", (int) (short) 0, "HhhhI!IhhI!HI!!h", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hIHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!h!HhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hhHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hIHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!h!HhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hiHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hIHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!h!HhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!h!" + "'", str4, "hHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hIHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!h!HhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hhHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hIHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!h!HhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hiHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hIHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!h!HhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!h!");
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HhhI!IhhI!!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HhhI!IhhI!!" + "'", str2, "HhhI!IhhI!!");
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("Hhhi!Hhhi!hhHI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hhi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhi!" + "'", str1, "Hhi!");
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("HhHI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HhHI!" + "'", str1, "HhHI!");
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("Hhhi!", (int) (short) 1, "hHHHI!HHHI!IHHI!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhi!" + "'", str4, "Hhhi!");
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hhHI!", 1, "hhhI!IhhI!!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!" + "'", str4, "hhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!");
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hHh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHh" + "'", str1, "HHh");
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("HhhI!IhhI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!ihhi!!" + "'", str1, "Hhhi!ihhi!!");
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
        char[] charArray9 = new char[] {};
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray9);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("hh", charArray9);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("H", charArray9);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("Hh", charArray9);
        java.lang.Class<?> wildcardClass19 = charArray9.getClass();
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hi!" + "'", str13, "Hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hh" + "'", str16, "hh");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H" + "'", str17, "H");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hh" + "'", str18, "Hh");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("HhhI!IhhI!hhhi!ihhi!!HI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!ihhi!hhhi!ihhi!!hi!!" + "'", str1, "Hhhi!ihhi!hhhi!ihhi!!hi!!");
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!", (int) 'a', "hHHHI!HHHI!IHHI!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!" + "'", str4, "Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!");
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.capitalize("hhhhi!ihhi!hi!!h", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhhi!ihhi!hi!!h" + "'", str2, "Hhhhi!ihhi!hi!!h");
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhhi!ihhi!hi!!h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!ihhi!hi!!h" + "'", str1, "Hhhhi!ihhi!hi!!h");
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!ihhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!ihhi!!" + "'", str1, "Hhhi!ihhi!!");
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhhhI!IhhI!HI!!h", (int) ' ', (int) (byte) 10, "HHHI!hHHI!iHHI!!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end 32, length 16");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("Hi!", (int) (short) -1, "HI!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHI!iHI!!" + "'", str4, "HHI!iHI!!");
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhHHi!iHHi!HHHI!IHHI!!hi!!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhHHi!iHHi!HHHI!IHHI!!hi!!" + "'", str2, "hhHHi!iHHi!HHHI!IHHI!!hi!!");
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!ihhi!hhhi!ihhi!!hi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!ihhi!hhhi!ihhi!!hi!!" + "'", str1, "Hhhi!ihhi!hhhi!ihhi!!hi!!");
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhhI!IhhI!!", (int) (byte) 0, (int) (byte) 1, "hHHHI!IHHI!HI!!H");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhHHHI!IHHI!HI!!H" + "'", str4, "hhHHHI!IHHI!HI!!H");
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hHHHI!IHHI!HI!!H", (int) '#', "hHHHI!IHHI!HI!!H", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHHI!IHHI!HI!!H" + "'", str4, "hHHHI!IHHI!HI!!H");
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.uncapitalize("HHI!", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHI!" + "'", str2, "hHI!");
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhhhi!ihhi!hi!!h", (int) (short) 10, (int) (byte) 10, "hhHHHI!IHHI!HI!!H");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhhhi!ihhhhHHHI!IHHI!HI!!H" + "'", str4, "Hhhhhi!ihhhhHHHI!IHHI!HI!!H");
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("Hhhi!ihhi!hi!!", (int) (short) 0, "hi!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!ihi!!hi!hhi!ihi!!hi!!" + "'", str4, "Hhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!ihi!!hi!hhi!ihi!!hi!!");
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhhi!hhhi!ihhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!hhhi!ihhi!!" + "'", str1, "Hhhhi!hhhi!ihhi!!");
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hhhI!IhhI!HI!!", (int) (byte) 0, "hhi!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhi!hhhi!hhhi!Ihhi!!hhi!Ihhi!hhhi!hhhi!Ihhi!!hhi!Hhhi!Ihhi!!hhi!!" + "'", str4, "hhhi!hhhi!hhhi!Ihhi!!hhi!Ihhi!hhhi!hhhi!Ihhi!!hhi!Hhhi!Ihhi!!hhi!!");
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hhHHHI!IHHI!HI!!H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("HHHI!hHHI!HHhi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhi!Hhhi!hhHI!" + "'", str1, "hhhi!Hhhi!hhHI!");
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("Hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HHhhhi!ihhi!hi!!h", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHhhhi!ihhi!hi!!h" + "'", str2, "HHhhhi!ihhi!hi!!h");
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hhhhi!hhhi!ihhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!hhhi!ihhi!!" + "'", str1, "Hhhhi!hhhi!ihhi!!");
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HHhi!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHhi!" + "'", str2, "HHhi!");
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!hhhi!hhhi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!hhhi!hhhi!" + "'", str1, "Hhhi!hhhi!hhhi!");
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHI!iHI!!", 1, (int) (byte) 100, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHI!iHI!!" + "'", str4, "HHI!iHI!!");
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HHHI!hHHI!iHHI!!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHHI!hHHI!iHHI!!" + "'", str2, "HHHI!hHHI!iHHI!!");
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hhhhi!ihhi!hi!!h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hHHi!iHHi!hHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HhhI!IhhI!Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!" + "'", str1, "HhhI!IhhI!Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!");
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
        char[] charArray6 = new char[] { '#', ' ', '4' };
        java.lang.String str7 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray6);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray6);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("HHHi!iHHi!!", charArray6);
        java.lang.Class<?> wildcardClass10 = charArray6.getClass();
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '#', ' ', '4' });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Hi!" + "'", str7, "Hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hi!" + "'", str8, "Hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hHHi!iHHi!!" + "'", str9, "hHHi!iHHi!!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!", (int) (short) -1, (int) '4', "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!" + "'", str4, "hhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!");
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("HhhI!IhhI!hHHHi!iHHi!hi!!H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!ihhi!hhhhi!ihhi!hi!!h" + "'", str1, "Hhhi!ihhi!hhhhi!ihhi!hi!!h");
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("HHI!iHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("HHHi!iHHi!hi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHi!iHHi!hi!!" + "'", str1, "HHHi!iHHi!hi!!");
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HhH", (int) '4', (int) (byte) 0, "Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end 52, length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HHH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHH" + "'", str1, "hHH");
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        char[] charArray7 = new char[] {};
        java.lang.String str8 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("", charArray7);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("hhI!", charArray7);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("hHH", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hi!" + "'", str11, "Hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hhI!" + "'", str13, "hhI!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
        char[] charArray8 = new char[] {};
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("Hi!", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray8);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray8);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("HHHI!HHHI!IHHI!!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hi!" + "'", str13, "Hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hi!" + "'", str14, "Hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HHHI!HHHI!IHHI!!" + "'", str16, "HHHI!HHHI!IHHI!!");
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        char[] charArray6 = new char[] { '#', '4', '4', '4' };
        java.lang.String str7 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray6);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.initials("hhI!", charArray6);
        java.lang.Class<?> wildcardClass9 = charArray6.getClass();
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '#', '4', '4', '4' });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Hi!" + "'", str7, "Hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "h" + "'", str8, "h");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhhhI!IhhI!HI!!h", (int) (short) 100, (int) '4', "HHHI!hHHI!iHHI!!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end 100, length 16");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hHHHi!iHHi!hi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HhhhI!IhhI!HI!!" + "'", str1, "HhhhI!IhhI!HI!!");
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hhhhI!IhhI!HI!!h", 100, "HHhHhHhHhHhHhHhHiHhH!HhHhHhHhHhHhHhHiHhH!HhHiHhHhHhHhHhHiHhH!HhH!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhhI!IhhI!HI!!h" + "'", str4, "hhhhI!IhhI!HI!!h");
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HhHI!", 100, (-1), "Hhhhhi!hhhi!ihhi!!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end 100, length 5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HhI!", (int) '#', "HHhi!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HhI!" + "'", str4, "HhI!");
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HhI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhI!" + "'", str1, "hhI!");
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhhi!ihhi!hhhhi!ihhi!hi!!h", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhi!ihhi!hhhhi!ihhi!hi!!h" + "'", str2, "Hhhi!ihhi!hhhhi!ihhi!hi!!h");
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
        char[] charArray1 = new char[] {};
        java.lang.String str2 = org.apache.commons.lang.WordUtils.capitalizeFully("HHI!", charArray1);
        java.lang.Class<?> wildcardClass3 = charArray1.getClass();
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHI!" + "'", str2, "HHI!");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
        char[] charArray6 = new char[] {};
        java.lang.String str7 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray6);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.initials("", charArray6);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray6);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("hH", charArray6);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("hI!", charArray6);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("HHi!", charArray6);
        java.lang.Class<?> wildcardClass13 = charArray6.getClass();
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Hi!" + "'", str9, "Hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hI!" + "'", str11, "hI!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
        char[] charArray8 = new char[] {};
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("hi!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("", charArray8);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("hI!", charArray8);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("HHI!", charArray8);
        java.lang.Class<?> wildcardClass17 = charArray8.getClass();
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hi!" + "'", str12, "Hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hI!" + "'", str15, "hI!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HHI!" + "'", str16, "HHI!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hHHHI!HHHI!IHHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HHhi!", 100, "", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHhi!" + "'", str4, "HHhi!");
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhhi!Hhhi!Ihhi!!", (int) 'a', (int) (byte) 1, "Hhhi!ihhi!hhhhi!ihhi!hi!!h");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end 97, length 16");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("h", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h" + "'", str2, "h");
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("Hhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!ihi!!hi!hhi!ihi!!hi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!ihi!!hi!hhi!ihi!!hi!!" + "'", str1, "hhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!ihi!!hi!hhi!ihi!!hi!!");
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhhhhi!hhhi!ihhi!!", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhhhi!hhhi!ihhi!!" + "'", str2, "Hhhhhi!hhhi!ihhi!!");
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hhhi!Hhhi!hhHI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HhhI!IhhI!Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!", 100, "Hhhi!ihhi!hi!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HhhI!IhhI!Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!" + "'", str4, "HhhI!IhhI!Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!");
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhhi!Hhhi!hhHI!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhi!Hhhi!hhHI!" + "'", str2, "hhhi!Hhhi!hhHI!");
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("H", (-1), "HHhHhHhHhHhHhHhHiHhH!HhHhHhHhHhHhHhHiHhH!HhHiHhHhHhHhHhHiHhH!HhH!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H" + "'", str4, "H");
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hHh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHh" + "'", str1, "hHh");
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
        char[] charArray5 = new char[] {};
        java.lang.String str6 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray5);
        java.lang.String str7 = org.apache.commons.lang.WordUtils.initials("", charArray5);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.initials("H", charArray5);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("", charArray5);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("hhHI!", charArray5);
        java.lang.Class<?> wildcardClass11 = charArray5.getClass();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hhHI!" + "'", str10, "hhHI!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhI!IhhI!hHHHi!iHHi!hi!!H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!ihhi!hhhhi!ihhi!hi!!h" + "'", str1, "Hhhi!ihhi!hhhhi!ihhi!hi!!h");
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HHHHi!iHHi!hi!!", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHHHi!iHHi!hi!!" + "'", str2, "HHHHi!iHHi!hi!!");
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!hhhi!hhhi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhi!hhhi!hhhi!" + "'", str1, "hhhi!hhhi!hhhi!");
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhhi!ihhi!hhhi!ihhi!!hi!!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhi!ihhi!hhhi!ihhi!!hi!!" + "'", str2, "Hhhi!ihhi!hhhi!ihhi!!hi!!");
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhI!", (int) (byte) 1, 100, "HHHI!hHHI!iHHI!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhI!" + "'", str4, "hhI!");
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhhI!IhhI!HI!!", (int) (byte) 10, (int) (byte) 1, "hhHHi!iHHi!HHHI!IHHI!!hi!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhI!IhhI!hhHHi!iHHi!HHHI!IHHI!!hi!!" + "'", str4, "hhhI!IhhI!hhHHi!iHHi!HHHI!IHHI!!hi!!");
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        char[] charArray4 = new char[] {};
        java.lang.String str5 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray4);
        java.lang.String str6 = org.apache.commons.lang.WordUtils.uncapitalize("hI!", charArray4);
        java.lang.String str7 = org.apache.commons.lang.WordUtils.initials("h", charArray4);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.initials("HhhhI!IhhI!HI!!", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hI!" + "'", str6, "hI!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.initials("hHHI!hHHI!iHHI!!", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h" + "'", str2, "h");
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hHHi!iHHi!hHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHi!iHHi!hHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!" + "'", str1, "HHHi!iHHi!hHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!");
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HhHI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhHI!" + "'", str1, "hhHI!");
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhhi!ihhi!!", (int) (byte) 100, (int) 'a', "Hhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!ihi!!hi!hhi!ihi!!hi!!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end 100, length 11");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("HHHi!iHHi!HhhhI!IhhI!HI!!h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhi!hhhi!ihhi!!", 1, (int) (byte) 1, "hHHi!iHHi!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HhHHi!iHHi!!" + "'", str4, "HhHHi!iHHi!!");
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHH", (int) '#', (int) ' ', "Hhi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end 35, length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.capitalize("HHI!", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHI!" + "'", str2, "HHI!");
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HHh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHh" + "'", str1, "hHh");
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhi!Hhhi!hhHI!", (int) '#', (int) (byte) 100, "hHHi!iHHi!HHHI!IHHI!!hi!!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end 35, length 15");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HHI!iHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHI!iHI!!" + "'", str1, "hHI!iHI!!");
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hHHHI!IHHI!HI!!H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHHI!IHHI!HI!!H" + "'", str1, "HHHHI!IHHI!HI!!H");
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHI!iHI!!", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHI!iHI!!" + "'", str2, "hHI!iHI!!");
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        char[] charArray6 = new char[] { 'a', '4', 'a' };
        java.lang.String str7 = org.apache.commons.lang.WordUtils.capitalize("", charArray6);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray6);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("HhhhI!IhhI!HI!!h", charArray6);
        java.lang.Class<?> wildcardClass10 = charArray6.getClass();
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { 'a', '4', 'a' });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H" + "'", str9, "H");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhhhhi!ihhi!hi!!h", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhhhi!ihhi!hi!!h" + "'", str2, "Hhhhhi!ihhi!hi!!h");
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("HHH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHH" + "'", str1, "HHH");
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HhHI!", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HhHI!" + "'", str2, "HhHI!");
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhi!hhhi!ihhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhhi!hhhi!ihhi!!" + "'", str1, "hhhhi!hhhi!ihhi!!");
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("HhHHi!iHHi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHhhI!IhhI!!" + "'", str1, "hHhhI!IhhI!!");
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
        char[] charArray2 = new char[] {};
        java.lang.String str3 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray2);
        java.lang.String str4 = org.apache.commons.lang.WordUtils.uncapitalize("hI!", charArray2);
        java.lang.Class<?> wildcardClass5 = charArray2.getClass();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] {});
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hI!" + "'", str4, "hI!");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("HhhhI!IhhI!HI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HhhhI!IhhI!HI!!" + "'", str1, "HhhhI!IhhI!HI!!");
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HhHHi!iHHi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhHHi!iHHi!!" + "'", str1, "hhHHi!iHHi!!");
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHhhI!IhhI!!", (int) (byte) 1, (int) '4', "HHHi!iHHi!HHHI!IHHI!!hi!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHhhI!IhhI!!" + "'", str4, "hHhhI!IhhI!!");
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HH", 0, (int) (short) -1, "HhhhI!IhhI!HI!!h");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HH" + "'", str4, "HH");
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HHHHI!HHHIHHHI!HHHI!IHHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHHI!HHHIHHHI!HHHI!IHHI!!" + "'", str1, "hHHHI!HHHIHHHI!HHHI!IHHI!!");
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("Hh", 0, "hhhi!hhhi!hhhi!Ihhi!!hhi!Ihhi!hhhi!hhhi!Ihhi!!hhi!Hhhi!Ihhi!!hhi!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hh" + "'", str4, "Hh");
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HHHI!HHHI!IHHI!!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHHI!HHHI!IHHI!!" + "'", str2, "HHHI!HHHI!IHHI!!");
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!ihi!!hi!hhi!ihi!!hi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!ihi!!hi!hhi!ihi!!hi!!" + "'", str1, "Hhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!ihi!!hi!hhi!ihi!!hi!!");
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hhHHi!iHHi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!ihhi!!" + "'", str1, "Hhhhi!ihhi!!");
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hHHI!hHHI!iHHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!Hhhi!Ihhi!!" + "'", str1, "Hhhi!Hhhi!Ihhi!!");
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
        char[] charArray7 = new char[] {};
        java.lang.String str8 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("hi!", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("Hhhi!ihhi!!", charArray7);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("HHHHI!HHHIHHHI!HHHI!IHHI!!", charArray7);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!", charArray7);
        java.lang.Class<?> wildcardClass15 = charArray7.getClass();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!" + "'", str14, "Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hh", 1, 1, "hhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!ihi!!hi!hhi!ihi!!hi!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!ihi!!hi!hhi!ihi!!hi!!" + "'", str4, "hhhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!ihi!!hi!hhi!ihi!!hi!!");
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("Hhhi!ihhi!hi!!", (int) (short) 10, "HHI!iHI!!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhi!ihhi!HHI!iHI!!hi!!" + "'", str4, "Hhhi!ihhi!HHI!iHI!!hi!!");
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hHHHI!HHHIHHHI!HHHI!IHHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHHI!HHHIHHHI!HHHI!IHHI!!" + "'", str1, "hHHHI!HHHIHHHI!HHHI!IHHI!!");
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hHI!iHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHI!iHI!!" + "'", str1, "hHI!iHI!!");
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhhi!ihhi!!", (int) 'a', (int) (byte) 1, "HhhhI!IhhI!HI!!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end 97, length 11");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHHi!iHHi!!", (int) (short) -1, (int) (byte) 100, "hhHHi!iHHi!HHHI!IHHI!!hi!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHHi!iHHi!!" + "'", str4, "HHHi!iHHi!!");
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hhhi!hhhi!hhhi!Ihhi!!hhi!Ihhi!hhhi!hhhi!Ihhi!!hhi!Hhhi!Ihhi!!hhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhi!", 0, (int) (short) 100, "HHHHi!iHHi!hi!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhi!" + "'", str4, "Hhhi!");
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("HhH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhh" + "'", str1, "Hhh");
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("HHh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHh" + "'", str1, "HHh");
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("HHI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHI!" + "'", str1, "HHI!");
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("Hhhhi!ihhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("Hhh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHH" + "'", str1, "hHH");
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hhhi!hhhi!hhhi!", (int) (short) 10, "", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhi!hhhi!hhhi!" + "'", str4, "hhhi!hhhi!hhhi!");
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        char[] charArray3 = new char[] {};
        java.lang.String str4 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray3);
        java.lang.String str5 = org.apache.commons.lang.WordUtils.initials("h", charArray3);
        java.lang.String str6 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray3);
        java.lang.Class<?> wildcardClass7 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hI!" + "'", str6, "hI!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHhHhHhHhHhHhHhHiHhH!HhHhHhHhHhHhHhHiHhH!HhHiHhHhHhHhHhHiHhH!HhH!", (int) (byte) -1, (int) (byte) 0, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hHhhI!IhhI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!ihhi!!" + "'", str1, "Hhhhi!ihhi!!");
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("HHHHi!iHHi!hi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHHi!iHHi!hi!!" + "'", str1, "HHHHi!iHHi!hi!!");
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hHHHi!iHHi!hi!!H", (int) (byte) 1, "HhhI!IhhI!hHHHi!iHHi!hi!!H", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHhhI!IhhI!hHHHi!iHHi!hi!!HHHhhI!IhhI!hHHHi!iHHi!hi!!HHHhhI!IhhI!hHHHi!iHHi!hi!!HHHhhI!IhhI!hHHHi!iHHi!hi!!HiHhhI!IhhI!hHHHi!iHHi!hi!!H!HhhI!IhhI!hHHHi!iHHi!hi!!HiHhhI!IhhI!hHHHi!iHHi!hi!!HHHhhI!IhhI!hHHHi!iHHi!hi!!HHHhhI!IhhI!hHHHi!iHHi!hi!!HiHhhI!IhhI!hHHHi!iHHi!hi!!H!HhhI!IhhI!hHHHi!iHHi!hi!!HhHhhI!IhhI!hHHHi!iHHi!hi!!HiHhhI!IhhI!hHHHi!iHHi!hi!!H!HhhI!IhhI!hHHHi!iHHi!hi!!H!HhhI!IhhI!hHHHi!iHHi!hi!!HH" + "'", str4, "hHhhI!IhhI!hHHHi!iHHi!hi!!HHHhhI!IhhI!hHHHi!iHHi!hi!!HHHhhI!IhhI!hHHHi!iHHi!hi!!HHHhhI!IhhI!hHHHi!iHHi!hi!!HiHhhI!IhhI!hHHHi!iHHi!hi!!H!HhhI!IhhI!hHHHi!iHHi!hi!!HiHhhI!IhhI!hHHHi!iHHi!hi!!HHHhhI!IhhI!hHHHi!iHHi!hi!!HHHhhI!IhhI!hHHHi!iHHi!hi!!HiHhhI!IhhI!hHHHi!iHHi!hi!!H!HhhI!IhhI!hHHHi!iHHi!hi!!HhHhhI!IhhI!hHHHi!iHHi!hi!!HiHhhI!IhhI!hHHHi!iHHi!hi!!H!HhhI!IhhI!hHHHi!iHHi!hi!!H!HhhI!IhhI!hHHHi!iHHi!hi!!HH");
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhi!ihhi!hi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhhi!ihhi!hi!!" + "'", str1, "hhhhi!ihhi!hi!!");
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhi!hhhi!hhhi!", (int) (short) 1, (int) (short) -1, "H");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhi!hhhi!hhhi!" + "'", str4, "Hhhi!hhhi!hhhi!");
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hHhhI!IhhI!hHHHi!iHHi!hi!!HHHhhI!IhhI!hHHHi!iHHi!hi!!HHHhhI!IhhI!hHHHi!iHHi!hi!!HHHhhI!IhhI!hHHHi!iHHi!hi!!HiHhhI!IhhI!hHHHi!iHHi!hi!!H!HhhI!IhhI!hHHHi!iHHi!hi!!HiHhhI!IhhI!hHHHi!iHHi!hi!!HHHhhI!IhhI!hHHHi!iHHi!hi!!HHHhhI!IhhI!hHHHi!iHHi!hi!!HiHhhI!IhhI!hHHHi!iHHi!hi!!H!HhhI!IhhI!hHHHi!iHHi!hi!!HhHhhI!IhhI!hHHHi!iHHi!hi!!HiHhhI!IhhI!hHHHi!iHHi!hi!!H!HhhI!IhhI!hHHHi!iHHi!hi!!H!HhhI!IhhI!hHHHi!iHHi!hi!!HH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hhhi!hhhi!hhhi!Ihhi!!hhi!Ihhi!hhhi!hhhi!Ihhi!!hhi!Hhhi!Ihhi!!hhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhi!hhhi!hhhi!Ihhi!!hhi!Ihhi!hhhi!hhhi!Ihhi!!hhi!Hhhi!Ihhi!!hhi!!" + "'", str1, "hhhi!hhhi!hhhi!Ihhi!!hhi!Ihhi!hhhi!hhhi!Ihhi!!hhi!Hhhi!Ihhi!!hhi!!");
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hHHHi!iHHi!hi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHHi!iHHi!hi!!" + "'", str1, "hHHHi!iHHi!hi!!");
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HhhI!IhhI!Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!", (int) (short) -1, "hHH", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HhhI!IhhI!Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!" + "'", str4, "HhhI!IhhI!Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!");
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("Hhh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhh" + "'", str1, "Hhh");
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hhhhi!ihhi!hi!!", (int) (byte) 1, "hhhI!IhhI!!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!" + "'", str4, "hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!");
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhhhI!IhhI!HI!!h", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhhI!IhhI!HI!!h" + "'", str2, "hhhhI!IhhI!HI!!h");
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHHI!IHHI!HI!!H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!ihhi!hi!!h" + "'", str1, "Hhhhi!ihhi!hi!!h");
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("Hhh", (int) (byte) 1, "h", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhhh" + "'", str4, "Hhhhh");
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HHHHI!IHHI!HI!!H", (int) (byte) -1, "hhhi!Hhhi!Ihhi!!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!H" + "'", str4, "Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!H");
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        char[] charArray6 = new char[] { '#', '4', '4', '4' };
        java.lang.String str7 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray6);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray6);
        java.lang.Class<?> wildcardClass9 = charArray6.getClass();
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '#', '4', '4', '4' });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Hi!" + "'", str7, "Hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hi!" + "'", str8, "Hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hHhhI!IhhI!hHHHi!iHHi!hi!!HHHhhI!IhhI!hHHHi!iHHi!hi!!HHHhhI!IhhI!hHHHi!iHHi!hi!!HHHhhI!IhhI!hHHHi!iHHi!hi!!HiHhhI!IhhI!hHHHi!iHHi!hi!!H!HhhI!IhhI!hHHHi!iHHi!hi!!HiHhhI!IhhI!hHHHi!iHHi!hi!!HHHhhI!IhhI!hHHHi!iHHi!hi!!HHHhhI!IhhI!hHHHi!iHHi!hi!!HiHhhI!IhhI!hHHHi!iHHi!hi!!H!HhhI!IhhI!hHHHi!iHHi!hi!!HhHhhI!IhhI!hHHHi!iHHi!hi!!HiHhhI!IhhI!hHHHi!iHHi!hi!!H!HhhI!IhhI!hHHHi!iHHi!hi!!H!HhhI!IhhI!hHHHi!iHHi!hi!!HH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHhhI!IhhI!hHHHi!iHHi!hi!!HHHhhI!IhhI!hHHHi!iHHi!hi!!HHHhhI!IhhI!hHHHi!iHHi!hi!!HHHhhI!IhhI!hHHHi!iHHi!hi!!HiHhhI!IhhI!hHHHi!iHHi!hi!!H!HhhI!IhhI!hHHHi!iHHi!hi!!HiHhhI!IhhI!hHHHi!iHHi!hi!!HHHhhI!IhhI!hHHHi!iHHi!hi!!HHHhhI!IhhI!hHHHi!iHHi!hi!!HiHhhI!IhhI!hHHHi!iHHi!hi!!H!HhhI!IhhI!hHHHi!iHHi!hi!!HhHhhI!IhhI!hHHHi!iHHi!hi!!HiHhhI!IhhI!hHHHi!iHHi!hi!!H!HhhI!IhhI!hHHHi!iHHi!hi!!H!HhhI!IhhI!hHHHi!iHHi!hi!!HH" + "'", str1, "hHhhI!IhhI!hHHHi!iHHi!hi!!HHHhhI!IhhI!hHHHi!iHHi!hi!!HHHhhI!IhhI!hHHHi!iHHi!hi!!HHHhhI!IhhI!hHHHi!iHHi!hi!!HiHhhI!IhhI!hHHHi!iHHi!hi!!H!HhhI!IhhI!hHHHi!iHHi!hi!!HiHhhI!IhhI!hHHHi!iHHi!hi!!HHHhhI!IhhI!hHHHi!iHHi!hi!!HHHhhI!IhhI!hHHHi!iHHi!hi!!HiHhhI!IhhI!hHHHi!iHHi!hi!!H!HhhI!IhhI!hHHHi!iHHi!hi!!HhHhhI!IhhI!hHHHi!iHHi!hi!!HiHhhI!IhhI!hHHHi!iHHi!hi!!H!HhhI!IhhI!hHHHi!iHHi!hi!!H!HhhI!IhhI!hHHHi!iHHi!hi!!HH");
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hhHHi!iHHi!HHHI!IHHI!!hi!!", 1, "HHHI!HHHI!IHHI!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhHHi!iHHi!HHHI!IHHI!!hi!!" + "'", str4, "hhHHi!iHHi!HHHI!IHHI!!hi!!");
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhhhhi!hhhi!ihhi!!", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhhhi!hhhi!ihhi!!" + "'", str2, "Hhhhhi!hhhi!ihhi!!");
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("HhHHi!iHHi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HHHHI!HHHI!IHHI!!", (int) (short) 100, "hh", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHHHI!HHHI!IHHI!!" + "'", str4, "HHHHI!HHHI!IHHI!!");
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("Hhhhhi!ihhi!hi!!h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hhHHi!iHHi!HHHI!IHHI!!hi!!", (int) (short) 10, "Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhHHi!iHHi!HHHI!IHHI!!hi!!" + "'", str4, "hhHHi!iHHi!HHHI!IHHI!!hi!!");
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!" + "'", str2, "Hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!");
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hhHI!", (int) 'a', "hhI!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhHI!" + "'", str4, "hhHI!");
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hhhi!Hhhi!Ihhi!!", 0, "HHHI!HHHI!IHHI!!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!!" + "'", str4, "hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!!");
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHHi!iHHi!HHHI!IHHI!!hi!!", (int) (short) 10, (int) 'a', "Hhhhi!ihhi!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHi!iHHi!HHHI!IHHI!!hi!!" + "'", str4, "hHHi!iHHi!HHHI!IHHI!!hi!!");
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhi!ihhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhhi!ihhi!!" + "'", str1, "hhhhi!ihhi!!");
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hhhi!hhhi!hhhi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhhI!IhhI!hhHHi!iHHi!HHHI!IHHI!!hi!!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhI!IhhI!hhHHi!iHHi!HHHI!IHHI!!hi!!" + "'", str2, "hhhI!IhhI!hhHHi!iHHi!HHHI!IHHI!!hi!!");
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hhHHi!iHHi!HHHI!IHHI!!hi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HhHHi!iHHi!HHHI!IHHI!!hi!!" + "'", str1, "HhHHi!iHHi!HHHI!IHHI!!hi!!");
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!" + "'", str2, "hhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!");
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
        char[] charArray9 = new char[] {};
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray9);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("H", charArray9);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("hhhI!IhhI!HI!!", charArray9);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("hhhi!hhhi!ihhi!!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hi!" + "'", str13, "Hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "h" + "'", str15, "h");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hhhI!IhhI!HI!!" + "'", str17, "hhhI!IhhI!HI!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hhhi!hhhi!ihhi!!" + "'", str18, "hhhi!hhhi!ihhi!!");
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hHHHI!HHHI!IHHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHHI!HHHI!IHHI!!" + "'", str1, "HHHHI!HHHI!IHHI!!");
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHHi!iHHi!HHHI!IHHI!!hi!!", (-1), (int) (byte) 10, "HhH");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHHi!iHHi!HhH" + "'", str4, "HHHi!iHHi!HhH");
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
        char[] charArray11 = new char[] { '#', '4', '4', '4' };
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray11);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("Hhi!", charArray11);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("HHhi!", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '#', '4', '4', '4' });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hi!" + "'", str12, "Hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hi!" + "'", str13, "Hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hhi!" + "'", str17, "hhi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hhhi!" + "'", str18, "Hhhi!");
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhi!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhi!" + "'", str2, "hhi!");
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        char[] charArray8 = new char[] { '#', '4', '4', '4' };
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray8);
        java.lang.Class<?> wildcardClass13 = charArray8.getClass();
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '#', '4', '4', '4' });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Hi!" + "'", str9, "Hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hi!" + "'", str10, "Hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H" + "'", str12, "H");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHhhI!IhhI!!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHhhI!IhhI!!" + "'", str2, "hHhhI!IhhI!!");
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("Hhhi!ihhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHI!IHHI!!" + "'", str1, "hHHI!IHHI!!");
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.capitalizeFully("hHi!", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhi!" + "'", str2, "Hhi!");
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("HhhI!IhhI!Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HhhI!IhhI!Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!" + "'", str1, "HhhI!IhhI!Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!");
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("Hhhi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("Hhhi!hhhi!hhhi!", 1, "hhi!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhi!hhhi!hhhi!ihhi!!hhi!hhhi!hhhi!hhhi!ihhi!!hhi!hhhi!hhhi!hhhi!ihhi!!" + "'", str4, "Hhhi!hhhi!hhhi!ihhi!!hhi!hhhi!hhhi!hhhi!ihhi!!hhi!hhhi!hhhi!hhhi!ihhi!!");
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!hhhi!hhhi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!hhhi!hhhi!" + "'", str1, "Hhhi!hhhi!hhhi!");
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hHHI!hHHI!iHHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHI!hHHI!iHHI!!" + "'", str1, "HHHI!hHHI!iHHI!!");
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HHHHI!HHHI!IHHI!!", (int) (byte) 10, "HHHi!iHHi!hi!!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHHHI!HHHIHHHi!iHHi!hi!!!IHHI!!" + "'", str4, "HHHHI!HHHIHHHi!iHHi!hi!!!IHHI!!");
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!ihi!!hi!hhi!ihi!!hi!!", (int) ' ', "Hh", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!Hhihi!!hi!hhi!ihi!!hi!!" + "'", str4, "hhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!Hhihi!!hi!hhi!ihi!!hi!!");
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hHHHi!iHHi!hi!!", 100, "HhhI!IhhI!hHHHi!iHHi!hi!!H", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHHi!iHHi!hi!!" + "'", str4, "hHHHi!iHHi!hi!!");
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhhi!hhhi!ihhi!!", (int) (byte) 1, (int) (short) 10, "Hhhi!hhhi!ihhi!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhhi!hhhiHhhi!hhhi!ihhi!!" + "'", str4, "Hhhhi!hhhiHhhi!hhhi!ihhi!!");
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hhI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HhI!" + "'", str1, "HhI!");
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hhhhi!ihhi!hi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!hhhi!hhhi!ihhi!!hhi!hhhi!hhhi!hhhi!ihhi!!hhi!hhhi!hhhi!hhhi!ihhi!!", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhi!hhhi!hhhi!ihhi!!hhi!hhhi!hhhi!hhhi!ihhi!!hhi!hhhi!hhhi!hhhi!ihhi!!" + "'", str2, "Hhhi!hhhi!hhhi!ihhi!!hhi!hhhi!hhhi!hhhi!ihhi!!hhi!hhhi!hhhi!hhhi!ihhi!!");
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("Hhhi!ihhi!HHI!iHI!!hi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHI!IHHI!hhi!Ihi!!HI!!" + "'", str1, "hHHI!IHHI!hhi!Ihi!!HI!!");
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhhi!hhhi!ihhi!!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhi!hhhi!ihhi!!" + "'", str2, "Hhhi!hhhi!ihhi!!");
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhi!ihhi!hi!!", (int) (short) 0, (int) (byte) 100, "HhI!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhi!ihhi!hi!!" + "'", str4, "Hhhi!ihhi!hi!!");
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.initials("hhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h" + "'", str2, "h");
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        char[] charArray7 = new char[] {};
        java.lang.String str8 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("hi!", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray7);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray7);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHHI!IHHI!HI!!H", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hi!" + "'", str11, "Hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hi!" + "'", str13, "Hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hHHHI!IHHI!HI!!H" + "'", str14, "hHHHI!IHHI!HI!!H");
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hHHi!iHHi!HHHI!IHHI!!hi!!", 10, "Hi!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHi!iHHi!HHHI!IHHI!!hi!!" + "'", str4, "hHHi!iHHi!HHHI!IHHI!!hi!!");
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hHHHI!IHHI!HI!!H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!ihhi!hi!!h" + "'", str1, "Hhhhi!ihhi!hi!!h");
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        char[] charArray6 = new char[] {};
        java.lang.String str7 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray6);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.initials("", charArray6);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("hi!", charArray6);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("", charArray6);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("Hhhi!ihhi!!", charArray6);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("HHHHI!HHHIHHHI!HHHI!IHHI!!", charArray6);
        java.lang.Class<?> wildcardClass13 = charArray6.getClass();
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhi!hhhi!hhhi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!hhhi!hhhi!" + "'", str1, "Hhhi!hhhi!hhhi!");
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HHI!iHI!!", (int) (byte) 10, "", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHI!iHI!!" + "'", str4, "HHI!iHI!!");
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HHhi!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHhi!" + "'", str2, "HHhi!");
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHHi!iHHi!HHHI!IHHI!!hi!!", (int) (byte) 0, 1, "Hhhi!hhhi!hhhi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHhhi!hhhi!hhhi!" + "'", str4, "HHhhi!hhhi!hhhi!");
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
        char[] charArray4 = new char[] { ' ' };
        java.lang.String str5 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray4);
        java.lang.String str6 = org.apache.commons.lang.WordUtils.capitalizeFully("hhI!", charArray4);
        java.lang.String str7 = org.apache.commons.lang.WordUtils.capitalize("HhhI!IhhI!hHHHi!iHHi!hi!!H", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { ' ' });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hhi!" + "'", str6, "Hhi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HhhI!IhhI!hHHHi!iHHi!hi!!H" + "'", str7, "HhhI!IhhI!hHHHi!iHHi!hi!!H");
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhhi!ihhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!ihhi!!" + "'", str1, "Hhhhi!ihhi!!");
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        char[] charArray13 = new char[] {};
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray13);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("", charArray13);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray13);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray13);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("", charArray13);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.uncapitalize("Hi!", charArray13);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray13);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.uncapitalize("hH", charArray13);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray13);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.uncapitalize("HH", charArray13);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.uncapitalize("HH", charArray13);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.capitalizeFully("hHi!", charArray13);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.initials("hHHHi!iHHi!hi!!H", charArray13);
        java.lang.Class<?> wildcardClass27 = charArray13.getClass();
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] {});
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hi!" + "'", str17, "Hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Hi!" + "'", str19, "Hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HI!" + "'", str20, "HI!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hH" + "'", str21, "hH");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Hi!" + "'", str22, "Hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "HH" + "'", str23, "HH");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "HH" + "'", str24, "HH");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hHi!" + "'", str25, "hHi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhhh" + "'", str1, "hhhhh");
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hHHI!IHHI!hhi!Ihi!!HI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!ihhi!HHI!iHI!!hi!!" + "'", str1, "Hhhi!ihhi!HHI!iHI!!hi!!");
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("Hhhi!hhhi!hhhi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHI!HHHI!HHHI!" + "'", str1, "hHHI!HHHI!HHHI!");
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHHHI!HHHI!IHHI!!", (int) ' ', (int) (short) -1, "hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end 32, length 17");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHi!iHHi!hi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!ihhi!hi!!" + "'", str1, "Hhhi!ihhi!hi!!");
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!" + "'", str1, "Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("Hhhhhi!hhhi!ihhi!!", (-1), "hHHI!IHHI!hhi!Ihi!!HI!!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!!" + "'", str4, "HhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!!");
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hHI!", (-1), "Hhhi!hhhi!ihhi!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHI!" + "'", str4, "hHI!");
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHI!IHHI!hhi!Ihi!!HI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!ihhi!hhi!ihi!!hi!!" + "'", str1, "Hhhi!ihhi!hhi!ihi!!hi!!");
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        char[] charArray10 = new char[] {};
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("Hi!", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray10);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("hH", charArray10);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("hHHI!hHHI!iHHI!!", charArray10);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("HHHI!hHHI!HHhi!", charArray10);
        java.lang.Class<?> wildcardClass21 = charArray10.getClass();
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hi!" + "'", str14, "Hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hi!" + "'", str16, "Hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HI!" + "'", str17, "HI!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hH" + "'", str18, "hH");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hHHI!hHHI!iHHI!!" + "'", str19, "hHHI!hHHI!iHHI!!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HHHI!hHHI!HHhi!" + "'", str20, "HHHI!hHHI!HHhi!");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhi!ihhi!HHI!iHI!!hi!!", 0, 10, "HHHi!iHHi!hi!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhi!ihhi!HHHi!iHHi!hi!!" + "'", str4, "Hhhi!ihhi!HHHi!iHHi!hi!!");
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("", (int) 'a', "hHHi!iHHi!!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("Hhhi!ihhi!hhhi!ihhi!!hi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHI!IHHI!HHHI!IHHI!!HI!!" + "'", str1, "hHHI!IHHI!HHHI!IHHI!!HI!!");
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!ihi!!hi!hhi!ihi!!hi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!ihi!!hi!hhi!ihi!!hi!!" + "'", str1, "Hhhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!ihi!!hi!hhi!ihi!!hi!!");
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HhhI!IhhI!hHHHi!iHHi!hi!!H", (int) (short) 1, "hHHHi!iHHi!hi!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HhhI!IhhI!hHHHi!iHHi!hi!!H" + "'", str4, "HhhI!IhhI!hHHHi!iHHi!hi!!H");
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!" + "'", str1, "HhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!");
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("Hhh", (int) (byte) 0, "HHHHI!HHHIHHHI!HHHI!IHHI!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhh" + "'", str4, "Hhh");
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("HHHHI!HHHIHHHi!iHHi!hi!!!IHHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HhHHi!iHHi!HHHI!IHHI!!hi!!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HhHHi!iHHi!HHHI!IHHI!!hi!!" + "'", str2, "HhHHi!iHHi!HHHI!IHHI!!hi!!");
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhhhh", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhhh" + "'", str2, "Hhhhh");
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("Hhhhi!ihhi!hi!!h", (int) 'a', "HHHi!iHHi!hi!!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhhi!ihhi!hi!!h" + "'", str4, "Hhhhi!ihhi!hi!!h");
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhhi!hhhi!hhhi!Ihhi!!hhi!Ihhi!hhhi!hhhi!Ihhi!!hhi!Hhhi!Ihhi!!hhi!!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhi!hhhi!hhhi!Ihhi!!hhi!Ihhi!hhhi!hhhi!Ihhi!!hhi!Hhhi!Ihhi!!hhi!!" + "'", str2, "hhhi!hhhi!hhhi!Ihhi!!hhi!Ihhi!hhhi!hhhi!Ihhi!!hhi!Hhhi!Ihhi!!hhi!!");
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HHHi!iHHi!HhhhI!IhhI!HI!!h", (int) (byte) 100, "Hhhhh", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHHi!iHHi!HhhhI!IhhI!HI!!h" + "'", str4, "HHHi!iHHi!HhhhI!IhhI!HI!!h");
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hhhi!ihhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!ihhi!!" + "'", str1, "Hhhi!ihhi!!");
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
        char[] charArray5 = new char[] {};
        java.lang.String str6 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray5);
        java.lang.String str7 = org.apache.commons.lang.WordUtils.initials("", charArray5);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray5);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray5);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("hI!", charArray5);
        java.lang.Class<?> wildcardClass11 = charArray5.getClass();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Hi!" + "'", str9, "Hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hI!" + "'", str10, "hI!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hhhI!IhhI!hhHHi!iHHi!HHHI!IHHI!!hi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hhhI!IhhI!hHHHi!iHHi!hi!!H", (int) ' ', "", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhI!IhhI!hHHHi!iHHi!hi!!H" + "'", str4, "hhhI!IhhI!hHHHi!iHHi!hi!!H");
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhI!", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhI!" + "'", str2, "hhI!");
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhi!hhhi!hhhi!Ihhi!!hhi!Ihhi!hhhi!hhhi!Ihhi!!hhi!Hhhi!Ihhi!!hhi!!", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!" + "'", str2, "Hhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!");
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hhhhh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHHI!hHHI!iHHI!!", 1, 100, "hHHI!IHHI!hhi!Ihi!!HI!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHHI!hHHI!iHHI!!" + "'", str4, "HHHI!hHHI!iHHI!!");
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
        char[] charArray6 = new char[] {};
        java.lang.String str7 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray6);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.initials("", charArray6);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray6);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray6);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray6);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHHi!iHHi!hi!!H", charArray6);
        java.lang.Class<?> wildcardClass13 = charArray6.getClass();
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hHHHi!iHHi!hi!!H" + "'", str12, "hHHHi!iHHi!hi!!H");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHHi!iHHi!hi!!", (int) (short) 100, 1, "Hh");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end 100, length 14");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!" + "'", str1, "hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!");
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHHHI!HHHI!IHHI!!", (int) (short) -1, (int) (byte) 0, "HHHi!iHHi!HhhhI!IhhI!HI!!h");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHHi!iHHi!HhhhI!IhhI!HI!!h" + "'", str4, "HHHi!iHHi!HhhhI!IhhI!HI!!h");
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHHi!iHHi!HHHI!IHHI!!hi!!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHHi!iHHi!HHHI!IHHI!!hi!!" + "'", str2, "hHHi!iHHi!HHHI!IHHI!!hi!!");
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("", 100, "HH", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        char[] charArray4 = new char[] {};
        java.lang.String str5 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray4);
        java.lang.String str6 = org.apache.commons.lang.WordUtils.initials("", charArray4);
        java.lang.String str7 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray4);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalizeFully("Hh", charArray4);
        java.lang.Class<?> wildcardClass9 = charArray4.getClass();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hh" + "'", str8, "Hh");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhh" + "'", str1, "Hhhhh");
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
        char[] charArray7 = new char[] { '#', '4', '4', '4' };
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!ihhi!hi!!", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("hhhi!ihhi!!", charArray7);
        java.lang.Class<?> wildcardClass11 = charArray7.getClass();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '#', '4', '4', '4' });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hi!" + "'", str8, "Hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Hhhi!ihhi!hi!!" + "'", str9, "Hhhi!ihhi!hi!!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "h" + "'", str10, "h");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("HhHI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!" + "'", str1, "Hhhi!");
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
        char[] charArray8 = new char[] {};
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("hH", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("HI!", charArray8);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("Hhhi!Hhhi!Ihhi!!", charArray8);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("HH", charArray8);
        java.lang.Class<?> wildcardClass17 = charArray8.getClass();
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hH" + "'", str13, "hH");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HI!" + "'", str14, "HI!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HH" + "'", str16, "HH");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("HHhHhHhHhHhHhHhHiHhH!HhHhHhHhHhHhHhHiHhH!HhHiHhHhHhHhHhHiHhH!HhH!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHhHhHhHhHhHhHhHiHhH!HhHhHhHhHhHhHhHiHhH!HhHiHhHhHhHhHhHiHhH!HhH!" + "'", str1, "HHhHhHhHhHhHhHhHiHhH!HhHhHhHhHhHhHhHiHhH!HhHiHhHhHhHhHhHiHhH!HhH!");
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("Hhhi!ihhi!hhi!ihi!!hi!!", (int) (short) 10, "Hhhi!hhhi!ihhi!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhi!ihhi!hhi!ihi!!hi!!" + "'", str4, "Hhhi!ihhi!hhi!ihi!!hi!!");
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("HHH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhh" + "'", str1, "Hhh");
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!", (int) (byte) 1, (int) (short) 10, "HHHHi!iHHi!hi!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHHHHHHHIHHHHi!iHHi!hi!!" + "'", str4, "hHHHHHHHHIHHHHi!iHHi!hi!!");
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("Hhhi!ihhi!hhi!ihi!!hi!!", (int) (short) -1, "Hhhhi!hhhiHhhi!hhhi!ihhi!!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhi!ihhi!!!Hhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhi!ihhi!!!Hhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhi!ihhi!!!Hhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhi!ihhi!!!Hhhhi!hhhiHhhi!hhhi!ihhi!!!Hhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhi!ihhi!!!Hhhhi!hhhiHhhi!hhhi!ihhi!!!" + "'", str4, "HHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhi!ihhi!!!Hhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhi!ihhi!!!Hhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhi!ihhi!!!Hhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhi!ihhi!!!Hhhhi!hhhiHhhi!hhhi!ihhi!!!Hhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhi!ihhi!!!Hhhhi!hhhiHhhi!hhhi!ihhi!!!");
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!ihhi!HHI!iHI!!hi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhi!ihhi!HHI!iHI!!hi!!" + "'", str1, "hhhi!ihhi!HHI!iHI!!hi!!");
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("Hhhi!ihhi!hi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHI!IHHI!HI!!" + "'", str1, "hHHI!IHHI!HI!!");
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhhI!IhhI!HI!!", (int) (short) 10, (int) (short) 1, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhI!IhhI!" + "'", str4, "hhhI!IhhI!");
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.capitalize("HHHi!iHHi!HhH", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHHi!iHHi!HhH" + "'", str2, "HHHi!iHHi!HhH");
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!IHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!!" + "'", str1, "HHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!IHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!!");
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhhi!Hhhi!hhHI!", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhi!Hhhi!hhHI!" + "'", str2, "Hhhi!Hhhi!hhHI!");
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhi!ihhi!hi!!", (int) (short) 10, (int) (short) -1, "hhhhi!ihhi!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhi!ihhi!hi!!" + "'", str4, "Hhhi!ihhi!hi!!");
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
        char[] charArray7 = new char[] {};
        java.lang.String str8 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("", charArray7);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray7);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray7);
        java.lang.Class<?> wildcardClass15 = charArray7.getClass();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hi!" + "'", str11, "Hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hi!" + "'", str14, "Hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!", 0, 0, "HHHi!iHHi!HhH");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHHi!iHHi!HhH" + "'", str4, "HHHi!iHHi!HhH");
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hh", (int) (byte) 100, "Hhh", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hh" + "'", str4, "hh");
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.initials("HHhhi!hhhi!hhhi!", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
        char[] charArray5 = new char[] {};
        java.lang.String str6 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray5);
        java.lang.String str7 = org.apache.commons.lang.WordUtils.uncapitalize("hI!", charArray5);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.initials("h", charArray5);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalize("HHHi!iHHi!!", charArray5);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("Hhhhhi!hhhi!ihhi!!", charArray5);
        java.lang.Class<?> wildcardClass11 = charArray5.getClass();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hI!" + "'", str7, "hI!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HHHi!iHHi!!" + "'", str9, "HHHi!iHHi!!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hhhhhi!hhhi!ihhi!!" + "'", str10, "Hhhhhi!hhhi!ihhi!!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!ihhi!hhhi!ihhi!!hi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhi!ihhi!hhhi!ihhi!!hi!!" + "'", str1, "hhhi!ihhi!hhhi!ihhi!!hi!!");
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("", (int) (short) -1, "hhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!Hhihi!!hi!hhi!ihi!!hi!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhhi!ihhi!hi!!h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhhi!ihhi!hi!!h" + "'", str1, "Hhhhhi!ihhi!hi!!h");
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HhhI!IhhI!hhhi!ihhi!!HI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhI!IhhI!hhhi!ihhi!!HI!!" + "'", str1, "hhhI!IhhI!hhhi!ihhi!!HI!!");
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hHHHHHHHHIHHHHi!iHHi!hi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHHHHHHHIHHHHi!iHHi!hi!!" + "'", str1, "HHHHHHHHHIHHHHi!iHHi!hi!!");
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhhhhi!ihhhhHHHI!IHHI!HI!!H", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhhhi!ihhhhHHHI!IHHI!HI!!H" + "'", str2, "Hhhhhi!ihhhhHHHI!IHHI!HI!!H");
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HHhhi!hhhi!hhhi!", (int) (short) 0, "", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHhhi!hhhi!hhhi!" + "'", str4, "HHhhi!hhhi!hhhi!");
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hI!", (int) 'a', 0, "hHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end 97, length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hhhhi!hhhi!ihhi!!", 0, "Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!iHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!iHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!iHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!iHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!" + "'", str4, "hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!iHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!iHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!iHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!iHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!");
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhI!IhhI!hhHHi!iHHi!HHHI!IHHI!!hi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!ihhi!hhhhi!ihhi!hhhi!ihhi!!hi!!" + "'", str1, "Hhhi!ihhi!hhhhi!ihhi!hhhi!ihhi!!hi!!");
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhhi!ihhi!!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhi!ihhi!!" + "'", str2, "hhhi!ihhi!!");
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!Hhihi!!hi!hhi!ihi!!hi!!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!Hhihi!!hi!hhi!ihi!!hi!!" + "'", str2, "hhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!Hhihi!!hi!hhi!ihi!!hi!!");
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("Hhhhhi!ihhhhHHHI!IHHI!HI!!H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhhi!ihhhhHHHI!IHHI!HI!!H" + "'", str1, "Hhhhhi!ihhhhHHHI!IHHI!HI!!H");
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HHI!", (int) (byte) 100, "Hhhi!ihhi!hi!!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHI!" + "'", str4, "HHI!");
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hHHHHHHHHIHHHHi!iHHi!hi!!", (int) (byte) 10, "hHHI!hHHI!iHHI!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHHHHHHHIHHHHi!iHHi!hi!!" + "'", str4, "hHHHHHHHHIHHHHi!iHHi!hi!!");
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("", (-1), (int) (short) 100, "Hhhi!ihhi!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
        char[] charArray7 = new char[] {};
        java.lang.String str8 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("", charArray7);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray7);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("HHHi!iHHi!!", charArray7);
        java.lang.Class<?> wildcardClass15 = charArray7.getClass();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hi!" + "'", str11, "Hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hi!" + "'", str13, "Hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HHHi!iHHi!!" + "'", str14, "HHHi!iHHi!!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HHHI!HHHI!IHHI!!", (int) (short) 1, "Hhhhi!ihhi!!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHhhhi!ihhi!!HHhhhi!ihhi!!HHhhhi!ihhi!!IHhhhi!ihhi!!!Hhhhi!ihhi!!HHhhhi!ihhi!!HHhhhi!ihhi!!HHhhhi!ihhi!!IHhhhi!ihhi!!!Hhhhi!ihhi!!IHhhhi!ihhi!!HHhhhi!ihhi!!HHhhhi!ihhi!!IHhhhi!ihhi!!!Hhhhi!ihhi!!!" + "'", str4, "HHhhhi!ihhi!!HHhhhi!ihhi!!HHhhhi!ihhi!!IHhhhi!ihhi!!!Hhhhi!ihhi!!HHhhhi!ihhi!!HHhhhi!ihhi!!HHhhhi!ihhi!!IHhhhi!ihhi!!!Hhhhi!ihhi!!IHhhhi!ihhi!!HHhhhi!ihhi!!HHhhhi!ihhi!!IHhhhi!ihhi!!!Hhhhi!ihhi!!!");
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.initials("Hh", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHHi!iHHi!HHHI!IHHI!!hi!!", (int) (byte) 0, (int) (byte) 1, "hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!!" + "'", str4, "hhHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!!");
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!ihi!!hi!hhi!ihi!!hi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!ihi!!hi!hhi!ihi!!hi!!" + "'", str1, "hhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!ihi!!hi!hhi!ihi!!hi!!");
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("", (int) (byte) -1, 100, "hHHHHHHHHIHHHHi!iHHi!hi!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!" + "'", str1, "hhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!");
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhhi!ihhi!hhhhi!ihhi!hi!!h", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhi!ihhi!hhhhi!ihhi!hi!!h" + "'", str2, "Hhhi!ihhi!hhhhi!ihhi!hi!!h");
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HHHHi!iHHi!hi!!", (int) '4', "HHHi!iHHi!!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHHHi!iHHi!hi!!" + "'", str4, "HHHHi!iHHi!hi!!");
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("HHHI!hHHI!HHhi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHI!hHHI!HHhi!" + "'", str1, "HHHI!hHHI!HHhi!");
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
        char[] charArray11 = new char[] {};
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("", charArray11);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray11);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("H", charArray11);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.uncapitalize("hh", charArray11);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("H", charArray11);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhi!ihhi!hi!!", charArray11);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHi!iHHi!!", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] {});
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hi!" + "'", str15, "Hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "h" + "'", str17, "h");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H" + "'", str18, "H");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hh" + "'", str19, "hh");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H" + "'", str20, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Hhhhi!ihhi!hi!!" + "'", str21, "Hhhhi!ihhi!hi!!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hHHi!iHHi!!" + "'", str22, "hHHi!iHHi!!");
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hHHI!IHHI!HHHI!IHHI!!HI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        char[] charArray10 = new char[] {};
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("Hi!", charArray10);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("hhI!", charArray10);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("hH", charArray10);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.uncapitalize("HHhhi!hhhi!hhhi!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hi!" + "'", str14, "Hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hi!" + "'", str17, "Hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hhI!" + "'", str18, "hhI!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hH" + "'", str19, "hH");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HHhhi!hhhi!hhhi!" + "'", str20, "HHhhi!hhhi!hhhi!");
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        char[] charArray6 = new char[] { 'a', '4', 'a' };
        java.lang.String str7 = org.apache.commons.lang.WordUtils.capitalize("", charArray6);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray6);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("HHHi!iHHi!!", charArray6);
        java.lang.Class<?> wildcardClass10 = charArray6.getClass();
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { 'a', '4', 'a' });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hHHi!iHHi!!" + "'", str9, "hHHi!iHHi!!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
        char[] charArray12 = new char[] { '#', '4', '4', '4' };
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray12);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray12);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("", charArray12);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray12);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray12);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("Hhi!", charArray12);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("Hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!", charArray12);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhh", charArray12);
        java.lang.Class<?> wildcardClass21 = charArray12.getClass();
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '#', '4', '4', '4' });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hi!" + "'", str13, "Hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hi!" + "'", str14, "Hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H" + "'", str17, "H");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hhi!" + "'", str18, "hhi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!" + "'", str19, "Hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hhhhh" + "'", str20, "Hhhhh");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHHI!IHHI!!", (int) (byte) 10, 1, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHHI!IHHI!hi!" + "'", str4, "HHHI!IHHI!hi!");
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        char[] charArray7 = new char[] {};
        java.lang.String str8 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("H", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("hhI!", charArray7);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("hH", charArray7);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("hhhI!IhhI!hHHHi!iHHi!hi!!H", charArray7);
        java.lang.Class<?> wildcardClass15 = charArray7.getClass();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H" + "'", str11, "H");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hhhI!IhhI!hHHHi!iHHi!hi!!H" + "'", str14, "hhhI!IhhI!hHHHi!iHHi!hi!!H");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hhhI!IhhI!hHHHi!iHHi!hi!!H", (int) '#', "hHHHHHHHHIHHHHi!iHHi!hi!!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhI!IhhI!hHHHi!iHHi!hi!!H" + "'", str4, "hhhI!IhhI!hHHHi!iHHi!hi!!H");
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hhhi!ihhi!HHI!iHI!!hi!!", (int) (byte) 1, "hHHHI!HHHI!IHHI!!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!HhHHHI!HHHI!IHHI!!HhHHHI!HHHI!IHHI!!IhHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!HhHHHI!HHHI!IHHI!!IhHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!!" + "'", str4, "hhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!HhHHHI!HHHI!IHHI!!HhHHHI!HHHI!IHHI!!IhHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!HhHHHI!HHHI!IHHI!!IhHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!!");
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhhhi!ihhhhHHHI!IHHI!HI!!H", (int) 'a', (int) ' ', "hhhhi!hhhi!ihhi!!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end 97, length 27");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
        char[] charArray3 = new char[] {};
        java.lang.String str4 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray3);
        java.lang.String str5 = org.apache.commons.lang.WordUtils.initials("", charArray3);
        java.lang.String str6 = org.apache.commons.lang.WordUtils.initials("H", charArray3);
        java.lang.Class<?> wildcardClass7 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!ihi!!hi!hhi!ihi!!hi!!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!ihi!!hi!hhi!ihi!!hi!!" + "'", str2, "hhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!ihi!!hi!hhi!ihi!!hi!!");
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HHHi!iHHi!HhhhI!IhhI!HI!!h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHi!iHHi!HhhhI!IhhI!HI!!h" + "'", str1, "hHHi!iHHi!HhhhI!IhhI!HI!!h");
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("Hhhi!ihhi!hhhhi!ihhi!hi!!h", (int) (short) 1, "hHHI!IHHI!HI!!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HhHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!ihHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!ihHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!!hHHI!IHHI!HI!!h" + "'", str4, "HhHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!ihHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!ihHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!!hHHI!IHHI!HI!!h");
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        char[] charArray7 = new char[] { '#', '4', '4', '4' };
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("HHI!", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhi!ihhi!!", charArray7);
        java.lang.Class<?> wildcardClass11 = charArray7.getClass();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '#', '4', '4', '4' });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hi!" + "'", str8, "Hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H" + "'", str9, "H");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hhhi!ihhi!!" + "'", str10, "Hhhi!ihhi!!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
        char[] charArray6 = new char[] {};
        java.lang.String str7 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray6);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.initials("", charArray6);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("hi!", charArray6);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray6);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray6);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("Hhi!", charArray6);
        java.lang.Class<?> wildcardClass13 = charArray6.getClass();
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hi!" + "'", str10, "Hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hhi!" + "'", str12, "Hhi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhhi!hhhi!ihhi!!", (int) (short) -1, (int) (short) 1, "Hhhi!ihhi!hi!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHhhi!ihhi!hi!!" + "'", str4, "HHhhi!ihhi!hi!!");
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhhI!IhhI!hhhi!ihhi!!HI!!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhI!IhhI!hhhi!ihhi!!HI!!" + "'", str2, "hhhI!IhhI!hhhi!ihhi!!HI!!");
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHHHI!HHHIHHHI!HHHI!IHHI!!", 0, 10, "Hhi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHHHI!HHHIHhi!" + "'", str4, "HHHHI!HHHIHhi!");
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhhi!Hhhi!Ihhi!!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhi!Hhhi!Ihhi!!" + "'", str2, "hhhi!Hhhi!Ihhi!!");
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!hhhi!hhhi!ihhi!!hhi!hhhi!hhhi!hhhi!ihhi!!hhi!hhhi!hhhi!hhhi!ihhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!hhhi!hhhi!ihhi!!hhi!hhhi!hhhi!hhhi!ihhi!!hhi!hhhi!hhhi!hhhi!ihhi!!" + "'", str1, "Hhhi!hhhi!hhhi!ihhi!!hhi!hhhi!hhhi!hhhi!ihhi!!hhi!hhhi!hhhi!hhhi!ihhi!!");
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hhhi!ihhi!HHI!iHI!!hi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHI!IHHI!hhi!Ihi!!HI!!" + "'", str1, "HHHI!IHHI!hhi!Ihi!!HI!!");
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("HHHHI!IHHI!HI!!H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHHI!IHHI!HI!!H" + "'", str1, "HHHHI!IHHI!HI!!H");
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hHHI!IHHI!HI!!", 1, "HhHI!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHI!IHHI!HI!!" + "'", str4, "hHHI!IHHI!HI!!");
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHi!", 100, (-1), "hHhi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end 100, length 4");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("Hhhi!hhhi!hhhi!ihhi!!hhi!hhhi!hhhi!hhhi!ihhi!!hhi!hhhi!hhhi!hhhi!ihhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("HHHi!iHHi!hHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHHI!hHHI!iHHI!!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHHI!hHHI!iHHI!!" + "'", str2, "hHHI!hHHI!iHHI!!");
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!ihi!!hi!hhi!ihi!!hi!!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!ihi!!hi!hhi!ihi!!hi!!" + "'", str2, "Hhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!ihi!!hi!hhi!ihi!!hi!!");
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hHhhI!IhhI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHhhI!IhhI!!" + "'", str1, "hHhhI!IhhI!!");
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
        char[] charArray8 = new char[] {};
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("H", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("hhhI!IhhI!HI!!", charArray8);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("hH", charArray8);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("Hh", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hhhI!IhhI!HI!!" + "'", str14, "hhhI!IhhI!HI!!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hH" + "'", str15, "hH");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("Hhhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!ihi!!hi!hhi!ihi!!hi!!", 1, "hhhi!Hhhi!Ihhi!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!ihi!!hi!hhi!ihi!!hi!!" + "'", str4, "Hhhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!ihi!!hi!hhi!ihi!!hi!!");
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hhhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!ihi!!hi!hhi!ihi!!hi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hHHI!HHHI!IHHI!!", (int) (byte) 1, "hHHHHHHHHIHHHHi!iHHi!hi!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHI!HHHI!IHHI!!" + "'", str4, "hHHI!HHHI!IHHI!!");
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hhHHHI!IHHI!HI!!H", (int) ' ', "HHhHhHhHhHhHhHhHiHhH!HhHhHhHhHhHhHhHiHhH!HhHiHhHhHhHhHhHiHhH!HhH!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhHHHI!IHHI!HI!!H" + "'", str4, "hhHHHI!IHHI!HI!!H");
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!iHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!iHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!iHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!iHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!", 100, "hHhhI!IhhI!hHHHi!iHHi!hi!!HHHhhI!IhhI!hHHHi!iHHi!hi!!HHHhhI!IhhI!hHHHi!iHHi!hi!!HHHhhI!IhhI!hHHHi!iHHi!hi!!HiHhhI!IhhI!hHHHi!iHHi!hi!!H!HhhI!IhhI!hHHHi!iHHi!hi!!HiHhhI!IhhI!hHHHi!iHHi!hi!!HHHhhI!IhhI!hHHHi!iHHi!hi!!HHHhhI!IhhI!hHHHi!iHHi!hi!!HiHhhI!IhhI!hHHHi!iHHi!hi!!H!HhhI!IhhI!hHHHi!iHHi!hi!!HhHhhI!IhhI!hHHHi!iHHi!hi!!HiHhhI!IhhI!hHHHi!iHHi!hi!!H!HhhI!IhhI!hHHHi!iHHi!hi!!H!HhhI!IhhI!hHHHi!iHHi!hi!!HH", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!iHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!iHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!iHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!iHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!" + "'", str4, "hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!iHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!iHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!iHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!iHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!");
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HHHHI!HHHI!IHHI!!", (int) (byte) 0, "hHHI!hHHI!iHHI!!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!IhHHI!hHHI!iHHI!!!hHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!IhHHI!hHHI!iHHI!!!hHHI!hHHI!iHHI!!IhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!IhHHI!hHHI!iHHI!!!hHHI!hHHI!iHHI!!!" + "'", str4, "HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!IhHHI!hHHI!iHHI!!!hHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!IhHHI!hHHI!iHHI!!!hHHI!hHHI!iHHI!!IhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!IhHHI!hHHI!iHHI!!!hHHI!hHHI!iHHI!!!");
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("Hhhi!ihhi!hhhhi!ihhi!hhhi!ihhi!!hi!!", (int) '4', "hHHI!IHHI!HI!!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhi!ihhi!hhhhi!ihhi!hhhi!ihhi!!hi!!" + "'", str4, "Hhhi!ihhi!hhhhi!ihhi!hhhi!ihhi!!hi!!");
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("HHhhi!ihhi!hi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHhhi!ihhi!hi!!" + "'", str1, "HHhhi!ihhi!hi!!");
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        char[] charArray6 = new char[] {};
        java.lang.String str7 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray6);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.initials("", charArray6);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("hi!", charArray6);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray6);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("hHHI!hHHI!iHHI!!", charArray6);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhi!hhhi!ihhi!!", charArray6);
        java.lang.Class<?> wildcardClass13 = charArray6.getClass();
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hi!" + "'", str10, "Hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hHHI!hHHI!iHHI!!" + "'", str11, "hHHI!hHHI!iHHI!!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hhhi!hhhi!ihhi!!" + "'", str12, "hhhi!hhhi!ihhi!!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("", (int) 'a', 0, "hhhI!IhhI!hhHHi!iHHi!HHHI!IHHI!!hi!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
        char[] charArray4 = new char[] {};
        java.lang.String str5 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray4);
        java.lang.String str6 = org.apache.commons.lang.WordUtils.initials("", charArray4);
        java.lang.String str7 = org.apache.commons.lang.WordUtils.capitalize("Hh", charArray4);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!ihhi!!", charArray4);
        java.lang.Class<?> wildcardClass9 = charArray4.getClass();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Hh" + "'", str7, "Hh");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hhhi!ihhi!!" + "'", str8, "Hhhi!ihhi!!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hHhi!", (int) ' ', "hI!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHhi!" + "'", str4, "hHhi!");
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
        char[] charArray6 = new char[] {};
        java.lang.String str7 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray6);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.initials("", charArray6);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("hi!", charArray6);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("", charArray6);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("hhhhi!hhhi!ihhi!!", charArray6);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("Hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hhhhi!hhhi!ihhi!!" + "'", str11, "hhhhi!hhhi!ihhi!!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("", (int) (short) 0, (int) '#', "Hhhi!hhhi!hhhi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
        char[] charArray9 = new char[] { '#', '4', '4', '4' };
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!ihhi!!", charArray9);
        java.lang.Class<?> wildcardClass15 = charArray9.getClass();
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '#', '4', '4', '4' });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hi!" + "'", str10, "Hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hi!" + "'", str11, "Hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H" + "'", str13, "H");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hhhi!ihhi!!" + "'", str14, "Hhhi!ihhi!!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hhhi!hhhi!hhhi!Ihhi!!hhi!Ihhi!hhhi!hhhi!Ihhi!!hhi!Hhhi!Ihhi!!hhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!hhhi!hhhi!Ihhi!!hhi!Ihhi!hhhi!hhhi!Ihhi!!hhi!Hhhi!Ihhi!!hhi!!" + "'", str1, "Hhhi!hhhi!hhhi!Ihhi!!hhi!Ihhi!hhhi!hhhi!Ihhi!!hhi!Hhhi!Ihhi!!hhi!!");
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhhI!IhhI!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhI!IhhI!" + "'", str2, "hhhI!IhhI!");
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
        char[] charArray3 = new char[] {};
        java.lang.String str4 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray3);
        java.lang.String str5 = org.apache.commons.lang.WordUtils.initials("", charArray3);
        java.lang.String str6 = org.apache.commons.lang.WordUtils.capitalize("HHHI!IHHI!hi!", charArray3);
        java.lang.Class<?> wildcardClass7 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HHHI!IHHI!hi!" + "'", str6, "HHHI!IHHI!hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!", (int) 'a', "HhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!" + "'", str4, "Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHi!iHHi!hHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!" + "'", str1, "Hhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!");
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!" + "'", str1, "Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HhH", (int) (short) 10, "Hhhi!ihhi!hhi!ihi!!hi!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HhH" + "'", str4, "HhH");
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HHHHi!iHHi!hi!!", (int) (byte) 0, "hI!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HhI!HhI!HhI!HhI!ihI!!hI!ihI!HhI!HhI!ihI!!hI!hhI!ihI!!hI!!" + "'", str4, "HhI!HhI!HhI!HhI!ihI!!hI!ihI!HhI!HhI!ihI!!hI!hhI!ihI!!hI!!");
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("Hhhhhi!ihhi!hi!!h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhhi!ihhi!hi!!h" + "'", str1, "Hhhhhi!ihhi!hi!!h");
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hhHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!" + "'", str1, "HHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!");
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("", (int) (byte) 100, (-1), "HHHi!iHHi!hHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!" + "'", str1, "HHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!");
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HHHHHHHHHIHHHHi!iHHi!hi!!", (int) (short) -1, "HhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHHHHHHHHIHHHHi!iHHi!hi!!" + "'", str4, "HHHHHHHHHIHHHHi!iHHi!hi!!");
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("HHHi!iHHi!HhH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHi!iHHi!HhH" + "'", str1, "HHHi!iHHi!HhH");
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
        char[] charArray7 = new char[] {};
        java.lang.String str8 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("Hh", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("HHHi!iHHi!hi!!", charArray7);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("HHHI!hHHI!iHHI!!", charArray7);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("HhhI!IhhI!hHHHi!iHHi!hi!!H", charArray7);
        java.lang.Class<?> wildcardClass15 = charArray7.getClass();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hi!" + "'", str10, "Hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hh" + "'", str11, "Hh");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HHHi!iHHi!hi!!" + "'", str12, "HHHi!iHHi!hi!!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HhhI!IhhI!hHHHi!iHHi!hi!!H" + "'", str14, "HhhI!IhhI!hHHHi!iHHi!hi!!H");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhHHi!iHHi!!", (int) '4', (int) 'a', "hhhhI!IhhI!HI!!h");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end 52, length 12");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHi!iHHi!HHHI!IHHI!!hi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!ihhi!hhhi!ihhi!!hi!!" + "'", str1, "Hhhi!ihhi!hhhi!ihhi!!hi!!");
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!", (int) (byte) 100, 0, "Hhhi!ihhi!HHI!iHI!!hi!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhHhhi!ihhi!HHI!iHI!!hi!!" + "'", str4, "hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhHhhi!ihhi!HHI!iHI!!hi!!");
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
        char[] charArray7 = new char[] {};
        java.lang.String str8 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("hi!", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("", charArray7);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("HH", charArray7);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!hhhi!ihhi!!", charArray7);
        java.lang.Class<?> wildcardClass15 = charArray7.getClass();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HI!" + "'", str11, "HI!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HH" + "'", str13, "HH");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hhhi!hhhi!ihhi!!" + "'", str14, "Hhhi!hhhi!ihhi!!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!H", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!H" + "'", str2, "Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!H");
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHi!iHHi!hHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!" + "'", str1, "Hhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!");
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhhhh", (int) (short) 100, (int) (short) 1, "HHHHHHHHHIHHHHi!iHHi!hi!!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end 100, length 5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
        char[] charArray7 = new char[] {};
        java.lang.String str8 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("", charArray7);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray7);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("HH", charArray7);
        java.lang.Class<?> wildcardClass15 = charArray7.getClass();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hi!" + "'", str11, "Hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "h" + "'", str13, "h");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HH" + "'", str14, "HH");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!", (int) (byte) 100, "Hhhi!hhhi!hhhi!Ihhi!!hhi!Ihhi!hhhi!hhhi!Ihhi!!hhi!Hhhi!Ihhi!!hhi!!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!" + "'", str4, "hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!");
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("", (int) '#', "hHHHI!IHHI!HI!!H", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhhi!hhhi!ihhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhhhi!hhhi!ihhi!!" + "'", str1, "hhhhhi!hhhi!ihhi!!");
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!" + "'", str2, "hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!");
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHHi!iHHi!HhhhI!IhhI!HI!!h", (int) (byte) 0, (int) '#', "HHHi!iHHi!HhH");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHHi!iHHi!HhhhI!IhhI!HI!!h" + "'", str4, "HHHi!iHHi!HhhhI!IhhI!HI!!h");
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhhi!hhhiHhhi!hhhi!ihhi!!", (int) (short) 1, 1, "Hhhi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHhhi!" + "'", str4, "HHhhi!");
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HHHi!iHHi!HhH", (int) (short) -1, "Hhhi!ihhi!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHHi!iHHi!HhH" + "'", str4, "HHHi!iHHi!HhH");
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!ihhi!HHHi!iHHi!hi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!ihhi!hhhi!ihhi!hi!!" + "'", str1, "Hhhi!ihhi!hhhi!ihhi!hi!!");
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.initials("HhhI!IhhI!!", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hh", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hh" + "'", str2, "Hh");
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hHHI!IHHI!hhi!Ihi!!HI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhHhhi!ihhi!HHI!iHI!!hi!!", 0, 0, "HHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhi!ihhi!!!Hhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhi!ihhi!!!Hhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhi!ihhi!!!Hhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhi!ihhi!!!Hhhhi!hhhiHhhi!hhhi!ihhi!!!Hhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhi!ihhi!!!Hhhhi!hhhiHhhi!hhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhi!ihhi!!!Hhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhi!ihhi!!!Hhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhi!ihhi!!!Hhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhi!ihhi!!!Hhhhi!hhhiHhhi!hhhi!ihhi!!!Hhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhi!ihhi!!!Hhhhi!hhhiHhhi!hhhi!ihhi!!!" + "'", str4, "HHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhi!ihhi!!!Hhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhi!ihhi!!!Hhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhi!ihhi!!!Hhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhi!ihhi!!!Hhhhi!hhhiHhhi!hhhi!ihhi!!!Hhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhi!ihhi!!!Hhhhi!hhhiHhhi!hhhi!ihhi!!!");
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!", (-1), (int) '#', "hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!!" + "'", str4, "Hhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!!");
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HHHI!IHHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHI!IHHI!!" + "'", str1, "hHHI!IHHI!!");
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hhHI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!" + "'", str1, "Hhhi!");
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHHi!iHHi!hi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!ihhi!hi!!" + "'", str1, "Hhhhi!ihhi!hi!!");
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!" + "'", str2, "Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("HhhhI!IhhI!HI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HhhI!IhhI!hHHHi!iHHi!hi!!H", (int) (byte) -1, (int) (byte) 0, "HHHi!iHHi!hi!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHHi!iHHi!hi!!" + "'", str4, "HHHi!iHHi!hi!!");
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("Hhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HhhhI!IhhI!HI!!", (int) (short) 100, (int) (byte) -1, "Hhhhi!ihhi!hi!!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end 100, length 15");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("HHHHI!IHHI!HI!!H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhhi!ihhi!hi!!h" + "'", str1, "hhhhi!ihhi!hi!!h");
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!ihhi!hhhhi!ihhi!hhhi!ihhi!!hi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!ihhi!hhhhi!ihhi!hhhi!ihhi!!hi!!" + "'", str1, "Hhhi!ihhi!hhhhi!ihhi!hhhi!ihhi!!hi!!");
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
        char[] charArray9 = new char[] {};
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("hi!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray9);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray9);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("hhi!", charArray9);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("HHHHI!HHHIHHHI!HHHI!IHHI!!", charArray9);
        java.lang.Class<?> wildcardClass19 = charArray9.getClass();
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hi!" + "'", str13, "Hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hi!" + "'", str15, "Hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hI!" + "'", str16, "hI!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hhi!" + "'", str17, "hhi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HHHHI!HHHIHHHI!HHHI!IHHI!!" + "'", str18, "HHHHI!HHHIHHHI!HHHI!IHHI!!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!ihhi!hhhhi!ihhi!hi!!h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!ihhi!hhhhi!ihhi!hi!!h" + "'", str1, "Hhhi!ihhi!hhhhi!ihhi!hi!!h");
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
        char[] charArray13 = new char[] {};
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray13);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("", charArray13);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray13);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray13);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("", charArray13);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.uncapitalize("Hi!", charArray13);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray13);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.uncapitalize("hH", charArray13);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray13);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.uncapitalize("HH", charArray13);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.uncapitalize("HH", charArray13);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.capitalize("", charArray13);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.capitalize("hHHI!IHHI!HHHI!IHHI!!HI!!", charArray13);
        java.lang.Class<?> wildcardClass27 = charArray13.getClass();
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] {});
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hi!" + "'", str17, "Hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Hi!" + "'", str19, "Hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HI!" + "'", str20, "HI!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hH" + "'", str21, "hH");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Hi!" + "'", str22, "Hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "HH" + "'", str23, "HH");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "HH" + "'", str24, "HH");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hHHI!IHHI!HHHI!IHHI!!HI!!" + "'", str26, "hHHI!IHHI!HHHI!IHHI!!HI!!");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hHHHi!iHHi!hi!!H", (int) '#', "HhHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!ihHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!ihHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!!hHHI!IHHI!HI!!h", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHHi!iHHi!hi!!H" + "'", str4, "hHHHi!iHHi!hi!!H");
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hHHi!iHHi!!", (int) (short) 100, "hhhhi!ihhi!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHi!iHHi!!" + "'", str4, "hHHi!iHHi!!");
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HHHi!iHHi!HhhhI!IhhI!HI!!h", (int) (byte) 1, "HHhhhi!ihhi!!HHhhhi!ihhi!!HHhhhi!ihhi!!IHhhhi!ihhi!!!Hhhhi!ihhi!!HHhhhi!ihhi!!HHhhhi!ihhi!!HHhhhi!ihhi!!IHhhhi!ihhi!!!Hhhhi!ihhi!!IHhhhi!ihhi!!HHhhhi!ihhi!!HHhhhi!ihhi!!IHhhhi!ihhi!!!Hhhhi!ihhi!!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHHi!iHHi!HhhhI!IhhI!HI!!h" + "'", str4, "HHHi!iHHi!HhhhI!IhhI!HI!!h");
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!ihi!!hi!hhi!ihi!!hi!!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!ihi!!hi!hhi!ihi!!hi!!" + "'", str2, "hhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!ihi!!hi!hhi!ihi!!hi!!");
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hHHHI!HHHIHHHI!HHHI!IHHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!hhhihhhi!hhhi!ihhi!!" + "'", str1, "Hhhhi!hhhihhhi!hhhi!ihhi!!");
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhhhi!ihhi!hi!!h", (int) (byte) -1, (int) (byte) 1, "hhhhi!hhhi!ihhi!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhhhi!hhhi!ihhi!!" + "'", str4, "Hhhhhi!hhhi!ihhi!!");
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("Hhhhhi!ihhhhHHHI!IHHI!HI!!H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
        char[] charArray10 = new char[] {};
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("Hi!", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray10);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("hH", charArray10);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray10);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("Hhhhhi!ihhi!hi!!h", charArray10);
        java.lang.Class<?> wildcardClass21 = charArray10.getClass();
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hi!" + "'", str14, "Hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hi!" + "'", str16, "Hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HI!" + "'", str17, "HI!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hH" + "'", str18, "hH");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Hi!" + "'", str19, "Hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hhhhhi!ihhi!hi!!h" + "'", str20, "Hhhhhi!ihhi!hi!!h");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhi!", (int) (byte) 1, 0, "hhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!HhHHHI!HHHI!IHHI!!HhHHHI!HHHI!IHHI!!IhHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!HhHHHI!HHHI!IHHI!!IhHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HhhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!HhHHHI!HHHI!IHHI!!HhHHHI!HHHI!IHHI!!IhHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!HhHHHI!HHHI!IHHI!!IhHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!!" + "'", str4, "HhhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!HhHHHI!HHHI!IHHI!!HhHHHI!HHHI!IHHI!!IhHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!HhHHHI!HHHI!IHHI!!IhHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!!");
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        char[] charArray10 = new char[] { '#', '4', '4', '4' };
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!ihhi!!", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("Hhhhi!hhhihhhi!hhhi!ihhi!!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '#', '4', '4', '4' });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hi!" + "'", str11, "Hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hi!" + "'", str12, "Hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H" + "'", str14, "H");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hhhi!ihhi!!" + "'", str15, "Hhhi!ihhi!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hHHHI!HHHIHHHI!HHHI!IHHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHHI!HHHIHHHI!HHHI!IHHI!!" + "'", str1, "HHHHI!HHHIHHHI!HHHI!IHHI!!");
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hHHI!HHHI!IHHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hhHHi!iHHi!HHHI!IHHI!!hi!!", (int) ' ', "hHhi!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhHHi!iHHi!HHHI!IHHI!!hi!!" + "'", str4, "hhHHi!iHHi!HHHI!IHHI!!hi!!");
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hHi!", (int) (byte) 1, "hhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!HhhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!ihhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!!" + "'", str4, "hhhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!HhhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!ihhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!!");
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("Hhhi!Hhhi!Ihhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHI!hHHI!iHHI!!" + "'", str1, "hHHI!hHHI!iHHI!!");
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("Hh", (int) (short) 10, "hHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hIHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!h!HhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hhHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hIHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!h!HhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hiHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hIHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!h!HhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!h!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hh" + "'", str4, "Hh");
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!" + "'", str1, "hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!");
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
        char[] charArray11 = new char[] {};
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("", charArray11);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("Hi!", charArray11);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray11);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.uncapitalize("hH", charArray11);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray11);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.uncapitalize("HH", charArray11);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!", charArray11);
        java.lang.Class<?> wildcardClass23 = charArray11.getClass();
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] {});
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hi!" + "'", str15, "Hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hi!" + "'", str17, "Hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HI!" + "'", str18, "HI!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hH" + "'", str19, "hH");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hi!" + "'", str20, "Hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "HH" + "'", str21, "HH");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Hhhi!" + "'", str22, "Hhhi!");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
        char[] charArray4 = new char[] {};
        java.lang.String str5 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray4);
        java.lang.String str6 = org.apache.commons.lang.WordUtils.initials("", charArray4);
        java.lang.String str7 = org.apache.commons.lang.WordUtils.capitalizeFully("Hh", charArray4);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.initials("hH", charArray4);
        java.lang.Class<?> wildcardClass9 = charArray4.getClass();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Hh" + "'", str7, "Hh");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("HHHHi!iHHi!hi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhhI!IhhI!HI!!" + "'", str1, "hhhhI!IhhI!HI!!");
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("Hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!", (int) (short) 1, "Hhhi!ihhi!hhhhi!ihhi!hhhi!ihhi!!hi!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!" + "'", str4, "Hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!");
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!" + "'", str1, "hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!");
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhhi!ihhi!hhhi!ihhi!!hi!!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhi!ihhi!hhhi!ihhi!!hi!!" + "'", str2, "hhhi!ihhi!hhhi!ihhi!!hi!!");
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hHHI!HHHI!HHHI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHI!HHHI!HHHI!" + "'", str1, "HHHI!HHHI!HHHI!");
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!iHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!iHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!iHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!iHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!" + "'", str1, "Hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!");
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!ihhi!hhhhi!ihhi!hi!!h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhi!ihhi!hhhhi!ihhi!hi!!h" + "'", str1, "hhhi!ihhi!hhhhi!ihhi!hi!!h");
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hhhi!hhhi!hhhi!Ihhi!!hhi!Ihhi!hhhi!hhhi!Ihhi!!hhi!Hhhi!Ihhi!!hhi!!", (int) (short) 100, "HHHI!HHHI!HHHI!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhi!hhhi!hhhi!Ihhi!!hhi!Ihhi!hhhi!hhhi!Ihhi!!hhi!Hhhi!Ihhi!!hhi!!" + "'", str4, "hhhi!hhhi!hhhi!Ihhi!!hhi!Ihhi!hhhi!hhhi!Ihhi!!hhi!Hhhi!Ihhi!!hhi!!");
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("HHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hHhi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HhHI!" + "'", str1, "HhHI!");
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
        char[] charArray4 = new char[] { 'a', '4', 'a' };
        java.lang.String str5 = org.apache.commons.lang.WordUtils.capitalize("", charArray4);
        java.lang.Class<?> wildcardClass6 = charArray4.getClass();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { 'a', '4', 'a' });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!IhHHI!hHHI!iHHI!!!hHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!IhHHI!hHHI!iHHI!!!hHHI!hHHI!iHHI!!IhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!IhHHI!hHHI!iHHI!!!hHHI!hHHI!iHHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!IhHHI!hHHI!iHHI!!!hHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!IhHHI!hHHI!iHHI!!!hHHI!hHHI!iHHI!!IhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!IhHHI!hHHI!iHHI!!!hHHI!hHHI!iHHI!!!" + "'", str1, "HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!IhHHI!hHHI!iHHI!!!hHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!IhHHI!hHHI!iHHI!!!hHHI!hHHI!iHHI!!IhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!IhHHI!hHHI!iHHI!!!hHHI!hHHI!iHHI!!!");
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHHI!HHHIHHHI!HHHI!IHHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!hhhihhhi!hhhi!ihhi!!" + "'", str1, "Hhhhi!hhhihhhi!hhhi!ihhi!!");
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("HhHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!ihHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!ihHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!!hHHI!IHHI!HI!!h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HhHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!ihHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!ihHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!!hHHI!IHHI!HI!!h" + "'", str1, "HhHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!ihHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!ihHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!!hHHI!IHHI!HI!!h");
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HhhhI!IhhI!HI!!h", (int) 'a', "HHhi!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HhhhI!IhhI!HI!!h" + "'", str4, "HhhhI!IhhI!HI!!h");
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HHHI!hHHI!HHhi!", (int) (short) 0, "hHHi!iHHi!HHHI!IHHI!!hi!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHHI!hHHI!HHhi!" + "'", str4, "HHHI!hHHI!HHhi!");
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
        char[] charArray9 = new char[] {};
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray9);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("H", charArray9);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("hh", charArray9);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhI!IhhI!!", charArray9);
        java.lang.Class<?> wildcardClass19 = charArray9.getClass();
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hi!" + "'", str13, "Hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "h" + "'", str15, "h");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hh" + "'", str17, "hh");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hhhI!IhhI!!" + "'", str18, "hhhI!IhhI!!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HHHHi!iHHi!hi!!", 100, "hhHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHHHi!iHHi!hi!!" + "'", str4, "HHHHi!iHHi!hi!!");
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!" + "'", str2, "hhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!");
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HHHI!hHHI!HHhi!", (int) (byte) 10, "hHi!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHHI!hHHI!hHi!HHhi!" + "'", str4, "HHHI!hHHI!hHi!HHhi!");
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("HHH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhh", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhh" + "'", str2, "Hhh");
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhhi!hhhi!hhhi!", (int) ' ', (int) '#', "hHi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end 32, length 15");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("HHi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("h", (int) (byte) 1, 0, "hhhhI!IhhI!HI!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "h" + "'", str4, "h");
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
        char[] charArray9 = new char[] {};
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("HhhI!IhhI!!", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHi!iHHi!hi!!", charArray9);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhhi!hhhi!ihhi!!", charArray9);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("HhHI!", charArray9);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!ihhi!hi!!", charArray9);
        java.lang.Class<?> wildcardClass19 = charArray9.getClass();
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HhhI!IhhI!!" + "'", str14, "HhhI!IhhI!!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HHHi!iHHi!hi!!" + "'", str15, "HHHi!iHHi!hi!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hhhhhi!hhhi!ihhi!!" + "'", str16, "Hhhhhi!hhhi!ihhi!!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HhHI!" + "'", str17, "HhHI!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hhhi!ihhi!hi!!" + "'", str18, "Hhhi!ihhi!hi!!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHHI!IHHI!!", (-1), (int) (byte) 10, "hhhI!IhhI!hhhi!ihhi!!HI!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHHI!IHHI!hhhI!IhhI!hhhi!ihhi!!HI!!" + "'", str4, "HHHI!IHHI!hhhI!IhhI!hhhi!ihhi!!HI!!");
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhhhhi!hhhi!ihhi!!", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhhhi!hhhi!ihhi!!" + "'", str2, "hhhhhi!hhhi!ihhi!!");
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HHHi!iHHi!HHHI!IHHI!!hi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHi!iHHi!HHHI!IHHI!!hi!!" + "'", str1, "hHHi!iHHi!HHHI!IHHI!!hi!!");
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!", (int) (short) -1, 0, "HHhhi!hhhi!hhhi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHhhi!hhhi!hhhi!" + "'", str4, "HHhhi!hhhi!hhhi!");
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hhHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!!" + "'", str1, "hhHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!!");
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
        char[] charArray6 = new char[] {};
        java.lang.String str7 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray6);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.initials("", charArray6);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("H", charArray6);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("hh", charArray6);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("hhI!", charArray6);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray6);
        java.lang.Class<?> wildcardClass13 = charArray6.getClass();
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hh" + "'", str10, "hh");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hhI!" + "'", str11, "hhI!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhI!IhhI!hHHHi!iHHi!hi!!H", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhi!ihhi!hhhhi!ihhi!hi!!h" + "'", str2, "Hhhi!ihhi!hhhhi!ihhi!hi!!h");
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!" + "'", str2, "hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!");
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HHI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHI!" + "'", str1, "hHI!");
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hhHHHI!IHHI!HI!!H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHhhhi!ihhi!hi!!h" + "'", str1, "HHhhhi!ihhi!hi!!h");
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("HHhHhHhHhHhHhHhHiHhH!HhHhHhHhHhHhHhHiHhH!HhHiHhHhHhHhHhHiHhH!HhH!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhhhhhhhhhhhhhihhh!hhhhhhhhhhhhhhhihhh!hhhihhhhhhhhhhhihhh!hhh!" + "'", str1, "Hhhhhhhhhhhhhhhhihhh!hhhhhhhhhhhhhhhihhh!hhhihhhhhhhhhhhihhh!hhh!");
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("Hhhi!ihhi!hhi!ihi!!hi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHI!IHHI!HHI!IHI!!HI!!" + "'", str1, "hHHI!IHHI!HHI!IHI!!HI!!");
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HHhi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHhi!" + "'", str1, "hHhi!");
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!HhHHHI!HHHI!IHHI!!HhHHHI!HHHI!IHHI!!IhHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!HhHHHI!HHHI!IHHI!!IhHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!HhHHHI!HHHI!IHHI!!HhHHHI!HHHI!IHHI!!IhHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!HhHHHI!HHHI!IHHI!!IhHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!!" + "'", str1, "hhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!HhHHHI!HHHI!IHHI!!HhHHHI!HHHI!IHHI!!IhHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!HhHHHI!HHHI!IHHI!!IhHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!!");
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("HHHI!IHHI!hhhI!IhhI!hhhi!ihhi!!HI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHI!IHHI!hhhI!IhhI!hhhi!ihhi!!HI!!" + "'", str1, "HHHI!IHHI!hhhI!IhhI!hhhi!ihhi!!HI!!");
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hh", 100, "HHHI!hHHI!HHhi!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hh" + "'", str4, "hh");
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hHHi!iHHi!HhhhI!IhhI!HI!!h", (int) (short) -1, "hhi!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHi!iHHi!HhhhI!IhhI!HI!!h" + "'", str4, "hHHi!iHHi!HhhhI!IhhI!HI!!h");
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHHI!HHHIHHHI!HHHI!IHHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!hhhihhhi!hhhi!ihhi!!" + "'", str1, "Hhhhi!hhhihhhi!hhhi!ihhi!!");
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HHHHI!HHHI!IHHI!!", 1, "hHI!iHI!!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HhHI!iHI!!HhHI!iHI!!HhHI!iHI!!HhHI!iHI!!IhHI!iHI!!!hHI!iHI!!HhHI!iHI!!HhHI!iHI!!HhHI!iHI!!IhHI!iHI!!!hHI!iHI!!IhHI!iHI!!HhHI!iHI!!HhHI!iHI!!IhHI!iHI!!!hHI!iHI!!!" + "'", str4, "HhHI!iHI!!HhHI!iHI!!HhHI!iHI!!HhHI!iHI!!IhHI!iHI!!!hHI!iHI!!HhHI!iHI!!HhHI!iHI!!HhHI!iHI!!IhHI!iHI!!!hHI!iHI!!IhHI!iHI!!HhHI!iHI!!HhHI!iHI!!IhHI!iHI!!!hHI!iHI!!!");
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HHHHI!HHHI!IHHI!!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHHHI!HHHI!IHHI!!" + "'", str2, "HHHHI!HHHI!IHHI!!");
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!HhHHHI!HHHI!IHHI!!HhHHHI!HHHI!IHHI!!IhHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!HhHHHI!HHHI!IHHI!!IhHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!!" + "'", str1, "Hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!!");
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!" + "'", str1, "Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhhi!hhhi!hhhi!Ihhi!!hhi!Ihhi!hhhi!hhhi!Ihhi!!hhi!Hhhi!Ihhi!!hhi!!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhi!hhhi!hhhi!Ihhi!!hhi!Ihhi!hhhi!hhhi!Ihhi!!hhi!Hhhi!Ihhi!!hhi!!" + "'", str2, "hhhi!hhhi!hhhi!Ihhi!!hhi!Ihhi!hhhi!hhhi!Ihhi!!hhi!Hhhi!Ihhi!!hhi!!");
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hhhhh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhh" + "'", str1, "Hhhhh");
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
        char[] charArray10 = new char[] {};
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("hh", charArray10);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("H", charArray10);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.uncapitalize("Hh", charArray10);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("hhHHi!iHHi!HHHI!IHHI!!hi!!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hi!" + "'", str14, "Hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hh" + "'", str17, "hh");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H" + "'", str18, "H");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Hh" + "'", str19, "Hh");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hhHHi!iHHi!HHHI!IHHI!!hi!!" + "'", str20, "hhHHi!iHHi!HHHI!IHHI!!hi!!");
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hhHHi!iHHi!HHHI!IHHI!!hi!!", 10, "HHhi!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhHHi!iHHi!HHHI!IHHI!!hi!!" + "'", str4, "hhHHi!iHHi!HHHI!IHHI!!hi!!");
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        char[] charArray11 = new char[] { '#', '4', '4', '4' };
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!ihhi!!", charArray11);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("HHHI!hHHI!iHHI!!", charArray11);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!ihhi!hhhhi!ihhi!hi!!h", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '#', '4', '4', '4' });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hi!" + "'", str12, "Hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hi!" + "'", str13, "Hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hhhi!ihhi!!" + "'", str16, "Hhhi!ihhi!!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H" + "'", str17, "H");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hhhi!ihhi!hhhhi!ihhi!hi!!h" + "'", str18, "Hhhi!ihhi!hhhhi!ihhi!hi!!h");
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
        char[] charArray12 = new char[] {};
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray12);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("", charArray12);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray12);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray12);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("", charArray12);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("Hi!", charArray12);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray12);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.uncapitalize("hH", charArray12);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray12);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.uncapitalize("HH", charArray12);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!", charArray12);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalize("hHHHI!IHHI!HI!!H", charArray12);
        java.lang.Class<?> wildcardClass25 = charArray12.getClass();
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] {});
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hi!" + "'", str16, "Hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hi!" + "'", str18, "Hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "HI!" + "'", str19, "HI!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hH" + "'", str20, "hH");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Hi!" + "'", str21, "Hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "HH" + "'", str22, "HH");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Hhhi!" + "'", str23, "Hhhi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hHHHI!IHHI!HI!!H" + "'", str24, "hHHHI!IHHI!HI!!H");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!" + "'", str1, "Hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!");
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HHhhhi!ihhi!!HHhhhi!ihhi!!HHhhhi!ihhi!!IHhhhi!ihhi!!!Hhhhi!ihhi!!HHhhhi!ihhi!!HHhhhi!ihhi!!HHhhhi!ihhi!!IHhhhi!ihhi!!!Hhhhi!ihhi!!IHhhhi!ihhi!!HHhhhi!ihhi!!HHhhhi!ihhi!!IHhhhi!ihhi!!!Hhhhi!ihhi!!!", (int) '#', "Hhhhi!hhhiHhhi!hhhi!ihhi!!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHhhhi!ihhi!!HHhhhi!ihhi!!HHhhhi!ihHhhhi!hhhiHhhi!hhhi!ihhi!!hi!!IHhhhi!ihhi!!!Hhhhi!ihhi!!HHhhhHhhhi!hhhiHhhi!hhhi!ihhi!!i!ihhi!!HHhhhi!ihhi!!HHhhhi!ihhi!!IHhhhi!hhhiHhhi!hhhi!ihhi!!Hhhhi!ihhi!!!Hhhhi!ihhi!!IHhhhi!ihhHhhhi!hhhiHhhi!hhhi!ihhi!!i!!HHhhhi!ihhi!!HHhhhi!ihhi!!IHhhhiHhhhi!hhhiHhhi!hhhi!ihhi!!!ihhi!!!Hhhhi!ihhi!!!" + "'", str4, "HHhhhi!ihhi!!HHhhhi!ihhi!!HHhhhi!ihHhhhi!hhhiHhhi!hhhi!ihhi!!hi!!IHhhhi!ihhi!!!Hhhhi!ihhi!!HHhhhHhhhi!hhhiHhhi!hhhi!ihhi!!i!ihhi!!HHhhhi!ihhi!!HHhhhi!ihhi!!IHhhhi!hhhiHhhi!hhhi!ihhi!!Hhhhi!ihhi!!!Hhhhi!ihhi!!IHhhhi!ihhHhhhi!hhhiHhhi!hhhi!ihhi!!i!!HHhhhi!ihhi!!HHhhhi!ihhi!!IHhhhiHhhhi!hhhiHhhi!hhhi!ihhi!!!ihhi!!!Hhhhi!ihhi!!!");
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("", 1, (int) (byte) 0, "HHHHI!HHHI!IHHI!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!H" + "'", str1, "Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!H");
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hHi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hhhi!Hhhi!Ihhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }
}

