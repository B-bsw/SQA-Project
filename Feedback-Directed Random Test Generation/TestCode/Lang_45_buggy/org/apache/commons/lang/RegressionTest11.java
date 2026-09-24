package org.apache.commons.lang;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest11 {

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
    public void test5501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5501");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HhHHHI!IHHhhHhHhHhHhHhHhHhIhHh!hhhhi!hhhi!hhi!hhhi!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HhHHHI!IHHhhHhHhHhHhHhHhHhIhHh!hhhhi!hhhi!hhi!hhhi!" + "'", str2, "HhHHHI!IHHhhHhHhHhHhHhHhHhIhHh!hhhhi!hhhi!hhi!hhhi!");
    }

    @Test
    public void test5502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5502");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!HhHHHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!hHIHI!!HI!HHI!IHI!!HI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!hHhhhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!Hhihi!!hi!hhi!ihi!!hi!!" + "'", str1, "HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!hHhhhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!Hhihi!!hi!hhi!ihi!!hi!!");
    }

    @Test
    public void test5503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5503");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHHI!HHHI!IHHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!hhhi!ihhi!!" + "'", str1, "Hhhhi!hhhi!ihhi!!");
    }

    @Test
    public void test5504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5504");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!HHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!hHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!hHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!hHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!iHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!!HhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!iHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!hHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!hHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!iHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!!HhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!hHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!iHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!!HhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!!HhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!h", (int) (byte) -1, (int) (short) 100, "hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!HhHHHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!hHIHI!!HI!HHI!IHI!!HI!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!HHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!HhHHHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!hHIHI!!HI!HHI!IHI!!HI!!" + "'", str4, "HHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!HHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!HhHHHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!hHIHI!!HI!HHI!IHI!!HI!!");
    }

    @Test
    public void test5505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5505");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!Hhhhi!ihhihi!!hi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!Hhhhi!ihhihi!!hi!!" + "'", str1, "hHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!Hhhhi!ihhihi!!hi!!");
    }

    @Test
    public void test5506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5506");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HhhhhHhhi!ihhi!hi!!HHhhi!ihhi!hi!!HHhhi!ihhi!hi!!IHhhi!ihhi!hi!!!Hhhi!ihhi!hi!!IHhhi!ihhi!hi!!HHhhi!ihhiHHHI!hHHI!hHi!HHhi!!hi!!HHhhi!ihhi!hi!!IHhhi!ihhi!hi!!!Hhhi!ihhi!hi!!HHhhi!ihhi!hi!!HHhhi!ihhi!hi!!HHhhi!ihhi!hi!!HHhhiHHHI!hHHI!hHi!HHhi!!ihhi!hi!!IHhhi!ihhi!hi!!!Hhhi!ihhi!hi!!IHhhi!ihhi!hi!!HHhhi!ihhi!hi!!HHhhi!ihhi!hi!!IHhhi!ihhi!hi!!HHHI!hHHI!hHi!HHhi!!Hhhi!ihhi!hi!!HHhhi!ihhi!hi!!IHhhi!ihhi!hi!!!Hhhi!ihhi!hi!!!Hhhi!ihhi!hi!!H", (int) (byte) -1, "hhhhI!IhhIhHHI!hHHI!iHHI!!!HI!!h", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HhhhhHhhi!ihhi!hi!!HHhhi!ihhi!hi!!HHhhi!ihhi!hi!!IHhhi!ihhi!hi!!!Hhhi!ihhi!hi!!IHhhi!ihhi!hi!!HHhhi!ihhiHHHI!hHHI!hHi!HHhi!!hi!!HHhhi!ihhi!hi!!IHhhi!ihhi!hi!!!Hhhi!ihhi!hi!!HHhhi!ihhi!hi!!HHhhi!ihhi!hi!!HHhhi!ihhi!hi!!HHhhiHHHI!hHHI!hHi!HHhi!!ihhi!hi!!IHhhi!ihhi!hi!!!Hhhi!ihhi!hi!!IHhhi!ihhi!hi!!HHhhi!ihhi!hi!!HHhhi!ihhi!hi!!IHhhi!ihhi!hi!!HHHI!hHHI!hHi!HHhi!!Hhhi!ihhi!hi!!HHhhi!ihhi!hi!!IHhhi!ihhi!hi!!!Hhhi!ihhi!hi!!!Hhhi!ihhi!hi!!H" + "'", str4, "hHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HhhhhHhhi!ihhi!hi!!HHhhi!ihhi!hi!!HHhhi!ihhi!hi!!IHhhi!ihhi!hi!!!Hhhi!ihhi!hi!!IHhhi!ihhi!hi!!HHhhi!ihhiHHHI!hHHI!hHi!HHhi!!hi!!HHhhi!ihhi!hi!!IHhhi!ihhi!hi!!!Hhhi!ihhi!hi!!HHhhi!ihhi!hi!!HHhhi!ihhi!hi!!HHhhi!ihhi!hi!!HHhhiHHHI!hHHI!hHi!HHhi!!ihhi!hi!!IHhhi!ihhi!hi!!!Hhhi!ihhi!hi!!IHhhi!ihhi!hi!!HHhhi!ihhi!hi!!HHhhi!ihhi!hi!!IHhhi!ihhi!hi!!HHHI!hHHI!hHi!HHhi!!Hhhi!ihhi!hi!!HHhhi!ihhi!hi!!IHhhi!ihhi!hi!!!Hhhi!ihhi!hi!!!Hhhi!ihhi!hi!!H");
    }

    @Test
    public void test5507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5507");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("Hhhhi!ihhihhhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhhhhi!hhhihhhi!hhhi!ihhi!!hi!!ihhhhi!ihhi!!!hhhhi!ihhi!!hhhhhhhhhi!hhhihhhi!hhhi!ihhi!!i!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!hhhhi!ihhi!!!hhhhi!ihhi!!ihhhhi!ihhhhhhi!hhhihhhi!hhhi!ihhi!!i!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhihhhhi!hhhihhhi!hhhi!ihhi!!!ihhi!!!hhhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!ihhihhhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhhhhi!hhhihhhi!hhhi!ihhi!!hi!!ihhhhi!ihhi!!!hhhhi!ihhi!!hhhhhhhhhi!hhhihhhi!hhhi!ihhi!!i!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!hhhhi!ihhi!!!hhhhi!ihhi!!ihhhhi!ihhhhhhi!hhhihhhi!hhhi!ihhi!!i!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhihhhhi!hhhihhhi!hhhi!ihhi!!!ihhi!!!hhhhi!ihhi!!!" + "'", str1, "Hhhhi!ihhihhhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhhhhi!hhhihhhi!hhhi!ihhi!!hi!!ihhhhi!ihhi!!!hhhhi!ihhi!!hhhhhhhhhi!hhhihhhi!hhhi!ihhi!!i!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!hhhhi!ihhi!!!hhhhi!ihhi!!ihhhhi!ihhhhhhi!hhhihhhi!hhhi!ihhi!!i!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhihhhhi!hhhihhhi!hhhi!ihhi!!!ihhi!!!hhhhi!ihhi!!!");
    }

    @Test
    public void test5508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5508");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!" + "'", str1, "Hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
    }

    @Test
    public void test5509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5509");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhi!hhhihHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!iHhhi!Hhhi!Ihhi!!!Hhhi!Hhhi!IhhiHhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!IhHHI!hHHI!iHHI!!!hHHI!hHHI!ihhHHHI!IHHI!HI!!H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhhi!hhhihHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!iHhhi!Hhhi!Ihhi!!!Hhhi!Hhhi!IhhiHhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!IhHHI!hHHI!iHHI!!!hHHI!hHHI!ihhHHHI!IHHI!HI!!H" + "'", str1, "hhhhi!hhhihHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!iHhhi!Hhhi!Ihhi!!!Hhhi!Hhhi!IhhiHhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!IhHHI!hHHI!iHHI!!!hHHI!hHHI!ihhHHHI!IHHI!HI!!H");
    }

    @Test
    public void test5510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5510");
        char[] charArray9 = new char[] {};
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("hH", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!ihhi!hi!!", charArray9);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("hhhi!hhhi!HHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!hHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!hhhi!Hhhi!hhHI!", charArray9);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("HHhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!", charArray9);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhi!ihhi!hhh", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hH" + "'", str14, "hH");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hhhi!ihhi!hi!!" + "'", str15, "Hhhi!ihhi!hi!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hhhi!hhhi!HHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!hHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!hhhi!Hhhi!hhHI!" + "'", str16, "hhhi!hhhi!HHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!hHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!hhhi!Hhhi!hhHI!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HHhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!" + "'", str17, "HHhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hhhi!ihhi!hhh" + "'", str18, "hhhi!ihhi!hhh");
    }

    @Test
    public void test5511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5511");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhhhhhhi!ihhhhhhhi!ihhhhhhi!ihhihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!i!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhhhhhi!ihhhhhhhi!ihhhhhhi!ihhihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!hhhhhi!ihhhhhhhi!ihhhhhhi!ihhihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!hhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhhhhhhi!ihhhhhhhi!ihhhhhhi!ihhihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!i!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhhhhhi!ihhhhhhhi!ihhhhhhi!ihhihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!hhhhhi!ihhhhhhhi!ihhhhhhi!ihhihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!hhhi!ihhi!!!" + "'", str1, "Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhhhhhhi!ihhhhhhhi!ihhhhhhi!ihhihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!i!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhhhhhi!ihhhhhhhi!ihhhhhhi!ihhihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!hhhhhi!ihhhhhhhi!ihhhhhhi!ihhihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!hhhi!ihhi!!!");
    }

    @Test
    public void test5512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5512");
        char[] charArray8 = new char[] {};
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("hi!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("Hhhi!ihhi!!", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("HHHHI!HHHIHHHI!HHHI!IHHI!!", charArray8);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("HHHI!hHHI!iHHI!!", charArray8);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("hHHi!iHHi!!", charArray8);
        java.lang.Class<?> wildcardClass17 = charArray8.getClass();
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HHHI!hHHI!iHHI!!" + "'", str15, "HHHI!hHHI!iHHI!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test5513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5513");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HHh", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHh" + "'", str2, "HHh");
    }

    @Test
    public void test5514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5514");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhhhI!IhhI!HI!!h", 100, (int) (byte) 0, "Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!hhhi!ihhi!hhhi!ihhi!hhhi!ihhi!!hi!!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhihhhhi!hhhi!ihhi!!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end 100, length 16");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5515");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhhi!hhhhhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhhi!hhhhhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!" + "'", str1, "Hhhhhi!hhhhhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!");
    }

    @Test
    public void test5516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5516");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("HHHHI!HHHIhHHI!HHHI!HHHI!IHHI!!HHI!IHHI!HHHI!HHHI!IHHI!!HHI!HHHI!IHHI!!HHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test5517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5517");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HhHHi!iHHi!!hhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!IhHHi!iHHi!!!hHHi!iHHi!!IhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!IhHHi!iHHi!!!hHHi!iHHi!!!hHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!IhHHi!iHHi!!!hHHi!iHHi!!IhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!IhHHi!iHHi!!!hHHi!iHHi!!!hHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!IhHHi!iHHi!!!hHHi!iHHi!!IhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!IhHHi!iHHi!!!hHHi!iHHi!!!hHHi!iHHi!!ihHHi!iHHi!!hhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!IhHHi!iHHi!!!hHHi!iHHi!!IhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!IhHHi!iHHi!!!hHHi!iHHi!!!hHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HhHHi!iHHi!!hhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!IhHHi!iHHi!!!hHHi!iHHi!!IhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!IhHHi!iHHi!!!hHHi!iHHi!!!hHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!IhHHi!iHHi!!!hHHi!iHHi!!IhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!IhHHi!iHHi!!!hHHi!iHHi!!!hHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!IhHHi!iHHi!!!hHHi!iHHi!!IhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!IhHHi!iHHi!!!hHHi!iHHi!!!hHHi!iHHi!!ihHHi!iHHi!!hhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!IhHHi!iHHi!!!hHHi!iHHi!!IhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!IhHHi!iHHi!!!hHHi!iHHi!!!hHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!" + "'", str2, "HhHHi!iHHi!!hhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!IhHHi!iHHi!!!hHHi!iHHi!!IhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!IhHHi!iHHi!!!hHHi!iHHi!!!hHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!IhHHi!iHHi!!!hHHi!iHHi!!IhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!IhHHi!iHHi!!!hHHi!iHHi!!!hHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!IhHHi!iHHi!!!hHHi!iHHi!!IhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!IhHHi!iHHi!!!hHHi!iHHi!!!hHHi!iHHi!!ihHHi!iHHi!!hhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!IhHHi!iHHi!!!hHHi!iHHi!!IhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!IhHHi!iHHi!!!hHHi!iHHi!!!hHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!");
    }

    @Test
    public void test5518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5518");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHHhhhi!ihhi!hi!!hhHHhhhi!ihhi!hi!!hhHHhhhi!ihhi!hi!!hiHHhhhi!ihhi!hi!!h!HHhhhi!ihhi!hi!!hiHHhhhi!ihHhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!!", 100, 10, "HHHI!IHHI!hhHHI!HHHI!Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHhhhi!ihhi!hi!!hhHHhhhi!ihhi!hi!!hhHHhhhi!ihhi!hi!!hiHHhhhi!ihhi!hi!!h!HHhhhi!ihhi!hi!!hiHHhhhi!ihHHHI!IHHI!hhHHI!HHHI!Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!" + "'", str4, "hHHhhhi!ihhi!hi!!hhHHhhhi!ihhi!hi!!hhHHhhhi!ihhi!hi!!hiHHhhhi!ihhi!hi!!h!HHhhhi!ihhi!hi!!hiHHhhhi!ihHHHI!IHHI!hhHHI!HHHI!Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
    }

    @Test
    public void test5519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5519");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("HHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!hHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!IHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!HhhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!ihhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!!" + "'", str1, "hhhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!HhhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!ihhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!!");
    }

    @Test
    public void test5520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5520");
        char[] charArray10 = new char[] {};
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("hi!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("Hh", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("hhhI!IhhI!HI!!", charArray10);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray10);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.uncapitalize("hhhI!IhhI!!", charArray10);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.uncapitalize("hHhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!", charArray10);
        java.lang.Class<?> wildcardClass21 = charArray10.getClass();
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hi!" + "'", str14, "Hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hi!" + "'", str15, "Hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hh" + "'", str16, "Hh");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hhhI!IhhI!HI!!" + "'", str17, "hhhI!IhhI!HI!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "h" + "'", str18, "h");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hhhI!IhhI!!" + "'", str19, "hhhI!IhhI!!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hHhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!" + "'", str20, "hHhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test5521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5521");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HHHHI!HHHIHhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhHhhi!ihhi!HHI!iHI!!hi!!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHHHI!HHHIHhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhHhhi!ihhi!HHI!iHI!!hi!!" + "'", str2, "HHHHI!HHHIHhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhHhhi!ihhi!HHI!iHI!!hi!!");
    }

    @Test
    public void test5522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5522");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhi!ihhi!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!!hhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!!hhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!!hhhi!ihhi!hhi!ihi!!hi!!!hhhhi!ihhihhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!!hhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!!hhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!!hhhi!ihhi!hhi!ihi!!hi!!!!hi!!h", (int) (byte) 10, (int) 'a', "Hhhhhi!hhhHHhhI!IhhIHHHHI!HHHI!IHHI!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhi!ihhi!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!Hhhhhi!hhhHHhhI!IhhIHHHHI!HHHI!IHHI!!" + "'", str4, "Hhhi!ihhi!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!Hhhhhi!hhhHHhhI!IhhIHHHHI!HHHI!IHHI!!");
    }

    @Test
    public void test5523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5523");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhHhhi!hHhhi!hHhhi!iHhhi!!Hhhi!iHhhi!hHhhi!hHhhi!iHhhi!!Hhhi!hHhhi!hHhhi!hHhhi!iHhhi!!Hhhi!iHhhi!hHhhi!hHhhi!iHhhi!!Hhhi!!Hhhi!hHhhi!iHhhi!!Hhhi!!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhHhhi!hHhhi!hHhhi!iHhhi!!Hhhi!iHhhi!hHhhi!hHhhi!iHhhi!!Hhhi!hHhhi!hHhhi!hHhhi!iHhhi!!Hhhi!iHhhi!hHhhi!hHhhi!iHhhi!!Hhhi!!Hhhi!hHhhi!iHhhi!!Hhhi!!" + "'", str2, "hhHhhi!hHhhi!hHhhi!iHhhi!!Hhhi!iHhhi!hHhhi!hHhhi!iHhhi!!Hhhi!hHhhi!hHhhi!hHhhi!iHhhi!!Hhhi!iHhhi!hHhhi!hHhhi!iHhhi!!Hhhi!!Hhhi!hHhhi!iHhhi!!Hhhi!!");
    }

    @Test
    public void test5524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5524");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhhi!ihhi!HHHi!iHHi!hi!!", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhi!ihhi!HHHi!iHHi!hi!!" + "'", str2, "hhhi!ihhi!HHHi!iHHi!hi!!");
    }

    @Test
    public void test5525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5525");
        char[] charArray9 = new char[] {};
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("h", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("hhi!", charArray9);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!ihhi!HHI!iHI!!hi!!", charArray9);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("HhHhhi!ihhhHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHHHHI!IHHI!HHI!IHI!!HI!!", charArray9);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("HHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhhhhi!Hhhi!hhHI!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hi!" + "'", str12, "Hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "h" + "'", str14, "h");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hhhi!ihhi!HHI!iHI!!hi!!" + "'", str16, "Hhhi!ihhi!HHI!iHI!!hi!!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test5526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5526");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HHHHHI!IHHhHhhhI!IhhhhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHHHHI!IHHhHhhhI!IhhhhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!!" + "'", str2, "HHHHHI!IHHhHhhhI!IhhhhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!!");
    }

    @Test
    public void test5527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5527");
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
        java.lang.String str22 = org.apache.commons.lang.WordUtils.initials("HHHI!hHHI!iHHI!!", charArray12);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalize("HHHHI!IHHI!HI!!H", charArray12);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.uncapitalize("hHHI!IHHI!!", charArray12);
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "HHHHI!IHHI!HI!!H" + "'", str23, "HHHHI!IHHI!HI!!H");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hHHI!IHHI!!" + "'", str24, "hHHI!IHHI!!");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test5528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5528");
        char[] charArray5 = new char[] { ' ' };
        java.lang.String str6 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray5);
        java.lang.String str7 = org.apache.commons.lang.WordUtils.uncapitalize("hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!iHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!iHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!iHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!iHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!", charArray5);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalize("Hhhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!h!", charArray5);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("Hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ' });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!iHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!iHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!iHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!iHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!" + "'", str7, "hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!iHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!iHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!iHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!iHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hhhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!h!" + "'", str8, "Hhhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!h!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H" + "'", str9, "H");
    }

    @Test
    public void test5529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5529");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HHhhi!hhhi!hHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HhHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!IHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!!HHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHhhi!hhhi!hHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HhHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!IHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!!HHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!" + "'", str1, "hHhhi!hhhi!hHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HhHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!IHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!!HHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!");
    }

    @Test
    public void test5530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5530");
        char[] charArray11 = new char[] {};
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("hH", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("hI!", charArray11);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("HI!", charArray11);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("HI!", charArray11);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhI!IhhI!HI!!", charArray11);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HhHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!IHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!!HHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!", charArray11);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.initials("hHHHI!IHHI!hhi!Ihi!!HI!!HHHHI!IHHI!hhi!Ihi!!HI!!HHHHI!IHHI!hhi!Ihi!!HI!!IHHHI!IHHI!hhi!Ihi!!HI!!!HHHI!IHHI!hhi!Ihi!!HI!!IHHHI!IHHI!hhi!Ihi!!HI!!HHHHI!IHHI!hhi!Ihi!!HI!!HHHHI!IHHI!hhi!Ihi!!HI!!IHHHI!IHHI!hhi!Ihi!!HI!!!HHHI!IHHI!hhi!Ihi!!HI!!hHHHI!IHHI!hhi!Ihi!!HI!!iHHHI!IHHI!hhi!Ihi!!HI!!!", charArray11);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalize("hhhhi!ihhihhhi!ihhi!hhhhhhhhhihhhHHHI!HHHIhhhhi!hhhihhhI!IhhI!HI!!!ihhi!!!hhhhhhhhhhhihh!hhihhhhhhhhihh!hhHHHI!HHHIhhhhi!hhhihhhI!IhhI!HI!!!ihhi!!h!", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] {});
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hi!" + "'", str14, "Hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hI!" + "'", str16, "hI!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HI!" + "'", str17, "HI!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HI!" + "'", str18, "HI!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hhhI!IhhI!HI!!" + "'", str19, "hhhI!IhhI!HI!!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HhHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!IHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!!HHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!" + "'", str20, "hHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HhHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!IHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!!HHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hhhhi!ihhihhhi!ihhi!hhhhhhhhhihhhHHHI!HHHIhhhhi!hhhihhhI!IhhI!HI!!!ihhi!!!hhhhhhhhhhhihh!hhihhhhhhhhihh!hhHHHI!HHHIhhhhi!hhhihhhI!IhhI!HI!!!ihhi!!h!" + "'", str22, "hhhhi!ihhihhhi!ihhi!hhhhhhhhhihhhHHHI!HHHIhhhhi!hhhihhhI!IhhI!HI!!!ihhi!!!hhhhhhhhhhhihh!hhihhhhhhhhihh!hhHHHI!HHHIhhhhi!hhhihhhI!IhhI!HI!!!ihhi!!h!");
    }

    @Test
    public void test5531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5531");
        char[] charArray8 = new char[] {};
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhI!IhhI!hhHHi!iHHi!HHHI!IHHI!!hi!!", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!Hhhi!hhHI!", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("hhhhi!ihhi!hhhi!ihhi!!hi!!", charArray8);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("Hhhhhi!hhhhhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhhi!ihhi!hhh", charArray8);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("hHhhI!IhhIhHh", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hi!" + "'", str11, "Hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hhhI!IhhI!hhHHi!iHHi!HHHI!IHHI!!hi!!" + "'", str12, "hhhI!IhhI!hhHHi!iHHi!HHHI!IHHI!!hi!!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hhhi!Hhhi!hhHI!" + "'", str13, "Hhhi!Hhhi!hhHI!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hhhhi!ihhi!hhhi!ihhi!!hi!!" + "'", str14, "hhhhi!ihhi!hhhi!ihhi!!hi!!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hhhhhi!hhhhhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhhi!ihhi!hhh" + "'", str15, "Hhhhhi!hhhhhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhhi!ihhi!hhh");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test5532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5532");
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
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHI!IHHI!hHhhI!IhhI!!HHhhI!IhhI!!HHhhI!IhhI!!HHhhI!IhhI!!IHhhI!IhhI!!!HhhI!IhhI!!HHhhI!IhhI!!HHhhI!IhhI!!HHhhhHHHHHHHHHHHHHHHIHHH!HHHHHHHHHHHHHHHIHHH!HHHIHHHHHHHHHHHIHHH!HHH!I!IhhI!!IHhhI!IhhI!!!HhhI!IhhI!!IHhhI!IhhI!!HHhhI!IhhI!!HHhhI!IhhI!!IHhhI!IhhI!!!HhhI!IhhI!!!hhhI!IhhI!hHhhI!IhhI!!HHhhI!IhhI!!HHhhI!IhhI!!HHhhI!IhhI!!IHhhI!IhhI!!!HhhI!IhhI!!HHhhI!IhhI!!HHhhI!IhhI!!HHhhhHHHHHHHHHHHHHHHIHHH!HHHHHHHHHHHHHHHIHHH!HHHIHHHHHHHHHHHIHHH!HHH!I!IhhI!!IHhhI!IhhI!!!HhhI!IhhI!!IHhhI!IhhI!!HHhhI!IhhI!!HHhhI!IhhI!!IHhhI!IhhI!!!HhhI!IhhI!!!HI!!", charArray11);
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hHHI!IHHI!hHhhI!IhhI!!HHhhI!IhhI!!HHhhI!IhhI!!HHhhI!IhhI!!IHhhI!IhhI!!!HhhI!IhhI!!HHhhI!IhhI!!HHhhI!IhhI!!HHhhhHHHHHHHHHHHHHHHIHHH!HHHHHHHHHHHHHHHIHHH!HHHIHHHHHHHHHHHIHHH!HHH!I!IhhI!!IHhhI!IhhI!!!HhhI!IhhI!!IHhhI!IhhI!!HHhhI!IhhI!!HHhhI!IhhI!!IHhhI!IhhI!!!HhhI!IhhI!!!hhhI!IhhI!hHhhI!IhhI!!HHhhI!IhhI!!HHhhI!IhhI!!HHhhI!IhhI!!IHhhI!IhhI!!!HhhI!IhhI!!HHhhI!IhhI!!HHhhI!IhhI!!HHhhhHHHHHHHHHHHHHHHIHHH!HHHHHHHHHHHHHHHIHHH!HHHIHHHHHHHHHHHIHHH!HHH!I!IhhI!!IHhhI!IhhI!!!HhhI!IhhI!!IHhhI!IhhI!!HHhhI!IhhI!!HHhhI!IhhI!!IHhhI!IhhI!!!HhhI!IhhI!!!HI!!" + "'", str22, "hHHI!IHHI!hHhhI!IhhI!!HHhhI!IhhI!!HHhhI!IhhI!!HHhhI!IhhI!!IHhhI!IhhI!!!HhhI!IhhI!!HHhhI!IhhI!!HHhhI!IhhI!!HHhhhHHHHHHHHHHHHHHHIHHH!HHHHHHHHHHHHHHHIHHH!HHHIHHHHHHHHHHHIHHH!HHH!I!IhhI!!IHhhI!IhhI!!!HhhI!IhhI!!IHhhI!IhhI!!HHhhI!IhhI!!HHhhI!IhhI!!IHhhI!IhhI!!!HhhI!IhhI!!!hhhI!IhhI!hHhhI!IhhI!!HHhhI!IhhI!!HHhhI!IhhI!!HHhhI!IhhI!!IHhhI!IhhI!!!HhhI!IhhI!!HHhhI!IhhI!!HHhhI!IhhI!!HHhhhHHHHHHHHHHHHHHHIHHH!HHHHHHHHHHHHHHHIHHH!HHHIHHHHHHHHHHHIHHH!HHH!I!IhhI!!IHhhI!IhhI!!!HhhI!IhhI!!IHhhI!IhhI!!HHhhI!IhhI!!HHhhI!IhhI!!IHhhI!IhhI!!!HhhI!IhhI!!!HI!!");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test5533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5533");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("Hhhi!hhhi!ihhi!!", (int) (byte) 100, "Hhhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhhhhi!hhhihhhi!hhhi!ihhi!!hi!!ihhhhi!ihhi!!!hhhhi!ihhi!!hhhhhh", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhi!hhhi!ihhi!!" + "'", str4, "Hhhi!hhhi!ihhi!!");
    }

    @Test
    public void test5534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5534");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HhHHHI!IHHI!!HhHHHI!IHHI!!HhHHHI!IHHI!!HhHHHI!IHHI!!IhHHHI!IHHI!!!hHHHI!IHHI!!IhHHHI!IHHI!!HhHHHI!IHHI!!HhHHHI!IHHI!!IhHHHI!IHHI!!!hHHHI!IHHI!!HhHHHI!IHHI!!IhHHHI!IHHI!!!hHHHI!IHHI!!!hHHHI!IHHI!!H", (int) '4', "Hhhhi!ihhihhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhihhhhi!ihhi!hi!!h", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HhHHHI!IHHI!!HhHHHI!IHHI!!HhHHHI!IHHI!!HhHHHI!IHHI!!Hhhhi!ihhihhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhihhhhi!ihhi!hi!!hIhHHHI!IHHI!!!hHHHI!IHHI!!IhHHHI!IHHI!!HhHHHI!IHHI!!Hhhhi!ihhihhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhihhhhi!ihhi!hi!!hHhHHHI!IHHI!!IhHHHI!IHHI!!!hHHHI!IHHI!!HhHHHI!IHHI!!Hhhhi!ihhihhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhihhhhi!ihhi!hi!!hIhHHHI!IHHI!!!hHHHI!IHHI!!!hHHHI!IHHI!!H" + "'", str4, "HhHHHI!IHHI!!HhHHHI!IHHI!!HhHHHI!IHHI!!HhHHHI!IHHI!!Hhhhi!ihhihhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhihhhhi!ihhi!hi!!hIhHHHI!IHHI!!!hHHHI!IHHI!!IhHHHI!IHHI!!HhHHHI!IHHI!!Hhhhi!ihhihhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhihhhhi!ihhi!hi!!hHhHHHI!IHHI!!IhHHHI!IHHI!!!hHHHI!IHHI!!HhHHHI!IHHI!!Hhhhi!ihhihhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhihhhhi!ihhi!hi!!hIhHHHI!IHHI!!!hHHHI!IHHI!!!hHHHI!IHHI!!H");
    }

    @Test
    public void test5535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5535");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!" + "'", str1, "hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
    }

    @Test
    public void test5536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5536");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHI!IHHI!HHH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!ihhi!hhh" + "'", str1, "Hhhi!ihhi!hhh");
    }

    @Test
    public void test5537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5537");
        char[] charArray14 = new char[] {};
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray14);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("", charArray14);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray14);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray14);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("", charArray14);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray14);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalize("H", charArray14);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray14);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.uncapitalize("hhI!", charArray14);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray14);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.capitalize("hhHI!", charArray14);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.initials("hHhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!", charArray14);
        java.lang.String str27 = org.apache.commons.lang.WordUtils.initials("HhHHI!HHHI!Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!", charArray14);
        java.lang.String str28 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!ihhi!!", charArray14);
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Hi!" + "'", str22, "Hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hhI!" + "'", str23, "hhI!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hhHI!" + "'", str25, "hhHI!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Hhhi!ihhi!!" + "'", str28, "Hhhi!ihhi!!");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test5538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5538");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hHhhI!IhhI!HI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!ihhi!hi!!" + "'", str1, "Hhhhi!ihhi!hi!!");
    }

    @Test
    public void test5539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5539");
        char[] charArray7 = new char[] {};
        java.lang.String str8 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("hi!", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray7);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray7);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("HHhhi!ihhi!hi!!", charArray7);
        java.lang.Class<?> wildcardClass15 = charArray7.getClass();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hi!" + "'", str11, "Hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hi!" + "'", str13, "Hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HHhhi!ihhi!hi!!" + "'", str14, "HHhhi!ihhi!hi!!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test5540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5540");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HhHHHI!IHHI!!hhHHHI!IHHI!!hhHHHI!IHhHHHI!HHHIhHHI!HHHI!IHHI!!HI!!ihHHHI!IHHI!!!hHHHI!IHHI!!hhHHHhHHHHHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!hHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!hhhi!Hhhi!hhHI!", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HhHHHI!IHHI!!hhHHHI!IHHI!!hhHHHI!IHhHHHI!HHHIhHHI!HHHI!IHHI!!HI!!ihHHHI!IHHI!!!hHHHI!IHHI!!hhHHHhHHHHHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!hHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!hhhi!Hhhi!hhHI!" + "'", str2, "HhHHHI!IHHI!!hhHHHI!IHHI!!hhHHHI!IHhHHHI!HHHIhHHI!HHHI!IHHI!!HI!!ihHHHI!IHHI!!!hHHHI!IHHI!!hhHHHhHHHHHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!hHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!hhhi!Hhhi!hhHI!");
    }

    @Test
    public void test5541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5541");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHHHI!HHHIHHHI!HHHI!IHHI!!", 100, 100, "hHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!HHI!IHI!!HI!!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end 100, length 26");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5542");
        char[] charArray11 = new char[] {};
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("Hi!", charArray11);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray11);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!", charArray11);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("hHhhhi!ihhi!hi!!h", charArray11);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray11);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhi!ihhi!hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihHhhhi!ihhi!HHI!iHI!!hi!!hhhhi!ihhi!HHI!iHI!!hi!!hhhhi!ihhi!HHI!iHI!!hi!!ihhhi!ihhi!HHI!iHI!!hi!!!hhhi!ihhi!HHI!iHI!!hi!!ihhhi!ihhi!HHI!iHI!!hi!!hhhhi!ihhi!HHI!iHI!!hi!!hhhhi!ihhi!HHI!iHI!!hi!!ihhhi!ihhi!HHI!iHI!!hi!!!hhhi!ihhi!HHI!iHI!!hi!!Hhhhi!ihhi!HHI!iHI!!hi!!Ihhhi!ihhi!HHI!iHI!!hi!!!", charArray11);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.uncapitalize("hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!IhHI!iHI!!!hHI!iHI!!IhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!!hHI!iHI!!ihHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!!hHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!hhHI!iHI!!hhHI!iHI!!!hHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!hhHI!iHI!!hhHI!iHI!!!hHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!hhHI!iHI!!hhHI!iHI!!!hHI!iHI!!hhHI!iHI!!hhHI!iHI!!!", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] {});
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hi!" + "'", str16, "Hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hi!" + "'", str17, "Hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!" + "'", str18, "hhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hHhhhi!ihhi!hi!!h" + "'", str19, "hHhhhi!ihhi!hi!!h");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hhhi!ihhi!hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihHhhhi!ihhi!HHI!iHI!!hi!!hhhhi!ihhi!HHI!iHI!!hi!!hhhhi!ihhi!HHI!iHI!!hi!!ihhhi!ihhi!HHI!iHI!!hi!!!hhhi!ihhi!HHI!iHI!!hi!!ihhhi!ihhi!HHI!iHI!!hi!!hhhhi!ihhi!HHI!iHI!!hi!!hhhhi!ihhi!HHI!iHI!!hi!!ihhhi!ihhi!HHI!iHI!!hi!!!hhhi!ihhi!HHI!iHI!!hi!!Hhhhi!ihhi!HHI!iHI!!hi!!Ihhhi!ihhi!HHI!iHI!!hi!!!" + "'", str21, "hhhi!ihhi!hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihHhhhi!ihhi!HHI!iHI!!hi!!hhhhi!ihhi!HHI!iHI!!hi!!hhhhi!ihhi!HHI!iHI!!hi!!ihhhi!ihhi!HHI!iHI!!hi!!!hhhi!ihhi!HHI!iHI!!hi!!ihhhi!ihhi!HHI!iHI!!hi!!hhhhi!ihhi!HHI!iHI!!hi!!hhhhi!ihhi!HHI!iHI!!hi!!ihhhi!ihhi!HHI!iHI!!hi!!!hhhi!ihhi!HHI!iHI!!hi!!Hhhhi!ihhi!HHI!iHI!!hi!!Ihhhi!ihhi!HHI!iHI!!hi!!!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!IhHI!iHI!!!hHI!iHI!!IhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!!hHI!iHI!!ihHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!!hHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!hhHI!iHI!!hhHI!iHI!!!hHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!hhHI!iHI!!hhHI!iHI!!!hHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!hhHI!iHI!!hhHI!iHI!!!hHI!iHI!!hhHI!iHI!!hhHI!iHI!!!" + "'", str22, "hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!IhHI!iHI!!!hHI!iHI!!IhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!!hHI!iHI!!ihHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!!hHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!hhHI!iHI!!hhHI!iHI!!!hHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!hhHI!iHI!!hhHI!iHI!!!hHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!hhHI!iHI!!hhHI!iHI!!!hHI!iHI!!hhHI!iHI!!hhHI!iHI!!!");
    }

    @Test
    public void test5543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5543");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IHhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!IhHI!iHI!!!hHI!iHI!!IhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!!hHI!iHI!!ihHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!!hHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!hhHI!iHI!!hhHI!iHI!!!hHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!hhHI!iHI!!hhHI!iHI!!!hHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!hhHI!iHI!!hhHI!iHI!!!hHI!iHI!!hhHI!iHI!!hhHI!iHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IHhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!IhHI!iHI!!!hHI!iHI!!IhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!!hHI!iHI!!ihHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!!hHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!hhHI!iHI!!hhHI!iHI!!!hHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!hhHI!iHI!!hhHI!iHI!!!hHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!hhHI!iHI!!hhHI!iHI!!!hHI!iHI!!hhHI!iHI!!hhHI!iHI!!!" + "'", str1, "hHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IHhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!IhHI!iHI!!!hHI!iHI!!IhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!!hHI!iHI!!ihHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!!hHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!hhHI!iHI!!hhHI!iHI!!!hHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!hhHI!iHI!!hhHI!iHI!!!hHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!hhHI!iHI!!hhHI!iHI!!!hHI!iHI!!hhHI!iHI!!hhHI!iHI!!!");
    }

    @Test
    public void test5544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5544");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hHHI!HHHI!HHHI!iHHI!!HHI!iHHI!HHHI!HHHI!iHHI!!HHI!hHHI!iHHI!!HHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!hhhi!hhhi!Ihhi!!hhi!Ihhi!hhhi!hhhi!Ihhi!!hhi!Hhhi!Ihhi!!hhi!!" + "'", str1, "Hhhi!hhhi!hhhi!Ihhi!!hhi!Ihhi!hhhi!hhhi!Ihhi!!hhi!Hhhi!Ihhi!!hhi!!");
    }

    @Test
    public void test5545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5545");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.capitalize("HHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!hHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!hhhi!Hhhi!hhHI!", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!hHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!hhhi!Hhhi!hhHI!" + "'", str2, "HHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!hHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!hhhi!Hhhi!hhHI!");
    }

    @Test
    public void test5546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5546");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HHHI!HHHI!HHHI!IHHI!!HHI!IHHI!HHHI!HHHI!IHHI!!HHI!HHHI!IHHI!!HHI!!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHHI!HHHI!HHHI!IHHI!!HHI!IHHI!HHHI!HHHI!IHHI!!HHI!HHHI!IHHI!!HHI!!" + "'", str2, "HHHI!HHHI!HHHI!IHHI!!HHI!IHHI!HHHI!HHHI!IHHI!!HHI!HHHI!IHHI!!HHI!!");
    }

    @Test
    public void test5547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5547");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHi!hHi!hHHhH", (int) (byte) 0, (int) (short) 1, "hhhhhi!hhhhHHI!HHHI!IHHI!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhhhhi!hhhhHHI!HHHI!IHHI!!" + "'", str4, "Hhhhhhi!hhhhHHI!HHHI!IHHI!!");
    }

    @Test
    public void test5548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5548");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hhHHI!HHHI!Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhihHHI!IHHI!HHHI!IHHI!HHHI!IHHI!!HI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test5549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5549");
        char[] charArray8 = new char[] {};
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("hi!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("HH", charArray8);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("HHhhhi!ihhi!!HHhhhi!ihhi!!HHhhhi!ihhi!!IHhhhi!ihhi!!hhHI!", charArray8);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("", charArray8);
        java.lang.Class<?> wildcardClass17 = charArray8.getClass();
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HI!" + "'", str12, "HI!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HH" + "'", str14, "HH");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HHhhhi!ihhi!!HHhhhi!ihhi!!HHhhhi!ihhi!!IHhhhi!ihhi!!hhHI!" + "'", str15, "HHhhhi!ihhi!!HHhhhi!ihhi!!HHhhhi!ihhi!!IHhhhi!ihhi!!hhHI!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test5550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5550");
        char[] charArray7 = new char[] {};
        java.lang.String str8 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("hI!", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("h", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("HHHi!iHHi!!", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!hhhi!ihhi!HHHi!iHHi!HHHI!IHHI!!hi!!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhihhhi!ihhi!HHHi!iHHi!HHHI!IHHI!!hi!!!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhhhhi!ihhi!HHHi!iHHi!HHHI!IHHI!!hi!!i!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhhhi!ihhi!HHHi!iHHi!HHHI!IHHI!!hi!!hi!!ihhhi!ihhi!!!hhhi!ihhi!!!", charArray7);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("hhHHHI!HHHIhHHI!HHHI!IHHI!!hhHHHI!HHHIhHHI!HHHI!IHHI!!hhHHHI!HHHIhHHI!HHHI!IHHI!!hhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!hhHHHI!HHHIhHHI!HHHI!IHHI!!hhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!!", charArray7);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("hhhi!Hhhi!Ihhi!!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hI!" + "'", str9, "hI!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HHHi!iHHi!!" + "'", str11, "HHHi!iHHi!!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!hhhi!ihhi!HHHi!iHHi!HHHI!IHHI!!hi!!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhihhhi!ihhi!HHHi!iHHi!HHHI!IHHI!!hi!!!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhhhhi!ihhi!HHHi!iHHi!HHHI!IHHI!!hi!!i!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhhhi!ihhi!HHHi!iHHi!HHHI!IHHI!!hi!!hi!!ihhhi!ihhi!!!hhhi!ihhi!!!" + "'", str12, "Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!hhhi!ihhi!HHHi!iHHi!HHHI!IHHI!!hi!!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhihhhi!ihhi!HHHi!iHHi!HHHI!IHHI!!hi!!!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhhhhi!ihhi!HHHi!iHHi!HHHI!IHHI!!hi!!i!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhhhi!ihhi!HHHi!iHHi!HHHI!IHHI!!hi!!hi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hhHHHI!HHHIhHHI!HHHI!IHHI!!hhHHHI!HHHIhHHI!HHHI!IHHI!!hhHHHI!HHHIhHHI!HHHI!IHHI!!hhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!hhHHHI!HHHIhHHI!HHHI!IHHI!!hhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!!" + "'", str13, "hhHHHI!HHHIhHHI!HHHI!IHHI!!hhHHHI!HHHIhHHI!HHHI!IHHI!!hhHHHI!HHHIhHHI!HHHI!IHHI!!hhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!hhHHHI!HHHIhHHI!HHHI!IHHI!!hhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test5551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5551");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hhHhhhi!hhhhhi!hhhi!HhHI!iHI!!hhHhhhi!ihhihHHI!HHHI!HHHI!iHHI!!HHI!iHHI!HHHI!HHHI!iHHI!!HHI!hHHI!iHHI!!HHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHhHHHI!HHHHHI!HHHI!hHhi!Ihi!!HHhHHHI!IHHIHhhi!hhhi!hhhi!Ihhi!!hhi!Ihhi!hhhi!hhhi!Ihhi!!hhi!Hhhi!Ihhi!!hhi!!" + "'", str1, "HHhHHHI!HHHHHI!HHHI!hHhi!Ihi!!HHhHHHI!IHHIHhhi!hhhi!hhhi!Ihhi!!hhi!Ihhi!hhhi!hhhi!Ihhi!!hhi!Hhhi!Ihhi!!hhi!!");
    }

    @Test
    public void test5552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5552");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHI!", (int) ' ', (int) (byte) 100, "HHHH");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end 32, length 4");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5553");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHHI!IHHI!HI!!", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhhi!ihhi!hi!!" + "'", str2, "Hhhhi!ihhi!hi!!");
    }

    @Test
    public void test5554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5554");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hHHI!IHHI!HHH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test5555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5555");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hhHHHHI!IHHHHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!!HHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!!HHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!!HHHI!IHHI!HHI!IHI!!HI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test5556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5556");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!hhHHi!iHHi!HHhhI!IhhI!hhhi!ihhi!!HI!!", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!hhHHi!iHHi!HHhhI!IhhI!hhhi!ihhi!!HI!!" + "'", str2, "hHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!hhHHi!iHHi!HHhhI!IhhI!hhhi!ihhi!!HI!!");
    }

    @Test
    public void test5557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5557");
        char[] charArray11 = new char[] {};
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("", charArray11);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("Hi!", charArray11);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray11);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.uncapitalize("hH", charArray11);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("hHHI!hHHI!iHHI!!", charArray11);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalize("HHHI!hHHI!HHhi!", charArray11);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.uncapitalize("HhhhI!IhhIhHHI!hHHI!iHHI!!!HI!!h", charArray11);
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hHHI!hHHI!iHHI!!" + "'", str20, "hHHI!hHHI!iHHI!!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "HHHI!hHHI!HHhi!" + "'", str21, "HHHI!hHHI!HHhi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "HhhhI!IhhIhHHI!hHHI!iHHI!!!HI!!h" + "'", str22, "HhhhI!IhhIhHHI!hHHI!iHHI!!!HI!!h");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test5558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5558");
        char[] charArray9 = new char[] {};
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("H", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("hhI!", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("hH", charArray9);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("hHHi!iHHi!!", charArray9);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHi!iHHi!hi!!", charArray9);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("hHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H" + "'", str13, "H");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HHHi!iHHi!hi!!" + "'", str17, "HHHi!iHHi!hi!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test5559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5559");
        char[] charArray7 = new char[] { '4', '4' };
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("hhhi!hhhi!ihhi!!", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("hHHI!hHHI!HHhi!", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!!", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHI!IHHI!HHHHHHHHHIHH!HHHHHHHHHHHIHhhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hi!" + "'", str8, "Hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "h" + "'", str9, "h");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HHHI!hHHI!HHhi!" + "'", str10, "HHHI!hHHI!HHhi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!!" + "'", str11, "hhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!" + "'", str12, "Hhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!");
    }

    @Test
    public void test5560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5560");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhhi!hhhi!Hhhhhi!ihhi!hi!!h", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhi!hhhi!Hhhhhi!ihhi!hi!!h" + "'", str2, "Hhhi!hhhi!Hhhhhi!ihhi!hi!!h");
    }

    @Test
    public void test5561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5561");
        char[] charArray8 = new char[] {};
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("Hi!", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray8);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("hhhhh", charArray8);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("hHHI!IHHI!HHHHHHHHHIHH!HHHHHHHHHHHIHhhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hi!" + "'", str13, "Hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hi!" + "'", str14, "Hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hHHI!IHHI!HHHHHHHHHIHH!HHHHHHHHHHHIHhhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!" + "'", str16, "hHHI!IHHI!HHHHHHHHHIHH!HHHHHHHHHHHIHhhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!");
    }

    @Test
    public void test5562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5562");
        char[] charArray6 = new char[] {};
        java.lang.String str7 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray6);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.initials("", charArray6);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("H", charArray6);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("hh", charArray6);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHi!iHHi!!", charArray6);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHHI!IHHIhhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!IhhiHHHHi!iHHi!hi!!H", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hh" + "'", str10, "hh");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HHHi!iHHi!!" + "'", str11, "HHHi!iHHi!!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hHHHI!IHHIhhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!IhhiHHHHi!iHHi!hi!!H" + "'", str12, "hHHHI!IHHIhhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!IhhiHHHHi!iHHi!hi!!H");
    }

    @Test
    public void test5563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5563");
        char[] charArray17 = new char[] {};
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray17);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.initials("", charArray17);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray17);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray17);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalize("", charArray17);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.uncapitalize("Hi!", charArray17);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray17);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.uncapitalize("hH", charArray17);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray17);
        java.lang.String str27 = org.apache.commons.lang.WordUtils.uncapitalize("HH", charArray17);
        java.lang.String str28 = org.apache.commons.lang.WordUtils.uncapitalize("HH", charArray17);
        java.lang.String str29 = org.apache.commons.lang.WordUtils.capitalize("", charArray17);
        java.lang.String str30 = org.apache.commons.lang.WordUtils.uncapitalize("hhhi!hhhi!hhhi!Ihhi!!hhi!Ihhi!hhhi!Hhhi!hhhi!hhhi!", charArray17);
        java.lang.String str31 = org.apache.commons.lang.WordUtils.initials("HhHhhi!ihhhHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHHHHI!IHHI!HHI!IHI!!HI!!", charArray17);
        java.lang.String str32 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!IHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!!", charArray17);
        java.lang.String str33 = org.apache.commons.lang.WordUtils.capitalize("hHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHHI!IHHIHHHI!IHHI!HHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!", charArray17);
        java.lang.String str34 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHHHI!IHHI!!HHHHHI!IHHI!!HHHHHI!IHHHHHI!HHHIHHHI!HHHI!IHHI!!HI!!IHHHHI!IHHI!!!HHHHI!IHHI!!HHHHHHHHHI!HHHIHHHI!HHHI!IHHI!!I!IHHI!!HHHHHI!IHHI!!HHHHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHI!IHHI!!!HHHHI!IHHI!!IHHHHI!IHHHHHHI!HHHIHHHI!HHHI!IHHI!!I!!HHHHHI!IHHI!!HHHHHI!IHHI!!IHHHHIHHHHI!HHHIHHHI!HHHI!IHHI!!!IHHI!!!HHHHI!IHHI!!!", charArray17);
        java.lang.Class<?> wildcardClass35 = charArray17.getClass();
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] {});
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Hi!" + "'", str21, "Hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Hi!" + "'", str23, "Hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "HI!" + "'", str24, "HI!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hH" + "'", str25, "hH");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Hi!" + "'", str26, "Hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "HH" + "'", str27, "HH");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "HH" + "'", str28, "HH");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hhhi!hhhi!hhhi!Ihhi!!hhi!Ihhi!hhhi!Hhhi!hhhi!hhhi!" + "'", str30, "hhhi!hhhi!hhhi!Ihhi!!hhi!Ihhi!hhhi!Hhhi!hhhi!hhhi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!IHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!!" + "'", str32, "HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!IHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!!");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHHI!IHHIHHHI!IHHI!HHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!" + "'", str33, "hHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHHI!IHHIHHHI!IHHI!HHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "HHHHHI!IHHI!!HHHHHI!IHHI!!HHHHHI!IHHHHHI!HHHIHHHI!HHHI!IHHI!!HI!!IHHHHI!IHHI!!!HHHHI!IHHI!!HHHHHHHHHI!HHHIHHHI!HHHI!IHHI!!I!IHHI!!HHHHHI!IHHI!!HHHHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHI!IHHI!!!HHHHI!IHHI!!IHHHHI!IHHHHHHI!HHHIHHHI!HHHI!IHHI!!I!!HHHHHI!IHHI!!HHHHHI!IHHI!!IHHHHIHHHHI!HHHIHHHI!HHHI!IHHI!!!IHHI!!!HHHHI!IHHI!!!" + "'", str34, "HHHHHI!IHHI!!HHHHHI!IHHI!!HHHHHI!IHHHHHI!HHHIHHHI!HHHI!IHHI!!HI!!IHHHHI!IHHI!!!HHHHI!IHHI!!HHHHHHHHHI!HHHIHHHI!HHHI!IHHI!!I!IHHI!!HHHHHI!IHHI!!HHHHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHI!IHHI!!!HHHHI!IHHI!!IHHHHI!IHHHHHHI!HHHIHHHI!HHHI!IHHI!!I!!HHHHHI!IHHI!!HHHHHI!IHHI!!IHHHHIHHHHI!HHHIHHHI!HHHI!IHHI!!!IHHI!!!HHHHI!IHHI!!!");
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test5564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5564");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhhhi!ihhiHhI!!!hhhhi!ihHhI!hi!!hhhhi!HhI!ihhi!!hhhhHhI!i!ihhi!!ihHhI!hhi!ihhi!!HhI!!hhhi!ihhiHhI!!!ihhhi!ihHhI!hi!!hhhhi!HhI!ihhi!!hHhhHhI!hI!IhhI!!hHhI!hhhI!IhhI!HhI!!hhhhI!IhhHhI!I!!hhhhI!IHhI!hhI!!ihhhIHhI!!IhhI!!!hhHhI!hI!IhhI!!iHhI!hhhI!IhhI!HhI!!hhhhI!IhhHhI!I!!hhhhI!IHhI!hhI!!ihhhIHhI!!IhhI!!!hhHhI!hI!IhhI!!hHhI!hhhI!IhhI!HhI!!ihhhI!IhhHhI!I!!!hhhI!IHhI!hhI!!!hhhiHhI!!ihhi!!ihhHhI!hi!ihhi!!!HhI!hhhi!ihhi!HhI!!hhhhi!ihhHhI!i!!ihhhi!iHhI!hhi!!!hhhiHhI!!ihhi!!!", (int) (short) 1, (int) (byte) 10, "HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhhi!ihhiHhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!!" + "'", str4, "hhhhi!ihhiHhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!!");
    }

    @Test
    public void test5565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5565");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!IhhHhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!ihHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!IhhHhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!ihHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!!" + "'", str2, "Hhhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!IhhHhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!ihHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!!");
    }

    @Test
    public void test5566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5566");
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
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalize("hHHI!HHHI!IHHI!!", charArray13);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.initials("hHHI!HHHI!IHHI!!", charArray13);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.uncapitalize("hhH", charArray13);
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
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hHHI!HHHI!IHHI!!" + "'", str24, "hHHI!HHHI!IHHI!!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hhH" + "'", str26, "hhH");
    }

    @Test
    public void test5567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5567");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HHHhHHhHHiHH!HHhHHhHHhHHiHH!HHhHHhHHhHHiHH!HHIHHhHHhHHiHH!HH!HHhHHhHHiHH!HHIHHhHHhHHiHH!HHhHHhHHhhHHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!!HHiHH!HHhHHhHHhHHiHH!HHIHHhHHhHHiHH!HH!HHhHHhHHiHH!HHHHHhHHhHHiHH!HHIHHhHHhHHiHH!HH!HHhHHhHHiHH!HhHHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!!H!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHhHHhHHiHH!HHhHHhHHhHHiHH!HHhHHhHHhHHiHH!HHIHHhHHhHHiHH!HH!HHhHHhHHiHH!HHIHHhHHhHHiHH!HHhHHhHHhhHHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!!HHiHH!HHhHHhHHhHHiHH!HHIHHhHHhHHiHH!HH!HHhHHhHHiHH!HHHHHhHHhHHiHH!HHIHHhHHhHHiHH!HH!HHhHHhHHiHH!HhHHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!!H!" + "'", str1, "hHHhHHhHHiHH!HHhHHhHHhHHiHH!HHhHHhHHhHHiHH!HHIHHhHHhHHiHH!HH!HHhHHhHHiHH!HHIHHhHHhHHiHH!HHhHHhHHhhHHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!!HHiHH!HHhHHhHHhHHiHH!HHIHHhHHhHHiHH!HH!HHhHHhHHiHH!HHHHHhHHhHHiHH!HHIHHhHHhHHiHH!HH!HHhHHhHHiHH!HhHHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!!H!");
    }

    @Test
    public void test5568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5568");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("HhHHI!IHHI!HHHI!IHHI!!HI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HhHHI!IHHI!HHHI!IHHI!!HI!!" + "'", str1, "HhHHI!IHHI!HHHI!IHHI!!HI!!");
    }

    @Test
    public void test5569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5569");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhhI!IhhI!hhHHi!iHHi!HHHI!IHHI!!hi!!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhI!IhhI!hhHHi!iHHi!HHHI!IHHI!!hi!!" + "'", str2, "hhhI!IhhI!hhHHi!iHHi!HHHI!IHHI!!hi!!");
    }

    @Test
    public void test5570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5570");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!hHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!IHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HhhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!HhhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!ihhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!!" + "'", str1, "HhhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!HhhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!ihhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!!");
    }

    @Test
    public void test5571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5571");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("HHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IHhhi!hhI!!IhhhI!IhhI!!!HHhhhI!IhhI!!hHhhi!hhhI!IhhI!!HhhhI!IhhI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!hHhHHHI!IHHI!hhhI!IhhI!HI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!ihHHI!HHi!!iHHHi!iHHi!!!hhHHHi!iHHi!!HhHHI!HHHi!iHHi!!hHHHi!iHHi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!HhHhhhi!ihhi!HHHi!iHHi!hi!!" + "'", str1, "hhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!ihHHI!HHi!!iHHHi!iHHi!!!hhHHHi!iHHi!!HhHHI!HHHi!iHHi!!hHHHi!iHHi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!HhHhhhi!ihhi!HHHi!iHHi!hi!!");
    }

    @Test
    public void test5572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5572");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hhHhhi!hHhhi!hHhhi!iHhhi!!Hhhi!iHhhi!hHhhi!hHhhi!iHhhi!!Hhhi!hHhhi!hHhhi!hHhhi!iHhhi!!Hhhi!iHhhi!hhhhhi!hhhHhhhi!hhhihhhi!ihhi!hi!!!ihhi!!hHhhi!hHhhi!iHhhi!!Hhhi!!Hhhi!hHhhi!iHhhi!!Hhhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHhHHI!HhHHI!HhHHI!IhHHI!!hHHI!IhHHI!HhHHI!HhHHI!IhHHI!!hHHI!HhHHI!HhHHI!HhHHI!IhHHI!!hHHI!IhHHI!HHHHHI!HHHhHHHI!HHHIHHHI!IHHI!HI!!!IHHI!!HhHHI!HhHHI!IhHHI!!hHHI!!hHHI!HhHHI!IhHHI!!hHHI!!" + "'", str1, "HHhHHI!HhHHI!HhHHI!IhHHI!!hHHI!IhHHI!HhHHI!HhHHI!IhHHI!!hHHI!HhHHI!HhHHI!HhHHI!IhHHI!!hHHI!IhHHI!HHHHHI!HHHhHHHI!HHHIHHHI!IHHI!HI!!!IHHI!!HhHHI!HhHHI!IhHHI!!hHHI!!hHHI!HhHHI!IhHHI!!hHHI!!");
    }

    @Test
    public void test5573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5573");
        char[] charArray6 = new char[] {};
        java.lang.String str7 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray6);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.initials("", charArray6);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("hi!", charArray6);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray6);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("", charArray6);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("HHhHhhI!IhhI!!HHhhI!IhhI!!HHhhI!IhhI!!HHhhI!IhhI!!IHhhI!IhhI!!!HhhI!IhhI!!HHhhI!IhhI!!HHhhI!IhhI!!HHhhI!IhhI!!IHhhI!IhhI!!!HhhI!IhhI!!IHhhI!IhhI!!HHhhI!IhhI!!HHhhI!IhhI!!IHhhI!IhhI!!!HhhI!IhhI!!!", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HI!" + "'", str10, "HI!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HHhHhhI!IhhI!!HHhhI!IhhI!!HHhhI!IhhI!!HHhhI!IhhI!!IHhhI!IhhI!!!HhhI!IhhI!!HHhhI!IhhI!!HHhhI!IhhI!!HHhhI!IhhI!!IHhhI!IhhI!!!HhhI!IhhI!!IHhhI!IhhI!!HHhhI!IhhI!!HHhhI!IhhI!!IHhhI!IhhI!!!HhhI!IhhI!!!" + "'", str12, "HHhHhhI!IhhI!!HHhhI!IhhI!!HHhhI!IhhI!!HHhhI!IhhI!!IHhhI!IhhI!!!HhhI!IhhI!!HHhhI!IhhI!!HHhhI!IhhI!!HHhhI!IhhI!!IHhhI!IhhI!!!HhhI!IhhI!!IHhhI!IhhI!!HHhhI!IhhI!!HHhhI!IhhI!!IHhhI!IhhI!!!HhhI!IhhI!!!");
    }

    @Test
    public void test5574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5574");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.initials("hHHHI!IHHIHHHi!iHHi!hHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h" + "'", str2, "h");
    }

    @Test
    public void test5575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5575");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hhHHi!iHHi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHhhI!IhhI!!" + "'", str1, "HHhhI!IhhI!!");
    }

    @Test
    public void test5576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5576");
        char[] charArray9 = new char[] {};
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray9);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("HH", charArray9);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("Hh", charArray9);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhHHHHI!HHHI!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hi!" + "'", str13, "Hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "h" + "'", str15, "h");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HH" + "'", str16, "HH");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hh" + "'", str17, "Hh");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test5577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5577");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hhHHHI!IHHI!HI!!H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HhHHHI!IHHI!HI!!H" + "'", str1, "HhHHHI!IHHI!HI!!H");
    }

    @Test
    public void test5578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5578");
        char[] charArray11 = new char[] { '#', ' ', '4' };
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("hH", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("hhI!HhI!HhhhHHI!HHHI!Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("HHhhi!", charArray11);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("HHHh", charArray11);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhhhi!hhhi!hhhi!", charArray11);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '#', ' ', '4' });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hi!" + "'", str12, "Hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hi!" + "'", str13, "Hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HH" + "'", str14, "HH");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hhI!HhI!HhhhHHI!HHHI!Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!" + "'", str15, "hhI!HhI!HhhhHHI!HHHI!Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HHhhi!" + "'", str16, "HHhhi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HHHh" + "'", str17, "HHHh");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhhhi!hhhi!hhhi!" + "'", str18, "hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhhhi!hhhi!hhhi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!" + "'", str19, "Hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!");
    }

    @Test
    public void test5579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5579");
        char[] charArray7 = new char[] {};
        java.lang.String str8 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("HHHHHi!iHHHHHI!IHHI!HHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("HhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HhHHHHI!IHHHHHI!IHHI!HHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!", charArray7);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("hHhhI!IhhIhHh", charArray7);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("hhhhhhi!ihhhhi!hhhi!hhi!hhhi!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HhHHHHI!IHHHHHI!IHHI!HHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!" + "'", str12, "HhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HhHHHHI!IHHHHHI!IHHI!HHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hHhhI!IhhIhHh" + "'", str13, "hHhhI!IhhIhHh");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hhhhhhi!ihhhhi!hhhi!hhi!hhhi!" + "'", str14, "hhhhhhi!ihhhhi!hhhi!hhi!hhhi!");
    }

    @Test
    public void test5580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5580");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("HhHHHI!IHHI!!HhHHHI!IHHI!!HhHHHI!IHHI!!HhHHHI!IHHI!!Hhhhi!ihhihhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhihhhhi!ihhi!hi!!hIhHHHI!IHHI!!!hHHHI!IHHI!!IhHHHI!IHHI!!HhHHHI!IHHI!!Hhhhi!ihhihhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhihhhhi!ihhi!hi!!hHhHHHI!IHHI!!IhHHHI!IHHI!!!hHHHI!IHHI!!HhHHHI!IHHI!!Hhhhi!ihhihhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhihhhhi!ihhi!hi!!hIhHHHI!IHHI!!!hHHHI!IHHI!!!hHHHI!IHHI!!H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHhhhi!ihhi!!hHhhhi!ihhi!!hHhhhi!ihhi!!hHhhhi!ihhi!!hHHHI!IHHIHHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHIHHHHI!IHHI!HI!!HiHhhhi!ihhi!!!Hhhhi!ihhi!!iHhhhi!ihhi!!hHhhhi!ihhi!!hHHHI!IHHIHHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHIHHHHI!IHHI!HI!!HhHhhhi!ihhi!!iHhhhi!ihhi!!!Hhhhi!ihhi!!hHhhhi!ihhi!!hHHHI!IHHIHHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHIHHHHI!IHHI!HI!!HiHhhhi!ihhi!!!Hhhhi!ihhi!!!Hhhhi!ihhi!!h" + "'", str1, "hHhhhi!ihhi!!hHhhhi!ihhi!!hHhhhi!ihhi!!hHhhhi!ihhi!!hHHHI!IHHIHHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHIHHHHI!IHHI!HI!!HiHhhhi!ihhi!!!Hhhhi!ihhi!!iHhhhi!ihhi!!hHhhhi!ihhi!!hHHHI!IHHIHHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHIHHHHI!IHHI!HI!!HhHhhhi!ihhi!!iHhhhi!ihhi!!!Hhhhi!ihhi!!hHhhhi!ihhi!!hHHHI!IHHIHHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHIHHHHI!IHHI!HI!!HiHhhhi!ihhi!!!Hhhhi!ihhi!!!Hhhhi!ihhi!!h");
    }

    @Test
    public void test5581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5581");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHHI!IHHIHHHi!iHHi!hHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!", (int) 'a', (int) (short) 10, "hHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!hHHi!iHHi!HHHI!IHHI!!hi!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHHI!IHHIHHHi!iHHi!hHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHHhHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!hHHi!iHHi!HHHI!IHHI!!hi!!" + "'", str4, "HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHHI!IHHIHHHi!iHHi!hHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHHhHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!hHHi!iHHi!HHHI!IHHI!!hi!!");
    }

    @Test
    public void test5582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5582");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hhhi!ihhi!Hhhi!ihhi!HHI!iHI!!hi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test5583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5583");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("HHhhi!ihhi!!hHhhi!ihhi!!iHhhi!ihhi!!!Hhhi!ihhi!!hHhhi!ihhi!!hHhhi!ihhi!!iHhhi!ihhi!!!Hhhi!ihhi!!hHhhi!ihhi!!hHhhi!ihhi!!iHhhi!ihhi!!!Hhhi!ihhi!!hHhhi!ihhi!!hHhhi!ihhi!!iHhhi!ihhi!!!Hhhi!ihhi!!iHhhi!ihhi!!hHhhi!ihhi!!iHhhi!ihhi!!!Hhhi!ihhi!!!Hhhi!ihhi!!hHhhi!ihhi!!iHhhi!ihhi!!!Hhhi!ihhi!!iHhhi!ihhi!!hHhhi!ihhi!!iHhhi!ihhi!!!Hhhi!ihhi!!hHhhi!ihhi!!hHhhi!ihhi!!iHhhi!ihhi!!!Hhhi!ihhi!!hHhhi!ihhi!!hHhhi!ihhi!!iHhhi!ihhi!!!Hhhi!ihhi!!iHhhi!ihhi!!hHhhi!ihhi!!iHhhi!ihhi!!!Hhhi!ihhi!!!Hhhi!ihhi!!hHhhi!ihhi!!iHhhi!ihhi!!!Hhhi!ihhi!!hHhhi!ihhi!!hHhhi!ihhi!!iHhhi!ihhi!!!Hhhi!ihhi!!iHhhi!ihhi!!hHhhi!ihhi!!iHhhi!ihhi!!!Hhhi!ihhi!!!Hhhi!ihhi!!hHhhi!ihhi!!iHhhi!ihhi!!!Hhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test5584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5584");
        char[] charArray9 = new char[] { ' ' };
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("Hhi!", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("H", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("hHHHi!iHHi!hi!!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("hHh", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhhi!ihhihhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!", charArray9);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHI!IHHI!HHI!IHI!!HI!!", charArray9);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhhi!ihhihhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { ' ' });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H" + "'", str10, "H");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hhi!" + "'", str11, "Hhi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "h" + "'", str12, "h");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "h" + "'", str13, "h");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hHh" + "'", str14, "hHh");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhhi!ihhihhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!" + "'", str15, "hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhhi!ihhihhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hhhi!ihhi!hhi!ihi!!hi!!" + "'", str16, "Hhhi!ihhi!hhi!ihi!!hi!!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhhi!ihhihhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!" + "'", str17, "Hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhhi!ihhihhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!");
    }

    @Test
    public void test5585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5585");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HHHHI!HHHI!IHHI!!", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHHHI!HHHI!IHHI!!" + "'", str2, "HHHHI!HHHI!IHHI!!");
    }

    @Test
    public void test5586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5586");
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
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalize("Hhhhhi!ihhi!hi!!h", charArray13);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.uncapitalize("HhHHi!iHHi!HHHI!IHHI!!hi!!", charArray13);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.capitalize("Hhhhi!hhhhi!hhhhi!ihhhi!!hhhi!ihhhi!hhhhi!hhhhi!ihhhi!!hhhi!hhhhi!hhhhi!hhhhi!ihhhi!!hhhi!ihhhi!hhhhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!i!hhhhi!ihhhi!!hhhi!!hhhi!hhhhi!ihhhi!!hhhi!!", charArray13);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.capitalizeFully("HHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IHhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!IhHI!iHI!!!hHI!iHI!!IhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!!hHI!iHI!!ihHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!!hHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!hhHI!iHI!!hhHI!iHI!!!hHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!hhHI!iHI!!hhHI!iHI!!!hHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!hhHI!iHI!!hhHI!iHI!!!hHI!iHI!!hhHI!iHI!!hhHI!iHI!!!", charArray13);
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Hhhhhi!ihhi!hi!!h" + "'", str23, "Hhhhhi!ihhi!hi!!h");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "HhHHi!iHHi!HHHI!IHHI!!hi!!" + "'", str24, "HhHHi!iHHi!HHHI!IHHI!!hi!!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Hhhhi!hhhhi!hhhhi!ihhhi!!hhhi!ihhhi!hhhhi!hhhhi!ihhhi!!hhhi!hhhhi!hhhhi!hhhhi!ihhhi!!hhhi!ihhhi!hhhhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!i!hhhhi!ihhhi!!hhhi!!hhhi!hhhhi!ihhhi!!hhhi!!" + "'", str25, "Hhhhi!hhhhi!hhhhi!ihhhi!!hhhi!ihhhi!hhhhi!hhhhi!ihhhi!!hhhi!hhhhi!hhhhi!hhhhi!ihhhi!!hhhi!ihhhi!hhhhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!i!hhhhi!ihhhi!!hhhi!!hhhi!hhhhi!ihhhi!!hhhi!!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "HHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IHhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!IhHI!iHI!!!hHI!iHI!!IhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!!hHI!iHI!!ihHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!!hHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!hhHI!iHI!!hhHI!iHI!!!hHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!hhHI!iHI!!hhHI!iHI!!!hHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!hhHI!iHI!!hhHI!iHI!!!hHI!iHI!!hhHI!iHI!!hhHI!iHI!!!" + "'", str26, "HHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IHhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!IhHI!iHI!!!hHI!iHI!!IhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!!hHI!iHI!!ihHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!!hHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!hhHI!iHI!!hhHI!iHI!!!hHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!hhHI!iHI!!hhHI!iHI!!!hHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!hhHI!iHI!!hhHI!iHI!!!hHI!iHI!!hhHI!iHI!!hhHI!iHI!!!");
    }

    @Test
    public void test5587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5587");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhi!hhi!hhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhhHhhhHHI!IHHI!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!!HHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!!HHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!!HHHI!IHHI!HHI!IHI!!HI!!!HHHHI!IHHIHHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!!HHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!!HHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!!HHHI!IHHI!HHI!IHI!!HI!!!!HI!!H", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhi!hhi!hhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhhHhhhHHI!IHHI!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!!HHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!!HHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!!HHHI!IHHI!HHI!IHI!!HI!!!HHHHI!IHHIHHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!!HHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!!HHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!!HHHI!IHHI!HHI!IHI!!HI!!!!HI!!H" + "'", str2, "Hhi!hhi!hhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhhHhhhHHI!IHHI!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!!HHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!!HHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!!HHHI!IHHI!HHI!IHI!!HI!!!HHHHI!IHHIHHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!!HHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!!HHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!!HHHI!IHHI!HHI!IHI!!HI!!!!HI!!H");
    }

    @Test
    public void test5588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5588");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!HHI!IHI!!HI!!", (int) ' ', 0, "Hhhhi!hhhi!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhhi!ihhi!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHhhhi!hhhi!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhhi!ihhi!!" + "'", str4, "hHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHhhhi!hhhi!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhhi!ihhi!!");
    }

    @Test
    public void test5589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5589");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHHHI!HHHIHHI!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHHHI!HHHIHHI!" + "'", str2, "hHHHI!HHHIHHI!");
    }

    @Test
    public void test5590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5590");
        char[] charArray6 = new char[] {};
        java.lang.String str7 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray6);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.initials("h", charArray6);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("Hhi!", charArray6);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhHhh", charArray6);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhhi!hhhiHHhhi!!ihhi!!", charArray6);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("hhhhi!ihhi!hhhi!ihhi!!hi!!", charArray6);
        java.lang.Class<?> wildcardClass13 = charArray6.getClass();
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Hhi!" + "'", str9, "Hhi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hhhhi!hhhiHHhhi!!ihhi!!" + "'", str11, "hhhhi!hhhiHHhhi!!ihhi!!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test5591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5591");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("Hhhhhi!ihhhhhhhhhhhhhhhhhhihhh!hhhhhhhhhhhhhhhihhh!hhhihhhhhhhhhhhihhh!hhh!", (int) (short) 1, "Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!hhhi!ihhi!HHHi!iHHi!HHHI!IHHI!!hi!!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhihhhi!ihhi!HHHi!iHHi!HHHI!IHHI!!hi!!!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhhhhi!ihhi!HHHi!iHHi!HHHI!IHHI!!hi!!i!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhhhi!ihhi!HHHi!iHHi!HHHI!IHHI!!hi!!hi!!ihhhi!ihhi!!!hhhi!ihhi!!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhhhi!ihhhhhhhhhhhhhhhhhhihhh!hhhhhhhhhhhhhhhihhh!hhhihhhhhhhhhhhihhh!hhh!" + "'", str4, "Hhhhhi!ihhhhhhhhhhhhhhhhhhihhh!hhhhhhhhhhhhhhhihhh!hhhihhhhhhhhhhhihhh!hhh!");
    }

    @Test
    public void test5592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5592");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HHHHHI!IHHI!HI!!H", 0, "Hhhhi!ihhi!hhhi!ihhi!!hi!!hhhhi!ihhi!hhhi!ihhi!!hi!!hhhhi!ihhi!hhhi!ihhi!!hi!!hhhhi!ihhi!hhhi!ihhHhhhi!ihhihhhhhi!ihhhhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!i!!hi!!ihhhi!ihhi!hhhi!ihhi!!hi!!!hhhi!ihhi!hhhi!ihhi!!hi!!hhhhi!ihhi!hhhi!ihhi!!hi!!hhhhi!ihhi!hHhhhi!ihhihhhhhi!ihhhhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhi!ihhi!!hi!!hhhhi!ihhi!hhhi!ihhi!!hi!!ihhhi!ihhi!hhhi!ihhi!!hi!!!hhhi!ihhi!hhhi!ihhi!!hi!!hhhhiHhhhi!ihhihhhhhi!ihhhhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!ihhi!hhhi!ihhi!!hi!!hhhhi!ihhi!hhhi!ihhi!!hi!!hhhhi!ihhi!hhhi!ihhi!!hi!!ihhhi!ihhi!hhhi!ihhi!!hiHhhhi!ihhihhhhhi!ihhhhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHHHHI!IHHI!HI!!H" + "'", str4, "HHHHHI!IHHI!HI!!H");
    }

    @Test
    public void test5593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5593");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhi!hhi!hhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhhHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhhi!hhhi!hhi!hhhi!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhi!hhi!hhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhhHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhhi!hhhi!hhi!hhhi!" + "'", str2, "Hhi!hhi!hhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhhHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhhi!hhhi!hhi!hhhi!");
    }

    @Test
    public void test5594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5594");
        char[] charArray10 = new char[] {};
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("hi!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("Hhhi!ihhi!!", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("HHHHI!HHHIHHHI!HHHI!IHHI!!", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("HHHI!hHHI!iHHI!!", charArray10);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("hHhh", charArray10);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.initials("hHhhhi!hhhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!", charArray10);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray10);
        java.lang.Class<?> wildcardClass21 = charArray10.getClass();
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HHHI!hHHI!iHHI!!" + "'", str17, "HHHI!hHHI!iHHI!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test5595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5595");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhhi!ihhihhhi!ihhhhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!IhhiHHHHi!iHHi!hi!!H", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhhi!ihhihhhi!ihhhhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!IhhiHHHHi!iHHi!hi!!H" + "'", str2, "Hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhhi!ihhihhhi!ihhhhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!IhhiHHHHi!iHHi!hi!!H");
    }

    @Test
    public void test5596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5596");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HI!", (int) 'a', "", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HI!" + "'", str4, "HI!");
    }

    @Test
    public void test5597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5597");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hHI!HHI!HHHHHHI!HHHI!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhi!hhi!hhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!" + "'", str1, "Hhi!hhi!hhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
    }

    @Test
    public void test5598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5598");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("HhHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!!h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test5599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5599");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hHHHHHHHHIhhhhI!IhhI!HI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHHHHHHHIhhhhI!IhhI!HI!!" + "'", str1, "hHHHHHHHHIhhhhI!IhhI!HI!!");
    }

    @Test
    public void test5600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5600");
        char[] charArray8 = new char[] {};
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("hi!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray8);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray8);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhhhi!ihhi!hhi!ihi!!hi!!", charArray8);
        java.lang.Class<?> wildcardClass17 = charArray8.getClass();
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HI!" + "'", str12, "HI!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hi!" + "'", str14, "Hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hi!" + "'", str15, "Hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhhhi!ihhi!hhi!ihi!!hi!!" + "'", str16, "hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhhhi!ihhi!hhi!ihi!!hi!!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test5601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5601");
        char[] charArray7 = new char[] {};
        java.lang.String str8 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("hi!", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray7);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("HhhI!IhhI!!", charArray7);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("HhhhI!IhhI!HI!!h", charArray7);
        java.lang.Class<?> wildcardClass15 = charArray7.getClass();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HI!" + "'", str11, "HI!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HI!" + "'", str12, "HI!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HhhhI!IhhI!HI!!h" + "'", str14, "HhhhI!IhhI!HI!!h");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test5602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5602");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hhhhi!hhhiHHHHI!HHHIHHHi!iHHi!hi!!!IHHI!!", (int) (byte) 0, "Hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Ihhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Ihhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Ihhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Ihhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhhi!hhhiHHHHI!HHHIHHHi!iHHi!hi!!!IHHI!!" + "'", str4, "hhhhi!hhhiHHHHI!HHHIHHHi!iHHi!hi!!!IHHI!!");
    }

    @Test
    public void test5603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5603");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!IhHHI!hHHI!iHHI!!!hHHI!hHHI!iHHIhHHHi!iHHi!hi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhihhhhi!ihhi!hi!!" + "'", str1, "Hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhihhhhi!ihhi!hi!!");
    }

    @Test
    public void test5604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5604");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!ihHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!iHhi!Ihi!!!Hhi!Ihi!!iHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!!Hhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!!Hhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!!Hhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!!Hhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!!Hhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!ihHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!iHhi!Ihi!!!Hhi!Ihi!!iHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!!Hhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!!Hhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!!Hhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!!Hhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!!Hhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!!" + "'", str1, "HhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!ihHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!iHhi!Ihi!!!Hhi!Ihi!!iHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!!Hhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!!Hhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!!Hhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!!Hhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!!Hhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!!");
    }

    @Test
    public void test5605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5605");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("HhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!IhHHHI!HHHI!HHHI!!hHHHI!HHHI!HHHI!IhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!IhHHHI!HHHI!HHHI!!hHHHI!HHHI!HHHI!!hHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!IhHHHI!HHHI!HHHI!!hHHHI!HHHI!HHHI!IhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!IhHHHI!HHHI!HHHI!!hHHHI!HHHI!HHHI!!hHHHI!HHHI!HHHI!HhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!IhHHHI!HHHI!HHHI!!hHHHI!HHHI!HHHI!IhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!IhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!HhHHHI!HHHI!HHHI!HhHHHI!HHHI!HHHI!IhHHHI!HHHI!HHHI!!hHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!HhHHHI!HHHI!HHHI!HhHHHI!HHHI!HHHI!IhHHHI!HHHI!HHHI!!hHHHI!HHHI!HHHI!ihHHHI!HHHI!HHHI!HhHHHI!HHHI!HHHI!HhHHHI!HHHI!HHHI!IhHHHI!HHHI!HHHI!!hHHHI!HHHI!HHHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!ihhhhi!hhhi!hhhi!!hhhhi!hhhi!hhhi!ihhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!ihhhhi!hhhi!hhhi!!hhhhi!hhhi!hhhi!!hhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!ihhhhi!hhhi!hhhi!!hhhhi!hhhi!hhhi!ihhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!ihhhhi!hhhi!hhhi!!hhhhi!hhhi!hhhi!!hhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!ihhhhi!hhhi!hhhi!!hhhhi!hhhi!hhhi!ihhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!ihhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!ihhhhi!hhhi!hhhi!!hhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!ihhhhi!hhhi!hhhi!!hhhhi!hhhi!hhhi!ihhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!ihhhhi!hhhi!hhhi!!hhhhi!hhhi!hhhi!!" + "'", str1, "Hhhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!ihhhhi!hhhi!hhhi!!hhhhi!hhhi!hhhi!ihhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!ihhhhi!hhhi!hhhi!!hhhhi!hhhi!hhhi!!hhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!ihhhhi!hhhi!hhhi!!hhhhi!hhhi!hhhi!ihhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!ihhhhi!hhhi!hhhi!!hhhhi!hhhi!hhhi!!hhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!ihhhhi!hhhi!hhhi!!hhhhi!hhhi!hhhi!ihhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!ihhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!ihhhhi!hhhi!hhhi!!hhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!ihhhhi!hhhi!hhhi!!hhhhi!hhhi!hhhi!ihhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!ihhhhi!hhhi!hhhi!!hhhhi!hhhi!hhhi!!");
    }

    @Test
    public void test5606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5606");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test5607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5607");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("HHh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test5608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5608");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hhHi!HhHi!HhHi!HhHi!HhHi!IhHi!!hHi!HhHi!HhHi!HhHi!HhHi!HhHi!HhHi!HhHi!HhHi!IhHi!!hHi!IhHi!HhHi!HhHi!IhHi!!hHi!!hHi!HhHi!HhHi!HhHi!HhHi!IhHi!!hHi!IhHi!HhHi!HhHi!IhHi!!hHi!!hHi!HhHi!HhHi!HhHi!HhHi!IhHi!!hHi!IhHi!HhHi!HhHi!IhHi!!hHi!!hHi!HhHi!HhHi!HhHi!HhHi!IhHi!!hHi!IhHi!HhHi!HhHi!IhHi!!hHi!!hHi!IhHi!HhHi!HhHi!HhHi!IhHi!!hHi!IhHi!HhHi!HhHi!IhHi!!hHi!!hHi!!hHi!HhHi!HhHi!HhHi!IhHi!!hHi!IhHi!HhHi!HhHi!IhHi!!hHi!!hHi!IhHi!HhHi!HhHi!HhHi!IhHi!!hHi!IhHi!HhHi!HhHi!IhHi!!hHi!!hHi!HhHi!HhHi!HhHi!HhHi!IhHi!!hHi!IhHi!HhHi!HhHi!IhHi!!hHi!!hHi!HhHi!HhHi!HhHi!HhHi!IhHi!!hHi!IhHi!HhHi!HhHi!IhHi!!hHi!!hHi!IhHi!HhHi!HhHi!HhHi!IhHi!!hHi!IhHi!HhHi!HhHi!IhHi!!hHi!!hHi!!hHi!HhHi!HhHi!HhHi!IhHi!!hHi!IhHi!HhHi!HhHi!IhHi!!hHi!!hHi!HhHi!HhHi!HhHi!HhHi!IhHi!!hHi!IhHi!HhHi!HhHi!IhHi!!hHi!!hHi!IhHi!HhHi!HhHi!HhHi!IhHi!!hHi!IhHi!HhHi!HhHi!IhHi!!hHi!!hHi!!hHi!HhHi!HhHi!HhHi!IhHi!!hHi!IhHi!HhHi!HhHi!IhHi!!hHi!!hHi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test5609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5609");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhHHHI!IHHI!!hhHHHI!IHHI!!hhHHHI!IHHI!!ihHHHI!IHHI!!!hHHHI!IHHI!!hhHHHI!IHHI!!hhHHHI!IHHI!!hhHHHI!IHHI!!ihHHHI!IHHI!!!hHHHI!IHHI!!ihHHHI!IHHI!!hhHHHI!IHHI!!hhHHHI!IHHI!!ihHHHI!IHHI!!!hHHHI!IHHI!!!", (int) '#', (int) (short) 10, "hhhI!IhhI!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhHHHI!IHHI!!hhHHHI!IHHI!!hhHHHI!IHhhhI!IhhI!!" + "'", str4, "hhHHHI!IHHI!!hhHHHI!IHHI!!hhHHHI!IHhhhI!IhhI!!");
    }

    @Test
    public void test5610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5610");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!hHHHI!HHHIhHHI!HHHI!IHHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!hHHHI!HHHIhHHI!HHHI!IHHI!!" + "'", str1, "hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!hHHHI!HHHIhHHI!HHHI!IHHI!!");
    }

    @Test
    public void test5611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5611");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hHHI!IHHI!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!!HHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!!HHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!!HHHI!IHHI!HHI!IHI!!HI!!!HHHHI!IHHIHHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!!HHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!!HHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!!HHHI!IHHI!HHI!IHI!!HI!!!!HI!!H", (int) (byte) 100, "hhhhi!hhhihHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!iHhhi!Hhhi!Ihhi!!!Hhhi!Hhhi!IhhiHhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!IhHHI!hHHI!iHHI!!!hHHI!hHHI!ihhHHHI!IHHI!HI!!H", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHI!IHHI!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!!HHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!!HHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!!HHHI!IHHI!HHI!IHI!!HI!!!HHHHI!IHHIHHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!!HHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!!HHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!!HHHI!IHHI!HHI!IHI!!HI!!!!HI!!H" + "'", str4, "hHHI!IHHI!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!!HHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!!HHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!!HHHI!IHHI!HHI!IHI!!HI!!!HHHHI!IHHIHHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!!HHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!!HHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!!HHHI!IHHI!HHI!IHI!!HI!!!!HI!!H");
    }

    @Test
    public void test5612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5612");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhhhi!hhhihHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!iHhhi!Hhhi!Ihhi!!!Hhhi!Hhhi!IhhiHhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!IhHHI!hHHI!iHHI!!!hHHI!hHHI!ihhHHHI!IHHI!HI!!H", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhhi!hhhihHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!iHhhi!Hhhi!Ihhi!!!Hhhi!Hhhi!IhhiHhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!IhHHI!hHHI!iHHI!!!hHHI!hHHI!ihhHHHI!IHHI!HI!!H" + "'", str2, "hhhhi!hhhihHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!iHhhi!Hhhi!Ihhi!!!Hhhi!Hhhi!IhhiHhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!IhHHI!hHHI!iHHI!!!hHHI!hHHI!ihhHHHI!IHHI!HI!!H");
    }

    @Test
    public void test5613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5613");
        char[] charArray12 = new char[] { '#', '4', '4', '4' };
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray12);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray12);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("H", charArray12);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("hhhi!ihhi!!", charArray12);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("Hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!!", charArray12);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("HhHHHI!IHHI!!hhHHHI!IHHI!!hhHHHI!IHhHHHI!HHHIhHHI!HHHI!IHHI!!HI!!ihHHHI!IHHI!!!hHHHI!IHHI!!hhHHHhHHHHHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!hHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!hhhi!Hhhi!hhHI!", charArray12);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.initials("hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!iHHHI!hHHI!iHHI!!!HHHI!hHHI!iHHI!!iHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!HHHHI!hHHI!iHHI!!HHHHI!hHHI!iHHI!!HHHHI!hHHI!iHHI!!IHHHI!hHHI!iHHI!!!HHHI!hHHI!iHHI!!IHHHI!hHHI!iHHI!!HHHHI!hHHI!iHHI!!HHHHI!hHHI!iHHI!!IHHHI!hHHI!iHHI!!!HHHI!hHHI!iHHI!!HHHHI!hHHI!iHHI!!IHHHI!hHHI!iHHI!!!HHHI!hHHI!iHHI!!!HHHI!hHHI!iHHI!!H", charArray12);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.uncapitalize("hhhI!IhhI!hhHHi!iHHi!HHHI!IHHI!!hi!!", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '#', '4', '4', '4' });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hi!" + "'", str13, "Hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hi!" + "'", str14, "Hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "h" + "'", str15, "h");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hhhi!ihhi!!" + "'", str16, "hhhi!ihhi!!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!!" + "'", str17, "Hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HhHHHI!IHHI!!hhHHHI!IHHI!!hhHHHI!IHhHHHI!HHHIhHHI!HHHI!IHHI!!HI!!ihHHHI!IHHI!!!hHHHI!IHHI!!hhHHHhHHHHHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!hHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!hhhi!Hhhi!hhHI!" + "'", str18, "HhHHHI!IHHI!!hhHHHI!IHHI!!hhHHHI!IHhHHHI!HHHIhHHI!HHHI!IHHI!!HI!!ihHHHI!IHHI!!!hHHHI!IHHI!!hhHHHhHHHHHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!hHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!hhhi!Hhhi!hhHI!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "h" + "'", str19, "h");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hhhI!IhhI!hhHHi!iHHi!HHHI!IHHI!!hi!!" + "'", str20, "hhhI!IhhI!hhHHi!iHHi!HHHI!IHHI!!hi!!");
    }

    @Test
    public void test5614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5614");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("", (int) 'a', (int) (short) 10, "HhHI!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test5615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5615");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hhhI!IhhI!hHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!IHhhi!ihhi!HHI!iHI!!hi!!!Hhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!IHhhi!ihhi!HHI!iHI!!hi!!!Hhhi!ihhi!HHI!iHI!!hi!!IHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!IHhhi!ihhi!HHI!iHI!!hi!!!Hhhi!ihhi!HHI!iHI!!hi!!!hHHHi!iHHihHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!IHhhi!ihhi!HHI!iHI!!hi!!!Hhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!IHhhi!ihhi!HHI!iHI!!hi!!!Hhhi!ihhi!HHI!iHI!!hi!!IHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!IHhhi!ihhi!HHI!iHI!!hi!!!Hhhi!ihhi!HHI!iHI!!hi!!!!hi!!H", (int) 'a', "HHhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!ihHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhI!IhhI!hHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!IHhhi!ihhi!HHI!iHI!!hi!!!Hhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!IHhhi!ihhi!HHI!iHI!!hi!!!Hhhi!ihhi!HHI!iHI!!hi!!IHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!IHhhi!ihhi!HHI!iHI!!hi!!!Hhhi!ihhi!HHI!iHI!!hi!!!hHHHi!iHHihHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!IHhhi!ihhi!HHI!iHI!!hi!!!Hhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!IHhhi!ihhi!HHI!iHI!!hi!!!Hhhi!ihhi!HHI!iHI!!hi!!IHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!IHhhi!ihhi!HHI!iHI!!hi!!!Hhhi!ihhi!HHI!iHI!!hi!!!!hi!!H" + "'", str4, "hhhI!IhhI!hHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!IHhhi!ihhi!HHI!iHI!!hi!!!Hhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!IHhhi!ihhi!HHI!iHI!!hi!!!Hhhi!ihhi!HHI!iHI!!hi!!IHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!IHhhi!ihhi!HHI!iHI!!hi!!!Hhhi!ihhi!HHI!iHI!!hi!!!hHHHi!iHHihHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!IHhhi!ihhi!HHI!iHI!!hi!!!Hhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!IHhhi!ihhi!HHI!iHI!!hi!!!Hhhi!ihhi!HHI!iHI!!hi!!IHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!IHhhi!ihhi!HHI!iHI!!hi!!!Hhhi!ihhi!HHI!iHI!!hi!!!!hi!!H");
    }

    @Test
    public void test5616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5616");
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
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhi!ihhi!hi!!", charArray14);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!", charArray14);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.uncapitalize("hHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!", charArray14);
        java.lang.String str27 = org.apache.commons.lang.WordUtils.initials("hhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HHhhI!IhhI!hhHHi!iHHi!HHHI!IHHI!!hi!!", charArray14);
        java.lang.String str28 = org.apache.commons.lang.WordUtils.initials("HHHI!IHHI!hhHHI!HHHI!Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!", charArray14);
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
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Hhhhi!ihhi!hi!!" + "'", str24, "Hhhhi!ihhi!hi!!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!" + "'", str25, "Hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!" + "'", str26, "hHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test5617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5617");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("Hhhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!h!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHHHHI!IHHI!HI!!HHHHHHHI!IHHI!HI!!HHHHHHHI!IHHI!HI!!HIHHHHHI!IHHI!HI!!H!HHHHHI!IHHI!HI!!HIHHHHHI!IHHI!HI!!HHHHHHHI!IHHI!HI!!HHHHHHHI!IHHI!HI!!HIHHHHHI!IHHI!HI!!H!HHHHHI!IHHI!HI!!H!" + "'", str1, "hHHHHHI!IHHI!HI!!HHHHHHHI!IHHI!HI!!HHHHHHHI!IHHI!HI!!HIHHHHHI!IHHI!HI!!H!HHHHHI!IHHI!HI!!HIHHHHHI!IHHI!HI!!HHHHHHHI!IHHI!HI!!HHHHHHHI!IHHI!HI!!HIHHHHHI!IHHI!HI!!H!HHHHHI!IHHI!HI!!H!");
    }

    @Test
    public void test5618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5618");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("Hhhi!ihhi!hhhi!ihhi!hhhi!ihhi!!hi!!", (int) 'a', "HHHHHHHHHHHHHHHHIHHH!HHHHHHHHHHHHHHHIHHH!HHHIHHHHHHHHHHHIHHH!HHH!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhi!ihhi!hhhi!ihhi!hhhi!ihhi!!hi!!" + "'", str4, "Hhhi!ihhi!hhhi!ihhi!hhhi!ihhi!!hi!!");
    }

    @Test
    public void test5619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5619");
        char[] charArray11 = new char[] {};
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("", charArray11);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray11);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("hh", charArray11);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.uncapitalize("hhhi!Hhhi!Ihhi!!", charArray11);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("HhhhI!IhhI!HI!!", charArray11);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!!hhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!!hhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!!hhhi!ihhi!hhi!ihi!!hi!!!", charArray11);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.uncapitalize("hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] {});
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hi!" + "'", str15, "Hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hh" + "'", str18, "hh");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hhhi!Hhhi!Ihhi!!" + "'", str19, "hhhi!Hhhi!Ihhi!!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HhhhI!IhhI!HI!!" + "'", str20, "HhhhI!IhhI!HI!!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!!hhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!!hhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!!hhhi!ihhi!hhi!ihi!!hi!!!" + "'", str21, "Hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!!hhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!!hhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!!hhhi!ihhi!hhi!ihi!!hi!!!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!" + "'", str22, "hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!");
    }

    @Test
    public void test5620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5620");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("HhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!ihHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!ihHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!!" + "'", str1, "HhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!ihHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!!");
    }

    @Test
    public void test5621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5621");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHHHI!HHHIHhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!IhHHI!hHHI!iHHI!!!hHHI!hHHI!iHHIhHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!iHhhi!Hhhi!Ihhi!!!Hhhi!Hhhi!IHHhhhi!ihhi!hi!!h", (int) ' ', (int) (byte) 1, "HHHHHI!HHHIhHHI!HHHI!HHHI!IHHI!!HhHHi!iHHihhhhi!hhhi!ihhi!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHHHI!HHHIHhHHI!hHHI!iHHI!!HhHHIHHHHHI!HHHIhHHI!HHHI!HHHI!IHHI!!HhHHi!iHHihhhhi!hhhi!ihhi!!" + "'", str4, "HHHHI!HHHIHhHHI!hHHI!iHHI!!HhHHIHHHHHI!HHHIhHHI!HHHI!HHHI!IHHI!!HhHHi!iHHihhhhi!hhhi!ihhi!!");
    }

    @Test
    public void test5622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5622");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("HhHHi!iHHiHhH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test5623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5623");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HHHI!HHHI!HHI!HHHI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHI!HHHI!HHI!HHHI!" + "'", str1, "hHHI!HHHI!HHI!HHHI!");
    }

    @Test
    public void test5624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5624");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HIhhHHHI!IHhHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhi!ihhi!!!Hhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhi!ihhi!!!Hhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhi!ihhi!!!Hhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhi!ihhi!!!Hhhhi!hhhiHhhi!hhhi!ihhi!!!Hhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhi!ihhi!!!Hhhhi!hhhiHhhi!hhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HIhhHHHI!IHhHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhi!ihhi!!!Hhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhi!ihhi!!!Hhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhi!ihhi!!!Hhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhi!ihhi!!!Hhhhi!hhhiHhhi!hhhi!ihhi!!!Hhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhi!ihhi!!!Hhhhi!hhhiHhhi!hhhi!ihhi!!!" + "'", str1, "hhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HIhhHHHI!IHhHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhi!ihhi!!!Hhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhi!ihhi!!!Hhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhi!ihhi!!!Hhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhi!ihhi!!!Hhhhi!hhhiHhhi!hhhi!ihhi!!!Hhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhi!ihhi!!!Hhhhi!hhhiHhhi!hhhi!ihhi!!!");
    }

    @Test
    public void test5625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5625");
        char[] charArray10 = new char[] {};
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("Hi!", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray10);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("HHHi!iHHi!!", charArray10);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.initials("HHh", charArray10);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.uncapitalize("hHhhhi!hhhihHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!iHhhi!Hhhi!Ihhi!!!Hhhi!Hhhi!IhhiHhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!IhHHI!hHHI!iHHI!!!hHHI!hHHI!ihhHHHI!IHHI!HI!!H", charArray10);
        java.lang.Class<?> wildcardClass21 = charArray10.getClass();
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hi!" + "'", str15, "Hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hi!" + "'", str16, "Hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HHHi!iHHi!!" + "'", str18, "HHHi!iHHi!!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hHhhhi!hhhihHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!iHhhi!Hhhi!Ihhi!!!Hhhi!Hhhi!IhhiHhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!IhHHI!hHHI!iHHI!!!hHHI!hHHI!ihhHHHI!IHHI!HI!!H" + "'", str20, "hHhhhi!hhhihHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!iHhhi!Hhhi!Ihhi!!!Hhhi!Hhhi!IhhiHhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!IhHHI!hHHI!iHHI!!!hHHI!hHHI!ihhHHHI!IHHI!HI!!H");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test5626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5626");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhHHHHI!IHHHHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!!HHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!!HHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!!HHHI!IHHI!HHI!IHI!!HI!!!", (int) 'a', (int) (byte) -1, "hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhHHHHI!IHHHHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!!HHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!!HHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!!HHHI!IHHI!HHI!IHI!!HI!!!" + "'", str4, "hhHHHHI!IHHHHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!!HHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!!HHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!!HHHI!IHHI!HHI!IHI!!HI!!!");
    }

    @Test
    public void test5627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5627");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhhhi!hhhiHHHHI!HHHIHHHi!iHHi!hi!!!IHHI!!", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhhi!hhhiHHHHI!HHHIHHHi!iHHi!hi!!!IHHI!!" + "'", str2, "hhhhi!hhhiHHHHI!HHHIHHHi!iHHi!hi!!!IHHI!!");
    }

    @Test
    public void test5628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5628");
        char[] charArray4 = new char[] {};
        java.lang.String str5 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray4);
        java.lang.String str6 = org.apache.commons.lang.WordUtils.uncapitalize("hI!", charArray4);
        java.lang.String str7 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray4);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhh", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hI!" + "'", str6, "hI!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hhhh" + "'", str8, "Hhhh");
    }

    @Test
    public void test5629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5629");
        char[] charArray7 = new char[] { '#', '4', '4', '4' };
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("HHhi!", charArray7);
        java.lang.Class<?> wildcardClass11 = charArray7.getClass();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '#', '4', '4', '4' });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hi!" + "'", str8, "Hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Hi!" + "'", str9, "Hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H" + "'", str10, "H");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test5630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5630");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHHI!IHHI!hhi!Ihi!!HI!!", (int) '#', (int) 'a', "HHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!iHHHI!hHHI!iHHIhhhhI!IhhI!HI!!h");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end 35, length 23");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5631");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!HhHHHI!HHHI!IHHI!!HhHHHI!HHHI!IHHI!!IhHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!HhHHHI!HHHI!IHHI!!IhHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!!", (int) (byte) 1, (-1), "Hhhhi!ihhi!hhhi!ihhi!!hi!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!HhHHHI!HHHI!IHHI!!HhHHHI!HHHI!IHHI!!IhHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!HhHHHI!HHHI!IHHI!!IhHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!!" + "'", str4, "HhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!HhHHHI!HHHI!IHHI!!HhHHHI!HHHI!IHHI!!IhHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!HhHHHI!HHHI!IHHI!!IhHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!!");
    }

    @Test
    public void test5632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5632");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!hHhhhi!ihhihhhI!IhHHHi!iHHi!HhH", (int) '#', (int) '4', "HHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!h");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!hHhhhi!ihhihhhI!IhHHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!h" + "'", str4, "hHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!hHhhhi!ihhihhhI!IhHHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!h");
    }

    @Test
    public void test5633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5633");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHH", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHH" + "'", str2, "hHhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHH");
    }

    @Test
    public void test5634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5634");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhhi!ihhihhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!hhhhi!Hhhi!Ihhi!!hhhhi!Hhhi!Ihhi!!hhhhi!Hhhi!Ihhi!!ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!ihhhi!Hhhi!Ihhi!!hhhhi!Hhhi!Ihhi!!hhhhi!Hhhi!Ihhi!!ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!hhhhi!Hhhi!Ihhi!!ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!h!hhhi!ihhihhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!hhhhi!Hhhi!Ihhi!!hhhhi!Hhhi!Ihhi!!hhhhi!Hhhi!Ihhi!!ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!ihhhi!Hhhi!Ihhi!!hhhhi!Hhhi!Ihhi!!hhhhi!Hhhi!Ihhi!!ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!hhhhi!Hhhi!Ihhi!!ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!h!!hi!!", (int) (short) 0, (int) (short) 10, "Hhhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhhhhi!hhhihhhi!hhhi!ihhi!!hi!!ihhhhi!ihhi!!!hhhhi!ihhi!!hhhhhhhhhi!hhhihhhi!hhhi!ihhi!!i!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!hhhhi!ihhi!!!hhhhi!ihhi!!ihhhhi!ihhhhhhi!hhhihhhi!hhhi!ihhi!!i!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhihhhhi!hhhihhhi!hhhi!ihhi!!!ihhi!!!hhhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhhi!ihhiHhhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhhhhi!hhhihhhi!hhhi!ihhi!!hi!!ihhhhi!ihhi!!!hhhhi!ihhi!!hhhhhhhhhi!hhhihhhi!hhhi!ihhi!!i!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!hhhhi!ihhi!!!hhhhi!ihhi!!ihhhhi!ihhhhhhi!hhhihhhi!hhhi!ihhi!!i!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhihhhhi!hhhihhhi!hhhi!ihhi!!!ihhi!!!hhhhi!ihhi!!!" + "'", str4, "Hhhhi!ihhiHhhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhhhhi!hhhihhhi!hhhi!ihhi!!hi!!ihhhhi!ihhi!!!hhhhi!ihhi!!hhhhhhhhhi!hhhihhhi!hhhi!ihhi!!i!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!hhhhi!ihhi!!!hhhhi!ihhi!!ihhhhi!ihhhhhhi!hhhihhhi!hhhi!ihhi!!i!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhihhhhi!hhhihhhi!hhhi!ihhi!!!ihhi!!!hhhhi!ihhi!!!");
    }

    @Test
    public void test5635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5635");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("HHhI!hHhI!hHhI!hHhI!hHhI!iHhI!!HhI!hHhI!hHhI!hHhI!hHhI!hHhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!hHhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!hHhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!hHhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!iHhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!!HhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!iHhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!hHhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!hHhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!iHhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!!HhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!hHhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!iHhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!!HhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHhI!hHhI!hHhI!hHhI!hHhI!iHhI!!HhI!hHhI!hHhI!hHhI!hHhI!hHhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!hHhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!hHhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!hHhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!iHhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!!HhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!iHhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!hHhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!hHhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!iHhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!!HhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!hHhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!iHhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!!HhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!!" + "'", str1, "HHhI!hHhI!hHhI!hHhI!hHhI!iHhI!!HhI!hHhI!hHhI!hHhI!hHhI!hHhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!hHhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!hHhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!hHhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!iHhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!!HhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!iHhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!hHhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!hHhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!iHhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!!HhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!hHhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!iHhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!!HhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!!");
    }

    @Test
    public void test5636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5636");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhhhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhhhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!" + "'", str1, "hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhhhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!");
    }

    @Test
    public void test5637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5637");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HHHHI!HHHIhHHI!HHHI!IHHI!!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHHHI!HHHIhHHI!HHHI!IHHI!!" + "'", str2, "HHHHI!HHHIhHHI!HHHI!IHHI!!");
    }

    @Test
    public void test5638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5638");
        char[] charArray10 = new char[] {};
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("hH", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("hI!", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("HI!", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("HI!", charArray10);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhI!IhhI!HI!!", charArray10);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.initials("hHHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!HHI!IHI!!HI!!", charArray10);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("HhHHHi!iHHHHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!IHhhi!ihhi!HHI!iHI!!hi!!!Hhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!IHhhi!ihhi!HHI!iHI!!hi!!!Hhhi!ihhi!HHI!iHI!!hi!!IHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!IHhhi!ihhi!HHI!iHI!!hi!!!Hhhi!ihhi!HHI!iHI!!hi!!!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hi!" + "'", str13, "Hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hI!" + "'", str15, "hI!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HI!" + "'", str16, "HI!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HI!" + "'", str17, "HI!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hhhI!IhhI!HI!!" + "'", str18, "hhhI!IhhI!HI!!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HhHHHi!iHHHHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!IHhhi!ihhi!HHI!iHI!!hi!!!Hhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!IHhhi!ihhi!HHI!iHI!!hi!!!Hhhi!ihhi!HHI!iHI!!hi!!IHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!IHhhi!ihhi!HHI!iHI!!hi!!!Hhhi!ihhi!HHI!iHI!!hi!!!" + "'", str20, "HhHHHi!iHHHHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!IHhhi!ihhi!HHI!iHI!!hi!!!Hhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!IHhhi!ihhi!HHI!iHI!!hi!!!Hhhi!ihhi!HHI!iHI!!hi!!IHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!IHhhi!ihhi!HHI!iHI!!hi!!!Hhhi!ihhi!HHI!iHI!!hi!!!");
    }

    @Test
    public void test5639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5639");
        char[] charArray12 = new char[] {};
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray12);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("", charArray12);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray12);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray12);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("", charArray12);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray12);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("H", charArray12);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray12);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.uncapitalize("hhhi!ihhi!!", charArray12);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray12);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.uncapitalize("HH", charArray12);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.initials("HhHHI!HHHI!Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] {});
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hi!" + "'", str16, "Hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "h" + "'", str18, "h");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H" + "'", str19, "H");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hi!" + "'", str20, "Hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hhhi!ihhi!!" + "'", str21, "hhhi!ihhi!!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "HH" + "'", str23, "HH");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test5640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5640");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("HHhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!iHHHI!hHHI!iHHI!!!HHHI!hHHI!iHHI!!iHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!iHHHI!hHHI!iHHI!!!HHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!iHHHI!hHHI!iHHI!!!HHHI!hHHI!iHHI!!!HHHI!hHHI!iHHI!!h" + "'", str1, "hhHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!iHHHI!hHHI!iHHI!!!HHHI!hHHI!iHHI!!iHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!iHHHI!hHHI!iHHI!!!HHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!iHHHI!hHHI!iHHI!!!HHHI!hHHI!iHHI!!!HHHI!hHHI!iHHI!!h");
    }

    @Test
    public void test5641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5641");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhhi!ihhihhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!hhhhi!Hhhi!Ihhi!!hhhhi!Hhhi!Ihhi!!hhhhi!Hhhi!Ihhi!!ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!ihhhi!Hhhi!Ihhi!!hhhhi!Hhhi!Ihhi!!hhhhi!Hhhi!Ihhi!!ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!hhhhi!Hhhi!Ihhi!!ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!h!hhhi!ihhihhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!hhhhi!Hhhi!Ihhi!!hhhhi!Hhhi!Ihhi!!hhhhi!Hhhi!Ihhi!!ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!ihhhi!Hhhi!Ihhi!!hhhhi!Hhhi!Ihhi!!hhhhi!Hhhi!Ihhi!!ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!hhhhi!Hhhi!Ihhi!!ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!h!!hi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!ihhihhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!h!hhhi!ihhihhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!h!!hi!!" + "'", str1, "Hhhhi!ihhihhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!h!hhhi!ihhihhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!h!!hi!!");
    }

    @Test
    public void test5642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5642");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!hhhi!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhhi!ihhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhi!hhhi!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhhi!ihhi!!" + "'", str1, "hhhi!hhhi!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhhi!ihhi!!");
    }

    @Test
    public void test5643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5643");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!HHI!IHI!!HI!!", (int) (byte) 1, "HI!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHI!HHI!HHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!!HI!HHI!HHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!!HI!HHI!HHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!!HI!IHI!HHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!!HI!!HI!HHI!HHI!HHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!!HI!HHI!HHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!!HI!HHI!HHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!!HI!IHI!HHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!!HI!!HI!HHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!HHI!HHI!IHI!!HI!IHI!HHI!IHI!!HI!!HI!HHI!IHI!!HI!!" + "'", str4, "HHI!HHI!HHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!!HI!HHI!HHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!!HI!HHI!HHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!!HI!IHI!HHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!!HI!!HI!HHI!HHI!HHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!!HI!HHI!HHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!!HI!HHI!HHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!!HI!IHI!HHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!!HI!!HI!HHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!HHI!HHI!IHI!!HI!IHI!HHI!IHI!!HI!!HI!HHI!IHI!!HI!!");
    }

    @Test
    public void test5644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5644");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!", (int) '4', (int) (byte) 10, "HHHHHHHHHIHHHHi!iHHi!hi!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhHHHHHHHHHIHHHHi!iHHi!hi!!" + "'", str4, "HHhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhHHHHHHHHHIHHHHi!iHHi!hi!!");
    }

    @Test
    public void test5645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5645");
        char[] charArray9 = new char[] { '4', '4' };
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("HHi!", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("HH", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("hhI!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhhi!hhhi!ihhi!!", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray9);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHHHI!IHHHHHI!IHHI!HHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hi!" + "'", str10, "Hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hhi!" + "'", str11, "Hhi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hH" + "'", str12, "hH");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "h" + "'", str13, "h");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hhhhi!hhhi!ihhi!!" + "'", str14, "Hhhhi!hhhi!ihhi!!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
    }

    @Test
    public void test5646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5646");
        char[] charArray8 = new char[] {};
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray8);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("hh", charArray8);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("hhhi!Hhhi!Ihhi!!", charArray8);
        java.lang.Class<?> wildcardClass17 = charArray8.getClass();
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hi!" + "'", str12, "Hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hh" + "'", str15, "hh");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hhhi!Hhhi!Ihhi!!" + "'", str16, "hhhi!Hhhi!Ihhi!!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test5647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5647");
        char[] charArray13 = new char[] { '#', '4', '4', '4' };
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray13);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray13);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("", charArray13);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("HHi!", charArray13);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray13);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!ihhi!!", charArray13);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhi!hhhihhhi!hhhi!ihhi!!", charArray13);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.uncapitalize("HHHI!IHHI!hi!", charArray13);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalize("hHhhI!IhhI!!", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '#', '4', '4', '4' });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hi!" + "'", str14, "Hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hi!" + "'", str15, "Hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H" + "'", str17, "H");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Hhhi!ihhi!!" + "'", str19, "Hhhi!ihhi!!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hhhhi!hhhihhhi!hhhi!ihhi!!" + "'", str20, "Hhhhi!hhhihhhi!hhhi!ihhi!!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hHHI!IHHI!hi!" + "'", str21, "hHHI!IHHI!hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "HHhhI!IhhI!!" + "'", str22, "HHhhI!IhhI!!");
    }

    @Test
    public void test5648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5648");
        char[] charArray8 = new char[] {};
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("hi!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray8);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("hH", charArray8);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("hHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hi!" + "'", str12, "Hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hH" + "'", str15, "hH");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!" + "'", str16, "hHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!");
    }

    @Test
    public void test5649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5649");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!IhHHI!hHHI!iHHI!!!hHHI!hHHI!iHHIhHHHi!iHHi!hi!!", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!IhHHI!hHHI!iHHI!!!hHHI!hHHI!iHHIhHHHi!iHHi!hi!!" + "'", str2, "hhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!IhHHI!hHHI!iHHI!!!hHHI!hHHI!iHHIhHHHi!iHHi!hi!!");
    }

    @Test
    public void test5650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5650");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hHHhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!ihHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!!", (int) '#', "HHHI!hHHI!HHhi!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHHHHI!hHHI!HHhi!i!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHHHI!hHHI!HHhi!Hi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHHI!hHHI!HHhi!HHi!!ihHHi!iHHi!!!hHHi!iHHi!!ihHHi!HHHI!hHHI!HHhi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHiHHHI!hHHI!HHhi!!iHHi!!!hHHi!iHHi!!!" + "'", str4, "hHHhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHHHHI!hHHI!HHhi!i!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHHHI!hHHI!HHhi!Hi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHHI!hHHI!HHhi!HHi!!ihHHi!iHHi!!!hHHi!iHHi!!ihHHi!HHHI!hHHI!HHhi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHiHHHI!hHHI!HHhi!!iHHi!!!hHHi!iHHi!!!");
    }

    @Test
    public void test5651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5651");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.uncapitalize("HhHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!ihHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!ihHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!!hHHI!IHHI!HI!!h", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!ihHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!ihHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!!hHHI!IHHI!HI!!h" + "'", str2, "hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!ihHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!ihHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!!hHHI!IHHI!HI!!h");
    }

    @Test
    public void test5652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5652");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!ihhi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!ihhi!" + "'", str1, "Hhhi!ihhi!");
    }

    @Test
    public void test5653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5653");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhhhhi!hhhihhhi!hhhi!ihhi!!hi!!ihhhhi!ihhi!!!hhhhi!ihhi!!hhhhhhhhhhhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhihhi!hhi!hhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhhhhi!hhhihhhi!hhhi!ihhi!!hi!!ihhhhi!ihhi!!!hhhhi!ihhi!!hhhhhhhhhhhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhihhi!hhi!hhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!" + "'", str1, "Hhhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhhhhi!hhhihhhi!hhhi!ihhi!!hi!!ihhhhi!ihhi!!!hhhhi!ihhi!!hhhhhhhhhhhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhihhi!hhi!hhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
    }

    @Test
    public void test5654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5654");
        char[] charArray6 = new char[] {};
        java.lang.String str7 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray6);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.initials("", charArray6);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("hi!", charArray6);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray6);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("hHHI!hHHI!iHHI!!", charArray6);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hi!" + "'", str10, "Hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hHHI!hHHI!iHHI!!" + "'", str11, "hHHI!hHHI!iHHI!!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test5655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5655");
        char[] charArray11 = new char[] {};
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("", charArray11);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray11);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("H", charArray11);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.uncapitalize("hh", charArray11);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhI!IhhI!!", charArray11);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.initials("hHHHi!iHHi!hi!!H", charArray11);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHI!hHHI!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!!", charArray11);
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hhhI!IhhI!!" + "'", str20, "hhhI!IhhI!!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "HHHI!hHHI!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!!" + "'", str22, "HHHI!hHHI!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!!");
    }

    @Test
    public void test5656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5656");
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
        java.lang.String str22 = org.apache.commons.lang.WordUtils.initials("hi!", charArray12);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.initials("Hhhi!ihhi!hi!!", charArray12);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHHHI!IHHI!HI!!H", charArray12);
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "HHHHHI!IHHI!HI!!H" + "'", str24, "HHHHHI!IHHI!HI!!H");
    }

    @Test
    public void test5657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5657");
        char[] charArray15 = new char[] {};
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray15);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("", charArray15);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray15);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray15);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("", charArray15);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray15);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalize("H", charArray15);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.uncapitalize("hh", charArray15);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalizeFully("H", charArray15);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.initials("hi!", charArray15);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.capitalize("hhi!", charArray15);
        java.lang.String str27 = org.apache.commons.lang.WordUtils.capitalize("", charArray15);
        java.lang.String str28 = org.apache.commons.lang.WordUtils.capitalize("hHHI!IHHI!HI!!", charArray15);
        java.lang.String str29 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray15);
        java.lang.String str30 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hhhhhhi!ihhhhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!", charArray15);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] {});
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Hi!" + "'", str19, "Hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "h" + "'", str21, "h");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "H" + "'", str22, "H");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hh" + "'", str23, "hh");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "H" + "'", str24, "H");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hhi!" + "'", str26, "hhi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hHHI!IHHI!HI!!" + "'", str28, "hHHI!IHHI!HI!!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "h" + "'", str29, "h");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Hhhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hhhhhhi!ihhhhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!" + "'", str30, "Hhhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hhhhhhi!ihhhhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!");
    }

    @Test
    public void test5658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5658");
        char[] charArray9 = new char[] {};
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("hi!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("hHI!", charArray9);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!ihhi!hhhi!ihhi!!hi!!", charArray9);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("", charArray9);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("hhhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhhhhi!hhhihhhi!hhhi!ihhi!!hi!!ihhhhi!ihhi!!!hhhhi!ihhi!!hhhhhhhhhi!hhhihhhi!hhhi!ihhi!!i!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!hhhhi!ihhi!!!hhhhi!ihhi!!ihhhhi!ihhhhhhi!hhhihhhi!hhhi!ihhi!!i!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhihhhhi!hhhihhhi!hhhi!ihhi!!!ihhi!!!hhhhi!ihhi!!!", charArray9);
        java.lang.Class<?> wildcardClass19 = charArray9.getClass();
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hi!" + "'", str13, "Hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hi!" + "'", str14, "Hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hHI!" + "'", str15, "hHI!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hhhi!ihhi!hhhi!ihhi!!hi!!" + "'", str16, "Hhhi!ihhi!hhhi!ihhi!!hi!!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hhhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhhhhi!hhhihhhi!hhhi!ihhi!!hi!!ihhhhi!ihhi!!!hhhhi!ihhi!!hhhhhhhhhi!hhhihhhi!hhhi!ihhi!!i!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!hhhhi!ihhi!!!hhhhi!ihhi!!ihhhhi!ihhhhhhi!hhhihhhi!hhhi!ihhi!!i!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhihhhhi!hhhihhhi!hhhi!ihhi!!!ihhi!!!hhhhi!ihhi!!!" + "'", str18, "hhhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhhhhi!hhhihhhi!hhhi!ihhi!!hi!!ihhhhi!ihhi!!!hhhhi!ihhi!!hhhhhhhhhi!hhhihhhi!hhhi!ihhi!!i!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!hhhhi!ihhi!!!hhhhi!ihhi!!ihhhhi!ihhhhhhi!hhhihhhi!hhhi!ihhi!!i!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhihhhhi!hhhihhhi!hhhi!ihhi!!!ihhi!!!hhhhi!ihhi!!!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test5659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5659");
        char[] charArray12 = new char[] {};
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray12);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("", charArray12);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray12);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray12);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("h", charArray12);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("Hhi!", charArray12);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("", charArray12);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("HHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!hHIHI!!HI!HHI!IHI!!HI!!", charArray12);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.initials("hhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!Hhihi!!hi!hhi!ihi!!hi!!", charArray12);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalize("HHHHI!IHHIhhhi!hhhi!ihhi!!", charArray12);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihHHi!iHHi!hhhi!hhhi!hhi!hhhi!", charArray12);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalize("hhhhi!ihhi!!", charArray12);
        java.lang.Class<?> wildcardClass25 = charArray12.getClass();
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] {});
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hi!" + "'", str15, "Hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "h" + "'", str17, "h");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!hHIHI!!HI!HHI!IHI!!HI!!" + "'", str20, "HHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!hHIHI!!HI!HHI!IHI!!HI!!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "HHHHI!IHHIhhhi!hhhi!ihhi!!" + "'", str22, "HHHHI!IHHIhhhi!hhhi!ihhi!!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihHHi!iHHi!hhhi!hhhi!hhi!hhhi!" + "'", str23, "hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihHHi!iHHi!hhhi!hhhi!hhi!hhhi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hhhhi!ihhi!!" + "'", str24, "hhhhi!ihhi!!");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test5660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5660");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHHHI!HHHIhHHI!HHHI!IHHI!!", 1, 100, "hhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!IhHHI!hHHI!iHHI!!!hHHI!hHHI!iHHIhHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!iHhhi!Hhhi!Ihhi!!!Hhhi!Hhhi!IHHhhhi!ihhi!hi!!h");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHHHI!HHHIhHHI!HHHI!IHHI!!" + "'", str4, "HHHHI!HHHIhHHI!HHHI!IHHI!!");
    }

    @Test
    public void test5661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5661");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("h", (int) '4', "HHHHI!HHHIHHHI!HHHI!IHHI!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "h" + "'", str4, "h");
    }

    @Test
    public void test5662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5662");
        char[] charArray5 = new char[] {};
        java.lang.String str6 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray5);
        java.lang.String str7 = org.apache.commons.lang.WordUtils.initials("h", charArray5);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.uncapitalize("Hhi!", charArray5);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("hHHi!iHHi!HHHI!IHHI!!hi!!", charArray5);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("hHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!", charArray5);
        java.lang.Class<?> wildcardClass11 = charArray5.getClass();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hhi!" + "'", str8, "Hhi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!" + "'", str10, "hHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test5663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5663");
        char[] charArray6 = new char[] {};
        java.lang.String str7 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray6);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.initials("", charArray6);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray6);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("hhhi!Hhhi!Ihhi!!", charArray6);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhhhi!ihhi!hhi!ihi!!hi!!", charArray6);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("hhhhhi!hhhhhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hhhi!Hhhi!Ihhi!!" + "'", str10, "hhhi!Hhhi!Ihhi!!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhhhi!ihhi!hhi!ihi!!hi!!" + "'", str11, "hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhhhi!ihhi!hhi!ihi!!hi!!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hhhhhi!hhhhhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!" + "'", str12, "hhhhhi!hhhhhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
    }

    @Test
    public void test5664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5664");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhhhhi!hhhihhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhhhi!hhhihhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!" + "'", str2, "Hhhhhi!hhhihhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!");
    }

    @Test
    public void test5665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5665");
        char[] charArray7 = new char[] {};
        java.lang.String str8 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray7);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray7);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhi!ihhi!!", charArray7);
        java.lang.Class<?> wildcardClass15 = charArray7.getClass();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hhhi!ihhi!!" + "'", str14, "hhhi!ihhi!!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test5666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5666");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("Hhhhi!ihhiHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test5667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5667");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hhhi!ihhi!Hhhi!ihhi!HHI!iHI!!hi!!", (int) ' ', "", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhi!ihhi!Hhhi!ihhi!HHI!iHI!!hi!!" + "'", str4, "hhhi!ihhi!Hhhi!ihhi!HHI!iHI!!hi!!");
    }

    @Test
    public void test5668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5668");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!h" + "'", str1, "hhhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!h");
    }

    @Test
    public void test5669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5669");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhhhhi!ihhi!hi!!h", 10, (int) (byte) 0, "hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhhhi!ihhi!hhi!ihi!!hi!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhhhi!ihhhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhhhi!ihhi!hhi!ihi!!hi!!" + "'", str4, "hhhhhi!ihhhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhhhi!ihhi!hhi!ihi!!hi!!");
    }

    @Test
    public void test5670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5670");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!iHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!iHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!iHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!iHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!iHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!iHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!iHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!iHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!" + "'", str1, "hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!iHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!iHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!iHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!iHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!");
    }

    @Test
    public void test5671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5671");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("Hhhhhi!hhhhhhhhi!ihhi!!hhhhi!ihhi!!HHHHI!IHHI!hhi!Ihi!!HI!!HHHHI!IHHI!hhi!Ihi!!HI!!HHHHI!IHHI!hhi!Ihi!!HI!!IHHHI!IHHI!hhi!Ihi!!HI!!!HHHI!IHHI!hhi!Ihi!!HI!!IHHHI!IHHI!hhi!Ihi!!HI!!HHHHI!IHHI!hhi!Ihi!!HI!!HHHHI!IHHI!hhi!Ihi!!HI!!IHHHI!IHHI!hhi!Ihi!!HI!!!HHHI!IHHI!hhi!Ihi!!HI!!hHHHI!IHHI!hhi!Ihi!!HI!!iHHHI!IHHI!hhi!Ihi!!HI!!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!HHHHI!IHHI!hhi!Ihi!!HI!!HHHHI!IHHI!hhi!Ihi!!HI!!HHHHI!IHHI!hhi!Ihi!!HI!!IHHHI!IHHI!hhi!Ihi!!HI!!!HHHI!IHHI!hhi!Ihi!!HI!!IHHHI!IHHI!hhi!Ihi!!HI!!HHHHI!IHHI!hhi!Ihi!!HI!!HHHHI!IHHI!hhi!Ihi!!HI!!IHHHI!IHHI!hhi!Ihi!!HI!!!HHHI!IHHI!hhi!Ihi!!HI!!hHHHI!IHHI!hhi!Ihi!!HI!!iHHHI!IHHI!hhi!Ihi!!HI!!!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhhi!ihhHHHHI!IHHI!hhi!Ihi!!HI!!HHHHI!IHHI!hhi!Ihi!!HI!!HHHHI!IHHI!hhi!Ihi!!HI!!IHHHI!IHHI!hhi!Ihi!!HI!!!HHHI!IHHI!hhi!Ihi!!HI!!IHHHI!IHHI!hhi!Ihi!!HI!!HHHHI!IHHI!hhi!Ihi!!HI!!HHHHI!IHHI!hhi!Ihi!!HI!!IHHHI!IHHI!hhi!Ihi!!HI!!!HHHI!IHHI!hhi!Ihi!!HI!!hHHHI!IHHI!hhi!Ihi!!HI!!iHHHI!IHHI!hhi!Ihi!!HI!!!i!hhh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test5672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5672");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hHhhhi!ihhihhhhi!hhhi!ihhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhhi!ihhihhhhi!hhhi!ihhi!!" + "'", str1, "Hhhhhi!ihhihhhhi!hhhi!ihhi!!");
    }

    @Test
    public void test5673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5673");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhhi!hhhi!hhi!hhhi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhhi!hhhi!hhi!hhhi!" + "'", str1, "HHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhhi!hhhi!hhi!hhhi!");
    }

    @Test
    public void test5674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5674");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hHHHI!IHHIHHHi!iHHi!hHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHHI!IHHIHHHi!iHHi!hHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!" + "'", str1, "HHHHI!IHHIHHHi!iHHi!hHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!");
    }

    @Test
    public void test5675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5675");
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
        java.lang.String str20 = org.apache.commons.lang.WordUtils.uncapitalize("hHHI!HHHI!IHHI!!", charArray10);
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hHHI!HHHI!IHHI!!" + "'", str20, "hHHI!HHHI!IHHI!!");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test5676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5676");
        char[] charArray16 = new char[] {};
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray16);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("", charArray16);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray16);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray16);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalize("", charArray16);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray16);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalize("H", charArray16);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.uncapitalize("hh", charArray16);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.capitalizeFully("H", charArray16);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.initials("hi!", charArray16);
        java.lang.String str27 = org.apache.commons.lang.WordUtils.initials("Hhhi!ihhi!hi!!", charArray16);
        java.lang.String str28 = org.apache.commons.lang.WordUtils.uncapitalize("HhhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhIhHHI!hHHI!iHHI!!", charArray16);
        java.lang.String str29 = org.apache.commons.lang.WordUtils.capitalize("hHHHI!IHHI!HI!!H", charArray16);
        java.lang.String str30 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!", charArray16);
        java.lang.String str31 = org.apache.commons.lang.WordUtils.capitalizeFully("HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!hhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!hhHHHI!HHHIhHHI!HHHI!IHHI!!ihHHHI!HHHIhHHI!HHHI!IHHI!!!", charArray16);
        java.lang.String str32 = org.apache.commons.lang.WordUtils.capitalize("", charArray16);
        java.lang.Class<?> wildcardClass33 = charArray16.getClass();
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] {});
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hi!" + "'", str20, "Hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "h" + "'", str22, "h");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "H" + "'", str23, "H");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hh" + "'", str24, "hh");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "H" + "'", str25, "H");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "HhhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhIhHHI!hHHI!iHHI!!" + "'", str28, "HhhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhIhHHI!hHHI!iHHI!!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hHHHI!IHHI!HI!!H" + "'", str29, "hHHHI!IHHI!HI!!H");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!" + "'", str30, "Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!hhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!hhHHHI!HHHIhHHI!HHHI!IHHI!!ihHHHI!HHHIhHHI!HHHI!IHHI!!!" + "'", str31, "HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!hhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!hhHHHI!HHHIhHHI!HHHI!IHHI!!ihHHHI!HHHIhHHI!HHHI!IHHI!!!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test5677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5677");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HhhhhhhhhiHhhhi!hhhihhhhi!hhhihhhi!ihhi!hi!!!ihhi!!", 100, (int) (byte) 0, "Hhhi!ihhi!hhhi!ihhi!hhhi!ihhi!!hi!!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end 100, length 51");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5678");
        char[] charArray8 = new char[] {};
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray8);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("HH", charArray8);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!hhhi!hhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hi!" + "'", str12, "Hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "h" + "'", str14, "h");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HH" + "'", str15, "HH");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hhhi!hhhi!hhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!" + "'", str16, "Hhhi!hhhi!hhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!");
    }

    @Test
    public void test5679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5679");
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
        java.lang.String str23 = org.apache.commons.lang.WordUtils.initials("Hhhi!hhhi!hhhi!ihhi!!hhi!hhhi!hhhi!hhhi!ihhi!!hhi!hhhi!hhhi!hhhi!ihhi!!", charArray13);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.uncapitalize("HHHI!IHHI!hi!", charArray13);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHHHHI!IHHI!HHI!IHI!!HI!!", charArray13);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.capitalize("hHHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!HHI!IHI!!HI!!", charArray13);
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
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "HHHI!IHHI!hi!" + "'", str24, "HHHI!IHHI!hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHHHHI!IHHI!HHI!IHI!!HI!!" + "'", str25, "hHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHHHHI!IHHI!HHI!IHI!!HI!!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hHHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!HHI!IHI!!HI!!" + "'", str26, "hHHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!HHI!IHI!!HI!!");
    }

    @Test
    public void test5680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5680");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hHHHI!IHHI!HHHI!IHHI!!HI!!HHHHI!IHHI!HHHI!IHHI!!HI!!HHHHI!IHHI!HHHI!IHHI!!HI!!HHHHI!IHHI!HHHI!IHHI!!HI!!IHHHI!IHHI!HHHI!IHHI!!HI!!!HHHI!IHHI!HHHI!IHHI!!HI!!HHHHI!IHHI!HHHI!IHHI!!HI!!HHHHI!IHHI!HHHI!IHHI!!HI!!HHHHI!IHHI!HHHI!IHHI!!HI!!IHHHI!IHHI!HHHI!IHHI!!HI!!!HHHI!IHHI!HHHI!IHHI!!HI!!HHHHI!IHHI!HHHI!IHHI!!HI!!HHHHI!IHHI!HHHI!IHHI!!HI!!HHHHI!IHHI!HHHI!IHHI!!HI!!IHHHI!IHHI!HHHI!IHHI!!HI!!!", (int) '#', "hhhhhI!Ihhhhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHHI!IHHI!HHHI!IHHI!!HI!!HHHHI!IHHI!HHHI!IHHI!!HI!!HHHHI!IHHI!HHHI!IHHI!!HI!!HHHHI!IHHI!HHHI!IHHI!!HI!!IHHHI!IHHI!HHHI!IHHI!!HI!!!HHHI!IHHI!HHHI!IHHI!!HI!!HHHHI!IHHI!HHHI!IHHI!!HI!!HHHHI!IHHI!HHHI!IHHI!!HI!!HHHHI!IHHI!HHHI!IHHI!!HI!!IHHHI!IHHI!HHHI!IHHI!!HI!!!HHHI!IHHI!HHHI!IHHI!!HI!!HHHHI!IHHI!HHHI!IHHI!!HI!!HHHHI!IHHI!HHHI!IHHI!!HI!!HHHHI!IHHI!HHHI!IHHI!!HI!!IHHHI!IHHI!HHHI!IHHI!!HI!!!" + "'", str4, "hHHHI!IHHI!HHHI!IHHI!!HI!!HHHHI!IHHI!HHHI!IHHI!!HI!!HHHHI!IHHI!HHHI!IHHI!!HI!!HHHHI!IHHI!HHHI!IHHI!!HI!!IHHHI!IHHI!HHHI!IHHI!!HI!!!HHHI!IHHI!HHHI!IHHI!!HI!!HHHHI!IHHI!HHHI!IHHI!!HI!!HHHHI!IHHI!HHHI!IHHI!!HI!!HHHHI!IHHI!HHHI!IHHI!!HI!!IHHHI!IHHI!HHHI!IHHI!!HI!!!HHHI!IHHI!HHHI!IHHI!!HI!!HHHHI!IHHI!HHHI!IHHI!!HI!!HHHHI!IHHI!HHHI!IHHI!!HI!!HHHHI!IHHI!HHHI!IHHI!!HI!!IHHHI!IHHI!HHHI!IHHI!!HI!!!");
    }

    @Test
    public void test5681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5681");
        char[] charArray6 = new char[] {};
        java.lang.String str7 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray6);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.initials("", charArray6);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("hi!", charArray6);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("", charArray6);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("hhhhi!hhhi!ihhi!!", charArray6);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHI!IHHI!hhhI!IhhI!HI!!", charArray6);
        java.lang.Class<?> wildcardClass13 = charArray6.getClass();
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hhhhi!hhhi!ihhi!!" + "'", str11, "hhhhi!hhhi!ihhi!!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hHHI!IHHI!hhhI!IhhI!HI!!" + "'", str12, "hHHI!IHHI!hhhI!IhhI!HI!!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test5682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5682");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhhi!hhhi!hhi!hhhi!", 0, (int) '#', "hHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!HHHI!IHHI!!HI!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!HHHI!IHHI!!HI!!" + "'", str4, "HHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!HHHI!IHHI!!HI!!");
    }

    @Test
    public void test5683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5683");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hhHHI!IHHI!!HhHHI!IHHI!!hhHHI!IHHI!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!hhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!hhHHHI!HHHIhHHI!HHHI!IHHI!!ihHHHI!HHHIhHHI!HHHI!IHHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhHHI!IHHI!!HhHHI!IHHI!!hhHHI!IHHI!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!hhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!hhHHHI!HHHIhHHI!HHHI!IHHI!!ihHHHI!HHHIhHHI!HHHI!IHHI!!!" + "'", str1, "hhHHI!IHHI!!HhHHI!IHHI!!hhHHI!IHHI!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!hhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!hhHHHI!HHHIhHHI!HHHI!IHHI!!ihHHHI!HHHIhHHI!HHHI!IHHI!!!");
    }

    @Test
    public void test5684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5684");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhhi!hhhi!hhi!hhhi!", (int) (short) 10, (int) 'a', "hhhi!ihhi!hhhhi!ihhi!hi!!h");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhhi!hhhi!hhi!hhhi!" + "'", str4, "Hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhhi!hhhi!hhi!hhhi!");
    }

    @Test
    public void test5685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5685");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHHHI!HHHIHHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!H", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHHHI!HHHIHHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!H" + "'", str2, "hHHHI!HHHIHHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!H");
    }

    @Test
    public void test5686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5686");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IHhhi!hhI!!IhhhI!IhhI!!!HHhhhI!IhhI!!hHhhi!hhhI!IhhI!!HhhhI!IhhI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!hHhHHHI!IHHI!hhhI!IhhI!HI!!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IHhhi!hhI!!IhhhI!IhhI!!!HHhhhI!IhhI!!hHhhi!hhhI!IhhI!!HhhhI!IhhI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!hHhHHHI!IHHI!hhhI!IhhI!HI!!" + "'", str2, "HHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IHhhi!hhI!!IhhhI!IhhI!!!HHhhhI!IhhI!!hHhhi!hhhI!IhhI!!HhhhI!IhhI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!hHhHHHI!IHHI!hhhI!IhhI!HI!!");
    }

    @Test
    public void test5687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5687");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hhHHHI!IHHIhhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!IhhiHHHHi!iHHi!hi!!H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HhHHHI!IHHIhhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!IhhiHHHHi!iHHi!hi!!H" + "'", str1, "HhHHHI!IHHIhhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!IhhiHHHHi!iHHi!hi!!H");
    }

    @Test
    public void test5688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5688");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhi!ihhi!hhhi!ihhi!!hi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!ihhi!hhhi!ihhi!!hi!!" + "'", str1, "Hhhhi!ihhi!hhhi!ihhi!!hi!!");
    }

    @Test
    public void test5689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5689");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!hhhi!hHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!" + "'", str1, "Hhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
    }

    @Test
    public void test5690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5690");
        char[] charArray10 = new char[] {};
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("hi!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("HH", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("Hhhhi!hhhi!ihhi!!", charArray10);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!!", charArray10);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.uncapitalize("hHhhi!ihhi!hhhi!ihhi!!hi!!", charArray10);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.uncapitalize("hhhhi!ihhihhhi!hhhi!ihhi!!!hi!!h", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HI!" + "'", str14, "HI!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HH" + "'", str16, "HH");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hhhhi!hhhi!ihhi!!" + "'", str17, "Hhhhi!hhhi!ihhi!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!!" + "'", str18, "hHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hHhhi!ihhi!hhhi!ihhi!!hi!!" + "'", str19, "hHhhi!ihhi!hhhi!ihhi!!hi!!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hhhhi!ihhihhhi!hhhi!ihhi!!!hi!!h" + "'", str20, "hhhhi!ihhihhhi!hhhi!ihhi!!!hi!!h");
    }

    @Test
    public void test5691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5691");
        char[] charArray10 = new char[] { ' ' };
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("hhhi!Hhhi!Ihhi!!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("hh", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("Hhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!ihi!!hi!hhi!ihi!!hi!!", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("hHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!hHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!hHhhhi!ihhi!hi!!hHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!hHhhhi!ihhi!hi!!hHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!IHhhhi!ihhi!hi!!hHhhhi!ihhi!hi!!hHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!!", charArray10);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("hHHI!IHHI!HHI!IHI!!HI!!", charArray10);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("hhHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!h", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { ' ' });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H" + "'", str11, "H");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H" + "'", str12, "H");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hhhi!Hhhi!Ihhi!!" + "'", str13, "hhhi!Hhhi!Ihhi!!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hh" + "'", str14, "Hh");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!" + "'", str15, "Hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!hHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!hHhhhi!ihhi!hi!!hHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!hHhhhi!ihhi!hi!!hHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!IHhhhi!ihhi!hi!!hHhhhi!ihhi!hi!!hHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!!" + "'", str17, "HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!hHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!hHhhhi!ihhi!hi!!hHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!hHhhhi!ihhi!hi!!hHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!IHhhhi!ihhi!hi!!hHhhhi!ihhi!hi!!hHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HHHI!IHHI!HHI!IHI!!HI!!" + "'", str18, "HHHI!IHHI!HHI!IHI!!HI!!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Hhhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!h" + "'", str19, "Hhhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!h");
    }

    @Test
    public void test5692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5692");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HHhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!" + "'", str2, "HHhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!");
    }

    @Test
    public void test5693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5693");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHHI!IHHI!hi!", (int) (byte) 0, 10, "HhHH");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHI!IHHI!HhHH" + "'", str4, "hHHI!IHHI!HhHH");
    }

    @Test
    public void test5694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5694");
        char[] charArray8 = new char[] {};
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("hi!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("hhHHi!iHHi!HHHI!IHHI!!hi!!", charArray8);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("", charArray8);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("hhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HHhhI!IhhI!hhHHi!iHHi!HHHI!IHHI!!hi!!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hi!" + "'", str12, "Hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hhHHi!iHHi!HHHI!IHHI!!hi!!" + "'", str14, "hhHHi!iHHi!HHHI!IHHI!!hi!!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HHhhI!IhhI!hhHHi!iHHi!HHHI!IHHI!!hi!!" + "'", str16, "hhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HHhhI!IhhI!hhHHi!iHHi!HHHI!IHHI!!hi!!");
    }

    @Test
    public void test5695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5695");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!hhi!hhhhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!hhi!hhhhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!!" + "'", str1, "Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!hhi!hhhhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!!");
    }

    @Test
    public void test5696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5696");
        char[] charArray9 = new char[] {};
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("hi!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("hhHHi!iHHi!HHHI!IHHI!!hi!!", charArray9);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("", charArray9);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("", charArray9);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("HHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hi!" + "'", str13, "Hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hhHHi!iHHi!HHHI!IHHI!!hi!!" + "'", str15, "hhHHi!iHHi!HHHI!IHHI!!hi!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!!" + "'", str18, "HHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!!");
    }

    @Test
    public void test5697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5697");
        char[] charArray7 = new char[] { '4', '4' };
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalizeFully("HHi!", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("HH", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("Hhhi!hhhi!hhhi!Ihhi!!hhi!Ihhi!hhhi!hhhi!Ihhi!!hhi!Hhhi!Ihhi!!hhi!!", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("hHhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hi!" + "'", str8, "Hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Hhi!" + "'", str9, "Hhi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hH" + "'", str10, "hH");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H" + "'", str11, "H");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hhhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!" + "'", str12, "Hhhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!");
    }

    @Test
    public void test5698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5698");
        char[] charArray8 = new char[] {};
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("Hh", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("hHH", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("HHHi!iHHi!HhH", charArray8);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("HHHHHI!HHHIhHHI!HHHI!HHHI!IHHI!!HhHHi!iHHihhhhi!hhhi!ihhi!!", charArray8);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hh" + "'", str12, "Hh");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hHH" + "'", str13, "hHH");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HHHHHI!HHHIhHHI!HHHI!HHHI!IHHI!!HhHHi!iHHihhhhi!hhhi!ihhi!!" + "'", str15, "HHHHHI!HHHIhHHI!HHHI!HHHI!IHHI!!HhHHi!iHHihhhhi!hhhi!ihhi!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!" + "'", str16, "HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!");
    }

    @Test
    public void test5699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5699");
        char[] charArray14 = new char[] {};
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray14);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("", charArray14);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("hi!", charArray14);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray14);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray14);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray14);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray14);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalize("hhi!", charArray14);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalizeFully("HhHHi!iHHi!!", charArray14);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalize("hHHi!iHHi!HhhhI!IhhI!HI!!h", charArray14);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.initials("HHHI!IHHI!hhhI!IhhI!hhhi!ihhi!!HI!!", charArray14);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.initials("hhhhh", charArray14);
        java.lang.String str27 = org.apache.commons.lang.WordUtils.initials("HHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhi!ihhi!!!Hhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhi!ihhi!!!Hhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhi!ihhi!!!Hhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhi!ihhi!!!Hhhhi!hhhiHhhi!hhhi!ihhi!!!Hhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhi!ihhi!!!Hhhhi!hhhiHhhi!hhhi!ihhi!!!", charArray14);
        java.lang.String str28 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHHI!IHHIHHHI!hHHI!hHi!HHhi!", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] {});
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hi!" + "'", str18, "Hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hi!" + "'", str20, "Hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hI!" + "'", str21, "hI!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hhi!" + "'", str22, "hhi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "HhHHi!iHHi!!" + "'", str23, "HhHHi!iHHi!!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hHHi!iHHi!HhhhI!IhhI!HI!!h" + "'", str24, "hHHi!iHHi!HhhhI!IhhI!HI!!h");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "HHHHI!IHHIHHHI!hHHI!hHi!HHhi!" + "'", str28, "HHHHI!IHHIHHHI!hHHI!hHi!HHhi!");
    }

    @Test
    public void test5700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5700");
        char[] charArray2 = new char[] {};
        java.lang.String str3 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray2);
        java.lang.String str4 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhi!ihhihhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hhhi!ihhi!hhhi!ihhi!!hi!!", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] {});
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI!" + "'", str3, "HI!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhhi!ihhihhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hhhi!ihhi!hhhi!ihhi!!hi!!" + "'", str4, "Hhhhi!ihhihhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hhhi!ihhi!hhhi!ihhi!!hi!!");
    }

    @Test
    public void test5701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5701");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HHHI!HHHI!HHHI!IHHI!!HHI!IHHI!HHHI!HHHI!IHHI!!HHI!HHHI!IHHI!!HHI!!", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHHI!HHHI!HHHI!IHHI!!HHI!IHHI!HHHI!HHHI!IHHI!!HHI!HHHI!IHHI!!HHI!!" + "'", str2, "HHHI!HHHI!HHHI!IHHI!!HHI!IHHI!HHHI!HHHI!IHHI!!HHI!HHHI!IHHI!!HHI!!");
    }

    @Test
    public void test5702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5702");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhHHHI!HHHIHhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!IhHHI!hHHI!iHHI!!!hHHI!hHHI!iHHIhHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!iHhhi!Hhhi!Ihhi!!!Hhhi!Hhhi!IHHhhhi!ihhi!hi!!h", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhHHHI!HHHIHhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!IhHHI!hHHI!iHHI!!!hHHI!hHHI!iHHIhHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!iHhhi!Hhhi!Ihhi!!!Hhhi!Hhhi!IHHhhhi!ihhi!hi!!h" + "'", str2, "hhHHHI!HHHIHhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!IhHHI!hHHI!iHHI!!!hHHI!hHHI!iHHIhHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!iHhhi!Hhhi!Ihhi!!!Hhhi!Hhhi!IHHhhhi!ihhi!hi!!h");
    }

    @Test
    public void test5703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5703");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("Hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhhhi!hhhi!hhhi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHHHI!HHHI!HHHI!" + "'", str1, "hHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHHHI!HHHI!HHHI!");
    }

    @Test
    public void test5704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5704");
        char[] charArray12 = new char[] {};
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray12);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("", charArray12);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray12);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray12);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("", charArray12);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray12);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("H", charArray12);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("hH", charArray12);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalize("HH", charArray12);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalize("hhI!", charArray12);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.initials("hhhi!Hhhi!Ihhi!!", charArray12);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalizeFully("hhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!IhHHI!hHHI!iHHI!!!hHHI!hHHI!iHHIhHHHi!iHHi!hi!!", charArray12);
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hH" + "'", str20, "hH");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "HH" + "'", str21, "HH");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hhI!" + "'", str22, "hhI!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!IhHHI!hHHI!iHHI!!!hHHI!hHHI!iHHIhHHHi!iHHi!hi!!" + "'", str24, "hhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!IhHHI!hHHI!iHHI!!!hHHI!hHHI!iHHIhHHHi!iHHi!hi!!");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test5705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5705");
        char[] charArray13 = new char[] {};
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray13);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("", charArray13);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("hi!", charArray13);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray13);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("", charArray13);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("HI!", charArray13);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.uncapitalize("hH", charArray13);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray13);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalize("HHi!", charArray13);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalize("Hhhhhi!ihhhhHHHI!IHHI!HI!!H", charArray13);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.uncapitalize("hhhhi!hhhiHHhhi!!ihhi!!", charArray13);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.capitalize("HHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!hHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!hhhi!Hhhi!hhHI!", charArray13);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.initials("Hhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!", charArray13);
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "HHi!" + "'", str22, "HHi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Hhhhhi!ihhhhHHHI!IHHI!HI!!H" + "'", str23, "Hhhhhi!ihhhhHHHI!IHHI!HI!!H");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hhhhi!hhhiHHhhi!!ihhi!!" + "'", str24, "hhhhi!hhhiHHhhi!!ihhi!!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "HHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!hHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!hhhi!Hhhi!hhHI!" + "'", str25, "HHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!hHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!hhhi!Hhhi!hhHI!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test5706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5706");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhhhi!hhhi!hhhi!", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhhhi!hhhi!hhhi!" + "'", str2, "Hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhhhi!hhhi!hhhi!");
    }

    @Test
    public void test5707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5707");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("HHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhhHHHi!iHHihhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHIhHI!HHI!HHHHHHI!HHHI!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhhHHHi!iHHihhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHIhHI!HHI!HHHHHHI!HHHI!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!" + "'", str1, "HHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhhHHHi!iHHihhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHIhHI!HHI!HHHHHHI!HHHI!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!");
    }

    @Test
    public void test5708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5708");
        char[] charArray6 = new char[] { '#', '4', '4', '4' };
        java.lang.String str7 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray6);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray6);
        java.lang.Class<?> wildcardClass9 = charArray6.getClass();
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '#', '4', '4', '4' });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Hi!" + "'", str7, "Hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hi!" + "'", str8, "Hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test5709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5709");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!hhhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!hhhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!hhhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!ihhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!!hhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!ihhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!hhhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!hhhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!ihhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!!hhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!hhhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!hhhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!hhhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!ihhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!!hhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!ihhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!hhhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!hhhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!ihhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!!hhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!!" + "'", str2, "Hhhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!hhhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!hhhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!hhhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!ihhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!!hhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!ihhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!hhhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!hhhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!ihhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!!hhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!!");
    }

    @Test
    public void test5710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5710");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hHhHhHhHhHhHhHhHiHhH!HhHhHhHhHhHhHhHiHhH!HhHiHhHhHhHhHhHiHhH!HhH!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHhHhHhHhHhHhHhHiHhH!HhHhHhHhHhHhHhHiHhH!HhHiHhHhHhHhHhHiHhH!HhH!" + "'", str1, "hHhHhHhHhHhHhHhHiHhH!HhHhHhHhHhHhHhHiHhH!HhHiHhHhHhHhHhHiHhH!HhH!");
    }

    @Test
    public void test5711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5711");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhi!ihhiHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhhi!ihhihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!" + "'", str2, "Hhhhi!ihhihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!");
    }

    @Test
    public void test5712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5712");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HHHi!iHHi!HhhhI!IhhI!HI!!h", (int) (byte) 10, "Hhi!hhi!hhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhhhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhhi!hhhi!hhi!hhhi!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHHi!iHHi!Hhi!hhi!hhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhhhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhhi!hhhi!hhi!hhhi!HhhhI!IhhIHhi!hhi!hhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhhhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhhi!hhhi!hhi!hhhi!!HI!!h" + "'", str4, "HHHi!iHHi!Hhi!hhi!hhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhhhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhhi!hhhi!hhi!hhhi!HhhhI!IhhIHhi!hhi!hhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhhhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhhi!hhhi!hhi!hhhi!!HI!!h");
    }

    @Test
    public void test5713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5713");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!" + "'", str1, "HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!");
    }

    @Test
    public void test5714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5714");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.capitalize("HHHhHHhHHiHH!HHhHHhHHhHHiHH!HHhHHhHHhHHiHH!HHIHHhHHhHHiHH!HH!HHhHHhHHiHH!HHIHHhHHhHHiHH!HHhHHhHHhHHiHH!HHhHHhHHhHHiHH!HHIHHhHHhHHiHH!HH!HHhHHhHHiHH!HHHHHhHHhHHiHH!HHIHHhHHhHHiHH!HH!HHhHHhHHiHH!HH!", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHHhHHhHHiHH!HHhHHhHHhHHiHH!HHhHHhHHhHHiHH!HHIHHhHHhHHiHH!HH!HHhHHhHHiHH!HHIHHhHHhHHiHH!HHhHHhHHhHHiHH!HHhHHhHHhHHiHH!HHIHHhHHhHHiHH!HH!HHhHHhHHiHH!HHHHHhHHhHHiHH!HHIHHhHHhHHiHH!HH!HHhHHhHHiHH!HH!" + "'", str2, "HHHhHHhHHiHH!HHhHHhHHhHHiHH!HHhHHhHHhHHiHH!HHIHHhHHhHHiHH!HH!HHhHHhHHiHH!HHIHHhHHhHHiHH!HHhHHhHHhHHiHH!HHhHHhHHhHHiHH!HHIHHhHHhHHiHH!HH!HHhHHhHHiHH!HHHHHhHHhHHiHH!HHIHHhHHhHHiHH!HH!HHhHHhHHiHH!HH!");
    }

    @Test
    public void test5715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5715");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhi!hhhi!HhHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!!hHI!iHI!!ihHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!hHhhI!IhhI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!hhhi!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhhi!ihhi!!" + "'", str1, "Hhhi!hhhi!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhhi!ihhi!!");
    }

    @Test
    public void test5716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5716");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!hhhi!hHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!hhhi!hHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!" + "'", str1, "Hhhi!hhhi!hHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
    }

    @Test
    public void test5717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5717");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhhhi!ihhhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!HHhhhi!ihhi!!HHhhhi!ihhi!!HHhhhi!ihHhhhi!hhhiHhhi!hhhi!ihhi!!hi!!IHhhhi!ihhi!!!Hhhhi!ihhi!!HHhhhHhhhi!hhhiHhhi!hhhi!ihhi!!i!ihhi!!HHhhhi!ihhi!!HHhhhi!ihhi!!IHhhhi!hhhiHhhi!hhhi!ihhi!!Hhhhi!ihhi!!!Hhhhi!ihhi!!IHhhhi!ihhHhhhi!hhhiHhhi!hhhi!ihhi!!i!!HHhhhi!ihhi!!HHhhhi!ihhi!!IHhhhiHhhhi!hhhiHhhi!hhhi!ihhi!!!ihhi!!!Hhhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhhi!ihhhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!hhhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhhhhi!hhhihhhi!hhhi!ihhi!!hi!!ihhhhi!ihhi!!!hhhhi!ihhi!!hhhhhhhhhi!hhhihhhi!hhhi!ihhi!!i!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!hhhhi!ihhi!!!hhhhi!ihhi!!ihhhhi!ihhhhhhi!hhhihhhi!hhhi!ihhi!!i!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhihhhhi!hhhihhhi!hhhi!ihhi!!!ihhi!!!hhhhi!ihhi!!!" + "'", str1, "Hhhhhi!ihhhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!hhhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhhhhi!hhhihhhi!hhhi!ihhi!!hi!!ihhhhi!ihhi!!!hhhhi!ihhi!!hhhhhhhhhi!hhhihhhi!hhhi!ihhi!!i!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!hhhhi!ihhi!!!hhhhi!ihhi!!ihhhhi!ihhhhhhi!hhhihhhi!hhhi!ihhi!!i!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhihhhhi!hhhihhhi!hhhi!ihhi!!!ihhi!!!hhhhi!ihhi!!!");
    }

    @Test
    public void test5718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5718");
        char[] charArray7 = new char[] {};
        java.lang.String str8 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("hhhi!Hhhi!Ihhi!!", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!ihhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!!", charArray7);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("hHHI!IHHI!hhHHI!HHHI!Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!", charArray7);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("Hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!h", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hhhi!Hhhi!Ihhi!!" + "'", str11, "hhhi!Hhhi!Ihhi!!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!ihhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!!" + "'", str12, "Hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!ihhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hHHI!IHHI!hhHHI!HHHI!Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!" + "'", str13, "hHHI!IHHI!hhHHI!HHHI!Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test5719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5719");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hhHHHI!HHHHhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhhhi!ihhi!hhi!ihi!!hi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhhi!hhhhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhhhi!ihhi!hhi!ihi!!hi!!" + "'", str1, "Hhhhhi!hhhhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhhhi!ihhi!hhi!ihi!!hi!!");
    }

    @Test
    public void test5720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5720");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!hhHHi!iHHi!HHhhI!IhhI!hhhi!ihhi!!HI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!hhHHi!iHHi!HHhhI!IhhI!hhhi!ihhi!!HI!!" + "'", str1, "hHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!hhHHi!iHHi!HHhhI!IhhI!hhhi!ihhi!!HI!!");
    }

    @Test
    public void test5721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5721");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("HhHHHI!IHHI!!hhHHHI!IHHI!!hhHHHI!IHhHHHI!HHHIhHHI!HHHI!IHHI!!HI!!ihHHHI!IHHI!!!hHHHI!IHHI!!hhHHHhHHHHhHHHI!IHHhhHhHhHhHhHhHhHhIhHh!hhhhi!hhhi!hhi!hhhi!I!HHHIhHHI!HHHI!IHHI!!I!IHHI!!hhHHHI!IHHI!!hhHHHI!IHHI!!ihHHHI!HHHIhHHI!HHHI!IHHI!!hHHHI!IHHI!!!hHHHHhHHHI!IHHhhHhHhHhHhHhHhHhIhHh!hhhhi!hhhi!hhi!hhhi!I!IHHI!!ihHHHI!IHHhHHHI!HHHIhHHI!HHHI!IHHI!!I!!hhHHHI!IHHI!!hhHHHI!IHHI!!ihHHHIhHHHI!HHHIhHHI!HHHI!IHhHHHI!IHHhhHhHhHhHhHhHhHhIhHh!hhhhi!hhhi!hhi!hhhi!HHI!!!IHHI!!!hHHHI!IHHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHhhhi!ihhi!!HHhhhi!ihhi!!HHhhhi!ihHhhhi!hhhiHhhi!hhhi!ihhi!!hi!!IHhhhi!ihhi!!!Hhhhi!ihhi!!HHhhhHhhhhHhhhi!ihhHHhHhHhHhHhHhHhHiHhH!HHHHI!HHHI!HHI!HHHI!i!hhhiHhhi!hhhi!ihhi!!i!ihhi!!HHhhhi!ihhi!!HHhhhi!ihhi!!IHhhhi!hhhiHhhi!hhhi!ihhi!!Hhhhi!ihhi!!!HhhhhHhhhi!ihhHHhHhHhHhHhHhHhHiHhH!HHHHI!HHHI!HHI!HHHI!i!ihhi!!IHhhhi!ihhHhhhi!hhhiHhhi!hhhi!ihhi!!i!!HHhhhi!ihhi!!HHhhhi!ihhi!!IHhhhiHhhhi!hhhiHhhi!hhhi!ihHhhhi!ihhHHhHhHhHhHhHhHhHiHhH!HHHHI!HHHI!HHI!HHHI!hhi!!!ihhi!!!Hhhhi!ihhi!!!" + "'", str1, "hHhhhi!ihhi!!HHhhhi!ihhi!!HHhhhi!ihHhhhi!hhhiHhhi!hhhi!ihhi!!hi!!IHhhhi!ihhi!!!Hhhhi!ihhi!!HHhhhHhhhhHhhhi!ihhHHhHhHhHhHhHhHhHiHhH!HHHHI!HHHI!HHI!HHHI!i!hhhiHhhi!hhhi!ihhi!!i!ihhi!!HHhhhi!ihhi!!HHhhhi!ihhi!!IHhhhi!hhhiHhhi!hhhi!ihhi!!Hhhhi!ihhi!!!HhhhhHhhhi!ihhHHhHhHhHhHhHhHhHiHhH!HHHHI!HHHI!HHI!HHHI!i!ihhi!!IHhhhi!ihhHhhhi!hhhiHhhi!hhhi!ihhi!!i!!HHhhhi!ihhi!!HHhhhi!ihhi!!IHhhhiHhhhi!hhhiHhhi!hhhi!ihHhhhi!ihhHHhHhHhHhHhHhHhHiHhH!HHHHI!HHHI!HHI!HHHI!hhi!!!ihhi!!!Hhhhi!ihhi!!!");
    }

    @Test
    public void test5722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5722");
        char[] charArray8 = new char[] {};
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("hi!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("hHHI!hHHI!iHHI!!", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhi!hhhi!ihhi!!", charArray8);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("HhHHi!iHHi!HHHI!IHHI!!hi!!", charArray8);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHHI!IHHIHHHi!iHHi!hHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hi!" + "'", str12, "Hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hHHI!hHHI!iHHI!!" + "'", str13, "hHHI!hHHI!iHHI!!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hhhi!hhhi!ihhi!!" + "'", str14, "hhhi!hhhi!ihhi!!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HhHHi!iHHi!HHHI!IHHI!!hi!!" + "'", str15, "HhHHi!iHHi!HHHI!IHHI!!hi!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test5723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5723");
        char[] charArray6 = new char[] {};
        java.lang.String str7 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray6);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.initials("", charArray6);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalizeFully("Hh", charArray6);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("hH", charArray6);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("hHHI!IHHI!HI!!", charArray6);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("HHhhi!ihhi!!hHhhi!ihhi!!HHhhi!ihhi!!HHhhi!ihhi!!iHhhi!ihhi!!!Hhhi!ihhi!!iHhhi!ihhi!!HHhhi!ihhi!!HHhhi!ihhi!!iHhhi!ihhi!!!Hhhi!ihhi!!HHhhi!ihhi!!HHhhi!ihhi!!HHhhi!ihhi!!IHhhi!ihhi!!!Hhhi!ihhi!!IHhhi!ihhi!!HHhhi!ihhi!!HHhhi!ihhi!!IHhhi!ihhi!!!Hhhi!ihhi!!!Hhhi!ihhi!!hHhhi!ihhi!!iHhhi!ihhi!!!Hhhi!ihhi!!!", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Hh" + "'", str9, "Hh");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hHHI!IHHI!HI!!" + "'", str11, "hHHI!IHHI!HI!!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test5724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5724");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HHhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!H" + "'", str1, "hHhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!H");
    }

    @Test
    public void test5725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5725");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!ihhi!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!!hhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!!hhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!!hhhi!ihhi!hhi!ihi!!hi!!!hhhhi!ihhihhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!!hhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!!hhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!!hhhi!ihhi!hhi!ihi!!hi!!!!hi!!h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!ihhi!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!!hhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!!hhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!!hhhi!ihhi!hhi!ihi!!hi!!!hhhhi!ihhihhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!!hhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!!hhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!!hhhi!ihhi!hhi!ihi!!hi!!!!hi!!h" + "'", str1, "Hhhi!ihhi!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!!hhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!!hhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!!hhhi!ihhi!hhi!ihi!!hi!!!hhhhi!ihhihhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!!hhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!!hhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!!hhhi!ihhi!hhi!ihi!!hi!!!!hi!!h");
    }

    @Test
    public void test5726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5726");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("Hhhhi!hhhihhhi!ihhi!hi!!!ihhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test5727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5727");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHHHHI!IHHI!!HHHHHI!IHHI!!HHHHHI!IHHHHHI!HHHIHHHI!HHHI!IHHI!!HI!!IHHHHI!IHHI!!!HHHHI!IHHI!!HHHHHHHHHI!HHHIHHHI!HHHI!IHHI!!I!IHHI!!HHHHHI!IHHI!!HHHHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHI!IHHI!!!HHHHI!IHHI!!IHHHHI!IHHHHHHI!HHHIHHHI!HHHI!IHHI!!I!!HHHHHI!IHHI!!HHHHHI!IHHI!!IHHHHIHHHHI!HHHIHHHI!HHHI!IHHI!!!IHHI!!!HHHHI!IHHI!!!", (int) (short) 100, (int) ' ', "hHhhhi!ihhi!hi!!h");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHHHHI!IHHI!!HHHHHI!IHHI!!HHHHHI!IHHHHHI!HHHIHHHI!HHHI!IHHI!!HI!!IHHHHI!IHHI!!!HHHHI!IHHI!!HHHHHHHHHhHhhhi!ihhi!hi!!h" + "'", str4, "HHHHHI!IHHI!!HHHHHI!IHHI!!HHHHHI!IHHHHHI!HHHIHHHI!HHHI!IHHI!!HI!!IHHHHI!IHHI!!!HHHHI!IHHI!!HHHHHHHHHhHhhhi!ihhi!hi!!h");
    }

    @Test
    public void test5728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5728");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHHI!IHHI!hi!", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHHI!IHHI!hi!" + "'", str2, "hHHI!IHHI!hi!");
    }

    @Test
    public void test5729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5729");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hHHI!IHHI!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!!HHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!!HHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!!HHHI!IHHI!HHI!IHI!!HI!!!HHHHI!IHHIHHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!!HHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!!HHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!!HHHI!IHHI!HHI!IHI!!HI!!!!HI!!H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!ihhi!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!!hhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!!hhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!!hhhi!ihhi!hhi!ihi!!hi!!!hhhhi!ihhihhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!!hhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!!hhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!!hhhi!ihhi!hhi!ihi!!hi!!!!hi!!h" + "'", str1, "Hhhi!ihhi!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!!hhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!!hhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!!hhhi!ihhi!hhi!ihi!!hi!!!hhhhi!ihhihhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!!hhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!!hhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!!hhhi!ihhi!hhi!ihi!!hi!!!!hi!!h");
    }

    @Test
    public void test5730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5730");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!ihi!!hi!hhi!ihi!!hi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!ihi!!hi!hhi!ihi!!hi!!" + "'", str1, "Hhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!ihi!!hi!hhi!ihi!!hi!!");
    }

    @Test
    public void test5731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5731");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHhhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Ihhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Ihhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Ihhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Ihhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHhhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Ihhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Ihhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Ihhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Ihhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!" + "'", str2, "HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHhhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Ihhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Ihhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Ihhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Ihhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!");
    }

    @Test
    public void test5732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5732");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhhi!hhhiHHhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!", (int) (byte) 0, (int) (byte) 10, "hHhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhHHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhhi!hhhihHhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhHHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!" + "'", str4, "Hhhhi!hhhihHhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhHHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!");
    }

    @Test
    public void test5733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5733");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HHHi!iHHi!hhhi!hhhi!hhi!hhhi!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHHi!iHHi!hhhi!hhhi!hhi!hhhi!" + "'", str2, "HHHi!iHHi!hhhi!hhhi!hhi!hhhi!");
    }

    @Test
    public void test5734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5734");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("Hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhHhhi!hhhi!hhhi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHhHHI!HHHI!HHHI!" + "'", str1, "hHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHhHHI!HHHI!HHHI!");
    }

    @Test
    public void test5735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5735");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHHI!IHHI!hhhhi!ihhihhhhi!hhhi!ihhiHHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhi!ihhi!!!Hhhhi!hhhiHhhi!hhhi!ihhi!!HHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhi!ihhi!!!Hhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!HHhhhi!hhhiHhhi!hhhi!ihhi!!IHhhhi!hhhiHhhi!hhhi!ihhi!!!", (int) 'a', 0, "HHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!IHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHI!IHHI!hhhhi!ihhihhhhi!hhhi!ihhiHHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hHHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!IHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!!" + "'", str4, "hHHI!IHHI!hhhhi!ihhihhhhi!hhhi!ihhiHHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hHHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!IHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!!");
    }

    @Test
    public void test5736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5736");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHHI!IHHIHhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!ihhihhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!" + "'", str1, "Hhhhi!ihhihhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!");
    }

    @Test
    public void test5737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5737");
        char[] charArray6 = new char[] {};
        java.lang.String str7 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray6);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.initials("", charArray6);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("H", charArray6);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("", charArray6);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("hhhI!IhhI!hhhi!ihhi!!HI!!", charArray6);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHi!iHHi!hHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHHhhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!!HH!", charArray6);
        java.lang.Class<?> wildcardClass13 = charArray6.getClass();
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hhhI!IhhI!hhhi!ihhi!!HI!!" + "'", str11, "hhhI!IhhI!hhhi!ihhi!!HI!!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hHHi!iHHi!hHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHHhhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!!HH!" + "'", str12, "hHHi!iHHi!hHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHHhhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!!HH!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test5738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5738");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("", (int) (short) 0, "Hhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!Hhihi!!hi!hhi!ihi!!hi!!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test5739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5739");
        char[] charArray10 = new char[] {};
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("H", charArray10);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("HH", charArray10);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("HhHI!iHI!!HhHI!iHI!!HhHI!iHI!!HhHI!iHI!!IhHI!iHI!!!hHI!iHI!!HhHI!iHI!!HhHI!iHI!!HhHI!iHI!!IhHI!iHI!!!hHI!iHI!!IhHI!iHI!!HhHI!iHI!!HhHI!iHI!!IhHI!iHI!!!hHI!iHI!!!", charArray10);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hi!" + "'", str14, "Hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "h" + "'", str16, "h");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H" + "'", str17, "H");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HH" + "'", str18, "HH");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "HhHI!iHI!!HhHI!iHI!!HhHI!iHI!!HhHI!iHI!!IhHI!iHI!!!hHI!iHI!!HhHI!iHI!!HhHI!iHI!!HhHI!iHI!!IhHI!iHI!!!hHI!iHI!!IhHI!iHI!!HhHI!iHI!!HhHI!iHI!!IhHI!iHI!!!hHI!iHI!!!" + "'", str19, "HhHI!iHI!!HhHI!iHI!!HhHI!iHI!!HhHI!iHI!!IhHI!iHI!!!hHI!iHI!!HhHI!iHI!!HhHI!iHI!!HhHI!iHI!!IhHI!iHI!!!hHI!iHI!!IhHI!iHI!!HhHI!iHI!!HhHI!iHI!!IhHI!iHI!!!hHI!iHI!!!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test5740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5740");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HhHHi!iHHihhhhi!hhhi!ihhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhHHi!iHHihhhhi!hhhi!ihhi!!" + "'", str1, "hhHHi!iHHihhhhi!hhhi!ihhi!!");
    }

    @Test
    public void test5741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5741");
        char[] charArray11 = new char[] { '#', '4', '4', '4' };
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("HHhi!", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("hhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("HhHhhi!ihhhHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHHHHI!IHHI!HHI!IHI!!HI!!", charArray11);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("HhHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!!hHI!iHI!!ihHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!!hHI!iHI!!hhHI!iHI!!ihHI!iHI!!!hHI!iHI!!!", charArray11);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '#', '4', '4', '4' });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hi!" + "'", str12, "Hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hi!" + "'", str13, "Hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hhhi!" + "'", str14, "Hhhi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!" + "'", str15, "Hhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hhhhhi!ihhhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhhhi!ihhi!hhi!ihi!!hi!!" + "'", str16, "Hhhhhi!ihhhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhhhi!ihhi!hhi!ihi!!hi!!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H" + "'", str17, "H");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test5742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5742");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("Hhhi!hhhi!HhHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!!hHI!iHI!!ihHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!!hHI!iHI!!hhHI!iHI!!ihHI!iHI!!!hHI!iHI!!!", (int) (short) 100, "hHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHIhHhhI!IhhI!!HHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!iHhhI!IhhI!!!HhhI!IhhI!!iHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!iHhhI!IhhI!!!HhhI!IhhI!!!HhhI!IhhI!!HHhhI!IhhI!!HHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!iHhhI!IhhI!!!HhhI!IhhI!!iHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!iHhhI!IhhI!!!HhhI!IhhI!!!HhhI!IhhI!!HHhhI!IhhI!!HHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!iHhhI!IhhI!!!HhhI!IhhI!!iHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!iHhhI!IhhI!!!HhhI!IhhI!!!HhhI!IhhI!!IHhhI!IhhI!!HHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!iHhhI!IhhI!!!HhhI!IhhI!!iHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!iHhhI!IhhI!!!HhhI!IhhI!!!HhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!HHhhI!IhhI!!IHhhI!IhhI!!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhi!hhhi!HhHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!!hHI!iHI!!ihHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!!hHI!iHI!!hhHI!iHI!!ihHI!iHI!!!hHI!iHI!!!" + "'", str4, "Hhhi!hhhi!HhHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!!hHI!iHI!!ihHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!!hHI!iHI!!hhHI!iHI!!ihHI!iHI!!!hHI!iHI!!!");
    }

    @Test
    public void test5743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5743");
        char[] charArray6 = new char[] {};
        java.lang.String str7 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray6);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.initials("", charArray6);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalize("Hh", charArray6);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!ihhi!!", charArray6);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("hhhI!IhhI!hhhi!ihhi!!HI!!", charArray6);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("hhhhh", charArray6);
        java.lang.Class<?> wildcardClass13 = charArray6.getClass();
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Hh" + "'", str9, "Hh");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hhhi!ihhi!!" + "'", str10, "Hhhi!ihhi!!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hhhI!IhhI!hhhi!ihhi!!HI!!" + "'", str11, "hhhI!IhhI!hhhi!ihhi!!HI!!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test5744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5744");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHI!HHI!HHHHHHI!HHHI!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!", (-1), (int) (short) 100, "hHhhi!ihhi!!hHhhi!ihhi!!HHhhi!ihhi!!HHhhi!ihhi!!iHhhi!ihhi!!!Hhhi!ihhi!!iHhhi!ihhi!!HHhhi!ihhi!!HHhhi!ihhi!!iHhhi!ihhi!!!Hhhi!ihhi!!HHhhi!ihhi!!HHhhi!ihhi!!HHhhi!ihhi!!IHhhi!ihhi!!!Hhhi!ihhi!!IHhhi!ihhi!!HHhhi!ihhi!!HHhhi!ihhi!!IHhhi!ihhi!!!Hhhi!ihhi!!!Hhhi!ihhi!!hHhhi!ihhi!!iHhhi!ihhi!!!Hhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHI!HHI!HHHHHHI!HHHI!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IhHhhi!ihhi!!hHhhi!ihhi!!HHhhi!ihhi!!HHhhi!ihhi!!iHhhi!ihhi!!!Hhhi!ihhi!!iHhhi!ihhi!!HHhhi!ihhi!!HHhhi!ihhi!!iHhhi!ihhi!!!Hhhi!ihhi!!HHhhi!ihhi!!HHhhi!ihhi!!HHhhi!ihhi!!IHhhi!ihhi!!!Hhhi!ihhi!!IHhhi!ihhi!!HHhhi!ihhi!!HHhhi!ihhi!!IHhhi!ihhi!!!Hhhi!ihhi!!!Hhhi!ihhi!!hHhhi!ihhi!!iHhhi!ihhi!!!Hhhi!ihhi!!!" + "'", str4, "hHI!HHI!HHHHHHI!HHHI!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IhHhhi!ihhi!!hHhhi!ihhi!!HHhhi!ihhi!!HHhhi!ihhi!!iHhhi!ihhi!!!Hhhi!ihhi!!iHhhi!ihhi!!HHhhi!ihhi!!HHhhi!ihhi!!iHhhi!ihhi!!!Hhhi!ihhi!!HHhhi!ihhi!!HHhhi!ihhi!!HHhhi!ihhi!!IHhhi!ihhi!!!Hhhi!ihhi!!IHhhi!ihhi!!HHhhi!ihhi!!HHhhi!ihhi!!IHhhi!ihhi!!!Hhhi!ihhi!!!Hhhi!ihhi!!hHhhi!ihhi!!iHhhi!ihhi!!!Hhhi!ihhi!!!");
    }

    @Test
    public void test5745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5745");
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
        java.lang.String str29 = org.apache.commons.lang.WordUtils.initials("HhHhhi!ihhhHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHHHHI!IHHI!HHI!IHI!!HI!!", charArray15);
        java.lang.String str30 = org.apache.commons.lang.WordUtils.initials("HHHI!HHHI!Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!", charArray15);
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
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test5746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5746");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!" + "'", str1, "hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!");
    }

    @Test
    public void test5747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5747");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HhhI!IhhI!Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HhhI!IhhI!Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!" + "'", str2, "HhhI!IhhI!Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!");
    }

    @Test
    public void test5748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5748");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHHI!IHHI!!", (-1), 100, "HHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!hHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!hhhi!Hhhi!hhHI!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHI!IHHI!!" + "'", str4, "hHHI!IHHI!!");
    }

    @Test
    public void test5749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5749");
        char[] charArray10 = new char[] {};
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("hi!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("hHI!", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!ihhi!hhhi!ihhi!!hi!!", charArray10);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("hHHi!iHHi!HHHI!IHHI!!hi!!", charArray10);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.uncapitalize("hHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!", charArray10);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("Hhhhhi!hhhhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhhhi!ihhi!hhi!ihi!!hi!!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hi!" + "'", str14, "Hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hi!" + "'", str15, "Hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hHI!" + "'", str16, "hHI!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hhhi!ihhi!hhhi!ihhi!!hi!!" + "'", str17, "Hhhi!ihhi!hhhi!ihhi!!hi!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!" + "'", str19, "hHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hhhhhi!hhhhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhhhi!ihhi!hhi!ihi!!hi!!" + "'", str20, "Hhhhhi!hhhhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhhhi!ihhi!hhi!ihi!!hi!!");
    }

    @Test
    public void test5750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5750");
        char[] charArray7 = new char[] {};
        java.lang.String str8 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("hi!", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("HhhI!IhhI!hHHHi!iHHi!hi!!H", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("HHhhi!hhhi!hhhi!", charArray7);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHI!IHHI!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!!HHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!!HHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!!HHHI!IHHI!HHI!IHI!!HI!!!HHHHI!IHHIHHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!!HHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!!HHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!!HHHI!IHHI!HHI!IHI!!HI!!!!HI!!H", charArray7);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("HHhhhi!ihhi!hi!!h", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HhhI!IhhI!hHHHi!iHHi!hi!!H" + "'", str11, "HhhI!IhhI!hHHHi!iHHi!hi!!H");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HHhhi!hhhi!hhhi!" + "'", str12, "HHhhi!hhhi!hhhi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hHHI!IHHI!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!!HHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!!HHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!!HHHI!IHHI!HHI!IHI!!HI!!!HHHHI!IHHIHHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!!HHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!!HHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!!HHHI!IHHI!HHI!IHI!!HI!!!!HI!!H" + "'", str13, "hHHI!IHHI!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!!HHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!!HHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!!HHHI!IHHI!HHI!IHI!!HI!!!HHHHI!IHHIHHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!!HHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!!HHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!!HHHI!IHHI!HHI!IHI!!HI!!!!HI!!H");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HHhhhi!ihhi!hi!!h" + "'", str14, "HHhhhi!ihhi!hi!!h");
    }

    @Test
    public void test5751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5751");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("Hhhi!ihhi!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test5752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5752");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("", (int) ' ', "hHHHHI!HHHI!IHHI!!HHHHHI!HHHI!IHHI!!HHHHHI!HHHI!IHHIHHI!HHI!HHHHHHI!HHHI!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test5753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5753");
        char[] charArray7 = new char[] {};
        java.lang.String str8 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("hi!", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHHI!IHHIHHHI!IHHHHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!iHHHI!hHHI!iHHIhhhhI!IhhI!HI!!h", charArray7);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("Hhhhhi!ihhhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhhhi!ihhi!hhi!ihi!!hi!!", charArray7);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("hhhi!", charArray7);
        java.lang.Class<?> wildcardClass15 = charArray7.getClass();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hI!" + "'", str11, "hI!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hhhhhi!ihhhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhhhi!ihhi!hhi!ihi!!hi!!" + "'", str13, "Hhhhhi!ihhhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhhhi!ihhi!hhi!ihi!!hi!!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test5754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5754");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("HhhhhhhhhihhhhI!IhhI!HI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HhhhhhhhhihhhhI!IhhI!HI!!" + "'", str1, "HhhhhhhhhihhhhI!IhhI!HI!!");
    }

    @Test
    public void test5755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5755");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HHhI!hHhI!hHhI!hHhI!hHhI!iHhI!!HhI!hHhI!hHhI!hHhI!hHhI!hHhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!hHhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!hHhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!hHhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!iHhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!!HhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!iHhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!hHhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!hHhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!iHhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!!HhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!hHhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!iHhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!!HhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!!", (int) (byte) -1, "hhhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhhhhi!hhhihhhi!hhhi!ihhi!!hi!!ihhhhi!ihhi!!!hhhhi!ihhi!!hhhhhh", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHhI!hHhI!hHhI!hHhI!hHhI!iHhI!!HhI!hHhI!hHhI!hHhI!hHhI!hHhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!hHhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!hHhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!hHhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!iHhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!!HhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!iHhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!hHhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!hHhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!iHhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!!HhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!hHhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!iHhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!!HhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!!" + "'", str4, "HHhI!hHhI!hHhI!hHhI!hHhI!iHhI!!HhI!hHhI!hHhI!hHhI!hHhI!hHhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!hHhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!hHhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!hHhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!iHhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!!HhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!iHhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!hHhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!hHhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!iHhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!!HhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!hHhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!iHhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!!HhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!!");
    }

    @Test
    public void test5756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5756");
        char[] charArray11 = new char[] {};
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("HhhI!IhhI!!", charArray11);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHi!iHHi!hi!!", charArray11);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray11);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.initials("hhHHi!iHHi!!", charArray11);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("hHHHI!IHHI!HHHI!IHHI!!HI!!", charArray11);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.initials("HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!hhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!hhHHHI!HHHIhHHI!HHHI!IHHI!!ihHHHI!HHHIhHHI!HHHI!IHHI!!!", charArray11);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalize("HhhI!IhhI!Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!", charArray11);
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hHHHI!IHHI!HHHI!IHHI!!HI!!" + "'", str20, "hHHHI!IHHI!HHHI!IHHI!!HI!!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "HhhI!IhhI!Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!" + "'", str22, "HhhI!IhhI!Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!");
    }

    @Test
    public void test5757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5757");
        char[] charArray7 = new char[] { '#', '4', '4', '4' };
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("HHI!", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("H", charArray7);
        java.lang.Class<?> wildcardClass11 = charArray7.getClass();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '#', '4', '4', '4' });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hi!" + "'", str8, "Hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H" + "'", str9, "H");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "h" + "'", str10, "h");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test5758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5758");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("HhHi!HhHi!HhHi!HhHi!HhHi!IhHi!!hHi!HhHi!HhHi!HhHi!HhHi!HhHi!HhHi!HhHi!HhHi!IhHi!!hHi!IhHi!HhHi!HhHi!IhHi!!hHi!!hHi!HhHi!HhHi!HhHi!HhHi!IhHi!!hHi!IhHi!HhHi!HhHi!IhHi!!hHi!!hHi!HhHi!HhHi!HhHi!HhHi!IhHi!!hHi!IhHi!HhHi!HhHi!IhHi!!hHi!!hHi!HhHi!HhHi!HhHi!HhHi!IhHi!!hHi!IhHi!HhHi!HhHi!IhHi!!hHi!!hHi!IhHi!HhHi!HhHi!HhHi!IhHi!!hHi!IhHi!HhHi!HhHi!IhHi!!hHi!!hHi!!hHi!HhHi!HhHi!HhHi!IhHi!!hHi!IhHi!HhHi!HhHi!IhHi!!hHi!!hHi!IhHi!HhHi!HhHi!HhHi!IhHi!!hHi!IhHi!HhHi!HhHi!IhHi!!hHi!!hHi!HhHi!HhHi!HhHi!HhHi!IhHi!!hHi!IhHi!HhHi!HhHi!IhHi!!hHi!!hHi!HhHi!HhHi!HhHi!HhHi!IhHi!!hHi!IhHi!HhHi!HhHi!IhHi!!hHi!!hHi!IhHi!HhHi!HhHi!HhHi!IhHi!!hHi!IhHi!HhHi!HhHi!IhHi!!hHi!!hHi!!hHi!HhHi!HhHi!HhHi!IhHi!!hHi!IhHi!HhHi!HhHi!IhHi!!hHi!!hHi!HhHi!HhHi!HhHi!HhHi!IhHi!!hHi!IhHi!HhHi!HhHi!IhHi!!hHi!!hHi!IhHi!HhHi!HhHi!HhHi!IhHi!!hHi!IhHi!HhHi!HhHi!IhHi!!hHi!!hHi!!hHi!HhHi!HhHi!HhHi!IhHi!!hHi!IhHi!HhHi!HhHi!IhHi!!hHi!!hHi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HhHi!HhHi!HhHi!HhHi!HhHi!IhHi!!hHi!HhHi!HhHi!HhHi!HhHi!HhHi!HhHi!HhHi!HhHi!IhHi!!hHi!IhHi!HhHi!HhHi!IhHi!!hHi!!hHi!HhHi!HhHi!HhHi!HhHi!IhHi!!hHi!IhHi!HhHi!HhHi!IhHi!!hHi!!hHi!HhHi!HhHi!HhHi!HhHi!IhHi!!hHi!IhHi!HhHi!HhHi!IhHi!!hHi!!hHi!HhHi!HhHi!HhHi!HhHi!IhHi!!hHi!IhHi!HhHi!HhHi!IhHi!!hHi!!hHi!IhHi!HhHi!HhHi!HhHi!IhHi!!hHi!IhHi!HhHi!HhHi!IhHi!!hHi!!hHi!!hHi!HhHi!HhHi!HhHi!IhHi!!hHi!IhHi!HhHi!HhHi!IhHi!!hHi!!hHi!IhHi!HhHi!HhHi!HhHi!IhHi!!hHi!IhHi!HhHi!HhHi!IhHi!!hHi!!hHi!HhHi!HhHi!HhHi!HhHi!IhHi!!hHi!IhHi!HhHi!HhHi!IhHi!!hHi!!hHi!HhHi!HhHi!HhHi!HhHi!IhHi!!hHi!IhHi!HhHi!HhHi!IhHi!!hHi!!hHi!IhHi!HhHi!HhHi!HhHi!IhHi!!hHi!IhHi!HhHi!HhHi!IhHi!!hHi!!hHi!!hHi!HhHi!HhHi!HhHi!IhHi!!hHi!IhHi!HhHi!HhHi!IhHi!!hHi!!hHi!HhHi!HhHi!HhHi!HhHi!IhHi!!hHi!IhHi!HhHi!HhHi!IhHi!!hHi!!hHi!IhHi!HhHi!HhHi!HhHi!IhHi!!hHi!IhHi!HhHi!HhHi!IhHi!!hHi!!hHi!!hHi!HhHi!HhHi!HhHi!IhHi!!hHi!IhHi!HhHi!HhHi!IhHi!!hHi!!hHi!!" + "'", str1, "HhHi!HhHi!HhHi!HhHi!HhHi!IhHi!!hHi!HhHi!HhHi!HhHi!HhHi!HhHi!HhHi!HhHi!HhHi!IhHi!!hHi!IhHi!HhHi!HhHi!IhHi!!hHi!!hHi!HhHi!HhHi!HhHi!HhHi!IhHi!!hHi!IhHi!HhHi!HhHi!IhHi!!hHi!!hHi!HhHi!HhHi!HhHi!HhHi!IhHi!!hHi!IhHi!HhHi!HhHi!IhHi!!hHi!!hHi!HhHi!HhHi!HhHi!HhHi!IhHi!!hHi!IhHi!HhHi!HhHi!IhHi!!hHi!!hHi!IhHi!HhHi!HhHi!HhHi!IhHi!!hHi!IhHi!HhHi!HhHi!IhHi!!hHi!!hHi!!hHi!HhHi!HhHi!HhHi!IhHi!!hHi!IhHi!HhHi!HhHi!IhHi!!hHi!!hHi!IhHi!HhHi!HhHi!HhHi!IhHi!!hHi!IhHi!HhHi!HhHi!IhHi!!hHi!!hHi!HhHi!HhHi!HhHi!HhHi!IhHi!!hHi!IhHi!HhHi!HhHi!IhHi!!hHi!!hHi!HhHi!HhHi!HhHi!HhHi!IhHi!!hHi!IhHi!HhHi!HhHi!IhHi!!hHi!!hHi!IhHi!HhHi!HhHi!HhHi!IhHi!!hHi!IhHi!HhHi!HhHi!IhHi!!hHi!!hHi!!hHi!HhHi!HhHi!HhHi!IhHi!!hHi!IhHi!HhHi!HhHi!IhHi!!hHi!!hHi!HhHi!HhHi!HhHi!HhHi!IhHi!!hHi!IhHi!HhHi!HhHi!IhHi!!hHi!!hHi!IhHi!HhHi!HhHi!HhHi!IhHi!!hHi!IhHi!HhHi!HhHi!IhHi!!hHi!!hHi!!hHi!HhHi!HhHi!HhHi!IhHi!!hHi!IhHi!HhHi!HhHi!IhHi!!hHi!!hHi!!");
    }

    @Test
    public void test5759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5759");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!ihhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!!", (int) (byte) 10, "hHHI!HHHI!HHHI!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!ihhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!!" + "'", str4, "hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!ihhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!!");
    }

    @Test
    public void test5760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5760");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!hhHHi!iHHi!HHhhI!IhhI!hhhi!ihhi!!HI!!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!hhHHi!iHHi!HHhhI!IhhI!hhhi!ihhi!!HI!!" + "'", str2, "hHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!hhHHi!iHHi!HHhhI!IhhI!hhhi!ihhi!!HI!!");
    }

    @Test
    public void test5761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5761");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHhHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHHHHI!IHHI!HHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHHHHHI!HHHI!HHHI!IHHI!!HHI!IHHI!HHHI!HHHI!IHHI!!HHI!HHHI!IHHI!!HHI!!!HH!", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhhhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihhhhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!!hh!" + "'", str2, "Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhhhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihhhhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!!hh!");
    }

    @Test
    public void test5762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5762");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("HHHHI!HHHI!HHHI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test5763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5763");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!", 0, (int) 'a', "HHHHI!IHHIHHHi!iHHi!hHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hHHHHI!IHHIHHHi!iHHi!hHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!" + "'", str4, "Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hHHHHI!IHHIHHHi!iHHi!hHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!");
    }

    @Test
    public void test5764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5764");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!H" + "'", str1, "hHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!H");
    }

    @Test
    public void test5765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5765");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHI!HHI!HHHHHHI!HHHI!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IhHhhi!ihhi!!hHhhi!ihhi!!HHhhi!ihhi!!HHhhi!ihhi!!iHhhi!ihhi!!!Hhhi!ihhi!!iHhhi!ihhi!!HHhhi!ihhi!!HHhhi!ihhi!!iHhhi!ihhi!!!Hhhi!ihhi!!HHhhi!ihhi!!HHhhi!ihhi!!HHhhi!ihhi!!IHhhi!ihhi!!!Hhhi!ihhi!!IHhhi!ihhi!!HHhhi!ihhi!!HHhhi!ihhi!!IHhhi!ihhi!!!Hhhi!ihhi!!!Hhhi!ihhi!!hHhhi!ihhi!!iHhhi!ihhi!!!Hhhi!ihhi!!!", (-1), (int) '4', "hhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!IhHHI!hHHI!iHHI!!!hHHI!hHHI!iHHIhHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!iHhhi!Hhhi!Ihhi!!!Hhhi!Hhhi!IHHhhhi!ihhi!hi!!h");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHI!HHI!HHHHHHI!HHHI!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IhhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!IhHHI!hHHI!iHHI!!!hHHI!hHHI!iHHIhHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!iHhhi!Hhhi!Ihhi!!!Hhhi!Hhhi!IHHhhhi!ihhi!hi!!h" + "'", str4, "hHI!HHI!HHHHHHI!HHHI!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IhhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!IhHHI!hHHI!iHHI!!!hHHI!hHHI!iHHIhHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!iHhhi!Hhhi!Ihhi!!!Hhhi!Hhhi!IHHhhhi!ihhi!hi!!h");
    }

    @Test
    public void test5766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5766");
        char[] charArray7 = new char[] {};
        java.lang.String str8 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("hhhi!Hhhi!Ihhi!!", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!ihhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!!", charArray7);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("hHHI!IHHI!hhHHI!HHHI!Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!", charArray7);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("hhhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!ihi!!hi!hhi!ihi!!hi!!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hhhi!Hhhi!Ihhi!!" + "'", str11, "hhhi!Hhhi!Ihhi!!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!ihhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!!" + "'", str12, "Hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!ihhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hHHI!IHHI!hhHHI!HHHI!Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!" + "'", str13, "hHHI!IHHI!hhHHI!HHHI!Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test5767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5767");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("HhhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!HhHHHI!HHHI!IHHI!!HhHHHI!HHHI!IHHI!!IhHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!HhHHHI!HHHI!IHHI!!IhHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!!" + "'", str1, "Hhhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!!");
    }

    @Test
    public void test5768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5768");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hhhi!ihhi!hHHHHI!HHHHHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!HHI!iHI!!hhHHHHI!HHHHHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!i!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHI!IHHI!Hhhhhi!hhhhhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhi!Ihi!!HHhhhhi!hhhhhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!I!!" + "'", str1, "HHHI!IHHI!Hhhhhi!hhhhhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhi!Ihi!!HHhhhhi!hhhhhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!I!!");
    }

    @Test
    public void test5769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5769");
        char[] charArray7 = new char[] { '#', ' ', '4' };
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("hH", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("HHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!h", charArray7);
        java.lang.Class<?> wildcardClass12 = charArray7.getClass();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '#', ' ', '4' });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hi!" + "'", str8, "Hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Hi!" + "'", str9, "Hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HH" + "'", str10, "HH");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!h" + "'", str11, "HHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!h");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test5770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5770");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHHHI!HHHIHHHi!iHHi!hi!!!IHHI!!", (int) (short) 1, (int) (short) 100, "HhhH");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHHHI!HHHIHHHi!iHHi!hi!!!IHHI!!" + "'", str4, "HHHHI!HHHIHHHi!iHHi!hi!!!IHHI!!");
    }

    @Test
    public void test5771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5771");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhhhhhi!hhhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhhhhhi!hhhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!" + "'", str2, "Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhhhhhi!hhhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
    }

    @Test
    public void test5772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5772");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhi!ihhihhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hhhi!ihhi!hhhi!ihhi!!hi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!ihhihhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hhhi!ihhi!hhhi!ihhi!!hi!!" + "'", str1, "Hhhhi!ihhihhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hhhi!ihhi!hhhi!ihhi!!hi!!");
    }

    @Test
    public void test5773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5773");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hhhi!ihhi!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!ihhi!hi!" + "'", str1, "Hhhi!ihhi!hi!");
    }

    @Test
    public void test5774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5774");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHi!iHHi!HHHI!IHHI!!hi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!ihhi!hhhi!ihhi!!hi!!" + "'", str1, "Hhhi!ihhi!hhhi!ihhi!!hi!!");
    }

    @Test
    public void test5775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5775");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("Hhhhi!ihhi!hhhi!ihhi!!hi!!hhhhi!ihhi!hhhi!ihhi!!hi!!hhhhi!ihhi!hhhi!ihhi!!hi!!hhhhi!ihhi!hhhi!ihhi!!hi!!ihhhi!ihhi!hhhi!ihhi!!hi!!!hhhi!ihhi!hhhi!ihhi!!hi!!hhhhi!ihhi!hhhi!ihhi!!hi!!hhhhi!ihhi!hhhi!ihhi!!hi!!hhhhi!ihhi!hhhi!ihhi!!hi!!ihhhi!ihhi!hhhi!ihhi!!hi!!!hhhi!ihhi!hhhi!ihhi!!hi!!hhhhi!ihhi!hhhi!ihhi!!hi!!hhhhi!ihhi!hhhi!ihhi!!hi!!hhhhi!ihhi!hhhi!ihhi!!hi!!ihhhi!ihhi!hhhi!ihhi!!hi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test5776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5776");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhHHHHI!IHHHHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!!HHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!!HHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!!HHHI!IHHI!HHI!IHI!!HI!!!", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhHHHHI!IHHHHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!!HHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!!HHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!!HHHI!IHHI!HHI!IHI!!HI!!!" + "'", str2, "hhHHHHI!IHHHHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!!HHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!!HHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!!HHHI!IHHI!HHI!IHI!!HI!!!");
    }

    @Test
    public void test5777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5777");
        char[] charArray6 = new char[] {};
        java.lang.String str7 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray6);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.initials("", charArray6);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray6);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("hhhhI!IhhI!HI!!h", charArray6);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("hHhHHI!IHHHhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhhhi!ihhi!hhi!ihi!!hi!!", charArray6);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("Hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hHhHHI!IHHHhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhhhi!ihhi!hhi!ihi!!hi!!" + "'", str11, "hHhHHI!IHHHhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhhhi!ihhi!hhi!ihi!!hi!!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!" + "'", str12, "Hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!");
    }

    @Test
    public void test5778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5778");
        char[] charArray11 = new char[] {};
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("hi!", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray11);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray11);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray11);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("hhi!", charArray11);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("HhHHi!iHHi!!", charArray11);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalize("hHHi!iHHi!HhhhI!IhhI!HI!!h", charArray11);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.initials("HHHI!IHHI!hhhI!IhhI!hhhi!ihhi!!HI!!", charArray11);
        java.lang.Class<?> wildcardClass23 = charArray11.getClass();
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] {});
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hi!" + "'", str15, "Hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hi!" + "'", str17, "Hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hI!" + "'", str18, "hI!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hhi!" + "'", str19, "hhi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HhHHi!iHHi!!" + "'", str20, "HhHHi!iHHi!!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hHHi!iHHi!HhhhI!IhhI!HI!!h" + "'", str21, "hHHi!iHHi!HhhhI!IhhI!HI!!h");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test5779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5779");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hHHHHI!HHHhHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test5780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5780");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHHhhhhhhhhhhhhhhhihhh!hhhhhhhhhhhhhhhihhh!hhhihhhhhhhhhhhihhh!hhh!i!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!ihHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!!", (int) 'a', 10, "HHHI!IHHI!HHHHHHHHHIHH!HHHHHHHHHHHIHhhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hHHHI!IHHI!HHHHHHHHHIHH!HHHHHHHHHHHIHhhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!" + "'", str4, "hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hHHHI!IHHI!HHHHHHHHHIHH!HHHHHHHHHHHIHhhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!");
    }

    @Test
    public void test5781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5781");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hHHI!IHHI!HI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!ihhi!hi!!" + "'", str1, "Hhhi!ihhi!hi!!");
    }

    @Test
    public void test5782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5782");
        char[] charArray8 = new char[] {};
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("hH", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("HI!", charArray8);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("HhHHHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!HHI!IHI!!HI!!", charArray8);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("HHHHHI!IHHI!HI!!H", charArray8);
        java.lang.Class<?> wildcardClass17 = charArray8.getClass();
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hH" + "'", str13, "hH");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HI!" + "'", str14, "HI!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HhHHHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!HHI!IHI!!HI!!" + "'", str15, "HhHHHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!HHI!IHI!!HI!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test5783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5783");
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
        java.lang.String str24 = org.apache.commons.lang.WordUtils.initials("hhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HihHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!H!hHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HHhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HihHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!H!hHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HIhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HihHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!H!hHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!H!", charArray12);
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
    public void test5784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5784");
        char[] charArray15 = new char[] { '#', '4', '4', '4' };
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray15);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray15);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("", charArray15);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray15);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray15);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.uncapitalize("Hhi!", charArray15);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.initials("HHHHI!HHHIHHHI!HHHI!IHHI!!", charArray15);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalize("HHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!hHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!hhhi!Hhhi!hhHI!", charArray15);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.uncapitalize("HhhH", charArray15);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHi!iHHi!HHHI!IHHI!!hi!!", charArray15);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.uncapitalize("hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!", charArray15);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { '#', '4', '4', '4' });
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hi!" + "'", str16, "Hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hi!" + "'", str17, "Hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H" + "'", str19, "H");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H" + "'", str20, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hhi!" + "'", str21, "hhi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "H" + "'", str22, "H");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "HHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!hHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!hhhi!Hhhi!hhHI!" + "'", str23, "HHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!hHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!hhhi!Hhhi!hhHI!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hhhH" + "'", str24, "hhhH");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Hhhi!ihhi!hhhi!ihhi!!hi!!" + "'", str25, "Hhhi!ihhi!hhhi!ihhi!!hi!!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!" + "'", str26, "hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!");
    }

    @Test
    public void test5785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5785");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHHI!HHHIHhHHI!hHHI!iHHI!!HhHHIHHHHHI!HHHIhHHI!HHHI!HHHI!IHHI!!HhHHi!iHHihhhhi!hhhi!ihhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!hhhihhhhi!hhhi!ihhi!!hhhhihhhhhi!hhhihhhi!hhhi!hhhi!ihhi!!hhhhi!ihhihhhhi!hhhi!ihhi!!" + "'", str1, "Hhhhi!hhhihhhhi!hhhi!ihhi!!hhhhihhhhhi!hhhihhhi!hhhi!hhhi!ihhi!!hhhhi!ihhihhhhi!hhhi!ihhi!!");
    }

    @Test
    public void test5786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5786");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!h", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!h" + "'", str2, "hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!h");
    }

    @Test
    public void test5787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5787");
        char[] charArray12 = new char[] { '#', '4', '4', '4' };
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray12);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray12);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("", charArray12);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("HHi!", charArray12);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray12);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("hhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHHI!IHHIHHHi!iHHi!hHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!", charArray12);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("hHi!", charArray12);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '#', '4', '4', '4' });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hi!" + "'", str13, "Hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hi!" + "'", str14, "Hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhhi!ihhihhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!" + "'", str18, "Hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhhi!ihhihhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "HHi!" + "'", str19, "HHi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test5788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5788");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hhhhhi!hhhHhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHHHI!HHHhHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!" + "'", str1, "HHHHHI!HHHhHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!");
    }

    @Test
    public void test5789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5789");
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
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("hhhI!IhhI!hHHHi!iHHi!hi!!H", charArray10);
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hhhI!IhhI!hHHHi!iHHi!hi!!H" + "'", str20, "hhhI!IhhI!hHHHi!iHHi!hi!!H");
    }

    @Test
    public void test5790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5790");
        char[] charArray4 = new char[] {};
        java.lang.String str5 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray4);
        java.lang.String str6 = org.apache.commons.lang.WordUtils.initials("", charArray4);
        java.lang.String str7 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray4);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhI!IhhI!hhHHi!iHHi!HHHI!IHHI!!hi!!", charArray4);
        java.lang.Class<?> wildcardClass9 = charArray4.getClass();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Hi!" + "'", str7, "Hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hhhI!IhhI!hhHHi!iHHi!HHHI!IHHI!!hi!!" + "'", str8, "hhhI!IhhI!hhHHi!iHHi!HHHI!IHHI!!hi!!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test5791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5791");
        char[] charArray7 = new char[] {};
        java.lang.String str8 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray7);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("hh", charArray7);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("HhhI!IhhI!hhhi!ihhi!!HI!!", charArray7);
        java.lang.Class<?> wildcardClass15 = charArray7.getClass();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hh" + "'", str13, "hh");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HhhI!IhhI!hhhi!ihhi!!HI!!" + "'", str14, "HhhI!IhhI!hhhi!ihhi!!HI!!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test5792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5792");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("HHHi!iHHi!Hhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhI!IhhI!hHHHI!HHHIhHHI!HHHI!HHHI!IHHI!!HHI!IHHI!HHHI!HHHI!IHHI!!HHI!HHHI!IHHI!!HHI!!" + "'", str1, "hhhI!IhhI!hHHHI!HHHIhHHI!HHHI!HHHI!IHHI!!HHI!IHHI!HHHI!HHHI!IHHI!!HHI!HHHI!IHHI!!HHI!!");
    }

    @Test
    public void test5793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5793");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HhhI!IhhI!Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihhHHHI!HHHI!HHHI!IHHI!!HHI!IHHI!HHHI!HHHI!IHHI!!HHI!HHHI!IHHI!!HHI!!!hh!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HhhI!IhhI!Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihhHHHI!HHHI!HHHI!IHHI!!HHI!IHHI!HHHI!HHHI!IHHI!!HHI!HHHI!IHHI!!HHI!!!hh!" + "'", str2, "HhhI!IhhI!Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihhHHHI!HHHI!HHHI!IHHI!!HHI!IHHI!HHHI!HHHI!IHHI!!HHI!HHHI!IHHI!!HHI!!!hh!");
    }

    @Test
    public void test5794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5794");
        char[] charArray8 = new char[] { '#', ' ', '4' };
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!hhhi!hhhi!", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("hHHi!iHHi!!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '#', ' ', '4' });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Hi!" + "'", str9, "Hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hhhi!hhhi!hhhi!" + "'", str12, "hhhi!hhhi!hhhi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "h" + "'", str13, "h");
    }

    @Test
    public void test5795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5795");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhhi!hhhi!hhhi!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhi!hhhi!hhhi!" + "'", str2, "hhhi!hhhi!hhhi!");
    }

    @Test
    public void test5796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5796");
        char[] charArray8 = new char[] { '#', ' ', '4' };
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("hH", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("HHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!h", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("HHHI!hHHI!Hhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '#', ' ', '4' });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Hi!" + "'", str9, "Hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hi!" + "'", str10, "Hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HH" + "'", str11, "HH");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!h" + "'", str12, "HHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!h");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HHHI!hHHI!Hhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!!" + "'", str13, "HHHI!hHHI!Hhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!!");
    }

    @Test
    public void test5797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5797");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHHhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!ihHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHHhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!ihHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!!" + "'", str2, "hHHhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!ihHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!!");
    }

    @Test
    public void test5798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5798");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("Hhhhi!ihhihhh", (int) '4', "HHHHHH", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhhi!ihhihhh" + "'", str4, "Hhhhi!ihhihhh");
    }

    @Test
    public void test5799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5799");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("HHhhhi!ihhihhhhi!hhhi!ihhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test5800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5800");
        char[] charArray16 = new char[] {};
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray16);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("", charArray16);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray16);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray16);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalize("", charArray16);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.uncapitalize("Hi!", charArray16);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray16);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.uncapitalize("hH", charArray16);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray16);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.uncapitalize("HH", charArray16);
        java.lang.String str27 = org.apache.commons.lang.WordUtils.uncapitalize("HH", charArray16);
        java.lang.String str28 = org.apache.commons.lang.WordUtils.capitalize("", charArray16);
        java.lang.String str29 = org.apache.commons.lang.WordUtils.capitalize("hHHI!IHHI!HHHI!IHHI!!HI!!", charArray16);
        java.lang.String str30 = org.apache.commons.lang.WordUtils.capitalize("hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhHhh", charArray16);
        java.lang.String str31 = org.apache.commons.lang.WordUtils.capitalize("HHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhhHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!!", charArray16);
        java.lang.String str32 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhi!ihhi!!hhhi!", charArray16);
        java.lang.Class<?> wildcardClass33 = charArray16.getClass();
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] {});
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hi!" + "'", str20, "Hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Hi!" + "'", str22, "Hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "HI!" + "'", str23, "HI!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hH" + "'", str24, "hH");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Hi!" + "'", str25, "Hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "HH" + "'", str26, "HH");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "HH" + "'", str27, "HH");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hHHI!IHHI!HHHI!IHHI!!HI!!" + "'", str29, "hHHI!IHHI!HHHI!IHHI!!HI!!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhHhh" + "'", str30, "hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhHhh");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "HHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhhHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!!" + "'", str31, "HHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhhHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hhhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhi!ihhi!!hhhi!" + "'", str32, "hhhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhi!ihhi!!hhhi!");
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test5801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5801");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!!", (int) (byte) 0, 0, "HhhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhIhHHI!hHHI!iHHI!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HhhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhIhHHI!hHHI!iHHI!!" + "'", str4, "HhhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhIhHHI!hHHI!iHHI!!");
    }

    @Test
    public void test5802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5802");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhi!hhhihhhi!ihhi!hi!!!ihhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhhi!hhhihhhi!ihhi!hi!!!ihhi!!" + "'", str1, "hhhhi!hhhihhhi!ihhi!hi!!!ihhi!!");
    }

    @Test
    public void test5803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5803");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("HHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!hHIHI!!HI!HHI!IHI!!HI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test5804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5804");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!hhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!HHHHI!IHHIHHHI!hHHI!iHHI!!!HI!!H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!hhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!HHHHI!IHHIHHHI!hHHI!iHHI!!!HI!!H" + "'", str1, "hhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!hhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!HHHHI!IHHIHHHI!hHHI!iHHI!!!HI!!H");
    }

    @Test
    public void test5805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5805");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhhi!hhhi!ihhi!!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhi!hhhi!ihhi!!" + "'", str2, "hhhi!hhhi!ihhi!!");
    }

    @Test
    public void test5806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5806");
        char[] charArray7 = new char[] {};
        java.lang.String str8 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("hi!", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("", charArray7);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("HH", charArray7);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("HHhhi!ihhi!hi!!HHhhi!ihhi!hi!!HHhhi!ihhi!hi!!IHhhi!ihhi!hi!!!Hhhi!ihhi!hi!!IHhhi!ihhi!hi!!HHhhi!ihhiHHHI!hHHI!hHi!HHhi!!hi!!HHhhi!ihhi!hi!!IHhhi!ihhi!hi!!!Hhhi!ihhi!hi!!HHhhi!ihhi!hi!!HHhhi!ihhi!hi!!HHhhi!ihhi!hi!!HHhhiHHHI!hHHI!hHi!HHhi!!ihhi!hi!!IHhhi!ihhi!hi!!!Hhhi!ihhi!hi!!IHhhi!ihhi!hi!!HHhhi!ihhi!hi!!HHhhi!ihhi!hi!!IHhhi!ihhi!hi!!HHHI!hHHI!hHi!HHhi!!Hhhi!ihhi!hi!!HHhhi!ihhi!hi!!IHhhi!ihhi!hi!!!Hhhi!ihhi!hi!!!Hhhi!ihhi!hi!!H", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HI!" + "'", str11, "HI!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HH" + "'", str13, "HH");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test5807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5807");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhi!hhhi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!hhhi" + "'", str1, "Hhhhi!hhhi");
    }

    @Test
    public void test5808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5808");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhhi!hhhi!hhhi!ihhi!!hhi!hhhi!hhhi!hhhi!ihhi!!hhi!hhhi!hhhi!hhhi!ihhi!!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhi!hhhi!hhhi!ihhi!!hhi!hhhi!hhhi!hhhi!ihhi!!hhi!hhhi!hhhi!hhhi!ihhi!!" + "'", str2, "Hhhi!hhhi!hhhi!ihhi!!hhi!hhhi!hhhi!hhhi!ihhi!!hhi!hhhi!hhhi!hhhi!ihhi!!");
    }

    @Test
    public void test5809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5809");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHHHHI!hHHI!HHhi!i!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHHHI!hHHI!HHhi!Hi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHHI!hHHI!HHhi!HHi!!ihHHi!iHHi!!!hHHi!iHHi!!ihHHi!HHHI!hHHI!HHhi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHiHHHI!hHHI!HHhi!!iHHi!!!hHHi!iHHi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhhhhi!hhhi!hhhi!i!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhhhi!hhhi!hhhi!hi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhhi!hhhi!hhhi!hhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!hhhi!hhhi!hhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhihhhi!hhhi!hhhi!!ihhi!!!hhhi!ihhi!!!" + "'", str1, "Hhhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhhhhi!hhhi!hhhi!i!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhhhi!hhhi!hhhi!hi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhhi!hhhi!hhhi!hhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!hhhi!hhhi!hhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhihhhi!hhhi!hhhi!!ihhi!!!hhhi!ihhi!!!");
    }

    @Test
    public void test5810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5810");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("Hhi!hhi!hhhhhhi!hhhi!hhhhi!ihhi!!hhHhhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhhhhi!hhhihhhi!hhhi!ihhi!!hi!!ihhhhi!ihhi!!!hhhhi!ihhi!!hhhhhhhhhhhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhihhi!hhi!hhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHI!HHI!HHHHHHI!HHHI!HHHHI!IHHI!!HHhHHHHI!IHHI!!HHHHHI!IHHI!!HHHHHI!IHHHHHI!HHHIHHHI!HHHI!IHHI!!HI!!IHHHHI!IHHI!!!HHHHI!IHHI!!HHHHHHHHHHHHHHI!HHHI!IHHI!!HHHHHI!HHHI!IHHI!!HHHHHI!HHHI!IHHIHHI!HHI!HHHHHHI!HHHI!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!" + "'", str1, "hHI!HHI!HHHHHHI!HHHI!HHHHI!IHHI!!HHhHHHHI!IHHI!!HHHHHI!IHHI!!HHHHHI!IHHHHHI!HHHIHHHI!HHHI!IHHI!!HI!!IHHHHI!IHHI!!!HHHHI!IHHI!!HHHHHHHHHHHHHHI!HHHI!IHHI!!HHHHHI!HHHI!IHHI!!HHHHHI!HHHI!IHHIHHI!HHI!HHHHHHI!HHHI!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!");
    }

    @Test
    public void test5811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5811");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("HhHHHI!IHHI!!hhHHHI!IHHI!!hhHHHI!IHhHHHI!HHHIhHHI!HHHI!IHHI!!HI!!ihHHHI!IHHI!!!hHHHI!IHHI!!hhHHHhHHHI!HHHIhHHI!HHHI!IHHI!!I!IHHI!!hhHHHI!IHHI!!hhHHHI!IHHI!!ihHHHI!HHHIhHHI!HHHI!IHHI!!hHHHI!IHHI!!!hHHHI!IHHI!!ihHHHI!IHHhHHHI!HHHIhHHI!HHHI!IHHI!!I!!hhHHHI!IHHI!!hhHHHI!IHHI!!ihHHHIhHHHI!HHHIhHHI!HHHI!IHHI!!!IHHI!!!hHHHI!IHHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HhHHHI!IHHI!!hhHHHI!IHHI!!hhHHHI!IHhHHHI!HHHIhHHI!HHHI!IHHI!!HI!!ihHHHI!IHHI!!!hHHHI!IHHI!!hhHHHhHHHI!HHHIhHHI!HHHI!IHHI!!I!IHHI!!hhHHHI!IHHI!!hhHHHI!IHHI!!ihHHHI!HHHIhHHI!HHHI!IHHI!!hHHHI!IHHI!!!hHHHI!IHHI!!ihHHHI!IHHhHHHI!HHHIhHHI!HHHI!IHHI!!I!!hhHHHI!IHHI!!hhHHHI!IHHI!!ihHHHIhHHHI!HHHIhHHI!HHHI!IHHI!!!IHHI!!!hHHHI!IHHI!!!" + "'", str1, "HhHHHI!IHHI!!hhHHHI!IHHI!!hhHHHI!IHhHHHI!HHHIhHHI!HHHI!IHHI!!HI!!ihHHHI!IHHI!!!hHHHI!IHHI!!hhHHHhHHHI!HHHIhHHI!HHHI!IHHI!!I!IHHI!!hhHHHI!IHHI!!hhHHHI!IHHI!!ihHHHI!HHHIhHHI!HHHI!IHHI!!hHHHI!IHHI!!!hHHHI!IHHI!!ihHHHI!IHHhHHHI!HHHIhHHI!HHHI!IHHI!!I!!hhHHHI!IHHI!!hhHHHI!IHHI!!ihHHHIhHHHI!HHHIhHHI!HHHI!IHHI!!!IHHI!!!hHHHI!IHHI!!!");
    }

    @Test
    public void test5812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5812");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hhhhi!ihhihhhi!hhhi!ihhi!!!hi!!h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHHI!IHHIHHHI!HHHI!IHHI!!!HI!!H" + "'", str1, "HHHHI!IHHIHHHI!HHHI!IHHI!!!HI!!H");
    }

    @Test
    public void test5813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5813");
        char[] charArray9 = new char[] {};
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray9);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("H", charArray9);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("hH", charArray9);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("HHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!HhHHi!iHHi!HHHI!IHHI!!hi!!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hi!" + "'", str13, "Hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "h" + "'", str15, "h");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hH" + "'", str17, "hH");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test5814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5814");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HhHHHI!IHHI!!hhHHHI!IHHI!!hhHHHI!IHhHHHI!HHHIhHHI!HHHI!IHHI!!HI!!ihHHHI!IHHI!!!hHHHI!IHHI!!hhHHHhHHHI!HHHIhHHI!HHHI!IHHI!!I!IHHI!!hhHHHI!IHHI!!hhHHHI!IHHI!!ihHHHI!HHHIhHHI!HHHI!IHHI!!hHHHI!IHHI!!!hHHHI!IHHI!!ihHHHI!IHHhHHHI!HHHIhHHI!HHHI!IHHI!!I!!hhHHHI!IHHI!!hhHHHI!IHHI!!ihHHHIhHHHI!HHHIhHHI!HHHI!IHHI!!!IHHI!!!hHHHI!IHHI!!!", (int) (byte) 100, "Hhi!hhi!hhhhhhi!hhhi!hhhhi!ihhi!!hhHhhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhhhhi!hhhihhhi!hhhi!ihhi!!hi!!ihhhhi!ihhi!!!hhhhi!ihhi!!hhhhhhhhhhhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhihhi!hhi!hhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HhHHHI!IHHI!!hhHHHI!IHHI!!hhHHHI!IHhHHHI!HHHIhHHI!HHHI!IHHI!!HI!!ihHHHI!IHHI!!!hHHHI!IHHI!!hhHHHhHHHI!HHHIhHHI!HHHI!IHHI!!I!IHHI!!hhHHHI!IHHI!!hhHHHI!IHHI!!ihHHHI!HHHIhHHI!HHHI!IHHI!!hHHHI!IHHI!!!hHHHI!IHHI!!ihHHHI!IHHhHHHI!HHHIhHHI!HHHI!IHHI!!I!!hhHHHI!IHHI!!hhHHHI!IHHI!!ihHHHIhHHHI!HHHIhHHI!HHHI!IHHI!!!IHHI!!!hHHHI!IHHI!!!" + "'", str4, "HhHHHI!IHHI!!hhHHHI!IHHI!!hhHHHI!IHhHHHI!HHHIhHHI!HHHI!IHHI!!HI!!ihHHHI!IHHI!!!hHHHI!IHHI!!hhHHHhHHHI!HHHIhHHI!HHHI!IHHI!!I!IHHI!!hhHHHI!IHHI!!hhHHHI!IHHI!!ihHHHI!HHHIhHHI!HHHI!IHHI!!hHHHI!IHHI!!!hHHHI!IHHI!!ihHHHI!IHHhHHHI!HHHIhHHI!HHHI!IHHI!!I!!hhHHHI!IHHI!!hhHHHI!IHHI!!ihHHHIhHHHI!HHHIhHHI!HHHI!IHHI!!!IHHI!!!hHHHI!IHHI!!!");
    }

    @Test
    public void test5815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5815");
        char[] charArray7 = new char[] {};
        java.lang.String str8 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("hi!", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("Hhhi!ihhi!!", charArray7);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("hhhi!Hhhi!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!", charArray7);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!hhhi!HhHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!!hHI!iHI!!ihHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!!hHI!iHI!!hhHI!iHI!!ihHI!iHI!!!hHI!iHI!!!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hhhi!Hhhi!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!" + "'", str13, "hhhi!Hhhi!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hhhi!hhhi!HhHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!!hHI!iHI!!ihHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!!hHI!iHI!!hhHI!iHI!!ihHI!iHI!!!hHI!iHI!!!" + "'", str14, "Hhhi!hhhi!HhHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!!hHI!iHI!!ihHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!!hHI!iHI!!hhHI!iHI!!ihHI!iHI!!!hHI!iHI!!!");
    }

    @Test
    public void test5816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5816");
        char[] charArray9 = new char[] {};
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("HHHi!iHHi!hi!!", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("hHh", charArray9);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("hHHI!IHHI!HHHI!IHHI!!HI!!", charArray9);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!h!", charArray9);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("hhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hi!" + "'", str12, "Hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HHHi!iHHi!hi!!" + "'", str14, "HHHi!iHHi!hi!!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hHh" + "'", str15, "hHh");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hhhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!h!" + "'", str17, "Hhhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!h!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!" + "'", str18, "hhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
    }

    @Test
    public void test5817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5817");
        char[] charArray12 = new char[] { '#', '4', '4', '4' };
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray12);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray12);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("", charArray12);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray12);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!ihhi!!", charArray12);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("Hhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!ihi!!hi!hhi!ihi!!hi!!", charArray12);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.initials("HhhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!HhhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!Hhhi!ihhi!HHI!iHI!!hi!!", charArray12);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.initials("hHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!HHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!hhhhi!ihhihhhi!Hhhi!Ihhi!!!hi!!h", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '#', '4', '4', '4' });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hi!" + "'", str13, "Hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hi!" + "'", str14, "Hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hhhi!ihhi!!" + "'", str17, "Hhhi!ihhi!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H" + "'", str18, "H");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H" + "'", str19, "H");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "h" + "'", str20, "h");
    }

    @Test
    public void test5818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5818");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!Hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!HHHHHHI!IHHI!HHI!IHI!!HI!!", (int) (byte) 0, 0, "Hhhhi!hhhihHhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhHHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhhi!hhhihHhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhHHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!" + "'", str4, "Hhhhi!hhhihHhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhHHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!");
    }

    @Test
    public void test5819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5819");
        char[] charArray8 = new char[] {};
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("hi!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray8);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray8);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("hhhi!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hi!" + "'", str12, "Hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hi!" + "'", str14, "Hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hI!" + "'", str15, "hI!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hhhi!" + "'", str16, "hhhi!");
    }

    @Test
    public void test5820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5820");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HHHHI!IHHIHHHI!HHHI!IHHI!!!HI!!H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHHI!IHHIHHHI!HHHI!IHHI!!!HI!!H" + "'", str1, "hHHHI!IHHIHHHI!HHHI!IHHI!!!HI!!H");
    }

    @Test
    public void test5821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5821");
        char[] charArray8 = new char[] {};
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("h", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("Hhi!", charArray8);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("", charArray8);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("Hhhi!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hi!" + "'", str11, "Hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "h" + "'", str13, "h");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test5822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5822");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("HHHHI!IHHIhhhi!hhhi!ihhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test5823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5823");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("Hhhhi!hhhi!hhhi!", (int) '4', "HHHHI!hHHI!hHi!HHhi!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhhi!hhhi!hhhi!" + "'", str4, "Hhhhi!hhhi!hhhi!");
    }

    @Test
    public void test5824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5824");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhI!HhI!HhI!HhI!ihI!!hI!ihI!HhI!HhIHhhhhhhhhhhhhhhhihhh!hhhhhhhhhhhhhhhihhh!hhhihhhhhhhhhhhihhh!hhh!", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhI!HhI!HhI!HhI!ihI!!hI!ihI!HhI!HhIHhhhhhhhhhhhhhhhihhh!hhhhhhhhhhhhhhhihhh!hhhihhhhhhhhhhhihhh!hhh!" + "'", str2, "hhI!HhI!HhI!HhI!ihI!!hI!ihI!HhI!HhIHhhhhhhhhhhhhhhhihhh!hhhhhhhhhhhhhhhihhh!hhhihhhhhhhhhhhihhh!hhh!");
    }

    @Test
    public void test5825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5825");
        char[] charArray14 = new char[] {};
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray14);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("", charArray14);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray14);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray14);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("", charArray14);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray14);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.uncapitalize("Hi!", charArray14);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray14);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.initials("Hhhi!ihhi!hhhi!ihhi!!hi!!", charArray14);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.initials("hh", charArray14);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.capitalize("hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!iHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!!HHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!iHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!!HHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!iHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!iHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!!HHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!!", charArray14);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.initials("Hhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!", charArray14);
        java.lang.String str27 = org.apache.commons.lang.WordUtils.initials("hHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!", charArray14);
        java.lang.String str28 = org.apache.commons.lang.WordUtils.capitalize("hHHHHI!HHHIhHHI!HHHI!HHHI!IHHI!!HHI!IHHI!HHHI!HHHI!IHHI!!HHI!HHHI!IHHI!!HHI!!HHHHHI!HHHIhHHI!HHHI!HHHI!IHHI!!HHI!IHHI!HHHI!HHHI!IHHI!!HHI!HHHI!IHHI!!HHI!!HHHHHI!HHHIhHHI!HHHI!HHHI!IHHI!!HHI!IHHI!HHHI!HHHI!IHHI!!HHI!HHHI!IHHI!!HHI!!HHHHHI!HHHIhHHI!HHHI!HHHI!IHHI!!HHI!IHHI!HHHI!HHHI!IHHI!!HHI!HHHI!IHHI!!HHI!!IHHHHI!HHHIhHHI!HHHI!HHHI!IHHI!!HHI!IHHI!HHHI!HHHI!IHHI!!HHI!HHHI!IHHI!!HHI!!!HHHHI!HHHIhHHI!HHHI!HHHI!IHHI!!HHI!IHHI!HHHI!HHHI!IHHI!!HHI!HHHI!IHHI!!HHI!!IHHHHI!HHHIhHHI!HHHI!HHHI!IHHI!!HHI!IHHI!HHHI!HHHI!IHHI!!HHI!HHHI!IHHI!!HHI!!HHHHHI!HHHIhHHI!HHHI!HHHI!IHHI!!HHI!IHHI!HHHI!HHHI!IHHI!!HHI!HHHI!IHHI!!HHI!!HHHHHI!HHHIhHHI!HHHI!HHHI!IHHI!!HHI!IHHI!HHHI!HHHI!IHHI!!HHI!HHHI!IHHI!!HHI!!IHHHHI!HHHIhHHI!HHHI!HHHI!IHHI!!HHI!IHHI!HHHI!HHHI!IHHI!!HHI!HHHI!IHHI!!HHI!!!HHHHI!HHHIhHHI!HHHI!HHHI!IHHI!!HHI!IHHI!HHHI!HHHI!IHHI!!HHI!HHHI!IHHI!!HHI!!!", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] {});
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hi!" + "'", str18, "Hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Hi!" + "'", str21, "Hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!iHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!!HHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!iHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!!HHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!iHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!iHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!!HHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!!" + "'", str25, "hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!iHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!!HHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!iHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!!HHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!iHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!iHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!!HHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hHHHHI!HHHIhHHI!HHHI!HHHI!IHHI!!HHI!IHHI!HHHI!HHHI!IHHI!!HHI!HHHI!IHHI!!HHI!!HHHHHI!HHHIhHHI!HHHI!HHHI!IHHI!!HHI!IHHI!HHHI!HHHI!IHHI!!HHI!HHHI!IHHI!!HHI!!HHHHHI!HHHIhHHI!HHHI!HHHI!IHHI!!HHI!IHHI!HHHI!HHHI!IHHI!!HHI!HHHI!IHHI!!HHI!!HHHHHI!HHHIhHHI!HHHI!HHHI!IHHI!!HHI!IHHI!HHHI!HHHI!IHHI!!HHI!HHHI!IHHI!!HHI!!IHHHHI!HHHIhHHI!HHHI!HHHI!IHHI!!HHI!IHHI!HHHI!HHHI!IHHI!!HHI!HHHI!IHHI!!HHI!!!HHHHI!HHHIhHHI!HHHI!HHHI!IHHI!!HHI!IHHI!HHHI!HHHI!IHHI!!HHI!HHHI!IHHI!!HHI!!IHHHHI!HHHIhHHI!HHHI!HHHI!IHHI!!HHI!IHHI!HHHI!HHHI!IHHI!!HHI!HHHI!IHHI!!HHI!!HHHHHI!HHHIhHHI!HHHI!HHHI!IHHI!!HHI!IHHI!HHHI!HHHI!IHHI!!HHI!HHHI!IHHI!!HHI!!HHHHHI!HHHIhHHI!HHHI!HHHI!IHHI!!HHI!IHHI!HHHI!HHHI!IHHI!!HHI!HHHI!IHHI!!HHI!!IHHHHI!HHHIhHHI!HHHI!HHHI!IHHI!!HHI!IHHI!HHHI!HHHI!IHHI!!HHI!HHHI!IHHI!!HHI!!!HHHHI!HHHIhHHI!HHHI!HHHI!IHHI!!HHI!IHHI!HHHI!HHHI!IHHI!!HHI!HHHI!IHHI!!HHI!!!" + "'", str28, "hHHHHI!HHHIhHHI!HHHI!HHHI!IHHI!!HHI!IHHI!HHHI!HHHI!IHHI!!HHI!HHHI!IHHI!!HHI!!HHHHHI!HHHIhHHI!HHHI!HHHI!IHHI!!HHI!IHHI!HHHI!HHHI!IHHI!!HHI!HHHI!IHHI!!HHI!!HHHHHI!HHHIhHHI!HHHI!HHHI!IHHI!!HHI!IHHI!HHHI!HHHI!IHHI!!HHI!HHHI!IHHI!!HHI!!HHHHHI!HHHIhHHI!HHHI!HHHI!IHHI!!HHI!IHHI!HHHI!HHHI!IHHI!!HHI!HHHI!IHHI!!HHI!!IHHHHI!HHHIhHHI!HHHI!HHHI!IHHI!!HHI!IHHI!HHHI!HHHI!IHHI!!HHI!HHHI!IHHI!!HHI!!!HHHHI!HHHIhHHI!HHHI!HHHI!IHHI!!HHI!IHHI!HHHI!HHHI!IHHI!!HHI!HHHI!IHHI!!HHI!!IHHHHI!HHHIhHHI!HHHI!HHHI!IHHI!!HHI!IHHI!HHHI!HHHI!IHHI!!HHI!HHHI!IHHI!!HHI!!HHHHHI!HHHIhHHI!HHHI!HHHI!IHHI!!HHI!IHHI!HHHI!HHHI!IHHI!!HHI!HHHI!IHHI!!HHI!!HHHHHI!HHHIhHHI!HHHI!HHHI!IHHI!!HHI!IHHI!HHHI!HHHI!IHHI!!HHI!HHHI!IHHI!!HHI!!IHHHHI!HHHIhHHI!HHHI!HHHI!IHHI!!HHI!IHHI!HHHI!HHHI!IHHI!!HHI!HHHI!IHHI!!HHI!!!HHHHI!HHHIhHHI!HHHI!HHHI!IHHI!!HHI!IHHI!HHHI!HHHI!IHHI!!HHI!HHHI!IHHI!!HHI!!!");
    }

    @Test
    public void test5826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5826");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhhi!hhhiHhhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhhhhi!hhhihhhi!hhhi!ihhi!!hi!!ihhhhi!ihhi!!!hhhhi!ihhi!!hhhhhhhhhi!hhhihhhi!hhhi!ihhi!!i!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!hhhhi!ihhi!!!hhhhi!ihhi!!ihhhhi!ihhhhhhi!hhhihhhi!hhhi!ihhi!!i!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhihhhhi!hhhihhhi!hhhi!ihhi!!!ihhi!!!hhhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!hhhihhhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhhhhi!hhhihhhi!hhhi!ihhi!!hi!!ihhhhi!ihhi!!!hhhhi!ihhi!!hhhhhhhhhi!hhhihhhi!hhhi!ihhi!!i!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!hhhhi!ihhi!!!hhhhi!ihhi!!ihhhhi!ihhhhhhi!hhhihhhi!hhhi!ihhi!!i!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhihhhhi!hhhihhhi!hhhi!ihhi!!!ihhi!!!hhhhi!ihhi!!!" + "'", str1, "Hhhhi!hhhihhhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhhhhi!hhhihhhi!hhhi!ihhi!!hi!!ihhhhi!ihhi!!!hhhhi!ihhi!!hhhhhhhhhi!hhhihhhi!hhhi!ihhi!!i!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!hhhhi!ihhi!!!hhhhi!ihhi!!ihhhhi!ihhhhhhi!hhhihhhi!hhhi!ihhi!!i!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhihhhhi!hhhihhhi!hhhi!ihhi!!!ihhi!!!hhhhi!ihhi!!!");
    }

    @Test
    public void test5827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5827");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhi!hhhi!hhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!", 100, (int) (short) 10, "HHHHHI!IHHI!HI!!H");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhi!hhhi!hhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhHHHHHI!IHHI!HI!!H" + "'", str4, "Hhhi!hhhi!hhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhHHHHHI!IHHI!HI!!H");
    }

    @Test
    public void test5828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5828");
        char[] charArray9 = new char[] {};
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("Hi!", charArray9);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray9);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("HhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!", charArray9);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("HhHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!HhHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!HhHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!HhHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!IhHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!!hHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!HhHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!HhHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!HhHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!IhHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!!hHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!IhHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!HhHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!HhHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!IhHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!!hHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hi!" + "'", str13, "Hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hi!" + "'", str15, "Hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!" + "'", str17, "HhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HhHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!HhHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!HhHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!HhHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!IhHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!!hHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!HhHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!HhHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!HhHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!IhHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!!hHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!IhHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!HhHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!HhHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!IhHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!!hHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!!" + "'", str18, "HhHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!HhHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!HhHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!HhHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!IhHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!!hHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!HhHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!HhHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!HhHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!IhHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!!hHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!IhHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!HhHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!HhHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!IhHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!!hHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!!");
    }

    @Test
    public void test5829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5829");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHHHI!HHHIhhhhi!hhhihhhI!IhhI!HI!!!ihhi!!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHHHI!HHHIhhhhi!hhhihhhI!IhhI!HI!!!ihhi!!" + "'", str2, "hHHHI!HHHIhhhhi!hhhihhhI!IhhI!HI!!!ihhi!!");
    }

    @Test
    public void test5830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5830");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("HHHI!IHHI!HHI!IHI!!HI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHI!IHHI!HHI!IHI!!HI!!" + "'", str1, "HHHI!IHHI!HHI!IHI!!HI!!");
    }

    @Test
    public void test5831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5831");
        char[] charArray8 = new char[] {};
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("hH", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("hI!", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("HHi!", charArray8);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("hhI!HhI!HhI!HhI!ihI!!hI!ihI!HhI!HhI!ihI!!hI!hhI!ihI!!hI!!", charArray8);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhhi!ihhihhhi!ihhhhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!IhhiHHHHi!iHHi!hi!!H", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hi!" + "'", str11, "Hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hI!" + "'", str13, "hI!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hhI!HhI!HhI!HhI!ihI!!hI!ihI!HhI!HhI!ihI!!hI!hhI!ihI!!hI!!" + "'", str15, "hhI!HhI!HhI!HhI!ihI!!hI!ihI!HhI!HhI!ihI!!hI!hhI!ihI!!hI!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test5832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5832");
        char[] charArray11 = new char[] { '#', ' ', '4' };
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("hH", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("hhI!HhI!HhhhHHI!HHHI!Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("HHhhi!", charArray11);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("HHHh", charArray11);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhhhi!hhhi!hhhi!", charArray11);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.uncapitalize("hHHHHI!IHHHhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '#', ' ', '4' });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hi!" + "'", str12, "Hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hi!" + "'", str13, "Hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HH" + "'", str14, "HH");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hhI!HhI!HhhhHHI!HHHI!Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!" + "'", str15, "hhI!HhI!HhhhHHI!HHHI!Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HHhhi!" + "'", str16, "HHhhi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HHHh" + "'", str17, "HHHh");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhhhi!hhhi!hhhi!" + "'", str18, "hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhhhi!hhhi!hhhi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hHHHHI!IHHHhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!" + "'", str19, "hHHHHI!IHHHhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
    }

    @Test
    public void test5833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5833");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("Hhhhhi!hhhhhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test5834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5834");
        char[] charArray11 = new char[] {};
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("hi!", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray11);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray11);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("hI!", charArray11);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhi!ihhi!hi!!hhhhi!ihhi!hi!!hhhhi!ihhi!hi!!ihhhi!ihhi!hi!!!hhhi!ihhi!hi!!ihhhi!ihhi!hi!!hhhhi!ihhi!hi!!hhhhi!ihhi!hi!!ihhhi!ihhi!hi!!!hhhi!ihhi!hi!!hhhhi!ihhi!hi!!hhhhi!ihhi!hi!!hhhhi!ihhi!hi!!hhhhi!ihhi!hi!!ihhhi!ihhi!hi!!!hhhi!ihhi!hi!!ihhhi!ihhi!hi!!hhhhi!ihhi!hi!!hhhhi!ihhi!hi!!ihhhi!ihhi!hi!!!hhhi!ihhi!hi!!hhhhi!ihhi!hi!!ihhhi!ihhi!hi!!!hhhi!ihhi!hi!!!hhhi!ihhi!hi!!h", charArray11);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!H", charArray11);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalize("HhhhI!IhhIHHhhhi!ihhi!!HHhhhi!ihhi!!HHhhhi!ihHhhhi!hhhiHhhi!hhhi!ihhi!!hi!!IHhhhi!ihhi!!!Hhhhi!ihhi!!HHhhhHhhhi!hhhiHhhi!hhhi!ihhi!!i!ihhi!!HHhhhi!ihhi!!HHhhhi!ihhi!!IHhhhi!hhhiHhhi!hhhi!ihhi!!Hhhhi!ihhi!!!Hhhhi!ihhi!!IHhhhi!ihhHhhhi!hhhiHhhi!hhhi!ihhi!!i!!HHhhhi!ihhi!!HHhhhi!ihhi!!IHhhhiHhhhi!hhhiHhhi!hhhi!ihhi!!!ihhi!!!Hhhhi!ihhi!!!", charArray11);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.uncapitalize("HHhhhi!ihhi!!HHhhhi!ihhi!!HHhhhi!ihhi!!IHhhhi!ihhi!!hhHI!", charArray11);
        java.lang.Class<?> wildcardClass23 = charArray11.getClass();
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] {});
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hi!" + "'", str15, "Hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hi!" + "'", str17, "Hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hI!" + "'", str18, "hI!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Hhhhi!ihhi!hi!!hhhhi!ihhi!hi!!hhhhi!ihhi!hi!!ihhhi!ihhi!hi!!!hhhi!ihhi!hi!!ihhhi!ihhi!hi!!hhhhi!ihhi!hi!!hhhhi!ihhi!hi!!ihhhi!ihhi!hi!!!hhhi!ihhi!hi!!hhhhi!ihhi!hi!!hhhhi!ihhi!hi!!hhhhi!ihhi!hi!!hhhhi!ihhi!hi!!ihhhi!ihhi!hi!!!hhhi!ihhi!hi!!ihhhi!ihhi!hi!!hhhhi!ihhi!hi!!hhhhi!ihhi!hi!!ihhhi!ihhi!hi!!!hhhi!ihhi!hi!!hhhhi!ihhi!hi!!ihhhi!ihhi!hi!!!hhhi!ihhi!hi!!!hhhi!ihhi!hi!!h" + "'", str19, "Hhhhi!ihhi!hi!!hhhhi!ihhi!hi!!hhhhi!ihhi!hi!!ihhhi!ihhi!hi!!!hhhi!ihhi!hi!!ihhhi!ihhi!hi!!hhhhi!ihhi!hi!!hhhhi!ihhi!hi!!ihhhi!ihhi!hi!!!hhhi!ihhi!hi!!hhhhi!ihhi!hi!!hhhhi!ihhi!hi!!hhhhi!ihhi!hi!!hhhhi!ihhi!hi!!ihhhi!ihhi!hi!!!hhhi!ihhi!hi!!ihhhi!ihhi!hi!!hhhhi!ihhi!hi!!hhhhi!ihhi!hi!!ihhhi!ihhi!hi!!!hhhi!ihhi!hi!!hhhhi!ihhi!hi!!ihhhi!ihhi!hi!!!hhhi!ihhi!hi!!!hhhi!ihhi!hi!!h");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!H" + "'", str20, "Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "HhhhI!IhhIHHhhhi!ihhi!!HHhhhi!ihhi!!HHhhhi!ihHhhhi!hhhiHhhi!hhhi!ihhi!!hi!!IHhhhi!ihhi!!!Hhhhi!ihhi!!HHhhhHhhhi!hhhiHhhi!hhhi!ihhi!!i!ihhi!!HHhhhi!ihhi!!HHhhhi!ihhi!!IHhhhi!hhhiHhhi!hhhi!ihhi!!Hhhhi!ihhi!!!Hhhhi!ihhi!!IHhhhi!ihhHhhhi!hhhiHhhi!hhhi!ihhi!!i!!HHhhhi!ihhi!!HHhhhi!ihhi!!IHhhhiHhhhi!hhhiHhhi!hhhi!ihhi!!!ihhi!!!Hhhhi!ihhi!!!" + "'", str21, "HhhhI!IhhIHHhhhi!ihhi!!HHhhhi!ihhi!!HHhhhi!ihHhhhi!hhhiHhhi!hhhi!ihhi!!hi!!IHhhhi!ihhi!!!Hhhhi!ihhi!!HHhhhHhhhi!hhhiHhhi!hhhi!ihhi!!i!ihhi!!HHhhhi!ihhi!!HHhhhi!ihhi!!IHhhhi!hhhiHhhi!hhhi!ihhi!!Hhhhi!ihhi!!!Hhhhi!ihhi!!IHhhhi!ihhHhhhi!hhhiHhhi!hhhi!ihhi!!i!!HHhhhi!ihhi!!HHhhhi!ihhi!!IHhhhiHhhhi!hhhiHhhi!hhhi!ihhi!!!ihhi!!!Hhhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "HHhhhi!ihhi!!HHhhhi!ihhi!!HHhhhi!ihhi!!IHhhhi!ihhi!!hhHI!" + "'", str22, "HHhhhi!ihhi!!HHhhhi!ihhi!!HHhhhi!ihhi!!IHhhhi!ihhi!!hhHI!");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test5835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5835");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhhhhhhi!ihhhhhhhi!ihhhhhhi!ihhihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!i!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhhhhhi!ihhhhhhhi!ihhhhhhi!ihhihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!hhhhhi!ihhhhhhhi!ihhhhhhi!ihhihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!hhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test5836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5836");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHI!IHHI!HHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHHHHHHI!IHHI!hhi!Ihi!!HI!!HHHHI!IHHI!hhi!Ihi!!HI!!HHHHI!IHHI!hhi!Ihi!!HI!!IHHHI!IHHI!hhi!Ihi!!HI!!!HHHI!IHHI!hhi!Ihi!!HI!!IHHHI!IHHI!hhi!Ihi!!HI!!HHHHI!IHHI!hhi!Ihi!!HI!!HHHHI!IHHI!hhi!Ihi!!HI!!IHHHI!IHHI!hhi!Ihi!!HI!!!HHHI!IHHI!hhi!Ihi!!HI!!hHHHI!IHHI!hhi!Ihi!!HI!!iHHHI!IHHI!hhi!Ihi!!HI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!ihhi!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihhhhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!!hhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!!hhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!!" + "'", str1, "Hhhi!ihhi!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihhhhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!!hhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!!hhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!!");
    }

    @Test
    public void test5837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5837");
        char[] charArray7 = new char[] {};
        java.lang.String str8 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("Hi!", charArray7);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray7);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("hhhhh", charArray7);
        java.lang.Class<?> wildcardClass15 = charArray7.getClass();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hi!" + "'", str12, "Hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hi!" + "'", str13, "Hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test5838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5838");
        char[] charArray6 = new char[] {};
        java.lang.String str7 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray6);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.initials("", charArray6);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalizeFully("Hh", charArray6);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray6);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("HHHI!hHHI!iHHI!!", charArray6);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!ihhi!hhhhi!ihhi!hhhi!ihhi!!hi!!", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Hh" + "'", str9, "Hh");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HHHI!hHHI!iHHI!!" + "'", str11, "HHHI!hHHI!iHHI!!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hhhi!ihhi!hhhhi!ihhi!hhhi!ihhi!!hi!!" + "'", str12, "Hhhi!ihhi!hhhhi!ihhi!hhhi!ihhi!!hi!!");
    }

    @Test
    public void test5839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5839");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!hHhhhi!ihhihhhI!IhHHHi!iHHi!HhH", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!hHhhhi!ihhihhhI!IhHHHi!iHHi!HhH" + "'", str2, "HHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!hHhhhi!ihhihhhI!IhHHHi!iHHi!HhH");
    }

    @Test
    public void test5840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5840");
        char[] charArray6 = new char[] {};
        java.lang.String str7 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray6);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.uncapitalize("hI!", charArray6);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("h", charArray6);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray6);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("", charArray6);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!hhhi!hhhi!ihhi!!", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hI!" + "'", str8, "hI!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HI!" + "'", str10, "HI!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hhhi!hhhi!hhhi!ihhi!!" + "'", str12, "Hhhi!hhhi!hhhi!ihhi!!");
    }

    @Test
    public void test5841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5841");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hhhi!ihhi!hhhhi!ihhi!hhhi!ihhi!!hi!!", (int) (short) 10, "", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhi!ihhi!hhhhi!ihhi!hhhi!ihhi!!hi!!" + "'", str4, "hhhi!ihhi!hhhhi!ihhi!hhhi!ihhi!!hi!!");
    }

    @Test
    public void test5842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5842");
        char[] charArray7 = new char[] {};
        java.lang.String str8 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("hH", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("hI!", charArray7);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray7);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("HHHHI!IHHI!HI!!HHHHI!IHHI!HI!!HHHHI!IHHI!HI!!IHHHI!IHHI!HI!!!HHHI!IHHI!HI!!IHHHI!IHHI!HI!!HHHHI!IHHI!HI!!HHHHI!IHHI!HI!!IHHHI!IHHI!HI!!!HHHI!IHHI!HI!!HHHHI!IHHI!HI!!HHHHI!IHHI!HI!!HHHHI!IHHI!HI!!HHHHI!IHHI!HI!!IHHHI!IHHI!HI!!!HHHI!IHHI!HI!!IHHHI!IHHI!HI!!HHHHI!IHHI!HI!!HHHHI!IHHI!HI!!IHHHI!IHHI!HI!!!HHHI!IHHI!HI!!HHHHI!IHHI!HI!!IHHHI!IHHI!HI!!!HHHI!IHHI!HI!!!HHHI!IHHI!HI!!H", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hi!" + "'", str10, "Hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hI!" + "'", str12, "hI!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HI!" + "'", str13, "HI!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HHHHI!IHHI!HI!!HHHHI!IHHI!HI!!HHHHI!IHHI!HI!!IHHHI!IHHI!HI!!!HHHI!IHHI!HI!!IHHHI!IHHI!HI!!HHHHI!IHHI!HI!!HHHHI!IHHI!HI!!IHHHI!IHHI!HI!!!HHHI!IHHI!HI!!HHHHI!IHHI!HI!!HHHHI!IHHI!HI!!HHHHI!IHHI!HI!!HHHHI!IHHI!HI!!IHHHI!IHHI!HI!!!HHHI!IHHI!HI!!IHHHI!IHHI!HI!!HHHHI!IHHI!HI!!HHHHI!IHHI!HI!!IHHHI!IHHI!HI!!!HHHI!IHHI!HI!!HHHHI!IHHI!HI!!IHHHI!IHHI!HI!!!HHHI!IHHI!HI!!!HHHI!IHHI!HI!!H" + "'", str14, "HHHHI!IHHI!HI!!HHHHI!IHHI!HI!!HHHHI!IHHI!HI!!IHHHI!IHHI!HI!!!HHHI!IHHI!HI!!IHHHI!IHHI!HI!!HHHHI!IHHI!HI!!HHHHI!IHHI!HI!!IHHHI!IHHI!HI!!!HHHI!IHHI!HI!!HHHHI!IHHI!HI!!HHHHI!IHHI!HI!!HHHHI!IHHI!HI!!HHHHI!IHHI!HI!!IHHHI!IHHI!HI!!!HHHI!IHHI!HI!!IHHHI!IHHI!HI!!HHHHI!IHHI!HI!!HHHHI!IHHI!HI!!IHHHI!IHHI!HI!!!HHHI!IHHI!HI!!HHHHI!IHHI!HI!!IHHHI!IHHI!HI!!!HHHI!IHHI!HI!!!HHHI!IHHI!HI!!H");
    }

    @Test
    public void test5843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5843");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("HHI!HHI!HHHHHHI!HHHI!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHHHHHHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHHI!IHHIHHHI!IHHHHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!iHHHI!hHHI!iHHIhhhhI!IhhI!HI!!h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test5844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5844");
        char[] charArray10 = new char[] {};
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("hi!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("Hhhi!ihhi!!", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("HHHHI!HHHIHHHI!HHHI!IHHI!!", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("hHHi!iHHi!hHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!", charArray10);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("hhhi!hhhi!hHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HhHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!IHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!!HHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!", charArray10);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("hhHHHI!IHHI!!hhHHHI!IHHI!!hhHHHI!IHhHHHI!HHHIhHHI!HHHI!IHHI!!HI!!ihHHHI!IHHI!!!hHHHI!IHHI!!hhHHHhHHHI!HHHIhHHI!HHHI!IHHI!!I!IHHI!!hhHHHI!IHHI!!hhHHHI!IHHI!!ihHHHI!HHHIhHHI!HHHI!IHHI!!hHHHI!IHHI!!!hHHHI!IHHI!!ihHHHI!IHHhHHHI!HHHIhHHI!HHHI!IHHI!!I!!hhHHHI!IHHI!!hhHHHI!IHHI!!ihHHHIhHHHI!HHHIhHHI!HHHI!IHHI!!!IHHI!!!hHHHI!IHHI!!!", charArray10);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("HHHi!iHHi!hhhi!hhhi!hhi!hhhi!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hhhi!hhhi!hHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HhHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!IHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!!HHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!" + "'", str18, "hhhi!hhhi!hHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HhHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!IHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!!HHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hhHHHI!IHHI!!hhHHHI!IHHI!!hhHHHI!IHhHHHI!HHHIhHHI!HHHI!IHHI!!HI!!ihHHHI!IHHI!!!hHHHI!IHHI!!hhHHHhHHHI!HHHIhHHI!HHHI!IHHI!!I!IHHI!!hhHHHI!IHHI!!hhHHHI!IHHI!!ihHHHI!HHHIhHHI!HHHI!IHHI!!hHHHI!IHHI!!!hHHHI!IHHI!!ihHHHI!IHHhHHHI!HHHIhHHI!HHHI!IHHI!!I!!hhHHHI!IHHI!!hhHHHI!IHHI!!ihHHHIhHHHI!HHHIhHHI!HHHI!IHHI!!!IHHI!!!hHHHI!IHHI!!!" + "'", str19, "hhHHHI!IHHI!!hhHHHI!IHHI!!hhHHHI!IHhHHHI!HHHIhHHI!HHHI!IHHI!!HI!!ihHHHI!IHHI!!!hHHHI!IHHI!!hhHHHhHHHI!HHHIhHHI!HHHI!IHHI!!I!IHHI!!hhHHHI!IHHI!!hhHHHI!IHHI!!ihHHHI!HHHIhHHI!HHHI!IHHI!!hHHHI!IHHI!!!hHHHI!IHHI!!ihHHHI!IHHhHHHI!HHHIhHHI!HHHI!IHHI!!I!!hhHHHI!IHHI!!hhHHHI!IHHI!!ihHHHIhHHHI!HHHIhHHI!HHHI!IHHI!!!IHHI!!!hHHHI!IHHI!!!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HHHi!iHHi!hhhi!hhhi!hhi!hhhi!" + "'", str20, "HHHi!iHHi!hhhi!hhhi!hhi!hhhi!");
    }

    @Test
    public void test5845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5845");
        char[] charArray8 = new char[] {};
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("hH", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("hI!", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("HHHI!HHHI!HHHI!", charArray8);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("hHHI!IHHI!hhi!Ihi!!HI!!", charArray8);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("hHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hi!" + "'", str11, "Hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hI!" + "'", str13, "hI!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HHHI!HHHI!HHHI!" + "'", str14, "HHHI!HHHI!HHHI!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!" + "'", str16, "hHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!");
    }

    @Test
    public void test5846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5846");
        char[] charArray11 = new char[] { '#', '4', '4', '4' };
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("H", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("hhhi!ihhi!!", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("Hhhhi!ihhi!hi!!hhhhi!ihhi!hi!!hhhhi!ihhi!hi!!ihhhi!ihhi!hi!!!hhhi!ihhi!hi!!ihhhi!ihhi!hi!!hhhhi!ihhi!hi!!hhhhi!ihhi!hi!!ihhhi!ihhi!hi!!!hhhi!ihhi!hi!!hhhhi!ihhi!hi!!hhhhi!ihhi!hi!!hhhhi!ihhi!hi!!hhhhi!ihhi!hi!!ihhhi!ihhi!hi!!!hhhi!ihhi!hi!!ihhhi!ihhi!hi!!hhhhi!ihhi!hi!!hhhhi!ihhi!hi!!ihhhi!ihhi!hi!!!hhhi!ihhi!hi!!hhhhi!ihhi!hi!!ihhhi!ihhi!hi!!!hhhi!ihhi!hi!!!hhhi!ihhi!hi!!h", charArray11);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHHI!HHHIHhi!", charArray11);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("HHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhi!ihhi!!!Hhhhi!hhhiHhhi!hhhi!ihhi!!HHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhi!ihhi!!!Hhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!HHhhhi!hhhiHhhi!hhhi!ihhi!!IHhhhi!hhhiHhhi!hhhi!ihhi!!!", charArray11);
        java.lang.Class<?> wildcardClass19 = charArray11.getClass();
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '#', '4', '4', '4' });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hi!" + "'", str12, "Hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hi!" + "'", str13, "Hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "h" + "'", str14, "h");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hhhi!ihhi!!" + "'", str15, "hhhi!ihhi!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hhhhi!hhhihhi!" + "'", str17, "Hhhhi!hhhihhi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H" + "'", str18, "H");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test5847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5847");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhHHI!HHHI!hHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!!Hhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!HhHHi!iHHi!!", 10, (int) (byte) -1, "Hhhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hHhhI!IhhIHHHHI!HHHI!IHHI!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhHHI!HHHI!hHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!!Hhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!HhHHi!iHHi!!" + "'", str4, "hhHHI!HHHI!hHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!!Hhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!HhHHi!iHHi!!");
    }

    @Test
    public void test5848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5848");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHhhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhHhhi!hhhi!hhhi!", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHhhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhHhhi!hhhi!hhhi!" + "'", str2, "hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHhhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhHhhi!hhhi!hhhi!");
    }

    @Test
    public void test5849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5849");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhi!hhhi!hhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhHHHHHI!IHHI!HI!!H", (int) (byte) 10, (int) 'a', "HhHHHHI!HHHHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!HhHhhhi!ihhi!HHHi!iHHi!hi!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhi!hhhi!hhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!iHhHHHHI!HHHHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!HhHhhhi!ihhi!HHHi!iHHi!hi!!" + "'", str4, "Hhhi!hhhi!hhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!iHhHHHHI!HHHHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!HhHhhhi!ihhi!HHHi!iHHi!hi!!");
    }

    @Test
    public void test5850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5850");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!!", (int) (short) 1, (int) (byte) 1, "Hhhhi!ihhihhhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhhhhi!hhhihhhi!hhhi!ihhi!!hi!!ihhhhi!ihhi!!!hhhhi!ihhi!!hhhhhhhhhi!hhhihhhi!hhhi!ihhi!!i!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!hhhhi!ihhi!!!hhhhi!ihhi!!ihhhhi!ihhhhhhi!hhhihhhi!hhhi!ihhi!!i!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhihhhhi!hhhihhhi!hhhi!ihhi!!!ihhi!!!hhhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHhhhi!ihhihhhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhhhhi!hhhihhhi!hhhi!ihhi!!hi!!ihhhhi!ihhi!!!hhhhi!ihhi!!hhhhhhhhhi!hhhihhhi!hhhi!ihhi!!i!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!hhhhi!ihhi!!!hhhhi!ihhi!!ihhhhi!ihhhhhhi!hhhihhhi!hhhi!ihhi!!i!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhihhhhi!hhhihhhi!hhhi!ihhi!!!ihhi!!!hhhhi!ihhi!!!" + "'", str4, "HHhhhi!ihhihhhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhhhhi!hhhihhhi!hhhi!ihhi!!hi!!ihhhhi!ihhi!!!hhhhi!ihhi!!hhhhhhhhhi!hhhihhhi!hhhi!ihhi!!i!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!hhhhi!ihhi!!!hhhhi!ihhi!!ihhhhi!ihhhhhhi!hhhihhhi!hhhi!ihhi!!i!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhihhhhi!hhhihhhi!hhhi!ihhi!!!ihhi!!!hhhhi!ihhi!!!");
    }

    @Test
    public void test5851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5851");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!" + "'", str2, "HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!");
    }

    @Test
    public void test5852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5852");
        char[] charArray9 = new char[] {};
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("h", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("Hhi!", charArray9);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("", charArray9);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhi!ihhi!!!Hhhhi!hhhiHhhi!hhhi!ihhi!!HHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhi!ihhi!!!Hhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!HHhhhi!hhhiHhhi!hhhi!ihhi!!IHhhhi!hhhiHhhi!hhhi!ihhi!!!", charArray9);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("Hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hi!" + "'", str12, "Hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "h" + "'", str14, "h");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!" + "'", str18, "Hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!");
    }

    @Test
    public void test5853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5853");
        char[] charArray8 = new char[] {};
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("hi!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("Hhhi!ihhi!!", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("hH", charArray8);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("HHH", charArray8);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HHH" + "'", str15, "HHH");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test5854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5854");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!ihHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!!", (int) 'a', "Hhhhhi!hhhHHhhI!IhhIHHHHI!HHHI!IHHI!!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hHhhhhi!hhhHHhhI!IhhIHHHHI!HHHI!IHHI!!hHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!ihHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!!" + "'", str4, "hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hHhhhhi!hhhHHhhI!IhhIHHHHI!HHHI!IHHI!!hHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!ihHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!!");
    }

    @Test
    public void test5855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5855");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("HhHHi!iHHiHhH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HhHHi!iHHiHhH" + "'", str1, "HhHHi!iHHiHhH");
    }

    @Test
    public void test5856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5856");
        char[] charArray8 = new char[] {};
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("Hi!", charArray8);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray8);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("Hhh", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hi!" + "'", str12, "Hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hi!" + "'", str14, "Hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test5857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5857");
        char[] charArray16 = new char[] {};
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray16);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("", charArray16);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray16);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray16);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalize("", charArray16);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray16);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalize("H", charArray16);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.uncapitalize("hh", charArray16);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.capitalizeFully("H", charArray16);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.initials("hi!", charArray16);
        java.lang.String str27 = org.apache.commons.lang.WordUtils.capitalize("hhi!", charArray16);
        java.lang.String str28 = org.apache.commons.lang.WordUtils.capitalize("", charArray16);
        java.lang.String str29 = org.apache.commons.lang.WordUtils.capitalize("hHHI!IHHI!HI!!", charArray16);
        java.lang.String str30 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhhi!ihhi!hi!!h", charArray16);
        java.lang.String str31 = org.apache.commons.lang.WordUtils.uncapitalize("hHhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!", charArray16);
        java.lang.String str32 = org.apache.commons.lang.WordUtils.initials("Hhhhi!hhhihHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!iHhhi!Hhhi!Ihhi!!!Hhhi!Hhhi!IhhiHhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!IhHHI!hHHI!iHHI!!!hHHI!hHHI!ihhHHHI!IHHI!HI!!H", charArray16);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] {});
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hi!" + "'", str20, "Hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "h" + "'", str22, "h");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "H" + "'", str23, "H");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hh" + "'", str24, "hh");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "H" + "'", str25, "H");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hhi!" + "'", str27, "hhi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hHHI!IHHI!HI!!" + "'", str29, "hHHI!IHHI!HI!!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Hhhhhi!ihhi!hi!!h" + "'", str30, "Hhhhhi!ihhi!hi!!h");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hHhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!" + "'", str31, "hHhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
    }

    @Test
    public void test5858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5858");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!Hhhhi!ihhihi!!hi!!", (int) ' ', (int) (short) 1, "hhHhhi!hHhhHhhhi!hhhiHHHHI!HHHIHHHi!iHHi!hi!!!IHHI!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!hhHhhi!hHhhHhhhi!hhhiHHHHI!HHHIHHHi!iHHi!hi!!!IHHI!!" + "'", str4, "hHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!hhHhhi!hHhhHhhhi!hhhiHHHHI!HHHIHHHi!iHHi!hi!!!IHHI!!");
    }

    @Test
    public void test5859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5859");
        char[] charArray11 = new char[] {};
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("", charArray11);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray11);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("H", charArray11);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray11);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.uncapitalize("hhI!", charArray11);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.initials("Hhhhi!ihhihHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!!", charArray11);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.initials("HHHHHI!IHHI!HI!!H", charArray11);
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hhI!" + "'", str20, "hhI!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test5860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5860");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HHHHI!IHHI!hhi!Ihi!!HI!!HHHHI!IHHI!hhi!Ihi!!HI!!HHHHI!IHHI!hhi!Ihi!!HI!!IHHHI!IHHI!hhi!Ihi!!HI!!!HHHI!IHHI!hhi!Ihi!!HI!!IHHHI!IHHI!hhi!Ihi!!HI!!HHHHI!IHHI!hhi!Ihi!!HI!!HHHHI!IHHI!hhi!Ihi!!HI!!IHHHI!IHHI!hhi!Ihi!!HI!!!HHHI!IHHI!hhi!Ihi!!HI!!hHHHI!IHHI!hhi!Ihi!!HI!!iHHHI!IHHI!hhi!Ihi!!HI!!!", (-1), "HhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HhHHHHI!IHHHHHI!IHHI!HHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHHHI!IHHI!hhi!Ihi!!HI!!HHHHI!IHHI!hhi!Ihi!!HI!!HHHHI!IHHI!hhi!Ihi!!HI!!IHHHI!IHHI!hhi!Ihi!!HI!!!HHHI!IHHI!hhi!Ihi!!HI!!IHHHI!IHHI!hhi!Ihi!!HI!!HHHHI!IHHI!hhi!Ihi!!HI!!HHHHI!IHHI!hhi!Ihi!!HI!!IHHHI!IHHI!hhi!Ihi!!HI!!!HHHI!IHHI!hhi!Ihi!!HI!!hHHHI!IHHI!hhi!Ihi!!HI!!iHHHI!IHHI!hhi!Ihi!!HI!!!" + "'", str4, "HHHHI!IHHI!hhi!Ihi!!HI!!HHHHI!IHHI!hhi!Ihi!!HI!!HHHHI!IHHI!hhi!Ihi!!HI!!IHHHI!IHHI!hhi!Ihi!!HI!!!HHHI!IHHI!hhi!Ihi!!HI!!IHHHI!IHHI!hhi!Ihi!!HI!!HHHHI!IHHI!hhi!Ihi!!HI!!HHHHI!IHHI!hhi!Ihi!!HI!!IHHHI!IHHI!hhi!Ihi!!HI!!!HHHI!IHHI!hhi!Ihi!!HI!!hHHHI!IHHI!hhi!Ihi!!HI!!iHHHI!IHHI!hhi!Ihi!!HI!!!");
    }

    @Test
    public void test5861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5861");
        char[] charArray8 = new char[] {};
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("h", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("Hhi!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhHhh", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!hhhi!ihhi!hhhi!ihhi!hhhi!ihhi!!hi!!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhihhhi!ihhi!hhhi!ihhi!hhhi!ihhi!!hi!!!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhhhhi!ihhi!hhhi!ihhi!hhhi!ihhi!!hi!!i!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhhhi!ihhi!hhhi!ihhi!hhhi!ihhi!!hi!!hi!!ihhhi!ihhi!!!hhhi!ihhi!!!", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("Hhhhi!hhhihhhhi!!ihhi!!", charArray8);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!h!", charArray8);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("hhhhI!IhhI!HI!!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hhi!" + "'", str11, "Hhi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!hhhi!ihhi!hhhi!ihhi!hhhi!ihhi!!hi!!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhihhhi!ihhi!hhhi!ihhi!hhhi!ihhi!!hi!!!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhhhhi!ihhi!hhhi!ihhi!hhhi!ihhi!!hi!!i!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhhhi!ihhi!hhhi!ihhi!hhhi!ihhi!!hi!!hi!!ihhhi!ihhi!!!hhhi!ihhi!!!" + "'", str13, "Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!hhhi!ihhi!hhhi!ihhi!hhhi!ihhi!!hi!!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhihhhi!ihhi!hhhi!ihhi!hhhi!ihhi!!hi!!!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhhhhi!ihhi!hhhi!ihhi!hhhi!ihhi!!hi!!i!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhhhi!ihhi!hhhi!ihhi!hhhi!ihhi!!hi!!hi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hhhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!h!" + "'", str15, "Hhhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!h!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test5862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5862");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HhhI!IhhI!Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihhHHHI!HHHI!HHHI!IHHI!!HHI!IHHI!HHHI!HHHI!IHHI!!HHI!HHHI!IHHI!!HHI!!!hh!", (int) ' ', "hHHI!IHHI!HHHHHHHHHIHH!HHHHHHHHHHHIHhhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HhhI!IhhI!Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihhHHHI!HHHI!HHHI!IHHI!!HHI!IHHI!HHHI!HHHI!IHHI!!HHI!HHHI!IHHI!!HHI!!!hh!" + "'", str4, "HhhI!IhhI!Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihhHHHI!HHHI!HHHI!IHHI!!HHI!IHHI!HHHI!HHHI!IHHI!!HHI!HHHI!IHHI!!HHI!!!hh!");
    }

    @Test
    public void test5863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5863");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hHHHI!HHHIHHHi!iHHi!hi!!!IHHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!hhhihhhI!IhhI!HI!!!ihhi!!" + "'", str1, "Hhhhi!hhhihhhI!IhhI!HI!!!ihhi!!");
    }

    @Test
    public void test5864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5864");
        char[] charArray5 = new char[] {};
        java.lang.String str6 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray5);
        java.lang.String str7 = org.apache.commons.lang.WordUtils.uncapitalize("hI!", charArray5);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray5);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("Hhhi!ihhi!hhhhi!ihhi!hi!!h", charArray5);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhhi!hhhhHHI!HHHI!IHHI!!", charArray5);
        java.lang.Class<?> wildcardClass11 = charArray5.getClass();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hI!" + "'", str7, "hI!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hhhhhi!hhhhHHI!HHHI!IHHI!!" + "'", str10, "Hhhhhi!hhhhHHI!HHHI!IHHI!!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test5865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5865");
        char[] charArray9 = new char[] {};
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("Hh", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("HHHI!hHHI!iHHI!!", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhi!hhhiHhhi!hhhi!ihhi!!", charArray9);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("hhH", charArray9);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhh", charArray9);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("hhhhhhhhhhhhhhhhihhh!hhhhhhhhhhhhhhhihhh!hhhihhhhhhhhhhhihhh!hhh!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hh" + "'", str12, "Hh");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HHHI!hHHI!iHHI!!" + "'", str14, "HHHI!hHHI!iHHI!!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hhhhi!hhhiHhhi!hhhi!ihhi!!" + "'", str15, "Hhhhi!hhhiHhhi!hhhi!ihhi!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hhhh" + "'", str17, "hhhh");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test5866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5866");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhhhhhhihh!hhhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhihh!hhihhhhhhhhihh!hhhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhihh!hh!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhhhhhhihh!hhhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhihh!hhihhhhhhhhihh!hhhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhihh!hh!" + "'", str1, "Hhhhhhhhhihh!hhhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhihh!hhihhhhhhhhihh!hhhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhihh!hh!");
    }

    @Test
    public void test5867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5867");
        char[] charArray11 = new char[] {};
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("", charArray11);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("Hi!", charArray11);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray11);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.uncapitalize("hHHi!iHHi!!", charArray11);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("hhHHi!iHHiHhH", charArray11);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.initials("Hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!", charArray11);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.uncapitalize("hHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!hHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!IHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!!", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] {});
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hi!" + "'", str15, "Hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hi!" + "'", str17, "Hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HI!" + "'", str18, "HI!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hHHi!iHHi!!" + "'", str19, "hHHi!iHHi!!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hhHHi!iHHiHhH" + "'", str20, "hhHHi!iHHiHhH");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!hHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!IHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!!" + "'", str22, "hHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!hHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!IHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!!");
    }

    @Test
    public void test5868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5868");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!!", (int) '#', "", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!!" + "'", str4, "hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!!");
    }

    @Test
    public void test5869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5869");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("HHhhi!ihhi!!hHhhi!ihhi!!iHhhi!ihhi!!!Hhhi!ihhi!!hHhhi!ihhi!!hHhhi!ihhi!!iHhhi!ihhi!!!Hhhi!ihhi!!hHhhi!ihhi!!hHhhi!ihhi!!iHhhi!ihhi!!!Hhhi!ihhi!!hHhhi!ihhi!!hHhhi!ihhi!!iHhhi!ihhi!!!Hhhi!ihhi!!iHhhi!ihhi!!hHhhi!ihhi!!iHhhi!ihhi!!!Hhhi!ihhi!!!Hhhi!ihhi!!hHhhi!ihhi!!iHhhi!ihhi!!!Hhhi!ihhi!!iHhhi!ihhi!!hHhhi!ihhi!!iHhhi!ihhi!!!Hhhi!ihhi!!hHhhi!ihhi!!hHhhi!ihhi!!iHhhi!ihhi!!!Hhhi!ihhi!!hHhhi!ihhi!!hHhhi!ihhi!!iHhhi!ihhi!!!Hhhi!ihhi!!iHhhi!ihhi!!hHhhi!ihhi!!iHhhi!ihhi!!!Hhhi!ihhi!!!Hhhi!ihhi!!hHhhi!ihhi!!iHhhi!ihhi!!!Hhhi!ihhi!!hHhhi!ihhi!!hHhhi!ihhi!!iHhhi!ihhi!!!Hhhi!ihhi!!iHhhi!ihhi!!hHhhi!ihhi!!iHhhi!ihhi!!!Hhhi!ihhi!!!Hhhi!ihhi!!hHhhi!ihhi!!iHhhi!ihhi!!!Hhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHhhi!ihhi!!hHhhi!ihhi!!iHhhi!ihhi!!!Hhhi!ihhi!!hHhhi!ihhi!!hHhhi!ihhi!!iHhhi!ihhi!!!Hhhi!ihhi!!hHhhi!ihhi!!hHhhi!ihhi!!iHhhi!ihhi!!!Hhhi!ihhi!!hHhhi!ihhi!!hHhhi!ihhi!!iHhhi!ihhi!!!Hhhi!ihhi!!iHhhi!ihhi!!hHhhi!ihhi!!iHhhi!ihhi!!!Hhhi!ihhi!!!Hhhi!ihhi!!hHhhi!ihhi!!iHhhi!ihhi!!!Hhhi!ihhi!!iHhhi!ihhi!!hHhhi!ihhi!!iHhhi!ihhi!!!Hhhi!ihhi!!hHhhi!ihhi!!hHhhi!ihhi!!iHhhi!ihhi!!!Hhhi!ihhi!!hHhhi!ihhi!!hHhhi!ihhi!!iHhhi!ihhi!!!Hhhi!ihhi!!iHhhi!ihhi!!hHhhi!ihhi!!iHhhi!ihhi!!!Hhhi!ihhi!!!Hhhi!ihhi!!hHhhi!ihhi!!iHhhi!ihhi!!!Hhhi!ihhi!!hHhhi!ihhi!!hHhhi!ihhi!!iHhhi!ihhi!!!Hhhi!ihhi!!iHhhi!ihhi!!hHhhi!ihhi!!iHhhi!ihhi!!!Hhhi!ihhi!!!Hhhi!ihhi!!hHhhi!ihhi!!iHhhi!ihhi!!!Hhhi!ihhi!!!" + "'", str1, "HHhhi!ihhi!!hHhhi!ihhi!!iHhhi!ihhi!!!Hhhi!ihhi!!hHhhi!ihhi!!hHhhi!ihhi!!iHhhi!ihhi!!!Hhhi!ihhi!!hHhhi!ihhi!!hHhhi!ihhi!!iHhhi!ihhi!!!Hhhi!ihhi!!hHhhi!ihhi!!hHhhi!ihhi!!iHhhi!ihhi!!!Hhhi!ihhi!!iHhhi!ihhi!!hHhhi!ihhi!!iHhhi!ihhi!!!Hhhi!ihhi!!!Hhhi!ihhi!!hHhhi!ihhi!!iHhhi!ihhi!!!Hhhi!ihhi!!iHhhi!ihhi!!hHhhi!ihhi!!iHhhi!ihhi!!!Hhhi!ihhi!!hHhhi!ihhi!!hHhhi!ihhi!!iHhhi!ihhi!!!Hhhi!ihhi!!hHhhi!ihhi!!hHhhi!ihhi!!iHhhi!ihhi!!!Hhhi!ihhi!!iHhhi!ihhi!!hHhhi!ihhi!!iHhhi!ihhi!!!Hhhi!ihhi!!!Hhhi!ihhi!!hHhhi!ihhi!!iHhhi!ihhi!!!Hhhi!ihhi!!hHhhi!ihhi!!hHhhi!ihhi!!iHhhi!ihhi!!!Hhhi!ihhi!!iHhhi!ihhi!!hHhhi!ihhi!!iHhhi!ihhi!!!Hhhi!ihhi!!!Hhhi!ihhi!!hHhhi!ihhi!!iHhhi!ihhi!!!Hhhi!ihhi!!!");
    }

    @Test
    public void test5870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5870");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HhHHHI!HHHHhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!", 0, (int) (byte) -1, "hHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HhHHHI!HHHHhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!" + "'", str4, "HhHHHI!HHHHhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
    }

    @Test
    public void test5871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5871");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("Hhhi!hhhi!hhhi!Ihhi!!hhi!Ihhi!hhhi!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhhHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test5872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5872");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!hhhi!HHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!hHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!hhhi!Hhhi!hhHI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!hhhi!HHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!hHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!hhhi!Hhhi!hhHI!" + "'", str1, "Hhhi!hhhi!HHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!hHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!hhhi!Hhhi!hhHI!");
    }

    @Test
    public void test5873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5873");
        char[] charArray8 = new char[] {};
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray8);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("H", charArray8);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("hH", charArray8);
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hH" + "'", str16, "hH");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test5874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5874");
        char[] charArray7 = new char[] {};
        java.lang.String str8 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("hi!", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHHI!IHHIHHHI!IHHHHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!iHHHI!hHHI!iHHIhhhhI!IhhI!HI!!h", charArray7);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!hhhi!ihhi!HHHi!iHHi!HHHI!IHHI!!hi!!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhihhhi!ihhi!HHHi!iHHi!HHHI!IHHI!!hi!!!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhhhhi!ihhi!HHHi!iHHi!HHHI!IHHI!!hi!!i!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhhhi!ihhi!HHHi!iHHi!HHHI!IHHI!!hi!!hi!!ihhhi!ihhi!!!hhhi!ihhi!!!", charArray7);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("hhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hI!" + "'", str11, "hI!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!hhhi!ihhi!HHHi!iHHi!HHHI!IHHI!!hi!!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhihhhi!ihhi!HHHi!iHHi!HHHI!IHHI!!hi!!!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhhhhi!ihhi!HHHi!iHHi!HHHI!IHHI!!hi!!i!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhhhi!ihhi!HHHi!iHHi!HHHI!IHHI!!hi!!hi!!ihhhi!ihhi!!!hhhi!ihhi!!!" + "'", str13, "Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!hhhi!ihhi!HHHi!iHHi!HHHI!IHHI!!hi!!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhihhhi!ihhi!HHHi!iHHi!HHHI!IHHI!!hi!!!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhhhhi!ihhi!HHHi!iHHi!HHHI!IHHI!!hi!!i!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhhhi!ihhi!HHHi!iHHi!HHHI!IHHI!!hi!!hi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test5875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5875");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hHhhhi!ihhihhhhi!hhhi!ihhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test5876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5876");
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
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhi!ihhi!hi!!", charArray13);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!", charArray13);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.uncapitalize("hHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!", charArray13);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.initials("hHhhHhhHhhHhIHh!HhIHhhHhhHhIHh!Hh!HhhHhhHhhHhhHhIHh!HhIHhhHhhHhIHh!Hh!HhhHhhHhhHhhHhIHh!HhIHhhHhhHhIhhHHi!iHHi!HHHI!IHHI!!hi!!hhHHi!iHHi!HHHI!IHHI!!hi!!HhHHi!iHHi!HHHI!IHHI!!hi!!HhHHi!iHHi!HHHI!IHHI!!hi!!IhHHi!iHHi!HHHI!IHHI!!hi!!!hHHi!iHHi!HHHI!IHHI!!hi!!HhHHi!iHHi!HHHI!IHHI!!hi!!HhHHi!iHHi!HHHI!IHHI!!hi!!HhHHi!iHHi!HHHI!IHHI!!hi!!IhHHi!iHHi!HHHI!IHHI!!hi!!!hHHi!iHHi!HHHI!IHHI!!hi!!HhHHi!iHHi!HHHI!IHHI!!hi!!HhHHi!iHHi!HHHI!IHHI!!hi!!HhHHi!iHHi!HHHI!IHHI!!hi!!IhHHi!iHHi!HHHI!IHHI!!hi!!!", charArray13);
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Hhhhi!ihhi!hi!!" + "'", str23, "Hhhhi!ihhi!hi!!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!" + "'", str24, "Hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!" + "'", str25, "hHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test5877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5877");
        char[] charArray10 = new char[] {};
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("hH", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("hI!", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("HI!", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("HI!", charArray10);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("hHHHi!iHHi!hi!!H", charArray10);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.initials("Hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhHhhi!hhhi!hhhi!", charArray10);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.initials("HHHHHI!IHHI!!HHHHHI!IHHI!!HHHHHI!IHHHHHI!HHHIHHHI!HHHI!IHHI!!HI!!IHHHHI!IHHI!!!HHHHI!IHHI!!HHHHHHhhhHHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!HHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!hHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!hHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!hHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!iHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!!HhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!iHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!hHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!hHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!iHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!!HhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!hHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!iHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!!HhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!!HhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!h", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hi!" + "'", str13, "Hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hI!" + "'", str15, "hI!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HI!" + "'", str16, "HI!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HI!" + "'", str17, "HI!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test5878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5878");
        char[] charArray8 = new char[] {};
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("hi!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("hHI!", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("HHHHi!iHHi!hi!!", charArray8);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("Hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!h", charArray8);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("HHhhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HI!" + "'", str12, "HI!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hHI!" + "'", str13, "hHI!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HHHHi!iHHi!hi!!" + "'", str14, "HHHHi!iHHi!hi!!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HHhhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!" + "'", str16, "HHhhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!");
    }

    @Test
    public void test5879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5879");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HHHI!hHHI!hHi!HHhi!", (int) '#', "HHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HIHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!H!HHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HIHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!H!HHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HIHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HIHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!H!HHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!H!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHHI!hHHI!hHi!HHhi!" + "'", str4, "HHHI!hHHI!hHi!HHhi!");
    }

    @Test
    public void test5880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5880");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("HhHI!iHI!!HhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHHhhhhhhhhhhhhhhhihhh!hhhhhhhhhhhhhhhihhh!hhhihhhhhhhhhhhihhh!hhh!i!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!ihHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!ihi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhhhhhhhhhhhhhhhhhihhh!hhhhhhhhhhhhhhhihhh!hhhihhhhhhhhhhhihhh!hhh!i!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!" + "'", str1, "Hhhi!ihi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhhhhhhhhhhhhhhhhhihhh!hhhhhhhhhhhhhhhihhh!hhhihhhhhhhhhhhihhh!hhh!i!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
    }

    @Test
    public void test5881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5881");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HhhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!H!", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HhhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!H!" + "'", str2, "HhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HhhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!H!");
    }

    @Test
    public void test5882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5882");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hHhi!Ihi!!hHhi!Ihi!!hHhi!Ihi!!hHhi!Ihi!!iHhi!Ihi!!!Hhi!Ihi!!hHhi!Ihi!!hHhi!Ihi!!hHhi!Ihi!!iHhi!Ihi!!!Hhi!Ihi!!iHhi!Ihi!!hHhi!Ihi!!hHhi!Ihi!!iHhi!Ihi!!!Hhi!Ihi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHhi!Ihi!!hHhi!Ihi!!hHhi!Ihi!!hHhi!Ihi!!iHhi!Ihi!!!Hhi!Ihi!!hHhi!Ihi!!hHhi!Ihi!!hHhi!Ihi!!iHhi!Ihi!!!Hhi!Ihi!!iHhi!Ihi!!hHhi!Ihi!!hHhi!Ihi!!iHhi!Ihi!!!Hhi!Ihi!!!" + "'", str1, "hHhi!Ihi!!hHhi!Ihi!!hHhi!Ihi!!hHhi!Ihi!!iHhi!Ihi!!!Hhi!Ihi!!hHhi!Ihi!!hHhi!Ihi!!hHhi!Ihi!!iHhi!Ihi!!!Hhi!Ihi!!iHhi!Ihi!!hHhi!Ihi!!hHhi!Ihi!!iHhi!Ihi!!!Hhi!Ihi!!!");
    }

    @Test
    public void test5883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5883");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!H", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!H" + "'", str2, "hHhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!H");
    }

    @Test
    public void test5884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5884");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hHI!HHI!HHHHHHI!HHHI!HHHHI!IHHI!!HHhHHHHI!IHHI!!HHHHHI!IHHI!!HHHHHI!IHHHHHI!HHHIHHHI!HHHI!IHHI!!HI!!IHHHHI!IHHI!!!HHHHI!IHHI!!HHHHHHHHHHHHHHI!HHHI!IHHI!!HHHHHI!HHHI!IHHI!!HHHHHI!HHHI!IHHIHHI!HHI!HHHHHHI!HHHI!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test5885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5885");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!!Hhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!!Hhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!!Hhi!Ihi!!!", (-1), (int) ' ', "HHhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!hHhhhi!hhhi!ihhi!!hHhhhi!hhhi!ihhi!!iHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!hHhhhi!hhhi!ihhi!!iHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHHhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!hHhhhi!hhhi!ihhi!!hHhhhi!hhhi!ihhi!!iHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!hHhhhi!hhhi!ihhi!!iHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!!" + "'", str4, "hhHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHHhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!hHhhhi!hhhi!ihhi!!hHhhhi!hhhi!ihhi!!iHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!hHhhhi!hhhi!ihhi!!iHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!!");
    }

    @Test
    public void test5886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5886");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hhhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hHhhI!IhhIHHHHI!HHHI!IHHI!!", (int) '#', "", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hHhhI!IhhIHHHHI!HHHI!IHHI!!" + "'", str4, "hhhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hHhhI!IhhIHHHHI!HHHI!IHHI!!");
    }

    @Test
    public void test5887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5887");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("Hhhi!ihhi!Hhhhi!ihhihHHI!HHHI!HHHI!iHHI!!HHI!iHHI!HHHI!HHHI!iHHI!!HHI!hHHI!iHHI!!HHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHI!IHHI!hHHHI!IHHIHhhi!hhhi!hhhi!Ihhi!!hhi!Ihhi!hhhi!hhhi!Ihhi!!hhi!Hhhi!Ihhi!!hhi!!" + "'", str1, "hHHI!IHHI!hHHHI!IHHIHhhi!hhhi!hhhi!Ihhi!!hhi!Ihhi!hhhi!hhhi!Ihhi!!hhi!Hhhi!Ihhi!!hhi!!");
    }

    @Test
    public void test5888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5888");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhhhi!hhhihhi!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhhi!hhhihhi!" + "'", str2, "Hhhhi!hhhihhi!");
    }

    @Test
    public void test5889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5889");
        char[] charArray7 = new char[] {};
        java.lang.String str8 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("hH", charArray7);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("Hhhi!Hhhi!Ihhi!!", charArray7);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!hhhi!hhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hH" + "'", str12, "hH");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hhhi!hhhi!hhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!" + "'", str14, "Hhhi!hhhi!hhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!");
    }

    @Test
    public void test5890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5890");
        char[] charArray7 = new char[] {};
        java.lang.String str8 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("hi!", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("hhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HihHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!H!hHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HHhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HihHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!H!hHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HIhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HihHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!H!hHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!H!", charArray7);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!iHHHI!hHHI!iHHI!!!HHHI!hHHI!iHHI!!iHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!HHHHI!hHHI!iHHI!!HHHHI!hHHI!iHHI!!HHHHI!hHHI!iHHI!!IHHHI!hHHI!iHHI!!!HHHI!hHHI!iHHI!!IHHHI!hHHI!iHHI!!HHHHI!hHHI!iHHI!!HHHHI!hHHI!iHHI!!IHHHI!hHHI!iHHI!!!HHHI!hHHI!iHHI!!HHHHI!hHHI!iHHI!!IHHHI!hHHI!iHHI!!!HHHI!hHHI!iHHI!!!HHHI!hHHI!iHHI!!H", charArray7);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("hHhhi!hHhhHhhhi!hhhiHHHHI!HHHIHHHi!iHHi!hi!!!IHHI!!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hi!" + "'", str11, "Hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!iHHHI!hHHI!iHHI!!!HHHI!hHHI!iHHI!!iHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!HHHHI!hHHI!iHHI!!HHHHI!hHHI!iHHI!!HHHHI!hHHI!iHHI!!IHHHI!hHHI!iHHI!!!HHHI!hHHI!iHHI!!IHHHI!hHHI!iHHI!!HHHHI!hHHI!iHHI!!HHHHI!hHHI!iHHI!!IHHHI!hHHI!iHHI!!!HHHI!hHHI!iHHI!!HHHHI!hHHI!iHHI!!IHHHI!hHHI!iHHI!!!HHHI!hHHI!iHHI!!!HHHI!hHHI!iHHI!!H" + "'", str13, "hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!iHHHI!hHHI!iHHI!!!HHHI!hHHI!iHHI!!iHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!HHHHI!hHHI!iHHI!!HHHHI!hHHI!iHHI!!HHHHI!hHHI!iHHI!!IHHHI!hHHI!iHHI!!!HHHI!hHHI!iHHI!!IHHHI!hHHI!iHHI!!HHHHI!hHHI!iHHI!!HHHHI!hHHI!iHHI!!IHHHI!hHHI!iHHI!!!HHHI!hHHI!iHHI!!HHHHI!hHHI!iHHI!!IHHHI!hHHI!iHHI!!!HHHI!hHHI!iHHI!!!HHHI!hHHI!iHHI!!H");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hHhhi!hHhhHhhhi!hhhiHHHHI!HHHIHHHi!iHHi!hi!!!IHHI!!" + "'", str14, "hHhhi!hHhhHhhhi!hhhiHHHHI!HHHIHHHi!iHHi!hi!!!IHHI!!");
    }

    @Test
    public void test5891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5891");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("", (int) (byte) -1, "HhHi!HhHi!HhHi!HhHi!HhHi!IhHi!!hHi!HhHi!HhHi!HhHi!HhHi!HhHi!HhHi!HhHi!HhHi!IhHi!!hHi!IhHi!HhHi!HhHi!IhHi!!hHi!!hHi!HhHi!HhHi!HhHi!HhHi!IhHi!!hHi!IhHi!HhHi!HhHi!IhHi!!hHi!!hHi!HhHi!HhHi!HhHi!HhHi!IhHi!!hHi!IhHi!HhHi!HhHi!IhHi!!hHi!!hHi!HhHi!HhHi!HhHi!HhHi!IhHi!!hHi!IhHi!HhHi!HhHi!IhHi!!hHi!!hHi!IhHi!HhHi!HhHi!HhHi!IhHi!!hHi!IhHi!HhHi!HhHi!IhHi!!hHi!!hHi!!hHi!HhHi!HhHi!HhHi!IhHi!!hHi!IhHi!HhHi!HhHi!IhHi!!hHi!!hHi!IhHi!HhHi!HhHi!HhHi!IhHi!!hHi!IhHi!HhHi!HhHi!IhHi!!hHi!!hHi!HhHi!HhHi!HhHi!HhHi!IhHi!!hHi!IhHi!HhHi!HhHi!IhHi!!hHi!!hHi!HhHi!HhHi!HhHi!HhHi!IhHi!!hHi!IhHi!HhHi!HhHi!IhHi!!hHi!!hHi!IhHi!HhHi!HhHi!HhHi!IhHi!!hHi!IhHi!HhHi!HhHi!IhHi!!hHi!!hHi!!hHi!HhHi!HhHi!HhHi!IhHi!!hHi!IhHi!HhHi!HhHi!IhHi!!hHi!!hHi!HhHi!HhHi!HhHi!HhHi!IhHi!!hHi!IhHi!HhHi!HhHi!IhHi!!hHi!!hHi!IhHi!HhHi!HhHi!HhHi!IhHi!!hHi!IhHi!HhHi!HhHi!IhHi!!hHi!!hHi!!hHi!HhHi!HhHi!HhHi!IhHi!!hHi!IhHi!HhHi!HhHi!IhHi!!hHi!!hHi!!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test5892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5892");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!HhHHHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!hHIHI!!HI!HHI!IHI!!HI!!", 0, "hHHI!IHHI!HHHHI!IHHI!HHHI!IHHI!!HI!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!HhHHHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!hHIHI!!HI!HHI!IHI!!HI!!" + "'", str4, "hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!HhHHHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!hHIHI!!HI!HHI!IHI!!HI!!");
    }

    @Test
    public void test5893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5893");
        char[] charArray11 = new char[] { ' ' };
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("hhhi!Hhhi!Ihhi!!", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("hh", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!", charArray11);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("hHHHI!HHHIHHHI!HHHI!IHHI!!", charArray11);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHI!IHHI!!", charArray11);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.uncapitalize("HH", charArray11);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!IHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!!", charArray11);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhHhh", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { ' ' });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H" + "'", str12, "H");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H" + "'", str13, "H");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hhhi!Hhhi!Ihhi!!" + "'", str14, "hhhi!Hhhi!Ihhi!!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hh" + "'", str15, "Hh");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!" + "'", str16, "Hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "h" + "'", str17, "h");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hhhi!ihhi!!" + "'", str18, "Hhhi!ihhi!!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hH" + "'", str19, "hH");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!ihhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!!" + "'", str20, "Hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!ihhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhhh" + "'", str21, "Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhhh");
    }

    @Test
    public void test5894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5894");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHiHhhi!Hhhi!Ihhi!!", 0, (-1), "Hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhihhhhi!ihhi!hi!!h");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHiHhhi!Hhhi!Ihhi!!" + "'", str4, "HHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHiHhhi!Hhhi!Ihhi!!");
    }

    @Test
    public void test5895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5895");
        char[] charArray7 = new char[] { ' ' };
        java.lang.String str8 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalize("Hhi!", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("H", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("hHHi!iHHi!HHHI!IHHI!!hi!!", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!hhhi!hhhi!ihhi!!hhi!hhhi!hhhi!hhhi!ihhi!!hhi!hhhi!hhhi!hhhi!ihhi!!", charArray7);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("hhhhi!hhhihhhi!hhhi!ihhi!!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { ' ' });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H" + "'", str8, "H");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Hhi!" + "'", str9, "Hhi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "h" + "'", str10, "h");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hHHi!iHHi!HHHI!IHHI!!hi!!" + "'", str11, "hHHi!iHHi!HHHI!IHHI!!hi!!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hhhi!hhhi!hhhi!ihhi!!hhi!hhhi!hhhi!hhhi!ihhi!!hhi!hhhi!hhhi!hhhi!ihhi!!" + "'", str12, "Hhhi!hhhi!hhhi!ihhi!!hhi!hhhi!hhhi!hhhi!ihhi!!hhi!hhhi!hhhi!hhhi!ihhi!!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hhhhi!hhhihhhi!hhhi!ihhi!!" + "'", str13, "hhhhi!hhhihhhi!hhhi!ihhi!!");
    }

    @Test
    public void test5896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5896");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("HhhHHHI!IHHIHHHI!hHHI!iHHI!!!HI!!HHhHHHI!IHHIHHHI!hHHI!iHHI!!!HI!!HHhHHHI!IHHIHHHI!hHHI!iHHI!!!HI!!HHhHHHI!IHHIHHHI!hHHI!iHHI!!!HI!!HHhHHHI!IHHIHHHI!hHHI!iHHI!!!HI!!HHhHHHI!IHHIHHHI!hHHI!iHHI!!!HI!!HHhHHHI!IHHIHHHI!hHHI!iHHI!!!HI!!HHhHHHI!IHHIHHHI!hHHI!iHHI!!!HI!!HHhHHHI!IHHIHHHI!hHHI!iHHI!!!HI!!HIhHHHI!IHHIHHHI!hHHI!iHHI!!!HI!!HHhHHHI!IHHIHHHI!hHHI!iHHI!!!HI!!HHhHHHI!IHHIHHHI!hHHI!iHHI!!!HI!!HHhHHHI!IHHIHHHI!hHHI!iHHI!!!HI!!HHhHHHI!IHHIHHHI!hHHI!iHHI!!!HI!!HIhHHHI!IHHIHHHI!hHHI!iHHI!!!HI!!H!hHHHI!IHHIHHHI!hHHI!iHHI!!!HI!!HIhHHHI!IHHIHHHI!hHHI!iHHI!!!HI!!HHhHHHI!IHHIHHHI!hHHI!iHHI!!!HI!!HHhHHHI!IHHIHHHI!hHHI!iHHI!!!HI!!HIhHHHI!IHHIHHHI!hHHI!iHHI!!!HI!!H!hHHHI!IHHIHHHI!hHHI!iHHI!!!HI!!HHhHHHI!IHHIHHHI!hHHI!iHHI!!!HI!!HIhHHHI!IHHIHHHI!hHHI!iHHI!!!HI!!H!hHHHI!IHHIHHHI!hHHI!iHHI!!!HI!!H!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhhhi!ihhihhhi!hhhi!ihhi!!!hi!!hhhhhhi!ihhihhhi!hhhi!ihhi!!!hi!!hhhhhhi!ihhihhhi!hhhi!ihhi!!!hi!!hhhhhhi!ihhihhhi!hhhi!ihhi!!!hi!!hhhhhhi!ihhihhhi!hhhi!ihhi!!!hi!!hhhhhhi!ihhihhhi!hhhi!ihhi!!!hi!!hhhhhhi!ihhihhhi!hhhi!ihhi!!!hi!!hhhhhhi!ihhihhhi!hhhi!ihhi!!!hi!!hhhhhhi!ihhihhhi!hhhi!ihhi!!!hi!!hihhhhi!ihhihhhi!hhhi!ihhi!!!hi!!hhhhhhi!ihhihhhi!hhhi!ihhi!!!hi!!hhhhhhi!ihhihhhi!hhhi!ihhi!!!hi!!hhhhhhi!ihhihhhi!hhhi!ihhi!!!hi!!hhhhhhi!ihhihhhi!hhhi!ihhi!!!hi!!hihhhhi!ihhihhhi!hhhi!ihhi!!!hi!!h!hhhhi!ihhihhhi!hhhi!ihhi!!!hi!!hihhhhi!ihhihhhi!hhhi!ihhi!!!hi!!hhhhhhi!ihhihhhi!hhhi!ihhi!!!hi!!hhhhhhi!ihhihhhi!hhhi!ihhi!!!hi!!hihhhhi!ihhihhhi!hhhi!ihhi!!!hi!!h!hhhhi!ihhihhhi!hhhi!ihhi!!!hi!!hhhhhhi!ihhihhhi!hhhi!ihhi!!!hi!!hihhhhi!ihhihhhi!hhhi!ihhi!!!hi!!h!hhhhi!ihhihhhi!hhhi!ihhi!!!hi!!h!" + "'", str1, "Hhhhhhi!ihhihhhi!hhhi!ihhi!!!hi!!hhhhhhi!ihhihhhi!hhhi!ihhi!!!hi!!hhhhhhi!ihhihhhi!hhhi!ihhi!!!hi!!hhhhhhi!ihhihhhi!hhhi!ihhi!!!hi!!hhhhhhi!ihhihhhi!hhhi!ihhi!!!hi!!hhhhhhi!ihhihhhi!hhhi!ihhi!!!hi!!hhhhhhi!ihhihhhi!hhhi!ihhi!!!hi!!hhhhhhi!ihhihhhi!hhhi!ihhi!!!hi!!hhhhhhi!ihhihhhi!hhhi!ihhi!!!hi!!hihhhhi!ihhihhhi!hhhi!ihhi!!!hi!!hhhhhhi!ihhihhhi!hhhi!ihhi!!!hi!!hhhhhhi!ihhihhhi!hhhi!ihhi!!!hi!!hhhhhhi!ihhihhhi!hhhi!ihhi!!!hi!!hhhhhhi!ihhihhhi!hhhi!ihhi!!!hi!!hihhhhi!ihhihhhi!hhhi!ihhi!!!hi!!h!hhhhi!ihhihhhi!hhhi!ihhi!!!hi!!hihhhhi!ihhihhhi!hhhi!ihhi!!!hi!!hhhhhhi!ihhihhhi!hhhi!ihhi!!!hi!!hhhhhhi!ihhihhhi!hhhi!ihhi!!!hi!!hihhhhi!ihhihhhi!hhhi!ihhi!!!hi!!h!hhhhi!ihhihhhi!hhhi!ihhi!!!hi!!hhhhhhi!ihhihhhi!hhhi!ihhi!!!hi!!hihhhhi!ihhihhhi!hhhi!ihhi!!!hi!!h!hhhhi!ihhihhhi!hhhi!ihhi!!!hi!!h!");
    }

    @Test
    public void test5897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5897");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHI!HHHI!Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!" + "'", str1, "Hhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
    }

    @Test
    public void test5898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5898");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hHhhI!IhhI!!HHhhI!IhhI!!HHhhI!IhhI!!HHhhI!IhhI!!IHhhI!IhhI!!!HhhI!IhhI!!HHhhI!IhhI!!HHhhI!IhhI!!HHhhhHHHHHHHHHHHHHHHIHHH!HHHHHHHHHHHHHHHIHHH!HHHIHHHHHHHHHHHIHHH!HHH!I!IhhI!!IHhhI!IhhI!!!HhhI!IhhI!!IHhhI!IhhI!!HHhhI!IhhI!!HHhhI!IhhI!!IHhhI!IhhI!!!HhhI!IhhI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHHhhhhhhhhhhhhhhhihhh!hhhhhhhhhhhhhhhihhh!hhhihhhhhhhhhhhihhh!hhh!i!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!ihHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!!" + "'", str1, "HhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHHhhhhhhhhhhhhhhhihhh!hhhhhhhhhhhhhhhihhh!hhhihhhhhhhhhhhihhh!hhh!i!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!ihHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!!");
    }

    @Test
    public void test5899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5899");
        char[] charArray8 = new char[] {};
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("HhhI!IhhI!!", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHi!iHHi!hi!!", charArray8);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("hHHi!iHHi!HHHI!IHHI!!hi!!", charArray8);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HhhI!IhhI!!" + "'", str13, "HhhI!IhhI!!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HHHi!iHHi!hi!!" + "'", str14, "HHHi!iHHi!hi!!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hHHi!iHHi!HHHI!IHHI!!hi!!" + "'", str15, "hHHi!iHHi!HHHI!IHHI!!hi!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test5900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5900");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("", (-1), "hhhhhi!ihhi!hi!!ihhhhi!ihhi!hi!!!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test5901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5901");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HHHHI!IHHIHHHi!iHHi!hHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHHI!IHHIHHHi!iHHi!hHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!" + "'", str1, "hHHHI!IHHIHHHi!iHHi!hHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!");
    }

    @Test
    public void test5902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5902");
        char[] charArray5 = new char[] {};
        java.lang.String str6 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray5);
        java.lang.String str7 = org.apache.commons.lang.WordUtils.initials("", charArray5);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalizeFully("Hh", charArray5);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray5);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray5);
        java.lang.Class<?> wildcardClass11 = charArray5.getClass();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hh" + "'", str8, "Hh");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test5903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5903");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhi!hhhihhhhi!!ihhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhi!hhhihhhhi!!ihhi!!" + "'", str1, "Hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhi!hhhihhhhi!!ihhi!!");
    }

    @Test
    public void test5904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5904");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhi!ihhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!ihhi!!" + "'", str1, "Hhhi!ihhi!!");
    }

    @Test
    public void test5905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5905");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("HHHI!HHHI!hhhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!HhhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!HHHI!hHHI!HHhi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test5906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5906");
        char[] charArray5 = new char[] { ' ', 'a', 'a' };
        java.lang.String str6 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray5);
        java.lang.String str7 = org.apache.commons.lang.WordUtils.initials("hhhi!ihhi!!", charArray5);
        java.lang.Class<?> wildcardClass8 = charArray5.getClass();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', 'a', 'a' });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "h" + "'", str7, "h");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5907");
        char[] charArray10 = new char[] {};
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("h", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("hHH", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!ihhi!hhhi!ihhi!hi!!", charArray10);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!!", charArray10);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.uncapitalize("HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHHHHI!IHHI!HHI!IHI!!HI!!", charArray10);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.uncapitalize("hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!hhhhi!Hhhi!Ihhi!!hhhhi!Hhhi!Ihhi!!hhhhi!Hhhi!Ihhi!!ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!ihhhi!Hhhi!Ihhi!!hhhhi!Hhhi!Ihhi!!hhhhi!Hhhi!Ihhi!!ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!hhhhi!Hhhi!Ihhi!!ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!h", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hi!" + "'", str13, "Hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hHH" + "'", str16, "hHH");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hhhi!ihhi!hhhi!ihhi!hi!!" + "'", str17, "Hhhi!ihhi!hhhi!ihhi!hi!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HHHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!!" + "'", str18, "HHHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHHHHI!IHHI!HHI!IHI!!HI!!" + "'", str19, "HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHHHHI!IHHI!HHI!IHI!!HI!!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!hhhhi!Hhhi!Ihhi!!hhhhi!Hhhi!Ihhi!!hhhhi!Hhhi!Ihhi!!ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!ihhhi!Hhhi!Ihhi!!hhhhi!Hhhi!Ihhi!!hhhhi!Hhhi!Ihhi!!ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!hhhhi!Hhhi!Ihhi!!ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!h" + "'", str20, "hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!hhhhi!Hhhi!Ihhi!!hhhhi!Hhhi!Ihhi!!hhhhi!Hhhi!Ihhi!!ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!ihhhi!Hhhi!Ihhi!!hhhhi!Hhhi!Ihhi!!hhhhi!Hhhi!Ihhi!!ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!hhhhi!Hhhi!Ihhi!!ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!h");
    }

    @Test
    public void test5908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5908");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HHhhhi!ihhi!!HHhhhi!ihhi!!HHhhhi!ihhi!!IHhhhi!ihhi!!!Hhhhi!ihhi!!HHhhhi!ihhi!!HHhhhi!ihhi!!HHhhhi!ihhi!!IHhhhi!ihhi!!!Hhhhi!ihhi!!IHhhhi!ihhi!!HHhhhi!ihhi!!HHhhhi!ihhi!!IHhhhi!ihhi!!!Hhhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHhhhi!ihhi!!HHhhhi!ihhi!!HHhhhi!ihhi!!IHhhhi!ihhi!!!Hhhhi!ihhi!!HHhhhi!ihhi!!HHhhhi!ihhi!!HHhhhi!ihhi!!IHhhhi!ihhi!!!Hhhhi!ihhi!!IHhhhi!ihhi!!HHhhhi!ihhi!!HHhhhi!ihhi!!IHhhhi!ihhi!!!Hhhhi!ihhi!!!" + "'", str1, "hHhhhi!ihhi!!HHhhhi!ihhi!!HHhhhi!ihhi!!IHhhhi!ihhi!!!Hhhhi!ihhi!!HHhhhi!ihhi!!HHhhhi!ihhi!!HHhhhi!ihhi!!IHhhhi!ihhi!!!Hhhhi!ihhi!!IHhhhi!ihhi!!HHhhhi!ihhi!!HHhhhi!ihhi!!IHhhhi!ihhi!!!Hhhhi!ihhi!!!");
    }

    @Test
    public void test5909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5909");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhIhHHI!hHHI!iHHI!!", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhIhHHI!hHHI!iHHI!!" + "'", str2, "hhhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhIhHHI!hHHI!iHHI!!");
    }

    @Test
    public void test5910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5910");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhhhhi!ihhi!hi!!h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test5911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5911");
        char[] charArray11 = new char[] {};
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("H", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("", charArray11);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("hhhI!IhhI!HI!!", charArray11);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("hH", charArray11);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("H", charArray11);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHHHI!IHHHHHI!IHHI!HHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!", charArray11);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalize("hHHHI!HHHI!IHHI!!", charArray11);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalizeFully("HhHHI!IHHI!HHHI!IHHI!!HI!!", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] {});
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hhhI!IhhI!HI!!" + "'", str17, "hhhI!IhhI!HI!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hH" + "'", str18, "hH");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H" + "'", str19, "H");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hHHHHI!IHHHHHI!IHHI!HHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!" + "'", str20, "hHHHHI!IHHHHHI!IHHI!HHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hHHHI!HHHI!IHHI!!" + "'", str21, "hHHHI!HHHI!IHHI!!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "HhHHI!IHHI!HHHI!IHHI!!HI!!" + "'", str22, "HhHHI!IHHI!HHHI!IHHI!!HI!!");
    }

    @Test
    public void test5912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5912");
        char[] charArray9 = new char[] {};
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("hi!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray9);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("HHhHhHhHhHhHhHhHiHhH!HhHhHhHhHhHhHhHiHhH!HhHiHhHhHhHhHhHiHhH!HhH!", charArray9);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhHHI!HHHI!Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!", charArray9);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("hhhi!ihhi!hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihHhhhi!ihhi!HHI!iHI!!hi!!hhhhi!ihhi!HHI!iHI!!hi!!hhhhi!ihhi!HHI!iHI!!hi!!ihhhi!ihhi!HHI!iHI!!hi!!!hhhi!ihhi!HHI!iHI!!hi!!ihhhi!ihhi!HHI!iHI!!hi!!hhhhi!ihhi!HHI!iHI!!hi!!hhhhi!ihhi!HHI!iHI!!hi!!ihhhi!ihhi!HHI!iHI!!hi!!!hhhi!ihhi!HHI!iHI!!hi!!Hhhhi!ihhi!HHI!iHI!!hi!!Ihhhi!ihhi!HHI!iHI!!hi!!!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hi!" + "'", str13, "Hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hi!" + "'", str15, "Hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhHHI!HHHI!Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!" + "'", str17, "hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhHHI!HHHI!Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hhhi!ihhi!hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihHhhhi!ihhi!HHI!iHI!!hi!!hhhhi!ihhi!HHI!iHI!!hi!!hhhhi!ihhi!HHI!iHI!!hi!!ihhhi!ihhi!HHI!iHI!!hi!!!hhhi!ihhi!HHI!iHI!!hi!!ihhhi!ihhi!HHI!iHI!!hi!!hhhhi!ihhi!HHI!iHI!!hi!!hhhhi!ihhi!HHI!iHI!!hi!!ihhhi!ihhi!HHI!iHI!!hi!!!hhhi!ihhi!HHI!iHI!!hi!!Hhhhi!ihhi!HHI!iHI!!hi!!Ihhhi!ihhi!HHI!iHI!!hi!!!" + "'", str18, "hhhi!ihhi!hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihHhhhi!ihhi!HHI!iHI!!hi!!hhhhi!ihhi!HHI!iHI!!hi!!hhhhi!ihhi!HHI!iHI!!hi!!ihhhi!ihhi!HHI!iHI!!hi!!!hhhi!ihhi!HHI!iHI!!hi!!ihhhi!ihhi!HHI!iHI!!hi!!hhhhi!ihhi!HHI!iHI!!hi!!hhhhi!ihhi!HHI!iHI!!hi!!ihhhi!ihhi!HHI!iHI!!hi!!!hhhi!ihhi!HHI!iHI!!hi!!Hhhhi!ihhi!HHI!iHI!!hi!!Ihhhi!ihhi!HHI!iHI!!hi!!!");
    }

    @Test
    public void test5913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5913");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hHHHI!IHHIhhhi!hhhi!ihhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHHI!IHHIhhhi!hhhi!ihhi!!" + "'", str1, "HHHHI!IHHIhhhi!hhhi!ihhi!!");
    }

    @Test
    public void test5914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5914");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!IhHHI!hHHI!iHHI!!!hHHI!hHHI!iHHIHhhi!ihhi!HhH", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!IhHHI!hHHI!iHHI!!!hHHI!hHHI!iHHIHhhi!ihhi!HhH" + "'", str2, "hhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!IhHHI!hHHI!iHHI!!!hHHI!hHHI!iHHIHhhi!ihhi!HhH");
    }

    @Test
    public void test5915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5915");
        char[] charArray12 = new char[] { '#', '4', '4', '4' };
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray12);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray12);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("", charArray12);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray12);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!Hhhi!Ihhi!!", charArray12);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("HHHi!iHHi!HHHI!IHHI!!hi!!", charArray12);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHHI!HHHIHHHi!iHHi!hi!!!IHHI!!", charArray12);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.initials("Hhhi!Hhhi!Ihhi!!", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '#', '4', '4', '4' });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hi!" + "'", str13, "Hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hi!" + "'", str14, "Hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hhhi!Hhhi!Ihhi!!" + "'", str17, "Hhhi!Hhhi!Ihhi!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H" + "'", str18, "H");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Hhhhi!hhhihhhi!ihhi!hi!!!ihhi!!" + "'", str19, "Hhhhi!hhhihhhi!ihhi!hi!!!ihhi!!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H" + "'", str20, "H");
    }

    @Test
    public void test5916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5916");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hHHHHI!HHHHHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHHI!IHHI!HHH", 0, "Hhhi!hhhi!ihhi!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHHHI!HHHHHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHHI!IHHI!HHH" + "'", str4, "hHHHHI!HHHHHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHHI!IHHI!HHH");
    }

    @Test
    public void test5917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5917");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HHhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhHHHHHHHHHIHHHHi!iHHi!hi!!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhHHHHHHHHHIHHHHi!iHHi!hi!!" + "'", str2, "HHhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhHHHHHHHHHIHHHHi!iHHi!hi!!");
    }

    @Test
    public void test5918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5918");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hHhhhi!ihhi!!hHhhhi!ihhi!!hHhhhi!ihhi!!hHhhhi!ihhi!!iHhhhi!ihhi!!!Hhhhi!ihhi!!iHhhhi!ihhi!!hHhhhi!ihhi!!hHhhhi!ihhi!!iHhhhi!ihhi!!!Hhhhi!ihhi!!hHhhhi!ihhi!!iHhhhi!ihhi!!!Hhhhi!ihhi!!!Hhhhi!ihhi!!h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHhhhi!ihhi!!hHhhhi!ihhi!!hHhhhi!ihhi!!hHhhhi!ihhi!!iHhhhi!ihhi!!!Hhhhi!ihhi!!iHhhhi!ihhi!!hHhhhi!ihhi!!hHhhhi!ihhi!!iHhhhi!ihhi!!!Hhhhi!ihhi!!hHhhhi!ihhi!!iHhhhi!ihhi!!!Hhhhi!ihhi!!!Hhhhi!ihhi!!h" + "'", str1, "hHhhhi!ihhi!!hHhhhi!ihhi!!hHhhhi!ihhi!!hHhhhi!ihhi!!iHhhhi!ihhi!!!Hhhhi!ihhi!!iHhhhi!ihhi!!hHhhhi!ihhi!!hHhhhi!ihhi!!iHhhhi!ihhi!!!Hhhhi!ihhi!!hHhhhi!ihhi!!iHhhhi!ihhi!!!Hhhhi!ihhi!!!Hhhhi!ihhi!!h");
    }

    @Test
    public void test5919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5919");
        char[] charArray18 = new char[] {};
        java.lang.String str19 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray18);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.initials("", charArray18);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray18);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray18);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalize("", charArray18);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.uncapitalize("Hi!", charArray18);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray18);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.uncapitalize("hH", charArray18);
        java.lang.String str27 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray18);
        java.lang.String str28 = org.apache.commons.lang.WordUtils.uncapitalize("HH", charArray18);
        java.lang.String str29 = org.apache.commons.lang.WordUtils.uncapitalize("HH", charArray18);
        java.lang.String str30 = org.apache.commons.lang.WordUtils.capitalize("", charArray18);
        java.lang.String str31 = org.apache.commons.lang.WordUtils.uncapitalize("hhhi!hhhi!hhhi!Ihhi!!hhi!Ihhi!hhhi!Hhhi!hhhi!hhhi!", charArray18);
        java.lang.String str32 = org.apache.commons.lang.WordUtils.initials("HhHhhi!ihhhHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHHHHI!IHHI!HHI!IHI!!HI!!", charArray18);
        java.lang.String str33 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!IHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!!", charArray18);
        java.lang.String str34 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!", charArray18);
        java.lang.String str35 = org.apache.commons.lang.WordUtils.initials("hHHHI!HHHIhHHI!HHHI!HHHI!IHHI!!HHI!IHHI!HHHI!HHHI!IHHI!!HHI!HHHI!IHHI!!HHI!!", charArray18);
        java.lang.String str36 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhi!hhhihhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhihhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhhhhi!ihhi!hi!!h", charArray18);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertArrayEquals(charArray18, new char[] {});
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Hi!" + "'", str22, "Hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Hi!" + "'", str24, "Hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "HI!" + "'", str25, "HI!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hH" + "'", str26, "hH");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Hi!" + "'", str27, "Hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "HH" + "'", str28, "HH");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "HH" + "'", str29, "HH");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hhhi!hhhi!hhhi!Ihhi!!hhi!Ihhi!hhhi!Hhhi!hhhi!hhhi!" + "'", str31, "hhhi!hhhi!hhhi!Ihhi!!hhi!Ihhi!hhhi!Hhhi!hhhi!hhhi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!IHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!!" + "'", str33, "HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!IHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Hhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!" + "'", str34, "Hhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Hhhhi!hhhihhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhihhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhhhhi!ihhi!hi!!h" + "'", str36, "Hhhhi!hhhihhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhihhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhhhhi!ihhi!hi!!h");
    }

    @Test
    public void test5920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5920");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!" + "'", str2, "hHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!");
    }

    @Test
    public void test5921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5921");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihHHi!iHHi!hhhi!hhhi!hhi!hhhi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhhi!ihhi!hhhi!hhhi!hhi!hhhi!" + "'", str1, "Hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhhi!ihhi!hhhi!hhhi!hhi!hhhi!");
    }

    @Test
    public void test5922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5922");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhihhi!hhi!hhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!", (int) (byte) 0, 100, "hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhihhi!hhi!hhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihi!!" + "'", str4, "hhhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhihhi!hhi!hhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihi!!");
    }

    @Test
    public void test5923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5923");
        char[] charArray8 = new char[] { '#', '4', '4', '4' };
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("hhHI!iHI!!HhHI!iHI!!HhHI!iHI!!IhHI!iHI!!!hHI!iHI!!IhHI!iHI!!HhHI!iHI!!HhHI!iHI!!IhHI!iHI!!!hHI!iHI!!HhHI!iHI!!HhHI!iHI!!IhHI!iHI!!!hHI!iHI!!IhHI!iHI!!HhHI!iHI!!IhHI!iHI!!!hHI!iHI!!!hHI!iHI!!HhHI!iHI!!IhHI!iHI!!!hHI!iHI!!!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '#', '4', '4', '4' });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Hi!" + "'", str9, "Hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hi!" + "'", str10, "Hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HhHI!iHI!!HhHI!iHI!!HhHI!iHI!!IhHI!iHI!!!hHI!iHI!!IhHI!iHI!!HhHI!iHI!!HhHI!iHI!!IhHI!iHI!!!hHI!iHI!!HhHI!iHI!!HhHI!iHI!!IhHI!iHI!!!hHI!iHI!!IhHI!iHI!!HhHI!iHI!!IhHI!iHI!!!hHI!iHI!!!hHI!iHI!!HhHI!iHI!!IhHI!iHI!!!hHI!iHI!!!" + "'", str12, "HhHI!iHI!!HhHI!iHI!!HhHI!iHI!!IhHI!iHI!!!hHI!iHI!!IhHI!iHI!!HhHI!iHI!!HhHI!iHI!!IhHI!iHI!!!hHI!iHI!!HhHI!iHI!!HhHI!iHI!!IhHI!iHI!!!hHI!iHI!!IhHI!iHI!!HhHI!iHI!!IhHI!iHI!!!hHI!iHI!!!hHI!iHI!!HhHI!iHI!!IhHI!iHI!!!hHI!iHI!!!");
    }

    @Test
    public void test5924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5924");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("", (int) (short) -1, 0, "hhhhhi!hhhHHhhI!IhhIHHHHI!HHHI!IHHI!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test5925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5925");
        char[] charArray8 = new char[] { 'a', '4', '4', '#', ' ' };
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhhi!ihhi!hi!!h", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("HhhH", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("HHHi!iHHi!HhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!!HhhhI!IhhIHhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!!!HI!!h", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { 'a', '4', '4', '#', ' ' });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hhhhhi!ihhi!hi!!h" + "'", str9, "hhhhhi!ihhi!hi!!h");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HhhH" + "'", str10, "HhhH");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hHHi!iHHi!HhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!!HhhhI!IhhIHhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!!!HI!!h" + "'", str11, "hHHi!iHHi!HhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!!HhhhI!IhhIHhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!!!HI!!h");
    }

    @Test
    public void test5926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5926");
        char[] charArray11 = new char[] { '#', '4', '4', '4' };
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray11);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("Hhi!", charArray11);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("", charArray11);
        java.lang.Class<?> wildcardClass19 = charArray11.getClass();
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '#', '4', '4', '4' });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hi!" + "'", str12, "Hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hi!" + "'", str13, "Hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hhi!" + "'", str17, "hhi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test5927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5927");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HhhI!IhhI!hhhi!ihhi!!HI!!", (int) (short) 10, "Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HhhI!IhhI!Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!!HI!!" + "'", str4, "HhhI!IhhI!Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!!HI!!");
    }

    @Test
    public void test5928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5928");
        char[] charArray9 = new char[] {};
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("hi!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("Hhhi!ihhi!!", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("hH", charArray9);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("HHH", charArray9);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("hhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HihHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!H!hHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HHhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HihHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!H!hHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HIhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HihHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!H!hHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!H!", charArray9);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("hhhhi!hhhihhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!h", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HHH" + "'", str16, "HHH");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HihHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!H!hHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HHhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HihHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!H!hHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HIhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HihHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!H!hHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!H!" + "'", str17, "hhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HihHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!H!hHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HHhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HihHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!H!hHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HIhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HihHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!H!hHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!H!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test5929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5929");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhhhi!hhhhHHI!HHHI!IHHI!!", (int) (byte) 10, (int) (short) 10, "hhhhhi!hhhi!ihhi!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhhhi!hhhhhhhhi!hhhi!ihhi!!" + "'", str4, "Hhhhhi!hhhhhhhhi!hhhi!ihhi!!");
    }

    @Test
    public void test5930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5930");
        char[] charArray11 = new char[] { '#', '4', '4', '4' };
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("Hh", charArray11);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("hHHHI!HHHIhHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!iHHHI!hHHI!iHHI!!!HHHIhhhhi!hhhihhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!h", charArray11);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("hHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHHHI!IHHHHHI!IHHI!HHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '#', '4', '4', '4' });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hi!" + "'", str12, "Hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hi!" + "'", str13, "Hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hh" + "'", str16, "Hh");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hHHHI!HHHIhHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!iHHHI!hHHI!iHHI!!!HHHIhhhhi!hhhihhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!h" + "'", str17, "hHHHI!HHHIhHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!iHHHI!hHHI!iHHI!!!HHHIhhhhi!hhhihhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!h");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHHHI!IHHHHHI!IHHI!HHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!" + "'", str18, "hHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHHHI!IHHHHHI!IHHI!HHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!");
    }

    @Test
    public void test5931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5931");
        char[] charArray9 = new char[] { '#', ' ', '4' };
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("HHHi!iHHi!!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("hhhhi!hhhi!ihhi!!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("hhHHI!HHHI!HHHI!", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHHI!IHHIHHHi!iHHi!hHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '#', ' ', '4' });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hi!" + "'", str10, "Hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hHHi!iHHi!!" + "'", str12, "hHHi!iHHi!!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hhhhi!hhhi!ihhi!!" + "'", str13, "hhhhi!hhhi!ihhi!!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HhHHI!HHHI!HHHI!" + "'", str14, "HhHHI!HHHI!HHHI!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
    }

    @Test
    public void test5932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5932");
        char[] charArray7 = new char[] {};
        java.lang.String str8 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("", charArray7);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhhi!ihhi!hi!!h", charArray7);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("hHHHHI!HHHhHhhhI!IhhhhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hi!" + "'", str11, "Hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hhhhhi!ihhi!hi!!h" + "'", str13, "Hhhhhi!ihhi!hi!!h");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hHHHHI!HHHhHhhhI!IhhhhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!!" + "'", str14, "hHHHHI!HHHhHhhhI!IhhhhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!!");
    }

    @Test
    public void test5933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5933");
        char[] charArray11 = new char[] {};
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("hH", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("hI!", charArray11);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("HI!", charArray11);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("HI!", charArray11);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhI!IhhI!HI!!", charArray11);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.uncapitalize("hhhi!ihhi!!", charArray11);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.initials("HHHHI!HHHIHhi!", charArray11);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.initials("hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!!", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] {});
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hi!" + "'", str14, "Hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hI!" + "'", str16, "hI!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HI!" + "'", str17, "HI!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HI!" + "'", str18, "HI!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hhhI!IhhI!HI!!" + "'", str19, "hhhI!IhhI!HI!!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hhhi!ihhi!!" + "'", str20, "hhhi!ihhi!!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test5934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5934");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("HHhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhihhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhhhhi!ihhi!hi!!h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhihhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhhhhi!ihhi!hi!!h" + "'", str1, "HHhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhihhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhhhhi!ihhi!hi!!h");
    }

    @Test
    public void test5935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5935");
        char[] charArray7 = new char[] {};
        java.lang.String str8 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("Hh", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("hH", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("hHHI!IHHI!HI!!", charArray7);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("Hhi!hhi!hhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhhHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhhi!hhhi!hhi!hhhi!", charArray7);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("HhHHI!IHHI", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hh" + "'", str10, "Hh");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hHHI!IHHI!HI!!" + "'", str12, "hHHI!IHHI!HI!!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hhi!hhi!hhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhhHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhhi!hhhi!hhi!hhhi!" + "'", str13, "Hhi!hhi!hhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhhHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhhi!hhhi!hhi!hhhi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HhHHI!IHHI" + "'", str14, "HhHHI!IHHI");
    }

    @Test
    public void test5936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5936");
        char[] charArray13 = new char[] {};
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray13);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("", charArray13);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("hi!", charArray13);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray13);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("", charArray13);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray13);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("H", charArray13);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalizeFully("HhHI!", charArray13);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray13);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalize("Hhhhi!ihhi!hhhi!ihhi!!hi!!", charArray13);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalize("HHHHHi!iHHHHHI!IHHI!HHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!", charArray13);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.capitalize("hHHHI!HHHI!HHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHHI!IHHI!!", charArray13);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.capitalize("hHh", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] {});
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HI!" + "'", str17, "HI!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Hi!" + "'", str19, "Hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H" + "'", str20, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "HhHI!" + "'", str21, "HhHI!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "HI!" + "'", str22, "HI!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Hhhhi!ihhi!hhhi!ihhi!!hi!!" + "'", str23, "Hhhhi!ihhi!hhhi!ihhi!!hi!!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "HHHHHi!iHHHHHI!IHHI!HHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!" + "'", str24, "HHHHHi!iHHHHHI!IHHI!HHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hHHHI!HHHI!HHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHHI!IHHI!!" + "'", str25, "hHHHI!HHHI!HHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHHI!IHHI!!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hHh" + "'", str26, "hHh");
    }

    @Test
    public void test5937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5937");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!ihhi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test5938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5938");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHiHhhi!Hhhi!Ihhi!!", 0, "Hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!ihhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHiHhhi!Hhhi!Ihhi!!" + "'", str4, "hHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHiHhhi!Hhhi!Ihhi!!");
    }

    @Test
    public void test5939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5939");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHHI!HHHI!HhHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHhhI!IhhIHHHHI!HHHI!IHHI!!", (int) (byte) 0, (-1), "HhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!H!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHHI!HHHI!HhHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHhhI!IhhIHHHHI!HHHI!IHHI!!" + "'", str4, "HHHI!HHHI!HhHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHhhI!IhhIHHHHI!HHHI!IHHI!!");
    }

    @Test
    public void test5940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5940");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HHHHI!hHHI!hHi!HHhi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHHI!hHHI!hHi!HHhi!" + "'", str1, "hHHHI!hHHI!hHi!HHhi!");
    }

    @Test
    public void test5941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5941");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhhhhi!hhhihhhi!hhhi!ihhi!!hi!!ihhhhi!ihhi!!!hhhhi!ihhi!!hhhhhh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhhhhi!hhhihhhi!hhhi!ihhi!!hi!!ihhhhi!ihhi!!!hhhhi!ihhi!!hhhhhh" + "'", str1, "Hhhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhhhhi!hhhihhhi!hhhi!ihhi!!hi!!ihhhhi!ihhi!!!hhhhi!ihhi!!hhhhhh");
    }

    @Test
    public void test5942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5942");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhhhhi!hhhHhhhi!hhhihhhi!ihhi!hi!!!ihhi!!", (int) (short) -1, (int) (short) 100, "Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhhhi!hhhHhhhi!hhhihhhi!ihhi!hi!!!ihhi!!" + "'", str4, "hhhhhi!hhhHhhhi!hhhihhhi!ihhi!hi!!!ihhi!!");
    }

    @Test
    public void test5943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5943");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!Hhhhi!ihhihi!!hi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!Hhhhi!ihhihi!!hi!!" + "'", str1, "HHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!Hhhhi!ihhihi!!hi!!");
    }

    @Test
    public void test5944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5944");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hhHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!!Hhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!!Hhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!!Hhi!Ihi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test5945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5945");
        char[] charArray7 = new char[] { 'a', '4', 'a' };
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalize("", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalize("HI!", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("hh", charArray7);
        java.lang.Class<?> wildcardClass12 = charArray7.getClass();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { 'a', '4', 'a' });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HI!" + "'", str9, "HI!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hh" + "'", str11, "Hh");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test5946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5946");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("Hhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhihhhi!hhhi!hhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHI!HHHI!HHHHI!IHHI!!HHHHI!IHHIHHHI!HHHI!HHHI!IHHI!HHHHHHHHHIHH!HHHHHHHHHHHIHHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!!" + "'", str1, "hHHI!HHHI!HHHHI!IHHI!!HHHHI!IHHIHHHI!HHHI!HHHI!IHHI!HHHHHHHHHIHH!HHHHHHHHHHHIHHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!!");
    }

    @Test
    public void test5947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5947");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhhhi!ihhihhhi!hhhi!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhhi!ihhi!!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhhi!ihhihhhi!hhhi!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhhi!ihhi!!" + "'", str2, "Hhhhi!ihhihhhi!hhhi!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhhi!ihhi!!");
    }

    @Test
    public void test5948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5948");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhIhHHI!hHHI!iHHI!!", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhIhHHI!hHHI!iHHI!!" + "'", str2, "hhhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhIhHHI!hHHI!iHHI!!");
    }

    @Test
    public void test5949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5949");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hhHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!IHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!!", (int) (short) -1, "", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!IHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!!" + "'", str4, "hhHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!IHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!!");
    }

    @Test
    public void test5950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5950");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hhhhi!hhhiHhhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhhhhi!hhhihhhi!hhhi!ihhi!!hi!!ihhhhi!ihhi!!!hhhhi!ihhi!!hhhhhhhhhi!hhhihhhi!hhhi!ihhi!!i!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!hhhhi!ihhi!!!hhhhi!ihhi!!ihhhhi!ihhhhhhi!hhhihhhi!hhhi!ihhi!!i!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhihhhhi!hhhihhhi!hhhi!ihhi!!!ihhi!!!hhhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test5951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5951");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHHHHHHHHHHH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhhhhhhhhhh" + "'", str1, "Hhhhhhhhhhhhh");
    }

    @Test
    public void test5952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5952");
        char[] charArray11 = new char[] { '#', '4', '4', '4' };
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!Hhhi!Ihhi!!", charArray11);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("HhhhI!IhhI!HI!!h", charArray11);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("hHhhhi!ihhi!hi!!h", charArray11);
        java.lang.Class<?> wildcardClass19 = charArray11.getClass();
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '#', '4', '4', '4' });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hi!" + "'", str12, "Hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hi!" + "'", str13, "Hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hhhi!Hhhi!Ihhi!!" + "'", str16, "Hhhi!Hhhi!Ihhi!!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HhhhI!IhhI!HI!!h" + "'", str17, "HhhhI!IhhI!HI!!h");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hhhhhi!ihhi!hi!!h" + "'", str18, "Hhhhhi!ihhi!hi!!h");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test5953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5953");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!IhhHhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!ihHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!!", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!IhhHhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!ihHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!!" + "'", str2, "Hhhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!IhhHhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!ihHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!!");
    }

    @Test
    public void test5954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5954");
        char[] charArray7 = new char[] {};
        java.lang.String str8 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("HhHI!", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhhI!IhhI!HI!!", charArray7);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("Hhhi!ihhi!HHHi!iHHi!hi!!", charArray7);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("Hhhhi!ihhi!!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hhhhI!IhhI!HI!!" + "'", str12, "hhhhI!IhhI!HI!!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test5955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5955");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!" + "'", str1, "hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!");
    }

    @Test
    public void test5956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5956");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhhi!ihhi!Hhhhi!ihhihHHI!HHHI!HHHI!iHHI!!HHI!iHHI!HHHI!HHHI!iHHI!!HHI!hHHI!iHHI!!HHI!!", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhi!ihhi!Hhhhi!ihhihHHI!HHHI!HHHI!iHHI!!HHI!iHHI!HHHI!HHHI!iHHI!!HHI!hHHI!iHHI!!HHI!!" + "'", str2, "Hhhi!ihhi!Hhhhi!ihhihHHI!HHHI!HHHI!iHHI!!HHI!iHHI!HHHI!HHHI!iHHI!!HHI!hHHI!iHHI!!HHI!!");
    }

    @Test
    public void test5957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5957");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHI!HHI!HHHHHHI!HHHI!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!", 10, (int) (short) 100, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHI!HHI!HHHHHHI!HHHI!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!I" + "'", str4, "HHI!HHI!HHHHHHI!HHHI!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!I");
    }

    @Test
    public void test5958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5958");
        char[] charArray6 = new char[] {};
        java.lang.String str7 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray6);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.initials("", charArray6);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray6);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray6);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("h", charArray6);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Hi!" + "'", str9, "Hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "h" + "'", str11, "h");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test5959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5959");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("Hhhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!h", (int) 'a', "Hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhhhi!hhhi!hhhi!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!Hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhhhi!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!Hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhhhi!hhhi!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!h" + "'", str4, "Hhhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!Hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhhhi!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!Hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhhhi!hhhi!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!h");
    }

    @Test
    public void test5960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5960");
        char[] charArray9 = new char[] {};
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("Hi!", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray9);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("HHI!", charArray9);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("HhHHI!HHHI!Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!", charArray9);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("Hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hi!" + "'", str14, "Hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hi!" + "'", str15, "Hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HHI!" + "'", str16, "HHI!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HhHHI!HHHI!Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!" + "'", str17, "HhHHI!HHHI!Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test5961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5961");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HHHI!IHHI!HHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHHHHHHI!IHHI!hhi!Ihi!!HI!!HHHHI!IHHI!hhi!Ihi!!HI!!HHHHI!IHHI!hhi!Ihi!!HI!!IHHHI!IHHI!hhi!Ihi!!HI!!!HHHI!IHHI!hhi!Ihi!!HI!!IHHHI!IHHI!hhi!Ihi!!HI!!HHHHI!IHHI!hhi!Ihi!!HI!!HHHHI!IHHI!hhi!Ihi!!HI!!IHHHI!IHHI!hhi!Ihi!!HI!!!HHHI!IHHI!hhi!Ihi!!HI!!hHHHI!IHHI!hhi!Ihi!!HI!!iHHHI!IHHI!hhi!Ihi!!HI!!!", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHHI!IHHI!HHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHHHHHHI!IHHI!hhi!Ihi!!HI!!HHHHI!IHHI!hhi!Ihi!!HI!!HHHHI!IHHI!hhi!Ihi!!HI!!IHHHI!IHHI!hhi!Ihi!!HI!!!HHHI!IHHI!hhi!Ihi!!HI!!IHHHI!IHHI!hhi!Ihi!!HI!!HHHHI!IHHI!hhi!Ihi!!HI!!HHHHI!IHHI!hhi!Ihi!!HI!!IHHHI!IHHI!hhi!Ihi!!HI!!!HHHI!IHHI!hhi!Ihi!!HI!!hHHHI!IHHI!hhi!Ihi!!HI!!iHHHI!IHHI!hhi!Ihi!!HI!!!" + "'", str2, "HHHI!IHHI!HHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHHHHHHI!IHHI!hhi!Ihi!!HI!!HHHHI!IHHI!hhi!Ihi!!HI!!HHHHI!IHHI!hhi!Ihi!!HI!!IHHHI!IHHI!hhi!Ihi!!HI!!!HHHI!IHHI!hhi!Ihi!!HI!!IHHHI!IHHI!hhi!Ihi!!HI!!HHHHI!IHHI!hhi!Ihi!!HI!!HHHHI!IHHI!hhi!Ihi!!HI!!IHHHI!IHHI!hhi!Ihi!!HI!!!HHHI!IHHI!hhi!Ihi!!HI!!hHHHI!IHHI!hhi!Ihi!!HI!!iHHHI!IHHI!hhi!Ihi!!HI!!!");
    }

    @Test
    public void test5962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5962");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HHhhi!ihhi!hi!!", 100, "Hhhhi!ihhihHHI!HHHI!Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHhhi!ihhi!hi!!" + "'", str4, "HHhhi!ihhi!hi!!");
    }

    @Test
    public void test5963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5963");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hHhhhI!IhhhhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test5964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5964");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHHI!HHHI!hHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!!Hhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!hHHHi!iHHi!hi!!", (int) (byte) 0, 10, "hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!iHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!!HHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!iHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!!HHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!iHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!iHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!!HHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHHI!HHHI!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!iHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!!HHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!iHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!!HHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!iHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!iHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!!HHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!!" + "'", str4, "HHHI!HHHI!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!iHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!!HHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!iHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!!HHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!iHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!iHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!!HHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!!");
    }

    @Test
    public void test5965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5965");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHHHI!HHHI!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!", 100, (int) (byte) 1, "hHHhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!hHhhhi!hhhi!ihhi!!hHhhhi!hhhi!ihhi!!iHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!hHhhhi!hhhi!ihhi!!iHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHHI!HHHI!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHIhHHhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!hHhhhi!hhhi!ihhi!!hHhhhi!hhhi!ihhi!!iHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!hHhhhi!hhhi!ihhi!!iHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!!" + "'", str4, "hHHHI!HHHI!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHIhHHhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!hHhhhi!hhhi!ihhi!!hHhhhi!hhhi!ihhi!!iHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!hHhhhi!hhhi!ihhi!!iHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!!");
    }

    @Test
    public void test5966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5966");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hHHHI!HHHI!IHHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!hhhi!ihhi!!" + "'", str1, "Hhhhi!hhhi!ihhi!!");
    }

    @Test
    public void test5967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5967");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("Hhhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test5968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5968");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!ihhi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!ihhi!" + "'", str1, "HHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!ihhi!");
    }

    @Test
    public void test5969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5969");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("", (int) (short) 0, "HHhhI!IhhI!hHHHi!iHHi!hi!!HHHhhI!IhhI!hHHHi!iHHi!hi!!HHHhhI!IhhI!hHHHi!iHHi!hi!!HHHhhI!IhhI!hHHHi!iHHi!hi!!HiHhhI!IhhI!hHHHi!iHHi!hi!!H!HhhI!IhhI!hHHHi!iHHi!hi!!HiHhhI!IhhI!hHHHi!iHHi!hi!!HHHhhI!IhhI!hHHHi!iHHi!hi!!HHHhhI!IhhI!hHHHi!iHHi!hi!!HiHhhI!IhhI!hHHHi!iHHi!hi!!H!HhhI!IhhI!hHHHi!iHHi!hi!!HhHhhI!IhhI!hHHHi!iHHi!hi!!HiHhhI!IhhI!hHHHi!iHHi!hi!!H!HhhI!IhhI!hHHHi!iHHi!hi!!H!HhhI!IhhI!hHHHi!iHHi!hi!!HH", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test5970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5970");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhhhi!hhhhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhhhi!ihhi!hhi!ihi!!hi!!", (int) (byte) 1, (int) (short) 10, "hHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHHHHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!HHHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!HHHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!HHHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!IHHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!!HHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!HHHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!HHHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!HHHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!IHHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!!HHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!IHHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!HHHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!HHHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!IHHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!!HHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhhhi!hhhhHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHHHHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!HHHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!HHHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!HHHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!IHHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!!HHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!HHHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!HHHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!HHHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!IHHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!!HHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!IHHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!HHHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!HHHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!IHHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!!HHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!!" + "'", str4, "Hhhhhi!hhhhHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHHHHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!HHHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!HHHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!HHHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!IHHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!!HHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!HHHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!HHHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!HHHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!IHHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!!HHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!IHHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!HHHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!HHHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!IHHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!!HHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!!");
    }

    @Test
    public void test5971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5971");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!HHHI!IHHI!!HI!!", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!HHHI!IHHI!!HI!!" + "'", str2, "hHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!HHHI!IHHI!!HI!!");
    }

    @Test
    public void test5972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5972");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhhhi!ihhi!!", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhhi!ihhi!!" + "'", str2, "Hhhhi!ihhi!!");
    }

    @Test
    public void test5973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5973");
        char[] charArray8 = new char[] {};
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("Hh", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("HHHi!iHHi!!", charArray8);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("HHhhhi!ihhi!hi!!h", charArray8);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!hhhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!hhhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!hhhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!ihhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!!hhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!ihhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!hhhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!hhhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!ihhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!!hhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hi!" + "'", str11, "Hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hh" + "'", str13, "Hh");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HHhhhi!ihhi!hi!!h" + "'", str15, "HHhhhi!ihhi!hi!!h");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hhhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!hhhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!hhhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!hhhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!ihhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!!hhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!ihhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!hhhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!hhhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!ihhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!!hhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!!" + "'", str16, "Hhhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!hhhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!hhhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!hhhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!ihhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!!hhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!ihhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!hhhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!hhhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!ihhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!!hhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!!");
    }

    @Test
    public void test5974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5974");
        char[] charArray11 = new char[] {};
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("Hh", charArray11);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("Hi!", charArray11);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("H", charArray11);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("hHI!", charArray11);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.uncapitalize("Hh", charArray11);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.initials("hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!iHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!iHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!iHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!iHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!", charArray11);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalize("Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] {});
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hi!" + "'", str14, "Hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hh" + "'", str16, "Hh");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hi!" + "'", str17, "Hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H" + "'", str18, "H");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hHI!" + "'", str19, "hHI!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hh" + "'", str20, "Hh");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!" + "'", str22, "Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
    }

    @Test
    public void test5975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5975");
        char[] charArray10 = new char[] { '4', '4' };
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("HHi!", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("HH", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("hhI!", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!ihi!!hi!hhi!ihi!!hi!!", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("Hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("hhhi!Hhhi!Ihhi!!", charArray10);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("hhi!ihi!!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hi!" + "'", str11, "Hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hhi!" + "'", str12, "Hhi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hH" + "'", str13, "hH");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "h" + "'", str14, "h");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hhhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!ihi!!hi!hhi!ihi!!hi!!" + "'", str15, "Hhhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!ihi!!hi!hhi!ihi!!hi!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hhhi!Hhhi!Ihhi!!" + "'", str17, "hhhi!Hhhi!Ihhi!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "h" + "'", str18, "h");
    }

    @Test
    public void test5976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5976");
        char[] charArray11 = new char[] {};
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("hH", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("hI!", charArray11);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("HI!", charArray11);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("HI!", charArray11);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("hhHHi!iHHi!HHHI!IHHI!!hi!!", charArray11);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhhh", charArray11);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalize("HHHHI!HHHIHHHi!iHHi!hi!!!IHHI!!", charArray11);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalize("Hhhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhihhi!hhi!hhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] {});
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hi!" + "'", str14, "Hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hI!" + "'", str16, "hI!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HI!" + "'", str17, "HI!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HI!" + "'", str18, "HI!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hhHHi!iHHi!HHHI!IHHI!!hi!!" + "'", str19, "hhHHi!iHHi!HHHI!IHHI!!hi!!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hhhhh" + "'", str20, "hhhhh");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "HHHHI!HHHIHHHi!iHHi!hi!!!IHHI!!" + "'", str21, "HHHHI!HHHIHHHi!iHHi!hi!!!IHHI!!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Hhhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhihhi!hhi!hhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!" + "'", str22, "Hhhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhihhi!hhi!hhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
    }

    @Test
    public void test5977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5977");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihHHi!iHHi!hhhi!hhhi!hhi!hhhi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihHHi!iHHi!hhhi!hhhi!hhi!hhhi!" + "'", str1, "Hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihHHi!iHHi!hhhi!hhhi!hhi!hhhi!");
    }

    @Test
    public void test5978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5978");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hHHhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!ihHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!!", (int) (short) 1, "hhhi!hhhi!hhhi!ihi!!hhhi!ihi!!hhHhHHi!iHHi!HHHI!IHHI!!hi!!hi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhiHhHHi!iHHi!HHHI!IHHI!!hi!!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!iHhHHi!iHHi!HHHI!IHHI!!hi!!hi!!!hhi!ihi!!hhhi!ihi!!ihhi!ihiHhHHi!iHHi!HHHI!IHHI!!hi!!!!!hhi!ihi!!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!ihHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!!" + "'", str4, "hHHhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!ihHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!!");
    }

    @Test
    public void test5979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5979");
        char[] charArray8 = new char[] {};
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("h", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("Hhi!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhHhh", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!hhhi!ihhi!hhhi!ihhi!hhhi!ihhi!!hi!!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhihhhi!ihhi!hhhi!ihhi!hhhi!ihhi!!hi!!!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhhhhi!ihhi!hhhi!ihhi!hhhi!ihhi!!hi!!i!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhhhi!ihhi!hhhi!ihhi!hhhi!ihhi!!hi!!hi!!ihhhi!ihhi!!!hhhi!ihhi!!!", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("Hhhhi!hhhihhhhi!!ihhi!!", charArray8);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!h!", charArray8);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HhHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!IHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!!HHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hhi!" + "'", str11, "Hhi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!hhhi!ihhi!hhhi!ihhi!hhhi!ihhi!!hi!!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhihhhi!ihhi!hhhi!ihhi!hhhi!ihhi!!hi!!!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhhhhi!ihhi!hhhi!ihhi!hhhi!ihhi!!hi!!i!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhhhi!ihhi!hhhi!ihhi!hhhi!ihhi!!hi!!hi!!ihhhi!ihhi!!!hhhi!ihhi!!!" + "'", str13, "Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!hhhi!ihhi!hhhi!ihhi!hhhi!ihhi!!hi!!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhihhhi!ihhi!hhhi!ihhi!hhhi!ihhi!!hi!!!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhhhhi!ihhi!hhhi!ihhi!hhhi!ihhi!!hi!!i!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhhhi!ihhi!hhhi!ihhi!hhhi!ihhi!!hi!!hi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hhhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!h!" + "'", str15, "Hhhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!h!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HhHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!IHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!!HHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!" + "'", str16, "HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HhHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!IHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!!HHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!");
    }

    @Test
    public void test5980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5980");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hHhhhi!ihhi!hi!!h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HhHHHI!IHHI!HI!!H" + "'", str1, "HhHHHI!IHHI!HI!!H");
    }

    @Test
    public void test5981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5981");
        char[] charArray12 = new char[] { '#', '4', '4', '4' };
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray12);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray12);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("", charArray12);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("HHi!", charArray12);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray12);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!ihhi!!", charArray12);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhi!hhhihhhi!hhhi!ihhi!!", charArray12);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.initials("HHHhhhi!ihhi!hi!!hhHHhhhi!ihhi!hi!!hhHHhhhi!ihhi!hi!!hiHHhhhi!ihhi!hi!!h!HHhhhi!ihhi!hi!!hiHHhhhi!ihHhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!!", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '#', '4', '4', '4' });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hi!" + "'", str13, "Hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hi!" + "'", str14, "Hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hhhi!ihhi!!" + "'", str18, "Hhhi!ihhi!!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Hhhhi!hhhihhhi!hhhi!ihhi!!" + "'", str19, "Hhhhi!hhhihhhi!hhhi!ihhi!!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H" + "'", str20, "H");
    }

    @Test
    public void test5982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5982");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HhHHI!HHHI!HHHI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhHHI!HHHI!HHHI!" + "'", str1, "hhHHI!HHHI!HHHI!");
    }

    @Test
    public void test5983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5983");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHHHI!IHHI!HI!!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHHHI!IHHI!HI!!" + "'", str2, "hHHHI!IHHI!HI!!");
    }

    @Test
    public void test5984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5984");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HhHHi!iHHi!!hhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!IhHHi!iHHi!!!hHHi!iHHi!!IhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!IhHHi!iHHi!!!hHHi!iHHi!!!hHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!IhHHi!iHHi!!!hHHi!iHHi!!IhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!IhHHi!iHHi!!!hHHi!iHHi!!!hHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!IhHHi!iHHi!!!hHHi!iHHi!!IhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!IhHHi!iHHi!!!hHHi!iHHi!!!hHHi!iHHi!!ihHHi!iHHi!!hhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!IhHHi!iHHi!!!hHHi!iHHi!!IhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!IhHHi!iHHi!!!hHHi!iHHi!!!hHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhHHi!iHHi!!hhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!IhHHi!iHHi!!!hHHi!iHHi!!IhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!IhHHi!iHHi!!!hHHi!iHHi!!!hHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!IhHHi!iHHi!!!hHHi!iHHi!!IhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!IhHHi!iHHi!!!hHHi!iHHi!!!hHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!IhHHi!iHHi!!!hHHi!iHHi!!IhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!IhHHi!iHHi!!!hHHi!iHHi!!!hHHi!iHHi!!ihHHi!iHHi!!hhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!IhHHi!iHHi!!!hHHi!iHHi!!IhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!IhHHi!iHHi!!!hHHi!iHHi!!!hHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!" + "'", str1, "hhHHi!iHHi!!hhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!IhHHi!iHHi!!!hHHi!iHHi!!IhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!IhHHi!iHHi!!!hHHi!iHHi!!!hHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!IhHHi!iHHi!!!hHHi!iHHi!!IhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!IhHHi!iHHi!!!hHHi!iHHi!!!hHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!IhHHi!iHHi!!!hHHi!iHHi!!IhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!IhHHi!iHHi!!!hHHi!iHHi!!!hHHi!iHHi!!ihHHi!iHHi!!hhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!IhHHi!iHHi!!!hHHi!iHHi!!IhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!IhHHi!iHHi!!!hHHi!iHHi!!!hHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!");
    }

    @Test
    public void test5985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5985");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhI!HhI!HhI!HhI!ihI!!hI!ihI!HhI!HhIHhhhhhhhhhhhhhhhihhh!hhhhhhhhhhhhhhhihhh!hhhihhhhhhhhhhhihhh!hhh!", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhI!HhI!HhI!HhI!ihI!!hI!ihI!HhI!HhIHhhhhhhhhhhhhhhhihhh!hhhhhhhhhhhhhhhihhh!hhhihhhhhhhhhhhihhh!hhh!" + "'", str2, "hhI!HhI!HhI!HhI!ihI!!hI!ihI!HhI!HhIHhhhhhhhhhhhhhhhihhh!hhhhhhhhhhhhhhhihhh!hhhihhhhhhhhhhhihhh!hhh!");
    }

    @Test
    public void test5986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5986");
        char[] charArray11 = new char[] {};
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("hi!", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray11);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray11);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray11);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("hhi!", charArray11);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("HHHHI!HHHIHHHI!HHHI!IHHI!!", charArray11);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalize("HHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhhHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!!", charArray11);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.initials("hHHHI!IHHIHHHI!HHHI!IHHI!!!HI!!H", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] {});
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hi!" + "'", str15, "Hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hi!" + "'", str17, "Hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hI!" + "'", str18, "hI!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hhi!" + "'", str19, "hhi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HHHHI!HHHIHHHI!HHHI!IHHI!!" + "'", str20, "HHHHI!HHHIHHHI!HHHI!IHHI!!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "HHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhhHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!!" + "'", str21, "HHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhhHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test5987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5987");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("Hhhhhi!ihhihhhhi!hhhi!ihhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHHHI!IHHIHHHHI!HHHI!IHHI!!" + "'", str1, "hHHHHI!IHHIHHHHI!HHHI!IHHI!!");
    }

    @Test
    public void test5988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5988");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhhhi!ihhihhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhihhhhi!ihhi!hi!!h", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhhi!ihhihhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhihhhhi!ihhi!hi!!h" + "'", str2, "Hhhhi!ihhihhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhihhhhi!ihhi!hi!!h");
    }

    @Test
    public void test5989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5989");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHI!IHHI!Hhhhhi!hhhhhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhi!Ihi!!HHhhhhi!hhhhhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!I!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!ihhi!hhhhhi!hhhhhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhi!ihi!!hhhhhhi!hhhhhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!i!!" + "'", str1, "Hhhi!ihhi!hhhhhi!hhhhhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhi!ihi!!hhhhhhi!hhhhhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!i!!");
    }

    @Test
    public void test5990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5990");
        char[] charArray9 = new char[] {};
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray9);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("HHHi!iHHi!!", charArray9);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("HhHHHI!IHHI!!hhHHHI!IHHI!!hhHHHI!IHhHHHI!HHHIhHHI!HHHI!IHHI!!HI!!ihHHHI!IHHI!!!hHHHI!IHHI!!hhHHHhHHHI!HHHIhHHI!HHHI!IHHI!!I!IHHI!!hhHHHI!IHHI!!hhHHHI!IHHI!!ihHHHI!HHHIhHHI!HHHI!IHHI!!hHHHI!IHHI!!!hHHHI!IHHI!!ihHHHI!IHHhHHHI!HHHIhHHI!HHHI!IHHI!!I!!hhHHHI!IHHI!!hhHHHI!IHHI!!ihHHHIhHHHI!HHHIhHHI!HHHI!IHHI!!!IHHI!!!hHHHI!IHHI!!!", charArray9);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("HHHHI!hHHI!hHi!HHhi!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hi!" + "'", str13, "Hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hi!" + "'", str15, "Hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HHHi!iHHi!!" + "'", str16, "HHHi!iHHi!!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HHHHI!hHHI!hHi!HHhi!" + "'", str18, "HHHHI!hHHI!hHi!HHhi!");
    }

    @Test
    public void test5991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5991");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhi!ihhi!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!ihhi!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!" + "'", str1, "Hhhi!ihhi!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!");
    }

    @Test
    public void test5992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5992");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhHHHi!iHHi!hHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!" + "'", str1, "Hhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!");
    }

    @Test
    public void test5993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5993");
        char[] charArray12 = new char[] {};
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray12);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("", charArray12);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray12);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray12);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("HhhI!IhhI!!", charArray12);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHi!iHHi!hi!!", charArray12);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray12);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHI!hHHI!iHHI!!", charArray12);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.initials("Hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!h", charArray12);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.initials("Hhhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!h!", charArray12);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.initials("hhhI!IhhI!HI!!", charArray12);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.uncapitalize("HhHhhi!ihhhHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHHHHI!IHHI!HHI!IHI!!HI!!", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] {});
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HhhI!IhhI!!" + "'", str17, "HhhI!IhhI!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HHHi!iHHi!hi!!" + "'", str18, "HHHi!iHHi!hi!!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hHHI!hHHI!iHHI!!" + "'", str20, "hHHI!hHHI!iHHI!!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "HhHhhi!ihhhHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHHHHI!IHHI!HHI!IHI!!HI!!" + "'", str24, "HhHhhi!ihhhHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHHHHI!IHHI!HHI!IHI!!HI!!");
    }

    @Test
    public void test5994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5994");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HhhI!IhhI!hHHHi!iHHi!hi!!H", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HhhI!IhhI!hHHHi!iHHi!hi!!H" + "'", str2, "HhhI!IhhI!hHHHi!iHHi!hi!!H");
    }

    @Test
    public void test5995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5995");
        char[] charArray9 = new char[] {};
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("h", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("hhi!", charArray9);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!ihhi!HHI!iHI!!hi!!", charArray9);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("HhHhhi!ihhhHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHHHHI!IHHI!HHI!IHI!!HI!!", charArray9);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("Hhhi!ihhi!hhhhi!ihhi!hhhi!ihhi!!hi!!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hi!" + "'", str12, "Hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "h" + "'", str14, "h");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hhhi!ihhi!HHI!iHI!!hi!!" + "'", str16, "Hhhi!ihhi!HHI!iHI!!hi!!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test5996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5996");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!hhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!HhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!HhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!HhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!IhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!!hHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!IhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!HhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!HhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!IhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!!hHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!HhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!IhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!!hHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!!hHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!hhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!HhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!HhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!HhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!IhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!!hHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!IhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!HhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!HhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!IhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!!hHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!HhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!IhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!!hHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!!hHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!H" + "'", str1, "hhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!hhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!HhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!HhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!HhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!IhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!!hHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!IhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!HhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!HhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!IhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!!hHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!HhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!IhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!!hHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!!hHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!H");
    }

    @Test
    public void test5997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5997");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhhi!hhhi!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhi!hhhi!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!" + "'", str2, "Hhhi!hhhi!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
    }

    @Test
    public void test5998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5998");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hHHHI!IHHIHHHi!iHHi!hHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHHI!IHHIHHHi!iHHi!hHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!" + "'", str1, "hHHHI!IHHIHHHi!iHHi!hHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!");
    }

    @Test
    public void test5999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5999");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("", (int) (byte) 1, (int) (byte) 0, "hhhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhhhhi!hhhihhhi!hhhi!ihhi!!hi!!ihhhhi!ihhi!!!hhhhi!ihhi!!hhhhhh");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test6000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test6000");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HHI!HHI!HHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!!HI!HHI!HHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!!HI!HHI!HHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!!HI!IHI!HHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!!HI!!HI!HHI!HHI!HHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!!HI!HHI!HHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!!HI!HHI!HHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!!HI!IHI!HHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!!HI!!HI!HHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!HHI!HHI!IHI!!HI!IHI!HHI!IHI!!HI!!HI!HHI!IHI!!HI!!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHI!HHI!HHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!!HI!HHI!HHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!!HI!HHI!HHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!!HI!IHI!HHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!!HI!!HI!HHI!HHI!HHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!!HI!HHI!HHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!!HI!HHI!HHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!!HI!IHI!HHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!!HI!!HI!HHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!HHI!HHI!IHI!!HI!IHI!HHI!IHI!!HI!!HI!HHI!IHI!!HI!!" + "'", str2, "HHI!HHI!HHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!!HI!HHI!HHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!!HI!HHI!HHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!!HI!IHI!HHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!!HI!!HI!HHI!HHI!HHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!!HI!HHI!HHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!!HI!HHI!HHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!!HI!IHI!HHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!!HI!!HI!HHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!HHI!HHI!IHI!!HI!IHI!HHI!IHI!!HI!!HI!HHI!IHI!!HI!!");
    }
}

