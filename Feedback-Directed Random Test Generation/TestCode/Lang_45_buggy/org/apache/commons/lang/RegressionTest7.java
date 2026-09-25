package org.apache.commons.lang;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest7 {

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
    public void test3501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3501");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hhHHHI!HHHhHHI!hHHI!Hhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhhi!hhhhhhi!hhhi!hhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!" + "'", str1, "Hhhhhi!hhhhhhi!hhhi!hhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!");
    }

    @Test
    public void test3502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3502");
        char[] charArray9 = new char[] { '#', ' ', '4' };
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("HHHi!iHHi!!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("hhhhi!hhhi!ihhi!!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("Hhhi!hhhi!hhhi!", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("hHhhhi!ihhi!hi!!IHhhhi!ihhi!hi!!!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '#', ' ', '4' });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hi!" + "'", str10, "Hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hHHi!iHHi!!" + "'", str12, "hHHi!iHHi!!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hhhhi!hhhi!ihhi!!" + "'", str13, "hhhhi!hhhi!ihhi!!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H" + "'", str14, "H");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hHhhhi!ihhi!hi!!IHhhhi!ihhi!hi!!!" + "'", str15, "hHhhhi!ihhi!hi!!IHhhhi!ihhi!hi!!!");
    }

    @Test
    public void test3503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3503");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("Hhhhi!ihhi!hhhi!ihhi!!hi!!", (int) (byte) -1, "", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhhi!ihhi!hhhi!ihhi!!hi!!" + "'", str4, "Hhhhi!ihhi!hhhi!ihhi!!hi!!");
    }

    @Test
    public void test3504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3504");
        char[] charArray14 = new char[] {};
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray14);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("", charArray14);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray14);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray14);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("", charArray14);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray14);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalize("H", charArray14);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.uncapitalize("hh", charArray14);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalizeFully("H", charArray14);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.initials("hi!", charArray14);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.capitalize("hhi!", charArray14);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.capitalizeFully("hI!", charArray14);
        java.lang.String str27 = org.apache.commons.lang.WordUtils.initials("HHhi!", charArray14);
        java.lang.String str28 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHHI!IHHIhHi!!!HHHHI!IHhHi!HI!!HHHHI!hHi!IHHI!!HHHHhHi!I!IHHI!!IHhHi!HHI!IHHI!!hHi!!HHHI!IHHIhHi!!!IHHHI!IHhHi!HI!!HHHHI!hHi!IHHI!!HhHHhHi!Hi!iHHi!!HhHi!HHHi!iHHi!hHi!!HHHHi!iHHhHi!i!!HHHHi!ihHi!HHi!!IHHHihHi!!iHHi!!!HHhHi!Hi!iHHi!!IhHi!HHHi!iHHi!hHi!!HHHHi!iHHhHi!i!!HHHHi!ihHi!HHi!!IHHHihHi!!iHHi!!!HHhHi!Hi!iHHi!!HhHi!HHHi!iHHi!hHi!!IHHHi!iHHhHi!i!!!HHHi!ihHi!HHi!!!HHHIhHi!!IHHI!!IHHhHi!HI!IHHI!!!hHi!HHHI!IHHI!hHi!!HHHHI!IHHhHi!I!!IHHHI!IhHi!HHI!!!HHHIhHi!!IHHI!!!", charArray14);
        java.lang.Class<?> wildcardClass29 = charArray14.getClass();
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] {});
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hi!" + "'", str18, "Hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "h" + "'", str20, "h");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "H" + "'", str21, "H");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hh" + "'", str22, "hh");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "H" + "'", str23, "H");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hhi!" + "'", str25, "hhi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hI!" + "'", str26, "hI!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "HHHHI!IHHIhHi!!!HHHHI!IHhHi!HI!!HHHHI!hHi!IHHI!!HHHHhHi!I!IHHI!!IHhHi!HHI!IHHI!!hHi!!HHHI!IHHIhHi!!!IHHHI!IHhHi!HI!!HHHHI!hHi!IHHI!!HhHHhHi!Hi!iHHi!!HhHi!HHHi!iHHi!hHi!!HHHHi!iHHhHi!i!!HHHHi!ihHi!HHi!!IHHHihHi!!iHHi!!!HHhHi!Hi!iHHi!!IhHi!HHHi!iHHi!hHi!!HHHHi!iHHhHi!i!!HHHHi!ihHi!HHi!!IHHHihHi!!iHHi!!!HHhHi!Hi!iHHi!!HhHi!HHHi!iHHi!hHi!!IHHHi!iHHhHi!i!!!HHHi!ihHi!HHi!!!HHHIhHi!!IHHI!!IHHhHi!HI!IHHI!!!hHi!HHHI!IHHI!hHi!!HHHHI!IHHhHi!I!!IHHHI!IhHi!HHI!!!HHHIhHi!!IHHI!!!" + "'", str28, "HHHHI!IHHIhHi!!!HHHHI!IHhHi!HI!!HHHHI!hHi!IHHI!!HHHHhHi!I!IHHI!!IHhHi!HHI!IHHI!!hHi!!HHHI!IHHIhHi!!!IHHHI!IHhHi!HI!!HHHHI!hHi!IHHI!!HhHHhHi!Hi!iHHi!!HhHi!HHHi!iHHi!hHi!!HHHHi!iHHhHi!i!!HHHHi!ihHi!HHi!!IHHHihHi!!iHHi!!!HHhHi!Hi!iHHi!!IhHi!HHHi!iHHi!hHi!!HHHHi!iHHhHi!i!!HHHHi!ihHi!HHi!!IHHHihHi!!iHHi!!!HHhHi!Hi!iHHi!!HhHi!HHHi!iHHi!hHi!!IHHHi!iHHhHi!i!!!HHHi!ihHi!HHi!!!HHHIhHi!!IHHI!!IHHhHi!HI!IHHI!!!hHi!HHHI!IHHI!hHi!!HHHHI!IHHhHi!I!!IHHHI!IhHi!HHI!!!HHHIhHi!!IHHI!!!");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test3505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3505");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hhHHHI!IHHI!!hhHHHI!IHHI!!hhHHHI!IHHI!!ihHHHI!IHHI!!!hHHHI!IHHI!!hhHHHI!IHHI!!hhHHHI!IHHI!!hhHHHI!IHHI!!ihHHHI!IHHI!!!hHHHI!IHHI!!ihHHHI!IHHI!!hhHHHI!IHHI!!hhHHHI!IHHI!!ihHHHI!IHHI!!!hHHHI!IHHI!!!", (int) 'a', "HhH", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhHHHI!IHHI!!hhHHHI!IHHI!!hhHHHI!IHHI!!ihHHHI!IHHI!!!hHHHI!IHHI!!hhHHHI!IHHI!!hhHHHI!IHHI!!hhHHHIHhH!IHHI!!ihHHHI!IHHI!!!hHHHI!IHHI!!ihHHHI!IHHI!!hhHHHI!IHHI!!hhHHHI!IHHI!!ihHHHI!IHHI!!!hHHHI!IHHI!HhH!!" + "'", str4, "hhHHHI!IHHI!!hhHHHI!IHHI!!hhHHHI!IHHI!!ihHHHI!IHHI!!!hHHHI!IHHI!!hhHHHI!IHHI!!hhHHHI!IHHI!!hhHHHIHhH!IHHI!!ihHHHI!IHHI!!!hHHHI!IHHI!!ihHHHI!IHHI!!hhHHHI!IHHI!!hhHHHI!IHHI!!ihHHHI!IHHI!!!hHHHI!IHHI!HhH!!");
    }

    @Test
    public void test3506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3506");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("", (int) (byte) 10, (int) (short) 1, "HHHHHI!IHHI!!HHHHHI!IHHI!!HHHHHI!IHHHHHI!HHHIHHHI!HHHI!IHHI!!HI!!IHHHHI!IHHI!!!HHHHI!IHHI!!HHHHHHhhhhHHHHI!IHHI!!HHHHHI!IHHI!!HHHHHI!IHHI!!IHHHHI!IHHI!!HHHI!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test3507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3507");
        char[] charArray7 = new char[] { ' ' };
        java.lang.String str8 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalize("Hhi!", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("H", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("hHHHi!iHHi!hi!!", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("hHh", charArray7);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhhi!ihhihhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!", charArray7);
        java.lang.Class<?> wildcardClass14 = charArray7.getClass();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { ' ' });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H" + "'", str8, "H");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Hhi!" + "'", str9, "Hhi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "h" + "'", str10, "h");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "h" + "'", str11, "h");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hHh" + "'", str12, "hHh");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhhi!ihhihhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!" + "'", str13, "hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhhi!ihhihhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3508");
        char[] charArray8 = new char[] { '#', ' ', '4' };
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("HH", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhhhhi!ihhi!hi!!h", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("hHhhI!IhhI!hHHHi!iHHi!hi!!HHHhhI!IhhI!hHHHi!iHHi!hi!!HHHhhI!IhhI!hHHHi!iHHi!hi!!HHHhhI!IhhI!hHHHi!iHHhhI!IhhI!hhhi!ihhi!!HI!!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '#', ' ', '4' });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Hi!" + "'", str9, "Hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H" + "'", str11, "H");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhhhhi!ihhi!hi!!h" + "'", str12, "Hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhhhhi!ihhi!hi!!h");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HHhhI!IhhI!hHHHi!iHHi!hi!!HHHhhI!IhhI!hHHHi!iHHi!hi!!HHHhhI!IhhI!hHHHi!iHHi!hi!!HHHhhI!IhhI!hHHHi!iHHhhI!IhhI!hhhi!ihhi!!HI!!" + "'", str13, "HHhhI!IhhI!hHHHi!iHHi!hi!!HHHhhI!IhhI!hHHHi!iHHi!hi!!HHHhhI!IhhI!hHHHi!iHHi!hi!!HHHhhI!IhhI!hHHHi!iHHhhI!IhhI!hhhi!ihhi!!HI!!");
    }

    @Test
    public void test3509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3509");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("HHhhhi!hhhhHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhhi!hhhhhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!" + "'", str1, "Hhhhhi!hhhhhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
    }

    @Test
    public void test3510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3510");
        char[] charArray13 = new char[] { '#', '4', '4', '4' };
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray13);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray13);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("", charArray13);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray13);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray13);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.initials("Hhhi!ihhi!!", charArray13);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray13);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalizeFully("HHhhi!hhhi!hhhi!", charArray13);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!H", charArray13);
        java.lang.Class<?> wildcardClass23 = charArray13.getClass();
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '#', '4', '4', '4' });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hi!" + "'", str14, "Hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hi!" + "'", str15, "Hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H" + "'", str17, "H");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H" + "'", str18, "H");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H" + "'", str19, "H");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hi!" + "'", str20, "Hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Hhhhi!hhhi!hhhi!" + "'", str21, "Hhhhi!hhhi!hhhi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!H" + "'", str22, "hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!H");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3511");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!ihi!!hi!hhi!ihi!!hi!!hhhhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!ihi!!hi!hhi!ihi!!hi!!hhhhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!ihi!!hi!hhi!ihi!!hi!!hhhhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!ihi!!hi!hhi!ihi!!hi!!h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!ihi!!hi!hhi!ihi!!hi!!hhhhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!ihi!!hi!hhi!ihi!!hi!!hhhhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!ihi!!hi!hhi!ihi!!hi!!hhhhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!ihi!!hi!hhi!ihi!!hi!!h" + "'", str1, "Hhhhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!ihi!!hi!hhi!ihi!!hi!!hhhhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!ihi!!hi!hhi!ihi!!hi!!hhhhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!ihi!!hi!hhi!ihi!!hi!!hhhhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!ihi!!hi!hhi!ihi!!hi!!h");
    }

    @Test
    public void test3512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3512");
        char[] charArray5 = new char[] {};
        java.lang.String str6 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray5);
        java.lang.String str7 = org.apache.commons.lang.WordUtils.initials("", charArray5);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray5);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray5);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("hhH", charArray5);
        java.lang.Class<?> wildcardClass11 = charArray5.getClass();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hhH" + "'", str10, "hhH");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3513");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhhhi!hhhihhhi!hhhi!ihhi!!", (int) (byte) 0, 100, "Hhhhi!hhhi!ihhi!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhhi!hhhihhhi!hhhi!ihhi!!" + "'", str4, "hhhhi!hhhihhhi!hhhi!ihhi!!");
    }

    @Test
    public void test3514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3514");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("Hhhhi!hhhihhi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHHI!HHHIHHI!" + "'", str1, "hHHHI!HHHIHHI!");
    }

    @Test
    public void test3515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3515");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHhhhi!ihhi!!HHhhhi!ihhi!!HHhhhi!ihHhhhi!hhhiHhhi!hhhi!ihhi!!hi!!IHhhhi!ihhi!!!Hhhhi!ihhi!!HHhhhHhhhi!hhhiHhhi!hhhi!ihhi!!i!ihhi!!HHhhhi!ihhi!!HHhhhi!ihhi!!IHhhhi!hhhiHhhi!hhhi!ihhi!!Hhhhi!ihhi!!!Hhhhi!ihhi!!IHhhhi!ihhHhhhi!hhhiHhhi!hhhi!ihhi!!i!!HHhhhi!ihhi!!HHhhhi!ihhi!!IHhhhiHhhhi!hhhiHhhi!hhhi!ihhi!!!ihhi!!!Hhhhi!ihhi!!!", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHhhhi!ihhi!!HHhhhi!ihhi!!HHhhhi!ihHhhhi!hhhiHhhi!hhhi!ihhi!!hi!!IHhhhi!ihhi!!!Hhhhi!ihhi!!HHhhhHhhhi!hhhiHhhi!hhhi!ihhi!!i!ihhi!!HHhhhi!ihhi!!HHhhhi!ihhi!!IHhhhi!hhhiHhhi!hhhi!ihhi!!Hhhhi!ihhi!!!Hhhhi!ihhi!!IHhhhi!ihhHhhhi!hhhiHhhi!hhhi!ihhi!!i!!HHhhhi!ihhi!!HHhhhi!ihhi!!IHhhhiHhhhi!hhhiHhhi!hhhi!ihhi!!!ihhi!!!Hhhhi!ihhi!!!" + "'", str2, "hHhhhi!ihhi!!HHhhhi!ihhi!!HHhhhi!ihHhhhi!hhhiHhhi!hhhi!ihhi!!hi!!IHhhhi!ihhi!!!Hhhhi!ihhi!!HHhhhHhhhi!hhhiHhhi!hhhi!ihhi!!i!ihhi!!HHhhhi!ihhi!!HHhhhi!ihhi!!IHhhhi!hhhiHhhi!hhhi!ihhi!!Hhhhi!ihhi!!!Hhhhi!ihhi!!IHhhhi!ihhHhhhi!hhhiHhhi!hhhi!ihhi!!i!!HHhhhi!ihhi!!HHhhhi!ihhi!!IHhhhiHhhhi!hhhiHhhi!hhhi!ihhi!!!ihhi!!!Hhhhi!ihhi!!!");
    }

    @Test
    public void test3516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3516");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("Hhhhi!ihhi!hi!!hhhhi!ihhi!hi!!hhhhi!ihhi!hi!!ihhhi!ihhi!hi!!!hhhi!ihhi!hi!!ihhhi!ihhi!hi!!hhhhi!ihhi!hi!!hhhhi!ihhi!hi!!ihhhi!ihhi!hi!!!hhhi!ihhi!hi!!hhhhi!ihhi!hi!!hhhhi!ihhi!hi!!hhhhi!ihhi!hi!!hhhhi!ihhi!hi!!ihhhi!ihhi!hi!!!hhhi!ihhi!hi!!ihhhi!ihhi!hi!!hhhhi!ihhi!hi!!hhhhi!ihhi!hi!!ihhhi!ihhi!hi!!!hhhi!ihhi!hi!!hhhhi!ihhi!hi!!ihhhi!ihhi!hi!!!hhhi!ihhi!hi!!!hhhi!ihhi!hi!!h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHHI!IHHI!HI!!HHHHI!IHHI!HI!!HHHHI!IHHI!HI!!IHHHI!IHHI!HI!!!HHHI!IHHI!HI!!IHHHI!IHHI!HI!!HHHHI!IHHI!HI!!HHHHI!IHHI!HI!!IHHHI!IHHI!HI!!!HHHI!IHHI!HI!!HHHHI!IHHI!HI!!HHHHI!IHHI!HI!!HHHHI!IHHI!HI!!HHHHI!IHHI!HI!!IHHHI!IHHI!HI!!!HHHI!IHHI!HI!!IHHHI!IHHI!HI!!HHHHI!IHHI!HI!!HHHHI!IHHI!HI!!IHHHI!IHHI!HI!!!HHHI!IHHI!HI!!HHHHI!IHHI!HI!!IHHHI!IHHI!HI!!!HHHI!IHHI!HI!!!HHHI!IHHI!HI!!H" + "'", str1, "hHHHI!IHHI!HI!!HHHHI!IHHI!HI!!HHHHI!IHHI!HI!!IHHHI!IHHI!HI!!!HHHI!IHHI!HI!!IHHHI!IHHI!HI!!HHHHI!IHHI!HI!!HHHHI!IHHI!HI!!IHHHI!IHHI!HI!!!HHHI!IHHI!HI!!HHHHI!IHHI!HI!!HHHHI!IHHI!HI!!HHHHI!IHHI!HI!!HHHHI!IHHI!HI!!IHHHI!IHHI!HI!!!HHHI!IHHI!HI!!IHHHI!IHHI!HI!!HHHHI!IHHI!HI!!HHHHI!IHHI!HI!!IHHHI!IHHI!HI!!!HHHI!IHHI!HI!!HHHHI!IHHI!HI!!IHHHI!IHHI!HI!!!HHHI!IHHI!HI!!!HHHI!IHHI!HI!!H");
    }

    @Test
    public void test3517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3517");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!hhhi!hhhi!Ihhi!!hhi!Ihhi!hhhi!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!hhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!hhHHHI!HHHIhHHI!HHHI!IHHI!!ihHHHI!HHHIhHHI!HHHI!IHHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!" + "'", str1, "Hhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!");
    }

    @Test
    public void test3518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3518");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hhhhhi!hhhhHHI!HHHI!IHHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhhhi!hhhhHHI!HHHI!IHHI!!" + "'", str1, "hhhhhi!hhhhHHI!HHHI!IHHI!!");
    }

    @Test
    public void test3519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3519");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHIhHI!HHI!HHHHHHI!HHHI!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhihhi!hhi!hhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!" + "'", str1, "Hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhihhi!hhi!hhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
    }

    @Test
    public void test3520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3520");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!H", (int) (short) 1, "hHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HIHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!H!HHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HIHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!H!HHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HIHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HIHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!H!HHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!H!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!H" + "'", str4, "Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!H");
    }

    @Test
    public void test3521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3521");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhhi!ihhi!hi!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhi!ihhi!hi!" + "'", str2, "Hhhi!ihhi!hi!");
    }

    @Test
    public void test3522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3522");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hhHHi!iHHiHhH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HhHHi!iHHiHhH" + "'", str1, "HhHHi!iHHiHhH");
    }

    @Test
    public void test3523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3523");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!hHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!IHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!ihhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!!" + "'", str1, "Hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!ihhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!!");
    }

    @Test
    public void test3524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3524");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("HHhhhi!ihhHHhHhHhHhHhHhHhHiHhH!HhHhHhHhHhHhHhHiHhH!HhHiHhHhHhHhHhHiHhH!HhH!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhHHHI!IHHhhHhHhHhHhHhHhHhIhHh!hHhHhHhHhHhHhHhIhHh!hHhIhHhHhHhHhHhIhHh!hHh!" + "'", str1, "hhHHHI!IHHhhHhHhHhHhHhHhHhIhHh!hHhHhHhHhHhHhHhIhHh!hHhIhHhHhHhHhHhIhHh!hHh!");
    }

    @Test
    public void test3525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3525");
        char[] charArray8 = new char[] {};
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("hi!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("HhhI!IhhI!!", charArray8);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("HhI!HhI!HhI!HhI!ihI!!hI!ihI!HhI!HhI!ihI!!hI!hhI!ihI!!hI!!", charArray8);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("HHHi!iHHi!!", charArray8);
        java.lang.Class<?> wildcardClass17 = charArray8.getClass();
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HI!" + "'", str12, "HI!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HI!" + "'", str13, "HI!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HhI!HhI!HhI!HhI!ihI!!hI!ihI!HhI!HhI!ihI!!hI!hhI!ihI!!hI!!" + "'", str15, "HhI!HhI!HhI!HhI!ihI!!hI!ihI!HhI!HhI!ihI!!hI!hhI!ihI!!hI!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HHHi!iHHi!!" + "'", str16, "HHHi!iHHi!!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3526");
        char[] charArray12 = new char[] { '#', '4', '4', '4' };
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray12);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray12);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("", charArray12);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray12);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!Hhhi!Ihhi!!", charArray12);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("HhhhI!IhhI!HI!!h", charArray12);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("hHhhhi!ihhi!hi!!h", charArray12);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.uncapitalize("HHHI!HHHI!Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!", charArray12);
        java.lang.Class<?> wildcardClass21 = charArray12.getClass();
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '#', '4', '4', '4' });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hi!" + "'", str13, "Hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hi!" + "'", str14, "Hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hhhi!Hhhi!Ihhi!!" + "'", str17, "Hhhi!Hhhi!Ihhi!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HhhhI!IhhI!HI!!h" + "'", str18, "HhhhI!IhhI!HI!!h");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Hhhhhi!ihhi!hi!!h" + "'", str19, "Hhhhhi!ihhi!hi!!h");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hHHI!HHHI!Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!" + "'", str20, "hHHI!HHHI!Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3527");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhi!ihhihhhhi!hhhi!ihhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhhi!ihhihhhhi!hhhi!ihhi!!" + "'", str1, "hhhhi!ihhihhhhi!hhhi!ihhi!!");
    }

    @Test
    public void test3528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3528");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!HHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!HHHi!iHHi!HHHI!IHHI!!hi!!", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!HHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!HHHi!iHHi!HHHI!IHHI!!hi!!" + "'", str2, "hHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!HHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!HHHi!iHHi!HHHI!IHHI!!hi!!");
    }

    @Test
    public void test3529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3529");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hhHHI!HHHI!HHHI!", 10, "hHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHIHhhi!hhhi!hhi!hhhi!!!IHHHI!IHHI!!!HHHHHI!IHHI!!HHHHI!IHhhi!hhhi!hhi!hhhi!HHI!!HHHHI!IHHI!!IHHHI!IHHI!!!IHHHHHhhi!hhhi!hhi!hhhi!I!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHhhi!hhhi!hhi!hhhi!HI!IHHI!!!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhHHI!HHHI!HHHI!" + "'", str4, "hhHHI!HHHI!HHHI!");
    }

    @Test
    public void test3530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3530");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhhhhi!hhhHHhhI!IhhIHHHHI!HHHI!IHHI!!", 0, (int) (byte) 10, "Hhhhi!hhhihhhi!ihhi!hi!!!ihhi!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhhhi!hhhHhhhi!hhhihhhi!ihhi!hi!!!ihhi!!" + "'", str4, "hhhhhi!hhhHhhhi!hhhihhhi!ihhi!hi!!!ihhi!!");
    }

    @Test
    public void test3531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3531");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hhhhi!hhhihhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhihhhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!HhhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!ihhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test3532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3532");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HHHHHI!IHHI!!HHHHHI!IHHI!!HHHHHI!IHHHHHI!HHHIHHHI!HHHI!IHHI!!HI!!IHHHHI!IHHI!!!HHHHI!IHHI!!HHHHHHhhhhHHHHI!IHHI!!HHHHHI!IHHI!!HHHHHI!IHHI!!IHHHHI!IHHI!!HHHI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHHHI!IHHI!!HHHHHI!IHHI!!HHHHHI!IHHHHHI!HHHIHHHI!HHHI!IHHI!!HI!!IHHHHI!IHHI!!!HHHHI!IHHI!!HHHHHHhhhhHHHHI!IHHI!!HHHHHI!IHHI!!HHHHHI!IHHI!!IHHHHI!IHHI!!HHHI!" + "'", str1, "hHHHHI!IHHI!!HHHHHI!IHHI!!HHHHHI!IHHHHHI!HHHIHHHI!HHHI!IHHI!!HI!!IHHHHI!IHHI!!!HHHHI!IHHI!!HHHHHHhhhhHHHHI!IHHI!!HHHHHI!IHHI!!HHHHHI!IHHI!!IHHHHI!IHHI!!HHHI!");
    }

    @Test
    public void test3533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3533");
        char[] charArray11 = new char[] { '#', '4', '4', '4' };
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("H", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("hhhi!ihhi!!", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("hhhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!ihi!!hi!hhi!ihi!!hi!!", charArray11);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!hhhi!hhhi!Ihhi!!hhi!Ihhi!hhhi!hhhi!Ihhi!!hhi!Hhhi!Ihhi!!hhi!!", charArray11);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("HhHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!ihHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!ihHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!!hHHI!IHHI!HI!!h", charArray11);
        java.lang.Class<?> wildcardClass19 = charArray11.getClass();
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '#', '4', '4', '4' });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hi!" + "'", str12, "Hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hi!" + "'", str13, "Hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "h" + "'", str14, "h");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hhhi!ihhi!!" + "'", str15, "hhhi!ihhi!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "h" + "'", str16, "h");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!" + "'", str17, "Hhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HhHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!ihHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!ihHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!!hHHI!IHHI!HI!!h" + "'", str18, "HhHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!ihHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!ihHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!!hHHI!IHHI!HI!!h");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3534");
        char[] charArray9 = new char[] {};
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("hi!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("Hh", charArray9);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("hhhI!IhhI!HI!!", charArray9);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("HhhI!IhhI!hHHHi!iHHi!hi!!H", charArray9);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("Hhhi!ihhi!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!!hhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!!hhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!!hhhi!ihhi!hhi!ihi!!hi!!!hhhhi!ihhihhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!!hhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!!hhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!!hhhi!ihhi!hhi!ihi!!hi!!!!hi!!h", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hi!" + "'", str13, "Hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hi!" + "'", str14, "Hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hh" + "'", str15, "Hh");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hhhI!IhhI!HI!!" + "'", str16, "hhhI!IhhI!HI!!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HhhI!IhhI!hHHHi!iHHi!hi!!H" + "'", str17, "HhhI!IhhI!hHHHi!iHHi!hi!!H");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test3535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3535");
        char[] charArray5 = new char[] {};
        java.lang.String str6 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray5);
        java.lang.String str7 = org.apache.commons.lang.WordUtils.initials("", charArray5);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalize("HHHI!IHHI!hi!", charArray5);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHHI!IHHIHHHI!hHHI!hHi!HHhi!", charArray5);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!ihhi!HI!", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HHHI!IHHI!hi!" + "'", str8, "HHHI!IHHI!hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HHHHI!IHHIHHHI!hHHI!hHi!HHhi!" + "'", str9, "HHHHI!IHHIHHHI!hHHI!hHi!HHhi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hhhi!ihhi!HI!" + "'", str10, "Hhhi!ihhi!HI!");
    }

    @Test
    public void test3536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3536");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!ihi!!hi!hhi!ihi!!hi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!HHI!IHI!!HI!!" + "'", str1, "HHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!HHI!IHI!!HI!!");
    }

    @Test
    public void test3537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3537");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hhhhi!HhhiHHHI!IHHI!hhhI!IhhI!HI!!", (int) (short) 10, "HHHI!IHHI!hhi!Ihi!!HI!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhhi!HhhiHHHI!IHHI!hhhI!IhhI!HI!!" + "'", str4, "hhhhi!HhhiHHHI!IHHI!hhhI!IhhI!HI!!");
    }

    @Test
    public void test3538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3538");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhhh", (-1), (int) '#', "hhhi!hhhi!hHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhh" + "'", str4, "hhhh");
    }

    @Test
    public void test3539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3539");
        char[] charArray6 = new char[] {};
        java.lang.String str7 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray6);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.initials("", charArray6);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("H", charArray6);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("hh", charArray6);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("hhhI!IhhI!Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!", charArray6);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("hHHHHI!HHHI!IHHI!!", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hh" + "'", str10, "hh");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hhhI!IhhI!Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!" + "'", str11, "hhhI!IhhI!Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hHHHHI!HHHI!IHHI!!" + "'", str12, "hHHHHI!HHHI!IHHI!!");
    }

    @Test
    public void test3540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3540");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!hhhihhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!" + "'", str1, "Hhhhi!hhhihhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!");
    }

    @Test
    public void test3541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3541");
        char[] charArray4 = new char[] {};
        java.lang.String str5 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray4);
        java.lang.String str6 = org.apache.commons.lang.WordUtils.initials("", charArray4);
        java.lang.String str7 = org.apache.commons.lang.WordUtils.capitalize("Hh", charArray4);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalize("Hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!h", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Hh" + "'", str7, "Hh");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!h" + "'", str8, "Hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!h");
    }

    @Test
    public void test3542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3542");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHHI!HHHI!HHI!HHHI!", 100, 100, "HhhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!HhhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!Hhhi!ihhi!HHI!iHI!!hi!!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end 100, length 54");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3543");
        char[] charArray9 = new char[] { '#', '4', '4', '4' };
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray9);
        java.lang.Class<?> wildcardClass15 = charArray9.getClass();
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '#', '4', '4', '4' });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hi!" + "'", str10, "Hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hi!" + "'", str11, "Hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H" + "'", str13, "H");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H" + "'", str14, "H");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3544");
        char[] charArray8 = new char[] {};
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("H", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("hhI!", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("hH", charArray8);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("hHHi!iHHi!!", charArray8);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("hHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H" + "'", str12, "H");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!!" + "'", str16, "hHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!!");
    }

    @Test
    public void test3545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3545");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!hhhi!ihhi!HHHi!iHHi!HHHI!IHHI!!hi!!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhihhhi!ihhi!HHHi!iHHi!HHHI!IHHI!!hi!!!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhhhhi!ihhi!HHHi!iHHi!HHHI!IHHI!!hi!!i!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhhhi!ihhi!HHHi!iHHi!HHHI!IHHI!!hi!!hi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!hhhi!ihhi!hhhi!ihhi!hhhi!ihhi!!hi!!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhihhhi!ihhi!hhhi!ihhi!hhhi!ihhi!!hi!!!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhhhhi!ihhi!hhhi!ihhi!hhhi!ihhi!!hi!!i!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhhhi!ihhi!hhhi!ihhi!hhhi!ihhi!!hi!!hi!!ihhhi!ihhi!!!hhhi!ihhi!!!" + "'", str1, "Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!hhhi!ihhi!hhhi!ihhi!hhhi!ihhi!!hi!!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhihhhi!ihhi!hhhi!ihhi!hhhi!ihhi!!hi!!!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhhhhi!ihhi!hhhi!ihhi!hhhi!ihhi!!hi!!i!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhhhi!ihhi!hhhi!ihhi!hhhi!ihhi!!hi!!hi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
    }

    @Test
    public void test3546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3546");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hihhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!h!hhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hihhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!h!hhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hihhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hihhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!h!hhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!h!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hihhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!h!hhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hihhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!h!hhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hihhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hihhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!h!hhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!h!" + "'", str1, "Hhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hihhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!h!hhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hihhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!h!hhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hihhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hihhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!h!hhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!h!");
    }

    @Test
    public void test3547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3547");
        char[] charArray9 = new char[] {};
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("hi!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("", charArray9);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("hI!", charArray9);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!ihhi!!", charArray9);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("hHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!", charArray9);
        java.lang.Class<?> wildcardClass19 = charArray9.getClass();
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hi!" + "'", str13, "Hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hI!" + "'", str16, "hI!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hhhi!ihhi!!" + "'", str17, "Hhhi!ihhi!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!" + "'", str18, "hHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3548");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHHI!hHHI!Hhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!!", 1, (-1), "hhhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!IhhiHHHHi!iHHi!hi!!H");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHHI!hHHI!Hhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!!" + "'", str4, "HHHI!hHHI!Hhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!!");
    }

    @Test
    public void test3549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3549");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hHHI!IHHI!HHI!IHI!!HI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHI!IHHI!HHI!IHI!!HI!!" + "'", str1, "hHHI!IHHI!HHI!IHI!!HI!!");
    }

    @Test
    public void test3550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3550");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HHHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!!" + "'", str1, "hHHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!!");
    }

    @Test
    public void test3551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3551");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hHHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!HHI!IHI!!HI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!ihi!!hi!hhi!ihi!!hi!!" + "'", str1, "Hhhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!ihi!!hi!hhi!ihi!!hi!!");
    }

    @Test
    public void test3552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3552");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hhHHi!iHHi!HHHI!IHHI!!hi!!hhHHi!iHHi!HHHI!IHHI!!hi!!HhHHi!iHHi!HHHI!IHHI!!hi!!HhHHi!iHHi!HHHI!IHHI!!hi!!IhHHi!iHHi!HHHI!IHHI!!hi!!!hHHi!iHHi!HHHI!IHHI!!hi!!HhHHi!iHHi!HHHI!IHHI!!hi!!HhHHi!iHHi!HHHI!IHHI!!hi!!HhHHi!iHHi!HHHI!IHHI!!hi!!IhHHi!iHHi!HHHI!IHHI!!hi!!!hHHi!iHHi!HHHI!IHHI!!hi!!HhHHi!iHHi!HHHI!IHHI!!hi!!HhHHi!iHHi!HHHI!IHHI!!hi!!HhHHi!iHHi!HHHI!IHHI!!hi!!IhHHi!iHHi!HHHI!IHHI!!hi!!!", (int) (short) 10, "Hhhhi!ihhi!hi!!hhhhi!ihhi!hi!!hhhhi!ihhi!hi!!ihhhi!ihhi!hi!!!hhhi!ihhi!hi!!ihhhi!ihhi!hi!!hhhhi!ihhi!hi!!hhhhi!ihhi!hi!!ihhhi!ihhi!hi!!!hhhi!ihhi!hi!!hhhhi!ihhi!hi!!hhhhi!ihhi!hi!!hhhhi!ihhi!hi!!hhhhi!ihhi!hi!!ihhhi!ihhi!hi!!!hhhi!ihhi!hi!!ihhhi!ihhi!hi!!hhhhi!ihhi!hi!!hhhhi!ihhi!hi!!ihhhi!ihhi!hi!!!hhhi!ihhi!hi!!hhhhi!ihhi!hi!!ihhhi!ihhi!hi!!!hhhi!ihhi!hi!!!hhhi!ihhi!hi!!h", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhHHi!iHHi!HHHI!IHHI!!hi!!hhHHi!iHHi!HHHI!IHHI!!hi!!HhHHi!iHHi!HHHI!IHHI!!hi!!HhHHi!iHHi!HHHI!IHHI!!hi!!IhHHi!iHHi!HHHI!IHHI!!hi!!!hHHi!iHHi!HHHI!IHHI!!hi!!HhHHi!iHHi!HHHI!IHHI!!hi!!HhHHi!iHHi!HHHI!IHHI!!hi!!HhHHi!iHHi!HHHI!IHHI!!hi!!IhHHi!iHHi!HHHI!IHHI!!hi!!!hHHi!iHHi!HHHI!IHHI!!hi!!HhHHi!iHHi!HHHI!IHHI!!hi!!HhHHi!iHHi!HHHI!IHHI!!hi!!HhHHi!iHHi!HHHI!IHHI!!hi!!IhHHi!iHHi!HHHI!IHHI!!hi!!!" + "'", str4, "hhHHi!iHHi!HHHI!IHHI!!hi!!hhHHi!iHHi!HHHI!IHHI!!hi!!HhHHi!iHHi!HHHI!IHHI!!hi!!HhHHi!iHHi!HHHI!IHHI!!hi!!IhHHi!iHHi!HHHI!IHHI!!hi!!!hHHi!iHHi!HHHI!IHHI!!hi!!HhHHi!iHHi!HHHI!IHHI!!hi!!HhHHi!iHHi!HHHI!IHHI!!hi!!HhHHi!iHHi!HHHI!IHHI!!hi!!IhHHi!iHHi!HHHI!IHHI!!hi!!!hHHi!iHHi!HHHI!IHHI!!hi!!HhHHi!iHHi!HHHI!IHHI!!hi!!HhHHi!iHHi!HHHI!IHHI!!hi!!HhHHi!iHHi!HHHI!IHHI!!hi!!IhHHi!iHHi!HHHI!IHHI!!hi!!!");
    }

    @Test
    public void test3553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3553");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hHHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!!" + "'", str1, "hHHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!!");
    }

    @Test
    public void test3554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3554");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HHhhI!IhhIhHh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHhhI!IhhIhHh" + "'", str1, "hHhhI!IhhIhHh");
    }

    @Test
    public void test3555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3555");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!h", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!h" + "'", str2, "hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!h");
    }

    @Test
    public void test3556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3556");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("Hhi!hhi!hhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhhHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhhi!hhhi!hhi!hhhi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhi!hhi!hhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhhHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhhi!hhhi!hhi!hhhi!" + "'", str1, "hhi!hhi!hhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhhHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhhi!hhhi!hhi!hhhi!");
    }

    @Test
    public void test3557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3557");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("HHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!!" + "'", str1, "HHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!!");
    }

    @Test
    public void test3558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3558");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("Hhhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhhhhi!hhhihhhi!hhhi!ihhi!!hi!!ihhhhi!ihhi!!!hhhhi!ihhi!!hhhhhhhhhhhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhihhi!hhi!hhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhhhhi!hhhihhhi!hhhi!ihhi!!hi!!ihhhhi!ihhi!!!hhhhi!ihhi!!hhhhhhhhhhhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhihhi!hhi!hhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!" + "'", str1, "Hhhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhhhhi!hhhihhhi!hhhi!ihhi!!hi!!ihhhhi!ihhi!!!hhhhi!ihhi!!hhhhhhhhhhhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhihhi!hhi!hhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
    }

    @Test
    public void test3559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3559");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!" + "'", str1, "Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!");
    }

    @Test
    public void test3560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3560");
        char[] charArray6 = new char[] { '#', '4', '4', '4' };
        java.lang.String str7 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray6);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.initials("HHI!", charArray6);
        java.lang.Class<?> wildcardClass9 = charArray6.getClass();
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '#', '4', '4', '4' });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Hi!" + "'", str7, "Hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H" + "'", str8, "H");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3561");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhhi!hhhi!HhHHHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!HHI!IHI!!HI!!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhi!hhhi!HhHHHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!HHI!IHI!!HI!!" + "'", str2, "Hhhi!hhhi!HhHHHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!HHI!IHI!!HI!!");
    }

    @Test
    public void test3562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3562");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhhi!Hhhi!Ihhi!!", (int) (byte) -1, 10, "hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhi!Hhhi!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!" + "'", str4, "hhhi!Hhhi!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!");
    }

    @Test
    public void test3563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3563");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhhi!hhhi!hhhi!Ihhi!!hhi!Ihhi!hhhi!Hhhi!hhhi!hhhi!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhi!hhhi!hhhi!Ihhi!!hhi!Ihhi!hhhi!Hhhi!hhhi!hhhi!" + "'", str2, "hhhi!hhhi!hhhi!Ihhi!!hhi!Ihhi!hhhi!Hhhi!hhhi!hhhi!");
    }

    @Test
    public void test3564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3564");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhHHi!iHHi!HHHI!IHHI!!hi!!", (int) 'a', (int) (short) 100, "hhhhI!IhhIhHHI!hHHI!iHHI!!!HI!!h");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end 97, length 26");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3565");
        char[] charArray9 = new char[] {};
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("Hi!", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray9);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("Hhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!!", charArray9);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray9);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("HHHI!IHHI!hhi!Ihi!!HI!!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hi!" + "'", str14, "Hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hi!" + "'", str15, "Hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HHHI!IHHI!hhi!Ihi!!HI!!" + "'", str18, "HHHI!IHHI!hhi!Ihi!!HI!!");
    }

    @Test
    public void test3566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3566");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hHHHHI!IHHHHHI!IHHI!HHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHHHI!IHHHHHI!IHHI!HHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!" + "'", str1, "hHHHHI!IHHHHHI!IHHI!HHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!");
    }

    @Test
    public void test3567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3567");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hHHHI!HHHIhHHI!HHHI!IHHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHHI!HHHIhHHI!HHHI!IHHI!!" + "'", str1, "HHHHI!HHHIhHHI!HHHI!IHHI!!");
    }

    @Test
    public void test3568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3568");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hhhi!hhhi!hhi!hhhi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHI!HHHI!HHI!HHHI!" + "'", str1, "HHHI!HHHI!HHI!HHHI!");
    }

    @Test
    public void test3569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3569");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("Hhhhi!hhhiHHhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test3570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3570");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!ihHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!iHhi!Ihi!!!Hhi!Ihi!!iHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!!Hhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!!Hhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!!Hhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!!Hhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!!Hhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test3571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3571");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("Hhhhi!ihhi!hhhhi!ihhi!hi!!hhhhhi!ihhi!hhhhi!ihhi!hi!!hhhhhi!ihhi!hhhhi!ihhi!hi!!hhhhhi!ihhi!hhhhi!ihhi!hi!!hihhhi!ihhi!hhhhi!ihhi!hi!!h!hhhi!ihhi!hhhhi!ihhi!hi!!hihhhi!ihhi!hhhhi!ihhi!hi!!hhhhhi!ihhi!hhhhi!ihhi!hi!!hhhhhi!ihhi!hhhhi!ihhi!hi!!hihhhi!ihhi!hhhhi!ihhi!hi!!h!hhhi!ihhi!hhhhi!ihhi!hi!!hhhhhi!ihhi!hhhhi!ihhi!hi!!hihhhi!ihhi!hhhhi!ihhi!hi!!h!hhhi!ihhi!hhhhi!ihhi!hi!!h!hhhi!ihhi!hhhhi!ihhi!hi!!hh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!ihhi!hhhhi!ihhi!hi!!hhhhhi!ihhi!hhhhi!ihhi!hi!!hhhhhi!ihhi!hhhhi!ihhi!hi!!hhhhhi!ihhi!hhhhi!ihhi!hi!!hihhhi!ihhi!hhhhi!ihhi!hi!!h!hhhi!ihhi!hhhhi!ihhi!hi!!hihhhi!ihhi!hhhhi!ihhi!hi!!hhhhhi!ihhi!hhhhi!ihhi!hi!!hhhhhi!ihhi!hhhhi!ihhi!hi!!hihhhi!ihhi!hhhhi!ihhi!hi!!h!hhhi!ihhi!hhhhi!ihhi!hi!!hhhhhi!ihhi!hhhhi!ihhi!hi!!hihhhi!ihhi!hhhhi!ihhi!hi!!h!hhhi!ihhi!hhhhi!ihhi!hi!!h!hhhi!ihhi!hhhhi!ihhi!hi!!hh" + "'", str1, "Hhhhi!ihhi!hhhhi!ihhi!hi!!hhhhhi!ihhi!hhhhi!ihhi!hi!!hhhhhi!ihhi!hhhhi!ihhi!hi!!hhhhhi!ihhi!hhhhi!ihhi!hi!!hihhhi!ihhi!hhhhi!ihhi!hi!!h!hhhi!ihhi!hhhhi!ihhi!hi!!hihhhi!ihhi!hhhhi!ihhi!hi!!hhhhhi!ihhi!hhhhi!ihhi!hi!!hhhhhi!ihhi!hhhhi!ihhi!hi!!hihhhi!ihhi!hhhhi!ihhi!hi!!h!hhhi!ihhi!hhhhi!ihhi!hi!!hhhhhi!ihhi!hhhhi!ihhi!hi!!hihhhi!ihhi!hhhhi!ihhi!hi!!h!hhhi!ihhi!hhhhi!ihhi!hi!!h!hhhi!ihhi!hhhhi!ihhi!hi!!hh");
    }

    @Test
    public void test3572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3572");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhhhi!hhhhHHI!HHHI!IHHI!!", 100, (int) (short) -1, "Hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!h");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end 100, length 26");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3573");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhhi!ihhi!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!", (int) (byte) -1, (int) (short) 10, "hhhhi!ihhi!hi!!h");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhi!ihhi!hhhhi!ihhi!hi!!h" + "'", str4, "hhhi!ihhi!hhhhi!ihhi!hi!!h");
    }

    @Test
    public void test3574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3574");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HHhhhi!ihhHHhHhHhHhHhHhHhHiHhH!HhHhHhHhHhHhHhHiHhH!HhHiHhHhHhHhHhHiHhH!HhH!", 0, "HHHi!iHHi!HhhhI!IhhI!HI!!h", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHhhhi!ihhHHhHhHhHhHhHhHhHiHhH!HhHhHhHhHhHhHhHiHhH!HhHiHhHhHhHhHhHiHhH!HhH!" + "'", str4, "HHhhhi!ihhHHhHhHhHhHhHhHhHiHhH!HhHhHhHhHhHhHhHiHhH!HhHiHhHhHhHhHhHiHhH!HhH!");
    }

    @Test
    public void test3575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3575");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!ihHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!iHhi!Ihi!!!Hhi!Ihi!!iHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!!Hhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!!Hhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!!Hhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!!Hhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!!Hhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!!" + "'", str1, "Hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!!");
    }

    @Test
    public void test3576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3576");
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
        java.lang.String str21 = org.apache.commons.lang.WordUtils.initials("HHHI!hHHI!iHHI!!", charArray11);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!HhhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!ihhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!!", charArray11);
        java.lang.Class<?> wildcardClass23 = charArray11.getClass();
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hhhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!HhhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!ihhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!!" + "'", str22, "hhhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!HhhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!ihhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!!");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3577");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHHI!HHHI!IHHI!!", 10, (int) (short) 100, "hHhHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!!hHI!iHI!!ihHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!!hHI!iHI!!hhHI!iHI!!ihHI!iHI!!!hHI!iHI!!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHI!HHHI!IHHI!!" + "'", str4, "hHHI!HHHI!IHHI!!");
    }

    @Test
    public void test3578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3578");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("HHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hIHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!h!HhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hhHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hIHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!h!HhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hiHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hIHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!h!HhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!h!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HihHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!H!hHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HHhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HihHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!H!hHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HIhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HihHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!H!hHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!H!" + "'", str1, "hhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HihHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!H!hHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HHhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HihHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!H!hHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HIhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HihHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!H!hHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!H!");
    }

    @Test
    public void test3579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3579");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhhhi!ihhi!hhi!ihi!!hi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test3580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3580");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.capitalize("HHHHHI!IHHI!!HHHHHI!IHHI!!HHHHHI!IHHHHHI!HHHIHHHI!HHHI!IHHI!!HI!!IHHHHI!IHHI!!!HHHHI!IHHI!!HHHHHHhhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhHhhi!ihhi!HHI!iHI!!hi!!HHHI!HHHIHHHI!HHHI!IHHI!!I!IHHI!!HHHHHI!IHHI!!HHHHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHI!IHHI!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhHhhi!ihhi!HHI!iHI!!hi!!!!HHHHI!IHHI!!IHHHHI!IHHHHHHI!HHHIHHHI!HHHI!IHHI!!I!!HHHHHI!IHHI!!HHHHHI!IHHI!!IHHHHIHHHHI!HHHIHHhhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhHhhi!ihhi!HHI!iHI!!hi!!HI!HHHI!IHHI!!!IHHI!!!HHHHI!IHHI!!!", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHHHHI!IHHI!!HHHHHI!IHHI!!HHHHHI!IHHHHHI!HHHIHHHI!HHHI!IHHI!!HI!!IHHHHI!IHHI!!!HHHHI!IHHI!!HHHHHHhhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhHhhi!ihhi!HHI!iHI!!hi!!HHHI!HHHIHHHI!HHHI!IHHI!!I!IHHI!!HHHHHI!IHHI!!HHHHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHI!IHHI!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhHhhi!ihhi!HHI!iHI!!hi!!!!HHHHI!IHHI!!IHHHHI!IHHHHHHI!HHHIHHHI!HHHI!IHHI!!I!!HHHHHI!IHHI!!HHHHHI!IHHI!!IHHHHIHHHHI!HHHIHHhhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhHhhi!ihhi!HHI!iHI!!hi!!HI!HHHI!IHHI!!!IHHI!!!HHHHI!IHHI!!!" + "'", str2, "HHHHHI!IHHI!!HHHHHI!IHHI!!HHHHHI!IHHHHHI!HHHIHHHI!HHHI!IHHI!!HI!!IHHHHI!IHHI!!!HHHHI!IHHI!!HHHHHHhhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhHhhi!ihhi!HHI!iHI!!hi!!HHHI!HHHIHHHI!HHHI!IHHI!!I!IHHI!!HHHHHI!IHHI!!HHHHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHI!IHHI!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhHhhi!ihhi!HHI!iHI!!hi!!!!HHHHI!IHHI!!IHHHHI!IHHHHHHI!HHHIHHHI!HHHI!IHHI!!I!!HHHHHI!IHHI!!HHHHHI!IHHI!!IHHHHIHHHHI!HHHIHHhhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhHhhi!ihhi!HHI!iHI!!hi!!HI!HHHI!IHHI!!!IHHI!!!HHHHI!IHHI!!!");
    }

    @Test
    public void test3581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3581");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!hhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!hhHHHI!HHHIhHHI!HHHI!IHHI!!ihHHHI!HHHIhHHI!HHHI!IHHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhi!ihhi!!!Hhhhi!hhhiHhhi!hhhi!ihhi!!HHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhi!ihhi!!!Hhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!HHhhhi!hhhiHhhi!hhhi!ihhi!!IHhhhi!hhhiHhhi!hhhi!ihhi!!!" + "'", str1, "HHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhi!ihhi!!!Hhhhi!hhhiHhhi!hhhi!ihhi!!HHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhi!ihhi!!!Hhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!HHhhhi!hhhiHhhi!hhhi!ihhi!!IHhhhi!hhhiHhhi!hhhi!ihhi!!!");
    }

    @Test
    public void test3582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3582");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!", (int) (short) 0, "HHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhhHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!" + "'", str4, "hHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!");
    }

    @Test
    public void test3583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3583");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hHhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test3584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3584");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("HhHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhHHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!" + "'", str1, "hHhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhHHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!");
    }

    @Test
    public void test3585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3585");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!" + "'", str2, "Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!");
    }

    @Test
    public void test3586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3586");
        char[] charArray5 = new char[] {};
        java.lang.String str6 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray5);
        java.lang.String str7 = org.apache.commons.lang.WordUtils.initials("", charArray5);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.initials("hi!", charArray5);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray5);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("hHHI!hHHI!iHHI!!", charArray5);
        java.lang.Class<?> wildcardClass11 = charArray5.getClass();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Hi!" + "'", str9, "Hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hHHI!hHHI!iHHI!!" + "'", str10, "hHHI!hHHI!iHHI!!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3587");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!ihhi!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!ihhi!" + "'", str2, "hHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!ihhi!");
    }

    @Test
    public void test3588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3588");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("Hhhi!ihhi!hhh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHI!IHHI!HHH" + "'", str1, "hHHI!IHHI!HHH");
    }

    @Test
    public void test3589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3589");
        char[] charArray9 = new char[] {};
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("h", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("hHH", charArray9);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!ihhi!hhhi!ihhi!hi!!", charArray9);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!!", charArray9);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!h!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hi!" + "'", str12, "Hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hHH" + "'", str15, "hHH");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hhhi!ihhi!hhhi!ihhi!hi!!" + "'", str16, "Hhhi!ihhi!hhhi!ihhi!hi!!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HHHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!!" + "'", str17, "HHHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hhhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!h!" + "'", str18, "Hhhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!h!");
    }

    @Test
    public void test3590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3590");
        char[] charArray6 = new char[] {};
        java.lang.String str7 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray6);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.initials("", charArray6);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray6);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray6);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray6);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("Hhhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhhhhi!hhhihhhi!hhhi!ihhi!!hi!!ihhhhi!ihhi!!!hhhhi!ihhi!!hhhhhhhhhhhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhihhi!hhi!hhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hhhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhhhhi!hhhihhhi!hhhi!ihhi!!hi!!ihhhhi!ihhi!!!hhhhi!ihhi!!hhhhhhhhhhhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhihhi!hhi!hhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!" + "'", str12, "Hhhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhhhhi!hhhihhhi!hhhi!ihhi!!hi!!ihhhhi!ihhi!!!hhhhi!ihhi!!hhhhhhhhhhhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhihhi!hhi!hhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
    }

    @Test
    public void test3591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3591");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHHhHHhHHiHH!HHhHHhHHhHHiHH!HHhHHhHHhHHiHH!HHIHHhHHhHHiHH!HH!HHhHHhHHiHH!HHIHHhHHhHHiHH!HHhHHhHHhHHiHH!HHhHHhHHhHHiHH!HHIHHhHHhHHiHH!HH!HHhHHhHHiHH!HHHHHhHHhHHiHH!HHIHHhHHhHHiHH!HH!HHhHHhHHiHH!HH!", (int) 'a', (int) ' ', "hHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!!Hhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!!Hhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!!Hhi!Ihi!!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHhHHhHHiHH!HHhHHhHHhHHiHH!HHhHHhHHhHHiHH!HHIHHhHHhHHiHH!HH!HHhHHhHHiHH!HHIHHhHHhHHiHH!HHhHHhHHhhHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!!Hhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!!Hhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!!Hhi!Ihi!!!" + "'", str4, "hHHhHHhHHiHH!HHhHHhHHhHHiHH!HHhHHhHHhHHiHH!HHIHHhHHhHHiHH!HH!HHhHHhHHiHH!HHIHHhHHhHHiHH!HHhHHhHHhhHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!!Hhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!!Hhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!!Hhi!Ihi!!!");
    }

    @Test
    public void test3592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3592");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhhi!Hhhi!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!", (-1), 0, "HHi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHi!" + "'", str4, "HHi!");
    }

    @Test
    public void test3593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3593");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhi!hhhi!hhhi!ihi!!hhhi!ihi!!hhHhHHi!iHHi!HHHI!IHHI!!hi!!hi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhiHhHHi!iHHi!HHHI!IHHI!!hi!!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!iHhHHi!iHHi!HHHI!IHHI!!hi!!hi!!!hhi!ihi!!hhhi!ihi!!ihhi!ihiHhHHi!iHHi!HHHI!IHHI!!hi!!!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!hhhi!hhhi!ihi!!hhhi!ihi!!hhhhhhi!ihhi!hhhi!ihhi!!hi!!hi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhihhhhi!ihhi!hhhi!ihhi!!hi!!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihhhhi!ihhi!hhhi!ihhi!!hi!!hi!!!hhi!ihi!!hhhi!ihi!!ihhi!ihihhhhi!ihhi!hhhi!ihhi!!hi!!!!!hhi!ihi!!!" + "'", str1, "Hhhi!hhhi!hhhi!ihi!!hhhi!ihi!!hhhhhhi!ihhi!hhhi!ihhi!!hi!!hi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhihhhhi!ihhi!hhhi!ihhi!!hi!!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihhhhi!ihhi!hhhi!ihhi!!hi!!hi!!!hhi!ihi!!hhhi!ihi!!ihhi!ihihhhhi!ihhi!hhhi!ihhi!!hi!!!!!hhi!ihi!!!");
    }

    @Test
    public void test3594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3594");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHhhI!IhhI!hHHHi!iHHi!hi!!HHHhhI!IhhI!hHHHi!iHHi!hi!!HHHhhI!IhhI!hHHHi!iHHi!hi!!HHHhhI!IhhI!hHHHi!iHHi!hi!!HiHhhI!IhhI!hHHHi!iHHi!hi!!H!HhhI!IhhI!hHHHi!iHHi!hi!!HiHhhI!IhhI!hHHHi!iHHi!hi!!HHHhhI!IhhI!hHHHi!iHHi!hi!!HHHhhI!IhhI!hHHHi!iHHi!hi!!HiHhhI!IhhI!hHHHi!iHHi!hi!!H!HhhI!IhhI!hHHHi!iHHi!hi!!HhHhhI!IhhI!hHHHi!iHHi!hi!!HiHhhI!IhhI!hHHHi!iHHi!hi!!H!HhhI!IhhI!hHHHi!iHHi!hi!!H!HhhI!IhhI!hHHHi!iHHi!hi!!HH", 0, (int) (short) 1, "hhI!HhI!HhI!HhI!ihI!!hI!ihI!HhI!HhI!ihI!!hI!hhI!ihI!!hI!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HhhI!HhI!HhI!HhI!ihI!!hI!ihI!HhI!HhI!ihI!!hI!hhI!ihI!!hI!!" + "'", str4, "HhhI!HhI!HhI!HhI!ihI!!hI!ihI!HhI!HhI!ihI!!hI!hhI!ihI!!hI!!");
    }

    @Test
    public void test3595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3595");
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
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalize("hhhi!hhhi!hhhi!Ihhi!!hhi!Ihhi!hhhi!hhhi!Ihhi!!hhi!Hhhi!Ihhi!!hhi!!", charArray12);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.initials("Hhhhi!ihhihhhhi!hhhi!ihhi!!", charArray12);
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hhhi!hhhi!hhhi!Ihhi!!hhi!Ihhi!hhhi!hhhi!Ihhi!!hhi!Hhhi!Ihhi!!hhi!!" + "'", str23, "hhhi!hhhi!hhhi!Ihhi!!hhi!Ihhi!hhhi!hhhi!Ihhi!!hhi!Hhhi!Ihhi!!hhi!!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test3596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3596");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("HHhhI!IhhI!hHHHi!iHHi!hi!!HHHhhI!IhhI!hHHHi!iHHi!hi!!HHHhhI!IhhI!hHHHi!iHHi!hi!!HHHhhI!IhhI!hHHHi!iHHi!hi!!HiHhhI!IhhI!hHHHi!iHHi!hi!!H!HhhI!IhhI!hHHHi!iHHi!hi!!HiHhhI!IhhI!hHHHi!iHHi!hi!!HHHhhI!IhhI!hHHHi!iHHi!hi!!HHHhhI!IhhI!hHHHi!iHHi!hi!!HiHhhI!IhhI!hHHHi!iHHi!hi!!H!HhhI!IhhI!hHHHi!iHHi!hi!!HhHhhI!IhhI!hHHHi!iHHi!hi!!HiHhhI!IhhI!hHHHi!iHHi!hi!!H!HhhI!IhhI!hHHHi!iHHi!hi!!H!HhhI!IhhI!hHHHi!iHHi!hi!!HH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!ihhi!hhhhi!ihhi!hi!!hhhhhi!ihhi!hhhhi!ihhi!hi!!hhhhhi!ihhi!hhhhi!ihhi!hi!!hhhhhi!ihhi!hhhhi!ihhi!hi!!hihhhi!ihhi!hhhhi!ihhi!hi!!h!hhhi!ihhi!hhhhi!ihhi!hi!!hihhhi!ihhi!hhhhi!ihhi!hi!!hhhhhi!ihhi!hhhhi!ihhi!hi!!hhhhhi!ihhi!hhhhi!ihhi!hi!!hihhhi!ihhi!hhhhi!ihhi!hi!!h!hhhi!ihhi!hhhhi!ihhi!hi!!hhhhhi!ihhi!hhhhi!ihhi!hi!!hihhhi!ihhi!hhhhi!ihhi!hi!!h!hhhi!ihhi!hhhhi!ihhi!hi!!h!hhhi!ihhi!hhhhi!ihhi!hi!!hh" + "'", str1, "Hhhhi!ihhi!hhhhi!ihhi!hi!!hhhhhi!ihhi!hhhhi!ihhi!hi!!hhhhhi!ihhi!hhhhi!ihhi!hi!!hhhhhi!ihhi!hhhhi!ihhi!hi!!hihhhi!ihhi!hhhhi!ihhi!hi!!h!hhhi!ihhi!hhhhi!ihhi!hi!!hihhhi!ihhi!hhhhi!ihhi!hi!!hhhhhi!ihhi!hhhhi!ihhi!hi!!hhhhhi!ihhi!hhhhi!ihhi!hi!!hihhhi!ihhi!hhhhi!ihhi!hi!!h!hhhi!ihhi!hhhhi!ihhi!hi!!hhhhhi!ihhi!hhhhi!ihhi!hi!!hihhhi!ihhi!hhhhi!ihhi!hi!!h!hhhi!ihhi!hhhhi!ihhi!hi!!h!hhhi!ihhi!hhhhi!ihhi!hi!!hh");
    }

    @Test
    public void test3597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3597");
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
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalize("Hhhhhi!ihhi!hi!!h", charArray12);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhi!hhhi!hhhi!", charArray12);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.uncapitalize("hhHhhi!hHhhi!hHhhi!iHhhi!!Hhhi!iHhhi!hHhhi!hHhhi!iHhhi!!Hhhi!hHhhi!hHhhi!hHhhi!iHhhi!!Hhhi!iHhhi!hHhhi!hHhhi!iHhhi!!Hhhi!!Hhhi!hHhhi!iHhhi!!Hhhi!!", charArray12);
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Hhhhhi!ihhi!hi!!h" + "'", str22, "Hhhhhi!ihhi!hi!!h");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Hhhhi!hhhi!hhhi!" + "'", str23, "Hhhhi!hhhi!hhhi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hhHhhi!hHhhi!hHhhi!iHhhi!!Hhhi!iHhhi!hHhhi!hHhhi!iHhhi!!Hhhi!hHhhi!hHhhi!hHhhi!iHhhi!!Hhhi!iHhhi!hHhhi!hHhhi!iHhhi!!Hhhi!!Hhhi!hHhhi!iHhhi!!Hhhi!!" + "'", str24, "hhHhhi!hHhhi!hHhhi!iHhhi!!Hhhi!iHhhi!hHhhi!hHhhi!iHhhi!!Hhhi!hHhhi!hHhhi!hHhhi!iHhhi!!Hhhi!iHhhi!hHhhi!hHhhi!iHhhi!!Hhhi!!Hhhi!hHhhi!iHhhi!!Hhhi!!");
    }

    @Test
    public void test3598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3598");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!ihHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!!", 1, (int) (short) 100, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHH" + "'", str4, "hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHH");
    }

    @Test
    public void test3599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3599");
        char[] charArray6 = new char[] {};
        java.lang.String str7 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray6);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.initials("", charArray6);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray6);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray6);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("h", charArray6);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("hhhi!hhhi!HhHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!!hHI!iHI!!ihHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!hHhhI!IhhI!!", charArray6);
        java.lang.Class<?> wildcardClass13 = charArray6.getClass();
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Hi!" + "'", str9, "Hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3600");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHHHI!IHHI!!", 0, (int) (short) 10, "hhhi!hhhi!ihhi!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHHHI!IHHIhhhi!hhhi!ihhi!!" + "'", str4, "HHHHI!IHHIhhhi!hhhi!ihhi!!");
    }

    @Test
    public void test3601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3601");
        char[] charArray7 = new char[] {};
        java.lang.String str8 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("hi!", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("hHI!", charArray7);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("HHHHi!iHHi!hi!!", charArray7);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HI!" + "'", str11, "HI!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hHI!" + "'", str12, "hHI!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HHHHi!iHHi!hi!!" + "'", str13, "HHHHi!iHHi!hi!!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!" + "'", str14, "hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!");
    }

    @Test
    public void test3602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3602");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("HHHHI!IHHIhHi!!!HHHHI!IHhHi!HI!!HHHHI!hHi!IHHI!!HHHHhHi!I!IHHI!!IHhHi!HHI!IHHI!!hHi!!HHHI!IHHIhHi!!!IHHHI!IHhHi!HI!!HHHHI!hHi!IHHI!!HhHHhHi!Hi!iHHi!!HhHi!HHHi!iHHi!hHi!!HHHHi!iHHhHi!i!!HHHHi!ihHi!HHi!!IHHHihHi!!iHHi!!!HHhHi!Hi!iHHi!!IhHi!HHHi!iHHi!hHi!!HHHHi!iHHhHi!i!!HHHHi!ihHi!HHi!!IHHHihHi!!iHHi!!!HHhHi!Hi!iHHi!!HhHi!HHHi!iHHi!hHi!!IHHHi!iHHhHi!i!!!HHHi!ihHi!HHi!!!HHHIhHi!!IHHI!!IHHhHi!HI!IHHI!!!hHi!HHHI!IHHI!hHi!!HHHHI!IHHhHi!I!!IHHHI!IhHi!HHI!!!HHHIhHi!!IHHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhhi!ihhiHhI!!!hhhhi!ihHhI!hi!!hhhhi!HhI!ihhi!!hhhhHhI!i!ihhi!!ihHhI!hhi!ihhi!!HhI!!hhhi!ihhiHhI!!!ihhhi!ihHhI!hi!!hhhhi!HhI!ihhi!!hHhhHhI!hI!IhhI!!hHhI!hhhI!IhhI!HhI!!hhhhI!IhhHhI!I!!hhhhI!IHhI!hhI!!ihhhIHhI!!IhhI!!!hhHhI!hI!IhhI!!iHhI!hhhI!IhhI!HhI!!hhhhI!IhhHhI!I!!hhhhI!IHhI!hhI!!ihhhIHhI!!IhhI!!!hhHhI!hI!IhhI!!hHhI!hhhI!IhhI!HhI!!ihhhI!IhhHhI!I!!!hhhI!IHhI!hhI!!!hhhiHhI!!ihhi!!ihhHhI!hi!ihhi!!!HhI!hhhi!ihhi!HhI!!hhhhi!ihhHhI!i!!ihhhi!iHhI!hhi!!!hhhiHhI!!ihhi!!!" + "'", str1, "hhhhi!ihhiHhI!!!hhhhi!ihHhI!hi!!hhhhi!HhI!ihhi!!hhhhHhI!i!ihhi!!ihHhI!hhi!ihhi!!HhI!!hhhi!ihhiHhI!!!ihhhi!ihHhI!hi!!hhhhi!HhI!ihhi!!hHhhHhI!hI!IhhI!!hHhI!hhhI!IhhI!HhI!!hhhhI!IhhHhI!I!!hhhhI!IHhI!hhI!!ihhhIHhI!!IhhI!!!hhHhI!hI!IhhI!!iHhI!hhhI!IhhI!HhI!!hhhhI!IhhHhI!I!!hhhhI!IHhI!hhI!!ihhhIHhI!!IhhI!!!hhHhI!hI!IhhI!!hHhI!hhhI!IhhI!HhI!!ihhhI!IhhHhI!I!!!hhhI!IHhI!hhI!!!hhhiHhI!!ihhi!!ihhHhI!hi!ihhi!!!HhI!hhhi!ihhi!HhI!!hhhhi!ihhHhI!i!!ihhhi!iHhI!hhi!!!hhhiHhI!!ihhi!!!");
    }

    @Test
    public void test3603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3603");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!ihhi!hhhi!ihhi!hi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhi!ihhi!hhhi!ihhi!hi!!" + "'", str1, "hhhi!ihhi!hhhi!ihhi!hi!!");
    }

    @Test
    public void test3604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3604");
        char[] charArray6 = new char[] {};
        java.lang.String str7 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray6);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.initials("", charArray6);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("H", charArray6);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("hh", charArray6);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("hhhI!IhhI!Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!", charArray6);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hh" + "'", str10, "hh");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hhhI!IhhI!Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!" + "'", str11, "hhhI!IhhI!Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test3605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3605");
        char[] charArray7 = new char[] { '#', '4', '4', '4' };
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("HHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!hHIHI!!HI!HHI!IHI!!HI!!", charArray7);
        java.lang.Class<?> wildcardClass11 = charArray7.getClass();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '#', '4', '4', '4' });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hi!" + "'", str8, "Hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Hi!" + "'", str9, "Hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!hHIHI!!HI!HHI!IHI!!HI!!" + "'", str10, "HHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!hHIHI!!HI!HHI!IHI!!HI!!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3606");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HHHI!IHHI!HHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHHHhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHHI!IHHI!HHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHHHhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!" + "'", str2, "HHHI!IHHI!HHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHHHhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
    }

    @Test
    public void test3607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3607");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHHI!HHHI!HHI!HHHI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test3608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3608");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHIhHhhI!IhhI!!HHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!iHhhI!IhhI!!!HhhI!IhhI!!iHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!iHhhI!IhhI!!!HhhI!IhhI!!!HhhI!IhhI!!HHhhI!IhhI!!HHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!iHhhI!IhhI!!!HhhI!IhhI!!iHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!iHhhI!IhhI!!!HhhI!IhhI!!!HhhI!IhhI!!HHhhI!IhhI!!HHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!iHhhI!IhhI!!!HhhI!IhhI!!iHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!iHhhI!IhhI!!!HhhI!IhhI!!!HhhI!IhhI!!IHhhI!IhhI!!HHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!iHhhI!IhhI!!!HhhI!IhhI!!iHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!iHhhI!IhhI!!!HhhI!IhhI!!!HhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!HHhhI!IhhI!!IHhhI!IhhI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test3609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3609");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hhhi!hhhi!HHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!hHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!hhhi!Hhhi!hhHI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHI!HHHI!hhhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!HhhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!HHHI!hHHI!HHhi!" + "'", str1, "HHHI!HHHI!hhhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!HhhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!HHHI!hHHI!HHhi!");
    }

    @Test
    public void test3610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3610");
        char[] charArray7 = new char[] {};
        java.lang.String str8 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray7);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("hh", charArray7);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("hHHHi!iHHi!hi!!H", charArray7);
        java.lang.Class<?> wildcardClass15 = charArray7.getClass();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hh" + "'", str13, "hh");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hHHHi!iHHi!hi!!H" + "'", str14, "hHHHi!iHHi!hi!!H");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3611");
        char[] charArray8 = new char[] { '#', '4', '4', '4' };
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!ihhi!hi!!", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("hhhi!ihhi!!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!", charArray8);
        java.lang.Class<?> wildcardClass13 = charArray8.getClass();
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '#', '4', '4', '4' });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Hi!" + "'", str9, "Hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hhhi!ihhi!hi!!" + "'", str10, "Hhhi!ihhi!hi!!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "h" + "'", str11, "h");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hhhi!" + "'", str12, "hhhi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3612");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!" + "'", str1, "hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!");
    }

    @Test
    public void test3613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3613");
        char[] charArray9 = new char[] {};
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("HH", charArray9);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray9);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("HHI!iHI!!", charArray9);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhi!hhhiHhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!H", charArray9);
        java.lang.Class<?> wildcardClass19 = charArray9.getClass();
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HH" + "'", str15, "HH");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HHI!iHI!!" + "'", str17, "HHI!iHI!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hhhhi!hhhiHhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!H" + "'", str18, "Hhhhi!hhhiHhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!H");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3614");
        char[] charArray11 = new char[] { '#', '4', '4', '4' };
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("H", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("hhhi!ihhi!!", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("Hhhhi!ihhi!hi!!hhhhi!ihhi!hi!!hhhhi!ihhi!hi!!ihhhi!ihhi!hi!!!hhhi!ihhi!hi!!ihhhi!ihhi!hi!!hhhhi!ihhi!hi!!hhhhi!ihhi!hi!!ihhhi!ihhi!hi!!!hhhi!ihhi!hi!!hhhhi!ihhi!hi!!hhhhi!ihhi!hi!!hhhhi!ihhi!hi!!hhhhi!ihhi!hi!!ihhhi!ihhi!hi!!!hhhi!ihhi!hi!!ihhhi!ihhi!hi!!hhhhi!ihhi!hi!!hhhhi!ihhi!hi!!ihhhi!ihhi!hi!!!hhhi!ihhi!hi!!hhhhi!ihhi!hi!!ihhhi!ihhi!hi!!!hhhi!ihhi!hi!!!hhhi!ihhi!hi!!h", charArray11);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray11);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("hhhhhhhhhiHhhhi!hhhihhhhi!hhhihhhi!ihhi!hi!!!ihhi!!", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '#', '4', '4', '4' });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hi!" + "'", str12, "Hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hi!" + "'", str13, "Hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "h" + "'", str14, "h");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hhhi!ihhi!!" + "'", str15, "hhhi!ihhi!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HhhhhhhhhiHhhhi!hhhihhhhi!hhhihhhi!ihhi!hi!!!ihhi!!" + "'", str18, "HhhhhhhhhiHhhhi!hhhihhhhi!hhhihhhi!ihhi!hi!!!ihhi!!");
    }

    @Test
    public void test3615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3615");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHHHH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhhh" + "'", str1, "hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhhh");
    }

    @Test
    public void test3616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3616");
        char[] charArray9 = new char[] {};
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("hi!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("HI!", charArray9);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("hH", charArray9);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray9);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("HHh", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HI!" + "'", str13, "HI!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HI!" + "'", str15, "HI!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hH" + "'", str16, "hH");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HHh" + "'", str18, "HHh");
    }

    @Test
    public void test3617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3617");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("Hhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHI!IHHI!HHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!" + "'", str1, "hHHI!IHHI!HHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!");
    }

    @Test
    public void test3618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3618");
        char[] charArray10 = new char[] { '#', ' ', '4' };
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!hhhi!hhhi!", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("hhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("hHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!HHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!hHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!hHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!hHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!iHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!!HhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!iHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!hHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!hHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!iHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!!HhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!hHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!iHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!!HhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!!HhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!h", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("hHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!IHhhi!ihhi!HHI!iHI!!hi!!!Hhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!IHhhi!ihhi!HHI!iHI!!hi!!!Hhhi!ihhi!HHI!iHI!!hi!!IHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!IHhhi!ihhi!HHI!iHI!!hi!!!Hhhi!ihhi!HHI!iHI!!hi!!!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '#', ' ', '4' });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hi!" + "'", str11, "Hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hhhi!hhhi!hhhi!" + "'", str14, "hhhi!hhhi!hhhi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!" + "'", str15, "HhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "h" + "'", str16, "h");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!IHhhi!ihhi!HHI!iHI!!hi!!!Hhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!IHhhi!ihhi!HHI!iHI!!hi!!!Hhhi!ihhi!HHI!iHI!!hi!!IHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!IHhhi!ihhi!HHI!iHI!!hi!!!Hhhi!ihhi!HHI!iHI!!hi!!!" + "'", str17, "hHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!IHhhi!ihhi!HHI!iHI!!hi!!!Hhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!IHhhi!ihhi!HHI!iHI!!hi!!!Hhhi!ihhi!HHI!iHI!!hi!!IHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!IHhhi!ihhi!HHI!iHI!!hi!!!Hhhi!ihhi!HHI!iHI!!hi!!!");
    }

    @Test
    public void test3619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3619");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hHHHI!IHHI!HI!!HHHHI!IHHI!HI!!HHHHI!IHHI!HI!!IHHHI!IHHI!HI!!!HHHI!IHHI!HI!!IHHHI!IHHI!HI!!HHHHI!IHHI!HI!!HHHHI!IHHI!HI!!IHHHI!IHHI!HI!!!HHHI!IHHI!HI!!HHHHI!IHHI!HI!!HHHHI!IHHI!HI!!HHHHI!IHHI!HI!!HHHHI!IHHI!HI!!IHHHI!IHHI!HI!!!HHHI!IHHI!HI!!IHHHI!IHHI!HI!!HHHHI!IHHI!HI!!HHHHI!IHHI!HI!!IHHHI!IHHI!HI!!!HHHI!IHHI!HI!!HHHHI!IHHI!HI!!IHHHI!IHHI!HI!!!HHHI!IHHI!HI!!!HHHI!IHHI!HI!!H", (int) '4', "HHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhhHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHHI!IHHI!HI!!HHHHI!IHHI!HI!!HHHHI!IHHI!HI!!IHHHI!IHHI!HI!!!HHHI!IHHI!HI!!IHHHI!IHHI!HI!!HHHHI!IHHI!HI!!HHHHI!IHHI!HI!!IHHHI!IHHI!HI!!!HHHI!IHHI!HI!!HHHHI!IHHI!HI!!HHHHI!IHHI!HI!!HHHHI!IHHI!HI!!HHHHI!IHHI!HI!!IHHHI!IHHI!HI!!!HHHI!IHHI!HI!!IHHHI!IHHI!HI!!HHHHI!IHHI!HI!!HHHHI!IHHI!HI!!IHHHI!IHHI!HI!!!HHHI!IHHI!HI!!HHHHI!IHHI!HI!!IHHHI!IHHI!HI!!!HHHI!IHHI!HI!!!HHHI!IHHI!HI!!H" + "'", str4, "hHHHI!IHHI!HI!!HHHHI!IHHI!HI!!HHHHI!IHHI!HI!!IHHHI!IHHI!HI!!!HHHI!IHHI!HI!!IHHHI!IHHI!HI!!HHHHI!IHHI!HI!!HHHHI!IHHI!HI!!IHHHI!IHHI!HI!!!HHHI!IHHI!HI!!HHHHI!IHHI!HI!!HHHHI!IHHI!HI!!HHHHI!IHHI!HI!!HHHHI!IHHI!HI!!IHHHI!IHHI!HI!!!HHHI!IHHI!HI!!IHHHI!IHHI!HI!!HHHHI!IHHI!HI!!HHHHI!IHHI!HI!!IHHHI!IHHI!HI!!!HHHI!IHHI!HI!!HHHHI!IHHI!HI!!IHHHI!IHHI!HI!!!HHHI!IHHI!HI!!!HHHI!IHHI!HI!!H");
    }

    @Test
    public void test3620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3620");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hhi!hhi!hhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhhhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhhi!hhhi!hhi!hhhi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhi!hhi!hhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhhhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhhi!hhhi!hhi!hhhi!" + "'", str1, "Hhi!hhi!hhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhhhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhhi!hhhi!hhi!hhhi!");
    }

    @Test
    public void test3621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3621");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHHi!iHHi!HhhhI!IhhI!HI!!h", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHHi!iHHi!HhhhI!IhhI!HI!!h" + "'", str2, "hHHi!iHHi!HhhhI!IhhI!HI!!h");
    }

    @Test
    public void test3622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3622");
        char[] charArray5 = new char[] {};
        java.lang.String str6 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray5);
        java.lang.String str7 = org.apache.commons.lang.WordUtils.initials("h", charArray5);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhi!hhhi!hhhi!", charArray5);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("hHHI!hHHI!iHHI!!", charArray5);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("hHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!!", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hhhi!hhhi!hhhi!" + "'", str8, "hhhi!hhhi!hhhi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hHHI!hHHI!iHHI!!" + "'", str9, "hHHI!hHHI!iHHI!!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!!" + "'", str10, "hHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!!");
    }

    @Test
    public void test3623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3623");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHHI!IHHI!hhi!Ihi!!HI!!", 1, (int) '4', "HHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHHI!IHHI!hhi!Ihi!!HI!!" + "'", str4, "HHHI!IHHI!hhi!Ihi!!HI!!");
    }

    @Test
    public void test3624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3624");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("Hhhhhi!hhhHhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!", (int) (byte) 0, "HhhhI!IhhI!HI!!h", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhhhi!hhhHhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!" + "'", str4, "Hhhhhi!hhhHhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!");
    }

    @Test
    public void test3625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3625");
        char[] charArray9 = new char[] { '4', '4' };
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("HHi!", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("HH", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("hhI!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("hhhi!ihhi!hhh", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hHHHI!IHHI!!", charArray9);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hi!" + "'", str10, "Hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hhi!" + "'", str11, "Hhi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hH" + "'", str12, "hH");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "h" + "'", str13, "h");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "h" + "'", str14, "h");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hhhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hHHHI!IHHI!!" + "'", str15, "hhhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hHHHI!IHHI!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hhhi!" + "'", str16, "hhhi!");
    }

    @Test
    public void test3626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3626");
        char[] charArray9 = new char[] {};
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("hi!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("HH", charArray9);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray9);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("HHHHi!iHHi!hi!!", charArray9);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("HhhI!IhhI!hhHHi!iHHi!HHHI!IHHI!!hi!!", charArray9);
        java.lang.Class<?> wildcardClass19 = charArray9.getClass();
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HI!" + "'", str13, "HI!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HH" + "'", str15, "HH");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HhhI!IhhI!hhHHi!iHHi!HHHI!IHHI!!hi!!" + "'", str18, "HhhI!IhhI!hhHHi!iHHi!HHHI!IHHI!!hi!!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3627");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("Hhhi!hhhi!hhhi!ihi!!hhhi!ihi!!hhhhhhi!ihhi!hhhi!ihhi!!hi!!hi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhihhhhi!ihhi!hhhi!ihhi!!hi!!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihhhhi!ihhi!hhhi!ihhi!!hi!!hi!!!hhi!ihi!!hhhi!ihi!!ihhi!ihihhhhi!ihhi!hhhi!ihhi!!hi!!!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHI!HHHI!HHHI!IHI!!HHHI!IHI!!HHHHHHI!IHHI!HHHI!IHHI!!HI!!HI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHIHHHHI!IHHI!HHHI!IHHI!!HI!!!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHHHHI!IHHI!HHHI!IHHI!!HI!!HI!!!HHI!IHI!!HHHI!IHI!!IHHI!IHIHHHHI!IHHI!HHHI!IHHI!!HI!!!!!HHI!IHI!!!" + "'", str1, "hHHI!HHHI!HHHI!IHI!!HHHI!IHI!!HHHHHHI!IHHI!HHHI!IHHI!!HI!!HI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHIHHHHI!IHHI!HHHI!IHHI!!HI!!!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHHHHI!IHHI!HHHI!IHHI!!HI!!HI!!!HHI!IHI!!HHHI!IHI!!IHHI!IHIHHHHI!IHHI!HHHI!IHHI!!HI!!!!!HHI!IHI!!!");
    }

    @Test
    public void test3628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3628");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("Hhhhi!hhhihhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhihhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhhhhi!ihhi!hi!!h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test3629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3629");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hHhi!Ihi!!hHhi!Ihi!!hHhi!Ihi!!hHhi!Ihi!!iHhi!Ihi!!!Hhi!Ihi!!hHhi!Ihi!!hHhi!Ihi!!hHhi!Ihi!!iHhi!Ihi!!!Hhi!Ihi!!iHhi!Ihi!!hHhi!Ihi!!hHhi!Ihi!!iHhi!Ihi!!!Hhi!Ihi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!" + "'", str1, "Hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
    }

    @Test
    public void test3630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3630");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hHhhi!ihhi!hi!!HHhhi!ihhi!hi!!HHhhi!ihhi!hi!!IHhhi!ihhi!hi!!!Hhhi!ihhi!hi!!IHhhi!ihhi!hi!!HHhhi!ihhiHHHI!hHHI!hHi!HHhi!!hi!!HHhhi!ihhi!hi!!IHhhi!ihhi!hi!!!Hhhi!ihhi!hi!!HHhhi!ihhi!hi!!HHhhi!ihhi!hi!!HHhhi!ihhi!hi!!HHhhiHHHI!hHHI!hHi!HHhi!!ihhi!hi!!IHhhi!ihhi!hi!!!Hhhi!ihhi!hi!!IHhhi!ihhi!hi!!HHhhi!ihhi!hi!!HHhhi!ihhi!hi!!IHhhi!ihhi!hi!!HHHI!hHHI!hHi!HHhi!!Hhhi!ihhi!hi!!HHhhi!ihhi!hi!!IHhhi!ihhi!hi!!!Hhhi!ihhi!hi!!!Hhhi!ihhi!hi!!H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HhHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!ihHHI!IHHI!HI!!hhHHI!IHHIhhhi!Hhhi!HhI!hhHI!!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHIhhhi!Hhhi!HhI!hhHI!!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!ihHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!hhhi!Hhhi!HhI!hhHI!!hHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!!hHHI!IHHI!HI!!h" + "'", str1, "HhHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!ihHHI!IHHI!HI!!hhHHI!IHHIhhhi!Hhhi!HhI!hhHI!!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHIhhhi!Hhhi!HhI!hhHI!!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!ihHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!hhhi!Hhhi!HhI!hhHI!!hHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!!hHHI!IHHI!HI!!h");
    }

    @Test
    public void test3631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3631");
        char[] charArray9 = new char[] { '#', '4', '4', '4' };
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!ihhi!hi!!", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("Hhhhhi!ihhhhhi!ihhi!!i!hi!!h", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("HhHHI!IHHI!!HhHHI!IHHI!!hhHHI!IHHI!!hhHHI!IHHI!!IhHHI!IHHI!!!hHHI!IHHI!!IhHHI!IHHI!!hhHHI!IHHI!!hhHHI!IHHI!!IhHHI!IHHI!!!hHHI!IHHI!!hhHHI!IHHI!!hhHHI!IHHI!!hhHHI!IHHI!!ihHHI!IHHI!!!hHHI!IHHI!!ihHHI!IHHI!!hhHHI!IHHI!!hhHHI!IHHI!!ihHHI!IHHI!!!hHHI!IHHI!!!hHHI!IHHI!!HhHHI!IHHI!!IhHHI!IHHI!!!hHHI!IHHI!!!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhhi!ihhhhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!", charArray9);
        java.lang.Class<?> wildcardClass15 = charArray9.getClass();
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '#', '4', '4', '4' });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hi!" + "'", str10, "Hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hhhi!ihhi!hi!!" + "'", str11, "Hhhi!ihhi!hi!!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H" + "'", str12, "H");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HhHHI!IHHI!!HhHHI!IHHI!!hhHHI!IHHI!!hhHHI!IHHI!!IhHHI!IHHI!!!hHHI!IHHI!!IhHHI!IHHI!!hhHHI!IHHI!!hhHHI!IHHI!!IhHHI!IHHI!!!hHHI!IHHI!!hhHHI!IHHI!!hhHHI!IHHI!!hhHHI!IHHI!!ihHHI!IHHI!!!hHHI!IHHI!!ihHHI!IHHI!!hhHHI!IHHI!!hhHHI!IHHI!!ihHHI!IHHI!!!hHHI!IHHI!!!hHHI!IHHI!!HhHHI!IHHI!!IhHHI!IHHI!!!hHHI!IHHI!!!" + "'", str13, "HhHHI!IHHI!!HhHHI!IHHI!!hhHHI!IHHI!!hhHHI!IHHI!!IhHHI!IHHI!!!hHHI!IHHI!!IhHHI!IHHI!!hhHHI!IHHI!!hhHHI!IHHI!!IhHHI!IHHI!!!hHHI!IHHI!!hhHHI!IHHI!!hhHHI!IHHI!!hhHHI!IHHI!!ihHHI!IHHI!!!hHHI!IHHI!!ihHHI!IHHI!!hhHHI!IHHI!!hhHHI!IHHI!!ihHHI!IHHI!!!hHHI!IHHI!!!hHHI!IHHI!!HhHHI!IHHI!!IhHHI!IHHI!!!hHHI!IHHI!!!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hhhhhi!ihhhhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!" + "'", str14, "Hhhhhi!ihhhhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3632");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hHHHHHHHHIHHHHi!iHHi!hi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HhhhhhhhhihhhhI!IhhI!HI!!" + "'", str1, "HhhhhhhhhihhhhI!IhhI!HI!!");
    }

    @Test
    public void test3633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3633");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhHHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!iHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!!HHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!iHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!!HHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!iHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!iHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!!HHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhHHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!iHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!!HHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!iHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!!HHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!iHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!iHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!!HHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!!" + "'", str1, "HHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhHHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!iHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!!HHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!iHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!!HHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!iHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!iHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!!HHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!!");
    }

    @Test
    public void test3634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3634");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hHhhi!ihhihhhhhI!Ihhhhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!ihhihhhhhi!ihhhhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!" + "'", str1, "Hhhhi!ihhihhhhhi!ihhhhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!");
    }

    @Test
    public void test3635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3635");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhhhI!IhhIhHHI!hHHI!iHHI!!!HI!!h", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhhI!IhhIhHHI!hHHI!iHHI!!!HI!!h" + "'", str2, "hhhhI!IhhIhHHI!hHHI!iHHI!!!HI!!h");
    }

    @Test
    public void test3636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3636");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hhhhhi!hhhhhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test3637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3637");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHHI!IHHI!hhi!Ihi!!HI!!", (int) '4', 0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end 52, length 23");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3638");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("Hhhhi!hhhiHHhhi!!ihhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test3639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3639");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.uncapitalize("hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!!", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!!" + "'", str2, "hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!!");
    }

    @Test
    public void test3640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3640");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HIHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!H!HHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HIHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!H!HHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HIHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HIHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!H!HHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!H!", (int) (short) -1, (int) (byte) 10, "hHhhhI!IhhhhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHHHHI!IHHhHhhhI!IhhhhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!!" + "'", str4, "HHHHHI!IHHhHhhhI!IhhhhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!!");
    }

    @Test
    public void test3641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3641");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HHHI!IHHI!HHI!IHI!!HI!!", (int) ' ', "Hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhihhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhhhhi!ihhi!hi!!h", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHHI!IHHI!HHI!IHI!!HI!!" + "'", str4, "HHHI!IHHI!HHI!IHI!!HI!!");
    }

    @Test
    public void test3642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3642");
        char[] charArray13 = new char[] {};
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray13);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("", charArray13);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray13);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray13);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("", charArray13);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray13);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("H", charArray13);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.uncapitalize("hh", charArray13);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalizeFully("H", charArray13);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.uncapitalize("hHHI!hHHI!iHHI!!", charArray13);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.uncapitalize("HhhhI!IhhI!HI!!h", charArray13);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhi!hhhi!hhhi!", charArray13);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.uncapitalize("hhhhi!hhhiHHhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] {});
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hi!" + "'", str17, "Hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "h" + "'", str19, "h");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H" + "'", str20, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hh" + "'", str21, "hh");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "H" + "'", str22, "H");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hHHI!hHHI!iHHI!!" + "'", str23, "hHHI!hHHI!iHHI!!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "HhhhI!IhhI!HI!!h" + "'", str24, "HhhhI!IhhI!HI!!h");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Hhhhi!hhhi!hhhi!" + "'", str25, "Hhhhi!hhhi!hhhi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hhhhi!hhhiHHhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!" + "'", str26, "hhhhi!hhhiHHhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!");
    }

    @Test
    public void test3643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3643");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HhHHI!IHHI!!HhHHI!IHHI!!hhHHI!IHHI!!hhHHI!IHHI!!IhHHI!IHHI!!!hHHI!IHHI!!IhHHI!IHHI!!hhHHI!IHHI!!hhHHI!IHHI!!IhHHI!IHHI!!!hHHI!IHHI!!hhHHI!IHHI!!hhHHI!IHHI!!hhHHI!IHHI!!ihHHI!IHHI!!!hHHI!IHHI!!ihHHI!IHHI!!hhHHI!IHHI!!hhHHI!IHHI!!ihHHI!IHHI!!!hHHI!IHHI!!!hHHI!IHHI!!HhHHI!IHHI!!IhHHI!IHHI!!!hHHI!IHHI!!!", (int) '#', 0, "HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!hhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!hhHHHI!HHHIhHHI!HHHI!IHHI!!ihHHHI!HHHIhHHI!HHHI!IHHI!!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HhHHI!IHHI!!HhHHI!IHHI!!hhHHI!IHHI!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!hhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!hhHHHI!HHHIhHHI!HHHI!IHHI!!ihHHHI!HHHIhHHI!HHHI!IHHI!!!" + "'", str4, "HhHHI!IHHI!!HhHHI!IHHI!!hhHHI!IHHI!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!hhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!hhHHHI!HHHIhHHI!HHHI!IHHI!!ihHHHI!HHHIhHHI!HHHI!IHHI!!!");
    }

    @Test
    public void test3644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3644");
        char[] charArray11 = new char[] {};
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("", charArray11);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray11);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("Hi!", charArray11);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray11);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.initials("Hhhi!ihhi!hhhi!ihhi!!hi!!", charArray11);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray11);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.uncapitalize("hHHHI!IHHIhhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!IhhiHHHHi!iHHi!hi!!H", charArray11);
        java.lang.Class<?> wildcardClass23 = charArray11.getClass();
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] {});
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hi!" + "'", str15, "Hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hi!" + "'", str18, "Hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hHHHI!IHHIhhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!IhhiHHHHi!iHHi!hi!!H" + "'", str22, "hHHHI!IHHIhhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!IhhiHHHHi!iHHi!hi!!H");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3645");
        char[] charArray4 = new char[] {};
        java.lang.String str5 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray4);
        java.lang.String str6 = org.apache.commons.lang.WordUtils.capitalize("hhHI!", charArray4);
        java.lang.String str7 = org.apache.commons.lang.WordUtils.capitalizeFully("HhH", charArray4);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HI!" + "'", str5, "HI!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hhHI!" + "'", str6, "hhHI!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HhH" + "'", str7, "HhH");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!" + "'", str8, "Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
    }

    @Test
    public void test3646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3646");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("Hhhi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHI!" + "'", str1, "hHHI!");
    }

    @Test
    public void test3647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3647");
        char[] charArray9 = new char[] {};
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("hi!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("Hhhi!ihhi!!", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("HHHHI!HHHIHHHI!HHHI!IHHI!!", charArray9);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("hHHi!iHHi!hHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!", charArray9);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!ihi!!hi!hhi!ihi!!hi!!", charArray9);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!!", charArray9);
        java.lang.Class<?> wildcardClass19 = charArray9.getClass();
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!ihi!!hi!hhi!ihi!!hi!!" + "'", str17, "Hhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!ihi!!hi!hhi!ihi!!hi!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!!" + "'", str18, "HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3648");
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
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHi!iHHi!HhhhI!IhhI!HI!!h", charArray12);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.initials("hHhhi!hHhhi!hHhhi!iHhhi!!Hhhi!iHhhi!hHhhi!hHhhi!iHhhi!!Hhhi!hHhhi!hHhhi!hHhhi!iHhhi!!Hhhi!iHhhi!hHhhi!hHhhi!iHhhi!!Hhhi!!Hhhi!hHhhi!iHhhi!!Hhhi!!", charArray12);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.uncapitalize("hhHHI!HhHHI!HhHHI!IhHHI!!hHHI!IhHHI!HhHHI!HhHHI!IhHHI!!hHHI!HhHHI!HhHHI!HhHHI!IhHHI!!hHHI!IhHHI!HhHHHHHHI!HHHI!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!I!HhHHI!IhHHI!!hHHI!!hHHI!HhHHI!IhHHI!!hHHI!!", charArray12);
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "HHHi!iHHi!HhhhI!IhhI!HI!!h" + "'", str22, "HHHi!iHHi!HhhhI!IhhI!HI!!h");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hhHHI!HhHHI!HhHHI!IhHHI!!hHHI!IhHHI!HhHHI!HhHHI!IhHHI!!hHHI!HhHHI!HhHHI!HhHHI!IhHHI!!hHHI!IhHHI!HhHHHHHHI!HHHI!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!I!HhHHI!IhHHI!!hHHI!!hHHI!HhHHI!IhHHI!!hHHI!!" + "'", str24, "hhHHI!HhHHI!HhHHI!IhHHI!!hHHI!IhHHI!HhHHI!HhHHI!IhHHI!!hHHI!HhHHI!HhHHI!HhHHI!IhHHI!!hHHI!IhHHI!HhHHHHHHI!HHHI!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!I!HhHHI!IhHHI!!hHHI!!hHHI!HhHHI!IhHHI!!hHHI!!");
    }

    @Test
    public void test3649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3649");
        char[] charArray4 = new char[] {};
        java.lang.String str5 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray4);
        java.lang.String str6 = org.apache.commons.lang.WordUtils.uncapitalize("hI!", charArray4);
        java.lang.String str7 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray4);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.uncapitalize("hHHi!iHHi!hHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHHhhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhHHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!hHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!hhhi!Hhhi!hhHI!", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hI!" + "'", str6, "hI!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hHHi!iHHi!hHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHHhhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhHHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!hHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!hhhi!Hhhi!hhHI!" + "'", str8, "hHHi!iHHi!hHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHHhhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhHHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!hHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!hhhi!Hhhi!hhHI!");
    }

    @Test
    public void test3650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3650");
        char[] charArray8 = new char[] {};
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("Hh", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("HHHI!hHHI!iHHI!!", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhi!hhhiHhhi!hhhi!ihhi!!", charArray8);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("HHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!", charArray8);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhi!ihhihHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hh" + "'", str11, "Hh");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HHHI!hHHI!iHHI!!" + "'", str13, "HHHI!hHHI!iHHI!!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hhhhi!hhhiHhhi!hhhi!ihhi!!" + "'", str14, "Hhhhi!hhhiHhhi!hhhi!ihhi!!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!" + "'", str15, "HHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hhhhi!ihhihHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!!" + "'", str16, "Hhhhi!ihhihHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!!");
    }

    @Test
    public void test3651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3651");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhi!ihhi!!!Hhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhi!ihhi!!!Hhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhi!ihhi!!!Hhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhi!ihhi!!!Hhhhi!hhhiHhhi!hhhi!ihhi!!!Hhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhi!ihhi!!!Hhhhi!hhhiHhhi!hhhi!ihhi!!!", 100, (int) ' ', "Hhhhi!ihhihhhhi!hhhi!ihhi!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhHhhhi!ihhihhhhi!hhhi!ihhi!!" + "'", str4, "hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhHhhhi!ihhihhhhi!hhhi!ihhi!!");
    }

    @Test
    public void test3652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3652");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!hhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!hhHHHI!HHHIhHHI!HHHI!IHHI!!ihHHHI!HHHIhHHI!HHHI!IHHI!!!", (int) '4', "hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!hhi!ihi!!hi!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!hhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!hhHHHI!HHHIhHHI!HHHI!IHHI!!ihHHHI!HHHIhHHI!HHHI!IHHI!!!" + "'", str4, "HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!hhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!hhHHHI!HHHIhHHI!HHHI!IHHI!!ihHHHI!HHHIhHHI!HHHI!IHHI!!!");
    }

    @Test
    public void test3653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3653");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hHHI!IHHI!HHH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!ihhi!hhh" + "'", str1, "Hhhi!ihhi!hhh");
    }

    @Test
    public void test3654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3654");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhhhi!ihhihhhi!hhhi!ihhi!!!hi!!h", 0, 0, "Hhhh");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhh" + "'", str4, "Hhhh");
    }

    @Test
    public void test3655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3655");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HhHHI!IHHI!!HhHHI!IHHI!!hhHHI!IHHI!!hhHHI!IHHI!!IhHHI!IHHI!!!hHHI!IHHI!!IhHHI!IHHI!!hhHHI!IHHI!!hhHHI!IHHI!!IhHHI!IHHI!!!hHHI!IHHI!!hhHHI!IHHI!!hhHHI!IHHI!!hhHHI!IHHI!!ihHHI!IHHI!!!hHHI!IHHI!!ihHHI!IHHI!!hhHHI!IHHI!!hhHHI!IHHI!!ihHHI!IHHI!!!hHHI!IHHI!!!hHHI!IHHI!!HhHHI!IHHI!!IhHHI!IHHI!!!hHHI!IHHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhHHI!IHHI!!HhHHI!IHHI!!hhHHI!IHHI!!hhHHI!IHHI!!IhHHI!IHHI!!!hHHI!IHHI!!IhHHI!IHHI!!hhHHI!IHHI!!hhHHI!IHHI!!IhHHI!IHHI!!!hHHI!IHHI!!hhHHI!IHHI!!hhHHI!IHHI!!hhHHI!IHHI!!ihHHI!IHHI!!!hHHI!IHHI!!ihHHI!IHHI!!hhHHI!IHHI!!hhHHI!IHHI!!ihHHI!IHHI!!!hHHI!IHHI!!!hHHI!IHHI!!HhHHI!IHHI!!IhHHI!IHHI!!!hHHI!IHHI!!!" + "'", str1, "hhHHI!IHHI!!HhHHI!IHHI!!hhHHI!IHHI!!hhHHI!IHHI!!IhHHI!IHHI!!!hHHI!IHHI!!IhHHI!IHHI!!hhHHI!IHHI!!hhHHI!IHHI!!IhHHI!IHHI!!!hHHI!IHHI!!hhHHI!IHHI!!hhHHI!IHHI!!hhHHI!IHHI!!ihHHI!IHHI!!!hHHI!IHHI!!ihHHI!IHHI!!hhHHI!IHHI!!hhHHI!IHHI!!ihHHI!IHHI!!!hHHI!IHHI!!!hHHI!IHHI!!HhHHI!IHHI!!IhHHI!IHHI!!!hHHI!IHHI!!!");
    }

    @Test
    public void test3656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3656");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HHhhi!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHhhi!" + "'", str2, "HHhhi!");
    }

    @Test
    public void test3657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3657");
        char[] charArray9 = new char[] { '#', '4', '4', '4' };
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("HHhi!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("hhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHHI!IHHI!HHHI!IHHI!!HI!!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '#', '4', '4', '4' });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hi!" + "'", str10, "Hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hi!" + "'", str11, "Hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hhhi!" + "'", str12, "Hhhi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!" + "'", str13, "Hhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hhhhi!ihhi!hhhi!ihhi!!hi!!" + "'", str14, "Hhhhi!ihhi!hhhi!ihhi!!hi!!");
    }

    @Test
    public void test3658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3658");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhh", (-1), (int) (byte) 10, "hHhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihhhhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!!hh!H");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhh" + "'", str4, "hhh");
    }

    @Test
    public void test3659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3659");
        char[] charArray9 = new char[] {};
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("Hi!", charArray9);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray9);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray9);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHHI!HHHIHHHI!HHHI!IHHI!!", charArray9);
        java.lang.Class<?> wildcardClass19 = charArray9.getClass();
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hi!" + "'", str13, "Hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hi!" + "'", str15, "Hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HI!" + "'", str16, "HI!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hHHHI!HHHIHHHI!HHHI!IHHI!!" + "'", str18, "hHHHI!HHHIHHHI!HHHI!IHHI!!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3660");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HhHHHI!IHHI!!hhHHHI!IHHI!!hhHHHI!IHHI!!ihHHHI!IHHI!!!hHHHI!IHHI!!hhHHHI!IHHI!!hhHHHI!IHHI!!hhHHHI!IHHI!!ihHHHI!IHHI!!!hHHHI!IHHI!!ihHHHI!IHHI!!hhHHHI!IHHI!!hhHHHI!IHHI!!ihHHHI!IHHI!!!hHHHI!IHHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhHHHI!IHHI!!hhHHHI!IHHI!!hhHHHI!IHHI!!ihHHHI!IHHI!!!hHHHI!IHHI!!hhHHHI!IHHI!!hhHHHI!IHHI!!hhHHHI!IHHI!!ihHHHI!IHHI!!!hHHHI!IHHI!!ihHHHI!IHHI!!hhHHHI!IHHI!!hhHHHI!IHHI!!ihHHHI!IHHI!!!hHHHI!IHHI!!!" + "'", str1, "hhHHHI!IHHI!!hhHHHI!IHHI!!hhHHHI!IHHI!!ihHHHI!IHHI!!!hHHHI!IHHI!!hhHHHI!IHHI!!hhHHHI!IHHI!!hhHHHI!IHHI!!ihHHHI!IHHI!!!hHHHI!IHHI!!ihHHHI!IHHI!!hhHHHI!IHHI!!hhHHHI!IHHI!!ihHHHI!IHHI!!!hHHHI!IHHI!!!");
    }

    @Test
    public void test3661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3661");
        char[] charArray7 = new char[] { 'a', '4', 'a' };
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalize("", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalize("HI!", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("hhhhi!ihhihhhhi!hhhi!ihhi!!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { 'a', '4', 'a' });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HI!" + "'", str9, "HI!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hhhhi!ihhihhhhi!hhhi!ihhi!!" + "'", str11, "hhhhi!ihhihhhhi!hhhi!ihhi!!");
    }

    @Test
    public void test3662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3662");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("Hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhhhhi!ihhi!hi!!h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test3663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3663");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHHI!IHHI!HHHI!HHHI!HHI!HHHI!", 0, 10, "hhhhi!ihhihhhhi!hhhi!ihhi!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHI!IHHI!hhhhi!ihhihhhhi!hhhi!ihhi!!" + "'", str4, "hHHI!IHHI!hhhhi!ihhihhhhi!hhhi!ihhi!!");
    }

    @Test
    public void test3664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3664");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("HhhhI!IhhIHHhhhi!ihhi!!HHhhhi!ihhi!!HHhhhi!ihHhhhi!hhhiHhhi!hhhi!ihhi!!hi!!IHhhhi!ihhi!!!Hhhhi!ihhi!!HHhhhHhhhi!hhhiHhhi!hhhi!ihhi!!i!ihhi!!HHhhhi!ihhi!!HHhhhi!ihhi!!IHhhhi!hhhiHhhi!hhhi!ihhi!!Hhhhi!ihhi!!!Hhhhi!ihhi!!IHhhhi!ihhHhhhi!hhhiHhhi!hhhi!ihhi!!i!!HHhhhi!ihhi!!HHhhhi!ihhi!!IHhhhiHhhhi!hhhiHhhi!hhhi!ihhi!!!ihhi!!!Hhhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!ihhihhhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhhhhi!hhhihhhi!hhhi!ihhi!!hi!!ihhhhi!ihhi!!!hhhhi!ihhi!!hhhhhhhhhi!hhhihhhi!hhhi!ihhi!!i!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!hhhhi!ihhi!!!hhhhi!ihhi!!ihhhhi!ihhhhhhi!hhhihhhi!hhhi!ihhi!!i!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhihhhhi!hhhihhhi!hhhi!ihhi!!!ihhi!!!hhhhi!ihhi!!!" + "'", str1, "Hhhhi!ihhihhhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhhhhi!hhhihhhi!hhhi!ihhi!!hi!!ihhhhi!ihhi!!!hhhhi!ihhi!!hhhhhhhhhi!hhhihhhi!hhhi!ihhi!!i!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!hhhhi!ihhi!!!hhhhi!ihhi!!ihhhhi!ihhhhhhi!hhhihhhi!hhhi!ihhi!!i!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhihhhhi!hhhihhhi!hhhi!ihhi!!!ihhi!!!hhhhi!ihhi!!!");
    }

    @Test
    public void test3665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3665");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hhhh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHH" + "'", str1, "HHHH");
    }

    @Test
    public void test3666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3666");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hHHHHI!HHHI!IHHI!!HHHHHI!HHHI!IHHI!!HHHHHI!HHHI!IHHIHHI!HHI!HHHHHHI!HHHI!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhihhi!hhi!hhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!" + "'", str1, "Hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhihhi!hhi!hhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
    }

    @Test
    public void test3667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3667");
        char[] charArray8 = new char[] {};
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("hi!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("Hhhi!ihhi!!", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("hH", charArray8);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("HHH", charArray8);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("hhhi!hhhi!ihhi!!", charArray8);
        java.lang.Class<?> wildcardClass17 = charArray8.getClass();
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HHH" + "'", str15, "HHH");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hhhi!hhhi!ihhi!!" + "'", str16, "hhhi!hhhi!ihhi!!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3668");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!ihHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!iHhi!Ihi!!!Hhi!Ihi!!iHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!!Hhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!!Hhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!!Hhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!!Hhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!!Hhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IHhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!IhHI!iHI!!!hHI!iHI!!IhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!!hHI!iHI!!ihHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!!hHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!hhHI!iHI!!hhHI!iHI!!!hHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!hhHI!iHI!!hhHI!iHI!!!hHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!hhHI!iHI!!hhHI!iHI!!!hHI!iHI!!hhHI!iHI!!hhHI!iHI!!!" + "'", str1, "HHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IHhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!IhHI!iHI!!!hHI!iHI!!IhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!!hHI!iHI!!ihHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!!hHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!hhHI!iHI!!hhHI!iHI!!!hHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!hhHI!iHI!!hhHI!iHI!!!hHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!hhHI!iHI!!hhHI!iHI!!!hHI!iHI!!hhHI!iHI!!hhHI!iHI!!!");
    }

    @Test
    public void test3669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3669");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!HHI!IHI!!HI!!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!HHI!IHI!!HI!!" + "'", str2, "HHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!HHI!IHI!!HI!!");
    }

    @Test
    public void test3670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3670");
        char[] charArray8 = new char[] {};
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("hi!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("", charArray8);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("hhhhhi!hhhhHHI!HHHI!IHHI!!", charArray8);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("hhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!ihi!!hi!hhi!ihi!!hi!!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hi!" + "'", str12, "Hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hhhhhi!hhhhHHI!HHHI!IHHI!!" + "'", str15, "hhhhhi!hhhhHHI!HHHI!IHHI!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!ihi!!hi!hhi!ihi!!hi!!" + "'", str16, "hhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!ihi!!hi!hhi!ihi!!hi!!");
    }

    @Test
    public void test3671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3671");
        char[] charArray11 = new char[] {};
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("Hi!", charArray11);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray11);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray11);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("", charArray11);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("HHhhi!ihhi!hi!!", charArray11);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.uncapitalize("HHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!", charArray11);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhi!hhhi!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] {});
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hi!" + "'", str16, "Hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hi!" + "'", str17, "Hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HHhhi!ihhi!hi!!" + "'", str20, "HHhhi!ihhi!hi!!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "HHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!" + "'", str21, "HHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hhhi!hhhi!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!" + "'", str22, "hhhi!hhhi!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
    }

    @Test
    public void test3672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3672");
        char[] charArray14 = new char[] {};
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray14);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("", charArray14);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray14);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray14);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("", charArray14);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray14);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalize("H", charArray14);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.uncapitalize("hhhI!IhhI!HI!!", charArray14);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.uncapitalize("hhhi!Hhhi!Ihhi!!", charArray14);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalize("Hhhhi!ihhi!hi!!h", charArray14);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.capitalizeFully("HhhhI!IhhI!HI!!", charArray14);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.uncapitalize("HHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!", charArray14);
        java.lang.String str27 = org.apache.commons.lang.WordUtils.uncapitalize("hhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!HhHHHI!HHHI!IHHI!!HhHHHI!HHHI!IHHI!!IhHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!HhHHHI!HHHI!IHHI!!IhHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!!", charArray14);
        java.lang.String str28 = org.apache.commons.lang.WordUtils.capitalize("HhhI!IhhI!!", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] {});
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hi!" + "'", str18, "Hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "h" + "'", str20, "h");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "H" + "'", str21, "H");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hhhI!IhhI!HI!!" + "'", str22, "hhhI!IhhI!HI!!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hhhi!Hhhi!Ihhi!!" + "'", str23, "hhhi!Hhhi!Ihhi!!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Hhhhi!ihhi!hi!!h" + "'", str24, "Hhhhi!ihhi!hi!!h");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "HhhhI!IhhI!HI!!" + "'", str25, "HhhhI!IhhI!HI!!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "HHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!" + "'", str26, "HHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!HhHHHI!HHHI!IHHI!!HhHHHI!HHHI!IHHI!!IhHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!HhHHHI!HHHI!IHHI!!IhHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!!" + "'", str27, "hhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!HhHHHI!HHHI!IHHI!!HhHHHI!HHHI!IHHI!!IhHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!HhHHHI!HHHI!IHHI!!IhHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "HhhI!IhhI!!" + "'", str28, "HhhI!IhhI!!");
    }

    @Test
    public void test3673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3673");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HhI!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HhI!" + "'", str2, "HhI!");
    }

    @Test
    public void test3674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3674");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!h", (int) '#', "HhHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHhHhh", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!h" + "'", str4, "HHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!h");
    }

    @Test
    public void test3675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3675");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Ihhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Ihhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Ihhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Ihhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Ihhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Ihhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Ihhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Ihhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!" + "'", str1, "hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Ihhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Ihhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Ihhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Ihhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!");
    }

    @Test
    public void test3676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3676");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("Hhi!hhi!hhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhhHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhhi!hhhi!hhi!hhhi!", (int) '#', "HHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!iHhhi!Hhhi!Ihhi!!!Hhhi!Hhhi!IhhihHHI!IHHI!hHh", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhi!hhi!hhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhhHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhhi!hhhi!hhi!hhhi!" + "'", str4, "Hhi!hhi!hhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhhHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhhi!hhhi!hhi!hhhi!");
    }

    @Test
    public void test3677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3677");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.initials("hHhhI!IhhIHHHHI!HHHI!IHHI!!", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h" + "'", str2, "h");
    }

    @Test
    public void test3678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3678");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhhhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhhhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!" + "'", str1, "Hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhhhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!");
    }

    @Test
    public void test3679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3679");
        char[] charArray6 = new char[] { '4', '4' };
        java.lang.String str7 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray6);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalizeFully("HHi!", charArray6);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("HH", charArray6);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!", charArray6);
        java.lang.Class<?> wildcardClass11 = charArray6.getClass();
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Hi!" + "'", str7, "Hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hhi!" + "'", str8, "Hhi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hH" + "'", str9, "hH");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "h" + "'", str10, "h");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3680");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHHHI!HHHIhHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!iHHHI!hHHI!iHHI!!!HHHI!hHHI!iHHI!!iHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!iHHHI!hHHI!iHHI!!!HHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!iHHHI!hHHI!iHHI!!!HHHI!hHHI!iHHI!!!HHHI!hHHI!iHHI!!h", (int) (short) 100, (int) ' ', "hhhhi!hhhihhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!h");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHHI!HHHIhHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!iHHHI!hHHI!iHHI!!!HHHIhhhhi!hhhihhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!h" + "'", str4, "hHHHI!HHHIhHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!iHHHI!hHHI!iHHI!!!HHHIhhhhi!hhhihhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!h");
    }

    @Test
    public void test3681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3681");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("Hhhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hHHHI!IHHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hHHHI!IHHI!!" + "'", str1, "Hhhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hHHHI!IHHI!!");
    }

    @Test
    public void test3682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3682");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHHI!IHHI!HHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHHHhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!", (int) (byte) 100, (int) (short) 1, "HHHHI!IHHI!hhi!Ihi!!HI!!HHHHI!IHHI!hhi!Ihi!!HI!!HHHHI!IHHI!hhi!Ihi!!HI!!IHHHI!IHHI!hhi!Ihi!!HI!!!HHHI!IHHI!hhi!Ihi!!HI!!IHHHI!IHHI!hhi!Ihi!!HI!!HHHHI!IHHI!hhi!Ihi!!HI!!HHHHI!IHHI!hhi!Ihi!!HI!!IHHHI!IHHI!hhi!Ihi!!HI!!!HHHI!IHHI!hhi!Ihi!!HI!!hHHHI!IHHI!hhi!Ihi!!HI!!iHHHI!IHHI!hhi!Ihi!!HI!!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHHI!IHHI!HHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHHHHHHI!IHHI!hhi!Ihi!!HI!!HHHHI!IHHI!hhi!Ihi!!HI!!HHHHI!IHHI!hhi!Ihi!!HI!!IHHHI!IHHI!hhi!Ihi!!HI!!!HHHI!IHHI!hhi!Ihi!!HI!!IHHHI!IHHI!hhi!Ihi!!HI!!HHHHI!IHHI!hhi!Ihi!!HI!!HHHHI!IHHI!hhi!Ihi!!HI!!IHHHI!IHHI!hhi!Ihi!!HI!!!HHHI!IHHI!hhi!Ihi!!HI!!hHHHI!IHHI!hhi!Ihi!!HI!!iHHHI!IHHI!hhi!Ihi!!HI!!!" + "'", str4, "HHHI!IHHI!HHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHHHHHHI!IHHI!hhi!Ihi!!HI!!HHHHI!IHHI!hhi!Ihi!!HI!!HHHHI!IHHI!hhi!Ihi!!HI!!IHHHI!IHHI!hhi!Ihi!!HI!!!HHHI!IHHI!hhi!Ihi!!HI!!IHHHI!IHHI!hhi!Ihi!!HI!!HHHHI!IHHI!hhi!Ihi!!HI!!HHHHI!IHHI!hhi!Ihi!!HI!!IHHHI!IHHI!hhi!Ihi!!HI!!!HHHI!IHHI!hhi!Ihi!!HI!!hHHHI!IHHI!hhi!Ihi!!HI!!iHHHI!IHHI!hhi!Ihi!!HI!!!");
    }

    @Test
    public void test3683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3683");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhhhi!hhhihhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhhi!hhhihhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!" + "'", str2, "Hhhhi!hhhihhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!");
    }

    @Test
    public void test3684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3684");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHi!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHi!" + "'", str2, "hHi!");
    }

    @Test
    public void test3685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3685");
        char[] charArray8 = new char[] {};
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray8);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("HI!", charArray8);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhh", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hi!" + "'", str12, "Hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hhhhh" + "'", str16, "Hhhhh");
    }

    @Test
    public void test3686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3686");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.initials("Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!hhhhi!Hhhi!Ihhi!!hhhhi!Hhhi!Ihhi!!hhhhi!Hhhi!Ihhi!!ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!ihhhi!Hhhi!Ihhi!!hhhhi!Hhhi!Ihhi!!hhhhi!Hhhi!Ihhi!!ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!hhhhi!Hhhi!Ihhi!!ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!h", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
    }

    @Test
    public void test3687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3687");
        char[] charArray10 = new char[] {};
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("Hi!", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray10);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray10);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHHI!HHHIHHHI!HHHI!IHHI!!", charArray10);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hi!" + "'", str14, "Hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hi!" + "'", str16, "Hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HI!" + "'", str17, "HI!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hHHHI!HHHIHHHI!HHHI!IHHI!!" + "'", str19, "hHHHI!HHHIHHHI!HHHI!IHHI!!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!" + "'", str20, "Hhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
    }

    @Test
    public void test3688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3688");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HHh", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHh" + "'", str2, "HHh");
    }

    @Test
    public void test3689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3689");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HhH", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HhH" + "'", str2, "HhH");
    }

    @Test
    public void test3690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3690");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hhHHI!HHHI!HHHI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HhHHI!HHHI!HHHI!" + "'", str1, "HhHHI!HHHI!HHHI!");
    }

    @Test
    public void test3691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3691");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HHHI!IHHI!HHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHHHHHHI!IHHI!hhi!Ihi!!HI!!HHHHI!IHHI!hhi!Ihi!!HI!!HHHHI!IHHI!hhi!Ihi!!HI!!IHHHI!IHHI!hhi!Ihi!!HI!!!HHHI!IHHI!hhi!Ihi!!HI!!IHHHI!IHHI!hhi!Ihi!!HI!!HHHHI!IHHI!hhi!Ihi!!HI!!HHHHI!IHHI!hhi!Ihi!!HI!!IHHHI!IHHI!hhi!Ihi!!HI!!!HHHI!IHHI!hhi!Ihi!!HI!!hHHHI!IHHI!hhi!Ihi!!HI!!iHHHI!IHHI!hhi!Ihi!!HI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHI!IHHI!HHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHHHHHHI!IHHI!hhi!Ihi!!HI!!HHHHI!IHHI!hhi!Ihi!!HI!!HHHHI!IHHI!hhi!Ihi!!HI!!IHHHI!IHHI!hhi!Ihi!!HI!!!HHHI!IHHI!hhi!Ihi!!HI!!IHHHI!IHHI!hhi!Ihi!!HI!!HHHHI!IHHI!hhi!Ihi!!HI!!HHHHI!IHHI!hhi!Ihi!!HI!!IHHHI!IHHI!hhi!Ihi!!HI!!!HHHI!IHHI!hhi!Ihi!!HI!!hHHHI!IHHI!hhi!Ihi!!HI!!iHHHI!IHHI!hhi!Ihi!!HI!!!" + "'", str1, "hHHI!IHHI!HHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHHHHHHI!IHHI!hhi!Ihi!!HI!!HHHHI!IHHI!hhi!Ihi!!HI!!HHHHI!IHHI!hhi!Ihi!!HI!!IHHHI!IHHI!hhi!Ihi!!HI!!!HHHI!IHHI!hhi!Ihi!!HI!!IHHHI!IHHI!hhi!Ihi!!HI!!HHHHI!IHHI!hhi!Ihi!!HI!!HHHHI!IHHI!hhi!Ihi!!HI!!IHHHI!IHHI!hhi!Ihi!!HI!!!HHHI!IHHI!hhi!Ihi!!HI!!hHHHI!IHHI!hhi!Ihi!!HI!!iHHHI!IHHI!hhi!Ihi!!HI!!!");
    }

    @Test
    public void test3692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3692");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HhI!", (int) (short) 10, 0, "Hhhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhi!ihhi!!hhhi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end 10, length 4");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3693");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.initials("HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!IHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!!", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
    }

    @Test
    public void test3694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3694");
        char[] charArray8 = new char[] {};
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("hH", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("HI!", charArray8);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("hHHHI!IHHI!HI!!H", charArray8);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("HhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHHhhhhhhhhhhhhhhhihhh!hhhhhhhhhhhhhhhihhh!hhhihhhhhhhhhhhihhh!hhh!i!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!ihHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hH" + "'", str13, "hH");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HI!" + "'", str14, "HI!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHHhhhhhhhhhhhhhhhihhh!hhhhhhhhhhhhhhhihhh!hhhihhhhhhhhhhhihhh!hhh!i!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!ihHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!!" + "'", str16, "HhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHHhhhhhhhhhhhhhhhihhh!hhhhhhhhhhhhhhhihhh!hhhihhhhhhhhhhhihhh!hhh!i!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!ihHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!!");
    }

    @Test
    public void test3695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3695");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhi!ihhiHhHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!ihHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!ihHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!!hHHI!IHHI!HI!!h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhhi!ihhiHhHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!ihHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!ihHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!!hHHI!IHHI!HI!!h" + "'", str1, "hhhhi!ihhiHhHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!ihHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!ihHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!!hHHI!IHHI!HI!!h");
    }

    @Test
    public void test3696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3696");
        char[] charArray8 = new char[] {};
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhhi!ihhi!hi!!h", charArray8);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("hhhhI!IhhI!HI!!h", charArray8);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("HHHHi!iHHi!hi!!", charArray8);
        java.lang.Class<?> wildcardClass17 = charArray8.getClass();
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hi!" + "'", str12, "Hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hhhhhi!ihhi!hi!!h" + "'", str14, "Hhhhhi!ihhi!hi!!h");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hhhhI!IhhI!HI!!h" + "'", str15, "hhhhI!IhhI!HI!!h");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HHHHi!iHHi!hi!!" + "'", str16, "HHHHi!iHHi!hi!!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3697");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!hhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!hhHHHI!HHHIhHHI!HHHI!IHHI!!ihHHHI!HHHIhHHI!HHHI!IHHI!!!", (int) '4', "hhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHHI!IHHIHHHi!iHHi!hHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!hhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!hhHHHI!HHHIhHHI!HHHI!IHHI!!ihHHHI!HHHIhHHI!HHHI!IHHI!!!" + "'", str4, "hhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!hhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!hhHHHI!HHHIhHHI!HHHI!IHHI!!ihHHHI!HHHIhHHI!HHHI!IHHI!!!");
    }

    @Test
    public void test3698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3698");
        char[] charArray12 = new char[] { '#', '4', '4', '4' };
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray12);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray12);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("H", charArray12);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("hhhi!ihhi!!", charArray12);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("hhhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!ihi!!hi!hhi!ihi!!hi!!", charArray12);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!hhhi!hhhi!Ihhi!!hhi!Ihhi!hhhi!hhhi!Ihhi!!hhi!Hhhi!Ihhi!!hhi!!", charArray12);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.initials("hHHi!iHHi!HhhhI!IhhI!HI!!h", charArray12);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("HhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HihHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!H!hHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HHhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HihHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!H!hHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HIhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HihHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!H!hHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!H!", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '#', '4', '4', '4' });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hi!" + "'", str13, "Hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hi!" + "'", str14, "Hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "h" + "'", str15, "h");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hhhi!ihhi!!" + "'", str16, "hhhi!ihhi!!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "h" + "'", str17, "h");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!" + "'", str18, "Hhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "h" + "'", str19, "h");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HihHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!H!hHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HHhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HihHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!H!hHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HIhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HihHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!H!hHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!H!" + "'", str20, "HhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HihHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!H!hHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HHhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HihHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!H!hHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HIhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HihHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!H!hHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!H!");
    }

    @Test
    public void test3699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3699");
        char[] charArray5 = new char[] { 'a', '4', 'a' };
        java.lang.String str6 = org.apache.commons.lang.WordUtils.capitalize("", charArray5);
        java.lang.String str7 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray5);
        java.lang.Class<?> wildcardClass8 = charArray5.getClass();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { 'a', '4', 'a' });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3700");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hHhhhI!IhhhhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HhHHHi!iHHHHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!IHhhi!ihhi!HHI!iHI!!hi!!!Hhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!IHhhi!ihhi!HHI!iHI!!hi!!!Hhhi!ihhi!HHI!iHI!!hi!!IHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!IHhhi!ihhi!HHI!iHI!!hi!!!Hhhi!ihhi!HHI!iHI!!hi!!!" + "'", str1, "HhHHHi!iHHHHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!IHhhi!ihhi!HHI!iHI!!hi!!!Hhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!IHhhi!ihhi!HHI!iHI!!hi!!!Hhhi!ihhi!HHI!iHI!!hi!!IHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!IHhhi!ihhi!HHI!iHI!!hi!!!Hhhi!ihhi!HHI!iHI!!hi!!!");
    }

    @Test
    public void test3701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3701");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHHI!IHHI!HHHI!IHHI!!HI!!", (int) (short) -1, (int) (short) 10, "HhhhhI!Ihhhhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHI!IHHI!HhhhhI!Ihhhhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!" + "'", str4, "hHHI!IHHI!HhhhhI!Ihhhhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!");
    }

    @Test
    public void test3702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3702");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hhhi!hhhi!HHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!hHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!hhhi!Hhhi!hhHI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!hhhi!HHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!hHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!hhhi!Hhhi!hhHI!" + "'", str1, "Hhhi!hhhi!HHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!hHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!hhhi!Hhhi!hhHI!");
    }

    @Test
    public void test3703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3703");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.initials("hhhhi!ihhihhhi!hhhi!ihhi!!!hi!!h", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h" + "'", str2, "h");
    }

    @Test
    public void test3704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3704");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!HHHI!IHHI!hhhI!IhhI!hhhi!ihhi!!HI!!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHIHHHI!IHHI!hhhI!IhhI!hhhi!ihhi!!HI!!!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHHHHI!IHHI!hhhI!IhhI!hhhi!ihhi!!HI!!I!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHHHI!IHHI!hhhI!IhhI!hhhi!ihhi!!HI!!HI!!IHHHI!IHHI!!!HHHI!IHHI!!!", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!HHHI!IHHI!hhhI!IhhI!hhhi!ihhi!!HI!!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHIHHHI!IHHI!hhhI!IhhI!hhhi!ihhi!!HI!!!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHHHHI!IHHI!hhhI!IhhI!hhhi!ihhi!!HI!!I!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHHHI!IHHI!hhhI!IhhI!hhhi!ihhi!!HI!!HI!!IHHHI!IHHI!!!HHHI!IHHI!!!" + "'", str2, "hHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!HHHI!IHHI!hhhI!IhhI!hhhi!ihhi!!HI!!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHIHHHI!IHHI!hhhI!IhhI!hhhi!ihhi!!HI!!!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHHHHI!IHHI!hhhI!IhhI!hhhi!ihhi!!HI!!I!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHHHI!IHHI!hhhI!IhhI!hhhi!ihhi!!HI!!HI!!IHHHI!IHHI!!!HHHI!IHHI!!!");
    }

    @Test
    public void test3705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3705");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!!", 1, "Hhhi!ihhi!hhhi!ihhi!hhhi!ihhi!!hi!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!!" + "'", str4, "HhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!!");
    }

    @Test
    public void test3706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3706");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HHHI!HHHI!HHHI!iHHI!!HHI!iHHI!HHHI!hHHI!HHHI!HHHI!", (int) '4', "HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHHI!IHHIHHHI!IHHHHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!iHHHI!hHHI!iHHIhhhhI!IhhI!HI!!h", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHHI!HHHI!HHHI!iHHI!!HHI!iHHI!HHHI!hHHI!HHHI!HHHI!" + "'", str4, "HHHI!HHHI!HHHI!iHHI!!HHI!iHHI!HHHI!hHHI!HHHI!HHHI!");
    }

    @Test
    public void test3707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3707");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("Hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!!" + "'", str1, "Hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!!");
    }

    @Test
    public void test3708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3708");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hHHi!iHHi!hHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHHhhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!!HH!", (int) '#', "Hhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHi!iHHi!hHHHHHHHHIHH!HHhHHHHHHHHIHhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhiHH!HHiHHHHHHHHIHHhhhi!hhhi!hhhi!ihhHhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhii!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhHhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhii!ihhi!!hhi!!!HH!" + "'", str4, "hHHi!iHHi!hHHHHHHHHIHH!HHhHHHHHHHHIHhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhiHH!HHiHHHHHHHHIHHhhhi!hhhi!hhhi!ihhHhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhii!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhHhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhii!ihhi!!hhi!!!HH!");
    }

    @Test
    public void test3709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3709");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hhhi!ihhi!hhhi!ihhi!!hi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhi!ihhi!hhhi!ihhi!!hi!!" + "'", str1, "hhhi!ihhi!hhhi!ihhi!!hi!!");
    }

    @Test
    public void test3710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3710");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!HhhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!Hhhi!ihhi!HHI!iHI!!hi!!", (int) (byte) 10, (int) (byte) 1, "Hhhhhi!ihhhhhhi!ihhihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhhhI!IhhHhhhhi!ihhhhhhi!ihhihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!" + "'", str4, "hhhhhI!IhhHhhhhi!ihhhhhhi!ihhihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!");
    }

    @Test
    public void test3711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3711");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("Hhhhi!ihhihhhI!IhhI!Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHHI!IHHIHHHi!iHHi!hHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!" + "'", str1, "hHHHI!IHHIHHHi!iHHi!hHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!");
    }

    @Test
    public void test3712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3712");
        char[] charArray11 = new char[] {};
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("", charArray11);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray11);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("H", charArray11);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("hH", charArray11);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("HH", charArray11);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalize("hhI!", charArray11);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhhhhi!hhhihhhi!hhhi!ihhi!!hi!!ihhhhi!ihhi!!!hhhhi!ihhi!!hhhhhhhhhi!hhhihhhi!hhhi!ihhi!!i!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!hhhhi!ihhi!!!hhhhi!ihhi!!ihhhhi!ihhhhhhi!hhhihhhi!hhhi!ihhi!!i!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhihhhhi!hhhihhhi!hhhi!ihhi!!!ihhi!!!hhhhi!ihhi!!!", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] {});
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hi!" + "'", str15, "Hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "h" + "'", str17, "h");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H" + "'", str18, "H");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hH" + "'", str19, "hH");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HH" + "'", str20, "HH");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hhI!" + "'", str21, "hhI!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Hhhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhhhhi!hhhihhhi!hhhi!ihhi!!hi!!ihhhhi!ihhi!!!hhhhi!ihhi!!hhhhhhhhhi!hhhihhhi!hhhi!ihhi!!i!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!hhhhi!ihhi!!!hhhhi!ihhi!!ihhhhi!ihhhhhhi!hhhihhhi!hhhi!ihhi!!i!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhihhhhi!hhhihhhi!hhhi!ihhi!!!ihhi!!!hhhhi!ihhi!!!" + "'", str22, "Hhhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhhhhi!hhhihhhi!hhhi!ihhi!!hi!!ihhhhi!ihhi!!!hhhhi!ihhi!!hhhhhhhhhi!hhhihhhi!hhhi!ihhi!!i!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!hhhhi!ihhi!!!hhhhi!ihhi!!ihhhhi!ihhhhhhi!hhhihhhi!hhhi!ihhi!!i!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhihhhhi!hhhihhhi!hhhi!ihhi!!!ihhi!!!hhhhi!ihhi!!!");
    }

    @Test
    public void test3713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3713");
        char[] charArray7 = new char[] { 'a', '4', 'a' };
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalize("", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!h", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihhhhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!!hh!", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhhh", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { 'a', '4', 'a' });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!h" + "'", str9, "Hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!h");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihhhhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!!hh!" + "'", str10, "hhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihhhhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!!hh!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H" + "'", str11, "H");
    }

    @Test
    public void test3714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3714");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("Hhhhhi!hhhhhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!", (int) ' ', "Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhhhi!hhhhhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!" + "'", str4, "Hhhhhi!hhhhhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
    }

    @Test
    public void test3715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3715");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!" + "'", str1, "Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!");
    }

    @Test
    public void test3716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3716");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("Hhhi!ihhi!hhHHHI!IHHI!HI!!H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHI!IHHI!HHhhhi!ihhi!hi!!h" + "'", str1, "hHHI!IHHI!HHhhhi!ihhi!hi!!h");
    }

    @Test
    public void test3717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3717");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("HhHHi!iHHiHhH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHhhI!IhhIhHh" + "'", str1, "hHhhI!IhhIhHh");
    }

    @Test
    public void test3718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3718");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHhi!", (int) (byte) -1, (int) (short) 0, "HHHHI!IHHI!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHHHI!IHHI!!" + "'", str4, "HHHHI!IHHI!!");
    }

    @Test
    public void test3719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3719");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!HhhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!ihhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!!", (int) ' ', (int) ' ', "hhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!IhHHHI!HHHI!HHHI!!hHHHI!HHHI!HHHI!IhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!IhHHHI!HHHI!HHHI!!hHHHI!HHHI!HHHI!!hHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!IhHHHI!HHHI!HHHI!!hHHHI!HHHI!HHHI!IhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!IhHHHI!HHHI!HHHI!!hHHHI!HHHI!HHHI!!hHHHI!HHHI!HHHI!HhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!IhHHHI!HHHI!HHHI!!hHHHI!HHHI!HHHI!IhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!IhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!HhHHHI!HHHI!HHHI!HhHHHI!HHHI!HHHI!IhHHHI!HHHI!HHHI!!hHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!HhHHHI!HHHI!HHHI!HhHHHI!HHHI!HHHI!IhHHHI!HHHI!HHHI!!hHHHI!HHHI!HHHI!ihHHHI!HHHI!HHHI!HhHHHI!HHHI!HHHI!HhHHHI!HHHI!HHHI!IhHHHI!HHHI!HHHI!!hHHHI!HHHI!HHHI!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!IhHHHI!HHHI!HHHI!!hHHHI!HHHI!HHHI!IhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!IhHHHI!HHHI!HHHI!!hHHHI!HHHI!HHHI!!hHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!IhHHHI!HHHI!HHHI!!hHHHI!HHHI!HHHI!IhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!IhHHHI!HHHI!HHHI!!hHHHI!HHHI!HHHI!!hHHHI!HHHI!HHHI!HhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!IhHHHI!HHHI!HHHI!!hHHHI!HHHI!HHHI!IhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!IhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!HhHHHI!HHHI!HHHI!HhHHHI!HHHI!HHHI!IhHHHI!HHHI!HHHI!!hHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!HhHHHI!HHHI!HHHI!HhHHHI!HHHI!HHHI!IhHHHI!HHHI!HHHI!!hHHHI!HHHI!HHHI!ihHHHI!HHHI!HHHI!HhHHHI!HHHI!HHHI!HhHHHI!HHHI!HHHI!IhHHHI!HHHI!HHHI!!hHHHI!HHHI!HHHI!!" + "'", str4, "hhhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!IhHHHI!HHHI!HHHI!!hHHHI!HHHI!HHHI!IhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!IhHHHI!HHHI!HHHI!!hHHHI!HHHI!HHHI!!hHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!IhHHHI!HHHI!HHHI!!hHHHI!HHHI!HHHI!IhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!IhHHHI!HHHI!HHHI!!hHHHI!HHHI!HHHI!!hHHHI!HHHI!HHHI!HhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!IhHHHI!HHHI!HHHI!!hHHHI!HHHI!HHHI!IhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!IhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!HhHHHI!HHHI!HHHI!HhHHHI!HHHI!HHHI!IhHHHI!HHHI!HHHI!!hHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!HhHHHI!HHHI!HHHI!HhHHHI!HHHI!HHHI!IhHHHI!HHHI!HHHI!!hHHHI!HHHI!HHHI!ihHHHI!HHHI!HHHI!HhHHHI!HHHI!HHHI!HhHHHI!HHHI!HHHI!IhHHHI!HHHI!HHHI!!hHHHI!HHHI!HHHI!!");
    }

    @Test
    public void test3720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3720");
        char[] charArray7 = new char[] {};
        java.lang.String str8 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("", charArray7);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray7);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("hHhhi!hHhhi!hHhhi!iHhhi!!Hhhi!iHhhi!hHhhi!hHhhi!iHhhi!!Hhhi!hHhhi!hHhhi!hHhhi!iHhhi!!Hhhi!iHhhi!hHhhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!i!hHhhi!iHhhi!!Hhhi!!Hhhi!hHhhi!iHhhi!!Hhhi!!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hi!" + "'", str11, "Hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hi!" + "'", str13, "Hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hHhhi!hHhhi!hHhhi!iHhhi!!Hhhi!iHhhi!hHhhi!hHhhi!iHhhi!!Hhhi!hHhhi!hHhhi!hHhhi!iHhhi!!Hhhi!iHhhi!hHhhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!i!hHhhi!iHhhi!!Hhhi!!Hhhi!hHhhi!iHhhi!!Hhhi!!" + "'", str14, "hHhhi!hHhhi!hHhhi!iHhhi!!Hhhi!iHhhi!hHhhi!hHhhi!iHhhi!!Hhhi!hHhhi!hHhhi!hHhhi!iHhhi!!Hhhi!iHhhi!hHhhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!i!hHhhi!iHhhi!!Hhhi!!Hhhi!hHhhi!iHhhi!!Hhhi!!");
    }

    @Test
    public void test3721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3721");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHHI!IHHIHHHI!IHHI!HHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHHI!IHHIHHHI!IHHI!HHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!" + "'", str2, "hHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHHI!IHHIHHHI!IHHI!HHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!");
    }

    @Test
    public void test3722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3722");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHHI!IHHIHHHI!IHHI!HHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhhi!ihhihhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!" + "'", str1, "Hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhhi!ihhihhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!");
    }

    @Test
    public void test3723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3723");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("HhHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!ihHHI!IHHI!HI!!hhHHI!IHHIhhhi!Hhhi!HhI!hhHI!!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHIhhhi!Hhhi!HhI!hhHI!!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!ihHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!hhhi!Hhhi!HhI!hhHI!!hHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!!hHHI!IHHI!HI!!h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHhhi!ihhi!hi!!HHhhi!ihhi!hi!!HHhhi!ihhi!hi!!IHhhi!ihhi!hi!!!Hhhi!ihhi!hi!!IHhhi!ihhi!hi!!HHhhi!ihhiHHHI!hHHI!hHi!HHhi!!hi!!HHhhi!ihhi!hi!!IHhhi!ihhi!hi!!!Hhhi!ihhi!hi!!HHhhi!ihhi!hi!!HHhhi!ihhi!hi!!HHhhi!ihhi!hi!!HHhhiHHHI!hHHI!hHi!HHhi!!ihhi!hi!!IHhhi!ihhi!hi!!!Hhhi!ihhi!hi!!IHhhi!ihhi!hi!!HHhhi!ihhi!hi!!HHhhi!ihhi!hi!!IHhhi!ihhi!hi!!HHHI!hHHI!hHi!HHhi!!Hhhi!ihhi!hi!!HHhhi!ihhi!hi!!IHhhi!ihhi!hi!!!Hhhi!ihhi!hi!!!Hhhi!ihhi!hi!!H" + "'", str1, "hHhhi!ihhi!hi!!HHhhi!ihhi!hi!!HHhhi!ihhi!hi!!IHhhi!ihhi!hi!!!Hhhi!ihhi!hi!!IHhhi!ihhi!hi!!HHhhi!ihhiHHHI!hHHI!hHi!HHhi!!hi!!HHhhi!ihhi!hi!!IHhhi!ihhi!hi!!!Hhhi!ihhi!hi!!HHhhi!ihhi!hi!!HHhhi!ihhi!hi!!HHhhi!ihhi!hi!!HHhhiHHHI!hHHI!hHi!HHhi!!ihhi!hi!!IHhhi!ihhi!hi!!!Hhhi!ihhi!hi!!IHhhi!ihhi!hi!!HHhhi!ihhi!hi!!HHhhi!ihhi!hi!!IHhhi!ihhi!hi!!HHHI!hHHI!hHi!HHhi!!Hhhi!ihhi!hi!!HHhhi!ihhi!hi!!IHhhi!ihhi!hi!!!Hhhi!ihhi!hi!!!Hhhi!ihhi!hi!!H");
    }

    @Test
    public void test3724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3724");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHHHI!IHHI!HHHI!IHHI!!HI!!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHHHI!IHHI!HHHI!IHHI!!HI!!" + "'", str2, "hHHHI!IHHI!HHHI!IHHI!!HI!!");
    }

    @Test
    public void test3725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3725");
        char[] charArray12 = new char[] { 'a', '4', 'a' };
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("", charArray12);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray12);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("HHHi!iHHi!!", charArray12);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray12);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("hhhI!IhhI!HI!!", charArray12);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("hhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!HhHHHI!HHHI!IHHI!!HhHHHI!HHHI!IHHI!!IhHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!HhHHHI!HHHI!IHHI!!IhHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!!", charArray12);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhhhhhhhhhhhhhihhh!hhhhhhhhhhhhhhhihhh!hhhihhhhhhhhhhhihhh!hhh!", charArray12);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.initials("hhhhI!IhhI!HI!!h", charArray12);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.initials("HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!IhHHI!hHHI!iHHI!!!hHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!IhHHI!hHHI!iHHI!!!hHHI!hHHI!iHHI!!IhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!IhHHI!hHHI!iHHI!!!hHHI!hHHI!iHHI!!!", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { 'a', '4', 'a' });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hHHi!iHHi!!" + "'", str15, "hHHi!iHHi!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hhhI!IhhI!HI!!" + "'", str17, "hhhI!IhhI!HI!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!HhHHHI!HHHI!IHHI!!HhHHHI!HHHI!IHHI!!IhHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!HhHHHI!HHHI!IHHI!!IhHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!!" + "'", str18, "hhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!HhHHHI!HHHI!IHHI!!HhHHHI!HHHI!IHHI!!IhHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!HhHHHI!HHHI!IHHI!!IhHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hhhhhhhhhhhhhhhhihhh!hhhhhhhhhhhhhhhihhh!hhhihhhhhhhhhhhihhh!hhh!" + "'", str19, "hhhhhhhhhhhhhhhhihhh!hhhhhhhhhhhhhhhihhh!hhhihhhhhhhhhhhihhh!hhh!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "h" + "'", str20, "h");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "H" + "'", str21, "H");
    }

    @Test
    public void test3726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3726");
        char[] charArray8 = new char[] {};
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("hi!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHHHI!IHHI!HI!!H", charArray8);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("hHI!iHI!!", charArray8);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("hHHHI!IHHI!HI!!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HI!" + "'", str12, "HI!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HI!" + "'", str13, "HI!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HHHHHI!IHHI!HI!!H" + "'", str14, "HHHHHI!IHHI!HI!!H");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hHI!iHI!!" + "'", str15, "hHI!iHI!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hHHHI!IHHI!HI!!" + "'", str16, "hHHHI!IHHI!HI!!");
    }

    @Test
    public void test3727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3727");
        char[] charArray10 = new char[] {};
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("hH", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("hI!", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("HI!", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("HI!", charArray10);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("hhHHi!iHHi!HHHI!IHHI!!hi!!", charArray10);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("hhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!Hhihi!!hi!hhi!ihi!!hi!!", charArray10);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hi!" + "'", str13, "Hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hI!" + "'", str15, "hI!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HI!" + "'", str16, "HI!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HI!" + "'", str17, "HI!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hhHHi!iHHi!HHHI!IHHI!!hi!!" + "'", str18, "hhHHi!iHHi!HHHI!IHHI!!hi!!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!Hhihi!!hi!hhi!ihi!!hi!!" + "'", str19, "hhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!Hhihi!!hi!hhi!ihi!!hi!!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!" + "'", str20, "Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
    }

    @Test
    public void test3728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3728");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hHHI!IHHI!!", (int) 'a', "hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!HhHHi!iHHi!HHHI!IHHI!!hi!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHI!IHHI!!" + "'", str4, "hHHI!IHHI!!");
    }

    @Test
    public void test3729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3729");
        char[] charArray9 = new char[] {};
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("hi!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray9);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray9);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("HH", charArray9);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhhhhhhihhhhi!ihhi!hi!!", charArray9);
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HH" + "'", str17, "HH");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hhhhhhhhhihhhhi!ihhi!hi!!" + "'", str18, "Hhhhhhhhhihhhhi!ihhi!hi!!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3730");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHHI!IHHI!HI!!", (int) (short) 0, (int) (short) 1, "hhhhhhhhhhhhhhhhihhh!hhhhhhhhhhhhhhhihhh!hhhihhhhhhhhhhhihhh!hhh!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhhhhhhhhhhhhhhhihhh!hhhhhhhhhhhhhhhihhh!hhhihhhhhhhhhhhihhh!hhh!" + "'", str4, "hhhhhhhhhhhhhhhhhihhh!hhhhhhhhhhhhhhhihhh!hhhihhhhhhhhhhhihhh!hhh!");
    }

    @Test
    public void test3731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3731");
        char[] charArray6 = new char[] { '#', ' ', '4' };
        java.lang.String str7 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray6);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray6);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalize("hhhi!hhhi!ihhi!!", charArray6);
        java.lang.Class<?> wildcardClass10 = charArray6.getClass();
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '#', ' ', '4' });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Hi!" + "'", str7, "Hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hi!" + "'", str8, "Hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Hhhi!hhhi!ihhi!!" + "'", str9, "Hhhi!hhhi!ihhi!!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3732");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hHhhi!hhhi!hHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HhHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!IHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!!HHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HhHHI!HHHI!Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!" + "'", str1, "HhHHI!HHHI!Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
    }

    @Test
    public void test3733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3733");
        char[] charArray7 = new char[] {};
        java.lang.String str8 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("hi!", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("", charArray7);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("HH", charArray7);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("Hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!!", charArray7);
        java.lang.Class<?> wildcardClass15 = charArray7.getClass();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HI!" + "'", str11, "HI!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HH" + "'", str13, "HH");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3734");
        char[] charArray9 = new char[] {};
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("HhhI!IhhI!!", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHi!iHHi!hi!!", charArray9);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray9);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("hhHHi!iHHi!!", charArray9);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhhhhi!hhhihhhi!hhhi!ihhi!!hi!!ihhhhi!ihhi!!!hhhhi!ihhi!!hhhhhhhhhi!hhhihhhi!hhhi!ihhi!!i!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!hhhhi!ihhi!!!hhhhi!ihhi!!ihhhhi!ihhhhhhi!hhhihhhi!hhhi!ihhi!!i!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhihhhhi!hhhihhhi!hhhi!ihhi!!!ihhi!!!hhhhi!ihhi!!!", charArray9);
        java.lang.Class<?> wildcardClass19 = charArray9.getClass();
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HhhI!IhhI!!" + "'", str14, "HhhI!IhhI!!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HHHi!iHHi!hi!!" + "'", str15, "HHHi!iHHi!hi!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hhhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhhhhi!hhhihhhi!hhhi!ihhi!!hi!!ihhhhi!ihhi!!!hhhhi!ihhi!!hhhhhhhhhi!hhhihhhi!hhhi!ihhi!!i!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!hhhhi!ihhi!!!hhhhi!ihhi!!ihhhhi!ihhhhhhi!hhhihhhi!hhhi!ihhi!!i!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhihhhhi!hhhihhhi!hhhi!ihhi!!!ihhi!!!hhhhi!ihhi!!!" + "'", str18, "Hhhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhhhhi!hhhihhhi!hhhi!ihhi!!hi!!ihhhhi!ihhi!!!hhhhi!ihhi!!hhhhhhhhhi!hhhihhhi!hhhi!ihhi!!i!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!hhhhi!ihhi!!!hhhhi!ihhi!!ihhhhi!ihhhhhhi!hhhihhhi!hhhi!ihhi!!i!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhihhhhi!hhhihhhi!hhhi!ihhi!!!ihhi!!!hhhhi!ihhi!!!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3735");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hhhhi!ihhi!hi!!", 10, "Hi!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhhi!ihhiHi!!hi!!" + "'", str4, "hhhhi!ihhiHi!!hi!!");
    }

    @Test
    public void test3736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3736");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!Hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!HHHHHHI!IHHI!HHI!IHI!!HI!!", (int) (byte) 100, 100, "hHhhi!ihhi!hi!!HHhhi!ihhi!hi!!HHhhi!ihhi!hi!!IHhhi!ihhi!hi!!!Hhhi!ihhi!hi!!IHhhi!ihhi!hi!!HHhhi!ihhiHHHI!hHHI!hHi!HHhi!!hi!!HHhhi!ihhi!hi!!IHhhi!ihhi!hi!!!Hhhi!ihhi!hi!!HHhhi!ihhi!hi!!HHhhi!ihhi!hi!!HHhhi!ihhi!hi!!HHhhiHHHI!hHHI!hHi!HHhi!!ihhi!hi!!IHhhi!ihhi!hi!!!Hhhi!ihhi!hi!!IHhhi!ihhi!hi!!HHhhi!ihhi!hi!!HHhhi!ihhi!hi!!IHhhi!ihhi!hi!!HHHI!hHHI!hHi!HHhi!!Hhhi!ihhi!hi!!HHhhi!ihhi!hi!!IHhhi!ihhi!hi!!!Hhhi!ihhi!hi!!!Hhhi!ihhi!hi!!H");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HhhhhHhhi!ihhi!hi!!HHhhi!ihhi!hi!!HHhhi!ihhi!hi!!IHhhi!ihhi!hi!!!Hhhi!ihhi!hi!!IHhhi!ihhi!hi!!HHhhi!ihhiHHHI!hHHI!hHi!HHhi!!hi!!HHhhi!ihhi!hi!!IHhhi!ihhi!hi!!!Hhhi!ihhi!hi!!HHhhi!ihhi!hi!!HHhhi!ihhi!hi!!HHhhi!ihhi!hi!!HHhhiHHHI!hHHI!hHi!HHhi!!ihhi!hi!!IHhhi!ihhi!hi!!!Hhhi!ihhi!hi!!IHhhi!ihhi!hi!!HHhhi!ihhi!hi!!HHhhi!ihhi!hi!!IHhhi!ihhi!hi!!HHHI!hHHI!hHi!HHhi!!Hhhi!ihhi!hi!!HHhhi!ihhi!hi!!IHhhi!ihhi!hi!!!Hhhi!ihhi!hi!!!Hhhi!ihhi!hi!!H" + "'", str4, "hHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HhhhhHhhi!ihhi!hi!!HHhhi!ihhi!hi!!HHhhi!ihhi!hi!!IHhhi!ihhi!hi!!!Hhhi!ihhi!hi!!IHhhi!ihhi!hi!!HHhhi!ihhiHHHI!hHHI!hHi!HHhi!!hi!!HHhhi!ihhi!hi!!IHhhi!ihhi!hi!!!Hhhi!ihhi!hi!!HHhhi!ihhi!hi!!HHhhi!ihhi!hi!!HHhhi!ihhi!hi!!HHhhiHHHI!hHHI!hHi!HHhi!!ihhi!hi!!IHhhi!ihhi!hi!!!Hhhi!ihhi!hi!!IHhhi!ihhi!hi!!HHhhi!ihhi!hi!!HHhhi!ihhi!hi!!IHhhi!ihhi!hi!!HHHI!hHHI!hHi!HHhi!!Hhhi!ihhi!hi!!HHhhi!ihhi!hi!!IHhhi!ihhi!hi!!!Hhhi!ihhi!hi!!!Hhhi!ihhi!hi!!H");
    }

    @Test
    public void test3737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3737");
        char[] charArray10 = new char[] {};
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("hH", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("hI!", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("HI!", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("Hh", charArray10);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("HhHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!ihHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!ihHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!!hHHI!IHHI!HI!!h", charArray10);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("hhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!ihi!!hi!hhi!ihi!!hi!!", charArray10);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.uncapitalize("hhhhi!hhhiHhhi!hhhi!ihhi!!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hi!" + "'", str13, "Hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hI!" + "'", str15, "hI!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HI!" + "'", str16, "HI!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!ihi!!hi!hhi!ihi!!hi!!" + "'", str19, "hhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!ihi!!hi!hhi!ihi!!hi!!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hhhhi!hhhiHhhi!hhhi!ihhi!!" + "'", str20, "hhhhi!hhhiHhhi!hhhi!ihhi!!");
    }

    @Test
    public void test3738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3738");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("HHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IHhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!IhHI!iHI!!!hHI!iHI!!IhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!!hHI!iHI!!ihHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!!hHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!hhHI!iHI!!hhHI!iHI!!!hHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!hhHI!iHI!!hhHI!iHI!!!hHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!hhHI!iHI!!hhHI!iHI!!!hHI!iHI!!hhHI!iHI!!hhHI!iHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IHhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!IhHI!iHI!!!hHI!iHI!!IhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!!hHI!iHI!!ihHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!!hHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!hhHI!iHI!!hhHI!iHI!!!hHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!hhHI!iHI!!hhHI!iHI!!!hHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!hhHI!iHI!!hhHI!iHI!!!hHI!iHI!!hhHI!iHI!!hhHI!iHI!!!" + "'", str1, "HHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IHhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!IhHI!iHI!!!hHI!iHI!!IhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!!hHI!iHI!!ihHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!!hHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!hhHI!iHI!!hhHI!iHI!!!hHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!hhHI!iHI!!hhHI!iHI!!!hHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!hhHI!iHI!!hhHI!iHI!!!hHI!iHI!!hhHI!iHI!!hhHI!iHI!!!");
    }

    @Test
    public void test3739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3739");
        char[] charArray7 = new char[] {};
        java.lang.String str8 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("hi!", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHHI!IHHIHHHI!IHHHHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!iHHHI!hHHI!iHHIhhhhI!IhhI!HI!!h", charArray7);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("Hhhhhi!ihhhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhhhi!ihhi!hhi!ihi!!hi!!", charArray7);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hI!" + "'", str11, "hI!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hhhhhi!ihhhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhhhi!ihhi!hhi!ihi!!hi!!" + "'", str13, "Hhhhhi!ihhhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhhhi!ihhi!hhi!ihi!!hi!!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi" + "'", str14, "hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi");
    }

    @Test
    public void test3740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3740");
        char[] charArray9 = new char[] {};
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("hi!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!", charArray9);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!ihhi!!", charArray9);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("hhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!Hhihi!!hi!hhi!ihi!!hi!!", charArray9);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhhi!ihhi!hi!!", charArray9);
        java.lang.Class<?> wildcardClass19 = charArray9.getClass();
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hi!" + "'", str13, "Hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!" + "'", str15, "hhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hhhi!ihhi!!" + "'", str16, "Hhhi!ihhi!!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!Hhihi!!hi!hhi!ihi!!hi!!" + "'", str17, "hhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!Hhihi!!hi!hhi!ihi!!hi!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hhhhi!ihhi!hi!!" + "'", str18, "hhhhi!ihhi!hi!!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3741");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("Hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!h" + "'", str1, "Hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!h");
    }

    @Test
    public void test3742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3742");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHHI!IHHI!HHHI!HHHI!HHI!HHHI!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHHI!IHHI!HHHI!HHHI!HHI!HHHI!" + "'", str2, "hHHI!IHHI!HHHI!HHHI!HHI!HHHI!");
    }

    @Test
    public void test3743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3743");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!", (int) '4', "hhhhhI!IhhHhhhhi!ihhhhhhi!ihhihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhhhhhhI!IhhHhhhhi!ihhhhhhi!ihhihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!i!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhhhhhI!IhhHhhhhi!ihhhhhhi!ihhihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!hhhhhI!IhhHhhhhi!ihhhhhhi!ihhihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!hhhi!ihhi!!!" + "'", str4, "hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhhhhhhI!IhhHhhhhi!ihhhhhhi!ihhihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!i!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhhhhhI!IhhHhhhhi!ihhhhhhi!ihhihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!hhhhhI!IhhHhhhhi!ihhhhhhi!ihhihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!hhhi!ihhi!!!");
    }

    @Test
    public void test3744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3744");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HhHHhHH", (int) (byte) 10, "Hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhhhi!hhhi!hhhi!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HhHHhHH" + "'", str4, "hHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HhHHhHH");
    }

    @Test
    public void test3745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3745");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hhhhhi!hhhhHHI!HHHI!IHHI!!", (int) (short) 100, "hhhhhi!hhhHhhhi!hhhihhhi!ihhi!hi!!!ihhi!!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhhhi!hhhhHHI!HHHI!IHHI!!" + "'", str4, "hhhhhi!hhhhHHI!HHHI!IHHI!!");
    }

    @Test
    public void test3746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3746");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhi!ihhi!!!Hhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhi!ihhi!!!Hhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhi!ihhi!!!Hhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhi!ihhi!!!Hhhhi!hhhiHhhi!hhhi!ihhi!!!Hhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhi!ihhi!!!Hhhhi!hhhiHhhi!hhhi!ihhi!!!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhi!ihhi!!!Hhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhi!ihhi!!!Hhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhi!ihhi!!!Hhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhi!ihhi!!!Hhhhi!hhhiHhhi!hhhi!ihhi!!!Hhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhi!ihhi!!!Hhhhi!hhhiHhhi!hhhi!ihhi!!!" + "'", str2, "hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhi!ihhi!!!Hhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhi!ihhi!!!Hhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhi!ihhi!!!Hhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhi!ihhi!!!Hhhhi!hhhiHhhi!hhhi!ihhi!!!Hhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhi!ihhi!!!Hhhhi!hhhiHhhi!hhhi!ihhi!!!");
    }

    @Test
    public void test3747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3747");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhhhhi!ihhHHHHI!IHHIhHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!", 0, (int) '#', "HhhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhIhHHI!hHHI!iHHI!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhhhi!ihhHHHHI!IHHIhHHHHHHHHIHH!HHHhhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhIhHHI!hHHI!iHHI!!" + "'", str4, "hhhhhi!ihhHHHHI!IHHIhHHHHHHHHIHH!HHHhhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhIhHHI!hHHI!iHHI!!");
    }

    @Test
    public void test3748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3748");
        char[] charArray6 = new char[] {};
        java.lang.String str7 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray6);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.initials("", charArray6);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("H", charArray6);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("", charArray6);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("hhHI!", charArray6);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("hHI!iHI!!", charArray6);
        java.lang.Class<?> wildcardClass13 = charArray6.getClass();
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hhHI!" + "'", str11, "hhHI!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hHI!iHI!!" + "'", str12, "hHI!iHI!!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3749");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("", (int) '#', "hhhi!ihhi!hi!!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test3750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3750");
        char[] charArray12 = new char[] {};
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray12);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("", charArray12);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray12);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray12);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("", charArray12);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("Hi!", charArray12);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray12);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.uncapitalize("hHHi!iHHi!!", charArray12);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalize("HHhi!", charArray12);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.initials("hHHI!HHHI!IHHI!!", charArray12);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalize("hHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HhHHhHH", charArray12);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHi!iHHi!hHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!", charArray12);
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hHHi!iHHi!!" + "'", str20, "hHHi!iHHi!!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "HHhi!" + "'", str21, "HHhi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HhHHhHH" + "'", str23, "hHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HhHHhHH");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "HHHi!iHHi!hHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!" + "'", str24, "HHHi!iHHi!hHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3751");
        char[] charArray7 = new char[] { '#', '4', '4', '4' };
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalize("hHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!iHhhi!Hhhi!Ihhi!!!Hhhi!Hhhi!IhhiHhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!IhHHI!hHHI!iHHI!!!hHHI!hHHI!ihhHHHI!IHHI!HI!!H", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!HhHHHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!hHIHI!!HI!HHI!IHI!!HI!!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '#', '4', '4', '4' });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hi!" + "'", str8, "Hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!iHhhi!Hhhi!Ihhi!!!Hhhi!Hhhi!IhhiHhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!IhHHI!hHHI!iHHI!!!hHHI!hHHI!ihhHHHI!IHHI!HI!!H" + "'", str9, "HHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!iHhhi!Hhhi!Ihhi!!!Hhhi!Hhhi!IhhiHhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!IhHHI!hHHI!iHHI!!!hHHI!hHHI!ihhHHHI!IHHI!HI!!H");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "h" + "'", str10, "h");
    }

    @Test
    public void test3752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3752");
        char[] charArray13 = new char[] {};
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray13);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("", charArray13);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray13);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("hH", charArray13);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("hI!", charArray13);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("HI!", charArray13);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("HI!", charArray13);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalize("hhHHi!iHHi!HHHI!IHHI!!hi!!", charArray13);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.initials("hhI!", charArray13);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalize("", charArray13);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.initials("hHHHHHHHHIHHHHi!iHHi!hi!!", charArray13);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.capitalize("hhhI!IhhI!Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!", charArray13);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.capitalize("hhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!ihHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!iHhi!Ihi!!!Hhi!Ihi!!iHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!!Hhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!!Hhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!!Hhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!!Hhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!!Hhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!!", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] {});
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hi!" + "'", str16, "Hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hI!" + "'", str18, "hI!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "HI!" + "'", str19, "HI!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HI!" + "'", str20, "HI!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hhHHi!iHHi!HHHI!IHHI!!hi!!" + "'", str21, "hhHHi!iHHi!HHHI!IHHI!!hi!!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hhhI!IhhI!Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!" + "'", str25, "hhhI!IhhI!Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!ihHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!iHhi!Ihi!!!Hhi!Ihi!!iHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!!Hhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!!Hhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!!Hhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!!Hhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!!Hhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!!" + "'", str26, "hhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!ihHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!iHhi!Ihi!!!Hhi!Ihi!!iHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!!Hhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!!Hhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!!Hhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!!Hhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!!Hhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!!");
    }

    @Test
    public void test3753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3753");
        char[] charArray6 = new char[] {};
        java.lang.String str7 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray6);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.initials("", charArray6);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalize("Hh", charArray6);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("HH", charArray6);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("HhH", charArray6);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("HhhI!IhhI!Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Hh" + "'", str9, "Hh");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HH" + "'", str10, "HH");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HhH" + "'", str11, "HhH");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HhhI!IhhI!Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!" + "'", str12, "HhhI!IhhI!Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!");
    }

    @Test
    public void test3754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3754");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hhHI!iHI!!HhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHHhhhhhhhhhhhhhhhihhh!hhhhhhhhhhhhhhhihhh!hhhihhhhhhhhhhhihhh!hhh!i!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!ihHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!ihi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhhhhhhhhhhhhhhhhhihhh!hhhhhhhhhhhhhhhihhh!hhhihhhhhhhhhhhihhh!hhh!i!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!" + "'", str1, "Hhhi!ihi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhhhhhhhhhhhhhhhhhihhh!hhhhhhhhhhhhhhhihhh!hhhihhhhhhhhhhhihhh!hhh!i!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
    }

    @Test
    public void test3755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3755");
        char[] charArray9 = new char[] {};
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("hH", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("hI!", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("HI!", charArray9);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("HI!", charArray9);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("hHHHi!iHHi!hi!!H", charArray9);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("HHHI!IHHI!hi!", charArray9);
        java.lang.Class<?> wildcardClass19 = charArray9.getClass();
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hi!" + "'", str12, "Hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hI!" + "'", str14, "hI!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HI!" + "'", str15, "HI!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HI!" + "'", str16, "HI!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HHHI!IHHI!hi!" + "'", str18, "HHHI!IHHI!hi!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3756");
        char[] charArray5 = new char[] {};
        java.lang.String str6 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray5);
        java.lang.String str7 = org.apache.commons.lang.WordUtils.initials("", charArray5);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray5);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("HHHHHi!iHHHHHI!IHHI!HHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!", charArray5);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("hHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHiHhhi!Hhhi!Ihhi!!", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHiHhhi!Hhhi!Ihhi!!" + "'", str10, "hHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHiHhhi!Hhhi!Ihhi!!");
    }

    @Test
    public void test3757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3757");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhhhhi!hhhi!ihhi!!", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhhhi!hhhi!ihhi!!" + "'", str2, "Hhhhhi!hhhi!ihhi!!");
    }

    @Test
    public void test3758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3758");
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
        java.lang.String str21 = org.apache.commons.lang.WordUtils.initials("HhHI!", charArray11);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalize("hhhi!hhhi!ihhi!!", charArray11);
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hhhi!hhhi!ihhi!!" + "'", str22, "hhhi!hhhi!ihhi!!");
    }

    @Test
    public void test3759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3759");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhhHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!!", (int) (byte) 10, (int) (short) 0, "hhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHhhhi!hhhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!" + "'", str4, "hHhhhi!hhhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
    }

    @Test
    public void test3760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3760");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!", (int) (short) -1, (int) (short) 10, "Hhhhhi!ihhhhHHHI!IHHI!HI!!H");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHHHHHHHHIHhhhhi!ihhhhHHHI!IHHI!HI!!H" + "'", str4, "HHHHHHHHHIHhhhhi!ihhhhHHHI!IHHI!HI!!H");
    }

    @Test
    public void test3761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3761");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("Hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!" + "'", str1, "hHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!");
    }

    @Test
    public void test3762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3762");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hHHHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!HHI!IHI!!HI!!", (int) ' ', "hHhhi!hHhhi!hHhhi!iHhhi!!Hhhi!iHhhi!hHhhi!hHhhi!iHhhi!!Hhhi!hHhhi!hHhhi!hHhhi!iHhhi!!Hhhi!iHhhi!hHhhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!i!hHhhi!iHhhi!!Hhhi!!Hhhi!hHhhi!iHhhi!!Hhhi!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!HHI!IHI!!HI!!" + "'", str4, "hHHHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!HHI!IHI!!HI!!");
    }

    @Test
    public void test3763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3763");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hhI!HhI!HhI!HhI!ihI!!hI!ihI!HhI!HhI!ihI!!hI!hhI!ihI!!hI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test3764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3764");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("Hhhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhi!ihhi!!hhhi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test3765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3765");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhhhi!ihhi!hhi!ihi!!hi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhhhi!ihhi!hhi!ihi!!hi!!" + "'", str1, "Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhhhi!ihhi!hhi!ihi!!hi!!");
    }

    @Test
    public void test3766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3766");
        char[] charArray7 = new char[] {};
        java.lang.String str8 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("H", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("hh", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("HH", charArray7);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("HHhhI!IhhIhHh", charArray7);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("HhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!hhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!HhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!HhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!HhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!IhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!!hHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!IhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!HhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!HhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!IhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!!hHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!HhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!IhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!!hHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!!hHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!H", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hh" + "'", str11, "hh");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HH" + "'", str12, "HH");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HHhhI!IhhIhHh" + "'", str13, "HHhhI!IhhIhHh");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!hhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!HhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!HhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!HhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!IhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!!hHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!IhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!HhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!HhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!IhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!!hHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!HhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!IhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!!hHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!!hHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!H" + "'", str14, "HhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!hhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!HhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!HhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!HhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!IhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!!hHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!IhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!HhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!HhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!IhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!!hHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!HhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!IhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!!hHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!!hHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!H");
    }

    @Test
    public void test3767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3767");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hHHHHI!IHHHHHI!IHHI!HHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhhi!ihhhhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!" + "'", str1, "Hhhhhi!ihhhhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!");
    }

    @Test
    public void test3768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3768");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!!" + "'", str1, "hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!!");
    }

    @Test
    public void test3769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3769");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HHHi!iHHi!HhH", (int) (byte) 1, "hHHHHi!iHHHHHI!IHHI!HHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHHi!iHHi!HhH" + "'", str4, "HHHi!iHHi!HhH");
    }

    @Test
    public void test3770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3770");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("", (int) (byte) 1, "HhhhhhhhhiHHHHi!iHHi!hi!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test3771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3771");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhhhI!IhhI!HI!!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhhI!IhhI!HI!!" + "'", str2, "hhhhI!IhhI!HI!!");
    }

    @Test
    public void test3772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3772");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHH" + "'", str1, "HhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHH");
    }

    @Test
    public void test3773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3773");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHHI!IHHI!HHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!", (int) (short) 1, (int) (byte) 0, "Hhhi!hhhi!HhHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!!hHI!iHI!!ihHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!hHhhI!IhhI!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHhhi!hhhi!HhHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!!hHI!iHI!!ihHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!hHhhI!IhhI!!" + "'", str4, "HHhhi!hhhi!HhHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!!hHI!iHI!!ihHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!hHhhI!IhhI!!");
    }

    @Test
    public void test3774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3774");
        char[] charArray8 = new char[] {};
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("hhI!", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("HHi!", charArray8);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("Hhhhi!ihhi!hi!!hhhhi!ihhi!hi!!hhhhi!ihhi!hi!!ihhhi!ihhi!hi!!!hhhi!ihhi!hi!!ihhhi!ihhi!hi!!hhhhi!ihhi!hi!!hhhhi!ihhi!hi!!ihhhi!ihhi!hi!!!hhhi!ihhi!hi!!hhhhi!ihhi!hi!!hhhhi!ihhi!hi!!hhhhi!ihhi!hi!!hhhhi!ihhi!hi!!ihhhi!ihhi!hi!!!hhhi!ihhi!hi!!ihhhi!ihhi!hi!!hhhhi!ihhi!hi!!hhhhi!ihhi!hi!!ihhhi!ihhi!hi!!!hhhi!ihhi!hi!!hhhhi!ihhi!hi!!ihhhi!ihhi!hi!!!hhhi!ihhi!hi!!!hhhi!ihhi!hi!!h", charArray8);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HHi!" + "'", str14, "HHi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!" + "'", str16, "hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!");
    }

    @Test
    public void test3775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3775");
        char[] charArray12 = new char[] {};
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray12);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("", charArray12);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray12);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray12);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("", charArray12);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray12);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("H", charArray12);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.uncapitalize("hh", charArray12);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalizeFully("H", charArray12);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.uncapitalize("hHHI!hHHI!iHHI!!", charArray12);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.uncapitalize("HHHHI!IHHI!HI!!H", charArray12);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.initials("HhhH", charArray12);
        java.lang.Class<?> wildcardClass25 = charArray12.getClass();
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] {});
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hi!" + "'", str16, "Hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "h" + "'", str18, "h");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H" + "'", str19, "H");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hh" + "'", str20, "hh");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "H" + "'", str21, "H");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hHHI!hHHI!iHHI!!" + "'", str22, "hHHI!hHHI!iHHI!!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "HHHHI!IHHI!HI!!H" + "'", str23, "HHHHI!IHHI!HI!!H");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3776");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HhHHi!iHHi!HHHI!IHHI!!hi!!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HhHHi!iHHi!HHHI!IHHI!!hi!!" + "'", str2, "HhHHi!iHHi!HHHI!IHHI!!hi!!");
    }

    @Test
    public void test3777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3777");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("HhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!!hHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!!hHHHI!IHHI!HI!!!hHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!!hHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!!hHHHI!IHHI!HI!!!hHHHI!IHHI!HI!!HhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!!hHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!HhHHHI!IHHI!HI!!HhHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!!hHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!HhHHHI!IHHI!HI!!HhHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!!hHHHI!IHHI!HI!!ihHHHI!IHHI!HI!!HhHHHI!IHHI!HI!!HhHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!!hHHHI!IHHI!HI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!hHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!hHhhhi!ihhi!hi!!hHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!hHhhhi!ihhi!hi!!hHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!IHhhhi!ihhi!hi!!hHhhhi!ihhi!hi!!hHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!!" + "'", str1, "hHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!hHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!hHhhhi!ihhi!hi!!hHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!hHhhhi!ihhi!hi!!hHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!IHhhhi!ihhi!hi!!hHhhhi!ihhi!hi!!hHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!!");
    }

    @Test
    public void test3778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3778");
        char[] charArray9 = new char[] {};
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("Hh", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("HHHI!hHHI!iHHI!!", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhi!hhhiHhhi!hhhi!ihhi!!", charArray9);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhhI!IhhI!HI!!h", charArray9);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("HHHI!hHHI!hHi!HHhi!", charArray9);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("HHHi!iHHi!hi!!", charArray9);
        java.lang.Class<?> wildcardClass19 = charArray9.getClass();
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hh" + "'", str12, "Hh");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HHHI!hHHI!iHHI!!" + "'", str14, "HHHI!hHHI!iHHI!!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hhhhi!hhhiHhhi!hhhi!ihhi!!" + "'", str15, "Hhhhi!hhhiHhhi!hhhi!ihhi!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hhhhI!IhhI!HI!!h" + "'", str16, "hhhhI!IhhI!HI!!h");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3779");
        char[] charArray10 = new char[] {};
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray10);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("Hhhhhi!hhhhHHI!HHHI!IHHI!!", charArray10);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!", charArray10);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.initials("Hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhhhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hi!" + "'", str14, "Hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hi!" + "'", str17, "Hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!" + "'", str19, "hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test3780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3780");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.capitalizeFully("HHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!iHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!iHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!iHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!iHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!" + "'", str2, "Hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!");
    }

    @Test
    public void test3781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3781");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HHHI!HHHI!hhhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!HhhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!HHHI!hHHI!HHhi!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHHI!HHHI!hhhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!HhhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!HHHI!hHHI!HHhi!" + "'", str2, "HHHI!HHHI!hhhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!HhhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!HHHI!hHHI!HHhi!");
    }

    @Test
    public void test3782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3782");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhhhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihhhhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!!hh!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhhhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihhhhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!!hh!" + "'", str1, "Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhhhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihhhhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!!hh!");
    }

    @Test
    public void test3783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3783");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hHhhhi!hhhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHhhhi!hhhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!" + "'", str1, "HHhhhi!hhhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
    }

    @Test
    public void test3784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3784");
        char[] charArray6 = new char[] {};
        java.lang.String str7 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray6);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.initials("", charArray6);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalizeFully("Hh", charArray6);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray6);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray6);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("hHHHI!HHHIhhHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!IHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!!", charArray6);
        java.lang.Class<?> wildcardClass13 = charArray6.getClass();
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Hh" + "'", str9, "Hh");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3785");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hhhhhi!hhhhhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHHHI!HHHHHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!" + "'", str1, "HHHHHI!HHHHHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!");
    }

    @Test
    public void test3786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3786");
        char[] charArray10 = new char[] { '#', '4', '4', '4' };
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("HHi!", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("hhhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!IhhHhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!H!iHHHHi!iHHi!hi!!H", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '#', '4', '4', '4' });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hi!" + "'", str11, "Hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hi!" + "'", str12, "Hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H" + "'", str14, "H");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hhhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!IhhHhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!H!iHHHHi!iHHi!hi!!H" + "'", str16, "Hhhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!IhhHhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!H!iHHHHi!iHHi!hi!!H");
    }

    @Test
    public void test3787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3787");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("HhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HIhhHHHI!IHhHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhi!ihhi!!!Hhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhi!ihhi!!!Hhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhi!ihhi!!!Hhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhi!ihhi!!!Hhhhi!hhhiHhhi!hhhi!ihhi!!!Hhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhi!ihhi!!!Hhhhi!hhhiHhhi!hhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hihhhhhi!ihhhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!!" + "'", str1, "Hhhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hihhhhhi!ihhhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!!");
    }

    @Test
    public void test3788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3788");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HHh", 0, "HHHHHI!IHHhHhhhI!IhhhhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHHHHHI!IHHhHhhhI!IhhhhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!!HHHHHHI!IHHhHhhhI!IhhhhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!!h" + "'", str4, "HHHHHHI!IHHhHhhhI!IhhhhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!!HHHHHHI!IHHhHhhhI!IhhhhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!!h");
    }

    @Test
    public void test3789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3789");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hhhhhI!Ihhhhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhhhI!Ihhhhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!" + "'", str1, "hhhhhI!Ihhhhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!");
    }

    @Test
    public void test3790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3790");
        char[] charArray7 = new char[] {};
        java.lang.String str8 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("hi!", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("Hhhi!ihhi!!", charArray7);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("hh", charArray7);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray7);
        java.lang.Class<?> wildcardClass15 = charArray7.getClass();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3791");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHHhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhhHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!!" + "'", str1, "HHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhhHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!!");
    }

    @Test
    public void test3792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3792");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhHhh", (int) (short) 100, (int) (byte) 1, "HHhhhi!hhhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhHHhhhi!hhhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!" + "'", str4, "Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhHHhhhi!hhhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
    }

    @Test
    public void test3793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3793");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!HhHhhhi!ihhi!HHHi!iHHi!hi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test3794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3794");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!iHhi!Ihi!!!Hhi!Ihi!!iHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!!Hhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!!Hhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!!Hhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!!Hhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!!Hhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test3795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3795");
        char[] charArray9 = new char[] {};
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("Hi!", charArray9);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray9);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("hHHi!iHHi!!", charArray9);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHHHHI!IHHI!HHI!IHI!!HI!!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hi!" + "'", str13, "Hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hi!" + "'", str15, "Hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HI!" + "'", str16, "HI!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hHHi!iHHi!!" + "'", str17, "hHHi!iHHi!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHHHHI!IHHI!HHI!IHI!!HI!!" + "'", str18, "HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHHHHI!IHHI!HHI!IHI!!HI!!");
    }

    @Test
    public void test3796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3796");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HhH", (int) (byte) 100, "hhHHHI!IHHI!HI!!H", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HhH" + "'", str4, "HhH");
    }

    @Test
    public void test3797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3797");
        char[] charArray6 = new char[] {};
        java.lang.String str7 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray6);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.initials("", charArray6);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalizeFully("Hh", charArray6);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray6);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray6);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("HHHi!iHHi!hHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Hh" + "'", str9, "Hh");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HHHi!iHHi!hHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!" + "'", str12, "HHHi!iHHi!hHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!");
    }

    @Test
    public void test3798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3798");
        char[] charArray6 = new char[] {};
        java.lang.String str7 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray6);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.initials("", charArray6);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray6);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray6);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("hhhI!IhhI!HI!!", charArray6);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("hHhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!hHhhhi!hhhi!ihhi!!hHhhhi!hhhi!ihhi!!iHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!hHhhhi!hhhi!ihhi!!iHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!!", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hhhI!IhhI!HI!!" + "'", str11, "hhhI!IhhI!HI!!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test3799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3799");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhi!ihhi!HHHi!iHHi!hi!!", (int) (short) 100, 1, "hHHi!iHHi!hHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHHhhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhHHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!hHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!hhhi!Hhhi!hhHI!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end 100, length 24");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3800");
        char[] charArray9 = new char[] {};
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("hi!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("Hh", charArray9);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("hhhI!IhhI!HI!!", charArray9);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray9);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhi!ihhihhhhi!hhhi!ihhi!!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hi!" + "'", str13, "Hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hi!" + "'", str14, "Hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hh" + "'", str15, "Hh");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hhhI!IhhI!HI!!" + "'", str16, "hhhI!IhhI!HI!!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "h" + "'", str17, "h");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hhhhi!ihhihhhhi!hhhi!ihhi!!" + "'", str18, "Hhhhi!ihhihhhhi!hhhi!ihhi!!");
    }

    @Test
    public void test3801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3801");
        char[] charArray6 = new char[] {};
        java.lang.String str7 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray6);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.initials("", charArray6);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray6);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray6);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray6);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("HHHHi!iHHi!hi!!", charArray6);
        java.lang.Class<?> wildcardClass13 = charArray6.getClass();
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hi!" + "'", str10, "Hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HHHHi!iHHi!hi!!" + "'", str12, "HHHHi!iHHi!hi!!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3802");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhhhhhhhhhhhhhihhh!hhhhhhhhhhhhhhhihhh!hhhihhhhhhhhhhhihhh!hhh!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhhhhhhhhhhhhhihhh!hhhhhhhhhhhhhhhihhh!hhhihhhhhhhhhhhihhh!hhh!" + "'", str1, "Hhhhhhhhhhhhhhhhihhh!hhhhhhhhhhhhhhhihhh!hhhihhhhhhhhhhhihhh!hhh!");
    }

    @Test
    public void test3803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3803");
        char[] charArray13 = new char[] { '#', '4', '4', '4' };
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray13);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray13);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("", charArray13);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("HHi!", charArray13);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray13);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("hhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHHI!IHHIHHHi!iHHi!hHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!", charArray13);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("HhhI!IhhI!Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!", charArray13);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.initials("hhhhi!hhhi!ihhi!!", charArray13);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalize("", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '#', '4', '4', '4' });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hi!" + "'", str14, "Hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hi!" + "'", str15, "Hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H" + "'", str17, "H");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhhi!ihhihhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!" + "'", str19, "Hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhhi!ihhihhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!" + "'", str20, "Hhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "h" + "'", str21, "h");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test3804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3804");
        char[] charArray10 = new char[] {};
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("Hi!", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("HHI!", charArray10);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("HhHHI!HHHI!Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!", charArray10);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("hhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!IhHHI!hHHI!iHHI!!!hHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!IhHHI!hHHI!iHHI!!!hHHI!hHHI!iHHI!!IhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!IhHHI!hHHI!iHHI!!!hHHI!hHHI!iHHI!!!", charArray10);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.uncapitalize("hhhi!ihhi!hhi!ihi!!hi!!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hi!" + "'", str15, "Hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hi!" + "'", str16, "Hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HHI!" + "'", str17, "HHI!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HhHHI!HHHI!Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!" + "'", str18, "HhHHI!HHHI!Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!IhHHI!hHHI!iHHI!!!hHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!IhHHI!hHHI!iHHI!!!hHHI!hHHI!iHHI!!IhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!IhHHI!hHHI!iHHI!!!hHHI!hHHI!iHHI!!!" + "'", str19, "hhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!IhHHI!hHHI!iHHI!!!hHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!IhHHI!hHHI!iHHI!!!hHHI!hHHI!iHHI!!IhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!IhHHI!hHHI!iHHI!!!hHHI!hHHI!iHHI!!!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hhhi!ihhi!hhi!ihi!!hi!!" + "'", str20, "hhhi!ihhi!hhi!ihi!!hi!!");
    }

    @Test
    public void test3805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3805");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("HhhI!IhhI!hHHHi!iHHi!hi!!H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHi!iHHi!HhhhI!IhhI!HI!!h" + "'", str1, "hHHi!iHHi!HhhhI!IhhI!HI!!h");
    }

    @Test
    public void test3806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3806");
        char[] charArray13 = new char[] { '#', '4', '4', '4' };
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray13);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray13);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("", charArray13);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray13);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray13);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.initials("Hhhi!ihhi!!", charArray13);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("hh", charArray13);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.initials("hhhhhhhhhhhhhhhhihhh!hhhhhhhhhhhhhhhihhh!hhhihhhhhhhhhhhihhh!hhh!", charArray13);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHHI!HHHI!IHHI!!", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '#', '4', '4', '4' });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hi!" + "'", str14, "Hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hi!" + "'", str15, "Hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H" + "'", str17, "H");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H" + "'", str18, "H");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H" + "'", str19, "H");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hh" + "'", str20, "Hh");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "h" + "'", str21, "h");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Hhhhi!hhhi!ihhi!!" + "'", str22, "Hhhhi!hhhi!ihhi!!");
    }

    @Test
    public void test3807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3807");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHH", (-1), (int) '4', "hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhHhhi!hhhi!hhhi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHhhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhHhhi!hhhi!hhhi!" + "'", str4, "HhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHhhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhHhhi!hhhi!hhhi!");
    }

    @Test
    public void test3808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3808");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhhhi!hhhiHhhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhhhhi!hhhihhhi!hhhi!ihhi!!hi!!ihhhhi!ihhi!!!hhhhi!ihhi!!hhhhhhhhhi!hhhihhhi!hhhi!ihhi!!i!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!hhhhi!ihhi!!!hhhhi!ihhi!!ihhhhi!ihhhhhhi!hhhihhhi!hhhi!ihhi!!i!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhihhhhi!hhhihhhi!hhhi!ihhi!!!ihhi!!!hhhhi!ihhi!!!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhhi!hhhiHhhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhhhhi!hhhihhhi!hhhi!ihhi!!hi!!ihhhhi!ihhi!!!hhhhi!ihhi!!hhhhhhhhhi!hhhihhhi!hhhi!ihhi!!i!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!hhhhi!ihhi!!!hhhhi!ihhi!!ihhhhi!ihhhhhhi!hhhihhhi!hhhi!ihhi!!i!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhihhhhi!hhhihhhi!hhhi!ihhi!!!ihhi!!!hhhhi!ihhi!!!" + "'", str2, "Hhhhi!hhhiHhhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhhhhi!hhhihhhi!hhhi!ihhi!!hi!!ihhhhi!ihhi!!!hhhhi!ihhi!!hhhhhhhhhi!hhhihhhi!hhhi!ihhi!!i!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!hhhhi!ihhi!!!hhhhi!ihhi!!ihhhhi!ihhhhhhi!hhhihhhi!hhhi!ihhi!!i!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhihhhhi!hhhihhhi!hhhi!ihhi!!!ihhi!!!hhhhi!ihhi!!!");
    }

    @Test
    public void test3809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3809");
        char[] charArray8 = new char[] {};
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhhi!ihhi!hi!!h", charArray8);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!ihhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!!", charArray8);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("HhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hi!" + "'", str12, "Hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hhhhhi!ihhi!hi!!h" + "'", str14, "Hhhhhi!ihhi!hi!!h");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!ihhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!!" + "'", str15, "Hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!ihhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!!" + "'", str16, "HhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!!");
    }

    @Test
    public void test3810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3810");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hhhi!hhhi!ihhi!!", (int) (short) 1, "hH", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhHhhHhhHihH!hHhhHhhHhhHihH!hHihHhhHhhHihH!hH!" + "'", str4, "hhHhhHhhHihH!hHhhHhhHhhHihH!hHihHhhHhhHihH!hH!");
    }

    @Test
    public void test3811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3811");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hHhi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHhi!" + "'", str1, "HHhi!");
    }

    @Test
    public void test3812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3812");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHhhI!IhhI!hHHHi!iHHi!hi!!HHHhhI!IhhI!hHHHi!iHHi!hi!!HHHhhI!IhhI!hHHHi!iHHi!hi!!HHHhhI!IhhI!hHHHi!iHHi!hi!!HiHhhI!IhhI!hHHHi!iHHi!hi!!H!HhhI!IhhI!hHHHi!iHHi!hi!!HiHhhI!IhhI!hHHHi!iHHi!hi!!HHHhhI!IhhI!hHHHi!iHHi!hi!!HHHhhI!IhhI!hHHHi!iHHi!hi!!HiHhhI!IhhI!hHHHi!iHHi!hi!!H!HhhI!IhhI!hHHHi!iHHi!hi!!HhHhhI!IhhI!hHHHi!iHHi!hi!!HiHhhI!IhhI!hHHHi!iHHi!hi!!H!HhhI!IhhI!hHHHi!iHHi!hi!!H!HhhI!IhhI!hHHHi!iHHi!hi!!HH", (int) '4', (int) (short) 0, "HHHI!hHHI!hHi!HHhi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHhhI!IhhI!hHHHi!iHHi!hi!!HHHhhI!IhhI!hHHHi!iHHi!hi!HHHI!hHHI!hHi!HHhi!" + "'", str4, "hHhhI!IhhI!hHHHi!iHHi!hi!!HHHhhI!IhhI!hHHHi!iHHi!hi!HHHI!hHHI!hHi!HHhi!");
    }

    @Test
    public void test3813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3813");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HhI!HhI!HhI!HhI!ihI!!hI!ihI!HhI!HhI!ihI!!hI!hhI!ihI!!hI!!", 100, (int) (byte) 1, "hHHHHI!IHHI!!HHHHHI!IHHI!!HHHHHI!IHHI!!IHHHHI!IHHI!!HHHI!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end 100, length 57");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3814");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!", (int) (short) 1, (int) (byte) 100, "hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!" + "'", str4, "hhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!");
    }

    @Test
    public void test3815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3815");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hhhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhi!ihhi!!hhhi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHHHI!IHHI!!HHHHHI!IHHI!!HHHHHI!IHHI!!IHHHHI!IHHI!!HHHI!" + "'", str1, "HHHHHI!IHHI!!HHHHHI!IHHI!!HHHHHI!IHHI!!IHHHHI!IHHI!!HHHI!");
    }

    @Test
    public void test3816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3816");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hhhhhi!ihhi!hi!!h", (int) (short) 100, "hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!iHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!iHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!iHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!iHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhhhi!ihhi!hi!!h" + "'", str4, "hhhhhi!ihhi!hi!!h");
    }

    @Test
    public void test3817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3817");
        char[] charArray7 = new char[] {};
        java.lang.String str8 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("hI!", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("h", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("HI!", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("hHHi!iHHi!HHHI!IHHI!!hi!!", charArray7);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("hhhi!Hhhi!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!!", charArray7);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("HHhhI!IhhI!hHHHi!iHHi!hi!!HHHhhI!IhhI!hHHHi!iHHi!hi!!HHHhhI!IhhI!hHHHi!iHHi!hi!!HHHhhI!IhhI!hHHHi!iHHi!hi!!HiHhhI!IhhI!hHHHi!iHHi!hi!!H!HhhI!IhhI!hHHHi!iHHi!hi!!HiHhhI!IhhI!hHHHi!iHHi!hi!!HHHhhI!IhhI!hHHHi!iHHi!hi!!HHHhhI!IhhI!hHHHi!iHHi!hi!!HiHhhI!IhhI!hHHHi!iHHi!hi!!H!HhhI!IhhI!hHHHi!iHHi!hi!!HhHhhI!IhhI!hHHHi!iHHi!hi!!HiHhhI!IhhI!hHHHi!iHHi!hi!!H!HhhI!IhhI!hHHHi!iHHi!hi!!H!HhhI!IhhI!hHHHi!iHHi!hi!!HH", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hI!" + "'", str9, "hI!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hHHi!iHHi!HHHI!IHHI!!hi!!" + "'", str12, "hHHi!iHHi!HHHI!IHHI!!hi!!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hhhi!Hhhi!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!!" + "'", str13, "hhhi!Hhhi!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HHhhI!IhhI!hHHHi!iHHi!hi!!HHHhhI!IhhI!hHHHi!iHHi!hi!!HHHhhI!IhhI!hHHHi!iHHi!hi!!HHHhhI!IhhI!hHHHi!iHHi!hi!!HiHhhI!IhhI!hHHHi!iHHi!hi!!H!HhhI!IhhI!hHHHi!iHHi!hi!!HiHhhI!IhhI!hHHHi!iHHi!hi!!HHHhhI!IhhI!hHHHi!iHHi!hi!!HHHhhI!IhhI!hHHHi!iHHi!hi!!HiHhhI!IhhI!hHHHi!iHHi!hi!!H!HhhI!IhhI!hHHHi!iHHi!hi!!HhHhhI!IhhI!hHHHi!iHHi!hi!!HiHhhI!IhhI!hHHHi!iHHi!hi!!H!HhhI!IhhI!hHHHi!iHHi!hi!!H!HhhI!IhhI!hHHHi!iHHi!hi!!HH" + "'", str14, "HHhhI!IhhI!hHHHi!iHHi!hi!!HHHhhI!IhhI!hHHHi!iHHi!hi!!HHHhhI!IhhI!hHHHi!iHHi!hi!!HHHhhI!IhhI!hHHHi!iHHi!hi!!HiHhhI!IhhI!hHHHi!iHHi!hi!!H!HhhI!IhhI!hHHHi!iHHi!hi!!HiHhhI!IhhI!hHHHi!iHHi!hi!!HHHhhI!IhhI!hHHHi!iHHi!hi!!HHHhhI!IhhI!hHHHi!iHHi!hi!!HiHhhI!IhhI!hHHHi!iHHi!hi!!H!HhhI!IhhI!hHHHi!iHHi!hi!!HhHhhI!IhhI!hHHHi!iHHi!hi!!HiHhhI!IhhI!hHHHi!iHHi!hi!!H!HhhI!IhhI!hHHHi!iHHi!hi!!H!HhhI!IhhI!hHHHi!iHHi!hi!!HH");
    }

    @Test
    public void test3818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3818");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hhhhhi!ihhHHHHI!IHHIhHHHHHHHHIHH!HHHhhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhIhHHI!hHHI!iHHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHHHI!IHHhhhhi!ihhiHhhhhhhhhihh!hhhHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHiHhhi!Hhhi!Ihhi!!" + "'", str1, "HHHHHI!IHHhhhhi!ihhiHhhhhhhhhihh!hhhHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHiHhhi!Hhhi!Ihhi!!");
    }

    @Test
    public void test3819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3819");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HhhhhhhhhiHhhhi!hhhihhhhi!hhhihhhi!ihhi!hi!!!ihhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhhhhhhhiHhhhi!hhhihhhhi!hhhihhhi!ihhi!hi!!!ihhi!!" + "'", str1, "hhhhhhhhhiHhhhi!hhhihhhhi!hhhihhhi!ihhi!hi!!!ihhi!!");
    }

    @Test
    public void test3820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3820");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhI!HhI!HhhhHHI!HHHI!Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!", (int) (short) 1, 10, "hHh");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhI!HhI!HhhHh" + "'", str4, "hhI!HhI!HhhHh");
    }

    @Test
    public void test3821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3821");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("Hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhihhhhi!ihhi!hi!!h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhihhhhi!ihhi!hi!!h" + "'", str1, "Hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhihhhhi!ihhi!hi!!h");
    }

    @Test
    public void test3822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3822");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hhHi!HhHi!HhHi!HhHi!HhHi!IhHi!!hHi!HhHi!HhHi!HhHi!HhHi!HhHi!HhHi!HhHi!HhHi!IhHi!!hHi!IhHi!HhHi!HhHi!IhHi!!hHi!!hHi!HhHi!HhHi!HhHi!HhHi!IhHi!!hHi!IhHi!HhHi!HhHi!IhHi!!hHi!!hHi!HhHi!HhHi!HhHi!HhHi!IhHi!!hHi!IhHi!HhHi!HhHi!IhHi!!hHi!!hHi!HhHi!HhHi!HhHi!HhHi!IhHi!!hHi!IhHi!HhHi!HhHi!IhHi!!hHi!!hHi!IhHi!HhHi!HhHi!HhHi!IhHi!!hHi!IhHi!HhHi!HhHi!IhHi!!hHi!!hHi!!hHi!HhHi!HhHi!HhHi!IhHi!!hHi!IhHi!HhHi!HhHi!IhHi!!hHi!!hHi!IhHi!HhHi!HhHi!HhHi!IhHi!!hHi!IhHi!HhHi!HhHi!IhHi!!hHi!!hHi!HhHi!HhHi!HhHi!HhHi!IhHi!!hHi!IhHi!HhHi!HhHi!IhHi!!hHi!!hHi!HhHi!HhHi!HhHi!HhHi!IhHi!!hHi!IhHi!HhHi!HhHi!IhHi!!hHi!!hHi!IhHi!HhHi!HhHi!HhHi!IhHi!!hHi!IhHi!HhHi!HhHi!IhHi!!hHi!!hHi!!hHi!HhHi!HhHi!HhHi!IhHi!!hHi!IhHi!HhHi!HhHi!IhHi!!hHi!!hHi!HhHi!HhHi!HhHi!HhHi!IhHi!!hHi!IhHi!HhHi!HhHi!IhHi!!hHi!!hHi!IhHi!HhHi!HhHi!HhHi!IhHi!!hHi!IhHi!HhHi!HhHi!IhHi!!hHi!!hHi!!hHi!HhHi!HhHi!HhHi!IhHi!!hHi!IhHi!HhHi!HhHi!IhHi!!hHi!!hHi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHhI!hHhI!hHhI!hHhI!hHhI!iHhI!!HhI!hHhI!hHhI!hHhI!hHhI!hHhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!hHhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!hHhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!hHhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!iHhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!!HhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!iHhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!hHhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!hHhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!iHhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!!HhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!hHhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!iHhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!!HhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!!" + "'", str1, "HHhI!hHhI!hHhI!hHhI!hHhI!iHhI!!HhI!hHhI!hHhI!hHhI!hHhI!hHhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!hHhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!hHhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!hHhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!iHhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!!HhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!iHhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!hHhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!hHhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!iHhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!!HhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!hHhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!iHhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!!HhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!!");
    }

    @Test
    public void test3823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3823");
        char[] charArray6 = new char[] { ' ' };
        java.lang.String str7 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray6);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalize("Hhi!", charArray6);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("H", charArray6);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("hHHHi!iHHi!hi!!", charArray6);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("HHHHHI!IHHhhhhi!ihhiHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!", charArray6);
        java.lang.Class<?> wildcardClass12 = charArray6.getClass();
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { ' ' });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hhi!" + "'", str8, "Hhi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "h" + "'", str9, "h");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "h" + "'", str10, "h");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HHHHHI!IHHhhhhi!ihhiHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!" + "'", str11, "HHHHHI!IHHhhhhi!ihhiHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3824");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("HhhhhhhhhihHHi!iHHi!hHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test3825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3825");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihHHHHHI!IHHI!!HHHHHI!IHHI!!HHHHHI!IHHHHHI!HHHIHHHI!HHHI!IHHI!!HI!!IHHHHI!IHHI!!!HHHHI!IHHI!!HHHHHHhhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhHhhi!ihhi!HHI!iHI!!hi!!HHHI!HHHIHHHI!HHHI!IHHI!!I!IHHI!!HHHHHI!IHHI!!HHHHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHI!IHHI!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhHhhi!ihhi!HHI!iHI!!hi!!!!HHHHI!IHHI!!IHHHHI!IHHHHHHI!HHHIHHHI!HHHI!IHHI!!I!!HHHHHI!IHHI!!HHHHHI!IHHI!!IHHHHIHHHHI!HHHIHHhhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhHhhi!ihhi!HHI!iHI!!hi!!HI!HHHI!IHHI!!!IHHI!!!HHHHI!IHHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test3826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3826");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hHhhHhhHhhHhIHh!HhIHhhHhhHhIHh!Hh!HhhHhhHhhHhhHhIHh!HhIHhhHhhHhIHh!Hh!HhhHhhHhhHhhHhIHh!HhIHhhHhhHhIHh!Hh!HhhHhhHhhHhhHhIHh!HhIHhhHhhHhIHh!Hh!HhiHhhHhhHhhHhIHh!HhIHhhHhhHhIHh!Hh!Hh!HhhHhhHhhHhIHh!HhIHhhHhhHhIHh!Hh!HhiHhhHhhHhhHhIHh!HhIHhhHhhHhIHh!Hh!HhhHhhHhhHhhHhIHh!HhIHhhHhhHhIHh!Hh!HhhHhhHhhHhhHhIHh!HhIHhhHhhHhIHh!Hh!HhiHhhHhhHhhHhIHh!HhIHhhHhhHhIHh!Hh!Hh!HhhHhhHhhHhIHh!HhIHhhHhhHhIHh!Hh!HhhHhhHhhHhhHhIHh!HhIHhhHhhHhIHh!Hh!HhiHhhHhhHhhHhIHh!HhIHhhHhhHhIHh!Hh!Hh!HhhHhhHhhHhIHh!HhIHhhHhhHhIHh!Hh!Hh!", (int) (short) 100, "", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHhhHhhHhhHhIHh!HhIHhhHhhHhIHh!Hh!HhhHhhHhhHhhHhIHh!HhIHhhHhhHhIHh!Hh!HhhHhhHhhHhhHhIHh!HhIHhhHhhHhIHh!Hh!HhhHhhHhhHhhHhIHh!HhIHhhHhhHhIHh!Hh!HhiHhhHhhHhhHhIHh!HhIHhhHhhHhIHh!Hh!Hh!HhhHhhHhhHhIHh!HhIHhhHhhHhIHh!Hh!HhiHhhHhhHhhHhIHh!HhIHhhHhhHhIHh!Hh!HhhHhhHhhHhhHhIHh!HhIHhhHhhHhIHh!Hh!HhhHhhHhhHhhHhIHh!HhIHhhHhhHhIHh!Hh!HhiHhhHhhHhhHhIHh!HhIHhhHhhHhIHh!Hh!Hh!HhhHhhHhhHhIHh!HhIHhhHhhHhIHh!Hh!HhhHhhHhhHhhHhIHh!HhIHhhHhhHhIHh!Hh!HhiHhhHhhHhhHhIHh!HhIHhhHhhHhIHh!Hh!Hh!HhhHhhHhhHhIHh!HhIHhhHhhHhIHh!Hh!Hh!" + "'", str4, "hHhhHhhHhhHhIHh!HhIHhhHhhHhIHh!Hh!HhhHhhHhhHhhHhIHh!HhIHhhHhhHhIHh!Hh!HhhHhhHhhHhhHhIHh!HhIHhhHhhHhIHh!Hh!HhhHhhHhhHhhHhIHh!HhIHhhHhhHhIHh!Hh!HhiHhhHhhHhhHhIHh!HhIHhhHhhHhIHh!Hh!Hh!HhhHhhHhhHhIHh!HhIHhhHhhHhIHh!Hh!HhiHhhHhhHhhHhIHh!HhIHhhHhhHhIHh!Hh!HhhHhhHhhHhhHhIHh!HhIHhhHhhHhIHh!Hh!HhhHhhHhhHhhHhIHh!HhIHhhHhhHhIHh!Hh!HhiHhhHhhHhhHhIHh!HhIHhhHhhHhIHh!Hh!Hh!HhhHhhHhhHhIHh!HhIHhhHhhHhIHh!Hh!HhhHhhHhhHhhHhIHh!HhIHhhHhhHhIHh!Hh!HhiHhhHhhHhhHhIHh!HhIHhhHhhHhIHh!Hh!Hh!HhhHhhHhhHhIHh!HhIHhhHhhHhIHh!Hh!Hh!");
    }

    @Test
    public void test3827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3827");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHHI!IHHI!HHH", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHHI!IHHI!HHH" + "'", str2, "hHHI!IHHI!HHH");
    }

    @Test
    public void test3828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3828");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hhhi!hhhi!hhhhhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!ihi!!hi!hhi!ihi!!hi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!hhhi!hhhhhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!ihi!!hi!hhi!ihi!!hi!!" + "'", str1, "Hhhi!hhhi!hhhhhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!ihi!!hi!hhi!ihi!!hi!!");
    }

    @Test
    public void test3829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3829");
        char[] charArray8 = new char[] {};
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("hH", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("hI!", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray8);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("hhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!Hhihi!!hi!hhi!ihi!!hi!!", charArray8);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hi!" + "'", str11, "Hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hI!" + "'", str13, "hI!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HI!" + "'", str14, "HI!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!Hhihi!!hi!hhi!ihi!!hi!!" + "'", str15, "hhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!Hhihi!!hi!hhi!ihi!!hi!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test3830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3830");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.capitalizeFully("HHhhi!hhhi!HhHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!!hHI!iHI!!ihHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!hHhhI!IhhI!!", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhhi!hhhi!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhhi!ihhi!!" + "'", str2, "Hhhhi!hhhi!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhhi!ihhi!!");
    }

    @Test
    public void test3831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3831");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!hHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!hHhhhi!ihhi!hi!!hHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!hHhhhi!ihhi!hi!!hHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!IHhhhi!ihhi!hi!!hHhhhi!ihhi!hi!!hHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!!", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!hHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!hHhhhi!ihhi!hi!!hHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!hHhhhi!ihhi!hi!!hHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!IHhhhi!ihhi!hi!!hHhhhi!ihhi!hi!!hHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!!" + "'", str2, "hHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!hHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!hHhhhi!ihhi!hi!!hHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!hHhhhi!ihhi!hi!!hHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!IHhhhi!ihhi!hi!!hHhhhi!ihhi!hi!!hHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!!");
    }

    @Test
    public void test3832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3832");
        char[] charArray7 = new char[] {};
        java.lang.String str8 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("Hh", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("HHHI!hHHI!iHHI!!", charArray7);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhi!hhhiHhhi!hhhi!ihhi!!", charArray7);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("Hhi!", charArray7);
        java.lang.Class<?> wildcardClass15 = charArray7.getClass();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hh" + "'", str10, "Hh");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HHHI!hHHI!iHHI!!" + "'", str12, "HHHI!hHHI!iHHI!!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hhhhi!hhhiHhhi!hhhi!ihhi!!" + "'", str13, "Hhhhi!hhhiHhhi!hhhi!ihhi!!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3833");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("Hhi!Ihi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test3834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3834");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HHH", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHH" + "'", str2, "HHH");
    }

    @Test
    public void test3835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3835");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("Hhhhi!hhhihhhhi!!ihhi!!", (int) (short) 100, "Hhhi!ihhi!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhhi!hhhihhhhi!!ihhi!!" + "'", str4, "Hhhhi!hhhihhhhi!!ihhi!!");
    }

    @Test
    public void test3836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3836");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("Hhhhi!hhhiHhhi!hhhi!ihhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!hhhiHhhi!hhhi!ihhi!!" + "'", str1, "Hhhhi!hhhiHhhi!hhhi!ihhi!!");
    }

    @Test
    public void test3837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3837");
        char[] charArray6 = new char[] { ' ', 'a', 'a' };
        java.lang.String str7 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray6);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.initials("hhhi!ihhi!!", charArray6);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!hhhi!ihhi!!hi!!", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { ' ', 'a', 'a' });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "h" + "'", str8, "h");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!hhhi!ihhi!!hi!!" + "'", str9, "Hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!hhhi!ihhi!!hi!!");
    }

    @Test
    public void test3838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3838");
        char[] charArray7 = new char[] {};
        java.lang.String str8 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("hi!", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("Hhhi!ihhi!!", charArray7);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("HHHHI!HHHIHHHI!HHHI!IHHI!!", charArray7);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("HHh", charArray7);
        java.lang.Class<?> wildcardClass15 = charArray7.getClass();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HHh" + "'", str14, "HHh");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3839");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhhi!ihhi!hhhhi!ihhi!hi!!hhhhhi!ihhi!hhhhi!ihhi!hi!!hhhhhi!ihhi!hhhhi!ihhi!hi!!hhhhhi!ihhi!hhhhi!ihhi!hi!!hihhhi!ihhi!hhhhi!ihhi!hi!!h!hhhi!ihhi!hhhhi!ihhi!hi!!hihhhi!ihhi!hhhhi!ihhi!hi!!hhhhhi!ihhi!hhhhi!ihhi!hi!!hhhhhi!ihhi!hhhhi!ihhi!hi!!hihhhi!ihhi!hhhhi!ihhi!hi!!h!hhhi!ihhi!hhhhi!ihhi!hi!!hhhhhi!ihhi!hhhhi!ihhi!hi!!hihhhi!ihhi!hhhhi!ihhi!hi!!h!hhhi!ihhi!hhhhi!ihhi!hi!!h!hhhi!ihhi!hhhhi!ihhi!hi!!hh", (int) (byte) -1, (-1), "hhHHHI!IHHI!!hhHHHI!IHHI!!hhHHHI!IHhHHHI!HHHIhHHI!HHHI!IHHI!!HI!!ihHHHI!IHHI!!!hHHHI!IHHI!!hhHHHhHHHI!HHHIhHHI!HHHI!IHHI!!I!IHHI!!hhHHHI!IHHI!!hhHHHI!IHHI!!ihHHHI!HHHIhHHI!HHHI!IHHI!!hHHHI!IHHI!!!hHHHI!IHHI!!ihHHHI!IHHhHHHI!HHHIhHHI!HHHI!IHHI!!I!!hhHHHI!IHHI!!hhHHHI!IHHI!!ihHHHIhHHHI!HHHIhHHI!HHHI!IHHI!!!IHHI!!!hHHHI!IHHI!!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhhi!ihhi!hhhhi!ihhi!hi!!hhhhhi!ihhi!hhhhi!ihhi!hi!!hhhhhi!ihhi!hhhhi!ihhi!hi!!hhhhhi!ihhi!hhhhi!ihhi!hi!!hihhhi!ihhi!hhhhi!ihhi!hi!!h!hhhi!ihhi!hhhhi!ihhi!hi!!hihhhi!ihhi!hhhhi!ihhi!hi!!hhhhhi!ihhi!hhhhi!ihhi!hi!!hhhhhi!ihhi!hhhhi!ihhi!hi!!hihhhi!ihhi!hhhhi!ihhi!hi!!h!hhhi!ihhi!hhhhi!ihhi!hi!!hhhhhi!ihhi!hhhhi!ihhi!hi!!hihhhi!ihhi!hhhhi!ihhi!hi!!h!hhhi!ihhi!hhhhi!ihhi!hi!!h!hhhi!ihhi!hhhhi!ihhi!hi!!hh" + "'", str4, "Hhhhi!ihhi!hhhhi!ihhi!hi!!hhhhhi!ihhi!hhhhi!ihhi!hi!!hhhhhi!ihhi!hhhhi!ihhi!hi!!hhhhhi!ihhi!hhhhi!ihhi!hi!!hihhhi!ihhi!hhhhi!ihhi!hi!!h!hhhi!ihhi!hhhhi!ihhi!hi!!hihhhi!ihhi!hhhhi!ihhi!hi!!hhhhhi!ihhi!hhhhi!ihhi!hi!!hhhhhi!ihhi!hhhhi!ihhi!hi!!hihhhi!ihhi!hhhhi!ihhi!hi!!h!hhhi!ihhi!hhhhi!ihhi!hi!!hhhhhi!ihhi!hhhhi!ihhi!hi!!hihhhi!ihhi!hhhhi!ihhi!hi!!h!hhhi!ihhi!hhhhi!ihhi!hi!!h!hhhi!ihhi!hhhhi!ihhi!hi!!hh");
    }

    @Test
    public void test3840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3840");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hhhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hHhhI!IhhIHHHHI!HHHI!IHHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hHhhI!IhhIHHHHI!HHHI!IHHI!!" + "'", str1, "Hhhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hHhhI!IhhIHHHHI!HHHI!IHHI!!");
    }

    @Test
    public void test3841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3841");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("HHhhi!hhhi!HhHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!!hHI!iHI!!ihHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!hHhhI!IhhI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhHHI!HHHI!hHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!!Hhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!HhHHi!iHHi!!" + "'", str1, "hhHHI!HHHI!hHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!!Hhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!HhHHi!iHHi!!");
    }

    @Test
    public void test3842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3842");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!hHHi!iHHi!HHHI!IHHI!!hi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!hHHi!iHHi!HHHI!IHHI!!hi!!" + "'", str1, "hHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!hHHi!iHHi!HHHI!IHHI!!hi!!");
    }

    @Test
    public void test3843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3843");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hi!", (int) (byte) 1, "hHHhHHhHHiHH!HHhHHhHHhHHiHH!HHhHHhHHhHHiHH!HHIHHhHHhHHiHH!HH!HHhHHhHHiHH!HHIHHhHHhHHiHH!HHhHHhHHhhHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!!Hhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!!Hhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!!Hhi!Ihi!!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test3844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3844");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("HHhhi!ihhi!hi!!HHhhi!ihhi!hi!!HHhhi!ihhi!hi!!IHhhi!ihhi!hi!!!Hhhi!ihhi!hi!!IHhhi!ihhi!hi!!HHhhi!ihhihHHHI!HHHIhHHI!HHHI!IHHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHhhi!ihhi!hi!!HHhhi!ihhi!hi!!HHhhi!ihhi!hi!!IHhhi!ihhi!hi!!!Hhhi!ihhi!hi!!IHhhi!ihhi!hi!!HHhhi!ihhihHHHI!HHHIhHHI!HHHI!IHHI!!" + "'", str1, "HHhhi!ihhi!hi!!HHhhi!ihhi!hi!!HHhhi!ihhi!hi!!IHhhi!ihhi!hi!!!Hhhi!ihhi!hi!!IHhhi!ihhi!hi!!HHhhi!ihhihHHHI!HHHIhHHI!HHHI!IHHI!!");
    }

    @Test
    public void test3845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3845");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhhhi!hhhHhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhhi!hhhhhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!" + "'", str1, "Hhhhhi!hhhhhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!");
    }

    @Test
    public void test3846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3846");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hHHI!hHHI!HHhi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHI!hHHI!HHhi!" + "'", str1, "HHHI!hHHI!HHhi!");
    }

    @Test
    public void test3847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3847");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hhhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!HhhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!Hhhi!ihhi!HHI!iHI!!hi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test3848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3848");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HHHI!HHHI!HHHI!iHHI!!HHI!iHHI!HHHI!HHHI!iHHI!!HHI!hHHI!iHHI!!HHI!!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHHI!HHHI!HHHI!iHHI!!HHI!iHHI!HHHI!HHHI!iHHI!!HHI!hHHI!iHHI!!HHI!!" + "'", str2, "HHHI!HHHI!HHHI!iHHI!!HHI!iHHI!HHHI!HHHI!iHHI!!HHI!hHHI!iHHI!!HHI!!");
    }

    @Test
    public void test3849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3849");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhhhi!ihhi!hi!!h", (int) (short) 1, (-1), "hHHHI!IHHI!HHHHI!IHHI!HI!!HHHHHI!IHHI!HHHHI!IHHI!HI!!HHHHHI!IHHI!HHHHI!IHHI!HI!!HHHHHI!IHHI!HHHHI!IHHI!HI!!HIHHHI!IHHI!HHHHI!IHHI!HI!!H!HHHI!IHHI!HHHHI!IHHI!HI!!HIHHHI!IHHI!HHHHI!IHHI!HI!!HHHHHI!IHHI!HHHHI!IHHI!HI!!HHHHHI!IHHI!HHHHI!IHHI!HI!!HIHHHI!IHHI!HHHHI!IHHI!HI!!H!HHHI!IHHI!HHHHI!IHHI!HI!!HHHHHI!IHHI!HHHHI!IHHI!HI!!HIHHHI!IHHI!HHHHI!IHHI!HI!!H!HHHI!IHHI!HHHHI!IHHI!HI!!H!HHHI!IHHI!HHHHI!IHHI!HI!!HH");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhhi!ihhi!hi!!h" + "'", str4, "hhhhi!ihhi!hi!!h");
    }

    @Test
    public void test3850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3850");
        char[] charArray11 = new char[] {};
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("hi!", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray11);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("", charArray11);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("hH", charArray11);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.uncapitalize("hhhi!Hhhi!Ihhi!!", charArray11);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.uncapitalize("hhhi!hhhi!hhhi!", charArray11);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray11);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.initials("hHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] {});
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hi!" + "'", str15, "Hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hH" + "'", str18, "hH");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hhhi!Hhhi!Ihhi!!" + "'", str19, "hhhi!Hhhi!Ihhi!!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hhhi!hhhi!hhhi!" + "'", str20, "hhhi!hhhi!hhhi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test3851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3851");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHI!HHHI!HHhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!hhhi!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!" + "'", str1, "Hhhi!hhhi!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
    }

    @Test
    public void test3852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3852");
        char[] charArray13 = new char[] {};
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray13);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("", charArray13);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray13);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray13);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("", charArray13);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray13);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("H", charArray13);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.uncapitalize("hh", charArray13);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalizeFully("H", charArray13);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.initials("hi!", charArray13);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.initials("Hhhi!ihhi!hi!!", charArray13);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.uncapitalize("HhhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhIhHHI!hHHI!iHHI!!", charArray13);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.uncapitalize("hhHHHI!IHHI!!hhHHHI!IHHI!!hhHHHI!IHHI!!ihHHHI!IHHI!!!hHHHI!IHHI!!hhHHHI!IHHI!!hhHHHI!IHHI!!hhHHHIHhH!IHHI!!ihHHHI!IHHI!!!hHHHI!IHHI!!ihHHHI!IHHI!!hhHHHI!IHHI!!hhHHHI!IHHI!!ihHHHI!IHHI!!!hHHHI!IHHI!HhH!!", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] {});
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hi!" + "'", str17, "Hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "h" + "'", str19, "h");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H" + "'", str20, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hh" + "'", str21, "hh");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "H" + "'", str22, "H");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "HhhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhIhHHI!hHHI!iHHI!!" + "'", str25, "HhhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhIhHHI!hHHI!iHHI!!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hhHHHI!IHHI!!hhHHHI!IHHI!!hhHHHI!IHHI!!ihHHHI!IHHI!!!hHHHI!IHHI!!hhHHHI!IHHI!!hhHHHI!IHHI!!hhHHHIHhH!IHHI!!ihHHHI!IHHI!!!hHHHI!IHHI!!ihHHHI!IHHI!!hhHHHI!IHHI!!hhHHHI!IHHI!!ihHHHI!IHHI!!!hHHHI!IHHI!HhH!!" + "'", str26, "hhHHHI!IHHI!!hhHHHI!IHHI!!hhHHHI!IHHI!!ihHHHI!IHHI!!!hHHHI!IHHI!!hhHHHI!IHHI!!hhHHHI!IHHI!!hhHHHIHhH!IHHI!!ihHHHI!IHHI!!!hHHHI!IHHI!!ihHHHI!IHHI!!hhHHHI!IHHI!!hhHHHI!IHHI!!ihHHHI!IHHI!!!hHHHI!IHHI!HhH!!");
    }

    @Test
    public void test3853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3853");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhHHI!HHHI!Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!", (int) (byte) 0, 10, "hhhi!hhhi!HhHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!!hHI!iHI!!ihHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!hHhhI!IhhI!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhHhhhi!hhhhhi!hhhi!HhHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!!hHI!iHI!!ihHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!hHhhI!IhhI!!" + "'", str4, "hhHhhhi!hhhhhi!hhhi!HhHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!!hHI!iHI!!ihHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!hHhhI!IhhI!!");
    }

    @Test
    public void test3854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3854");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HHhHhHhHhHhHhHhHiHhH!HhHhHhHhHhHhHhHiHhH!HhHiHhHhHhHhHhHiHhH!HhH!", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHhHhHhHhHhHhHhHiHhH!HhHhHhHhHhHhHhHiHhH!HhHiHhHhHhHhHhHiHhH!HhH!" + "'", str2, "HHhHhHhHhHhHhHhHiHhH!HhHhHhHhHhHhHhHiHhH!HhHiHhHhHhHhHhHiHhH!HhH!");
    }

    @Test
    public void test3855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3855");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihHHHHHI!IHHI!!HHHHHI!IHHI!!HHHHHI!IHHHHHI!HHHIHHHI!HHHI!IHHI!!HI!!IHHHHI!IHHI!!!HHHHI!IHHI!!HHHHHHhhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhHhhi!ihhi!HHI!iHI!!hi!!HHHI!HHHIHHHI!HHHI!IHHI!!I!IHHI!!HHHHHI!IHHI!!HHHHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHI!IHHI!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhHhhi!ihhi!HHI!iHI!!hi!!!!HHHHI!IHHI!!IHHHHI!IHHHHHHI!HHHIHHHI!HHHI!IHHI!!I!!HHHHHI!IHHI!!HHHHHI!IHHI!!IHHHHIHHHHI!HHHIHHhhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhHhhi!ihhi!HHI!iHI!!hi!!HI!HHHI!IHHI!!!IHHI!!!HHHHI!IHHI!!!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihHHHHHI!IHHI!!HHHHHI!IHHI!!HHHHHI!IHHHHHI!HHHIHHHI!HHHI!IHHI!!HI!!IHHHHI!IHHI!!!HHHHI!IHHI!!HHHHHHhhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhHhhi!ihhi!HHI!iHI!!hi!!HHHI!HHHIHHHI!HHHI!IHHI!!I!IHHI!!HHHHHI!IHHI!!HHHHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHI!IHHI!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhHhhi!ihhi!HHI!iHI!!hi!!!!HHHHI!IHHI!!IHHHHI!IHHHHHHI!HHHIHHHI!HHHI!IHHI!!I!!HHHHHI!IHHI!!HHHHHI!IHHI!!IHHHHIHHHHI!HHHIHHhhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhHhhi!ihhi!HHI!iHI!!hi!!HI!HHHI!IHHI!!!IHHI!!!HHHHI!IHHI!!!" + "'", str2, "Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihHHHHHI!IHHI!!HHHHHI!IHHI!!HHHHHI!IHHHHHI!HHHIHHHI!HHHI!IHHI!!HI!!IHHHHI!IHHI!!!HHHHI!IHHI!!HHHHHHhhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhHhhi!ihhi!HHI!iHI!!hi!!HHHI!HHHIHHHI!HHHI!IHHI!!I!IHHI!!HHHHHI!IHHI!!HHHHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHI!IHHI!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhHhhi!ihhi!HHI!iHI!!hi!!!!HHHHI!IHHI!!IHHHHI!IHHHHHHI!HHHIHHHI!HHHI!IHHI!!I!!HHHHHI!IHHI!!HHHHHI!IHHI!!IHHHHIHHHHI!HHHIHHhhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhHhhi!ihhi!HHI!iHI!!hi!!HI!HHHI!IHHI!!!IHHI!!!HHHHI!IHHI!!!");
    }

    @Test
    public void test3856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3856");
        char[] charArray8 = new char[] {};
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("h", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("Hhi!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhHhh", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!hhhi!ihhi!hhhi!ihhi!hhhi!ihhi!!hi!!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhihhhi!ihhi!hhhi!ihhi!hhhi!ihhi!!hi!!!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhhhhi!ihhi!hhhi!ihhi!hhhi!ihhi!!hi!!i!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhhhi!ihhi!hhhi!ihhi!hhhi!ihhi!!hi!!hi!!ihhhi!ihhi!!!hhhi!ihhi!!!", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhhi!hhhhHHI!HHHI!IHHI!!", charArray8);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("Hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhihhhi!hhhi!ihhi!!", charArray8);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("HhHhhI!IhhI!!HHhhI!IhhI!!HHhhI!IhhI!!HHhhI!IhhI!!IHhhI!IhhI!!!HhhI!IhhI!!HHhhI!IhhI!!HHhhI!IhhI!!HHhhI!IhhI!!IHhhI!IhhI!!!HhhI!IhhI!!IHhhI!IhhI!!HHhhI!IhhI!!HHhhI!IhhI!!IHhhI!IhhI!!!HhhI!IhhI!!!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hhi!" + "'", str11, "Hhi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!hhhi!ihhi!hhhi!ihhi!hhhi!ihhi!!hi!!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhihhhi!ihhi!hhhi!ihhi!hhhi!ihhi!!hi!!!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhhhhi!ihhi!hhhi!ihhi!hhhi!ihhi!!hi!!i!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhhhi!ihhi!hhhi!ihhi!hhhi!ihhi!!hi!!hi!!ihhhi!ihhi!!!hhhi!ihhi!!!" + "'", str13, "Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!hhhi!ihhi!hhhi!ihhi!hhhi!ihhi!!hi!!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhihhhi!ihhi!hhhi!ihhi!hhhi!ihhi!!hi!!!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhhhhi!ihhi!hhhi!ihhi!hhhi!ihhi!!hi!!i!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhhhi!ihhi!hhhi!ihhi!hhhi!ihhi!!hi!!hi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hhhhhi!hhhhHHI!HHHI!IHHI!!" + "'", str14, "Hhhhhi!hhhhHHI!HHHI!IHHI!!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test3857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3857");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!Hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!HHHHHHI!IHHI!HHI!IHI!!HI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhhhhi!ihhi!hhi!ihi!!hi!!" + "'", str1, "Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhhhhi!ihhi!hhi!ihi!!hi!!");
    }

    @Test
    public void test3858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3858");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhhhi!Hhhi!HhI!hhHI!", (int) 'a', (int) (byte) 100, "HhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HhhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!H!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end 97, length 20");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3859");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("HhHHI!HhHHI!HhHHI!IhHHI!!hHHI!IhHHI!HhHHI!HhHHI!IhHHI!!hHHI!HhHHI!HhHHI!HhHHI!IhHHI!!hHHI!IhHHI!HhHHHHHHI!HHHI!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!I!HhHHI!IhHHI!!hHHI!!hHHI!HhHHI!IhHHI!!hHHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HhHHI!HhHHI!HhHHI!IhHHI!!hHHI!IhHHI!HhHHI!HhHHI!IhHHI!!hHHI!HhHHI!HhHHI!HhHHI!IhHHI!!hHHI!IhHHI!HhHHHHHHI!HHHI!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!I!HhHHI!IhHHI!!hHHI!!hHHI!HhHHI!IhHHI!!hHHI!!" + "'", str1, "HhHHI!HhHHI!HhHHI!IhHHI!!hHHI!IhHHI!HhHHI!HhHHI!IhHHI!!hHHI!HhHHI!HhHHI!HhHHI!IhHHI!!hHHI!IhHHI!HhHHHHHHI!HHHI!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!I!HhHHI!IhHHI!!hHHI!!hHHI!HhHHI!IhHHI!!hHHI!!");
    }

    @Test
    public void test3860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3860");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hHHI!IHHI!HhhhhI!Ihhhhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!", (int) (byte) -1, "hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!hhhhi!Hhhi!Ihhi!!hhhhi!Hhhi!Ihhi!!hhhhi!Hhhi!Ihhi!!ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!ihhhi!Hhhi!Ihhi!!hhhhi!Hhhi!Ihhi!!hhhhi!Hhhi!Ihhi!!ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!hhhhi!Hhhi!Ihhi!!ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!h", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHI!IHHI!HhhhhI!Ihhhhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!" + "'", str4, "hHHI!IHHI!HhhhhI!Ihhhhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!");
    }

    @Test
    public void test3861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3861");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!", (int) (short) 10, (int) (byte) 1, "Hhhi!hhhi!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhhi!ihhi!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhhi!ihhiHhhi!hhhi!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhhi!ihhi!!" + "'", str4, "hhhhi!ihhiHhhi!hhhi!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhhi!ihhi!!");
    }

    @Test
    public void test3862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3862");
        char[] charArray8 = new char[] {};
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("H", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("hHI!", charArray8);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!", charArray8);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("hHHHi!iHHiHhhi!Hhhi!Ihhi!!!hi!!H", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hHI!" + "'", str14, "hHI!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!" + "'", str15, "hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hHHHi!iHHiHhhi!Hhhi!Ihhi!!!hi!!H" + "'", str16, "hHHHi!iHHiHhhi!Hhhi!Ihhi!!!hi!!H");
    }

    @Test
    public void test3863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3863");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hhhhi!ihhiHhHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!ihHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!ihHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!!hHHI!IHHI!HI!!h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!ihhiHhHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!ihHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!ihHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!!hHHI!IHHI!HI!!h" + "'", str1, "Hhhhi!ihhiHhHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!ihHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!ihHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!!hHHI!IHHI!HI!!h");
    }

    @Test
    public void test3864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3864");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhhhhi!hhhhhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!", (int) (byte) 10, (int) '#', "hHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HhHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!IHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!!HHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhhhi!hhhhhhhhi!ihhi!!hhhhi!ihhi!!hHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HhHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!IHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!!HHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!" + "'", str4, "hhhhhi!hhhhhhhhi!ihhi!!hhhhi!ihhi!!hHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HhHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!IHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!!HHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!");
    }

    @Test
    public void test3865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3865");
        char[] charArray10 = new char[] {};
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("hi!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("HI!", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("hH", charArray10);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray10);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.initials("Hhhhh", charArray10);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("hhhi!Hhhi!HhhHhHHHI!HHHIHhhH!IHHI!!hHHHhhHHI!HHHI!IHHhhHHI!!hHHHI!HhhHHHHI!IHHI!HhhH!iHHHI!HHHHhhHI!IHHI!!!HHhhHHHI!HHHI!IHhhHHHI!!HHHHIHhhH!HHHI!IHHIHhhH!!hHHHI!HHHhhHHI!IHHI!!hHhhHHHHI!HHHI!HhhHIHHI!!iHHHHhhHI!HHHI!IHHHhhHI!!!HHHI!HHhhHHHI!IHHI!!HhhHIHHHI!HHHIHhhH!IHHI!!hHHHhhHHI!HHHI!IHHhhHHI!!hHHHI!HhhHHHHI!IHHI!HhhH!iHHHI!HHHHhhHI!IHHI!!!HHhhHHHI!HHHI!IHhhHHHI!!!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HI!" + "'", str14, "HI!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HI!" + "'", str16, "HI!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hH" + "'", str17, "hH");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hhhi!Hhhi!HhhHhHHHI!HHHIHhhH!IHHI!!hHHHhhHHI!HHHI!IHHhhHHI!!hHHHI!HhhHHHHI!IHHI!HhhH!iHHHI!HHHHhhHI!IHHI!!!HHhhHHHI!HHHI!IHhhHHHI!!HHHHIHhhH!HHHI!IHHIHhhH!!hHHHI!HHHhhHHI!IHHI!!hHhhHHHHI!HHHI!HhhHIHHI!!iHHHHhhHI!HHHI!IHHHhhHI!!!HHHI!HHhhHHHI!IHHI!!HhhHIHHHI!HHHIHhhH!IHHI!!hHHHhhHHI!HHHI!IHHhhHHI!!hHHHI!HhhHHHHI!IHHI!HhhH!iHHHI!HHHHhhHI!IHHI!!!HHhhHHHI!HHHI!IHhhHHHI!!!" + "'", str20, "hhhi!Hhhi!HhhHhHHHI!HHHIHhhH!IHHI!!hHHHhhHHI!HHHI!IHHhhHHI!!hHHHI!HhhHHHHI!IHHI!HhhH!iHHHI!HHHHhhHI!IHHI!!!HHhhHHHI!HHHI!IHhhHHHI!!HHHHIHhhH!HHHI!IHHIHhhH!!hHHHI!HHHhhHHI!IHHI!!hHhhHHHHI!HHHI!HhhHIHHI!!iHHHHhhHI!HHHI!IHHHhhHI!!!HHHI!HHhhHHHI!IHHI!!HhhHIHHHI!HHHIHhhH!IHHI!!hHHHhhHHI!HHHI!IHHhhHHI!!hHHHI!HhhHHHHI!IHHI!HhhH!iHHHI!HHHHhhHI!IHHI!!!HHhhHHHI!HHHI!IHhhHHHI!!!");
    }

    @Test
    public void test3866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3866");
        char[] charArray12 = new char[] {};
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray12);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("", charArray12);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray12);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray12);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("hH", charArray12);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("HI!", charArray12);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.initials("Hhhi!Hhhi!Ihhi!!", charArray12);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.uncapitalize("HH", charArray12);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray12);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhi!ihhi!hhhi!ihhi!!hi!!", charArray12);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.initials("hhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHIhHI!HHI!HHHHHHI!HHHI!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!", charArray12);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.uncapitalize("hHHHI!IHHIhhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!IhhiHHHHi!iHHi!hi!!H", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] {});
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hH" + "'", str17, "hH");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HI!" + "'", str18, "HI!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HH" + "'", str20, "HH");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Hhhhi!ihhi!hhhi!ihhi!!hi!!" + "'", str22, "Hhhhi!ihhi!hhhi!ihhi!!hi!!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hHHHI!IHHIhhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!IhhiHHHHi!iHHi!hi!!H" + "'", str24, "hHHHI!IHHIhhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!IhhiHHHHi!iHHi!hi!!H");
    }

    @Test
    public void test3867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3867");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("Hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!ihhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!!", (int) '#', "hhHHi!iHHi!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!ihhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!!" + "'", str4, "Hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!ihhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!!");
    }

    @Test
    public void test3868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3868");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHHHI!HHHIHhi!", (int) (byte) 1, (int) '#', "HHHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHHHI!HHHIHhi!" + "'", str4, "HHHHI!HHHIHhi!");
    }

    @Test
    public void test3869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3869");
        char[] charArray11 = new char[] {};
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("HhhI!IhhI!!", charArray11);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHi!iHHi!hi!!", charArray11);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray11);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.initials("hhHHi!iHHi!!", charArray11);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhhhhi!hhhihhhi!hhhi!ihhi!!hi!!ihhhhi!ihhi!!!hhhhi!ihhi!!hhhhhhhhhi!hhhihhhi!hhhi!ihhi!!i!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!hhhhi!ihhi!!!hhhhi!ihhi!!ihhhhi!ihhhhhhi!hhhihhhi!hhhi!ihhi!!i!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhihhhhi!hhhihhhi!hhhi!ihhi!!!ihhi!!!hhhhi!ihhi!!!", charArray11);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!ihhi!hi!", charArray11);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.initials("Hhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!hhihi!!hi!hhi!ihi!!hi!!", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] {});
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HhhI!IhhI!!" + "'", str16, "HhhI!IhhI!!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HHHi!iHHi!hi!!" + "'", str17, "HHHi!iHHi!hi!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hhhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhhhhi!hhhihhhi!hhhi!ihhi!!hi!!ihhhhi!ihhi!!!hhhhi!ihhi!!hhhhhhhhhi!hhhihhhi!hhhi!ihhi!!i!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!hhhhi!ihhi!!!hhhhi!ihhi!!ihhhhi!ihhhhhhi!hhhihhhi!hhhi!ihhi!!i!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhihhhhi!hhhihhhi!hhhi!ihhi!!!ihhi!!!hhhhi!ihhi!!!" + "'", str20, "Hhhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhhhhi!hhhihhhi!hhhi!ihhi!!hi!!ihhhhi!ihhi!!!hhhhi!ihhi!!hhhhhhhhhi!hhhihhhi!hhhi!ihhi!!i!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!hhhhi!ihhi!!!hhhhi!ihhi!!ihhhhi!ihhhhhhi!hhhihhhi!hhhi!ihhi!!i!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhihhhhi!hhhihhhi!hhhi!ihhi!!!ihhi!!!hhhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Hhhi!ihhi!hi!" + "'", str21, "Hhhi!ihhi!hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test3870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3870");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("Hhi!hhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!ihi!!hi!hhi!ihi!!hi!!", (-1), "Hhhi!ihhi!!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHhhi!ihhi!!hHhhi!ihhi!!iHhhi!ihhi!!!Hhhi!ihhi!!hHhhi!ihhi!!hHhhi!ihhi!!iHhhi!ihhi!!!Hhhi!ihhi!!hHhhi!ihhi!!hHhhi!ihhi!!iHhhi!ihhi!!!Hhhi!ihhi!!hHhhi!ihhi!!hHhhi!ihhi!!iHhhi!ihhi!!!Hhhi!ihhi!!iHhhi!ihhi!!hHhhi!ihhi!!iHhhi!ihhi!!!Hhhi!ihhi!!!Hhhi!ihhi!!hHhhi!ihhi!!iHhhi!ihhi!!!Hhhi!ihhi!!iHhhi!ihhi!!hHhhi!ihhi!!iHhhi!ihhi!!!Hhhi!ihhi!!hHhhi!ihhi!!hHhhi!ihhi!!iHhhi!ihhi!!!Hhhi!ihhi!!hHhhi!ihhi!!hHhhi!ihhi!!iHhhi!ihhi!!!Hhhi!ihhi!!iHhhi!ihhi!!hHhhi!ihhi!!iHhhi!ihhi!!!Hhhi!ihhi!!!Hhhi!ihhi!!hHhhi!ihhi!!iHhhi!ihhi!!!Hhhi!ihhi!!hHhhi!ihhi!!hHhhi!ihhi!!iHhhi!ihhi!!!Hhhi!ihhi!!iHhhi!ihhi!!hHhhi!ihhi!!iHhhi!ihhi!!!Hhhi!ihhi!!!Hhhi!ihhi!!hHhhi!ihhi!!iHhhi!ihhi!!!Hhhi!ihhi!!!" + "'", str4, "HHhhi!ihhi!!hHhhi!ihhi!!iHhhi!ihhi!!!Hhhi!ihhi!!hHhhi!ihhi!!hHhhi!ihhi!!iHhhi!ihhi!!!Hhhi!ihhi!!hHhhi!ihhi!!hHhhi!ihhi!!iHhhi!ihhi!!!Hhhi!ihhi!!hHhhi!ihhi!!hHhhi!ihhi!!iHhhi!ihhi!!!Hhhi!ihhi!!iHhhi!ihhi!!hHhhi!ihhi!!iHhhi!ihhi!!!Hhhi!ihhi!!!Hhhi!ihhi!!hHhhi!ihhi!!iHhhi!ihhi!!!Hhhi!ihhi!!iHhhi!ihhi!!hHhhi!ihhi!!iHhhi!ihhi!!!Hhhi!ihhi!!hHhhi!ihhi!!hHhhi!ihhi!!iHhhi!ihhi!!!Hhhi!ihhi!!hHhhi!ihhi!!hHhhi!ihhi!!iHhhi!ihhi!!!Hhhi!ihhi!!iHhhi!ihhi!!hHhhi!ihhi!!iHhhi!ihhi!!!Hhhi!ihhi!!!Hhhi!ihhi!!hHhhi!ihhi!!iHhhi!ihhi!!!Hhhi!ihhi!!hHhhi!ihhi!!hHhhi!ihhi!!iHhhi!ihhi!!!Hhhi!ihhi!!iHhhi!ihhi!!hHhhi!ihhi!!iHhhi!ihhi!!!Hhhi!ihhi!!!Hhhi!ihhi!!hHhhi!ihhi!!iHhhi!ihhi!!!Hhhi!ihhi!!!");
    }

    @Test
    public void test3871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3871");
        char[] charArray8 = new char[] {};
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("hi!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("Hhhi!ihhi!!", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("HHHHI!HHHIHHHI!HHHI!IHHI!!", charArray8);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("hHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!H", charArray8);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("hHHHi!iHHihhHHHI!IHHI!!hhHHHI!IHHI!!hhHHHI!IHhHHHI!HHHIhHHI!HHHI!IHHI!!HI!!ihHHHI!IHHI!!!hHHHI!IHHI!!hhHHHhHHHI!HHHIhHHI!HHHI!IHHI!!I!IHHI!!hhHHHI!IHHI!!hhHHHI!IHHI!!ihHHHI!HHHIhHHI!HHHI!IHHI!!hHHHI!IHHI!!!hHHHI!IHHI!!ihHHHI!IHHhHHHI!HHHIhHHI!HHHI!IHHI!!I!!hhHHHI!IHHI!!hhHHHI!IHHI!!ihHHHIhHHHI!HHHIhHHI!HHHI!IHHI!!!IHHI!!!hHHHI!IHHI!!!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!H" + "'", str15, "hHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!H");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test3872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3872");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!H", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!H" + "'", str2, "Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!H");
    }

    @Test
    public void test3873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3873");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("HHHi!iHHi!HHHI!IHHI!!hi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test3874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3874");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhhhi!ihhihhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhhi!ihhihhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!" + "'", str2, "hhhhi!ihhihhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!");
    }

    @Test
    public void test3875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3875");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HHHHHI!IHHhhhhi!ihhiHhhhhhhhhihh!hhhHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHiHhhi!Hhhi!Ihhi!!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHHHHI!IHHhhhhi!ihhiHhhhhhhhhihh!hhhHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHiHhhi!Hhhi!Ihhi!!" + "'", str2, "HHHHHI!IHHhhhhi!ihhiHhhhhhhhhihh!hhhHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHiHhhi!Hhhi!Ihhi!!");
    }

    @Test
    public void test3876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3876");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhi!hhi!hhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhhhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhhi!hhhi!hhi!hhhi!", 100, (int) '#', "hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhhi!ihhihhhi!ihhhhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!IhhiHHHHi!iHHi!hi!!H");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhi!hhi!hhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhhhhhhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhhi!ihhihhhi!ihhhhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!IhhiHHHHi!iHHi!hi!!H" + "'", str4, "Hhi!hhi!hhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhhhhhhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhhi!ihhihhhi!ihhhhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!IhhiHHHHi!iHHi!hi!!H");
    }

    @Test
    public void test3877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3877");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("", 0, "HhhhI!IhhIHHhhhi!ihhi!!HHhhhi!ihhi!!HHhhhi!ihHhhhi!hhhiHhhi!hhhi!ihhi!!hi!!IHhhhi!ihhi!!!Hhhhi!ihhi!!HHhhhHhhhi!hhhiHhhi!hhhi!ihhi!!i!ihhi!!HHhhhi!ihhi!!HHhhhi!ihhi!!IHhhhi!hhhiHhhi!hhhi!ihhi!!Hhhhi!ihhi!!!Hhhhi!ihhi!!IHhhhi!ihhHhhhi!hhhiHhhi!hhhi!ihhi!!i!!HHhhhi!ihhi!!HHhhhi!ihhi!!IHhhhiHhhhi!hhhiHhhi!hhhi!ihhi!!!ihhi!!!Hhhhi!ihhi!!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test3878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3878");
        char[] charArray15 = new char[] {};
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray15);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("", charArray15);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray15);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray15);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("", charArray15);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.uncapitalize("Hi!", charArray15);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray15);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.uncapitalize("hH", charArray15);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray15);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.uncapitalize("HH", charArray15);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.uncapitalize("HH", charArray15);
        java.lang.String str27 = org.apache.commons.lang.WordUtils.capitalize("", charArray15);
        java.lang.String str28 = org.apache.commons.lang.WordUtils.uncapitalize("hhhi!hhhi!hhhi!Ihhi!!hhi!Ihhi!hhhi!Hhhi!hhhi!hhhi!", charArray15);
        java.lang.String str29 = org.apache.commons.lang.WordUtils.capitalize("Hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhihhhi!hhhi!ihhi!!", charArray15);
        java.lang.String str30 = org.apache.commons.lang.WordUtils.capitalize("HhI!HhI!HhI!HhI!ihI!!hI!ihI!HhI!HhI!ihI!!hI!hhI!ihI!!hI!!", charArray15);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] {});
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Hi!" + "'", str19, "Hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Hi!" + "'", str21, "Hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "HI!" + "'", str22, "HI!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hH" + "'", str23, "hH");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Hi!" + "'", str24, "Hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "HH" + "'", str25, "HH");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "HH" + "'", str26, "HH");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hhhi!hhhi!hhhi!Ihhi!!hhi!Ihhi!hhhi!Hhhi!hhhi!hhhi!" + "'", str28, "hhhi!hhhi!hhhi!Ihhi!!hhi!Ihhi!hhhi!Hhhi!hhhi!hhhi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhihhhi!hhhi!ihhi!!" + "'", str29, "Hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhihhhi!hhhi!ihhi!!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "HhI!HhI!HhI!HhI!ihI!!hI!ihI!HhI!HhI!ihI!!hI!hhI!ihI!!hI!!" + "'", str30, "HhI!HhI!HhI!HhI!ihI!!hI!ihI!HhI!HhI!ihI!!hI!hhI!ihI!!hI!!");
    }

    @Test
    public void test3879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3879");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("Hhhhi!hhhi!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhhi!ihhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHHI!HHHI!HHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHHI!IHHI!!" + "'", str1, "hHHHI!HHHI!HHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHHI!IHHI!!");
    }

    @Test
    public void test3880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3880");
        char[] charArray6 = new char[] { '#', ' ', '4' };
        java.lang.String str7 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray6);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!", charArray6);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalize("Hhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '#', ' ', '4' });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Hi!" + "'", str7, "Hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!" + "'", str8, "Hhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Hhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!" + "'", str9, "Hhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!");
    }

    @Test
    public void test3881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3881");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.uncapitalize("hHHhhhi!ihhi!hi!!hhHHhhhi!ihhi!hi!!hhHHhhhi!ihhi!hi!!hiHHhhhi!ihhi!hi!!h!HHhhhi!ihhi!hi!!hiHHhhhi!ihhi!hi!!hhHHhhhi!ihhi!hi!!hhHHhhhi!ihhi!hi!!hiHHhhhi!ihhi!hi!!h!HHhhhi!ihhi!hi!!h!", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHHhhhi!ihhi!hi!!hhHHhhhi!ihhi!hi!!hhHHhhhi!ihhi!hi!!hiHHhhhi!ihhi!hi!!h!HHhhhi!ihhi!hi!!hiHHhhhi!ihhi!hi!!hhHHhhhi!ihhi!hi!!hhHHhhhi!ihhi!hi!!hiHHhhhi!ihhi!hi!!h!HHhhhi!ihhi!hi!!h!" + "'", str2, "hHHhhhi!ihhi!hi!!hhHHhhhi!ihhi!hi!!hhHHhhhi!ihhi!hi!!hiHHhhhi!ihhi!hi!!h!HHhhhi!ihhi!hi!!hiHHhhhi!ihhi!hi!!hhHHhhhi!ihhi!hi!!hhHHhhhi!ihhi!hi!!hiHHhhhi!ihhi!hi!!h!HHhhhi!ihhi!hi!!h!");
    }

    @Test
    public void test3882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3882");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!" + "'", str2, "hhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!");
    }

    @Test
    public void test3883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3883");
        char[] charArray9 = new char[] {};
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("Hh", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("HHHi!iHHi!!", charArray9);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray9);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("hhhI!IhhI!hhhi!ihhi!!HI!!", charArray9);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("HhHHHI!IHHI!!hhHHHI!IHHI!!hhHHHI!IHhHHHI!HHHIhHHI!HHHI!IHHI!!HI!!ihHHHI!IHHI!!!hHHHI!IHHI!!hhHHHhHHHI!HHHIhHHI!HHHI!IHHI!!I!IHHI!!hhHHHI!IHHI!!hhHHHI!IHHI!!ihHHHI!HHHIhHHI!HHHI!IHHI!!hHHHI!IHHI!!!hHHHI!IHHI!!ihHHHI!IHHhHHHI!HHHIhHHI!HHHI!IHHI!!I!!hhHHHI!IHHI!!hhHHHI!IHHI!!ihHHHIhHHHI!HHHIhHHI!HHHI!IHHI!!!IHHI!!!hHHHI!IHHI!!!", charArray9);
        java.lang.Class<?> wildcardClass19 = charArray9.getClass();
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hi!" + "'", str12, "Hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hh" + "'", str14, "Hh");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hhhI!IhhI!hhhi!ihhi!!HI!!" + "'", str17, "hhhI!IhhI!hhhi!ihhi!!HI!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HhHHHI!IHHI!!hhHHHI!IHHI!!hhHHHI!IHhHHHI!HHHIhHHI!HHHI!IHHI!!HI!!ihHHHI!IHHI!!!hHHHI!IHHI!!hhHHHhHHHI!HHHIhHHI!HHHI!IHHI!!I!IHHI!!hhHHHI!IHHI!!hhHHHI!IHHI!!ihHHHI!HHHIhHHI!HHHI!IHHI!!hHHHI!IHHI!!!hHHHI!IHHI!!ihHHHI!IHHhHHHI!HHHIhHHI!HHHI!IHHI!!I!!hhHHHI!IHHI!!hhHHHI!IHHI!!ihHHHIhHHHI!HHHIhHHI!HHHI!IHHI!!!IHHI!!!hHHHI!IHHI!!!" + "'", str18, "HhHHHI!IHHI!!hhHHHI!IHHI!!hhHHHI!IHhHHHI!HHHIhHHI!HHHI!IHHI!!HI!!ihHHHI!IHHI!!!hHHHI!IHHI!!hhHHHhHHHI!HHHIhHHI!HHHI!IHHI!!I!IHHI!!hhHHHI!IHHI!!hhHHHI!IHHI!!ihHHHI!HHHIhHHI!HHHI!IHHI!!hHHHI!IHHI!!!hHHHI!IHHI!!ihHHHI!IHHhHHHI!HHHIhHHI!HHHI!IHHI!!I!!hhHHHI!IHHI!!hhHHHI!IHHI!!ihHHHIhHHHI!HHHIhHHI!HHHI!IHHI!!!IHHI!!!hHHHI!IHHI!!!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3884");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HHH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HHH" + "'", str1, "hhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HHH");
    }

    @Test
    public void test3885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3885");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("Hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!!", (int) (short) 1, "", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!!" + "'", str4, "Hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!!");
    }

    @Test
    public void test3886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3886");
        char[] charArray6 = new char[] { '#', ' ', '4' };
        java.lang.String str7 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray6);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray6);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalize("hHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHIhHhhI!IhhI!!HHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!iHhhI!IhhI!!!HhhI!IhhI!!iHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!iHhhI!IhhI!!!HhhI!IhhI!!!HhhI!IhhI!!HHhhI!IhhI!!HHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!iHhhI!IhhI!!!HhhI!IhhI!!iHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!iHhhI!IhhI!!!HhhI!IhhI!!!HhhI!IhhI!!HHhhI!IhhI!!HHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!iHhhI!IhhI!!!HhhI!IhhI!!iHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!iHhhI!IhhI!!!HhhI!IhhI!!!HhhI!IhhI!!IHhhI!IhhI!!HHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!iHhhI!IhhI!!!HhhI!IhhI!!iHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!iHhhI!IhhI!!!HhhI!IhhI!!!HhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!HHhhI!IhhI!!IHhhI!IhhI!!!", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '#', ' ', '4' });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Hi!" + "'", str7, "Hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHIhHhhI!IhhI!!HHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!iHhhI!IhhI!!!HhhI!IhhI!!iHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!iHhhI!IhhI!!!HhhI!IhhI!!!HhhI!IhhI!!HHhhI!IhhI!!HHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!iHhhI!IhhI!!!HhhI!IhhI!!iHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!iHhhI!IhhI!!!HhhI!IhhI!!!HhhI!IhhI!!HHhhI!IhhI!!HHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!iHhhI!IhhI!!!HhhI!IhhI!!iHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!iHhhI!IhhI!!!HhhI!IhhI!!!HhhI!IhhI!!IHhhI!IhhI!!HHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!iHhhI!IhhI!!!HhhI!IhhI!!iHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!iHhhI!IhhI!!!HhhI!IhhI!!!HhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!HHhhI!IhhI!!IHhhI!IhhI!!!" + "'", str9, "HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHIhHhhI!IhhI!!HHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!iHhhI!IhhI!!!HhhI!IhhI!!iHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!iHhhI!IhhI!!!HhhI!IhhI!!!HhhI!IhhI!!HHhhI!IhhI!!HHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!iHhhI!IhhI!!!HhhI!IhhI!!iHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!iHhhI!IhhI!!!HhhI!IhhI!!!HhhI!IhhI!!HHhhI!IhhI!!HHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!iHhhI!IhhI!!!HhhI!IhhI!!iHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!iHhhI!IhhI!!!HhhI!IhhI!!!HhhI!IhhI!!IHhhI!IhhI!!HHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!iHhhI!IhhI!!!HhhI!IhhI!!iHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!iHhhI!IhhI!!!HhhI!IhhI!!!HhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!HHhhI!IhhI!!IHhhI!IhhI!!!");
    }

    @Test
    public void test3887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3887");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!IHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!!", 10, (int) (byte) 1, "hHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!iHhhi!Hhhi!Ihhi!!!Hhhi!Hhhi!IhhiHhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!IhHHI!hHHI!iHHI!!!hHHI!hHHI!ihhHHHI!IHHI!HI!!H");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhHHHi!iHHhHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!iHhhi!Hhhi!Ihhi!!!Hhhi!Hhhi!IhhiHhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!IhHHI!hHHI!iHHI!!!hHHI!hHHI!ihhHHHI!IHHI!HI!!H" + "'", str4, "hhHHHi!iHHhHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!iHhhi!Hhhi!Ihhi!!!Hhhi!Hhhi!IhhiHhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!IhHHI!hHHI!iHHI!!!hHHI!hHHI!ihhHHHI!IHHI!HI!!H");
    }

    @Test
    public void test3888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3888");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!!", (int) 'a', "hhHI!iHI!!HhHI!iHI!!HhHI!iHI!!IhHI!iHI!!!hHI!iHI!!IhHI!iHI!!HhHI!iHI!!HhHI!iHI!!IhHI!iHI!!!hHI!iHI!!HhHI!iHI!!HhHI!iHI!!IhHI!iHI!!!hHI!iHI!!IhHI!iHI!!HhHI!iHI!!IhHI!iHI!!!hHI!iHI!!!hHI!iHI!!HhHI!iHI!!IhHI!iHI!!!hHI!iHI!!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!!" + "'", str4, "hHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!!");
    }

    @Test
    public void test3889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3889");
        char[] charArray5 = new char[] { '#' };
        java.lang.String str6 = org.apache.commons.lang.WordUtils.uncapitalize("Hi!", charArray5);
        java.lang.String str7 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!ihhi!!", charArray5);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalize("", charArray5);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!", charArray5);
        java.lang.Class<?> wildcardClass10 = charArray5.getClass();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '#' });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Hhhi!ihhi!!" + "'", str7, "Hhhi!ihhi!!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!" + "'", str9, "hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3890");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhhhhi!ihhHHHHI!IHHIhHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhhhi!ihhHHHHI!IHHIhHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!" + "'", str2, "hhhhhi!ihhHHHHI!IHHIhHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!");
    }

    @Test
    public void test3891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3891");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhhi!ihhihhhhhi!ihhhhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!", 1, 0, "HhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HhHHHHI!IHHHHHI!IHHI!HHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HhHHHHI!IHHHHHI!IHHI!HHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!" + "'", str4, "HHhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HhHHHHI!IHHHHHI!IHHI!HHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!");
    }

    @Test
    public void test3892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3892");
        char[] charArray5 = new char[] {};
        java.lang.String str6 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray5);
        java.lang.String str7 = org.apache.commons.lang.WordUtils.initials("h", charArray5);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray5);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("hhhi!ihhi!hhhi!ihhi!!hi!!", charArray5);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("hhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HihHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!H!hHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HHhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HihHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!H!hHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HIhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HihHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!H!hHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!H!", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hI!" + "'", str8, "hI!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HihHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!H!hHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HHhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HihHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!H!hHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HIhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HihHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!H!hHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!H!" + "'", str10, "hhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HihHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!H!hHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HHhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HihHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!H!hHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HIhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HihHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!H!hHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!H!");
    }

    @Test
    public void test3893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3893");
        char[] charArray8 = new char[] {};
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("h", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("Hhi!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhHhh", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("HHHHI!HHHIHHHI!HHHI!IHHI!!", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhhhi!ihhi!hhi!ihi!!hi!!", charArray8);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("hHHI!hHHI!HHhi!", charArray8);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("hHHI!IHHI!hhi!Ihi!!HI!!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hhi!" + "'", str11, "Hhi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HHHHI!HHHIHHHI!HHHI!IHHI!!" + "'", str13, "HHHHI!HHHIHHHI!HHHI!IHHI!!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hHHI!IHHI!hhi!Ihi!!HI!!" + "'", str16, "hHHI!IHHI!hhi!Ihi!!HI!!");
    }

    @Test
    public void test3894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3894");
        char[] charArray11 = new char[] {};
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("hH", charArray11);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("HI!", charArray11);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("hhI!", charArray11);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("HhI!", charArray11);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhhI!IhhI!HI!!h", charArray11);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.initials("", charArray11);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalize("", charArray11);
        java.lang.Class<?> wildcardClass23 = charArray11.getClass();
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] {});
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hH" + "'", str16, "hH");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HI!" + "'", str17, "HI!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hhI!" + "'", str18, "hhI!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "HhI!" + "'", str19, "HhI!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hhhhI!IhhI!HI!!h" + "'", str20, "hhhhI!IhhI!HI!!h");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3895");
        char[] charArray8 = new char[] {};
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("hi!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("hHI!", charArray8);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("HHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!IHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!!", charArray8);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!iHHHI!hHHI!iHHI!!!HHHI!hHHI!iHHI!!iHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!HHHHI!hHHI!iHHI!!HHHHI!hHHI!iHHI!!HHHHI!hHHI!iHHI!!IHHHI!hHHI!iHHI!!!HHHI!hHHI!iHHI!!IHHHI!hHHI!iHHI!!HHHHI!hHHI!iHHI!!HHHHI!hHHI!iHHI!!IHHHI!hHHI!iHHI!!!HHHI!hHHI!iHHI!!HHHHI!hHHI!iHHI!!IHHHI!hHHI!iHHI!!!HHHI!hHHI!iHHI!!!HHHI!hHHI!iHHI!!H", charArray8);
        java.lang.Class<?> wildcardClass17 = charArray8.getClass();
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hi!" + "'", str12, "Hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hi!" + "'", str13, "Hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hHI!" + "'", str14, "hHI!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!IHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!!" + "'", str15, "HHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!IHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!iHHHI!hHHI!iHHI!!!HHHI!hHHI!iHHI!!iHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!HHHHI!hHHI!iHHI!!HHHHI!hHHI!iHHI!!HHHHI!hHHI!iHHI!!IHHHI!hHHI!iHHI!!!HHHI!hHHI!iHHI!!IHHHI!hHHI!iHHI!!HHHHI!hHHI!iHHI!!HHHHI!hHHI!iHHI!!IHHHI!hHHI!iHHI!!!HHHI!hHHI!iHHI!!HHHHI!hHHI!iHHI!!IHHHI!hHHI!iHHI!!!HHHI!hHHI!iHHI!!!HHHI!hHHI!iHHI!!H" + "'", str16, "hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!iHHHI!hHHI!iHHI!!!HHHI!hHHI!iHHI!!iHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!HHHHI!hHHI!iHHI!!HHHHI!hHHI!iHHI!!HHHHI!hHHI!iHHI!!IHHHI!hHHI!iHHI!!!HHHI!hHHI!iHHI!!IHHHI!hHHI!iHHI!!HHHHI!hHHI!iHHI!!HHHHI!hHHI!iHHI!!IHHHI!hHHI!iHHI!!!HHHI!hHHI!iHHI!!HHHHI!hHHI!iHHI!!IHHHI!hHHI!iHHI!!!HHHI!hHHI!iHHI!!!HHHI!hHHI!iHHI!!H");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3896");
        char[] charArray8 = new char[] { '#', '4', '4', '4' };
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("HHhi!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHiHhhi!Hhhi!Ihhi!!", charArray8);
        java.lang.Class<?> wildcardClass13 = charArray8.getClass();
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '#', '4', '4', '4' });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Hi!" + "'", str9, "Hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hi!" + "'", str10, "Hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hhhi!" + "'", str11, "Hhhi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhihhhi!hhhi!ihhi!!" + "'", str12, "Hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhihhhi!hhhi!ihhi!!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3897");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("HHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhi!ihhi!!!Hhhhi!hhhiHhhi!hhhi!ihhi!!HHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhi!ihhi!!!Hhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!HHhhhi!hhhiHhhi!hhhi!ihhi!!IHhhhi!hhhiHhhi!hhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test3898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3898");
        char[] charArray10 = new char[] {};
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("hi!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("Hhhhhi!ihhhhHHHI!IHHI!HI!!H", charArray10);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!", charArray10);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHHI!HHHIHHHI!HHHI!IHHI!!", charArray10);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.uncapitalize("hHHI!HHHI!Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hi!" + "'", str14, "Hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!" + "'", str16, "hhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "HHHHI!HHHIHHHI!HHHI!IHHI!!" + "'", str19, "HHHHI!HHHIHHHI!HHHI!IHHI!!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hHHI!HHHI!Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!" + "'", str20, "hHHI!HHHI!Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
    }

    @Test
    public void test3899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3899");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hHHHI!IHHI!!", 0, (int) (byte) 10, "Hhhi!hhhi!hhhi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhhhhi!ihHhhi!hhhi!hhhi!" + "'", str4, "Hhhhhhi!ihHhhi!hhhi!hhhi!");
    }

    @Test
    public void test3900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3900");
        char[] charArray10 = new char[] {};
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("Hh", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("HHHI!hHHI!iHHI!!", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhi!hhhiHhhi!hhhi!ihhi!!", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhhI!IhhI!HI!!h", charArray10);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("hHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHhHHI!HHHI!IHHI!!", charArray10);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("HhHHHI!HHHhHHI!hHHI!Hhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!!", charArray10);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("HhHHHI!IHHI!!hhHHHI!IHHI!!hhHHHI!IHHI!!ihHHHI!IHHI!!!hHHHI!IHHI!!hhHHHI!IHHI!!hhHHHI!IHHI!!hhHHHI!IHHI!!ihHHHI!IHHI!!!hHHHI!IHHI!!ihHHHI!IHHI!!hhHHHI!IHHI!!hhHHHI!IHHI!!ihHHHI!IHHI!!!hHHHI!IHHI!!!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hh" + "'", str13, "Hh");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HHHI!hHHI!iHHI!!" + "'", str15, "HHHI!hHHI!iHHI!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hhhhi!hhhiHhhi!hhhi!ihhi!!" + "'", str16, "Hhhhi!hhhiHhhi!hhhi!ihhi!!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hhhhI!IhhI!HI!!h" + "'", str17, "hhhhI!IhhI!HI!!h");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHhHHI!HHHI!IHHI!!" + "'", str18, "hHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHhHHI!HHHI!IHHI!!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "HhHHHI!HHHhHHI!hHHI!Hhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!!" + "'", str19, "HhHHHI!HHHhHHI!hHHI!Hhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HhHHHI!IHHI!!hhHHHI!IHHI!!hhHHHI!IHHI!!ihHHHI!IHHI!!!hHHHI!IHHI!!hhHHHI!IHHI!!hhHHHI!IHHI!!hhHHHI!IHHI!!ihHHHI!IHHI!!!hHHHI!IHHI!!ihHHHI!IHHI!!hhHHHI!IHHI!!hhHHHI!IHHI!!ihHHHI!IHHI!!!hHHHI!IHHI!!!" + "'", str20, "HhHHHI!IHHI!!hhHHHI!IHHI!!hhHHHI!IHHI!!ihHHHI!IHHI!!!hHHHI!IHHI!!hhHHHI!IHHI!!hhHHHI!IHHI!!hhHHHI!IHHI!!ihHHHI!IHHI!!!hHHHI!IHHI!!ihHHHI!IHHI!!hhHHHI!IHHI!!hhHHHI!IHHI!!ihHHHI!IHHI!!!hHHHI!IHHI!!!");
    }

    @Test
    public void test3901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3901");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhhhhi!ihhHHHHI!IHHIhHHHHHHHHIHH!HHHhhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhIhHHI!hHHI!iHHI!!", (-1), (-1), "hhhi!Hhhi!Ihhi!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhhhi!ihhHHHHI!IHHIhHHHHHHHHIHH!HHHhhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhIhHHI!hHHI!iHHI!!" + "'", str4, "hhhhhi!ihhHHHHI!IHHIhHHHHHHHHIHH!HHHhhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhIhHHI!hHHI!iHHI!!");
    }

    @Test
    public void test3902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3902");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hhh", 0, "hHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!hHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!hHhhhi!ihhi!hi!!hHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!hHhhhi!ihhi!hi!!hHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!IHhhhi!ihhi!hi!!hHhhhi!ihhi!hi!!hHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhh" + "'", str4, "hhh");
    }

    @Test
    public void test3903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3903");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHHhhhi!ihhi!hi!!hhHHhhhi!ihhi!hi!!hhHHhhhi!ihhi!hi!!hiHHhhhi!ihhi!hi!!h!HHhhhi!ihhi!hi!!hiHHhhhi!ihHhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!!", (int) ' ', 100, "hhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHhhhi!ihhi!hi!!hhHHhhhi!ihhi!hi!!hhHHhhhi!ihhi!hi!!hiHHhhhi!ihhi!hi!!h!HHhhhi!ihhi!hi!!hiHHhhhi!ihhhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!" + "'", str4, "hHHhhhi!ihhi!hi!!hhHHhhhi!ihhi!hi!!hhHHhhhi!ihhi!hi!!hiHHhhhi!ihhi!hi!!h!HHhhhi!ihhi!hi!!hiHHhhhi!ihhhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!");
    }

    @Test
    public void test3904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3904");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHI!HHHI!HHHI!IHI!!HHHI!IHI!!HHHHHHI!IHHI!HHHI!IHHI!!HI!!HI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHIHHHHI!IHHI!HHHI!IHHI!!HI!!!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHHHHI!IHHI!HHHI!IHHI!!HI!!HI!!!HHI!IHI!!HHHI!IHI!!IHHI!IHIHHHHI!IHHI!HHHI!IHHI!!HI!!!!!HHI!IHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!hhhi!hhhi!ihi!!hhhi!ihi!!hhhhhhi!ihhi!hhhi!ihhi!!hi!!hi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhihhhhi!ihhi!hhhi!ihhi!!hi!!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihhhhi!ihhi!hhhi!ihhi!!hi!!hi!!!hhi!ihi!!hhhi!ihi!!ihhi!ihihhhhi!ihhi!hhhi!ihhi!!hi!!!!!hhi!ihi!!!" + "'", str1, "Hhhi!hhhi!hhhi!ihi!!hhhi!ihi!!hhhhhhi!ihhi!hhhi!ihhi!!hi!!hi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhihhhhi!ihhi!hhhi!ihhi!!hi!!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihhhhi!ihhi!hhhi!ihhi!!hi!!hi!!!hhi!ihi!!hhhi!ihi!!ihhi!ihihhhhi!ihhi!hhhi!ihhi!!hi!!!!!hhi!ihi!!!");
    }

    @Test
    public void test3905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3905");
        char[] charArray13 = new char[] {};
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray13);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("", charArray13);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("hi!", charArray13);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray13);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("", charArray13);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("HI!", charArray13);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.uncapitalize("hH", charArray13);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray13);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.initials("Hhi!", charArray13);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalize("", charArray13);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.initials("HHHI!HHHI!IHHI!!", charArray13);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray13);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.capitalizeFully("HhhI!IhhI!!", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] {});
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HI!" + "'", str17, "HI!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "HI!" + "'", str19, "HI!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hH" + "'", str20, "hH");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "HhhI!IhhI!!" + "'", str26, "HhhI!IhhI!!");
    }

    @Test
    public void test3906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3906");
        char[] charArray8 = new char[] {};
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("hH", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("HI!", charArray8);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("Hhi!hhi!hhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!", charArray8);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!hhhi!ihhi!!hi!!", charArray8);
        java.lang.Class<?> wildcardClass17 = charArray8.getClass();
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hH" + "'", str13, "hH");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HI!" + "'", str14, "HI!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hhi!hhi!hhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!" + "'", str15, "Hhi!hhi!hhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!hhhi!ihhi!!hi!!" + "'", str16, "Hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!hhhi!ihhi!!hi!!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3907");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhhhi!hhhihhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!h", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhhi!hhhihhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!h" + "'", str2, "Hhhhi!hhhihhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!h");
    }

    @Test
    public void test3908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3908");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hhHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HhHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!!" + "'", str1, "HhHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!!");
    }

    @Test
    public void test3909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3909");
        char[] charArray8 = new char[] {};
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("hhhi!Hhhi!Ihhi!!", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!ihhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!!", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("HhhI!IhhI!hhhi!ihhi!!HI!!", charArray8);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("HHHI!HHHI!Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!", charArray8);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhhi!hhhhhhi!hhhi!hhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hhhi!Hhhi!Ihhi!!" + "'", str12, "hhhi!Hhhi!Ihhi!!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!ihhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!!" + "'", str13, "Hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!ihhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HhhI!IhhI!hhhi!ihhi!!HI!!" + "'", str14, "HhhI!IhhI!hhhi!ihhi!!HI!!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HHHI!HHHI!Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!" + "'", str15, "HHHI!HHHI!Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hhhhhi!hhhhhhi!hhhi!hhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!" + "'", str16, "Hhhhhi!hhhhhhi!hhhi!hhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!");
    }

    @Test
    public void test3910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3910");
        char[] charArray8 = new char[] {};
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("Hh", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("HHHI!hHHI!HHhi!", charArray8);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!Hhhi!Ihhi!!", charArray8);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("hhhhh", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hi!" + "'", str11, "Hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hh" + "'", str13, "Hh");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hhhi!Hhhi!Ihhi!!" + "'", str15, "Hhhi!Hhhi!Ihhi!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hhhhh" + "'", str16, "hhhhh");
    }

    @Test
    public void test3911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3911");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhi!ihhihhhi!ihhi!hhhi!ihhi!hi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!ihhihhhi!ihhi!hhhi!ihhi!hi!!" + "'", str1, "Hhhhi!ihhihhhi!ihhi!hhhi!ihhi!hi!!");
    }

    @Test
    public void test3912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3912");
        char[] charArray8 = new char[] { '4', '4' };
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("HHi!", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("HH", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("hhI!", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("HHHHHI!IHHhHhhhI!IhhhhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!!", charArray8);
        java.lang.Class<?> wildcardClass15 = charArray8.getClass();
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Hi!" + "'", str9, "Hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hhi!" + "'", str10, "Hhi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hH" + "'", str11, "hH");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "h" + "'", str12, "h");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HHHHHI!IHHhHhhhI!IhhhhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!!" + "'", str14, "HHHHHI!IHHhHhhhI!IhhhhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3913");
        char[] charArray7 = new char[] {};
        java.lang.String str8 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHi!iHHi!hi!!", charArray7);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!ihhi!hi!!", charArray7);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("Hhhhhhhhhhhhhhhhihhh!hhhhhhhhhhhhhhhihhh!hhhihhhhhhhhhhhihhh!hhh!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HHHi!iHHi!hi!!" + "'", str12, "HHHi!iHHi!hi!!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hhhi!ihhi!hi!!" + "'", str13, "Hhhi!ihhi!hi!!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hhhhhhhhhhhhhhhhihhh!hhhhhhhhhhhhhhhihhh!hhhihhhhhhhhhhhihhh!hhh!" + "'", str14, "Hhhhhhhhhhhhhhhhihhh!hhhhhhhhhhhhhhhihhh!hhhihhhhhhhhhhhihhh!hhh!");
    }

    @Test
    public void test3914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3914");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("Hhhhi!hhhihhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHHI!HHHIHHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!" + "'", str1, "hHHHI!HHHIHHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!");
    }

    @Test
    public void test3915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3915");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("H", (int) (short) 100, (int) (short) 1, "hhhhi!hhhiHhhi!hhhi!ihhi!!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end 100, length 1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3916");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hHhhI!IhhIHHHHI!HHHI!IHHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hHhhI!IhhIHHHHI!HHHI!IHHI!!" + "'", str1, "hhhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hHhhI!IhhIHHHHI!HHHI!IHHI!!");
    }

    @Test
    public void test3917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3917");
        char[] charArray10 = new char[] {};
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray10);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("hhhI!IhhI!HI!!", charArray10);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.initials("HhH", charArray10);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("HHHI!HHHI!IHHI!!", charArray10);
        java.lang.Class<?> wildcardClass21 = charArray10.getClass();
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hi!" + "'", str14, "Hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HHHI!HHHI!IHHI!!" + "'", str20, "HHHI!HHHI!IHHI!!");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3918");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hhhhhi!hhhhHHI!HHHI!IHHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test3919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3919");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("Hhhhi!ihhihhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!ihhihhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!" + "'", str1, "Hhhhi!ihhihhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!");
    }

    @Test
    public void test3920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3920");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HHHhHHhHHiHH!HHhHHhHHhHHiHH!HHhHHhHHhHHiHH!HHIHHhHHhHHiHH!HH!HHhHHhHHiHH!HHIHHhHHhHHiHH!HHhHHhHHhHHiHH!HHhHHhHHhHHiHH!HHIHHhHHhHHiHH!HH!HHhHHhHHiHH!HHHHHhHHhHHiHH!HHIHHhHHhHHiHH!HH!HHhHHhHHiHH!HH!", (int) 'a', "hHHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHHhHHhHHiHH!HHhHHhHHhHHiHH!HHhHHhHHhHHiHH!HHIHHhHHhHHiHH!HH!HHhHHhHHiHH!HHIHHhHHhHHiHH!HHhHHhHHhhHHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!!HHiHH!HHhHHhHHhHHiHH!HHIHHhHHhHHiHH!HH!HHhHHhHHiHH!HHHHHhHHhHHiHH!HHIHHhHHhHHiHH!HH!HHhHHhHHiHH!HhHHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!!H!" + "'", str4, "HHHhHHhHHiHH!HHhHHhHHhHHiHH!HHhHHhHHhHHiHH!HHIHHhHHhHHiHH!HH!HHhHHhHHiHH!HHIHHhHHhHHiHH!HHhHHhHHhhHHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!!HHiHH!HHhHHhHHhHHiHH!HHIHHhHHhHHiHH!HH!HHhHHhHHiHH!HHHHHhHHhHHiHH!HHIHHhHHhHHiHH!HH!HHhHHhHHiHH!HhHHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!!H!");
    }

    @Test
    public void test3921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3921");
        char[] charArray13 = new char[] {};
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray13);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("", charArray13);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray13);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray13);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("", charArray13);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray13);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("H", charArray13);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.uncapitalize("hh", charArray13);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalizeFully("H", charArray13);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!ihhi!!", charArray13);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!", charArray13);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.capitalize("HhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!H!", charArray13);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.capitalize("hHHI!IHHI!HHHHHHHHHIHH!HHHHHHHHHHHIHhhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] {});
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hi!" + "'", str17, "Hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "h" + "'", str19, "h");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H" + "'", str20, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hh" + "'", str21, "hh");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "H" + "'", str22, "H");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Hhhi!ihhi!!" + "'", str23, "Hhhi!ihhi!!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!" + "'", str24, "hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "HhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!H!" + "'", str25, "HhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!H!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hHHI!IHHI!HHHHHHHHHIHH!HHHHHHHHHHHIHhhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!" + "'", str26, "hHHI!IHHI!HHHHHHHHHIHH!HHHHHHHHHHHIHhhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!");
    }

    @Test
    public void test3922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3922");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!HHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!hhhhi!ihhihhhi!Hhhi!Ihhi!!!hi!!h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!HHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!hhhhi!ihhihhhi!Hhhi!Ihhi!!!hi!!h" + "'", str1, "HHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!HHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!hhhhi!ihhihhhi!Hhhi!Ihhi!!!hi!!h");
    }

    @Test
    public void test3923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3923");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHHi!iHHi!HHHI!IHHI!!hi!!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHHi!iHHi!HHHI!IHHI!!hi!!" + "'", str2, "hHHi!iHHi!HHHI!IHHI!!hi!!");
    }

    @Test
    public void test3924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3924");
        char[] charArray7 = new char[] {};
        java.lang.String str8 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("hi!", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray7);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("HhhI!IhhI!!", charArray7);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("HhI!HhI!HhI!HhI!ihI!!hI!ihI!HhI!HhI!ihI!!hI!hhI!ihI!!hI!!", charArray7);
        java.lang.Class<?> wildcardClass15 = charArray7.getClass();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HI!" + "'", str11, "HI!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HI!" + "'", str12, "HI!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HhI!HhI!HhI!HhI!ihI!!hI!ihI!HhI!HhI!ihI!!hI!hhI!ihI!!hI!!" + "'", str14, "HhI!HhI!HhI!HhI!ihI!!hI!ihI!HhI!HhI!ihI!!hI!hhI!ihI!!hI!!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3925");
        char[] charArray6 = new char[] {};
        java.lang.String str7 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray6);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.uncapitalize("hI!", charArray6);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray6);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("Hhhi!ihhi!hhhhi!ihhi!hi!!h", charArray6);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("HhHHI!HHHI!Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!", charArray6);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!IhHHI!hHHI!iHHI!!!hHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!IhHHI!hHHI!iHHI!!!hHHI!hHHI!iHHI!!IhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!IhHHI!hHHI!iHHI!!!hHHI!hHHI!iHHI!!!", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hI!" + "'", str8, "hI!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HhHHI!HHHI!Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!" + "'", str11, "HhHHI!HHHI!Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!IhHHI!hHHI!iHHI!!!hHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!IhHHI!hHHI!iHHI!!!hHHI!hHHI!iHHI!!IhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!IhHHI!hHHI!iHHI!!!hHHI!hHHI!iHHI!!!" + "'", str12, "HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!IhHHI!hHHI!iHHI!!!hHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!IhHHI!hHHI!iHHI!!!hHHI!hHHI!iHHI!!IhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!IhHHI!hHHI!iHHI!!!hHHI!hHHI!iHHI!!!");
    }

    @Test
    public void test3926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3926");
        char[] charArray11 = new char[] {};
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("", charArray11);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray11);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("H", charArray11);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray11);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.uncapitalize("hhhi!ihhi!!", charArray11);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray11);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] {});
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hi!" + "'", str15, "Hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "h" + "'", str17, "h");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H" + "'", str18, "H");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Hi!" + "'", str19, "Hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hhhi!ihhi!!" + "'", str20, "hhhi!ihhi!!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!" + "'", str22, "Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!");
    }

    @Test
    public void test3927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3927");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!Hhihi!!hi!hhi!ihi!!hi!!", (int) (byte) 0, (int) (short) 1, "hhhhhi!hhhHHhhI!IhhIHHHHI!HHHI!IHHI!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhhhhi!hhhHHhhI!IhhIHHHHI!HHHI!IHHI!!" + "'", str4, "hhhhhhi!hhhHHhhI!IhhIHHHHI!HHHI!IHHI!!");
    }

    @Test
    public void test3928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3928");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHIhHhhI!IhhI!!HHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!iHhhI!IhhI!!!HhhI!IhhI!!iHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!iHhhI!IhhI!!!HhhI!IhhI!!!HhhI!IhhI!!HHhhI!IhhI!!HHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!iHhhI!IhhI!!!HhhI!IhhI!!iHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!iHhhI!IhhI!!!HhhI!IhhI!!!HhhI!IhhI!!HHhhI!IhhI!!HHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!iHhhI!IhhI!!!HhhI!IhhI!!iHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!iHhhI!IhhI!!!HhhI!IhhI!!!HhhI!IhhI!!IHhhI!IhhI!!HHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!iHhhI!IhhI!!!HhhI!IhhI!!iHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!iHhhI!IhhI!!!HhhI!IhhI!!!HhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!HHhhI!IhhI!!IHhhI!IhhI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhiHhHHi!iHHi!!hhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!IhHHi!iHHi!!!hHHi!iHHi!!IhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!IhHHi!iHHi!!!hHHi!iHHi!!!hHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!IhHHi!iHHi!!!hHHi!iHHi!!IhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!IhHHi!iHHi!!!hHHi!iHHi!!!hHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!IhHHi!iHHi!!!hHHi!iHHi!!IhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!IhHHi!iHHi!!!hHHi!iHHi!!!hHHi!iHHi!!ihHHi!iHHi!!hhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!IhHHi!iHHi!!!hHHi!iHHi!!IhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!IhHHi!iHHi!!!hHHi!iHHi!!!hHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!" + "'", str1, "Hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhiHhHHi!iHHi!!hhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!IhHHi!iHHi!!!hHHi!iHHi!!IhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!IhHHi!iHHi!!!hHHi!iHHi!!!hHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!IhHHi!iHHi!!!hHHi!iHHi!!IhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!IhHHi!iHHi!!!hHHi!iHHi!!!hHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!IhHHi!iHHi!!!hHHi!iHHi!!IhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!IhHHi!iHHi!!!hHHi!iHHi!!!hHHi!iHHi!!ihHHi!iHHi!!hhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!IhHHi!iHHi!!!hHHi!iHHi!!IhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!IhHHi!iHHi!!!hHHi!iHHi!!!hHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!");
    }

    @Test
    public void test3929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3929");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!", (int) ' ', (int) (short) 10, "HHHI!hHHI!Hhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhiHHHI!hHHI!Hhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!!" + "'", str4, "hhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhiHHHI!hHHI!Hhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!!");
    }

    @Test
    public void test3930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3930");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHHI!IHHI!HHI!IHI!!HI!!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHHI!IHHI!HHI!IHI!!HI!!" + "'", str2, "hHHI!IHHI!HHI!IHI!!HI!!");
    }

    @Test
    public void test3931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3931");
        char[] charArray10 = new char[] {};
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("hi!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("hH", charArray10);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhhI!IhhI!HI!!h", charArray10);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("HHI!iHI!!", charArray10);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("HHHi!iHHi!hi!!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hi!" + "'", str14, "Hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hH" + "'", str17, "hH");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hhhhI!IhhI!HI!!h" + "'", str18, "hhhhI!IhhI!HI!!h");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "HHI!iHI!!" + "'", str19, "HHI!iHI!!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HHHi!iHHi!hi!!" + "'", str20, "HHHi!iHHi!hi!!");
    }

    @Test
    public void test3932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3932");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("Hhhhi!hhhihhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test3933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3933");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHHhhhi!ihhi!hi!!hhHHhhhi!ihhi!hi!!hhHHhhhi!ihhi!hi!!hiHHhhhi!ihhi!hi!!h!HHhhhi!ihhi!hi!!hiHHhhhi!ihhhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!", (int) (byte) -1, 10, "HHhhi!ihhi!hi!!HHhhi!ihhi!hi!!HHhhi!ihhi!hi!!IHhhi!ihhi!hi!!!Hhhi!ihhi!hi!!IHhhi!ihhi!hi!!HHhhi!ihhiHHHI!hHHI!hHi!HHhi!!hi!!HHhhi!ihhi!hi!!IHhhi!ihhi!hi!!!Hhhi!ihhi!hi!!HHhhi!ihhi!hi!!HHhhi!ihhi!hi!!HHhhi!ihhi!hi!!HHhhiHHHI!hHHI!hHi!HHhi!!ihhi!hi!!IHhhi!ihhi!hi!!!Hhhi!ihhi!hi!!IHhhi!ihhi!hi!!HHhhi!ihhi!hi!!HHhhi!ihhi!hi!!IHhhi!ihhi!hi!!HHHI!hHHI!hHi!HHhi!!Hhhi!ihhi!hi!!HHhhi!ihhi!hi!!IHhhi!ihhi!hi!!!Hhhi!ihhi!hi!!!Hhhi!ihhi!hi!!H");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHhhhi!ihHHhhi!ihhi!hi!!HHhhi!ihhi!hi!!HHhhi!ihhi!hi!!IHhhi!ihhi!hi!!!Hhhi!ihhi!hi!!IHhhi!ihhi!hi!!HHhhi!ihhiHHHI!hHHI!hHi!HHhi!!hi!!HHhhi!ihhi!hi!!IHhhi!ihhi!hi!!!Hhhi!ihhi!hi!!HHhhi!ihhi!hi!!HHhhi!ihhi!hi!!HHhhi!ihhi!hi!!HHhhiHHHI!hHHI!hHi!HHhi!!ihhi!hi!!IHhhi!ihhi!hi!!!Hhhi!ihhi!hi!!IHhhi!ihhi!hi!!HHhhi!ihhi!hi!!HHhhi!ihhi!hi!!IHhhi!ihhi!hi!!HHHI!hHHI!hHi!HHhi!!Hhhi!ihhi!hi!!HHhhi!ihhi!hi!!IHhhi!ihhi!hi!!!Hhhi!ihhi!hi!!!Hhhi!ihhi!hi!!H" + "'", str4, "hHHhhhi!ihHHhhi!ihhi!hi!!HHhhi!ihhi!hi!!HHhhi!ihhi!hi!!IHhhi!ihhi!hi!!!Hhhi!ihhi!hi!!IHhhi!ihhi!hi!!HHhhi!ihhiHHHI!hHHI!hHi!HHhi!!hi!!HHhhi!ihhi!hi!!IHhhi!ihhi!hi!!!Hhhi!ihhi!hi!!HHhhi!ihhi!hi!!HHhhi!ihhi!hi!!HHhhi!ihhi!hi!!HHhhiHHHI!hHHI!hHi!HHhi!!ihhi!hi!!IHhhi!ihhi!hi!!!Hhhi!ihhi!hi!!IHhhi!ihhi!hi!!HHhhi!ihhi!hi!!HHhhi!ihhi!hi!!IHhhi!ihhi!hi!!HHHI!hHHI!hHi!HHhi!!Hhhi!ihhi!hi!!HHhhi!ihhi!hi!!IHhhi!ihhi!hi!!!Hhhi!ihhi!hi!!!Hhhi!ihhi!hi!!H");
    }

    @Test
    public void test3934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3934");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhHHI!IHHI!!HhHHI!IHHI!!hhHHI!IHHI!!hhHHI!IHHI!!IhHHI!IHHI!!!hHHI!IHHI!!IhHHI!IHHI!!hhHHI!IHHI!!hhHHI!IHHI!!IhHHI!IHHI!!!hHHI!IHHI!!hhHHI!IHHI!!hhHHI!IHHI!!hhHHI!IHHI!!ihHHI!IHHI!!!hHHI!IHHI!!ihHHI!IHHI!!hhHHI!IHHI!!hhHHI!IHHI!!ihHHI!IHHI!!!hHHI!IHHI!!!hHHI!IHHI!!HhHHI!IHHI!!IhHHI!IHHI!!!hHHI!IHHI!!!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhHHI!IHHI!!HhHHI!IHHI!!hhHHI!IHHI!!hhHHI!IHHI!!IhHHI!IHHI!!!hHHI!IHHI!!IhHHI!IHHI!!hhHHI!IHHI!!hhHHI!IHHI!!IhHHI!IHHI!!!hHHI!IHHI!!hhHHI!IHHI!!hhHHI!IHHI!!hhHHI!IHHI!!ihHHI!IHHI!!!hHHI!IHHI!!ihHHI!IHHI!!hhHHI!IHHI!!hhHHI!IHHI!!ihHHI!IHHI!!!hHHI!IHHI!!!hHHI!IHHI!!HhHHI!IHHI!!IhHHI!IHHI!!!hHHI!IHHI!!!" + "'", str2, "hhHHI!IHHI!!HhHHI!IHHI!!hhHHI!IHHI!!hhHHI!IHHI!!IhHHI!IHHI!!!hHHI!IHHI!!IhHHI!IHHI!!hhHHI!IHHI!!hhHHI!IHHI!!IhHHI!IHHI!!!hHHI!IHHI!!hhHHI!IHHI!!hhHHI!IHHI!!hhHHI!IHHI!!ihHHI!IHHI!!!hHHI!IHHI!!ihHHI!IHHI!!hhHHI!IHHI!!hhHHI!IHHI!!ihHHI!IHHI!!!hHHI!IHHI!!!hHHI!IHHI!!HhHHI!IHHI!!IhHHI!IHHI!!!hHHI!IHHI!!!");
    }

    @Test
    public void test3935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3935");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hhhi!hhhi!hHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HhHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!IHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!!HHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!hhhi!hHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HhHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!IHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!!HHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!" + "'", str1, "Hhhi!hhhi!hHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HhHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!IHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!!HHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!");
    }

    @Test
    public void test3936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3936");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhhhhi!ihhi!hhi!ihi!!hi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhhhhi!ihhi!hhi!ihi!!hi!!" + "'", str1, "Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhhhhi!ihhi!hhi!ihi!!hi!!");
    }

    @Test
    public void test3937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3937");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!iHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!!HHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!iHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!!HHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!iHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!iHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!!HHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!!", 0, "hhhhh", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!iHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!!HHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!iHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!!HHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!iHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!iHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!!HHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!!" + "'", str4, "hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!iHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!!HHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!iHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!!HHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!iHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!iHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!!HHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!!");
    }

    @Test
    public void test3938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3938");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHHI!IHHI!hhhI!IhhI!hhhi!ihhi!!HI!!", (int) ' ', (int) (short) 0, "HhHhhi!ihhhHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHHHHI!IHHI!HHI!IHI!!HI!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHHI!IHHI!hhhI!IhhI!hhhi!ihhi!!HHhHhhi!ihhhHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHHHHI!IHHI!HHI!IHI!!HI!!" + "'", str4, "HHHI!IHHI!hhhI!IhhI!hhhi!ihhi!!HHhHhhi!ihhhHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHHHHI!IHHI!HHI!IHI!!HI!!");
    }

    @Test
    public void test3939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3939");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHhhI!IhhI!!HHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!iHhhI!IhhI!!!HhhI!IhhI!!iHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!iHhhI!IhhI!!!HhhI!IhhI!!!HhhI!IhhI!!HHhhI!IhhI!!HHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!iHhhI!IhhI!!!HhhI!IhhI!!iHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!iHhhI!IhhI!!!HhhI!IhhI!!!HhhI!IhhI!!HHhhI!IhhI!!HHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!iHhhI!IhhI!!!HhhI!IhhI!!iHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!iHhhI!IhhI!!!HhhI!IhhI!!!HhhI!IhhI!!IHhhI!IhhI!!HHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!iHhhI!IhhI!!!HhhI!IhhI!!iHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!iHhhI!IhhI!!!HhhI!IhhI!!!HhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!HHhhI!IhhI!!IHhhI!IhhI!!!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHhhI!IhhI!!HHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!iHhhI!IhhI!!!HhhI!IhhI!!iHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!iHhhI!IhhI!!!HhhI!IhhI!!!HhhI!IhhI!!HHhhI!IhhI!!HHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!iHhhI!IhhI!!!HhhI!IhhI!!iHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!iHhhI!IhhI!!!HhhI!IhhI!!!HhhI!IhhI!!HHhhI!IhhI!!HHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!iHhhI!IhhI!!!HhhI!IhhI!!iHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!iHhhI!IhhI!!!HhhI!IhhI!!!HhhI!IhhI!!IHhhI!IhhI!!HHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!iHhhI!IhhI!!!HhhI!IhhI!!iHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!iHhhI!IhhI!!!HhhI!IhhI!!!HhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!HHhhI!IhhI!!IHhhI!IhhI!!!" + "'", str2, "hHhhI!IhhI!!HHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!iHhhI!IhhI!!!HhhI!IhhI!!iHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!iHhhI!IhhI!!!HhhI!IhhI!!!HhhI!IhhI!!HHhhI!IhhI!!HHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!iHhhI!IhhI!!!HhhI!IhhI!!iHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!iHhhI!IhhI!!!HhhI!IhhI!!!HhhI!IhhI!!HHhhI!IhhI!!HHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!iHhhI!IhhI!!!HhhI!IhhI!!iHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!iHhhI!IhhI!!!HhhI!IhhI!!!HhhI!IhhI!!IHhhI!IhhI!!HHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!iHhhI!IhhI!!!HhhI!IhhI!!iHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!iHhhI!IhhI!!!HhhI!IhhI!!!HhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!HHhhI!IhhI!!IHhhI!IhhI!!!");
    }

    @Test
    public void test3940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3940");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HhhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!H!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HhhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!H!" + "'", str2, "HhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HhhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!H!");
    }

    @Test
    public void test3941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3941");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HhHHI!HHHI!Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!", (-1), 1, "Hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhihhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhhhhi!ihhi!hi!!h");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhihhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhhhhi!ihhi!hi!!h" + "'", str4, "HHhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhihhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhhhhi!ihhi!hi!!h");
    }

    @Test
    public void test3942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3942");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!h" + "'", str1, "hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!h");
    }

    @Test
    public void test3943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3943");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("HhHHHi!iHHHHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!IHhhi!ihhi!HHI!iHI!!hi!!!Hhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!IHhhi!ihhi!HHI!iHI!!hi!!!Hhhi!ihhi!HHI!iHI!!hi!!IHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!IHhhi!ihhi!HHI!iHI!!hi!!!Hhhi!ihhi!HHI!iHI!!hi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhhi!ihhhhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!!hhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!!hhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!!hhhi!ihhi!hhi!ihi!!hi!!!" + "'", str1, "Hhhhhi!ihhhhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!!hhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!!hhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!!hhhi!ihhi!hhi!ihi!!hi!!!");
    }

    @Test
    public void test3944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3944");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!hhi!ihi!!hi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!HHI!IHI!!HI!!" + "'", str1, "HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!HHI!IHI!!HI!!");
    }

    @Test
    public void test3945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3945");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HhHH", 0, 1, "Hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!" + "'", str4, "HHhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!");
    }

    @Test
    public void test3946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3946");
        char[] charArray10 = new char[] {};
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("H", charArray10);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("hH", charArray10);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.uncapitalize("hHhi!", charArray10);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("Hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhihhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhhhhi!ihhi!hi!!h", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hi!" + "'", str14, "Hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "h" + "'", str16, "h");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H" + "'", str17, "H");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hH" + "'", str18, "hH");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hHhi!" + "'", str19, "hHhi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhihhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhhhhi!ihhi!hi!!h" + "'", str20, "Hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhihhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhhhhi!ihhi!hi!!h");
    }

    @Test
    public void test3947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3947");
        char[] charArray12 = new char[] { '#', '4', '4', '4' };
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray12);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray12);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("", charArray12);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("H", charArray12);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("hhI!HhI!HhhhHHI!HHHI!Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!", charArray12);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!ihhi!hhhhi!ihhi!hi!!h", charArray12);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.uncapitalize("hhhhhi!hhhHHhhI!IhhIHHHHI!HHHI!IHHI!!", charArray12);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhhI!IhhI!hHhhhhhI!IhhI!hHhhhhhI!IhhI!hHhhhhhI!IhhI!hHhhhhhI!IhhI!hHhihhhI!IhhI!hHh!hhhI!IhhI!hHhhhhhI!IhhI!hHhhhhhI!IhhI!hHhhhhhI!IhhI!hHhhhhhI!IhhI!hHhHhhhI!IhhI!hHhHhhhI!IhhI!hHhIhhhI!IhhI!hHh!hhhI!IhhI!hHhHhhhI!IhhI!hHhHhhhI!IhhI!hHhHhhhI!IhhI!hHhIhhhI!IhhI!hHh!hhhI!IhhI!hHhIhhhI!IhhI!hHhHhhhI!IhhI!hHhHhhhI!IhhI!hHhIhhhI!IhhI!hHh!hhhI!IhhI!hHh!", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '#', '4', '4', '4' });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hi!" + "'", str13, "Hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hi!" + "'", str14, "Hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hhI!HhI!HhhhHHI!HHHI!Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!" + "'", str17, "hhI!HhI!HhhhHHI!HHHI!Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hhhi!ihhi!hhhhi!ihhi!hi!!h" + "'", str18, "Hhhi!ihhi!hhhhi!ihhi!hi!!h");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hhhhhi!hhhHHhhI!IhhIHHHHI!HHHI!IHHI!!" + "'", str19, "hhhhhi!hhhHHhhI!IhhIHHHHI!HHHI!IHHI!!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hhhhi!ihhi!hhhhhhhi!ihhi!hhhhhhhi!ihhi!hhhhhhhi!ihhi!hhhhhhhi!ihhi!hhhihhhi!ihhi!hhh!hhhi!ihhi!hhhhhhhi!ihhi!hhhhhhhi!ihhi!hhhhhhhi!ihhi!hhhhhhhi!ihhi!hhhhhhhi!ihhi!hhhhhhhi!ihhi!hhhihhhi!ihhi!hhh!hhhi!ihhi!hhhhhhhi!ihhi!hhhhhhhi!ihhi!hhhhhhhi!ihhi!hhhihhhi!ihhi!hhh!hhhi!ihhi!hhhihhhi!ihhi!hhhhhhhi!ihhi!hhhhhhhi!ihhi!hhhihhhi!ihhi!hhh!hhhi!ihhi!hhh!" + "'", str20, "Hhhhi!ihhi!hhhhhhhi!ihhi!hhhhhhhi!ihhi!hhhhhhhi!ihhi!hhhhhhhi!ihhi!hhhihhhi!ihhi!hhh!hhhi!ihhi!hhhhhhhi!ihhi!hhhhhhhi!ihhi!hhhhhhhi!ihhi!hhhhhhhi!ihhi!hhhhhhhi!ihhi!hhhhhhhi!ihhi!hhhihhhi!ihhi!hhh!hhhi!ihhi!hhhhhhhi!ihhi!hhhhhhhi!ihhi!hhhhhhhi!ihhi!hhhihhhi!ihhi!hhh!hhhi!ihhi!hhhihhhi!ihhi!hhhhhhhi!ihhi!hhhhhhhi!ihhi!hhhihhhi!ihhi!hhh!hhhi!ihhi!hhh!");
    }

    @Test
    public void test3948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3948");
        char[] charArray7 = new char[] {};
        java.lang.String str8 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("hi!", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("Hhi!", charArray7);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("HhhI!IhhI!hHHHi!iHHi!hi!!H", charArray7);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhi!Hhhi!hhHI!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hI!" + "'", str11, "hI!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hhi!" + "'", str12, "Hhi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HhhI!IhhI!hHHHi!iHHi!hi!!H" + "'", str13, "HhhI!IhhI!hHHHi!iHHi!hi!!H");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hhhi!Hhhi!hhHI!" + "'", str14, "hhhi!Hhhi!hhHI!");
    }

    @Test
    public void test3949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3949");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!hhhi!ihhi!hhhi!ihhi!hhhi!ihhi!!hi!!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhihhhi!ihhi!hhhi!ihhi!hhhi!ihhi!!hi!!!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhhhhi!ihhi!hhhi!ihhi!hhhi!ihhi!!hi!!i!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhhhi!ihhi!hhhi!ihhi!hhhi!ihhi!!hi!!hi!!ihhhi!ihhi!!!hhhi!ihhi!!!", (-1), (int) (short) 100, "hhhhi!hhhi!ihhi!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!hhhi!ihhi!hhhi!ihhi!hhhi!ihhi!!hi!!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhihhhhi!hhhi!ihhi!!" + "'", str4, "Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!hhhi!ihhi!hhhi!ihhi!hhhi!ihhi!!hi!!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhihhhhi!hhhi!ihhi!!");
    }

    @Test
    public void test3950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3950");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HHHHHI!IHHI!!HHHHHI!IHHI!!HHHHHI!IHHHHHI!HHHIHHHI!HHHI!IHHI!!HI!!IHHHHI!IHHI!!!HHHHI!IHHI!!HHHHHHhhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhHhhi!ihhi!HHI!iHI!!hi!!HHHI!HHHIHHHI!HHHI!IHHI!!I!IHHI!!HHHHHI!IHHI!!HHHHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHI!IHHI!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhHhhi!ihhi!HHI!iHI!!hi!!!!HHHHI!IHHI!!IHHHHI!IHHHHHHI!HHHIHHHI!HHHI!IHHI!!I!!HHHHHI!IHHI!!HHHHHI!IHHI!!IHHHHIHHHHI!HHHIHHhhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhHhhi!ihhi!HHI!iHI!!hi!!HI!HHHI!IHHI!!!IHHI!!!HHHHI!IHHI!!!", (int) ' ', "HhhhI!IhhI!HI!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHHHHI!IHHI!!HHHHHI!IHHI!!HHHHHI!IHHHHHI!HHHIHHHI!HHHI!IHHI!!HI!!IHHHHI!IHHI!!!HHHHI!IHHI!!HHHHHHhhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhHhhi!ihhi!HHI!iHI!!hi!!HHHI!HHHIHHHI!HHHI!IHHI!!I!IHHI!!HHHHHI!IHHI!!HHHHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHI!IHHI!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhHhhi!ihhi!HHI!iHI!!hi!!!!HHHHI!IHHI!!IHHHHI!IHHHHHHI!HHHIHHHI!HHHI!IHHI!!I!!HHHHHI!IHHI!!HHHHHI!IHHI!!IHHHHIHHHHI!HHHIHHhhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhHhhi!ihhi!HHI!iHI!!hi!!HI!HHHI!IHHI!!!IHHI!!!HHHHI!IHHI!!!" + "'", str4, "HHHHHI!IHHI!!HHHHHI!IHHI!!HHHHHI!IHHHHHI!HHHIHHHI!HHHI!IHHI!!HI!!IHHHHI!IHHI!!!HHHHI!IHHI!!HHHHHHhhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhHhhi!ihhi!HHI!iHI!!hi!!HHHI!HHHIHHHI!HHHI!IHHI!!I!IHHI!!HHHHHI!IHHI!!HHHHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHI!IHHI!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhHhhi!ihhi!HHI!iHI!!hi!!!!HHHHI!IHHI!!IHHHHI!IHHHHHHI!HHHIHHHI!HHHI!IHHI!!I!!HHHHHI!IHHI!!HHHHHI!IHHI!!IHHHHIHHHHI!HHHIHHhhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhHhhi!ihhi!HHI!iHI!!hi!!HI!HHHI!IHHI!!!IHHI!!!HHHHI!IHHI!!!");
    }

    @Test
    public void test3951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3951");
        char[] charArray7 = new char[] {};
        java.lang.String str8 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("hhI!", charArray7);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("HHi!", charArray7);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("Hhhhi!ihhi!hi!!hhhhi!ihhi!hi!!hhhhi!ihhi!hi!!ihhhi!ihhi!hi!!!hhhi!ihhi!hi!!ihhhi!ihhi!hi!!hhhhi!ihhi!hi!!hhhhi!ihhi!hi!!ihhhi!ihhi!hi!!!hhhi!ihhi!hi!!hhhhi!ihhi!hi!!hhhhi!ihhi!hi!!hhhhi!ihhi!hi!!hhhhi!ihhi!hi!!ihhhi!ihhi!hi!!!hhhi!ihhi!hi!!ihhhi!ihhi!hi!!hhhhi!ihhi!hi!!hhhhi!ihhi!hi!!ihhhi!ihhi!hi!!!hhhi!ihhi!hi!!hhhhi!ihhi!hi!!ihhhi!ihhi!hi!!!hhhi!ihhi!hi!!!hhhi!ihhi!hi!!h", charArray7);
        java.lang.Class<?> wildcardClass15 = charArray7.getClass();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HHi!" + "'", str13, "HHi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3952");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("HHHHHI!IHHI!!HHHHHI!IHHI!!HHHHHI!IHHI!!IHHHHI!IHHI!!HHHI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHHHI!IHHI!!HHHHHI!IHHI!!HHHHHI!IHHI!!IHHHHI!IHHI!!HHHI!" + "'", str1, "HHHHHI!IHHI!!HHHHHI!IHHI!!HHHHHI!IHHI!!IHHHHI!IHHI!!HHHI!");
    }

    @Test
    public void test3953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3953");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("HhHhhi!ihhhHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHHHHI!IHHI!HHI!IHI!!HI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test3954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3954");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HhHHI!HhHHI!HhHHI!IhHHI!!hHHI!IhHHI!HhHHI!HhHHI!IhHHI!!hHHI!HhHHI!HhHHI!HhHHI!IhHHI!!hHHI!IhHHI!HhHHHHHHI!HHHI!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!I!HhHHI!IhHHI!!hHHI!!hHHI!HhHHI!IhHHI!!hHHI!!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HhHHI!HhHHI!HhHHI!IhHHI!!hHHI!IhHHI!HhHHI!HhHHI!IhHHI!!hHHI!HhHHI!HhHHI!HhHHI!IhHHI!!hHHI!IhHHI!HhHHHHHHI!HHHI!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!I!HhHHI!IhHHI!!hHHI!!hHHI!HhHHI!IhHHI!!hHHI!!" + "'", str2, "HhHHI!HhHHI!HhHHI!IhHHI!!hHHI!IhHHI!HhHHI!HhHHI!IhHHI!!hHHI!HhHHI!HhHHI!HhHHI!IhHHI!!hHHI!IhHHI!HhHHHHHHI!HHHI!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!I!HhHHI!IhHHI!!hHHI!!hHHI!HhHHI!IhHHI!!hHHI!!");
    }

    @Test
    public void test3955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3955");
        char[] charArray11 = new char[] {};
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("", charArray11);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray11);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("H", charArray11);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray11);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.uncapitalize("hhhi!ihhi!!", charArray11);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.uncapitalize("hHHI!IHHI!!", charArray11);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhhhhi!ihhi!hi!!h", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] {});
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hi!" + "'", str15, "Hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "h" + "'", str17, "h");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H" + "'", str18, "H");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Hi!" + "'", str19, "Hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hhhi!ihhi!!" + "'", str20, "hhhi!ihhi!!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hHHI!IHHI!!" + "'", str21, "hHHI!IHHI!!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhhhhi!ihhi!hi!!h" + "'", str22, "Hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhhhhi!ihhi!hi!!h");
    }

    @Test
    public void test3956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3956");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!hhhhi!Hhhi!Ihhi!!hhhhi!Hhhi!Ihhi!!hhhhi!Hhhi!Ihhi!!ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!ihhhi!Hhhi!Ihhi!!hhhhi!Hhhi!Ihhi!!hhhhi!Hhhi!Ihhi!!ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!hhhhi!Hhhi!Ihhi!!ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!h", (int) (byte) 0, (int) (short) 1, "hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhihhi!hhi!hhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhihhi!hhi!hhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!" + "'", str4, "hhhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhihhi!hhi!hhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
    }

    @Test
    public void test3957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3957");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("h", (int) ' ', "Hhhhhi!hhhi!hhhi!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "h" + "'", str4, "h");
    }

    @Test
    public void test3958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3958");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!", (int) (short) 10, 10, "HhHHI!HHHI!HHHI!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhhi!hhhiHhHHI!HHHI!HHHI!" + "'", str4, "Hhhhi!hhhiHhHHI!HHHI!HHHI!");
    }

    @Test
    public void test3959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3959");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HhHHHHI!IHHHHHI!IHHI!HHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!", (int) (byte) 10, "hHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!HHHI!IHHI!!HI!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HhHHHHI!IHHHHHI!IHHI!HHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!" + "'", str4, "HhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HhHHHHI!IHHHHHI!IHHI!HHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!");
    }

    @Test
    public void test3960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3960");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("Hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhihhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhhhhi!ihhi!hi!!h", (int) (byte) 10, "HHhhhi!ihhi!!HHhhhi!ihhi!!HHhhhi!ihhi!!IHhhhi!ihhi!!hhHI!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhihhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhhhhi!ihhi!hi!!h" + "'", str4, "Hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhihhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhhhhi!ihhi!hi!!h");
    }

    @Test
    public void test3961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3961");
        char[] charArray12 = new char[] {};
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray12);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("", charArray12);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("hi!", charArray12);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray12);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray12);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray12);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray12);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("hhi!", charArray12);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalizeFully("HhHHi!iHHi!!", charArray12);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalize("HHHi!iHHi!hi!!", charArray12);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!", charArray12);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!IhhHhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!H!iHHHHi!iHHi!hi!!H", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] {});
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hi!" + "'", str16, "Hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hi!" + "'", str18, "Hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hI!" + "'", str19, "hI!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hhi!" + "'", str20, "hhi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "HhHHi!iHHi!!" + "'", str21, "HhHHi!iHHi!!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "HHHi!iHHi!hi!!" + "'", str22, "HHHi!iHHi!hi!!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!" + "'", str23, "Hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Hhhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!IhhHhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!H!iHHHHi!iHHi!hi!!H" + "'", str24, "Hhhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!IhhHhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!H!iHHHHi!iHHi!hi!!H");
    }

    @Test
    public void test3962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3962");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHHHHHHHIHHhhhi!ihhi!hi!!hHH!HHhHHHHHHhhhi!ihhi!hi!!hHHHHIHH!HHHHhhhi!ihhi!hi!!hiHHHHHHHHIHHhhhi!ihhi!hi!!hHH!HH!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhhhhhhihhhhhi!ihhi!hi!!hhh!hhhhhhhhhhhhi!ihhi!hi!!hhhhhihh!hhhhhhhi!ihhi!hi!!hihhhhhhhhihhhhhi!ihhi!hi!!hhh!hh!" + "'", str1, "Hhhhhhhhhihhhhhi!ihhi!hi!!hhh!hhhhhhhhhhhhi!ihhi!hi!!hhhhhihh!hhhhhhhi!ihhi!hi!!hihhhhhhhhihhhhhi!ihhi!hi!!hhh!hh!");
    }

    @Test
    public void test3963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3963");
        char[] charArray6 = new char[] {};
        java.lang.String str7 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray6);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.initials("", charArray6);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray6);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray6);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("", charArray6);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("hHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hi!" + "'", str10, "Hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!" + "'", str12, "hHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!");
    }

    @Test
    public void test3964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3964");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hHhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihhhhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!!hh!H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihhhhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!!hh!H" + "'", str1, "HHhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihhhhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!!hh!H");
    }

    @Test
    public void test3965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3965");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hhhhhi!hhhHhhhi!hhhihhhi!ihhi!hi!!!ihhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhhhi!hhhHhhhi!hhhihhhi!ihhi!hi!!!ihhi!!" + "'", str1, "hhhhhi!hhhHhhhi!hhhihhhi!ihhi!hi!!!ihhi!!");
    }

    @Test
    public void test3966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3966");
        char[] charArray7 = new char[] {};
        java.lang.String str8 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("hi!", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray7);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("hHHHI!IHHIHHHi!iHHi!hHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!", charArray7);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("HHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hIHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!h!HhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hhHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hIHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!h!HhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hiHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hIHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!h!HhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!h!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hi!" + "'", str11, "Hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hHHHI!IHHIHHHi!iHHi!hHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!" + "'", str13, "hHHHI!IHHIHHHi!iHHi!hHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hIHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!h!HhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hhHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hIHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!h!HhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hiHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hIHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!h!HhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!h!" + "'", str14, "HHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hIHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!h!HhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hhHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hIHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!h!HhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hiHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hIHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!h!HhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!h!");
    }

    @Test
    public void test3967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3967");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhhi!ihhi!hi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!ihhi!hi!!" + "'", str1, "Hhhhi!ihhi!hi!!");
    }

    @Test
    public void test3968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3968");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhhhi!hhhi!hhhi!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhhhi!hhhi!hhhi!" + "'", str2, "Hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhhhi!hhhi!hhhi!");
    }

    @Test
    public void test3969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3969");
        char[] charArray10 = new char[] {};
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("Hi!", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray10);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("hHHi!iHHi!!", charArray10);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("HHhi!", charArray10);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("HhhI!IhhI!!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hi!" + "'", str14, "Hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hi!" + "'", str16, "Hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HI!" + "'", str17, "HI!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hHHi!iHHi!!" + "'", str18, "hHHi!iHHi!!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "HHhi!" + "'", str19, "HHhi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HhhI!IhhI!!" + "'", str20, "HhhI!IhhI!!");
    }

    @Test
    public void test3970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3970");
        char[] charArray11 = new char[] {};
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("", charArray11);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray11);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("H", charArray11);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("hH", charArray11);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("HH", charArray11);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.uncapitalize("HHHI!HHHI!HHHI!", charArray11);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalizeFully("HhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!HhHHHI!HHHI!IHHI!!HhHHHI!HHHI!IHHI!!IhHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!HhHHHI!HHHI!IHHI!!IhHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!!", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] {});
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hi!" + "'", str15, "Hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "h" + "'", str17, "h");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H" + "'", str18, "H");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hH" + "'", str19, "hH");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HH" + "'", str20, "HH");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "HHHI!HHHI!HHHI!" + "'", str21, "HHHI!HHHI!HHHI!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "HhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!HhHHHI!HHHI!IHHI!!HhHHHI!HHHI!IHHI!!IhHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!HhHHHI!HHHI!IHHI!!IhHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!!" + "'", str22, "HhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!HhHHHI!HHHI!IHHI!!HhHHHI!HHHI!IHHI!!IhHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!HhHHHI!HHHI!IHHI!!IhHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!!");
    }

    @Test
    public void test3971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3971");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!hhhi!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhhi!ihhi!!", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhi!hhhi!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhhi!ihhi!!" + "'", str2, "Hhhi!hhhi!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhhi!ihhi!!");
    }

    @Test
    public void test3972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3972");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!H" + "'", str1, "HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!H");
    }

    @Test
    public void test3973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3973");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!h", (int) ' ', (int) 'a', "hHHi!iHHi!hhhi!hhhi!hhi!hhhi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihHHi!iHHi!hhhi!hhhi!hhi!hhhi!" + "'", str4, "Hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihHHi!iHHi!hhhi!hhhi!hhi!hhhi!");
    }

    @Test
    public void test3974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3974");
        char[] charArray9 = new char[] {};
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("H", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("hhhI!IhhI!HI!!", charArray9);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("hH", charArray9);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("H", charArray9);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("hhHHHI!HHHHhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hhhI!IhhI!HI!!" + "'", str15, "hhhI!IhhI!HI!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hH" + "'", str16, "hH");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H" + "'", str17, "H");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hhHHHI!HHHHhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!" + "'", str18, "hhHHHI!HHHHhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
    }

    @Test
    public void test3975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3975");
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
        java.lang.String str24 = org.apache.commons.lang.WordUtils.initials("hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhhi!hhhi!hhi!hhhi!", charArray12);
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
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test3976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3976");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhI!", 10, 10, "Hhhhhhhhhihhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end 10, length 4");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3977");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hHHI!IHHI!hhHHI!HHHI!Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!", (int) (short) 100, "Hhhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhhhhi!hhhihhhi!hhhi!ihhi!!hi!!ihhhhi!ihhi!!!hhhhi!ihhi!!hhhhhhhhhhhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhihhi!hhi!hhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHI!IHHI!hhHHI!HHHI!Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!" + "'", str4, "hHHI!IHHI!hhHHI!HHHI!Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
    }

    @Test
    public void test3978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3978");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("", 0, 0, "hHHHI!IHHIHHHI!hHHI!hHi!HHhi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test3979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3979");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!IHhhi!ihhi!HHI!iHI!!hi!!!Hhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!IHhhi!ihhi!HHI!iHI!!hi!!!Hhhi!ihhi!HHI!iHI!!hi!!IHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!IHhhi!ihhi!HHI!iHI!!hi!!!Hhhi!ihhi!HHI!iHI!!hi!!!", (int) (byte) 1, "hhhhI!IhhI!hHhhhhhI!IhhI!hHhhhhhI!IhhI!hHhhhhhI!IhhI!hHhhhhhI!IhhI!hHhihhhI!IhhI!hHh!hhhI!IhhI!hHhhhhhI!IhhI!hHhhhhhI!IhhI!hHhhhhhI!IhhI!hHhhhhhI!IhhI!hHhHhhhI!IhhI!hHhHhhhI!IhhI!hHhIhhhI!IhhI!hHh!hhhI!IhhI!hHhHhhhI!IhhI!hHhHhhhI!IhhI!hHhHhhhI!IhhI!hHhIhhhI!IhhI!hHh!hhhI!IhhI!hHhIhhhI!IhhI!hHhHhhhI!IhhI!hHhHhhhI!IhhI!hHhIhhhI!IhhI!hHh!hhhI!IhhI!hHh!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!IHhhi!ihhi!HHI!iHI!!hi!!!Hhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!IHhhi!ihhi!HHI!iHI!!hi!!!Hhhi!ihhi!HHI!iHI!!hi!!IHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!IHhhi!ihhi!HHI!iHI!!hi!!!Hhhi!ihhi!HHI!iHI!!hi!!!" + "'", str4, "hHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!IHhhi!ihhi!HHI!iHI!!hi!!!Hhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!IHhhi!ihhi!HHI!iHI!!hi!!!Hhhi!ihhi!HHI!iHI!!hi!!IHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!IHhhi!ihhi!HHI!iHI!!hi!!!Hhhi!ihhi!HHI!iHI!!hi!!!");
    }

    @Test
    public void test3980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3980");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!HhHhhhi!ihhi!HHHi!iHHi!hi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!HhHhhhi!ihhi!HHHi!iHHi!hi!!" + "'", str1, "HHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!HhHhhhi!ihhi!HHHi!iHHi!hi!!");
    }

    @Test
    public void test3981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3981");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hHHI!IHHI!hhHHI!HHHI!Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!ihhi!HHhhi!hhhi!hHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HhHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!IHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!!HHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!" + "'", str1, "Hhhi!ihhi!HHhhi!hhhi!hHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HhHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!IHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!!HHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!");
    }

    @Test
    public void test3982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3982");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("HhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!!hHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!!hHHHI!IHHI!HI!!!hHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!!hHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!!hHHHI!IHHI!HI!!!hHHHI!IHHI!HI!!HhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!!hHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!HhHHHI!IHHI!HI!!HhHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!!hHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!HhHHHI!IHHI!HI!!HhHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!!hHHHI!IHHI!HI!!ihHHHI!IHHI!HI!!HhHHHI!IHHI!HI!!HhHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!!hHHHI!IHHI!HI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!!hHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!!hHHHI!IHHI!HI!!!hHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!!hHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!!hHHHI!IHHI!HI!!!hHHHI!IHHI!HI!!HhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!!hHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!HhHHHI!IHHI!HI!!HhHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!!hHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!HhHHHI!IHHI!HI!!HhHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!!hHHHI!IHHI!HI!!ihHHHI!IHHI!HI!!HhHHHI!IHHI!HI!!HhHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!!hHHHI!IHHI!HI!!!" + "'", str1, "HhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!!hHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!!hHHHI!IHHI!HI!!!hHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!!hHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!!hHHHI!IHHI!HI!!!hHHHI!IHHI!HI!!HhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!!hHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!HhHHHI!IHHI!HI!!HhHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!!hHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!HhHHHI!IHHI!HI!!HhHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!!hHHHI!IHHI!HI!!ihHHHI!IHHI!HI!!HhHHHI!IHHI!HI!!HhHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!!hHHHI!IHHI!HI!!!");
    }

    @Test
    public void test3983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3983");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("Hhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!Hhihi!!hi!hhi!ihi!!hi!!", 100, "Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhhhi!ihhi!hhi!ihi!!hi!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!Hhihi!!hi!hhi!ihi!!hi!!" + "'", str4, "Hhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!Hhihi!!hi!hhi!ihi!!hi!!");
    }

    @Test
    public void test3984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3984");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hhhI!IhhI!HI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HhhI!IhhI!HI!!" + "'", str1, "HhhI!IhhI!HI!!");
    }

    @Test
    public void test3985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3985");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!" + "'", str1, "Hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!");
    }

    @Test
    public void test3986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3986");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hHhi!Ihi!!hHhi!Ihi!!hHhi!Ihi!!hHhi!Ihi!!iHhi!Ihi!!!Hhi!Ihi!!hHhi!Ihi!!hHhi!Ihi!!hHhi!Ihi!!iHhi!Ihi!!!Hhi!Ihi!!iHhi!Ihi!!hHhi!Ihi!!hHhi!Ihi!!iHhi!Ihi!!!Hhi!Ihi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHhi!Ihi!!hHhi!Ihi!!hHhi!Ihi!!hHhi!Ihi!!iHhi!Ihi!!!Hhi!Ihi!!hHhi!Ihi!!hHhi!Ihi!!hHhi!Ihi!!iHhi!Ihi!!!Hhi!Ihi!!iHhi!Ihi!!hHhi!Ihi!!hHhi!Ihi!!iHhi!Ihi!!!Hhi!Ihi!!!" + "'", str1, "HHhi!Ihi!!hHhi!Ihi!!hHhi!Ihi!!hHhi!Ihi!!iHhi!Ihi!!!Hhi!Ihi!!hHhi!Ihi!!hHhi!Ihi!!hHhi!Ihi!!iHhi!Ihi!!!Hhi!Ihi!!iHhi!Ihi!!hHhi!Ihi!!hHhi!Ihi!!iHhi!Ihi!!!Hhi!Ihi!!!");
    }

    @Test
    public void test3987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3987");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HIHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!H!HHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HIHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!H!HHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HIHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HIHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!H!HHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!H!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HIHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!H!HHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HIHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!H!HHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HIHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HIHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!H!HHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!H!" + "'", str2, "hHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HIHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!H!HHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HIHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!H!HHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HIHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HIHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!H!HHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!H!");
    }

    @Test
    public void test3988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3988");
        char[] charArray5 = new char[] {};
        java.lang.String str6 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray5);
        java.lang.String str7 = org.apache.commons.lang.WordUtils.initials("h", charArray5);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.uncapitalize("Hhi!", charArray5);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("hHHi!iHHi!HHHI!IHHI!!hi!!", charArray5);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("hhI!HhI!HhI!HhI!ihI!!hI!ihI!HhI!HhIHhhhhhhhhhhhhhhhihhh!hhhhhhhhhhhhhhhihhh!hhhihhhhhhhhhhhihhh!hhh!", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hhi!" + "'", str8, "Hhi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hhI!HhI!HhI!HhI!ihI!!hI!ihI!HhI!HhIHhhhhhhhhhhhhhhhihhh!hhhhhhhhhhhhhhhihhh!hhhihhhhhhhhhhhihhh!hhh!" + "'", str10, "hhI!HhI!HhI!HhI!ihI!!hI!ihI!HhI!HhIHhhhhhhhhhhhhhhhihhh!hhhhhhhhhhhhhhhihhh!hhhihhhhhhhhhhhihhh!hhh!");
    }

    @Test
    public void test3989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3989");
        char[] charArray12 = new char[] { 'a', '4', 'a' };
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("", charArray12);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray12);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("HHHi!iHHi!!", charArray12);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray12);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("hhhI!IhhI!HI!!", charArray12);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("hhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!HhHHHI!HHHI!IHHI!!HhHHHI!HHHI!IHHI!!IhHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!HhHHHI!HHHI!IHHI!!IhHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!!", charArray12);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhhhhhhhhhhhhhihhh!hhhhhhhhhhhhhhhihhh!hhhihhhhhhhhhhhihhh!hhh!", charArray12);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.initials("hHHHI!IHHI!HHHI!IHHI!!HI!!", charArray12);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhHhhi!hhhi!hhhi!", charArray12);
        java.lang.Class<?> wildcardClass22 = charArray12.getClass();
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { 'a', '4', 'a' });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hHHi!iHHi!!" + "'", str15, "hHHi!iHHi!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hhhI!IhhI!HI!!" + "'", str17, "hhhI!IhhI!HI!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!HhHHHI!HHHI!IHHI!!HhHHHI!HHHI!IHHI!!IhHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!HhHHHI!HHHI!IHHI!!IhHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!!" + "'", str18, "hhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!HhHHHI!HHHI!IHHI!!HhHHHI!HHHI!IHHI!!IhHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!HhHHHI!HHHI!IHHI!!IhHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hhhhhhhhhhhhhhhhihhh!hhhhhhhhhhhhhhhihhh!hhhihhhhhhhhhhhihhh!hhh!" + "'", str19, "hhhhhhhhhhhhhhhhihhh!hhhhhhhhhhhhhhhihhh!hhhihhhhhhhhhhhihhh!hhh!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "h" + "'", str20, "h");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhhhi!hhhi!hhhi!" + "'", str21, "Hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhhhi!hhhi!hhhi!");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3990");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hHHHI!IHHI!HHHHI!IHHI!HI!!HHHHHI!IHHI!HHHHI!IHHI!HI!!HHHHHI!IHHI!HHHHI!IHHI!HI!!HHHHHI!IHHI!HHHHI!IHHI!HI!!HIHHHI!IHHI!HHHHI!IHHI!HI!!H!HHHI!IHHI!HHHHI!IHHI!HI!!HIHHHI!IHHI!HHHHI!IHHI!HI!!HHHHHI!IHHI!HHHHI!IHHI!HI!!HHHHHI!IHHI!HHHHI!IHHI!HI!!HIHHHI!IHHI!HHHHI!IHHI!HI!!H!HHHI!IHHI!HHHHI!IHHI!HI!!HHHHHI!IHHI!HHHHI!IHHI!HI!!HIHHHI!IHHI!HHHHI!IHHI!HI!!H!HHHI!IHHI!HHHHI!IHHI!HI!!H!HHHI!IHHI!HHHHI!IHHI!HI!!HH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!ihhi!hhhhi!ihhi!hi!!hhhhhi!ihhi!hhhhi!ihhi!hi!!hhhhhi!ihhi!hhhhi!ihhi!hi!!hhhhhi!ihhi!hhhhi!ihhi!hi!!hihhhi!ihhi!hhhhi!ihhi!hi!!h!hhhi!ihhi!hhhhi!ihhi!hi!!hihhhi!ihhi!hhhhi!ihhi!hi!!hhhhhi!ihhi!hhhhi!ihhi!hi!!hhhhhi!ihhi!hhhhi!ihhi!hi!!hihhhi!ihhi!hhhhi!ihhi!hi!!h!hhhi!ihhi!hhhhi!ihhi!hi!!hhhhhi!ihhi!hhhhi!ihhi!hi!!hihhhi!ihhi!hhhhi!ihhi!hi!!h!hhhi!ihhi!hhhhi!ihhi!hi!!h!hhhi!ihhi!hhhhi!ihhi!hi!!hh" + "'", str1, "Hhhhi!ihhi!hhhhi!ihhi!hi!!hhhhhi!ihhi!hhhhi!ihhi!hi!!hhhhhi!ihhi!hhhhi!ihhi!hi!!hhhhhi!ihhi!hhhhi!ihhi!hi!!hihhhi!ihhi!hhhhi!ihhi!hi!!h!hhhi!ihhi!hhhhi!ihhi!hi!!hihhhi!ihhi!hhhhi!ihhi!hi!!hhhhhi!ihhi!hhhhi!ihhi!hi!!hhhhhi!ihhi!hhhhi!ihhi!hi!!hihhhi!ihhi!hhhhi!ihhi!hi!!h!hhhi!ihhi!hhhhi!ihhi!hi!!hhhhhi!ihhi!hhhhi!ihhi!hi!!hihhhi!ihhi!hhhhi!ihhi!hi!!h!hhhi!ihhi!hhhhi!ihhi!hi!!h!hhhi!ihhi!hhhhi!ihhi!hi!!hh");
    }

    @Test
    public void test3991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3991");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HhHI!iHI!!HhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHHhhhhhhhhhhhhhhhihhh!hhhhhhhhhhhhhhhihhh!hhhihhhhhhhhhhhihhh!hhh!i!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!ihHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!!", (-1), 0, "HHhhhi!ihhi!!HHhhhi!ihhi!!HHhhhi!ihHhhhi!hhhiHhhi!hhhi!ihhi!!hi!!IHhhhi!ihhi!!!Hhhhi!ihhi!!HHhhhHhhhi!hhhiHhhi!hhhi!ihhi!!i!ihhi!!HHhhhi!ihhi!!HHhhhi!ihhi!!IHhhhi!hhhiHhhi!hhhi!ihhi!!Hhhhi!ihhi!!!Hhhhi!ihhi!!IHhhhi!ihhHhhhi!hhhiHhhi!hhhi!ihhi!!i!!HHhhhi!ihhi!!HHhhhi!ihhi!!IHhhhiHhhhi!hhhiHhhi!hhhi!ihhi!!!ihhi!!!Hhhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHhhhi!ihhi!!HHhhhi!ihhi!!HHhhhi!ihHhhhi!hhhiHhhi!hhhi!ihhi!!hi!!IHhhhi!ihhi!!!Hhhhi!ihhi!!HHhhhHhhhi!hhhiHhhi!hhhi!ihhi!!i!ihhi!!HHhhhi!ihhi!!HHhhhi!ihhi!!IHhhhi!hhhiHhhi!hhhi!ihhi!!Hhhhi!ihhi!!!Hhhhi!ihhi!!IHhhhi!ihhHhhhi!hhhiHhhi!hhhi!ihhi!!i!!HHhhhi!ihhi!!HHhhhi!ihhi!!IHhhhiHhhhi!hhhiHhhi!hhhi!ihhi!!!ihhi!!!Hhhhi!ihhi!!!" + "'", str4, "HHhhhi!ihhi!!HHhhhi!ihhi!!HHhhhi!ihHhhhi!hhhiHhhi!hhhi!ihhi!!hi!!IHhhhi!ihhi!!!Hhhhi!ihhi!!HHhhhHhhhi!hhhiHhhi!hhhi!ihhi!!i!ihhi!!HHhhhi!ihhi!!HHhhhi!ihhi!!IHhhhi!hhhiHhhi!hhhi!ihhi!!Hhhhi!ihhi!!!Hhhhi!ihhi!!IHhhhi!ihhHhhhi!hhhiHhhi!hhhi!ihhi!!i!!HHhhhi!ihhi!!HHhhhi!ihhi!!IHhhhiHhhhi!hhhiHhhi!hhhi!ihhi!!!ihhi!!!Hhhhi!ihhi!!!");
    }

    @Test
    public void test3992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3992");
        char[] charArray9 = new char[] { '#', ' ', '4' };
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("HHHHI!HHHIHhi!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("hHHHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!HHI!IHI!!HI!!", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("HHHHHI!IHHI!HI!!H", charArray9);
        java.lang.Class<?> wildcardClass16 = charArray9.getClass();
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '#', ' ', '4' });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hi!" + "'", str10, "Hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HHHHI!HHHIHhi!" + "'", str13, "HHHHI!HHHIHhi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "h" + "'", str14, "h");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hHHHHI!IHHI!HI!!H" + "'", str15, "hHHHHI!IHHI!HI!!H");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3993");
        char[] charArray7 = new char[] {};
        java.lang.String str8 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("hI!", charArray7);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("hhhi!hhhi!ihhi!!", charArray7);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("Hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhihhhi!hhhi!ihhi!!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hi!" + "'", str11, "Hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hI!" + "'", str12, "hI!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhihhhi!hhhi!ihhi!!" + "'", str14, "Hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhihhhi!hhhi!ihhi!!");
    }

    @Test
    public void test3994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3994");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHI!IHHI!HHHI!IHHI!!HI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!ihhi!hhhi!ihhi!!hi!!" + "'", str1, "Hhhi!ihhi!hhhi!ihhi!!hi!!");
    }

    @Test
    public void test3995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3995");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("Hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhhhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHHHHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!HHHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!HHHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!HHHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!IHHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!!HHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!HHHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!HHHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!HHHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!IHHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!!HHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!IHHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!HHHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!HHHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!IHHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!!HHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!!" + "'", str1, "hHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHHHHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!HHHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!HHHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!HHHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!IHHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!!HHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!HHHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!HHHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!HHHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!IHHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!!HHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!IHHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!HHHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!HHHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!IHHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!!HHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!!");
    }

    @Test
    public void test3996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3996");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihHHHHHI!IHHI!!HHHHHI!IHHI!!HHHHHI!IHHHHHI!HHHIHHHI!HHHI!IHHI!!HI!!IHHHHI!IHHI!!!HHHHI!IHHI!!HHHHHHhhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhHhhi!ihhi!HHI!iHI!!hi!!HHHI!HHHIHHHI!HHHI!IHHI!!I!IHHI!!HHHHHI!IHHI!!HHHHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHI!IHHI!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhHhhi!ihhi!HHI!iHI!!hi!!!!HHHHI!IHHI!!IHHHHI!IHHHHHHI!HHHIHHHI!HHHI!IHHI!!I!!HHHHHI!IHHI!!HHHHHI!IHHI!!IHHHHIHHHHI!HHHIHHhhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhHhhi!ihhi!HHI!iHI!!hi!!HI!HHHI!IHHI!!!IHHI!!!HHHHI!IHHI!!!", (int) (short) 1, "HhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HihHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!H!hHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HHhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HihHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!H!hHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HIhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HihHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!H!hHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!H!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihHHHHHI!IHHI!!HHHHHI!IHHI!!HHHHHI!IHHHHHI!HHHIHHHI!HHHI!IHHI!!HI!!IHHHHI!IHHI!!!HHHHI!IHHI!!HHHHHHhhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhHhhi!ihhi!HHI!iHI!!hi!!HHHI!HHHIHHHI!HHHI!IHHI!!I!IHHI!!HHHHHI!IHHI!!HHHHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHI!IHHI!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhHhhi!ihhi!HHI!iHI!!hi!!!!HHHHI!IHHI!!IHHHHI!IHHHHHHI!HHHIHHHI!HHHI!IHHI!!I!!HHHHHI!IHHI!!HHHHHI!IHHI!!IHHHHIHHHHI!HHHIHHhhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhHhhi!ihhi!HHI!iHI!!hi!!HI!HHHI!IHHI!!!IHHI!!!HHHHI!IHHI!!!" + "'", str4, "Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihHHHHHI!IHHI!!HHHHHI!IHHI!!HHHHHI!IHHHHHI!HHHIHHHI!HHHI!IHHI!!HI!!IHHHHI!IHHI!!!HHHHI!IHHI!!HHHHHHhhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhHhhi!ihhi!HHI!iHI!!hi!!HHHI!HHHIHHHI!HHHI!IHHI!!I!IHHI!!HHHHHI!IHHI!!HHHHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHI!IHHI!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhHhhi!ihhi!HHI!iHI!!hi!!!!HHHHI!IHHI!!IHHHHI!IHHHHHHI!HHHIHHHI!HHHI!IHHI!!I!!HHHHHI!IHHI!!HHHHHI!IHHI!!IHHHHIHHHHI!HHHIHHhhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhHhhi!ihhi!HHI!iHI!!hi!!HI!HHHI!IHHI!!!IHHI!!!HHHHI!IHHI!!!");
    }

    @Test
    public void test3997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3997");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!", (int) (short) 100, (int) (short) 10, "hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHH");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHH" + "'", str4, "hHhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHH");
    }

    @Test
    public void test3998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3998");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hHHHHI!IHHI!!HHHHHI!IHHI!!HHHHHI!IHHI!!IHHHHI!IHHI!!HHHI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test3999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3999");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!H!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!H!" + "'", str2, "HhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!H!");
    }

    @Test
    public void test4000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test4000");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hHhhI!IhhI!!HHhhI!IhhI!!HHhhI!IhhI!!HHhhI!IhhI!!IHhhI!IhhI!!!HhhI!IhhI!!HHhhI!IhhI!!HHhhI!IhhI!!HHhhhHHHHHHHHHHHHHHHIHHH!HHHHHHHHHHHHHHHIHHH!HHHIHHHHHHHHHHHIHHH!HHH!I!IhhI!!IHhhI!IhhI!!!HhhI!IhhI!!IHhhI!IhhI!!HHhhI!IhhI!!HHhhI!IhhI!!IHhhI!IhhI!!!HhhI!IhhI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHhhI!IhhI!!HHhhI!IhhI!!HHhhI!IhhI!!HHhhI!IhhI!!IHhhI!IhhI!!!HhhI!IhhI!!HHhhI!IhhI!!HHhhI!IhhI!!HHhhhHHHHHHHHHHHHHHHIHHH!HHHHHHHHHHHHHHHIHHH!HHHIHHHHHHHHHHHIHHH!HHH!I!IhhI!!IHhhI!IhhI!!!HhhI!IhhI!!IHhhI!IhhI!!HHhhI!IhhI!!HHhhI!IhhI!!IHhhI!IhhI!!!HhhI!IhhI!!!" + "'", str1, "hHhhI!IhhI!!HHhhI!IhhI!!HHhhI!IhhI!!HHhhI!IhhI!!IHhhI!IhhI!!!HhhI!IhhI!!HHhhI!IhhI!!HHhhI!IhhI!!HHhhhHHHHHHHHHHHHHHHIHHH!HHHHHHHHHHHHHHHIHHH!HHHIHHHHHHHHHHHIHHH!HHH!I!IhhI!!IHhhI!IhhI!!!HhhI!IhhI!!IHhhI!IhhI!!HHhhI!IhhI!!HHhhI!IhhI!!IHhhI!IhhI!!!HhhI!IhhI!!!");
    }
}

