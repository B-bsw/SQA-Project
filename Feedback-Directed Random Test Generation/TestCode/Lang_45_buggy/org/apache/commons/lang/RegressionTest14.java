package org.apache.commons.lang;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest14 {

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
    public void test7001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7001");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hHhhhi!ihhiHHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!iHHHI!hHHI!iHHIhhhhI!IhhI!HI!!h", (int) 'a', "HHhhi!hHhhi!hHhhi!iHhhi!!Hhhi!iHhhi!hHhhi!hHhhi!iHhhi!!Hhhi!hHhhi!hHhhi!hHhhi!iHhhi!!Hhhi!iHhhi!hHhhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!i!hHhhi!iHhhi!!Hhhi!!Hhhi!hHhhi!iHhhi!!Hhhi!!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHhhhi!ihhiHHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!iHHhhi!hHhhi!hHhhi!iHhhi!!Hhhi!iHhhi!hHhhi!hHhhi!iHhhi!!Hhhi!hHhhi!hHhhi!hHhhi!iHhhi!!Hhhi!iHhhi!hHhhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!i!hHhhi!iHhhi!!Hhhi!!Hhhi!hHhhi!iHhhi!!Hhhi!!HHHI!hHHI!iHHIhhhhI!IhhI!HI!!h" + "'", str4, "hHhhhi!ihhiHHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!iHHhhi!hHhhi!hHhhi!iHhhi!!Hhhi!iHhhi!hHhhi!hHhhi!iHhhi!!Hhhi!hHhhi!hHhhi!hHhhi!iHhhi!!Hhhi!iHhhi!hHhhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!i!hHhhi!iHhhi!!Hhhi!!Hhhi!hHhhi!iHhhi!!Hhhi!!HHHI!hHHI!iHHIhhhhI!IhhI!HI!!h");
    }

    @Test
    public void test7002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7002");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHHHI!IHHIhHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!", 100, (int) (byte) 100, "hHhhhi!ihhi!!HHhhhi!ihhi!!HHhhhi!ihHhhhi!hhhiHhhi!hhhi!ihhi!!hi!!IHhhhi!ihhi!!!Hhhhi!ihhi!!HHhhhHhhhi!hhhiHhhi!hhhi!ihhi!!i!ihhi!!HHhhhi!ihhi!!HHhhhi!ihhi!!IHhhhi!hhhiHhhi!hhhi!ihhi!!Hhhhi!ihhi!!!Hhhhi!ihhi!!IHhhhi!ihhHhhhi!hhhiHhhi!hhhi!ihhi!!i!!HHhhhi!ihhi!!HHhhhi!ihhi!!IHhhhiHhhhi!hhhiHhhi!hhhi!ihhi!!!ihhi!!!Hhhhi!ihhi!!!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end 100, length 56");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7003");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!H" + "'", str1, "HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!H");
    }

    @Test
    public void test7004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7004");
        char[] charArray8 = new char[] {};
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("hi!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHHHI!IHHI!HI!!H", charArray8);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("HH", charArray8);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihhhhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!!hh!", charArray8);
        java.lang.Class<?> wildcardClass17 = charArray8.getClass();
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HI!" + "'", str12, "HI!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HI!" + "'", str13, "HI!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HHHHHI!IHHI!HI!!H" + "'", str14, "HHHHHI!IHHI!HI!!H");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HH" + "'", str15, "HH");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihhhhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!!hh!" + "'", str16, "Hhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihhhhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!!hh!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test7005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7005");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhhhhhhi!ihhhhhhhi!ihhhhhhi!ihhihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!i!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhhhhhi!ihhhhhhhi!ihhhhhhi!ihhihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!hhhhhi!ihhhhhhhi!ihhhhhhi!ihhihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!hhhi!ihhi!!!", 10, "Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhhhhhhi!ihhhhhhhi!ihhhhhhi!ihhihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!i!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhhhhhi!ihhhhhhhi!ihhhhhhi!ihhihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!hhhhhi!ihhhhhhhi!ihhhhhhi!ihhihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!hhhi!ihhi!!!" + "'", str4, "hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhhhhhhi!ihhhhhhhi!ihhhhhhi!ihhihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!i!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhhhhhi!ihhhhhhhi!ihhhhhhi!ihhihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!hhhhhi!ihhhhhhhi!ihhhhhhi!ihhihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!hhhi!ihhi!!!");
    }

    @Test
    public void test7006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7006");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HIHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!H!HHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HIHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!H!HHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HIHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HIHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!H!HHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!H!", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HIHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!H!HHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HIHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!H!HHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HIHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HIHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!H!HHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!H!" + "'", str2, "hHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HIHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!H!HHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HIHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!H!HHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HIHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HIHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!H!HHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!H!");
    }

    @Test
    public void test7007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7007");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HHhhi!ihhi!hi!!HHhhi!ihhi!hi!!HHhhi!ihhi!hi!!IHhhi!ihhi!hi!!!Hhhi!ihhi!hi!!IHhhi!ihhi!hi!!HHhhi!ihhiHHHI!hHHI!hHi!HHhi!!hi!!HHhhi!ihhi!hi!!IHhhi!ihhi!hi!!!Hhhi!ihhi!hi!!HHhhi!ihhi!hi!!HHhhi!ihhi!hi!!HHhhi!ihhi!hi!!HHhhiHHHI!hHHI!hHi!HHhi!!ihhi!hi!!IHhhi!ihhi!hi!!!Hhhi!ihhi!hi!!IHhhi!ihhi!hi!!HHhhi!ihhi!hi!!HHhhi!ihhi!hi!!IHhhi!ihhi!hi!!HHHI!hHHI!hHi!HHhi!!Hhhi!ihhi!hi!!HHhhi!ihhi!hi!!IHhhi!ihhi!hi!!!Hhhi!ihhi!hi!!!Hhhi!ihhi!hi!!H", 10, "hHHI!HHHI!IHHI!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHhhi!ihhi!hi!!HHhhi!ihhi!hi!!HHhhi!ihhi!hi!!IHhhi!ihhi!hi!!!Hhhi!ihhi!hi!!IHhhi!ihhi!hi!!HHhhi!ihhiHHHI!hHHI!hHi!HHhi!!hi!!HHhhi!ihhi!hi!!IHhhi!ihhi!hi!!!Hhhi!ihhi!hi!!HHhhi!ihhi!hi!!HHhhi!ihhi!hi!!HHhhi!ihhi!hi!!HHhhiHHHI!hHHI!hHi!HHhi!!ihhi!hi!!IHhhi!ihhi!hi!!!Hhhi!ihhi!hi!!IHhhi!ihhi!hi!!HHhhi!ihhi!hi!!HHhhi!ihhi!hi!!IHhhi!ihhi!hi!!HHHI!hHHI!hHi!HHhi!!Hhhi!ihhi!hi!!HHhhi!ihhi!hi!!IHhhi!ihhi!hi!!!Hhhi!ihhi!hi!!!Hhhi!ihhi!hi!!H" + "'", str4, "HHhhi!ihhi!hi!!HHhhi!ihhi!hi!!HHhhi!ihhi!hi!!IHhhi!ihhi!hi!!!Hhhi!ihhi!hi!!IHhhi!ihhi!hi!!HHhhi!ihhiHHHI!hHHI!hHi!HHhi!!hi!!HHhhi!ihhi!hi!!IHhhi!ihhi!hi!!!Hhhi!ihhi!hi!!HHhhi!ihhi!hi!!HHhhi!ihhi!hi!!HHhhi!ihhi!hi!!HHhhiHHHI!hHHI!hHi!HHhi!!ihhi!hi!!IHhhi!ihhi!hi!!!Hhhi!ihhi!hi!!IHhhi!ihhi!hi!!HHhhi!ihhi!hi!!HHhhi!ihhi!hi!!IHhhi!ihhi!hi!!HHHI!hHHI!hHi!HHhi!!Hhhi!ihhi!hi!!HHhhi!ihhi!hi!!IHhhi!ihhi!hi!!!Hhhi!ihhi!hi!!!Hhhi!ihhi!hi!!H");
    }

    @Test
    public void test7008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7008");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHhhI!IhhI!!HHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!iHhhI!IhhI!!!HhhI!IhhI!!iHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!iHhhI!IhhI!!!HhhI!IhhI!!!HhhI!IhhI!!HHhhI!IhhI!!HHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!iHhhI!IhhI!!!HhhI!IhhI!!iHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!iHhhI!IhhI!!!HhhI!IhhI!!!HhhI!IhhI!!HHhhI!IhhI!!HHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!iHhhI!IhhI!!!HhhI!IhhI!!iHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!iHhhI!IhhI!!!HhhI!IhhI!!!HhhI!IhhI!!IHhhI!IhhI!!HHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!iHhhI!IhhI!!!HhhI!IhhI!!iHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!iHhhI!IhhI!!!HhhI!IhhI!!!HhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!HHhhI!IhhI!!IHhhI!IhhI!!!", 0, (-1), "HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!h");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHhhI!IhhI!!HHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!iHhhI!IhhI!!!HhhI!IhhI!!iHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!iHhhI!IhhI!!!HhhI!IhhI!!!HhhI!IhhI!!HHhhI!IhhI!!HHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!iHhhI!IhhI!!!HhhI!IhhI!!iHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!iHhhI!IhhI!!!HhhI!IhhI!!!HhhI!IhhI!!HHhhI!IhhI!!HHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!iHhhI!IhhI!!!HhhI!IhhI!!iHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!iHhhI!IhhI!!!HhhI!IhhI!!!HhhI!IhhI!!IHhhI!IhhI!!HHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!iHhhI!IhhI!!!HhhI!IhhI!!iHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!iHhhI!IhhI!!!HhhI!IhhI!!!HhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!HHhhI!IhhI!!IHhhI!IhhI!!!" + "'", str4, "HHhhI!IhhI!!HHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!iHhhI!IhhI!!!HhhI!IhhI!!iHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!iHhhI!IhhI!!!HhhI!IhhI!!!HhhI!IhhI!!HHhhI!IhhI!!HHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!iHhhI!IhhI!!!HhhI!IhhI!!iHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!iHhhI!IhhI!!!HhhI!IhhI!!!HhhI!IhhI!!HHhhI!IhhI!!HHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!iHhhI!IhhI!!!HhhI!IhhI!!iHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!iHhhI!IhhI!!!HhhI!IhhI!!!HhhI!IhhI!!IHhhI!IhhI!!HHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!iHhhI!IhhI!!!HhhI!IhhI!!iHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!iHhhI!IhhI!!!HhhI!IhhI!!!HhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!HHhhI!IhhI!!IHhhI!IhhI!!!");
    }

    @Test
    public void test7009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7009");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hhhi!hhhi!hhhi!hhhi!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHI!HHHI!HHHI!HHHI!HHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!" + "'", str1, "HHHI!HHHI!HHHI!HHHI!HHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!");
    }

    @Test
    public void test7010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7010");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hHhhhi!ihhihhhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhhhhi!hhhihhhi!hhhi!ihhi!!hi!!ihhhhi!ihhi!!!hhhhi!ihhi!!hhhhhhhhhi!hhhihhhi!hhhi!ihhi!!i!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!hhhhi!ihhi!!!hhhhi!ihhi!!ihhhhi!ihhhhhhi!hhhihhhi!hhhi!ihhi!!i!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhihhhhi!hhhihhhi!hhhi!ihhi!!!ihhi!!!hhhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHhhhi!ihhihhhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhhhhi!hhhihhhi!hhhi!ihhi!!hi!!ihhhhi!ihhi!!!hhhhi!ihhi!!hhhhhhhhhi!hhhihhhi!hhhi!ihhi!!i!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!hhhhi!ihhi!!!hhhhi!ihhi!!ihhhhi!ihhhhhhi!hhhihhhi!hhhi!ihhi!!i!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhihhhhi!hhhihhhi!hhhi!ihhi!!!ihhi!!!hhhhi!ihhi!!!" + "'", str1, "hHhhhi!ihhihhhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhhhhi!hhhihhhi!hhhi!ihhi!!hi!!ihhhhi!ihhi!!!hhhhi!ihhi!!hhhhhhhhhi!hhhihhhi!hhhi!ihhi!!i!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!hhhhi!ihhi!!!hhhhi!ihhi!!ihhhhi!ihhhhhhi!hhhihhhi!hhhi!ihhi!!i!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhihhhhi!hhhihhhi!hhhi!ihhi!!!ihhi!!!hhhhi!ihhi!!!");
    }

    @Test
    public void test7011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7011");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hHHHI!IHHIHHHHHI!IHHI!!HHHHHI!IHHI!!HHHHHI!IHHHHHI!HHHIHHHI!HHHI!IHHI!!HI!!IHHHHI!IHHI!!!HHHHI!IHHI!!HHHHHHHHHI!HHHIHHHI!HHHI!IHHI!!I!IHHI!!HHHHHI!IHHI!!HHHHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHI!IHHI!!!HHHHI!IHHI!!IHHHHI!IHHHHHHI!HHHIHHHI!HHHI!IHHI!!I!!HHHHHI!IHHI!!HHHHHI!IHHI!!IHHHHIHHHHI!HHHIHHHI!HHHI!IHHI!!!IHHI!!!HHHHI!IHHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test7012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7012");
        char[] charArray8 = new char[] {};
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("Hh", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("HHhhhi!ihhi!hi!!h", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("HhI!HhI!HhI!HhI!ihI!!hI!ihI!HhI!HhI!ihI!!hI!hhI!ihI!!hI!!", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("HhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!", charArray8);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHHHHI!IHHI!HHI!IHI!!HI!!", charArray8);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("hHhhi!ihhihhhhhI!Ihhhhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hh" + "'", str11, "Hh");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!" + "'", str14, "HhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHHHHI!IHHI!HHI!IHI!!HI!!" + "'", str15, "hHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHHHHI!IHHI!HHI!IHI!!HI!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hHhhi!ihhihhhhhI!Ihhhhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!" + "'", str16, "hHhhi!ihhihhhhhI!Ihhhhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!");
    }

    @Test
    public void test7013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7013");
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
        java.lang.String str21 = org.apache.commons.lang.WordUtils.uncapitalize("HHHHI!IHHI!HHHI!IHHI!!HI!!", charArray11);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalizeFully("HhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!ihHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!!", charArray11);
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "HHHHI!IHHI!HHHI!IHHI!!HI!!" + "'", str21, "HHHHI!IHHI!HHHI!IHHI!!HI!!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "HhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!ihHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!!" + "'", str22, "HhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!ihHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!!");
    }

    @Test
    public void test7014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7014");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhi!ihhi!!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhi!ihhi!!!hhhhi!ihhi!!ihhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhi!ihhi!!!hhhhi!ihhi!!!", (int) (byte) 0, 10, "HHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!HHHI!IHHI!!HI!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhhhi!ihhHHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!HHHI!IHHI!!HI!!" + "'", str4, "Hhhhhi!ihhHHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!HHHI!IHHI!!HI!!");
    }

    @Test
    public void test7015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7015");
        char[] charArray11 = new char[] {};
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("hi!", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("", charArray11);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("HI!", charArray11);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("hH", charArray11);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray11);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.initials("Hhi!", charArray11);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHiHhhi!Hhhi!Ihhi!!", charArray11);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHI!HHHI!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!HhHhhhi!ihhi!HHHi!iHHi!hi!!", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] {});
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HI!" + "'", str15, "HI!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HI!" + "'", str17, "HI!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hH" + "'", str18, "hH");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHiHhhi!Hhhi!Ihhi!!" + "'", str21, "hHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHiHhhi!Hhhi!Ihhi!!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hHHI!HHHI!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!HhHhhhi!ihhi!HHHi!iHHi!hi!!" + "'", str22, "hHHI!HHHI!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!HhHhhhi!ihhi!HHHi!iHHi!hi!!");
    }

    @Test
    public void test7016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7016");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("Hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhhhi!hhhi!hhhi!", (int) (short) 10, "hHhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!H", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhhi!hhhihHhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!H!ihhi!!hhhhHhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!Hhi!hhhi!ihhHhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!Hhi!!hhhhi!hHhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!Hhhhi!ihhi!hHhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!H!hhhhi!hhhhHhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!Hi!ihhi!!hhhHhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!Hhhi!hhhi!ihHhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!Hhhi!!ihhhihHhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!H!hhhi!ihhhhHhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!Hhi!hhhi!hhhHhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!Hhi!" + "'", str4, "Hhhhi!hhhihHhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!H!ihhi!!hhhhHhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!Hhi!hhhi!ihhHhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!Hhi!!hhhhi!hHhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!Hhhhi!ihhi!hHhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!H!hhhhi!hhhhHhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!Hi!ihhi!!hhhHhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!Hhhi!hhhi!ihHhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!Hhhi!!ihhhihHhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!H!hhhi!ihhhhHhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!Hhi!hhhi!hhhHhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!Hhi!");
    }

    @Test
    public void test7017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7017");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!IHhhi!ihhi!HHI!iHI!!hi!!!Hhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!IHhhi!ihhi!HHI!iHI!!hi!!!Hhhi!ihhi!HHI!iHI!!hi!!IHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!IHhhi!ihhi!HHI!iHI!!hi!!!Hhhi!ihhi!HHI!iHI!!hi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!IHhhi!ihhi!HHI!iHI!!hi!!!Hhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!IHhhi!ihhi!HHI!iHI!!hi!!!Hhhi!ihhi!HHI!iHI!!hi!!IHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!IHhhi!ihhi!HHI!iHI!!hi!!!Hhhi!ihhi!HHI!iHI!!hi!!!" + "'", str1, "HHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!IHhhi!ihhi!HHI!iHI!!hi!!!Hhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!IHhhi!ihhi!HHI!iHI!!hi!!!Hhhi!ihhi!HHI!iHI!!hi!!IHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!IHhhi!ihhi!HHI!iHI!!hi!!!Hhhi!ihhi!HHI!iHI!!hi!!!");
    }

    @Test
    public void test7018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7018");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HHhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HhHHHHI!IHHHHHI!IHHI!HHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HhHHHHI!IHHHHHI!IHHI!HHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!" + "'", str1, "hHhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HhHHHHI!IHHHHHI!IHHI!HHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!");
    }

    @Test
    public void test7019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7019");
        char[] charArray11 = new char[] {};
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("", charArray11);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("Hi!", charArray11);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray11);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.uncapitalize("hHHi!iHHi!!", charArray11);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.uncapitalize("hhHHHI!IHHI!HI!!H", charArray11);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!hhhi!HhHHHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!HHI!IHI!!HI!!", charArray11);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray11);
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hhHHHI!IHHI!HI!!H" + "'", str20, "hhHHHI!IHHI!HI!!H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Hhhi!hhhi!HhHHHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!HHI!IHI!!HI!!" + "'", str21, "Hhhi!hhhi!HhHHHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!HHI!IHI!!HI!!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test7020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7020");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HHHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!iHhi!Ihi!!!Hhi!Ihi!!iHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!!Hhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!!Hhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!!Hhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!!Hhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!!Hhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!iHhi!Ihi!!!Hhi!Ihi!!iHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!!Hhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!!Hhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!!Hhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!!Hhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!!Hhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!!" + "'", str1, "hHHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!iHhi!Ihi!!!Hhi!Ihi!!iHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!!Hhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!!Hhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!!Hhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!!Hhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!!Hhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!!");
    }

    @Test
    public void test7021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7021");
        char[] charArray9 = new char[] { '#', '4', '4', '4' };
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!hhhi!hhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihhhhi!hhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '#', '4', '4', '4' });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hi!" + "'", str10, "Hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hi!" + "'", str11, "Hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H" + "'", str13, "H");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hhhi!hhhi!hhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihhhhi!hhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi" + "'", str14, "hhhi!hhhi!hhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihhhhi!hhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi");
    }

    @Test
    public void test7022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7022");
        char[] charArray8 = new char[] {};
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("hi!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("hHHI!hHHI!iHHI!!", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhi!hhhi!ihhi!!", charArray8);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("HhHHi!iHHi!HHHI!IHHI!!hi!!", charArray8);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHHHI!HHHhHhhhI!IhhhhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hi!" + "'", str12, "Hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hHHI!hHHI!iHHI!!" + "'", str13, "hHHI!hHHI!iHHI!!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hhhi!hhhi!ihhi!!" + "'", str14, "hhhi!hhhi!ihhi!!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HhHHi!iHHi!HHHI!IHHI!!hi!!" + "'", str15, "HhHHi!iHHi!HHHI!IHHI!!hi!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hHHHHI!HHHhHhhhI!IhhhhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!!" + "'", str16, "hHHHHI!HHHhHhhhI!IhhhhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!!");
    }

    @Test
    public void test7023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7023");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!ihhi!hhhhi!ihhihhhhi!hhhi!ihhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!ihhi!hhhhi!ihhihhhhi!hhhi!ihhi!!" + "'", str1, "Hhhi!ihhi!hhhhi!ihhihhhhi!hhhi!ihhi!!");
    }

    @Test
    public void test7024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7024");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!HHI!IHI!!HI!!", (int) (short) 100, 1, "Hhhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhihhhhi!ihhi!hi!!h");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end 100, length 54");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7025");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("Hhhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhhhhi!hhhi!hhhi!i!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhhhi!hhhi!hhhi!hi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhhi!hhhi!hhhi!hhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!hhhi!hhhi!hhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhihhhi!hhhi!hhhi!!ihhi!!!hhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhhhhi!hhhi!hhhi!i!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhhhi!hhhi!hhhi!hi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhhi!hhhi!hhhi!hhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!hhhi!hhhi!hhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhihhhi!hhhi!hhhi!!ihhi!!!hhhi!ihhi!!!" + "'", str1, "Hhhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhhhhi!hhhi!hhhi!i!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhhhi!hhhi!hhhi!hi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhhi!hhhi!hhhi!hhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!hhhi!hhhi!hhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhihhhi!hhhi!hhhi!!ihhi!!!hhhi!ihhi!!!");
    }

    @Test
    public void test7026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7026");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!" + "'", str1, "Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
    }

    @Test
    public void test7027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7027");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HHhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihhhhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!!hh!H", 0, "Hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihhhhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!!hh!H" + "'", str4, "HHhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihhhhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!!hh!H");
    }

    @Test
    public void test7028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7028");
        char[] charArray6 = new char[] {};
        java.lang.String str7 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray6);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.initials("", charArray6);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray6);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray6);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("hhI!", charArray6);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!", charArray6);
        java.lang.Class<?> wildcardClass13 = charArray6.getClass();
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!" + "'", str12, "hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test7029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7029");
        char[] charArray10 = new char[] { '#', '4', '4', '4' };
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!Hhhi!Ihhi!!", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("HhhhI!IhhI!HI!!h", charArray10);
        java.lang.Class<?> wildcardClass17 = charArray10.getClass();
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '#', '4', '4', '4' });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hi!" + "'", str11, "Hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hi!" + "'", str12, "Hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H" + "'", str14, "H");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hhhi!Hhhi!Ihhi!!" + "'", str15, "Hhhi!Hhhi!Ihhi!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HhhhI!IhhI!HI!!h" + "'", str16, "HhhhI!IhhI!HI!!h");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test7030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7030");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!hHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!IHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!hHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!IHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!!" + "'", str2, "hHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!hHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!IHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!!");
    }

    @Test
    public void test7031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7031");
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
        java.lang.String str29 = org.apache.commons.lang.WordUtils.uncapitalize("hhhi!hhhi!hhhi!Ihhi!!hhi!Ihhi!hhhi!Hhhi!hhhi!hhhi!", charArray16);
        java.lang.String str30 = org.apache.commons.lang.WordUtils.initials("HhHhhi!ihhhHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHHHHI!IHHI!HHI!IHI!!HI!!", charArray16);
        java.lang.String str31 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!IHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!!", charArray16);
        java.lang.String str32 = org.apache.commons.lang.WordUtils.initials("HHhhi!ihhi!hi!!HHhhi!ihhi!hi!!HHhhi!ihhi!hi!!IHhhi!ihhi!hi!!!Hhhi!ihhi!hi!!IHhhi!ihhi!hi!!HHhhi!ihhihHHHI!HHHIhHHI!HHHI!IHHI!!", charArray16);
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
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hhhi!hhhi!hhhi!Ihhi!!hhi!Ihhi!hhhi!Hhhi!hhhi!hhhi!" + "'", str29, "hhhi!hhhi!hhhi!Ihhi!!hhi!Ihhi!hhhi!Hhhi!hhhi!hhhi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!IHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!!" + "'", str31, "HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!IHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
    }

    @Test
    public void test7032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7032");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhhhi!hhhi!ihhi!!", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhhi!hhhi!ihhi!!" + "'", str2, "hhhhi!hhhi!ihhi!!");
    }

    @Test
    public void test7033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7033");
        char[] charArray15 = new char[] {};
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray15);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("", charArray15);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray15);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray15);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("", charArray15);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray15);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalize("H", charArray15);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.uncapitalize("hhhI!IhhI!HI!!", charArray15);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.uncapitalize("hhhi!Hhhi!Ihhi!!", charArray15);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.capitalize("Hhhhi!ihhi!hi!!h", charArray15);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.initials("hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!", charArray15);
        java.lang.String str27 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!hhhi!hhhi!ihhi!!hhi!hhhi!hhhi!hhhi!ihhi!!hhi!hhhi!hhhi!hhhi!ihhi!!", charArray15);
        java.lang.String str28 = org.apache.commons.lang.WordUtils.capitalize("HHHHi!iHHi!hi!!", charArray15);
        java.lang.String str29 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray15);
        java.lang.String str30 = org.apache.commons.lang.WordUtils.uncapitalize("hhhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!h", charArray15);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] {});
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Hi!" + "'", str19, "Hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "h" + "'", str21, "h");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "H" + "'", str22, "H");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hhhI!IhhI!HI!!" + "'", str23, "hhhI!IhhI!HI!!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hhhi!Hhhi!Ihhi!!" + "'", str24, "hhhi!Hhhi!Ihhi!!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Hhhhi!ihhi!hi!!h" + "'", str25, "Hhhhi!ihhi!hi!!h");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Hhhi!hhhi!hhhi!ihhi!!hhi!hhhi!hhhi!hhhi!ihhi!!hhi!hhhi!hhhi!hhhi!ihhi!!" + "'", str27, "Hhhi!hhhi!hhhi!ihhi!!hhi!hhhi!hhhi!hhhi!ihhi!!hhi!hhhi!hhhi!hhhi!ihhi!!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "HHHHi!iHHi!hi!!" + "'", str28, "HHHHi!iHHi!hi!!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hhhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!h" + "'", str30, "hhhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!h");
    }

    @Test
    public void test7034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7034");
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
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalize("Hhhhi!ihhihhhI!IhhI!Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!", charArray12);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.initials("Hhhhhi!ihhhhhi!ihhi!!i!hi!!h", charArray12);
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Hhhhi!ihhihhhI!IhhI!Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!" + "'", str23, "Hhhhi!ihhihhhI!IhhI!Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test7035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7035");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHhhi!ihhi!hhhhi!ihhi!hhhi!ihhi!!hi!!", (int) ' ', (int) (byte) -1, "Hhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHhhi!ihhi!hhhhi!ihhi!hhhi!ihhi!!hi!!" + "'", str4, "HHhhi!ihhi!hhhhi!ihhi!hhhi!ihhi!!hi!!");
    }

    @Test
    public void test7036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7036");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHh", (int) (short) 0, (-1), "Hhhhi!ihhihhhi!Hhhi!Ihhi!!!hi!!h");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHh" + "'", str4, "HHh");
    }

    @Test
    public void test7037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7037");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hHHhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!ihHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test7038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7038");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test7039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7039");
        char[] charArray11 = new char[] {};
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("hi!", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray11);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("hHHi!iHHi!HHHI!IHHI!!hi!!", charArray11);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("hhhi!ihhi!hhhi!ihhi!!hi!!", charArray11);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("hhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!HhHHHI!HHHI!IHHI!!HhHHHI!HHHI!IHHI!!IhHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!HhHHHI!HHHI!IHHI!!IhHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!!", charArray11);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.uncapitalize("HHHHHI!HHHI!IHHI!!", charArray11);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhihhhi!hhhi!ihhi!!", charArray11);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalizeFully("HhHI!iHI!!HhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHHhhhhhhhhhhhhhhhihhh!hhhhhhhhhhhhhhhihhh!hhhihhhhhhhhhhhihhh!hhh!i!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!ihHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!!", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] {});
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HI!" + "'", str15, "HI!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HI!" + "'", str16, "HI!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hHHi!iHHi!HHHI!IHHI!!hi!!" + "'", str17, "hHHi!iHHi!HHHI!IHHI!!hi!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!HhHHHI!HHHI!IHHI!!HhHHHI!HHHI!IHHI!!IhHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!HhHHHI!HHHI!IHHI!!IhHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!!" + "'", str19, "hhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!HhHHHI!HHHI!IHHI!!HhHHHI!HHHI!IHHI!!IhHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!HhHHHI!HHHI!IHHI!!IhHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HHHHHI!HHHI!IHHI!!" + "'", str20, "HHHHHI!HHHI!IHHI!!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhihhhi!hhhi!ihhi!!" + "'", str21, "Hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhihhhi!hhhi!ihhi!!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "HhHI!iHI!!HhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHHhhhhhhhhhhhhhhhihhh!hhhhhhhhhhhhhhhihhh!hhhihhhhhhhhhhhihhh!hhh!i!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!ihHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!!" + "'", str22, "HhHI!iHI!!HhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHHhhhhhhhhhhhhhhhihhh!hhhhhhhhhhhhhhhihhh!hhhihhhhhhhhhhhihhh!hhh!i!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!ihHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!!");
    }

    @Test
    public void test7040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7040");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhhhhhi!hhhhHHI!HHHI!IHHI!!", (int) 'a', (-1), "hHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end 97, length 27");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7041");
        char[] charArray11 = new char[] { '#', '4', '4', '4' };
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!ihhi!!", charArray11);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("hhhI!IhhI!hhhi!ihhi!!HI!!", charArray11);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("HHhhi!ihhi!hhhhi!ihhi!hhhi!ihhi!!hi!!", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '#', '4', '4', '4' });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hi!" + "'", str12, "Hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hi!" + "'", str13, "Hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hhhi!ihhi!!" + "'", str16, "Hhhi!ihhi!!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HhhI!IhhI!hhhi!ihhi!!HI!!" + "'", str17, "HhhI!IhhI!hhhi!ihhi!!HI!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hhhhi!ihhi!hhhhi!ihhi!hhhi!ihhi!!hi!!" + "'", str18, "Hhhhi!ihhi!hhhhi!ihhi!hhhi!ihhi!!hi!!");
    }

    @Test
    public void test7042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7042");
        char[] charArray7 = new char[] {};
        java.lang.String str8 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("Hh", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("HHHI!hHHI!iHHI!!", charArray7);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHHI!HHHIHHHI!HHHI!IHHI!!", charArray7);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("HHHHHHI!HHHI!IHHI!!HHHHHI!HHHI!IHHI!!HHHHHI!HHHI!IHHIHHI!HHI!HHHHHHI!HHHI!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hh" + "'", str10, "Hh");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HHHI!hHHI!iHHI!!" + "'", str12, "HHHI!hHHI!iHHI!!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HHHHI!HHHIHHHI!HHHI!IHHI!!" + "'", str13, "HHHHI!HHHIHHHI!HHHI!IHHI!!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HHHHHHI!HHHI!IHHI!!HHHHHI!HHHI!IHHI!!HHHHHI!HHHI!IHHIHHI!HHI!HHHHHHI!HHHI!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!" + "'", str14, "HHHHHHI!HHHI!IHHI!!HHHHHI!HHHI!IHHI!!HHHHHI!HHHI!IHHIHHI!HHI!HHHHHHI!HHHI!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!");
    }

    @Test
    public void test7043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7043");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hHhhI!IhhIHHHHI!HHHI!IHHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHhhI!IhhIHHHHI!HHHI!IHHI!!" + "'", str1, "HHhhI!IhhIHHHHI!HHHI!IHHI!!");
    }

    @Test
    public void test7044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7044");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHHI!HHHI!HHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHHI!IHHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!hhhi!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhhi!ihhi!!" + "'", str1, "Hhhhi!hhhi!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhhi!ihhi!!");
    }

    @Test
    public void test7045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7045");
        char[] charArray13 = new char[] { '#', '4', '4', '4' };
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray13);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray13);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("", charArray13);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("H", charArray13);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("HHHI!HHHI!IHHI!!", charArray13);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("HHHI!HHHI!HHHI!", charArray13);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhhi!ihhihhhhi!hhhi!ihhi!!", charArray13);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.initials("HHHI!IHHI!HHHI!IHHI!!HI!!", charArray13);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '#', '4', '4', '4' });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hi!" + "'", str14, "Hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hi!" + "'", str15, "Hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H" + "'", str17, "H");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H" + "'", str18, "H");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "HHHI!HHHI!HHHI!" + "'", str19, "HHHI!HHHI!HHHI!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hhhhi!ihhihhhhi!hhhi!ihhi!!" + "'", str20, "Hhhhi!ihhihhhhi!hhhi!ihhi!!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "H" + "'", str21, "H");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!" + "'", str22, "Hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!");
    }

    @Test
    public void test7046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7046");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HhHHHI!IHHIHHHHI!HHHI!IHHI!!", (int) (byte) 1, (int) ' ', "HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!IHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HhHHHI!IHHIHHHHI!HHHI!IHHI!!" + "'", str4, "HhHHHI!IHHIHHHHI!HHHI!IHHI!!");
    }

    @Test
    public void test7047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7047");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hhhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!IhhHhhi!hhhi!hhhi!hhhi!hhhi!ihi!!hhhi!Hhhi!ihhi!hhHHHI!IHHI!HI!!H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!IhhHhhi!hhhi!hhhi!hhhi!hhhi!ihi!!hhhi!Hhhi!ihhi!hhHHHI!IHHI!HI!!H" + "'", str1, "hhhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!IhhHhhi!hhhi!hhhi!hhhi!hhhi!ihi!!hhhi!Hhhi!ihhi!hhHHHI!IHHI!HI!!H");
    }

    @Test
    public void test7048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7048");
        char[] charArray11 = new char[] {};
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray11);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("HH", charArray11);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray11);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("HHI!iHI!!", charArray11);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.uncapitalize("hHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHhHHI!HHHI!IHHI!!", charArray11);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.uncapitalize("hhHHHI!IHHI!!hhHHHI!IHHI!!hhHHHI!IHHI!!ihHHHI!IHHI!!!hHHHI!IHHI!!hhHHHI!IHHI!!hhHHHI!IHHI!!hhHHHI!IHHI!!ihHHHI!IHHI!!!hHHHI!IHHI!!ihHHHI!IHHI!!hhHHHI!IHHI!!hhHHHI!IHHI!!ihHHHI!IHHI!!!hHHHI!IHHI!!!", charArray11);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalize("hhhhi!ihhihhhi!hhhi!ihhi!!!hi!!h", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] {});
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HH" + "'", str17, "HH");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "HHI!iHI!!" + "'", str19, "HHI!iHI!!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHhHHI!HHHI!IHHI!!" + "'", str20, "hHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHhHHI!HHHI!IHHI!!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hhHHHI!IHHI!!hhHHHI!IHHI!!hhHHHI!IHHI!!ihHHHI!IHHI!!!hHHHI!IHHI!!hhHHHI!IHHI!!hhHHHI!IHHI!!hhHHHI!IHHI!!ihHHHI!IHHI!!!hHHHI!IHHI!!ihHHHI!IHHI!!hhHHHI!IHHI!!hhHHHI!IHHI!!ihHHHI!IHHI!!!hHHHI!IHHI!!!" + "'", str21, "hhHHHI!IHHI!!hhHHHI!IHHI!!hhHHHI!IHHI!!ihHHHI!IHHI!!!hHHHI!IHHI!!hhHHHI!IHHI!!hhHHHI!IHHI!!hhHHHI!IHHI!!ihHHHI!IHHI!!!hHHHI!IHHI!!ihHHHI!IHHI!!hhHHHI!IHHI!!hhHHHI!IHHI!!ihHHHI!IHHI!!!hHHHI!IHHI!!!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hhhhi!ihhihhhi!hhhi!ihhi!!!hi!!h" + "'", str22, "hhhhi!ihhihhhi!hhhi!ihhi!!!hi!!h");
    }

    @Test
    public void test7049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7049");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHHHI!IHHI!!HHHHHI!IHHI!!HHHHHI!IHHHHHI!HHHIHHHI!HHHI!IHHI!!HI!!IHHHHI!IHHI!!!HHHHI!IHHI!!HHHHHHhhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhHhhi!ihhi!HHI!iHI!!hi!!HHHI!HHHIHHHI!HHHI!IHHI!!I!IHHI!!HHHHHI!IHHI!!HHHHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHI!IHHI!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhHhhi!ihhi!HHI!iHI!!hi!!!!HHHHI!IHHI!!IHHHHI!IHHHHHHI!HHHIHHHI!HHHI!IHHI!!I!!HHHHHI!IHHI!!HHHHHI!IHHI!!IHHHHIHHHHI!HHHIHHhhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhHhhi!ihhi!HHI!iHI!!hi!!HI!HHHI!IHHI!!!IHHI!!!HHHHI!IHHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhhhhi!hhhihhhi!hhhi!ihhi!!hi!!ihhhhi!ihhi!!!hhhhi!ihhi!!hhhhhhhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhhhi!ihhi!hhi!ihi!!hi!!hhhi!hhhihhhi!hhhi!ihhi!!i!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!hhhhi!ihhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhhhi!ihhi!hhi!ihi!!hi!!!!hhhhi!ihhi!!ihhhhi!ihhhhhhi!hhhihhhi!hhhi!ihhi!!i!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhihhhhi!hhhihhhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhhhi!ihhi!hhi!ihi!!hi!!hi!hhhi!ihhi!!!ihhi!!!hhhhi!ihhi!!!" + "'", str1, "Hhhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhhhhi!hhhihhhi!hhhi!ihhi!!hi!!ihhhhi!ihhi!!!hhhhi!ihhi!!hhhhhhhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhhhi!ihhi!hhi!ihi!!hi!!hhhi!hhhihhhi!hhhi!ihhi!!i!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!hhhhi!ihhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhhhi!ihhi!hhi!ihi!!hi!!!!hhhhi!ihhi!!ihhhhi!ihhhhhhi!hhhihhhi!hhhi!ihhi!!i!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhihhhhi!hhhihhhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhhhi!ihhi!hhi!ihi!!hi!!hi!hhhi!ihhi!!!ihhi!!!hhhhi!ihhi!!!");
    }

    @Test
    public void test7050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7050");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hhHhhi!hHhhi!hHhhi!iHhhi!!Hhhi!iHhhi!hHhhi!hHhhi!iHhhi!!Hhhi!hHhhi!hHhhi!hHhhi!iHhhi!!Hhhi!iHhhi!hHhhi!hHhhi!iHhhi!!Hhhi!!Hhhi!hHhhi!iHhhi!!Hhhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHhHHI!HhHHI!HhHHI!IhHHI!!hHHI!IhHHI!HhHHI!HhHHI!IhHHI!!hHHI!HhHHI!HhHHI!HhHHI!IhHHI!!hHHI!IhHHI!HhHHI!HhHHI!IhHHI!!hHHI!!hHHI!HhHHI!IhHHI!!hHHI!!" + "'", str1, "HHhHHI!HhHHI!HhHHI!IhHHI!!hHHI!IhHHI!HhHHI!HhHHI!IhHHI!!hHHI!HhHHI!HhHHI!HhHHI!IhHHI!!hHHI!IhHHI!HhHHI!HhHHI!IhHHI!!hHHI!!hHHI!HhHHI!IhHHI!!hHHI!!");
    }

    @Test
    public void test7051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7051");
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
        java.lang.String str28 = org.apache.commons.lang.WordUtils.initials("Hhh", charArray15);
        java.lang.String str29 = org.apache.commons.lang.WordUtils.capitalize("", charArray15);
        java.lang.String str30 = org.apache.commons.lang.WordUtils.uncapitalize("hHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hIHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!h!HhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hhHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hIHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!h!HhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hiHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hIHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!h!HhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!h!", charArray15);
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
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hIHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!h!HhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hhHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hIHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!h!HhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hiHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hIHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!h!HhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!h!" + "'", str30, "hHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hIHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!h!HhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hhHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hIHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!h!HhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hiHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hIHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!h!HhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!h!");
    }

    @Test
    public void test7052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7052");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("Hhhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!ihhhhi!hhhi!hhhi!!hhhhi!hhhi!hhhi!ihhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!ihhhhi!hhhi!hhhi!!hhhhi!hhhi!hhhi!!hhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!ihhhhi!hhhi!hhhi!!hhhhi!hhhi!hhhi!ihhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!ihhhhi!hhhi!hhhi!!hhhhi!hhhi!hhhi!!hhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!ihhhhi!hhhi!hhhi!!hhhhi!hhhi!hhhi!ihhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!ihhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!ihhhhi!hhhi!hhhi!!hhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!ihhhhi!hhhi!hhhi!!hhhhi!hhhi!hhhi!ihhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!ihhhhi!hhhi!hhhi!!hhhhi!hhhi!hhhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!ihhhhi!hhhi!hhhi!!hhhhi!hhhi!hhhi!ihhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!ihhhhi!hhhi!hhhi!!hhhhi!hhhi!hhhi!!hhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!ihhhhi!hhhi!hhhi!!hhhhi!hhhi!hhhi!ihhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!ihhhhi!hhhi!hhhi!!hhhhi!hhhi!hhhi!!hhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!ihhhhi!hhhi!hhhi!!hhhhi!hhhi!hhhi!ihhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!ihhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!ihhhhi!hhhi!hhhi!!hhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!ihhhhi!hhhi!hhhi!!hhhhi!hhhi!hhhi!ihhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!ihhhhi!hhhi!hhhi!!hhhhi!hhhi!hhhi!!" + "'", str1, "Hhhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!ihhhhi!hhhi!hhhi!!hhhhi!hhhi!hhhi!ihhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!ihhhhi!hhhi!hhhi!!hhhhi!hhhi!hhhi!!hhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!ihhhhi!hhhi!hhhi!!hhhhi!hhhi!hhhi!ihhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!ihhhhi!hhhi!hhhi!!hhhhi!hhhi!hhhi!!hhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!ihhhhi!hhhi!hhhi!!hhhhi!hhhi!hhhi!ihhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!ihhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!ihhhhi!hhhi!hhhi!!hhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!ihhhhi!hhhi!hhhi!!hhhhi!hhhi!hhhi!ihhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!ihhhhi!hhhi!hhhi!!hhhhi!hhhi!hhhi!!");
    }

    @Test
    public void test7053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7053");
        char[] charArray13 = new char[] { '#', '4', '4', '4' };
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray13);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray13);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("", charArray13);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray13);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray13);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.initials("Hhhi!ihhi!!", charArray13);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray13);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalizeFully("HHhhi!hhhi!hhhi!", charArray13);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.uncapitalize("HHHI!IHHI!HHHI!IHHI!!HI!!", charArray13);
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hHHI!IHHI!HHHI!IHHI!!HI!!" + "'", str22, "hHHI!IHHI!HHHI!IHHI!!HI!!");
    }

    @Test
    public void test7054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7054");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("", 1, "HhHI!iHI!!HhHI!iHI!!HhHI!iHI!!IhHI!iHI!!!hHI!iHI!!IhHI!iHI!!HhHI!iHI!!HhHI!iHI!!IhHI!iHI!!!hHI!iHI!!HhHI!iHI!!HhHI!iHI!!IhHI!iHI!!!hHI!iHI!!IhHI!iHI!!HhHI!iHI!!IhHI!iHI!!!hHI!iHI!!!hHI!iHI!!HhHI!iHI!!IhHI!iHI!!!hHI!iHI!!!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test7055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7055");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!IhHHI!hHHI!iHHI!!!hHHI!hHHI!iHHIHhhi!ihhi!HhH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!IhHHI!hHHI!iHHI!!!hHHI!hHHI!iHHIHhhi!ihhi!HhH" + "'", str1, "HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!IhHHI!hHHI!iHHI!!!hHHI!hHHI!iHHIHhhi!ihhi!HhH");
    }

    @Test
    public void test7056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7056");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test7057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7057");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("HHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IHhhi!hhI!!IhhhI!IhhI!!!HHhhhI!IhhI!!hHhhi!hhhI!IhhI!!HhhhI!IhhI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!hHhHHHI!IHHI!hhhI!IhhI!HI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhhi!hhi!!ihhhi!ihhi!!!hhhhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhhhhi!ihhi!hhhi!ihhi!hi!!" + "'", str1, "Hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhhi!hhi!!ihhhi!ihhi!!!hhhhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhhhhi!ihhi!hhhi!ihhi!hi!!");
    }

    @Test
    public void test7058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7058");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HhHHI!IHHI!hHh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhHHI!IHHI!hHh" + "'", str1, "hhHHI!IHHI!hHh");
    }

    @Test
    public void test7059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7059");
        char[] charArray12 = new char[] {};
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray12);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("", charArray12);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray12);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray12);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("", charArray12);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray12);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("H", charArray12);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray12);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.uncapitalize("hhI!", charArray12);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray12);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalize("", charArray12);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalize("hHhhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hHHHI!IHHI!!", charArray12);
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hi!" + "'", str20, "Hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hhI!" + "'", str21, "hhI!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hHhhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hHHHI!IHHI!!" + "'", str24, "hHhhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hHHHI!IHHI!!");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test7060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7060");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hHHHHHHHHIhhhhI!IhhI!HI!!", 10, "hhhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhhHHHI!IHHIhHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHHHHHHHIhhhhI!IhhI!HI!!" + "'", str4, "hHHHHHHHHIhhhhI!IhhI!HI!!");
    }

    @Test
    public void test7061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7061");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhhHHHI!IHHIhHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!", (int) '4', (int) (short) 10, "HHhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhhHHHI!IHHIhHHHHHHHHIHHhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!" + "'", str4, "hhhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhhHHHI!IHHIhHHHHHHHHIHHhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
    }

    @Test
    public void test7062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7062");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("Hhhhhi!hhhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHHHI!HHHHHHHI!HHHI!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!" + "'", str1, "hHHHHI!HHHHHHHI!HHHI!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!");
    }

    @Test
    public void test7063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7063");
        char[] charArray17 = new char[] {};
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray17);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.initials("", charArray17);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray17);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray17);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalize("", charArray17);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray17);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalize("H", charArray17);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.uncapitalize("hh", charArray17);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.capitalizeFully("H", charArray17);
        java.lang.String str27 = org.apache.commons.lang.WordUtils.initials("hi!", charArray17);
        java.lang.String str28 = org.apache.commons.lang.WordUtils.initials("Hhhi!ihhi!hi!!", charArray17);
        java.lang.String str29 = org.apache.commons.lang.WordUtils.uncapitalize("HhhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhIhHHI!hHHI!iHHI!!", charArray17);
        java.lang.String str30 = org.apache.commons.lang.WordUtils.capitalize("hHHHI!IHHI!HI!!H", charArray17);
        java.lang.String str31 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!", charArray17);
        java.lang.String str32 = org.apache.commons.lang.WordUtils.capitalizeFully("HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!hhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!hhHHHI!HHHIhHHI!HHHI!IHHI!!ihHHHI!HHHIhHHI!HHHI!IHHI!!!", charArray17);
        java.lang.String str33 = org.apache.commons.lang.WordUtils.capitalize("hhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!", charArray17);
        java.lang.String str34 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!!", charArray17);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] {});
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Hi!" + "'", str21, "Hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "h" + "'", str23, "h");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "H" + "'", str24, "H");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hh" + "'", str25, "hh");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "H" + "'", str26, "H");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "HhhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhIhHHI!hHHI!iHHI!!" + "'", str29, "HhhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhIhHHI!hHHI!iHHI!!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hHHHI!IHHI!HI!!H" + "'", str30, "hHHHI!IHHI!HI!!H");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!" + "'", str31, "Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!hhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!hhHHHI!HHHIhHHI!HHHI!IHHI!!ihHHHI!HHHIhHHI!HHHI!IHHI!!!" + "'", str32, "HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!hhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!hhHHHI!HHHIhHHI!HHHI!IHHI!!ihHHHI!HHHIhHHI!HHHI!IHHI!!!");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!" + "'", str33, "hhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!!" + "'", str34, "Hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!!");
    }

    @Test
    public void test7064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7064");
        char[] charArray11 = new char[] {};
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("Hi!", charArray11);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray11);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray11);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.uncapitalize("HHHi!iHHi!!", charArray11);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("HHHI!HHHI!Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!", charArray11);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHHI!IHHI!HHHI!IHHI!!HI!!", charArray11);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.uncapitalize("hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!ihHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!!", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] {});
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hi!" + "'", str16, "Hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hi!" + "'", str17, "Hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "HHHi!iHHi!!" + "'", str19, "HHHi!iHHi!!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HHHI!HHHI!Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!" + "'", str20, "HHHI!HHHI!Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hHHHI!IHHI!HHHI!IHHI!!HI!!" + "'", str21, "hHHHI!IHHI!HHHI!IHHI!!HI!!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!ihHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!!" + "'", str22, "hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!ihHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!!");
    }

    @Test
    public void test7065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7065");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hhhI!IhhI!Hhhhhi!hhhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!", (int) (byte) 1, "Hhhhhi!ihhhhHHHI!IHHI!HI!!H", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhI!IhhI!Hhhhhi!hhhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!" + "'", str4, "hhhI!IhhI!Hhhhhi!hhhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
    }

    @Test
    public void test7066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7066");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHHHHI!HHHHHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHHI!IHHI!HHH", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHHHHI!HHHHHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHHI!IHHI!HHH" + "'", str2, "hHHHHI!HHHHHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHHI!IHHI!HHH");
    }

    @Test
    public void test7067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7067");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHhhhi!ihhhhhhi!ihhi!hhhi!ihhi!!hi!!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHhhhi!ihhhhhhi!ihhi!hhhi!ihhi!!hi!!" + "'", str2, "hHhhhi!ihhhhhhi!ihhi!hhhi!ihhi!!hi!!");
    }

    @Test
    public void test7068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7068");
        char[] charArray10 = new char[] { '#', '4', '4', '4' };
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("HhhhI!IhhI!HI!!h", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("HhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HhhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!H!", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '#', '4', '4', '4' });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hi!" + "'", str11, "Hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hi!" + "'", str12, "Hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HhhhI!IhhI!HI!!h" + "'", str13, "HhhhI!IhhI!HI!!h");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hhhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!h!" + "'", str15, "Hhhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!h!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!" + "'", str16, "hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
    }

    @Test
    public void test7069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7069");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("HhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!hhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!ihHHI!IHHI!HI!!hhHHI!IHHIhhhi!Hhhi!HhI!hhHI!!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHIhhhi!Hhhi!HhI!hhHI!!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!ihHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!hhhi!Hhhi!HhI!hhHI!!hHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!!hHHI!IHHI!HI!!h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test7070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7070");
        char[] charArray7 = new char[] {};
        java.lang.String str8 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("h", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("Hhi!", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhHhh", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("HHHHI!HHHIHHHI!HHHI!IHHI!!", charArray7);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!", charArray7);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("HHhhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!", charArray7);
        java.lang.Class<?> wildcardClass15 = charArray7.getClass();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hhi!" + "'", str10, "Hhi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HHHHI!HHHIHHHI!HHHI!IHHI!!" + "'", str12, "HHHHI!HHHIHHHI!HHHI!IHHI!!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!" + "'", str13, "hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HHhhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!" + "'", str14, "HHhhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test7071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7071");
        char[] charArray5 = new char[] {};
        java.lang.String str6 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray5);
        java.lang.String str7 = org.apache.commons.lang.WordUtils.initials("h", charArray5);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray5);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalize("hHHHI!HHHI!IHHI!!", charArray5);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("hHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!iHhi!Ihi!!!Hhi!Ihi!!iHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!!Hhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!!Hhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!!Hhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!!Hhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!!Hhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!!", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hI!" + "'", str8, "hI!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hHHHI!HHHI!IHHI!!" + "'", str9, "hHHHI!HHHI!IHHI!!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!iHhi!Ihi!!!Hhi!Ihi!!iHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!!Hhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!!Hhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!!Hhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!!Hhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!!Hhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!!" + "'", str10, "hHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!iHhi!Ihi!!!Hhi!Ihi!!iHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!!Hhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!!Hhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!!Hhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!!Hhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!!Hhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!!");
    }

    @Test
    public void test7072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7072");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("HhHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!ihHHI!IHHI!HI!!hhHHI!IHHIhhhi!Hhhi!HhI!hhHI!!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHIhhhi!Hhhi!HhI!hhHI!!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!ihHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!hhhi!Hhhi!HhI!hhHI!!hHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!!hHHI!IHHI!HI!!h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test7073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7073");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HhHHi!iHHiHhH", (int) (byte) 10, (-1), "hHhhhi!ihhihhhhi!hhhi!ihhi!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HhHHi!iHHiHhH" + "'", str4, "HhHHi!iHHiHhH");
    }

    @Test
    public void test7074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7074");
        char[] charArray6 = new char[] {};
        java.lang.String str7 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray6);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.initials("h", charArray6);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("Hhi!", charArray6);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhHhh", charArray6);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("HHHHI!HHHIHHHI!HHHI!IHHI!!", charArray6);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("HhhhI!IhhIhHHI!hHHI!iHHI!!!HI!!h", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Hhi!" + "'", str9, "Hhi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HHHHI!HHHIHHHI!HHHI!IHHI!!" + "'", str11, "HHHHI!HHHIHHHI!HHHI!IHHI!!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HhhhI!IhhIhHHI!hHHI!iHHI!!!HI!!h" + "'", str12, "HhhhI!IhhIhHHI!hHHI!iHHI!!!HI!!h");
    }

    @Test
    public void test7075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7075");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hHHi!iHHi!hHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHHhhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhHHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!hHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!hhhi!Hhhi!hhHI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HhhI!IhhI!Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihhHHHI!HHHI!HHHI!IHHI!!HHI!IHHI!HHHI!HHHI!IHHI!!HHhhhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!HhhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!HHHI!hHHI!HHhi!" + "'", str1, "HhhI!IhhI!Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihhHHHI!HHHI!HHHI!IHHI!!HHI!IHHI!HHHI!HHHI!IHHI!!HHhhhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!HhhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!HHHI!hHHI!HHhi!");
    }

    @Test
    public void test7076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7076");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhhhi!hhhi!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhhi!ihhi!!", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhhi!hhhi!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhhi!ihhi!!" + "'", str2, "Hhhhi!hhhi!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhhi!ihhi!!");
    }

    @Test
    public void test7077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7077");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhhi!ihhiHhhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhhhhi!hhhihhhi!hhhi!ihhi!!hi!!ihhhhi!ihhi!!!hhhhi!ihhi!!hhhhhhhhhi!hhhihhhi!hhhi!ihhi!!i!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!hhhhi!ihhi!!!hhhhi!ihhi!!ihhhhi!ihhhhhhi!hhhihhhi!hhhi!ihhi!!i!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhihhhhi!hhhihhhi!hhhi!ihhi!!!ihhi!!!hhhhi!ihhi!!!", 0, (int) '#', "HHHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhhi!ihhiHhhhhi!ihhi!!hhhhhi!ihhi!HHHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!!" + "'", str4, "Hhhhi!ihhiHhhhhi!ihhi!!hhhhhi!ihhi!HHHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!!");
    }

    @Test
    public void test7078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7078");
        char[] charArray12 = new char[] {};
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray12);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("", charArray12);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray12);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray12);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("", charArray12);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray12);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("H", charArray12);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("hH", charArray12);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalizeFully("hhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!ihi!!hi!hhi!ihi!!hi!!", charArray12);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalizeFully("HHI!iHI!!", charArray12);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihHhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhhhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihhhhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!!hh!", charArray12);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhi!ihhiHhhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhhhhi!hhhihhhi!hhhi!ihhi!!hi!!ihhhhi!ihhi!!!hhhhi!ihhi!!hhhhhhhhhi!hhhihhhi!hhhi!ihhi!!i!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!hhhhi!ihhi!!!hhhhi!ihhi!!ihhhhi!ihhhhhhi!hhhihhhi!hhhi!ihhi!!i!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhihhhhi!hhhihhhi!hhhi!ihhi!!!ihhi!!!hhhhi!ihhi!!!", charArray12);
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!ihi!!hi!hhi!ihi!!hi!!" + "'", str21, "hhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!ihi!!hi!hhi!ihi!!hi!!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "HHI!iHI!!" + "'", str22, "HHI!iHI!!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihHhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhhhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihhhhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!!hh!" + "'", str23, "Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihHhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhhhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihhhhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!!hh!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Hhhhi!ihhiHhhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhhhhi!hhhihhhi!hhhi!ihhi!!hi!!ihhhhi!ihhi!!!hhhhi!ihhi!!hhhhhhhhhi!hhhihhhi!hhhi!ihhi!!i!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!hhhhi!ihhi!!!hhhhi!ihhi!!ihhhhi!ihhhhhhi!hhhihhhi!hhhi!ihhi!!i!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhihhhhi!hhhihhhi!hhhi!ihhi!!!ihhi!!!hhhhi!ihhi!!!" + "'", str24, "Hhhhi!ihhiHhhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhhhhi!hhhihhhi!hhhi!ihhi!!hi!!ihhhhi!ihhi!!!hhhhi!ihhi!!hhhhhhhhhi!hhhihhhi!hhhi!ihhi!!i!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!hhhhi!ihhi!!!hhhhi!ihhi!!ihhhhi!ihhhhhhi!hhhihhhi!hhhi!ihhi!!i!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhihhhhi!hhhihhhi!hhhi!ihhi!!!ihhi!!!hhhhi!ihhi!!!");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test7079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7079");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhhhi!hhhhhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!", (int) (byte) 1, (int) (byte) 1, "Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!" + "'", str4, "HHhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
    }

    @Test
    public void test7080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7080");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhhi!ihhihhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!", 0, (int) (byte) 1, "HhHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!!Hhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!!Hhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!!Hhi!Ihi!!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHhHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!!Hhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!!Hhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!!Hhi!Ihi!!!" + "'", str4, "hHhHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!!Hhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!!Hhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!!Hhi!Ihi!!!");
    }

    @Test
    public void test7081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7081");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!ihhi!hhhi!hhhi!hhi!hhhi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!ihhi!hhhi!hhhi!hhi!hhhi!" + "'", str1, "Hhhi!ihhi!hhhi!hhhi!hhi!hhhi!");
    }

    @Test
    public void test7082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7082");
        char[] charArray10 = new char[] {};
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("h", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("Hhi!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhHhh", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!hhhi!ihhi!hhhi!ihhi!hhhi!ihhi!!hi!!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhihhhi!ihhi!hhhi!ihhi!hhhi!ihhi!!hi!!!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhhhhi!ihhi!hhhi!ihhi!hhhi!ihhi!!hi!!i!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhhhi!ihhi!hhhi!ihhi!hhhi!ihhi!!hi!!hi!!ihhhi!ihhi!!!hhhi!ihhi!!!", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhhi!hhhhHHI!HHHI!IHHI!!", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("Hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhihhhi!hhhi!ihhi!!", charArray10);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray10);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.initials("Hhhhi!hhhihhhi!ihhi!hi!!!ihhi!!", charArray10);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("HHhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhHHHHHHHHHIHHHHi!iHHi!hi!!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hhi!" + "'", str13, "Hhi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!hhhi!ihhi!hhhi!ihhi!hhhi!ihhi!!hi!!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhihhhi!ihhi!hhhi!ihhi!hhhi!ihhi!!hi!!!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhhhhi!ihhi!hhhi!ihhi!hhhi!ihhi!!hi!!i!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhhhi!ihhi!hhhi!ihhi!hhhi!ihhi!!hi!!hi!!ihhhi!ihhi!!!hhhi!ihhi!!!" + "'", str15, "Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!hhhi!ihhi!hhhi!ihhi!hhhi!ihhi!!hi!!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhihhhi!ihhi!hhhi!ihhi!hhhi!ihhi!!hi!!!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhhhhi!ihhi!hhhi!ihhi!hhhi!ihhi!!hi!!i!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhhhi!ihhi!hhhi!ihhi!hhhi!ihhi!!hi!!hi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hhhhhi!hhhhHHI!HHHI!IHHI!!" + "'", str16, "Hhhhhi!hhhhHHI!HHHI!IHHI!!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HHhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhHHHHHHHHHIHHHHi!iHHi!hi!!" + "'", str20, "HHhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhHHHHHHHHHIHHHHi!iHHi!hi!!");
    }

    @Test
    public void test7083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7083");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhhhhhhhhhh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhhhhhhhhhhh" + "'", str1, "hhhhhhhhhhhhh");
    }

    @Test
    public void test7084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7084");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHhhI!IhhIHHHHI!HHHI!IHHI!!", 0, (int) '#', "hHHHI!hHHIHHHHI!HHHIhHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!iHHHI!hHHI!iHHI!!!HHHI!hHHI!iHHI!!iHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!iHHHI!hHHI!iHHI!!!HHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!iHHHI!hHHI!iHHI!!!HHHI!hHHI!iHHI!!!HHHI!hHHI!iHHI!!h");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHhhI!IhhIHHHHI!HHHI!IHHI!!" + "'", str4, "HHhhI!IhhIHHHHI!HHHI!IHHI!!");
    }

    @Test
    public void test7085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7085");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhhhi!hhhiHhhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhhhhi!hhhihhhi!hhhi!ihhi!!hi!!ihhhhi!ihhi!!!hhhhi!ihhi!!hhhhhhhhhi!hhhihhhi!hhhi!ihhi!!i!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!hhhhi!ihhi!!!hhhhi!ihhi!!ihhhhi!ihhhhhhi!hhhihhhi!hhhi!ihhi!!i!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhihhhhi!hhhihhhi!hhhi!ihhi!!!ihhi!!!hhhhi!ihhi!!!", (int) 'a', 100, "Hhhi!hhhi!hhhi!Ihhi!!hhi!Ihhi!hhhi!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhhHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhhi!hhhiHhhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhhhhi!hhhihhhi!hhhi!ihhi!!hi!!ihhhhi!ihhi!!!hhhhi!ihhi!Hhhi!hhhi!hhhi!Ihhi!!hhi!Ihhi!hhhi!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhhHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!!" + "'", str4, "hhhhi!hhhiHhhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhhhhi!hhhihhhi!hhhi!ihhi!!hi!!ihhhhi!ihhi!!!hhhhi!ihhi!Hhhi!hhhi!hhhi!Ihhi!!hhi!Ihhi!hhhi!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhhHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!!");
    }

    @Test
    public void test7086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7086");
        char[] charArray10 = new char[] {};
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("Hh", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("HHHi!iHHi!!", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("H", charArray10);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHi!iHHi!HhhhI!IhhI!HI!!h", charArray10);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("HHhhi!ihhi!hi!!", charArray10);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("Hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!!", charArray10);
        java.lang.Class<?> wildcardClass21 = charArray10.getClass();
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hi!" + "'", str13, "Hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hh" + "'", str15, "Hh");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hHHi!iHHi!HhhhI!IhhI!HI!!h" + "'", str18, "hHHi!iHHi!HhhhI!IhhI!HI!!h");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "HHhhi!ihhi!hi!!" + "'", str19, "HHhhi!ihhi!hi!!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!!" + "'", str20, "Hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!!");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test7087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7087");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("HhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!hhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!Hhhhi!hhhi!ihhi!!HHHHI!IHHIHHHI!hHHI!iHHI!!!HI!!H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhhi!hhhi!ihhi!!hhhhi!ihhihhhi!hhhi!ihhi!!!hi!!h" + "'", str1, "Hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhhi!hhhi!ihhi!!hhhhi!ihhihhhi!hhhi!ihhi!!!hi!!h");
    }

    @Test
    public void test7088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7088");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("HhHHI!IHHI!hHh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHhhi!ihhi!HhH" + "'", str1, "hHhhi!ihhi!HhH");
    }

    @Test
    public void test7089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7089");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hHHHI!IHHIHhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test7090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7090");
        char[] charArray8 = new char[] {};
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("hi!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("HI!", charArray8);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray8);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("hHHi!iHHi!HhhhI!IhhI!HI!!h", charArray8);
        java.lang.Class<?> wildcardClass17 = charArray8.getClass();
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HI!" + "'", str12, "HI!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HI!" + "'", str14, "HI!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hHHi!iHHi!HhhhI!IhhI!HI!!h" + "'", str16, "hHHi!iHHi!HhhhI!IhhI!HI!!h");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test7091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7091");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("Hhhhi!ihhiHhhhhi!ihhi!!hhhhhi!ihhi!HHHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHHI!IHHIhHHHHI!IHHI!!HHHHHI!IHHI!hhhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!" + "'", str1, "hHHHI!IHHIhHHHHI!IHHI!!HHHHHI!IHHI!hhhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!");
    }

    @Test
    public void test7092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7092");
        char[] charArray14 = new char[] {};
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray14);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("", charArray14);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray14);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray14);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("", charArray14);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray14);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalize("H", charArray14);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalize("hH", charArray14);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalize("HH", charArray14);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalize("hhI!", charArray14);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.initials("hhhi!Hhhi!Ihhi!!", charArray14);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.initials("hhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!HhHHHI!HHHI!IHHI!!HhHHHI!HHHI!IHHI!!IhHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!HhHHHI!HHHI!IHHI!!IhHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!!", charArray14);
        java.lang.String str27 = org.apache.commons.lang.WordUtils.capitalize("hhHHHI!HHHIhHHI!HHHI!IHHI!!hhHHHI!HHHIhHHI!HHHI!IHHI!!hhHHHI!HHHIhHHI!HHHI!IHHI!!hhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!hhHHHI!HHHIhHHI!HHHI!IHHI!!hhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!!", charArray14);
        java.lang.String str28 = org.apache.commons.lang.WordUtils.initials("hhhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!ihi!!hi!hhi!ihi!!hi!!", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] {});
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hi!" + "'", str18, "Hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "h" + "'", str20, "h");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "H" + "'", str21, "H");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hH" + "'", str22, "hH");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "HH" + "'", str23, "HH");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hhI!" + "'", str24, "hhI!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hhHHHI!HHHIhHHI!HHHI!IHHI!!hhHHHI!HHHIhHHI!HHHI!IHHI!!hhHHHI!HHHIhHHI!HHHI!IHHI!!hhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!hhHHHI!HHHIhHHI!HHHI!IHHI!!hhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!!" + "'", str27, "hhHHHI!HHHIhHHI!HHHI!IHHI!!hhHHHI!HHHIhHHI!HHHI!IHHI!!hhHHHI!HHHIhHHI!HHHI!IHHI!!hhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!hhHHHI!HHHIhHHI!HHHI!IHHI!!hhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test7093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7093");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHHHI!HHHIhhhhi!hhhihhhI!IhhI!HI!!!ihhi!!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHHHI!HHHIhhhhi!hhhihhhI!IhhI!HI!!!ihhi!!" + "'", str2, "hHHHI!HHHIhhhhi!hhhihhhI!IhhI!HI!!!ihhi!!");
    }

    @Test
    public void test7094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7094");
        char[] charArray8 = new char[] {};
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray8);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("H", charArray8);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("hHhhI!IhhI!hhhi!ihhi!!HI!!", charArray8);
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
    }

    @Test
    public void test7095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7095");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhhhi!hhhiHhhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhhhhi!hhhihhhi!hhhi!ihhi!!hi!!ihhhhi!ihhi!!!hhhhi!ihhi!Hhhi!hhhi!hhhi!Ihhi!!hhi!Ihhi!hhhi!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhhHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!!", (int) (byte) -1, (int) (short) 10, "HHHHHi!iHHhHHHI!HHHIhHHI!HHHI!IHHI!!i!!HHHHi!ihHHHI!HHHIhHHI!HHHI!IHHI!!HHi!!hHHHihHHHI!HHHIhHHI!HHHI!IHHI!!!iHHi!!iHHhHHHI!HHHIhHHI!HHHI!IHHI!!Hi!iHHi!!!hHHHI!HHHIhHHI!HHHI!IHHI!!hHHHHi!iHHhHHHI!HHHIhHHI!HHHI!IHHI!!i!!HHHHi!ihHHHI!HHHIhHHI!HHHI!IHHI!!HHi!!hHHHihHHHI!HHHIhHHI!HHHI!IHHI!!!iHHi!!iHHhHHHI!HHHIhHHI!HHHI!IHHI!!Hi!iHHi!!!hHHHI!HHHIhHHI!HHHI!IHHI!!IHHHHi!iHHhHHHI!HHHIhHHI!HHHI!IHHI!!i!!HHHHi!ihHHHI!HHHIhHHI!HHHI!IHHI!!HHi!!hHHHihHHHI!HHHIhHHI!HHHI!IHHI!!!iHHi!!iHHhHHHI!HHHIhHHI!HHHI!IHHI!!Hi!iHHi!!!hHHHI!HHHIhHHI!HHHI!IHHI!!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhhi!hhhiHHHHHi!iHHhHHHI!HHHIhHHI!HHHI!IHHI!!i!!HHHHi!ihHHHI!HHHIhHHI!HHHI!IHHI!!HHi!!hHHHihHHHI!HHHIhHHI!HHHI!IHHI!!!iHHi!!iHHhHHHI!HHHIhHHI!HHHI!IHHI!!Hi!iHHi!!!hHHHI!HHHIhHHI!HHHI!IHHI!!hHHHHi!iHHhHHHI!HHHIhHHI!HHHI!IHHI!!i!!HHHHi!ihHHHI!HHHIhHHI!HHHI!IHHI!!HHi!!hHHHihHHHI!HHHIhHHI!HHHI!IHHI!!!iHHi!!iHHhHHHI!HHHIhHHI!HHHI!IHHI!!Hi!iHHi!!!hHHHI!HHHIhHHI!HHHI!IHHI!!IHHHHi!iHHhHHHI!HHHIhHHI!HHHI!IHHI!!i!!HHHHi!ihHHHI!HHHIhHHI!HHHI!IHHI!!HHi!!hHHHihHHHI!HHHIhHHI!HHHI!IHHI!!!iHHi!!iHHhHHHI!HHHIhHHI!HHHI!IHHI!!Hi!iHHi!!!hHHHI!HHHIhHHI!HHHI!IHHI!!!" + "'", str4, "hhhhi!hhhiHHHHHi!iHHhHHHI!HHHIhHHI!HHHI!IHHI!!i!!HHHHi!ihHHHI!HHHIhHHI!HHHI!IHHI!!HHi!!hHHHihHHHI!HHHIhHHI!HHHI!IHHI!!!iHHi!!iHHhHHHI!HHHIhHHI!HHHI!IHHI!!Hi!iHHi!!!hHHHI!HHHIhHHI!HHHI!IHHI!!hHHHHi!iHHhHHHI!HHHIhHHI!HHHI!IHHI!!i!!HHHHi!ihHHHI!HHHIhHHI!HHHI!IHHI!!HHi!!hHHHihHHHI!HHHIhHHI!HHHI!IHHI!!!iHHi!!iHHhHHHI!HHHIhHHI!HHHI!IHHI!!Hi!iHHi!!!hHHHI!HHHIhHHI!HHHI!IHHI!!IHHHHi!iHHhHHHI!HHHIhHHI!HHHI!IHHI!!i!!HHHHi!ihHHHI!HHHIhHHI!HHHI!IHHI!!HHi!!hHHHihHHHI!HHHIhHHI!HHHI!IHHI!!!iHHi!!iHHhHHHI!HHHIhHHI!HHHI!IHHI!!Hi!iHHi!!!hHHHI!HHHIhHHI!HHHI!IHHI!!!");
    }

    @Test
    public void test7096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7096");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!", (int) ' ', (int) (short) 1, "Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!hhhi!ihhi!hhhi!ihhi!hhhi!ihhi!!hi!!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhihhhi!ihhi!hhhi!ihhi!hhhi!ihhi!!hi!!!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhhhhi!ihhi!hhhi!ihhi!hhhi!ihhi!!hi!!i!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhhhi!ihhi!hhhi!ihhi!hhhi!ihhi!!hi!!hi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHhhhi!ihhi!!hhhhi!ihhi!!hhhhi!iHhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!hhhi!ihhi!hhhi!ihhi!hhhi!ihhi!!hi!!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhihhhi!ihhi!hhhi!ihhi!hhhi!ihhi!!hi!!!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhhhhi!ihhi!hhhi!ihhi!hhhi!ihhi!!hi!!i!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhhhi!ihhi!hhhi!ihhi!hhhi!ihhi!!hi!!hi!!ihhhi!ihhi!!!hhhi!ihhi!!!" + "'", str4, "HHhhhi!ihhi!!hhhhi!ihhi!!hhhhi!iHhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!hhhi!ihhi!hhhi!ihhi!hhhi!ihhi!!hi!!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhihhhi!ihhi!hhhi!ihhi!hhhi!ihhi!!hi!!!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhhhhi!ihhi!hhhi!ihhi!hhhi!ihhi!!hi!!i!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhhhi!ihhi!hhhi!ihhi!hhhi!ihhi!!hi!!hi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
    }

    @Test
    public void test7097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7097");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hhhi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test7098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7098");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.capitalize("hhHhhHhhHihH!hHhhHhhHhhHihH!hHihHhhHhhHihH!hH!", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HhHhhHhhHihH!hHhhHhhHhhHihH!hHihHhhHhhHihH!hH!" + "'", str2, "HhHhhHhhHihH!hHhhHhhHhhHihH!hHihHhhHhhHihH!hH!");
    }

    @Test
    public void test7099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7099");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HHHI!HHHI!hHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!!Hhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!HhHHi!iHHi!!", (int) (short) 1, "hHhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHHI!HHHI!hHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!!Hhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!HhHHi!iHHi!!" + "'", str4, "HHHI!HHHI!hHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!!Hhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!HhHHi!iHHi!!");
    }

    @Test
    public void test7100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7100");
        char[] charArray10 = new char[] { '#', '4', '4', '4' };
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("HhhhI!IhhI!HI!!h", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("Hhi!hhi!hhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("hhhhhi!hhhhHHI!HHHI!IHHI!!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '#', '4', '4', '4' });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hi!" + "'", str11, "Hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hi!" + "'", str12, "Hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HhhhI!IhhI!HI!!h" + "'", str13, "HhhhI!IhhI!HI!!h");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hhhhhi!hhhhHHI!HHHI!IHHI!!" + "'", str16, "Hhhhhi!hhhhHHI!HHHI!IHHI!!");
    }

    @Test
    public void test7101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7101");
        char[] charArray14 = new char[] {};
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray14);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("", charArray14);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray14);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray14);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("", charArray14);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.uncapitalize("Hi!", charArray14);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray14);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.uncapitalize("hH", charArray14);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray14);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalize("Hhi!", charArray14);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.capitalize("HH", charArray14);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.capitalizeFully("HhHI!", charArray14);
        java.lang.String str27 = org.apache.commons.lang.WordUtils.uncapitalize("HhH", charArray14);
        java.lang.String str28 = org.apache.commons.lang.WordUtils.capitalize("", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] {});
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hi!" + "'", str18, "Hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hi!" + "'", str20, "Hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "HI!" + "'", str21, "HI!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hH" + "'", str22, "hH");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Hi!" + "'", str23, "Hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Hhi!" + "'", str24, "Hhi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "HH" + "'", str25, "HH");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "HhHI!" + "'", str26, "HhHI!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "HhH" + "'", str27, "HhH");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test7102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7102");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhi!ihhihhhi!ihhi!hhhi!ihhi!hi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhhi!ihhihhhi!ihhi!hhhi!ihhi!hi!!" + "'", str1, "hhhhi!ihhihhhi!ihhi!hhhi!ihhi!hi!!");
    }

    @Test
    public void test7103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7103");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HhhI!IhhI!Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihhHHHI!HHHI!HHHI!IHHI!!HHI!IHHI!HHHI!HHHI!IHHI!!HHhhhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!HhhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!HHHI!hHHI!HHhi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhI!IhhI!Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihhHHHI!HHHI!HHHI!IHHI!!HHI!IHHI!HHHI!HHHI!IHHI!!HHhhhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!HhhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!HHHI!hHHI!HHhi!" + "'", str1, "hhhI!IhhI!Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihhHHHI!HHHI!HHHI!IHHI!!HHI!IHHI!HHHI!HHHI!IHHI!!HHhhhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!HhhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!HHHI!hHHI!HHhi!");
    }

    @Test
    public void test7104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7104");
        char[] charArray7 = new char[] {};
        java.lang.String str8 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("hI!", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("Hhhi!ihhi!hhhhi!ihhi!hi!!h", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("Hh", charArray7);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("Hhhi!hhhi!hhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhHHHHHI!IHHI!HI!!H", charArray7);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hI!" + "'", str9, "hI!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hh" + "'", str12, "Hh");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!" + "'", str14, "hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
    }

    @Test
    public void test7105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7105");
        char[] charArray9 = new char[] { '#', '4', '4', '4' };
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!ihhi!hi!!", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("HhhI!IhhI!hHHHi!iHHi!hi!!H", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!IhhiHHHHi!iHHi!hi!!H", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("hHHI!IHHI!hHh", charArray9);
        java.lang.Class<?> wildcardClass15 = charArray9.getClass();
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '#', '4', '4', '4' });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hi!" + "'", str10, "Hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hhhi!ihhi!hi!!" + "'", str11, "Hhhi!ihhi!hi!!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HhhI!IhhI!hHHHi!iHHi!hi!!H" + "'", str12, "HhhI!IhhI!hHHHi!iHHi!hi!!H");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!IhhiHHHHi!iHHi!hi!!H" + "'", str13, "Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!IhhiHHHHi!iHHi!hi!!H");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "h" + "'", str14, "h");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test7106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7106");
        char[] charArray9 = new char[] {};
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("hi!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("HH", charArray9);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("hHHI!IHHI!HHI!IHI!!HI!!", charArray9);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhiHhHHi!iHHi!!hhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!IhHHi!iHHi!!!hHHi!iHHi!!IhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!IhHHi!iHHi!!!hHHi!iHHi!!!hHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!IhHHi!iHHi!!!hHHi!iHHi!!IhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!IhHHi!iHHi!!!hHHi!iHHi!!!hHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!IhHHi!iHHi!!!hHHi!iHHi!!IhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!IhHHi!iHHi!!!hHHi!iHHi!!!hHHi!iHHi!!ihHHi!iHHi!!hhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!IhHHi!iHHi!!!hHHi!iHHi!!IhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!IhHHi!iHHi!!!hHHi!iHHi!!!hHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!", charArray9);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("HhHHHI!HHHHhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HI!" + "'", str13, "HI!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HH" + "'", str15, "HH");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hHHI!IHHI!HHI!IHI!!HI!!" + "'", str16, "hHHI!IHHI!HHI!IHI!!HI!!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhiHhHHi!iHHi!!hhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!IhHHi!iHHi!!!hHHi!iHHi!!IhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!IhHHi!iHHi!!!hHHi!iHHi!!!hHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!IhHHi!iHHi!!!hHHi!iHHi!!IhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!IhHHi!iHHi!!!hHHi!iHHi!!!hHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!IhHHi!iHHi!!!hHHi!iHHi!!IhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!IhHHi!iHHi!!!hHHi!iHHi!!!hHHi!iHHi!!ihHHi!iHHi!!hhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!IhHHi!iHHi!!!hHHi!iHHi!!IhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!IhHHi!iHHi!!!hHHi!iHHi!!!hHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!" + "'", str17, "Hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhiHhHHi!iHHi!!hhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!IhHHi!iHHi!!!hHHi!iHHi!!IhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!IhHHi!iHHi!!!hHHi!iHHi!!!hHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!IhHHi!iHHi!!!hHHi!iHHi!!IhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!IhHHi!iHHi!!!hHHi!iHHi!!!hHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!IhHHi!iHHi!!!hHHi!iHHi!!IhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!IhHHi!iHHi!!!hHHi!iHHi!!!hHHi!iHHi!!ihHHi!iHHi!!hhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!IhHHi!iHHi!!!hHHi!iHHi!!IhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!IhHHi!iHHi!!!hHHi!iHHi!!!hHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test7107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7107");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHhHHI!HHHI!IHHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test7108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7108");
        char[] charArray7 = new char[] {};
        java.lang.String str8 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("hi!", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray7);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("hHHHI!IHHIHHHi!iHHi!hHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!", charArray7);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("hhHHi!iHHi!HhhhI!IhhI!HI!!hhhHHi!iHHi!HhhhI!IhhI!HI!!hhhHHi!iHHi!HhhhI!IhhI!HI!!hhhHHi!iHHi!HhhhI!IhhI!HI!!hIhHHi!iHHi!HhhhI!IhhI!HI!!h!hHHi!iHHi!HhhhI!IhhI!HI!!hIhHHi!iHHi!HhhhI!IhhI!HI!!hhhHHi!iHHi!HhhhI!IhhI!HI!!hhhHHi!iHHi!HhhhI!IhhI!HI!!hIhHHi!iHHi!HhhhI!IhhI!HI!!h!hHHi!iHHi!HhhhI!IhhI!HI!!hHhHHi!iHHi!HhhhI!IhhI!HI!!hIhHHi!iHHi!HhhhI!IhhI!HI!!h!hHHi!iHHi!HhhhI!IhhI!HI!!h!hHHi!iHHi!HhhhI!IhhI!HI!!hh", charArray7);
        java.lang.Class<?> wildcardClass15 = charArray7.getClass();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hi!" + "'", str11, "Hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hHHHI!IHHIHHHi!iHHi!hHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!" + "'", str13, "hHHHI!IHHIHHHi!iHHi!hHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hhHHi!iHHi!HhhhI!IhhI!HI!!hhhHHi!iHHi!HhhhI!IhhI!HI!!hhhHHi!iHHi!HhhhI!IhhI!HI!!hhhHHi!iHHi!HhhhI!IhhI!HI!!hIhHHi!iHHi!HhhhI!IhhI!HI!!h!hHHi!iHHi!HhhhI!IhhI!HI!!hIhHHi!iHHi!HhhhI!IhhI!HI!!hhhHHi!iHHi!HhhhI!IhhI!HI!!hhhHHi!iHHi!HhhhI!IhhI!HI!!hIhHHi!iHHi!HhhhI!IhhI!HI!!h!hHHi!iHHi!HhhhI!IhhI!HI!!hHhHHi!iHHi!HhhhI!IhhI!HI!!hIhHHi!iHHi!HhhhI!IhhI!HI!!h!hHHi!iHHi!HhhhI!IhhI!HI!!h!hHHi!iHHi!HhhhI!IhhI!HI!!hh" + "'", str14, "hhHHi!iHHi!HhhhI!IhhI!HI!!hhhHHi!iHHi!HhhhI!IhhI!HI!!hhhHHi!iHHi!HhhhI!IhhI!HI!!hhhHHi!iHHi!HhhhI!IhhI!HI!!hIhHHi!iHHi!HhhhI!IhhI!HI!!h!hHHi!iHHi!HhhhI!IhhI!HI!!hIhHHi!iHHi!HhhhI!IhhI!HI!!hhhHHi!iHHi!HhhhI!IhhI!HI!!hhhHHi!iHHi!HhhhI!IhhI!HI!!hIhHHi!iHHi!HhhhI!IhhI!HI!!h!hHHi!iHHi!HhhhI!IhhI!HI!!hHhHHi!iHHi!HhhhI!IhhI!HI!!hIhHHi!iHHi!HhhhI!IhhI!HI!!h!hHHi!iHHi!HhhhI!IhhI!HI!!h!hHHi!iHHi!HhhhI!IhhI!HI!!hh");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test7109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7109");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHI!IHHI!hhhhi!ihhihhhhi!hhhi!ihhiHHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hHHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!IHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!ihhi!hhhhi!ihhihhhhi!hhhi!ihhihhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!" + "'", str1, "Hhhi!ihhi!hhhhi!ihhihhhhi!hhhi!ihhihhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
    }

    @Test
    public void test7110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7110");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhi!ihi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhhhhhhhhhhhhhhhhhihhh!hhhhhhhhhhhhhhhihhh!hhhihhhhhhhhhhhihhh!hhh!i!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!", (int) (byte) 100, 100, "Hhhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhi!ihi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!hhhhi!Hhhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!" + "'", str4, "Hhhi!ihi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!hhhhi!Hhhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!");
    }

    @Test
    public void test7111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7111");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHHHI!IHHI!!HHHHHI!IHHI!!HHHHHI!IHHHHHI!HHHIHHHI!HHHI!IHHI!!HI!!IHHHHI!IHHI!!!HHHHI!IHHI!!HHHHHH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhhhhi!hhhihhhi!hhhi!ihhi!!hi!!ihhhhi!ihhi!!!hhhhi!ihhi!!hhhhhh" + "'", str1, "Hhhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhhhhi!hhhihhhi!hhhi!ihhi!!hi!!ihhhhi!ihhi!!!hhhhi!ihhi!!hhhhhh");
    }

    @Test
    public void test7112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7112");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhhhi!ihhiHhI!!!hhhhi!ihHhI!hi!!hhhhi!HhI!ihhi!!hhhhHhI!i!ihhi!!ihHhI!hhi!ihhi!!HhI!!hhhi!ihhiHhI!!!ihhhi!ihHhI!hi!!hhhhi!HhI!ihhi!!hHhhHhI!hI!IhhI!!hHhI!hhhI!IhhI!HhI!!hhhhI!IhhHhI!I!!hhhhI!IHhI!hhI!!ihhhIHhI!!IhhI!!!hhHhI!hI!IhhI!!iHhI!hhhI!IhhI!HhI!!hhhhI!IhhHhI!I!!hhhhI!IHhI!hhI!!ihhhIHhI!!IhhI!!!hhHhI!hI!IhhI!!hHhI!hhhI!IhhI!HhI!!ihhhI!IhhHhI!I!!!hhhI!IHhI!hhI!!!hhhiHhI!!ihhi!!ihhHhI!hi!ihhi!!!HhI!hhhi!ihhi!HhI!!hhhhi!ihhHhI!i!!ihhhi!iHhI!hhi!!!hhhiHhI!!ihhi!!!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhhi!ihhiHhI!!!hhhhi!ihHhI!hi!!hhhhi!HhI!ihhi!!hhhhHhI!i!ihhi!!ihHhI!hhi!ihhi!!HhI!!hhhi!ihhiHhI!!!ihhhi!ihHhI!hi!!hhhhi!HhI!ihhi!!hHhhHhI!hI!IhhI!!hHhI!hhhI!IhhI!HhI!!hhhhI!IhhHhI!I!!hhhhI!IHhI!hhI!!ihhhIHhI!!IhhI!!!hhHhI!hI!IhhI!!iHhI!hhhI!IhhI!HhI!!hhhhI!IhhHhI!I!!hhhhI!IHhI!hhI!!ihhhIHhI!!IhhI!!!hhHhI!hI!IhhI!!hHhI!hhhI!IhhI!HhI!!ihhhI!IhhHhI!I!!!hhhI!IHhI!hhI!!!hhhiHhI!!ihhi!!ihhHhI!hi!ihhi!!!HhI!hhhi!ihhi!HhI!!hhhhi!ihhHhI!i!!ihhhi!iHhI!hhi!!!hhhiHhI!!ihhi!!!" + "'", str2, "hhhhi!ihhiHhI!!!hhhhi!ihHhI!hi!!hhhhi!HhI!ihhi!!hhhhHhI!i!ihhi!!ihHhI!hhi!ihhi!!HhI!!hhhi!ihhiHhI!!!ihhhi!ihHhI!hi!!hhhhi!HhI!ihhi!!hHhhHhI!hI!IhhI!!hHhI!hhhI!IhhI!HhI!!hhhhI!IhhHhI!I!!hhhhI!IHhI!hhI!!ihhhIHhI!!IhhI!!!hhHhI!hI!IhhI!!iHhI!hhhI!IhhI!HhI!!hhhhI!IhhHhI!I!!hhhhI!IHhI!hhI!!ihhhIHhI!!IhhI!!!hhHhI!hI!IhhI!!hHhI!hhhI!IhhI!HhI!!ihhhI!IhhHhI!I!!!hhhI!IHhI!hhI!!!hhhiHhI!!ihhi!!ihhHhI!hi!ihhi!!!HhI!hhhi!ihhi!HhI!!hhhhi!ihhHhI!i!!ihhhi!iHhI!hhi!!!hhhiHhI!!ihhi!!!");
    }

    @Test
    public void test7113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7113");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("HHHHHi!iHHhHHHHI!IHHHHHHI!IHHIHHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhhhI!IhhHhhhhi!ihhhhhhi!ihhihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!" + "'", str1, "hhhhhI!IhhHhhhhi!ihhhhhhi!ihhihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!");
    }

    @Test
    public void test7114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7114");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HhHHi!iHHiHhH", (int) '4', (int) '4', "HhHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!!h");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end 52, length 13");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7115");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hIHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!h!HhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hhHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hIHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!h!HhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hiHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hIHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!h!HhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!h!", (int) (byte) 10, (int) (short) -1, "Hhhi!hhhi!hhhi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hIHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!h!HhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hhHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hIHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!h!HhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hiHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hIHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!h!HhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!h!" + "'", str4, "hHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hIHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!h!HhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hhHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hIHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!h!HhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hiHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hIHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!h!HhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!h!");
    }

    @Test
    public void test7116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7116");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!hhhi!HhHHHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!HHI!IHI!!HI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!hhhi!hhhhhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!ihi!!hi!hhi!ihi!!hi!!" + "'", str1, "Hhhi!hhhi!hhhhhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!ihi!!hi!hhi!ihi!!hi!!");
    }

    @Test
    public void test7117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7117");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhhi!hhhi!hhhi!Ihhi!!hhi!Ihhi!hhhi!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!hhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!hhHHHI!HHHIhHHI!HHHI!IHHI!!ihHHHI!HHHIhHHI!HHHI!IHHI!!!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhi!hhhi!hhhi!Ihhi!!hhi!Ihhi!hhhi!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!hhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!hhHHHI!HHHIhHHI!HHHI!IHHI!!ihHHHI!HHHIhHHI!HHHI!IHHI!!!" + "'", str2, "hhhi!hhhi!hhhi!Ihhi!!hhi!Ihhi!hhhi!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!hhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!hhHHHI!HHHIhHHI!HHHI!IHHI!!ihHHHI!HHHIhHHI!HHHI!IHHI!!!");
    }

    @Test
    public void test7118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7118");
        char[] charArray10 = new char[] {};
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("hi!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!ihhi!!", charArray10);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("H", charArray10);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("HhhI!HhI!HHhhhi!ihhihhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!", charArray10);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhhhi!ihhhhhhhi!ihhhhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhhhi!hhhihhhhi!!ihhi!!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hi!" + "'", str14, "Hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hhhi!ihhi!!" + "'", str17, "Hhhi!ihhi!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "HhhI!HhI!HHhhhi!ihhihhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!" + "'", str19, "HhhI!HhI!HHhhhi!ihhihhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hhhhhhi!ihhhhhhhi!ihhhhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhhhi!hhhihhhhi!!ihhi!!" + "'", str20, "Hhhhhhi!ihhhhhhhi!ihhhhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhhhi!hhhihhhhi!!ihhi!!");
    }

    @Test
    public void test7119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7119");
        char[] charArray9 = new char[] {};
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("hi!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("hHHi!iHHi!HHHI!IHHI!!hi!!", charArray9);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!ihi!!hi!hhi!ihi!!hi!!", charArray9);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("Hhhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!h!", charArray9);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!hhhi!hHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HhHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!IHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!!HHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HI!" + "'", str13, "HI!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HI!" + "'", str14, "HI!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hHHi!iHHi!HHHI!IHHI!!hi!!" + "'", str15, "hHHi!iHHi!HHHI!IHHI!!hi!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hhhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!ihi!!hi!hhi!ihi!!hi!!" + "'", str16, "Hhhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!ihi!!hi!hhi!ihi!!hi!!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hhhi!hhhi!hHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HhHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!IHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!!HHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!" + "'", str18, "Hhhi!hhhi!hHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HhHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!IHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!!HHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!");
    }

    @Test
    public void test7120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7120");
        char[] charArray11 = new char[] { '#', '4', '4', '4' };
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray11);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("Hhhi!ihhi!!", charArray11);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhi!hhhihhi!", charArray11);
        java.lang.Class<?> wildcardClass19 = charArray11.getClass();
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '#', '4', '4', '4' });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hi!" + "'", str12, "Hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hi!" + "'", str13, "Hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H" + "'", str17, "H");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hhhhi!hhhihhi!" + "'", str18, "Hhhhi!hhhihhi!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test7121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7121");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHHI!HHHI!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!HhHhhhi!ihhi!HHHi!iHHi!hi!!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHHI!HHHI!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!HhHhhhi!ihhi!HHHi!iHHi!hi!!" + "'", str2, "hHHI!HHHI!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!HhHhhhi!ihhi!HHHi!iHHi!hi!!");
    }

    @Test
    public void test7122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7122");
        char[] charArray9 = new char[] {};
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("hi!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("HI!", charArray9);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("hHHHI!HHHIHHHI!HHHI!IHHI!!", charArray9);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!!", charArray9);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("hhhi!hhhi!hhhhhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!ihi!!hi!hhi!ihi!!hi!!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HI!" + "'", str13, "HI!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HI!" + "'", str15, "HI!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hHHHI!HHHIHHHI!HHHI!IHHI!!" + "'", str16, "hHHHI!HHHIHHHI!HHHI!IHHI!!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test7123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7123");
        char[] charArray9 = new char[] {};
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("hi!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("hHHi!iHHi!HHHI!IHHI!!hi!!", charArray9);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!ihi!!hi!hhi!ihi!!hi!!", charArray9);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("hhhI!IhhI!HI!!", charArray9);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("Hhhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!hhhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!hhhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!hhhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!ihhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!!hhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!ihhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!hhhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!hhhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!ihhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!!hhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HI!" + "'", str13, "HI!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HI!" + "'", str14, "HI!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hHHi!iHHi!HHHI!IHHI!!hi!!" + "'", str15, "hHHi!iHHi!HHHI!IHHI!!hi!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hhhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!ihi!!hi!hhi!ihi!!hi!!" + "'", str16, "Hhhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!ihi!!hi!hhi!ihi!!hi!!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hhhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!hhhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!hhhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!hhhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!ihhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!!hhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!ihhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!hhhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!hhhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!ihhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!!hhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!!" + "'", str18, "Hhhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!hhhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!hhhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!hhhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!ihhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!!hhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!ihhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!hhhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!hhhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!ihhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!!hhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!!");
    }

    @Test
    public void test7124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7124");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("HHHHI!HHHIHhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!IhHHI!hHHI!iHHI!!!hHHI!hHHI!iHHIhHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!iHhhi!Hhhi!Ihhi!!!Hhhi!Hhhi!IHHhhhi!ihhi!hi!!h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test7125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7125");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hhHhhi!hHhhHhhhi!hhhiHHHHI!HHHIHHHi!iHHi!hi!!!IHHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhHhhi!hHhhHhhhi!hhhiHHHHI!HHHIHHHi!iHHi!hi!!!IHHI!!" + "'", str1, "hhHhhi!hHhhHhhhi!hhhiHHHHI!HHHIHHHi!iHHi!hi!!!IHHI!!");
    }

    @Test
    public void test7126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7126");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!hhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!hhHHHI!HHHIhHHI!HHHI!IHHI!!ihHHHI!HHHIhHHI!HHHI!IHHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!hhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!hhHHHI!HHHIhHHI!HHHI!IHHI!!ihHHHI!HHHIhHHI!HHHI!IHHI!!!" + "'", str1, "hhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!hhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!hhHHHI!HHHIhHHI!HHHI!IHHI!!ihHHHI!HHHIhHHI!HHHI!IHHI!!!");
    }

    @Test
    public void test7127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7127");
        char[] charArray5 = new char[] { ' ' };
        java.lang.String str6 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray5);
        java.lang.String str7 = org.apache.commons.lang.WordUtils.capitalize("h", charArray5);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhhi!ihhi!!", charArray5);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("Hhhhhi!ihhhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ' });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hhhhi!ihhi!!" + "'", str8, "Hhhhi!ihhi!!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H" + "'", str9, "H");
    }

    @Test
    public void test7128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7128");
        char[] charArray10 = new char[] { '#', '4', '4', '4' };
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("HHI!", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("H", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhihhi!hhi!hhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("hHhhi!hHhhHhhhi!hhhiHHHHI!HHHIHHHi!iHHi!hi!!!IHHI!!", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("hHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IhHHHI!hHHI!hHi!HHhi!HHI!!IHHHI!IHHI!!!HHHHHI!IHHI!!HhHHHI!hHHI!hHi!HHhi!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHhHHHI!hHHI!hHi!HHhi!I!!!HHHi!iHHi!HHHI!IHHI!!hi!!IHHhHHHI!hHHI!hHi!HHhi!HHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHIhHHHI!hHHI!hHi!HHhi!!!IHHHI!IHHI!!!!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '#', '4', '4', '4' });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hi!" + "'", str11, "Hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H" + "'", str12, "H");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "h" + "'", str13, "h");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hhhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhihhi!hhi!hhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!" + "'", str14, "Hhhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhihhi!hhi!hhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "h" + "'", str15, "h");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IhHHHI!hHHI!hHi!HHhi!HHI!!IHHHI!IHHI!!!HHHHHI!IHHI!!HhHHHI!hHHI!hHi!HHhi!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHhHHHI!hHHI!hHi!HHhi!I!!!HHHi!iHHi!HHHI!IHHI!!hi!!IHHhHHHI!hHHI!hHi!HHhi!HHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHIhHHHI!hHHI!hHi!HHhi!!!IHHHI!IHHI!!!!" + "'", str16, "HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IhHHHI!hHHI!hHi!HHhi!HHI!!IHHHI!IHHI!!!HHHHHI!IHHI!!HhHHHI!hHHI!hHi!HHhi!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHhHHHI!hHHI!hHi!HHhi!I!!!HHHi!iHHi!HHHI!IHHI!!hi!!IHHhHHHI!hHHI!hHi!HHhi!HHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHIhHHHI!hHHI!hHi!HHhi!!!IHHHI!IHHI!!!!");
    }

    @Test
    public void test7129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7129");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhhi!Hhhi!HhI!hhHI!", (int) '#', (int) (short) 100, "hhHHi!iHHi!HHHI!IHHI!!hi!!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end 35, length 19");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7130");
        char[] charArray9 = new char[] {};
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("hi!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("Hhhi!ihhi!!", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("HHHHI!HHHIHHHI!HHHI!IHHI!!", charArray9);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("HHHI!hHHI!iHHI!!", charArray9);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!h", charArray9);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("HHI!iHI!!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HHHI!hHHI!iHHI!!" + "'", str16, "HHHI!hHHI!iHHI!!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!h" + "'", str17, "hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!h");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test7131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7131");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHhhhi!ihhiHHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!iHHHI!hHHI!iHHIhhhhI!IhhI!HI!!h", (int) 'a', (int) (short) 1, "Hhhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hhhhhhhi!ihhHHHi!iHHi!hi!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHhhhi!ihhiHHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!iHhhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hhhhhhhi!ihhHHHi!iHHi!hi!!" + "'", str4, "hHhhhi!ihhiHHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!iHhhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hhhhhhhi!ihhHHHi!iHHi!hi!!");
    }

    @Test
    public void test7132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7132");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!hhhi!hhhi!hhhi!hhhi!ihi!!hhhi!Hhhi!ihhi!hhHHHI!IHHI!HI!!H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhi!hhhi!hhhi!hhhi!hhhi!ihi!!hhhi!Hhhi!ihhi!hhHHHI!IHHI!HI!!H" + "'", str1, "hhhi!hhhi!hhhi!hhhi!hhhi!ihi!!hhhi!Hhhi!ihhi!hhHHHI!IHHI!HI!!H");
    }

    @Test
    public void test7133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7133");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhHI!iHI!!HhHI!iHI!!HhHI!iHI!!IhHI!iHI!!!hHI!iHI!!IhHI!iHI!!HhHI!iHI!!HhHI!iHI!!IhHI!iHI!!!hHI!iHI!!HhHI!iHI!!HhHI!iHI!!IhHI!iHI!!!hHI!iHI!!IhHI!iHI!!HhHI!iHI!!IhHI!iHI!!!hHI!iHI!!!hHI!iHI!!HhHI!iHI!!IhHI!iHI!!!hHI!iHI!!!", (int) (short) 0, (int) (short) 10, "HhHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!ihHHI!IHHI!HI!!hhHHI!IHHIhhhi!Hhhi!HhI!hhHI!!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHIhhhi!Hhhi!HhI!hhHI!!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!ihHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!hhhi!Hhhi!HhI!hhHI!!hHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!!hHHI!IHHI!HI!!h");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhHI!iHI!!HhHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!ihHHI!IHHI!HI!!hhHHI!IHHIhhhi!Hhhi!HhI!hhHI!!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHIhhhi!Hhhi!HhI!hhHI!!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!ihHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!hhhi!Hhhi!HhI!hhHI!!hHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!!hHHI!IHHI!HI!!h" + "'", str4, "hhHI!iHI!!HhHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!ihHHI!IHHI!HI!!hhHHI!IHHIhhhi!Hhhi!HhI!hhHI!!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHIhhhi!Hhhi!HhI!hhHI!!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!ihHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!hhhi!Hhhi!HhI!hhHI!!hHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!!hHHI!IHHI!HI!!h");
    }

    @Test
    public void test7134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7134");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!", (int) '#', (int) (byte) 1, "hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!hhhhi!Hhhi!Ihhi!!hhhhi!Hhhi!Ihhi!!hhhhi!Hhhi!Ihhi!!ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!ihhhi!Hhhi!Ihhi!!hhhhi!Hhhi!Ihhi!!hhhhi!Hhhi!Ihhi!!ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!hhhhi!Hhhi!Ihhi!!ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!h");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!hhhhi!Hhhi!Ihhi!!hhhhi!Hhhi!Ihhi!!hhhhi!Hhhi!Ihhi!!ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!ihhhi!Hhhi!Ihhi!!hhhhi!Hhhi!Ihhi!!hhhhi!Hhhi!Ihhi!!ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!hhhhi!Hhhi!Ihhi!!ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!h" + "'", str4, "Hhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!hhhhi!Hhhi!Ihhi!!hhhhi!Hhhi!Ihhi!!hhhhi!Hhhi!Ihhi!!ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!ihhhi!Hhhi!Ihhi!!hhhhi!Hhhi!Ihhi!!hhhhi!Hhhi!Ihhi!!ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!hhhhi!Hhhi!Ihhi!!ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!h");
    }

    @Test
    public void test7135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7135");
        char[] charArray8 = new char[] {};
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("H", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("hh", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("HH", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("Hhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!", charArray8);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("hHhhI!IhhI!hHHHi!iHHi!hi!!HHHhhI!IhhI!hHHHi!iHHi!hi!HHHI!hHHI!hHi!HHhi!", charArray8);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("hHHHI!HHHI!HHHI!", charArray8);
        java.lang.Class<?> wildcardClass17 = charArray8.getClass();
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hh" + "'", str12, "hh");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HH" + "'", str13, "HH");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hHhhI!IhhI!hHHHi!iHHi!hi!!HHHhhI!IhhI!hHHHi!iHHi!hi!HHHI!hHHI!hHi!HHhi!" + "'", str15, "hHhhI!IhhI!hHHHi!iHHi!hi!!HHHhhI!IhhI!hHHHi!iHHi!hi!HHHI!hHHI!hHi!HHhi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hHHHI!HHHI!HHHI!" + "'", str16, "hHHHI!HHHI!HHHI!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test7136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7136");
        char[] charArray8 = new char[] { '4', '4' };
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("HHi!", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("HH", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("hhI!", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("hhhi!ihhi!hhh", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hHHHI!IHHI!!", charArray8);
        java.lang.Class<?> wildcardClass15 = charArray8.getClass();
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Hi!" + "'", str9, "Hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hhi!" + "'", str10, "Hhi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hH" + "'", str11, "hH");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "h" + "'", str12, "h");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "h" + "'", str13, "h");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hhhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hHHHI!IHHI!!" + "'", str14, "hhhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hHHHI!IHHI!!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test7137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7137");
        char[] charArray9 = new char[] {};
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("Hi!", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!hHhhhi!hhhi!ihhi!!hHhhhi!hhhi!ihhi!!iHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!hHhhhi!hhhi!ihhi!!iHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!!", charArray9);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhhhhhhihh!hhhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhihh!hhihhhhhhhhihh!hhhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhihh!hh!", charArray9);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHHHH", charArray9);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!hhhi!HhHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!!hHI!iHI!!ihHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!hHhhI!IhhI!!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hi!" + "'", str14, "Hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hHHhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!hHhhhi!hhhi!ihhi!!hHhhhi!hhhi!ihhi!!iHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!hHhhhi!hhhi!ihhi!!iHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!!" + "'", str15, "hHHhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!hHhhhi!hhhi!ihhi!!hHhhhi!hhhi!ihhi!!iHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!hHhhhi!hhhi!ihhi!!iHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hhhhhhhhhihh!hhhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhihh!hhihhhhhhhhihh!hhhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhihh!hh!" + "'", str16, "Hhhhhhhhhihh!hhhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhihh!hhihhhhhhhhihh!hhhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhihh!hh!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHHHH" + "'", str17, "HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHHHH");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hhhi!hhhi!HhHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!!hHI!iHI!!ihHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!hHhhI!IhhI!!" + "'", str18, "Hhhi!hhhi!HhHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!!hHI!iHI!!ihHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!hHhhI!IhhI!!");
    }

    @Test
    public void test7138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7138");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hhhhi!ihhiHhHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!ihHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!ihHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!!hHHI!IHHI!HI!!h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhhi!ihhiHhHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!ihHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!ihHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!!hHHI!IHHI!HI!!h" + "'", str1, "hhhhi!ihhiHhHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!ihHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!ihHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!!hHHI!IHHI!HI!!h");
    }

    @Test
    public void test7139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7139");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hHHHHHHHHIhHHHI!HHHIHHHHI!HHHIHHHI!IHHI!HI!!!IHHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHHHHHHHIhHHHI!HHHIHHHHI!HHHIHHHI!IHHI!HI!!!IHHI!!" + "'", str1, "hHHHHHHHHIhHHHI!HHHIHHHHI!HHHIHHHI!IHHI!HI!!!IHHI!!");
    }

    @Test
    public void test7140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7140");
        char[] charArray12 = new char[] {};
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray12);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("", charArray12);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray12);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray12);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("", charArray12);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhhi!ihhi!hi!!h", charArray12);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("hhhhI!IhhI!HI!!h", charArray12);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.initials("hhHHI!HHHI!Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!", charArray12);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalize("hhhhh", charArray12);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.uncapitalize("hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!HhHhhhi!ihhi!HHHi!iHHi!hi!!", charArray12);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!ihhi!", charArray12);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalize("HhHI!iHI!!HhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHHhhhhhhhhhhhhhhhihhh!hhhhhhhhhhhhhhhihhh!hhhihhhhhhhhhhhihhh!hhh!i!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!ihHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!!", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] {});
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hi!" + "'", str16, "Hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hhhhhi!ihhi!hi!!h" + "'", str18, "Hhhhhi!ihhi!hi!!h");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hhhhI!IhhI!HI!!h" + "'", str19, "hhhhI!IhhI!HI!!h");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hhhhh" + "'", str21, "hhhhh");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!HhHhhhi!ihhi!HHHi!iHHi!hi!!" + "'", str22, "hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!HhHhhhi!ihhi!HHHi!iHHi!hi!!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Hhhi!ihhi!" + "'", str23, "Hhhi!ihhi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "HhHI!iHI!!HhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHHhhhhhhhhhhhhhhhihhh!hhhhhhhhhhhhhhhihhh!hhhihhhhhhhhhhhihhh!hhh!i!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!ihHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!!" + "'", str24, "HhHI!iHI!!HhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHHhhhhhhhhhhhhhhhihhh!hhhhhhhhhhhhhhhihhh!hhhihhhhhhhhhhhihhh!hhh!i!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!ihHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!!");
    }

    @Test
    public void test7141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7141");
        char[] charArray9 = new char[] {};
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("hH", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("hI!", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("HHi!", charArray9);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("hhI!HhI!HhI!HhI!ihI!!hI!ihI!HhI!HhI!ihI!!hI!hhI!ihI!!hI!!", charArray9);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhhhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihhhhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!!hh!", charArray9);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("hhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihhhhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!!hh!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hi!" + "'", str12, "Hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hI!" + "'", str14, "hI!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hhI!HhI!HhI!HhI!ihI!!hI!ihI!HhI!HhI!ihI!!hI!hhI!ihI!!hI!!" + "'", str16, "hhI!HhI!HhI!HhI!ihI!!hI!ihI!HhI!HhI!ihI!!hI!hhI!ihI!!hI!!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhhhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihhhhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!!hh!" + "'", str17, "Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhhhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihhhhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!!hh!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihhhhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!!hh!" + "'", str18, "hhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihhhhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!!hh!");
    }

    @Test
    public void test7142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7142");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("HhHHI!IHHIHHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhhHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHhhi!ihhihhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHHhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!!" + "'", str1, "hHhhi!ihhihhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHHhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!!");
    }

    @Test
    public void test7143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7143");
        char[] charArray9 = new char[] {};
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("hi!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("HI!", charArray9);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray9);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("HhhI!IhhI!!", charArray9);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("hHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHHHI!IHHHHHI!IHHI!HHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HI!" + "'", str13, "HI!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HI!" + "'", str15, "HI!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHHHI!IHHHHHI!IHHI!HHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!" + "'", str18, "hHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHHHI!IHHHHHI!IHHI!HHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!");
    }

    @Test
    public void test7144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7144");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hhHHHI!HHHIhHHI!HHHI!IHHI!!hhHHHI!HHHIhHHI!HHHI!IHHI!!hhHHHI!HHHIhHHI!HHHI!IHHI!!hhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!hhHHHI!HHHIhHHI!HHHI!IHHI!!hhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhHHHI!HHHIhHHI!HHHI!IHHI!!hhHHHI!HHHIhHHI!HHHI!IHHI!!hhHHHI!HHHIhHHI!HHHI!IHHI!!hhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!hhHHHI!HHHIhHHI!HHHI!IHHI!!hhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!!" + "'", str1, "hhHHHI!HHHIhHHI!HHHI!IHHI!!hhHHHI!HHHIhHHI!HHHI!IHHI!!hhHHHI!HHHIhHHI!HHHI!IHHI!!hhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!hhHHHI!HHHIhHHI!HHHI!IHHI!!hhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!!");
    }

    @Test
    public void test7145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7145");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hHHI!IHHI!HHI!IHI!!HI!!", (int) (byte) 0, "Hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!h", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hHHhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hHHhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hIHhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!h!Hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hIHhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hHHhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hHHhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hIHhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!h!Hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hHHhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hHHhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hIHhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!h!Hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hIHhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hHHhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hIHhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!h!Hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!h!Hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hHHhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hIHhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!h!Hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!h!" + "'", str4, "hHhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hHHhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hHHhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hIHhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!h!Hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hIHhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hHHhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hHHhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hIHhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!h!Hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hHHhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hHHhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hIHhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!h!Hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hIHhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hHHhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hIHhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!h!Hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!h!Hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hHHhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hIHhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!h!Hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!h!");
    }

    @Test
    public void test7146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7146");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhhi!ihhi!HI!", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhi!ihhi!HI!" + "'", str2, "hhhi!ihhi!HI!");
    }

    @Test
    public void test7147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7147");
        char[] charArray8 = new char[] { '#', '4', '4', '4' };
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("HHhi!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '#', '4', '4', '4' });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Hi!" + "'", str9, "Hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hi!" + "'", str10, "Hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H" + "'", str11, "H");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!" + "'", str12, "Hhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!");
    }

    @Test
    public void test7148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7148");
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
        java.lang.String str22 = org.apache.commons.lang.WordUtils.initials("", charArray11);
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test7149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7149");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hhHHi!iHHiHhhi!ihhi!HHHi!iHHi!hi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHhhI!IhhIhHHI!IHHI!hhhI!IhhI!HI!!" + "'", str1, "HHhhI!IhhIhHHI!IHHI!hhhI!IhhI!HI!!");
    }

    @Test
    public void test7150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7150");
        char[] charArray8 = new char[] { 'a', ' ', '4', 'a', 'a', ' ' };
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalizeFully("HhHHi!iHHi!!", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("hhhi!hhhi!hHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!HhHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHhHhh", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { 'a', ' ', '4', 'a', 'a', ' ' });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Hhhhi!ihhi!!" + "'", str9, "Hhhhi!ihhi!!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hhhi!hhhi!hHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!HhHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHhHhh" + "'", str10, "hhhi!hhhi!hHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!HhHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHhHhh");
    }

    @Test
    public void test7151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7151");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HHhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!ihHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!ihHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!!" + "'", str2, "HHhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!ihHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!!");
    }

    @Test
    public void test7152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7152");
        char[] charArray14 = new char[] {};
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray14);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("", charArray14);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("hi!", charArray14);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray14);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("", charArray14);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("HI!", charArray14);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.uncapitalize("hH", charArray14);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray14);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.initials("Hhi!", charArray14);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalize("", charArray14);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.initials("HHHI!HHHI!IHHI!!", charArray14);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray14);
        java.lang.String str27 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhi!hhhi!hhi!hhhi!", charArray14);
        java.lang.String str28 = org.apache.commons.lang.WordUtils.capitalize("Hhhhhi!hhhhhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhiHhhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhhhhi!hhhihhhi!hhhi!ihhi!!hi!!ihhhhi!ihhi!!!hhhhi!ihhi!!hhhhhhhhhhhhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhi!ihhi!!hhhi!!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihHhhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhhhhi!hhhihhhi!hhhi!ihhi!!hi!!ihhhhi!ihhi!!!hhhhi!ihhi!!hhhhhhhhhhhhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhi!ihhi!!hhhi!hi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!Hhhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhhhhi!hhhihhhi!hhhi!ihhi!!hi!!ihhhhi!ihhi!!!hhhhi!ihhi!!hhhhhhhhhhhhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhi!ihhi!!hhhi!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] {});
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HI!" + "'", str18, "HI!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HI!" + "'", str20, "HI!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hH" + "'", str21, "hH");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hhhi!hhhi!hhi!hhhi!" + "'", str27, "hhhi!hhhi!hhi!hhhi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Hhhhhi!hhhhhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhiHhhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhhhhi!hhhihhhi!hhhi!ihhi!!hi!!ihhhhi!ihhi!!!hhhhi!ihhi!!hhhhhhhhhhhhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhi!ihhi!!hhhi!!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihHhhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhhhhi!hhhihhhi!hhhi!ihhi!!hi!!ihhhhi!ihhi!!!hhhhi!ihhi!!hhhhhhhhhhhhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhi!ihhi!!hhhi!hi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!Hhhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhhhhi!hhhihhhi!hhhi!ihhi!!hi!!ihhhhi!ihhi!!!hhhhi!ihhi!!hhhhhhhhhhhhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhi!ihhi!!hhhi!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!" + "'", str28, "Hhhhhi!hhhhhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhiHhhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhhhhi!hhhihhhi!hhhi!ihhi!!hi!!ihhhhi!ihhi!!!hhhhi!ihhi!!hhhhhhhhhhhhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhi!ihhi!!hhhi!!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihHhhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhhhhi!hhhihhhi!hhhi!ihhi!!hi!!ihhhhi!ihhi!!!hhhhi!ihhi!!hhhhhhhhhhhhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhi!ihhi!!hhhi!hi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!Hhhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhhhhi!hhhihhhi!hhhi!ihhi!!hi!!ihhhhi!ihhi!!!hhhhi!ihhi!!hhhhhhhhhhhhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhi!ihhi!!hhhi!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
    }

    @Test
    public void test7153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7153");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!" + "'", str1, "HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!");
    }

    @Test
    public void test7154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7154");
        char[] charArray14 = new char[] { '#', '4', '4', '4' };
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray14);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray14);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("", charArray14);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("HHi!", charArray14);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray14);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("hhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHHI!IHHIHHHi!iHHi!hHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!", charArray14);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalizeFully("HhhI!IhhI!Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!", charArray14);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.initials("hhhhi!hhhi!ihhi!!", charArray14);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHI!IHHI!hHhhI!IhhI!!HHhhI!IhhI!!HHhhI!IhhI!!HHhhI!IhhI!!IHhhI!IhhI!!!HhhI!IhhI!!HHhhI!IhhI!!HHhhI!IhhI!!HHhhhHHHHHHHHHHHHHHHIHHH!HHHHHHHHHHHHHHHIHHH!HHHIHHHHHHHHHHHIHHH!HHH!I!IhhI!!IHhhI!IhhI!!!HhhI!IhhI!!IHhhI!IhhI!!HHhhI!IhhI!!HHhhI!IhhI!!IHhhI!IhhI!!!HhhI!IhhI!!!hhhI!IhhI!hHhhI!IhhI!!HHhhI!IhhI!!HHhhI!IhhI!!HHhhI!IhhI!!IHhhI!IhhI!!!HhhI!IhhI!!HHhhI!IhhI!!HHhhI!IhhI!!HHhhhHHHHHHHHHHHHHHHIHHH!HHHHHHHHHHHHHHHIHHH!HHHIHHHHHHHHHHHIHHH!HHH!I!IhhI!!IHhhI!IhhI!!!HhhI!IhhI!!IHhhI!IhhI!!HHhhI!IhhI!!HHhhI!IhhI!!IHhhI!IhhI!!!HhhI!IhhI!!!HI!!", charArray14);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHHi!iHHi!hi!!", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { '#', '4', '4', '4' });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hi!" + "'", str15, "Hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hi!" + "'", str16, "Hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H" + "'", str18, "H");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhhi!ihhihhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!" + "'", str20, "Hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhhi!ihhihhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Hhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!" + "'", str21, "Hhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "h" + "'", str22, "h");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Hhhi!ihhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhhhhhhhhhhhhhhhhhihhh!hhhhhhhhhhhhhhhihhh!hhhihhhhhhhhhhhihhh!hhh!i!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhhhhhhhhhhhhhhhhhihhh!hhhhhhhhhhhhhhhihhh!hhhihhhhhhhhhhhihhh!hhh!i!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hi!!" + "'", str23, "Hhhi!ihhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhhhhhhhhhhhhhhhhhihhh!hhhhhhhhhhhhhhhihhh!hhhihhhhhhhhhhhihhh!hhh!i!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhhhhhhhhhhhhhhhhhihhh!hhhhhhhhhhhhhhhihhh!hhhihhhhhhhhhhhihhh!hhh!i!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hi!!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Hhhhi!ihhi!hi!!" + "'", str24, "Hhhhi!ihhi!hi!!");
    }

    @Test
    public void test7155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7155");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!hhhi!hhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhHHHHHI!IHHI!HI!!H", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhi!hhhi!hhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhHHHHHI!IHHI!HI!!H" + "'", str2, "Hhhi!hhhi!hhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhHHHHHI!IHHI!HI!!H");
    }

    @Test
    public void test7156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7156");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("HhHHi!iHHi!HhhhI!IhhI!HI!!hhhHHi!iHHi!HhhhI!IhhI!HI!!hhhHHi!iHHi!HhhhI!IhhI!HI!!hhhHHi!iHHi!HhhhI!IhhHHi!iHHi!HHHI!IHHI!!hi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!ihhi!hhhhi!ihhi!hi!!hhhhhi!ihhi!hhhhi!ihhi!hi!!hhhhhi!ihhi!hhhhi!ihhi!hi!!hhhhhi!ihhi!hhhhi!ihhhhi!ihhi!hhhi!ihhi!!hi!!" + "'", str1, "Hhhhi!ihhi!hhhhi!ihhi!hi!!hhhhhi!ihhi!hhhhi!ihhi!hi!!hhhhhi!ihhi!hhhhi!ihhi!hi!!hhhhhi!ihhi!hhhhi!ihhhhi!ihhi!hhhi!ihhi!!hi!!");
    }

    @Test
    public void test7157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7157");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hHHHI!IHHI!HI!!H", (int) (byte) -1, "Hhhi!hhhi!hhhi!ihi!!hhhi!ihi!!hhhi!hHHI!IHHI!hi!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHhhi!hhhi!hhhi!ihi!!hhhi!ihi!!hhhi!hHHI!IHHI!hi!HHhhi!hhhi!hhhi!ihi!!hhhi!ihi!!hhhi!hHHI!IHHI!hi!HHhhi!hhhi!hhhi!ihi!!hhhi!ihi!!hhhi!hHHI!IHHI!hi!HHhhi!hhhi!hhhi!ihi!!hhhi!ihi!!hhhi!hHHI!IHHI!hi!IHhhi!hhhi!hhhi!ihi!!hhhi!ihi!!hhhi!hHHI!IHHI!hi!!Hhhi!hhhi!hhhi!ihi!!hhhi!ihi!!hhhi!hHHI!IHHI!hi!IHhhi!hhhi!hhhi!ihi!!hhhi!ihi!!hhhi!hHHI!IHHI!hi!HHhhi!hhhi!hhhi!ihi!!hhhi!ihi!!hhhi!hHHI!IHHI!hi!HHhhi!hhhi!hhhi!ihi!!hhhi!ihi!!hhhi!hHHI!IHHI!hi!IHhhi!hhhi!hhhi!ihi!!hhhi!ihi!!hhhi!hHHI!IHHI!hi!!Hhhi!hhhi!hhhi!ihi!!hhhi!ihi!!hhhi!hHHI!IHHI!hi!HHhhi!hhhi!hhhi!ihi!!hhhi!ihi!!hhhi!hHHI!IHHI!hi!IHhhi!hhhi!hhhi!ihi!!hhhi!ihi!!hhhi!hHHI!IHHI!hi!!Hhhi!hhhi!hhhi!ihi!!hhhi!ihi!!hhhi!hHHI!IHHI!hi!!Hhhi!hhhi!hhhi!ihi!!hhhi!ihi!!hhhi!hHHI!IHHI!hi!H" + "'", str4, "hHhhi!hhhi!hhhi!ihi!!hhhi!ihi!!hhhi!hHHI!IHHI!hi!HHhhi!hhhi!hhhi!ihi!!hhhi!ihi!!hhhi!hHHI!IHHI!hi!HHhhi!hhhi!hhhi!ihi!!hhhi!ihi!!hhhi!hHHI!IHHI!hi!HHhhi!hhhi!hhhi!ihi!!hhhi!ihi!!hhhi!hHHI!IHHI!hi!IHhhi!hhhi!hhhi!ihi!!hhhi!ihi!!hhhi!hHHI!IHHI!hi!!Hhhi!hhhi!hhhi!ihi!!hhhi!ihi!!hhhi!hHHI!IHHI!hi!IHhhi!hhhi!hhhi!ihi!!hhhi!ihi!!hhhi!hHHI!IHHI!hi!HHhhi!hhhi!hhhi!ihi!!hhhi!ihi!!hhhi!hHHI!IHHI!hi!HHhhi!hhhi!hhhi!ihi!!hhhi!ihi!!hhhi!hHHI!IHHI!hi!IHhhi!hhhi!hhhi!ihi!!hhhi!ihi!!hhhi!hHHI!IHHI!hi!!Hhhi!hhhi!hhhi!ihi!!hhhi!ihi!!hhhi!hHHI!IHHI!hi!HHhhi!hhhi!hhhi!ihi!!hhhi!ihi!!hhhi!hHHI!IHHI!hi!IHhhi!hhhi!hhhi!ihi!!hhhi!ihi!!hhhi!hHHI!IHHI!hi!!Hhhi!hhhi!hhhi!ihi!!hhhi!ihi!!hhhi!hHHI!IHHI!hi!!Hhhi!hhhi!hhhi!ihi!!hhhi!ihi!!hhhi!hHHI!IHHI!hi!H");
    }

    @Test
    public void test7158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7158");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HHI!HHI!HHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!!HI!HHI!HHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!!HI!HHI!HHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!!HI!IHI!HHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!!HI!!HI!HHI!HHI!HHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!!HI!HHI!HHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!!HI!HHI!HHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!!HI!IHI!HHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!!HI!!HI!HHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!HHI!HHI!IHI!!HI!IHI!HHI!IHI!!HI!!HI!HHI!IHI!!HI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHI!HHI!HHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!!HI!HHI!HHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!!HI!HHI!HHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!!HI!IHI!HHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!!HI!!HI!HHI!HHI!HHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!!HI!HHI!HHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!!HI!HHI!HHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!!HI!IHI!HHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!!HI!!HI!HHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!HHI!HHI!IHI!!HI!IHI!HHI!IHI!!HI!!HI!HHI!IHI!!HI!!" + "'", str1, "hHI!HHI!HHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!!HI!HHI!HHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!!HI!HHI!HHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!!HI!IHI!HHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!!HI!!HI!HHI!HHI!HHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!!HI!HHI!HHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!!HI!HHI!HHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!!HI!IHI!HHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!!HI!!HI!HHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!HHI!HHI!IHI!!HI!IHI!HHI!IHI!!HI!!HI!HHI!IHI!!HI!!");
    }

    @Test
    public void test7159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7159");
        char[] charArray7 = new char[] {};
        java.lang.String str8 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("hi!", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("HHhhi!", charArray7);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("hh", charArray7);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("Hhhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hI!" + "'", str11, "hI!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HHhhi!" + "'", str12, "HHhhi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hh" + "'", str13, "hh");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hhhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!!" + "'", str14, "Hhhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!!");
    }

    @Test
    public void test7160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7160");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hHHHI!HHHIhhHHI!!IHHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHHI!HHHIhhHHI!!IHHI!!" + "'", str1, "HHHHI!HHHIhhHHI!!IHHI!!");
    }

    @Test
    public void test7161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7161");
        char[] charArray10 = new char[] {};
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("Hi!", charArray10);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray10);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.initials("Hhhi!ihhi!hhhi!ihhi!!hi!!", charArray10);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.initials("hh", charArray10);
        java.lang.Class<?> wildcardClass21 = charArray10.getClass();
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test7162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7162");
        char[] charArray7 = new char[] {};
        java.lang.String str8 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("Hh", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("HHHI!hHHI!iHHI!!", charArray7);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhi!hhhiHhhi!hhhi!ihhi!!", charArray7);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!ihhi!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihhHHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!hHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!hhhi!Hhhi!hhHI!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hh" + "'", str10, "Hh");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HHHI!hHHI!iHHI!!" + "'", str12, "HHHI!hHHI!iHHI!!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hhhhi!hhhiHhhi!hhhi!ihhi!!" + "'", str13, "Hhhhi!hhhiHhhi!hhhi!ihhi!!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hhhi!ihhi!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihhHHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!hHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!hhhi!Hhhi!hhHI!" + "'", str14, "Hhhi!ihhi!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihhHHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!hHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!hhhi!Hhhi!hhHI!");
    }

    @Test
    public void test7163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7163");
        char[] charArray11 = new char[] {};
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("hi!", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("Hhhi!ihhi!!", charArray11);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("HHHHI!HHHIHHHI!HHHI!IHHI!!", charArray11);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("hHHi!iHHi!hHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!", charArray11);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!ihi!!hi!hhi!ihi!!hi!!", charArray11);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!!", charArray11);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!", charArray11);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhHHhhhi!hhhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!", charArray11);
        java.lang.Class<?> wildcardClass23 = charArray11.getClass();
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] {});
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Hhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!ihi!!hi!hhi!ihi!!hi!!" + "'", str19, "Hhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!ihi!!hi!hhi!ihi!!hi!!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!!" + "'", str20, "HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!" + "'", str21, "Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhHHhhhi!hhhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!" + "'", str22, "Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhHHhhhi!hhhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test7164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7164");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHHHHI!HHHHHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!", 10, 10, "hhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihhhhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!!hh!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHHHHI!HHHhhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihhhhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!!hh!" + "'", str4, "HHHHHI!HHHhhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihhhhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!!hh!");
    }

    @Test
    public void test7165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7165");
        char[] charArray8 = new char[] {};
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("Hh", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("hHH", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHHI!HHHI!IHHI!!", charArray8);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("hhhhhi!ihhi!hi!!h", charArray8);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("hhHHHI!IHHIHHHHI!HHHI!IHHI!!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hh" + "'", str12, "Hh");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hHH" + "'", str13, "hHH");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hHHHI!HHHI!IHHI!!" + "'", str14, "hHHHI!HHHI!IHHI!!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hhHHHI!IHHIHHHHI!HHHI!IHHI!!" + "'", str16, "hhHHHI!IHHIHHHHI!HHHI!IHHI!!");
    }

    @Test
    public void test7166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7166");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!" + "'", str1, "Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!");
    }

    @Test
    public void test7167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7167");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhhi!hhhiHhhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhhhhi!hhhihhhi!hhhi!ihhi!!hi!!ihhhhi!ihhi!!!hhhhi!ihhi!!hhhhhhhhhi!hhhihhhi!hhhi!ihhi!!i!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!hhhhi!ihhi!!!hhhhi!ihhi!!ihhhhi!ihhhhhhi!hhhihhhi!hhhi!ihhi!!i!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhihhhhi!hhhihhhi!hhhi!ihhi!!!ihhi!!!hhhhi!ihhi!!!", (int) (byte) 0, 1, "Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhHhhi!hhhi!ihhi!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhHhhi!hhhi!ihhi!!" + "'", str4, "HHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhHhhi!hhhi!ihhi!!");
    }

    @Test
    public void test7168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7168");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhihhhi!hhhi!ihhi!!", 0, 100, "hHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!hHhhhi!ihhihhhI!IhhI!Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhihhhi!hhhi!ihhi!!" + "'", str4, "Hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhihhhi!hhhi!ihhi!!");
    }

    @Test
    public void test7169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7169");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhhi!hhhi!hhhi!Ihhi!!hhi!Ihhi!hhhi!Hhhi!hhhi!hhhi!", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhi!hhhi!hhhi!Ihhi!!hhi!Ihhi!hhhi!Hhhi!hhhi!hhhi!" + "'", str2, "Hhhi!hhhi!hhhi!Ihhi!!hhi!Ihhi!hhhi!Hhhi!hhhi!hhhi!");
    }

    @Test
    public void test7170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7170");
        char[] charArray3 = new char[] {};
        java.lang.String str4 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray3);
        java.lang.String str5 = org.apache.commons.lang.WordUtils.initials("HHhi!", charArray3);
        java.lang.String str6 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hHHHI!IHHI!!", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HI!" + "'", str4, "HI!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hhhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hHHHI!IHHI!!" + "'", str6, "Hhhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hHHHI!IHHI!!");
    }

    @Test
    public void test7171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7171");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHI!HHI!HHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!!HI!HHI!HHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!!HI!HHI!HHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!!HI!IHI!HHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!!HI!!HI!HHI!HHI!HHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!!HI!HHI!HHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!!HI!HHI!HHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!!HI!IHI!HHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!!HI!!HI!HHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!HHI!HHI!IHI!!HI!IHI!HHI!IHI!!HI!!HI!HHI!IHI!!HI!!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHI!HHI!HHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!!HI!HHI!HHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!!HI!HHI!HHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!!HI!IHI!HHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!!HI!!HI!HHI!HHI!HHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!!HI!HHI!HHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!!HI!HHI!HHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!!HI!IHI!HHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!!HI!!HI!HHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!HHI!HHI!IHI!!HI!IHI!HHI!IHI!!HI!!HI!HHI!IHI!!HI!!" + "'", str2, "hHI!HHI!HHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!!HI!HHI!HHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!!HI!HHI!HHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!!HI!IHI!HHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!!HI!!HI!HHI!HHI!HHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!!HI!HHI!HHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!!HI!HHI!HHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!!HI!IHI!HHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!!HI!!HI!HHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!HHI!HHI!IHI!!HI!IHI!HHI!IHI!!HI!!HI!HHI!IHI!!HI!!");
    }

    @Test
    public void test7172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7172");
        char[] charArray7 = new char[] {};
        java.lang.String str8 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray7);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("hh", charArray7);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!H!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hh" + "'", str13, "hh");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!H!" + "'", str14, "hhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!H!");
    }

    @Test
    public void test7173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7173");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!H" + "'", str1, "hHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!H");
    }

    @Test
    public void test7174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7174");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("Hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test7175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7175");
        char[] charArray10 = new char[] {};
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("Hh", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("HHHi!iHHi!hi!!", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("HHHI!hHHI!iHHI!!", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("hhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!", charArray10);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("HHhhi!hhhi!hhhi!", charArray10);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.uncapitalize("H", charArray10);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("hHHi!iHHi!hHHHHHHHHIHH!HHhHHHHHHHHIHhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!hHHI!IHHI!HHHHHHHHHIHH!HHHHHHHHHHHIHhhhi!hhhi!ihhi!!hHHHI!HHHIHHHHI!!IHHI!!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hi!" + "'", str13, "Hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hh" + "'", str14, "Hh");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HHHi!iHHi!hi!!" + "'", str15, "HHHi!iHHi!hi!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!" + "'", str17, "hhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HHhhi!hhhi!hhhi!" + "'", str18, "HHhhi!hhhi!hhhi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H" + "'", str19, "H");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hHHi!iHHi!hHHHHHHHHIHH!HHhHHHHHHHHIHhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!hHHI!IHHI!HHHHHHHHHIHH!HHHHHHHHHHHIHhhhi!hhhi!ihhi!!hHHHI!HHHIHHHHI!!IHHI!!" + "'", str20, "hHHi!iHHi!hHHHHHHHHIHH!HHhHHHHHHHHIHhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!hHHI!IHHI!HHHHHHHHHIHH!HHHHHHHHHHHIHhhhi!hhhi!ihhi!!hHHHI!HHHIHHHHI!!IHHI!!");
    }

    @Test
    public void test7176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7176");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhhhhi!hhhHhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhhhi!hhhHhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!" + "'", str2, "hhhhhi!hhhHhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!");
    }

    @Test
    public void test7177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7177");
        char[] charArray12 = new char[] {};
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray12);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("", charArray12);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray12);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray12);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("", charArray12);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray12);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.uncapitalize("Hi!", charArray12);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.uncapitalize("hhI!", charArray12);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalizeFully("hH", charArray12);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!", charArray12);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!ihhi!HI!", charArray12);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalize("hhhhhi!hhhhhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!", charArray12);
        java.lang.Class<?> wildcardClass25 = charArray12.getClass();
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] {});
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hi!" + "'", str16, "Hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Hi!" + "'", str19, "Hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hhI!" + "'", str20, "hhI!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hH" + "'", str21, "hH");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!" + "'", str22, "Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Hhhi!ihhi!HI!" + "'", str23, "Hhhi!ihhi!HI!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hhhhhi!hhhhhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!" + "'", str24, "hhhhhi!hhhhhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test7178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7178");
        char[] charArray7 = new char[] {};
        java.lang.String str8 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("Hi!", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("HHhi!", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("HHH", charArray7);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("hhhhi!ihhihhhi!Hhhi!Ihhi!!!hi!!h", charArray7);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("HhHHHI!HHHHhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hi!" + "'", str10, "Hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HHhi!" + "'", str11, "HHhi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HHH" + "'", str12, "HHH");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hhhhi!ihhihhhi!Hhhi!Ihhi!!!hi!!h" + "'", str13, "hhhhi!ihhihhhi!Hhhi!Ihhi!!!hi!!h");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HhHHHI!HHHHhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!" + "'", str14, "HhHHHI!HHHHhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
    }

    @Test
    public void test7179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7179");
        char[] charArray10 = new char[] { '#', '4', '4', '4' };
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("HHHi!iHHi!!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("hhh", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("HHhi!", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("hhhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!IhHHHI!HHHI!HHHI!!hHHHI!HHHI!HHHI!IhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!IhHHHI!HHHI!HHHI!!hHHHI!HHHI!HHHI!!hHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!IhHHHI!HHHI!HHHI!!hHHHI!HHHI!HHHI!IhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!IhHHHI!HHHI!HHHI!!hHHHI!HHHI!HHHI!!hHHHI!HHHI!HHHI!HhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!IhHHHI!HHHI!HHHI!!hHHHI!HHHI!HHHI!IhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!IhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!HhHHHI!HHHI!HHHI!HhHHHI!HHHI!HHHI!IhHHHI!HHHI!HHHI!!hHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!HhHHHI!HHHI!HHHI!HhHHHI!HHHI!HHHI!IhHHHI!HHHI!HHHI!!hHHHI!HHHI!HHHI!ihHHHI!HHHI!HHHI!HhHHHI!HHHI!HHHI!HhHHHI!HHHI!HHHI!IhHHHI!HHHI!HHHI!!hHHHI!HHHI!HHHI!!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '#', '4', '4', '4' });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hi!" + "'", str11, "Hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hi!" + "'", str12, "Hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hHHi!iHHi!!" + "'", str13, "hHHi!iHHi!!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hhh" + "'", str14, "Hhh");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hhhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!IhHHHI!HHHI!HHHI!!hHHHI!HHHI!HHHI!IhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!IhHHHI!HHHI!HHHI!!hHHHI!HHHI!HHHI!!hHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!IhHHHI!HHHI!HHHI!!hHHHI!HHHI!HHHI!IhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!IhHHHI!HHHI!HHHI!!hHHHI!HHHI!HHHI!!hHHHI!HHHI!HHHI!HhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!IhHHHI!HHHI!HHHI!!hHHHI!HHHI!HHHI!IhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!IhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!HhHHHI!HHHI!HHHI!HhHHHI!HHHI!HHHI!IhHHHI!HHHI!HHHI!!hHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!HhHHHI!HHHI!HHHI!HhHHHI!HHHI!HHHI!IhHHHI!HHHI!HHHI!!hHHHI!HHHI!HHHI!ihHHHI!HHHI!HHHI!HhHHHI!HHHI!HHHI!HhHHHI!HHHI!HHHI!IhHHHI!HHHI!HHHI!!hHHHI!HHHI!HHHI!!" + "'", str16, "hhhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!IhHHHI!HHHI!HHHI!!hHHHI!HHHI!HHHI!IhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!IhHHHI!HHHI!HHHI!!hHHHI!HHHI!HHHI!!hHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!IhHHHI!HHHI!HHHI!!hHHHI!HHHI!HHHI!IhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!IhHHHI!HHHI!HHHI!!hHHHI!HHHI!HHHI!!hHHHI!HHHI!HHHI!HhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!IhHHHI!HHHI!HHHI!!hHHHI!HHHI!HHHI!IhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!IhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!HhHHHI!HHHI!HHHI!HhHHHI!HHHI!HHHI!IhHHHI!HHHI!HHHI!!hHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!HhHHHI!HHHI!HHHI!HhHHHI!HHHI!HHHI!IhHHHI!HHHI!HHHI!!hHHHI!HHHI!HHHI!ihHHHI!HHHI!HHHI!HhHHHI!HHHI!HHHI!HhHHHI!HHHI!HHHI!IhHHHI!HHHI!HHHI!!hHHHI!HHHI!HHHI!!");
    }

    @Test
    public void test7180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7180");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hHHHHI!IHHHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhhi!ihhhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!" + "'", str1, "Hhhhhi!ihhhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
    }

    @Test
    public void test7181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7181");
        char[] charArray6 = new char[] {};
        java.lang.String str7 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray6);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.initials("", charArray6);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalizeFully("Hh", charArray6);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("hH", charArray6);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("hHHI!IHHI!HI!!", charArray6);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!", charArray6);
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
    public void test7182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7182");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("", (-1), "hHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test7183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7183");
        char[] charArray9 = new char[] {};
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("hi!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("HhhI!IhhI!!", charArray9);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("HhhhI!IhhI!HI!!h", charArray9);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray9);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("hHHHI!IHHI!HI!!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HI!" + "'", str13, "HI!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HI!" + "'", str14, "HI!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HhhhI!IhhI!HI!!h" + "'", str16, "HhhhI!IhhI!HI!!h");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test7184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7184");
        char[] charArray7 = new char[] {};
        java.lang.String str8 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("Hh", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("HHHi!iHHi!hi!!", charArray7);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("HH", charArray7);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hi!" + "'", str10, "Hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hh" + "'", str11, "Hh");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HHHi!iHHi!hi!!" + "'", str12, "HHHi!iHHi!hi!!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HH" + "'", str13, "HH");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test7185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7185");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhHHHi!iHHi!hHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhHHHi!iHHi!hHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!" + "'", str2, "hhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhHHHi!iHHi!hHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!");
    }

    @Test
    public void test7186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7186");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhhi!hhhihHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!iHhhi!Hhhi!Ihhi!!!Hhhi!Hhhi!IhhiHhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!IhHHI!hHHI!iHHI!!!hHHI!hHHI!ihhHHHI!IHHI!HI!!H", (int) (byte) -1, (int) (short) 10, "hhhi!ihhi!hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhhi!hhhihhhi!ihhi!hi!" + "'", str4, "Hhhhi!hhhihhhi!ihhi!hi!");
    }

    @Test
    public void test7187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7187");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHi!iHHi!HHHI!IHHI!!hi!!IHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHi!iHHi!HHHI!IHHI!!hi!!IHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!!" + "'", str1, "hHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHi!iHHi!HHHI!IHHI!!hi!!IHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!!");
    }

    @Test
    public void test7188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7188");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!IhHHI!hHHI!iHHI!!!hHHI!hHHI!iHHIhHHHi!iHHi!hi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!iHhhi!Hhhi!Ihhi!!!Hhhi!Hhhi!IhhiHhhhI!IhhI!HI!!" + "'", str1, "HHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!iHhhi!Hhhi!Ihhi!!!Hhhi!Hhhi!IhhiHhhhI!IhhI!HI!!");
    }

    @Test
    public void test7189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7189");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!!hHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!!hHHHI!IHHI!HI!!!hHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!!hHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!!hHHHI!IHHI!HI!!!hHHHI!IHHI!HI!!HhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!!hHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!HhHHHI!IHHI!HI!!HhHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!!hHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!HhHHHI!IHHI!HI!!HhHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!!hHHHI!IHHI!HI!!ihHHHI!IHHI!HI!!HhHHHI!IHHI!HI!!HhHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!!hHHHI!IHHI!HI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!!hHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!!hHHHI!IHHI!HI!!!hHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!!hHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!!hHHHI!IHHI!HI!!!hHHHI!IHHI!HI!!HhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!!hHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!HhHHHI!IHHI!HI!!HhHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!!hHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!HhHHHI!IHHI!HI!!HhHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!!hHHHI!IHHI!HI!!ihHHHI!IHHI!HI!!HhHHHI!IHHI!HI!!HhHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!!hHHHI!IHHI!HI!!!" + "'", str1, "HhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!!hHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!!hHHHI!IHHI!HI!!!hHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!!hHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!!hHHHI!IHHI!HI!!!hHHHI!IHHI!HI!!HhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!!hHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!HhHHHI!IHHI!HI!!HhHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!!hHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!HhHHHI!IHHI!HI!!HhHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!!hHHHI!IHHI!HI!!ihHHHI!IHHI!HI!!HhHHHI!IHHI!HI!!HhHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!!hHHHI!IHHI!HI!!!");
    }

    @Test
    public void test7190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7190");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!ihhi!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!Hhhhhi!hhhHHhhI!IhhIHHHHI!HHHI!IHHI!!", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhi!ihhi!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!Hhhhhi!hhhHHhhI!IhhIHHHHI!HHHI!IHHI!!" + "'", str2, "Hhhi!ihhi!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!Hhhhhi!hhhHHhhI!IhhIHHHHI!HHHI!IHHI!!");
    }

    @Test
    public void test7191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7191");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHhhhi!hhhi!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhhi!ihhi!!", 10, (int) '#', "HHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!HHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!HHHi!iHHi!HHHI!IHHI!!hi!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHhhHHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!HHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!HHHi!iHHi!HHHI!IHHI!!hi!!" + "'", str4, "hHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHhhHHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!HHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!HHHi!iHHi!HHHI!IHHI!!hi!!");
    }

    @Test
    public void test7192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7192");
        char[] charArray4 = new char[] {};
        java.lang.String str5 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray4);
        java.lang.String str6 = org.apache.commons.lang.WordUtils.initials("", charArray4);
        java.lang.String str7 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray4);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.initials("Hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Ihhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Ihhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Ihhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Ihhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!", charArray4);
        java.lang.Class<?> wildcardClass9 = charArray4.getClass();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Hi!" + "'", str7, "Hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test7193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7193");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("Hhhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hhh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test7194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7194");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhiHhi!hhi!hhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!", (int) (short) 10, 0, "HhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HhhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!H!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHhhhi!hhhHhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HhhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!H!" + "'", str4, "HHhhhi!hhhHhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HhhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!H!");
    }

    @Test
    public void test7195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7195");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("HHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!iHhhi!Hhhi!Ihhi!!!Hhhi!Hhhi!IhhiHhhhI!IhhI!HI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test7196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7196");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hHHHHi!iHHhHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!iHhhi!Hhhi!Ihhi!!!Hhhi!Hhhi!IhhiHhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!IhHHI!hHHI!iHHI!!!hHHI!hHHI!ihhHHHI!IHHI!HI!!H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HhhhhI!IhhHhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!IhHHI!hHHI!iHHI!!!hHHI!hHHI!iHHIhHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!iHhhi!Hhhi!Ihhi!!!Hhhi!Hhhi!IHHhhhi!ihhi!hi!!h" + "'", str1, "HhhhhI!IhhHhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!IhHHI!hHHI!iHHI!!!hHHI!hHHI!iHHIhHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!iHhhi!Hhhi!Ihhi!!!Hhhi!Hhhi!IHHhhhi!ihhi!hi!!h");
    }

    @Test
    public void test7197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7197");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hhHhhi!hHhhHhhhi!hhhiHHHHI!HHHIHHHi!iHHi!hi!!!IHHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HhHhhi!hHhhHhhhi!hhhiHHHHI!HHHIHHHi!iHHi!hi!!!IHHI!!" + "'", str1, "HhHhhi!hHhhHhhhi!hhhiHHHHI!HHHIHHHi!iHHi!hi!!!IHHI!!");
    }

    @Test
    public void test7198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7198");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hhhi!ihhi!hhhi!ihhi!hi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test7199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7199");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!iHhi!Ihi!!!Hhi!Ihi!!iHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!iHhi!Ihi!!!Hhi!Ihi!!iHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!" + "'", str2, "HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!iHhi!Ihi!!!Hhi!Ihi!!iHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!");
    }

    @Test
    public void test7200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7200");
        char[] charArray8 = new char[] { '#', '4', '4', '4' };
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!ihhi!hi!!", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("hhhi!ihhi!!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("hHhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!ihHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!!", charArray8);
        java.lang.Class<?> wildcardClass13 = charArray8.getClass();
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '#', '4', '4', '4' });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Hi!" + "'", str9, "Hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hhhi!ihhi!hi!!" + "'", str10, "Hhhi!ihhi!hi!!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "h" + "'", str11, "h");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "h" + "'", str12, "h");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test7201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7201");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihHHhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!!H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test7202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7202");
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
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!ihhi!hhhhi!ihhi!hi!!h", charArray13);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHI!IHHI!hhHHI!HHHI!Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!", charArray13);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.capitalize("HHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HIHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!H!HHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HIHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!H!HHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HIHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HIHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!H!HHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!H!", charArray13);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.uncapitalize("hHhHhHhHhHhHhHhHiHhH!HhHhHhHhHhHhHhHiHhH!HhHiHhHhHhHhHhHiHhH!HhH!", charArray13);
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Hhhi!ihhi!hhhhi!ihhi!hi!!h" + "'", str23, "Hhhi!ihhi!hhhhi!ihhi!hi!!h");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hHHI!IHHI!hhHHI!HHHI!Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!" + "'", str24, "hHHI!IHHI!hhHHI!HHHI!Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "HHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HIHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!H!HHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HIHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!H!HHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HIHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HIHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!H!HHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!H!" + "'", str25, "HHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HIHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!H!HHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HIHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!H!HHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HIHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HIHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!H!HHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!H!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hHhHhHhHhHhHhHhHiHhH!HhHhHhHhHhHhHhHiHhH!HhHiHhHhHhHhHhHiHhH!HhH!" + "'", str26, "hHhHhHhHhHhHhHhHiHhH!HhHhHhHhHhHhHhHiHhH!HhHiHhHhHhHhHhHiHhH!HhH!");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test7203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7203");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!hhhi!hhhi!ihi!!hhhi!ihi!!hhhi!hHHI!IHHI!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!hhhi!hhhi!ihi!!hhhi!ihi!!hhhi!hHHI!IHHI!hi!" + "'", str1, "Hhhi!hhhi!hhhi!ihi!!hhhi!ihi!!hhhi!hHHI!IHHI!hi!");
    }

    @Test
    public void test7204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7204");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HhI!HhI!HhI!HhI!ihI!!hI!ihI!HhI!HhI!ihI!!hI!hhI!ihI!!hI!!", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HhI!HhI!HhI!HhI!ihI!!hI!ihI!HhI!HhI!ihI!!hI!hhI!ihI!!hI!!" + "'", str2, "HhI!HhI!HhI!HhI!ihI!!hI!ihI!HhI!HhI!ihI!!hI!hhI!ihI!!hI!!");
    }

    @Test
    public void test7205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7205");
        char[] charArray13 = new char[] {};
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray13);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("", charArray13);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray13);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray13);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("", charArray13);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray13);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("hh", charArray13);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalizeFully("H", charArray13);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.uncapitalize("Hh", charArray13);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHi!iHHi!!", charArray13);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalize("hHHI!IHHI!HHHI!IHHI!!HI!!", charArray13);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.uncapitalize("hhI!HhI!HhhHh", charArray13);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHHHHHHHIhhhhI!IhhI!HI!!", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] {});
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hi!" + "'", str17, "Hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hh" + "'", str20, "hh");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "H" + "'", str21, "H");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Hh" + "'", str22, "Hh");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hHHi!iHHi!!" + "'", str23, "hHHi!iHHi!!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hHHI!IHHI!HHHI!IHHI!!HI!!" + "'", str24, "hHHI!IHHI!HHHI!IHHI!!HI!!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hhI!HhI!HhhHh" + "'", str25, "hhI!HhI!HhhHh");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hHHHHHHHHIhhhhI!IhhI!HI!!" + "'", str26, "hHHHHHHHHIhhhhI!IhhI!HI!!");
    }

    @Test
    public void test7206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7206");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHHHHHI!IHHhHhhhI!IhhhhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!!HHHHHHI!IHHhHhhhI!IhhhhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!!h", (int) 'a', (int) (short) -1, "HH");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHHHHI!IHHhHhhhI!IhhhhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!!HHHHHHI!IHHhHhhhI!IhhhhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!!h" + "'", str4, "hHHHHHI!IHHhHhhhI!IhhhhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!!HHHHHHI!IHHhHhhhI!IhhhhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!!h");
    }

    @Test
    public void test7207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7207");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("HHHI!IHHI!HHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!iHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!!HHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!iHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!!HHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!iHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!iHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!!HHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhi!ihhi!hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Ihhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Ihhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Ihhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Ihhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!" + "'", str1, "hhhi!ihhi!hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Ihhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Ihhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Ihhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Ihhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!");
    }

    @Test
    public void test7208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7208");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("HhHHHI!IHHIHHHHI!HHHI!IHHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HhHHHI!IHHIHHHHI!HHHI!IHHI!!" + "'", str1, "HhHHHI!IHHIHHHHI!HHHI!IHHI!!");
    }

    @Test
    public void test7209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7209");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("HHHi!iHHi!Hhi!hhi!hhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhhhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhhi!hhhi!hhi!hhhi!HhhhI!IhhIHhi!hhi!hhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhhhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhhi!hhhi!hhi!hhhi!!HI!!h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhI!IhhI!hHI!HHI!HHHHHHI!HHHI!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHHHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHHI!HHHI!HHI!HHHI!hHHHi!iHHihHI!HHI!HHHHHHI!HHHI!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHHHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHHI!HHHI!HHI!HHHI!!hi!!H" + "'", str1, "hhhI!IhhI!hHI!HHI!HHHHHHI!HHHI!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHHHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHHI!HHHI!HHI!HHHI!hHHHi!iHHihHI!HHI!HHHHHHI!HHHI!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHHHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHHI!HHHI!HHI!HHHI!!hi!!H");
    }

    @Test
    public void test7210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7210");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhi!hhhihhhhi!hhhi!hhhi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhhi!hhhihhhhi!hhhi!hhhi!" + "'", str1, "hhhhi!hhhihhhhi!hhhi!hhhi!");
    }

    @Test
    public void test7211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7211");
        char[] charArray8 = new char[] { ' ' };
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("hhhi!Hhhi!Ihhi!!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("hh", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("hHHHI!HHHIHHHI!HHHI!IHHI!!", charArray8);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("Hhhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhi!ihhi!!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhi!ihhi!!!hhhhi!ihhi!!ihhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhi!ihhi!!!hhhhi!ihhi!!!", charArray8);
        java.lang.Class<?> wildcardClass16 = charArray8.getClass();
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { ' ' });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H" + "'", str9, "H");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H" + "'", str10, "H");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hhhi!Hhhi!Ihhi!!" + "'", str11, "hhhi!Hhhi!Ihhi!!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hh" + "'", str12, "Hh");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!" + "'", str13, "Hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "h" + "'", str14, "h");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hhhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhi!ihhi!!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhi!ihhi!!!hhhhi!ihhi!!ihhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhi!ihhi!!!hhhhi!ihhi!!!" + "'", str15, "Hhhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhi!ihhi!!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhi!ihhi!!!hhhhi!ihhi!!ihhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhi!ihhi!!!hhhhi!ihhi!!!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test7212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7212");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hhhi!hhhi!hhhi!Ihhi!!hhi!Ihhi!hhhi!hhhi!Ihhi!!hhi!HhhHHHI!IHHIHHHI!HHHI!IHHI!!!HI!!H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhi!hhhi!hhhi!Ihhi!!hhi!Ihhi!hhhi!hhhi!Ihhi!!hhi!HhhHHHI!IHHIHHHI!HHHI!IHHI!!!HI!!H" + "'", str1, "hhhi!hhhi!hhhi!Ihhi!!hhi!Ihhi!hhhi!hhhi!Ihhi!!hhi!HhhHHHI!IHHIHHHI!HHHI!IHHI!!!HI!!H");
    }

    @Test
    public void test7213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7213");
        char[] charArray12 = new char[] {};
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray12);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("", charArray12);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray12);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray12);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("", charArray12);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray12);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("H", charArray12);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.uncapitalize("hhhI!IhhI!HI!!", charArray12);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.uncapitalize("hhhi!Hhhi!Ihhi!!", charArray12);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalize("Hhhhi!ihhi!hi!!h", charArray12);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalize("hHH", charArray12);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!", charArray12);
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hhhI!IhhI!HI!!" + "'", str20, "hhhI!IhhI!HI!!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hhhi!Hhhi!Ihhi!!" + "'", str21, "hhhi!Hhhi!Ihhi!!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Hhhhi!ihhi!hi!!h" + "'", str22, "Hhhhi!ihhi!hi!!h");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hHH" + "'", str23, "hHH");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Hhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!" + "'", str24, "Hhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test7214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7214");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHhhI!IhhI!hHHHi!iHHi!hi!!HHHhhI!IhhI!hHHHi!iHHi!hi!!HHHhhI!IhhI!hHHHi!iHHi!hi!!HHHhhI!IhhI!hHHHi!iHHhhI!IhhI!hhhi!ihhi!!HI!!", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHhhI!IhhI!hHHHi!iHHi!hi!!HHHhhI!IhhI!hHHHi!iHHi!hi!!HHHhhI!IhhI!hHHHi!iHHi!hi!!HHHhhI!IhhI!hHHHi!iHHhhI!IhhI!hhhi!ihhi!!HI!!" + "'", str2, "hHhhI!IhhI!hHHHi!iHHi!hi!!HHHhhI!IhhI!hHHHi!iHHi!hi!!HHHhhI!IhhI!hHHHi!iHHi!hi!!HHHhhI!IhhI!hHHHi!iHHhhI!IhhI!hhhi!ihhi!!HI!!");
    }

    @Test
    public void test7215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7215");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hhhhi!hhhihhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhihhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhhhhi!ihhi!hi!!h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!hhhihhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhihhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhhhhi!ihhi!hi!!h" + "'", str1, "Hhhhi!hhhihhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhihhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhhhhi!ihhi!hi!!h");
    }

    @Test
    public void test7216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7216");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHhhi!hhhi!hhhi!Ihhi!!hhi!Ihhi!hhhi!hhhi!Ihhi!!hhi!Hhhi!Ihhi!!hhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHhhi!hhhi!hhhi!Ihhi!!hhi!Ihhi!hhhi!hhhi!Ihhi!!hhi!Hhhi!Ihhi!!hhi!!" + "'", str1, "HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHhhi!hhhi!hhhi!Ihhi!!hhi!Ihhi!hhhi!hhhi!Ihhi!!hhi!Hhhi!Ihhi!!hhi!!");
    }

    @Test
    public void test7217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7217");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhhhhi!hhhi!hhi!hhhi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhhhhi!hhhi!hhi!hhhi!" + "'", str1, "hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhhhhi!hhhi!hhi!hhhi!");
    }

    @Test
    public void test7218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7218");
        char[] charArray6 = new char[] { ' ' };
        java.lang.String str7 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray6);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalizeFully("hhI!", charArray6);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!ihhi!hhhi!ihhi!!hi!!", charArray6);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("HI!", charArray6);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHI!IHHI!hHHHI!IHHI!HI!!", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { ' ' });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hhi!" + "'", str8, "Hhi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hhhi!ihhi!hhhi!ihhi!!hi!!" + "'", str9, "hhhi!ihhi!hhhi!ihhi!!hi!!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H" + "'", str10, "H");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hhhi!ihhi!hhhhi!ihhi!hi!!" + "'", str11, "Hhhi!ihhi!hhhhi!ihhi!hi!!");
    }

    @Test
    public void test7219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7219");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHHI!IHHI!hhi!Ihi!!HI!!HHHHI!IHHI!hhi!Ihi!!HI!!HHHHI!IHHI!hhi!Ihi!!HI!!IHHHI!IHHI!hhi!Ihi!!HI!!!HHHI!IHHI!hhi!Ihi!!HI!!IHHHI!IHHI!hhi!Ihi!!HI!!HHHHI!IHHI!hhi!Ihi!!HI!!HHHHI!IHHI!hhi!Ihi!!HI!!IHHHI!IHHI!hhi!Ihi!!HI!!!HHHI!IHHI!hhi!Ihi!!HI!!hHHHI!IHHI!hhi!Ihi!!HI!!iHHHI!IHHI!hhi!Ihi!!HI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!!hhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!!hhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!!" + "'", str1, "Hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!!hhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!!hhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!!");
    }

    @Test
    public void test7220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7220");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHIHhhi!hhhi!hhi!hhhi!!!IHHHI!IHHI!!!HHHHHI!IHHI!!HHHHI!IHhhi!hhhi!hhi!hhhi!HHI!!HHHHI!IHHI!!IHHHI!IHHI!!!IHHHHHhhi!hhhi!hhi!hhhi!I!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHhhi!hhhi!hhi!hhhi!HI!IHHI!!!!", (int) (byte) 0, (int) (short) -1, "Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHIHhhi!hhhi!hhi!hhhi!!!IHHHI!IHHI!!!HHHHHI!IHHI!!HHHHI!IHhhi!hhhi!hhi!hhhi!HHI!!HHHHI!IHHI!!IHHHI!IHHI!!!IHHHHHhhi!hhhi!hhi!hhhi!I!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHhhi!hhhi!hhi!hhhi!HI!IHHI!!!!" + "'", str4, "hHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHIHhhi!hhhi!hhi!hhhi!!!IHHHI!IHHI!!!HHHHHI!IHHI!!HHHHI!IHhhi!hhhi!hhi!hhhi!HHI!!HHHHI!IHHI!!IHHHI!IHHI!!!IHHHHHhhi!hhhi!hhi!hhhi!I!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHhhi!hhhi!hhi!hhhi!HI!IHHI!!!!");
    }

    @Test
    public void test7221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7221");
        char[] charArray5 = new char[] {};
        java.lang.String str6 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray5);
        java.lang.String str7 = org.apache.commons.lang.WordUtils.initials("h", charArray5);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray5);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("HhHHHI!IHHI!!hhHHHI!IHHI!!hhHHHI!IHHI!!ihHHHI!IHHI!!!hHHHI!IHHI!!hhHHHI!IHHI!!hhHHHI!IHHI!!hhHHHI!IHHI!!ihHHHI!IHHI!!!hHHHI!IHHI!!ihHHHI!IHHI!!hhHHHI!IHHI!!hhHHHI!IHHI!!ihHHHI!IHHI!!!hHHHI!IHHI!!!", charArray5);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("HHHHHHHHHIHhhhhi!ihhhhHHHI!IHHI!HI!!H", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hI!" + "'", str8, "hI!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HHHHHHHHHIHhhhhi!ihhhhHHHI!IHHI!HI!!H" + "'", str10, "HHHHHHHHHIHhhhhi!ihhhhHHHI!IHHI!HI!!H");
    }

    @Test
    public void test7222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7222");
        char[] charArray13 = new char[] { '#', '4', '4', '4' };
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray13);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray13);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("", charArray13);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray13);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray13);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHHi!iHHi!hi!!H", charArray13);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.uncapitalize("hHhi!", charArray13);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.initials("hhhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!", charArray13);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.uncapitalize("hHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHIHHHI!HHHI!IHHI!!", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '#', '4', '4', '4' });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hi!" + "'", str14, "Hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hi!" + "'", str15, "Hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H" + "'", str17, "H");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H" + "'", str18, "H");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Hhhhi!ihhi!hi!!h" + "'", str19, "Hhhhi!ihhi!hi!!h");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hHhi!" + "'", str20, "hHhi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "h" + "'", str21, "h");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHIHHHI!HHHI!IHHI!!" + "'", str22, "hHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHIHHHI!HHHI!IHHI!!");
    }

    @Test
    public void test7223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7223");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hhhi!hhhi!hhhi!hhhi!hhhi!ihi!!hhhi!Hhhi!ihhi!hhHHHI!IHHI!HI!!H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!hhhi!hhhi!hhhi!hhhi!ihi!!hhhi!Hhhi!ihhi!hhHHHI!IHHI!HI!!H" + "'", str1, "Hhhi!hhhi!hhhi!hhhi!hhhi!ihi!!hhhi!Hhhi!ihhi!hhHHHI!IHHI!HI!!H");
    }

    @Test
    public void test7224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7224");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhhi!ihhihhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhhi!ihhihhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!" + "'", str1, "Hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhhi!ihhihhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!");
    }

    @Test
    public void test7225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7225");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("HHhhhi!hhhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test7226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7226");
        char[] charArray13 = new char[] {};
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray13);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("", charArray13);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray13);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray13);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("hH", charArray13);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("HI!", charArray13);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.uncapitalize("hhI!", charArray13);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalize("HhI!", charArray13);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhhI!IhhI!HI!!h", charArray13);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.initials("", charArray13);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalize("", charArray13);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.capitalizeFully("HH", charArray13);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!ihhi!hi!", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] {});
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hH" + "'", str18, "hH");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "HI!" + "'", str19, "HI!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hhI!" + "'", str20, "hhI!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "HhI!" + "'", str21, "HhI!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hhhhI!IhhI!HI!!h" + "'", str22, "hhhhI!IhhI!HI!!h");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "HH" + "'", str25, "HH");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Hhhi!ihhi!hi!" + "'", str26, "Hhhi!ihhi!hi!");
    }

    @Test
    public void test7227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7227");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHHHHI!HHHI!IHHI!!", (int) (byte) -1, (int) '#', "hhHHHI!IHHIHHHHHI!IHHI!!HHHHHI!IHHI!!HHHHHI!IHHHHHI!HHHIHHHI!HHHI!IHHI!!HI!!IHHHHI!IHHI!!!HHHHI!IHHI!!HHHHHHHHHI!HHHIHHHI!HHHI!IHHI!!I!IHHI!!HHHHHI!IHHI!!HHHHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHI!IHHI!!!HHHHI!IHHI!!IHHHHI!IHHHHHHI!HHHIHHHI!HHHI!IHHI!!I!!HHHHHI!IHHI!!HHHHHI!IHHI!!IHHHHIHHHHI!HHHIHHHI!HHHI!IHHI!!!IHHI!!!HHHHI!IHHI!!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHHHHI!HHHI!IHHI!!" + "'", str4, "HHHHHI!HHHI!IHHI!!");
    }

    @Test
    public void test7228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7228");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HHHI!IHHI!Hhhhhi!hhhhhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhi!Ihi!!HHhhhhi!hhhhhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!I!!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHHI!IHHI!Hhhhhi!hhhhhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhi!Ihi!!HHhhhhi!hhhhhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!I!!" + "'", str2, "HHHI!IHHI!Hhhhhi!hhhhhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhi!Ihi!!HHhhhhi!hhhhhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!I!!");
    }

    @Test
    public void test7229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7229");
        char[] charArray10 = new char[] {};
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("hi!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("HI!", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("hH", charArray10);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("HHhhhi!ihhihhhi!Hhhi!Ihhi!!!hi!!hhHhhhi!ihhihhhi!Hhhi!Ihhi!!!hi!!hhHhhhi!ihhihhhi!Hhhi!Ihhi!!!hi!!hhHhhhi!ihhihhhi!Hhhi!Ihhi!!!hi!!hhHhhhi!ihhihhhi!Hhhi!Ihhi!!!hi!!hhHhhhi!ihhihhhi!Hhhi!Ihhi!!!hi!!hhHhhhi!ihhihhhi!Hhhi!Ihhi!!!hi!!hhHhhhi!ihhihhhi!Hhhi!Ihhi!!!hi!!hhHhhhi!ihhihhhi!Hhhi!Ihhi!!!hi!!hiHhhhi!ihhihhhi!Hhhi!Ihhi!!!hi!!hhHhhhi!ihhihhhi!Hhhi!Ihhi!!!hi!!hhHhhhi!ihhihhhi!Hhhi!Ihhi!!!hi!!hhHhhhi!ihhihhhi!Hhhi!Ihhi!!!hi!!hhHhhhi!ihhihhhi!Hhhi!Ihhi!!!hi!!hiHhhhi!ihhihhhi!Hhhi!Ihhi!!!hi!!h!Hhhhi!ihhihhhi!Hhhi!Ihhi!!!hi!!hiHhhhi!ihhihhhi!Hhhi!Ihhi!!!hi!!hhHhhhi!ihhihhhi!Hhhi!Ihhi!!!hi!!hhHhhhi!ihhihhhi!Hhhi!Ihhi!!!hi!!hiHhhhi!ihhihhhi!Hhhi!Ihhi!!!hi!!h!Hhhhi!ihhihhhi!Hhhi!Ihhi!!!hi!!hhHhhhi!ihhihhhi!Hhhi!Ihhi!!!hi!!hiHhhhi!ihhihhhi!Hhhi!Ihhi!!!hi!!h!Hhhhi!ihhihhhi!Hhhi!Ihhi!!!hi!!h!", charArray10);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhhi!ihhihhhhi!hhhi!ihhi!!", charArray10);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.uncapitalize("HhhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhIhHHI!hHHI!iHHI!!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HI!" + "'", str14, "HI!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HI!" + "'", str16, "HI!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hH" + "'", str17, "hH");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HHhhhi!ihhihhhi!Hhhi!Ihhi!!!hi!!hhHhhhi!ihhihhhi!Hhhi!Ihhi!!!hi!!hhHhhhi!ihhihhhi!Hhhi!Ihhi!!!hi!!hhHhhhi!ihhihhhi!Hhhi!Ihhi!!!hi!!hhHhhhi!ihhihhhi!Hhhi!Ihhi!!!hi!!hhHhhhi!ihhihhhi!Hhhi!Ihhi!!!hi!!hhHhhhi!ihhihhhi!Hhhi!Ihhi!!!hi!!hhHhhhi!ihhihhhi!Hhhi!Ihhi!!!hi!!hhHhhhi!ihhihhhi!Hhhi!Ihhi!!!hi!!hiHhhhi!ihhihhhi!Hhhi!Ihhi!!!hi!!hhHhhhi!ihhihhhi!Hhhi!Ihhi!!!hi!!hhHhhhi!ihhihhhi!Hhhi!Ihhi!!!hi!!hhHhhhi!ihhihhhi!Hhhi!Ihhi!!!hi!!hhHhhhi!ihhihhhi!Hhhi!Ihhi!!!hi!!hiHhhhi!ihhihhhi!Hhhi!Ihhi!!!hi!!h!Hhhhi!ihhihhhi!Hhhi!Ihhi!!!hi!!hiHhhhi!ihhihhhi!Hhhi!Ihhi!!!hi!!hhHhhhi!ihhihhhi!Hhhi!Ihhi!!!hi!!hhHhhhi!ihhihhhi!Hhhi!Ihhi!!!hi!!hiHhhhi!ihhihhhi!Hhhi!Ihhi!!!hi!!h!Hhhhi!ihhihhhi!Hhhi!Ihhi!!!hi!!hhHhhhi!ihhihhhi!Hhhi!Ihhi!!!hi!!hiHhhhi!ihhihhhi!Hhhi!Ihhi!!!hi!!h!Hhhhi!ihhihhhi!Hhhi!Ihhi!!!hi!!h!" + "'", str18, "HHhhhi!ihhihhhi!Hhhi!Ihhi!!!hi!!hhHhhhi!ihhihhhi!Hhhi!Ihhi!!!hi!!hhHhhhi!ihhihhhi!Hhhi!Ihhi!!!hi!!hhHhhhi!ihhihhhi!Hhhi!Ihhi!!!hi!!hhHhhhi!ihhihhhi!Hhhi!Ihhi!!!hi!!hhHhhhi!ihhihhhi!Hhhi!Ihhi!!!hi!!hhHhhhi!ihhihhhi!Hhhi!Ihhi!!!hi!!hhHhhhi!ihhihhhi!Hhhi!Ihhi!!!hi!!hhHhhhi!ihhihhhi!Hhhi!Ihhi!!!hi!!hiHhhhi!ihhihhhi!Hhhi!Ihhi!!!hi!!hhHhhhi!ihhihhhi!Hhhi!Ihhi!!!hi!!hhHhhhi!ihhihhhi!Hhhi!Ihhi!!!hi!!hhHhhhi!ihhihhhi!Hhhi!Ihhi!!!hi!!hhHhhhi!ihhihhhi!Hhhi!Ihhi!!!hi!!hiHhhhi!ihhihhhi!Hhhi!Ihhi!!!hi!!h!Hhhhi!ihhihhhi!Hhhi!Ihhi!!!hi!!hiHhhhi!ihhihhhi!Hhhi!Ihhi!!!hi!!hhHhhhi!ihhihhhi!Hhhi!Ihhi!!!hi!!hhHhhhi!ihhihhhi!Hhhi!Ihhi!!!hi!!hiHhhhi!ihhihhhi!Hhhi!Ihhi!!!hi!!h!Hhhhi!ihhihhhi!Hhhi!Ihhi!!!hi!!hhHhhhi!ihhihhhi!Hhhi!Ihhi!!!hi!!hiHhhhi!ihhihhhi!Hhhi!Ihhi!!!hi!!h!Hhhhi!ihhihhhi!Hhhi!Ihhi!!!hi!!h!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hhhhi!ihhihhhhi!hhhi!ihhi!!" + "'", str19, "hhhhi!ihhihhhhi!hhhi!ihhi!!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HhhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhIhHHI!hHHI!iHHI!!" + "'", str20, "HhhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhIhHHI!hHHI!iHHI!!");
    }

    @Test
    public void test7230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7230");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HHHI!hHHI!Hhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHHI!hHHI!Hhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!!" + "'", str2, "HHHI!hHHI!Hhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!!");
    }

    @Test
    public void test7231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7231");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("HHHHI!IHHI!HI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhhi!ihhi!hi!!" + "'", str1, "hhhhi!ihhi!hi!!");
    }

    @Test
    public void test7232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7232");
        char[] charArray12 = new char[] {};
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray12);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("", charArray12);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("hi!", charArray12);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray12);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("", charArray12);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("HI!", charArray12);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("Hh", charArray12);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!hhhi!hhi!hhhi!", charArray12);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.initials("hhhhi!ihhi!hi!!h", charArray12);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalize("Hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!", charArray12);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.initials("HHhhI!IhhIhHh", charArray12);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.uncapitalize("hhHHHI!IHHI!HI!!ihHHHI!IHHI!HI!!!", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] {});
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HI!" + "'", str16, "HI!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HI!" + "'", str18, "HI!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Hh" + "'", str19, "Hh");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hhhi!hhhi!hhi!hhhi!" + "'", str20, "Hhhi!hhhi!hhi!hhhi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!" + "'", str22, "Hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hhHHHI!IHHI!HI!!ihHHHI!IHHI!HI!!!" + "'", str24, "hhHHHI!IHHI!HI!!ihHHHI!IHHI!HI!!!");
    }

    @Test
    public void test7233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7233");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!hhhhi!Hhhi!Ihhi!!hhhhi!Hhhi!Ihhi!!hhhhi!Hhhi!Ihhi!!ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!ihhhi!Hhhi!Ihhi!!hhhhi!Hhhi!Ihhi!!hhhhi!Hhhi!Ihhi!!ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!hhhhi!Hhhi!Ihhi!!ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!h", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!hhhhi!Hhhi!Ihhi!!hhhhi!Hhhi!Ihhi!!hhhhi!Hhhi!Ihhi!!ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!ihhhi!Hhhi!Ihhi!!hhhhi!Hhhi!Ihhi!!hhhhi!Hhhi!Ihhi!!ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!hhhhi!Hhhi!Ihhi!!ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!h" + "'", str2, "hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!hhhhi!Hhhi!Ihhi!!hhhhi!Hhhi!Ihhi!!hhhhi!Hhhi!Ihhi!!ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!ihhhi!Hhhi!Ihhi!!hhhhi!Hhhi!Ihhi!!hhhhi!Hhhi!Ihhi!!ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!hhhhi!Hhhi!Ihhi!!ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!h");
    }

    @Test
    public void test7234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7234");
        char[] charArray4 = new char[] { '#' };
        java.lang.String str5 = org.apache.commons.lang.WordUtils.uncapitalize("Hi!", charArray4);
        java.lang.String str6 = org.apache.commons.lang.WordUtils.initials("hHi!", charArray4);
        java.lang.String str7 = org.apache.commons.lang.WordUtils.capitalize("hHHHI!HHHI!IHHI!!", charArray4);
        java.lang.Class<?> wildcardClass8 = charArray4.getClass();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '#' });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "h" + "'", str6, "h");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HHHHI!HHHI!IHHI!!" + "'", str7, "HHHHI!HHHI!IHHI!!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test7235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7235");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhhhhhi!hhHhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHhhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Ihhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Ihhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Ihhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Ihhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhhhhi!hhHhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHhhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Ihhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Ihhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Ihhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Ihhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!" + "'", str2, "hhhhhhi!hhHhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHhhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Ihhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Ihhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Ihhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Ihhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!");
    }

    @Test
    public void test7236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7236");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhhhhi!hhhhhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhiHhhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhhhhi!hhhihhhi!hhhi!ihhi!!hi!!ihhhhi!ihhi!!!hhhhi!ihhi!!hhhhhhhhhhhhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhi!ihhi!!hhhi!!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihHhhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhhhhi!hhhihhhi!hhhi!ihhi!!hi!!ihhhhi!ihhi!!!hhhhi!ihhi!!hhhhhhhhhhhhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhi!ihhi!!hhhi!hi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!Hhhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhhhhi!hhhihhhi!hhhi!ihhi!!hi!!ihhhhi!ihhi!!!hhhhi!ihhi!!hhhhhhhhhhhhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhi!ihhi!!hhhi!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhhhi!hhhhhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhiHhhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhhhhi!hhhihhhi!hhhi!ihhi!!hi!!ihhhhi!ihhi!!!hhhhi!ihhi!!hhhhhhhhhhhhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhi!ihhi!!hhhi!!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihHhhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhhhhi!hhhihhhi!hhhi!ihhi!!hi!!ihhhhi!ihhi!!!hhhhi!ihhi!!hhhhhhhhhhhhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhi!ihhi!!hhhi!hi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!Hhhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhhhhi!hhhihhhi!hhhi!ihhi!!hi!!ihhhhi!ihhi!!!hhhhi!ihhi!!hhhhhhhhhhhhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhi!ihhi!!hhhi!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!" + "'", str2, "Hhhhhi!hhhhhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhiHhhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhhhhi!hhhihhhi!hhhi!ihhi!!hi!!ihhhhi!ihhi!!!hhhhi!ihhi!!hhhhhhhhhhhhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhi!ihhi!!hhhi!!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihHhhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhhhhi!hhhihhhi!hhhi!ihhi!!hi!!ihhhhi!ihhi!!!hhhhi!ihhi!!hhhhhhhhhhhhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhi!ihhi!!hhhi!hi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!Hhhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhhhhi!hhhihhhi!hhhi!ihhi!!hi!!ihhhhi!ihhi!!!hhhhi!ihhi!!hhhhhhhhhhhhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhi!ihhi!!hhhi!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
    }

    @Test
    public void test7237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7237");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhhh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test7238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7238");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!", (int) (short) -1, 0, "HHHHi!iHHi!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHHHi!iHHi!!" + "'", str4, "HHHHi!iHHi!!");
    }

    @Test
    public void test7239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7239");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("Hhi!ihi!!", (int) (short) 100, "HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhi!ihi!!" + "'", str4, "Hhi!ihi!!");
    }

    @Test
    public void test7240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7240");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhhhhhhhhihhhhI!IhhI!HI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhhhhhhhihhhhi!ihhi!hi!!" + "'", str1, "Hhhhhhhhhhihhhhi!ihhi!hi!!");
    }

    @Test
    public void test7241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7241");
        char[] charArray11 = new char[] {};
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("", charArray11);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray11);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("H", charArray11);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray11);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("HI!", charArray11);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!HhhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!Hhhi!ihhi!HHI!iHI!!hi!!", charArray11);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhi!Hhhi!hhHI!", charArray11);
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HI!" + "'", str20, "HI!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hhhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!HhhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!Hhhi!ihhi!HHI!iHI!!hi!!" + "'", str21, "hhhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!HhhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!Hhhi!ihhi!HHI!iHI!!hi!!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hhhi!Hhhi!hhHI!" + "'", str22, "hhhi!Hhhi!hhHI!");
    }

    @Test
    public void test7242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7242");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("Hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhhhhi!ihhi!hi!!h", (int) '#', "hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhi!ihhi!!!Hhhhi!hhhiHhhi!hhhi!ihhi!!HHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhi!ihhi!!!Hhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!HHhhhi!hhhiHhhi!hhhi!ihhi!!IHhhhi!hhhiHhhi!hhhi!ihhi!!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhhhhi!ihhi!hi!!h" + "'", str4, "Hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhhhhi!ihhi!hi!!h");
    }

    @Test
    public void test7243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7243");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHhhhi!ihhihhhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhhhhi!hhhihhhi!hhhi!ihhi!!hi!!ihhhhi!ihhi!!!hhhhi!ihhi!!hhhhhhhhhi!hhhihhhi!hhhi!ihhi!!i!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!hhhhi!ihhi!!!hhhhi!ihhi!!ihhhhi!ihhhhhhi!hhhihhhi!hhhi!ihhi!!i!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhihhhhi!hhhihhhi!hhhi!ihhi!!!ihhi!!!hhhhi!ihhi!!!", (-1), 0, "hhHHI!IHHI!!HhHHI!IHHI!!hhHHI!IHHI!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!hhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!hhHHHI!HHHIhHHI!HHHI!IHHI!!ihHHHI!HHHIhHHI!HHHI!IHHI!!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhHHI!IHHI!!HhHHI!IHHI!!hhHHI!IHHI!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!hhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!hhHHHI!HHHIhHHI!HHHI!IHHI!!ihHHHI!HHHIhHHI!HHHI!IHHI!!!" + "'", str4, "hhHHI!IHHI!!HhHHI!IHHI!!hhHHI!IHHI!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!hhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!hhHHHI!HHHIhHHI!HHHI!IHHI!!ihHHHI!HHHIhHHI!HHHI!IHHI!!!");
    }

    @Test
    public void test7244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7244");
        char[] charArray10 = new char[] { '#', ' ', '4' };
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("HhhI!IhhI!hHHHi!iHHi!hi!!H", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("hhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!HhHHHI!HHHI!IHHI!!HhHHHI!HHHI!IHHI!!IhHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!HhHHHI!HHHI!IHHI!!IhHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!!", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("hhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '#', ' ', '4' });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hi!" + "'", str11, "Hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HhhI!IhhI!hHHHi!iHHi!hi!!H" + "'", str14, "HhhI!IhhI!hHHHi!iHHi!hi!!H");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!!" + "'", str15, "Hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!" + "'", str16, "hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!" + "'", str17, "hhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!");
    }

    @Test
    public void test7245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7245");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhhhi!ihhhhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!!hhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!!hhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!!hhhi!ihhi!hhi!ihi!!hi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhhhi!ihhhhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!!hhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!!hhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!!hhhi!ihhi!hhi!ihi!!hi!!!" + "'", str1, "Hhhhhhi!ihhhhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!!hhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!!hhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!!hhhi!ihhi!hhi!ihi!!hi!!!");
    }

    @Test
    public void test7246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7246");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hhi!hhi!hhhhhhi!hhhi!hhhhi!ihhi!!hhHhhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhhhhi!hhhihhhi!hhhi!ihhi!!hi!!ihhhhi!ihhi!!!hhhhi!ihhi!!hhhhhhhhhhhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhihhi!hhi!hhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhi!hhi!hhhhhhi!hhhi!hhhhi!ihhi!!hhHhhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhhhhi!hhhihhhi!hhhi!ihhi!!hi!!ihhhhi!ihhi!!!hhhhi!ihhi!!hhhhhhhhhhhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhihhi!hhi!hhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!" + "'", str1, "hhi!hhi!hhhhhhi!hhhi!hhhhi!ihhi!!hhHhhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhhhhi!hhhihhhi!hhhi!ihhi!!hi!!ihhhhi!ihhi!!!hhhhi!ihhi!!hhhhhhhhhhhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhihhi!hhi!hhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
    }

    @Test
    public void test7247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7247");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhhi!ihhi!HI!", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhi!ihhi!HI!" + "'", str2, "Hhhi!ihhi!HI!");
    }

    @Test
    public void test7248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7248");
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
        java.lang.String str24 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!", charArray13);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.uncapitalize("HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!!", charArray13);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.initials("hHHI!IHHI!HHHHI!IHHI!HHHI!IHHI!!HI!!", charArray13);
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
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Hhhi!" + "'", str24, "Hhhi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!!" + "'", str25, "HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test7249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7249");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("", (-1), "Hhhhhhhhhihhhhi!ihhi!hi!!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test7250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7250");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hhhhhi!ihhi!hi!!ihhhhi!ihhi!hi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhhi!ihhi!hi!!ihhhhi!ihhi!hi!!!" + "'", str1, "Hhhhhi!ihhi!hi!!ihhhhi!ihhi!hi!!!");
    }

    @Test
    public void test7251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7251");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hHHHI!hHHIHHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!HHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!HHHi!iHHi!HHHI!IHHI!!hi!!", 100, "HhHHi!iHHi!hi!!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHHI!hHHIHHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!HHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhHhHHi!iHHi!hi!!hI!IhhI!!!HHHi!iHHi!HHHI!IHHI!!hi!!" + "'", str4, "hHHHI!hHHIHHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!HHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhHhHHi!iHHi!hi!!hI!IhhI!!!HHHi!iHHi!HHHI!IHHI!!hi!!");
    }

    @Test
    public void test7252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7252");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhhhhhhhihhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!", (int) (short) 0, (int) (byte) 10, "hHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HhHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!IHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!!HHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HhhhhhhhhihHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HhHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!IHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!!HHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!" + "'", str4, "HhhhhhhhhihHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HhHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!IHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!!HHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!");
    }

    @Test
    public void test7253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7253");
        char[] charArray10 = new char[] {};
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("Hi!", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray10);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("HHHi!iHHi!!", charArray10);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("HHHI!HHHI!Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!", charArray10);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("hhHHi!iHHi!!hhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!IhHHi!iHHi!!!hHHi!iHHi!!IhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!IhHHi!iHHi!!!hHHi!iHHi!!!hHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!IhHHi!iHHi!!!hHHi!iHHi!!IhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!IhHHi!iHHi!!!hHHi!iHHi!!!hHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!IhHHi!iHHi!!!hHHi!iHHi!!IhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!IhHHi!iHHi!!!hHHi!iHHi!!!hHHi!iHHi!!ihHHi!iHHi!!hhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!IhHHi!iHHi!!!hHHi!iHHi!!IhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!IhHHi!iHHi!!!hHHi!iHHi!!!hHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!", charArray10);
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "HHHI!HHHI!Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!" + "'", str19, "HHHI!HHHI!Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hhHHi!iHHi!!hhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!IhHHi!iHHi!!!hHHi!iHHi!!IhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!IhHHi!iHHi!!!hHHi!iHHi!!!hHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!IhHHi!iHHi!!!hHHi!iHHi!!IhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!IhHHi!iHHi!!!hHHi!iHHi!!!hHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!IhHHi!iHHi!!!hHHi!iHHi!!IhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!IhHHi!iHHi!!!hHHi!iHHi!!!hHHi!iHHi!!ihHHi!iHHi!!hhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!IhHHi!iHHi!!!hHHi!iHHi!!IhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!IhHHi!iHHi!!!hHHi!iHHi!!!hHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!" + "'", str20, "hhHHi!iHHi!!hhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!IhHHi!iHHi!!!hHHi!iHHi!!IhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!IhHHi!iHHi!!!hHHi!iHHi!!!hHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!IhHHi!iHHi!!!hHHi!iHHi!!IhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!IhHHi!iHHi!!!hHHi!iHHi!!!hHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!IhHHi!iHHi!!!hHHi!iHHi!!IhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!IhHHi!iHHi!!!hHHi!iHHi!!!hHHi!iHHi!!ihHHi!iHHi!!hhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!IhHHi!iHHi!!!hHHi!iHHi!!IhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!IhHHi!iHHi!!!hHHi!iHHi!!!hHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!");
    }

    @Test
    public void test7254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7254");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("Hhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!hhhhi!Hhhi!Ihhi!!hhhhi!Hhhi!Ihhi!!hhhhi!Hhhi!Ihhi!!ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!ihhhi!Hhhi!Ihhi!!hhhhi!Hhhi!Ihhi!!hhhhi!Hhhi!Ihhi!!ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!hhhhi!Hhhi!Ihhi!!ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!hhhhi!Hhhi!Ihhi!!hhhhi!Hhhi!Ihhi!!hhhhi!Hhhi!Ihhi!!ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!ihhhi!Hhhi!Ihhi!!hhhhi!Hhhi!Ihhi!!hhhhi!Hhhi!Ihhi!!ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!hhhhi!Hhhi!Ihhi!!ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!h" + "'", str1, "Hhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!hhhhi!Hhhi!Ihhi!!hhhhi!Hhhi!Ihhi!!hhhhi!Hhhi!Ihhi!!ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!ihhhi!Hhhi!Ihhi!!hhhhi!Hhhi!Ihhi!!hhhhi!Hhhi!Ihhi!!ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!hhhhi!Hhhi!Ihhi!!ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!h");
    }

    @Test
    public void test7255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7255");
        char[] charArray9 = new char[] {};
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("hhI!", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("HHi!", charArray9);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("Hhhhi!ihhi!hi!!hhhhi!ihhi!hi!!hhhhi!ihhi!hi!!ihhhi!ihhi!hi!!!hhhi!ihhi!hi!!ihhhi!ihhi!hi!!hhhhi!ihhi!hi!!hhhhi!ihhi!hi!!ihhhi!ihhi!hi!!!hhhi!ihhi!hi!!hhhhi!ihhi!hi!!hhhhi!ihhi!hi!!hhhhi!ihhi!hi!!hhhhi!ihhi!hi!!ihhhi!ihhi!hi!!!hhhi!ihhi!hi!!ihhhi!ihhi!hi!!hhhhi!ihhi!hi!!hhhhi!ihhi!hi!!ihhhi!ihhi!hi!!!hhhi!ihhi!hi!!hhhhi!ihhi!hi!!ihhhi!ihhi!hi!!!hhhi!ihhi!hi!!!hhhi!ihhi!hi!!h", charArray9);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("Hhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!ihi!!hi!hhi!ihi!!hi!!", charArray9);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhi!hhhihhhhi!hhhi!hhhi!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HHi!" + "'", str15, "HHi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!ihi!!hi!hhi!ihi!!hi!!" + "'", str17, "Hhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!ihi!!hi!hhi!ihi!!hi!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hhhhi!hhhihhhhi!hhhi!hhhi!" + "'", str18, "Hhhhi!hhhihhhhi!hhhi!hhhi!");
    }

    @Test
    public void test7256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7256");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("Hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHI!IHI!!" + "'", str1, "hHI!IHI!!");
    }

    @Test
    public void test7257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7257");
        char[] charArray6 = new char[] { ' ', 'a', 'a' };
        java.lang.String str7 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray6);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.initials("", charArray6);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!Hhhi!Ihhi!!", charArray6);
        java.lang.Class<?> wildcardClass10 = charArray6.getClass();
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { ' ', 'a', 'a' });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Hhhi!Hhhi!Ihhi!!" + "'", str9, "Hhhi!Hhhi!Ihhi!!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test7258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7258");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HhHHi!iHHi!!hhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!IhHHi!iHHi!!!hHHi!iHHi!!IhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!IhHHi!iHHi!!!hHHi!iHHi!!!hHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!IhHHi!iHHi!!!hHHi!iHHi!!IhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!IhHHi!iHHi!!!hHHi!iHHi!!!hHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!IhHHi!iHHi!!!hHHi!iHHi!!IhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!IhHHi!iHHi!!!hHHi!iHHi!!!hHHi!iHHi!!ihHHi!iHHi!!hhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!IhHHi!iHHi!!!hHHi!iHHi!!IhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!IhHHi!iHHi!!!hHHi!iHHi!!!hHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!", 100, "hhhi!hhhi!hHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HhHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!IHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!!HHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HhHHi!iHHi!!hhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!IhHHi!iHHi!!!hHHi!iHHi!!IhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!IhHHi!iHHi!!!hHHi!iHHi!!!hHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!IhHHi!iHHi!!!hHHi!iHHi!!IhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!IhHHi!iHHi!!!hHHi!iHHi!!!hHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!IhHHi!iHHi!!!hHHi!iHHi!!IhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!IhHHi!iHHi!!!hHHi!iHHi!!!hHHi!iHHi!!ihHHi!iHHi!!hhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!IhHHi!iHHi!!!hHHi!iHHi!!IhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!IhHHi!iHHi!!!hHHi!iHHi!!!hHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!" + "'", str4, "HhHHi!iHHi!!hhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!IhHHi!iHHi!!!hHHi!iHHi!!IhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!IhHHi!iHHi!!!hHHi!iHHi!!!hHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!IhHHi!iHHi!!!hHHi!iHHi!!IhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!IhHHi!iHHi!!!hHHi!iHHi!!!hHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!IhHHi!iHHi!!!hHHi!iHHi!!IhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!IhHHi!iHHi!!!hHHi!iHHi!!!hHHi!iHHi!!ihHHi!iHHi!!hhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!IhHHi!iHHi!!!hHHi!iHHi!!IhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!IhHHi!iHHi!!!hHHi!iHHi!!!hHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!");
    }

    @Test
    public void test7259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7259");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HHHHHI!HHHhhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihhhhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!!hh!", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHHHHI!HHHhhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihhhhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!!hh!" + "'", str2, "HHHHHI!HHHhhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihhhhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!!hh!");
    }

    @Test
    public void test7260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7260");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("Hhhhhi!hhhhi!hhhhi!ihhhi!!hhhi!ihhhi!hhhhi!hhhhi!ihhhi!!hhhi!hhhhi!hhhhi!hhhhi!ihhhi!!hhhi!ihhhi!hhhhhi!hhhhhhhi!hhhihhhi!ihhi!hi!!!ihhi!!hhhhi!hhhhi!ihhhi!!hhhi!!hhhi!hhhhi!ihhhi!!hhhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhhi!hhhhi!hhhhi!ihhhi!!hhhi!ihhhi!hhhhi!hhhhi!ihhhi!!hhhi!hhhhi!hhhhi!hhhhi!ihhhi!!hhhi!ihhhi!hhhhhi!hhhhhhhi!hhhihhhi!ihhi!hi!!!ihhi!!hhhhi!hhhhi!ihhhi!!hhhi!!hhhi!hhhhi!ihhhi!!hhhi!!" + "'", str1, "Hhhhhi!hhhhi!hhhhi!ihhhi!!hhhi!ihhhi!hhhhi!hhhhi!ihhhi!!hhhi!hhhhi!hhhhi!hhhhi!ihhhi!!hhhi!ihhhi!hhhhhi!hhhhhhhi!hhhihhhi!ihhi!hi!!!ihhi!!hhhhi!hhhhi!ihhhi!!hhhi!!hhhi!hhhhi!ihhhi!!hhhi!!");
    }

    @Test
    public void test7261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7261");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHHI!IHHIhHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!ihhihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!" + "'", str1, "Hhhhi!ihhihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!");
    }

    @Test
    public void test7262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7262");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hHHHHi!iHHhHHHI!HHHIhHHI!HHHI!IHHI!!i!!HHHHi!ihHHHI!HHHIhHHI!HHHI!IHHI!!HHi!!hHHHihHHHI!HHHIhHHI!HHHI!IHHI!!!iHHi!!iHHhHHHI!HHHIhHHI!HHHI!IHHI!!Hi!iHHi!!!hHHHI!HHHIhHHI!HHHI!IHHI!!hHHHHi!iHHhHHHI!HHHIhHHI!HHHI!IHHI!!i!!HHHHi!ihHHHI!HHHIhHHI!HHHI!IHHI!!HHi!!hHHHihHHHI!HHHIhHHI!HHHI!IHHI!!!iHHi!!iHHhHHHI!HHHIhHHI!HHHI!IHHI!!Hi!iHHi!!!hHHHI!HHHIhHHI!HHHI!IHHI!!IHHHHi!iHHhHHHI!HHHIhHHI!HHHI!IHHI!!i!!HHHHi!ihHHHI!HHHIhHHI!HHHI!IHHI!!HHi!!hHHHihHHHI!HHHIhHHI!HHHI!IHHI!!!iHHi!!iHHhHHHI!HHHIhHHI!HHHI!IHHI!!Hi!iHHi!!!hHHHI!HHHIhHHI!HHHI!IHHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHHHi!iHHhHHHI!HHHIhHHI!HHHI!IHHI!!i!!HHHHi!ihHHHI!HHHIhHHI!HHHI!IHHI!!HHi!!hHHHihHHHI!HHHIhHHI!HHHI!IHHI!!!iHHi!!iHHhHHHI!HHHIhHHI!HHHI!IHHI!!Hi!iHHi!!!hHHHI!HHHIhHHI!HHHI!IHHI!!hHHHHi!iHHhHHHI!HHHIhHHI!HHHI!IHHI!!i!!HHHHi!ihHHHI!HHHIhHHI!HHHI!IHHI!!HHi!!hHHHihHHHI!HHHIhHHI!HHHI!IHHI!!!iHHi!!iHHhHHHI!HHHIhHHI!HHHI!IHHI!!Hi!iHHi!!!hHHHI!HHHIhHHI!HHHI!IHHI!!IHHHHi!iHHhHHHI!HHHIhHHI!HHHI!IHHI!!i!!HHHHi!ihHHHI!HHHIhHHI!HHHI!IHHI!!HHi!!hHHHihHHHI!HHHIhHHI!HHHI!IHHI!!!iHHi!!iHHhHHHI!HHHIhHHI!HHHI!IHHI!!Hi!iHHi!!!hHHHI!HHHIhHHI!HHHI!IHHI!!!" + "'", str1, "HHHHHi!iHHhHHHI!HHHIhHHI!HHHI!IHHI!!i!!HHHHi!ihHHHI!HHHIhHHI!HHHI!IHHI!!HHi!!hHHHihHHHI!HHHIhHHI!HHHI!IHHI!!!iHHi!!iHHhHHHI!HHHIhHHI!HHHI!IHHI!!Hi!iHHi!!!hHHHI!HHHIhHHI!HHHI!IHHI!!hHHHHi!iHHhHHHI!HHHIhHHI!HHHI!IHHI!!i!!HHHHi!ihHHHI!HHHIhHHI!HHHI!IHHI!!HHi!!hHHHihHHHI!HHHIhHHI!HHHI!IHHI!!!iHHi!!iHHhHHHI!HHHIhHHI!HHHI!IHHI!!Hi!iHHi!!!hHHHI!HHHIhHHI!HHHI!IHHI!!IHHHHi!iHHhHHHI!HHHIhHHI!HHHI!IHHI!!i!!HHHHi!ihHHHI!HHHIhHHI!HHHI!IHHI!!HHi!!hHHHihHHHI!HHHIhHHI!HHHI!IHHI!!!iHHi!!iHHhHHHI!HHHIhHHI!HHHI!IHHI!!Hi!iHHi!!!hHHHI!HHHIhHHI!HHHI!IHHI!!!");
    }

    @Test
    public void test7263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7263");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hhHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!IHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HhHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!IHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!!" + "'", str1, "HhHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!IHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!!");
    }

    @Test
    public void test7264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7264");
        char[] charArray9 = new char[] {};
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("HHHi!iHHi!hi!!", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("hHh", charArray9);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("hHHI!IHHI!HHHI!IHHI!!HI!!", charArray9);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!h!", charArray9);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("HhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!hhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!HhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!HhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!HhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!IhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!!hHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!IhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!HhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!HhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!IhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!!hHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!HhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!IhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!!hHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!!hHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!H", charArray9);
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!hhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!HhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!HhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!HhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!IhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!!hHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!IhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!HhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!HhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!IhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!!hHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!HhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!IhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!!hHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!!hHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!H" + "'", str18, "HhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!hhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!HhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!HhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!HhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!IhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!!hHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!IhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!HhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!HhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!IhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!!hHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!HhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!IhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!!hHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!!hHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!H");
    }

    @Test
    public void test7265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7265");
        char[] charArray5 = new char[] {};
        java.lang.String str6 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray5);
        java.lang.String str7 = org.apache.commons.lang.WordUtils.initials("", charArray5);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalize("hhhI!IhhI!!", charArray5);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!iHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!iHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!iHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!iHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!", charArray5);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("hhhi!ihhi!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!", charArray5);
        java.lang.Class<?> wildcardClass11 = charArray5.getClass();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hhhI!IhhI!!" + "'", str8, "hhhI!IhhI!!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!iHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!iHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!iHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!iHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!" + "'", str9, "hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!iHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!iHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!iHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!iHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hhhi!ihhi!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!" + "'", str10, "hhhi!ihhi!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test7266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7266");
        char[] charArray13 = new char[] {};
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray13);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("", charArray13);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray13);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray13);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("", charArray13);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray13);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.uncapitalize("Hi!", charArray13);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.uncapitalize("hhI!", charArray13);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalizeFully("hH", charArray13);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!", charArray13);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!ihhi!HI!", charArray13);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.capitalize("hhhhhi!hhhhhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!", charArray13);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.initials("hhHHHI!IHHI!!HhHHHI!IHHI!!HhHHHI!IHHI!!HhHHHI!IHHI!!Hhhhi!ihhihhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhHhi!ihi!!i!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhihhhhi!ihhi!hi!!hIhHHHI!IHHI!!!hHHHI!IHHhi!ihi!!HI!!IhHHHI!IHHI!!HhHHHI!IHHI!!Hhhhi!ihhihhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhHhi!ihi!!i!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhihhhhi!ihhi!hi!!hHhHHHI!IHHI!!IhHHHI!IHHI!!!hHHHI!IHHI!!HhHHHHhi!ihi!!I!IHHI!!Hhhhi!ihhihhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhHhi!ihi!!i!!ihhhi!hhhi!ihhihhhhi!ihhi!hi!!hIhHHHI!IHHI!!!hHHHI!IHHI!!!hHHHI!IHHI!!H", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] {});
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hi!" + "'", str17, "Hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hi!" + "'", str20, "Hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hhI!" + "'", str21, "hhI!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hH" + "'", str22, "hH");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!" + "'", str23, "Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Hhhi!ihhi!HI!" + "'", str24, "Hhhi!ihhi!HI!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hhhhhi!hhhhhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!" + "'", str25, "hhhhhi!hhhhhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test7267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7267");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHhhhi!ihhi!!hhhhi!ihhi!!hhhhi!iHhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!hhhi!ihhi!hhhi!ihhi!hhhi!ihhi!!hi!!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhihhhi!ihhi!hhhi!ihhi!hhhi!ihhi!!hi!!!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhhhhi!ihhi!hhhi!ihhi!hhhi!ihhi!!hi!!i!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhhhi!ihhi!hhhi!ihhi!hhhi!ihhi!!hi!!hi!!ihhhi!ihhi!!!hhhi!ihhi!!!", (int) (byte) -1, (-1), "HHHHHI!HHHHHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHhhhi!ihhi!!hhhhi!ihhi!!hhhhi!iHhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!hhhi!ihhi!hhhi!ihhi!hhhi!ihhi!!hi!!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhihhhi!ihhi!hhhi!ihhi!hhhi!ihhi!!hi!!!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhhhhi!ihhi!hhhi!ihhi!hhhi!ihhi!!hi!!i!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhhhi!ihhi!hhhi!ihhi!hhhi!ihhi!!hi!!hi!!ihhhi!ihhi!!!hhhi!ihhi!!!" + "'", str4, "HHhhhi!ihhi!!hhhhi!ihhi!!hhhhi!iHhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!hhhi!ihhi!hhhi!ihhi!hhhi!ihhi!!hi!!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhihhhi!ihhi!hhhi!ihhi!hhhi!ihhi!!hi!!!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhhhhi!ihhi!hhhi!ihhi!hhhi!ihhi!!hi!!i!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhhhi!ihhi!hhhi!ihhi!hhhi!ihhi!!hi!!hi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
    }

    @Test
    public void test7268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7268");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("Hhhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHHHHI!HHHI!IHHI!!HHHHHI!HHHI!IHHI!!HHHHHI!HHHI!IHHI!!IHHHHI!HHHI!IHHI!!!HHHHI!HHHI!IHHI!!IHHHHI!HHHI!IHHI!!HHHHHI!HHHI!IHHI!!HHHHHI!HHHI!IHHI!!IHHHHI!HHHI!IHHI!!!HHHHI!HHHI!IHHI!!HHHHHI!HHHI!IHHI!!HHHHHI!HHHI!IHHI!!IHHHHI!HHHI!IHHI!!!HHHHI!HHHI!IHHI!!IHHHHI!HHHI!IHHI!!HHHHHI!HHHI!IHHI!!IHHHHI!HHHI!IHHI!!!HHHHI!HHHI!IHHI!!!HHHHI!HHHI!IHHI!!HHHHHI!HHHI!IHHI!!IHHHHI!HHHI!IHHI!!!HHHHI!HHHI!IHHI!!!" + "'", str1, "hHHHHHI!HHHI!IHHI!!HHHHHI!HHHI!IHHI!!HHHHHI!HHHI!IHHI!!IHHHHI!HHHI!IHHI!!!HHHHI!HHHI!IHHI!!IHHHHI!HHHI!IHHI!!HHHHHI!HHHI!IHHI!!HHHHHI!HHHI!IHHI!!IHHHHI!HHHI!IHHI!!!HHHHI!HHHI!IHHI!!HHHHHI!HHHI!IHHI!!HHHHHI!HHHI!IHHI!!IHHHHI!HHHI!IHHI!!!HHHHI!HHHI!IHHI!!IHHHHI!HHHI!IHHI!!HHHHHI!HHHI!IHHI!!IHHHHI!HHHI!IHHI!!!HHHHI!HHHI!IHHI!!!HHHHI!HHHI!IHHI!!HHHHHI!HHHI!IHHI!!IHHHHI!HHHI!IHHI!!!HHHHI!HHHI!IHHI!!!");
    }

    @Test
    public void test7269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7269");
        char[] charArray10 = new char[] { '#', '4', '4', '4' };
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("HhhhI!IhhI!HI!!h", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("hHhhI!IhhI!hHHHi!iHHi!hi!!HHHhhI!IhhI!hHHHi!iHHi!hi!!HHHhhI!IhhI!hHHHi!iHHi!hi!!HHHhhI!IhhI!hHHHi!iHHi!hi!!HiHhhI!IhhI!hHHHi!iHHi!hi!!H!HhhI!IhhI!hHHHi!iHHi!hi!!HiHhhI!IhhI!hHHHi!iHHi!hi!!HHHhhI!IhhI!hHHHi!iHHi!hi!!HHHhhI!IhhI!hHHHi!iHHi!hi!!HiHhhI!IhhI!hHHHi!iHHi!hi!!H!HhhI!IhhI!hHHHi!iHHi!hi!!HhHhhI!IhhI!hHHHi!iHHi!hi!!HiHhhI!IhhI!hHHHi!iHHi!hi!!H!HhhI!IhhI!hHHHi!iHHi!hi!!H!HhhI!IhhI!hHHHi!iHHi!hi!!HH", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("hHI!HHI!HHHHHHI!HHHI!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IhhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!IhHHI!hHHI!iHHI!!!hHHI!hHHI!iHHIhHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!iHhhi!Hhhi!Ihhi!!!Hhhi!Hhhi!IHHhhhi!ihhi!hi!!h", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '#', '4', '4', '4' });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hi!" + "'", str11, "Hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hi!" + "'", str12, "Hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HhhhI!IhhI!HI!!h" + "'", str13, "HhhhI!IhhI!HI!!h");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HHhhI!IhhI!hHHHi!iHHi!hi!!HHHhhI!IhhI!hHHHi!iHHi!hi!!HHHhhI!IhhI!hHHHi!iHHi!hi!!HHHhhI!IhhI!hHHHi!iHHi!hi!!HiHhhI!IhhI!hHHHi!iHHi!hi!!H!HhhI!IhhI!hHHHi!iHHi!hi!!HiHhhI!IhhI!hHHHi!iHHi!hi!!HHHhhI!IhhI!hHHHi!iHHi!hi!!HHHhhI!IhhI!hHHHi!iHHi!hi!!HiHhhI!IhhI!hHHHi!iHHi!hi!!H!HhhI!IhhI!hHHHi!iHHi!hi!!HhHhhI!IhhI!hHHHi!iHHi!hi!!HiHhhI!IhhI!hHHHi!iHHi!hi!!H!HhhI!IhhI!hHHHi!iHHi!hi!!H!HhhI!IhhI!hHHHi!iHHi!hi!!HH" + "'", str14, "HHhhI!IhhI!hHHHi!iHHi!hi!!HHHhhI!IhhI!hHHHi!iHHi!hi!!HHHhhI!IhhI!hHHHi!iHHi!hi!!HHHhhI!IhhI!hHHHi!iHHi!hi!!HiHhhI!IhhI!hHHHi!iHHi!hi!!H!HhhI!IhhI!hHHHi!iHHi!hi!!HiHhhI!IhhI!hHHHi!iHHi!hi!!HHHhhI!IhhI!hHHHi!iHHi!hi!!HHHhhI!IhhI!hHHHi!iHHi!hi!!HiHhhI!IhhI!hHHHi!iHHi!hi!!H!HhhI!IhhI!hHHHi!iHHi!hi!!HhHhhI!IhhI!hHHHi!iHHi!hi!!HiHhhI!IhhI!hHHHi!iHHi!hi!!H!HhhI!IhhI!hHHHi!iHHi!hi!!H!HhhI!IhhI!hHHHi!iHHi!hi!!HH");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "h" + "'", str15, "h");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test7270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7270");
        char[] charArray5 = new char[] { '#' };
        java.lang.String str6 = org.apache.commons.lang.WordUtils.uncapitalize("Hi!", charArray5);
        java.lang.String str7 = org.apache.commons.lang.WordUtils.initials("hhhi!Hhhi!hhHI!", charArray5);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.initials("", charArray5);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalizeFully("hHhhi!ihhihhhhhI!Ihhhhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '#' });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "h" + "'", str7, "h");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Hhhhi!ihhihhhhhi!ihhhhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!" + "'", str9, "Hhhhi!ihhihhhhhi!ihhhhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!");
    }

    @Test
    public void test7271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7271");
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
        java.lang.String str25 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHHI!IHHI!HI!!H", charArray13);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.capitalizeFully("HHhHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!ihHHI!IHHI!HI!!hhHHI!IHHIhhhi!Hhhi!HhI!hhHI!!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHIhhhi!Hhhi!HhI!hhHI!!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!ihHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!hhhi!Hhhi!HhI!hhHI!!hHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!!hHHI!IHHI!HI!!h", charArray13);
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
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "HHHHI!IHHI!HI!!H" + "'", str25, "HHHHI!IHHI!HI!!H");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "HHhHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!ihHHI!IHHI!HI!!hhHHI!IHHIhhhi!Hhhi!HhI!hhHI!!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHIhhhi!Hhhi!HhI!hhHI!!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!ihHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!hhhi!Hhhi!HhI!hhHI!!hHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!!hHHI!IHHI!HI!!h" + "'", str26, "HHhHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!ihHHI!IHHI!HI!!hhHHI!IHHIhhhi!Hhhi!HhI!hhHI!!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHIhhhi!Hhhi!HhI!hhHI!!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!ihHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!hhhi!Hhhi!HhI!hhHI!!hHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!!hHHI!IHHI!HI!!h");
    }

    @Test
    public void test7272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7272");
        char[] charArray12 = new char[] {};
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray12);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("", charArray12);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray12);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray12);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray12);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("HH", charArray12);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray12);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("HHI!iHI!!", charArray12);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.uncapitalize("hhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!", charArray12);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.uncapitalize("hHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHhHHI!HHHI!IHHI!!", charArray12);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.uncapitalize("hhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!", charArray12);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] {});
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HH" + "'", str18, "HH");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HHI!iHI!!" + "'", str20, "HHI!iHI!!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!" + "'", str21, "hhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHhHHI!HHHI!IHHI!!" + "'", str22, "hHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHhHHI!HHHI!IHHI!!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!" + "'", str23, "hhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hhhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!" + "'", str24, "hhhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!");
    }

    @Test
    public void test7273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7273");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!IHhhi!ihhi!HHI!iHI!!hi!!!Hhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!IHhhi!ihhi!HHI!iHI!!hi!!!Hhhi!ihhi!HHI!iHI!!hi!!IHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!IHhhi!ihhi!HHI!iHI!!hi!!!Hhhi!ihhi!HHI!iHI!!hi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!IHhhi!ihhi!HHI!iHI!!hi!!!Hhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!IHhhi!ihhi!HHI!iHI!!hi!!!Hhhi!ihhi!HHI!iHI!!hi!!IHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!IHhhi!ihhi!HHI!iHI!!hi!!!Hhhi!ihhi!HHI!iHI!!hi!!!" + "'", str1, "hHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!IHhhi!ihhi!HHI!iHI!!hi!!!Hhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!IHhhi!ihhi!HHI!iHI!!hi!!!Hhhi!ihhi!HHI!iHI!!hi!!IHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!IHhhi!ihhi!HHI!iHI!!hi!!!Hhhi!ihhi!HHI!iHI!!hi!!!");
    }

    @Test
    public void test7274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7274");
        char[] charArray11 = new char[] {};
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray11);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("HH", charArray11);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray11);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHHHI!HHHI!IHHI!!", charArray11);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray11);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!ihhi!HI!", charArray11);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhi!hhhihhi!", charArray11);
        java.lang.Class<?> wildcardClass23 = charArray11.getClass();
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] {});
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HH" + "'", str17, "HH");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "HHHHHI!HHHI!IHHI!!" + "'", str19, "HHHHHI!HHHI!IHHI!!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Hhhi!ihhi!HI!" + "'", str21, "Hhhi!ihhi!HI!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Hhhhi!hhhihhi!" + "'", str22, "Hhhhi!hhhihhi!");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test7275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7275");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHHI!IHHI!HHHI!IHHI!!HI!!", 0, (int) ' ', "Hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!!hhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!!hhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHI!IHHI!HHHI!IHHI!!HI!!" + "'", str4, "hHHI!IHHI!HHHI!IHHI!!HI!!");
    }

    @Test
    public void test7276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7276");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("HhHhhI!IhhI!!HHhhI!IhhI!!HHhhI!IhhI!!HHhhI!IhhI!!IHhhI!IhhI!!!HhhI!IhhI!!HHhhI!IhhI!!HHhhI!IhhI!!HHhhhHHHHHHHHHHHHHHHIHHH!HHHHHHHHHHHHHHHIHHH!HHHIHHHHHHHHHHHIHHH!HHH!I!IhhI!!IHhhI!IhhI!!!HhhI!IhhI!!IHhhI!IhhI!!HHhhI!IhhI!!HHhhI!IhhI!!IHhhI!IhhI!!!HhhI!IhhI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHHhhhhhhhhhhhhhhhihhh!hhhhhhhhhhhhhhhihhh!hhhihhhhhhhhhhhihhh!hhh!i!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!ihHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!!" + "'", str1, "hHhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHHhhhhhhhhhhhhhhhihhh!hhhhhhhhhhhhhhhihhh!hhhihhhhhhhhhhhihhh!hhh!i!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!ihHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!!");
    }

    @Test
    public void test7277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7277");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhHHi!iHHiHhhi!ihhi!HHHi!iHHi!hi!!", 1, (int) (byte) 1, "hHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!ihhi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!ihhi!" + "'", str4, "hhHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!ihhi!");
    }

    @Test
    public void test7278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7278");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHHHHHHHHIHHHHi!iHHi!hi!!", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHHHHHHHHIHHHHi!iHHi!hi!!" + "'", str2, "hHHHHHHHHIHHHHi!iHHi!hi!!");
    }

    @Test
    public void test7279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7279");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HhHHHHI!IHHHHHI!IHHI!HHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!", 100, 10, "hHHI!IHHI!HI!!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end 100, length 98");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7280");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!hhhi!hhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!iHhHHHHI!HHHHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!HhHhhhi!ihhi!HHHi!iHHi!hi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!hhhi!hhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!iHhHHHHI!HHHHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!HhHhhhi!ihhi!HHHi!iHHi!hi!!" + "'", str1, "Hhhi!hhhi!hhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!iHhHHHHI!HHHHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!HhHhhhi!ihhi!HHHi!iHHi!hi!!");
    }

    @Test
    public void test7281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7281");
        char[] charArray7 = new char[] {};
        java.lang.String str8 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("H", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("HhhhI!IhhI!HI!!h", charArray7);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("HHHHI!IHHI!HI!!H", charArray7);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HhhhI!IhhI!HI!!h" + "'", str12, "HhhhI!IhhI!HI!!h");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HHHHI!IHHI!HI!!H" + "'", str13, "HHHHI!IHHI!HI!!H");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!!" + "'", str14, "Hhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!!");
    }

    @Test
    public void test7282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7282");
        char[] charArray13 = new char[] {};
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray13);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("", charArray13);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray13);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray13);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("", charArray13);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.uncapitalize("Hi!", charArray13);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray13);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.uncapitalize("hH", charArray13);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalize("hHHI!hHHI!iHHI!!", charArray13);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalize("HHHI!hHHI!HHhi!", charArray13);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalize("Hhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!Hhihi!!hi!hhi!ihi!!hi!!", charArray13);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.capitalize("Hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!h", charArray13);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.capitalizeFully("hHhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!!H", charArray13);
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hHHI!hHHI!iHHI!!" + "'", str22, "hHHI!hHHI!iHHI!!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "HHHI!hHHI!HHhi!" + "'", str23, "HHHI!hHHI!HHhi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Hhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!Hhihi!!hi!hhi!ihi!!hi!!" + "'", str24, "Hhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!Hhihi!!hi!hhi!ihi!!hi!!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!h" + "'", str25, "Hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!h");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hHhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!!H" + "'", str26, "hHhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!!H");
    }

    @Test
    public void test7283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7283");
        char[] charArray10 = new char[] {};
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("H", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("hhI!", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("hH", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("hHHi!iHHi!!", charArray10);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("hH", charArray10);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.initials("hhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!", charArray10);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("HhHHHI!IHHhhHhHhHhHhHhHhHhIhHh!hhhhi!hhhi!hhi!hhhi!", charArray10);
        java.lang.Class<?> wildcardClass21 = charArray10.getClass();
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H" + "'", str14, "H");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hH" + "'", str18, "hH");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HhHHHI!IHHhhHhHhHhHhHhHhHhIhHh!hhhhi!hhhi!hhi!hhhi!" + "'", str20, "HhHHHI!IHHhhHhHhHhHhHhHhHhIhHh!hhhhi!hhhi!hhi!hhhi!");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test7284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7284");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HhHHI!IHHI!!HhHHI!IHHI!!hhHHI!IHHI!!hhHHI!IHHI!!IhHHI!IHHI!!!hHHI!IHHI!!IhHHI!IHHI!!hhHHI!IHHI!!hhHHI!IHHI!!IhHHI!IHHI!!!hHHI!IHHI!!hhHHI!IHHI!!hhHHI!IHHI!!hhHHI!IHHI!!ihHHI!IHHI!!!hHHI!IHHI!!ihHHI!IHHI!!hhHHI!IHHI!!hhHHI!IHHI!!ihHHI!IHHI!!!hHHI!IHHI!!!hHHI!IHHI!!HhHHI!IHHI!!IhHHI!IHHI!!!hHHI!IHHI!!!", (int) (short) 1, (int) (byte) 1, "hHHhhhi!ihhi!hi!!hhHHhhhi!ihhi!hi!!hhHHhhhi!ihhi!hi!!hiHHhhhi!ihhi!hi!!h!HHhhhi!ihhi!hi!!hiHHhhhi!ihhhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HhHHhhhi!ihhi!hi!!hhHHhhhi!ihhi!hi!!hhHHhhhi!ihhi!hi!!hiHHhhhi!ihhi!hi!!h!HHhhhi!ihhi!hi!!hiHHhhhi!ihhhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!" + "'", str4, "HhHHhhhi!ihhi!hi!!hhHHhhhi!ihhi!hi!!hhHHhhhi!ihhi!hi!!hiHHhhhi!ihhi!hi!!h!HHhhhi!ihhi!hi!!hiHHhhhi!ihhhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!");
    }

    @Test
    public void test7285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7285");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhhi!hhhi!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhhi!ihhi!!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhi!hhhi!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhhi!ihhi!!" + "'", str2, "hhhi!hhhi!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhhi!ihhi!!");
    }

    @Test
    public void test7286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7286");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhhi!hhhi!Hhhi!hhhi!hhhi!Ihhi!!hhi!Ihhi!hhhi!Hhhi!hhhi!hhhi!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhi!hhhi!Hhhi!hhhi!hhhi!Ihhi!!hhi!Ihhi!hhhi!Hhhi!hhhi!hhhi!" + "'", str2, "Hhhi!hhhi!Hhhi!hhhi!hhhi!Ihhi!!hhi!Ihhi!hhhi!Hhhi!hhhi!hhhi!");
    }

    @Test
    public void test7287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7287");
        char[] charArray10 = new char[] {};
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("Hh", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("Hi!", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("H", charArray10);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhi!ihhi!!", charArray10);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.initials("Hhhi!ihhi!hhhi!ihhi!!hi!!", charArray10);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("HHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IHhhi!hhI!!IhhhI!IhhI!!!HHhhhI!IhhI!!hHhhi!hhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhHhhi!I!!!HHHi!iHHi!HHHI!IHHI!!hi!!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hi!" + "'", str13, "Hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hh" + "'", str15, "Hh");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hi!" + "'", str16, "Hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H" + "'", str17, "H");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hhhi!ihhi!!" + "'", str18, "hhhi!ihhi!!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IHhhi!hhI!!IhhhI!IhhI!!!HHhhhI!IhhI!!hHhhi!hhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhHhhi!I!!!HHHi!iHHi!HHHI!IHHI!!hi!!" + "'", str20, "HHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IHhhi!hhI!!IhhhI!IhhI!!!HHhhhI!IhhI!!hHhhi!hhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhHhhi!I!!!HHHi!iHHi!HHHI!IHHI!!hi!!");
    }

    @Test
    public void test7288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7288");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhi!ihhihhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!ihhihhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!" + "'", str1, "Hhhhi!ihhihhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!");
    }

    @Test
    public void test7289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7289");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("Hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!!hhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!!hhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test7290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7290");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("HHhhhi!ihhihhhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhhhhi!hhhihhhi!hhhi!ihhi!!hi!!ihhhhi!ihhi!!!hhhhi!ihhi!!hhhhhhhhhi!hhhihhhi!hhhi!ihhi!!i!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!hhhhi!ihhi!!!hhhhi!ihhi!!ihhhhi!ihhhhhhi!hhhihhhi!hhhi!ihhi!!i!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhihhhhi!hhhihhhi!hhhi!ihhi!!!ihhi!!!hhhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHhhhi!ihhihhhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhhhhi!hhhihhhi!hhhi!ihhi!!hi!!ihhhhi!ihhi!!!hhhhi!ihhi!!hhhhhhhhhi!hhhihhhi!hhhi!ihhi!!i!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!hhhhi!ihhi!!!hhhhi!ihhi!!ihhhhi!ihhhhhhi!hhhihhhi!hhhi!ihhi!!i!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhihhhhi!hhhihhhi!hhhi!ihhi!!!ihhi!!!hhhhi!ihhi!!!" + "'", str1, "HHhhhi!ihhihhhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhhhhi!hhhihhhi!hhhi!ihhi!!hi!!ihhhhi!ihhi!!!hhhhi!ihhi!!hhhhhhhhhi!hhhihhhi!hhhi!ihhi!!i!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!hhhhi!ihhi!!!hhhhi!ihhi!!ihhhhi!ihhhhhhi!hhhihhhi!hhhi!ihhi!!i!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhihhhhi!hhhihhhi!hhhi!ihhi!!!ihhi!!!hhhhi!ihhi!!!");
    }

    @Test
    public void test7291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7291");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HhHHHI!IHHIhhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!IhhiHHHHi!iHHi!hi!!H", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HhHHHI!IHHIhhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!IhhiHHHHi!iHHi!hi!!H" + "'", str2, "HhHHHI!IHHIhhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!IhhiHHHHi!iHHi!hi!!H");
    }

    @Test
    public void test7292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7292");
        char[] charArray13 = new char[] {};
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray13);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("", charArray13);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray13);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray13);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("", charArray13);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray13);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("H", charArray13);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalize("hH", charArray13);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalize("HH", charArray13);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalize("hhI!", charArray13);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.initials("hhhi!Hhhi!Ihhi!!", charArray13);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhi!ihhi!hhhhi!ihhi!hi!!hhhhhi!ihhi!hhhhi!ihhi!hi!!hhhhhi!ihhi!hhhhi!ihhi!hi!!hhhhhi!ihhi!hhhhi!ihhi!hi!!hihhhi!ihhi!hhhhi!ihhi!hi!!h!hhhi!ihhi!hhhhi!ihhi!hi!!hihhhi!ihhi!hhhhi!ihhi!hi!!hhhhhi!ihhi!hhhhi!ihhi!hi!!hhhhhi!ihhi!hhhhi!ihhi!hi!!hihhhi!ihhi!hhhhi!ihhi!hi!!h!hhhi!ihhi!hhhhi!ihhi!hi!!hhhhhi!ihhi!hhhhi!ihhi!hi!!hihhhi!ihhi!hhhhi!ihhi!hi!!h!hhhi!ihhi!hhhhi!ihhi!hi!!h!hhhi!ihhi!hhhhi!ihhi!hi!!hh", charArray13);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!hhhi!hhhi!Ihhi!!hhi!Ihhi!hhhi!Hhhi!hhhi!hhhi!", charArray13);
        java.lang.Class<?> wildcardClass27 = charArray13.getClass();
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] {});
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hi!" + "'", str17, "Hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "h" + "'", str19, "h");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H" + "'", str20, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hH" + "'", str21, "hH");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "HH" + "'", str22, "HH");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hhI!" + "'", str23, "hhI!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Hhhhi!ihhi!hhhhi!ihhi!hi!!hhhhhi!ihhi!hhhhi!ihhi!hi!!hhhhhi!ihhi!hhhhi!ihhi!hi!!hhhhhi!ihhi!hhhhi!ihhi!hi!!hihhhi!ihhi!hhhhi!ihhi!hi!!h!hhhi!ihhi!hhhhi!ihhi!hi!!hihhhi!ihhi!hhhhi!ihhi!hi!!hhhhhi!ihhi!hhhhi!ihhi!hi!!hhhhhi!ihhi!hhhhi!ihhi!hi!!hihhhi!ihhi!hhhhi!ihhi!hi!!h!hhhi!ihhi!hhhhi!ihhi!hi!!hhhhhi!ihhi!hhhhi!ihhi!hi!!hihhhi!ihhi!hhhhi!ihhi!hi!!h!hhhi!ihhi!hhhhi!ihhi!hi!!h!hhhi!ihhi!hhhhi!ihhi!hi!!hh" + "'", str25, "Hhhhi!ihhi!hhhhi!ihhi!hi!!hhhhhi!ihhi!hhhhi!ihhi!hi!!hhhhhi!ihhi!hhhhi!ihhi!hi!!hhhhhi!ihhi!hhhhi!ihhi!hi!!hihhhi!ihhi!hhhhi!ihhi!hi!!h!hhhi!ihhi!hhhhi!ihhi!hi!!hihhhi!ihhi!hhhhi!ihhi!hi!!hhhhhi!ihhi!hhhhi!ihhi!hi!!hhhhhi!ihhi!hhhhi!ihhi!hi!!hihhhi!ihhi!hhhhi!ihhi!hi!!h!hhhi!ihhi!hhhhi!ihhi!hi!!hhhhhi!ihhi!hhhhi!ihhi!hi!!hihhhi!ihhi!hhhhi!ihhi!hi!!h!hhhi!ihhi!hhhhi!ihhi!hi!!h!hhhi!ihhi!hhhhi!ihhi!hi!!hh");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Hhhi!hhhi!hhhi!Ihhi!!hhi!Ihhi!hhhi!Hhhi!hhhi!hhhi!" + "'", str26, "Hhhi!hhhi!hhhi!Ihhi!!hhi!Ihhi!hhhi!Hhhi!hhhi!hhhi!");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test7293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7293");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!", (int) (byte) 100, (int) (short) 0, "hHHi!iHHi!HhhhI!IhhI!HI!!h");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihHHi!iHHi!HhhhI!IhhI!HI!!h" + "'", str4, "hhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihHHi!iHHi!HhhhI!IhhI!HI!!h");
    }

    @Test
    public void test7294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7294");
        char[] charArray8 = new char[] {};
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("hi!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray8);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray8);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhhhi!ihhihhhi!hhhi!ihhi!!!hi!!hhhhhhi!ihhihhhi!hhhi!ihhi!!!hi!!hhhhhhi!ihhihhhi!hhhi!ihhi!!!hi!!hhhhhhi!ihhihhhi!hhhi!ihhi!!!hi!!hhhhhhi!ihhihhhi!hhhi!ihhi!!!hi!!hhhhhhi!ihhihhhi!hhhi!ihhi!!!hi!!hhhhhhi!ihhihhhi!hhhi!ihhi!!!hi!!hhhhhhi!ihhihhhi!hhhi!ihhi!!!hi!!hhhhhhi!ihhihhhi!hhhi!ihhi!!!hi!!hihhhhi!ihhihhhi!hhhi!ihhi!!!hi!!hhhhhhi!ihhihhhi!hhhi!ihhi!!!hi!!hhhhhhi!ihhihhhi!hhhi!ihhi!!!hi!!hhhhhhi!ihhihhhi!hhhi!ihhi!!!hi!!hhhhhhi!ihhihhhi!hhhi!ihhi!!!hi!!hihhhhi!ihhihhhi!hhhi!ihhi!!!hi!!h!hhhhi!ihhihhhi!hhhi!ihhi!!!hi!!hihhhhi!ihhihhhi!hhhi!ihhi!!!hi!!hhhhhhi!ihhihhhi!hhhi!ihhi!!!hi!!hhhhhhi!ihhihhhi!hhhi!ihhi!!!hi!!hihhhhi!ihhihhhi!hhhi!ihhi!!!hi!!h!hhhhi!ihhihhhi!hhhi!ihhi!!!hi!!hhhhhhi!ihhihhhi!hhhi!ihhi!!!hi!!hihhhhi!ihhihhhi!hhhi!ihhi!!!hi!!h!hhhhi!ihhihhhi!hhhi!ihhi!!!hi!!h!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HI!" + "'", str12, "HI!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hi!" + "'", str14, "Hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hi!" + "'", str15, "Hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hhhhhhi!ihhihhhi!hhhi!ihhi!!!hi!!hhhhhhi!ihhihhhi!hhhi!ihhi!!!hi!!hhhhhhi!ihhihhhi!hhhi!ihhi!!!hi!!hhhhhhi!ihhihhhi!hhhi!ihhi!!!hi!!hhhhhhi!ihhihhhi!hhhi!ihhi!!!hi!!hhhhhhi!ihhihhhi!hhhi!ihhi!!!hi!!hhhhhhi!ihhihhhi!hhhi!ihhi!!!hi!!hhhhhhi!ihhihhhi!hhhi!ihhi!!!hi!!hhhhhhi!ihhihhhi!hhhi!ihhi!!!hi!!hihhhhi!ihhihhhi!hhhi!ihhi!!!hi!!hhhhhhi!ihhihhhi!hhhi!ihhi!!!hi!!hhhhhhi!ihhihhhi!hhhi!ihhi!!!hi!!hhhhhhi!ihhihhhi!hhhi!ihhi!!!hi!!hhhhhhi!ihhihhhi!hhhi!ihhi!!!hi!!hihhhhi!ihhihhhi!hhhi!ihhi!!!hi!!h!hhhhi!ihhihhhi!hhhi!ihhi!!!hi!!hihhhhi!ihhihhhi!hhhi!ihhi!!!hi!!hhhhhhi!ihhihhhi!hhhi!ihhi!!!hi!!hhhhhhi!ihhihhhi!hhhi!ihhi!!!hi!!hihhhhi!ihhihhhi!hhhi!ihhi!!!hi!!h!hhhhi!ihhihhhi!hhhi!ihhi!!!hi!!hhhhhhi!ihhihhhi!hhhi!ihhi!!!hi!!hihhhhi!ihhihhhi!hhhi!ihhi!!!hi!!h!hhhhi!ihhihhhi!hhhi!ihhi!!!hi!!h!" + "'", str16, "Hhhhhhi!ihhihhhi!hhhi!ihhi!!!hi!!hhhhhhi!ihhihhhi!hhhi!ihhi!!!hi!!hhhhhhi!ihhihhhi!hhhi!ihhi!!!hi!!hhhhhhi!ihhihhhi!hhhi!ihhi!!!hi!!hhhhhhi!ihhihhhi!hhhi!ihhi!!!hi!!hhhhhhi!ihhihhhi!hhhi!ihhi!!!hi!!hhhhhhi!ihhihhhi!hhhi!ihhi!!!hi!!hhhhhhi!ihhihhhi!hhhi!ihhi!!!hi!!hhhhhhi!ihhihhhi!hhhi!ihhi!!!hi!!hihhhhi!ihhihhhi!hhhi!ihhi!!!hi!!hhhhhhi!ihhihhhi!hhhi!ihhi!!!hi!!hhhhhhi!ihhihhhi!hhhi!ihhi!!!hi!!hhhhhhi!ihhihhhi!hhhi!ihhi!!!hi!!hhhhhhi!ihhihhhi!hhhi!ihhi!!!hi!!hihhhhi!ihhihhhi!hhhi!ihhi!!!hi!!h!hhhhi!ihhihhhi!hhhi!ihhi!!!hi!!hihhhhi!ihhihhhi!hhhi!ihhi!!!hi!!hhhhhhi!ihhihhhi!hhhi!ihhi!!!hi!!hhhhhhi!ihhihhhi!hhhi!ihhi!!!hi!!hihhhhi!ihhihhhi!hhhi!ihhi!!!hi!!h!hhhhi!ihhihhhi!hhhi!ihhi!!!hi!!hhhhhhi!ihhihhhi!hhhi!ihhi!!!hi!!hihhhhi!ihhihhhi!hhhi!ihhi!!!hi!!h!hhhhi!ihhihhhi!hhhi!ihhi!!!hi!!h!");
    }

    @Test
    public void test7295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7295");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hHHHHHI!IHHI!HI!!HHHHHHHI!IHHI!HI!!HHHHHHHI!IHHI!HI!!HIHHHHHI!IHHI!HI!!H!HHHHHI!IHHI!HI!!HIHHHHHI!IHHI!HI!!HHHHHHHI!IHHI!HI!!HHHHHHHI!IHHI!HI!!HIHHHHHI!IHHI!HI!!H!HHHHHI!IHHI!HI!!H!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHHHHI!IHHI!HI!!HHHHHHHI!IHHI!HI!!HHHHHHHI!IHHI!HI!!HIHHHHHI!IHHI!HI!!H!HHHHHI!IHHI!HI!!HIHHHHHI!IHHI!HI!!HHHHHHHI!IHHI!HI!!HHHHHHHI!IHHI!HI!!HIHHHHHI!IHHI!HI!!H!HHHHHI!IHHI!HI!!H!" + "'", str1, "hHHHHHI!IHHI!HI!!HHHHHHHI!IHHI!HI!!HHHHHHHI!IHHI!HI!!HIHHHHHI!IHHI!HI!!H!HHHHHI!IHHI!HI!!HIHHHHHI!IHHI!HI!!HHHHHHHI!IHHI!HI!!HHHHHHHI!IHHI!HI!!HIHHHHHI!IHHI!HI!!H!HHHHHI!IHHI!HI!!H!");
    }

    @Test
    public void test7296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7296");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHHi!iHHi!hhhi!hhhi!hhi!hhhi!", (int) (byte) 1, (int) (short) 0, "hHHHHHHHHIhHHHI!HHHIHHHHI!HHHIHHHI!IHHI!HI!!!IHHI!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HhHHHHHHHHIhHHHI!HHHIHHHHI!HHHIHHHI!IHHI!HI!!!IHHI!!" + "'", str4, "HhHHHHHHHHIhHHHI!HHHIHHHHI!HHHIHHHI!IHHI!HI!!!IHHI!!");
    }

    @Test
    public void test7297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7297");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!h", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!h" + "'", str2, "Hhhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!h");
    }

    @Test
    public void test7298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7298");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hHhhhi!ihhhhhhi!ihhi!hhhi!ihhi!!hi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HhHHHI!IHHHHHHI!IHHI!HHHI!IHHI!!HI!!" + "'", str1, "HhHHHI!IHHHHHHI!IHHI!HHHI!IHHI!!HI!!");
    }

    @Test
    public void test7299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7299");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.initials("Hhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhHHHi!iHHi!hHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
    }

    @Test
    public void test7300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7300");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!!Hhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!!Hhi!Ihi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!hHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!hHhhhi!ihhi!hi!!hHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!hHhhhi!ihhi!hi!!hHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!IHhhhi!ihhi!hi!!hHhhhi!ihhi!hi!!hHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!!Hhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!!Hhi!Ihi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!hHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!hHhhhi!ihhi!hi!!hHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!hHhhhi!ihhi!hi!!hHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!IHhhhi!ihhi!hi!!hHhhhi!ihhi!hi!!hHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!!" + "'", str1, "HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!!Hhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!!Hhi!Ihi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!hHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!hHhhhi!ihhi!hi!!hHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!hHhhhi!ihhi!hi!!hHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!IHhhhi!ihhi!hi!!hHhhhi!ihhi!hi!!hHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!!");
    }

    @Test
    public void test7301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7301");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHI!HHI!HHHHHHI!HHHI!HHHHI!IHHI!!HHhHHHHI!IHHI!!HHHHHI!IHHI!!HHHHHI!IHHHHHI!HHHIHHHI!HHHI!IHHI!!HI!!IHHHHI!IHHI!!!HHHHI!IHHI!!HHHHHHHHHHHHHHI!HHHI!IHHI!!HHHHHI!HHHI!IHHI!!HHHHHI!HHHI!IHHIHHI!HHI!HHHHHHI!HHHI!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!", 0, (int) (short) -1, "Hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhhhhi!ihhi!hhhi!ihhi!hi!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHI!HHI!HHHHHHI!HHHI!HHHHI!IHHI!!HHhHHHHI!IHHI!!HHHHHI!IHHI!!HHHHHI!IHHHHHI!HHHIHHHI!HHHI!IHHI!!HI!!IHHHHI!IHHI!!!HHHHI!IHHI!!HHHHHHHHHHHHHHI!HHHI!IHHI!!HHHHHI!HHHI!IHHI!!HHHHHI!HHHI!IHHIHHI!HHI!HHHHHHI!HHHI!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!" + "'", str4, "hHI!HHI!HHHHHHI!HHHI!HHHHI!IHHI!!HHhHHHHI!IHHI!!HHHHHI!IHHI!!HHHHHI!IHHHHHI!HHHIHHHI!HHHI!IHHI!!HI!!IHHHHI!IHHI!!!HHHHI!IHHI!!HHHHHHHHHHHHHHI!HHHI!IHHI!!HHHHHI!HHHI!IHHI!!HHHHHI!HHHI!IHHIHHI!HHI!HHHHHHI!HHHI!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!");
    }

    @Test
    public void test7302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7302");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hhhhhhhhhhhhh", (int) (short) 100, "hHHhHHhHHiHH!HHhHHhHHhHHiHH!HHhHHhHHhHHiHH!HHIHHhHHhHHiHH!HH!HHhHHhHHiHH!HHIHHhHHhHHiHH!HHhHHhHHhhHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!!Hhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!!Hhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!!Hhi!Ihi!!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhhhhhhhhhhh" + "'", str4, "hhhhhhhhhhhhh");
    }

    @Test
    public void test7303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7303");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hhhhhi!hhhhhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhHHhHhHhHhHhHhHhHiHhH!HhHhHhHhHhHhHhHiHhH!HhHiHhHhHhHhHhHiHhH!HhH!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test7304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7304");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hhhhi!ihhiHi!!hi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhhi!ihhiHi!!hi!!" + "'", str1, "hhhhi!ihhiHi!!hi!!");
    }

    @Test
    public void test7305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7305");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!hhHHi!iHHi!HHhhI!IhhI!hhhi!ihhi!!HI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!ihhi!hhhhi!ihhi!hhhi!ihhi!!hi!!" + "'", str1, "Hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!ihhi!hhhhi!ihhi!hhhi!ihhi!!hi!!");
    }

    @Test
    public void test7306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7306");
        char[] charArray4 = new char[] {};
        java.lang.String str5 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray4);
        java.lang.String str6 = org.apache.commons.lang.WordUtils.initials("", charArray4);
        java.lang.String str7 = org.apache.commons.lang.WordUtils.capitalize("hhhI!IhhI!!", charArray4);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalize("hHhhHhhHhhHhIHh!HhIHhhHhhHhIHh!Hh!HhhHhhHhhHhhHhIHh!HhIHhhHhhHhIHh!Hh!HhhHhhHhhHhhHhIHh!HhIHhhHhhHhIhhHHi!iHHi!HHHI!IHHI!!hi!!hhHHi!iHHi!HHHI!IHHI!!hi!!HhHHi!iHHi!HHHI!IHHI!!hi!!HhHHi!iHHi!HHHI!IHHI!!hi!!IhHHi!iHHi!HHHI!IHHI!!hi!!!hHHi!iHHi!HHHI!IHHI!!hi!!HhHHi!iHHi!HHHI!IHHI!!hi!!HhHHi!iHHi!HHHI!IHHI!!hi!!HhHHi!iHHi!HHHI!IHHI!!hi!!IhHHi!iHHi!HHHI!IHHI!!hi!!!hHHi!iHHi!HHHI!IHHI!!hi!!HhHHi!iHHi!HHHI!IHHI!!hi!!HhHHi!iHHi!HHHI!IHHI!!hi!!HhHHi!iHHi!HHHI!IHHI!!hi!!IhHHi!iHHi!HHHI!IHHI!!hi!!!", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hhhI!IhhI!!" + "'", str7, "hhhI!IhhI!!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hHhhHhhHhhHhIHh!HhIHhhHhhHhIHh!Hh!HhhHhhHhhHhhHhIHh!HhIHhhHhhHhIHh!Hh!HhhHhhHhhHhhHhIHh!HhIHhhHhhHhIhhHHi!iHHi!HHHI!IHHI!!hi!!hhHHi!iHHi!HHHI!IHHI!!hi!!HhHHi!iHHi!HHHI!IHHI!!hi!!HhHHi!iHHi!HHHI!IHHI!!hi!!IhHHi!iHHi!HHHI!IHHI!!hi!!!hHHi!iHHi!HHHI!IHHI!!hi!!HhHHi!iHHi!HHHI!IHHI!!hi!!HhHHi!iHHi!HHHI!IHHI!!hi!!HhHHi!iHHi!HHHI!IHHI!!hi!!IhHHi!iHHi!HHHI!IHHI!!hi!!!hHHi!iHHi!HHHI!IHHI!!hi!!HhHHi!iHHi!HHHI!IHHI!!hi!!HhHHi!iHHi!HHHI!IHHI!!hi!!HhHHi!iHHi!HHHI!IHHI!!hi!!IhHHi!iHHi!HHHI!IHHI!!hi!!!" + "'", str8, "hHhhHhhHhhHhIHh!HhIHhhHhhHhIHh!Hh!HhhHhhHhhHhhHhIHh!HhIHhhHhhHhIHh!Hh!HhhHhhHhhHhhHhIHh!HhIHhhHhhHhIhhHHi!iHHi!HHHI!IHHI!!hi!!hhHHi!iHHi!HHHI!IHHI!!hi!!HhHHi!iHHi!HHHI!IHHI!!hi!!HhHHi!iHHi!HHHI!IHHI!!hi!!IhHHi!iHHi!HHHI!IHHI!!hi!!!hHHi!iHHi!HHHI!IHHI!!hi!!HhHHi!iHHi!HHHI!IHHI!!hi!!HhHHi!iHHi!HHHI!IHHI!!hi!!HhHHi!iHHi!HHHI!IHHI!!hi!!IhHHi!iHHi!HHHI!IHHI!!hi!!!hHHi!iHHi!HHHI!IHHI!!hi!!HhHHi!iHHi!HHHI!IHHI!!hi!!HhHHi!iHHi!HHHI!IHHI!!hi!!HhHHi!iHHi!HHHI!IHHI!!hi!!IhHHi!iHHi!HHHI!IHHI!!hi!!!");
    }

    @Test
    public void test7307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7307");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("Hhhhhi!hhhhHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHHHHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!HHHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!HHHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!HHHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!IHHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!!HHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!HHHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!HHHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!HHHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!IHHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!!HHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!IHHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!HHHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!HHHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!IHHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!!HHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHHHI!HHHHhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhhhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!" + "'", str1, "hHHHHI!HHHHhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhhhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!");
    }

    @Test
    public void test7308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7308");
        char[] charArray11 = new char[] {};
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("H", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("hhI!", charArray11);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("hH", charArray11);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("hHHi!iHHi!!", charArray11);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray11);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHHi!iHHi!hi!!H", charArray11);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.uncapitalize("hHhhi!ihhi!hi!!HHhhi!ihhi!hi!!HHhhi!ihhi!hi!!IHhhi!ihhi!hi!!!Hhhi!ihhi!hi!!IHhhi!ihhi!hi!!HHhhi!ihhi!hi!!HHhhi!ihhi!hi!!IHhhi!ihhi!hi!!!Hhhi!ihhi!hi!!HHhhi!ihhi!hi!!HHhhi!ihhi!hi!!HHhhi!ihhi!hi!!HHhhi!ihhi!hi!!IHhhi!ihhi!hi!!!Hhhi!ihhi!hi!!IHhhi!ihhi!hi!!HHhhi!ihhi!hi!!HHhhi!ihhi!hi!!IHhhi!ihhi!hi!!!Hhhi!ihhi!hi!!HHhhi!ihhi!hi!!IHhhi!ihhi!hi!!!Hhhi!ihhi!hi!!!Hhhi!ihhi!hi!!H", charArray11);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.initials("hHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!!", charArray11);
        java.lang.Class<?> wildcardClass23 = charArray11.getClass();
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] {});
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hHHHi!iHHi!hi!!H" + "'", str20, "hHHHi!iHHi!hi!!H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hHhhi!ihhi!hi!!HHhhi!ihhi!hi!!HHhhi!ihhi!hi!!IHhhi!ihhi!hi!!!Hhhi!ihhi!hi!!IHhhi!ihhi!hi!!HHhhi!ihhi!hi!!HHhhi!ihhi!hi!!IHhhi!ihhi!hi!!!Hhhi!ihhi!hi!!HHhhi!ihhi!hi!!HHhhi!ihhi!hi!!HHhhi!ihhi!hi!!HHhhi!ihhi!hi!!IHhhi!ihhi!hi!!!Hhhi!ihhi!hi!!IHhhi!ihhi!hi!!HHhhi!ihhi!hi!!HHhhi!ihhi!hi!!IHhhi!ihhi!hi!!!Hhhi!ihhi!hi!!HHhhi!ihhi!hi!!IHhhi!ihhi!hi!!!Hhhi!ihhi!hi!!!Hhhi!ihhi!hi!!H" + "'", str21, "hHhhi!ihhi!hi!!HHhhi!ihhi!hi!!HHhhi!ihhi!hi!!IHhhi!ihhi!hi!!!Hhhi!ihhi!hi!!IHhhi!ihhi!hi!!HHhhi!ihhi!hi!!HHhhi!ihhi!hi!!IHhhi!ihhi!hi!!!Hhhi!ihhi!hi!!HHhhi!ihhi!hi!!HHhhi!ihhi!hi!!HHhhi!ihhi!hi!!HHhhi!ihhi!hi!!IHhhi!ihhi!hi!!!Hhhi!ihhi!hi!!IHhhi!ihhi!hi!!HHhhi!ihhi!hi!!HHhhi!ihhi!hi!!IHhhi!ihhi!hi!!!Hhhi!ihhi!hi!!HHhhi!ihhi!hi!!IHhhi!ihhi!hi!!!Hhhi!ihhi!hi!!!Hhhi!ihhi!hi!!H");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test7309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7309");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HHHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhiHHhhhhi!hhhihhhi!hhhi!ihhi!!hhhhHHhi!hi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhHHhi!hihhhi!hhhi!ihhi!!ihhhhi!hhhihhhHHhi!i!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhHHhi!i!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhHHhi!i!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhHHhi!hhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!HHhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihHHhi!hhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hHHhi!hhi!ihhi!!hhhhhi!hhhihhhi!hhhi!iHHhi!hhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!HHhi!!hhhhi!hhhihhhi!hhhi!ihhi!!ihhhhHHhi!i!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhHHhi!ihhhi!hhhi!ihhi!!ihhhhi!hhhihhhiHHhi!!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhiHHhi!!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhiHHhi!!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhHHhi!hhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hHHhi!hhihhhi!hhhi!ihhi!!!H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhiHHhhhhi!hhhihhhi!hhhi!ihhi!!hhhhHHhi!hi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhHHhi!hihhhi!hhhi!ihhi!!ihhhhi!hhhihhhHHhi!i!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhHHhi!i!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhHHhi!i!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhHHhi!hhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!HHhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihHHhi!hhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hHHhi!hhi!ihhi!!hhhhhi!hhhihhhi!hhhi!iHHhi!hhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!HHhi!!hhhhi!hhhihhhi!hhhi!ihhi!!ihhhhHHhi!i!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhHHhi!ihhhi!hhhi!ihhi!!ihhhhi!hhhihhhiHHhi!!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhiHHhi!!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhiHHhi!!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhHHhi!hhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hHHhi!hhihhhi!hhhi!ihhi!!!H" + "'", str1, "hHHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhiHHhhhhi!hhhihhhi!hhhi!ihhi!!hhhhHHhi!hi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhHHhi!hihhhi!hhhi!ihhi!!ihhhhi!hhhihhhHHhi!i!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhHHhi!i!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhHHhi!i!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhHHhi!hhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!HHhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihHHhi!hhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hHHhi!hhi!ihhi!!hhhhhi!hhhihhhi!hhhi!iHHhi!hhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!HHhi!!hhhhi!hhhihhhi!hhhi!ihhi!!ihhhhHHhi!i!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhHHhi!ihhhi!hhhi!ihhi!!ihhhhi!hhhihhhiHHhi!!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhiHHhi!!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhiHHhi!!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhHHhi!hhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hHHhi!hhihhhi!hhhi!ihhi!!!H");
    }

    @Test
    public void test7310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7310");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHHI!IHHIHHHI!IHHI!HHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHHI!IHHIHHHI!IHHI!HHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!" + "'", str2, "hHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHHI!IHHIHHHI!IHHI!HHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!");
    }

    @Test
    public void test7311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7311");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhhhhi!hhhhhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhhhi!hhhhhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!" + "'", str2, "Hhhhhi!hhhhhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
    }

    @Test
    public void test7312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7312");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!!" + "'", str1, "Hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!!");
    }

    @Test
    public void test7313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7313");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!hhhi!hhhi!Ihhi!!hhi!Ihhi!hhhi!Hhhi!hhhi!hhhi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhi!hhhi!hhhi!Ihhi!!hhi!Ihhi!hhhi!Hhhi!hhhi!hhhi!" + "'", str1, "hhhi!hhhi!hhhi!Ihhi!!hhi!Ihhi!hhhi!Hhhi!hhhi!hhhi!");
    }

    @Test
    public void test7314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7314");
        char[] charArray9 = new char[] {};
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("Hi!", charArray9);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray9);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("hhHHi!iHHi!!", charArray9);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("HhHHHI!IHHI!!hhHHHI!IHHI!!hhHHHI!IHHI!!ihHHHI!IHHI!!!hHHHI!IHHI!!hhHHHI!IHHI!!hhHHHI!IHHI!!hhHHHI!IHHI!!ihHHHI!IHHI!!!hHHHI!IHHI!!ihHHHI!IHHI!!hhHHHI!IHHI!!hhHHHI!IHHI!!ihHHHI!IHHI!!!hHHHI!IHHI!!!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hi!" + "'", str13, "Hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hi!" + "'", str15, "Hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HI!" + "'", str16, "HI!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hhHHi!iHHi!!" + "'", str17, "hhHHi!iHHi!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test7315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7315");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hHhhhi!hhhihHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!iHhhi!Hhhi!Ihhi!!!Hhhi!Hhhi!IhhiHhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!IhHHI!hHHI!iHHI!!!hHHI!hHHI!ihhHHHI!IHHI!HI!!H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test7316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7316");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HhhhI!IhhIhHHI!hHHI!iHHI!!!HI!!h", (int) (short) 10, "hHHHI!HHHIHHI!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HhhhI!IhhIhHHI!hHHI!iHHI!!!HI!!h" + "'", str4, "HhhhI!IhhIhHHI!hHHI!iHHI!!!HI!!h");
    }

    @Test
    public void test7317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7317");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hHHI!IHHI!hhi!Ihi!!HI!!", (-1), "hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHI!IHHI!hhi!Ihi!!HI!!" + "'", str4, "hHHI!IHHI!hhi!Ihi!!HI!!");
    }

    @Test
    public void test7318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7318");
        char[] charArray9 = new char[] {};
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("hi!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!", charArray9);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!ihhi!!", charArray9);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("hhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!Hhihi!!hi!hhi!ihi!!hi!!", charArray9);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("Hhhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhi!ihhi!!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhi!ihhi!!!hhhhi!ihhi!!ihhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhi!ihhi!!!hhhhi!ihhi!!!", charArray9);
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hhhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhi!ihhi!!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhi!ihhi!!!hhhhi!ihhi!!ihhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhi!ihhi!!!hhhhi!ihhi!!!" + "'", str18, "Hhhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhi!ihhi!!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhi!ihhi!!!hhhhi!ihhi!!ihhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhi!ihhi!!!hhhhi!ihhi!!!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test7319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7319");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("Hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!hhhi!ihhi!!hi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!hhhi!ihhi!!hi!!" + "'", str1, "Hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!hhhi!ihhi!!hi!!");
    }

    @Test
    public void test7320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7320");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHHHi!iHHhHHHI!HHHIhHHI!HHHI!IHHI!!i!!HHHHi!ihHHHI!HHHIhHHI!HHHI!IHHI!!HHi!!hHHHihHHHI!HHHIhHHI!HHHHhhhh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhhi!ihhhhhhi!hhhihhhi!hhhi!ihhi!!i!!hhhhi!ihhhhi!hhhihhhi!hhhi!ihhi!!hhi!!hhhhihhhhi!hhhihhhi!hhhhhhhh" + "'", str1, "Hhhhhi!ihhhhhhi!hhhihhhi!hhhi!ihhi!!i!!hhhhi!ihhhhi!hhhihhhi!hhhi!ihhi!!hhi!!hhhhihhhhi!hhhihhhi!hhhhhhhh");
    }

    @Test
    public void test7321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7321");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HHI!HHI!HHHHHHI!HHHI!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHI!HHI!HHHHHHI!HHHI!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!" + "'", str1, "hHI!HHI!HHHHHHI!HHHI!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!");
    }

    @Test
    public void test7322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7322");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhhhi!hhhi!hhhi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test7323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7323");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hHHHHI!IHHHhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!hhihi!!hi!hhi!ihi!!hi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHHHI!IHHHhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!hhihi!!hi!hhi!ihi!!hi!!" + "'", str1, "HHHHHI!IHHHhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!hhihi!!hi!hhi!ihi!!hi!!");
    }

    @Test
    public void test7324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7324");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HhHhhi!hHhhHhhhi!hhhiHHHHI!HHHIHHHi!iHHi!hi!!!IHHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhHhhi!hHhhHhhhi!hhhiHHHHI!HHHIHHHi!iHHi!hi!!!IHHI!!" + "'", str1, "hhHhhi!hHhhHhhhi!hhhiHHHHI!HHHIHHHi!iHHi!hi!!!IHHI!!");
    }

    @Test
    public void test7325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7325");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hhHHI!HHHI!HHHI!", (-1), "Hhhhhhhhhihh!hhhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhihh!hhihhhhhhhhihh!hhhhhhhhhhhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhHHI!HHHI!HHHI!" + "'", str4, "hhHHI!HHHI!HHHI!");
    }

    @Test
    public void test7326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7326");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!" + "'", str1, "HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!");
    }

    @Test
    public void test7327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7327");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("", (int) '#', "hHHHI!hHHIHHHHI!HHHIhHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!iHHHI!hHHI!iHHI!!!HHHI!hHHI!iHHI!!iHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!iHHHI!hHHI!iHHI!!!HHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!iHHHI!hHHI!iHHI!!!HHHI!hHHI!iHHI!!!HHHI!hHHI!iHHI!!h", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test7328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7328");
        char[] charArray13 = new char[] {};
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray13);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("", charArray13);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("hi!", charArray13);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray13);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray13);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray13);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray13);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalize("hhi!", charArray13);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalizeFully("HhHHi!iHHi!!", charArray13);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalize("HHHi!iHHi!hi!!", charArray13);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!", charArray13);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhhhhi!hhhihhhi!hhhi!ihhi!!hi!!ihhhhi!ihhi!!!hhhhi!ihhi!!hhhhhhhhhi!hhhihhhi!hhhi!ihhi!!i!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!hhhhi!ihhi!!!hhhhi!ihhi!!ihhhhi!ihhhhhhi!hhhihhhi!hhhi!ihhi!!i!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhihhhhi!hhhihhhi!hhhi!ihhi!!!ihhi!!!hhhhi!ihhi!!!", charArray13);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.capitalize("HHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!HHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!hhhhi!ihhihhhi!Hhhi!Ihhi!!!hi!!h", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] {});
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hi!" + "'", str17, "Hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Hi!" + "'", str19, "Hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hI!" + "'", str20, "hI!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hhi!" + "'", str21, "hhi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "HhHHi!iHHi!!" + "'", str22, "HhHHi!iHHi!!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "HHHi!iHHi!hi!!" + "'", str23, "HHHi!iHHi!hi!!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!" + "'", str24, "Hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hhhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhhhhi!hhhihhhi!hhhi!ihhi!!hi!!ihhhhi!ihhi!!!hhhhi!ihhi!!hhhhhhhhhi!hhhihhhi!hhhi!ihhi!!i!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!hhhhi!ihhi!!!hhhhi!ihhi!!ihhhhi!ihhhhhhi!hhhihhhi!hhhi!ihhi!!i!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhihhhhi!hhhihhhi!hhhi!ihhi!!!ihhi!!!hhhhi!ihhi!!!" + "'", str25, "hhhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhhhhi!hhhihhhi!hhhi!ihhi!!hi!!ihhhhi!ihhi!!!hhhhi!ihhi!!hhhhhhhhhi!hhhihhhi!hhhi!ihhi!!i!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!hhhhi!ihhi!!!hhhhi!ihhi!!ihhhhi!ihhhhhhi!hhhihhhi!hhhi!ihhi!!i!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhihhhhi!hhhihhhi!hhhi!ihhi!!!ihhi!!!hhhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "HHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!HHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!hhhhi!ihhihhhi!Hhhi!Ihhi!!!hi!!h" + "'", str26, "HHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!HHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!hhhhi!ihhihhhi!Hhhi!Ihhi!!!hi!!h");
    }

    @Test
    public void test7329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7329");
        char[] charArray12 = new char[] {};
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray12);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("", charArray12);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray12);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray12);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("", charArray12);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray12);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.uncapitalize("Hi!", charArray12);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray12);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.initials("Hhhi!ihhi!hhhi!ihhi!!hi!!", charArray12);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray12);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.uncapitalize("hHHHI!IHHIhhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!IhhiHHHHi!iHHi!hi!!H", charArray12);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.uncapitalize("hhhi!ihhi!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] {});
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hi!" + "'", str16, "Hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Hi!" + "'", str19, "Hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hHHHI!IHHIhhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!IhhiHHHHi!iHHi!hi!!H" + "'", str23, "hHHHI!IHHIhhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!IhhiHHHHi!iHHi!hi!!H");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hhhi!ihhi!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!" + "'", str24, "hhhi!ihhi!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!");
    }

    @Test
    public void test7330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7330");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("HHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!Hhhhi!hhhiHHhhi!!ihhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hHHHI!HHHIhhHHI!!IHHI!!" + "'", str1, "hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hHHHI!HHHIhhHHI!!IHHI!!");
    }

    @Test
    public void test7331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7331");
        char[] charArray11 = new char[] {};
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("hH", charArray11);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("hhi!", charArray11);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("hHhhhi!ihhi!hi!!h", charArray11);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("HHhhhi!ihhi!!HHhhhi!ihhi!!HHhhhi!ihHhhhi!hhhiHhhi!hhhi!ihhi!!hi!!IHhhhi!ihhi!!!Hhhhi!ihhi!!HHhhhHHHHI!HHHI!HHHI!iHHI!!HHI!iHHI!HHHI!HHHI!iHHI!!HHI!hHHI!iHHI!!HHI!!hhhi!hhhiHhhi!hhhi!ihhi!!i!ihhi!!HHhhhi!ihhi!!HHhhhi!ihhi!!IHhhhi!hhhiHhhi!hhhi!ihhi!!Hhhhi!ihhi!HHHI!HHHI!HHHI!iHHI!!HHI!iHHI!HHHI!HHHI!iHHI!!HHI!hHHI!iHHI!!HHI!!!!Hhhhi!ihhi!!IHhhhi!ihhHhhhi!hhhiHhhi!hhhi!ihhi!!i!!HHhhhi!ihhi!!HHhhhi!ihhi!!IHhhhiHhhhi!hhhiHhHHHI!HHHI!HHHI!iHHI!!HHI!iHHI!HHHI!HHHI!iHHI!!HHI!hHHI!iHHI!!HHI!!hi!hhhi!ihhi!!!ihhi!!!Hhhhi!ihhi!!!", charArray11);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("hHHHI!HHHIHHI!", charArray11);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.initials("Hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!ihhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!ihhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!ihhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!ihhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!h", charArray11);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhi!ihhi!hhhi!ihhi!!hi!!", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] {});
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hH" + "'", str16, "hH");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hhi!" + "'", str17, "hhi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hHhhhi!ihhi!hi!!h" + "'", str18, "hHhhhi!ihhi!hi!!h");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "HHhhhi!ihhi!!HHhhhi!ihhi!!HHhhhi!ihHhhhi!hhhiHhhi!hhhi!ihhi!!hi!!IHhhhi!ihhi!!!Hhhhi!ihhi!!HHhhhHHHHI!HHHI!HHHI!iHHI!!HHI!iHHI!HHHI!HHHI!iHHI!!HHI!hHHI!iHHI!!HHI!!hhhi!hhhiHhhi!hhhi!ihhi!!i!ihhi!!HHhhhi!ihhi!!HHhhhi!ihhi!!IHhhhi!hhhiHhhi!hhhi!ihhi!!Hhhhi!ihhi!HHHI!HHHI!HHHI!iHHI!!HHI!iHHI!HHHI!HHHI!iHHI!!HHI!hHHI!iHHI!!HHI!!!!Hhhhi!ihhi!!IHhhhi!ihhHhhhi!hhhiHhhi!hhhi!ihhi!!i!!HHhhhi!ihhi!!HHhhhi!ihhi!!IHhhhiHhhhi!hhhiHhHHHI!HHHI!HHHI!iHHI!!HHI!iHHI!HHHI!HHHI!iHHI!!HHI!hHHI!iHHI!!HHI!!hi!hhhi!ihhi!!!ihhi!!!Hhhhi!ihhi!!!" + "'", str19, "HHhhhi!ihhi!!HHhhhi!ihhi!!HHhhhi!ihHhhhi!hhhiHhhi!hhhi!ihhi!!hi!!IHhhhi!ihhi!!!Hhhhi!ihhi!!HHhhhHHHHI!HHHI!HHHI!iHHI!!HHI!iHHI!HHHI!HHHI!iHHI!!HHI!hHHI!iHHI!!HHI!!hhhi!hhhiHhhi!hhhi!ihhi!!i!ihhi!!HHhhhi!ihhi!!HHhhhi!ihhi!!IHhhhi!hhhiHhhi!hhhi!ihhi!!Hhhhi!ihhi!HHHI!HHHI!HHHI!iHHI!!HHI!iHHI!HHHI!HHHI!iHHI!!HHI!hHHI!iHHI!!HHI!!!!Hhhhi!ihhi!!IHhhhi!ihhHhhhi!hhhiHhhi!hhhi!ihhi!!i!!HHhhhi!ihhi!!HHhhhi!ihhi!!IHhhhiHhhhi!hhhiHhHHHI!HHHI!HHHI!iHHI!!HHI!iHHI!HHHI!HHHI!iHHI!!HHI!hHHI!iHHI!!HHI!!hi!hhhi!ihhi!!!ihhi!!!Hhhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hHHHI!HHHIHHI!" + "'", str20, "hHHHI!HHHIHHI!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hhhi!ihhi!hhhi!ihhi!!hi!!" + "'", str22, "hhhi!ihhi!hhhi!ihhi!!hi!!");
    }

    @Test
    public void test7332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7332");
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
        java.lang.String str25 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!ihhi!hhh", charArray13);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.capitalize("Hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhhhhi!ihhi!hhhi!ihhi!hi!!", charArray13);
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
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Hhhi!ihhi!hhh" + "'", str25, "Hhhi!ihhi!hhh");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhhhhi!ihhi!hhhi!ihhi!hi!!" + "'", str26, "Hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhhhhi!ihhi!hhhi!ihhi!hi!!");
    }

    @Test
    public void test7333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7333");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HhHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!IHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!!", (int) ' ', (int) (short) 100, "HhhhhhhhhiHhhhi!hhhihhhhi!hhhihhhi!ihhi!hi!!!ihhi!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HhHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!IHHHi!iHHi!!HHHHi!iHHi!!HHHHhhhhhhhhiHhhhi!hhhihhhhi!hhhihhhi!ihhi!hi!!!ihhi!!" + "'", str4, "HhHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!IHHHi!iHHi!!HHHHi!iHHi!!HHHHhhhhhhhhiHhhhi!hhhihhhhi!hhhihhhi!ihhi!hi!!!ihhi!!");
    }

    @Test
    public void test7334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7334");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test7335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7335");
        char[] charArray11 = new char[] { '#', '4', '4', '4' };
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("HHHi!iHHi!!", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("HhhhI!IhhI!HI!!", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("Hhhhhi!hhhi!ihhi!!", charArray11);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("hHhhi!hHhhi!hHhhi!iHhhi!!Hhhi!iHhhi!hHhhi!hHhhi!iHhhi!!Hhhi!hHhhi!hHhhi!hHhhi!iHhhi!!Hhhi!iHhhi!hHhhi!hHhhi!iHhhi!!Hhhi!!Hhhi!hHhhi!iHhhi!!Hhhi!!", charArray11);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("Hhhhi!hhhihhhhi!hhhihhhi!ihhi!hi!!!ihhi!!", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '#', '4', '4', '4' });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hi!" + "'", str12, "Hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hi!" + "'", str13, "Hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H" + "'", str14, "H");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hhhhI!IhhI!HI!!" + "'", str15, "hhhhI!IhhI!HI!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hhhhhi!hhhi!ihhi!!" + "'", str16, "Hhhhhi!hhhi!ihhi!!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "h" + "'", str17, "h");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hhhhi!hhhihhhhi!hhhihhhi!ihhi!hi!!!ihhi!!" + "'", str18, "Hhhhi!hhhihhhhi!hhhihhhi!ihhi!hi!!!ihhi!!");
    }

    @Test
    public void test7336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7336");
        char[] charArray10 = new char[] { '#', ' ', '4' };
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("HHHHI!HHHIHhi!", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("hHHHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!HHI!IHI!!HI!!", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("HHHHHI!IHHI!HI!!H", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhihhi!hhi!hhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '#', ' ', '4' });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hi!" + "'", str11, "Hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HHHHI!HHHIHhi!" + "'", str14, "HHHHI!HHHIHhi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "h" + "'", str15, "h");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hHHHHI!IHHI!HI!!H" + "'", str16, "hHHHHI!IHHI!HI!!H");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hhhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhihhi!hhi!hhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!" + "'", str17, "Hhhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhihhi!hhi!hhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
    }

    @Test
    public void test7337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7337");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHHHi!iHHi!HHHI!IHHI!!hi!!hHHHi!iHHi!HHHI!IHHI!!hi!!hHHHi!iHHi!HHHI!IHHI!!hi!!IHHHi!iHHi!HHHI!IHHI!!hi!!!HHHi!iHHi!HHHI!IHHI!!hi!!IHHHi!iHHi!HHHI!IHHI!!hi!!hHHHi!iHHi!HHHI!IHHI!!hi!!hHHHi!iHHi!HHHI!IHHI!!hi!!IHHHi!iHHi!HHHI!IHHI!!hi!!!HHHi!iHHi!HHHI!IHHI!!hi!!!", 100, (int) 'a', "HHHHHH");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHHHi!iHHi!HHHI!IHHI!!hi!!hHHHi!iHHi!HHHI!IHHI!!hi!!hHHHi!iHHi!HHHI!IHHI!!hi!!IHHHi!iHHi!HHHI!IHHI!!HHHHHH" + "'", str4, "HHHHi!iHHi!HHHI!IHHI!!hi!!hHHHi!iHHi!HHHI!IHHI!!hi!!hHHHi!iHHi!HHHI!IHHI!!hi!!IHHHi!iHHi!HHHI!IHHI!!HHHHHH");
    }

    @Test
    public void test7338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7338");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHHi!iHHi!HhH", (-1), (int) (byte) 0, "Hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhhhhi!ihhi!hi!!h");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhhhhi!ihhi!hi!!h" + "'", str4, "Hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhhhhi!ihhi!hi!!h");
    }

    @Test
    public void test7339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7339");
        char[] charArray7 = new char[] {};
        java.lang.String str8 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("H", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("hHhhhi!ihhi!hi!!h", charArray7);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!hhhi!hhhi!ihi!!hhhi!ihi!!hhhhhhi!ihhi!hhhi!ihhi!!hi!!hi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhihhhhi!ihhi!hhhi!ihhi!!hi!!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihhhhi!ihhi!hhhi!ihhi!!hi!!hi!!!hhi!ihi!!hhhi!ihi!!ihhi!ihihhhhi!ihhi!hhhi!ihhi!!hi!!!!!hhi!ihi!!!", charArray7);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("Hhi!hhi!hhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HI!" + "'", str11, "HI!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hHhhhi!ihhi!hi!!h" + "'", str12, "hHhhhi!ihhi!hi!!h");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hhhi!hhhi!hhhi!ihi!!hhhi!ihi!!hhhhhhi!ihhi!hhhi!ihhi!!hi!!hi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhihhhhi!ihhi!hhhi!ihhi!!hi!!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihhhhi!ihhi!hhhi!ihhi!!hi!!hi!!!hhi!ihi!!hhhi!ihi!!ihhi!ihihhhhi!ihhi!hhhi!ihhi!!hi!!!!!hhi!ihi!!!" + "'", str13, "Hhhi!hhhi!hhhi!ihi!!hhhi!ihi!!hhhhhhi!ihhi!hhhi!ihhi!!hi!!hi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhihhhhi!ihhi!hhhi!ihhi!!hi!!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihhhhi!ihhi!hhhi!ihhi!!hi!!hi!!!hhi!ihi!!hhhi!ihi!!ihhi!ihihhhhi!ihhi!hhhi!ihhi!!hi!!!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hhi!hhi!hhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!" + "'", str14, "Hhi!hhi!hhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
    }

    @Test
    public void test7340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7340");
        char[] charArray14 = new char[] { '#', '4', '4', '4' };
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray14);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray14);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("", charArray14);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray14);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray14);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.initials("Hhhi!ihhi!!", charArray14);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray14);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalizeFully("HHhhi!hhhi!hhhi!", charArray14);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!H", charArray14);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.uncapitalize("HHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!HHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!HhHHHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!hHIHI!!HI!HHI!IHI!!HI!!", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { '#', '4', '4', '4' });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hi!" + "'", str15, "Hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hi!" + "'", str16, "Hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H" + "'", str18, "H");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H" + "'", str19, "H");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H" + "'", str20, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Hi!" + "'", str21, "Hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Hhhhi!hhhi!hhhi!" + "'", str22, "Hhhhi!hhhi!hhhi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!H" + "'", str23, "hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!H");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!HHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!HhHHHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!hHIHI!!HI!HHI!IHI!!HI!!" + "'", str24, "hHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!HHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!HhHHHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!hHIHI!!HI!HHI!IHI!!HI!!");
    }

    @Test
    public void test7341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7341");
        char[] charArray10 = new char[] { 'a', '4', 'a' };
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("HHHi!iHHi!!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("hhhI!IhhI!HI!!", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("hhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!HhHHHI!HHHI!IHHI!!HhHHHI!HHHI!IHHI!!IhHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!HhHHHI!HHHI!IHHI!!IhHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!!", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!ihi!!hi!hhi!ihi!!hi!!hhhhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!ihi!!hi!hhi!ihi!!hi!!hhhhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!ihi!!hi!hhi!ihi!!hi!!hhhhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!ihi!!hi!hhi!ihi!!hi!!h", charArray10);
        java.lang.Class<?> wildcardClass18 = charArray10.getClass();
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { 'a', '4', 'a' });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hHHi!iHHi!!" + "'", str13, "hHHi!iHHi!!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hhhI!IhhI!HI!!" + "'", str15, "hhhI!IhhI!HI!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!HhHHHI!HHHI!IHHI!!HhHHHI!HHHI!IHHI!!IhHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!HhHHHI!HHHI!IHHI!!IhHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!!" + "'", str16, "hhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!HhHHHI!HHHI!IHHI!!HhHHHI!HHHI!IHHI!!IhHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!HhHHHI!HHHI!IHHI!!IhHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hhhhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!ihi!!hi!hhi!ihi!!hi!!hhhhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!ihi!!hi!hhi!ihi!!hi!!hhhhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!ihi!!hi!hhi!ihi!!hi!!hhhhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!ihi!!hi!hhi!ihi!!hi!!h" + "'", str17, "Hhhhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!ihi!!hi!hhi!ihi!!hi!!hhhhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!ihi!!hi!hhi!ihi!!hi!!hhhhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!ihi!!hi!hhi!ihi!!hi!!hhhhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!ihi!!hi!hhi!ihi!!hi!!h");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test7342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7342");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hHhhhi!ihhihhhhi!hhhi!ihhi!!", 10, "Hhhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hhhhhhhi!ihhHHHi!iHHi!hi!!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHhhhi!ihhHhhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hhhhhhhi!ihhHHHi!iHHi!hi!!ihhhhi!hhhHhhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hhhhhhhi!ihhHHHi!iHHi!hi!!i!ihhi!!" + "'", str4, "hHhhhi!ihhHhhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hhhhhhhi!ihhHHHi!iHHi!hi!!ihhhhi!hhhHhhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hhhhhhhi!ihhHHHi!iHHi!hi!!i!ihhi!!");
    }

    @Test
    public void test7343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7343");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!" + "'", str1, "Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!");
    }

    @Test
    public void test7344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7344");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhi!hhi!hhHHhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!hHhhhi!hhhi!ihhi!!hHhhhi!hhhi!ihhi!!iHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!hHhhhi!hhhi!ihhi!!iHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!hhi!hhhhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!!" + "'", str1, "Hhhi!hhi!hhhhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!!");
    }

    @Test
    public void test7345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7345");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("HhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HhhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!H!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHhhhi!ihhi!hi!!hhHHhhhi!ihhi!hi!!hiHHhhhi!ihhi!hi!!h!HHhhhi!ihhi!hi!!hhHHhhhi!ihhi!hi!!hhHHhhhi!ihhi!hi!!hiHHhhhi!ihhi!hi!!h!HHhhhi!ihhi!hi!!hhHHhhhi!ihhi!hi!!hhHHhhhi!ihhi!hi!!hiHHhhhi!ihhi!hi!!h!HHhhhi!ihhi!hi!!hiHHhhhi!ihhi!hi!!hhHHhhhi!ihhi!hi!!hiHHhhhi!ihhi!hi!!h!HHhhhi!ihhi!hi!!h!HHhhhi!ihhi!hi!!hhHHhhhi!ihhi!hi!!hiHHhhhi!ihhi!hi!!h!HHhhhi!ihhi!hi!!hiHHhhhi!ihhi!hi!!hhHHhhhi!ihhi!hi!!hiHHhhhi!ihhi!hi!!h!HHhhhi!ihhi!hi!!hhHHhhhi!ihhi!hi!!hhHHhhhi!ihhi!hi!!hiHHhhhi!ihhi!hi!!h!HHhhhi!ihhi!hi!!hhHHhhhi!ihhi!hi!!hhHHhhhi!ihhi!hi!!hiHHhhhi!ihhi!hi!!h!HHhhhi!ihhi!hi!!hHHHhhhi!ihhi!hi!!hhHHhhhi!ihhi!hi!!hiHHhhhi!ihhi!hi!!hhHHhhhi!ihhi!hi!!hiHHhhhi!ihhi!hi!!h!HHhhhi!ihhi!hi!!h!HHhhhi!ihhi!hi!!hhHHhhhi!ihhi!hi!!hiHHhhhi!ihhi!hi!!h!HHhhhi!ihhi!hi!!hhHHhhhi!ihhi!hi!!hhHHhhhi!ihhi!hi!!hiHHhhhi!ihhi!hi!!h!HHhhhi!ihhi!hi!!hiHHhhhi!ihhi!hi!!hhHHhhhi!ihhi!hi!!hiHHhhhi!ihhi!hi!!h!HHhhhi!ihhi!hi!!h!HHhhhi!ihhi!hi!!hhHHhhhi!ihhi!hi!!hiHHhhhi!ihhi!hi!!h!HHhhhi!ihhi!hi!!h!" + "'", str1, "hHHhhhi!ihhi!hi!!hhHHhhhi!ihhi!hi!!hiHHhhhi!ihhi!hi!!h!HHhhhi!ihhi!hi!!hhHHhhhi!ihhi!hi!!hhHHhhhi!ihhi!hi!!hiHHhhhi!ihhi!hi!!h!HHhhhi!ihhi!hi!!hhHHhhhi!ihhi!hi!!hhHHhhhi!ihhi!hi!!hiHHhhhi!ihhi!hi!!h!HHhhhi!ihhi!hi!!hiHHhhhi!ihhi!hi!!hhHHhhhi!ihhi!hi!!hiHHhhhi!ihhi!hi!!h!HHhhhi!ihhi!hi!!h!HHhhhi!ihhi!hi!!hhHHhhhi!ihhi!hi!!hiHHhhhi!ihhi!hi!!h!HHhhhi!ihhi!hi!!hiHHhhhi!ihhi!hi!!hhHHhhhi!ihhi!hi!!hiHHhhhi!ihhi!hi!!h!HHhhhi!ihhi!hi!!hhHHhhhi!ihhi!hi!!hhHHhhhi!ihhi!hi!!hiHHhhhi!ihhi!hi!!h!HHhhhi!ihhi!hi!!hhHHhhhi!ihhi!hi!!hhHHhhhi!ihhi!hi!!hiHHhhhi!ihhi!hi!!h!HHhhhi!ihhi!hi!!hHHHhhhi!ihhi!hi!!hhHHhhhi!ihhi!hi!!hiHHhhhi!ihhi!hi!!hhHHhhhi!ihhi!hi!!hiHHhhhi!ihhi!hi!!h!HHhhhi!ihhi!hi!!h!HHhhhi!ihhi!hi!!hhHHhhhi!ihhi!hi!!hiHHhhhi!ihhi!hi!!h!HHhhhi!ihhi!hi!!hhHHhhhi!ihhi!hi!!hhHHhhhi!ihhi!hi!!hiHHhhhi!ihhi!hi!!h!HHhhhi!ihhi!hi!!hiHHhhhi!ihhi!hi!!hhHHhhhi!ihhi!hi!!hiHHhhhi!ihhi!hi!!h!HHhhhi!ihhi!hi!!h!HHhhhi!ihhi!hi!!hhHHhhhi!ihhi!hi!!hiHHhhhi!ihhi!hi!!h!HHhhhi!ihhi!hi!!h!");
    }

    @Test
    public void test7346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7346");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("Hhhhi!ihhi!hhhhi!ihhi!hhhi!ihhi!!hi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHHI!IHHI!HHHHI!IHHI!HHHI!IHHI!!HI!!" + "'", str1, "hHHHI!IHHI!HHHHI!IHHI!HHHI!IHHI!!HI!!");
    }

    @Test
    public void test7347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7347");
        char[] charArray9 = new char[] { '#', ' ', '4' };
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!hhhi!hhhi!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("HhhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!HhHHHI!HHHI!IHHI!!HhHHHI!HHHI!IHHI!!IhHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!HhHHHI!HHHI!IHHI!!IhHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!!", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("hhHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHHhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!hHhhhi!hhhi!ihhi!!hHhhhi!hhhi!ihhi!!iHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!hHhhhi!hhhi!ihhi!!iHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '#', ' ', '4' });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hi!" + "'", str10, "Hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hhhi!hhhi!hhhi!" + "'", str13, "hhhi!hhhi!hhhi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HhhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!HhHHHI!HHHI!IHHI!!HhHHHI!HHHI!IHHI!!IhHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!HhHHHI!HHHI!IHHI!!IhHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!!" + "'", str14, "HhhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!HhHHHI!HHHI!IHHI!!HhHHHI!HHHI!IHHI!!IhHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!HhHHHI!HHHI!IHHI!!IhHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "h" + "'", str15, "h");
    }

    @Test
    public void test7348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7348");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHHHI!IHHI!HHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHHHHHI!HHHI!HHHI!IHHI!!HHI!IHHI!HHHI!HHHI!IHHI!!HHI!HHHI!IHHI!!HHI!!!HH!H", (int) (byte) 100, (int) (byte) -1, "hhhhi!ihhihhhi!hhhi!ihhi!!!hi!!h");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHHI!IHHI!HHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHHHHHI!HHHI!HHHI!IHHI!!HHI!IHHI!HHHI!HHHI!IHHI!!HHI!HHHI!IHHI!!HHI!!!HH!H" + "'", str4, "hHHHI!IHHI!HHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHHHHHI!HHHI!HHHI!IHHI!!HHI!IHHI!HHHI!HHHI!IHHI!!HHI!HHHI!IHHI!!HHI!!!HH!H");
    }

    @Test
    public void test7349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7349");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!iHhi!Ihi!!!Hhi!Ihi!!iHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!!Hhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!!Hhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!!Hhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!!Hhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!!Hhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!!", (int) (short) 10, (int) (byte) 100, "HHhI!hHhI!hHhI!hHhI!hHhI!iHhI!!HhI!hHhI!hHhI!hHhI!hHhI!hHhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!hHhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!hHhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!hHhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!iHhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!!HhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!iHhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!hHhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!hHhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!iHhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!!HhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!hHhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!iHhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!!HhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!iHhi!Ihi!!!Hhi!Ihi!!iHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhI!hHhI!hHhI!hHhI!hHhI!iHhI!!HhI!hHhI!hHhI!hHhI!hHhI!hHhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!hHhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!hHhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!hHhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!iHhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!!HhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!iHhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!hHhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!hHhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!iHhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!!HhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!hHhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!iHhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!!HhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!!" + "'", str4, "HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!iHhi!Ihi!!!Hhi!Ihi!!iHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhI!hHhI!hHhI!hHhI!hHhI!iHhI!!HhI!hHhI!hHhI!hHhI!hHhI!hHhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!hHhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!hHhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!hHhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!iHhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!!HhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!iHhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!hHhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!hHhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!iHhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!!HhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!hHhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!iHhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!!HhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!!");
    }

    @Test
    public void test7350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7350");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!IhhiHHHHi!iHHi!hi!!H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhihhhhi!ihhi!hi!!h" + "'", str1, "Hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhihhhhi!ihhi!hi!!h");
    }

    @Test
    public void test7351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7351");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HHhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HhHHHHI!IHHHHHI!IHHI!HHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HhHHHHI!IHHHHHI!IHHI!HHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!" + "'", str2, "HHhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HhHHHHI!IHHHHHI!IHHI!HHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!");
    }

    @Test
    public void test7352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7352");
        char[] charArray12 = new char[] { '#', '4', '4', '4' };
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray12);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray12);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("H", charArray12);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("hhhi!ihhi!!", charArray12);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("Hhhhi!ihhi!hi!!hhhhi!ihhi!hi!!hhhhi!ihhi!hi!!ihhhi!ihhi!hi!!!hhhi!ihhi!hi!!ihhhi!ihhi!hi!!hhhhi!ihhi!hi!!hhhhi!ihhi!hi!!ihhhi!ihhi!hi!!!hhhi!ihhi!hi!!hhhhi!ihhi!hi!!hhhhi!ihhi!hi!!hhhhi!ihhi!hi!!hhhhi!ihhi!hi!!ihhhi!ihhi!hi!!!hhhi!ihhi!hi!!ihhhi!ihhi!hi!!hhhhi!ihhi!hi!!hhhhi!ihhi!hi!!ihhhi!ihhi!hi!!!hhhi!ihhi!hi!!hhhhi!ihhi!hi!!ihhhi!ihhi!hi!!!hhhi!ihhi!hi!!!hhhi!ihhi!hi!!h", charArray12);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHHI!HHHIHhi!", charArray12);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.initials("HHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhi!ihhi!!!Hhhhi!hhhiHhhi!hhhi!ihhi!!HHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhi!ihhi!!!Hhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!HHhhhi!hhhiHhhi!hhhi!ihhi!!IHhhhi!hhhiHhhi!hhhi!ihhi!!!", charArray12);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("HhHhhhi!hhhhhi!hhhi!HhHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!!hHI!iHI!!ihHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!hHhhI!IhhI!!", charArray12);
        java.lang.Class<?> wildcardClass21 = charArray12.getClass();
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '#', '4', '4', '4' });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hi!" + "'", str13, "Hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hi!" + "'", str14, "Hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "h" + "'", str15, "h");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hhhi!ihhi!!" + "'", str16, "hhhi!ihhi!!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H" + "'", str17, "H");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hhhhi!hhhihhi!" + "'", str18, "Hhhhi!hhhihhi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H" + "'", str19, "H");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hhhhhhi!hhhhhi!hhhi!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhhi!ihhi!!" + "'", str20, "Hhhhhhi!hhhhhi!hhhi!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhhi!ihhi!!");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test7353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7353");
        char[] charArray11 = new char[] {};
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("", charArray11);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray11);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("HHHi!iHHi!!", charArray11);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.uncapitalize("HhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!!", charArray11);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray11);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalize("hHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!", charArray11);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.initials("", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] {});
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hi!" + "'", str15, "Hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hi!" + "'", str17, "Hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HHHi!iHHi!!" + "'", str18, "HHHi!iHHi!!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "HhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!!" + "'", str19, "HhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!" + "'", str21, "hHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test7354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7354");
        char[] charArray10 = new char[] { '#', '4', '4', '4' };
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("H", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("hhhi!ihhi!!", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHI!HHHI!Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("hhhi!hhhi!HhHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!!hHI!iHI!!ihHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!!hHI!iHI!!hhHI!iHI!!ihHI!iHI!!!hHI!iHI!!!", charArray10);
        java.lang.Class<?> wildcardClass17 = charArray10.getClass();
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '#', '4', '4', '4' });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hi!" + "'", str11, "Hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hi!" + "'", str12, "Hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "h" + "'", str13, "h");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hhhi!ihhi!!" + "'", str14, "hhhi!ihhi!!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!" + "'", str15, "Hhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hhhi!hhhi!HhHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!!hHI!iHI!!ihHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!!hHI!iHI!!hhHI!iHI!!ihHI!iHI!!!hHI!iHI!!!" + "'", str16, "Hhhi!hhhi!HhHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!!hHI!iHI!!ihHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!!hHI!iHI!!hhHI!iHI!!ihHI!iHI!!!hHI!iHI!!!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test7355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7355");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HhHHHHI!IHHHHHI!IHHI!HHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HhHHHHI!IHHHHHI!IHHI!HHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!" + "'", str2, "hHhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HhHHHHI!IHHHHHI!IHHI!HHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!");
    }

    @Test
    public void test7356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7356");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhhhhhhhhihhhhhi!ihhi!hi!!hhh!hhhhhhhhhhhhi!ihhi!hi!!hhhhhihh!hhhhhhhi!ihhi!hi!!hihhhhhhhhihhhhhi!ihhi!hi!!hhh!hh!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhhhhhhhihhhhhi!ihhi!hi!!hhh!hhhhhhhhhhhhi!ihhi!hi!!hhhhhihh!hhhhhhhi!ihhi!hi!!hihhhhhhhhihhhhhi!ihhi!hi!!hhh!hh!" + "'", str2, "Hhhhhhhhhihhhhhi!ihhi!hi!!hhh!hhhhhhhhhhhhi!ihhi!hi!!hhhhhihh!hhhhhhhi!ihhi!hi!!hihhhhhhhhihhhhhi!ihhi!hi!!hhh!hh!");
    }

    @Test
    public void test7357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7357");
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
        java.lang.String str30 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray16);
        java.lang.String str31 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHi!iHHi!hHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!", charArray16);
        java.lang.String str32 = org.apache.commons.lang.WordUtils.initials("HHHI!HHHI!Hhhhi!ihhi!!hhhhi!ihhi!!hhhhhi!hhhihHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!iHhhi!Hhhi!Ihhi!!!Hhhi!Hhhi!IhhiHhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!IhHHI!hHHI!iHHI!!!hHHI!hHHI!ihhHHHI!IHHI!HI!!H", charArray16);
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
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "h" + "'", str30, "h");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "HHHi!iHHi!hHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!" + "'", str31, "HHHi!iHHi!hHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
    }

    @Test
    public void test7358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7358");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("HHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!hHhhhi!ihhihhhI!IhHHHi!iHHi!HhH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!hHhhhi!ihhihhhI!IhHHHi!iHHi!HhH" + "'", str1, "HHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!hHhhhi!ihhihhhI!IhHHHi!iHHi!HhH");
    }

    @Test
    public void test7359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7359");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHhHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHHHHI!IHHI!HHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHHHHHI!HHHI!HHHI!IHHI!!HHI!IHHI!HHHI!HHHI!IHHI!!HHI!HHHI!IHHI!!HHI!!!HH!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHhHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHHHHI!IHHI!HHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHHHHHI!HHHI!HHHI!IHHI!!HHI!IHHI!HHHI!HHHI!IHHI!!HHI!HHHI!IHHI!!HHI!!!HH!" + "'", str1, "hHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHhHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHHHHI!IHHI!HHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHHHHHI!HHHI!HHHI!IHHI!!HHI!IHHI!HHHI!HHHI!IHHI!!HHI!HHHI!IHHI!!HHI!!!HH!");
    }

    @Test
    public void test7360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7360");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hhhhhi!hhhhhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!", (int) (byte) -1, "HHhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihhhhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!!hh!H", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhhhi!hhhhhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!" + "'", str4, "hhhhhi!hhhhhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
    }

    @Test
    public void test7361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7361");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HhhI!IhhI!HI!!", (int) (byte) 0, (int) '4', "HHHHHHHHHHHHHHHHIHHH!HHHHHHHHHHHHHHHIHHH!HHHIHHHHHHHHHHHIHHH!HHH!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HhhI!IhhI!HI!!" + "'", str4, "HhhI!IhhI!HI!!");
    }

    @Test
    public void test7362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7362");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hhhhi!ihhi!hi!!h", (int) (byte) 100, "HHHHHi!iHHHHHI!IHHI!HHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhhi!ihhi!hi!!h" + "'", str4, "hhhhi!ihhi!hi!!h");
    }

    @Test
    public void test7363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7363");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HHHHi!iHHi!hi!!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHHHi!iHHi!hi!!" + "'", str2, "HHHHi!iHHi!hi!!");
    }

    @Test
    public void test7364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7364");
        char[] charArray16 = new char[] { '#', '4', '4', '4' };
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray16);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray16);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("", charArray16);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray16);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray16);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.uncapitalize("Hhi!", charArray16);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.initials("HHHHI!HHHIHHHI!HHHI!IHHI!!", charArray16);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalize("HHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!hHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!hhhi!Hhhi!hhHI!", charArray16);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.uncapitalize("HhhH", charArray16);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.uncapitalize("hhhhi!HhhiHHHI!IHHI!hhhI!IhhI!HI!!", charArray16);
        java.lang.String str27 = org.apache.commons.lang.WordUtils.uncapitalize("hhI!HhI!HhI!HhI!ihI!!hI!ihI!HhI!HhI!ihI!!hI!hhI!ihI!!hI!!", charArray16);
        java.lang.String str28 = org.apache.commons.lang.WordUtils.capitalize("hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hHhI!", charArray16);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] { '#', '4', '4', '4' });
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hi!" + "'", str17, "Hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hi!" + "'", str18, "Hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H" + "'", str20, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "H" + "'", str21, "H");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hhi!" + "'", str22, "hhi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "H" + "'", str23, "H");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "HHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!hHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!hhhi!Hhhi!hhHI!" + "'", str24, "HHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!hHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!hhhi!Hhhi!hhHI!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hhhH" + "'", str25, "hhhH");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hhhhi!HhhiHHHI!IHHI!hhhI!IhhI!HI!!" + "'", str26, "hhhhi!HhhiHHHI!IHHI!hhhI!IhhI!HI!!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hhI!HhI!HhI!HhI!ihI!!hI!ihI!HhI!HhI!ihI!!hI!hhI!ihI!!hI!!" + "'", str27, "hhI!HhI!HhI!HhI!ihI!!hI!ihI!HhI!HhI!ihI!!hI!hhI!ihI!!hI!!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "HHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hHhI!" + "'", str28, "HHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hHhI!");
    }

    @Test
    public void test7365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7365");
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
        java.lang.String str21 = org.apache.commons.lang.WordUtils.initials("hi!", charArray11);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalizeFully("hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!ihHHI!IHHI!HI!!hhHHI!IHHIhhhi!Hhhi!HhI!hhHI!!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHIhhhi!Hhhi!HhI!hhHI!!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!ihHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!hhhi!Hhhi!HhI!hhHI!!hHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!!hHHI!IHHI!HI!!h", charArray11);
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!ihHHI!IHHI!HI!!hhHHI!IHHIhhhi!Hhhi!HhI!hhHI!!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHIhhhi!Hhhi!HhI!hhHI!!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!ihHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!hhhi!Hhhi!HhI!hhHI!!hHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!!hHHI!IHHI!HI!!h" + "'", str22, "hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!ihHHI!IHHI!HI!!hhHHI!IHHIhhhi!Hhhi!HhI!hhHI!!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHIhhhi!Hhhi!HhI!hhHI!!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!ihHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!hhhi!Hhhi!HhI!hhHI!!hHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!!hHHI!IHHI!HI!!h");
    }

    @Test
    public void test7366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7366");
        char[] charArray7 = new char[] {};
        java.lang.String str8 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("hi!", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray7);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("hHHHI!IHHIHHHi!iHHi!hHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!", charArray7);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("HHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hhHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!ihhi!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hi!" + "'", str11, "Hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hHHHI!IHHIHHHi!iHHi!hHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!" + "'", str13, "hHHHI!IHHIHHHi!iHHi!hHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test7367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7367");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("HHhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhHhi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHhHI!" + "'", str1, "hhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHhHI!");
    }

    @Test
    public void test7368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7368");
        char[] charArray8 = new char[] {};
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhhi!ihhi!hi!!h", charArray8);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("hhhhI!IhhI!HI!!h", charArray8);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("hhHHI!HHHI!Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!", charArray8);
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test7369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7369");
        char[] charArray8 = new char[] { '4', '4' };
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("HHi!", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("HH", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("hhI!", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Ihhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Ihhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Ihhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Ihhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("hhHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHHhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!hHhhhi!hhhi!ihhi!!hHhhhi!hhhi!ihhi!!iHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!hHhhhi!hhhi!ihhi!!iHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Hi!" + "'", str9, "Hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hhi!" + "'", str10, "Hhi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hH" + "'", str11, "hH");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "h" + "'", str12, "h");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!" + "'", str13, "Hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hhhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!!" + "'", str14, "Hhhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!!");
    }

    @Test
    public void test7370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7370");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hHhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HhHHHHI!IHHHHHI!IHHI!HHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!", (int) (short) 100, "HHHHI!HHHI!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HhHHHHI!IHHHHHI!IHHI!HHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!" + "'", str4, "hHhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HhHHHHI!IHHHHHI!IHHI!HHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!");
    }

    @Test
    public void test7371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7371");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!ihhi!hhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhhi!ihhi!hhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!ihhi!hhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhhi!ihhi!hhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!" + "'", str1, "Hhhi!ihhi!hhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhhi!ihhi!hhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
    }

    @Test
    public void test7372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7372");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhhi!ihhihhhi!ihhhhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!IhhiHHHHi!iHHi!hi!!H", 10, (int) (short) 10, "hhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhhi!hhhihhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi" + "'", str4, "Hhhhi!hhhihhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi");
    }

    @Test
    public void test7373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7373");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hhhhhi!hhhhhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test7374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7374");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HHHHHHHHHHHHH", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHHHHHHHHHHHH" + "'", str2, "HHHHHHHHHHHHH");
    }

    @Test
    public void test7375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7375");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("HHhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhHhi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhhhi!" + "'", str1, "Hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhhhi!");
    }

    @Test
    public void test7376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7376");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hhHHHI!IHHI!!HhHHHI!IHHI!!HhHHHI!IHHI!!HhHHHI!IHHI!!Hhhhi!ihhihhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhihhhhi!ihhi!hi!!hIhHHHI!IHHI!!!hHHHI!IHHI!!IhHHHI!IHHI!!HhHHHI!IHHI!!Hhhhi!ihhihhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhihhhhi!ihhi!hi!!hHhHHHI!IHHI!!IhHHHI!IHHI!!!hHHHI!IHHI!!HhHHHI!IHHI!!Hhhhi!ihhihhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhihhhhi!ihhi!hi!!hIhHHHI!IHHI!!!hHHHI!IHHI!!!hHHHI!IHHI!!H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test7377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7377");
        char[] charArray8 = new char[] {};
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("Hh", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("HHHi!iHHi!!", charArray8);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray8);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhhi!hhhihhi!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hi!" + "'", str11, "Hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hh" + "'", str13, "Hh");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hhhhi!hhhihhi!" + "'", str16, "hhhhi!hhhihhi!");
    }

    @Test
    public void test7378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7378");
        char[] charArray9 = new char[] {};
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("Hh", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("HHHi!iHHi!!", charArray9);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("HHhhhi!ihhi!hi!!h", charArray9);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("HHHHHHHHHHHHHHHHIHHH!HHHHHHHHHHHHHHHIHHH!HHHIHHHHHHHHHHHIHHH!HHH!", charArray9);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhhi!ihhhhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hi!" + "'", str12, "Hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hh" + "'", str14, "Hh");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HHhhhi!ihhi!hi!!h" + "'", str16, "HHhhhi!ihhi!hi!!h");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HHHHHHHHHHHHHHHHIHHH!HHHHHHHHHHHHHHHIHHH!HHHIHHHHHHHHHHHIHHH!HHH!" + "'", str17, "HHHHHHHHHHHHHHHHIHHH!HHHHHHHHHHHHHHHIHHH!HHHIHHHHHHHHHHHIHHH!HHH!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hhhhhi!ihhhhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!" + "'", str18, "Hhhhhi!ihhhhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!");
    }

    @Test
    public void test7379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7379");
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
        java.lang.String str25 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHHI!IHHI!HI!!H", charArray13);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.initials("Hhhhi!hhhihhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!h", charArray13);
        java.lang.Class<?> wildcardClass27 = charArray13.getClass();
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
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "HHHHI!IHHI!HI!!H" + "'", str25, "HHHHI!IHHI!HI!!H");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test7380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7380");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("HHHI!HHHI!Hhhhi!ihhi!!hhhhi!ihhi!!hhhhhi!hhhihHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!iHhhi!Hhhi!Ihhi!!!Hhhi!Hhhi!IhhiHhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!IhHHI!hHHI!iHHI!!!hHHI!hHHI!ihhHHHI!IHHI!HI!!H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhi!hhhi!hHHHI!IHHI!!HHHHI!IHHI!!HHHHHI!HHHIHhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!IhHHI!hHHI!iHHI!!!hHHI!hHHI!iHHIhHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!iHhhi!Hhhi!Ihhi!!!Hhhi!Hhhi!IHHhhhi!ihhi!hi!!h" + "'", str1, "hhhi!hhhi!hHHHI!IHHI!!HHHHI!IHHI!!HHHHHI!HHHIHhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!IhHHI!hHHI!iHHI!!!hHHI!hHHI!iHHIhHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!iHhhi!Hhhi!Ihhi!!!Hhhi!Hhhi!IHHhhhi!ihhi!hi!!h");
    }

    @Test
    public void test7381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7381");
        char[] charArray8 = new char[] {};
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhi!Hhhi!Ihhi!!", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("HHhhhi!ihhi!hi!!h", charArray8);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("hhhhI!IhhI!HI!!", charArray8);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hhhi!Hhhi!Ihhi!!" + "'", str13, "hhhi!Hhhi!Ihhi!!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HHhhhi!ihhi!hi!!h" + "'", str14, "HHhhhi!ihhi!hi!!h");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test7382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7382");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hHHHi!iHHiHhhi!Hhhi!Ihhi!!!hi!!H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HhhhI!IhhIhHHI!hHHI!iHHI!!!HI!!h" + "'", str1, "HhhhI!IhhIhHHI!hHHI!iHHI!!!HI!!h");
    }

    @Test
    public void test7383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7383");
        char[] charArray12 = new char[] { '#', '4', '4', '4' };
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray12);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray12);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("H", charArray12);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("hhhi!ihhi!!", charArray12);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("Hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!!", charArray12);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("HhHHHI!IHHI!!hhHHHI!IHHI!!hhHHHI!IHhHHHI!HHHIhHHI!HHHI!IHHI!!HI!!ihHHHI!IHHI!!!hHHHI!IHHI!!hhHHHhHHHHHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!hHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!hhhi!Hhhi!hhHI!", charArray12);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.initials("hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!iHHHI!hHHI!iHHI!!!HHHI!hHHI!iHHI!!iHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!HHHHI!hHHI!iHHI!!HHHHI!hHHI!iHHI!!HHHHI!hHHI!iHHI!!IHHHI!hHHI!iHHI!!!HHHI!hHHI!iHHI!!IHHHI!hHHI!iHHI!!HHHHI!hHHI!iHHI!!HHHHI!hHHI!iHHI!!IHHHI!hHHI!iHHI!!!HHHI!hHHI!iHHI!!HHHHI!hHHI!iHHI!!IHHHI!hHHI!iHHI!!!HHHI!hHHI!iHHI!!!HHHI!hHHI!iHHI!!H", charArray12);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.initials("Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hHHHHI!IHHIHHHi!iHHi!hHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '#', '4', '4', '4' });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hi!" + "'", str13, "Hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hi!" + "'", str14, "Hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "h" + "'", str15, "h");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hhhi!ihhi!!" + "'", str16, "hhhi!ihhi!!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!!" + "'", str17, "Hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HhHHHI!IHHI!!hhHHHI!IHHI!!hhHHHI!IHhHHHI!HHHIhHHI!HHHI!IHHI!!HI!!ihHHHI!IHHI!!!hHHHI!IHHI!!hhHHHhHHHHHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!hHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!hhhi!Hhhi!hhHI!" + "'", str18, "HhHHHI!IHHI!!hhHHHI!IHHI!!hhHHHI!IHhHHHI!HHHIhHHI!HHHI!IHHI!!HI!!ihHHHI!IHHI!!!hHHHI!IHHI!!hhHHHhHHHHHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!hHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!hhhi!Hhhi!hhHI!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "h" + "'", str19, "h");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H" + "'", str20, "H");
    }

    @Test
    public void test7384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7384");
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
        java.lang.String str31 = org.apache.commons.lang.WordUtils.initials("Hhh", charArray18);
        java.lang.String str32 = org.apache.commons.lang.WordUtils.capitalize("", charArray18);
        java.lang.String str33 = org.apache.commons.lang.WordUtils.uncapitalize("hHHI!IHHI!HHHHHHHHHIHH!HHHHHHHHHHHIHhhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!", charArray18);
        java.lang.String str34 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray18);
        java.lang.String str35 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!ihhi!HhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHHhhhhhhhhhhhhhhhihhh!hhhhhhhhhhhhhhhihhh!hhhihhhhhhhhhhhihhh!hhh!i!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!ihHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!!HHHi!iHHi!HhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHHhhhhhhhhhhhhhhhihhh!hhhhhhhhhhhhhhhihhh!hhhihhhhhhhhhhhihhh!hhh!i!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!ihHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!!hi!!", charArray18);
        java.lang.String str36 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHHHI!IHHhhhhi!ihhiHhhhhhhhhihh!hhhHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHiHhhi!Hhhi!Ihhi!!", charArray18);
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
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hHHI!IHHI!HHHHHHHHHIHH!HHHHHHHHHHHIHhhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!" + "'", str33, "hHHI!IHHI!HHHHHHHHHIHH!HHHHHHHHHHHIHhhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Hhhi!ihhi!HhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHHhhhhhhhhhhhhhhhihhh!hhhhhhhhhhhhhhhihhh!hhhihhhhhhhhhhhihhh!hhh!i!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!ihHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!!HHHi!iHHi!HhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHHhhhhhhhhhhhhhhhihhh!hhhhhhhhhhhhhhhihhh!hhhihhhhhhhhhhhihhh!hhh!i!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!ihHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!!hi!!" + "'", str35, "Hhhi!ihhi!HhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHHhhhhhhhhhhhhhhhihhh!hhhhhhhhhhhhhhhihhh!hhhihhhhhhhhhhhihhh!hhh!i!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!ihHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!!HHHi!iHHi!HhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHHhhhhhhhhhhhhhhhihhh!hhhhhhhhhhhhhhhihhh!hhhihhhhhhhhhhhihhh!hhh!i!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!ihHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!!hi!!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hHHHHI!IHHhhhhi!ihhiHhhhhhhhhihh!hhhHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHiHhhi!Hhhi!Ihhi!!" + "'", str36, "hHHHHI!IHHhhhhi!ihhiHhhhhhhhhihh!hhhHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHiHhhi!Hhhi!Ihhi!!");
    }

    @Test
    public void test7385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7385");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HHHHHI!HHHhHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHHHI!HHHhHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!" + "'", str1, "hHHHHI!HHHhHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!");
    }

    @Test
    public void test7386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7386");
        char[] charArray12 = new char[] {};
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray12);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("", charArray12);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("hi!", charArray12);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray12);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("", charArray12);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("HI!", charArray12);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.uncapitalize("hH", charArray12);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray12);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalize("HHi!", charArray12);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalize("Hhhhhi!ihhhhHHHI!IHHI!HI!!H", charArray12);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhHhh", charArray12);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalize("HHhhhi!ihhHHhhhhi!hhhihhhi!hhhi!ihhi!!hhhhHHhi!hi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhHHhi!hihhhi!hhhi!ihhi!!ihhhhi!hhhihhhHHhi!i!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhHHhi!i!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhHHhi!i!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhHHhi!hhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!HHhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihHHhi!hhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hHHhi!hhi!ihhi!!hhhhhi!hhhihhhi!hhhi!iHHhi!hhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!HHhi!!hhhhi!hhhihhhi!hhhi!ihhi!!ihhhhHHhi!i!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhHHhi!ihhhi!hhhi!ihhi!!ihhhhi!hhhihhhiHHhi!!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhiHHhi!!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhiHHhi!!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhHHhi!hhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hHHhi!hhihhhi!hhhi!ihhi!!!H", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] {});
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HI!" + "'", str16, "HI!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HI!" + "'", str18, "HI!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hH" + "'", str19, "hH");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "HHi!" + "'", str21, "HHi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Hhhhhi!ihhhhHHHI!IHHI!HI!!H" + "'", str22, "Hhhhhi!ihhhhHHHI!IHHI!HI!!H");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhHhh" + "'", str23, "Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhHhh");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "HHhhhi!ihhHHhhhhi!hhhihhhi!hhhi!ihhi!!hhhhHHhi!hi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhHHhi!hihhhi!hhhi!ihhi!!ihhhhi!hhhihhhHHhi!i!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhHHhi!i!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhHHhi!i!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhHHhi!hhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!HHhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihHHhi!hhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hHHhi!hhi!ihhi!!hhhhhi!hhhihhhi!hhhi!iHHhi!hhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!HHhi!!hhhhi!hhhihhhi!hhhi!ihhi!!ihhhhHHhi!i!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhHHhi!ihhhi!hhhi!ihhi!!ihhhhi!hhhihhhiHHhi!!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhiHHhi!!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhiHHhi!!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhHHhi!hhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hHHhi!hhihhhi!hhhi!ihhi!!!H" + "'", str24, "HHhhhi!ihhHHhhhhi!hhhihhhi!hhhi!ihhi!!hhhhHHhi!hi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhHHhi!hihhhi!hhhi!ihhi!!ihhhhi!hhhihhhHHhi!i!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhHHhi!i!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhHHhi!i!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhHHhi!hhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!HHhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihHHhi!hhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hHHhi!hhi!ihhi!!hhhhhi!hhhihhhi!hhhi!iHHhi!hhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!HHhi!!hhhhi!hhhihhhi!hhhi!ihhi!!ihhhhHHhi!i!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhHHhi!ihhhi!hhhi!ihhi!!ihhhhi!hhhihhhiHHhi!!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhiHHhi!!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhiHHhi!!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhHHhi!hhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hHHhi!hhihhhi!hhhi!ihhi!!!H");
    }

    @Test
    public void test7387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7387");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("HHHhhhi!ihhi!hi!!hhHHhhhi!ihhi!hi!!hhh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HHH" + "'", str1, "hhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HHH");
    }

    @Test
    public void test7388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7388");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HhHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!h", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HhHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!h" + "'", str2, "HhHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!h");
    }

    @Test
    public void test7389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7389");
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
        java.lang.String str25 = org.apache.commons.lang.WordUtils.uncapitalize("hHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!H", charArray13);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.capitalize("Hhhhi!ihhi!hhhhhhhi!ihhi!hhhhhhhi!ihhi!hhhhhhhi!ihhi!hhhhhhhi!ihhi!hhhihhhi!ihhi!hhh!hhhi!ihhi!hhhhhhhi!ihhi!hhhhhhhi!ihhi!hhhhhhhi!ihhi!hhhhhhhi!ihhi!hhhhhhhi!ihhi!hhhhhhhi!ihhi!hhhihhhi!ihhi!hhh!hhhi!ihhi!hhhhhhhi!ihhi!hhhhhhhi!ihhi!hhhhhhhi!ihhi!hhhihhhi!ihhi!hhh!hhhi!ihhi!hhhihhhi!ihhi!hhhhhhhi!ihhi!hhhhhhhi!ihhi!hhhihhhi!ihhi!hhh!hhhi!ihhi!hhh!", charArray13);
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
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!H" + "'", str25, "hHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!H");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Hhhhi!ihhi!hhhhhhhi!ihhi!hhhhhhhi!ihhi!hhhhhhhi!ihhi!hhhhhhhi!ihhi!hhhihhhi!ihhi!hhh!hhhi!ihhi!hhhhhhhi!ihhi!hhhhhhhi!ihhi!hhhhhhhi!ihhi!hhhhhhhi!ihhi!hhhhhhhi!ihhi!hhhhhhhi!ihhi!hhhihhhi!ihhi!hhh!hhhi!ihhi!hhhhhhhi!ihhi!hhhhhhhi!ihhi!hhhhhhhi!ihhi!hhhihhhi!ihhi!hhh!hhhi!ihhi!hhhihhhi!ihhi!hhhhhhhi!ihhi!hhhhhhhi!ihhi!hhhihhhi!ihhi!hhh!hhhi!ihhi!hhh!" + "'", str26, "Hhhhi!ihhi!hhhhhhhi!ihhi!hhhhhhhi!ihhi!hhhhhhhi!ihhi!hhhhhhhi!ihhi!hhhihhhi!ihhi!hhh!hhhi!ihhi!hhhhhhhi!ihhi!hhhhhhhi!ihhi!hhhhhhhi!ihhi!hhhhhhhi!ihhi!hhhhhhhi!ihhi!hhhhhhhi!ihhi!hhhihhhi!ihhi!hhh!hhhi!ihhi!hhhhhhhi!ihhi!hhhhhhhi!ihhi!hhhhhhhi!ihhi!hhhihhhi!ihhi!hhh!hhhi!ihhi!hhhihhhi!ihhi!hhhhhhhi!ihhi!hhhhhhhi!ihhi!hhhihhhi!ihhi!hhh!hhhi!ihhi!hhh!");
    }

    @Test
    public void test7390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7390");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("", 100, "hhhi!hhhi!hHhhI!IhhI!HI!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test7391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7391");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhhhhi!ihhhhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhhhi!ihhhhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!" + "'", str2, "Hhhhhi!ihhhhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!");
    }

    @Test
    public void test7392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7392");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HhHHHI!IHHI!!hhHHHI!IHHI!!hhHHHI!IHHI!!ihHHHI!IHHI!!!hHHHI!IHHI!!hhHHHI!IHHI!!hhHHHI!IHHI!!hhHHHIHhHHHhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhiHhi!hhi!hhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HhHHHI!IHHI!!hhHHHI!IHHI!!hhHHHI!IHHI!!ihHHHI!IHHI!!!hHHHI!IHHI!!hhHHHI!IHHI!!hhHHHI!IHHI!!hhHHHIHhHHHhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhiHhi!hhi!hhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!" + "'", str2, "HhHHHI!IHHI!!hhHHHI!IHHI!!hhHHHI!IHHI!!ihHHHI!IHHI!!!hHHHI!IHHI!!hhHHHI!IHHI!!hhHHHI!IHHI!!hhHHHIHhHHHhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhiHhi!hhi!hhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
    }

    @Test
    public void test7393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7393");
        char[] charArray11 = new char[] { '#', '4', '4', '4' };
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("HhhhI!IhhI!HI!!h", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("Hhi!", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhHhhi!hhhi!hhhi!", charArray11);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("hhHHi!iHHi!!", charArray11);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("hhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!ihHHI!HHi!!iHHHi!iHHi!!!hhHHHi!iHHi!!HhHHI!HHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHhHHI!i!!!hhhI!IhhI!hhhi!ihhi!!HI!!", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '#', '4', '4', '4' });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hi!" + "'", str12, "Hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hi!" + "'", str13, "Hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HhhhI!IhhI!HI!!h" + "'", str14, "HhhhI!IhhI!HI!!h");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hhi!" + "'", str15, "hhi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhHhhi!hhhi!hhhi!" + "'", str16, "hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhHhhi!hhhi!hhhi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HhHHi!iHHi!!" + "'", str17, "HhHHi!iHHi!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!ihHHI!HHi!!iHHHi!iHHi!!!hhHHHi!iHHi!!HhHHI!HHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHhHHI!i!!!hhhI!IhhI!hhhi!ihhi!!HI!!" + "'", str18, "HhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!ihHHI!HHi!!iHHHi!iHHi!!!hhHHHi!iHHi!!HhHHI!HHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHhHHI!i!!!hhhI!IhhI!hhhi!ihhi!!HI!!");
    }

    @Test
    public void test7394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7394");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhHHi!iHHi!HhhhI!IhhI!HI!!hhhHHihhHi!HhHi!HhHi!HhHi!HhHi!IhHi!!hHi!HhHi!HhHi!HhHi!HhHi!HhHi!HhHi!HhHi!HhHi!IhHi!!hHi!IhHi!HhHi!HhHi!IhHi!!hHi!!hHi!HhHi!HhHi!HhHi!HhHi!IhHi!!hHi!IhHi!HhHi!HhHi!IhHi!!hHi!!hHi!HhHi!HhHi!HhHi!HhHi!IhHi!!hHi!IhHi!HhHi!HhHi!IhHi!!hHi!!hHi!HhHi!HhHi!HhHi!HhHi!IhHi!!hHi!IhHi!HhHi!HhHi!IhHi!!hHi!!hHi!IhHi!HhHi!HhHi!HhHi!IhHi!!hHi!IhHi!HhHi!HhHi!IhHi!!hHi!!hHi!!hHi!HhHi!HhHi!HhHi!IhHi!!hHi!IhHi!HhHi!HhHi!IhHi!!hHi!!hHi!IhHi!HhHi!HhHi!HhHi!IhHi!!hHi!IhHi!HhHi!HhHi!IhHi!!hHi!!hHi!HhHi!HhHi!HhHi!HhHi!IhHi!!hHi!IhHi!HhHi!HhHi!IhHi!!hHi!!hHi!HhHi!HhHi!HhHi!HhHi!IhHi!!hHi!IhHi!HhHi!HhHi!IhHi!!hHi!!hHi!IhHi!HhHi!HhHi!HhHi!IhHi!!hHi!IhHi!HhHi!HhHi!IhHi!!hHi!!hHi!!hHi!HhHi!HhHi!HhHi!IhHi!!hHi!IhHi!HhHi!HhHi!IhHi!!hHi!!hHi!HhHi!HhHi!HhHi!HhHi!IhHi!!hHi!IhHi!HhHi!HhHi!IhHi!!hHi!!hHi!IhHi!HhHi!HhHi!HhHi!IhHi!!hHi!IhHi!HhHi!HhHi!IhHi!!hHi!!hHi!!hHi!HhHi!HhHi!HhHi!IhHi!!hHi!IhHi!HhHi!HhHi!IhHi!!hHi!!hHi!!", (int) (short) 10, 0, "Hhhi!hhhi!hhhi!hhhi!hhhi!ihi!!hhhi!hhhi!ihhi!hhhhhi!ihhi!hi!!h");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhHHi!iHHiHhhi!hhhi!hhhi!hhhi!hhhi!ihi!!hhhi!hhhi!ihhi!hhhhhi!ihhi!hi!!h" + "'", str4, "hhHHi!iHHiHhhi!hhhi!hhhi!hhhi!hhhi!ihi!!hhhi!hhhi!ihhi!hhhhhi!ihhi!hi!!h");
    }

    @Test
    public void test7395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7395");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!hhhhi!Hhhi!Ihhi!!hhhhi!Hhhi!Ihhi!!hhhhi!Hhhi!Ihhi!!ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!ihhhi!Hhhi!Ihhi!!hhhhi!Hhhi!Ihhi!!hhhhi!Hhhi!Ihhi!!ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!hhhhi!Hhhi!Ihhi!!ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!h" + "'", str1, "Hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!h");
    }

    @Test
    public void test7396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7396");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("Hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhhi!ihhi!hhhi!ihhi!!hi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhhi!ihhi!hhhi!ihhi!!hi!!" + "'", str1, "Hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhhi!ihhi!hhhi!ihhi!!hi!!");
    }

    @Test
    public void test7397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7397");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HhHHHI!IHHI!!HhHHHI!IHHI!!HhHHHI!IHHI!!HhHHHI!IHHI!!IhHHHI!IHHI!!!hHHHI!IHHI!!IhHHHI!IHHI!!HhHHHI!IHHI!!HhHHHI!IHHI!!IhHHHI!IHHI!!!hHHHI!IHHI!!HhHHHI!IHHI!!IhHHHI!IHHI!!!hHHHI!IHHI!!!hHHHI!IHHI!!H", (int) '#', (int) (short) -1, "HhhhhhhhhihhhhI!IhhI!HI!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HhHHHI!IHHI!!HhHHHI!IHHI!!HhHHHI!IHHI!!HhHHHI!IHHI!!IhHHHI!IHHI!!!hHHHI!IHHI!!IhHHHI!IHHI!!HhHHHI!IHHI!!HhHHHI!IHHI!!IhHHHI!IHHI!!!hHHHI!IHHI!!HhHHHI!IHHI!!IhHHHI!IHHI!!!hHHHI!IHHI!!!hHHHI!IHHI!!H" + "'", str4, "HhHHHI!IHHI!!HhHHHI!IHHI!!HhHHHI!IHHI!!HhHHHI!IHHI!!IhHHHI!IHHI!!!hHHHI!IHHI!!IhHHHI!IHHI!!HhHHHI!IHHI!!HhHHHI!IHHI!!IhHHHI!IHHI!!!hHHHI!IHHI!!HhHHHI!IHHI!!IhHHHI!IHHI!!!hHHHI!IHHI!!!hHHHI!IHHI!!H");
    }

    @Test
    public void test7398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7398");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!iHHHI!hHHI!iHHI!!!HHHI!hHHI!iHHI!!iHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!HHHHI!hHHI!iHHI!!HHHHI!hHHI!iHHI!!HHHHI!hHHI!iHHI!!IHHHI!hHHI!iHHI!!!HHHI!hHHI!iHHI!!IHHHI!hHHI!iHHI!!HHHHI!hHHI!iHHI!!HHHHI!hHHI!iHHI!!IHHHI!hHHI!iHHI!!!HHHI!hHHI!iHHI!!HHHHI!hHHI!iHHI!!IHHHI!hHHI!iHHI!!!HHHI!hHHI!iHHI!!!HHHI!hHHI!iHHI!!H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!iHHHI!hHHI!iHHI!!!HHHI!hHHI!iHHI!!iHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!HHHHI!hHHI!iHHI!!HHHHI!hHHI!iHHI!!HHHHI!hHHI!iHHI!!IHHHI!hHHI!iHHI!!!HHHI!hHHI!iHHI!!IHHHI!hHHI!iHHI!!HHHHI!hHHI!iHHI!!HHHHI!hHHI!iHHI!!IHHHI!hHHI!iHHI!!!HHHI!hHHI!iHHI!!HHHHI!hHHI!iHHI!!IHHHI!hHHI!iHHI!!!HHHI!hHHI!iHHI!!!HHHI!hHHI!iHHI!!H" + "'", str1, "HHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!iHHHI!hHHI!iHHI!!!HHHI!hHHI!iHHI!!iHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!HHHHI!hHHI!iHHI!!HHHHI!hHHI!iHHI!!HHHHI!hHHI!iHHI!!IHHHI!hHHI!iHHI!!!HHHI!hHHI!iHHI!!IHHHI!hHHI!iHHI!!HHHHI!hHHI!iHHI!!HHHHI!hHHI!iHHI!!IHHHI!hHHI!iHHI!!!HHHI!hHHI!iHHI!!HHHHI!hHHI!iHHI!!IHHHI!hHHI!iHHI!!!HHHI!hHHI!iHHI!!!HHHI!hHHI!iHHI!!H");
    }

    @Test
    public void test7399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7399");
        char[] charArray7 = new char[] {};
        java.lang.String str8 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("hhI!", charArray7);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("Hhhhi!ihhi!hi!!", charArray7);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("hi!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hhhhi!ihhi!hi!!" + "'", str13, "Hhhhi!ihhi!hi!!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test7400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7400");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("Hhhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!IhhHhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!ihHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!iHHHI!hHHI!iHHhHhhI!IhhI!!HHhhI!IhhI!!HHhhI!IhhI!!HHhhI!IhhI!!IHhhI!IhhI!!!HhhI!IhhI!!HHhhI!IhhI!!HHhhI!IhhI!!HHhhI!IhhI!!IHhhI!IhhI!!!HhhI!IhhI!!IHhhI!IhhI!!HHhhI!IhhI!!HHhhI!IhhI!!IHhhI!IhhI!!!HhhI!IhhI!!!" + "'", str1, "hHHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!iHHHI!hHHI!iHHhHhhI!IhhI!!HHhhI!IhhI!!HHhhI!IhhI!!HHhhI!IhhI!!IHhhI!IhhI!!!HhhI!IhhI!!HHhhI!IhhI!!HHhhI!IhhI!!HHhhI!IhhI!!IHhhI!IhhI!!!HhhI!IhhI!!IHhhI!IhhI!!HHhhI!IhhI!!HHhhI!IhhI!!IHhhI!IhhI!!!HhhI!IhhI!!!");
    }

    @Test
    public void test7401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7401");
        char[] charArray13 = new char[] {};
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray13);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("", charArray13);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray13);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray13);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray13);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("hh", charArray13);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("hI!", charArray13);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.initials("Hhhi!ihhi!hi!!", charArray13);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!hhhi!hhhi!", charArray13);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalize("", charArray13);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.initials("Hhhh", charArray13);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.initials("", charArray13);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.uncapitalize("hHHI!IHHI!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!!HHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!!HHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!!HHHI!IHHI!HHI!IHI!!HI!!!HHHHI!IHHIHHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!!HHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!!HHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!!HHHI!IHHI!HHI!IHI!!HI!!!!HI!!H", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] {});
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hh" + "'", str19, "hh");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hI!" + "'", str20, "hI!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Hhhi!hhhi!hhhi!" + "'", str22, "Hhhi!hhhi!hhhi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hHHI!IHHI!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!!HHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!!HHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!!HHHI!IHHI!HHI!IHI!!HI!!!HHHHI!IHHIHHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!!HHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!!HHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!!HHHI!IHHI!HHI!IHI!!HI!!!!HI!!H" + "'", str26, "hHHI!IHHI!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!!HHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!!HHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!!HHHI!IHHI!HHI!IHI!!HI!!!HHHHI!IHHIHHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!!HHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!!HHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!!HHHI!IHHI!HHI!IHI!!HI!!!!HI!!H");
    }

    @Test
    public void test7402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7402");
        char[] charArray14 = new char[] { '#', '4', '4', '4' };
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray14);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray14);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("", charArray14);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray14);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray14);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.uncapitalize("Hhi!", charArray14);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalize("Hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!", charArray14);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.uncapitalize("HhhhI!IhhI!HI!!", charArray14);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalizeFully("HHhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!", charArray14);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.initials("hhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HihHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!H!hHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HHhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HihHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!H!hHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HIhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HihHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!H!hHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!H!", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { '#', '4', '4', '4' });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hi!" + "'", str15, "Hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hi!" + "'", str16, "Hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H" + "'", str18, "H");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H" + "'", str19, "H");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hhi!" + "'", str20, "hhi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!" + "'", str21, "Hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hhhhI!IhhI!HI!!" + "'", str22, "hhhhI!IhhI!HI!!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!" + "'", str23, "Hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "h" + "'", str24, "h");
    }

    @Test
    public void test7403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7403");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhhi!ihhi!!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhi!ihhi!!" + "'", str2, "Hhhi!ihhi!!");
    }

    @Test
    public void test7404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7404");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("HHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!HhHHi!iHHi!HHHI!IHHI!!hi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhhi!ihhi!hhhi!ihhi!!hi!!" + "'", str1, "Hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhhi!ihhi!hhhi!ihhi!!hi!!");
    }

    @Test
    public void test7405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7405");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhI!IhhI!hHI!HHI!HHHHHHI!HHHI!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHHHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHHI!HHHI!HHI!HHHI!hHHHi!iHHihHI!HHI!HHHHHHI!HHHI!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHHHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHHI!HHHI!HHI!HHHI!!hi!!H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!ihhi!hhi!hhi!hhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhhhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhhi!hhhi!hhi!hhhi!hhhhi!ihhihhi!hhi!hhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhhhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhhi!hhhi!hhi!hhhi!!hi!!h" + "'", str1, "Hhhi!ihhi!hhi!hhi!hhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhhhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhhi!hhhi!hhi!hhhi!hhhhi!ihhihhi!hhi!hhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhhhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhhi!hhhi!hhi!hhhi!!hi!!h");
    }

    @Test
    public void test7406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7406");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hhhI!IhhI!hhhi!ihhi!!HI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhI!IhhI!hhhi!ihhi!!HI!!" + "'", str1, "hhhI!IhhI!hhhi!ihhi!!HI!!");
    }

    @Test
    public void test7407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7407");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHHHI!HHHIHhi!", (int) (short) -1, (int) (short) 1, "hHHI!IHHI!hHh");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhHHI!IHHI!hHh" + "'", str4, "hhHHI!IHHI!hHh");
    }

    @Test
    public void test7408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7408");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhHHHI!IHHI!!hhHHHI!IHHI!!hhHHHI!IHHI!!ihHHHI!IHHI!!!hHHHI!IHHI!!hhHHHI!IHHI!!hhHHHI!IHHI!!hhHHHIHhH!IHHI!!ihHHHI!IHHI!!!hHHHI!IHHI!!ihHHHI!IHHI!!hhHHHI!IHHI!!hhHHHI!IHHI!!ihHHHI!IHHI!!!hHHHI!IHHI!HhH!!", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhHHHI!IHHI!!hhHHHI!IHHI!!hhHHHI!IHHI!!ihHHHI!IHHI!!!hHHHI!IHHI!!hhHHHI!IHHI!!hhHHHI!IHHI!!hhHHHIHhH!IHHI!!ihHHHI!IHHI!!!hHHHI!IHHI!!ihHHHI!IHHI!!hhHHHI!IHHI!!hhHHHI!IHHI!!ihHHHI!IHHI!!!hHHHI!IHHI!HhH!!" + "'", str2, "hhHHHI!IHHI!!hhHHHI!IHHI!!hhHHHI!IHHI!!ihHHHI!IHHI!!!hHHHI!IHHI!!hhHHHI!IHHI!!hhHHHI!IHHI!!hhHHHIHhH!IHHI!!ihHHHI!IHHI!!!hHHHI!IHHI!!ihHHHI!IHHI!!hhHHHI!IHHI!!hhHHHI!IHHI!!ihHHHI!IHHI!!!hHHHI!IHHI!HhH!!");
    }

    @Test
    public void test7409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7409");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhi!Hhhi!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!!", (int) (short) 0, 100, "hhhi!hhhi!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhhi!ihhi!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhi!Hhhi!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!HHHHIhhhi!hhhi!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhhi!ihhi!!" + "'", str4, "Hhhi!Hhhi!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!HHHHIhhhi!hhhi!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhhi!ihhi!!");
    }

    @Test
    public void test7410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7410");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhi!ihhi!HHHi!iHHi!hi!!", (int) (byte) -1, (int) (byte) 1, "HHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!iHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!!HHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!iHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!!HHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!iHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!iHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!!HHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!iHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!!HHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!iHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!!HHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!iHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!iHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!!HHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!!" + "'", str4, "HHHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!iHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!!HHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!iHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!!HHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!iHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!iHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!!HHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!!");
    }

    @Test
    public void test7411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7411");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!hHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!hHhhhi!ihhi!hi!!hHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!hHhhhi!ihhi!hi!!hHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!IHhhhi!ihhi!hi!!hHhhhi!ihhi!hi!!hHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!hHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!hHhhhi!ihhi!hi!!hHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!hHhhhi!ihhi!hi!!hHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!IHhhhi!ihhi!hi!!hHhhhi!ihhi!hi!!hHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!!" + "'", str2, "hHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!hHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!hHhhhi!ihhi!hi!!hHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!hHhhhi!ihhi!hi!!hHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!IHhhhi!ihhi!hi!!hHhhhi!ihhi!hi!!hHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!!");
    }

    @Test
    public void test7412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7412");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("", 1, "", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test7413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7413");
        char[] charArray10 = new char[] { '#', '4', '4', '4' };
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("Hhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!hhihi!!hi!hhi!ihi!!hi!!", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!hhhi!hHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("Hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '#', '4', '4', '4' });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hi!" + "'", str11, "Hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hi!" + "'", str12, "Hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!hhihi!!hi!hhi!ihi!!hi!!" + "'", str14, "hhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!hhihi!!hi!hhi!ihi!!hi!!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!" + "'", str15, "Hhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!" + "'", str16, "Hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!");
    }

    @Test
    public void test7414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7414");
        char[] charArray9 = new char[] {};
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("hH", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("HI!", charArray9);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("HhHHHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!HHI!IHI!!HI!!", charArray9);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("hhhI!IhhI!HI!!", charArray9);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("hhhi!ihhi!hhh", charArray9);
        java.lang.Class<?> wildcardClass19 = charArray9.getClass();
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hH" + "'", str14, "hH");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HI!" + "'", str15, "HI!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HhHHHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!HHI!IHI!!HI!!" + "'", str16, "HhHHHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!HHI!IHI!!HI!!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hhhi!ihhi!hhh" + "'", str18, "hhhi!ihhi!hhh");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test7415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7415");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hhHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHHhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!hHhhhi!hhhi!ihhi!!hHhhhi!hhhi!ihhi!!iHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!hHhhhi!hhhi!ihhi!!iHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHHhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!hHhhhi!hhhi!ihhi!!hHhhhi!hhhi!ihhi!!iHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!hHhhhi!hhhi!ihhi!!iHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!!" + "'", str1, "hhHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHHhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!hHhhhi!hhhi!ihhi!!hHhhhi!hhhi!ihhi!!iHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!hHhhhi!hhhi!ihhi!!iHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!!");
    }

    @Test
    public void test7416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7416");
        char[] charArray7 = new char[] {};
        java.lang.String str8 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("hi!", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray7);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("HHHI!HHHI!HHHI!", charArray7);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("hhhhhi!ihhHHHHI!IHHIhHHHHHHHHIHH!HHHhhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhIhHHI!hHHI!iHHI!!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HI!" + "'", str11, "HI!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HI!" + "'", str12, "HI!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hhhhhi!ihhHHHHI!IHHIhHHHHHHHHIHH!HHHhhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhIhHHI!hHHI!iHHI!!" + "'", str14, "hhhhhi!ihhHHHHI!IHHIhHHHHHHHHIHH!HHHhhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhIhHHI!hHHI!iHHI!!");
    }

    @Test
    public void test7417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7417");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHHH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhh" + "'", str1, "Hhhhh");
    }

    @Test
    public void test7418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7418");
        char[] charArray13 = new char[] { '#', '4', '4', '4' };
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray13);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray13);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("H", charArray13);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("hhhi!ihhi!!", charArray13);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("hhhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!ihi!!hi!hhi!ihi!!hi!!", charArray13);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!hhhi!hhhi!Ihhi!!hhi!Ihhi!hhhi!hhhi!Ihhi!!hhi!Hhhi!Ihhi!!hhi!!", charArray13);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("HhHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!ihHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!ihHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!!hHHI!IHHI!HI!!h", charArray13);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.uncapitalize("HHhhhi!ihhi!hi!!h", charArray13);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!ihhi!hhhhi!ihhi!hhhi!ihhi!!hi!!", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '#', '4', '4', '4' });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hi!" + "'", str14, "Hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hi!" + "'", str15, "Hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "h" + "'", str16, "h");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hhhi!ihhi!!" + "'", str17, "hhhi!ihhi!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "h" + "'", str18, "h");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Hhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!" + "'", str19, "Hhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HhHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!ihHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!ihHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!!hHHI!IHHI!HI!!h" + "'", str20, "HhHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!ihHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!ihHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!!hHHI!IHHI!HI!!h");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hHhhhi!ihhi!hi!!h" + "'", str21, "hHhhhi!ihhi!hi!!h");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hhhi!ihhi!hhhhi!ihhi!hhhi!ihhi!!hi!!" + "'", str22, "hhhi!ihhi!hhhhi!ihhi!hhhi!ihhi!!hi!!");
    }

    @Test
    public void test7419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7419");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhi!ihhihhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!hhhhi!Hhhi!Ihhi!!hhhhi!Hhhi!Ihhi!!hhhhi!Hhhi!Ihhi!!ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!ihhhi!Hhhi!Ihhi!!hhhhi!Hhhi!Ihhi!!hhhhi!Hhhi!Ihhi!!ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!hhhhi!Hhhi!Ihhi!!ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!h!hhhi!ihhihhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!hhhhi!Hhhi!Ihhi!!hhhhi!Hhhi!Ihhi!!hhhhi!Hhhi!Ihhi!!ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!ihhhi!Hhhi!Ihhi!!hhhhi!Hhhi!Ihhi!!hhhhi!Hhhi!Ihhi!!ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!hhhhi!Hhhi!Ihhi!!ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!h!!hi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!ihhihhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!h!hhhi!ihhihhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!h!!hi!!" + "'", str1, "Hhhhi!ihhihhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!h!hhhi!ihhihhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!h!!hi!!");
    }

    @Test
    public void test7420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7420");
        char[] charArray8 = new char[] { '#', ' ', '4' };
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("hH", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("HHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!h", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("hhhhi!hhhihhhhi!hhhi!ihhi!!hhhhi!hhHhHHHI!IHHI!!hhHHHI!IHHI!!hhHHHI!IHHI!!ihHHHI!IHHI!!!hHHHI!IHHI!!hHHI!IHHI!HHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '#', ' ', '4' });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Hi!" + "'", str9, "Hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hi!" + "'", str10, "Hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HH" + "'", str11, "HH");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!h" + "'", str12, "HHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!h");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hhhhi!hhhihhhhi!hhhi!ihhi!!hhhhi!hhHhHHHI!IHHI!!hhHHHI!IHHI!!hhHHHI!IHHI!!ihHHHI!IHHI!!!hHHHI!IHHI!!hHHI!IHHI!HHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!" + "'", str13, "Hhhhi!hhhihhhhi!hhhi!ihhi!!hhhhi!hhHhHHHI!IHHI!!hhHHHI!IHHI!!hhHHHI!IHHI!!ihHHHI!IHHI!!!hHHHI!IHHI!!hHHI!IHHI!HHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!");
    }

    @Test
    public void test7421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7421");
        char[] charArray8 = new char[] {};
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("hi!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray8);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHHi!iHHihhHHHI!IHHI!!hhHHHI!IHHI!!hhHHHI!IHhHHHI!HHHIhHHI!HHHI!IHHI!!HI!!ihHHHI!IHHI!!!hHHHI!IHHI!!hhHHHhHHHI!HHHIhHHI!HHHI!IHHI!!I!IHHI!!hhHHHI!IHHI!!hhHHHI!IHHI!!ihHHHI!HHHIhHHI!HHHI!IHHI!!hHHHI!IHHI!!!hHHHI!IHHI!!ihHHHI!IHHhHHHI!HHHIhHHI!HHHI!IHHI!!I!!hhHHHI!IHHI!!hhHHHI!IHHI!!ihHHHIhHHHI!HHHIhHHI!HHHI!IHHI!!!IHHI!!!hHHHI!IHHI!!!", charArray8);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHHhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hi!" + "'", str12, "Hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hHHHi!iHHihhHHHI!IHHI!!hhHHHI!IHHI!!hhHHHI!IHhHHHI!HHHIhHHI!HHHI!IHHI!!HI!!ihHHHI!IHHI!!!hHHHI!IHHI!!hhHHHhHHHI!HHHIhHHI!HHHI!IHHI!!I!IHHI!!hhHHHI!IHHI!!hhHHHI!IHHI!!ihHHHI!HHHIhHHI!HHHI!IHHI!!hHHHI!IHHI!!!hHHHI!IHHI!!ihHHHI!IHHhHHHI!HHHIhHHI!HHHI!IHHI!!I!!hhHHHI!IHHI!!hhHHHI!IHHI!!ihHHHIhHHHI!HHHIhHHI!HHHI!IHHI!!!IHHI!!!hHHHI!IHHI!!!" + "'", str15, "hHHHi!iHHihhHHHI!IHHI!!hhHHHI!IHHI!!hhHHHI!IHhHHHI!HHHIhHHI!HHHI!IHHI!!HI!!ihHHHI!IHHI!!!hHHHI!IHHI!!hhHHHhHHHI!HHHIhHHI!HHHI!IHHI!!I!IHHI!!hhHHHI!IHHI!!hhHHHI!IHHI!!ihHHHI!HHHIhHHI!HHHI!IHHI!!hHHHI!IHHI!!!hHHHI!IHHI!!ihHHHI!IHHhHHHI!HHHIhHHI!HHHI!IHHI!!I!!hhHHHI!IHHI!!hhHHHI!IHHI!!ihHHHIhHHHI!HHHIhHHI!HHHI!IHHI!!!IHHI!!!hHHHI!IHHI!!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHHhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!!" + "'", str16, "HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHHhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!!");
    }

    @Test
    public void test7422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7422");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!H" + "'", str1, "HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!H");
    }

    @Test
    public void test7423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7423");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hhHHI!IHHI!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!!HHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!!HHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!!HHHI!IHHI!HHI!IHI!!HI!!!HHHHI!IHHIHHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!!HHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!!HHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!!HHHI!IHHI!HHI!IHI!!HI!!!!HI!!H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HhHHI!IHHI!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!!HHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!!HHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!!HHHI!IHHI!HHI!IHI!!HI!!!HHHHI!IHHIHHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!!HHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!!HHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!!HHHI!IHHI!HHI!IHI!!HI!!!!HI!!H" + "'", str1, "HhHHI!IHHI!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!!HHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!!HHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!!HHHI!IHHI!HHI!IHI!!HI!!!HHHHI!IHHIHHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!!HHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!!HHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!!HHHI!IHHI!HHI!IHI!!HI!!!!HI!!H");
    }

    @Test
    public void test7424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7424");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhhi!ihhihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!", (int) (short) 100, (int) (byte) -1, "hhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end 100, length 56");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7425");
        char[] charArray13 = new char[] {};
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray13);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("", charArray13);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray13);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray13);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("", charArray13);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray13);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("H", charArray13);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalize("hH", charArray13);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalize("HH", charArray13);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalize("hhI!", charArray13);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.initials("hhhi!Hhhi!Ihhi!!", charArray13);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.initials("hhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!HhHHHI!HHHI!IHHI!!HhHHHI!HHHI!IHHI!!IhHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!HhHHHI!HHHI!IHHI!!IhHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!!", charArray13);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.capitalize("hhHHHI!HHHIhHHI!HHHI!IHHI!!hhHHHI!HHHIhHHI!HHHI!IHHI!!hhHHHI!HHHIhHHI!HHHI!IHHI!!hhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!hhHHHI!HHHIhHHI!HHHI!IHHI!!hhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!!", charArray13);
        java.lang.Class<?> wildcardClass27 = charArray13.getClass();
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] {});
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hi!" + "'", str17, "Hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "h" + "'", str19, "h");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H" + "'", str20, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hH" + "'", str21, "hH");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "HH" + "'", str22, "HH");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hhI!" + "'", str23, "hhI!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hhHHHI!HHHIhHHI!HHHI!IHHI!!hhHHHI!HHHIhHHI!HHHI!IHHI!!hhHHHI!HHHIhHHI!HHHI!IHHI!!hhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!hhHHHI!HHHIhHHI!HHHI!IHHI!!hhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!!" + "'", str26, "hhHHHI!HHHIhHHI!HHHI!IHHI!!hhHHHI!HHHIhHHI!HHHI!IHHI!!hhHHHI!HHHIhHHI!HHHI!IHHI!!hhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!hhHHHI!HHHIhHHI!HHHI!IHHI!!hhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!!");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test7426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7426");
        char[] charArray9 = new char[] {};
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("H", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("hhhI!IhhI!hhhi!ihhi!!HI!!", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("hhhi!hhhi!hhi!hhhi!", charArray9);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("Hhi!Ihi!!", charArray9);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("HHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhhhhi!Hhhi!hhHI!", charArray9);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("hhhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhhhhi!hhhihhhi!hhhi!ihhi!!hi!!ihhhhi!ihhi!!!hhhhi!ihhi!!hhhhhh", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hhhI!IhhI!hhhi!ihhi!!HI!!" + "'", str14, "hhhI!IhhI!hhhi!ihhi!!HI!!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hhhi!hhhi!hhi!hhhi!" + "'", str15, "hhhi!hhhi!hhi!hhhi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hhi!Ihi!!" + "'", str16, "Hhi!Ihi!!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test7427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7427");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HHHHi!iHHihhHHHI!IHHI!!hhHHHI!IHHI!!hhHHHI!IHhHHHI!HHHIhHHI!HHHI!IHHI!!HI!!ihHHHI!IHHI!!!hHHHI!IHHI!!hhHHHhHHHI!HHHIhHHI!HHHI!IHHI!!I!IHHI!!hhHHHI!IHHI!!hhHHHI!IHHI!!ihHHHI!HHHIhHHI!HHHI!IHHI!!hHHHI!IHHI!!!hHHHI!IHHI!!ihHHHI!IHHhHHHI!HHHIhHHI!HHHI!IHHI!!I!!hhHHHI!IHHI!!hhHHHI!IHHI!!ihHHHIhHHHI!HHHIhHHI!HHHI!IHHI!!!IHHI!!!hHHHI!IHHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHHi!iHHihhHHHI!IHHI!!hhHHHI!IHHI!!hhHHHI!IHhHHHI!HHHIhHHI!HHHI!IHHI!!HI!!ihHHHI!IHHI!!!hHHHI!IHHI!!hhHHHhHHHI!HHHIhHHI!HHHI!IHHI!!I!IHHI!!hhHHHI!IHHI!!hhHHHI!IHHI!!ihHHHI!HHHIhHHI!HHHI!IHHI!!hHHHI!IHHI!!!hHHHI!IHHI!!ihHHHI!IHHhHHHI!HHHIhHHI!HHHI!IHHI!!I!!hhHHHI!IHHI!!hhHHHI!IHHI!!ihHHHIhHHHI!HHHIhHHI!HHHI!IHHI!!!IHHI!!!hHHHI!IHHI!!!" + "'", str1, "hHHHi!iHHihhHHHI!IHHI!!hhHHHI!IHHI!!hhHHHI!IHhHHHI!HHHIhHHI!HHHI!IHHI!!HI!!ihHHHI!IHHI!!!hHHHI!IHHI!!hhHHHhHHHI!HHHIhHHI!HHHI!IHHI!!I!IHHI!!hhHHHI!IHHI!!hhHHHI!IHHI!!ihHHHI!HHHIhHHI!HHHI!IHHI!!hHHHI!IHHI!!!hHHHI!IHHI!!ihHHHI!IHHhHHHI!HHHIhHHI!HHHI!IHHI!!I!!hhHHHI!IHHI!!hhHHHI!IHHI!!ihHHHIhHHHI!HHHIhHHI!HHHI!IHHI!!!IHHI!!!hHHHI!IHHI!!!");
    }

    @Test
    public void test7428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7428");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhhi!hhhi!hhhi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhhhi!hhhi!hhhi!" + "'", str1, "hhhhhi!hhhi!hhhi!");
    }

    @Test
    public void test7429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7429");
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
        java.lang.String str25 = org.apache.commons.lang.WordUtils.capitalize("HHHI!IHHI!hhHHI!HHHI!Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!", charArray13);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.capitalize("HhHHI!IHHI!!HhHHI!IHHI!!hhHHI!IHHI!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!hhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!hhHHHI!HHHIhHHI!HHHI!IHHI!!ihHHHI!HHHIhHHI!HHHI!IHHI!!!", charArray13);
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
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "HHHI!IHHI!hhHHI!HHHI!Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!" + "'", str25, "HHHI!IHHI!hhHHI!HHHI!Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "HhHHI!IHHI!!HhHHI!IHHI!!hhHHI!IHHI!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!hhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!hhHHHI!HHHIhHHI!HHHI!IHHI!!ihHHHI!HHHIhHHI!HHHI!IHHI!!!" + "'", str26, "HhHHI!IHHI!!HhHHI!IHHI!!hhHHI!IHHI!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!hhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!hhHHHI!HHHIhHHI!HHHI!IHHI!!ihHHHI!HHHIhHHI!HHHI!IHHI!!!");
    }

    @Test
    public void test7430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7430");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HhHH", (int) (byte) 1, "HHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhi!ihhi!!!Hhhhi!hhhiHhhi!hhhi!ihhi!!HHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhi!ihhi!!!Hhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!HHhhhi!hhhiHhhi!hhhi!ihhi!!IHhhhi!hhhiHhhi!hhhi!ihhi!!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HhHH" + "'", str4, "HhHH");
    }

    @Test
    public void test7431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7431");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("HHHhHHhHHiHH!HHhHHhHHhHHiHH!HHhHHhHHhHHiHH!HHIHHhHHhHHiHH!HH!HHhHHhHHiHH!HHIHHhHHhHHiHH!HHhHHhHHhhHHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!!HHiHH!HHhHHhHHhHHiHH!HHIHHhHHhHHiHH!HH!HHhHHhHHiHH!HHHHHhHHhHHiHH!HHIHHhHHhHHiHH!HH!HHhHHhHHiHH!HhHHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!!H!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHhHHhHHiHH!HHhHHhHHhHHiHH!HHhHHhHHhHHiHH!HHIHHhHHhHHiHH!HH!HHhHHhHHiHH!HHIHHhHHhHHiHH!HHhHHhHHhhHHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!!HHiHH!HHhHHhHHhHHiHH!HHIHHhHHhHHiHH!HH!HHhHHhHHiHH!HHHHHhHHhHHiHH!HHIHHhHHhHHiHH!HH!HHhHHhHHiHH!HhHHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!!H!" + "'", str1, "HHHhHHhHHiHH!HHhHHhHHhHHiHH!HHhHHhHHhHHiHH!HHIHHhHHhHHiHH!HH!HHhHHhHHiHH!HHIHHhHHhHHiHH!HHhHHhHHhhHHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!!HHiHH!HHhHHhHHhHHiHH!HHIHHhHHhHHiHH!HH!HHhHHhHHiHH!HHHHHhHHhHHiHH!HHIHHhHHhHHiHH!HH!HHhHHhHHiHH!HhHHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!!H!");
    }

    @Test
    public void test7432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7432");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("Hhhhi!hhhiHHhhi!!ihhi!!", (-1), "Hhhi!hhhi!hhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!iHhHHHHI!HHHHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!HhHhhhi!ihhi!HHHi!iHHi!hi!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhhi!hhhiHHhhi!!ihhi!!" + "'", str4, "Hhhhi!hhhiHHhhi!!ihhi!!");
    }

    @Test
    public void test7433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7433");
        char[] charArray9 = new char[] {};
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("hH", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("hI!", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("HHHI!HHHI!HHHI!", charArray9);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("hHHI!IHHI!hhi!Ihi!!HI!!", charArray9);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("HhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HIhhHHHI!IHhHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhi!ihhi!!!Hhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhi!ihhi!!!Hhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhi!ihhi!!!Hhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhi!ihhi!!!Hhhhi!hhhiHhhi!hhhi!ihhi!!!Hhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhi!ihhi!!!Hhhhi!hhhiHhhi!hhhi!ihhi!!!", charArray9);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHHI!IHHI!HHHI!IHHI!!HI!!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hi!" + "'", str12, "Hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hI!" + "'", str14, "hI!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HHHI!HHHI!HHHI!" + "'", str15, "HHHI!HHHI!HHHI!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hHHHI!IHHI!HHHI!IHHI!!HI!!" + "'", str18, "hHHHI!IHHI!HHHI!IHHI!!HI!!");
    }

    @Test
    public void test7434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7434");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("Hhhhi!hhhiHhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!hhi!hhhhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHHI!HHHIhHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHI!HHI!HHHHHHHI!HHHI!IHHI!!HHHHHI!HHHI!IHHI!!HHHHHI!HHHI!IHHI!!IHHHHI!HHHI!IHHI!!!HHHHI!HHHI!IHHI!!IHHHHI!HHHI!IHHI!!HHHHHI!HHHI!IHHI!!HHHHHI!HHHI!IHHI!!IHHHHI!HHHI!IHHI!!!HHHHI!HHHI!IHHI!!HHHHHI!HHHI!IHHI!!HHHHHI!HHHI!IHHI!!IHHHHI!HHHI!IHHI!!!HHHHI!HHHI!IHHI!!IHHHHI!HHHI!IHHI!!HHHHHI!HHHI!IHHI!!IHHHHI!HHHI!IHHI!!!HHHHI!HHHI!IHHI!!!HHHHI!HHHI!IHHI!!HHHHHI!HHHI!IHHI!!IHHHHI!HHHI!IHHI!!!HHHHI!HHHI!IHHI!!!" + "'", str1, "hHHHI!HHHIhHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHI!HHI!HHHHHHHI!HHHI!IHHI!!HHHHHI!HHHI!IHHI!!HHHHHI!HHHI!IHHI!!IHHHHI!HHHI!IHHI!!!HHHHI!HHHI!IHHI!!IHHHHI!HHHI!IHHI!!HHHHHI!HHHI!IHHI!!HHHHHI!HHHI!IHHI!!IHHHHI!HHHI!IHHI!!!HHHHI!HHHI!IHHI!!HHHHHI!HHHI!IHHI!!HHHHHI!HHHI!IHHI!!IHHHHI!HHHI!IHHI!!!HHHHI!HHHI!IHHI!!IHHHHI!HHHI!IHHI!!HHHHHI!HHHI!IHHI!!IHHHHI!HHHI!IHHI!!!HHHHI!HHHI!IHHI!!!HHHHI!HHHI!IHHI!!HHHHHI!HHHI!IHHI!!IHHHHI!HHHI!IHHI!!!HHHHI!HHHI!IHHI!!!");
    }

    @Test
    public void test7435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7435");
        char[] charArray8 = new char[] {};
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("H", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("hHI!", charArray8);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!", charArray8);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhI!IhhI!hHh", charArray8);
        java.lang.Class<?> wildcardClass17 = charArray8.getClass();
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hHI!" + "'", str14, "hHI!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!" + "'", str15, "hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hhhI!IhhI!hHh" + "'", str16, "hhhI!IhhI!hHh");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test7436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7436");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hhhi!ihhi!Hhhi!ihhi!HHI!iHI!!hi!!", (int) 'a', "HhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHHhhhhhhhhhhhhhhhihhh!hhhhhhhhhhhhhhhihhh!hhhihhhhhhhhhhhihhh!hhh!i!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!ihHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhi!ihhi!Hhhi!ihhi!HHI!iHI!!hi!!" + "'", str4, "hhhi!ihhi!Hhhi!ihhi!HHI!iHI!!hi!!");
    }

    @Test
    public void test7437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7437");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhhi!hhhhhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhhi!hhhhhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!" + "'", str1, "Hhhhhi!hhhhhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
    }

    @Test
    public void test7438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7438");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("Hhhhi!ihhihhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!h!hhhi!ihhihhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!h!!hi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!ihhihhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!h!hhhi!ihhihhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!h!!hi!!" + "'", str1, "Hhhhi!ihhihhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!h!hhhi!ihhihhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!h!!hi!!");
    }

    @Test
    public void test7439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7439");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("Hhhhi!hhhiHHhhi!!ihhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHHI!HHHIhhHHI!!IHHI!!" + "'", str1, "hHHHI!HHHIhhHHI!!IHHI!!");
    }

    @Test
    public void test7440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7440");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("HhhI!HhI!HHhhhi!ihhihhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test7441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7441");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhhhi!hhhhHHI!HHHI!IHHI!!", (int) (short) 1, (int) (byte) 100, "Hhhi!hhhi!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhhhi!hhhhHHI!HHHI!IHHI!!" + "'", str4, "Hhhhhi!hhhhHHI!HHHI!IHHI!!");
    }

    @Test
    public void test7442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7442");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("Hhhhhi!ihhhhhhi!hhhihhhi!hhhi!ihhi!!i!!hhhhi!ihhhhi!hhhihhhi!hhhi!ihhi!!hhi!!hhhhihhhhi!hhhihhhi!hhhhhhhh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test7443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7443");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hhHHi!iHHihhhhi!hhhi!ihhi!!", (int) (short) -1, "HHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!IHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhHHi!iHHihhhhi!hhhi!ihhi!!" + "'", str4, "hhHHi!iHHihhhhi!hhhi!ihhi!!");
    }

    @Test
    public void test7444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7444");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!" + "'", str1, "hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!");
    }

    @Test
    public void test7445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7445");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("", (int) (byte) 100, (int) 'a', "hhhhi!hhhhi!hhhhi!ihhhi!!hhhi!ihhhi!hhhhi!hhhhi!ihhhi!!hhhi!hhhhi!hhhhi!hhhhi!ihhhi!!hhhi!ihhhi!hhhhi!hhhhi!ihhhi!!hhhi!!hhhi!hhhhi!ihhhi!!hhhi!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test7446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7446");
        char[] charArray12 = new char[] {};
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray12);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("", charArray12);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("hi!", charArray12);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("", charArray12);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("Hhhi!ihhi!!", charArray12);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("HHHHI!HHHIHHHI!HHHI!IHHI!!", charArray12);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray12);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("Hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!!", charArray12);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.uncapitalize("HHHI!HHHI!HHHI!IHI!!HHHI!IHI!!HHhHhhI!IhhI!hhhi!ihhi!!HI!!HI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHIhHhhI!IhhI!hhhi!ihhi!!HI!!!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IhHhhI!IhhI!hhhi!ihhi!!HI!!HI!!!HHI!IHI!!HHHI!IHI!!IHHI!IHIhHhhI!IhhI!hhhi!ihhi!!HI!!!!!HHI!IHI!!!", charArray12);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhhhhi!hhhihhhi!hhhi!ihhi!!hi!!ihhhhi!ihhi!!!hhhhi!ihhi!!hhhhhhhhhhhhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhi!ihhi!!hhhi!", charArray12);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.initials("hHHI!IHHI!HHHI!HHHI!HHI!HHHI!", charArray12);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalize("hHHHI!HHHIhHHI!HHHI!HHHI!IHHI!!HHI!IHHI!HHHI!HHHI!IHHI!!HHI!HHHI!IHHI!!HHI!!", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] {});
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!!" + "'", str20, "Hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "HHHI!HHHI!HHHI!IHI!!HHHI!IHI!!HHhHhhI!IhhI!hhhi!ihhi!!HI!!HI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHIhHhhI!IhhI!hhhi!ihhi!!HI!!!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IhHhhI!IhhI!hhhi!ihhi!!HI!!HI!!!HHI!IHI!!HHHI!IHI!!IHHI!IHIhHhhI!IhhI!hhhi!ihhi!!HI!!!!!HHI!IHI!!!" + "'", str21, "HHHI!HHHI!HHHI!IHI!!HHHI!IHI!!HHhHhhI!IhhI!hhhi!ihhi!!HI!!HI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHIhHhhI!IhhI!hhhi!ihhi!!HI!!!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IhHhhI!IhhI!hhhi!ihhi!!HI!!HI!!!HHI!IHI!!HHHI!IHI!!IHHI!IHIhHhhI!IhhI!hhhi!ihhi!!HI!!!!!HHI!IHI!!!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Hhhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhhhhi!hhhihhhi!hhhi!ihhi!!hi!!ihhhhi!ihhi!!!hhhhi!ihhi!!hhhhhhhhhhhhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhi!ihhi!!hhhi!" + "'", str22, "Hhhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhhhhi!hhhihhhi!hhhi!ihhi!!hi!!ihhhhi!ihhi!!!hhhhi!ihhi!!hhhhhhhhhhhhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhi!ihhi!!hhhi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hHHHI!HHHIhHHI!HHHI!HHHI!IHHI!!HHI!IHHI!HHHI!HHHI!IHHI!!HHI!HHHI!IHHI!!HHI!!" + "'", str24, "hHHHI!HHHIhHHI!HHHI!HHHI!IHHI!!HHI!IHHI!HHHI!HHHI!IHHI!!HHI!HHHI!IHHI!!HHI!!");
    }

    @Test
    public void test7447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7447");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhhhhi!hhhHHhhI!IhhIHHHHI!HHHI!IHHI!!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhhhi!hhhHHhhI!IhhIHHHHI!HHHI!IHHI!!" + "'", str2, "Hhhhhi!hhhHHhhI!IhhIHHHHI!HHHI!IHHI!!");
    }

    @Test
    public void test7448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7448");
        char[] charArray10 = new char[] {};
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("hi!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!", charArray10);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("HHhhi!hhhi!hhhi!", charArray10);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("HHHI!IHHI!hhHHI!HHHI!Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!", charArray10);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("HhHhhi!hHhhi!hHhhi!iHhhi!!Hhhi!iHhhi!hHhhi!hHhhi!iHhhi!!Hhhi!hHhhi!hHhhi!hHhhi!iHhhi!!Hhhi!iHhhi!hhhhhi!hhhHhhhi!hhhihhhi!ihhi!hi!!!ihhi!!hHhhi!hHhhi!iHhhi!!Hhhi!!Hhhi!hHhhi!iHhhi!!Hhhi!!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HI!" + "'", str14, "HI!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hi!" + "'", str16, "Hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "HHHI!IHHI!hhHHI!HHHI!Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!" + "'", str19, "HHHI!IHHI!hhHHI!HHHI!Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HhHhhi!hHhhi!hHhhi!iHhhi!!Hhhi!iHhhi!hHhhi!hHhhi!iHhhi!!Hhhi!hHhhi!hHhhi!hHhhi!iHhhi!!Hhhi!iHhhi!hhhhhi!hhhHhhhi!hhhihhhi!ihhi!hi!!!ihhi!!hHhhi!hHhhi!iHhhi!!Hhhi!!Hhhi!hHhhi!iHhhi!!Hhhi!!" + "'", str20, "HhHhhi!hHhhi!hHhhi!iHhhi!!Hhhi!iHhhi!hHhhi!hHhhi!iHhhi!!Hhhi!hHhhi!hHhhi!hHhhi!iHhhi!!Hhhi!iHhhi!hhhhhi!hhhHhhhi!hhhihhhi!ihhi!hi!!!ihhi!!hHhhi!hHhhi!iHhhi!!Hhhi!!Hhhi!hHhhi!iHhhi!!Hhhi!!");
    }

    @Test
    public void test7449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7449");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!hHhHHHI!IHHI!hhhI!IhhI!HI!!", (int) (short) 0, (int) (short) 100, "hHhhI!IhhI!hhhi!ihhi!!HI!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!hHhhHhhI!IhhI!hhhi!ihhi!!HI!!" + "'", str4, "hhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!hHhhHhhI!IhhI!hhhi!ihhi!!HI!!");
    }

    @Test
    public void test7450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7450");
        char[] charArray13 = new char[] {};
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray13);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("", charArray13);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray13);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray13);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("", charArray13);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray13);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("H", charArray13);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.uncapitalize("hhhI!IhhI!HI!!", charArray13);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.uncapitalize("hhhi!Hhhi!Ihhi!!", charArray13);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalize("Hhhhi!ihhi!hi!!h", charArray13);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalize("hHH", charArray13);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.capitalize("Hhhhi!hhhihhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!", charArray13);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.uncapitalize("hHhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHH", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] {});
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hi!" + "'", str17, "Hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "h" + "'", str19, "h");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H" + "'", str20, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hhhI!IhhI!HI!!" + "'", str21, "hhhI!IhhI!HI!!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hhhi!Hhhi!Ihhi!!" + "'", str22, "hhhi!Hhhi!Ihhi!!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Hhhhi!ihhi!hi!!h" + "'", str23, "Hhhhi!ihhi!hi!!h");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hHH" + "'", str24, "hHH");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Hhhhi!hhhihhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!" + "'", str25, "Hhhhi!hhhihhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hHhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHH" + "'", str26, "hHhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHH");
    }

    @Test
    public void test7451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7451");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Ihhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Ihhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Ihhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Ihhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Ihhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Ihhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Ihhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Ihhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!" + "'", str2, "Hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Ihhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Ihhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Ihhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Ihhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!");
    }

    @Test
    public void test7452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7452");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HhhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!HhHHHI!HHHI!IHHI!!HhHHHI!HHHI!IHHI!!IhHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!HhHHHI!HHHI!IHHI!!IhHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!!", (int) (byte) -1, "hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!iHHHI!hHHI!iHHIhhhhI!IhhI!HI!!h", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HhhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!HhHHHI!HHHI!IHHI!!HhHHHI!HHHI!IHHI!!IhHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!HhHHHI!HHHI!IHHI!!IhHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!!" + "'", str4, "HhhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!HhHHHI!HHHI!IHHI!!HhHHHI!HHHI!IHHI!!IhHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!HhHHHI!HHHI!IHHI!!IhHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!!");
    }

    @Test
    public void test7453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7453");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HHHHHHHHHHHHHHHHHIHHH!HHHHHHHHHHHHHHHIHHH!HHHIHHHHHHHHHHHIHHH!HHH!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHHHHHHHHHHHHHHHIHHH!HHHHHHHHHHHHHHHIHHH!HHHIHHHHHHHHHHHIHHH!HHH!" + "'", str1, "hHHHHHHHHHHHHHHHHIHHH!HHHHHHHHHHHHHHHIHHH!HHHIHHHHHHHHHHHIHHH!HHH!");
    }

    @Test
    public void test7454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7454");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhHHHI!IHHhhhi!hhhi!HhHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!!hHI!iHI!!ihHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!hHhhI!IhhI!!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhHHHI!IHHhhhi!hhhi!HhHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!!hHI!iHI!!ihHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!hHhhI!IhhI!!" + "'", str2, "hhHHHI!IHHhhhi!hhhi!HhHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!!hHI!iHI!!ihHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!hHhhI!IhhI!!");
    }

    @Test
    public void test7455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7455");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("HhI!HhI!HhhhHHi!iHHi!HHHI!IHHI!!hi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test7456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7456");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!ihi!!hi!hhi!ihi!!hi!!", (int) (byte) 100, (int) (short) -1, "Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihHHhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!!H");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end 100, length 53");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7457");
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
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalize("HHh", charArray13);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.capitalize("hhhhi!ihhi!hi!!", charArray13);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.capitalizeFully("HHhhi!hhhi!hhhi!", charArray13);
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
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "HHh" + "'", str24, "HHh");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hhhhi!ihhi!hi!!" + "'", str25, "hhhhi!ihhi!hi!!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "HHhhi!hhhi!hhhi!" + "'", str26, "HHhhi!hhhi!hhhi!");
    }

    @Test
    public void test7458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7458");
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
        java.lang.String str30 = org.apache.commons.lang.WordUtils.uncapitalize("hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi", charArray15);
        java.lang.Class<?> wildcardClass31 = charArray15.getClass();
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
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi" + "'", str30, "hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi");
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test7459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7459");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hHHHI!IHHI!HHHHI!IHHI!HI!!HHHHHI!IHHI!HHHHI!IHHI!HI!!HHHHHI!IHHI!HHHHI!IHHI!HI!!HHHHHI!IHHI!HHHHI!IHHI!HI!!HIHHHI!IHHI!HHHHI!IHHI!HI!!H!HHHI!IHHI!HHHHI!IHHI!HI!!HIHHHI!IHHI!HHHHI!IHHI!HI!!HHHHHI!IHHI!HHHHI!IHHI!HI!!HHHHHI!IHHI!HHHHI!IHHI!HI!!HIHHHI!IHHI!HHHHI!IHHI!HI!!H!HHHI!IHHI!HHHHI!IHHI!HI!!HHHHHI!IHHI!HHHHI!IHHI!HI!!HIHHHI!IHHI!HHHHI!IHHI!HI!!H!HHHI!IHHI!HHHHI!IHHI!HI!!H!HHHI!IHHI!HHHHI!IHHI!HI!!HH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test7460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7460");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("Hhhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhhhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhHhhi!hhhi!hhhi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test7461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7461");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHHHI!IHHHHHI!IHHI!HHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHHHI!IHHHHHI!IHHI!HHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!" + "'", str1, "hHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHHHI!IHHHHHI!IHHI!HHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!");
    }

    @Test
    public void test7462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7462");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHHHHHHHHIhhhhI!IhhI!HI!!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHHHHHHHHIhhhhI!IhhI!HI!!" + "'", str2, "hHHHHHHHHIhhhhI!IhhI!HI!!");
    }

    @Test
    public void test7463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7463");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("Hhhhi!ihhi!hhhi!ihhi!!hi!!hhhhi!ihhi!hhhi!ihhi!!hi!!hhhhi!ihhi!hhhi!ihhi!!hi!!hhhhi!ihhi!hhhi!ihhHhhhi!ihhihhhhhi!ihhhhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!i!!hi!!ihhhi!ihhi!hhhi!ihhi!!hi!!!hhhi!ihhi!hhhi!ihhi!!hi!!hhhhi!ihhi!hhhi!ihhi!!hi!!hhhhi!ihhi!hHhhhi!ihhihhhhhi!ihhhhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhi!ihhi!!hi!!hhhhi!ihhi!hhhi!ihhi!!hi!!ihhhi!ihhi!hhhi!ihhi!!hi!!!hhhi!ihhi!hhhi!ihhi!!hi!!hhhhiHhhhi!ihhihhhhhi!ihhhhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!ihhi!hhhi!ihhi!!hi!!hhhhi!ihhi!hhhi!ihhi!!hi!!hhhhi!ihhi!hhhi!ihhi!!hi!!ihhhi!ihhi!hhhi!ihhi!!hiHhhhi!ihhihhhhhi!ihhhhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!!!", (int) (byte) 100, "hHHHI!HHHIHHHI!HHHI!IHHI!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhhi!ihhi!hhhi!ihhi!!hi!!hhhhi!ihhi!hhhi!ihhi!!hi!!hhhhi!ihhi!hhhi!ihhi!!hi!!hhhhi!ihhi!hhhi!ihhHhhhi!ihhihhhhhi!ihhhhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!i!!hi!!ihhhi!ihhi!hhhi!ihhi!!hi!!!hhhi!ihhi!hhhi!ihhi!!hi!!hhhhi!ihhi!hhhi!ihhi!!hi!!hhhhi!ihhi!hHhhhi!ihhihhhhhi!ihhhhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhi!ihhi!!hi!!hhhhi!ihhi!hhhi!ihhi!!hi!!ihhhi!ihhi!hhhi!ihhi!!hi!!!hhhi!ihhi!hhhi!ihhi!!hi!!hhhhiHhhhi!ihhihhhhhi!ihhhhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!ihhi!hhhi!ihhi!!hi!!hhhhi!ihhi!hhhi!ihhi!!hi!!hhhhi!ihhi!hhhi!ihhi!!hi!!ihhhi!ihhi!hhhi!ihhi!!hiHhhhi!ihhihhhhhi!ihhhhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!!!" + "'", str4, "Hhhhi!ihhi!hhhi!ihhi!!hi!!hhhhi!ihhi!hhhi!ihhi!!hi!!hhhhi!ihhi!hhhi!ihhi!!hi!!hhhhi!ihhi!hhhi!ihhHhhhi!ihhihhhhhi!ihhhhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!i!!hi!!ihhhi!ihhi!hhhi!ihhi!!hi!!!hhhi!ihhi!hhhi!ihhi!!hi!!hhhhi!ihhi!hhhi!ihhi!!hi!!hhhhi!ihhi!hHhhhi!ihhihhhhhi!ihhhhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhi!ihhi!!hi!!hhhhi!ihhi!hhhi!ihhi!!hi!!ihhhi!ihhi!hhhi!ihhi!!hi!!!hhhi!ihhi!hhhi!ihhi!!hi!!hhhhiHhhhi!ihhihhhhhi!ihhhhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!ihhi!hhhi!ihhi!!hi!!hhhhi!ihhi!hhhi!ihhi!!hi!!hhhhi!ihhi!hhhi!ihhi!!hi!!ihhhi!ihhi!hhhi!ihhi!!hiHhhhi!ihhihhhhhi!ihhhhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!!!");
    }

    @Test
    public void test7464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7464");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("HHHI!IHHI!HHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHhHHHI!IHHI!hhi!Ihi!!HI!!HHHHI!IHHI!hhi!Ihi!!HI!!HHHHI!IHHI!hhi!Ihi!!HI!!IHHHI!IHHI!hhi!Ihi!!HI!!!HHHI!IHHI!hhi!Ihi!!HI!!IHHHI!IHHI!hhi!Ihi!!HI!!HHHHI!IHHI!hhi!Ihi!!HI!!HHHHI!IHHI!hhi!Ihi!!HI!!IHHHI!IHHI!hhi!Ihi!!HI!!!HHHI!IHHI!hhi!Ihi!!HI!!hHHHI!IHHI!hhi!Ihi!!HI!!iHHHI!IHHI!hhi!Ihi!!HI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test7465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7465");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHI!IHHI!HHHHHHHHHIHH!HHHHHHHHHHHIHhhhi!hhhi!ihhi!!hHHHI!HHHIHHHHI!!IHHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihhhhi!hhhi!ihhi!!hhhhi!hhhihhhhi!!ihhi!!" + "'", str1, "Hhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihhhhi!hhhi!ihhi!!hhhhi!hhhihhhhi!!ihhi!!");
    }

    @Test
    public void test7466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7466");
        char[] charArray9 = new char[] {};
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("hi!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("Hhi!", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("HhhI!IhhI!hHHHi!iHHi!hi!!H", charArray9);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("hhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi", charArray9);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhi!hhhi!ihhi!!", charArray9);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("HHHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhiHHhhhhi!hhhihhhi!hhhi!ihhi!!hhhhHHhi!hi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhHHhi!hihhhi!hhhi!ihhi!!ihhhhi!hhhihhhHHhi!i!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhHHhi!i!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhHHhi!i!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhHHhi!hhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!HHhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihHHhi!hhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hHHhi!hhi!ihhi!!hhhhhi!hhhihhhi!hhhi!iHHhi!hhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!HHhi!!hhhhi!hhhihhhi!hhhi!ihhi!!ihhhhHHhi!i!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhHHhi!ihhhi!hhhi!ihhi!!ihhhhi!hhhihhhiHHhi!!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhiHHhi!!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhiHHhi!!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhHHhi!hhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hHHhi!hhihhhi!hhhi!ihhi!!!H", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hI!" + "'", str13, "hI!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hhi!" + "'", str14, "Hhi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HhhI!IhhI!hHHHi!iHHi!hi!!H" + "'", str15, "HhhI!IhhI!hHHHi!iHHi!hi!!H");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi" + "'", str16, "hhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hhhhi!hhhi!ihhi!!" + "'", str17, "Hhhhi!hhhi!ihhi!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HHHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhiHHhhhhi!hhhihhhi!hhhi!ihhi!!hhhhHHhi!hi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhHHhi!hihhhi!hhhi!ihhi!!ihhhhi!hhhihhhHHhi!i!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhHHhi!i!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhHHhi!i!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhHHhi!hhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!HHhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihHHhi!hhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hHHhi!hhi!ihhi!!hhhhhi!hhhihhhi!hhhi!iHHhi!hhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!HHhi!!hhhhi!hhhihhhi!hhhi!ihhi!!ihhhhHHhi!i!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhHHhi!ihhhi!hhhi!ihhi!!ihhhhi!hhhihhhiHHhi!!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhiHHhi!!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhiHHhi!!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhHHhi!hhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hHHhi!hhihhhi!hhhi!ihhi!!!H" + "'", str18, "HHHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhiHHhhhhi!hhhihhhi!hhhi!ihhi!!hhhhHHhi!hi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhHHhi!hihhhi!hhhi!ihhi!!ihhhhi!hhhihhhHHhi!i!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhHHhi!i!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhHHhi!i!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhHHhi!hhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!HHhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihHHhi!hhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hHHhi!hhi!ihhi!!hhhhhi!hhhihhhi!hhhi!iHHhi!hhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!HHhi!!hhhhi!hhhihhhi!hhhi!ihhi!!ihhhhHHhi!i!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhHHhi!ihhhi!hhhi!ihhi!!ihhhhi!hhhihhhiHHhi!!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhiHHhi!!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhiHHhi!!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhHHhi!hhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hHHhi!hhihhhi!hhhi!ihhi!!!H");
    }

    @Test
    public void test7467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7467");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HHHHHI!IHHI!!HHHHHI!IHHI!!HHHHHI!IHHI!!IHHHHI!IHHI!!HHHI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHHHI!IHHI!!HHHHHI!IHHI!!HHHHHI!IHHI!!IHHHHI!IHHI!!HHHI!" + "'", str1, "hHHHHI!IHHI!!HHHHHI!IHHI!!HHHHHI!IHHI!!IHHHHI!IHHI!!HHHI!");
    }

    @Test
    public void test7468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7468");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hhhhhhi!hhhHHhhI!IhhIHHHHI!HHHI!IHHI!!", (int) (byte) 0, "hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!iHHHI!hHHI!iHHI", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhhhhi!hhhHHhhI!IhhIHHHHI!HHHI!IHHI!!" + "'", str4, "hhhhhhi!hhhHHhhI!IhhIHHHHI!HHHI!IHHI!!");
    }

    @Test
    public void test7469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7469");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhihhhi!ihhi!hhh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhihhhi!ihhi!hhh" + "'", str1, "Hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhihhhi!ihhi!hhh");
    }

    @Test
    public void test7470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7470");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("", (int) 'a', "Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhHhhi!hhhi!ihhi!!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test7471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7471");
        char[] charArray12 = new char[] {};
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray12);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("", charArray12);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray12);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray12);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("", charArray12);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray12);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("H", charArray12);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.uncapitalize("hh", charArray12);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhI!IhhI!!", charArray12);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.initials("hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!!", charArray12);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalize("HhHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!ihHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!ihHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!!hHHI!IHHI!HI!!h", charArray12);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.uncapitalize("HhHHHI!IHHI!!hhHHHI!IHHI!!hhHHHI!IHHI!!ihHHHI!IHHI!!!hHHHI!IHHI!!hhHHHI!IHHI!!hhHHHI!IHHI!!hhHHHIHhHHHhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhiHhi!hhi!hhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!", charArray12);
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hhhI!IhhI!!" + "'", str21, "hhhI!IhhI!!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "HhHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!ihHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!ihHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!!hHHI!IHHI!HI!!h" + "'", str23, "HhHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!ihHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!ihHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!!hHHI!IHHI!HI!!h");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "HhHHHI!IHHI!!hhHHHI!IHHI!!hhHHHI!IHHI!!ihHHHI!IHHI!!!hHHHI!IHHI!!hhHHHI!IHHI!!hhHHHI!IHHI!!hhHHHIHhHHHhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhiHhi!hhi!hhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!" + "'", str24, "HhHHHI!IHHI!!hhHHHI!IHHI!!hhHHHI!IHHI!!ihHHHI!IHHI!!!hHHHI!IHHI!!hhHHHI!IHHI!!hhHHHI!IHHI!!hhHHHIHhHHHhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhiHhi!hhi!hhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
    }

    @Test
    public void test7472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7472");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HhHHHHI!HHHHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!HhHhhhi!ihhi!HHHi!iHHi!hi!!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HhHHHHI!HHHHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!HhHhhhi!ihhi!HHHi!iHHi!hi!!" + "'", str2, "HhHHHHI!HHHHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!HhHhhhi!ihhi!HHHi!iHHi!hi!!");
    }

    @Test
    public void test7473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7473");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.initials("Hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhhhi!hhhi!hhhi!", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
    }

    @Test
    public void test7474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7474");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("Hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!!hhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!!hhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!!hhhi!ihhi!hhi!ihi!!hi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!!HHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!!HHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!!HHHI!IHHI!HHI!IHI!!HI!!!" + "'", str1, "hHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!!HHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!!HHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!!HHHI!IHHI!HHI!IHI!!HI!!!");
    }

    @Test
    public void test7475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7475");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hHHHi!iHHi!hi!!H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHHi!iHHi!hi!!H" + "'", str1, "hHHHi!iHHi!hi!!H");
    }

    @Test
    public void test7476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7476");
        char[] charArray10 = new char[] {};
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("hi!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("Hhhi!ihhi!!", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("HHHHI!HHHIHHHI!HHHI!IHHI!!", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!", charArray10);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!IhHI!iHI!!!hHI!iHI!!IhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!!hHI!iHI!!ihHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!!hHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!hhHI!iHI!!hhHI!iHI!!!hHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!hhHI!iHI!!hhHI!iHI!!!hHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!hhHI!iHI!!hhHI!iHI!!!hHI!iHI!!hhHI!iHI!!hhHI!iHI!!!", charArray10);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!hhi!ihi!!hi!!", charArray10);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("HHhHhhI!IhhI!!HHhhI!IhhI!!HHhhI!IhhI!!HHhhI!IhhI!!IHhhI!IhhI!!!HhhI!IhhI!!HHhhI!IhhI!!HHhhI!IhhI!!HHhhI!IhhI!!IHhhI!IhhI!!!HhhI!IhhI!!IHhhI!IhhI!!HHhhI!IhhI!!HHhhI!IhhI!!IHhhI!IhhI!!!HhhI!IhhI!!!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!" + "'", str17, "Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!IhHI!iHI!!!hHI!iHI!!IhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!!hHI!iHI!!ihHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!!hHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!hhHI!iHI!!hhHI!iHI!!!hHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!hhHI!iHI!!hhHI!iHI!!!hHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!hhHI!iHI!!hhHI!iHI!!!hHI!iHI!!hhHI!iHI!!hhHI!iHI!!!" + "'", str18, "hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!IhHI!iHI!!!hHI!iHI!!IhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!!hHI!iHI!!ihHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!!hHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!hhHI!iHI!!hhHI!iHI!!!hHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!hhHI!iHI!!hhHI!iHI!!!hHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!hhHI!iHI!!hhHI!iHI!!!hHI!iHI!!hhHI!iHI!!hhHI!iHI!!!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!hhi!ihi!!hi!!" + "'", str19, "hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!hhi!ihi!!hi!!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HHhHhhI!IhhI!!HHhhI!IhhI!!HHhhI!IhhI!!HHhhI!IhhI!!IHhhI!IhhI!!!HhhI!IhhI!!HHhhI!IhhI!!HHhhI!IhhI!!HHhhI!IhhI!!IHhhI!IhhI!!!HhhI!IhhI!!IHhhI!IhhI!!HHhhI!IhhI!!HHhhI!IhhI!!IHhhI!IhhI!!!HhhI!IhhI!!!" + "'", str20, "HHhHhhI!IhhI!!HHhhI!IhhI!!HHhhI!IhhI!!HHhhI!IhhI!!IHhhI!IhhI!!!HhhI!IhhI!!HHhhI!IhhI!!HHhhI!IhhI!!HHhhI!IhhI!!IHhhI!IhhI!!!HhhI!IhhI!!IHhhI!IhhI!!HHhhI!IhhI!!HHhhI!IhhI!!IHhhI!IhhI!!!HhhI!IhhI!!!");
    }

    @Test
    public void test7477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7477");
        char[] charArray7 = new char[] {};
        java.lang.String str8 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("H", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!iHhi!Ihi!!!Hhi!Ihi!!iHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!!Hhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!!Hhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!!Hhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!!Hhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!!Hhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!!", charArray7);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("hHhhhi!ihhi!hi!!IHhhhi!ihhi!hi!!!", charArray7);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHH", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HI!" + "'", str11, "HI!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!iHhi!Ihi!!!Hhi!Ihi!!iHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!!Hhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!!Hhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!!Hhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!!Hhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!!Hhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!!" + "'", str12, "HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!iHhi!Ihi!!!Hhi!Ihi!!iHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!!Hhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!!Hhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!!Hhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!!Hhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!!Hhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hHhhhi!ihhi!hi!!IHhhhi!ihhi!hi!!!" + "'", str13, "hHhhhi!ihhi!hi!!IHhhhi!ihhi!hi!!!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHH" + "'", str14, "hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHH");
    }

    @Test
    public void test7478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7478");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hHHI!IHHI!hi!", (int) (short) 100, "hhHHi!iHHiHhhi!ihhi!HHHi!iHHi!hi!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHI!IHHI!hi!" + "'", str4, "hHHI!IHHI!hi!");
    }

    @Test
    public void test7479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7479");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHi!iHHi!HHHI!IHHI!!hi!!IHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHi!iHHi!HHHI!IHHI!!hi!!IHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!!" + "'", str1, "HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHi!iHHi!HHHI!IHHI!!hi!!IHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!!");
    }

    @Test
    public void test7480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7480");
        char[] charArray9 = new char[] {};
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("hi!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!", charArray9);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("Hhhhi!hhhiHHhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!", charArray9);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("hHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!hHHi!iHHi!HHHI!IHHI!!hi!!", charArray9);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("Hhhhi!hhhi!hhi!hhhi!", charArray9);
        java.lang.Class<?> wildcardClass19 = charArray9.getClass();
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hi!" + "'", str13, "Hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!" + "'", str15, "hhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!hHHi!iHHi!HHHI!IHHI!!hi!!" + "'", str17, "hHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!hHHi!iHHi!HHHI!IHHI!!hi!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test7481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7481");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!hHhhhi!ihhihhhI!IhHHHi!iHHi!HhH", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!hHhhhi!ihhihhhI!IhHHHi!iHHi!HhH" + "'", str2, "hHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!hHhhhi!ihhihhhI!IhHHHi!iHHi!HhH");
    }

    @Test
    public void test7482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7482");
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
        java.lang.String str26 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!ihhi!!", charArray16);
        java.lang.String str27 = org.apache.commons.lang.WordUtils.capitalize("hHHI!HHHI!IHHI!!", charArray16);
        java.lang.String str28 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHHI!IHHI!HI!!H", charArray16);
        java.lang.String str29 = org.apache.commons.lang.WordUtils.initials("Hhhhi!hhhihhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!h", charArray16);
        java.lang.String str30 = org.apache.commons.lang.WordUtils.capitalize("Hhhhi!ihhi!!", charArray16);
        java.lang.String str31 = org.apache.commons.lang.WordUtils.capitalize("hhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!", charArray16);
        java.lang.String str32 = org.apache.commons.lang.WordUtils.capitalizeFully("hHhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHH", charArray16);
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
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Hhhi!ihhi!!" + "'", str26, "Hhhi!ihhi!!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hHHI!HHHI!IHHI!!" + "'", str27, "hHHI!HHHI!IHHI!!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "HHHHI!IHHI!HI!!H" + "'", str28, "HHHHI!IHHI!HI!!H");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Hhhhi!ihhi!!" + "'", str30, "Hhhhi!ihhi!!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!" + "'", str31, "hhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hHhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHH" + "'", str32, "hHhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHH");
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test7483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7483");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HhHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!!Hhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!!Hhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!!Hhi!Ihi!!!", (int) (byte) 1, (int) 'a', "hhhI!IhhI!hHI!HHI!HHHHHHI!HHHI!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHHHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHHI!HHHI!HHI!HHHI!hHHHi!iHHihHI!HHI!HHHHHHI!HHHI!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHHHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHHI!HHHI!HHI!HHHI!!hi!!H");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HhHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!!Hhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!!Hhi!IhhhI!IhhI!hHI!HHI!HHHHHHI!HHHI!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHHHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHHI!HHHI!HHI!HHHI!hHHHi!iHHihHI!HHI!HHHHHHI!HHHI!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHHHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHHI!HHHI!HHI!HHHI!!hi!!H" + "'", str4, "HhHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!!Hhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!!Hhi!IhhhI!IhhI!hHI!HHI!HHHHHHI!HHHI!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHHHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHHI!HHHI!HHI!HHHI!hHHHi!iHHihHI!HHI!HHHHHHI!HHHI!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHHHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHHI!HHHI!HHI!HHHI!!hi!!H");
    }

    @Test
    public void test7484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7484");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHHI!HHHI!Hhhhi!ihhi!!hhhhi!ihhi!!hhhhhi!hhhihHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!iHhhi!Hhhi!Ihhi!!!Hhhi!Hhhi!IhhiHhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!IhHHI!hHHI!iHHI!!!hHHI!hHHI!ihhHHHI!IHHI!HI!!H", (int) 'a', (int) '#', "Hhhhi!hhhihhhhi!hhhihhhi!ihhi!hi!!!ihhi!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHHI!HHHI!Hhhhi!ihhi!!hhhhi!ihhi!!hhhhhi!hhhihHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!hHhhhi!hhhihhhhi!hhhihhhi!ihhi!hi!!!ihhi!!" + "'", str4, "HHHI!HHHI!Hhhhi!ihhi!!hhhhi!ihhi!!hhhhhi!hhhihHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!hHhhhi!hhhihhhhi!hhhihhhi!ihhi!hi!!!ihhi!!");
    }

    @Test
    public void test7485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7485");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hHHHI!HHHIhhHHI!!IHHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hHHHI!HHHIhhHHI!!IHHI!!" + "'", str1, "Hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hHHHI!HHHIhhHHI!!IHHI!!");
    }

    @Test
    public void test7486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7486");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhHHi!iHHihhhhi!hhhi!ihhi!!", (int) (short) 100, (int) (short) 1, "Hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhi!hhhihhhhi!!ihhi!!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end 100, length 27");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7487");
        char[] charArray6 = new char[] {};
        java.lang.String str7 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray6);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.uncapitalize("hI!", charArray6);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray6);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("Hhhi!ihhi!hhhhi!ihhi!hi!!h", charArray6);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHHHHHHHIHHHHi!iHHi!hi!!", charArray6);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hI!" + "'", str8, "hI!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HHHHHHHHHIHHHHi!iHHi!hi!!" + "'", str11, "HHHHHHHHHIHHHHi!iHHi!hi!!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test7488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7488");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hhHHI!IHHI!!HhHHI!IHHI!!hhHHI!IHHI!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!hhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!hhHHHI!HHHIhHHI!HHHI!IHHI!!ihHHHI!HHHIhHHI!HHHI!IHHI!!!", (int) (byte) 100, "Hhhhhi!hhhHHhhI!IhhIHHHHI!HHHI!IHHI!!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhHHI!IHHI!!HhHHI!IHHI!!hhHHI!IHHI!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIHhhhhi!hhhHHhhI!IhhIHHHHI!HHHI!IHHI!!hHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!hhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHhhhhi!hhhHHhhI!IhhIHHHHI!HHHI!IHHI!!HHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHhhhhi!hhhHHhhI!IhhIHHHHI!HHHI!IHHI!!HHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!hhHHHI!HHHIhHHI!HHHI!IHHI!!ihHHHI!HHHIhHHHhhhhi!hhhHHhhI!IhhIHHHHI!HHHI!IHHI!!I!HHHI!IHHI!!!" + "'", str4, "hhHHI!IHHI!!HhHHI!IHHI!!hhHHI!IHHI!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIHhhhhi!hhhHHhhI!IhhIHHHHI!HHHI!IHHI!!hHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!hhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHhhhhi!hhhHHhhI!IhhIHHHHI!HHHI!IHHI!!HHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHhhhhi!hhhHHhhI!IhhIHHHHI!HHHI!IHHI!!HHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!hhHHHI!HHHIhHHI!HHHI!IHHI!!ihHHHI!HHHIhHHHhhhhi!hhhHHhhI!IhhIHHHHI!HHHI!IHHI!!I!HHHI!IHHI!!!");
    }

    @Test
    public void test7489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7489");
        char[] charArray9 = new char[] {};
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("Hh", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("Hi!", charArray9);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("H", charArray9);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("Hhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!ihi!!hi!hhi!ihi!!hi!!", charArray9);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("hhHHHI!IHHIHHHHHI!IHHI!!HHHHHI!IHHI!!HHHHHI!IHHHHHI!HHHIHHHI!HHHI!IHHI!!HI!!IHHHHI!IHHI!!!HHHHI!IHHI!!HHHHHHHHHI!HHHIHHHI!HHHI!IHHI!!I!IHHI!!HHHHHI!IHHI!!HHHHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHI!IHHI!!!HHHHI!IHHI!!IHHHHI!IHHHHHHI!HHHIHHHI!HHHI!IHHI!!I!!HHHHHI!IHHI!!HHHHHI!IHHI!!IHHHHIHHHHI!HHHIHHHI!HHHI!IHHI!!!IHHI!!!HHHHI!IHHI!!!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hi!" + "'", str12, "Hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hh" + "'", str14, "Hh");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hi!" + "'", str15, "Hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!ihi!!hi!hhi!ihi!!hi!!" + "'", str17, "Hhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!ihi!!hi!hhi!ihi!!hi!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test7490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7490");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hhhhhi!ihhHHhhhi!ihhi!hi!!h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhhi!ihhHHhhhi!ihhi!hi!!h" + "'", str1, "Hhhhhi!ihhHHhhhi!ihhi!hi!!h");
    }

    @Test
    public void test7491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7491");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("Hhhhi!ihhihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!ihhihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!" + "'", str1, "Hhhhi!ihhihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!");
    }

    @Test
    public void test7492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7492");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihh" + "'", str1, "Hhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihh");
    }

    @Test
    public void test7493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7493");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhihhi!hhi!hhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhihhi!hhi!hhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!" + "'", str2, "hhhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhihhi!hhi!hhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
    }

    @Test
    public void test7494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7494");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!ihHHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!ihHHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!H" + "'", str1, "hhhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!ihHHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!H");
    }

    @Test
    public void test7495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7495");
        char[] charArray9 = new char[] {};
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("Hh", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("HHHi!iHHi!hi!!", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("HhH", charArray9);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("hHhh", charArray9);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("HHhhhi!hhhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!", charArray9);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHHHHI!IHHI!HI!!HHHHHHHI!IHHI!Hhhhi!ihhi!!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hi!" + "'", str12, "Hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hh" + "'", str13, "Hh");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HHHi!iHHi!hi!!" + "'", str14, "HHHi!iHHi!hi!!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HhH" + "'", str15, "HhH");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HHhhhi!hhhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!" + "'", str17, "HHhhhi!hhhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HHHHHHI!IHHI!HI!!HHHHHHHI!IHHI!Hhhhi!ihhi!!" + "'", str18, "HHHHHHI!IHHI!HI!!HHHHHHHI!IHHI!Hhhhi!ihhi!!");
    }

    @Test
    public void test7496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7496");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("HhHHHI!IHHI!HI!!H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhhi!ihhi!hi!!h" + "'", str1, "Hhhhhi!ihhi!hi!!h");
    }

    @Test
    public void test7497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7497");
        char[] charArray6 = new char[] { '4', '4' };
        java.lang.String str7 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray6);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalizeFully("HHi!", charArray6);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray6);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("hHhh", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Hi!" + "'", str7, "Hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hhi!" + "'", str8, "Hhi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hhhh" + "'", str10, "Hhhh");
    }

    @Test
    public void test7498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7498");
        char[] charArray12 = new char[] {};
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray12);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("", charArray12);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("hi!", charArray12);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray12);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("", charArray12);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("HI!", charArray12);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.uncapitalize("hHHHI!HHHIHHHI!HHHI!IHHI!!", charArray12);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.initials("HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!!", charArray12);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.uncapitalize("hhhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!IhHI!iHI!!!hHI!iHI!!IhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!!hHI!iHI!!ihHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!!hHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!hhHI!iHI!!hhHI!iHI!!!hHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!hhHI!iHI!!hhHI!iHI!!!hHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!hhHI!iHI!!hhHI!iHI!!!hHI!iHI!!hhHI!iHI!!hhHI!iHI!!!", charArray12);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.initials("hhhhhhhhhhihhhhI!IhhI!HI!!", charArray12);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhi!hhhihhhhi!!ihhi!!", charArray12);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.initials("Hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhhhi!ihhhhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] {});
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HI!" + "'", str16, "HI!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HI!" + "'", str18, "HI!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hHHHI!HHHIHHHI!HHHI!IHHI!!" + "'", str19, "hHHHI!HHHIHHHI!HHHI!IHHI!!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hhhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!IhHI!iHI!!!hHI!iHI!!IhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!!hHI!iHI!!ihHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!!hHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!hhHI!iHI!!hhHI!iHI!!!hHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!hhHI!iHI!!hhHI!iHI!!!hHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!hhHI!iHI!!hhHI!iHI!!!hHI!iHI!!hhHI!iHI!!hhHI!iHI!!!" + "'", str21, "hhhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!IhHI!iHI!!!hHI!iHI!!IhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!!hHI!iHI!!ihHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!!hHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!hhHI!iHI!!hhHI!iHI!!!hHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!hhHI!iHI!!hhHI!iHI!!!hHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!hhHI!iHI!!hhHI!iHI!!!hHI!iHI!!hhHI!iHI!!hhHI!iHI!!!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhi!hhhihhhhi!!ihhi!!" + "'", str23, "Hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhi!hhhihhhhi!!ihhi!!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test7499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7499");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HhhhhHhhi!ihhi!hi!!HHhhi!ihhi!hi!!HHhhi!ihhi!hi!!IHhhi!ihhi!hi!!!Hhhi!ihhi!hi!!IHhhi!ihhi!hi!!HHhhi!ihhiHHHI!hHHI!hHi!HHhi!!hi!!HHhhi!ihhi!hi!!IHhhi!ihhi!hi!!!Hhhi!ihhi!hi!!HHhhi!ihhi!hi!!HHhhi!ihhi!hi!!HHhhi!ihhi!hi!!HHhhiHHHI!hHHI!hHi!HHhi!!ihhi!hi!!IHhhi!ihhi!hi!!!Hhhi!ihhi!hi!!IHhhi!ihhi!hi!!HHhhi!ihhi!hi!!HHhhi!ihhi!hi!!IHhhi!ihhi!hi!!HHHI!hHHI!hHi!HHhi!!Hhhi!ihhi!hi!!HHhhi!ihhi!hi!!IHhhi!ihhi!hi!!!Hhhi!ihhi!hi!!!Hhhi!ihhi!hi!!H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test7500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7500");
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
        java.lang.String str26 = org.apache.commons.lang.WordUtils.initials("Hhhi!ihhi!hi!!", charArray15);
        java.lang.String str27 = org.apache.commons.lang.WordUtils.uncapitalize("HhhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhIhHHI!hHHI!iHHI!!", charArray15);
        java.lang.String str28 = org.apache.commons.lang.WordUtils.capitalize("hHHHI!IHHI!HI!!H", charArray15);
        java.lang.String str29 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHHHHI!HHHHHHHI!IHHIHHHHI!HHHI!IHHI!!", charArray15);
        java.lang.String str30 = org.apache.commons.lang.WordUtils.uncapitalize("hhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!HhHHHI!HHHI!IHHI!!HhHHHI!HHHI!IHHI!!IhHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!HhHHHI!HHHI!IHHI!!IhHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!!", charArray15);
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
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "HhhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhIhHHI!hHHI!iHHI!!" + "'", str27, "HhhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhIhHHI!hHHI!iHHI!!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hHHHI!IHHI!HI!!H" + "'", str28, "hHHHI!IHHI!HI!!H");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hHHHHHI!HHHHHHHI!IHHIHHHHI!HHHI!IHHI!!" + "'", str29, "hHHHHHI!HHHHHHHI!IHHIHHHHI!HHHI!IHHI!!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!HhHHHI!HHHI!IHHI!!HhHHHI!HHHI!IHHI!!IhHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!HhHHHI!HHHI!IHHI!!IhHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!!" + "'", str30, "hhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!HhHHHI!HHHI!IHHI!!HhHHHI!HHHI!IHHI!!IhHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!HhHHHI!HHHI!IHHI!!IhHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!!");
    }
}

