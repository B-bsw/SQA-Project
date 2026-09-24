package org.apache.commons.lang;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest19 {

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
    public void test9501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9501");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhHHHI!IHHI!HI!!ihHHHI!IHHI!HI!!!", 100, (int) (byte) 10, "HHHI!IHHI!HHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end 100, length 33");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test9502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9502");
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
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalize("hH", charArray12);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalize("hHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HhHHhHH", charArray12);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalize("HHhhhi!ihhi!!HHhhhi!ihhi!!HHhhhi!ihHhhhi!hhhiHhhi!hhhi!ihhi!!hi!!IHhhhi!ihhi!!!Hhhhi!ihhi!!HHhhhHhhhi!hhhiHhhi!hhhi!ihhi!!i!ihhi!!HHhhhi!ihhi!!HHhhhi!ihhi!!IHhhhi!hhhiHhhi!hhhi!ihhi!!Hhhhi!ihhi!!!Hhhhi!ihhi!!IHhhhi!ihhHhhhi!hhhiHhhi!hhhi!ihhi!!i!!HHhhhi!ihhi!!HHhhhi!ihhi!!IHhhhiHhhhi!hhhiHhhi!hhhi!ihhi!!!ihhi!!!Hhhhi!ihhi!!!", charArray12);
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hH" + "'", str22, "hH");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HhHHhHH" + "'", str23, "hHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HhHHhHH");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "HHhhhi!ihhi!!HHhhhi!ihhi!!HHhhhi!ihHhhhi!hhhiHhhi!hhhi!ihhi!!hi!!IHhhhi!ihhi!!!Hhhhi!ihhi!!HHhhhHhhhi!hhhiHhhi!hhhi!ihhi!!i!ihhi!!HHhhhi!ihhi!!HHhhhi!ihhi!!IHhhhi!hhhiHhhi!hhhi!ihhi!!Hhhhi!ihhi!!!Hhhhi!ihhi!!IHhhhi!ihhHhhhi!hhhiHhhi!hhhi!ihhi!!i!!HHhhhi!ihhi!!HHhhhi!ihhi!!IHhhhiHhhhi!hhhiHhhi!hhhi!ihhi!!!ihhi!!!Hhhhi!ihhi!!!" + "'", str24, "HHhhhi!ihhi!!HHhhhi!ihhi!!HHhhhi!ihHhhhi!hhhiHhhi!hhhi!ihhi!!hi!!IHhhhi!ihhi!!!Hhhhi!ihhi!!HHhhhHhhhi!hhhiHhhi!hhhi!ihhi!!i!ihhi!!HHhhhi!ihhi!!HHhhhi!ihhi!!IHhhhi!hhhiHhhi!hhhi!ihhi!!Hhhhi!ihhi!!!Hhhhi!ihhi!!IHhhhi!ihhHhhhi!hhhiHhhi!hhhi!ihhi!!i!!HHhhhi!ihhi!!HHhhhi!ihhi!!IHhhhiHhhhi!hhhiHhhi!hhhi!ihhi!!!ihhi!!!Hhhhi!ihhi!!!");
    }

    @Test
    public void test9503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9503");
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
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!ihhi!hhhhi!ihhi!hi!!h", charArray14);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHI!IHHI!hhHHI!HHHI!Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!", charArray14);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.uncapitalize("hhh", charArray14);
        java.lang.String str27 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhhi!ihhihhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!", charArray14);
        java.lang.String str28 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhi!ihhihi!!hi!!", charArray14);
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
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Hhhi!ihhi!hhhhi!ihhi!hi!!h" + "'", str24, "Hhhi!ihhi!hhhhi!ihhi!hi!!h");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hHHI!IHHI!hhHHI!HHHI!Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!" + "'", str25, "hHHI!IHHI!hhHHI!HHHI!Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hhh" + "'", str26, "hhh");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhhi!ihhihhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!" + "'", str27, "hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhhi!ihhihhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Hhhhi!ihhihi!!hi!!" + "'", str28, "Hhhhi!ihhihi!!hi!!");
    }

    @Test
    public void test9504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9504");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hHHHI!HHHIhHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!iHHHI!hHHI!iHHI!!!HHHIhhhhi!hhhihhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHHI!HHHIhHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!iHHHI!hHHI!iHHI!!!HHHIhhhhi!hhhihhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!h" + "'", str1, "HHHHI!HHHIhHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!iHHHI!hHHI!iHHI!!!HHHIhhhhi!hhhihhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!h");
    }

    @Test
    public void test9505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9505");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("Hhhhi!ihhihhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhihhhhi!ihhi!hi!!h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!ihhihhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhihhhhi!ihhi!hi!!h" + "'", str1, "Hhhhi!ihhihhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhihhhhi!ihhi!hi!!h");
    }

    @Test
    public void test9506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9506");
        char[] charArray13 = new char[] { '#', '4', '4', '4' };
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray13);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray13);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("", charArray13);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray13);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!Hhhi!Ihhi!!", charArray13);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.initials("HHHi!iHHi!HHHI!IHHI!!hi!!", charArray13);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.initials("Hhhi!ihhi!hi!!", charArray13);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalize("", charArray13);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '#', '4', '4', '4' });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hi!" + "'", str14, "Hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hi!" + "'", str15, "Hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H" + "'", str17, "H");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hhhi!Hhhi!Ihhi!!" + "'", str18, "Hhhi!Hhhi!Ihhi!!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H" + "'", str19, "H");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H" + "'", str20, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test9507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9507");
        char[] charArray11 = new char[] {};
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("hi!", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray11);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("", charArray11);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("hH", charArray11);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("Hh", charArray11);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.uncapitalize("HHI!iHI!!", charArray11);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.initials("HHhhi!", charArray11);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.initials("Hhhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] {});
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hi!" + "'", str15, "Hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hH" + "'", str18, "hH");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Hh" + "'", str19, "Hh");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HHI!iHI!!" + "'", str20, "HHI!iHI!!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test9508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9508");
        char[] charArray9 = new char[] {};
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("Hh", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("Hi!", charArray9);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("H", charArray9);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("hHI!", charArray9);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!H", charArray9);
        java.lang.Class<?> wildcardClass19 = charArray9.getClass();
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hi!" + "'", str12, "Hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hh" + "'", str14, "Hh");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hi!" + "'", str15, "Hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hHI!" + "'", str17, "hHI!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!H" + "'", str18, "HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!H");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test9509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9509");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!!" + "'", str2, "Hhhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!!");
    }

    @Test
    public void test9510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9510");
        char[] charArray9 = new char[] {};
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("h", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("hhi!", charArray9);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("Hhhhh", charArray9);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("hHhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!", charArray9);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhhhhhhi!ihhhhhhhi!ihhhhhhi!ihhihhhhhhhhhihh!hhhhhhhhi!ihhi!hhhhhhihh!hhihhhhhhhhihh!hh!i!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhhhhhi!ihhhhhhhi!ihhhhhi!ihhi!hhhhi!ihhihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhhhhi!ihhi!i!ihhi!!hhhhhi!ihhhhhhhi!ihhhhhhi!ihhihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!hhhi!ihhi!!!", charArray9);
        java.lang.Class<?> wildcardClass19 = charArray9.getClass();
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hi!" + "'", str12, "Hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "h" + "'", str14, "h");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hHhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!" + "'", str17, "hHhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhhhhhhi!ihhhhhhhi!ihhhhhhi!ihhihhhhhhhhhihh!hhhhhhhhi!ihhi!hhhhhhihh!hhihhhhhhhhihh!hh!i!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhhhhhi!ihhhhhhhi!ihhhhhi!ihhi!hhhhi!ihhihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhhhhi!ihhi!i!ihhi!!hhhhhi!ihhhhhhhi!ihhhhhhi!ihhihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!hhhi!ihhi!!!" + "'", str18, "Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhhhhhhi!ihhhhhhhi!ihhhhhhi!ihhihhhhhhhhhihh!hhhhhhhhi!ihhi!hhhhhhihh!hhihhhhhhhhihh!hh!i!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhhhhhi!ihhhhhhhi!ihhhhhi!ihhi!hhhhi!ihhihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhhhhi!ihhi!i!ihhi!!hhhhhi!ihhhhhhhi!ihhhhhhi!ihhihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!hhhi!ihhi!!!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test9511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9511");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhihhhi!hhhi!ihhi!!", 0, (int) (short) -1, "Hhi!hhi!hhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhhhhhhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhhi!ihhihhhi!ihhhhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!IhhiHHHHi!iHHi!hi!!H");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhihhhi!hhhi!ihhi!!" + "'", str4, "Hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhihhhi!hhhi!ihhi!!");
    }

    @Test
    public void test9512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9512");
        char[] charArray7 = new char[] {};
        java.lang.String str8 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("H", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("hhI!", charArray7);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("HHHHI!HHHIHHHi!iHHi!hi!!!IHHI!!", charArray7);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHIHHHI!HHHI!IHHI!!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H" + "'", str11, "H");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HHHHI!HHHIHHHi!iHHi!hi!!!IHHI!!" + "'", str13, "HHHHI!HHHIHHHi!iHHi!hi!!!IHHI!!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test9513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9513");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hhhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhi!ihhi!!hhhi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhi!ihhi!!hhhi!" + "'", str1, "hhhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhi!ihhi!!hhhi!");
    }

    @Test
    public void test9514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9514");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hHHHI!IHHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test9515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9515");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhhi!ihhi!HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHIHHhHHI!HhHHI!HhHHI!IhHHI!!hHHI!IhHHHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHHHH", 1, (int) (short) 1, "HhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!!" + "'", str4, "hHhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!!");
    }

    @Test
    public void test9516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9516");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("HHhHHI!HhHHI!HhHHI!IhHHI!!hHHI!IhHHI!HhHHI!HhHHI!IhHHI!!hHHI!HhHHI!HhHHI!HhHHI!IhHHI!!hHHI!IhHHI!HhHHI!HhHHI!IhHHI!!hHHI!!hHHI!HhHHI!IhHHI!!hHHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhhi!hhhhi!hhhhi!ihhhi!!hhhi!ihhhi!hhhhi!hhhhi!ihhhi!!hhhi!hhhhi!hhhhi!hhhhi!ihhhi!!hhhi!ihhhi!hhhhi!hhhhi!ihhhi!!hhhi!!hhhi!hhhhi!ihhhi!!hhhi!!" + "'", str1, "Hhhhhi!hhhhi!hhhhi!ihhhi!!hhhi!ihhhi!hhhhi!hhhhi!ihhhi!!hhhi!hhhhi!hhhhi!hhhhi!ihhhi!!hhhi!ihhhi!hhhhi!hhhhi!ihhhi!!hhhi!!hhhi!hhhhi!ihhhi!!hhhi!!");
    }

    @Test
    public void test9517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9517");
        char[] charArray9 = new char[] {};
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("Hi!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("HHhi!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("HHH", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("hHHI!HHHI!IHHI!!", charArray9);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("hhI!HhI!HhI!HhI!ihI!!hI!ihI!HhI!HhIHhhhhhhhhhhhhhhhihhh!hhhhhhhhhhhhhhhihhh!hhhihhhhhhhhhhhihhh!hhh!", charArray9);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("HHHI!HHHI!HHI!HHHI!", charArray9);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!HHHI!IHHI!!HI!!hi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hi!" + "'", str12, "Hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HHhi!" + "'", str13, "HHhi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HHH" + "'", str14, "HHH");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hHHI!HHHI!IHHI!!" + "'", str15, "hHHI!HHHI!IHHI!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hhI!HhI!HhI!HhI!ihI!!hI!ihI!HhI!HhIHhhhhhhhhhhhhhhhihhh!hhhhhhhhhhhhhhhihhh!hhhihhhhhhhhhhhihhh!hhh!" + "'", str16, "hhI!HhI!HhI!HhI!ihI!!hI!ihI!HhI!HhIHhhhhhhhhhhhhhhhihhh!hhhhhhhhhhhhhhhihhh!hhhihhhhhhhhhhhihhh!hhh!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HHHI!HHHI!HHI!HHHI!" + "'", str17, "HHHI!HHHI!HHI!HHHI!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!HHHI!IHHI!!HI!!hi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!" + "'", str18, "Hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!HHHI!IHHI!!HI!!hi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
    }

    @Test
    public void test9518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9518");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("Hhi!hhi!hhHhhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhihhi!hhi!hhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhHhhhI!IhhI!hHhhhhhI!IhhI!hHhhhhhI!IhhI!hHhhhhhI!IhhI!hHhhhhhI!IhhI!hHhihhhI!IhhI!hHh!hhhI!IhhI!hHhhhhhI!IhhI!hHhhhhhI!IhhI!hHhhhhhI!IhhI!hHhhhhhI!IhhI!hHhHhhhI!IhhI!hHhHhhhI!IhhI!hHhIhhhI!IhhI!hHh!hhhI!IhhI!hHhHhhhI!IhhI!hHhHhhhI!IhhI!hHhHhhhI!IhhI!hHhIhhhI!IhhI!hHh!hhhI!IhhI!hHhIhhhI!IhhI!hHhHhhhI!IhhI!hHhHhhhI!IhhI!hHhIhhhI!IhhI!hHh!hhhI!IhhI!hHh!hhh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhi!hhi!hhHhhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhihhi!hhi!hhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhHhhhI!IhhI!hHhhhhhI!IhhI!hHhhhhhI!IhhI!hHhhhhhI!IhhI!hHhhhhhI!IhhI!hHhihhhI!IhhI!hHh!hhhI!IhhI!hHhhhhhI!IhhI!hHhhhhhI!IhhI!hHhhhhhI!IhhI!hHhhhhhI!IhhI!hHhHhhhI!IhhI!hHhHhhhI!IhhI!hHhIhhhI!IhhI!hHh!hhhI!IhhI!hHhHhhhI!IhhI!hHhHhhhI!IhhI!hHhHhhhI!IhhI!hHhIhhhI!IhhI!hHh!hhhI!IhhI!hHhIhhhI!IhhI!hHhHhhhI!IhhI!hHhHhhhI!IhhI!hHhIhhhI!IhhI!hHh!hhhI!IhhI!hHh!hhh" + "'", str1, "Hhi!hhi!hhHhhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhihhi!hhi!hhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhHhhhI!IhhI!hHhhhhhI!IhhI!hHhhhhhI!IhhI!hHhhhhhI!IhhI!hHhhhhhI!IhhI!hHhihhhI!IhhI!hHh!hhhI!IhhI!hHhhhhhI!IhhI!hHhhhhhI!IhhI!hHhhhhhI!IhhI!hHhhhhhI!IhhI!hHhHhhhI!IhhI!hHhHhhhI!IhhI!hHhIhhhI!IhhI!hHh!hhhI!IhhI!hHhHhhhI!IhhI!hHhHhhhI!IhhI!hHhHhhhI!IhhI!hHhIhhhI!IhhI!hHh!hhhI!IhhI!hHhIhhhI!IhhI!hHhHhhhI!IhhI!hHhHhhhI!IhhI!hHhIhhhI!IhhI!hHh!hhhI!IhhI!hHh!hhh");
    }

    @Test
    public void test9519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9519");
        char[] charArray7 = new char[] {};
        java.lang.String str8 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("Hh", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("HH", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("hHhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!ihHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!!", charArray7);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("hhHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!IHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!!", charArray7);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHHI!IHHI!!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hh" + "'", str10, "Hh");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HH" + "'", str11, "HH");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hHhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!ihHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!!" + "'", str12, "hHhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!ihHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hHHHI!IHHI!!" + "'", str14, "hHHHI!IHHI!!");
    }

    @Test
    public void test9520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9520");
        char[] charArray10 = new char[] { '#', ' ', '4' };
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("HH", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhhhhi!ihhi!hi!!h", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("hhhi!ihhi!hi!!", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!hhhhi!Hhhi!Ihhi!!hhhhi!Hhhi!Ihhi!!hhhhi!Hhhi!Ihhi!!ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!ihhhi!Hhhi!Ihhi!!hhhhi!Hhhi!Ihhi!!hhhhi!Hhhi!Ihhi!!ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!hhhhi!Hhhi!Ihhi!!ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!h", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("hhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhiHHHI!hHHI!Hhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!!", charArray10);
        java.lang.Class<?> wildcardClass18 = charArray10.getClass();
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '#', ' ', '4' });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hi!" + "'", str11, "Hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H" + "'", str13, "H");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhhhhi!ihhi!hi!!h" + "'", str14, "Hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhhhhi!ihhi!hi!!h");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hhhi!ihhi!hi!!" + "'", str15, "hhhi!ihhi!hi!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!hhhhi!Hhhi!Ihhi!!hhhhi!Hhhi!Ihhi!!hhhhi!Hhhi!Ihhi!!ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!ihhhi!Hhhi!Ihhi!!hhhhi!Hhhi!Ihhi!!hhhhi!Hhhi!Ihhi!!ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!hhhhi!Hhhi!Ihhi!!ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!h" + "'", str16, "Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!hhhhi!Hhhi!Ihhi!!hhhhi!Hhhi!Ihhi!!hhhhi!Hhhi!Ihhi!!ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!ihhhi!Hhhi!Ihhi!!hhhhi!Hhhi!Ihhi!!hhhhi!Hhhi!Ihhi!!ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!hhhhi!Hhhi!Ihhi!!ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!h");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhiHHHI!hHHI!Hhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!!" + "'", str17, "Hhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhiHHHI!hHHI!Hhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!!");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test9521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9521");
        char[] charArray8 = new char[] {};
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("Hh", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("HHhhhi!ihhi!hi!!h", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("HhI!HhI!HhI!HhI!ihI!!hI!ihI!HhI!HhI!ihI!!hI!hhI!ihI!!hI!!", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!ihhi!HHHi!iHHi!hi!!", charArray8);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!hhhi!ihhi!hhhi!ihhi!hhhi!ihhi!!hi!!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhihhhi!ihhi!hhhi!ihhi!hhhi!ihhi!!hi!!!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhhhhi!ihhi!hhhi!ihhi!hhhi!ihhi!!hi!!i!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhhhi!ihhi!hhhi!ihhi!hhhi!ihhi!!hi!!hi!!ihhhi!ihhi!!!hhhi!ihhi!!!", charArray8);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("HHHI!hHHI!HHhi!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hh" + "'", str11, "Hh");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hhhi!ihhi!HHHi!iHHi!hi!!" + "'", str14, "Hhhi!ihhi!HHHi!iHHi!hi!!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HHHI!hHHI!HHhi!" + "'", str16, "HHHI!hHHI!HHhi!");
    }

    @Test
    public void test9522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9522");
        char[] charArray12 = new char[] {};
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray12);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("", charArray12);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray12);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("hH", charArray12);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("hI!", charArray12);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("HI!", charArray12);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("HI!", charArray12);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhI!IhhI!HI!!", charArray12);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.uncapitalize("hhhi!ihhi!!", charArray12);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.initials("HHHHI!HHHIHhi!", charArray12);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalize("Hhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!ihi!!hi!hhi!ihi!!hi!!", charArray12);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.uncapitalize("hHHI!IHHI!hhhhi!ihhihhhhi!hhhi!ihhi!!", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] {});
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hi!" + "'", str15, "Hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hI!" + "'", str17, "hI!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HI!" + "'", str18, "HI!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "HI!" + "'", str19, "HI!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hhhI!IhhI!HI!!" + "'", str20, "hhhI!IhhI!HI!!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hhhi!ihhi!!" + "'", str21, "hhhi!ihhi!!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Hhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!ihi!!hi!hhi!ihi!!hi!!" + "'", str23, "Hhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!ihi!!hi!hhi!ihi!!hi!!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hHHI!IHHI!hhhhi!ihhihhhhi!hhhi!ihhi!!" + "'", str24, "hHHI!IHHI!hhhhi!ihhihhhhi!hhhi!ihhi!!");
    }

    @Test
    public void test9523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9523");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HhHHHI!IHHI!HI!!H", (int) (byte) 10, "hhHHHI!IHHIHHHHHI!IHHI!!HHHHHI!IHHI!!HHHHHI!IHHHHHI!HHHIHHHI!HHHI!IHHI!!HI!!IHHHHI!IHHI!!!HHHHI!IHHI!!HHHHHHHHHI!HHHIHHHI!HHHI!IHHI!!I!IHHI!!HHHHHI!IHHI!!HHHHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHI!IHHI!!!HHHHI!IHHI!!IHHHHI!IHHHHHHI!HHHIHHHI!HHHI!IHHI!!I!!HHHHHI!IHHI!!HHHHHI!IHHI!!IHHHHIHHHHI!HHHIHHHI!HHHI!IHHI!!!IHHI!!!HHHHI!IHHI!!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HhHHHI!IHHI!HI!!H" + "'", str4, "HhHHHI!IHHI!HI!!H");
    }

    @Test
    public void test9524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9524");
        char[] charArray8 = new char[] {};
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("hi!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("hHHI!hHHI!iHHI!!", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhi!hhhi!ihhi!!", charArray8);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!ihhi!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihhhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!!hhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!!hhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!!", charArray8);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("Hhhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhihhi!hhi!hhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhHhhhI!IhhI!hHhhhhhI!IhhI!hHhhhhhI!IhhI!hHhhhhhI!IhhI!hHhhhhhI!IhhI!hHhihhhI!IhhI!hHh!hhhI!IhhI!hHhhhhhI!IhhI!hHhhhhhI!IhhI!hHhhhhhI!IhhI!hHhhhhhI!IhhI!hHhHhhhI!IhhI!hHhHhhhI!IhhI!hHhIhhhI!IhhI!hHh!hhhI!IhhI!hHhHhhhI!IhhI!hHhHhhhI!IhhI!hHhHhhhI!IhhI!hHhIhhhI!IhhI!hHh!hhhI!IhhI!hHhIhhhI!IhhI!hHhHhhhI!IhhI!hHhHhhhI!IhhI!hHhIhhhI!IhhI!hHh!hhhI!IhhI!hHh!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hi!" + "'", str12, "Hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hHHI!hHHI!iHHI!!" + "'", str13, "hHHI!hHHI!iHHI!!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hhhi!hhhi!ihhi!!" + "'", str14, "hhhi!hhhi!ihhi!!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hhhi!ihhi!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihhhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!!hhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!!hhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!!" + "'", str15, "Hhhi!ihhi!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihhhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!!hhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!!hhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hhhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhihhi!hhi!hhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhHhhhI!IhhI!hHhhhhhI!IhhI!hHhhhhhI!IhhI!hHhhhhhI!IhhI!hHhhhhhI!IhhI!hHhihhhI!IhhI!hHh!hhhI!IhhI!hHhhhhhI!IhhI!hHhhhhhI!IhhI!hHhhhhhI!IhhI!hHhhhhhI!IhhI!hHhHhhhI!IhhI!hHhHhhhI!IhhI!hHhIhhhI!IhhI!hHh!hhhI!IhhI!hHhHhhhI!IhhI!hHhHhhhI!IhhI!hHhHhhhI!IhhI!hHhIhhhI!IhhI!hHh!hhhI!IhhI!hHhIhhhI!IhhI!hHhHhhhI!IhhI!hHhHhhhI!IhhI!hHhIhhhI!IhhI!hHh!hhhI!IhhI!hHh!" + "'", str16, "Hhhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhihhi!hhi!hhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhHhhhI!IhhI!hHhhhhhI!IhhI!hHhhhhhI!IhhI!hHhhhhhI!IhhI!hHhhhhhI!IhhI!hHhihhhI!IhhI!hHh!hhhI!IhhI!hHhhhhhI!IhhI!hHhhhhhI!IhhI!hHhhhhhI!IhhI!hHhhhhhI!IhhI!hHhHhhhI!IhhI!hHhHhhhI!IhhI!hHhIhhhI!IhhI!hHh!hhhI!IhhI!hHhHhhhI!IhhI!hHhHhhhI!IhhI!hHhHhhhI!IhhI!hHhIhhhI!IhhI!hHh!hhhI!IhhI!hHhIhhhI!IhhI!hHhHhhhI!IhhI!hHhHhhhI!IhhI!hHhIhhhI!IhhI!hHh!hhhI!IhhI!hHh!");
    }

    @Test
    public void test9525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9525");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HhHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHHhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!hHhhhi!hhhi!ihhi!!hHhhhi!hhhi!ihhi!!iHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!hHhhhi!hhhi!ihhi!!iHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!!", (int) (byte) 0, "hhhhi!hhhiHHHHHi!iHHhHHHI!HHHIhHHI!HHHI!IHHI!!i!!HHHHi!ihHHHI!HHHIhHHI!HHHI!IHHI!!HHi!!hHHHihHHHI!HHHIhHHI!HHHI!IHHI!!!iHHi!!iHHhHHHI!HHHIhHHI!HHHI!IHHI!!Hi!iHHi!!!hHHHI!HHHIhHHI!HHHI!IHHI!!hHHHHi!iHHhHHHI!HHHIhHHI!HHHI!IHHI!!i!!HHHHi!ihHHHI!HHHIhHHI!HHHI!IHHI!!HHi!!hHHHihHHHI!HHHIhHHI!HHHI!IHHI!!!iHHi!!iHHhHHHI!HHHIhHHI!HHHI!IHHI!!Hi!iHHi!!!hHHHI!HHHIhHHI!HHHI!IHHI!!IHHHHi!iHHhHHHI!HHHIhHHI!HHHI!IHHI!!i!!HHHHi!ihHHHI!HHHIhHHI!HHHI!IHHI!!HHi!!hHHHihHHHI!HHHIhHHI!HHHI!IHHI!!!iHHi!!iHHhHHHI!HHHIhHHI!HHHI!IHHI!!Hi!iHHi!!!hHHHI!HHHIhHHI!HHHI!IHHI!!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HhHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHHhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!hHhhhi!hhhi!ihhi!!hHhhhi!hhhi!ihhi!!iHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!hHhhhi!hhhi!ihhi!!iHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!!" + "'", str4, "HhHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHHhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!hHhhhi!hhhi!ihhi!!hHhhhi!hhhi!ihhi!!iHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!hHhhhi!hhhi!ihhi!!iHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!!");
    }

    @Test
    public void test9526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9526");
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
        java.lang.String str24 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!", charArray13);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!", charArray13);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.initials("hhhhi!ihhihhhi!ihhi!hhhhhhhhhihhhHHHI!HHHIhhhhi!hhhihhhI!IhhI!HI!!!ihhi!!!hhhhhhhhhhhihh!hhihhhhhhhhihh!hhHHHI!HHHIhhhhi!hhhihhhI!IhhI!HI!!!ihhi!!h!", charArray13);
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
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!" + "'", str24, "Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!" + "'", str25, "hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test9527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9527");
        char[] charArray7 = new char[] {};
        java.lang.String str8 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("hI!", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("h", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("", charArray7);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("HHI!iHI!!", charArray7);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!HhHhhhi!ihhi!HHHi!iHHi!hi!!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hI!" + "'", str9, "hI!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HI!" + "'", str11, "HI!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HHI!iHI!!" + "'", str13, "HHI!iHI!!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!HhHhhhi!ihhi!HHHi!iHHi!hi!!" + "'", str14, "hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!HhHhhhi!ihhi!HHHi!iHHi!hi!!");
    }

    @Test
    public void test9528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9528");
        char[] charArray11 = new char[] {};
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("Hh", charArray11);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("HHHi!iHHi!!", charArray11);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("H", charArray11);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray11);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("hHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHHHHI!IHHI!HHI!IHI!!HI!!", charArray11);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.initials("HhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!", charArray11);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!", charArray11);
        java.lang.Class<?> wildcardClass23 = charArray11.getClass();
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] {});
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hi!" + "'", str14, "Hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hh" + "'", str16, "Hh");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHHHHI!IHHI!HHI!IHI!!HI!!" + "'", str20, "hHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHHHHI!IHHI!HHI!IHI!!HI!!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!" + "'", str22, "Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test9529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9529");
        char[] charArray9 = new char[] {};
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("hi!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("", charArray9);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("HhhI!IhhI!Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!", charArray9);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhHhh", charArray9);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("Hhhi!hhhi!hhhi!Ihhi!!hhi!Ihhi!hhhi!Hhhi!hhhi!hhhi!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hi!" + "'", str13, "Hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HhhI!IhhI!Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!" + "'", str16, "HhhI!IhhI!Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhHhh" + "'", str17, "Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhHhh");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test9530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9530");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHhhhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhhhhi!hhhihhhi!hhhi!ihhi!!hi!!ihhhhi!ihhi!!!hhhhi!ihhi!!hhhhhhHHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!IHHHi!iHHi!!HHHHi!iHHi!!HHHHhHHI!IHHI!hhi!Ihi!!HI!!hhhi!hhhihhhi!hhhi!ihhi!!i!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!hhhhi!ihhi!HHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!IHHHi!iHHi!!HHHHi!iHHi!!HHHHhHHI!IHHI!hhi!Ihi!!HI!!!!hhhhi!ihhi!!ihhhhi!ihhhhhhi!hhhihhhi!hhhi!ihhi!!i!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhihhhhi!hhhihhHHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!IHHHi!iHHi!!HHHHi!iHHi!!HHHHhHHI!IHHI!hhi!Ihi!!HI!!hi!hhhi!ihhi!!!ihhi!!!hhhhi!ihhi!!!", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHhhhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhhhhi!hhhihhhi!hhhi!ihhi!!hi!!ihhhhi!ihhi!!!hhhhi!ihhi!!hhhhhhHHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!IHHHi!iHHi!!HHHHi!iHHi!!HHHHhHHI!IHHI!hhi!Ihi!!HI!!hhhi!hhhihhhi!hhhi!ihhi!!i!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!hhhhi!ihhi!HHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!IHHHi!iHHi!!HHHHi!iHHi!!HHHHhHHI!IHHI!hhi!Ihi!!HI!!!!hhhhi!ihhi!!ihhhhi!ihhhhhhi!hhhihhhi!hhhi!ihhi!!i!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhihhhhi!hhhihhHHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!IHHHi!iHHi!!HHHHi!iHHi!!HHHHhHHI!IHHI!hhi!Ihi!!HI!!hi!hhhi!ihhi!!!ihhi!!!hhhhi!ihhi!!!" + "'", str2, "hHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHhhhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhhhhi!hhhihhhi!hhhi!ihhi!!hi!!ihhhhi!ihhi!!!hhhhi!ihhi!!hhhhhhHHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!IHHHi!iHHi!!HHHHi!iHHi!!HHHHhHHI!IHHI!hhi!Ihi!!HI!!hhhi!hhhihhhi!hhhi!ihhi!!i!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!hhhhi!ihhi!HHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!IHHHi!iHHi!!HHHHi!iHHi!!HHHHhHHI!IHHI!hhi!Ihi!!HI!!!!hhhhi!ihhi!!ihhhhi!ihhhhhhi!hhhihhhi!hhhi!ihhi!!i!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhihhhhi!hhhihhHHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!IHHHi!iHHi!!HHHHi!iHHi!!HHHHhHHI!IHHI!hhi!Ihi!!HI!!hi!hhhi!ihhi!!!ihhi!!!hhhhi!ihhi!!!");
    }

    @Test
    public void test9531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9531");
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
        java.lang.String str20 = org.apache.commons.lang.WordUtils.initials("Hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhhhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!!", charArray10);
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test9532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9532");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HhhI!IhhI!Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!", 0, (int) (byte) -1, "HHhhi!hHhhi!hHhhi!iHhhi!!Hhhi!iHhhi!hHhhi!hHhhi!iHhhi!!Hhhi!hHhhi!hHhhi!hHhhi!iHhhi!!Hhhi!iHhhi!hHhhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!i!hHhhi!iHhhi!!Hhhi!!Hhhi!hHhhi!iHhhi!!Hhhi!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HhhI!IhhI!Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!" + "'", str4, "HhhI!IhhI!Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!");
    }

    @Test
    public void test9533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9533");
        char[] charArray8 = new char[] {};
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("H", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("hhI!", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("hH", charArray8);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("hhhI!IhhI!hHHHi!iHHi!hi!!H", charArray8);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("HhHI!", charArray8);
        java.lang.Class<?> wildcardClass17 = charArray8.getClass();
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H" + "'", str12, "H");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hhhI!IhhI!hHHHi!iHHi!hi!!H" + "'", str15, "hhhI!IhhI!hHHHi!iHHi!hi!!H");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test9534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9534");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HhhhhI!IhhHHHI!IHHI!hhhI!IhhI!HI!!", (int) (byte) 10, (int) (short) 100, "HhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHIhHI!HHI!HHHHHHI!HHHI!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HhhhhI!IhhHHHI!IHHI!hhhI!IhhI!HI!!" + "'", str4, "HhhhhI!IhhHHHI!IHHI!hhhI!IhhI!HI!!");
    }

    @Test
    public void test9535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9535");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hHHI!HHHI!Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHI!HHHI!Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!" + "'", str1, "HHHI!HHHI!Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
    }

    @Test
    public void test9536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9536");
        char[] charArray12 = new char[] {};
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray12);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("", charArray12);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("hi!", charArray12);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray12);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("", charArray12);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray12);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("H", charArray12);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("HhHI!", charArray12);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray12);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalize("Hhhhi!ihhi!hhhi!ihhi!!hi!!", charArray12);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalize("hHHHi!iHHi!hi!!", charArray12);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.initials("HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] {});
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HI!" + "'", str16, "HI!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hi!" + "'", str18, "Hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H" + "'", str19, "H");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HhHI!" + "'", str20, "HhHI!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "HI!" + "'", str21, "HI!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Hhhhi!ihhi!hhhi!ihhi!!hi!!" + "'", str22, "Hhhhi!ihhi!hhhi!ihhi!!hi!!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hHHHi!iHHi!hi!!" + "'", str23, "hHHHi!iHHi!hi!!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test9537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9537");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hHhhi!ihhi!hi!!HHhhi!ihhi!hi!!HHhhi!ihhi!hi!!IHhhi!ihhi!hi!!!Hhhi!ihhi!hi!!IHhhi!ihhi!hi!!HHhhi!ihhih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test9538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9538");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHHI!IHHI!HHHI!IHHI!HHHI!IHHI!!HI!!", (int) (short) 1, (int) ' ', "hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHI!IHHI!HHHI!IHHI!HHHI!IHHI!!HhhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!" + "'", str4, "hHHI!IHHI!HHHI!IHHI!HHHI!IHHI!!HhhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!");
    }

    @Test
    public void test9539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9539");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("Hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!", (int) (short) -1, "HHI!HHI!HHHHHHI!HHHI!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!" + "'", str4, "Hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!");
    }

    @Test
    public void test9540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9540");
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
        java.lang.String str24 = org.apache.commons.lang.WordUtils.uncapitalize("HH", charArray14);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.uncapitalize("HH", charArray14);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.capitalizeFully("hHi!", charArray14);
        java.lang.String str27 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhi!ihhi!hi!!", charArray14);
        java.lang.String str28 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!hhhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!hhhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!hhhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!ihhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!!hhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!ihhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!hhhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!hhhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!ihhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!!hhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!!", charArray14);
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
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "HH" + "'", str24, "HH");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "HH" + "'", str25, "HH");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hHi!" + "'", str26, "hHi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Hhhhi!ihhi!hi!!" + "'", str27, "Hhhhi!ihhi!hi!!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Hhhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!hhhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!hhhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!hhhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!ihhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!!hhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!ihhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!hhhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!hhhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!ihhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!!hhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!!" + "'", str28, "Hhhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!hhhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!hhhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!hhhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!ihhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!!hhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!ihhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!hhhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!hhhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!ihhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!!hhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!!");
    }

    @Test
    public void test9541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9541");
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
        java.lang.String str25 = org.apache.commons.lang.WordUtils.uncapitalize("hHhhI!IhhI!hhhi!ihhi!!HI!!", charArray14);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.capitalize("", charArray14);
        java.lang.String str27 = org.apache.commons.lang.WordUtils.initials("Hhhhhi!ihhhhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!", charArray14);
        java.lang.String str28 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhi!hhi!hhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!", charArray14);
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
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hHhhI!IhhI!hhhi!ihhi!!HI!!" + "'", str25, "hHhhI!IhhI!hhhi!ihhi!!HI!!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Hhi!hhi!hhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!" + "'", str28, "Hhi!hhi!hhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
    }

    @Test
    public void test9542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9542");
        char[] charArray7 = new char[] {};
        java.lang.String str8 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("hi!", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray7);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("hHI!", charArray7);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("Hhhhhi!hhhhHHI!HHHI!IHHI!!", charArray7);
        java.lang.Class<?> wildcardClass15 = charArray7.getClass();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hi!" + "'", str11, "Hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hi!" + "'", str12, "Hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hHI!" + "'", str13, "hHI!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hhhhhi!hhhhHHI!HHHI!IHHI!!" + "'", str14, "Hhhhhi!hhhhHHI!HHHI!IHHI!!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test9543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9543");
        char[] charArray9 = new char[] {};
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("hi!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("", charArray9);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("hH", charArray9);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!hhhi!ihhi!hhhi!ihhi!hhhi!ihhi!!hi!!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhihhhhi!hhhi!ihhi!!", charArray9);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("hHHI!HHHI!HHHI!iHHI!!HHI!iHHI!HHHI!hHHI!HHHI!HHHI!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hi!" + "'", str13, "Hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hH" + "'", str16, "hH");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hHHI!HHHI!HHHI!iHHI!!HHI!iHHI!HHHI!hHHI!HHHI!HHHI!" + "'", str18, "hHHI!HHHI!HHHI!iHHI!!HHI!iHHI!HHHI!hHHI!HHHI!HHHI!");
    }

    @Test
    public void test9544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9544");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhhhI!IhhI!hHhhhhhI!IhhI!hHhhhhhI!IhhI!hHhhhhhI!IhhI!hHhhhhhI!IhhI!hHhihhhI!IhhI!hHh!hhhI!IhhI!hHhhhhhI!IhhI!hHhhhhhI!IhhI!hHhhhhhI!IhhI!hHhhhhhI!IhhI!hHhHhhhI!IhhI!hHhHhhhI!IhhI!hHhIhhhI!IhhI!hHh!hhhI!IhhI!hHhHhhhI!IhhI!hHhHhhhI!IhhI!hHhHhhhI!IhhI!hHhIhhhI!IhhI!hHh!hhhI!IhhI!hHhIhhhI!IhhI!hHhHhhhI!IhhI!hHhHhhhI!IhhI!hHhIhhhI!IhhI!hHh!hhhI!IhhI!hHh!", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhhI!IhhI!hHhhhhhI!IhhI!hHhhhhhI!IhhI!hHhhhhhI!IhhI!hHhhhhhI!IhhI!hHhihhhI!IhhI!hHh!hhhI!IhhI!hHhhhhhI!IhhI!hHhhhhhI!IhhI!hHhhhhhI!IhhI!hHhhhhhI!IhhI!hHhHhhhI!IhhI!hHhHhhhI!IhhI!hHhIhhhI!IhhI!hHh!hhhI!IhhI!hHhHhhhI!IhhI!hHhHhhhI!IhhI!hHhHhhhI!IhhI!hHhIhhhI!IhhI!hHh!hhhI!IhhI!hHhIhhhI!IhhI!hHhHhhhI!IhhI!hHhHhhhI!IhhI!hHhIhhhI!IhhI!hHh!hhhI!IhhI!hHh!" + "'", str2, "hhhhI!IhhI!hHhhhhhI!IhhI!hHhhhhhI!IhhI!hHhhhhhI!IhhI!hHhhhhhI!IhhI!hHhihhhI!IhhI!hHh!hhhI!IhhI!hHhhhhhI!IhhI!hHhhhhhI!IhhI!hHhhhhhI!IhhI!hHhhhhhI!IhhI!hHhHhhhI!IhhI!hHhHhhhI!IhhI!hHhIhhhI!IhhI!hHh!hhhI!IhhI!hHhHhhhI!IhhI!hHhHhhhI!IhhI!hHhHhhhI!IhhI!hHhIhhhI!IhhI!hHh!hhhI!IhhI!hHhIhhhI!IhhI!hHhHhhhI!IhhI!hHhHhhhI!IhhI!hHhIhhhI!IhhI!hHh!hhhI!IhhI!hHh!");
    }

    @Test
    public void test9545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9545");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhhhhhhhhhhhhi!hhhhhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhhhhhhhhhhhhi!hhhhhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!" + "'", str1, "Hhhhhhhhhhhhhhhi!hhhhhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
    }

    @Test
    public void test9546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9546");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!Hhhi!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!HHHHIhhhi!hhhi!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhhi!ihhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhi!Hhhi!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!HHHHIhhhi!hhhi!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhhi!ihhi!!" + "'", str1, "hhhi!Hhhi!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!HHHHIhhhi!hhhi!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhhi!ihhi!!");
    }

    @Test
    public void test9547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9547");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.uncapitalize("hhhi!ihhi!HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHIHHhHHI!HhHHI!HhHHI!IhHHI!!hHHI!IhHHHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHHHH", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhi!ihhi!HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHIHHhHHI!HhHHI!HhHHI!IhHHI!!hHHI!IhHHHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHHHH" + "'", str2, "hhhi!ihhi!HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHIHHhHHI!HhHHI!HhHHI!IhHHI!!hHHI!IhHHHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHHHH");
    }

    @Test
    public void test9548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9548");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!iHHHI!hHHI!iHHI!!!HHHI!hHHI!iHHI!!iHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!iHHHI!hHHI!iHHI!!!HHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!iHHHI!hHHI!iHHI!!!HHHI!hHHI!iHHI!!!HHHI!hHHI!iHHI!!h", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!iHHHI!hHHI!iHHI!!!HHHI!hHHI!iHHI!!iHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!iHHHI!hHHI!iHHI!!!HHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!iHHHI!hHHI!iHHI!!!HHHI!hHHI!iHHI!!!HHHI!hHHI!iHHI!!h" + "'", str2, "hhHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!iHHHI!hHHI!iHHI!!!HHHI!hHHI!iHHI!!iHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!iHHHI!hHHI!iHHI!!!HHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!iHHHI!hHHI!iHHI!!!HHHI!hHHI!iHHI!!!HHHI!hHHI!iHHI!!h");
    }

    @Test
    public void test9549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9549");
        char[] charArray6 = new char[] {};
        java.lang.String str7 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray6);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.initials("", charArray6);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("H", charArray6);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("hh", charArray6);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("HH", charArray6);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("HHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IHhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!IhHI!iHI!!!hHI!iHI!!IhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!!hHI!iHI!!ihHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!!hHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!hhHI!iHI!!hhHI!iHI!!!hHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!hhHI!iHI!!hhHI!iHI!!!hHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!hhHI!iHI!!hhHI!iHI!!!hHI!iHI!!hhHI!iHI!!hhHI!iHI!!!", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hh" + "'", str10, "hh");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HH" + "'", str11, "HH");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IHhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!IhHI!iHI!!!hHI!iHI!!IhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!!hHI!iHI!!ihHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!!hHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!hhHI!iHI!!hhHI!iHI!!!hHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!hhHI!iHI!!hhHI!iHI!!!hHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!hhHI!iHI!!hhHI!iHI!!!hHI!iHI!!hhHI!iHI!!hhHI!iHI!!!" + "'", str12, "HHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IHhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!IhHI!iHI!!!hHI!iHI!!IhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!!hHI!iHI!!ihHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!!hHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!hhHI!iHI!!hhHI!iHI!!!hHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!hhHI!iHI!!hhHI!iHI!!!hHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!hhHI!iHI!!hhHI!iHI!!!hHI!iHI!!hhHI!iHI!!hhHI!iHI!!!");
    }

    @Test
    public void test9550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9550");
        char[] charArray13 = new char[] {};
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray13);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("", charArray13);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray13);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray13);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("HhhI!IhhI!!", charArray13);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHi!iHHi!hi!!", charArray13);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray13);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.initials("hhHHi!iHHi!!", charArray13);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhhhhi!hhhihhhi!hhhi!ihhi!!hi!!ihhhhi!ihhi!!!hhhhi!ihhi!!hhhhhhhhhi!hhhihhhi!hhhi!ihhi!!i!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!hhhhi!ihhi!!!hhhhi!ihhi!!ihhhhi!ihhhhhhi!hhhihhhi!hhhi!ihhi!!i!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhihhhhi!hhhihhhi!hhhi!ihhi!!!ihhi!!!hhhhi!ihhi!!!", charArray13);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.uncapitalize("hHHHI!IHHIHhhi!hhhi!hHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HhHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!IHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!!HHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!", charArray13);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.initials("hHhhhi!ihhi!!hHhhhi!ihhi!!hHhhhi!ihhi!!hHhhhi!ihhi!!hHHHI!IHHIHHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHIHHHHI!IHHI!HI!!HiHhhhi!ihhi!!!Hhhhi!ihhi!!iHhhhi!ihhi!!hHhhhi!ihhi!!hHHHI!IHHIHHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHIHHHHI!IHHI!HI!!HhHhhhi!ihhi!!iHhhhi!ihhi!!!Hhhhi!ihhi!!hHhhhi!ihhi!!hHHHI!IHHIHHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHIHHHHI!IHHI!HI!!HiHhhhi!ihhi!!!Hhhhi!ihhi!!!Hhhhi!ihhi!!h", charArray13);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.uncapitalize("HHhHHHI!HHHHHI!HHHI!hHhi!Ihi!!HHhHHHI!IHHIHhhi!hhhi!hhhi!Ihhi!!hhi!Ihhi!hhhi!hhhi!Ihhi!!hhi!Hhhi!Ihhi!!hhi!!", charArray13);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.uncapitalize("hHHI!IHHI!hhhhi!ihhihhhhi!hhhi!ihhi!!", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] {});
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HhhI!IhhI!!" + "'", str18, "HhhI!IhhI!!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "HHHi!iHHi!hi!!" + "'", str19, "HHHi!iHHi!hi!!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Hhhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhhhhi!hhhihhhi!hhhi!ihhi!!hi!!ihhhhi!ihhi!!!hhhhi!ihhi!!hhhhhhhhhi!hhhihhhi!hhhi!ihhi!!i!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!hhhhi!ihhi!!!hhhhi!ihhi!!ihhhhi!ihhhhhhi!hhhihhhi!hhhi!ihhi!!i!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhihhhhi!hhhihhhi!hhhi!ihhi!!!ihhi!!!hhhhi!ihhi!!!" + "'", str22, "Hhhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhhhhi!hhhihhhi!hhhi!ihhi!!hi!!ihhhhi!ihhi!!!hhhhi!ihhi!!hhhhhhhhhi!hhhihhhi!hhhi!ihhi!!i!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!hhhhi!ihhi!!!hhhhi!ihhi!!ihhhhi!ihhhhhhi!hhhihhhi!hhhi!ihhi!!i!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhihhhhi!hhhihhhi!hhhi!ihhi!!!ihhi!!!hhhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hHHHI!IHHIHhhi!hhhi!hHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HhHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!IHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!!HHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!" + "'", str23, "hHHHI!IHHIHhhi!hhhi!hHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HhHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!IHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!!HHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "HHhHHHI!HHHHHI!HHHI!hHhi!Ihi!!HHhHHHI!IHHIHhhi!hhhi!hhhi!Ihhi!!hhi!Ihhi!hhhi!hhhi!Ihhi!!hhi!Hhhi!Ihhi!!hhi!!" + "'", str25, "HHhHHHI!HHHHHI!HHHI!hHhi!Ihi!!HHhHHHI!IHHIHhhi!hhhi!hhhi!Ihhi!!hhi!Ihhi!hhhi!hhhi!Ihhi!!hhi!Hhhi!Ihhi!!hhi!!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hHHI!IHHI!hhhhi!ihhihhhhi!hhhi!ihhi!!" + "'", str26, "hHHI!IHHI!hhhhi!ihhihhhhi!hhhi!ihhi!!");
    }

    @Test
    public void test9551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9551");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("HHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!IHHHi!iHHi!!HHHHi!iHHi!!HHHHhHHI!IHHI!hhi!Ihi!!HI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test9552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9552");
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
        java.lang.String str30 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhhi!ihhhhhhi!hhhihhhi!hhhi!ihhi!!i!!hhhhi!ihhhhi!hhhihhhi!hhhi!ihhi!!hhi!!hhhhihhhhi!hhhihhhi!hhhi!ihhi!!!ihhi!!ihhhhhhi!hhhihhhi!hhhi!ihhi!!hi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!ihhhhhhi!hhhihhhi!hhhi!ihhi!!i!!hhhhi!ihhhhi!hhhihhhi!hhhi!ihhi!!hhi!!hhhhihhhhi!hhhihhhi!hhhi!ihhi!!!ihhi!!ihhhhhhi!hhhihhhi!hhhi!ihhi!!hi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!ihhhhhhi!hhhihhhi!hhhi!ihhi!!i!!hhhhi!ihhhhi!hhhihhhi!hhhi!ihhi!!hhi!!hhhhihhhhi!hhhihhhi!hhhi!ihhi!!!ihhi!!ihhhhhhi!hhhihhhi!hhhi!ihhi!!hi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!!", charArray15);
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
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "HhhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhIhHHI!hHHI!iHHI!!" + "'", str27, "HhhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhIhHHI!hHHI!iHHI!!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hHHHI!IHHI!HI!!H" + "'", str28, "hHHHI!IHHI!HI!!H");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hHHHHHI!HHHHHHHI!IHHIHHHHI!HHHI!IHHI!!" + "'", str29, "hHHHHHI!HHHHHHHI!IHHIHHHHI!HHHI!IHHI!!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Hhhhhi!ihhhhhhi!hhhihhhi!hhhi!ihhi!!i!!hhhhi!ihhhhi!hhhihhhi!hhhi!ihhi!!hhi!!hhhhihhhhi!hhhihhhi!hhhi!ihhi!!!ihhi!!ihhhhhhi!hhhihhhi!hhhi!ihhi!!hi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!ihhhhhhi!hhhihhhi!hhhi!ihhi!!i!!hhhhi!ihhhhi!hhhihhhi!hhhi!ihhi!!hhi!!hhhhihhhhi!hhhihhhi!hhhi!ihhi!!!ihhi!!ihhhhhhi!hhhihhhi!hhhi!ihhi!!hi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!ihhhhhhi!hhhihhhi!hhhi!ihhi!!i!!hhhhi!ihhhhi!hhhihhhi!hhhi!ihhi!!hhi!!hhhhihhhhi!hhhihhhi!hhhi!ihhi!!!ihhi!!ihhhhhhi!hhhihhhi!hhhi!ihhi!!hi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!!" + "'", str30, "Hhhhhi!ihhhhhhi!hhhihhhi!hhhi!ihhi!!i!!hhhhi!ihhhhi!hhhihhhi!hhhi!ihhi!!hhi!!hhhhihhhhi!hhhihhhi!hhhi!ihhi!!!ihhi!!ihhhhhhi!hhhihhhi!hhhi!ihhi!!hi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!ihhhhhhi!hhhihhhi!hhhi!ihhi!!i!!hhhhi!ihhhhi!hhhihhhi!hhhi!ihhi!!hhi!!hhhhihhhhi!hhhihhhi!hhhi!ihhi!!!ihhi!!ihhhhhhi!hhhihhhi!hhhi!ihhi!!hi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!ihhhhhhi!hhhihhhi!hhhi!ihhi!!i!!hhhhi!ihhhhi!hhhihhhi!hhhi!ihhi!!hhi!!hhhhihhhhi!hhhihhhi!hhhi!ihhi!!!ihhi!!ihhhhhhi!hhhihhhi!hhhi!ihhi!!hi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!!");
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test9553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9553");
        char[] charArray10 = new char[] {};
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("hi!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("HhhI!IhhI!Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!", charArray10);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhHhh", charArray10);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.initials("Hhhhi!hhhihhhhi!!ihhi!!", charArray10);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("HhI!HhI!HhhhHHi!iHHi!HHHI!IHHI!!hi!!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hi!" + "'", str14, "Hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HhhI!IhhI!Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!" + "'", str17, "HhhI!IhhI!Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhHhh" + "'", str18, "Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhHhh");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HhI!HhI!HhhhHHi!iHHi!HHHI!IHHI!!hi!!" + "'", str20, "HhI!HhI!HhhhHHi!iHHi!HHHI!IHHI!!hi!!");
    }

    @Test
    public void test9554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9554");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhhi!ihhi!hhhi!hhhi!hhi!hhhi!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhhi!ihhi!hhhi!hhhi!hhi!hhhi!" + "'", str2, "Hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhhi!ihhi!hhhi!hhhi!hhi!hhhi!");
    }

    @Test
    public void test9555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9555");
        char[] charArray9 = new char[] {};
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("hi!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("", charArray9);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!ihhi!!", charArray9);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("H", charArray9);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("HHHI!IHHI!!", charArray9);
        java.lang.Class<?> wildcardClass19 = charArray9.getClass();
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hi!" + "'", str13, "Hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hhhi!ihhi!!" + "'", str16, "Hhhi!ihhi!!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test9556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9556");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhi!ihhi!hhhhhhhi!ihhi!hhhhhhhi!ihhi!hhhhhhhi!ihhi!hhhhhhhi!ihhi!hhhihhhi!ihhi!hhh!hhhi!ihhi!hhhhhHhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhi!ihhi!hhhhhhhi!ihhi!hhhhhhhi!ihhi!hhhhhhhi!ihhi!hhhhhhhi!ihhi!hhhhhhhi!ihhi!hhhihhhi!ihhi!hhh!hhhHhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!i!ihhi!hhhhhhhi!ihhi!hhhhhhhi!ihhi!hhhhhhhi!ihhi!hhhihhhi!ihhi!hhh!hhhi!ihhi!hhhihhhi!ihhi!hhhhhhhi!Hhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhi!hhhhhhhi!ihhi!hhhihhhi!ihhi!hhh!hhhi!ihhi!hhh!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!ihhi!hhhhhhhi!ihhi!hhhhhhhi!ihhi!hhhhhhhi!ihhi!hhhhhhhi!ihhi!hhhihhhi!ihhi!hhh!hhhi!ihhi!hhhhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhi!ihhi!hhhhhhhi!ihhi!hhhhhhhi!ihhi!hhhhhhhi!ihhi!hhhhhhhi!ihhi!hhhhhhhi!ihhi!hhhihhhi!ihhi!hhh!hhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!i!ihhi!hhhhhhhi!ihhi!hhhhhhhi!ihhi!hhhhhhhi!ihhi!hhhihhhi!ihhi!hhh!hhhi!ihhi!hhhihhhi!ihhi!hhhhhhhi!hhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhi!hhhhhhhi!ihhi!hhhihhhi!ihhi!hhh!hhhi!ihhi!hhh!" + "'", str1, "Hhhhi!ihhi!hhhhhhhi!ihhi!hhhhhhhi!ihhi!hhhhhhhi!ihhi!hhhhhhhi!ihhi!hhhihhhi!ihhi!hhh!hhhi!ihhi!hhhhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhi!ihhi!hhhhhhhi!ihhi!hhhhhhhi!ihhi!hhhhhhhi!ihhi!hhhhhhhi!ihhi!hhhhhhhi!ihhi!hhhihhhi!ihhi!hhh!hhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!i!ihhi!hhhhhhhi!ihhi!hhhhhhhi!ihhi!hhhhhhhi!ihhi!hhhihhhi!ihhi!hhh!hhhi!ihhi!hhhihhhi!ihhi!hhhhhhhi!hhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhi!hhhhhhhi!ihhi!hhhihhhi!ihhi!hhh!hhhi!ihhi!hhh!");
    }

    @Test
    public void test9557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9557");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHhHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!!hHI!iHI!!ihHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!!hHI!iHI!!hhHI!iHI!!ihHI!iHI!!!hHI!iHI!!!", (int) (short) 100, (int) (short) 1, "hhi!hhi!hhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!iHhHHI!IHHI!!HhHHI!IHHI!!hhHHI!IHHI!!hhHHI!IHHI!!IhHHI!IHHI!!!hHHI!IHHI!!IhHHI!IHHI!!hhHHI!IHHI!!hhHHI!IHHI!!IhHHI!IHHI!!!hHHI!IHHI!!hhHHI!IHHI!!hhHHI!IHHI!!hhHHI!IHHI!!ihHHI!IHHI!!!hHHI!IHHI!!ihHHI!IHHI!!hhHHI!IHHI!!hhHHI!IHHI!!ihHHI!IHHI!!!hHHI!IHHI!!!hHHI!IHHI!!HhHHI!IHHI!!IhHHI!IHHI!!!hHHI!IHHI!!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHhHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!!hHI!iHI!!ihHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!!hHI!iHI!hhi!hhi!hhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!iHhHHI!IHHI!!HhHHI!IHHI!!hhHHI!IHHI!!hhHHI!IHHI!!IhHHI!IHHI!!!hHHI!IHHI!!IhHHI!IHHI!!hhHHI!IHHI!!hhHHI!IHHI!!IhHHI!IHHI!!!hHHI!IHHI!!hhHHI!IHHI!!hhHHI!IHHI!!hhHHI!IHHI!!ihHHI!IHHI!!!hHHI!IHHI!!ihHHI!IHHI!!hhHHI!IHHI!!hhHHI!IHHI!!ihHHI!IHHI!!!hHHI!IHHI!!!hHHI!IHHI!!HhHHI!IHHI!!IhHHI!IHHI!!!hHHI!IHHI!!!" + "'", str4, "hHhHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!!hHI!iHI!!ihHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!!hHI!iHI!hhi!hhi!hhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!iHhHHI!IHHI!!HhHHI!IHHI!!hhHHI!IHHI!!hhHHI!IHHI!!IhHHI!IHHI!!!hHHI!IHHI!!IhHHI!IHHI!!hhHHI!IHHI!!hhHHI!IHHI!!IhHHI!IHHI!!!hHHI!IHHI!!hhHHI!IHHI!!hhHHI!IHHI!!hhHHI!IHHI!!ihHHI!IHHI!!!hHHI!IHHI!!ihHHI!IHHI!!hhHHI!IHHI!!hhHHI!IHHI!!ihHHI!IHHI!!!hHHI!IHHI!!!hHHI!IHHI!!HhHHI!IHHI!!IhHHI!IHHI!!!hHHI!IHHI!!!");
    }

    @Test
    public void test9558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9558");
        char[] charArray7 = new char[] { '4', '4' };
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalizeFully("HHi!", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("HH", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("Hhhi!hhhi!hhhi!Ihhi!!hhi!Ihhi!hhhi!hhhi!Ihhi!!hhi!Hhhi!Ihhi!!hhi!!", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhi!ihhi!hhhi!ihhi!!hi!!hhhhi!ihhi!hhhi!ihhi!!hi!!hhhhi!ihhi!hhhi!ihhi!!hi!!hhhhi!ihhi!hhhi!ihhhhhhi!ihhihhhhhi!ihhhhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!i!!hi!!ihhhi!ihhi!hhhi!ihhi!!hi!!!hhhi!ihhi!hhhi!ihhi!!hi!!hhhhi!ihhi!hhhi!ihhi!!hi!!hhhhi!ihhi!hhhhhi!ihhihhhhhi!ihhhhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhi!ihhi!!hi!!hhhhi!ihhi!hhhi!ihhi!!hi!!ihhhi!ihhi!hhhi!ihhi!!hi!!!hhhi!ihhi!hhhi!ihhi!!hi!!hhhhihhhhi!ihhihhhhhi!ihhhhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!ihhi!hhhi!ihhi!!hi!!hhhhi!ihhi!hhhi!ihhi!!hi!!hhhhi!ihhi!hhhi!ihhi!!hi!!ihhhi!ihhi!hhhi!ihhi!!hihhhhi!ihhihhhhhi!ihhhhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!!!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hi!" + "'", str8, "Hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Hhi!" + "'", str9, "Hhi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hH" + "'", str10, "hH");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H" + "'", str11, "H");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hhhhi!ihhi!hhhi!ihhi!!hi!!hhhhi!ihhi!hhhi!ihhi!!hi!!hhhhi!ihhi!hhhi!ihhi!!hi!!hhhhi!ihhi!hhhi!ihhhhhhi!ihhihhhhhi!ihhhhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!i!!hi!!ihhhi!ihhi!hhhi!ihhi!!hi!!!hhhi!ihhi!hhhi!ihhi!!hi!!hhhhi!ihhi!hhhi!ihhi!!hi!!hhhhi!ihhi!hhhhhi!ihhihhhhhi!ihhhhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhi!ihhi!!hi!!hhhhi!ihhi!hhhi!ihhi!!hi!!ihhhi!ihhi!hhhi!ihhi!!hi!!!hhhi!ihhi!hhhi!ihhi!!hi!!hhhhihhhhi!ihhihhhhhi!ihhhhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!ihhi!hhhi!ihhi!!hi!!hhhhi!ihhi!hhhi!ihhi!!hi!!hhhhi!ihhi!hhhi!ihhi!!hi!!ihhhi!ihhi!hhhi!ihhi!!hihhhhi!ihhihhhhhi!ihhhhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!!!" + "'", str12, "Hhhhi!ihhi!hhhi!ihhi!!hi!!hhhhi!ihhi!hhhi!ihhi!!hi!!hhhhi!ihhi!hhhi!ihhi!!hi!!hhhhi!ihhi!hhhi!ihhhhhhi!ihhihhhhhi!ihhhhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!i!!hi!!ihhhi!ihhi!hhhi!ihhi!!hi!!!hhhi!ihhi!hhhi!ihhi!!hi!!hhhhi!ihhi!hhhi!ihhi!!hi!!hhhhi!ihhi!hhhhhi!ihhihhhhhi!ihhhhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhi!ihhi!!hi!!hhhhi!ihhi!hhhi!ihhi!!hi!!ihhhi!ihhi!hhhi!ihhi!!hi!!!hhhi!ihhi!hhhi!ihhi!!hi!!hhhhihhhhi!ihhihhhhhi!ihhhhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!ihhi!hhhi!ihhi!!hi!!hhhhi!ihhi!hhhi!ihhi!!hi!!hhhhi!ihhi!hhhi!ihhi!!hi!!ihhhi!ihhi!hhhi!ihhi!!hihhhhi!ihhihhhhhi!ihhhhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!!!");
    }

    @Test
    public void test9559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9559");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhhhi!ihhihhhhi!ihhi!hi!!hhhhi!ihhi!hi!!hhhhi!ihhi!hi!!ihhhi!ihhi!hi!!!hhhi!ihhi!hi!!ihhhi!ihhi!hi!!hhhhi!ihhi!hi!!hhhhi!ihhi!hi!!ihhhi!ihhi!hi!!!hhhi!ihhi!hi!!hhhhi!ihhi!hi!!hhhhi!ihhi!hi!!hhhhi!ihhi!hi!!hhhhi!ihhi!hi!!ihhhi!ihhi!hi!!!hhhi!ihhi!hi!!ihhhi!ihhi!hi!!hhhhi!ihhi!hi!!hhhhi!ihhi!hi!!ihhhi!ihhi!hi!!!hhhi!ihhi!hi!!hhhhi!ihhi!hi!!ihhhi!ihhi!hi!!!hhhi!ihhi!hi!!!hhhi!ihhi!hi!!h", (int) ' ', (int) (short) 0, "HHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!IHHHi!iHHi!!HHHHi!iHHi!!HHHHhHHI!IHHI!hhi!Ihi!!HI!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhhi!ihhihhhhi!ihhi!hi!!hhhhi!iHHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!IHHHi!iHHi!!HHHHi!iHHi!!HHHHhHHI!IHHI!hhi!Ihi!!HI!!" + "'", str4, "hhhhi!ihhihhhhi!ihhi!hi!!hhhhi!iHHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!IHHHi!iHHi!!HHHHi!iHHi!!HHHHhHHI!IHHI!hhi!Ihi!!HI!!");
    }

    @Test
    public void test9560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9560");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HHHI!IHHI!HHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHHHhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHHI!IHHI!HHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHHHhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!" + "'", str2, "HHHI!IHHI!HHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHHHhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
    }

    @Test
    public void test9561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9561");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hhHHI!IHHI!!HhHHI!IHHI!!hhHHI!IHHI!!hhHHI!IHHI!!IhHHI!IHHI!!!hHHI!IHHI!!IhHHI!IHHI!!hhHHI!IHHI!!hhHHI!IHHI!!IhHHI!IHHI!!!hHHI!IHHI!!hhHHI!IHHI!!hhHHI!IHHI!!hhHHI!IHHI!!ihHHI!IHHI!!!hHHI!IHHI!!ihHHI!IHHI!!hhHHI!IHHI!!hhHHI!IHHI!!ihHHI!IHHI!!!hHHI!IHHI!!!hHHI!IHHI!!HhHHI!IHHI!!IhHHI!IHHI!!!hHHI!IHHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test9562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9562");
        char[] charArray8 = new char[] {};
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("h", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("Hhi!", charArray8);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("hhhi!Hhhi!Ihhi!!", charArray8);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("HHHhHHhHHiHH!HHhHHhHHhHHiHH!HHhHHhHHhHHiHH!HHIHHhHHhHHiHH!HH!HHhHHhHHiHH!HHIHHhHHhHHiHH!HHhHHhHHhhHHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!!HHiHH!HHhHHhHHhHHiHH!HHIHHhHHhHHiHH!HH!HHhHHhHHiHH!HHHHHhHHhHHiHH!HHIHHhHHhHHiHH!HH!HHhHHhHHiHH!HhHHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!!H!", charArray8);
        java.lang.Class<?> wildcardClass17 = charArray8.getClass();
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hi!" + "'", str11, "Hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "h" + "'", str13, "h");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hhhi!Hhhi!Ihhi!!" + "'", str15, "hhhi!Hhhi!Ihhi!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HHHhHHhHHiHH!HHhHHhHHhHHiHH!HHhHHhHHhHHiHH!HHIHHhHHhHHiHH!HH!HHhHHhHHiHH!HHIHHhHHhHHiHH!HHhHHhHHhhHHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!!HHiHH!HHhHHhHHhHHiHH!HHIHHhHHhHHiHH!HH!HHhHHhHHiHH!HHHHHhHHhHHiHH!HHIHHhHHhHHiHH!HH!HHhHHhHHiHH!HhHHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!!H!" + "'", str16, "HHHhHHhHHiHH!HHhHHhHHhHHiHH!HHhHHhHHhHHiHH!HHIHHhHHhHHiHH!HH!HHhHHhHHiHH!HHIHHhHHhHHiHH!HHhHHhHHhhHHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!!HHiHH!HHhHHhHHhHHiHH!HHIHHhHHhHHiHH!HH!HHhHHhHHiHH!HHHHHhHHhHHiHH!HHIHHhHHhHHiHH!HH!HHhHHhHHiHH!HhHHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!!H!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test9563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9563");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!HhhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!ihhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!!", (int) (byte) 100, (int) '#', "Hhi!hhi!hhhHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!iHHHI!hHHI!iHHIhhhhI!IhhI!HI!!h");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!HhhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!Hhi!hhi!hhhHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!iHHHI!hHHI!iHHIhhhhI!IhhI!HI!!h" + "'", str4, "hhhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!HhhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!Hhi!hhi!hhhHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!iHHHI!hHHI!iHHIhhhhI!IhhI!HI!!h");
    }

    @Test
    public void test9564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9564");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("HhHHHI!IHHI!!hhHHHI!IHHI!!hhHHHI!IHhHHHI!HHHIhHHI!HHHI!IHHI!!HI!!ihHHHI!IHHI!!!hHHHI!IHHI!!hhHHHhhhhi!hhhi!hhhi!Ihhi!!hhi!Ihhi!hhhi!hhhi!Ihhi!!hhi!Hhhi!Ihhi!!hhi!!HHHI!HHHIhHHI!HHHI!IHHI!!I!IHHI!!hhHHHI!IHHI!!hhHHHI!IHHI!!ihHHHI!HHHIhHHI!HHHI!IHHI!!hHHHI!IHHI!hhhi!hhhi!hhhi!Ihhi!!hhi!Ihhi!hhhi!hhhi!Ihhi!!hhi!Hhhi!Ihhi!!hhi!!!!hHHHI!IHHI!!ihHHHI!IHHhHHHI!HHHIhHHI!HHHI!IHHI!!I!!hhHHHI!IHHI!!hhHHHI!IHHI!!ihHHHIhHHHI!HHHIhHhhhi!hhhi!hhhi!Ihhi!!hhi!Ihhi!hhhi!hhhi!Ihhi!!hhi!Hhhi!Ihhi!!hhi!!HI!HHHI!IHHI!!!IHHI!!!hHHHI!IHHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HhHHHI!IHHI!!hhHHHI!IHHI!!hhHHHI!IHhHHHI!HHHIhHHI!HHHI!IHHI!!HI!!ihHHHI!IHHI!!!hHHHI!IHHI!!hhHHHhhhhi!hhhi!hhhi!Ihhi!!hhi!Ihhi!hhhi!hhhi!Ihhi!!hhi!Hhhi!Ihhi!!hhi!!HHHI!HHHIhHHI!HHHI!IHHI!!I!IHHI!!hhHHHI!IHHI!!hhHHHI!IHHI!!ihHHHI!HHHIhHHI!HHHI!IHHI!!hHHHI!IHHI!hhhi!hhhi!hhhi!Ihhi!!hhi!Ihhi!hhhi!hhhi!Ihhi!!hhi!Hhhi!Ihhi!!hhi!!!!hHHHI!IHHI!!ihHHHI!IHHhHHHI!HHHIhHHI!HHHI!IHHI!!I!!hhHHHI!IHHI!!hhHHHI!IHHI!!ihHHHIhHHHI!HHHIhHhhhi!hhhi!hhhi!Ihhi!!hhi!Ihhi!hhhi!hhhi!Ihhi!!hhi!Hhhi!Ihhi!!hhi!!HI!HHHI!IHHI!!!IHHI!!!hHHHI!IHHI!!!" + "'", str1, "HhHHHI!IHHI!!hhHHHI!IHHI!!hhHHHI!IHhHHHI!HHHIhHHI!HHHI!IHHI!!HI!!ihHHHI!IHHI!!!hHHHI!IHHI!!hhHHHhhhhi!hhhi!hhhi!Ihhi!!hhi!Ihhi!hhhi!hhhi!Ihhi!!hhi!Hhhi!Ihhi!!hhi!!HHHI!HHHIhHHI!HHHI!IHHI!!I!IHHI!!hhHHHI!IHHI!!hhHHHI!IHHI!!ihHHHI!HHHIhHHI!HHHI!IHHI!!hHHHI!IHHI!hhhi!hhhi!hhhi!Ihhi!!hhi!Ihhi!hhhi!hhhi!Ihhi!!hhi!Hhhi!Ihhi!!hhi!!!!hHHHI!IHHI!!ihHHHI!IHHhHHHI!HHHIhHHI!HHHI!IHHI!!I!!hhHHHI!IHHI!!hhHHHI!IHHI!!ihHHHIhHHHI!HHHIhHhhhi!hhhi!hhhi!Ihhi!!hhi!Ihhi!hhhi!hhhi!Ihhi!!hhi!Hhhi!Ihhi!!hhi!!HI!HHHI!IHHI!!!IHHI!!!hHHHI!IHHI!!!");
    }

    @Test
    public void test9565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9565");
        char[] charArray11 = new char[] {};
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("hi!", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray11);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray11);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray11);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("HH", charArray11);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.uncapitalize("HhhhI!IhhI!HI!!h", charArray11);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.initials("HhhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!HhHHHI!HHHI!IHHI!!HhHHHI!HHHI!IHHI!!IhHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!HhHHHI!HHHI!IHHI!!IhHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!!", charArray11);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.uncapitalize("hhhI!IhhI!hHh", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] {});
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hi!" + "'", str15, "Hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hi!" + "'", str17, "Hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hI!" + "'", str18, "hI!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "HH" + "'", str19, "HH");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HhhhI!IhhI!HI!!h" + "'", str20, "HhhhI!IhhI!HI!!h");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hhhI!IhhI!hHh" + "'", str22, "hhhI!IhhI!hHh");
    }

    @Test
    public void test9566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9566");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHHHI!HHHI!HHHI!", (int) (byte) 10, (int) (byte) -1, "HHHI!IHHI!HHI!IHI!!HI!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHHI!HHHI!HHHI!" + "'", str4, "hHHHI!HHHI!HHHI!");
    }

    @Test
    public void test9567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9567");
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
        java.lang.String str20 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray10);
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test9568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9568");
        char[] charArray8 = new char[] {};
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("hhhi!Hhhi!Ihhi!!", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!ihhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!!", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("HhhI!IhhI!hhhi!ihhi!!HI!!", charArray8);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("HHHI!HHHI!Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!", charArray8);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hhhi!Hhhi!Ihhi!!" + "'", str12, "hhhi!Hhhi!Ihhi!!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!ihhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!!" + "'", str13, "Hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!ihhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HhhI!IhhI!hhhi!ihhi!!HI!!" + "'", str14, "HhhI!IhhI!hhhi!ihhi!!HI!!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HHHI!HHHI!Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!" + "'", str15, "HHHI!HHHI!Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test9569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9569");
        char[] charArray5 = new char[] {};
        java.lang.String str6 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray5);
        java.lang.String str7 = org.apache.commons.lang.WordUtils.capitalize("hhHI!", charArray5);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.uncapitalize("HHh", charArray5);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHI!HHHI!HHHI!IHHI!!HHI!IHHI!HHHI!HHHI!IHHI!!HHI!HHHI!IHHI!!HHI!!", charArray5);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHH", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HI!" + "'", str6, "HI!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hhHI!" + "'", str7, "hhHI!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HHh" + "'", str8, "HHh");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HHHI!HHHI!HHHI!IHHI!!HHI!IHHI!HHHI!HHHI!IHHI!!HHI!HHHI!IHHI!!HHI!!" + "'", str9, "HHHI!HHHI!HHHI!IHHI!!HHI!IHHI!HHHI!HHHI!IHHI!!HHI!HHHI!IHHI!!HHI!!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHH" + "'", str10, "hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHH");
    }

    @Test
    public void test9570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9570");
        char[] charArray6 = new char[] {};
        java.lang.String str7 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray6);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.initials("h", charArray6);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("Hhi!", charArray6);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhHhh", charArray6);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("HHHHI!HHHIHHHI!HHHI!IHHI!!", charArray6);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("HHHi!iHHi!hi!!", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Hhi!" + "'", str9, "Hhi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HHHHI!HHHIHHHI!HHHI!IHHI!!" + "'", str11, "HHHHI!HHHIHHHI!HHHI!IHHI!!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HHHi!iHHi!hi!!" + "'", str12, "HHHi!iHHi!hi!!");
    }

    @Test
    public void test9571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9571");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("Hhhhhi!ihhHHHHI!IHHIhHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhhi!ihhHHHHI!IHHIhHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!" + "'", str1, "Hhhhhi!ihhHHHHI!IHHIhHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!");
    }

    @Test
    public void test9572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9572");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHHhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!hHhhhi!hhhi!ihhi!!hHhhhi!hhhi!ihhi!!iHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!hHhhhi!hhhi!ihhi!!iHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHHhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!hHhhhi!hhhi!ihhi!!hHhhhi!hhhi!ihhi!!iHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!hHhhhi!hhhi!ihhi!!iHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!!" + "'", str2, "hhHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHHhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!hHhhhi!hhhi!ihhi!!hHhhhi!hhhi!ihhi!!iHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!hHhhhi!hhhi!ihhi!!iHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!!");
    }

    @Test
    public void test9573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9573");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("HHhHHI!HhHHI!HhHHI!IhHHI!!hHHI!IhHHI!HhHHI!HhHHI!IhHHI!!hHHI!HhHHI!HhHHI!HhHHI!IhHHI!!hHHI!IhHHI!HHHHHI!HHHhHHHI!HHHIHHHI!IHHI!HI!!!IHHI!!HhHHI!HhHHI!IhHHI!!hHHI!!hHHI!HhHHI!IhHHI!!hHHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test9574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9574");
        char[] charArray8 = new char[] { '4', '4' };
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("HHi!", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("HH", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("hhI!", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!ihi!!hi!hhi!ihi!!hi!!", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHHHI!HHHI!HHHI!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Hi!" + "'", str9, "Hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hhi!" + "'", str10, "Hhi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hH" + "'", str11, "hH");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "h" + "'", str12, "h");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hhhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!ihi!!hi!hhi!ihi!!hi!!" + "'", str13, "Hhhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!ihi!!hi!hhi!ihi!!hi!!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhhhi!hhhi!hhhi!" + "'", str14, "Hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhhhi!hhhi!hhhi!");
    }

    @Test
    public void test9575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9575");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hHhhI!IhhI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test9576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9576");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhi!hhhihhhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhhhhi!hhhihhhi!hhhi!ihhi!!hi!!ihhhhi!ihhi!!!hhhhi!ihhi!!hhhhhhhhhi!hhhihhhi!hhhi!ihhi!!i!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!hhhhi!ihhi!!!hhhhi!ihhi!!ihhhhi!ihhhhhhi!hhhihhhi!hhhi!ihhi!!i!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhihhhhi!hhhihhhi!hhhi!ihhi!!!ihhi!!!hhhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!hhhihhhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhhhhi!hhhihhhi!hhhi!ihhi!!hi!!ihhhhi!ihhi!!!hhhhi!ihhi!!hhhhhhhhhi!hhhihhhi!hhhi!ihhi!!i!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!hhhhi!ihhi!!!hhhhi!ihhi!!ihhhhi!ihhhhhhi!hhhihhhi!hhhi!ihhi!!i!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhihhhhi!hhhihhhi!hhhi!ihhi!!!ihhi!!!hhhhi!ihhi!!!" + "'", str1, "Hhhhi!hhhihhhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhhhhi!hhhihhhi!hhhi!ihhi!!hi!!ihhhhi!ihhi!!!hhhhi!ihhi!!hhhhhhhhhi!hhhihhhi!hhhi!ihhi!!i!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!hhhhi!ihhi!!!hhhhi!ihhi!!ihhhhi!ihhhhhhi!hhhihhhi!hhhi!ihhi!!i!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhihhhhi!hhhihhhi!hhhi!ihhi!!!ihhi!!!hhhhi!ihhi!!!");
    }

    @Test
    public void test9577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9577");
        char[] charArray9 = new char[] {};
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("hH", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("HI!", charArray9);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("hhI!", charArray9);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("HhI!", charArray9);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("HhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hH" + "'", str14, "hH");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HI!" + "'", str15, "HI!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hhI!" + "'", str16, "hhI!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HhI!" + "'", str17, "HhI!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!" + "'", str18, "HhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!");
    }

    @Test
    public void test9578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9578");
        char[] charArray8 = new char[] {};
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("hi!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("hHI!", charArray8);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("HHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!IHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!!", charArray8);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hi!" + "'", str12, "Hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hi!" + "'", str13, "Hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hHI!" + "'", str14, "hHI!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!IHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!!" + "'", str15, "HHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!IHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test9579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9579");
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
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalizeFully("hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!iHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!iHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!iHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!iHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!", charArray13);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhhhhi!ihhi!hi!!hhhhi!ihhi!hi!!hhhhi!ihhi!hi!!ihhhi!ihhi!hi!!!hhhi!ihhi!hi!!ihhhi!ihhi!hi!!hhhhi!ihhihhhi!hhhi!hhi!hhhi!!hi!!hhhhi!ihhi!hi!!ihhhi!ihhi!hi!!!hhhi!ihhi!hi!!hhhhi!ihhi!hi!!hhhhi!ihhi!hi!!hhhhi!ihhi!hi!!hhhhihhhi!hhhi!hhi!hhhi!!ihhi!hi!!ihhhi!ihhi!hi!!!hhhi!ihhi!hi!!ihhhi!ihhi!hi!!hhhhi!ihhi!hi!!hhhhi!ihhi!hi!!ihhhi!ihhi!hi!!hhhi!hhhi!hhi!hhhi!!hhhi!ihhi!hi!!hhhhi!ihhi!hi!!ihhhi!ihhi!hi!!!hhhi!ihhi!hi!!!hhhi!ihhi!hi!!h", charArray13);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.initials("hhhhhhi!ihhhhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!!hhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!!hhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!!hhhi!ihhi!hhi!ihi!!hi!!!", charArray13);
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
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!iHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!iHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!iHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!iHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!" + "'", str24, "hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!iHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!iHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!iHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!iHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhhhhi!ihhi!hi!!hhhhi!ihhi!hi!!hhhhi!ihhi!hi!!ihhhi!ihhi!hi!!!hhhi!ihhi!hi!!ihhhi!ihhi!hi!!hhhhi!ihhihhhi!hhhi!hhi!hhhi!!hi!!hhhhi!ihhi!hi!!ihhhi!ihhi!hi!!!hhhi!ihhi!hi!!hhhhi!ihhi!hi!!hhhhi!ihhi!hi!!hhhhi!ihhi!hi!!hhhhihhhi!hhhi!hhi!hhhi!!ihhi!hi!!ihhhi!ihhi!hi!!!hhhi!ihhi!hi!!ihhhi!ihhi!hi!!hhhhi!ihhi!hi!!hhhhi!ihhi!hi!!ihhhi!ihhi!hi!!hhhi!hhhi!hhi!hhhi!!hhhi!ihhi!hi!!hhhhi!ihhi!hi!!ihhhi!ihhi!hi!!!hhhi!ihhi!hi!!!hhhi!ihhi!hi!!h" + "'", str25, "Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhhhhi!ihhi!hi!!hhhhi!ihhi!hi!!hhhhi!ihhi!hi!!ihhhi!ihhi!hi!!!hhhi!ihhi!hi!!ihhhi!ihhi!hi!!hhhhi!ihhihhhi!hhhi!hhi!hhhi!!hi!!hhhhi!ihhi!hi!!ihhhi!ihhi!hi!!!hhhi!ihhi!hi!!hhhhi!ihhi!hi!!hhhhi!ihhi!hi!!hhhhi!ihhi!hi!!hhhhihhhi!hhhi!hhi!hhhi!!ihhi!hi!!ihhhi!ihhi!hi!!!hhhi!ihhi!hi!!ihhhi!ihhi!hi!!hhhhi!ihhi!hi!!hhhhi!ihhi!hi!!ihhhi!ihhi!hi!!hhhi!hhhi!hhi!hhhi!!hhhi!ihhi!hi!!hhhhi!ihhi!hi!!ihhhi!ihhi!hi!!!hhhi!ihhi!hi!!!hhhi!ihhi!hi!!h");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test9580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9580");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hhhhi!hhhihhhi!ihhi!hi!!!ihhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhhi!hhhihhhi!ihhi!hi!!!ihhi!!" + "'", str1, "hhhhi!hhhihhhi!ihhi!hi!!!ihhi!!");
    }

    @Test
    public void test9581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9581");
        char[] charArray10 = new char[] {};
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("HH", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray10);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("HHI!iHI!!", charArray10);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhi!hhhiHhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!H", charArray10);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhhi!ihhhhhhi!ihhihhhhhhhhhihh!hhhhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhihhhi!hhhi!ihhi!!", charArray10);
        java.lang.Class<?> wildcardClass21 = charArray10.getClass();
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HH" + "'", str16, "HH");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HHI!iHI!!" + "'", str18, "HHI!iHI!!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Hhhhi!hhhiHhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!H" + "'", str19, "Hhhhi!hhhiHhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!H");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hhhhhi!ihhhhhhi!ihhihhhhhhhhhihh!hhhhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhihhhi!hhhi!ihhi!!" + "'", str20, "Hhhhhi!ihhhhhhi!ihhihhhhhhhhhihh!hhhhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhihhhi!hhhi!ihhi!!");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test9582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9582");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hHhhhhi!hhhHHhhI!IhhIHHHHI!HHHI!IHHI!!hHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!ihHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!!", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hHhhhhi!hhhHHhhI!IhhIHHHHI!HHHI!IHHI!!hHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!ihHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!!" + "'", str2, "hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hHhhhhi!hhhHHhhI!IhhIHHHHI!HHHI!IHHI!!hHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!ihHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!!");
    }

    @Test
    public void test9583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9583");
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
        java.lang.String str21 = org.apache.commons.lang.WordUtils.initials("hh", charArray11);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.uncapitalize("hHHI!IHHI!HHHI!IHHI!HHHI!IHHI!!HI!!", charArray11);
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hHHI!IHHI!HHHI!IHHI!HHHI!IHHI!!HI!!" + "'", str22, "hHHI!IHHI!HHHI!IHHI!HHHI!IHHI!!HI!!");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test9584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9584");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHIhHI!HHI!HHHHHHI!HHHI!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHIhHI!HHI!HHHHHHI!HHHI!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!" + "'", str1, "hhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHIhHI!HHI!HHHHHHI!HHHI!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!");
    }

    @Test
    public void test9585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9585");
        char[] charArray10 = new char[] {};
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("HhhI!IhhI!!", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHi!iHHi!hi!!", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray10);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHI!hHHI!iHHI!!", charArray10);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.uncapitalize("hHhhi!hHhhi!hHhhi!iHhhi!!Hhhi!iHhhi!hHhhi!hHhhi!iHhhi!!Hhhi!hHhhi!hHhhi!hHhhi!iHhhi!!Hhhi!iHhhi!hHhhi!hHhhi!iHhhi!!Hhhi!!Hhhi!hHhhi!iHhhi!!Hhhi!!", charArray10);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.uncapitalize("HhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!ihHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!iHhi!Ihi!!!Hhi!Ihi!!iHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!!Hhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!!Hhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!!Hhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!!Hhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!!Hhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HhhI!IhhI!!" + "'", str15, "HhhI!IhhI!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HHHi!iHHi!hi!!" + "'", str16, "HHHi!iHHi!hi!!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hHHI!hHHI!iHHI!!" + "'", str18, "hHHI!hHHI!iHHI!!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hHhhi!hHhhi!hHhhi!iHhhi!!Hhhi!iHhhi!hHhhi!hHhhi!iHhhi!!Hhhi!hHhhi!hHhhi!hHhhi!iHhhi!!Hhhi!iHhhi!hHhhi!hHhhi!iHhhi!!Hhhi!!Hhhi!hHhhi!iHhhi!!Hhhi!!" + "'", str19, "hHhhi!hHhhi!hHhhi!iHhhi!!Hhhi!iHhhi!hHhhi!hHhhi!iHhhi!!Hhhi!hHhhi!hHhhi!hHhhi!iHhhi!!Hhhi!iHhhi!hHhhi!hHhhi!iHhhi!!Hhhi!!Hhhi!hHhhi!iHhhi!!Hhhi!!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!ihHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!iHhi!Ihi!!!Hhi!Ihi!!iHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!!Hhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!!Hhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!!Hhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!!Hhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!!Hhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!!" + "'", str20, "HhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!ihHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!iHhi!Ihi!!!Hhi!Ihi!!iHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!!Hhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!!Hhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!!Hhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!!Hhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!!Hhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!!");
    }

    @Test
    public void test9586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9586");
        char[] charArray9 = new char[] {};
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("Hi!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("HHhi!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("HHH", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("hHHI!HHHI!IHHI!!", charArray9);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHhhhi!ihhi!hi!!hhHHhhhi!ihhi!hi!!hhHHhhhi!ihhi!hi!!hiHHhhhi!ihhi!hi!!h!HHhhhi!ihhi!hi!!hiHHhhhi!ihHhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!!", charArray9);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("hhhhi!hhhihhhi!hhhi!ihhi!!", charArray9);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("hHhhI!IhhI!HI!!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hi!" + "'", str12, "Hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HHhi!" + "'", str13, "HHhi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HHH" + "'", str14, "HHH");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hHHI!HHHI!IHHI!!" + "'", str15, "hHHI!HHHI!IHHI!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hHHhhhi!ihhi!hi!!hhHHhhhi!ihhi!hi!!hhHHhhhi!ihhi!hi!!hiHHhhhi!ihhi!hi!!h!HHhhhi!ihhi!hi!!hiHHhhhi!ihHhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!!" + "'", str16, "hHHhhhi!ihhi!hi!!hhHHhhhi!ihhi!hi!!hhHHhhhi!ihhi!hi!!hiHHhhhi!ihhi!hi!!h!HHhhhi!ihhi!hi!!hiHHhhhi!ihHhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hHhhI!IhhI!HI!!" + "'", str18, "hHhhI!IhhI!HI!!");
    }

    @Test
    public void test9587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9587");
        char[] charArray10 = new char[] {};
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("HhhI!IhhI!!", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHi!iHHi!hi!!", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray10);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("hhHHi!iHHi!!", charArray10);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhhhhi!hhhihhhi!hhhi!ihhi!!hi!!ihhhhi!ihhi!!!hhhhi!ihhi!!hhhhhhhhhi!hhhihhhi!hhhi!ihhi!!i!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!hhhhi!ihhi!!!hhhhi!ihhi!!ihhhhi!ihhhhhhi!hhhihhhi!hhhi!ihhi!!i!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhihhhhi!hhhihhhi!hhhi!ihhi!!!ihhi!!!hhhhi!ihhi!!!", charArray10);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!ihhi!hi!", charArray10);
        java.lang.Class<?> wildcardClass21 = charArray10.getClass();
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HhhI!IhhI!!" + "'", str15, "HhhI!IhhI!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HHHi!iHHi!hi!!" + "'", str16, "HHHi!iHHi!hi!!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Hhhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhhhhi!hhhihhhi!hhhi!ihhi!!hi!!ihhhhi!ihhi!!!hhhhi!ihhi!!hhhhhhhhhi!hhhihhhi!hhhi!ihhi!!i!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!hhhhi!ihhi!!!hhhhi!ihhi!!ihhhhi!ihhhhhhi!hhhihhhi!hhhi!ihhi!!i!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhihhhhi!hhhihhhi!hhhi!ihhi!!!ihhi!!!hhhhi!ihhi!!!" + "'", str19, "Hhhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhhhhi!hhhihhhi!hhhi!ihhi!!hi!!ihhhhi!ihhi!!!hhhhi!ihhi!!hhhhhhhhhi!hhhihhhi!hhhi!ihhi!!i!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!hhhhi!ihhi!!!hhhhi!ihhi!!ihhhhi!ihhhhhhi!hhhihhhi!hhhi!ihhi!!i!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhihhhhi!hhhihhhi!hhhi!ihhi!!!ihhi!!!hhhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hhhi!ihhi!hi!" + "'", str20, "Hhhi!ihhi!hi!");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test9588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9588");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HHhhi!hHhhi!hHhhi!iHhhi!!Hhhi!iHhhi!hHhhi!hHhhi!iHhhi!!Hhhi!hHhhi!hHhhi!hHhhi!iHhhi!!Hhhi!iHhhi!hhHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!HHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!hhhhhI!Ihhhhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHhhi!hHhhi!hHhhi!iHhhi!!Hhhi!iHhhi!hHhhi!hHhhi!iHhhi!!Hhhi!hHhhi!hHhhi!hHhhi!iHhhi!!Hhhi!iHhhi!hhHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!HHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!hhhhhI!Ihhhhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!" + "'", str2, "HHhhi!hHhhi!hHhhi!iHhhi!!Hhhi!iHhhi!hHhhi!hHhhi!iHhhi!!Hhhi!hHhhi!hHhhi!hHhhi!iHhhi!!Hhhi!iHhhi!hhHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!HHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!hhhhhI!Ihhhhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!");
    }

    @Test
    public void test9589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9589");
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
        java.lang.String str24 = org.apache.commons.lang.WordUtils.uncapitalize("HH", charArray14);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!", charArray14);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.uncapitalize("HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!!", charArray14);
        java.lang.String str27 = org.apache.commons.lang.WordUtils.uncapitalize("hHHI!HHHI!HHHI!", charArray14);
        java.lang.String str28 = org.apache.commons.lang.WordUtils.capitalize("hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhI!IhhI!hhhi!ihhi!!HI!!ihhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!!", charArray14);
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
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "HH" + "'", str24, "HH");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Hhhi!" + "'", str25, "Hhhi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!!" + "'", str26, "HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hHHI!HHHI!HHHI!" + "'", str27, "hHHI!HHHI!HHHI!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhI!IhhI!hhhi!ihhi!!HI!!ihhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!!" + "'", str28, "hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhI!IhhI!hhhi!ihhi!!HI!!ihhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!!");
    }

    @Test
    public void test9590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9590");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihHI!HHI!HHHHHHI!HHHI!HHHHI!IHHI!!HHhHHHHI!IHHI!!HHHHHI!IHHI!!HHHHHI!IHHHHHI!HHHIHHHI!HHHI!IHHI!!HI!!IHHHHI!IHHI!!!HHHHI!IHHI!!HHHHHHHHHHHHHHI!HHHI!IHHI!!HHHHHI!HHHI!IHHI!!HHHHHI!HHHI!IHHIHHI!HHI!HHHHHHI!HHHI!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!hh", (int) (byte) 1, 1, "Hhi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHhi!" + "'", str4, "HHhi!");
    }

    @Test
    public void test9591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9591");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HhhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!!hHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!!hHHHI!IHHI!HI!!!hHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!!hHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!!hHHHI!IHHI!HI!!!hHHHI!IHHI!HI!!HhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!!hHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!HhHHHI!IHHI!HI!!HhHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!!hHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!HhHHHI!IHHI!HI!!HhHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!!hHHHI!IHHI!HI!!ihHHHI!IHHI!HI!!HhHHHI!IHHI!HI!!HhHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!!hHHHI!IHHI!HI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HhhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!!hHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!!hHHHI!IHHI!HI!!!hHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!!hHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!!hHHHI!IHHI!HI!!!hHHHI!IHHI!HI!!HhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!!hHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!HhHHHI!IHHI!HI!!HhHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!!hHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!HhHHHI!IHHI!HI!!HhHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!!hHHHI!IHHI!HI!!ihHHHI!IHHI!HI!!HhHHHI!IHHI!HI!!HhHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!!hHHHI!IHHI!HI!!!" + "'", str1, "HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HhhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!!hHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!!hHHHI!IHHI!HI!!!hHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!!hHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!!hHHHI!IHHI!HI!!!hHHHI!IHHI!HI!!HhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!!hHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!HhHHHI!IHHI!HI!!HhHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!!hHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!HhHHHI!IHHI!HI!!HhHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!!hHHHI!IHHI!HI!!ihHHHI!IHHI!HI!!HhHHHI!IHHI!HI!!HhHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!!hHHHI!IHHI!HI!!!");
    }

    @Test
    public void test9592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9592");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHHHH", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhhh" + "'", str2, "Hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhhh");
    }

    @Test
    public void test9593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9593");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hHHI!IHHI!HHHHI!HHHI!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHI!IHHI!HHHHI!HHHI!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!" + "'", str1, "hHHI!IHHI!HHHHI!HHHI!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!");
    }

    @Test
    public void test9594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9594");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhhi!ihhihi!!hi!!", (int) (byte) 0, (int) (short) 100, "HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhhi!ihhihi!!hi!!" + "'", str4, "Hhhhi!ihhihi!!hi!!");
    }

    @Test
    public void test9595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9595");
        char[] charArray11 = new char[] { ' ' };
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("hhhi!Hhhi!Ihhi!!", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("hh", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!", charArray11);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("Hhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!ihi!!hi!hhi!ihi!!hi!!", charArray11);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("hHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!hHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!hHhhhi!ihhi!hi!!hHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!hHhhhi!ihhi!hi!!hHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!IHhhhi!ihhi!hi!!hHhhhi!ihhi!hi!!hHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!!", charArray11);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("hHHI!IHHI!HHI!IHI!!HI!!", charArray11);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihHhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhhhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihhhhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!!hh!", charArray11);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.uncapitalize("hHhhhi!ihhi!hi!!IHhhhi!ihhi!hi!!!", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { ' ' });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H" + "'", str12, "H");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H" + "'", str13, "H");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hhhi!Hhhi!Ihhi!!" + "'", str14, "hhhi!Hhhi!Ihhi!!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hh" + "'", str15, "Hh");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!" + "'", str16, "Hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H" + "'", str17, "H");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!hHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!hHhhhi!ihhi!hi!!hHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!hHhhhi!ihhi!hi!!hHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!IHhhhi!ihhi!hi!!hHhhhi!ihhi!hi!!hHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!!" + "'", str18, "HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!hHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!hHhhhi!ihhi!hi!!hHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!hHhhhi!ihhi!hi!!hHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!IHhhhi!ihhi!hi!!hHhhhi!ihhi!hi!!hHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "HHHI!IHHI!HHI!IHI!!HI!!" + "'", str19, "HHHI!IHHI!HHI!IHI!!HI!!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihHhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhhhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihhhhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!!hh!" + "'", str20, "Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihHhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhhhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihhhhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!!hh!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hHhhhi!ihhi!hi!!IHhhhi!ihhi!hi!!!" + "'", str21, "hHhhhi!ihhi!hi!!IHhhhi!ihhi!hi!!!");
    }

    @Test
    public void test9596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9596");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hhhhi!hhhihHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!iHhhi!Hhhi!Ihhi!!!Hhhi!Hhhi!IhhiHhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!IhHHI!hHHI!iHHI!!!hHHI!hHHI!ihhHHHI!IHHI!HI!!H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!hhhihHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!iHhhi!Hhhi!Ihhi!!!Hhhi!Hhhi!IhhiHhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!IhHHI!hHHI!iHHI!!!hHHI!hHHI!ihhHHHI!IHHI!HI!!H" + "'", str1, "Hhhhi!hhhihHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!iHhhi!Hhhi!Ihhi!!!Hhhi!Hhhi!IhhiHhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!IhHHI!hHHI!iHHI!!!hHHI!hHHI!ihhHHHI!IHHI!HI!!H");
    }

    @Test
    public void test9597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9597");
        char[] charArray9 = new char[] {};
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("hi!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("", charArray9);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("hH", charArray9);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("hhHHI!HHHI!Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhihHHI!IHHI!HHHI!IHHI!HHHI!IHHI!!HI!!", charArray9);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hi!" + "'", str13, "Hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hH" + "'", str16, "hH");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hhHHI!HHHI!Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhihHHI!IHHI!HHHI!IHHI!HHHI!IHHI!!HI!!" + "'", str17, "hhHHI!HHHI!Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhihHHI!IHHI!HHHI!IHHI!HHHI!IHHI!!HI!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test9598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9598");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihHHi!iHHi!hhhi!hhhi!hhi!hhhi!", (int) (byte) 100, (int) (byte) 0, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihHH" + "'", str4, "hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihHH");
    }

    @Test
    public void test9599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9599");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhi!hhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!ihi!!hi!hhi!ihi!!hi!!", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhi!hhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!ihi!!hi!hhi!ihi!!hi!!" + "'", str2, "hhi!hhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!ihi!!hi!hhi!ihi!!hi!!");
    }

    @Test
    public void test9600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9600");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhihhhi!hhhi!ihhi!!", (int) (byte) 1, (int) (byte) 10, "HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhhhi!ihhHHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!" + "'", str4, "Hhhhhi!ihhHHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!");
    }

    @Test
    public void test9601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9601");
        char[] charArray9 = new char[] { '#', '4', '4', '4' };
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("hHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHHHI!IHHHHHI!IHHI!HHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!", charArray9);
        java.lang.Class<?> wildcardClass15 = charArray9.getClass();
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '#', '4', '4', '4' });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hi!" + "'", str10, "Hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hi!" + "'", str11, "Hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHHHI!IHHHHHI!IHHI!HHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!" + "'", str14, "HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHHHI!IHHHHHI!IHHI!HHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test9602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9602");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHHI!IHHI!HHHI!IHHI!!HI!!HHHHI!IHHI!HHHI!IHHI!!HI!!HHHHI!IHHI!HHHI!IHHI!!HI!!HHHHI!IHHI!HHHI!IHHhHHHI!IHHIHHHHHI!IHHHHHI!IHHI!HHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!I!!HI!!IHHHI!IHHI!HHHI!IHHI!!HI!!!HHHI!IHHI!HHHI!IHHI!!HI!!HHHHI!IHHI!HHHI!IHHI!!HI!!HHHHI!IHHI!HhHHHI!IHHIHHHHHI!IHHHHHI!IHHI!HHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!HHI!IHHI!!HI!!HHHHI!IHHI!HHHI!IHHI!!HI!!IHHHI!IHHI!HHHI!IHHI!!HI!!!HHHI!IHHI!HHHI!IHHI!!HI!!HHHHIhHHHI!IHHIHHHHHI!IHHHHHI!IHHI!HHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!!IHHI!HHHI!IHHI!!HI!!HHHHI!IHHI!HHHI!IHHI!!HI!!HHHHI!IHHI!HHHI!IHHI!!HI!!IHHHI!IHHI!HHHI!IHHI!!HIhHHHI!IHHIHHHHHI!IHHHHHI!IHHI!HHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!ihhi!hhhi!ihhi!!hi!!hhhhi!ihhi!hhhi!ihhi!!hi!!hhhhi!ihhi!hhhi!ihhi!!hi!!hhhhi!ihhi!hhhi!ihhhhhhi!ihhihhhhhi!ihhhhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!i!!hi!!ihhhi!ihhi!hhhi!ihhi!!hi!!!hhhi!ihhi!hhhi!ihhi!!hi!!hhhhi!ihhi!hhhi!ihhi!!hi!!hhhhi!ihhi!hhhhhi!ihhihhhhhi!ihhhhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhi!ihhi!!hi!!hhhhi!ihhi!hhhi!ihhi!!hi!!ihhhi!ihhi!hhhi!ihhi!!hi!!!hhhi!ihhi!hhhi!ihhi!!hi!!hhhhihhhhi!ihhihhhhhi!ihhhhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!ihhi!hhhi!ihhi!!hi!!hhhhi!ihhi!hhhi!ihhi!!hi!!hhhhi!ihhi!hhhi!ihhi!!hi!!ihhhi!ihhi!hhhi!ihhi!!hihhhhi!ihhihhhhhi!ihhhhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!!!" + "'", str1, "Hhhhi!ihhi!hhhi!ihhi!!hi!!hhhhi!ihhi!hhhi!ihhi!!hi!!hhhhi!ihhi!hhhi!ihhi!!hi!!hhhhi!ihhi!hhhi!ihhhhhhi!ihhihhhhhi!ihhhhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!i!!hi!!ihhhi!ihhi!hhhi!ihhi!!hi!!!hhhi!ihhi!hhhi!ihhi!!hi!!hhhhi!ihhi!hhhi!ihhi!!hi!!hhhhi!ihhi!hhhhhi!ihhihhhhhi!ihhhhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhi!ihhi!!hi!!hhhhi!ihhi!hhhi!ihhi!!hi!!ihhhi!ihhi!hhhi!ihhi!!hi!!!hhhi!ihhi!hhhi!ihhi!!hi!!hhhhihhhhi!ihhihhhhhi!ihhhhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!ihhi!hhhi!ihhi!!hi!!hhhhi!ihhi!hhhi!ihhi!!hi!!hhhhi!ihhi!hhhi!ihhi!!hi!!ihhhi!ihhi!hhhi!ihhi!!hihhhhi!ihhihhhhhi!ihhhhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!!!");
    }

    @Test
    public void test9603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9603");
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
        java.lang.String str21 = org.apache.commons.lang.WordUtils.uncapitalize("hHHhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!hHhhhi!hhhi!ihhi!!hHhhhi!hhhi!ihhi!!iHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!hHhhhi!hhhi!ihhi!!iHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!!", charArray11);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalize("HhHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!!h", charArray11);
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hHHhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!hHhhhi!hhhi!ihhi!!hHhhhi!hhhi!ihhi!!iHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!hHhhhi!hhhi!ihhi!!iHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!!" + "'", str21, "hHHhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!hHhhhi!hhhi!ihhi!!hHhhhi!hhhi!ihhi!!iHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!hHhhhi!hhhi!ihhi!!iHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "HhHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!!h" + "'", str22, "HhHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!!h");
    }

    @Test
    public void test9604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9604");
        char[] charArray9 = new char[] {};
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("H", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("hhhI!IhhI!HI!!", charArray9);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("hH", charArray9);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("H", charArray9);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("Hhhhhi!ihhHHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!HHHI!IHHI!!HI!!", charArray9);
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test9605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9605");
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
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalize("hhhhI!IhhI!hHhhhhhI!IhhI!hHhhhhhI!IhhI!hHhhhhhI!IhhI!hHhhhhhI!IhhI!hHhihhhI!IhhI!hHh!hhhI!IhhI!hHhhhhhI!IhhI!hHhhhhhI!IhhI!hHhhhhhI!IhhI!hHhhhhhI!IhhI!hHhHhhhI!IhhI!hHhHhhhI!IhhI!hHhIhhhI!IhhI!hHh!hhhI!IhhI!hHhHhhhI!IhhI!hHhHhhhI!IhhI!hHhHhhhI!IhhI!hHhIhhhI!IhhI!hHh!hhhI!IhhI!hHhIhhhI!IhhI!hHhHhhhI!IhhI!hHhHhhhI!IhhI!hHhIhhhI!IhhI!hHh!hhhI!IhhI!hHh!", charArray11);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalize("hhhi!ihhi!hhhi!ihhi!!hi!!", charArray11);
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hhhhI!IhhI!hHhhhhhI!IhhI!hHhhhhhI!IhhI!hHhhhhhI!IhhI!hHhhhhhI!IhhI!hHhihhhI!IhhI!hHh!hhhI!IhhI!hHhhhhhI!IhhI!hHhhhhhI!IhhI!hHhhhhhI!IhhI!hHhhhhhI!IhhI!hHhHhhhI!IhhI!hHhHhhhI!IhhI!hHhIhhhI!IhhI!hHh!hhhI!IhhI!hHhHhhhI!IhhI!hHhHhhhI!IhhI!hHhHhhhI!IhhI!hHhIhhhI!IhhI!hHh!hhhI!IhhI!hHhIhhhI!IhhI!hHhHhhhI!IhhI!hHhHhhhI!IhhI!hHhIhhhI!IhhI!hHh!hhhI!IhhI!hHh!" + "'", str21, "hhhhI!IhhI!hHhhhhhI!IhhI!hHhhhhhI!IhhI!hHhhhhhI!IhhI!hHhhhhhI!IhhI!hHhihhhI!IhhI!hHh!hhhI!IhhI!hHhhhhhI!IhhI!hHhhhhhI!IhhI!hHhhhhhI!IhhI!hHhhhhhI!IhhI!hHhHhhhI!IhhI!hHhHhhhI!IhhI!hHhIhhhI!IhhI!hHh!hhhI!IhhI!hHhHhhhI!IhhI!hHhHhhhI!IhhI!hHhHhhhI!IhhI!hHhIhhhI!IhhI!hHh!hhhI!IhhI!hHhIhhhI!IhhI!hHhHhhhI!IhhI!hHhHhhhI!IhhI!hHhIhhhI!IhhI!hHh!hhhI!IhhI!hHh!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hhhi!ihhi!hhhi!ihhi!!hi!!" + "'", str22, "hhhi!ihhi!hhhi!ihhi!!hi!!");
    }

    @Test
    public void test9606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9606");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!HHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!HhHHHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!hHIHI!!HI!HHI!IHI!!HI!!", (int) (byte) -1, (int) (short) -1, "HHHHI!IHHIhHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!HHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!HhHHHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!hHIHI!!HI!HHI!IHI!!HI!!" + "'", str4, "hHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!HHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!HhHHHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!hHIHI!!HI!HHI!IHI!!HI!!");
    }

    @Test
    public void test9607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9607");
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
        java.lang.String str25 = org.apache.commons.lang.WordUtils.capitalize("hHH", charArray14);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!", charArray14);
        java.lang.String str27 = org.apache.commons.lang.WordUtils.uncapitalize("hhhH", charArray14);
        java.lang.String str28 = org.apache.commons.lang.WordUtils.capitalizeFully("HHhhhi!ihhi!!hhhhi!ihhi!!hhhhi!iHhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!hhhi!ihhi!hhhi!ihhi!hhhi!ihhi!!hi!!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhihhhi!ihhi!hhhi!ihhi!hhhi!ihhi!!hi!!!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhhhhi!ihhi!hhhi!ihhi!hhhi!ihhi!!hi!!i!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhhhi!ihhi!hhhi!ihhi!hhhi!ihhi!!hi!!hi!!ihhhi!ihhi!!!hhhi!ihhi!!!", charArray14);
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
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hHH" + "'", str25, "hHH");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Hhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!" + "'", str26, "Hhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hhhH" + "'", str27, "hhhH");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "HHhhhi!ihhi!!hhhhi!ihhi!!hhhhi!iHhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!hhhi!ihhi!hhhi!ihhi!hhhi!ihhi!!hi!!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhihhhi!ihhi!hhhi!ihhi!hhhi!ihhi!!hi!!!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhhhhi!ihhi!hhhi!ihhi!hhhi!ihhi!!hi!!i!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhhhi!ihhi!hhhi!ihhi!hhhi!ihhi!!hi!!hi!!ihhhi!ihhi!!!hhhi!ihhi!!!" + "'", str28, "HHhhhi!ihhi!!hhhhi!ihhi!!hhhhi!iHhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!hhhi!ihhi!hhhi!ihhi!hhhi!ihhi!!hi!!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhihhhi!ihhi!hhhi!ihhi!hhhi!ihhi!!hi!!!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhhhhi!ihhi!hhhi!ihhi!hhhi!ihhi!!hi!!i!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhhhi!ihhi!hhhi!ihhi!hhhi!ihhi!!hi!!hi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
    }

    @Test
    public void test9608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9608");
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
        java.lang.String str33 = org.apache.commons.lang.WordUtils.initials("hhhH", charArray17);
        java.lang.String str34 = org.apache.commons.lang.WordUtils.initials("hhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!hhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!hhhI!IhhI!hhhi!ihhi!!HI!!", charArray17);
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
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
    }

    @Test
    public void test9609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9609");
        char[] charArray10 = new char[] {};
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("H", charArray10);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("hH", charArray10);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("HhhhI!IhhI!HI!!h", charArray10);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.initials("hHHHI!IHHI!HHHI!IHHI!!HI!!", charArray10);
        java.lang.Class<?> wildcardClass21 = charArray10.getClass();
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "HhhhI!IhhI!HI!!h" + "'", str19, "HhhhI!IhhI!HI!!h");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test9610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9610");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhhi!ihhihhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!", (int) (byte) 0, "hhhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!ihhhhi!hhhi!hhhi!!hhhhi!hhhi!hhhi!ihhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!ihhhhi!hhhi!hhhi!!hhhhi!hhhi!hhhi!!hhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!ihhhhi!hhhi!hhhi!!hhhhi!hhhi!hhhi!ihhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!ihhhhi!hhhi!hhhi!!hhhhi!hhhi!hhhi!!hhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!ihhhhi!hhhi!hhhi!!hhhhi!hhhi!hhhi!ihhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!ihhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!ihhhhi!hhhi!hhhi!!hhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!ihhhhi!hhhi!hhhi!!hhhhi!hhhi!hhhi!ihhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!ihhhhi!hhhi!hhhi!!hhhhi!hhhi!hhhi!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhhi!ihhihhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!" + "'", str4, "Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhhi!ihhihhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!");
    }

    @Test
    public void test9611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9611");
        char[] charArray8 = new char[] {};
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("Hh", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("HHhhhi!ihhi!hi!!h", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("hhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("hHhhI!IhhI!hhhi!ihhi!!HI!!", charArray8);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray8);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHHHHHI!IHHI!HI!!HHHHHHHI!IHHI!HHHHHHI!IHHHHHI!IHHI!HHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hh" + "'", str11, "Hh");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!" + "'", str13, "hhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hHhhI!IhhI!hhhi!ihhi!!HI!!" + "'", str14, "hHhhI!IhhI!hhhi!ihhi!!HI!!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hHHHHHHI!IHHI!HI!!HHHHHHHI!IHHI!HHHHHHI!IHHHHHI!IHHI!HHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!" + "'", str16, "hHHHHHHI!IHHI!HI!!HHHHHHHI!IHHI!HHHHHHI!IHHHHHI!IHHI!HHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!");
    }

    @Test
    public void test9612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9612");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test9613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9613");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihH", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihH" + "'", str2, "hhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihH");
    }

    @Test
    public void test9614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9614");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhHhhhi!ihhihhhhi!hhhi!ihhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHhHHHI!IHHIHHHHI!HHHI!IHHI!!" + "'", str1, "HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHhHHHI!IHHIHHHHI!HHHI!IHHI!!");
    }

    @Test
    public void test9615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9615");
        char[] charArray4 = new char[] {};
        java.lang.String str5 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray4);
        java.lang.String str6 = org.apache.commons.lang.WordUtils.initials("h", charArray4);
        java.lang.String str7 = org.apache.commons.lang.WordUtils.capitalizeFully("HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HhhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!!hHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!!hHHHI!IHHI!HI!!!hHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!!hHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!!hHHHI!IHHI!HI!!!hHHHI!IHHI!HI!!HhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!!hHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!HhHHHI!IHHI!HI!!HhHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!!hHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!HhHHHI!IHHI!HI!!HhHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!!hHHHI!IHHI!HI!!ihHHHI!IHHI!HI!!HhHHHI!IHHI!HI!!HhHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!!hHHHI!IHHI!HI!!!", charArray4);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HhhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!!hHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!!hHHHI!IHHI!HI!!!hHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!!hHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!!hHHHI!IHHI!HI!!!hHHHI!IHHI!HI!!HhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!!hHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!HhHHHI!IHHI!HI!!HhHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!!hHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!HhHHHI!IHHI!HI!!HhHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!!hHHHI!IHHI!HI!!ihHHHI!IHHI!HI!!HhHHHI!IHHI!HI!!HhHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!!hHHHI!IHHI!HI!!!" + "'", str7, "HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HhhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!!hHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!!hHHHI!IHHI!HI!!!hHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!!hHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!!hHHHI!IHHI!HI!!!hHHHI!IHHI!HI!!HhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!!hHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!HhHHHI!IHHI!HI!!HhHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!!hHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!HhHHHI!IHHI!HI!!HhHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!!hHHHI!IHHI!HI!!ihHHHI!IHHI!HI!!HhHHHI!IHHI!HI!!HhHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!!hHHHI!IHHI!HI!!!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!" + "'", str8, "Hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
    }

    @Test
    public void test9616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9616");
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
        java.lang.String str21 = org.apache.commons.lang.WordUtils.initials("hhhhi!ihhiHhI!!!hhhhi!ihHhI!hi!!hhhhi!HhI!ihhi!!hhhhHhI!i!ihhi!!ihHhI!hhi!ihhi!!HhI!!hhhi!ihhiHhI!!!ihhhi!ihHhI!hi!!hhhhi!HhI!ihhi!!hHhhHhI!hI!IhhI!!hHhI!hhhI!IhhI!HhI!!hhhhI!IhhHhI!I!!hhhhI!IHhI!hhI!!ihhhIHhI!!IhhI!!!hhHhI!hI!IhhI!!iHhI!hhhI!IhhI!HhI!!hhhhI!IhhHhI!I!!hhhhI!IHhI!hhI!!ihhhIHhI!!IhhI!!!hhHhI!hI!IhhI!!hHhI!hhhI!IhhI!HhI!!ihhhI!IhhHhI!I!!!hhhI!IHhI!hhI!!!hhhiHhI!!ihhi!!ihhHhI!hi!ihhi!!!HhI!hhhi!ihhi!HhI!!hhhhi!ihhHhI!i!!ihhhi!iHhI!hhi!!!hhhiHhI!!ihhi!!!", charArray11);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray11);
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test9617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9617");
        char[] charArray10 = new char[] {};
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("hi!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("HHhHhHhHhHhHhHhHiHhH!HhHhHhHhHhHhHhHiHhH!HhHiHhHhHhHhHhHiHhH!HhH!", charArray10);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHHHI!HHHI!IHHI!!", charArray10);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.initials("Hhhhi!ihhihhhi!Hhhi!Ihhi!!!hi!!h", charArray10);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("hHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHHHHI!IHHI!HHI!IHI!!HI!!", charArray10);
        java.lang.Class<?> wildcardClass21 = charArray10.getClass();
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hi!" + "'", str14, "Hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hi!" + "'", str16, "Hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hHHHHI!HHHI!IHHI!!" + "'", str18, "hHHHHI!HHHI!IHHI!!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHHHHI!IHHI!HHI!IHI!!HI!!" + "'", str20, "hHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHHHHI!IHHI!HHI!IHI!!HI!!");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test9618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9618");
        char[] charArray8 = new char[] {};
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("hhI!", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("Hhhhi!ihhi!hi!!", charArray8);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("HhHHI!IHHI!hHh", charArray8);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("HHHHHI!IHHI!!HHHHHI!IHHI!!HHHHHIHHHHI!HHHIhHHI!HHHI!HHHI!IHHI!!HHI!IHHI!HHHI!HHHI!IHHI!!HHI!HHHI!IHHI!!HHI!!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hhhhi!ihhi!hi!!" + "'", str14, "Hhhhi!ihhi!hi!!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HhHHI!IHHI!hHh" + "'", str15, "HhHHI!IHHI!hHh");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HHHHHI!IHHI!!HHHHHI!IHHI!!HHHHHIHHHHI!HHHIhHHI!HHHI!HHHI!IHHI!!HHI!IHHI!HHHI!HHHI!IHHI!!HHI!HHHI!IHHI!!HHI!!" + "'", str16, "HHHHHI!IHHI!!HHHHHI!IHHI!!HHHHHIHHHHI!HHHIhHHI!HHHI!HHHI!IHHI!!HHI!IHHI!HHHI!HHHI!IHHI!!HHI!HHHI!IHHI!!HHI!!");
    }

    @Test
    public void test9619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9619");
        char[] charArray9 = new char[] {};
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("hhI!", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("Hhhhhi!ihhhhHHHI!IHHI!HI!!H", charArray9);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("hH", charArray9);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("HhhhI!IhhI!hHhhhhhI!IhhI!hHhhhhhI!IhhI!hHhhhhhI!IhhI!hHhhhhhI!IhhI!hHhihhhI!IhhI!hHh!hhhI!IhhI!hHhhhhhI!IhhI!hHhhhhhI!IhhI!hHhhhhhI!IhhI!hHhhhhhI!IhhI!hHhHhhhI!IhhI!hHhHhhhI!IhhI!hHhIhhhI!IhhI!hHh!hhhI!IhhI!hHhHhhhI!IhhI!hHhHhhhI!IhhI!hHhHhhhI!IhhI!hHhIhhhI!IhhI!hHh!hhhI!IhhI!hHhIhhhI!IhhI!hHhHhhhI!IhhI!hHhHhhhI!IhhI!hHhIhhhI!IhhI!hHh!hhhI!IhhI!hHh!", charArray9);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("hhHI!iHI!!HhHI!iHI!!HhHI!iHI!!IhHI!iHI!!!hHI!iHI!!IhHI!iHI!!HhHI!iHI!!HhHI!iHI!!IhHI!iHI!!!hHI!iHI!!HhHI!iHI!!HhHI!iHI!!IhHI!iHI!!!hHI!iHI!!IhHI!iHI!!HhHI!iHI!!IhHI!iHI!!!hHI!iHI!!!hHI!iHI!!HhHI!iHI!!IhHI!iHI!!!hHI!iHI!!!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hhHI!iHI!!HhHI!iHI!!HhHI!iHI!!IhHI!iHI!!!hHI!iHI!!IhHI!iHI!!HhHI!iHI!!HhHI!iHI!!IhHI!iHI!!!hHI!iHI!!HhHI!iHI!!HhHI!iHI!!IhHI!iHI!!!hHI!iHI!!IhHI!iHI!!HhHI!iHI!!IhHI!iHI!!!hHI!iHI!!!hHI!iHI!!HhHI!iHI!!IhHI!iHI!!!hHI!iHI!!!" + "'", str18, "hhHI!iHI!!HhHI!iHI!!HhHI!iHI!!IhHI!iHI!!!hHI!iHI!!IhHI!iHI!!HhHI!iHI!!HhHI!iHI!!IhHI!iHI!!!hHI!iHI!!HhHI!iHI!!HhHI!iHI!!IhHI!iHI!!!hHI!iHI!!IhHI!iHI!!HhHI!iHI!!IhHI!iHI!!!hHI!iHI!!!hHI!iHI!!HhHI!iHI!!IhHI!iHI!!!hHI!iHI!!!");
    }

    @Test
    public void test9620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9620");
        char[] charArray16 = new char[] { '#', '4', '4', '4' };
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray16);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray16);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.uncapitalize("H", charArray16);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.uncapitalize("hhhi!ihhi!!", charArray16);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.initials("hhhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!ihi!!hi!hhi!ihi!!hi!!", charArray16);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!hhhi!hhhi!Ihhi!!hhi!Ihhi!hhhi!hhhi!Ihhi!!hhi!Hhhi!Ihhi!!hhi!!", charArray16);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalize("HhHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!ihHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!ihHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!!hHHI!IHHI!HI!!h", charArray16);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalizeFully("hhi!", charArray16);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.initials("hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhhhi!ihhi!hhi!ihi!!hi!!", charArray16);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.capitalize("hHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHHHH", charArray16);
        java.lang.String str27 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHI!HHHI!HHHI!", charArray16);
        java.lang.String str28 = org.apache.commons.lang.WordUtils.uncapitalize("hHHHHI!IHHHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!hhHHHI!IHHI!!hhHHHI!IHHI!!hhHHHI!IHhHHHI!HHHIhHHI!HHHI!IHHI!!HI!!ihHHHI!IHHI!!!hHHHI!IHHI!!hhHHHhHHHI!HHHIhHHI!HHHI!IHHI!!I!IHHI!!hhHHHI!IHHI!!hhHHHI!IHHI!!ihHHHI!HHHIhHHI!HHHI!IHHI!!hHHHI!IHHI!!!hHHHI!IHHI!!ihHHHI!IHHhHHHI!HHHIhHHI!HHHI!IHHI!!I!!hhHHHI!IHHI!!hhHHHI!IHHI!!ihHHHIhHHHI!HHHIhHHI!HHHI!IHHI!!!IHHI!!!hHHHI!IHHI!!!", charArray16);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] { '#', '4', '4', '4' });
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hi!" + "'", str17, "Hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hi!" + "'", str18, "Hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "h" + "'", str19, "h");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hhhi!ihhi!!" + "'", str20, "hhhi!ihhi!!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "h" + "'", str21, "h");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Hhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!" + "'", str22, "Hhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "HhHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!ihHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!ihHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!!hHHI!IHHI!HI!!h" + "'", str23, "HhHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!ihHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!ihHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!!hHHI!IHHI!HI!!h");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Hhi!" + "'", str24, "Hhi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "h" + "'", str25, "h");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHHHH" + "'", str26, "HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHHHH");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Hhhi!hhhi!hhhi!" + "'", str27, "Hhhi!hhhi!hhhi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hHHHHI!IHHHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!hhHHHI!IHHI!!hhHHHI!IHHI!!hhHHHI!IHhHHHI!HHHIhHHI!HHHI!IHHI!!HI!!ihHHHI!IHHI!!!hHHHI!IHHI!!hhHHHhHHHI!HHHIhHHI!HHHI!IHHI!!I!IHHI!!hhHHHI!IHHI!!hhHHHI!IHHI!!ihHHHI!HHHIhHHI!HHHI!IHHI!!hHHHI!IHHI!!!hHHHI!IHHI!!ihHHHI!IHHhHHHI!HHHIhHHI!HHHI!IHHI!!I!!hhHHHI!IHHI!!hhHHHI!IHHI!!ihHHHIhHHHI!HHHIhHHI!HHHI!IHHI!!!IHHI!!!hHHHI!IHHI!!!" + "'", str28, "hHHHHI!IHHHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!hhHHHI!IHHI!!hhHHHI!IHHI!!hhHHHI!IHhHHHI!HHHIhHHI!HHHI!IHHI!!HI!!ihHHHI!IHHI!!!hHHHI!IHHI!!hhHHHhHHHI!HHHIhHHI!HHHI!IHHI!!I!IHHI!!hhHHHI!IHHI!!hhHHHI!IHHI!!ihHHHI!HHHIhHHI!HHHI!IHHI!!hHHHI!IHHI!!!hHHHI!IHHI!!ihHHHI!IHHhHHHI!HHHIhHHI!HHHI!IHHI!!I!!hhHHHI!IHHI!!hhHHHI!IHHI!!ihHHHIhHHHI!HHHIhHHI!HHHI!IHHI!!!IHHI!!!hHHHI!IHHI!!!");
    }

    @Test
    public void test9621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9621");
        char[] charArray11 = new char[] {};
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("hH", charArray11);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("hhi!", charArray11);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("hhi!", charArray11);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("hhhi!ihhi!hhhhi!ihhi!hi!!h", charArray11);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("Hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhhhi!ihhhhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!", charArray11);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalize("hHHHI!IHHI!HHHI!IHHI!!HI!!", charArray11);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray11);
        java.lang.Class<?> wildcardClass23 = charArray11.getClass();
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] {});
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hH" + "'", str16, "hH");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hhi!" + "'", str17, "hhi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hhi!" + "'", str18, "hhi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hhhi!ihhi!hhhhi!ihhi!hi!!h" + "'", str19, "hhhi!ihhi!hhhhi!ihhi!hi!!h");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhhhi!ihhhhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!" + "'", str20, "Hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhhhi!ihhhhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hHHHI!IHHI!HHHI!IHHI!!HI!!" + "'", str21, "hHHHI!IHHI!HHHI!IHHI!!HI!!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test9622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9622");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!h", (int) (short) 100, (-1), "HhHHHI!IHHHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hIHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!h!HhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hhHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hIHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!h!HhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hiHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hIHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!h!HhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!h!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!h" + "'", str4, "Hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!h");
    }

    @Test
    public void test9623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9623");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hHHHI!HHHI!IHHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHHI!HHHI!IHHI!!" + "'", str1, "hHHHI!HHHI!IHHI!!");
    }

    @Test
    public void test9624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9624");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("HhHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!IHHHi!iHHi!!HHHHi!iHHi!!HHHHhhhhhhhhiHhhhi!hhhihhhhi!hhhihhhi!ihhi!hi!!!ihhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test9625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9625");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HIHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!H!HHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HIHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!H!HHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HIHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HIHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!H!HHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!H!", (int) (short) 100, 0, "Hhhhhhhhhihhhhi!ihhi!hi!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!Hhhhhhhhhihhhhi!ihhi!hi!!" + "'", str4, "hHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!Hhhhhhhhhihhhhi!ihhi!hi!!");
    }

    @Test
    public void test9626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9626");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("Hhhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhihhi!hhi!hhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhihhi!hhi!hhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!" + "'", str1, "Hhhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhihhi!hhi!hhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
    }

    @Test
    public void test9627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9627");
        char[] charArray12 = new char[] {};
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray12);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("", charArray12);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("hi!", charArray12);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray12);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray12);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("", charArray12);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.uncapitalize("hH", charArray12);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.uncapitalize("hhhi!Hhhi!Ihhi!!", charArray12);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.uncapitalize("hhhi!hhhi!hhhi!", charArray12);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray12);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.initials("Hhhi!hhhi!HHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!hHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!hhhi!Hhhi!hhHI!", charArray12);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.initials("hHHI!IHHI!hHhhI!IhhI!!HHhhI!IhhI!!HHhhI!IhhI!!HHhhI!IhhI!!IHhhI!IhhI!!!HhhI!IhhI!!HHhhI!IhhI!!HHhhI!IhhI!!HHhhhHHHHHHHHHHHHHHHIHHH!HHHHHHHHHHHHHHHIHHH!HHHIHHHHHHHHHHHIHHH!HHH!I!IhhI!!IHhhI!IhhI!!!HhhI!IhhI!!IHhhI!IhhI!!HHhhI!IhhI!!HHhhI!IhhI!!IHhhI!IhhI!!!HhhI!IhhI!!!hhhI!IhhI!hHhhI!IhhI!!HHhhI!IhhI!!HHhhI!IhhI!!HHhhI!IhhI!!IHhhI!IhhI!!!HhhI!IhhI!!HHhhI!IhhI!!HHhhI!IhhI!!HHhhhHHHHHHHHHHHHHHHIHHH!HHHHHHHHHHHHHHHIHHH!HHHIHHHHHHHHHHHIHHH!HHH!I!IhhI!!IHhhI!IhhI!!!HhhI!IhhI!!IHhhI!IhhI!!HHhhI!IhhI!!HHhhI!IhhI!!IHhhI!IhhI!!!HhhI!IhhI!!!HI!!", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] {});
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hi!" + "'", str16, "Hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hH" + "'", str19, "hH");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hhhi!Hhhi!Ihhi!!" + "'", str20, "hhhi!Hhhi!Ihhi!!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hhhi!hhhi!hhhi!" + "'", str21, "hhhi!hhhi!hhhi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test9628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9628");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hHhh", 0, "hHHHI!IHHI!HI!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHhh" + "'", str4, "hHhh");
    }

    @Test
    public void test9629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9629");
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
        java.lang.String str25 = org.apache.commons.lang.WordUtils.capitalizeFully("hhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!IhHHI!hHHI!iHHI!!!hHHI!hHHI!iHHIhHHHi!iHHi!hi!!", charArray13);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.capitalize("hHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!", charArray13);
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
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!IhHHI!hHHI!iHHI!!!hHHI!hHHI!iHHIhHHHi!iHHi!hi!!" + "'", str25, "hhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!IhHHI!hHHI!iHHI!!!hHHI!hHHI!iHHIhHHHi!iHHi!hi!!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!" + "'", str26, "hHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!");
    }

    @Test
    public void test9630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9630");
        char[] charArray9 = new char[] {};
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("hhhI!IhhI!HI!!", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("hHHI!IHHI!HHHI!IHHI!!HI!!", charArray9);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("HhHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!!h", charArray9);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!ihhi!hi!!", charArray9);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!h", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hhhI!IhhI!HI!!" + "'", str14, "hhhI!IhhI!HI!!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hHHI!IHHI!HHHI!IHHI!!HI!!" + "'", str15, "hHHI!IHHI!HHHI!IHHI!!HI!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HhHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!!h" + "'", str16, "HhHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!!h");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hhhi!ihhi!hi!!" + "'", str17, "Hhhi!ihhi!hi!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!h" + "'", str18, "Hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!h");
    }

    @Test
    public void test9631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9631");
        char[] charArray8 = new char[] { ' ' };
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("Hhi!", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("H", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("hHHHi!iHHi!hi!!", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!IhHHI!hHHI!iHHI!!!hHHI!hHHI!ihhHHHI!IHHI!HI!!H", charArray8);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { ' ' });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H" + "'", str9, "H");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hhi!" + "'", str10, "Hhi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "h" + "'", str11, "h");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "h" + "'", str12, "h");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!IhHHI!hHHI!iHHI!!!hHHI!hHHI!ihhHHHI!IHHI!HI!!H" + "'", str14, "HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!IhHHI!hHHI!iHHI!!!hHHI!hHHI!ihhHHHI!IHHI!HI!!H");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test9632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9632");
        char[] charArray6 = new char[] { '#', ' ', '4' };
        java.lang.String str7 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray6);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.uncapitalize("hhhhh", charArray6);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IhHHHI!hHHI!hHi!HHhi!HHI!!IHHHI!IHHI!!!HHHHHI!IHHI!!HhHHHI!hHHI!hHi!HHhi!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHhHHHI!hHHI!hHi!HHhi!I!!!HHHi!iHHi!HHHI!IHHI!!hi!!IHHhHHHI!hHHI!hHi!HHhi!HHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHIhHHHI!hHHI!hHi!HHhi!!!IHHHI!IHHI!!!!", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '#', ' ', '4' });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Hi!" + "'", str7, "Hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hhhhh" + "'", str8, "hhhhh");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H" + "'", str9, "H");
    }

    @Test
    public void test9633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9633");
        char[] charArray7 = new char[] {};
        java.lang.String str8 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("hi!", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHHI!IHHIHHHI!IHHHHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!iHHHI!hHHI!iHHIhhhhI!IhhI!HI!!h", charArray7);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!hhhi!ihhi!HHHi!iHHi!HHHI!IHHI!!hi!!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhihhhi!ihhi!HHHi!iHHi!HHHI!IHHI!!hi!!!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhhhhi!ihhi!HHHi!iHHi!HHHI!IHHI!!hi!!i!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhhhi!ihhi!HHHi!iHHi!HHHI!IHHI!!hi!!hi!!ihhhi!ihhi!!!hhhi!ihhi!!!", charArray7);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("hhhi!ihhi!hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Ihhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Ihhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Ihhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Ihhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hI!" + "'", str11, "hI!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!hhhi!ihhi!HHHi!iHHi!HHHI!IHHI!!hi!!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhihhhi!ihhi!HHHi!iHHi!HHHI!IHHI!!hi!!!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhhhhi!ihhi!HHHi!iHHi!HHHI!IHHI!!hi!!i!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhhhi!ihhi!HHHi!iHHi!HHHI!IHHI!!hi!!hi!!ihhhi!ihhi!!!hhhi!ihhi!!!" + "'", str13, "Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!hhhi!ihhi!HHHi!iHHi!HHHI!IHHI!!hi!!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhihhhi!ihhi!HHHi!iHHi!HHHI!IHHI!!hi!!!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhhhhi!ihhi!HHHi!iHHi!HHHI!IHHI!!hi!!i!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhhhi!ihhi!HHHi!iHHi!HHHI!IHHI!!hi!!hi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hhhi!ihhi!hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Ihhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Ihhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Ihhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Ihhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!" + "'", str14, "hhhi!ihhi!hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Ihhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Ihhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Ihhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Ihhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!");
    }

    @Test
    public void test9634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9634");
        char[] charArray8 = new char[] { '#', ' ', '4' };
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("HHhhhhi!hhhihhhi!hhhi!ihhi!!hhhhHHhi!hi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhHHhi!hihhhi!hhhi!ihhi!!ihhhhi!hhhihhhHHhi!i!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhHHhi!i!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhHHhi!i!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhHHhi!hhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!HHhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihHHhi!hhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hHHhi!hhi!ihhi!!hhhhhi!hhhihhhi!hhhi!iHHhi!hhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!HHhi!!hhhhi!hhhihhhi!hhhi!ihhi!!ihhhhHHhi!i!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhHHhi!ihhhi!hhhi!ihhi!!ihhhhi!hhhihhhiHHhi!!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhiHHhi!!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhiHHhi!!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhHHhi!hhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hHHhi!hhihhhi!hhhi!ihhi!!!H", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("hhhhhhhhhhhhh", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("hhi!hhi!hhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhhhhhhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhhi!ihhihhhi!ihhhhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!IhhiHHHHi!iHHi!hi!!H", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '#', ' ', '4' });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Hi!" + "'", str9, "Hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hi!" + "'", str10, "Hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hhhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhhhi!hi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhhhi!hihhhi!hhhi!ihhi!!ihhhhi!hhhihhhhhhi!i!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhhhhi!i!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhhhhi!i!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhhi!hhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhhi!hhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhhi!hhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!hhhi!!hhhhi!hhhihhhi!hhhi!ihhi!!ihhhhhhhi!i!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhhhhi!ihhhi!hhhi!ihhi!!ihhhhi!hhhihhhihhhi!!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhihhhi!!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhihhhi!!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhhi!hhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhhi!hhihhhi!hhhi!ihhi!!!h" + "'", str11, "Hhhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhhhi!hi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhhhi!hihhhi!hhhi!ihhi!!ihhhhi!hhhihhhhhhi!i!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhhhhi!i!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhhhhi!i!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhhi!hhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhhi!hhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhhi!hhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!hhhi!!hhhhi!hhhihhhi!hhhi!ihhi!!ihhhhhhhi!i!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhhhhi!ihhhi!hhhi!ihhi!!ihhhhi!hhhihhhihhhi!!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhihhhi!!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhihhhi!!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhhi!hhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhhi!hhihhhi!hhhi!ihhi!!!h");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hhhhhhhhhhhhh" + "'", str12, "hhhhhhhhhhhhh");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hhi!hhi!hhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhhhhhhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhhi!ihhihhhi!ihhhhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhihhhhi!ihhi!hi!!h" + "'", str13, "Hhi!hhi!hhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhhhhhhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhhi!ihhihhhi!ihhhhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhihhhhi!ihhi!hi!!h");
    }

    @Test
    public void test9635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9635");
        char[] charArray11 = new char[] {};
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("H", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("", charArray11);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("hHI!", charArray11);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!", charArray11);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.initials("hHhhhi!ihhi!hi!!h", charArray11);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray11);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.uncapitalize("hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!h", charArray11);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.initials("hHhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhHhi!", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] {});
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hHI!" + "'", str17, "hHI!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!" + "'", str18, "hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!h" + "'", str21, "hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!h");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test9636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9636");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("HHHHH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test9637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9637");
        char[] charArray7 = new char[] {};
        java.lang.String str8 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("H", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("hhHI!", charArray7);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("hHI!iHI!!", charArray7);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhi!ihhihhh", charArray7);
        java.lang.Class<?> wildcardClass15 = charArray7.getClass();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hhHI!" + "'", str12, "hhHI!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hHI!iHI!!" + "'", str13, "hHI!iHI!!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hhhhi!ihhihhh" + "'", str14, "Hhhhi!ihhihhh");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test9638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9638");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhhhi!ihhi!hi!!hhhhhi!ihhi!hi!!hhhhhi!ihhi!hi!!hhhhhi!ihhi!hi!!hhhhhi!ihhi!hi!!ihhhhi!ihhi!hi!!!hhhhi!ihhi!hi!!ihhhhi!ihhi!hi!!hhhhhi!ihhi!hi!!hhhhhi!ihhi!hi!!ihhhhi!ihhi!hi!!!hhhhi!ihhi!hi!!!hhhhi!ihhi!hi!!hhhhhi!ihhi!hi!!hhhhhi!ihhi!hi!!hhhhhi!ihhi!hi!!hhhhhi!ihhi!hi!!ihhhhi!ihhi!hi!!!hhhhi!ihhi!hi!!ihhhhi!ihhi!hi!!hhhhhi!ihhi!hi!!hhhhhi!ihhi!hi!!ihhhhi!ihhi!hi!!!hhhhi!ihhi!hi!!!hhhhi!ihhi!hi!!hhhhhi!ihhi!hi!!hhhhhi!ihhi!hi!!hhhhhi!ihhi!hi!!hhhhhi!ihhi!hi!!ihhhhi!ihhi!hi!!!hhhhi!ihhi!hi!!ihhhhi!ihhi!hi!!hhhhhi!ihhi!hi!!hhhhhi!ihhi!hi!!ihhhhi!ihhi!hi!!hhhhhi!ihhi!hi!!hhhhhi!ihhi!hi!!hhhhhi!ihhi!hi!!ihhhhi!ihhi!hi!!!hhhhi!ihhi!hi!!hhhhhi!ihhi!hi!!hhhhhi!ihhi!hi!!hhhhhi!ihhi!hi!!ihhhhi!ihhi!hi!!!hhhhi!ihhi!hi!!ihhhhi!ihhi!hi!!hhhhhi!ihhi!hi!!hhhhhi!ihhi!hi!!ihhhhi!ihhi!hi!!!hhhhi!ihhi!hi!!!", (int) (byte) 1, (int) (short) 10, "hhHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!!Hhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!!Hhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!!Hhi!Ihi!!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhhhi!ihhhhHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!!Hhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!!Hhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!!Hhi!Ihi!!!" + "'", str4, "Hhhhhi!ihhhhHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!!Hhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!!Hhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!!Hhi!Ihi!!!");
    }

    @Test
    public void test9639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9639");
        char[] charArray6 = new char[] { 'a', '4', 'a' };
        java.lang.String str7 = org.apache.commons.lang.WordUtils.capitalize("", charArray6);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!h", charArray6);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalize("", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { 'a', '4', 'a' });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!h" + "'", str8, "Hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!h");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test9640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9640");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhhhi!hhhiHhhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!", (-1), (int) (short) 0, "Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!" + "'", str4, "Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
    }

    @Test
    public void test9641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9641");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("HhhI!HhI!HHhhhi!ihhihhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHi!hHi!hhHHHI!IHHIHHHI!IHHI!HHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!" + "'", str1, "hHHi!hHi!hhHHHI!IHHIHHHI!IHHI!HHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!");
    }

    @Test
    public void test9642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9642");
        char[] charArray9 = new char[] {};
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray9);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhi!ihhi!!", charArray9);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("Hhhhi!ihhihi!!hi!!", charArray9);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhhi!hhhiHHhhi!!ihhi!!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hhhi!ihhi!!" + "'", str16, "hhhi!ihhi!!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hhhhi!ihhihi!!hi!!" + "'", str17, "Hhhhi!ihhihi!!hi!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hhhhi!hhhiHHhhi!!ihhi!!" + "'", str18, "hhhhi!hhhiHHhhi!!ihhi!!");
    }

    @Test
    public void test9643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9643");
        char[] charArray9 = new char[] {};
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("hH", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("HI!", charArray9);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("Hhi!hhi!hhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!", charArray9);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("hhhi!hhhi!hHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HhHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!IHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!!HHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!", charArray9);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("hHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHHHHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!HHHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!HHHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!HHHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!IHHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!!HHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!HHHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!HHHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!HHHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!IHHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!!HHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!IHHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!HHHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!HHHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!IHHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!!HHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hH" + "'", str14, "hH");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HI!" + "'", str15, "HI!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hhi!hhi!hhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!" + "'", str16, "Hhi!hhi!hhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hhhi!hhhi!hHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HhHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!IHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!!HHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!" + "'", str17, "hhhi!hhhi!hHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HhHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!IHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!!HHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test9644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9644");
        char[] charArray9 = new char[] {};
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("Hi!", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("hhhhi!ihhi!hi!!h", charArray9);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("hhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!", charArray9);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("HhhI!IhhI!Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!", charArray9);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("Hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhhhhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!hhhi!ihhi!!hi!!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hi!" + "'", str14, "Hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hhhhi!ihhi!hi!!h" + "'", str15, "hhhhi!ihhi!hi!!h");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!" + "'", str16, "hhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test9645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9645");
        char[] charArray10 = new char[] {};
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("hi!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("HI!", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("hH", charArray10);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray10);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.uncapitalize("hhI!HhI!HhhhHHI!HHHI!Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!", charArray10);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhHhhI!IhhI!hHHHi!iHHi!hi!!H", charArray10);
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hhI!HhI!HhhhHHI!HHHI!Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!" + "'", str19, "hhI!HhI!HhhhHHI!HHHI!Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhHhhI!IhhI!hHHHi!iHHi!hi!!H" + "'", str20, "Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhHhhI!IhhI!hHHHi!iHHi!hi!!H");
    }

    @Test
    public void test9646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9646");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhhi!ihhi!!", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhi!ihhi!!" + "'", str2, "hhhi!ihhi!!");
    }

    @Test
    public void test9647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9647");
        char[] charArray8 = new char[] { ' ', 'a', 'a' };
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("hhhi!ihhi!!", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhhi!hhhi!hhi!hhhi!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("hh", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { ' ', 'a', 'a' });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H" + "'", str9, "H");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "h" + "'", str10, "h");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "h" + "'", str11, "h");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hh" + "'", str12, "Hh");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test9648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9648");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!hHhhhhhi!hhhhhhhi!ihhihhhhi!hhhi!ihhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHHHHI!HHHHHHHI!IHHIHHHHI!HHHI!IHHI!!" + "'", str1, "HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHHHHI!HHHHHHHI!IHHIHHHHI!HHHI!IHHI!!");
    }

    @Test
    public void test9649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9649");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!H", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!h" + "'", str2, "Hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!h");
    }

    @Test
    public void test9650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9650");
        char[] charArray7 = new char[] {};
        java.lang.String str8 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("hi!", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray7);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!", charArray7);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!ihhi!!", charArray7);
        java.lang.Class<?> wildcardClass15 = charArray7.getClass();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hi!" + "'", str11, "Hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!" + "'", str13, "hhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hhhi!ihhi!!" + "'", str14, "Hhhi!ihhi!!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test9651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9651");
        char[] charArray7 = new char[] {};
        java.lang.String str8 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("H", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("Hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!", charArray7);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("hhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!IhHHHI!HHHI!HHHI!!hHHHI!HHHI!HHHI!IhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!IhHHHI!HHHI!HHHI!!hHHHI!HHHI!HHHI!!hHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!IhHHHI!HHHI!HHHI!!hHHHI!HHHI!HHHI!IhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!IhHHHI!HHHI!HHHI!!hHHHI!HHHI!HHHI!!hHHHI!HHHI!HHHI!HhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!IhHHHI!HHHI!HHHI!!hHHHI!HHHI!HHHI!IhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!IhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!HhHHHI!HHHI!HHHI!HhHHHI!HHHI!HHHI!IhHHHI!HHHI!HHHI!!hHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!HhHHHI!HHHI!HHHI!HhHHHI!HHHI!HHHI!IhHHHI!HHHI!HHHI!!hHHHI!HHHI!HHHI!ihHHHI!HHHI!HHHI!HhHHHI!HHHI!HHHI!HhHHHI!HHHI!HHHI!IhHHHI!HHHI!HHHI!!hHHHI!HHHI!HHHI!!", charArray7);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!!hhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!!hhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!!hhhi!ihhi!hhi!ihi!!hi!!!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!" + "'", str12, "Hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!!hhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!!hhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!!hhhi!ihhi!hhi!ihi!!hi!!!" + "'", str14, "hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!!hhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!!hhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!!hhhi!ihhi!hhi!ihi!!hi!!!");
    }

    @Test
    public void test9652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9652");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHhhi!ihhihhhhhI!Ihhhhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHhhi!ihhihhhhhI!Ihhhhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!" + "'", str2, "hHhhi!ihhihhhhhI!Ihhhhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!");
    }

    @Test
    public void test9653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9653");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhhi!hhhiHHHHI!HHHIHHHi!iHHi!hi!!!IHHI!!", (int) (short) 0, 10, "HHHI!IHHI!hhHHI!HHHI!Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhhi!hhhiHHHI!IHHI!hhHHI!HHHI!Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!" + "'", str4, "Hhhhi!hhhiHHHI!IHHI!hhHHI!HHHI!Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
    }

    @Test
    public void test9654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9654");
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
        java.lang.String str35 = org.apache.commons.lang.WordUtils.initials("HHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhHHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!iHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!!HHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!iHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!!HHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!iHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!iHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!!HHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!!", charArray18);
        java.lang.String str36 = org.apache.commons.lang.WordUtils.uncapitalize("hhhi!ihhi!hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihhHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHHHH", charArray18);
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
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hhhi!ihhi!hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihhHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHHHH" + "'", str36, "hhhi!ihhi!hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihhHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHHHH");
    }

    @Test
    public void test9655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9655");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHHI!IHHIhhhi!hhhi!ihhi!!", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhhi!ihhihhhi!hhhi!ihhi!!" + "'", str2, "Hhhhi!ihhihhhi!hhhi!ihhi!!");
    }

    @Test
    public void test9656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9656");
        char[] charArray9 = new char[] {};
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("H", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("hh", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("HH", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("Hhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!", charArray9);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("hHhhI!IhhI!hHHHi!iHHi!hi!!HHHhhI!IhhI!hHHHi!iHHi!hi!HHHI!hHHI!hHi!HHhi!", charArray9);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("hHHHI!HHHI!HHHI!", charArray9);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("hHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HhHHhHHI!IHHI!hHHI!IHHI!hhi!Ihi!!HI!!hHH", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hh" + "'", str13, "hh");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HH" + "'", str14, "HH");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hHhhI!IhhI!hHHHi!iHHi!hi!!HHHhhI!IhhI!hHHHi!iHHi!hi!HHHI!hHHI!hHi!HHhi!" + "'", str16, "hHhhI!IhhI!hHHHi!iHHi!hi!!HHHhhI!IhhI!hHHHi!iHHi!hi!HHHI!hHHI!hHi!HHhi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hHHHI!HHHI!HHHI!" + "'", str17, "hHHHI!HHHI!HHHI!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HhHHhHHI!IHHI!hHHI!IHHI!hhi!Ihi!!HI!!hHH" + "'", str18, "hHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HhHHhHHI!IHHI!hHHI!IHHI!hhi!Ihi!!HI!!hHH");
    }

    @Test
    public void test9657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9657");
        char[] charArray7 = new char[] {};
        java.lang.String str8 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("H", charArray7);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("hHI!HHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!HHI!IHI!!HI!!", charArray7);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("hHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!hHhhhi!ihhihhhI!IhhI!Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H" + "'", str12, "H");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hHI!HHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!HHI!IHI!!HI!!" + "'", str13, "hHI!HHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!HHI!IHI!!HI!!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!hHhhhi!ihhihhhI!IhhI!Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!" + "'", str14, "hHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!hHhhhi!ihhihhhI!IhhI!Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!");
    }

    @Test
    public void test9658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9658");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hHHHI!HHHIHHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!hhhihhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!" + "'", str1, "Hhhhi!hhhihhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
    }

    @Test
    public void test9659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9659");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!HHI!IHI!!HI!!", (int) (short) 10, 0, "hhhi!hhhi!HhHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!!hHI!iHI!!ihHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!!hHI!iHI!!hhHI!iHI!!ihHI!iHI!!!hHI!iHI!!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHI!HHI!HHhhhi!hhhi!HhHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!!hHI!iHI!!ihHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!!hHI!iHI!!hhHI!iHI!!ihHI!iHI!!!hHI!iHI!!!" + "'", str4, "HHI!HHI!HHhhhi!hhhi!HhHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!!hHI!iHI!!ihHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!!hHI!iHI!!hhHI!iHI!!ihHI!iHI!!!hHI!iHI!!!");
    }

    @Test
    public void test9660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9660");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hHhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!hHhhhi!hhhi!ihhi!!hHhhhi!hhhi!ihhi!!iHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!hHhhhi!hhhi!ihhi!!iHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!hHhhhi!hhhi!ihhi!!hHhhhi!hhhi!ihhi!!iHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!hHhhhi!hhhi!ihhi!!iHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!!" + "'", str1, "HHhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!hHhhhi!hhhi!ihhi!!hHhhhi!hhhi!ihhi!!iHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!hHhhhi!hhhi!ihhi!!iHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!!");
    }

    @Test
    public void test9661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9661");
        char[] charArray7 = new char[] {};
        java.lang.String str8 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("hi!", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray7);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray7);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhi!ihhihhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhihhhhi!ihhi!hi!!h", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hi!" + "'", str11, "Hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hhhhi!ihhihhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhihhhhi!ihhi!hi!!h" + "'", str14, "Hhhhi!ihhihhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhihhhhi!ihhi!hi!!h");
    }

    @Test
    public void test9662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9662");
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
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhi!hhhiHHHI!IHHI!hhHHI!HHHI!Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!", charArray11);
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Hhhhi!hhhiHHHI!IHHI!hhHHI!HHHI!Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!" + "'", str22, "Hhhhi!hhhiHHHI!IHHI!hhHHI!HHHI!Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
    }

    @Test
    public void test9663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9663");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HhHhhI!IhhI!!HHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!iHhhI!IhhI!!!HhhI!IhhI!!iHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!iHhhI!IhhI!!!HhhI!IhhI!!!HhhI!IhhI!!HHhhI!IhhI!!HHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!iHhhI!IhhI!!!HhhI!IhhI!!iHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!iHhhI!IhhI!!!HhhI!IhhI!!!HhhI!IhhI!!HHhhI!IhhI!!HHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!iHhhI!IhhI!!!HhhI!IhhI!!iHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!iHhhI!IhhI!!!HhhI!IhhI!!!HhhI!IhhI!!IHhhI!IhhI!!HHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!iHhhI!IhhI!!!HhhI!IhhI!!iHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!iHhhI!IhhI!!!HhhI!IhhI!!!HhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!HHhhI!IhhI!!IHhhI!IhhI!!!", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HhHhhI!IhhI!!HHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!iHhhI!IhhI!!!HhhI!IhhI!!iHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!iHhhI!IhhI!!!HhhI!IhhI!!!HhhI!IhhI!!HHhhI!IhhI!!HHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!iHhhI!IhhI!!!HhhI!IhhI!!iHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!iHhhI!IhhI!!!HhhI!IhhI!!!HhhI!IhhI!!HHhhI!IhhI!!HHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!iHhhI!IhhI!!!HhhI!IhhI!!iHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!iHhhI!IhhI!!!HhhI!IhhI!!!HhhI!IhhI!!IHhhI!IhhI!!HHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!iHhhI!IhhI!!!HhhI!IhhI!!iHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!iHhhI!IhhI!!!HhhI!IhhI!!!HhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!HHhhI!IhhI!!IHhhI!IhhI!!!" + "'", str2, "HhHhhI!IhhI!!HHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!iHhhI!IhhI!!!HhhI!IhhI!!iHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!iHhhI!IhhI!!!HhhI!IhhI!!!HhhI!IhhI!!HHhhI!IhhI!!HHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!iHhhI!IhhI!!!HhhI!IhhI!!iHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!iHhhI!IhhI!!!HhhI!IhhI!!!HhhI!IhhI!!HHhhI!IhhI!!HHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!iHhhI!IhhI!!!HhhI!IhhI!!iHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!iHhhI!IhhI!!!HhhI!IhhI!!!HhhI!IhhI!!IHhhI!IhhI!!HHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!iHhhI!IhhI!!!HhhI!IhhI!!iHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!iHhhI!IhhI!!!HhhI!IhhI!!!HhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!HHhhI!IhhI!!IHhhI!IhhI!!!");
    }

    @Test
    public void test9664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9664");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hHhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHHhhhhhhhhhhhhhhhihhh!hhhhhhhhhhhhhhhihhh!hhhihhhhhhhhhhhihhh!hhh!i!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!ihHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhhhhhhhhhhhhhhhhhihhh!hhhhhhhhhhhhhhhihhh!hhhihhhhhhhhhhhihhh!hhh!i!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!" + "'", str1, "Hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhhhhhhhhhhhhhhhhhihhh!hhhhhhhhhhhhhhhihhh!hhhihhhhhhhhhhhihhh!hhh!i!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
    }

    @Test
    public void test9665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9665");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HhhI!IhhI!hHI!HHI!HHHHHHI!HHHI!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHHHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHHI!HHHI!HHI!HHHI!hHHHi!iHHihHI!HHI!HHHHHHI!HHHI!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHHHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHHI!HHHI!HHI!HHHI!!hi!!H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhI!IhhI!hHI!HHI!HHHHHHI!HHHI!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHHHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHHI!HHHI!HHI!HHHI!hHHHi!iHHihHI!HHI!HHHHHHI!HHHI!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHHHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHHI!HHHI!HHI!HHHI!!hi!!H" + "'", str1, "hhhI!IhhI!hHI!HHI!HHHHHHI!HHHI!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHHHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHHI!HHHI!HHI!HHHI!hHHHi!iHHihHI!HHI!HHHHHHI!HHHI!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHHHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHHI!HHHI!HHI!HHHI!!hi!!H");
    }

    @Test
    public void test9666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9666");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("Hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!", 10, "hhI!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!" + "'", str4, "Hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!");
    }

    @Test
    public void test9667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9667");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhhi!hhhhi!hhhhi!ihhhi!!hhhi!ihhhhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhhh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhhhi!hhhhi!hhhhi!ihhhi!!hhhi!ihhhhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhhh" + "'", str1, "hhhhhi!hhhhi!hhhhi!ihhhi!!hhhi!ihhhhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhhh");
    }

    @Test
    public void test9668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9668");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HhHHI!IHHI!HHHI!IHHI!!HI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhHHI!IHHI!HHHI!IHHI!!HI!!" + "'", str1, "hhHHI!IHHI!HHHI!IHHI!!HI!!");
    }

    @Test
    public void test9669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9669");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hhhhi!ihhihhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!ihhihhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!" + "'", str1, "Hhhhi!ihhihhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!");
    }

    @Test
    public void test9670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9670");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("Hhhhhi!ihhhhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihihhhi!ihhi!HHHi!iHHi!HHHI!IHHI!!hhHhHHI!IHHHhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhhhi!ihhi!hhi!ihi!!hi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHHHI!IHHHHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHIHHHI!IHHI!hhhI!IhhI!hhhi!ihhi!!HHhHhhi!ihhhHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHHHHI!IHHI!HHI!IHI!!HI!!" + "'", str1, "hHHHHI!IHHHHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHIHHHI!IHHI!hhhI!IhhI!hhhi!ihhi!!HHhHhhi!ihhhHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHHHHI!IHHI!HHI!IHI!!HI!!");
    }

    @Test
    public void test9671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9671");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!h" + "'", str1, "Hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!h");
    }

    @Test
    public void test9672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9672");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("HHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Ihhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Ihhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Ihhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!Ihhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!HhHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!HhHHHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!iHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!!HHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!iHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!!HHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!iHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!iHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!!HHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!!" + "'", str1, "hhHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!HhHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!HhHHHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!iHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!!HHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!iHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!!HHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!iHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!iHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!!HHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!!");
    }

    @Test
    public void test9673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9673");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HHhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhiHhi!hhi!hhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhiHhi!hhi!hhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!" + "'", str2, "HHhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhiHhi!hhi!hhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
    }

    @Test
    public void test9674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9674");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhhhhi!hhhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhhhi!hhhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!" + "'", str2, "Hhhhhi!hhhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
    }

    @Test
    public void test9675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9675");
        char[] charArray9 = new char[] { '4', '4' };
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("HHi!", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("HH", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("hhI!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!ihi!!hi!hhi!ihi!!hi!!", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("Hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!", charArray9);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("HhHHI!IHHI", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hi!" + "'", str10, "Hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hhi!" + "'", str11, "Hhi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hH" + "'", str12, "hH");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "h" + "'", str13, "h");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hhhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!ihi!!hi!hhi!ihi!!hi!!" + "'", str14, "Hhhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!ihi!!hi!hhi!ihi!!hi!!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
    }

    @Test
    public void test9676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9676");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hhHHi!iHHihhhhi!hhhi!ihhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhHHi!iHHihhhhi!hhhi!ihhi!!" + "'", str1, "hhHHi!iHHihhhhi!hhhi!ihhi!!");
    }

    @Test
    public void test9677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9677");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hhi!hhi!hhhHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!iHHHI!hHHI!iHHIhhhhI!IhhI!HI!!h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhi!hhi!hhhHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!iHHHI!hHHI!iHHIhhhhI!IhhI!HI!!h" + "'", str1, "Hhi!hhi!hhhHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!iHHHI!hHHI!iHHIhhhhI!IhhI!HI!!h");
    }

    @Test
    public void test9678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9678");
        char[] charArray11 = new char[] {};
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("hH", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("hI!", charArray11);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("HHi!", charArray11);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("hhI!HhI!HhI!HhI!ihI!!hI!ihI!HhI!HhI!ihI!!hI!hhI!ihI!!hI!!", charArray11);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhhhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihhhhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!!hh!", charArray11);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.uncapitalize("hHHHHI!IHHHHhhhi!ihhi!hi!!h", charArray11);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalize("hHHHI!HHHI!HHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHHI!IHHI!!", charArray11);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalize("HHhi!", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] {});
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hi!" + "'", str14, "Hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hI!" + "'", str16, "hI!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hhI!HhI!HhI!HhI!ihI!!hI!ihI!HhI!HhI!ihI!!hI!hhI!ihI!!hI!!" + "'", str18, "hhI!HhI!HhI!HhI!ihI!!hI!ihI!HhI!HhI!ihI!!hI!hhI!ihI!!hI!!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhhhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihhhhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!!hh!" + "'", str19, "Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhhhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihhhhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!!hh!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hHHHHI!IHHHHhhhi!ihhi!hi!!h" + "'", str20, "hHHHHI!IHHHHhhhi!ihhi!hi!!h");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hHHHI!HHHI!HHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHHI!IHHI!!" + "'", str21, "hHHHI!HHHI!HHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHHI!IHHI!!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "HHhi!" + "'", str22, "HHhi!");
    }

    @Test
    public void test9679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9679");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.uncapitalize("HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHHI!IHHIHHHi!iHHi!hHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHHhHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!hHHi!iHHi!HHHI!IHHI!!hi!!", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHHI!IHHIHHHi!iHHi!hHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHHhHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!hHHi!iHHi!HHHI!IHHI!!hi!!" + "'", str2, "hhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHHI!IHHIHHHi!iHHi!hHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHHhHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!hHHi!iHHi!HHHI!IHHI!!hi!!");
    }

    @Test
    public void test9680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9680");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hhHHHI!IHH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test9681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9681");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHI!IHHI!HHI!HHI!HHHHHHI!HHHI!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHHHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHHI!HHHI!HHI!HHHI!HHHHI!IHHIHHI!HHI!HHHHHHI!HHHI!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHHHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHHI!HHHI!HHI!HHHI!!HI!!H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!ihhi!hhi!hhi!hhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhhhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhhi!hhhi!hhi!hhhi!hhhhi!ihhihhi!hhi!hhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhhhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhhi!hhhi!hhi!hhhi!!hi!!h" + "'", str1, "Hhhi!ihhi!hhi!hhi!hhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhhhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhhi!hhhi!hhi!hhhi!hhhhi!ihhihhi!hhi!hhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhhhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhhi!hhhi!hhi!hhhi!!hi!!h");
    }

    @Test
    public void test9682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9682");
        char[] charArray3 = new char[] { '#' };
        java.lang.String str4 = org.apache.commons.lang.WordUtils.uncapitalize("Hi!", charArray3);
        java.lang.String str5 = org.apache.commons.lang.WordUtils.capitalizeFully("HhHHHi!iHHHHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!IHhhi!ihhi!HHI!iHI!!hi!!!Hhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!IHhhi!ihhi!HHI!iHI!!hi!!!Hhhi!ihhi!HHI!iHI!!hi!!IHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!IHhhi!ihhi!HHI!iHI!!hi!!!Hhhi!ihhi!HHI!iHI!!hi!!!", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] { '#' });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Hhhhhi!ihhhhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!!hhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!!hhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!!hhhi!ihhi!hhi!ihi!!hi!!!" + "'", str5, "Hhhhhi!ihhhhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!!hhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!!hhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!!hhhi!ihhi!hhi!ihi!!hi!!!");
    }

    @Test
    public void test9683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9683");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HHHHI!HHHIhHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!iHHHI!hHHI!iHHI!!!HHHIhhhhi!hhhihhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!h", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHHHI!HHHIhHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!iHHHI!hHHI!iHHI!!!HHHIhhhhi!hhhihhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!h" + "'", str2, "HHHHI!HHHIhHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!iHHHI!hHHI!iHHI!!!HHHIhhhhi!hhhihhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!h");
    }

    @Test
    public void test9684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9684");
        char[] charArray13 = new char[] { 'a', '4', 'a' };
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("", charArray13);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray13);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("HHHi!iHHi!!", charArray13);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray13);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("hhhI!IhhI!HI!!", charArray13);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.uncapitalize("hhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!HhHHHI!HHHI!IHHI!!HhHHHI!HHHI!IHHI!!IhHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!HhHHHI!HHHI!IHHI!!IhHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!!", charArray13);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhhhhhhhhhhhhhihhh!hhhhhhhhhhhhhhhihhh!hhhihhhhhhhhhhhihhh!hhh!", charArray13);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.initials("hHHHI!IHHI!HHHI!IHHI!!HI!!", charArray13);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.initials("HHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!HHHI!IHHI!!HI!!", charArray13);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalizeFully("HhhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!HhhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!Hhhi!ihhi!HHI!iHI!!hi!!", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { 'a', '4', 'a' });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hHHi!iHHi!!" + "'", str16, "hHHi!iHHi!!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hhhI!IhhI!HI!!" + "'", str18, "hhhI!IhhI!HI!!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!HhHHHI!HHHI!IHHI!!HhHHHI!HHHI!IHHI!!IhHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!HhHHHI!HHHI!IHHI!!IhHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!!" + "'", str19, "hhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!HhHHHI!HHHI!IHHI!!HhHHHI!HHHI!IHHI!!IhHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!HhHHHI!HHHI!IHHI!!IhHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hhhhhhhhhhhhhhhhihhh!hhhhhhhhhhhhhhhihhh!hhhihhhhhhhhhhhihhh!hhh!" + "'", str20, "hhhhhhhhhhhhhhhhihhh!hhhhhhhhhhhhhhhihhh!hhhihhhhhhhhhhhihhh!hhh!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "h" + "'", str21, "h");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "H" + "'", str22, "H");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!hhi!ihi!!hi!!" + "'", str23, "Hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!hhi!ihi!!hi!!");
    }

    @Test
    public void test9685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9685");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhi!hhhihHhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhHHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!hhhihhhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!" + "'", str1, "Hhhhi!hhhihhhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!");
    }

    @Test
    public void test9686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9686");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("Hhhi!hhhi!hhhi!hhhi!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!HHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!iHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!iHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!iHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!iHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!", (int) 'a', "hHHI!IHHI!HI!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhi!hhhi!hhhi!hhhi!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!HHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!iHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!iHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!iHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!iHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!" + "'", str4, "Hhhi!hhhi!hhhi!hhhi!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!HHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!iHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!iHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!iHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!iHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!");
    }

    @Test
    public void test9687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9687");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("", (-1), (int) (short) 10, "Hhhhhi!hhhhHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHHHHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!HHHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!HHHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!HHHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!IHHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!!HHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!HHHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!HHHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!HHHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!IHHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!!HHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!IHHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!HHHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!HHHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!IHHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!!HHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test9688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9688");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hhHHHI!IHHI!!hhHHHI!IHHI!!hhHHHI!IHhHHHI!HHHIhHHI!HHHI!IHHI!!HI!!ihHHHI!IHHI!!!hHHHI!IHHI!!hhHHHhHHHHHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!hHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!hhhi!Hhhi!hhHI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHhhhi!ihhi!!HHhhhi!ihhi!!HHhhhi!ihHhhhi!hhhiHhhi!hhhi!ihhi!!hi!!IHhhhi!ihhi!!!Hhhhi!ihhi!!HHhhhHhhhhhhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!HhhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!HHHI!hHHI!HHhi!" + "'", str1, "HHhhhi!ihhi!!HHhhhi!ihhi!!HHhhhi!ihHhhhi!hhhiHhhi!hhhi!ihhi!!hi!!IHhhhi!ihhi!!!Hhhhi!ihhi!!HHhhhHhhhhhhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!HhhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!HHHI!hHHI!HHhi!");
    }

    @Test
    public void test9689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9689");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHhhhi!ihhiHHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!iHHHI!hHHI!iHHIhhhhI!IhhI!HI!!h", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHhhhi!ihhiHHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!iHHHI!hHHI!iHHIhhhhI!IhhI!HI!!h" + "'", str2, "hHhhhi!ihhiHHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!iHHHI!hHHI!iHHIhhhhI!IhhI!HI!!h");
    }

    @Test
    public void test9690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9690");
        char[] charArray8 = new char[] {};
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("hi!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("Hhhi!ihhi!!", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhhhhhhihhhhi!ihhi!hi!!", charArray8);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHHI!IHHIHHHi!iHHi!hHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHHhHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!hHHi!iHHi!HHHI!IHHI!!hi!!", charArray8);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("hHHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!iHhi!Ihi!!!Hhi!Ihi!!iHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!!Hhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!!Hhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!!Hhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!!Hhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!!Hhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hhhhhhhhhihhhhi!ihhi!hi!!" + "'", str14, "Hhhhhhhhhihhhhi!ihhi!hi!!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHHI!IHHIHHHi!iHHi!hHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHHhHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!hHHi!iHHi!HHHI!IHHI!!hi!!" + "'", str15, "HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHHI!IHHIHHHi!iHHi!hHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHHhHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!hHHi!iHHi!HHHI!IHHI!!hi!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hHHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!iHhi!Ihi!!!Hhi!Ihi!!iHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!!Hhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!!Hhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!!Hhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!!Hhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!!Hhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!!" + "'", str16, "hHHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!iHhi!Ihi!!!Hhi!Ihi!!iHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!!Hhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!!Hhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!!Hhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!!Hhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!!Hhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!!");
    }

    @Test
    public void test9691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9691");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhhhhhhhihh!hhhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhHhhhhhi!hhhhhi!hhhi!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!HHhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhHHHHHHHHHIHHHHi!iHHi!hi!!", 0, (int) (short) 10, "hhhhi!ihhihhhi!ihhi!hhhhhhhhhihhhHHHI!HHHIhhhhi!hhhihhhI!IhhI!HI!!!ihhi!!!hhhhhhhhhhhihh!hhihhhhhhhhihh!hhHHHI!HHHIhhhhi!hhhihhhI!IhhI!HI!!!ihhi!!h!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhhhhhhhihhhhi!ihhihhhi!ihhi!hhhhhhhhhihhhHHHI!HHHIhhhhi!hhhihhhI!IhhI!HI!!!ihhi!!!hhhhhhhhhhhihh!hhihhhhhhhhihh!hhHHHI!HHHIhhhhi!hhhihhhI!IhhI!HI!!!ihhi!!h!" + "'", str4, "Hhhhhhhhhihhhhi!ihhihhhi!ihhi!hhhhhhhhhihhhHHHI!HHHIhhhhi!hhhihhhI!IhhI!HI!!!ihhi!!!hhhhhhhhhhhihh!hhihhhhhhhhihh!hhHHHI!HHHIhhhhi!hhhihhhI!IhhI!HI!!!ihhi!!h!");
    }

    @Test
    public void test9692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9692");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!HHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!hhhhhI!Ihhhhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!", (int) (byte) 0, "HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!IhHHI!hHHI!iHHI!!!hHHI!hHHI!ihhHHHI!IHHI!HI!!H", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!HHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!hhhhhI!Ihhhhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!" + "'", str4, "HHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!HHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!hhhhhI!Ihhhhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!");
    }

    @Test
    public void test9693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9693");
        char[] charArray13 = new char[] {};
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray13);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("", charArray13);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray13);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray13);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray13);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("HH", charArray13);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray13);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalizeFully("HHI!iHI!!", charArray13);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.uncapitalize("hhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!", charArray13);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.uncapitalize("hHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHhHHI!HHHI!IHHI!!", charArray13);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhi!hhhiHHhhi!!ihhi!!", charArray13);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.initials("Hhhhhi!hhhhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhhhi!ihhi!hhi!ihi!!hi!!", charArray13);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhihhhi!ihhi!hhh", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] {});
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "HH" + "'", str19, "HH");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "HHI!iHI!!" + "'", str21, "HHI!iHI!!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!" + "'", str22, "hhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHhHHI!HHHI!IHHI!!" + "'", str23, "hHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHhHHI!HHHI!IHHI!!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Hhhhi!hhhiHHhhi!!ihhi!!" + "'", str24, "Hhhhi!hhhiHHhhi!!ihhi!!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhihhhi!ihhi!hhh" + "'", str26, "Hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhihhhi!ihhi!hhh");
    }

    @Test
    public void test9694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9694");
        char[] charArray8 = new char[] {};
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("H", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("hhI!", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("hH", charArray8);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("hHHi!iHHi!!", charArray8);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHi!iHHi!hi!!", charArray8);
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HHHi!iHHi!hi!!" + "'", str16, "HHHi!iHHi!hi!!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test9695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9695");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhhi!hhhihhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!hhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!HHHHHi!iHHHHHI!IHHI!HHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhhi!hhhihhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhhhi!ihhhhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!" + "'", str2, "Hhhhi!hhhihhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhhhi!ihhhhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!");
    }

    @Test
    public void test9696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9696");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HHHHi!iHHi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHHi!iHHi!!" + "'", str1, "hHHHi!iHHi!!");
    }

    @Test
    public void test9697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9697");
        char[] charArray10 = new char[] { '#', '4', '4', '4' };
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!ihhi!hi!!", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("HhhI!IhhI!hHHHi!iHHi!hi!!H", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!IhhiHHHHi!iHHi!hi!!H", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("hHHI!IHHI!hHh", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhi!ihhihhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '#', '4', '4', '4' });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hi!" + "'", str11, "Hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hhhi!ihhi!hi!!" + "'", str12, "Hhhi!ihhi!hi!!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HhhI!IhhI!hHHHi!iHHi!hi!!H" + "'", str13, "HhhI!IhhI!hHHHi!iHHi!hi!!H");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!IhhiHHHHi!iHHi!hi!!H" + "'", str14, "Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!IhhiHHHHi!iHHi!hi!!H");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "h" + "'", str15, "h");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hhhhi!ihhihhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!" + "'", str16, "Hhhhi!ihhihhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!");
    }

    @Test
    public void test9698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9698");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("HhHHHI!IHHI!!hhHHHI!IHHI!!hhHHHI!IHHI!!ihHHHI!IHHI!!!hHHHI!IHHI!!hhHHHI!IHHI!!hhHHHI!IHHI!!hhHHHIHhHHHhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhiHhi!hhi!hhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test9699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9699");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("Hhhi!ihhi!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!Hhhhhi!hhhHHhhI!IhhIHHHHI!HHHI!IHHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHI!IHHI!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!hHHHHI!HHHhhHHi!iHHihhhhi!hhhi!ihhi!!" + "'", str1, "hHHI!IHHI!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!hHHHHI!HHHhhHHi!iHHihhhhi!hhhi!ihhi!!");
    }

    @Test
    public void test9700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9700");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!" + "'", str2, "Hhhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!");
    }

    @Test
    public void test9701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9701");
        char[] charArray8 = new char[] { '#', '4', '4', '4' };
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("HHHi!iHHi!!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hhHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!ihhi!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '#', '4', '4', '4' });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Hi!" + "'", str9, "Hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hi!" + "'", str10, "Hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hHHi!iHHi!!" + "'", str11, "hHHi!iHHi!!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hhHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!ihhi!" + "'", str12, "hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hhHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!ihhi!");
    }

    @Test
    public void test9702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9702");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHI!HHI!HHHHHHI!HHHI!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHI!HHI!HHHHHHI!HHHI!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!" + "'", str2, "hHI!HHI!HHHHHHI!HHHI!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!");
    }

    @Test
    public void test9703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9703");
        char[] charArray10 = new char[] {};
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("H", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("hhI!", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("hH", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("hhhI!IhhI!hHHHi!iHHi!hi!!H", charArray10);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHI!hHHI!iHHI!!", charArray10);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.initials("HHhhhi!ihhihhhi!Hhhi!Ihhi!!!hi!!hhHhhhi!ihhihhhi!Hhhi!Ihhi!!!hi!!hhHhhhi!ihhihhhi!Hhhi!Ihhi!!!hi!!hhHhhhi!ihhihhhi!Hhhi!Ihhi!!!hi!!hhHhhhi!ihhihhhi!Hhhi!Ihhi!!!hi!!hhHhhhi!ihhihhhi!Hhhi!Ihhi!!!hi!!hhHhhhi!ihhihhhi!Hhhi!Ihhi!!!hi!!hhHhhhi!ihhihhhi!Hhhi!Ihhi!!!hi!!hhHhhhi!ihhihhhi!Hhhi!Ihhi!!!hi!!hiHhhhi!ihhihhhi!Hhhi!Ihhi!!!hi!!hhHhhhi!ihhihhhi!Hhhi!Ihhi!!!hi!!hhHhhhi!ihhihhhi!Hhhi!Ihhi!!!hi!!hhHhhhi!ihhihhhi!Hhhi!Ihhi!!!hi!!hhHhhhi!ihhihhhi!Hhhi!Ihhi!!!hi!!hiHhhhi!ihhihhhi!Hhhi!Ihhi!!!hi!!h!Hhhhi!ihhihhhi!Hhhi!Ihhi!!!hi!!hiHhhhi!ihhihhhi!Hhhi!Ihhi!!!hi!!hhHhhhi!ihhihhhi!Hhhi!Ihhi!!!hi!!hhHhhhi!ihhihhhi!Hhhi!Ihhi!!!hi!!hiHhhhi!ihhihhhi!Hhhi!Ihhi!!!hi!!h!Hhhhi!ihhihhhi!Hhhi!Ihhi!!!hi!!hhHhhhi!ihhihhhi!Hhhi!Ihhi!!!hi!!hiHhhhi!ihhihhhi!Hhhi!Ihhi!!!hi!!h!Hhhhi!ihhihhhi!Hhhi!Ihhi!!!hi!!h!", charArray10);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhhi!hhhihhi!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H" + "'", str14, "H");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hhhI!IhhI!hHHHi!iHHi!hi!!H" + "'", str17, "hhhI!IhhI!hHHHi!iHHi!hi!!H");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HHHI!hHHI!iHHI!!" + "'", str18, "HHHI!hHHI!iHHI!!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hhhhi!hhhihhi!" + "'", str20, "hhhhi!hhhihhi!");
    }

    @Test
    public void test9704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9704");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hHHHI!IHHI!HHHHI!IHHI!HI!!HHHHHI!IHHI!HHHHI!IHHI!HI!!HHHHHI!IHHI!HHHHI!IHHI!HI!!HHHHHI!IHHI!HHHHI!IHHHHI!IHHI!HHHI!IHHI!!HI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHHI!IHHI!HHHHI!IHHI!HI!!HHHHHI!IHHI!HHHHI!IHHI!HI!!HHHHHI!IHHI!HHHHI!IHHI!HI!!HHHHHI!IHHI!HHHHI!IHHHHI!IHHI!HHHI!IHHI!!HI!!" + "'", str1, "HHHHI!IHHI!HHHHI!IHHI!HI!!HHHHHI!IHHI!HHHHI!IHHI!HI!!HHHHHI!IHHI!HHHHI!IHHI!HI!!HHHHHI!IHHI!HHHHI!IHHHHI!IHHI!HHHI!IHHI!!HI!!");
    }

    @Test
    public void test9705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9705");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!!HHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!!HHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!!HHHI!IHHI!HHI!IHI!!HI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!!hhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!!hhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!!hhhi!ihhi!hhi!ihi!!hi!!!" + "'", str1, "Hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!!hhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!!hhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!!hhhi!ihhi!hhi!ihi!!hi!!!");
    }

    @Test
    public void test9706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9706");
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
        java.lang.String str24 = org.apache.commons.lang.WordUtils.uncapitalize("HH", charArray14);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.uncapitalize("HH", charArray14);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.capitalizeFully("hHi!", charArray14);
        java.lang.String str27 = org.apache.commons.lang.WordUtils.capitalizeFully("HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!iHhi!Ihi!!!Hhi!Ihi!!iHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!!Hhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!!Hhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!!Hhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!!Hhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!!Hhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!!", charArray14);
        java.lang.String str28 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!h", charArray14);
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
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "HH" + "'", str24, "HH");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "HH" + "'", str25, "HH");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hHi!" + "'", str26, "hHi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!iHhi!Ihi!!!Hhi!Ihi!!iHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!!Hhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!!Hhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!!Hhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!!Hhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!!Hhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!!" + "'", str27, "HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!iHhi!Ihi!!!Hhi!Ihi!!iHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!!Hhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!!Hhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!!Hhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!!Hhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!!Hhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!h" + "'", str28, "hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!h");
    }

    @Test
    public void test9707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9707");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHHI!IHHIhhhi!hhhi!ihhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!ihhihhhi!hhhi!ihhi!!" + "'", str1, "Hhhhi!ihhihhhi!hhhi!ihhi!!");
    }

    @Test
    public void test9708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9708");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHhhhi!ihhi!!HHhhhi!ihhi!!HHhhhi!ihhi!!IHhhhi!ihhi!!!Hhhhi!ihhi!!HHhhhi!ihhi!!HHhhhi!ihhi!!HHhhhi!ihhi!!IHhhhi!ihhi!!!Hhhhi!ihhi!!IHhhhi!ihhi!!HHhhhi!ihhi!!HHhhhi!ihhi!!IHhhhi!ihhi!!!Hhhhi!ihhi!!!", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHhhhi!ihhi!!HHhhhi!ihhi!!HHhhhi!ihhi!!IHhhhi!ihhi!!!Hhhhi!ihhi!!HHhhhi!ihhi!!HHhhhi!ihhi!!HHhhhi!ihhi!!IHhhhi!ihhi!!!Hhhhi!ihhi!!IHhhhi!ihhi!!HHhhhi!ihhi!!HHhhhi!ihhi!!IHhhhi!ihhi!!!Hhhhi!ihhi!!!" + "'", str2, "hHhhhi!ihhi!!HHhhhi!ihhi!!HHhhhi!ihhi!!IHhhhi!ihhi!!!Hhhhi!ihhi!!HHhhhi!ihhi!!HHhhhi!ihhi!!HHhhhi!ihhi!!IHhhhi!ihhi!!!Hhhhi!ihhi!!IHhhhi!ihhi!!HHhhhi!ihhi!!HHhhhi!ihhi!!IHhhhi!ihhi!!!Hhhhi!ihhi!!!");
    }

    @Test
    public void test9709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9709");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HHhhi!hhhi!hhhi!", 100, "hhhi!ihhi!hhhi!hhhi!hhi!hhhi!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHhhi!hhhi!hhhi!" + "'", str4, "HHhhi!hhhi!hhhi!");
    }

    @Test
    public void test9710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9710");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("HHhhhi!ihhi!!HHhhhi!ihhi!!HHhhhi!ihhi!!IHhhhi!ihhi!!!Hhhhi!ihhi!!HHhhhi!ihhi!!HHhhhi!ihhi!!HHhhhihHh!ihhi!!IHhhhi!ihhi!!!Hhhhi!ihhi!!IHhhhi!ihhi!!HHhhhi!ihhi!!HHhhhi!ihhi!!IHhhhi!ihhi!!!Hhhhi!ihhi!hHh!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test9711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9711");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("HhhHhhHhhIhh!hhHhhHhhHhhIhh!hhHhhHhhHhhIhh!hhihhHhhHhhIhh!hh!hhHhhHhhIhh!hhihhHhhHhhIhh!hhHhhHhhHHhhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!hhIhh!hhHhhHhhHhhIhh!hhihhHhhHhhIhh!hh!hhHhhHhhIhh!hhhhhHhhHhhIhh!hhihhHhhHhhIhh!hh!hhHhhHhhIhh!hHhhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!h!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test9712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9712");
        char[] charArray11 = new char[] { '#', '4', '4', '4' };
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("H", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("hhhi!ihhi!!", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHI!HHHI!Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!", charArray11);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("hhhi!hhhi!HhHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!!hHI!iHI!!ihHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!!hHI!iHI!!hhHI!iHI!!ihHI!iHI!!!hHI!iHI!!!", charArray11);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhhi!ihhhhhhhhhhhhhhhhhhihhh!hhhhhhhhhhhhhhhihhh!hhhihhhhhhhhhhhihhh!hhh!", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '#', '4', '4', '4' });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hi!" + "'", str12, "Hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hi!" + "'", str13, "Hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "h" + "'", str14, "h");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hhhi!ihhi!!" + "'", str15, "hhhi!ihhi!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!" + "'", str16, "Hhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hhhi!hhhi!HhHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!!hHI!iHI!!ihHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!!hHI!iHI!!hhHI!iHI!!ihHI!iHI!!!hHI!iHI!!!" + "'", str17, "Hhhi!hhhi!HhHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!!hHI!iHI!!ihHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!!hHI!iHI!!hhHI!iHI!!ihHI!iHI!!!hHI!iHI!!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hhhhhi!ihhhhhhhhhhhhhhhhhhihhh!hhhhhhhhhhhhhhhihhh!hhhihhhhhhhhhhhihhh!hhh!" + "'", str18, "Hhhhhi!ihhhhhhhhhhhhhhhhhhihhh!hhhhhhhhhhhhhhhihhh!hhhihhhhhhhhhhhihhh!hhh!");
    }

    @Test
    public void test9713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9713");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HHHhhhi!ihhi!hi!!hhHHhhhi!ihhi!hi!!hhHHhhhi!ihhi!hi!!hiHHhhhi!ihhi!hi!!h!HHhhhi!ihhi!hi!!hiHHhhhi!ihHhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHHhhhi!ihhi!hi!!hhHHhhhi!ihhi!hi!!hhHHhhhi!ihhi!hi!!hiHHhhhi!ihhi!hi!!h!HHhhhi!ihhi!hi!!hiHHhhhi!ihHhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!!" + "'", str2, "HHHhhhi!ihhi!hi!!hhHHhhhi!ihhi!hi!!hhHHhhhi!ihhi!hi!!hiHHhhhi!ihhi!hi!!h!HHhhhi!ihhi!hi!!hiHHhhhi!ihHhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!!");
    }

    @Test
    public void test9714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9714");
        char[] charArray10 = new char[] {};
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("H", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("hhI!", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("hH", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("hhhI!IhhI!hHHHi!iHHi!hi!!H", charArray10);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!", charArray10);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.uncapitalize("hHhhI!IhhI!hhhi!ihhi!!HI!!", charArray10);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!ihhi!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H" + "'", str14, "H");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hhhI!IhhI!hHHHi!iHHi!hi!!H" + "'", str17, "hhhI!IhhI!hHHHi!iHHi!hi!!H");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hhhi!" + "'", str18, "Hhhi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hHhhI!IhhI!hhhi!ihhi!!HI!!" + "'", str19, "hHhhI!IhhI!hhhi!ihhi!!HI!!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hhhi!ihhi!" + "'", str20, "Hhhi!ihhi!");
    }

    @Test
    public void test9715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9715");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("HhhhhhhhhihHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HhHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!IHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!!HHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HhhhhhhhhihHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HhHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!IHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!!HHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!" + "'", str1, "HhhhhhhhhihHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HhHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!IHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!!HHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!");
    }

    @Test
    public void test9716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9716");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HHhhhi!ihhi!!hhhhi!ihhi!!hhhhi!iHhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!hhhi!ihhi!hhhi!ihhi!hhhi!ihhi!!hi!!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhihhhi!ihhi!hhhi!ihhi!hhhi!ihhi!!hi!!!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhhhhi!ihhi!hhhi!ihhi!hhhi!ihhi!!hi!!i!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhhhi!ihhi!hhhi!ihhi!hhhi!ihhi!!hi!!hi!!ihhhi!ihhi!!!hhhi!ihhi!!!", (int) (byte) 0, "Hhh", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHhhhi!ihhi!!hhhhi!ihhi!!hhhhi!iHhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!hhhi!ihhi!hhhi!ihhi!hhhi!ihhi!!hi!!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhihhhi!ihhi!hhhi!ihhi!hhhi!ihhi!!hi!!!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhhhhi!ihhi!hhhi!ihhi!hhhi!ihhi!!hi!!i!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhhhi!ihhi!hhhi!ihhi!hhhi!ihhi!!hi!!hi!!ihhhi!ihhi!!!hhhi!ihhi!!!" + "'", str4, "HHhhhi!ihhi!!hhhhi!ihhi!!hhhhi!iHhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!hhhi!ihhi!hhhi!ihhi!hhhi!ihhi!!hi!!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhihhhi!ihhi!hhhi!ihhi!hhhi!ihhi!!hi!!!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhhhhi!ihhi!hhhi!ihhi!hhhi!ihhi!!hi!!i!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhhhi!ihhi!hhhi!ihhi!hhhi!ihhi!!hi!!hi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
    }

    @Test
    public void test9717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9717");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hHHI!IHHI!hhhhi!ihhihhhhi!hhhi!ihhi!!", (int) '4', "HHHHI!HHHI!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHI!IHHI!hhhhi!ihhihhhhi!hhhi!ihhi!!" + "'", str4, "hHHI!IHHI!hhhhi!ihhihhhhi!hhhi!ihhi!!");
    }

    @Test
    public void test9718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9718");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hhHHI!HHHI!HHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHHI!IHHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!hhhi!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhhi!ihhi!!" + "'", str1, "Hhhhi!hhhi!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhhi!ihhi!!");
    }

    @Test
    public void test9719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9719");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hhhI!IhhI!hHHHI!HHHIhHHI!HHHI!HHHI!IHHI!!HHI!IHHI!HHHI!HHHI!IHHI!!HHI!HHHI!IHHI!!HHI!!", (int) (short) 10, "hhHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHHhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!hHhhhi!hhhi!ihhi!!hHhhhi!hhhi!ihhi!!iHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!hHhhhi!hhhi!ihhi!!iHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhI!IhhI!hHHHI!HHHIhHHI!HHHI!HHHI!IHHI!!HHI!IHHI!HHHI!HHHI!IHHI!!HHI!HHHI!IHHI!!HHI!!" + "'", str4, "hhhI!IhhI!hHHHI!HHHIhHHI!HHHI!HHHI!IHHI!!HHI!IHHI!HHHI!HHHI!IHHI!!HHI!HHHI!IHHI!!HHI!!");
    }

    @Test
    public void test9720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9720");
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
        java.lang.String str26 = org.apache.commons.lang.WordUtils.capitalize("hhhi!hhhi!hhhi!Ihhi!!hhi!Ihhi!hhhi!hhhi!Ihhi!!hhi!Hhhi!Ihhi!!hhi!!", charArray15);
        java.lang.String str27 = org.apache.commons.lang.WordUtils.initials("Hhh", charArray15);
        java.lang.String str28 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!ihhi!hhhi!ihhi!!hi!!", charArray15);
        java.lang.String str29 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhi!hhhiHHhhi!!ihhi!!", charArray15);
        java.lang.String str30 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhhhi!hhhhi!hhhhi!ihhhi!!hhhi!ihhhi!hhhhi!hhhhi!ihhhi!!hhhi!hhhhi!hhhhi!hhhhi!ihhhi!!hhhi!ihhhi!hhhhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!i!hhhhi!ihhhi!!hhhi!!hhhi!hhhhi!ihhhi!!hhhi!!", charArray15);
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
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hhhi!hhhi!hhhi!Ihhi!!hhi!Ihhi!hhhi!hhhi!Ihhi!!hhi!Hhhi!Ihhi!!hhi!!" + "'", str26, "hhhi!hhhi!hhhi!Ihhi!!hhi!Ihhi!hhhi!hhhi!Ihhi!!hhi!Hhhi!Ihhi!!hhi!!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Hhhi!ihhi!hhhi!ihhi!!hi!!" + "'", str28, "Hhhi!ihhi!hhhi!ihhi!!hi!!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Hhhhi!hhhiHHhhi!!ihhi!!" + "'", str29, "Hhhhi!hhhiHHhhi!!ihhi!!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhhhi!hhhhi!hhhhi!ihhhi!!hhhi!ihhhi!hhhhi!hhhhi!ihhhi!!hhhi!hhhhi!hhhhi!hhhhi!ihhhi!!hhhi!ihhhi!hhhhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!i!hhhhi!ihhhi!!hhhi!!hhhi!hhhhi!ihhhi!!hhhi!!" + "'", str30, "Hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhhhi!hhhhi!hhhhi!ihhhi!!hhhi!ihhhi!hhhhi!hhhhi!ihhhi!!hhhi!hhhhi!hhhhi!hhhhi!ihhhi!!hhhi!ihhhi!hhhhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!i!hhhhi!ihhhi!!hhhi!!hhhi!hhhhi!ihhhi!!hhhi!!");
    }

    @Test
    public void test9721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9721");
        char[] charArray10 = new char[] { '#', '4', '4', '4' };
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!h", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!H", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("hhhhi!hhhihHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!IHHHi!iHHi!!HHHHi!iHHi!!HHHHhHHI!IHHI!hhi!Ihi!!HI!!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '#', '4', '4', '4' });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hi!" + "'", str11, "Hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hi!" + "'", str12, "Hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H" + "'", str14, "H");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hhhhi!hhhihHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!IHHHi!iHHi!!HHHHi!iHHi!!HHHHhHHI!IHHI!hhi!Ihi!!HI!!" + "'", str16, "hhhhi!hhhihHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!IHHHi!iHHi!!HHHHi!iHHi!!HHHHhHHI!IHHI!hhi!Ihi!!HI!!");
    }

    @Test
    public void test9722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9722");
        char[] charArray6 = new char[] {};
        java.lang.String str7 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray6);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.initials("", charArray6);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("H", charArray6);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("hh", charArray6);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("hhhI!IhhI!Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!", charArray6);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("hhhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!ihi!!hi!hhi!ihi!!hi!!", charArray6);
        java.lang.Class<?> wildcardClass13 = charArray6.getClass();
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hh" + "'", str10, "hh");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hhhI!IhhI!Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!" + "'", str11, "hhhI!IhhI!Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hhhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!ihi!!hi!hhi!ihi!!hi!!" + "'", str12, "hhhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!ihi!!hi!hhi!ihi!!hi!!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test9723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9723");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHHi!hHi!hhHHHI!IHHIHHHI!IHHI!HHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!", (-1), (int) '#', "hhhHHHI!IHHHHI!HHHI!HHI!HHHI!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHi!hHi!hhHHHI!IHHIHHHI!IHHI!HHHHHhhhHHHI!IHHHHI!HHHI!HHI!HHHI!" + "'", str4, "hHHi!hHi!hhHHHI!IHHIHHHI!IHHI!HHHHHhhhHHHI!IHHHHI!HHHI!HHI!HHHI!");
    }

    @Test
    public void test9724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9724");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HhhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!HhhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!ihhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!HhhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!ihhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!!" + "'", str1, "hhhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!HhhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!ihhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!!");
    }

    @Test
    public void test9725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9725");
        char[] charArray13 = new char[] {};
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray13);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("", charArray13);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("hi!", charArray13);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray13);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray13);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray13);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("hI!", charArray13);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhi!ihhi!hi!!hhhhi!ihhi!hi!!hhhhi!ihhi!hi!!ihhhi!ihhi!hi!!!hhhi!ihhi!hi!!ihhhi!ihhi!hi!!hhhhi!ihhi!hi!!hhhhi!ihhi!hi!!ihhhi!ihhi!hi!!!hhhi!ihhi!hi!!hhhhi!ihhi!hi!!hhhhi!ihhi!hi!!hhhhi!ihhi!hi!!hhhhi!ihhi!hi!!ihhhi!ihhi!hi!!!hhhi!ihhi!hi!!ihhhi!ihhi!hi!!hhhhi!ihhi!hi!!hhhhi!ihhi!hi!!ihhhi!ihhi!hi!!!hhhi!ihhi!hi!!hhhhi!ihhi!hi!!ihhhi!ihhi!hi!!!hhhi!ihhi!hi!!!hhhi!ihhi!hi!!h", charArray13);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalize("Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!H", charArray13);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalize("HhhhI!IhhIHHhhhi!ihhi!!HHhhhi!ihhi!!HHhhhi!ihHhhhi!hhhiHhhi!hhhi!ihhi!!hi!!IHhhhi!ihhi!!!Hhhhi!ihhi!!HHhhhHhhhi!hhhiHhhi!hhhi!ihhi!!i!ihhi!!HHhhhi!ihhi!!HHhhhi!ihhi!!IHhhhi!hhhiHhhi!hhhi!ihhi!!Hhhhi!ihhi!!!Hhhhi!ihhi!!IHhhhi!ihhHhhhi!hhhiHhhi!hhhi!ihhi!!i!!HHhhhi!ihhi!!HHhhhi!ihhi!!IHhhhiHhhhi!hhhiHhhi!hhhi!ihhi!!!ihhi!!!Hhhhi!ihhi!!!", charArray13);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.uncapitalize("HHhhhi!ihhi!!HHhhhi!ihhi!!HHhhhi!ihhi!!IHhhhi!ihhi!!hhHI!", charArray13);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.initials("hHHHI!IHHIHHHHHI!IHHI!!HHHHHI!IHHI!!HHHHHI!IHHHHHI!HHHIHHHI!HHHI!IHHI!!HI!!IHHHHI!IHHI!!!HHHHI!IHHI!!HHHHHHHHHI!HHHIHHHI!HHHI!IHHI!!I!IHHI!!HHHHHI!IHHI!!HHHHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHI!IHHI!!!HHHHI!IHHI!!IHHHHI!IHHHHHHI!HHHIHHHI!HHHI!IHHI!!I!!HHHHHI!IHHI!!HHHHHI!IHHI!!IHHHHIHHHHI!HHHIHHHI!HHHI!IHHI!!!IHHI!!!HHHHI!IHHI!!!", charArray13);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhhhi!ihhhhhhhhhhhhhhhhhhihhh!hhhhi!hhhi!hhi!hhhi!", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] {});
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hi!" + "'", str17, "Hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Hi!" + "'", str19, "Hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hI!" + "'", str20, "hI!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Hhhhi!ihhi!hi!!hhhhi!ihhi!hi!!hhhhi!ihhi!hi!!ihhhi!ihhi!hi!!!hhhi!ihhi!hi!!ihhhi!ihhi!hi!!hhhhi!ihhi!hi!!hhhhi!ihhi!hi!!ihhhi!ihhi!hi!!!hhhi!ihhi!hi!!hhhhi!ihhi!hi!!hhhhi!ihhi!hi!!hhhhi!ihhi!hi!!hhhhi!ihhi!hi!!ihhhi!ihhi!hi!!!hhhi!ihhi!hi!!ihhhi!ihhi!hi!!hhhhi!ihhi!hi!!hhhhi!ihhi!hi!!ihhhi!ihhi!hi!!!hhhi!ihhi!hi!!hhhhi!ihhi!hi!!ihhhi!ihhi!hi!!!hhhi!ihhi!hi!!!hhhi!ihhi!hi!!h" + "'", str21, "Hhhhi!ihhi!hi!!hhhhi!ihhi!hi!!hhhhi!ihhi!hi!!ihhhi!ihhi!hi!!!hhhi!ihhi!hi!!ihhhi!ihhi!hi!!hhhhi!ihhi!hi!!hhhhi!ihhi!hi!!ihhhi!ihhi!hi!!!hhhi!ihhi!hi!!hhhhi!ihhi!hi!!hhhhi!ihhi!hi!!hhhhi!ihhi!hi!!hhhhi!ihhi!hi!!ihhhi!ihhi!hi!!!hhhi!ihhi!hi!!ihhhi!ihhi!hi!!hhhhi!ihhi!hi!!hhhhi!ihhi!hi!!ihhhi!ihhi!hi!!!hhhi!ihhi!hi!!hhhhi!ihhi!hi!!ihhhi!ihhi!hi!!!hhhi!ihhi!hi!!!hhhi!ihhi!hi!!h");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!H" + "'", str22, "Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!H");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "HhhhI!IhhIHHhhhi!ihhi!!HHhhhi!ihhi!!HHhhhi!ihHhhhi!hhhiHhhi!hhhi!ihhi!!hi!!IHhhhi!ihhi!!!Hhhhi!ihhi!!HHhhhHhhhi!hhhiHhhi!hhhi!ihhi!!i!ihhi!!HHhhhi!ihhi!!HHhhhi!ihhi!!IHhhhi!hhhiHhhi!hhhi!ihhi!!Hhhhi!ihhi!!!Hhhhi!ihhi!!IHhhhi!ihhHhhhi!hhhiHhhi!hhhi!ihhi!!i!!HHhhhi!ihhi!!HHhhhi!ihhi!!IHhhhiHhhhi!hhhiHhhi!hhhi!ihhi!!!ihhi!!!Hhhhi!ihhi!!!" + "'", str23, "HhhhI!IhhIHHhhhi!ihhi!!HHhhhi!ihhi!!HHhhhi!ihHhhhi!hhhiHhhi!hhhi!ihhi!!hi!!IHhhhi!ihhi!!!Hhhhi!ihhi!!HHhhhHhhhi!hhhiHhhi!hhhi!ihhi!!i!ihhi!!HHhhhi!ihhi!!HHhhhi!ihhi!!IHhhhi!hhhiHhhi!hhhi!ihhi!!Hhhhi!ihhi!!!Hhhhi!ihhi!!IHhhhi!ihhHhhhi!hhhiHhhi!hhhi!ihhi!!i!!HHhhhi!ihhi!!HHhhhi!ihhi!!IHhhhiHhhhi!hhhiHhhi!hhhi!ihhi!!!ihhi!!!Hhhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "HHhhhi!ihhi!!HHhhhi!ihhi!!HHhhhi!ihhi!!IHhhhi!ihhi!!hhHI!" + "'", str24, "HHhhhi!ihhi!!HHhhhi!ihhi!!HHhhhi!ihhi!!IHhhhi!ihhi!!hhHI!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hhhhhi!ihhhhhhhhhhhhhhhhhhihhh!hhhhi!hhhi!hhi!hhhi!" + "'", str26, "hhhhhi!ihhhhhhhhhhhhhhhhhhihhh!hhhhi!hhhi!hhi!hhhi!");
    }

    @Test
    public void test9726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9726");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hhhI!IhhI!Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HhhI!IhhI!Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!" + "'", str1, "HhhI!IhhI!Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!");
    }

    @Test
    public void test9727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9727");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhhi!Hhhi!HhI!hhHI!", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhhi!hhhi!hhi!hhhi!" + "'", str2, "Hhhhi!hhhi!hhi!hhhi!");
    }

    @Test
    public void test9728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9728");
        char[] charArray14 = new char[] {};
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray14);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("", charArray14);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray14);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray14);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("", charArray14);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray14);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray14);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.initials("hhhI!IhhI!HI!!", charArray14);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.initials("HhH", charArray14);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalize("HHHI!HHHI!IHHI!!", charArray14);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.initials("HhhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhIhHHI!hHHI!iHHI!!", charArray14);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.initials("hH", charArray14);
        java.lang.String str27 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray14);
        java.lang.String str28 = org.apache.commons.lang.WordUtils.uncapitalize("hHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!hHIHI!!HI!HHI!IHI!!HI!!", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] {});
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hi!" + "'", str18, "Hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "HHHI!HHHI!IHHI!!" + "'", str24, "HHHI!HHHI!IHHI!!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!hHIHI!!HI!HHI!IHI!!HI!!" + "'", str28, "hHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!hHIHI!!HI!HHI!IHI!!HI!!");
    }

    @Test
    public void test9729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9729");
        char[] charArray11 = new char[] {};
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("", charArray11);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray11);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray11);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.initials("hhhI!IhhI!HI!!", charArray11);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.initials("HhH", charArray11);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalize("HHHI!HHHI!IHHI!!", charArray11);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalize("hHHHi!iHHi!HhHHHHHi!iHHi!HhHHHHHi!iHHi!HhHHHHHi!iHHi!HhHHHHHi!iHHi!HhHIHHHi!iHHi!HhH!HHHi!iHHi!HhHHHHHi!iHHi!HhHHHHHi!iHHi!HhHHHHHi!iHHi!HhHHHHHi!iHHi!HhHhHHHi!iHHi!HhHhHHHi!iHHi!HhHiHHHi!iHHi!HhH!HHHi!iHHi!HhHhHHHi!iHHi!HhHhHHHi!iHHi!HhHhHHHi!iHHi!HhHiHHHi!iHHi!HhH!HHHi!iHHi!HhHiHHHi!iHHi!HhHhHHHi!iHHi!HhHhHHHi!iHHi!HhHiHHHi!iHHi!HhH!HHHi!iHHi!HhH!", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] {});
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hi!" + "'", str15, "Hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "HHHI!HHHI!IHHI!!" + "'", str21, "HHHI!HHHI!IHHI!!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hHHHi!iHHi!HhHHHHHi!iHHi!HhHHHHHi!iHHi!HhHHHHHi!iHHi!HhHHHHHi!iHHi!HhHIHHHi!iHHi!HhH!HHHi!iHHi!HhHHHHHi!iHHi!HhHHHHHi!iHHi!HhHHHHHi!iHHi!HhHHHHHi!iHHi!HhHhHHHi!iHHi!HhHhHHHi!iHHi!HhHiHHHi!iHHi!HhH!HHHi!iHHi!HhHhHHHi!iHHi!HhHhHHHi!iHHi!HhHhHHHi!iHHi!HhHiHHHi!iHHi!HhH!HHHi!iHHi!HhHiHHHi!iHHi!HhHhHHHi!iHHi!HhHhHHHi!iHHi!HhHiHHHi!iHHi!HhH!HHHi!iHHi!HhH!" + "'", str22, "hHHHi!iHHi!HhHHHHHi!iHHi!HhHHHHHi!iHHi!HhHHHHHi!iHHi!HhHHHHHi!iHHi!HhHIHHHi!iHHi!HhH!HHHi!iHHi!HhHHHHHi!iHHi!HhHHHHHi!iHHi!HhHHHHHi!iHHi!HhHHHHHi!iHHi!HhHhHHHi!iHHi!HhHhHHHi!iHHi!HhHiHHHi!iHHi!HhH!HHHi!iHHi!HhHhHHHi!iHHi!HhHhHHHi!iHHi!HhHhHHHi!iHHi!HhHiHHHi!iHHi!HhH!HHHi!iHHi!HhHiHHHi!iHHi!HhHhHHHi!iHHi!HhHhHHHi!iHHi!HhHiHHHi!iHHi!HhH!HHHi!iHHi!HhH!");
    }

    @Test
    public void test9730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9730");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!HHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!HhHHHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!hHIHI!!HI!HHI!IHI!!HI!!", (int) '#', "hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhhi!ihhihhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!HHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!HhHHHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!hHIHI!!HI!HHI!IHI!!HI!!" + "'", str4, "hHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!HHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!HhHHHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!hHIHI!!HI!HHI!IHI!!HI!!");
    }

    @Test
    public void test9731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9731");
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
        java.lang.String str21 = org.apache.commons.lang.WordUtils.initials("hhHHHI!HHHHhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!", charArray11);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.initials("HHHi!iHHi!hHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHHhhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!!HH!", charArray11);
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test9732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9732");
        char[] charArray10 = new char[] { '#', '4', '4', '4' };
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("H", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHI!IHHI!HHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihhhhi!hhhi!ihhi!!hhhhi!hhhihhhhi!!ihhi!!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '#', '4', '4', '4' });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hi!" + "'", str11, "Hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hi!" + "'", str12, "Hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "h" + "'", str13, "h");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!" + "'", str15, "Hhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihhhhi!hhhi!ihhi!!hhhhi!hhhihhhhi!!ihhi!!" + "'", str16, "Hhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihhhhi!hhhi!ihhi!!hhhhi!hhhihhhhi!!ihhi!!");
    }
}

