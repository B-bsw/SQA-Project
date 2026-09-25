package org.apache.commons.lang;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest15 {

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
    public void test7501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7501");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHhhI!IhhI!!", (int) (short) 100, (-1), "hHhhhi!hhhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end 100, length 12");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7502");
        char[] charArray13 = new char[] {};
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray13);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("", charArray13);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray13);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray13);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("h", charArray13);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.initials("Hhi!", charArray13);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("", charArray13);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalizeFully("HHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!hHIHI!!HI!HHI!IHI!!HI!!", charArray13);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.initials("hhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!Hhihi!!hi!hhi!ihi!!hi!!", charArray13);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalize("HHHHI!IHHIhhhi!hhhi!ihhi!!", charArray13);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihHHi!iHHi!hhhi!hhhi!hhi!hhhi!", charArray13);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.capitalize("HHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!HHHI!IHHI!!HI!!", charArray13);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] {});
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hi!" + "'", str16, "Hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "h" + "'", str18, "h");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "HHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!hHIHI!!HI!HHI!IHI!!HI!!" + "'", str21, "HHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!hHIHI!!HI!HHI!IHI!!HI!!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "HHHHI!IHHIhhhi!hhhi!ihhi!!" + "'", str23, "HHHHI!IHHIhhhi!hhhi!ihhi!!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihHHi!iHHi!hhhi!hhhi!hhi!hhhi!" + "'", str24, "hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihHHi!iHHi!hhhi!hhhi!hhi!hhhi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "HHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!HHHI!IHHI!!HI!!" + "'", str25, "HHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!HHHI!IHHI!!HI!!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!" + "'", str26, "Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
    }

    @Test
    public void test7503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7503");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hhhI!IhhI!hHh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhI!IhhI!hHh" + "'", str1, "hhhI!IhhI!hHh");
    }

    @Test
    public void test7504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7504");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhhi!ihhhhhhhhhhhhhhhhhhihhh!hhhhi!hhhi!hhi!hhhi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhhi!ihhhhhhhhhhhhhhhhhhihhh!hhhhi!hhhi!hhi!hhhi!" + "'", str1, "Hhhhhi!ihhhhhhhhhhhhhhhhhhihhh!hhhhi!hhhi!hhi!hhhi!");
    }

    @Test
    public void test7505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7505");
        char[] charArray9 = new char[] {};
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("hi!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("HH", charArray9);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("hHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hIHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!h!HhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hhHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hIHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!h!HhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hiHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hIHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!h!HhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!h!", charArray9);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("HHHI!HHHI!HHHI!iHHI!!HHI!iHHI!HHHI!hHHI!HHHI!HHHI!", charArray9);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhhi!ihhi!hi!!", charArray9);
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hhhhi!ihhi!hi!!" + "'", str18, "hhhhi!ihhi!hi!!");
    }

    @Test
    public void test7506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7506");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.initials("HHhhhi!hhhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
    }

    @Test
    public void test7507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7507");
        char[] charArray9 = new char[] {};
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("hI!", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("h", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("HHHi!iHHi!!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("Hhhhhi!hhhi!ihhi!!", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("HHHHi!iHHi!hi!!", charArray9);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("hHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HhHHhHH", charArray9);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("hHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!hHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!hHhhhi!ihhi!hi!!hHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!hHhhhi!ihhi!hi!!hHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!IHhhhi!ihhi!hi!!hHhhhi!ihhi!hi!!hHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!!", charArray9);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("HHHI!HHHI!Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hI!" + "'", str11, "hI!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HHHi!iHHi!!" + "'", str13, "HHHi!iHHi!!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hhhhhi!hhhi!ihhi!!" + "'", str14, "Hhhhhi!hhhi!ihhi!!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HHHHi!iHHi!hi!!" + "'", str15, "HHHHi!iHHi!hi!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HhHHhHH" + "'", str16, "hHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HhHHhHH");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!hHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!hHhhhi!ihhi!hi!!hHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!hHhhhi!ihhi!hi!!hHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!IHhhhi!ihhi!hi!!hHhhhi!ihhi!hi!!hHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!!" + "'", str17, "hHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!hHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!hHhhhi!ihhi!hi!!hHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!hHhhhi!ihhi!hi!!hHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!IHhhhi!ihhi!hi!!hHhhhi!ihhi!hi!!hHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HHHI!HHHI!Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!" + "'", str18, "HHHI!HHHI!Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
    }

    @Test
    public void test7508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7508");
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
        java.lang.String str20 = org.apache.commons.lang.WordUtils.uncapitalize("hhhhi!ihhihhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!h!hhhi!ihhihhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!h!!hi!!", charArray10);
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hhhhi!ihhihhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!h!hhhi!ihhihhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!h!!hi!!" + "'", str20, "hhhhi!ihhihhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!h!hhhi!ihhihhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!h!!hi!!");
    }

    @Test
    public void test7509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7509");
        char[] charArray9 = new char[] {};
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("hi!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("Hhhi!ihhi!!", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("HHHHI!HHHIHHHI!HHHI!IHHI!!", charArray9);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("hHhhi!ihhi!!hHhhi!ihhi!!HHhhi!ihhi!!HHhhi!ihhi!!iHhhi!ihhi!!!Hhhi!ihhi!!iHhhi!ihhi!!HHhhi!ihhi!!HHhhi!ihhi!!iHhhi!ihhi!!!Hhhi!ihhi!!HHhhi!ihhi!!HHhhi!ihhi!!HHhhi!ihhi!!IHhhi!ihhi!!!Hhhi!ihhi!!IHhhi!ihhi!!HHhhi!ihhi!!HHhhi!ihhi!!IHhhi!ihhi!!!Hhhi!ihhi!!!Hhhi!ihhi!!hHhhi!ihhi!!iHhhi!ihhi!!!Hhhi!ihhi!!!", charArray9);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("HI!", charArray9);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihHHHHHI!IHHI!!HHHHHI!IHHI!!HHHHHI!IHHHHHI!HHHIHHHI!HHHI!IHHI!!HI!!IHHHHI!IHHI!!!HHHHI!IHHI!!HHHHHHhhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhHhhi!ihhi!HHI!iHI!!hi!!HHHI!HHHIHHHI!HHHI!IHHI!!I!IHHI!!HHHHHI!IHHI!!HHHHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHI!IHHI!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhHhhi!ihhi!HHI!iHI!!hi!!!!HHHHI!IHHI!!IHHHHI!IHHHHHHI!HHHIHHHI!HHHI!IHHI!!I!!HHHHHI!IHHI!!HHHHHI!IHHI!!IHHHHIHHHHI!HHHIHHhhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhHhhi!ihhi!HHI!iHI!!hi!!HI!HHHI!IHHI!!!IHHI!!!HHHHI!IHHI!!!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hHhhi!ihhi!!hHhhi!ihhi!!HHhhi!ihhi!!HHhhi!ihhi!!iHhhi!ihhi!!!Hhhi!ihhi!!iHhhi!ihhi!!HHhhi!ihhi!!HHhhi!ihhi!!iHhhi!ihhi!!!Hhhi!ihhi!!HHhhi!ihhi!!HHhhi!ihhi!!HHhhi!ihhi!!IHhhi!ihhi!!!Hhhi!ihhi!!IHhhi!ihhi!!HHhhi!ihhi!!HHhhi!ihhi!!IHhhi!ihhi!!!Hhhi!ihhi!!!Hhhi!ihhi!!hHhhi!ihhi!!iHhhi!ihhi!!!Hhhi!ihhi!!!" + "'", str16, "hHhhi!ihhi!!hHhhi!ihhi!!HHhhi!ihhi!!HHhhi!ihhi!!iHhhi!ihhi!!!Hhhi!ihhi!!iHhhi!ihhi!!HHhhi!ihhi!!HHhhi!ihhi!!iHhhi!ihhi!!!Hhhi!ihhi!!HHhhi!ihhi!!HHhhi!ihhi!!HHhhi!ihhi!!IHhhi!ihhi!!!Hhhi!ihhi!!IHhhi!ihhi!!HHhhi!ihhi!!HHhhi!ihhi!!IHhhi!ihhi!!!Hhhi!ihhi!!!Hhhi!ihhi!!hHhhi!ihhi!!iHhhi!ihhi!!!Hhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HI!" + "'", str17, "HI!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihHHHHHI!IHHI!!HHHHHI!IHHI!!HHHHHI!IHHHHHI!HHHIHHHI!HHHI!IHHI!!HI!!IHHHHI!IHHI!!!HHHHI!IHHI!!HHHHHHhhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhHhhi!ihhi!HHI!iHI!!hi!!HHHI!HHHIHHHI!HHHI!IHHI!!I!IHHI!!HHHHHI!IHHI!!HHHHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHI!IHHI!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhHhhi!ihhi!HHI!iHI!!hi!!!!HHHHI!IHHI!!IHHHHI!IHHHHHHI!HHHIHHHI!HHHI!IHHI!!I!!HHHHHI!IHHI!!HHHHHI!IHHI!!IHHHHIHHHHI!HHHIHHhhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhHhhi!ihhi!HHI!iHI!!hi!!HI!HHHI!IHHI!!!IHHI!!!HHHHI!IHHI!!!" + "'", str18, "hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihHHHHHI!IHHI!!HHHHHI!IHHI!!HHHHHI!IHHHHHI!HHHIHHHI!HHHI!IHHI!!HI!!IHHHHI!IHHI!!!HHHHI!IHHI!!HHHHHHhhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhHhhi!ihhi!HHI!iHI!!hi!!HHHI!HHHIHHHI!HHHI!IHHI!!I!IHHI!!HHHHHI!IHHI!!HHHHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHI!IHHI!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhHhhi!ihhi!HHI!iHI!!hi!!!!HHHHI!IHHI!!IHHHHI!IHHHHHHI!HHHIHHHI!HHHI!IHHI!!I!!HHHHHI!IHHI!!HHHHHI!IHHI!!IHHHHIHHHHI!HHHIHHhhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhHhhi!ihhi!HHI!iHI!!hi!!HI!HHHI!IHHI!!!IHHI!!!HHHHI!IHHI!!!");
    }

    @Test
    public void test7510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7510");
        char[] charArray12 = new char[] { '#', '4', '4', '4' };
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray12);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray12);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("H", charArray12);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("hhhi!ihhi!!", charArray12);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("HHI!", charArray12);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("Hhi!", charArray12);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!IhHHI!hHHI!iHHI!!!hHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!IhHHI!hHHI!iHHI!!!hHHI!hHHI!iHHI!!IhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!IhHHI!hHHI!iHHI!!!hHHI!hHHI!iHHI!!!", charArray12);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHi!iHHi!HhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!IhiHHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!hHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!hHhhhi!ihhi!hi!!hHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!HHhhhi!ihhi!hi!!hHhhhi!ihhi!hi!!hHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!IHhhhi!ihhi!hi!!hHhhhi!ihhi!hi!!hHhhhi!ihhi!hi!!iHhhhi!ihhi!hi!!!Hhhhi!ihhi!hi!!!", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '#', '4', '4', '4' });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hi!" + "'", str13, "Hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hi!" + "'", str14, "Hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "h" + "'", str15, "h");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hhhi!ihhi!!" + "'", str16, "hhhi!ihhi!!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hHI!" + "'", str17, "hHI!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hhi!" + "'", str18, "hhi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!" + "'", str19, "Hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hhhi!ihhi!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihihhhhhi!ihhi!hi!!hhhhhi!ihhi!hi!!hhhhhi!ihhi!hi!!hhhhhi!ihhi!hi!!hhhhhi!ihhi!hi!!ihhhhi!ihhi!hi!!!hhhhi!ihhi!hi!!ihhhhi!ihhi!hi!!hhhhhi!ihhi!hi!!hhhhhi!ihhi!hi!!ihhhhi!ihhi!hi!!!hhhhi!ihhi!hi!!!hhhhi!ihhi!hi!!hhhhhi!ihhi!hi!!hhhhhi!ihhi!hi!!hhhhhi!ihhi!hi!!hhhhhi!ihhi!hi!!ihhhhi!ihhi!hi!!!hhhhi!ihhi!hi!!ihhhhi!ihhi!hi!!hhhhhi!ihhi!hi!!hhhhhi!ihhi!hi!!ihhhhi!ihhi!hi!!!hhhhi!ihhi!hi!!!hhhhi!ihhi!hi!!hhhhhi!ihhi!hi!!hhhhhi!ihhi!hi!!hhhhhi!ihhi!hi!!hhhhhi!ihhi!hi!!ihhhhi!ihhi!hi!!!hhhhi!ihhi!hi!!ihhhhi!ihhi!hi!!hhhhhi!ihhi!hi!!hhhhhi!ihhi!hi!!ihhhhi!ihhi!hi!!hhhhhi!ihhi!hi!!hhhhhi!ihhi!hi!!hhhhhi!ihhi!hi!!ihhhhi!ihhi!hi!!!hhhhi!ihhi!hi!!hhhhhi!ihhi!hi!!hhhhhi!ihhi!hi!!hhhhhi!ihhi!hi!!ihhhhi!ihhi!hi!!!hhhhi!ihhi!hi!!ihhhhi!ihhi!hi!!hhhhhi!ihhi!hi!!hhhhhi!ihhi!hi!!ihhhhi!ihhi!hi!!!hhhhi!ihhi!hi!!!" + "'", str20, "Hhhi!ihhi!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihihhhhhi!ihhi!hi!!hhhhhi!ihhi!hi!!hhhhhi!ihhi!hi!!hhhhhi!ihhi!hi!!hhhhhi!ihhi!hi!!ihhhhi!ihhi!hi!!!hhhhi!ihhi!hi!!ihhhhi!ihhi!hi!!hhhhhi!ihhi!hi!!hhhhhi!ihhi!hi!!ihhhhi!ihhi!hi!!!hhhhi!ihhi!hi!!!hhhhi!ihhi!hi!!hhhhhi!ihhi!hi!!hhhhhi!ihhi!hi!!hhhhhi!ihhi!hi!!hhhhhi!ihhi!hi!!ihhhhi!ihhi!hi!!!hhhhi!ihhi!hi!!ihhhhi!ihhi!hi!!hhhhhi!ihhi!hi!!hhhhhi!ihhi!hi!!ihhhhi!ihhi!hi!!!hhhhi!ihhi!hi!!!hhhhi!ihhi!hi!!hhhhhi!ihhi!hi!!hhhhhi!ihhi!hi!!hhhhhi!ihhi!hi!!hhhhhi!ihhi!hi!!ihhhhi!ihhi!hi!!!hhhhi!ihhi!hi!!ihhhhi!ihhi!hi!!hhhhhi!ihhi!hi!!hhhhhi!ihhi!hi!!ihhhhi!ihhi!hi!!hhhhhi!ihhi!hi!!hhhhhi!ihhi!hi!!hhhhhi!ihhi!hi!!ihhhhi!ihhi!hi!!!hhhhi!ihhi!hi!!hhhhhi!ihhi!hi!!hhhhhi!ihhi!hi!!hhhhhi!ihhi!hi!!ihhhhi!ihhi!hi!!!hhhhi!ihhi!hi!!ihhhhi!ihhi!hi!!hhhhhi!ihhi!hi!!hhhhhi!ihhi!hi!!ihhhhi!ihhi!hi!!!hhhhi!ihhi!hi!!!");
    }

    @Test
    public void test7511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7511");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHIhHI!HHI!HHHHHHI!HHHI!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHIhHI!HHI!HHHHHHI!HHHI!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!" + "'", str1, "HhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHIhHI!HHI!HHHHHHI!HHHI!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!");
    }

    @Test
    public void test7512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7512");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("HhhHHHI!IHHIHHHI!hHHI!iHHI!!!HI!!HHhHHHI!IHHIHHHI!hHHI!iHHI!!!HI!!HHhHHHI!IHHIHHHI!hHHI!iHHI!!!HI!!HHhHHHI!IHHIHHHI!hHHI!iHHI!!!HI!!HHhHHHI!IHHIHHHI!hHHI!iHHI!!!HI!!HHhHHHI!IHHIHHHI!hHHI!iHHI!!!HI!!HHhHHHI!IHHIHHHI!hHHI!iHHI!!!HI!!HHhHHHI!IHHIHHHI!hHHI!iHHI!!!HI!!HHhHHHI!IHHIHHHI!hHHI!iHHI!!!HI!!HIhHHHI!IHHIHHHI!hHHI!iHHI!!!HI!!HHhHHHI!IHHIHHHI!hHHI!iHHI!!!HI!!HHhHHHI!IHHIHHHI!hHHI!iHHI!!!HI!!HHhHHHI!IHHIHHHI!hHHI!iHHI!!!HI!!HHhHHHI!IHHIHHHI!hHHI!iHHI!!!HI!!HIhHHHI!IHHIHHHI!hHHI!iHHI!!!HI!!H!hHHHI!IHHIHHHI!hHHI!iHHI!!!HI!!HIhHHHI!IHHIHHHI!hHHI!iHHI!!!HI!!HHhHHHI!IHHIHHHI!hHHI!iHHI!!!HI!!HHhHHHI!IHHIHHHI!hHHI!iHHI!!!HI!!HIhHHHI!IHHIHHHI!hHHI!iHHI!!!HI!!H!hHHHI!IHHIHHHI!hHHI!iHHI!!!HI!!HHhHHHI!IHHIHHHI!hHHI!iHHI!!!HI!!HIhHHHI!IHHIHHHI!hHHI!iHHI!!!HI!!H!hHHHI!IHHIHHHI!hHHI!iHHI!!!HI!!H!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test7513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7513");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("HHHHHI!IHHI!!HHHHHI!IHHI!!HHHHHI!IHHHHHI!HHHIHHHI!HHHI!IHHI!!HI!!IHHHHI!IHHI!!!HHHHI!IHHI!!HHHHHHHHHhHhhhi!ihhi!hi!!h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHHHI!IHHI!!HHHHHI!IHHI!!HHHHHI!IHHHHHI!HHHIHHHI!HHHI!IHHI!!HI!!IHHHHI!IHHI!!!HHHHI!IHHI!!HHHHHHHHHhHhhhi!ihhi!hi!!h" + "'", str1, "HHHHHI!IHHI!!HHHHHI!IHHI!!HHHHHI!IHHHHHI!HHHIHHHI!HHHI!IHHI!!HI!!IHHHHI!IHHI!!!HHHHI!IHHI!!HHHHHHHHHhHhhhi!ihhi!hi!!h");
    }

    @Test
    public void test7514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7514");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHHI!IHHI!HHHHHHHHHIHH!HHHHHHHHHHHIHhhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!", 0, (int) (short) 1, "Hhhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hihhhhhi!ihhhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHhhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hihhhhhi!ihhhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!!" + "'", str4, "hHhhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hihhhhhi!ihhhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!!");
    }

    @Test
    public void test7515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7515");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHHI!IHHI!hhhI!IhhI!hhhi!ihhi!!HHhHhhi!ihhhHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHHHHI!IHHI!HHI!IHI!!HI!!", 10, (int) '4', "Hhhi!hhhi!Hhhi!hhhi!hhhi!Ihhi!!hhi!Ihhi!hhhi!Hhhi!hhhi!hhhi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHI!IHHI!hhhI!IhhI!hhhi!ihhi!!HHhHhhi!ihhhHHHI!IHHIHhhi!hhhi!Hhhi!hhhi!hhhi!Ihhi!!hhi!Ihhi!hhhi!Hhhi!hhhi!hhhi!" + "'", str4, "hHHI!IHHI!hhhI!IhhI!hhhi!ihhi!!HHhHhhi!ihhhHHHI!IHHIHhhi!hhhi!Hhhi!hhhi!hhhi!Ihhi!!hhi!Ihhi!hhhi!Hhhi!hhhi!hhhi!");
    }

    @Test
    public void test7516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7516");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhihhi!hhi!hhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhihhi!hhi!hhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!" + "'", str1, "Hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhihhi!hhi!hhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
    }

    @Test
    public void test7517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7517");
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
        java.lang.String str25 = org.apache.commons.lang.WordUtils.uncapitalize("hhhi!hhhi!HHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!hHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!hhhi!Hhhi!hhHI!", charArray15);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.capitalize("hhhI!IhhI!hHI!HHI!HHHHHHI!HHHI!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHHHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHHI!HHHI!HHI!HHHI!hHHHi!iHHihHI!HHI!HHHHHHI!HHHI!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHHHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHHI!HHHI!HHI!HHHI!!hi!!H", charArray15);
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
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hhhi!hhhi!HHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!hHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!hhhi!Hhhi!hhHI!" + "'", str25, "hhhi!hhhi!HHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!hHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!hhhi!Hhhi!hhHI!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "HhhI!IhhI!hHI!HHI!HHHHHHI!HHHI!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHHHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHHI!HHHI!HHI!HHHI!hHHHi!iHHihHI!HHI!HHHHHHI!HHHI!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHHHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHHI!HHHI!HHI!HHHI!!hi!!H" + "'", str26, "HhhI!IhhI!hHI!HHI!HHHHHHI!HHHI!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHHHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHHI!HHHI!HHI!HHHI!hHHHi!iHHihHI!HHI!HHHHHHI!HHHI!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHHHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHHI!HHHI!HHI!HHHI!!hi!!H");
    }

    @Test
    public void test7518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7518");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("HHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!hHhhhi!ihhihhhI!IhHHHi!iHHi!HhH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhhi!ihhihhhi!ihhhhi!ihhi!hhh" + "'", str1, "Hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhhi!ihhihhhi!ihhhhi!ihhi!hhh");
    }

    @Test
    public void test7519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7519");
        char[] charArray10 = new char[] {};
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("H", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("hhI!", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("hH", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("hHHi!iHHi!!", charArray10);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("hH", charArray10);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("hhHI!", charArray10);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("HHhhi!hhhi!hhhi!", charArray10);
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hhHI!" + "'", str19, "hhHI!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HHhhi!hhhi!hhhi!" + "'", str20, "HHhhi!hhhi!hhhi!");
    }

    @Test
    public void test7520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7520");
        char[] charArray9 = new char[] {};
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("hH", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("HI!", charArray9);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("HhHHHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!HHI!IHI!!HI!!", charArray9);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("hhhi!ihhi!hhh", charArray9);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHI!HHHI!HHHI!HHHI!HHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hH" + "'", str14, "hH");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HI!" + "'", str15, "HI!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HhHHHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!HHI!IHI!!HI!!" + "'", str16, "HhHHHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!HHI!IHI!!HI!!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hhhi!ihhi!hhh" + "'", str17, "hhhi!ihhi!hhh");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HHHI!HHHI!HHHI!HHHI!HHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!" + "'", str18, "HHHI!HHHI!HHHI!HHHI!HHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!");
    }

    @Test
    public void test7521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7521");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HHHHHI!IHHhhhhi!ihhiHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHHHI!IHHhhhhi!ihhiHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!" + "'", str1, "hHHHHI!IHHhhhhi!ihhiHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!");
    }

    @Test
    public void test7522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7522");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("HHHHi!iHHihhHHHI!IHHI!!hhHHHI!IHHI!!hhHHHI!IHhHHHI!HHHIhHHI!HHHI!IHHI!!HI!!ihHHHI!IHHI!!!hHHHI!IHHI!!hhHHHhHHHI!HHHIhHHI!HHHI!IHHI!!I!IHHI!!hhHHHI!IHHI!!hhHHHI!IHHI!!ihHHHI!HHHIhHHI!HHHI!IHHI!!hHHHI!IHHI!!!hHHHI!IHHI!!ihHHHI!IHHhHHHI!HHHIhHHI!HHHI!IHHI!!I!!hhHHHI!IHHI!!hhHHHI!IHHI!!ihHHHIhHHHI!HHHIhHHI!HHHI!IHHI!!!IHHI!!!hHHHI!IHHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test7523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7523");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hHHHHI!IHHIHHHHI!HHHI!IHHI!!", (int) (byte) 10, "hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhihhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhhhhi!ihhi!hi!!h", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHHHI!IHHIHHHHI!HHHI!IHHI!!" + "'", str4, "hHHHHI!IHHIHHHHI!HHHI!IHHI!!");
    }

    @Test
    public void test7524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7524");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHHHI!IHHIHHHI!HHHI!IHHI!!!HI!!H", (-1), (int) '#', "HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHi!iHHi!HHHI!IHHI!!hi!!IHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHHI!IHHIHHHI!HHHI!IHHI!!!HI!!H" + "'", str4, "hHHHI!IHHIHHHI!HHHI!IHHI!!!HI!!H");
    }

    @Test
    public void test7525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7525");
        char[] charArray6 = new char[] { ' ' };
        java.lang.String str7 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray6);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalize("Hhi!", charArray6);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("H", charArray6);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("hhhI!IhhI!HI!!", charArray6);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("hhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!ihi!!hi!hhi!ihi!!hi!!", charArray6);
        java.lang.Class<?> wildcardClass12 = charArray6.getClass();
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { ' ' });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hhi!" + "'", str8, "Hhi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "h" + "'", str9, "h");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "h" + "'", str10, "h");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "h" + "'", str11, "h");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test7526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7526");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hHHhHHhHHiHH!HHhHHhHHhHHiHH!HHhHHhHHhHHiHH!HHIHHhHHhHHiHH!HH!HHhHHhHHiHH!HHIHHhHHhHHiHH!HHhHHhHHhhHHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!!HHiHH!HHhHHhHHhHHiHH!HHIHHhHHhHHiHH!HH!HHhHHhHHiHH!HHHHHhHHhHHiHH!HHIHHhHHhHHiHH!HH!HHhHHhHHiHH!HhHHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!!H!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HhhHhhHhhIhh!hhHhhHhhHhhIhh!hhHhhHhhHhhIhh!hhihhHhhHhhIhh!hh!hhHhhHhhIhh!hhihhHhhHhhIhh!hhHhhHhhHHhhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!hhIhh!hhHhhHhhHhhIhh!hhihhHhhHhhIhh!hh!hhHhhHhhIhh!hhhhhHhhHhhIhh!hhihhHhhHhhIhh!hh!hhHhhHhhIhh!hHhhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!h!" + "'", str1, "HhhHhhHhhIhh!hhHhhHhhHhhIhh!hhHhhHhhHhhIhh!hhihhHhhHhhIhh!hh!hhHhhHhhIhh!hhihhHhhHhhIhh!hhHhhHhhHHhhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!hhIhh!hhHhhHhhHhhIhh!hhihhHhhHhhIhh!hh!hhHhhHhhIhh!hhhhhHhhHhhIhh!hhihhHhhHhhIhh!hh!hhHhhHhhIhh!hHhhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!h!");
    }

    @Test
    public void test7527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7527");
        char[] charArray9 = new char[] {};
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("Hh", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("HHHi!iHHi!hi!!", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("HHHI!hHHI!iHHI!!", charArray9);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("hhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!", charArray9);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("HHhhi!hhhi!hhhi!", charArray9);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!hhi!hhHHhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!hHhhhi!hhhi!ihhi!!hHhhhi!hhhi!ihhi!!iHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!hHhhhi!hhhi!ihhi!!iHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!!", charArray9);
        java.lang.Class<?> wildcardClass19 = charArray9.getClass();
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hi!" + "'", str12, "Hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hh" + "'", str13, "Hh");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HHHi!iHHi!hi!!" + "'", str14, "HHHi!iHHi!hi!!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!" + "'", str16, "hhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HHhhi!hhhi!hhhi!" + "'", str17, "HHhhi!hhhi!hhhi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!hhi!hhHHhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!hHhhhi!hhhi!ihhi!!hHhhhi!hhhi!ihhi!!iHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!hHhhhi!hhhi!ihhi!!iHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!!" + "'", str18, "hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!hhi!hhHHhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!hHhhhi!hhhi!ihhi!!hHhhhi!hhhi!ihhi!!iHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!hHhhhi!hhhi!ihhi!!iHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test7528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7528");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhhhhi!hhhhhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhHHhHhHhHhHhHhHhHiHhH!HhHhHhHhHhHhHhHiHhH!HhHiHhHhHhHhHhHiHhH!HhH!", (int) (short) 10, 100, "Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhHHhhhi!hhhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhhhi!hhhhhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhHhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhHHhhhi!hhhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!" + "'", str4, "hhhhhi!hhhhhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhHhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhHHhhhi!hhhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
    }

    @Test
    public void test7529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7529");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!", (int) (byte) 10, "hhhi!Hhhi!HhI!hhHI!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHHi!iHHihhhi!Hhhi!HhI!hhHI!!!HHHHi!iHhhhi!Hhhi!HhI!hhHI!Hi!!hHHHi!hhhi!Hhhi!HhI!hhHI!iHHi!!iHHHhhhi!Hhhi!HhI!hhHI!i!iHHi!!!" + "'", str4, "hHHHi!iHHihhhi!Hhhi!HhI!hhHI!!!HHHHi!iHhhhi!Hhhi!HhI!hhHI!Hi!!hHHHi!hhhi!Hhhi!HhI!hhHI!iHHi!!iHHHhhhi!Hhhi!HhI!hhHI!i!iHHi!!!");
    }

    @Test
    public void test7530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7530");
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
        java.lang.String str23 = org.apache.commons.lang.WordUtils.uncapitalize("hHHHI!IHHI!HHHI!IHHI!!HI!!HHHHI!IHHI!HHHI!IHHI!!HI!!HHHHI!IHHI!HHHI!IHHI!!HI!!HHHHI!IHHI!HHHI!IHHI!!HI!!IHHHI!IHHI!HHHI!IHHI!!HI!!!HHHI!IHHI!HHHI!IHHI!!HI!!HHHHI!IHHI!HHHI!IHHI!!HI!!HHHHI!IHHI!HHHI!IHHI!!HI!!HHHHI!IHHI!HHHI!IHHI!!HI!!IHHHI!IHHI!HHHI!IHHI!!HI!!!HHHI!IHHI!HHHI!IHHI!!HI!!HHHHI!IHHI!HHHI!IHHI!!HI!!HHHHI!IHHI!HHHI!IHHI!!HI!!HHHHI!IHHI!HHHI!IHHI!!HI!!IHHHI!IHHI!HHHI!IHHI!!HI!!!", charArray12);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalizeFully("HhHHI!HHHI!HHHI!", charArray12);
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hHHHI!IHHI!HHHI!IHHI!!HI!!HHHHI!IHHI!HHHI!IHHI!!HI!!HHHHI!IHHI!HHHI!IHHI!!HI!!HHHHI!IHHI!HHHI!IHHI!!HI!!IHHHI!IHHI!HHHI!IHHI!!HI!!!HHHI!IHHI!HHHI!IHHI!!HI!!HHHHI!IHHI!HHHI!IHHI!!HI!!HHHHI!IHHI!HHHI!IHHI!!HI!!HHHHI!IHHI!HHHI!IHHI!!HI!!IHHHI!IHHI!HHHI!IHHI!!HI!!!HHHI!IHHI!HHHI!IHHI!!HI!!HHHHI!IHHI!HHHI!IHHI!!HI!!HHHHI!IHHI!HHHI!IHHI!!HI!!HHHHI!IHHI!HHHI!IHHI!!HI!!IHHHI!IHHI!HHHI!IHHI!!HI!!!" + "'", str23, "hHHHI!IHHI!HHHI!IHHI!!HI!!HHHHI!IHHI!HHHI!IHHI!!HI!!HHHHI!IHHI!HHHI!IHHI!!HI!!HHHHI!IHHI!HHHI!IHHI!!HI!!IHHHI!IHHI!HHHI!IHHI!!HI!!!HHHI!IHHI!HHHI!IHHI!!HI!!HHHHI!IHHI!HHHI!IHHI!!HI!!HHHHI!IHHI!HHHI!IHHI!!HI!!HHHHI!IHHI!HHHI!IHHI!!HI!!IHHHI!IHHI!HHHI!IHHI!!HI!!!HHHI!IHHI!HHHI!IHHI!!HI!!HHHHI!IHHI!HHHI!IHHI!!HI!!HHHHI!IHHI!HHHI!IHHI!!HI!!HHHHI!IHHI!HHHI!IHHI!!HI!!IHHHI!IHHI!HHHI!IHHI!!HI!!!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "HhHHI!HHHI!HHHI!" + "'", str24, "HhHHI!HHHI!HHHI!");
    }

    @Test
    public void test7531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7531");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihHHHHHI!IHHI!!HHHHHI!IHHI!!HHHHHI!IHHHHHI!HHHIHHHI!HHHI!IHHI!!HI!!IHHHHI!IHHI!!!HHHHI!IHHI!!HHHHHHhhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhHhhi!ihhi!HHI!iHI!!hi!!HHHI!HHHIHHHI!HHHI!IHHI!!I!IHHI!!HHHHHI!IHHI!!HHHHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHI!IHHI!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhHhhi!ihhi!HHI!iHI!!hi!!!!HHHHI!IHHI!!IHHHHI!IHHHHHHI!HHHIHHHI!HHHI!IHHI!!I!!HHHHHI!IHHI!!HHHHHI!IHHI!!IHHHHIHHHHI!HHHIHHhhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhHhhi!ihhi!HHI!iHI!!hi!!HI!HHHI!IHHI!!!IHHI!!!HHHHI!IHHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihHHHHHI!IHHI!!HHHHHI!IHHI!!HHHHHI!IHHHHHI!HHHIHHHI!HHHI!IHHI!!HI!!IHHHHI!IHHI!!!HHHHI!IHHI!!HHHHHHhhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhHhhi!ihhi!HHI!iHI!!hi!!HHHI!HHHIHHHI!HHHI!IHHI!!I!IHHI!!HHHHHI!IHHI!!HHHHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHI!IHHI!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhHhhi!ihhi!HHI!iHI!!hi!!!!HHHHI!IHHI!!IHHHHI!IHHHHHHI!HHHIHHHI!HHHI!IHHI!!I!!HHHHHI!IHHI!!HHHHHI!IHHI!!IHHHHIHHHHI!HHHIHHhhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhHhhi!ihhi!HHI!iHI!!hi!!HI!HHHI!IHHI!!!IHHI!!!HHHHI!IHHI!!!" + "'", str1, "hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihHHHHHI!IHHI!!HHHHHI!IHHI!!HHHHHI!IHHHHHI!HHHIHHHI!HHHI!IHHI!!HI!!IHHHHI!IHHI!!!HHHHI!IHHI!!HHHHHHhhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhHhhi!ihhi!HHI!iHI!!hi!!HHHI!HHHIHHHI!HHHI!IHHI!!I!IHHI!!HHHHHI!IHHI!!HHHHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHI!IHHI!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhHhhi!ihhi!HHI!iHI!!hi!!!!HHHHI!IHHI!!IHHHHI!IHHHHHHI!HHHIHHHI!HHHI!IHHI!!I!!HHHHHI!IHHI!!HHHHHI!IHHI!!IHHHHIHHHHI!HHHIHHhhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhHhhi!ihhi!HHI!iHI!!hi!!HI!HHHI!IHHI!!!IHHI!!!HHHHI!IHHI!!!");
    }

    @Test
    public void test7532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7532");
        char[] charArray16 = new char[] {};
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray16);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("", charArray16);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.initials("hi!", charArray16);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray16);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalize("", charArray16);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalize("HI!", charArray16);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.uncapitalize("hH", charArray16);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray16);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.capitalize("HHi!", charArray16);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.capitalize("Hhhhhi!ihhhhHHHI!IHHI!HI!!H", charArray16);
        java.lang.String str27 = org.apache.commons.lang.WordUtils.uncapitalize("hhhhi!hhhiHHhhi!!ihhi!!", charArray16);
        java.lang.String str28 = org.apache.commons.lang.WordUtils.capitalize("HHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!hHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!hhhi!Hhhi!hhHI!", charArray16);
        java.lang.String str29 = org.apache.commons.lang.WordUtils.capitalize("hHHHi!iHHi!hi!!H", charArray16);
        java.lang.String str30 = org.apache.commons.lang.WordUtils.initials("HhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!H!", charArray16);
        java.lang.String str31 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!h", charArray16);
        java.lang.String str32 = org.apache.commons.lang.WordUtils.initials("hhhi!ihhi!hhh", charArray16);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] {});
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HI!" + "'", str20, "HI!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "HI!" + "'", str22, "HI!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hH" + "'", str23, "hH");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "HHi!" + "'", str25, "HHi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Hhhhhi!ihhhhHHHI!IHHI!HI!!H" + "'", str26, "Hhhhhi!ihhhhHHHI!IHHI!HI!!H");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hhhhi!hhhiHHhhi!!ihhi!!" + "'", str27, "hhhhi!hhhiHHhhi!!ihhi!!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "HHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!hHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!hhhi!Hhhi!hhHI!" + "'", str28, "HHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!hHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!hhhi!Hhhi!hhHI!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hHHHi!iHHi!hi!!H" + "'", str29, "hHHHi!iHHi!hi!!H");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!h" + "'", str31, "hHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!h");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
    }

    @Test
    public void test7533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7533");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HhHHhHH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HhHHhHH" + "'", str1, "HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HhHHhHH");
    }

    @Test
    public void test7534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7534");
        char[] charArray10 = new char[] { '#', '4', '4', '4' };
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("H", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("hhhi!ihhi!!", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!ihi!!hi!hhi!ihi!!hi!!", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!IhHHI!hHHI!iHHI!!!hHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!IhHHI!hHHI!iHHI!!!hHHI!hHHI!iHHI!!IhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!IhHHI!hHHI!iHHI!!!hHHI!hHHI!iHHI!!!", charArray10);
        java.lang.Class<?> wildcardClass17 = charArray10.getClass();
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '#', '4', '4', '4' });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hi!" + "'", str11, "Hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hi!" + "'", str12, "Hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "h" + "'", str13, "h");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hhhi!ihhi!!" + "'", str14, "hhhi!ihhi!!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!ihi!!hi!hhi!ihi!!hi!!" + "'", str15, "Hhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!ihi!!hi!hhi!ihi!!hi!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test7535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7535");
        char[] charArray9 = new char[] {};
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("hh", charArray9);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHHI!HHHI!IHHI!!", charArray9);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!", charArray9);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("hhHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!!Hhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!!Hhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!!Hhi!Ihi!!!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hh" + "'", str15, "hh");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HHHHI!HHHI!IHHI!!" + "'", str16, "HHHHI!HHHI!IHHI!!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!" + "'", str17, "hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hhHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!!Hhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!!Hhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!!Hhi!Ihi!!!" + "'", str18, "hhHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!!Hhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!!Hhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!!Hhi!Ihi!!!");
    }

    @Test
    public void test7536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7536");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HhhhI!IhhI!!hhhhI!IhhI!!hhhhI!Ihhhhhi!Hhhi!HhI!hhHI!", (int) (short) 10, (int) (byte) 1, "HHI!HHI!HHHHHHI!HHHI!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHHhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHHI!HHHI!HHI!HHHI!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HhhhI!IhhIHHI!HHI!HHHHHHI!HHHI!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHHhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHHI!HHHI!HHI!HHHI!" + "'", str4, "HhhhI!IhhIHHI!HHI!HHHHHHI!HHHI!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHHhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHHI!HHHI!HHI!HHHI!");
    }

    @Test
    public void test7537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7537");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("HHhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HhHHHHI!IHHHHHI!IHHI!HHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhHHhhhi!ihhi!hi!!hhHHhhhi!ihhi!hHhhhhi!ihhhhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!" + "'", str1, "hhHHhhhi!ihhi!hi!!hhHHhhhi!ihhi!hHhhhhi!ihhhhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!");
    }

    @Test
    public void test7538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7538");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HHHHHI!IHHhhhhi!ihhiHhhhhhhhhihh!hhhHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHiHhhi!Hhhi!Ihhi!!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHHHHI!IHHhhhhi!ihhiHhhhhhhhhihh!hhhHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHiHhhi!Hhhi!Ihhi!!" + "'", str2, "HHHHHI!IHHhhhhi!ihhiHhhhhhhhhihh!hhhHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHiHhhi!Hhhi!Ihhi!!");
    }

    @Test
    public void test7539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7539");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!" + "'", str1, "hHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!");
    }

    @Test
    public void test7540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7540");
        char[] charArray9 = new char[] {};
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("hi!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHHHI!IHHI!HI!!H", charArray9);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("hhhi!hhhi!HHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!hHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!hhhi!Hhhi!hhHI!", charArray9);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("hhhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!HhhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!HHHI!hHHI!HHhi!", charArray9);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("hhHHHI!IHHIHHHHI!HHHI!IHHI!!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HI!" + "'", str13, "HI!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HI!" + "'", str14, "HI!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HHHHHI!IHHI!HI!!H" + "'", str15, "HHHHHI!IHHI!HI!!H");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hhhi!hhhi!HHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!hHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!hhhi!Hhhi!hhHI!" + "'", str16, "hhhi!hhhi!HHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!hHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!hhhi!Hhhi!hhHI!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test7541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7541");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("HhhhI!IhhI!hHhhhhhI!IhhI!hHhhhhhI!IhhI!hHhhhhhI!IhhI!hHhhhhhI!IhhI!hHhihhhI!IhhI!hHh!hhhI!IhhI!hHhhhhhI!IhhI!hHhhhhhI!IhhI!hHhhhhhI!IhhI!hHhhhhhI!IhhI!hHhHhhhI!IhhI!hHhHhhhI!IhhI!hHhIhhhI!IhhI!hHh!hhhI!IhhI!hHhHhhhI!IhhI!hHhHhhhI!IhhI!hHhHhhhI!IhhI!hHhIhhhI!IhhI!hHh!hhhI!IhhI!hHhIhhhI!IhhI!hHhHhhhI!IhhI!hHhHhhhI!IhhI!hHhIhhhI!IhhI!hHh!hhhI!IhhI!hHh!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HhhhI!IhhI!hHhhhhhI!IhhI!hHhhhhhI!IhhI!hHhhhhhI!IhhI!hHhhhhhI!IhhI!hHhihhhI!IhhI!hHh!hhhI!IhhI!hHhhhhhI!IhhI!hHhhhhhI!IhhI!hHhhhhhI!IhhI!hHhhhhhI!IhhI!hHhHhhhI!IhhI!hHhHhhhI!IhhI!hHhIhhhI!IhhI!hHh!hhhI!IhhI!hHhHhhhI!IhhI!hHhHhhhI!IhhI!hHhHhhhI!IhhI!hHhIhhhI!IhhI!hHh!hhhI!IhhI!hHhIhhhI!IhhI!hHhHhhhI!IhhI!hHhHhhhI!IhhI!hHhIhhhI!IhhI!hHh!hhhI!IhhI!hHh!" + "'", str1, "HhhhI!IhhI!hHhhhhhI!IhhI!hHhhhhhI!IhhI!hHhhhhhI!IhhI!hHhhhhhI!IhhI!hHhihhhI!IhhI!hHh!hhhI!IhhI!hHhhhhhI!IhhI!hHhhhhhI!IhhI!hHhhhhhI!IhhI!hHhhhhhI!IhhI!hHhHhhhI!IhhI!hHhHhhhI!IhhI!hHhIhhhI!IhhI!hHh!hhhI!IhhI!hHhHhhhI!IhhI!hHhHhhhI!IhhI!hHhHhhhI!IhhI!hHhIhhhI!IhhI!hHh!hhhI!IhhI!hHhIhhhI!IhhI!hHhHhhhI!IhhI!hHhHhhhI!IhhI!hHhIhhhI!IhhI!hHh!hhhI!IhhI!hHh!");
    }

    @Test
    public void test7542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7542");
        char[] charArray9 = new char[] {};
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("hi!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("hHI!", charArray9);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("", charArray9);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!iHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!!HHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!iHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!!HHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!iHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!iHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!!HHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!!", charArray9);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("hHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!Hhhhi!ihhihi!!hi!!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HI!" + "'", str13, "HI!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HI!" + "'", str14, "HI!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hHI!" + "'", str15, "hHI!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!iHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!!HHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!iHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!!HHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!iHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!iHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!!HHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!!" + "'", str17, "hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!iHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!!HHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!iHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!!HHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!iHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!iHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!!HHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!Hhhhi!ihhihi!!hi!!" + "'", str18, "hHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!Hhhhi!ihhihi!!hi!!");
    }

    @Test
    public void test7543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7543");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("HhHHHi!iHHHHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!IHhhi!ihhi!HHI!iHI!!hi!!!Hhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!IHhhi!ihhi!HHI!iHI!!hi!!!Hhhi!ihhi!HHI!iHI!!hi!!IHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!IHhhi!ihhi!HHI!iHI!!hi!!!Hhhi!ihhi!HHI!iHI!!hi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHhhhI!IhhhhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!!" + "'", str1, "hHhhhI!IhhhhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!!");
    }

    @Test
    public void test7544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7544");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HHHHHI!IHHI!!HHHHHI!IHHI!!HHHHHI!IHHI!!IHHHHI!IHHI!!HHHI!", (int) (byte) 100, "HHHI!hHHI!Hhhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHHHHI!IHHI!!HHHHHI!IHHI!!HHHHHI!IHHI!!IHHHHI!IHHI!!HHHI!" + "'", str4, "HHHHHI!IHHI!!HHHHHI!IHHI!!HHHHHI!IHHI!!IHHHHI!IHHI!!HHHI!");
    }

    @Test
    public void test7545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7545");
        char[] charArray12 = new char[] {};
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray12);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("", charArray12);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray12);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("hH", charArray12);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("hI!", charArray12);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("HI!", charArray12);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("HI!", charArray12);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhI!IhhI!HI!!", charArray12);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HhHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!IHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!!HHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!", charArray12);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.initials("hHHHI!IHHI!hhi!Ihi!!HI!!HHHHI!IHHI!hhi!Ihi!!HI!!HHHHI!IHHI!hhi!Ihi!!HI!!IHHHI!IHHI!hhi!Ihi!!HI!!!HHHI!IHHI!hhi!Ihi!!HI!!IHHHI!IHHI!hhi!Ihi!!HI!!HHHHI!IHHI!hhi!Ihi!!HI!!HHHHI!IHHI!hhi!Ihi!!HI!!IHHHI!IHHI!hhi!Ihi!!HI!!!HHHI!IHHI!hhi!Ihi!!HI!!hHHHI!IHHI!hhi!Ihi!!HI!!iHHHI!IHHI!hhi!Ihi!!HI!!!", charArray12);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!ihhi!hhhi!ihhi!hi!!", charArray12);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!ihhi!hhhi!ihhi!hhi!ihi!!hi!!", charArray12);
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HhHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!IHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!!HHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!" + "'", str21, "hHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HhHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!IHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!!HHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Hhhi!ihhi!hhhi!ihhi!hi!!" + "'", str23, "Hhhi!ihhi!hhhi!ihhi!hi!!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Hhhi!ihhi!hhhi!ihhi!hhi!ihi!!hi!!" + "'", str24, "Hhhi!ihhi!hhhi!ihhi!hhi!ihi!!hi!!");
    }

    @Test
    public void test7546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7546");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("Hhhhhhi!ihhhhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!!hhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!!hhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!!hhhi!ihhi!hhi!ihi!!hi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test7547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7547");
        char[] charArray12 = new char[] {};
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray12);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("", charArray12);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray12);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray12);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("Hh", charArray12);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("Hi!", charArray12);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.uncapitalize("H", charArray12);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("Hhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!ihi!!hi!hhi!ihi!!hi!!", charArray12);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.initials("HhhI!IhhI!hHHHi!iHHi!hi!!H", charArray12);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalizeFully("hhHHi!iHHiHhhi!ihhi!HHHi!iHHi!hi!!", charArray12);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!H", charArray12);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.uncapitalize("hhHHi!iHHi!!", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] {});
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hi!" + "'", str15, "Hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hh" + "'", str17, "Hh");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hi!" + "'", str18, "Hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H" + "'", str19, "H");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!ihi!!hi!hhi!ihi!!hi!!" + "'", str20, "Hhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!ihi!!hi!hhi!ihi!!hi!!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hhHHi!iHHiHhhi!ihhi!HHHi!iHHi!hi!!" + "'", str22, "hhHHi!iHHiHhhi!ihhi!HHHi!iHHi!hi!!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!H" + "'", str23, "hHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!H");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hhHHi!iHHi!!" + "'", str24, "hhHHi!iHHi!!");
    }

    @Test
    public void test7548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7548");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!!", (-1), (int) (short) 10, "hHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!HHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!hhhhi!ihhihhhi!Hhhi!Ihhi!!!hi!!h");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHHHI!HHHhHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!HHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!hhhhi!ihhihhhi!Hhhi!Ihhi!!!hi!!h" + "'", str4, "hHHHHI!HHHhHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!HHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!hhhhi!ihhihhhi!Hhhi!Ihhi!!!hi!!h");
    }

    @Test
    public void test7549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7549");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("Hhhi!hhhi!hhhi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test7550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7550");
        char[] charArray10 = new char[] {};
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("H", charArray10);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray10);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.uncapitalize("hhI!", charArray10);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.initials("Hhhhi!ihhihHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!!", charArray10);
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hi!" + "'", str18, "Hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hhI!" + "'", str19, "hhI!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test7551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7551");
        char[] charArray11 = new char[] { '#', '4', '4', '4' };
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("HHhi!", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("hhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("HhHhhi!ihhhHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHHHHI!IHHI!HHI!IHI!!HI!!", charArray11);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("HhHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!!hHI!iHI!!ihHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!!hHI!iHI!!hhHI!iHI!!ihHI!iHI!!!hHI!iHI!!!", charArray11);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("Hhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!Hhihi!!hi!hhi!ihi!!hi!!", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '#', '4', '4', '4' });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hi!" + "'", str12, "Hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hi!" + "'", str13, "Hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hhhi!" + "'", str14, "Hhhi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!" + "'", str15, "Hhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hhhhhi!ihhhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhhhi!ihhi!hhi!ihi!!hi!!" + "'", str16, "Hhhhhi!ihhhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhhhi!ihhi!hhi!ihi!!hi!!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H" + "'", str17, "H");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H" + "'", str18, "H");
    }

    @Test
    public void test7552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7552");
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
        java.lang.String str24 = org.apache.commons.lang.WordUtils.initials("hhhH", charArray12);
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
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test7553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7553");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHHHI!HHHhHhhhI!IhhhhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!!", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhhhi!hhhhhhhhi!ihhhhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!!hhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!!hhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!!hhhi!ihhi!hhi!ihi!!hi!!!" + "'", str2, "Hhhhhi!hhhhhhhhi!ihhhhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!!hhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!!hhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!!hhhi!ihhi!hhi!ihi!!hi!!!");
    }

    @Test
    public void test7554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7554");
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
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalize("Hhhhhi!ihhi!hi!!h", charArray11);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!HHI!IHI!!HI!!", charArray11);
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Hhhhhi!ihhi!hi!!h" + "'", str21, "Hhhhhi!ihhi!hi!!h");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!HHI!IHI!!HI!!" + "'", str22, "HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!HHI!IHI!!HI!!");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test7555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7555");
        char[] charArray8 = new char[] {};
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("hi!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("hhhhi!hhhi!ihhi!!", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("Hhhi!", charArray8);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("hHHHi!iHHi!hi!!H", charArray8);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("hhhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhIhHHI!hHHI!iHHI!!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hhhhi!hhhi!ihhi!!" + "'", str13, "hhhhi!hhhi!ihhi!!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hHHHi!iHHi!hi!!H" + "'", str15, "hHHHi!iHHi!hi!!H");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hhhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhIhHHI!hHHI!iHHI!!" + "'", str16, "hhhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhIhHHI!hHHI!iHHI!!");
    }

    @Test
    public void test7556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7556");
        char[] charArray13 = new char[] {};
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray13);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("", charArray13);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray13);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray13);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("Hh", charArray13);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.initials("HHHi!iHHi!!", charArray13);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.initials("H", charArray13);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray13);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalize("hHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHHHHI!IHHI!HHI!IHI!!HI!!", charArray13);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.initials("HhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!", charArray13);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.initials("", charArray13);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.capitalize("hhHHi!iHHi!HHHI!IHHI!!hi!!hhHHi!iHHi!HHHI!IHHI!!hi!!HhHHi!iHHi!HHHI!IHHI!!hi!!HhHHi!iHHi!HHHI!IHHI!!hi!!IhHHi!iHHi!HHHI!IHHI!!hi!!!hHHi!iHHi!HHHI!IHHI!!hi!!HhHHi!iHHi!HHHI!IHHI!!hi!!HhHHi!iHHi!HHHI!IHHI!!hi!!HhHHi!iHHi!HHHI!IHHI!!hi!!IhHHi!iHHi!HHHI!IHHI!!hi!!!hHHi!iHHi!HHHI!IHHI!!hi!!HhHHi!iHHi!HHHI!IHHI!!hi!!HhHHi!iHHi!HHHI!IHHI!!hi!!HhHHi!iHHi!HHHI!IHHI!!hi!!IhHHi!iHHi!HHHI!IHHI!!hi!!!", charArray13);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.uncapitalize("HHHhhI!IhhIhHh", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] {});
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hi!" + "'", str16, "Hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hh" + "'", str18, "Hh");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHHHHI!IHHI!HHI!IHI!!HI!!" + "'", str22, "hHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHHHHI!IHHI!HHI!IHI!!HI!!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hhHHi!iHHi!HHHI!IHHI!!hi!!hhHHi!iHHi!HHHI!IHHI!!hi!!HhHHi!iHHi!HHHI!IHHI!!hi!!HhHHi!iHHi!HHHI!IHHI!!hi!!IhHHi!iHHi!HHHI!IHHI!!hi!!!hHHi!iHHi!HHHI!IHHI!!hi!!HhHHi!iHHi!HHHI!IHHI!!hi!!HhHHi!iHHi!HHHI!IHHI!!hi!!HhHHi!iHHi!HHHI!IHHI!!hi!!IhHHi!iHHi!HHHI!IHHI!!hi!!!hHHi!iHHi!HHHI!IHHI!!hi!!HhHHi!iHHi!HHHI!IHHI!!hi!!HhHHi!iHHi!HHHI!IHHI!!hi!!HhHHi!iHHi!HHHI!IHHI!!hi!!IhHHi!iHHi!HHHI!IHHI!!hi!!!" + "'", str25, "hhHHi!iHHi!HHHI!IHHI!!hi!!hhHHi!iHHi!HHHI!IHHI!!hi!!HhHHi!iHHi!HHHI!IHHI!!hi!!HhHHi!iHHi!HHHI!IHHI!!hi!!IhHHi!iHHi!HHHI!IHHI!!hi!!!hHHi!iHHi!HHHI!IHHI!!hi!!HhHHi!iHHi!HHHI!IHHI!!hi!!HhHHi!iHHi!HHHI!IHHI!!hi!!HhHHi!iHHi!HHHI!IHHI!!hi!!IhHHi!iHHi!HHHI!IHHI!!hi!!!hHHi!iHHi!HHHI!IHHI!!hi!!HhHHi!iHHi!HHHI!IHHI!!hi!!HhHHi!iHHi!HHHI!IHHI!!hi!!HhHHi!iHHi!HHHI!IHHI!!hi!!IhHHi!iHHi!HHHI!IHHI!!hi!!!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "HHHhhI!IhhIhHh" + "'", str26, "HHHhhI!IhhIhHh");
    }

    @Test
    public void test7557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7557");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HhHHHI!IHHI!HI!!ihHHHI!IHHI!HI!!!", (int) (byte) 1, "HHHHHHI!HHHHhhi!hhhi!ihhi!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HhHHHI!IHHI!HI!!ihHHHI!IHHI!HI!!!" + "'", str4, "HhHHHI!IHHI!HI!!ihHHHI!IHHI!HI!!!");
    }

    @Test
    public void test7558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7558");
        char[] charArray7 = new char[] {};
        java.lang.String str8 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("HhhI!IhhI!!", charArray7);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHi!iHHi!hi!!", charArray7);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("Hhhhhi!hhhi!hhhi!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HhhI!IhhI!!" + "'", str12, "HhhI!IhhI!!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HHHi!iHHi!hi!!" + "'", str13, "HHHi!iHHi!hi!!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hhhhhi!hhhi!hhhi!" + "'", str14, "Hhhhhi!hhhi!hhhi!");
    }

    @Test
    public void test7559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7559");
        char[] charArray10 = new char[] {};
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("hi!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("Hhhi!ihhi!!", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("hH", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("HHH", charArray10);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("hhhi!hhhi!ihhi!!", charArray10);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.initials("hhhhi!hhhi!ihhi!!", charArray10);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.initials("hhhhhi!ihhi!hi!!h", charArray10);
        java.lang.Class<?> wildcardClass21 = charArray10.getClass();
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HHH" + "'", str17, "HHH");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hhhi!hhhi!ihhi!!" + "'", str18, "hhhi!hhhi!ihhi!!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test7560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7560");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hhhhi!ihhihhhi!ihhi!hhhi!ihhi!hi!!", 1, "hhhhi!hhhi!ihhi!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhhi!ihhihhhi!ihhi!hhhi!ihhi!hi!!" + "'", str4, "hhhhi!ihhihhhi!ihhi!hhhi!ihhi!hi!!");
    }

    @Test
    public void test7561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7561");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("Hhhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!hhhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!hhhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!hhhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!ihhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!!hhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!ihhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!hhhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!hhhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!ihhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!!hhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test7562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7562");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!" + "'", str1, "hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!");
    }

    @Test
    public void test7563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7563");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HhH", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HhH" + "'", str2, "HhH");
    }

    @Test
    public void test7564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7564");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hhhi!ihhi!hhhhi!ihhi!hi!!h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test7565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7565");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HHHI!HHHI!HHhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!", (int) (short) 100, "Hhhi!ihhi!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHHI!HHHI!HHhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhiHhhi!ihhi!!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!" + "'", str4, "HHHI!HHHI!HHhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhiHhhi!ihhi!!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
    }

    @Test
    public void test7566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7566");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hHHI!IHHI!HHHHHHHHHIHH!HHHHHHHHHHHIHhhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHI!IHHI!HHHHHHHHHIHH!HHHHHHHHHHHIHhhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!" + "'", str1, "hHHI!IHHI!HHHHHHHHHIHH!HHHHHHHHHHHIHhhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!");
    }

    @Test
    public void test7567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7567");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhhhi!ihhhhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHHHI!IHHHHHI!IHHI!HHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!" + "'", str1, "HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHHHI!IHHHHHI!IHHI!HHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!");
    }

    @Test
    public void test7568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7568");
        char[] charArray10 = new char[] {};
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("H", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("hhI!", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("hH", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("hHHi!iHHi!!", charArray10);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHi!iHHi!hi!!", charArray10);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.uncapitalize("hhhhi!ihhi!hi!!h", charArray10);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("hhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHHI!IHHIHHHi!iHHi!hHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H" + "'", str14, "H");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HHHi!iHHi!hi!!" + "'", str18, "HHHi!iHHi!hi!!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hhhhi!ihhi!hi!!h" + "'", str19, "hhhhi!ihhi!hi!!h");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHHI!IHHIHHHi!iHHi!hHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!" + "'", str20, "hhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHHI!IHHIHHHi!iHHi!hHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!");
    }

    @Test
    public void test7569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7569");
        char[] charArray6 = new char[] {};
        java.lang.String str7 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray6);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.initials("", charArray6);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray6);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray6);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHHI!IHHI!HI!!", charArray6);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("hHHHHI!HHHHHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHHI!IHHI!HHH", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hi!" + "'", str10, "Hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hHHHI!IHHI!HI!!" + "'", str11, "hHHHI!IHHI!HI!!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hHHHHI!HHHHHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHHI!IHHI!HHH" + "'", str12, "hHHHHI!HHHHHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHHI!IHHI!HHH");
    }

    @Test
    public void test7570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7570");
        char[] charArray7 = new char[] {};
        java.lang.String str8 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("hi!", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray7);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray7);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hi!" + "'", str11, "Hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test7571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7571");
        char[] charArray8 = new char[] {};
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("hi!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHHHI!IHHI!HI!!H", charArray8);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("hHI!iHI!!", charArray8);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("HH", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HI!" + "'", str12, "HI!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HI!" + "'", str13, "HI!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HHHHHI!IHHI!HI!!H" + "'", str14, "HHHHHI!IHHI!HI!!H");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hHI!iHI!!" + "'", str15, "hHI!iHI!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HH" + "'", str16, "HH");
    }

    @Test
    public void test7572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7572");
        char[] charArray4 = new char[] {};
        java.lang.String str5 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray4);
        java.lang.String str6 = org.apache.commons.lang.WordUtils.initials("h", charArray4);
        java.lang.String str7 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray4);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.initials("HhHHHI!IHHI!!hhHHHI!IHHI!!hhHHHI!IHHI!!ihHHHI!IHHI!!!hHHHI!IHHI!!hhHHHI!IHHI!!hhHHHI!IHHI!!hhHHHI!IHHI!!ihHHHI!IHHI!!!hHHHI!IHHI!!ihHHHI!IHHI!!hhHHHI!IHHI!!hhHHHI!IHHI!!ihHHHI!IHHI!!!hHHHI!IHHI!!!", charArray4);
        java.lang.Class<?> wildcardClass9 = charArray4.getClass();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hI!" + "'", str7, "hI!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test7573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7573");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("HHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hHhI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HhHi!" + "'", str1, "hhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HhHi!");
    }

    @Test
    public void test7574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7574");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HHI!HHI!HHHHHHI!HHHI!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHHHHHHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHHI!IHHIHHHI!IHHHHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!iHHHI!hHHI!iHHIhhhhI!IhhI!HI!!h", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHI!HHI!HHHHHHI!HHHI!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHHHHHHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHHI!IHHIHHHI!IHHHHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!iHHHI!hHHI!iHHIhhhhI!IhhI!HI!!h" + "'", str2, "HHI!HHI!HHHHHHI!HHHI!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHHHHHHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHHI!IHHIHHHI!IHHHHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!iHHHI!hHHI!iHHIhhhhI!IhhI!HI!!h");
    }

    @Test
    public void test7575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7575");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhhi!hhhiHHHHI!HHHIHHHi!iHHi!hi!!!IHHI!!", 0, (int) (byte) 0, "Hhhhhhhhhihhhhhi!ihhi!hi!!hhh!hhhhhhhhhhhhi!ihhi!hi!!hhhhhihh!hhhhhhhi!ihhi!hi!!hihhhhhhhhihhhhhi!ihhi!hi!!hhh!hh!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhhhhhhhihhhhhi!ihhi!hi!!hhh!hhhhhhhhhhhhi!ihhi!hi!!hhhhhihh!hhhhhhhi!ihhi!hi!!hihhhhhhhhihhhhhi!ihhi!hi!!hhh!hh!" + "'", str4, "Hhhhhhhhhihhhhhi!ihhi!hi!!hhh!hhhhhhhhhhhhi!ihhi!hi!!hhhhhihh!hhhhhhhi!ihhi!hi!!hihhhhhhhhihhhhhi!ihhi!hi!!hhh!hh!");
    }

    @Test
    public void test7576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7576");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hhHHHI!IHHI!HI!!ihHHHI!IHHI!HI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HhHHHI!IHHI!HI!!ihHHHI!IHHI!HI!!!" + "'", str1, "HhHHHI!IHHI!HI!!ihHHHI!IHHI!HI!!!");
    }

    @Test
    public void test7577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7577");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHhhi!hHhhi!hHhhi!iHhhi!!Hhhi!iHhhi!hHhhi!hHhhi!iHhhi!!Hhhi!hHhhi!hHhhi!hHhhi!iHhhi!!Hhhi!iHhhi!hHhhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!i!hHhhi!iHhhi!!Hhhi!!Hhhi!hHhhi!iHhhi!!Hhhi!!", (int) 'a', (int) (byte) 0, "hHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!HHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!hhhhhI!Ihhhhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHhhi!hHhhi!hHhhi!iHhhi!!Hhhi!iHhhi!hHhhi!hHhhi!iHhhi!!Hhhi!hHhhi!hHhhi!hHhhi!iHhhi!!Hhhi!iHhhi!hhHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!HHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!hhhhhI!Ihhhhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!" + "'", str4, "HHhhi!hHhhi!hHhhi!iHhhi!!Hhhi!iHhhi!hHhhi!hHhhi!iHhhi!!Hhhi!hHhhi!hHhhi!hHhhi!iHhhi!!Hhhi!iHhhi!hhHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!HHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!hhhhhI!Ihhhhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!");
    }

    @Test
    public void test7578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7578");
        char[] charArray11 = new char[] {};
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("", charArray11);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray11);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("H", charArray11);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("hH", charArray11);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("hhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!ihi!!hi!hhi!ihi!!hi!!", charArray11);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.uncapitalize("HHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!", charArray11);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhi!ihhihhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhihhhhi!ihhi!hi!!h", charArray11);
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!ihi!!hi!hhi!ihi!!hi!!" + "'", str20, "hhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!ihi!!hi!hhi!ihi!!hi!!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "HHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!" + "'", str21, "HHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Hhhhi!ihhihhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhihhhhi!ihhi!hi!!h" + "'", str22, "Hhhhi!ihhihhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhihhhhi!ihhi!hi!!h");
    }

    @Test
    public void test7579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7579");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HhhhI!IhhIhHHI!hHHI!iHHI!!!HI!!h", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HhhhI!IhhIhHHI!hHHI!iHHI!!!HI!!h" + "'", str2, "HhhhI!IhhIhHHI!hHHI!iHHI!!!HI!!h");
    }

    @Test
    public void test7580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7580");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("HhhhI!IhhI!hHhhhhhI!IhhI!hHhhhhhI!IhhI!hHhhhhhI!IhhI!hHhhhhhI!IhhI!hHhihhhI!IhhI!hHh!hhhI!IhhI!hHhHhhi!ihhi!hi!!HHhhi!ihhi!hi!!HHhhi!ihhi!hi!!IHhhi!ihhi!hi!!!Hhhi!ihhi!hi!!IHhhi!ihhi!hi!!HHhhi!ihhi!hi!!HHhhi!ihhi!hi!!IHhhi!ihhi!hi!!!Hhhi!ihhi!hi!!HHhhi!ihhi!hi!!HHhhi!ihhi!hi!!HHhhi!ihhi!hi!!HHhhi!ihhi!hi!!IHhhi!ihhi!hi!!!Hhhi!ihhi!hi!!IHhhi!ihhi!hi!!HHhhi!ihhi!hi!!HHhhi!ihhi!hi!!IHhhi!ihhi!hi!!!Hhhi!ihhi!hi!!HHhhi!ihhi!hi!!IHhhi!ihhi!hi!!!Hhhi!ihhi!hi!!!Hhhi!ihhi!hi!!H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!ihhi!hhhhhhhi!ihhi!hhhhhhhi!ihhi!hhhhhhhi!ihhi!hhhhhhhi!ihhi!hhhihhhi!ihhi!hhh!hhhi!ihhi!hhhhhhi!ihhi!hi!!hhhhi!ihhi!hi!!hhhhi!ihhi!hi!!ihhhi!ihhi!hi!!!hhhi!ihhi!hi!!ihhhi!ihhi!hi!!hhhhi!ihhi!hi!!hhhhi!ihhi!hi!!ihhhi!ihhi!hi!!!hhhi!ihhi!hi!!hhhhi!ihhi!hi!!hhhhi!ihhi!hi!!hhhhi!ihhi!hi!!hhhhi!ihhi!hi!!ihhhi!ihhi!hi!!!hhhi!ihhi!hi!!ihhhi!ihhi!hi!!hhhhi!ihhi!hi!!hhhhi!ihhi!hi!!ihhhi!ihhi!hi!!!hhhi!ihhi!hi!!hhhhi!ihhi!hi!!ihhhi!ihhi!hi!!!hhhi!ihhi!hi!!!hhhi!ihhi!hi!!h" + "'", str1, "Hhhhi!ihhi!hhhhhhhi!ihhi!hhhhhhhi!ihhi!hhhhhhhi!ihhi!hhhhhhhi!ihhi!hhhihhhi!ihhi!hhh!hhhi!ihhi!hhhhhhi!ihhi!hi!!hhhhi!ihhi!hi!!hhhhi!ihhi!hi!!ihhhi!ihhi!hi!!!hhhi!ihhi!hi!!ihhhi!ihhi!hi!!hhhhi!ihhi!hi!!hhhhi!ihhi!hi!!ihhhi!ihhi!hi!!!hhhi!ihhi!hi!!hhhhi!ihhi!hi!!hhhhi!ihhi!hi!!hhhhi!ihhi!hi!!hhhhi!ihhi!hi!!ihhhi!ihhi!hi!!!hhhi!ihhi!hi!!ihhhi!ihhi!hi!!hhhhi!ihhi!hi!!hhhhi!ihhi!hi!!ihhhi!ihhi!hi!!!hhhi!ihhi!hi!!hhhhi!ihhi!hi!!ihhhi!ihhi!hi!!!hhhi!ihhi!hi!!!hhhi!ihhi!hi!!h");
    }

    @Test
    public void test7581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7581");
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
        java.lang.String str22 = org.apache.commons.lang.WordUtils.initials("HhHHHI!IHHI!!hhHHHI!IHHI!!hhHHHI!IHhHHHI!HHHIhHHI!HHHI!IHHI!!HI!!ihHHHI!IHHI!!!hHHHI!IHHI!!hhHHHhHHHHHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!hHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!hhhi!Hhhi!hhHI!", charArray11);
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test7582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7582");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HHhhhi!hhhHhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HhhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!H!", (int) (byte) 10, "hHhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HhHHHHI!IHHHHHI!IHHI!HHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHhhhi!hhhHhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HhhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!H!" + "'", str4, "HHhhhi!hhhHhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HhhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!H!");
    }

    @Test
    public void test7583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7583");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!!", (int) (byte) 0, (int) '4', "hHHhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!hHhhhi!hhhi!ihhi!!hHhhhi!hhhi!ihhi!!iHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!hHhhhi!hhhi!ihhi!!iHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhihHHhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!hHhhhi!hhhi!ihhi!!hHhhhi!hhhi!ihhi!!iHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!hHhhhi!hhhi!ihhi!!iHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!!" + "'", str4, "hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhihHHhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!hHhhhi!hhhi!ihhi!!hHhhhi!hhhi!ihhi!!iHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!hHhhhi!hhhi!ihhi!!iHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!!");
    }

    @Test
    public void test7584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7584");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HHI!HHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!HHI!IHI!!HI!!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHI!HHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!HHI!IHI!!HI!!" + "'", str2, "HHI!HHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!HHI!IHI!!HI!!");
    }

    @Test
    public void test7585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7585");
        char[] charArray9 = new char[] {};
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("hi!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray9);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("HHhhi!ihhi!hi!!", charArray9);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("HHHHI!HHHIHHHI!HHHI!IHHI!!", charArray9);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("hHHHHI!HHHHhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhhhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hi!" + "'", str13, "Hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hi!" + "'", str15, "Hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HHhhi!ihhi!hi!!" + "'", str16, "HHhhi!ihhi!hi!!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HHHHI!HHHIHHHI!HHHI!IHHI!!" + "'", str17, "HHHHI!HHHIHHHI!HHHI!IHHI!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hHHHHI!HHHHhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhhhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!" + "'", str18, "hHHHHI!HHHHhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhhhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!");
    }

    @Test
    public void test7586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7586");
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
        java.lang.String str25 = org.apache.commons.lang.WordUtils.capitalize("hHhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!!H", charArray14);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!hhhi!HhHHHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!HHI!IHI!!HI!!", charArray14);
        java.lang.String str27 = org.apache.commons.lang.WordUtils.uncapitalize("hHHHI!HHHIhhHHI!!IHHI!!", charArray14);
        java.lang.String str28 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhhhi!ihhhhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!", charArray14);
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
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hHhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!!H" + "'", str25, "hHhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!!H");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Hhhi!hhhi!HhHHHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!HHI!IHI!!HI!!" + "'", str26, "Hhhi!hhhi!HhHHHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!HHI!IHI!!HI!!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hHHHI!HHHIhhHHI!!IHHI!!" + "'", str27, "hHHHI!HHHIhhHHI!!IHHI!!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhhhi!ihhhhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!" + "'", str28, "hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhhhi!ihhhhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!");
    }

    @Test
    public void test7587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7587");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!ihhhhi!hhhi!hhhi!!hhhhi!hhhi!hhhi!ihhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!ihhhhi!hhhi!hhhi!!hhhhi!hhhi!hhhi!!hhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!ihhhhi!hhhi!hhhi!!hhhhi!hhhi!hhhi!ihhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!ihhhhi!hhhi!hhhi!!hhhhi!hhhi!hhhi!!hhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!ihhhhi!hhhi!hhhi!!hhhhi!hhhi!hhhi!ihhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!ihhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!ihhhhi!hhhi!hhhi!!hhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!ihhhhi!hhhi!hhhi!!hhhhi!hhhi!hhhi!ihhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!ihhhhi!hhhi!hhhi!!hhhhi!hhhi!hhhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!ihhhhi!hhhi!hhhi!!hhhhi!hhhi!hhhi!ihhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!ihhhhi!hhhi!hhhi!!hhhhi!hhhi!hhhi!!hhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!ihhhhi!hhhi!hhhi!!hhhhi!hhhi!hhhi!ihhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!ihhhhi!hhhi!hhhi!!hhhhi!hhhi!hhhi!!hhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!ihhhhi!hhhi!hhhi!!hhhhi!hhhi!hhhi!ihhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!ihhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!ihhhhi!hhhi!hhhi!!hhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!ihhhhi!hhhi!hhhi!!hhhhi!hhhi!hhhi!ihhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!ihhhhi!hhhi!hhhi!!hhhhi!hhhi!hhhi!!" + "'", str1, "hhhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!ihhhhi!hhhi!hhhi!!hhhhi!hhhi!hhhi!ihhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!ihhhhi!hhhi!hhhi!!hhhhi!hhhi!hhhi!!hhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!ihhhhi!hhhi!hhhi!!hhhhi!hhhi!hhhi!ihhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!ihhhhi!hhhi!hhhi!!hhhhi!hhhi!hhhi!!hhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!ihhhhi!hhhi!hhhi!!hhhhi!hhhi!hhhi!ihhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!ihhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!ihhhhi!hhhi!hhhi!!hhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!ihhhhi!hhhi!hhhi!!hhhhi!hhhi!hhhi!ihhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!ihhhhi!hhhi!hhhi!!hhhhi!hhhi!hhhi!!");
    }

    @Test
    public void test7588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7588");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hHHHi!iHHihhHHHI!IHHI!!hhHHHI!IHHI!!hhHHHI!IHhHHHI!HHHIhHHI!HHHI!IHHI!!HI!!ihHHHI!IHHI!!!hHHHI!IHHI!!hhHHHhHHHI!HHHIhHHI!HHHI!IHHI!!I!IHHI!!hhHHHI!IHHI!!hhHHHI!IHHI!!ihHHHI!HHHIhHHI!HHHI!IHHI!!hHHHI!IHHI!!!hHHHI!IHHI!!ihHHHI!IHHhHHHI!HHHIhHHI!HHHI!IHHI!!I!!hhHHHI!IHHI!!hhHHHI!IHHI!!ihHHHIhHHHI!HHHIhHHI!HHHI!IHHI!!!IHHI!!!hHHHI!IHHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHHi!iHHihhHHHI!IHHI!!hhHHHI!IHHI!!hhHHHI!IHhHHHI!HHHIhHHI!HHHI!IHHI!!HI!!ihHHHI!IHHI!!!hHHHI!IHHI!!hhHHHhHHHI!HHHIhHHI!HHHI!IHHI!!I!IHHI!!hhHHHI!IHHI!!hhHHHI!IHHI!!ihHHHI!HHHIhHHI!HHHI!IHHI!!hHHHI!IHHI!!!hHHHI!IHHI!!ihHHHI!IHHhHHHI!HHHIhHHI!HHHI!IHHI!!I!!hhHHHI!IHHI!!hhHHHI!IHHI!!ihHHHIhHHHI!HHHIhHHI!HHHI!IHHI!!!IHHI!!!hHHHI!IHHI!!!" + "'", str1, "hHHHi!iHHihhHHHI!IHHI!!hhHHHI!IHHI!!hhHHHI!IHhHHHI!HHHIhHHI!HHHI!IHHI!!HI!!ihHHHI!IHHI!!!hHHHI!IHHI!!hhHHHhHHHI!HHHIhHHI!HHHI!IHHI!!I!IHHI!!hhHHHI!IHHI!!hhHHHI!IHHI!!ihHHHI!HHHIhHHI!HHHI!IHHI!!hHHHI!IHHI!!!hHHHI!IHHI!!ihHHHI!IHHhHHHI!HHHIhHHI!HHHI!IHHI!!I!!hhHHHI!IHHI!!hhHHHI!IHHI!!ihHHHIhHHHI!HHHIhHHI!HHHI!IHHI!!!IHHI!!!hHHHI!IHHI!!!");
    }

    @Test
    public void test7589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7589");
        char[] charArray16 = new char[] {};
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray16);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("", charArray16);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray16);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray16);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalize("", charArray16);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray16);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalize("H", charArray16);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray16);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.uncapitalize("hhI!", charArray16);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray16);
        java.lang.String str27 = org.apache.commons.lang.WordUtils.uncapitalize("hHhhI!IhhI!hhhi!ihhi!!HI!!", charArray16);
        java.lang.String str28 = org.apache.commons.lang.WordUtils.capitalize("", charArray16);
        java.lang.String str29 = org.apache.commons.lang.WordUtils.capitalizeFully("HhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!", charArray16);
        java.lang.String str30 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhi!hhhihhhhi!hhhihhhi!ihhi!hi!!!ihhi!!", charArray16);
        java.lang.String str31 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!ihhi!hhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!", charArray16);
        java.lang.String str32 = org.apache.commons.lang.WordUtils.capitalize("HHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!HHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!HhHHHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!hHIHI!!HI!HHI!IHI!!HI!!", charArray16);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] {});
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hi!" + "'", str20, "Hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "h" + "'", str22, "h");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "H" + "'", str23, "H");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Hi!" + "'", str24, "Hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hhI!" + "'", str25, "hhI!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hHhhI!IhhI!hhhi!ihhi!!HI!!" + "'", str27, "hHhhI!IhhI!hhhi!ihhi!!HI!!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "HhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!" + "'", str29, "HhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Hhhhi!hhhihhhhi!hhhihhhi!ihhi!hi!!!ihhi!!" + "'", str30, "Hhhhi!hhhihhhhi!hhhihhhi!ihhi!hi!!!ihhi!!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Hhhi!ihhi!hhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!" + "'", str31, "Hhhi!ihhi!hhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "HHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!HHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!HhHHHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!hHIHI!!HI!HHI!IHI!!HI!!" + "'", str32, "HHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!HHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!HhHHHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!hHIHI!!HI!HHI!IHI!!HI!!");
    }

    @Test
    public void test7590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7590");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("", 1, (int) (short) 1, "hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test7591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7591");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhhi!ihhi!hhhhhi!hhhhhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhi!ihi!!hhhhhhi!hhhhhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!i!!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhi!ihhi!hhhhhi!hhhhhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhi!ihi!!hhhhhhi!hhhhhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!i!!" + "'", str2, "Hhhi!ihhi!hhhhhi!hhhhhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhi!ihi!!hhhhhhi!hhhhhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!i!!");
    }

    @Test
    public void test7592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7592");
        char[] charArray7 = new char[] {};
        java.lang.String str8 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("hi!", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray7);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("hHHi!iHHi!HHHI!IHHI!!hi!!", charArray7);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("HHHI!IHHI!HHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHHHhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HI!" + "'", str11, "HI!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HI!" + "'", str12, "HI!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hHHi!iHHi!HHHI!IHHI!!hi!!" + "'", str13, "hHHi!iHHi!HHHI!IHHI!!hi!!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test7593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7593");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("Hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhhhi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test7594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7594");
        char[] charArray8 = new char[] {};
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHi!iHHi!hi!!", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!", charArray8);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("hhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!hhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!HhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!HhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!HhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!IhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!!hHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!IhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!HhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!HhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!IhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!!hHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!HhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!IhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!!hHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!!hHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!H", charArray8);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("HHHHHI!IHHHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HHHi!iHHi!hi!!" + "'", str13, "HHHi!iHHi!hi!!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hhhi!" + "'", str14, "Hhhi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test7595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7595");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("Hhhi!ihhi!HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test7596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7596");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("", (int) (short) 1, "HHhhi!ihhi!hi!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test7597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7597");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hHhhi!ihhi!hhhi!ihhi!!hi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!ihhi!hhhi!ihhi!!hi!!" + "'", str1, "Hhhhi!ihhi!hhhi!ihhi!!hi!!");
    }

    @Test
    public void test7598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7598");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("Hhi!hhi!hhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhhhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhhi!hhhi!hhi!hhhi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test7599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7599");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!iHHHI!hHHI!iHHIhhhhI!IhhI!HI!!h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!iHHHI!hHHI!iHHIhhhhI!IhhI!HI!!h" + "'", str1, "HHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!iHHHI!hHHI!iHHIhhhhI!IhhI!HI!!h");
    }

    @Test
    public void test7600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7600");
        char[] charArray8 = new char[] { '#', ' ', '4' };
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("hHHHI!HHHIHHHHI!!IHHI!!", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("Hhhhi!hhhiHHhhi!!ihhi!!", charArray8);
        java.lang.Class<?> wildcardClass14 = charArray8.getClass();
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '#', ' ', '4' });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Hi!" + "'", str9, "Hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "h" + "'", str12, "h");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hhhhi!hhhiHHhhi!!ihhi!!" + "'", str13, "Hhhhi!hhhiHHhhi!!ihhi!!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test7601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7601");
        char[] charArray10 = new char[] {};
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("Hh", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("HHHI!hHHI!HHhi!", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("hhhi!hhhi!hHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HhHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!IHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!!HHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!", charArray10);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray10);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.initials("hHHHI!IHHIHHHi!iHHi!hHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!", charArray10);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.initials("hhHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hi!" + "'", str13, "Hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hh" + "'", str15, "Hh");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test7602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7602");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!hhhhi!Hhhi!Ihhi!!hhhhi!Hhhi!Ihhi!!hhhhi!Hhhi!Ihhi!!ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!ihhhi!Hhhi!Ihhi!!hhhhi!Hhhi!Ihhi!!hhhhi!Hhhi!Ihhi!!ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!hhhhi!Hhhi!Ihhi!!ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!hhhhi!Hhhi!Ihhi!!hhhhi!Hhhi!Ihhi!!hhhhi!Hhhi!Ihhi!!ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!ihhhi!Hhhi!Ihhi!!hhhhi!Hhhi!Ihhi!!hhhhi!Hhhi!Ihhi!!ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!hhhhi!Hhhi!Ihhi!!ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!h" + "'", str1, "hhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!hhhhi!Hhhi!Ihhi!!hhhhi!Hhhi!Ihhi!!hhhhi!Hhhi!Ihhi!!ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!ihhhi!Hhhi!Ihhi!!hhhhi!Hhhi!Ihhi!!hhhhi!Hhhi!Ihhi!!ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!hhhhi!Hhhi!Ihhi!!ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!h");
    }

    @Test
    public void test7603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7603");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!iHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!!HHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!iHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!!HHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!iHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!iHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!!HHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!!", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!" + "'", str2, "Hhhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!");
    }

    @Test
    public void test7604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7604");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhi!ihhi!hhhi!ihhi!!hi!!hhhhi!ihhi!hhhi!ihhi!!hi!!hhhhi!ihhi!hhhi!ihhi!!hi!!hhhhi!ihhi!hhhi!ihhHhhhi!ihhihhhhhi!ihhhhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!i!!hi!!ihhhi!ihhi!hhhi!ihhi!!hi!!!hhhi!ihhi!hhhi!ihhi!!hi!!hhhhi!ihhi!hhhi!ihhi!!hi!!hhhhi!ihhi!hHhhhi!ihhihhhhhi!ihhhhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhi!ihhi!!hi!!hhhhi!ihhi!hhhi!ihhi!!hi!!ihhhi!ihhi!hhhi!ihhi!!hi!!!hhhi!ihhi!hhhi!ihhi!!hi!!hhhhiHhhhi!ihhihhhhhi!ihhhhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!ihhi!hhhi!ihhi!!hi!!hhhhi!ihhi!hhhi!ihhi!!hi!!hhhhi!ihhi!hhhi!ihhi!!hi!!ihhhi!ihhi!hhhi!ihhi!!hiHhhhi!ihhihhhhhi!ihhhhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!ihhi!hhhi!ihhi!!hi!!hhhhi!ihhi!hhhi!ihhi!!hi!!hhhhi!ihhi!hhhi!ihhi!!hi!!hhhhi!ihhi!hhhi!ihhhhhhi!ihhihhhhhi!ihhhhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!i!!hi!!ihhhi!ihhi!hhhi!ihhi!!hi!!!hhhi!ihhi!hhhi!ihhi!!hi!!hhhhi!ihhi!hhhi!ihhi!!hi!!hhhhi!ihhi!hhhhhi!ihhihhhhhi!ihhhhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhi!ihhi!!hi!!hhhhi!ihhi!hhhi!ihhi!!hi!!ihhhi!ihhi!hhhi!ihhi!!hi!!!hhhi!ihhi!hhhi!ihhi!!hi!!hhhhihhhhi!ihhihhhhhi!ihhhhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!ihhi!hhhi!ihhi!!hi!!hhhhi!ihhi!hhhi!ihhi!!hi!!hhhhi!ihhi!hhhi!ihhi!!hi!!ihhhi!ihhi!hhhi!ihhi!!hihhhhi!ihhihhhhhi!ihhhhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!!!" + "'", str1, "Hhhhi!ihhi!hhhi!ihhi!!hi!!hhhhi!ihhi!hhhi!ihhi!!hi!!hhhhi!ihhi!hhhi!ihhi!!hi!!hhhhi!ihhi!hhhi!ihhhhhhi!ihhihhhhhi!ihhhhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!i!!hi!!ihhhi!ihhi!hhhi!ihhi!!hi!!!hhhi!ihhi!hhhi!ihhi!!hi!!hhhhi!ihhi!hhhi!ihhi!!hi!!hhhhi!ihhi!hhhhhi!ihhihhhhhi!ihhhhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhi!ihhi!!hi!!hhhhi!ihhi!hhhi!ihhi!!hi!!ihhhi!ihhi!hhhi!ihhi!!hi!!!hhhi!ihhi!hhhi!ihhi!!hi!!hhhhihhhhi!ihhihhhhhi!ihhhhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!ihhi!hhhi!ihhi!!hi!!hhhhi!ihhi!hhhi!ihhi!!hi!!hhhhi!ihhi!hhhi!ihhi!!hi!!ihhhi!ihhi!hhhi!ihhi!!hihhhhi!ihhihhhhhi!ihhhhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!!!");
    }

    @Test
    public void test7605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7605");
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
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalize("Hhi!", charArray13);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalize("HH", charArray13);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.capitalizeFully("hHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!HHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!hhhhhI!Ihhhhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!", charArray13);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.uncapitalize("HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHHHHI!IHHI!HHI!IHI!!HI!!", charArray13);
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Hhi!" + "'", str23, "Hhi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "HH" + "'", str24, "HH");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!HHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!hhhhhI!Ihhhhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!" + "'", str25, "hHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!HHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!hhhhhI!Ihhhhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHHHHI!IHHI!HHI!IHI!!HI!!" + "'", str26, "HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHHHHI!IHHI!HHI!IHI!!HI!!");
    }

    @Test
    public void test7606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7606");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hHHHHI!IHHIHHHi!iHHi!hHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test7607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7607");
        char[] charArray4 = new char[] {};
        java.lang.String str5 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray4);
        java.lang.String str6 = org.apache.commons.lang.WordUtils.capitalize("hhHI!", charArray4);
        java.lang.String str7 = org.apache.commons.lang.WordUtils.capitalizeFully("HhH", charArray4);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalize("HHHI!HHHI!HHhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhiHhhi!ihhi!!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HI!" + "'", str5, "HI!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hhHI!" + "'", str6, "hhHI!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HhH" + "'", str7, "HhH");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HHHI!HHHI!HHhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhiHhhi!ihhi!!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!" + "'", str8, "HHHI!HHHI!HHhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhiHhhi!ihhi!!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
    }

    @Test
    public void test7608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7608");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hHhHHHI!HHHHHI!HHHI!hHhi!Ihi!!HHhHHHI!IHHIHhhi!hhhi!hhhi!Ihhi!!hhi!Ihhi!hhhi!hhhi!Ihhi!!hhi!Hhhi!Ihhi!!hhi!!", 10, "hHHhhhi!ihhi!hi!!hhHHhhhi!ihhi!hi!!hhHHhhhi!ihhi!hi!!hiHHhhhi!ihhi!hi!!h!HHhhhi!ihhi!hi!!hiHHhhhi!ihHhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHhHHHI!HHHHHI!HHHI!hHhi!Ihi!!HHhHHHI!IHHIHhhi!hhhi!hhhi!Ihhi!!hhi!Ihhi!hhhi!hhhi!Ihhi!!hhi!Hhhi!Ihhi!!hhi!!" + "'", str4, "hHhHHHI!HHHHHI!HHHI!hHhi!Ihi!!HHhHHHI!IHHIHhhi!hhhi!hhhi!Ihhi!!hhi!Ihhi!hhhi!hhhi!Ihhi!!hhi!Hhhi!Ihhi!!hhi!!");
    }

    @Test
    public void test7609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7609");
        char[] charArray11 = new char[] {};
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("H", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("hhI!", charArray11);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("hH", charArray11);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("hHHi!iHHi!!", charArray11);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray11);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.initials("hhhhi!ihhi!!", charArray11);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.initials("Hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!ihhhhi!hhhi!ihhi!!!hhhhi!hhhi!ihhi!!!", charArray11);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalize("hHhhi!ihhi!hi!!HHhhi!ihhi!hi!!HHhhi!ihhi!hi!!IHhhi!ihhi!hi!!!Hhhi!ihhi!hi!!IHhhi!ihhi!hi!!HHhhi!ihhih", charArray11);
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hHhhi!ihhi!hi!!HHhhi!ihhi!hi!!HHhhi!ihhi!hi!!IHhhi!ihhi!hi!!!Hhhi!ihhi!hi!!IHhhi!ihhi!hi!!HHhhi!ihhih" + "'", str22, "hHhhi!ihhi!hi!!HHhhi!ihhi!hi!!HHhhi!ihhi!hi!!IHhhi!ihhi!hi!!!Hhhi!ihhi!hi!!IHhhi!ihhi!hi!!HHhhi!ihhih");
    }

    @Test
    public void test7610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7610");
        char[] charArray8 = new char[] { ' ', 'a', 'a' };
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!Hhhi!Ihhi!!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("hHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("HHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhhhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihhhhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!!hh!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { ' ', 'a', 'a' });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H" + "'", str9, "H");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hhhi!Hhhi!Ihhi!!" + "'", str11, "Hhhi!Hhhi!Ihhi!!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "h" + "'", str12, "h");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhhhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihhhhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!!hh!" + "'", str13, "hHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhhhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihhhhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!!hh!");
    }

    @Test
    public void test7611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7611");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hhhI!IhhI!hHI!HHI!HHHHHHI!HHHI!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHHHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHHI!HHHI!HHI!HHHI!hHHHi!iHHihHI!HHI!HHHHHHI!HHHI!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHHHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHHI!HHHI!HHI!HHHI!!hi!!H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHi!iHHi!Hhi!hhi!hhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhhhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhhi!hhhi!hhi!hhhi!HhhhI!IhhIHhi!hhi!hhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhhhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhhi!hhhi!hhi!hhhi!!HI!!h" + "'", str1, "HHHi!iHHi!Hhi!hhi!hhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhhhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhhi!hhhi!hhi!hhhi!HhhhI!IhhIHhi!hhi!hhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhhhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhhi!hhhi!hhi!hhhi!!HI!!h");
    }

    @Test
    public void test7612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7612");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("HHi!hHi!hHHhH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhi!hhi!hhhhh" + "'", str1, "Hhi!hhi!hhhhh");
    }

    @Test
    public void test7613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7613");
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
        java.lang.String str21 = org.apache.commons.lang.WordUtils.initials("Hhhi!hhhi!hhhi!ihhi!!hhi!hhhi!hhhi!hhhi!ihhi!!hhi!hhhi!hhhi!hhhi!ihhi!!", charArray11);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalizeFully("hHhHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!!hHI!iHI!!ihHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!!hHI!iHI!!hhHI!iHI!!ihHI!iHI!!!hHI!iHI!!!", charArray11);
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hHhHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!!hHI!iHI!!ihHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!!hHI!iHI!!hhHI!iHI!!ihHI!iHI!!!hHI!iHI!!!" + "'", str22, "hHhHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!!hHI!iHI!!ihHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!!hHI!iHI!!hhHI!iHI!!ihHI!iHI!!!hHI!iHI!!!");
    }

    @Test
    public void test7614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7614");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("Hhhi!ihhi!HhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHHhhhhhhhhhhhhhhhihhh!hhhhhhhhhhhhhhhihhh!hhhihhhhhhhhhhhihhh!hhh!i!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!ihHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!!HHHi!iHHi!HhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHHhhhhhhhhhhhhhhhihhh!hhhhhhhhhhhhhhhihhh!hhhihhhhhhhhhhhihhh!hhh!i!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!ihHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!!hi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test7615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7615");
        char[] charArray13 = new char[] {};
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray13);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("", charArray13);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray13);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray13);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("", charArray13);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray13);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("H", charArray13);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray13);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.uncapitalize("hhI!", charArray13);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray13);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.uncapitalize("hHhhI!IhhI!hhhi!ihhi!!HI!!", charArray13);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!hhhi!ihhi!!", charArray13);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.initials("hHhhi!hHhhHhhhi!hhhiHHHHI!HHHIHHHi!iHHi!hi!!!IHHI!!", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] {});
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hi!" + "'", str17, "Hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "h" + "'", str19, "h");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H" + "'", str20, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Hi!" + "'", str21, "Hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hhI!" + "'", str22, "hhI!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hHhhI!IhhI!hhhi!ihhi!!HI!!" + "'", str24, "hHhhI!IhhI!hhhi!ihhi!!HI!!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Hhhi!hhhi!ihhi!!" + "'", str25, "Hhhi!hhhi!ihhi!!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test7616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7616");
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
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!", charArray10);
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!" + "'", str20, "Hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
    }

    @Test
    public void test7617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7617");
        char[] charArray5 = new char[] {};
        java.lang.String str6 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray5);
        java.lang.String str7 = org.apache.commons.lang.WordUtils.initials("", charArray5);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray5);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhI!IhhI!hhHHi!iHHi!HHHI!IHHI!!hi!!", charArray5);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("HHhHhHhHhHhHhHhHiHhH!HhHhHhHhHhHhHhHiHhH!HhHiHhHhHhHhHhHiHhH!HhH!", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hi!" + "'", str8, "Hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hhhI!IhhI!hhHHi!iHHi!HHHI!IHHI!!hi!!" + "'", str9, "hhhI!IhhI!hhHHi!iHHi!HHHI!IHHI!!hi!!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HHhHhHhHhHhHhHhHiHhH!HhHhHhHhHhHhHhHiHhH!HhHiHhHhHhHhHhHiHhH!HhH!" + "'", str10, "HHhHhHhHhHhHhHhHiHhH!HhHhHhHhHhHhHhHiHhH!HhHiHhHhHhHhHhHiHhH!HhH!");
    }

    @Test
    public void test7618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7618");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhIhHHI!hHHI!iHHI!!", (int) (byte) 10, (int) (short) 1, "HHHI!IHHI!hhhI!IhhI!HI!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhhhI!IhhHHHI!IHHI!hhhI!IhhI!HI!!" + "'", str4, "hhhhhI!IhhHHHI!IHHI!hhhI!IhhI!HI!!");
    }

    @Test
    public void test7619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7619");
        char[] charArray9 = new char[] {};
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("hi!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!", charArray9);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!ihhi!!", charArray9);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("hHHHI!HHHIhhHHI!!IHHI!!", charArray9);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hi!" + "'", str13, "Hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!" + "'", str15, "hhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hhhi!ihhi!!" + "'", str16, "Hhhi!ihhi!!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test7620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7620");
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
        java.lang.String str26 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!", charArray15);
        java.lang.String str27 = org.apache.commons.lang.WordUtils.capitalize("hHHHI!IHHI!HI!!H", charArray15);
        java.lang.String str28 = org.apache.commons.lang.WordUtils.capitalize("hhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!hhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!HhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!HhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!HhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!IhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!!hHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!IhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!HhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!HhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!IhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!!hHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!HhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!IhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!!hHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!!hHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!H", charArray15);
        java.lang.String str29 = org.apache.commons.lang.WordUtils.capitalizeFully("HhhhI!IhhI!HI!!h", charArray15);
        java.lang.String str30 = org.apache.commons.lang.WordUtils.capitalize("hhHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!!Hhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!!Hhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!!Hhi!Ihi!!!", charArray15);
        java.lang.Class<?> wildcardClass31 = charArray15.getClass();
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
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Hhhi!" + "'", str26, "Hhhi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hHHHI!IHHI!HI!!H" + "'", str27, "hHHHI!IHHI!HI!!H");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!hhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!HhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!HhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!HhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!IhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!!hHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!IhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!HhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!HhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!IhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!!hHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!HhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!IhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!!hHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!!hHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!H" + "'", str28, "hhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!hhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!HhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!HhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!HhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!IhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!!hHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!IhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!HhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!HhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!IhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!!hHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!HhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!IhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!!hHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!!hHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!H");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "HhhhI!IhhI!HI!!h" + "'", str29, "HhhhI!IhhI!HI!!h");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hhHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!!Hhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!!Hhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!!Hhi!Ihi!!!" + "'", str30, "hhHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!!Hhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!!Hhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!!Hhi!Ihi!!!");
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test7621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7621");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("HHhhi!ihhihhhhhI!Ihhhhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhHHI!IHHIHHHHHi!iHHHHHI!IHHI!HHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!" + "'", str1, "hhHHI!IHHIHHHHHi!iHHHHHI!IHHI!HHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!");
    }

    @Test
    public void test7622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7622");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HHhI!hHhI!hHhI!hHhI!hHhI!iHhI!!HhI!hHhI!hHhI!hHhI!hHhI!hHhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!hHhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!hHhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!hHhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!iHhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!!HhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!iHhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!hHhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!hHhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!iHhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!!HhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!hHhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!iHhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!!HhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!!", (int) 'a', "hi!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHhI!hHhI!hHhI!hHhI!hHhI!iHhI!!HhI!hHhI!hHhI!hHhI!hHhI!hHhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhi!hI!iHhI!!HhI!!HhI!hHhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!hHhI!hHhI!hHhI!hHhIhi!!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!hHhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!hi!HhI!iHhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!!HhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhhi!I!hHhI!hHhI!iHhI!!HhI!!HhI!iHhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!hHhI!hHhI!hi!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!hHhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhi!hI!!HhI!!HhI!iHhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!!HhI!hHhI!hHhI!hHhI!iHhIhi!!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!hHhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!ihi!HhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!!HhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhhi!I!hHhI!iHhI!!HhI!!HhI!!" + "'", str4, "HHhI!hHhI!hHhI!hHhI!hHhI!iHhI!!HhI!hHhI!hHhI!hHhI!hHhI!hHhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhi!hI!iHhI!!HhI!!HhI!hHhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!hHhI!hHhI!hHhI!hHhIhi!!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!hHhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!hi!HhI!iHhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!!HhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhhi!I!hHhI!hHhI!iHhI!!HhI!!HhI!iHhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!hHhI!hHhI!hi!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!hHhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhi!hI!!HhI!!HhI!iHhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!!HhI!hHhI!hHhI!hHhI!iHhIhi!!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!hHhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!ihi!HhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhI!hHhI!iHhI!!HhI!!HhI!!HhI!hHhI!hHhI!hHhI!iHhI!!HhI!iHhI!hHhhi!I!hHhI!iHhI!!HhI!!HhI!!");
    }

    @Test
    public void test7623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7623");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("Hhhi!ihhi!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihhhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!!hhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!!hhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHI!IHHI!HHHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHHHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!!HHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!!HHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!!" + "'", str1, "hHHI!IHHI!HHHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHHHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!!HHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!!HHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!!");
    }

    @Test
    public void test7624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7624");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!hHhhhi!ihhihhhI!IhhI!Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHHI!IHHIHHHi!iHHi!hHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!" + "'", str1, "HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHHI!IHHIHHHi!iHHi!hHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!");
    }

    @Test
    public void test7625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7625");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhhi!ihhhhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!!hhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!!hhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!!hhhi!ihhi!hhi!ihi!!hi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhhhi!ihhhhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!!hhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!!hhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!!hhhi!ihhi!hhi!ihi!!hi!!!" + "'", str1, "hhhhhi!ihhhhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!!hhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!!hhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!!hhhi!ihhi!hhi!ihi!!hi!!!");
    }

    @Test
    public void test7626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7626");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHhHHI!HHHI!HHHI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhHhhi!hhhi!hhhi!" + "'", str1, "Hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhHhhi!hhhi!hhhi!");
    }

    @Test
    public void test7627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7627");
        char[] charArray12 = new char[] { '#', '4', '4', '4' };
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray12);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray12);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("H", charArray12);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("hhhi!ihhi!!", charArray12);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("HHI!", charArray12);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("Hhi!", charArray12);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhhhi!hhhi!hhhi!", charArray12);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("HhhhhhhhhihHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HhHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!IHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!!HHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '#', '4', '4', '4' });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hi!" + "'", str13, "Hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hi!" + "'", str14, "Hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "h" + "'", str15, "h");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hhhi!ihhi!!" + "'", str16, "hhhi!ihhi!!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hHI!" + "'", str17, "hHI!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hhi!" + "'", str18, "hhi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhhhi!hhhi!hhhi!" + "'", str19, "Hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhhhi!hhhi!hhhi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hhhhhhhhhihhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!" + "'", str20, "Hhhhhhhhhihhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
    }

    @Test
    public void test7628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7628");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHhhHHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!HHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!HHHi!iHHi!HHHI!IHHI!!hi!!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHhhHHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!HHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!HHHi!iHHi!HHHI!IHHI!!hi!!" + "'", str2, "hHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHhhHHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!HHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!HHHi!iHHi!HHHI!IHHI!!hi!!");
    }

    @Test
    public void test7629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7629");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("", (-1), (int) (short) 1, "HHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test7630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7630");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHHHHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!HHHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!HHHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!HHHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!IHHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!!HHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!HHHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!HHHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!HHHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!IHHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!!HHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!IHHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!HHHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!HHHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!IHHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!!HHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHHHHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!HHHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!HHHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!HHHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!IHHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!!HHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!HHHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!HHHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!HHHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!IHHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!!HHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!IHHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!HHHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!HHHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!IHHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!!HHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!!" + "'", str1, "hHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHHHHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!HHHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!HHHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!HHHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!IHHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!!HHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!HHHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!HHHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!HHHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!IHHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!!HHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!IHHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!HHHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!HHHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!IHHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!!HHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!!");
    }

    @Test
    public void test7631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7631");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.uncapitalize("hhhhI!IhhI!hHhhhhhI!IhhI!hHhhhhhI!IhhI!hHhhhhhI!IhhI!hHhhhhhI!IhhI!hHhihhhI!IhhI!hHh!hhhI!IhhI!hHhhhhhI!IhhI!hHhhhhhI!IhhI!hHhhhhhI!IhhI!hHhhhhhI!IhhI!hHhHhhhI!IhhI!hHhHhhhI!IhhI!hHhIhhhI!IhhI!hHh!hhhI!IhhI!hHhHhhhI!IhhI!hHhHhhhI!IhhI!hHhHhhhI!IhhI!hHhIhhhI!IhhI!hHh!hhhI!IhhI!hHhIhhhI!IhhI!hHhHhhhI!IhhI!hHhHhhhI!IhhI!hHhIhhhI!IhhI!hHh!hhhI!IhhI!hHh!", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhhI!IhhI!hHhhhhhI!IhhI!hHhhhhhI!IhhI!hHhhhhhI!IhhI!hHhhhhhI!IhhI!hHhihhhI!IhhI!hHh!hhhI!IhhI!hHhhhhhI!IhhI!hHhhhhhI!IhhI!hHhhhhhI!IhhI!hHhhhhhI!IhhI!hHhHhhhI!IhhI!hHhHhhhI!IhhI!hHhIhhhI!IhhI!hHh!hhhI!IhhI!hHhHhhhI!IhhI!hHhHhhhI!IhhI!hHhHhhhI!IhhI!hHhIhhhI!IhhI!hHh!hhhI!IhhI!hHhIhhhI!IhhI!hHhHhhhI!IhhI!hHhHhhhI!IhhI!hHhIhhhI!IhhI!hHh!hhhI!IhhI!hHh!" + "'", str2, "hhhhI!IhhI!hHhhhhhI!IhhI!hHhhhhhI!IhhI!hHhhhhhI!IhhI!hHhhhhhI!IhhI!hHhihhhI!IhhI!hHh!hhhI!IhhI!hHhhhhhI!IhhI!hHhhhhhI!IhhI!hHhhhhhI!IhhI!hHhhhhhI!IhhI!hHhHhhhI!IhhI!hHhHhhhI!IhhI!hHhIhhhI!IhhI!hHh!hhhI!IhhI!hHhHhhhI!IhhI!hHhHhhhI!IhhI!hHhHhhhI!IhhI!hHhIhhhI!IhhI!hHh!hhhI!IhhI!hHhIhhhI!IhhI!hHhHhhhI!IhhI!hHhHhhhI!IhhI!hHhIhhhI!IhhI!hHh!hhhI!IhhI!hHh!");
    }

    @Test
    public void test7632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7632");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhhi!ihhi!hhhi!hhhi!hhi!hhhi!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhi!ihhi!hhhi!hhhi!hhi!hhhi!" + "'", str2, "hhhi!ihhi!hhhi!hhhi!hhi!hhhi!");
    }

    @Test
    public void test7633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7633");
        char[] charArray10 = new char[] {};
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("hi!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("HI!", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("hH", charArray10);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray10);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHI!IHHI!hhi!Ihi!!HI!!", charArray10);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhhi!hhhihHhhi!Hhhi!Ihhi!!hHhhihhhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hHhhI!IhhIHHHHI!HHHI!IHHI!!", charArray10);
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hHHI!IHHI!hhi!Ihi!!HI!!" + "'", str19, "hHHI!IHHI!hhi!Ihi!!HI!!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hhhhi!hhhihHhhi!Hhhi!Ihhi!!hHhhihhhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hHhhI!IhhIHHHHI!HHHI!IHHI!!" + "'", str20, "hhhhi!hhhihHhhi!Hhhi!Ihhi!!hHhhihhhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hHhhI!IhhIHHHHI!HHHI!IHHI!!");
    }

    @Test
    public void test7634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7634");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HhhhhhhhhiHhhhi!hhhihhhhi!hhhihhhi!ihhi!hi!!!ihhi!!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HhhhhhhhhiHhhhi!hhhihhhhi!hhhihhhi!ihhi!hi!!!ihhi!!" + "'", str2, "HhhhhhhhhiHhhhi!hhhihhhhi!hhhihhhi!ihhi!hi!!!ihhi!!");
    }

    @Test
    public void test7635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7635");
        char[] charArray5 = new char[] {};
        java.lang.String str6 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray5);
        java.lang.String str7 = org.apache.commons.lang.WordUtils.uncapitalize("HHi!", charArray5);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!", charArray5);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!hhhi!hhhi!Ihhi!!hhi!Ihhi!hhhi!hhhi!Ihhi!!hhi!Hhhi!Ihhi!!hhi!!", charArray5);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HI!" + "'", str6, "HI!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HHi!" + "'", str7, "HHi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!" + "'", str8, "Hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Hhhi!hhhi!hhhi!Ihhi!!hhi!Ihhi!hhhi!hhhi!Ihhi!!hhi!Hhhi!Ihhi!!hhi!!" + "'", str9, "Hhhi!hhhi!hhhi!Ihhi!!hhi!Ihhi!hhhi!hhhi!Ihhi!!hhi!Hhhi!Ihhi!!hhi!!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!" + "'", str10, "Hhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!");
    }

    @Test
    public void test7636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7636");
        char[] charArray9 = new char[] {};
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("hi!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("hHI!", charArray9);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("HHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!IHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!!", charArray9);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!", charArray9);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("hhhhi!ihhi!hi!!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hi!" + "'", str13, "Hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hi!" + "'", str14, "Hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hHI!" + "'", str15, "hHI!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!IHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!!" + "'", str16, "HHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!IHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test7637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7637");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("", (-1), "hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!ihHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test7638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7638");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!hHHHI!HHHIhHHI!HHHI!IHHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test7639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7639");
        char[] charArray6 = new char[] { 'a', '4', 'a' };
        java.lang.String str7 = org.apache.commons.lang.WordUtils.capitalize("", charArray6);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhI!IhhI!HI!!", charArray6);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { 'a', '4', 'a' });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hhhi!ihhi!hi!!" + "'", str8, "Hhhi!ihhi!hi!!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "h" + "'", str9, "h");
    }

    @Test
    public void test7640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7640");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hHHHI!hHHI!hHi!HHhi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test7641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7641");
        char[] charArray8 = new char[] { ' ' };
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("Hhi!", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("H", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("hHHHi!iHHi!hi!!", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("hHh", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("HHHHI!HHHIhhHHI!!IHHI!!", charArray8);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhi!hhhihhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!h", charArray8);
        java.lang.Class<?> wildcardClass16 = charArray8.getClass();
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { ' ' });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H" + "'", str9, "H");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hhi!" + "'", str10, "Hhi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "h" + "'", str11, "h");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "h" + "'", str12, "h");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hHh" + "'", str13, "hHh");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hHHHI!HHHIhhHHI!!IHHI!!" + "'", str14, "hHHHI!HHHIhhHHI!!IHHI!!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hhhhi!hhhihhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!h" + "'", str15, "Hhhhi!hhhihhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!h");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test7642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7642");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!H", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!H" + "'", str2, "hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!H");
    }

    @Test
    public void test7643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7643");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!Hhhhi!ihhihi!!hi!!", (int) '4', (int) '#', "hhhhi!ihhi!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHhhhhi!ihhi!!" + "'", str4, "hHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHhhhhi!ihhi!!");
    }

    @Test
    public void test7644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7644");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!" + "'", str1, "hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
    }

    @Test
    public void test7645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7645");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hhhhhhi!hhhHHhhI!IhhIHHHHI!HHHI!IHHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHHHHI!HHHhhHHi!iHHihhhhi!hhhi!ihhi!!" + "'", str1, "HHHHHHI!HHHhhHHi!iHHihhhhi!hhhi!ihhi!!");
    }

    @Test
    public void test7646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7646");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhi!ihhi!hhhhi!ihhi!hi!!hhhhhi!ihhi!hhhhi!ihhi!hi!!hhhhhi!ihhi!hhhhi!ihhi!hi!!hhhhhi!ihhi!hhhhi!ihhhhhi!ihhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!ihhi!hhhhi!ihhi!hi!!hhhhhi!ihhi!hhhhi!ihhi!hi!!hhhhhi!ihhi!hhhhi!ihhi!hi!!hhhhhi!ihhi!hhhhi!ihhhhhi!ihhi!!" + "'", str1, "Hhhhi!ihhi!hhhhi!ihhi!hi!!hhhhhi!ihhi!hhhhi!ihhi!hi!!hhhhhi!ihhi!hhhhi!ihhi!hi!!hhhhhi!ihhi!hhhhi!ihhhhhi!ihhi!!");
    }

    @Test
    public void test7647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7647");
        char[] charArray7 = new char[] { '#', ' ', '4' };
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("Hhhhi!ihhi!hi!!h", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("hHHHI!IHHIHHHi!iHHi!hHHHHHHHHIHHHhhhi!ihhihhhi!ihhi!hhhi!ihhi!hi!!", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("HHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!iHhhi!Hhhi!Ihhi!!!Hhhi!Hhhi!IhhihHHI!IHHI!hHh", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '#', ' ', '4' });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hi!" + "'", str8, "Hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H" + "'", str9, "H");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hHHHI!IHHIHHHi!iHHi!hHHHHHHHHIHHHhhhi!ihhihhhi!ihhi!hhhi!ihhi!hi!!" + "'", str10, "hHHHI!IHHIHHHi!iHHi!hHHHHHHHHIHHHhhhi!ihhihhhi!ihhi!hhhi!ihhi!hi!!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhihhhi!ihhi!hhh" + "'", str11, "Hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhihhhi!ihhi!hhh");
    }

    @Test
    public void test7648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7648");
        char[] charArray10 = new char[] { '#', '4', '4', '4' };
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("HHI!", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("HHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!IHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!ihhi!Hhhi!ihhi!HHI!iHI!!hi!!", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("HhHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!HhHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!HhHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!HhHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!IhHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!!hHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!HhHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!HhHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!HhHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!IhHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!!hHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!IhHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!HhHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!HhHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!IhHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!!hHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!!", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '#', '4', '4', '4' });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hi!" + "'", str11, "Hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H" + "'", str12, "H");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H" + "'", str13, "H");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hhhi!ihhi!Hhhi!ihhi!HHI!iHI!!hi!!" + "'", str14, "Hhhi!ihhi!Hhhi!ihhi!HHI!iHI!!hi!!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HhHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!HhHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!HhHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!HhHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!IhHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!!hHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!HhHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!HhHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!HhHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!IhHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!!hHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!IhHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!HhHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!HhHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!IhHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!!hHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!!" + "'", str15, "HhHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!HhHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!HhHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!HhHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!IhHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!!hHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!HhHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!HhHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!HhHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!IhHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!!hHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!IhHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!HhHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!HhHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!IhHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!!hHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test7649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7649");
        char[] charArray5 = new char[] {};
        java.lang.String str6 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray5);
        java.lang.String str7 = org.apache.commons.lang.WordUtils.initials("", charArray5);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray5);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("HHI!", charArray5);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("hHHHHHHHHHHHHHHHHIHHH!HHHHHHHHHHHHHHHIHHH!HHHIHHHHHHHHHHHIHHH!HHH!", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test7650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7650");
        char[] charArray11 = new char[] {};
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("hi!", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("", charArray11);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("HH", charArray11);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("HHHHI!HHHIHHHi!iHHi!hi!!!IHHI!!", charArray11);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("Hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!h", charArray11);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.initials("HhHhhi!ihhi!hi!!HHhhi!ihhi!hi!!HHhhi!ihhi!hi!!IHhhi!ihhi!hi!!!Hhhi!ihhi!hi!!IHhhi!ihhi!hi!!HHhhi!ihhiHHHI!hHHI!hHi!HHhi!!hi!!HHhhi!ihhi!hi!!IHhhi!ihhi!hi!!!Hhhi!ihhi!hi!!HHhhi!ihhi!hi!!HHhhi!ihhi!hi!!HHhhi!ihhi!hi!!HHhhiHHHI!hHHI!hHi!HHhi!!ihhi!hi!!IHhhi!ihhi!hi!!!Hhhi!ihhi!hi!!IHhhi!ihhi!hi!!HHhhi!ihhi!hi!!HHhhi!ihhi!hi!!IHhhi!ihhi!hi!!HHHI!hHHI!hHi!HHhi!!Hhhi!ihhi!hi!!HHhhi!ihhi!hi!!IHhhi!ihhi!hi!!!Hhhi!ihhi!hi!!!Hhhi!ihhi!hi!!H", charArray11);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.uncapitalize("hhHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!h", charArray11);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.uncapitalize("hhhhi!hhhihhi!", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] {});
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HI!" + "'", str15, "HI!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HH" + "'", str17, "HH");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!h" + "'", str19, "Hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!h");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hhHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!h" + "'", str21, "hhHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!h");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hhhhi!hhhihhi!" + "'", str22, "hhhhi!hhhihhi!");
    }

    @Test
    public void test7651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7651");
        char[] charArray9 = new char[] {};
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("hi!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray9);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("H", charArray9);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("hhHI!iHI!!HhHI!iHI!!HhHI!iHI!!IhHI!iHI!!!hHI!iHI!!IhHI!iHI!!HhHI!iHI!!HhHI!iHI!!IhHI!iHI!!!hHI!iHI!!HhHI!iHI!!HhHI!iHI!!IhHI!iHI!!!hHI!iHI!!IhHI!iHI!!HhHI!iHI!!IhHI!iHI!!!hHI!iHI!!!hHI!iHI!!HhHI!iHI!!IhHI!iHI!!!hHI!iHI!!!", charArray9);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("HHhhi!ihhi!hi!!HHhhi!ihhi!hi!!HHhhi!ihhi!hi!!IHhhi!ihhi!hi!!!Hhhi!ihhi!hi!!IHhhi!ihhi!hi!!HHhhi!ihhihHHHI!HHHIhHHI!HHHI!IHHI!!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hi!" + "'", str13, "Hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hi!" + "'", str15, "Hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hhHI!iHI!!HhHI!iHI!!HhHI!iHI!!IhHI!iHI!!!hHI!iHI!!IhHI!iHI!!HhHI!iHI!!HhHI!iHI!!IhHI!iHI!!!hHI!iHI!!HhHI!iHI!!HhHI!iHI!!IhHI!iHI!!!hHI!iHI!!IhHI!iHI!!HhHI!iHI!!IhHI!iHI!!!hHI!iHI!!!hHI!iHI!!HhHI!iHI!!IhHI!iHI!!!hHI!iHI!!!" + "'", str17, "hhHI!iHI!!HhHI!iHI!!HhHI!iHI!!IhHI!iHI!!!hHI!iHI!!IhHI!iHI!!HhHI!iHI!!HhHI!iHI!!IhHI!iHI!!!hHI!iHI!!HhHI!iHI!!HhHI!iHI!!IhHI!iHI!!!hHI!iHI!!IhHI!iHI!!HhHI!iHI!!IhHI!iHI!!!hHI!iHI!!!hHI!iHI!!HhHI!iHI!!IhHI!iHI!!!hHI!iHI!!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HHhhi!ihhi!hi!!HHhhi!ihhi!hi!!HHhhi!ihhi!hi!!IHhhi!ihhi!hi!!!Hhhi!ihhi!hi!!IHhhi!ihhi!hi!!HHhhi!ihhihHHHI!HHHIhHHI!HHHI!IHHI!!" + "'", str18, "HHhhi!ihhi!hi!!HHhhi!ihhi!hi!!HHhhi!ihhi!hi!!IHhhi!ihhi!hi!!!Hhhi!ihhi!hi!!IHhhi!ihhi!hi!!HHhhi!ihhihHHHI!HHHIhHHI!HHHI!IHHI!!");
    }

    @Test
    public void test7652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7652");
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
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhi!hhhihhhhi!hhhi!ihhi!!hhhhihhhhhi!hhhihhhi!hhhi!hhhi!ihhi!!hhhhi!ihhihhhhi!hhhi!ihhi!!", charArray11);
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Hhhhi!hhhihhhhi!hhhi!ihhi!!hhhhihhhhhi!hhhihhhi!hhhi!hhhi!ihhi!!hhhhi!ihhihhhhi!hhhi!ihhi!!" + "'", str22, "Hhhhi!hhhihhhhi!hhhi!ihhi!!hhhhihhhhhi!hhhihhhi!hhhi!hhhi!ihhi!!hhhhi!ihhihhhhi!hhhi!ihhi!!");
    }

    @Test
    public void test7653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7653");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("HHHI!IHHI!hhHHI!HHHI!Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhi!ihhi!HHhhi!hhhi!hHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HhHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!IHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!!HHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!" + "'", str1, "hhhi!ihhi!HHhhi!hhhi!hHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HhHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!IHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!!HHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!");
    }

    @Test
    public void test7654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7654");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!hHhhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!ihi!!hi!hhi!ihi!!hi!!HHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!hhhihhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!ihi!!hi!hhi!ihi!!hi!!!Hhhi!hhHI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!ihi!!hi!hhi!ihi!!hi!!hhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhihhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!ihi!!hi!hhi!ihi!!hi!!!hhhi!hhhi!" + "'", str1, "Hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!ihi!!hi!hhi!ihi!!hi!!hhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhihhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!ihi!!hi!hhi!ihi!!hi!!!hhhi!hhhi!");
    }

    @Test
    public void test7655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7655");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhhi!ihhihhhi!ihhhhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!IhhiHHHHi!iHHi!hi!!H", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhhi!ihhihhhi!ihhhhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!IhhiHHHHi!iHHi!hi!!H" + "'", str2, "hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhhi!ihhihhhi!ihhhhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!IhhiHHHHi!iHHi!hi!!H");
    }

    @Test
    public void test7656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7656");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("HHhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HhHHHHI!IHHHHHI!IHHI!HHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test7657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7657");
        char[] charArray6 = new char[] {};
        java.lang.String str7 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray6);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.uncapitalize("hI!", charArray6);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("h", charArray6);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("hHHHI!IHHIHHHI!hHHI!hHi!HHhi!", charArray6);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!!hhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!!hhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!!hhhi!ihhi!hhi!ihi!!hi!!!", charArray6);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("Hhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hihhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!h!hhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hihhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!h!hhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hihhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hihhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!h!hhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!h!", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hI!" + "'", str8, "hI!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hHHHI!IHHIHHHI!hHHI!hHi!HHhi!" + "'", str10, "hHHHI!IHHIHHHI!hHHI!hHi!HHhi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!!hhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!!hhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!!hhhi!ihhi!hhi!ihi!!hi!!!" + "'", str11, "Hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!!hhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!!hhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!!hhhi!ihhi!hhi!ihi!!hi!!!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hihhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!h!hhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hihhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!h!hhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hihhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hihhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!h!hhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!h!" + "'", str12, "Hhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hihhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!h!hhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hihhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!h!hhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hihhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hihhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!h!hhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!h!");
    }

    @Test
    public void test7658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7658");
        char[] charArray7 = new char[] {};
        java.lang.String str8 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray7);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!hhhi!hhi!hhhi!", charArray7);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("Hhi!hhi!hhhHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!iHHHI!hHHI!iHHIhhhhI!IhhI!HI!!h", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hi!" + "'", str11, "Hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hhhi!hhhi!hhi!hhhi!" + "'", str13, "Hhhi!hhhi!hhi!hhhi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test7659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7659");
        char[] charArray8 = new char[] {};
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("hi!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("hI!", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhi!ihhi!hi!!", charArray8);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("HHI!", charArray8);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!!hhhi!Hhhi!Ihhi!!H", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hI!" + "'", str13, "hI!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hhhhi!ihhi!hi!!" + "'", str14, "Hhhhi!ihhi!hi!!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HHI!" + "'", str15, "HHI!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test7660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7660");
        char[] charArray10 = new char[] {};
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("hi!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHHHI!IHHI!HI!!H", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("HH", charArray10);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihhhhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!!hh!", charArray10);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("HHHHI!IHHIhhhi!hhhi!ihhi!!", charArray10);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhhhhi!hhhi!hhi!hhhi!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HI!" + "'", str14, "HI!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HI!" + "'", str15, "HI!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HHHHHI!IHHI!HI!!H" + "'", str16, "HHHHHI!IHHI!HI!!H");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HH" + "'", str17, "HH");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihhhhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!!hh!" + "'", str18, "Hhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihhhhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!!hh!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "HHHHI!IHHIhhhi!hhhi!ihhi!!" + "'", str19, "HHHHI!IHHIhhhi!hhhi!ihhi!!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhhhhi!hhhi!hhi!hhhi!" + "'", str20, "Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhhhhi!hhhi!hhi!hhhi!");
    }

    @Test
    public void test7661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7661");
        char[] charArray6 = new char[] {};
        java.lang.String str7 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray6);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.initials("", charArray6);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray6);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray6);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("HHHi!iHHi!hi!!", charArray6);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhHhhi!ihhi!Hhhi!ihhi!HHI!iHI!!hi!!Hhh", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Hi!" + "'", str9, "Hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HHHi!iHHi!hi!!" + "'", str11, "HHHi!iHHi!hi!!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhHhhi!ihhi!Hhhi!ihhi!HHI!iHI!!hi!!Hhh" + "'", str12, "Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhHhhi!ihhi!Hhhi!ihhi!HHI!iHI!!hi!!Hhh");
    }

    @Test
    public void test7662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7662");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!" + "'", str2, "hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!");
    }

    @Test
    public void test7663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7663");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!" + "'", str1, "hhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!");
    }

    @Test
    public void test7664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7664");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("HHHHHi!iHHhHHHI!HHHIhHHI!HHHI!IHHI!!i!!HHHHi!ihHHHI!HHHIhHHI!HHHI!IHHI!!HHi!!hHHHihHHHI!HHHIhHHI!HHHHhhhh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhhhI!IhhHhhhi!hhhiHhhi!hhhi!ihhi!!I!!hhhhI!IHhhhi!hhhiHhhi!hhhi!ihhi!!hhI!!HhhhIHhhhi!hhhiHhhi!hhhhHHHH" + "'", str1, "hhhhhI!IhhHhhhi!hhhiHhhi!hhhi!ihhi!!I!!hhhhI!IHhhhi!hhhiHhhi!hhhi!ihhi!!hhI!!HhhhIHhhhi!hhhiHhhi!hhhhHHHH");
    }

    @Test
    public void test7665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7665");
        char[] charArray12 = new char[] {};
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray12);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("", charArray12);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("H", charArray12);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("", charArray12);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("", charArray12);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("hHI!", charArray12);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.uncapitalize("hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!", charArray12);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.initials("hHhhhi!ihhi!hi!!h", charArray12);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray12);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.uncapitalize("hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!h", charArray12);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhhhhhhhihhhhhi!ihhi!hi!!hhh!hhhhhhhhhhhhi!ihhi!hi!!hhhhhihh!hhhhhhhi!ihhi!hi!!hihhhhhhhhihhhhhi!ihhi!hi!!hhh!hh!", charArray12);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalizeFully("HhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] {});
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hHI!" + "'", str18, "hHI!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!" + "'", str19, "hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!h" + "'", str22, "hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!h");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hhhhhhhhhihhhhhi!ihhi!hi!!hhh!hhhhhhhhhhhhi!ihhi!hi!!hhhhhihh!hhhhhhhi!ihhi!hi!!hihhhhhhhhihhhhhi!ihhi!hi!!hhh!hh!" + "'", str23, "hhhhhhhhhihhhhhi!ihhi!hi!!hhh!hhhhhhhhhhhhi!ihhi!hi!!hhhhhihh!hhhhhhhi!ihhi!hi!!hihhhhhhhhihhhhhi!ihhi!hi!!hhh!hh!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "HhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!" + "'", str24, "HhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!");
    }

    @Test
    public void test7666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7666");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHI!HHHI!HHI!HHHI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!hhhi!hhi!hhhi!" + "'", str1, "Hhhi!hhhi!hhi!hhhi!");
    }

    @Test
    public void test7667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7667");
        char[] charArray13 = new char[] {};
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray13);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("", charArray13);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("hi!", charArray13);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray13);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("", charArray13);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("HI!", charArray13);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray13);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalize("Hhhhhi!ihhi!hi!!h", charArray13);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalizeFully("HhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!ihHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!!", charArray13);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.uncapitalize("HhHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!!Hhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!!Hhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!!Hhi!Ihi!!!", charArray13);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!Hhhi!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!!", charArray13);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.initials("Hhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi", charArray13);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhihhhhi!ihhi!hi!!", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] {});
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HI!" + "'", str17, "HI!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "HI!" + "'", str19, "HI!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Hhhhhi!ihhi!hi!!h" + "'", str21, "Hhhhhi!ihhi!hi!!h");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "HhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!ihHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!!" + "'", str22, "HhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!ihHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "HhHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!!Hhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!!Hhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!!Hhi!Ihi!!!" + "'", str23, "HhHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!!Hhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!!Hhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!!Hhi!Ihi!!!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Hhhi!Hhhi!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!!" + "'", str24, "Hhhi!Hhhi!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhihhhhi!ihhi!hi!!" + "'", str26, "Hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhihhhhi!ihhi!hi!!");
    }

    @Test
    public void test7668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7668");
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
        java.lang.String str23 = org.apache.commons.lang.WordUtils.initials("hhHHHI!HHHHhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!", charArray13);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalizeFully("HHhhI!IhhI!hHHHi!iHHi!hi!!HHHhhI!IhhI!hHHHi!iHHi!hi!!HHHhhI!IhhI!hHHHi!iHHi!hi!!HHHhhI!IhhI!hHHHi!iHHi!hi!!HiHhhI!IhhI!hHHHi!iHHi!hi!!H!HhhI!IhhI!hHHHi!iHHi!hi!!HiHhhI!IhhI!hHHHi!iHHi!hi!!HHHhhI!IhhI!hHHHi!iHHi!hi!!HHHhhI!IhhI!hHHHi!iHHi!hi!!HiHhhI!IhhI!hHHHi!iHHi!hi!!H!HhhI!IhhI!hHHHi!iHHi!hi!!HhHhhI!IhhI!hHHHi!iHHi!hi!!HiHhhI!IhhI!hHHHi!iHHi!hi!!H!HhhI!IhhI!hHHHi!iHHi!hi!!H!HhhI!IhhI!hHHHi!iHHi!hi!!HH", charArray13);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.capitalizeFully("HhHHHI!IHHI!!HhHHHI!IHHI!!HhHHHI!IHHI!!HhHHHI!IHHI!!Hhhhi!ihhihhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhihhhhi!ihhi!hi!!hIhHHHI!IHHI!!!hHHHI!IHHI!!IhHHHI!IHHI!!HhHHHI!IHHI!!Hhhhi!ihhihhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhihhhhi!ihhi!hi!!hHhHHHI!IHHI!!IhHHHI!IHHI!!!hHHHI!IHHI!!HhHHHI!IHHI!!Hhhhi!ihhihhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhihhhhi!ihhi!hi!!hIhHHHI!IHHI!!!hHHHI!IHHI!!!hHHHI!IHHI!!H", charArray13);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhi!hhhiHhhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhhhhi!hhhihhhi!hhhi!ihhi!!hi!!ihhhhi!ihhi!!!hhhhi!ihhi!!hhhhhhhhhi!hhhihhhi!hhhi!ihhi!!i!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!hhhhi!ihhi!!!hhhhi!ihhi!!ihhhhi!ihhhhhhi!hhhihhhi!hhhi!ihhi!!i!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhihhhhi!hhhihhhi!hhhi!ihhi!!!ihhi!!!hhhhi!ihhi!!!", charArray13);
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
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "HHhhI!IhhI!hHHHi!iHHi!hi!!HHHhhI!IhhI!hHHHi!iHHi!hi!!HHHhhI!IhhI!hHHHi!iHHi!hi!!HHHhhI!IhhI!hHHHi!iHHi!hi!!HiHhhI!IhhI!hHHHi!iHHi!hi!!H!HhhI!IhhI!hHHHi!iHHi!hi!!HiHhhI!IhhI!hHHHi!iHHi!hi!!HHHhhI!IhhI!hHHHi!iHHi!hi!!HHHhhI!IhhI!hHHHi!iHHi!hi!!HiHhhI!IhhI!hHHHi!iHHi!hi!!H!HhhI!IhhI!hHHHi!iHHi!hi!!HhHhhI!IhhI!hHHHi!iHHi!hi!!HiHhhI!IhhI!hHHHi!iHHi!hi!!H!HhhI!IhhI!hHHHi!iHHi!hi!!H!HhhI!IhhI!hHHHi!iHHi!hi!!HH" + "'", str24, "HHhhI!IhhI!hHHHi!iHHi!hi!!HHHhhI!IhhI!hHHHi!iHHi!hi!!HHHhhI!IhhI!hHHHi!iHHi!hi!!HHHhhI!IhhI!hHHHi!iHHi!hi!!HiHhhI!IhhI!hHHHi!iHHi!hi!!H!HhhI!IhhI!hHHHi!iHHi!hi!!HiHhhI!IhhI!hHHHi!iHHi!hi!!HHHhhI!IhhI!hHHHi!iHHi!hi!!HHHhhI!IhhI!hHHHi!iHHi!hi!!HiHhhI!IhhI!hHHHi!iHHi!hi!!H!HhhI!IhhI!hHHHi!iHHi!hi!!HhHhhI!IhhI!hHHHi!iHHi!hi!!HiHhhI!IhhI!hHHHi!iHHi!hi!!H!HhhI!IhhI!hHHHi!iHHi!hi!!H!HhhI!IhhI!hHHHi!iHHi!hi!!HH");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "HhHHHI!IHHI!!HhHHHI!IHHI!!HhHHHI!IHHI!!HhHHHI!IHHI!!Hhhhi!ihhihhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhihhhhi!ihhi!hi!!hIhHHHI!IHHI!!!hHHHI!IHHI!!IhHHHI!IHHI!!HhHHHI!IHHI!!Hhhhi!ihhihhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhihhhhi!ihhi!hi!!hHhHHHI!IHHI!!IhHHHI!IHHI!!!hHHHI!IHHI!!HhHHHI!IHHI!!Hhhhi!ihhihhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhihhhhi!ihhi!hi!!hIhHHHI!IHHI!!!hHHHI!IHHI!!!hHHHI!IHHI!!H" + "'", str25, "HhHHHI!IHHI!!HhHHHI!IHHI!!HhHHHI!IHHI!!HhHHHI!IHHI!!Hhhhi!ihhihhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhihhhhi!ihhi!hi!!hIhHHHI!IHHI!!!hHHHI!IHHI!!IhHHHI!IHHI!!HhHHHI!IHHI!!Hhhhi!ihhihhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhihhhhi!ihhi!hi!!hHhHHHI!IHHI!!IhHHHI!IHHI!!!hHHHI!IHHI!!HhHHHI!IHHI!!Hhhhi!ihhihhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhihhhhi!ihhi!hi!!hIhHHHI!IHHI!!!hHHHI!IHHI!!!hHHHI!IHHI!!H");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Hhhhi!hhhiHhhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhhhhi!hhhihhhi!hhhi!ihhi!!hi!!ihhhhi!ihhi!!!hhhhi!ihhi!!hhhhhhhhhi!hhhihhhi!hhhi!ihhi!!i!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!hhhhi!ihhi!!!hhhhi!ihhi!!ihhhhi!ihhhhhhi!hhhihhhi!hhhi!ihhi!!i!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhihhhhi!hhhihhhi!hhhi!ihhi!!!ihhi!!!hhhhi!ihhi!!!" + "'", str26, "Hhhhi!hhhiHhhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhhhhi!hhhihhhi!hhhi!ihhi!!hi!!ihhhhi!ihhi!!!hhhhi!ihhi!!hhhhhhhhhi!hhhihhhi!hhhi!ihhi!!i!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!hhhhi!ihhi!!!hhhhi!ihhi!!ihhhhi!ihhhhhhi!hhhihhhi!hhhi!ihhi!!i!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhihhhhi!hhhihhhi!hhhi!ihhi!!!ihhi!!!hhhhi!ihhi!!!");
    }

    @Test
    public void test7669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7669");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hHHHi!iHHihHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!iHHHI!hHHI!iHHIHhhhi!hhhihhhhi!!ihhi!!!!!HHHI!hHHI!iHHI!!iHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHhhhi!hhhihhhhi!!ihhi!!HI!!HHHHI!hHHI!iHHI!!HHHHI!hHHI!iHHI!!HHHHI!hHHI!iHHI!!IHHHI!hHHI!iHHI!!!HHHI!hHHI!iHHI!!IHHHI!hHHI!Hhhhi!hhhihhhhi!!ihhi!!iHHI!!HHHHI!hHHI!iHHI!!HHHHI!hHHI!iHHI!!IHHHI!hHHI!iHHI!!!HHHI!hHHI!iHHI!!HHHHI!hHHI!iHHI!!IHHHI!hHHHhhhi!hhhihhhhi!!ihhi!!I!iHHI!!!HHHI!hHHI!iHHI!!!HHHI!hHHI!iHHI!!H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test7670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7670");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hhhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!IhHI!iHI!!!hHI!iHI!!IhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!!hHI!iHI!!ihHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!!hHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!hhHI!iHI!!hhHI!iHI!!!hHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!hhHI!iHI!!hhHI!iHI!!!hHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!hhHI!iHI!!hhHI!iHI!!!hHI!iHI!!hhHI!iHI!!hhHI!iHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test7671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7671");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHHHHI!IHHHHhhhi!ihhi!hi!!h", (int) (short) 100, (int) '4', "hHh");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end 100, length 27");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7672");
        char[] charArray9 = new char[] {};
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("hi!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("", charArray9);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("hH", charArray9);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!IHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!!", charArray9);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hi!" + "'", str13, "Hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hH" + "'", str16, "hH");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!IHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!!" + "'", str17, "hHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!IHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test7673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7673");
        char[] charArray9 = new char[] {};
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("hh", charArray9);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("hHI!", charArray9);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("hHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HIHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!H!HHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HIHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!H!HHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HIHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HIHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!H!HHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!H!", charArray9);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("HHHHHI!IHHI!!HHHHHI!IHHI!!HHHHHIHHHHI!HHHIhHHI!HHHI!HHHI!IHHI!!HHI!IHHI!HHHI!HHHI!IHHI!!HHI!HHHI!IHHI!!HHI!!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hh" + "'", str15, "hh");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hHI!" + "'", str16, "hHI!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HIHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!H!HHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HIHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!H!HHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HIHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HIHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!H!HHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!H!" + "'", str17, "hHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HIHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!H!HHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HIHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!H!HHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HIHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HIHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!H!HHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!HHHHHHI!IHHI!HI!!H!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HHHHHI!IHHI!!HHHHHI!IHHI!!HHHHHIHHHHI!HHHIhHHI!HHHI!HHHI!IHHI!!HHI!IHHI!HHHI!HHHI!IHHI!!HHI!HHHI!IHHI!!HHI!!" + "'", str18, "HHHHHI!IHHI!!HHHHHI!IHHI!!HHHHHIHHHHI!HHHIhHHI!HHHI!HHHI!IHHI!!HHI!IHHI!HHHI!HHHI!IHHI!!HHI!HHHI!IHHI!!HHI!!");
    }

    @Test
    public void test7674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7674");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("Hhhhi!ihhi!hhhhhhhi!ihhi!hhhhhhhi!ihhi!hhhhhhhi!ihhi!hhhhhhhi!ihhi!hhhihhhi!ihhi!hhh!hhhi!ihhi!hhhhhhhi!ihhi!hhhhhhhi!ihhi!hhhhhhhi!ihhi!hhhhhhhi!ihhi!hhhhhhhi!ihhi!hhhhhhhi!ihhi!hhhihhhi!ihhi!hhh!hhhi!ihhi!hhhhhhhi!ihhi!hhhhhhhi!ihhi!hhhhhhhi!ihhi!hhhihhhi!ihhi!hhh!hhhi!ihhi!hhhihhhi!ihhi!hhhhhhhi!ihhi!hhhhhhhi!ihhi!hhhihhhi!ihhi!hhh!hhhi!ihhi!hhh!", (int) '4', "HHHI!HHHI!HHHI!iHHI!!HHI!iHHI!HHHI!HHHI!iHHI!!HHI!hHHhhhi!ihhihhhi!hhhi!ihhi!!!hi!!h", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhhi!ihhi!hhhhhhhi!ihhi!hhhhhhhi!ihhi!hhhhhhhi!ihhi!hhhhhhhi!ihhi!hhhihhhi!ihhi!hhh!hhhi!ihhi!hhhhhhhi!ihhi!hhhhhhhi!ihhi!hhhhhhhi!ihhi!hhhhhhhi!ihhi!hhhhhhhi!ihhi!hhhhhhhi!ihhi!hhhihhhi!ihhi!hhh!hhhi!ihhi!hhhhhhhi!ihhi!hhhhhhhi!ihhi!hhhhhhhi!ihhi!hhhihhhi!ihhi!hhh!hhhi!ihhi!hhhihhhi!ihhi!hhhhhhhi!ihhi!hhhhhhhi!ihhi!hhhihhhi!ihhi!hhh!hhhi!ihhi!hhh!" + "'", str4, "Hhhhi!ihhi!hhhhhhhi!ihhi!hhhhhhhi!ihhi!hhhhhhhi!ihhi!hhhhhhhi!ihhi!hhhihhhi!ihhi!hhh!hhhi!ihhi!hhhhhhhi!ihhi!hhhhhhhi!ihhi!hhhhhhhi!ihhi!hhhhhhhi!ihhi!hhhhhhhi!ihhi!hhhhhhhi!ihhi!hhhihhhi!ihhi!hhh!hhhi!ihhi!hhhhhhhi!ihhi!hhhhhhhi!ihhi!hhhhhhhi!ihhi!hhhihhhi!ihhi!hhh!hhhi!ihhi!hhhihhhi!ihhi!hhhhhhhi!ihhi!hhhhhhhi!ihhi!hhhihhhi!ihhi!hhh!hhhi!ihhi!hhh!");
    }

    @Test
    public void test7675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7675");
        char[] charArray12 = new char[] {};
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray12);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("", charArray12);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("hi!", charArray12);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray12);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("", charArray12);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("HI!", charArray12);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.uncapitalize("hH", charArray12);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray12);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHI!IHHI!hhi!Ihi!!HI!!", charArray12);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.uncapitalize("hhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!", charArray12);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.initials("hHhhI!IhhI!!HHhhI!IhhI!!HHhhI!IhhI!!HHhhI!IhhI!!IHhhI!IhhI!!!HhhI!IhhI!!HHhhI!IhhI!!HHhhI!IhhI!!HHhhhHHHHHHHHHHHHHHHIHHH!HHHHHHHHHHHHHHHIHHH!HHHIHHHHHHHHHHHIHHH!HHH!I!IhhI!!IHhhI!IhhI!!!HhhI!IhhI!!IHhhI!IhhI!!HHhhI!IhhI!!HHhhI!IhhI!!IHhhI!IhhI!!!HhhI!IhhI!!!", charArray12);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.initials("hHhhhi!ihhi!!HHhhhi!ihhi!!HHhhhi!ihHhhhi!hhhiHhhi!hhhi!ihhi!!hi!!IHhhhi!ihhi!!!Hhhhi!ihhi!!HHhhhHhhhHhhhi!hhhihhhhi!!ihhi!!", charArray12);
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hHHI!IHHI!hhi!Ihi!!HI!!" + "'", str21, "hHHI!IHHI!hhi!Ihi!!HI!!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!" + "'", str22, "hhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test7676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7676");
        char[] charArray9 = new char[] {};
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("h", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("Hhi!", charArray9);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("hhhi!Hhhi!Ihhi!!", charArray9);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("Hhhhhhhhhhhhhhhhihhh!hhhhhhhhhhhhhhhihhh!hhhihhhhhhhhhhhihhh!hhh!", charArray9);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("hHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!H", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hi!" + "'", str12, "Hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "h" + "'", str14, "h");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hhhi!Hhhi!Ihhi!!" + "'", str16, "hhhi!Hhhi!Ihhi!!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hhhhhhhhhhhhhhhhihhh!hhhhhhhhhhhhhhhihhh!hhhihhhhhhhhhhhihhh!hhh!" + "'", str17, "Hhhhhhhhhhhhhhhhihhh!hhhhhhhhhhhhhhhihhh!hhhihhhhhhhhhhhihhh!hhh!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test7677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7677");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!HHI!IHI!!HI!!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!HHI!IHI!!HI!!" + "'", str2, "HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!HHI!IHI!!HI!!");
    }

    @Test
    public void test7678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7678");
        char[] charArray10 = new char[] {};
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("HH", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray10);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHHHI!HHHI!IHHI!!", charArray10);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray10);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.initials("hHHHHI!HHHHHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HH" + "'", str16, "HH");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HHHHHI!HHHI!IHHI!!" + "'", str18, "HHHHHI!HHHI!IHHI!!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test7679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7679");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhi!hhhi!hhi!hhhi!", (int) '4', 1, "HHHi!iHHi!hHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end 52, length 19");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7680");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("Hhhhhi!hhhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhhi!hhhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!" + "'", str1, "Hhhhhi!hhhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
    }

    @Test
    public void test7681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7681");
        char[] charArray10 = new char[] {};
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("hH", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("HI!", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("HhHHHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!HHI!IHI!!HI!!", charArray10);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("hhhI!IhhI!HI!!", charArray10);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.uncapitalize("hhhi!ihhi!hhh", charArray10);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhi!hhhi!hhhhhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!ihi!!hi!hhi!ihi!!hi!!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hH" + "'", str15, "hH");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HI!" + "'", str16, "HI!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HhHHHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!HHI!IHI!!HI!!" + "'", str17, "HhHHHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!HHI!IHI!!HI!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hhhi!ihhi!hhh" + "'", str19, "hhhi!ihhi!hhh");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hhhi!hhhi!hhhhhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!ihi!!hi!hhi!ihi!!hi!!" + "'", str20, "hhhi!hhhi!hhhhhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!ihi!!hi!hhi!ihi!!hi!!");
    }

    @Test
    public void test7682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7682");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHhhhi!ihhiHHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!iHhhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hhhhhhhi!ihhHHHi!iHHi!hi!!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHhhhi!ihhiHHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!iHhhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hhhhhhhi!ihhHHHi!iHHi!hi!!" + "'", str2, "hHhhhi!ihhiHHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!iHhhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hhhhhhhi!ihhHHHi!iHHi!hi!!");
    }

    @Test
    public void test7683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7683");
        char[] charArray9 = new char[] {};
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("hi!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("HI!", charArray9);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray9);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("hHH", charArray9);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhhh", charArray9);
        java.lang.Class<?> wildcardClass19 = charArray9.getClass();
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HI!" + "'", str13, "HI!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HI!" + "'", str15, "HI!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hHH" + "'", str17, "hHH");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhhh" + "'", str18, "Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhhh");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test7684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7684");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("HHhHHI!HhHHI!HhHHI!IhHHI!!hHHI!IhHHI!HhHHI!HhHHI!IhHHI!!hHHI!HhHHI!HhHHI!HhHHI!IhHHI!!hHHI!IhHHI!HHHHHI!HHHhHHHI!HHHIHHHI!IHHI!HI!!!IHHI!!HhHHI!HhHHI!IhHHI!!hHHI!!hHHI!HhHHI!IhHHI!!hHHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhHhhi!hHhhi!hHhhi!iHhhi!!Hhhi!iHhhi!hHhhi!hHhhi!iHhhi!!Hhhi!hHhhi!hHhhi!hHhhi!iHhhi!!Hhhi!iHhhi!hhhhhi!hhhHhhhi!hhhihhhi!ihhi!hi!!!ihhi!!hHhhi!hHhhi!iHhhi!!Hhhi!!Hhhi!hHhhi!iHhhi!!Hhhi!!" + "'", str1, "hhHhhi!hHhhi!hHhhi!iHhhi!!Hhhi!iHhhi!hHhhi!hHhhi!iHhhi!!Hhhi!hHhhi!hHhhi!hHhhi!iHhhi!!Hhhi!iHhhi!hhhhhi!hhhHhhhi!hhhihhhi!ihhi!hi!!!ihhi!!hHhhi!hHhhi!iHhhi!!Hhhi!!Hhhi!hHhhi!iHhhi!!Hhhi!!");
    }

    @Test
    public void test7685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7685");
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
        java.lang.String str23 = org.apache.commons.lang.WordUtils.uncapitalize("HH", charArray12);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalize("", charArray12);
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "HH" + "'", str23, "HH");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test7686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7686");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("Hhhi!ihhi!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!!hhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!!hhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!!hhhi!ihhi!hhi!ihi!!hi!!!hhhhi!ihhihhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!!hhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!!hhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!!hhhi!ihhi!hhi!ihi!!hi!!!!hi!!h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test7687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7687");
        char[] charArray12 = new char[] { 'a', '4', 'a' };
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("", charArray12);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray12);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("HHHi!iHHi!!", charArray12);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray12);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("hhhI!IhhI!HI!!", charArray12);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("hhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!HhHHHI!HHHI!IHHI!!HhHHHI!HHHI!IHHI!!IhHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!HhHHHI!HHHI!IHHI!!IhHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!!", charArray12);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!ihhi!hhi!ihi!!hi!!", charArray12);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.initials("hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!iHHHI!hHHI!iHHI!!!HHHI!hHHI!iHHI!!iHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!HHHHI!hHHI!iHHI!!HHHHI!hHHI!iHHI!!HHHHI!hHHI!iHHI!!IHHHI!hHHI!iHHI!!!HHHI!hHHI!iHHI!!IHHHI!hHHI!iHHI!!HHHHI!hHHI!iHHI!!HHHHI!hHHI!iHHI!!IHHHI!hHHI!iHHI!!!HHHI!hHHI!iHHI!!HHHHI!hHHI!iHHI!!IHHHI!hHHI!iHHI!!!HHHI!hHHI!iHHI!!!HHHI!hHHI!iHHI!!H", charArray12);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.initials("Hhhhi!hhhihhi!", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { 'a', '4', 'a' });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hHHi!iHHi!!" + "'", str15, "hHHi!iHHi!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hhhI!IhhI!HI!!" + "'", str17, "hhhI!IhhI!HI!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!HhHHHI!HHHI!IHHI!!HhHHHI!HHHI!IHHI!!IhHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!HhHHHI!HHHI!IHHI!!IhHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!!" + "'", str18, "hhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!HhHHHI!HHHI!IHHI!!HhHHHI!HHHI!IHHI!!IhHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!HhHHHI!HHHI!IHHI!!IhHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hhhi!ihhi!hhi!ihi!!hi!!" + "'", str19, "hhhi!ihhi!hhi!ihi!!hi!!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "h" + "'", str20, "h");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "H" + "'", str21, "H");
    }

    @Test
    public void test7688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7688");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hhhhhi!ihhhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!HHhhhi!ihhi!!HHhhhi!ihhi!!HHhhhi!ihHhhhi!hhhiHhhi!hhhi!ihhi!!hi!!IHhhhi!ihhi!!!Hhhhi!ihhi!!HHhhhHhhhi!hhhiHhhi!hhhi!ihhi!!i!ihhi!!HHhhhi!ihhi!!HHhhhi!ihhi!!IHhhhi!hhhiHhhi!hhhi!ihhi!!Hhhhi!ihhi!!!Hhhhi!ihhi!!IHhhhi!ihhHhhhi!hhhiHhhi!hhhi!ihhi!!i!!HHhhhi!ihhi!!HHhhhi!ihhi!!IHhhhiHhhhi!hhhiHhhi!hhhi!ihhi!!!ihhi!!!Hhhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhhi!ihhhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!HHhhhi!ihhi!!HHhhhi!ihhi!!HHhhhi!ihHhhhi!hhhiHhhi!hhhi!ihhi!!hi!!IHhhhi!ihhi!!!Hhhhi!ihhi!!HHhhhHhhhi!hhhiHhhi!hhhi!ihhi!!i!ihhi!!HHhhhi!ihhi!!HHhhhi!ihhi!!IHhhhi!hhhiHhhi!hhhi!ihhi!!Hhhhi!ihhi!!!Hhhhi!ihhi!!IHhhhi!ihhHhhhi!hhhiHhhi!hhhi!ihhi!!i!!HHhhhi!ihhi!!HHhhhi!ihhi!!IHhhhiHhhhi!hhhiHhhi!hhhi!ihhi!!!ihhi!!!Hhhhi!ihhi!!!" + "'", str1, "Hhhhhi!ihhhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!HHhhhi!ihhi!!HHhhhi!ihhi!!HHhhhi!ihHhhhi!hhhiHhhi!hhhi!ihhi!!hi!!IHhhhi!ihhi!!!Hhhhi!ihhi!!HHhhhHhhhi!hhhiHhhi!hhhi!ihhi!!i!ihhi!!HHhhhi!ihhi!!HHhhhi!ihhi!!IHhhhi!hhhiHhhi!hhhi!ihhi!!Hhhhi!ihhi!!!Hhhhi!ihhi!!IHhhhi!ihhHhhhi!hhhiHhhi!hhhi!ihhi!!i!!HHhhhi!ihhi!!HHhhhi!ihhi!!IHhhhiHhhhi!hhhiHhhi!hhhi!ihhi!!!ihhi!!!Hhhhi!ihhi!!!");
    }

    @Test
    public void test7689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7689");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hhhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!!" + "'", str1, "HHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!!");
    }

    @Test
    public void test7690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7690");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!HHI!IHI!!HI!!", (int) (byte) 1, (int) (short) -1, "Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!HHI!IHI!!HI!!" + "'", str4, "hHHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!HHI!IHI!!HI!!");
    }

    @Test
    public void test7691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7691");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhhhhhhhhihhhhhi!ihhi!hi!!hhh!hhhhhHHHHHH", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhhhhhhhihhhhhi!ihhi!hi!!hhh!hhhhhHHHHHH" + "'", str2, "hhhhhhhhhihhhhhi!ihhi!hi!!hhh!hhhhhHHHHHH");
    }

    @Test
    public void test7692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7692");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hhHHHI!IHHhhhi!hhhi!HhHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!!hHI!iHI!!ihHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!hHhhI!IhhI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HhHHHI!IHHhhhi!hhhi!HhHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!!hHI!iHI!!ihHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!hHhhI!IhhI!!" + "'", str1, "HhHHHI!IHHhhhi!hhhi!HhHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!!hHI!iHI!!ihHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!hHhhI!IhhI!!");
    }

    @Test
    public void test7693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7693");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hIHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!h!HhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hhHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hIHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!h!HhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hiHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hIHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!h!HhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!h!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hIHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!h!HhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hhHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hIHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!h!HhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hiHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hIHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!h!HhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!h!" + "'", str1, "hHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hIHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!h!HhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hhHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hIHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!h!HhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hiHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hIHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!h!HhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!h!");
    }

    @Test
    public void test7694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7694");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hhhhi!HhhiHHHI!IHHI!hhhI!IhhI!HI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test7695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7695");
        char[] charArray8 = new char[] { '#', ' ', '4' };
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhhhi!ihhihhhi!hhhi!ihhi!!!hi!!hhhhhhi!ihhihhhi!hhhi!ihhi!!!hi!!hhhhhhi!ihhihhhi!hhhi!ihhi!!!hi!!hhhhhhi!ihhihhhi!hhhi!ihhi!!!hi!!hhhhhhi!ihhihhhi!hhhi!ihhi!!!hi!!hhhhhhi!ihhihhhi!hhhi!ihhi!!!hi!!hhhhhhi!ihhihhhi!hhhi!ihhi!!!hi!!hhhhhhi!ihhihhhi!hhhi!ihhi!!!hi!!hhhhhhi!ihhihhhi!hhhi!ihhi!!!hi!!hihhhhi!ihhihhhi!hhhi!ihhi!!!hi!!hhhhhhi!ihhihhhi!hhhi!ihhi!!!hi!!hhhhhhi!ihhihhhi!hhhi!ihhi!!!hi!!hhhhhhi!ihhihhhi!hhhi!ihhi!!!hi!!hhhhhhi!ihhihhhi!hhhi!ihhi!!!hi!!hihhhhi!ihhihhhi!hhhi!ihhi!!!hi!!h!hhhhi!ihhihhhi!hhhi!ihhi!!!hi!!hihhhhi!ihhihhhi!hhhi!ihhi!!!hi!!hhhhhhi!ihhihhhi!hhhi!ihhi!!!hi!!hhhhhhi!ihhihhhi!hhhi!ihhi!!!hi!!hihhhhi!ihhihhhi!hhhi!ihhi!!!hi!!h!hhhhi!ihhihhhi!hhhi!ihhi!!!hi!!hhhhhhi!ihhihhhi!hhhi!ihhi!!!hi!!hihhhhi!ihhihhhi!hhhi!ihhi!!!hi!!h!hhhhi!ihhihhhi!hhhi!ihhi!!!hi!!h!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("HHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("hhhi!ihhi!HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!IHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '#', ' ', '4' });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Hi!" + "'", str9, "Hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!" + "'", str10, "Hhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hhhhhhi!ihhihhhi!hhhi!ihhi!!!hi!!hhhhhhi!ihhihhhi!hhhi!ihhi!!!hi!!hhhhhhi!ihhihhhi!hhhi!ihhi!!!hi!!hhhhhhi!ihhihhhi!hhhi!ihhi!!!hi!!hhhhhhi!ihhihhhi!hhhi!ihhi!!!hi!!hhhhhhi!ihhihhhi!hhhi!ihhi!!!hi!!hhhhhhi!ihhihhhi!hhhi!ihhi!!!hi!!hhhhhhi!ihhihhhi!hhhi!ihhi!!!hi!!hhhhhhi!ihhihhhi!hhhi!ihhi!!!hi!!hihhhhi!ihhihhhi!hhhi!ihhi!!!hi!!hhhhhhi!ihhihhhi!hhhi!ihhi!!!hi!!hhhhhhi!ihhihhhi!hhhi!ihhi!!!hi!!hhhhhhi!ihhihhhi!hhhi!ihhi!!!hi!!hhhhhhi!ihhihhhi!hhhi!ihhi!!!hi!!hihhhhi!ihhihhhi!hhhi!ihhi!!!hi!!h!hhhhi!ihhihhhi!hhhi!ihhi!!!hi!!hihhhhi!ihhihhhi!hhhi!ihhi!!!hi!!hhhhhhi!ihhihhhi!hhhi!ihhi!!!hi!!hhhhhhi!ihhihhhi!hhhi!ihhi!!!hi!!hihhhhi!ihhihhhi!hhhi!ihhi!!!hi!!h!hhhhi!ihhihhhi!hhhi!ihhi!!!hi!!hhhhhhi!ihhihhhi!hhhi!ihhi!!!hi!!hihhhhi!ihhihhhi!hhhi!ihhi!!!hi!!h!hhhhi!ihhihhhi!hhhi!ihhi!!!hi!!h!" + "'", str11, "hhhhhhi!ihhihhhi!hhhi!ihhi!!!hi!!hhhhhhi!ihhihhhi!hhhi!ihhi!!!hi!!hhhhhhi!ihhihhhi!hhhi!ihhi!!!hi!!hhhhhhi!ihhihhhi!hhhi!ihhi!!!hi!!hhhhhhi!ihhihhhi!hhhi!ihhi!!!hi!!hhhhhhi!ihhihhhi!hhhi!ihhi!!!hi!!hhhhhhi!ihhihhhi!hhhi!ihhi!!!hi!!hhhhhhi!ihhihhhi!hhhi!ihhi!!!hi!!hhhhhhi!ihhihhhi!hhhi!ihhi!!!hi!!hihhhhi!ihhihhhi!hhhi!ihhi!!!hi!!hhhhhhi!ihhihhhi!hhhi!ihhi!!!hi!!hhhhhhi!ihhihhhi!hhhi!ihhi!!!hi!!hhhhhhi!ihhihhhi!hhhi!ihhi!!!hi!!hhhhhhi!ihhihhhi!hhhi!ihhi!!!hi!!hihhhhi!ihhihhhi!hhhi!ihhi!!!hi!!h!hhhhi!ihhihhhi!hhhi!ihhi!!!hi!!hihhhhi!ihhihhhi!hhhi!ihhi!!!hi!!hhhhhhi!ihhihhhi!hhhi!ihhi!!!hi!!hhhhhhi!ihhihhhi!hhhi!ihhi!!!hi!!hihhhhi!ihhihhhi!hhhi!ihhi!!!hi!!h!hhhhi!ihhihhhi!hhhi!ihhi!!!hi!!hhhhhhi!ihhihhhi!hhhi!ihhi!!!hi!!hihhhhi!ihhihhhi!hhhi!ihhi!!!hi!!h!hhhhi!ihhihhhi!hhhi!ihhi!!!hi!!h!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!" + "'", str12, "hHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hhhi!ihhi!HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!IHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!!" + "'", str13, "hhhi!ihhi!HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!IHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!!");
    }

    @Test
    public void test7696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7696");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hHHHHI!IHHhhhhi!ihhiHhhhhhhhhihh!hhhHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHiHhhi!Hhhi!Ihhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHHHI!IHHhhhhi!ihhiHhhhhhhhhihh!hhhHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHiHhhi!Hhhi!Ihhi!!" + "'", str1, "HHHHHI!IHHhhhhi!ihhiHhhhhhhhhihh!hhhHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHiHhhi!Hhhi!Ihhi!!");
    }

    @Test
    public void test7697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7697");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!hHIHI!!HI!HHI!IHI!!HI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!hHIHI!!HI!HHI!IHI!!HI!!" + "'", str1, "HHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!hHIHI!!HI!HHI!IHI!!HI!!");
    }

    @Test
    public void test7698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7698");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhhhhi!hhhhHHI!HHHI!IHHI!!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhhhi!hhhhHHI!HHHI!IHHI!!" + "'", str2, "Hhhhhi!hhhhHHI!HHHI!IHHI!!");
    }

    @Test
    public void test7699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7699");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHhhhi!ihhiHHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!iHHhhi!hHhhi!hHhhi!iHhhi!!Hhhi!iHhhi!hHhhi!hHhhi!iHhhi!!Hhhi!hHhhi!hHhhi!hHhhi!iHhhi!!Hhhi!iHhhi!hHhhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!i!hHhhi!iHhhi!!Hhhi!!Hhhi!hHhhi!iHhhi!!Hhhi!!HHHI!hHHI!iHHIhhhhI!IhhI!HI!!h", (-1), (int) (short) 10, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHhhhi!ihh" + "'", str4, "hHhhhi!ihh");
    }

    @Test
    public void test7700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7700");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.capitalize("Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!IhhiHHHHi!iHHi!hi!!H", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!IhhiHHHHi!iHHi!hi!!H" + "'", str2, "Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!IhhiHHHHi!iHHi!hi!!H");
    }

    @Test
    public void test7701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7701");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("", (int) (byte) 10, (int) (byte) 10, "HhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test7702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7702");
        char[] charArray9 = new char[] { '#', '4', '4', '4' };
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("HHI!", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("H", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhihhi!hhi!hhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("HHhhi!hhhi!hHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HhHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!IHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!!HHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '#', '4', '4', '4' });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hi!" + "'", str10, "Hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H" + "'", str11, "H");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "h" + "'", str12, "h");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hhhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhihhi!hhi!hhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!" + "'", str13, "Hhhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhihhi!hhi!hhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HHhhi!hhhi!hHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HhHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!IHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!!HHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!" + "'", str14, "HHhhi!hhhi!hHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HhHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!IHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!!HHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!");
    }

    @Test
    public void test7703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7703");
        char[] charArray10 = new char[] {};
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("hi!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("Hhhi!ihhi!!", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("HHHHI!HHHIHHHI!HHHI!IHHI!!", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("HHHI!hHHI!iHHI!!", charArray10);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("hHHI!IHHI!!", charArray10);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("Hhi!hhi!hhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhhHhhhHHI!IHHI!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!!HHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!!HHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!!HHHI!IHHI!HHI!IHI!!HI!!!HHHHI!IHHIHHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!!HHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!!HHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!!HHHI!IHHI!HHI!IHI!!HI!!!!HI!!H", charArray10);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.uncapitalize("HhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!IhHHHI!HHHI!HHHI!!hHHHI!HHHI!HHHI!IhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!IhHHHI!HHHI!HHHI!!hHHHI!HHHI!HHHI!!hHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!IhHHHI!HHHI!HHHI!!hHHHI!HHHI!HHHI!IhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!IhHHHI!HHHI!HHHI!!hHHHI!HHHI!HHHI!!hHHHI!HHHI!HHHI!HhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!IhHHHI!HHHI!HHHI!!hHHHI!HHHI!HHHI!IhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!IhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!HhHHHI!HHHI!HHHI!HhHHHI!HHHI!HHHI!IhHHHI!HHHI!HHHI!!hHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!HhHHHI!HHHI!HHHI!HhHHHI!HHHI!HHHI!IhHHHI!HHHI!HHHI!!hHHHI!HHHI!HHHI!ihHHHI!HHHI!HHHI!HhHHHI!HHHI!HHHI!HhHHHI!HHHI!HHHI!IhHHHI!HHHI!HHHI!!hHHHI!HHHI!HHHI!!", charArray10);
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hHHI!IHHI!!" + "'", str18, "hHHI!IHHI!!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Hhi!hhi!hhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhhHhhhHHI!IHHI!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!!HHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!!HHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!!HHHI!IHHI!HHI!IHI!!HI!!!HHHHI!IHHIHHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!!HHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!!HHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!!HHHI!IHHI!HHI!IHI!!HI!!!!HI!!H" + "'", str19, "Hhi!hhi!hhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhhHhhhHHI!IHHI!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!!HHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!!HHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!!HHHI!IHHI!HHI!IHI!!HI!!!HHHHI!IHHIHHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!!HHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!!HHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!!HHHI!IHHI!HHI!IHI!!HI!!!!HI!!H");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!IhHHHI!HHHI!HHHI!!hHHHI!HHHI!HHHI!IhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!IhHHHI!HHHI!HHHI!!hHHHI!HHHI!HHHI!!hHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!IhHHHI!HHHI!HHHI!!hHHHI!HHHI!HHHI!IhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!IhHHHI!HHHI!HHHI!!hHHHI!HHHI!HHHI!!hHHHI!HHHI!HHHI!HhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!IhHHHI!HHHI!HHHI!!hHHHI!HHHI!HHHI!IhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!IhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!HhHHHI!HHHI!HHHI!HhHHHI!HHHI!HHHI!IhHHHI!HHHI!HHHI!!hHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!HhHHHI!HHHI!HHHI!HhHHHI!HHHI!HHHI!IhHHHI!HHHI!HHHI!!hHHHI!HHHI!HHHI!ihHHHI!HHHI!HHHI!HhHHHI!HHHI!HHHI!HhHHHI!HHHI!HHHI!IhHHHI!HHHI!HHHI!!hHHHI!HHHI!HHHI!!" + "'", str20, "HhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!IhHHHI!HHHI!HHHI!!hHHHI!HHHI!HHHI!IhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!IhHHHI!HHHI!HHHI!!hHHHI!HHHI!HHHI!!hHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!IhHHHI!HHHI!HHHI!!hHHHI!HHHI!HHHI!IhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!IhHHHI!HHHI!HHHI!!hHHHI!HHHI!HHHI!!hHHHI!HHHI!HHHI!HhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!IhHHHI!HHHI!HHHI!!hHHHI!HHHI!HHHI!IhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!IhHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!HhHHHI!HHHI!HHHI!HhHHHI!HHHI!HHHI!IhHHHI!HHHI!HHHI!!hHHHI!HHHI!HHHI!hhHHHI!HHHI!HHHI!HhHHHI!HHHI!HHHI!HhHHHI!HHHI!HHHI!IhHHHI!HHHI!HHHI!!hHHHI!HHHI!HHHI!ihHHHI!HHHI!HHHI!HhHHHI!HHHI!HHHI!HhHHHI!HHHI!HHHI!IhHHHI!HHHI!HHHI!!hHHHI!HHHI!HHHI!!");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test7704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7704");
        char[] charArray12 = new char[] {};
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray12);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("", charArray12);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray12);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray12);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("", charArray12);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray12);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("H", charArray12);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray12);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalize("HI!", charArray12);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!HhhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!Hhhi!ihhi!HHI!iHI!!hi!!", charArray12);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalize("HHhhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!", charArray12);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalize("HhHI!iHI!!HhHI!iHI!!HhHI!iHI!!IhHI!iHI!!!hHI!iHI!!IhHI!iHI!!HhHI!iHI!!HhHI!iHI!!IhHI!iHI!!!hHI!iHI!!HhHI!iHI!!HhHI!iHI!!IhHI!iHI!!!hHI!iHI!!IhHI!iHI!!HhHI!iHI!!IhHI!iHI!!!hHI!iHI!!!hHI!iHI!!HhHI!iHI!!IhHI!iHI!!!hHI!iHI!!!", charArray12);
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "HI!" + "'", str21, "HI!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hhhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!HhhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!Hhhi!ihhi!HHI!iHI!!hi!!" + "'", str22, "hhhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!HhhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!Hhhi!ihhi!HHI!iHI!!hi!!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "HHhhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!" + "'", str23, "HHhhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "HhHI!iHI!!HhHI!iHI!!HhHI!iHI!!IhHI!iHI!!!hHI!iHI!!IhHI!iHI!!HhHI!iHI!!HhHI!iHI!!IhHI!iHI!!!hHI!iHI!!HhHI!iHI!!HhHI!iHI!!IhHI!iHI!!!hHI!iHI!!IhHI!iHI!!HhHI!iHI!!IhHI!iHI!!!hHI!iHI!!!hHI!iHI!!HhHI!iHI!!IhHI!iHI!!!hHI!iHI!!!" + "'", str24, "HhHI!iHI!!HhHI!iHI!!HhHI!iHI!!IhHI!iHI!!!hHI!iHI!!IhHI!iHI!!HhHI!iHI!!HhHI!iHI!!IhHI!iHI!!!hHI!iHI!!HhHI!iHI!!HhHI!iHI!!IhHI!iHI!!!hHI!iHI!!IhHI!iHI!!HhHI!iHI!!IhHI!iHI!!!hHI!iHI!!!hHI!iHI!!HhHI!iHI!!IhHI!iHI!!!hHI!iHI!!!");
    }

    @Test
    public void test7705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7705");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHHI!", (int) (short) 10, (int) (byte) 0, "HHHHHI!HHHHHHHHI!IHHI!!HHHHI!IHHI!!Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end 10, length 5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7706");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!", (int) (short) 100, "hhhi!ihhi!hi!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhhhhi!ihhi!hi!hI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!Ihhhi!ihhi!hi!hhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!hhhi!ihhi!hi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!" + "'", str4, "Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhhhhi!ihhi!hi!hI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!Ihhhi!ihhi!hi!hhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!hhhi!ihhi!hi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
    }

    @Test
    public void test7707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7707");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.initials("hHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!hHhhhi!ihhihhhI!IhHHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!h", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h" + "'", str2, "h");
    }

    @Test
    public void test7708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7708");
        char[] charArray13 = new char[] { '#', '4', '4', '4' };
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray13);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray13);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("", charArray13);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray13);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray13);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.initials("Hhhi!ihhi!!", charArray13);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray13);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalizeFully("HHhhi!hhhi!hhhi!", charArray13);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.initials("HhhhI!IhhI!hHhhhhhI!IhhI!hHhhhhhI!IhhI!hHhhhhhI!IhhI!hHhhhhhI!IhhI!hHhihhhI!IhhI!hHh!hhhI!IhhI!hHhhhhhI!IhhI!hHhhhhhI!IhhI!hHhhhhhI!IhhI!hHhhhhhI!IhhI!hHhHhhhI!IhhI!hHhHhhhI!IhhI!hHhIhhhI!IhhI!hHh!hhhI!IhhI!hHhHhhhI!IhhI!hHhHhhhI!IhhI!hHhHhhhI!IhhI!hHhIhhhI!IhhI!hHh!hhhI!IhhI!hHhIhhhI!IhhI!hHhHhhhI!IhhI!hHhHhhhI!IhhI!hHhIhhhI!IhhI!hHh!hhhI!IhhI!hHh!", charArray13);
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "H" + "'", str22, "H");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test7709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7709");
        char[] charArray5 = new char[] {};
        java.lang.String str6 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray5);
        java.lang.String str7 = org.apache.commons.lang.WordUtils.initials("", charArray5);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.initials("hi!", charArray5);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("HhHHHI!IHHI!!hhHHHI!IHHI!!hhHHHI!IHhHHHI!HHHIhHHI!HHHI!IHHI!!HI!!ihHHHI!IHHI!!!hHHHI!IHHI!!hhHHHhHHHHHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!hHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!hhhi!Hhhi!hhHI!", charArray5);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("hHHHI!HHHIhHHI!HHHI!IHHI!!", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HhHHHI!IHHI!!hhHHHI!IHHI!!hhHHHI!IHhHHHI!HHHIhHHI!HHHI!IHHI!!HI!!ihHHHI!IHHI!!!hHHHI!IHHI!!hhHHHhHHHHHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!hHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!hhhi!Hhhi!hhHI!" + "'", str9, "HhHHHI!IHHI!!hhHHHI!IHHI!!hhHHHI!IHhHHHI!HHHIhHHI!HHHI!IHHI!!HI!!ihHHHI!IHHI!!!hHHHI!IHHI!!hhHHHhHHHHHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!hHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!hhhi!Hhhi!hhHI!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hHHHI!HHHIhHHI!HHHI!IHHI!!" + "'", str10, "hHHHI!HHHIhHHI!HHHI!IHHI!!");
    }

    @Test
    public void test7710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7710");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHhhhi!ihhi!!hHhhhi!ihhi!!hHhhhi!ihhi!!hHhhhi!ihhi!!iHhhhi!ihhi!!!Hhhhi!ihhi!!iHhhhi!ihhi!!hHhhhi!ihhi!!hHhhhi!ihhi!!iHhhhi!ihhi!!!Hhhhi!ihhi!!hHhhhi!ihhi!!iHhhhi!ihhi!!!Hhhhi!ihhi!!!Hhhhi!ihhi!!h", (int) (short) -1, (int) (byte) -1, "HhhhhI!Ihhhhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHhhhi!ihhi!!hHhhhi!ihhi!!hHhhhi!ihhi!!hHhhhi!ihhi!!iHhhhi!ihhi!!!Hhhhi!ihhi!!iHhhhi!ihhi!!hHhhhi!ihhi!!hHhhhi!ihhi!!iHhhhi!ihhi!!!Hhhhi!ihhi!!hHhhhi!ihhi!!iHhhhi!ihhi!!!Hhhhi!ihhi!!!Hhhhi!ihhi!!h" + "'", str4, "hHhhhi!ihhi!!hHhhhi!ihhi!!hHhhhi!ihhi!!hHhhhi!ihhi!!iHhhhi!ihhi!!!Hhhhi!ihhi!!iHhhhi!ihhi!!hHhhhi!ihhi!!hHhhhi!ihhi!!iHhhhi!ihhi!!!Hhhhi!ihhi!!hHhhhi!ihhi!!iHhhhi!ihhi!!!Hhhhi!ihhi!!!Hhhhi!ihhi!!h");
    }

    @Test
    public void test7711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7711");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HhHHHHI!IHHHHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!!HHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!!HHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!!HHHI!IHHI!HHI!IHI!!HI!!!", (int) (short) 0, 1, "hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!iHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!iHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!iHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!iHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HhHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!iHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!iHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!iHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!iHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!" + "'", str4, "HhHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!iHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!iHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!iHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!iHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!");
    }

    @Test
    public void test7712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7712");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHHHHI!HHHHHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHHHHI!HHHHHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!" + "'", str2, "hHHHHI!HHHHHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!");
    }

    @Test
    public void test7713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7713");
        char[] charArray14 = new char[] { '#', '4', '4', '4' };
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray14);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray14);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("H", charArray14);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("hhhi!ihhi!!", charArray14);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.initials("hhhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!ihi!!hi!hhi!ihi!!hi!!", charArray14);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!hhhi!hhhi!Ihhi!!hhi!Ihhi!hhhi!hhhi!Ihhi!!hhi!Hhhi!Ihhi!!hhi!!", charArray14);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalize("HhHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!ihHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!ihHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!!hHHI!IHHI!HI!!h", charArray14);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalizeFully("hhi!", charArray14);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalize("HhhI!HhI!HHhhhi!ihhihhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!", charArray14);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.initials("HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHHI!IHHIHHHI!IHHHHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!iHHHI!hHHI!iHHIhhhhI!IhhI!HI!!h", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { '#', '4', '4', '4' });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hi!" + "'", str15, "Hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hi!" + "'", str16, "Hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "h" + "'", str17, "h");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hhhi!ihhi!!" + "'", str18, "hhhi!ihhi!!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "h" + "'", str19, "h");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!" + "'", str20, "Hhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "HhHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!ihHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!ihHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!!hHHI!IHHI!HI!!h" + "'", str21, "HhHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!ihHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!ihHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!!hHHI!IHHI!HI!!h");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Hhi!" + "'", str22, "Hhi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "HhhI!HhI!HHhhhi!ihhihhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!" + "'", str23, "HhhI!HhI!HHhhhi!ihhihhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "H" + "'", str24, "H");
    }

    @Test
    public void test7714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7714");
        char[] charArray14 = new char[] { '#', '4', '4', '4' };
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray14);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray14);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("", charArray14);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray14);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray14);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.uncapitalize("Hhi!", charArray14);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.initials("HHHHI!HHHIHHHI!HHHI!IHHI!!", charArray14);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalize("HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!", charArray14);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhhhHi!ihhi!hhhi!hhhi!hhi!hhhi!", charArray14);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalize("hHHI!HHHI!HHHI!IHI!!HHHI!IHI!!HHHHHHI!IHHI!HHHI!IHHI!!HI!!HI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHIHHHHI!IHHI!HHHI!IHHI!!HI!!!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHHHHI!IHHI!HHHI!IHHI!!HI!!HI!!!HHI!IHI!!HHHI!IHI!!IHHI!IHIHHHHI!IHHI!HHHI!IHHI!!HI!!!!!HHI!IHI!!!", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { '#', '4', '4', '4' });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hi!" + "'", str15, "Hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hi!" + "'", str16, "Hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H" + "'", str18, "H");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H" + "'", str19, "H");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hhi!" + "'", str20, "hhi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "H" + "'", str21, "H");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!" + "'", str22, "HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhhhhi!ihhi!hhhi!hhhi!hhi!hhhi!" + "'", str23, "Hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhhhhi!ihhi!hhhi!hhhi!hhi!hhhi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "HHHI!HHHI!HHHI!IHI!!HHHI!IHI!!HHHHHHI!IHHI!HHHI!IHHI!!HI!!HI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHIHHHHI!IHHI!HHHI!IHHI!!HI!!!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHHHHI!IHHI!HHHI!IHHI!!HI!!HI!!!HHI!IHI!!HHHI!IHI!!IHHI!IHIHHHHI!IHHI!HHHI!IHHI!!HI!!!!!HHI!IHI!!!" + "'", str24, "HHHI!HHHI!HHHI!IHI!!HHHI!IHI!!HHHHHHI!IHHI!HHHI!IHHI!!HI!!HI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHIHHHHI!IHHI!HHHI!IHHI!!HI!!!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHHHHI!IHHI!HHHI!IHHI!!HI!!HI!!!HHI!IHI!!HHHI!IHI!!IHHI!IHIHHHHI!IHHI!HHHI!IHHI!!HI!!!!!HHI!IHI!!!");
    }

    @Test
    public void test7715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7715");
        char[] charArray8 = new char[] {};
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("hH", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("hHHI!IHHI!hHh", charArray8);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("hHHHI!IHHIhHi!!!HHHHI!IHhHi!HI!!HHHHI!hHi!IHHI!!HHHHhHi!I!IHHI!!IHhHi!HHI!IHHI!!hHi!!HHHI!IHHIhHi!!!IHHHI!IHhHi!HI!!HHHHI!hHi!IHHI!!HhHHhHi!Hi!iHHi!!HhHi!HHHi!iHHi!hHi!!HHHHi!iHHhHi!i!!HHHHi!ihHi!HHi!!IHHHihHi!!iHHi!!!HHhHi!Hi!iHHi!!IhHi!HHHi!iHHi!hHi!!HHHHi!iHHhHi!i!!HHHHi!ihHi!HHi!!IHHHihHi!!iHHi!!!HHhHi!Hi!iHHi!!HhHi!HHHi!iHHi!hHi!!IHHHi!iHHhHi!i!!!HHHi!ihHi!HHi!!!HHHIhHi!!IHHI!!IHHhHi!HI!IHHI!!!hHi!HHHI!IHHI!hHi!!HHHHI!IHHhHi!I!!IHHHI!IhHi!HHI!!!HHHIhHi!!IHHI!!!", charArray8);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHI!IHHI!hhhhi!ihhihhhhi!hhhi!ihhiHHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hHHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!IHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!!", charArray8);
        java.lang.Class<?> wildcardClass17 = charArray8.getClass();
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hH" + "'", str13, "hH");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hHHHI!IHHIhHi!!!HHHHI!IHhHi!HI!!HHHHI!hHi!IHHI!!HHHHhHi!I!IHHI!!IHhHi!HHI!IHHI!!hHi!!HHHI!IHHIhHi!!!IHHHI!IHhHi!HI!!HHHHI!hHi!IHHI!!HhHHhHi!Hi!iHHi!!HhHi!HHHi!iHHi!hHi!!HHHHi!iHHhHi!i!!HHHHi!ihHi!HHi!!IHHHihHi!!iHHi!!!HHhHi!Hi!iHHi!!IhHi!HHHi!iHHi!hHi!!HHHHi!iHHhHi!i!!HHHHi!ihHi!HHi!!IHHHihHi!!iHHi!!!HHhHi!Hi!iHHi!!HhHi!HHHi!iHHi!hHi!!IHHHi!iHHhHi!i!!!HHHi!ihHi!HHi!!!HHHIhHi!!IHHI!!IHHhHi!HI!IHHI!!!hHi!HHHI!IHHI!hHi!!HHHHI!IHHhHi!I!!IHHHI!IhHi!HHI!!!HHHIhHi!!IHHI!!!" + "'", str15, "hHHHI!IHHIhHi!!!HHHHI!IHhHi!HI!!HHHHI!hHi!IHHI!!HHHHhHi!I!IHHI!!IHhHi!HHI!IHHI!!hHi!!HHHI!IHHIhHi!!!IHHHI!IHhHi!HI!!HHHHI!hHi!IHHI!!HhHHhHi!Hi!iHHi!!HhHi!HHHi!iHHi!hHi!!HHHHi!iHHhHi!i!!HHHHi!ihHi!HHi!!IHHHihHi!!iHHi!!!HHhHi!Hi!iHHi!!IhHi!HHHi!iHHi!hHi!!HHHHi!iHHhHi!i!!HHHHi!ihHi!HHi!!IHHHihHi!!iHHi!!!HHhHi!Hi!iHHi!!HhHi!HHHi!iHHi!hHi!!IHHHi!iHHhHi!i!!!HHHi!ihHi!HHi!!!HHHIhHi!!IHHI!!IHHhHi!HI!IHHI!!!hHi!HHHI!IHHI!hHi!!HHHHI!IHHhHi!I!!IHHHI!IhHi!HHI!!!HHHIhHi!!IHHI!!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hHHI!IHHI!hhhhi!ihhihhhhi!hhhi!ihhiHHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hHHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!IHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!!" + "'", str16, "hHHI!IHHI!hhhhi!ihhihhhhi!hhhi!ihhiHHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hHHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!IHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test7716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7716");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhhi!hhhihhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhhi!hhhihhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!" + "'", str1, "Hhhhhi!hhhihhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!");
    }

    @Test
    public void test7717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7717");
        char[] charArray5 = new char[] {};
        java.lang.String str6 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray5);
        java.lang.String str7 = org.apache.commons.lang.WordUtils.capitalize("hhHI!", charArray5);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalizeFully("HhH", charArray5);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalizeFully("HHhhI!IhhIHHHHI!HHHI!IHHI!!", charArray5);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("HHI!HHI!HHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!!HI!HHI!HHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!!HI!HHI!HHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!!HI!IHI!HHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!!HI!!HI!HHI!HHI!HHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!!HI!HHI!HHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!!HI!HHI!HHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!!HI!IHI!HHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!!HI!!HI!HHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!HHI!HHI!IHI!!HI!IHI!HHI!IHI!!HI!!HI!HHI!IHI!!HI!!", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HI!" + "'", str6, "HI!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hhHI!" + "'", str7, "hhHI!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HhH" + "'", str8, "HhH");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HHhhI!IhhIHHHHI!HHHI!IHHI!!" + "'", str9, "HHhhI!IhhIHHHHI!HHHI!IHHI!!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HHI!HHI!HHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!!HI!HHI!HHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!!HI!HHI!HHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!!HI!IHI!HHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!!HI!!HI!HHI!HHI!HHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!!HI!HHI!HHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!!HI!HHI!HHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!!HI!IHI!HHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!!HI!!HI!HHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!HHI!HHI!IHI!!HI!IHI!HHI!IHI!!HI!!HI!HHI!IHI!!HI!!" + "'", str10, "HHI!HHI!HHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!!HI!HHI!HHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!!HI!HHI!HHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!!HI!IHI!HHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!!HI!!HI!HHI!HHI!HHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!!HI!HHI!HHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!!HI!HHI!HHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!!HI!IHI!HHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!!HI!!HI!HHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!HHI!HHI!IHI!!HI!IHI!HHI!IHI!!HI!!HI!HHI!IHI!!HI!!");
    }

    @Test
    public void test7718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7718");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("Hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!", (int) (short) 100, "hHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!HHHI!IHHI!!HI!!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!HHHI!IHHI!!HI!!hi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!" + "'", str4, "Hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!HHHI!IHHI!!HI!!hi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
    }

    @Test
    public void test7719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7719");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hHHHI!HHHI!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHIhHHhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!hHhhhi!hhhi!ihhi!!hHhhhi!hhhi!ihhi!!iHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!hHhhhi!hhhi!ihhi!!iHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhiHhhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!HhHHHI!HHHI!IHHI!!HhHHHI!HHHI!IHHI!!IhHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!HhHHHI!HHHI!IHHI!!IhHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!!" + "'", str1, "Hhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhiHhhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!HhHHHI!HHHI!IHHI!!HhHHHI!HHHI!IHHI!!IhHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!HhHHHI!HHHI!IHHI!!IhHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!!");
    }

    @Test
    public void test7720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7720");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhHhhHhHhhhhHhhhhHhhIhHhh!hHhhIhHhhhhHhhhhHhhIhHhh!hHhhhhHhhHhHhhHhHhhHhHhhihHhh!hHhhihHhhHhHhhHhHhhihHhh!hHhhhhHhhihHhh!hHhh!hHhhHhHhhHhHhhHhHhhhhHhhhhHhhIhHhh!hHhhIhHhhhhHhhhhHhhIhHhh!hHhhhhHhhHhHhhHhHhhHhHhhihHhh!hHhhihHhhHhHhhHhHhhihHhh!hHhhhhHhhihHhh!hHhh!hHhhHhHhhHhHhhHhHhhhhHhhhhHhhIhHhh!hHhhIhHhhhhHhhhhHhhIhHhh!hHhhhhHhhHhHhhHhHhhHhHhhihHhh!hHhhihHhhHhHhhHhHhhihHhh!hHhhhhHhhihHhh!hHhh!hHhhHhHhhHhHhhHhHhhhhHhhhhHhhIhHhh!hHhhIhHhhhhHhhhhHhhIhHhh!hHhhhhHhhHhHhhHhHhhHhHhhihHhh!hHhhihHhhHhHhhHhHhhhhHhhhhHhhIhHhh!hHhhIhHhhhhHhhhhHhhIhHhh!hHhhhhHhhhhHhhhhHhhihHhh!hHhhihHhhhhHhhhhHhhihHhh!hHhh!hHhhHhHhhIhHhh!hHhh!", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhHhhHhHhhhhHhhhhHhhIhHhh!hHhhIhHhhhhHhhhhHhhIhHhh!hHhhhhHhhHhHhhHhHhhHhHhhihHhh!hHhhihHhhHhHhhHhHhhihHhh!hHhhhhHhhihHhh!hHhh!hHhhHhHhhHhHhhHhHhhhhHhhhhHhhIhHhh!hHhhIhHhhhhHhhhhHhhIhHhh!hHhhhhHhhHhHhhHhHhhHhHhhihHhh!hHhhihHhhHhHhhHhHhhihHhh!hHhhhhHhhihHhh!hHhh!hHhhHhHhhHhHhhHhHhhhhHhhhhHhhIhHhh!hHhhIhHhhhhHhhhhHhhIhHhh!hHhhhhHhhHhHhhHhHhhHhHhhihHhh!hHhhihHhhHhHhhHhHhhihHhh!hHhhhhHhhihHhh!hHhh!hHhhHhHhhHhHhhHhHhhhhHhhhhHhhIhHhh!hHhhIhHhhhhHhhhhHhhIhHhh!hHhhhhHhhHhHhhHhHhhHhHhhihHhh!hHhhihHhhHhHhhHhHhhhhHhhhhHhhIhHhh!hHhhIhHhhhhHhhhhHhhIhHhh!hHhhhhHhhhhHhhhhHhhihHhh!hHhhihHhhhhHhhhhHhhihHhh!hHhh!hHhhHhHhhIhHhh!hHhh!" + "'", str2, "hhHhhHhHhhhhHhhhhHhhIhHhh!hHhhIhHhhhhHhhhhHhhIhHhh!hHhhhhHhhHhHhhHhHhhHhHhhihHhh!hHhhihHhhHhHhhHhHhhihHhh!hHhhhhHhhihHhh!hHhh!hHhhHhHhhHhHhhHhHhhhhHhhhhHhhIhHhh!hHhhIhHhhhhHhhhhHhhIhHhh!hHhhhhHhhHhHhhHhHhhHhHhhihHhh!hHhhihHhhHhHhhHhHhhihHhh!hHhhhhHhhihHhh!hHhh!hHhhHhHhhHhHhhHhHhhhhHhhhhHhhIhHhh!hHhhIhHhhhhHhhhhHhhIhHhh!hHhhhhHhhHhHhhHhHhhHhHhhihHhh!hHhhihHhhHhHhhHhHhhihHhh!hHhhhhHhhihHhh!hHhh!hHhhHhHhhHhHhhHhHhhhhHhhhhHhhIhHhh!hHhhIhHhhhhHhhhhHhhIhHhh!hHhhhhHhhHhHhhHhHhhHhHhhihHhh!hHhhihHhhHhHhhHhHhhhhHhhhhHhhIhHhh!hHhhIhHhhhhHhhhhHhhIhHhh!hHhhhhHhhhhHhhhhHhhihHhh!hHhhihHhhhhHhhhhHhhihHhh!hHhh!hHhhHhHhhIhHhh!hHhh!");
    }

    @Test
    public void test7721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7721");
        char[] charArray14 = new char[] { '#', '4', '4', '4' };
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray14);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray14);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("H", charArray14);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("hhhi!ihhi!!", charArray14);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.initials("hhhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!ihi!!hi!hhi!ihi!!hi!!", charArray14);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!hhhi!hhhi!Ihhi!!hhi!Ihhi!hhhi!hhhi!Ihhi!!hhi!Hhhi!Ihhi!!hhi!!", charArray14);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalize("HhHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!ihHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!ihHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!!hHHI!IHHI!HI!!h", charArray14);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalizeFully("hhi!", charArray14);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalize("HhhI!HhI!HHhhhi!ihhihhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!", charArray14);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalize("HHhhi!ihhi!hhhhi!ihhi!hhhi!ihhi!!hi!!", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { '#', '4', '4', '4' });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hi!" + "'", str15, "Hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hi!" + "'", str16, "Hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "h" + "'", str17, "h");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hhhi!ihhi!!" + "'", str18, "hhhi!ihhi!!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "h" + "'", str19, "h");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!" + "'", str20, "Hhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "HhHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!ihHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!ihHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!!hHHI!IHHI!HI!!h" + "'", str21, "HhHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!ihHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!ihHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!!hHHI!IHHI!HI!!h");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Hhi!" + "'", str22, "Hhi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "HhhI!HhI!HHhhhi!ihhihhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!" + "'", str23, "HhhI!HhI!HHhhhi!ihhihhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "HHhhi!ihhi!hhhhi!ihhi!hhhi!ihhi!!hi!!" + "'", str24, "HHhhi!ihhi!hhhhi!ihhi!hhhi!ihhi!!hi!!");
    }

    @Test
    public void test7722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7722");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihHHi!iHHi!HhhhI!IhhI!HI!!h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHI!HHHI!HHHI!IHHI!!HHI!IHHI!HHHI!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHhhI!IhhI!hHHHi!iHHi!hi!!H" + "'", str1, "HHHI!HHHI!HHHI!IHHI!!HHI!IHHI!HHHI!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHhhI!IhhI!hHHHi!iHHi!hi!!H");
    }

    @Test
    public void test7723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7723");
        char[] charArray7 = new char[] {};
        java.lang.String str8 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("H", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("", charArray7);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("hHI!", charArray7);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!hhhi!hhhi!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hHI!" + "'", str13, "hHI!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!hhhi!hhhi!" + "'", str14, "hhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!hhhi!hhhi!");
    }

    @Test
    public void test7724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7724");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hhhi!hhhi!hHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!HhHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHhHhh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhi!hhhi!hHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!HhHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHhHhh" + "'", str1, "hhhi!hhhi!hHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!HhHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHhHhh");
    }

    @Test
    public void test7725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7725");
        char[] charArray11 = new char[] {};
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("", charArray11);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray11);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("HH", charArray11);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.uncapitalize("Hh", charArray11);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.initials("hhHHHI!IHHI!!hhHHHI!IHHI!!hhHHHI!IHhHHHI!HHHIhHHI!HHHI!IHHI!!HI!!ihHHHI!IHHI!!!hHHHI!IHHI!!hhHHHhHHHI!HHHIhHHI!HHHI!IHHI!!I!IHHI!!hhHHHI!IHHI!!hhHHHI!IHHI!!ihHHHI!HHHIhHHI!HHHI!IHHI!!hHHHI!IHHI!!!hHHHI!IHHI!!ihHHHI!IHHhHHHI!HHHIhHHI!HHHI!IHHI!!I!!hhHHHI!IHHI!!hhHHHI!IHHI!!ihHHHIhHHHI!HHHIhHHI!HHHI!IHHI!!!IHHI!!!hHHHI!IHHI!!!", charArray11);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.initials("hHHi!iHHi!hHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHHhhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhHHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!hHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!hhhi!Hhhi!hhHI!", charArray11);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.initials("Hhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] {});
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hi!" + "'", str15, "Hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "h" + "'", str17, "h");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HH" + "'", str18, "HH");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Hh" + "'", str19, "Hh");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test7726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7726");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hhhhi!hhhiHhhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhhhhi!hhhihhhi!hhhi!ihhi!!hi!!ihhhhi!ihhi!!!hhhhi!ihhi!!hhhhhhhhhi!hhhihhhi!hhhi!ihhi!!i!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!hhhhi!ihhi!!!hhhhi!ihhi!!ihhhhi!ihhhhhhi!hhhihhhi!hhhi!ihhi!!i!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhihhhhi!hhhihhhi!hhhi!ihhi!!!ihhi!!!hhhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHHI!HHHIhHHHHI!IHHI!!HHHHHI!IHHI!!HHHHHI!IHHHHHI!HHHIHHHI!HHHI!IHHI!!HI!!IHHHHI!IHHI!!!HHHHI!IHHI!!HHHHHHHHHI!HHHIHHHI!HHHI!IHHI!!I!IHHI!!HHHHHI!IHHI!!HHHHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHI!IHHI!!!HHHHI!IHHI!!IHHHHI!IHHHHHHI!HHHIHHHI!HHHI!IHHI!!I!!HHHHHI!IHHI!!HHHHHI!IHHI!!IHHHHIHHHHI!HHHIHHHI!HHHI!IHHI!!!IHHI!!!HHHHI!IHHI!!!" + "'", str1, "HHHHI!HHHIhHHHHI!IHHI!!HHHHHI!IHHI!!HHHHHI!IHHHHHI!HHHIHHHI!HHHI!IHHI!!HI!!IHHHHI!IHHI!!!HHHHI!IHHI!!HHHHHHHHHI!HHHIHHHI!HHHI!IHHI!!I!IHHI!!HHHHHI!IHHI!!HHHHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHI!IHHI!!!HHHHI!IHHI!!IHHHHI!IHHHHHHI!HHHIHHHI!HHHI!IHHI!!I!!HHHHHI!IHHI!!HHHHHI!IHHI!!IHHHHIHHHHI!HHHIHHHI!HHHI!IHHI!!!IHHI!!!HHHHI!IHHI!!!");
    }

    @Test
    public void test7727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7727");
        char[] charArray13 = new char[] {};
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray13);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("", charArray13);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray13);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray13);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("", charArray13);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray13);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("H", charArray13);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.uncapitalize("hh", charArray13);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhI!IhhI!!", charArray13);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.initials("hHHHi!iHHi!hi!!H", charArray13);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.uncapitalize("hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!", charArray13);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!", charArray13);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.uncapitalize("hhhi!ihhi!HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!IHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!!", charArray13);
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hhhI!IhhI!!" + "'", str22, "hhhI!IhhI!!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!" + "'", str24, "hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!" + "'", str25, "hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hhhi!ihhi!HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!IHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!!" + "'", str26, "hhhi!ihhi!HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!IHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!!");
    }

    @Test
    public void test7728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7728");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("HHHI!HHHI!HhHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!!h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test7729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7729");
        char[] charArray8 = new char[] {};
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("hi!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray8);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("HHhhi!ihhi!hi!!", charArray8);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("Hhhhhhi!ihHhhhi!ihhihhhhi!hhhi!ihhi!!hi!!hhhhi!Hhhhi!ihhihhhhi!hhhi!ihhi!!ihhi!!hhhhHhhhi!ihhihhhhi!hhhi!ihhi!!i!ihhi!!hhHhhhi!ihhihhhhi!hhhi!ihhi!!hhi!ihhi!!Hhhhi!ihhihhhhi!hhhi!ihhi!!ihhhi!ihhiHhhhi!ihhihhhhi!hhhi!ihhi!!!!!hhhi!ihHhhhi!ihhihhhhi!hhhi!ihhi!!hi!!hhhhi!Hhhhi!ihhihhhhi!hhhi!ihhi!!ihhi!!hhhhHhhhi!ihhihhhhi!hhhi!ihhi!!i!ihhi!!hhHhhhi!ihhihhhhi!hhhi!ihhi!!hhi!ihhi!!Hhhhi!ihhihhhhi!hhhi!ihhi!!ihhhi!ihhiHhhhi!ihhihhhhi!hhhi!ihhi!!!!!hhhi!ihHhhhi!ihhihhhhi!hhhi!ihhi!!hi!!ihhhi!Hhhhi!ihhihhhhi!hhhi!ihhi!!ihhi!!hhhhHhhhi!ihhihhhhi!hhhi!ihhi!!i!ihhi!!hhHhhhi!ihhihhhhi!hhhi!ihhi!!hhi!ihhi!!Hhhhi!ihhihhhhi!hhhi!ihhi!!ihhhi!ihhiHhhhi!ihhihhhhi!hhhi!ihhi!!!!!hhhi!ihHhhhi!ihhihhhhi!hhhi!ihhi!!hi!!!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hi!" + "'", str12, "Hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hi!" + "'", str14, "Hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HHhhi!ihhi!hi!!" + "'", str15, "HHhhi!ihhi!hi!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hhhhhhi!ihHhhhi!ihhihhhhi!hhhi!ihhi!!hi!!hhhhi!Hhhhi!ihhihhhhi!hhhi!ihhi!!ihhi!!hhhhHhhhi!ihhihhhhi!hhhi!ihhi!!i!ihhi!!hhHhhhi!ihhihhhhi!hhhi!ihhi!!hhi!ihhi!!Hhhhi!ihhihhhhi!hhhi!ihhi!!ihhhi!ihhiHhhhi!ihhihhhhi!hhhi!ihhi!!!!!hhhi!ihHhhhi!ihhihhhhi!hhhi!ihhi!!hi!!hhhhi!Hhhhi!ihhihhhhi!hhhi!ihhi!!ihhi!!hhhhHhhhi!ihhihhhhi!hhhi!ihhi!!i!ihhi!!hhHhhhi!ihhihhhhi!hhhi!ihhi!!hhi!ihhi!!Hhhhi!ihhihhhhi!hhhi!ihhi!!ihhhi!ihhiHhhhi!ihhihhhhi!hhhi!ihhi!!!!!hhhi!ihHhhhi!ihhihhhhi!hhhi!ihhi!!hi!!ihhhi!Hhhhi!ihhihhhhi!hhhi!ihhi!!ihhi!!hhhhHhhhi!ihhihhhhi!hhhi!ihhi!!i!ihhi!!hhHhhhi!ihhihhhhi!hhhi!ihhi!!hhi!ihhi!!Hhhhi!ihhihhhhi!hhhi!ihhi!!ihhhi!ihhiHhhhi!ihhihhhhi!hhhi!ihhi!!!!!hhhi!ihHhhhi!ihhihhhhi!hhhi!ihhi!!hi!!!" + "'", str16, "Hhhhhhi!ihHhhhi!ihhihhhhi!hhhi!ihhi!!hi!!hhhhi!Hhhhi!ihhihhhhi!hhhi!ihhi!!ihhi!!hhhhHhhhi!ihhihhhhi!hhhi!ihhi!!i!ihhi!!hhHhhhi!ihhihhhhi!hhhi!ihhi!!hhi!ihhi!!Hhhhi!ihhihhhhi!hhhi!ihhi!!ihhhi!ihhiHhhhi!ihhihhhhi!hhhi!ihhi!!!!!hhhi!ihHhhhi!ihhihhhhi!hhhi!ihhi!!hi!!hhhhi!Hhhhi!ihhihhhhi!hhhi!ihhi!!ihhi!!hhhhHhhhi!ihhihhhhi!hhhi!ihhi!!i!ihhi!!hhHhhhi!ihhihhhhi!hhhi!ihhi!!hhi!ihhi!!Hhhhi!ihhihhhhi!hhhi!ihhi!!ihhhi!ihhiHhhhi!ihhihhhhi!hhhi!ihhi!!!!!hhhi!ihHhhhi!ihhihhhhi!hhhi!ihhi!!hi!!ihhhi!Hhhhi!ihhihhhhi!hhhi!ihhi!!ihhi!!hhhhHhhhi!ihhihhhhi!hhhi!ihhi!!i!ihhi!!hhHhhhi!ihhihhhhi!hhhi!ihhi!!hhi!ihhi!!Hhhhi!ihhihhhhi!hhhi!ihhi!!ihhhi!ihhiHhhhi!ihhihhhhi!hhhi!ihhi!!!!!hhhi!ihHhhhi!ihhihhhhi!hhhi!ihhi!!hi!!!");
    }

    @Test
    public void test7730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7730");
        char[] charArray7 = new char[] {};
        java.lang.String str8 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("hi!", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray7);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray7);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("H", charArray7);
        java.lang.Class<?> wildcardClass15 = charArray7.getClass();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hi!" + "'", str11, "Hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hi!" + "'", str13, "Hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test7731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7731");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hhhhhI!IhhHhhhhi!ihhhhhhi!ihhihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test7732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7732");
        char[] charArray13 = new char[] {};
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray13);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("", charArray13);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray13);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray13);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("h", charArray13);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.initials("Hhi!", charArray13);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("", charArray13);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalizeFully("HHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!hHIHI!!HI!HHI!IHI!!HI!!", charArray13);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.initials("hhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!Hhihi!!hi!hhi!ihi!!hi!!", charArray13);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalize("HHHHI!IHHIhhhi!hhhi!ihhi!!", charArray13);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihHHi!iHHi!hhhi!hhhi!hhi!hhhi!", charArray13);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.capitalize("hhhhi!ihhi!!", charArray13);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.initials("", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] {});
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hi!" + "'", str16, "Hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "h" + "'", str18, "h");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "HHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!hHIHI!!HI!HHI!IHI!!HI!!" + "'", str21, "HHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!hHIHI!!HI!HHI!IHI!!HI!!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "HHHHI!IHHIhhhi!hhhi!ihhi!!" + "'", str23, "HHHHI!IHHIhhhi!hhhi!ihhi!!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihHHi!iHHi!hhhi!hhhi!hhi!hhhi!" + "'", str24, "hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihHHi!iHHi!hhhi!hhhi!hhi!hhhi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hhhhi!ihhi!!" + "'", str25, "hhhhi!ihhi!!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test7733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7733");
        char[] charArray7 = new char[] {};
        java.lang.String str8 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("hi!", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray7);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("HhhI!IhhI!!", charArray7);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("hhhhi!ihhiHhhi!hhhi!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhhi!ihhi!!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HI!" + "'", str11, "HI!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HI!" + "'", str12, "HI!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hhhhi!ihhiHhhi!hhhi!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhhi!ihhi!!" + "'", str14, "hhhhi!ihhiHhhi!hhhi!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhhi!ihhi!!");
    }

    @Test
    public void test7734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7734");
        char[] charArray9 = new char[] { '#', '4', '4', '4' };
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!ihhi!hi!!", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("HHi!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("HhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!ihHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("HHHhHHhHHiHH!HHhHHhHHhHHiHH!HHhHHhHHhHHiHH!HHIHHhHHhHHiHH!HH!HHhHHhHHiHH!HHIHHhHHhHHiHH!HHhHHhHHhHHiHH!HHhHHhHHhHHiHH!HHIHHhHHhHHiHH!HH!HHhHHhHHiHH!HHHHHhHHhHHiHH!HHIHHhHHhHHiHH!HH!HHhHHhHHiHH!HH!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '#', '4', '4', '4' });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hi!" + "'", str10, "Hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hhhi!ihhi!hi!!" + "'", str11, "Hhhi!ihhi!hi!!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hhi!" + "'", str12, "Hhi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H" + "'", str13, "H");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HHHhHHhHHiHH!HHhHHhHHhHHiHH!HHhHHhHHhHHiHH!HHIHHhHHhHHiHH!HH!HHhHHhHHiHH!HHIHHhHHhHHiHH!HHhHHhHHhHHiHH!HHhHHhHHhHHiHH!HHIHHhHHhHHiHH!HH!HHhHHhHHiHH!HHHHHhHHhHHiHH!HHIHHhHHhHHiHH!HH!HHhHHhHHiHH!HH!" + "'", str14, "HHHhHHhHHiHH!HHhHHhHHhHHiHH!HHhHHhHHhHHiHH!HHIHHhHHhHHiHH!HH!HHhHHhHHiHH!HHIHHhHHhHHiHH!HHhHHhHHhHHiHH!HHhHHhHHhHHiHH!HHIHHhHHhHHiHH!HH!HHhHHhHHiHH!HHHHHhHHhHHiHH!HHIHHhHHhHHiHH!HH!HHhHHhHHiHH!HH!");
    }

    @Test
    public void test7735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7735");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhhi!ihhi!hhhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihHhhhi!ihhi!HHI!iHI!!hi!!hhhhi!ihhi!HHI!iHI!!hi!!hhhhi!ihhi!HHI!iHI!!hi!!ihhhi!ihhi!HHI!iHI!!hi!!!hhhi!ihhi!HHI!iHI!!hi!!ihhhi!ihhi!HHI!iHI!!hi!!hhhhi!ihhi!HHI!iHI!!hi!!hhhhi!ihhi!HHI!iHI!!hi!!ihhhi!ihhi!HHI!iHI!!hi!!!hhhi!ihhi!HHI!iHI!!hi!!Hhhhi!ihhi!HHI!iHI!!hi!!Ihhhi!ihhi!HHI!iHI!!hi!!!", (int) (byte) 10, (int) (byte) 10, "hHHHI!HHHIhhHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!IHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhi!ihhi!hHHHI!HHHIhhHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!IHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!!" + "'", str4, "hhhi!ihhi!hHHHI!HHHIhhHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!IHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!!");
    }

    @Test
    public void test7736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7736");
        char[] charArray11 = new char[] {};
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray11);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray11);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhi!ihhi!!", charArray11);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("HHhi!hHhi!HHhi!IHhi!!", charArray11);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("hhHHHI!IHHIHHHI!hHHI!iHHI!!!HI!!HHhHHHI!IHHIHHHI!hHHI!iHHI!!!HI!!HHhHHHI!IHHIHHHI!hHHI!iHHI!!!HI!!HHhHHHI!IHHIHHHI!hHHI!iHHI!!!HI!!HHhHHHI!IHHIHHHI!hHHI!iHHI!!!HI!!HHhHHHI!IHHIHHHI!hHHI!iHHI!!!HI!!HHhHHHI!IHHIHHHI!hHHI!iHHI!!!HI!!HHhHHHI!IHHIHHHI!hHHI!iHHI!!!HI!!HHhHHHI!IHHIHHHI!hHHI!iHHI!!!HI!!HIhHHHI!IHHIHHHI!hHHI!iHHI!!!HI!!HHhHHHI!IHHIHHHI!hHHI!iHHI!!!HI!!HHhHHHI!IHHIHHHI!hHHI!iHHI!!!HI!!HHhHHHI!IHHIHHHI!hHHI!iHHI!!!HI!!HHhHHHI!IHHIHHHI!hHHI!iHHI!!!HI!!HIhHHHI!IHHIHHHI!hHHI!iHHI!!!HI!!H!hHHHI!IHHIHHHI!hHHI!iHHI!!!HI!!HIhHHHI!IHHIHHHI!hHHI!iHHI!!!HI!!HHhHHHI!IHHIHHHI!hHHI!iHHI!!!HI!!HHhHHHI!IHHIHHHI!hHHI!iHHI!!!HI!!HIhHHHI!IHHIHHHI!hHHI!iHHI!!!HI!!H!hHHHI!IHHIHHHI!hHHI!iHHI!!!HI!!HHhHHHI!IHHIHHHI!hHHI!iHHI!!!HI!!HIhHHHI!IHHIHHHI!hHHI!iHHI!!!HI!!H!hHHHI!IHHIHHHI!hHHI!iHHI!!!HI!!H!", charArray11);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalize("", charArray11);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.uncapitalize("hHhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!ihHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!!", charArray11);
        java.lang.Class<?> wildcardClass23 = charArray11.getClass();
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] {});
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hhhi!ihhi!!" + "'", str18, "hhhi!ihhi!!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "HHhi!hHhi!HHhi!IHhi!!" + "'", str19, "HHhi!hHhi!HHhi!IHhi!!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hhHHHI!IHHIHHHI!hHHI!iHHI!!!HI!!HHhHHHI!IHHIHHHI!hHHI!iHHI!!!HI!!HHhHHHI!IHHIHHHI!hHHI!iHHI!!!HI!!HHhHHHI!IHHIHHHI!hHHI!iHHI!!!HI!!HHhHHHI!IHHIHHHI!hHHI!iHHI!!!HI!!HHhHHHI!IHHIHHHI!hHHI!iHHI!!!HI!!HHhHHHI!IHHIHHHI!hHHI!iHHI!!!HI!!HHhHHHI!IHHIHHHI!hHHI!iHHI!!!HI!!HHhHHHI!IHHIHHHI!hHHI!iHHI!!!HI!!HIhHHHI!IHHIHHHI!hHHI!iHHI!!!HI!!HHhHHHI!IHHIHHHI!hHHI!iHHI!!!HI!!HHhHHHI!IHHIHHHI!hHHI!iHHI!!!HI!!HHhHHHI!IHHIHHHI!hHHI!iHHI!!!HI!!HHhHHHI!IHHIHHHI!hHHI!iHHI!!!HI!!HIhHHHI!IHHIHHHI!hHHI!iHHI!!!HI!!H!hHHHI!IHHIHHHI!hHHI!iHHI!!!HI!!HIhHHHI!IHHIHHHI!hHHI!iHHI!!!HI!!HHhHHHI!IHHIHHHI!hHHI!iHHI!!!HI!!HHhHHHI!IHHIHHHI!hHHI!iHHI!!!HI!!HIhHHHI!IHHIHHHI!hHHI!iHHI!!!HI!!H!hHHHI!IHHIHHHI!hHHI!iHHI!!!HI!!HHhHHHI!IHHIHHHI!hHHI!iHHI!!!HI!!HIhHHHI!IHHIHHHI!hHHI!iHHI!!!HI!!H!hHHHI!IHHIHHHI!hHHI!iHHI!!!HI!!H!" + "'", str20, "hhHHHI!IHHIHHHI!hHHI!iHHI!!!HI!!HHhHHHI!IHHIHHHI!hHHI!iHHI!!!HI!!HHhHHHI!IHHIHHHI!hHHI!iHHI!!!HI!!HHhHHHI!IHHIHHHI!hHHI!iHHI!!!HI!!HHhHHHI!IHHIHHHI!hHHI!iHHI!!!HI!!HHhHHHI!IHHIHHHI!hHHI!iHHI!!!HI!!HHhHHHI!IHHIHHHI!hHHI!iHHI!!!HI!!HHhHHHI!IHHIHHHI!hHHI!iHHI!!!HI!!HHhHHHI!IHHIHHHI!hHHI!iHHI!!!HI!!HIhHHHI!IHHIHHHI!hHHI!iHHI!!!HI!!HHhHHHI!IHHIHHHI!hHHI!iHHI!!!HI!!HHhHHHI!IHHIHHHI!hHHI!iHHI!!!HI!!HHhHHHI!IHHIHHHI!hHHI!iHHI!!!HI!!HHhHHHI!IHHIHHHI!hHHI!iHHI!!!HI!!HIhHHHI!IHHIHHHI!hHHI!iHHI!!!HI!!H!hHHHI!IHHIHHHI!hHHI!iHHI!!!HI!!HIhHHHI!IHHIHHHI!hHHI!iHHI!!!HI!!HHhHHHI!IHHIHHHI!hHHI!iHHI!!!HI!!HHhHHHI!IHHIHHHI!hHHI!iHHI!!!HI!!HIhHHHI!IHHIHHHI!hHHI!iHHI!!!HI!!H!hHHHI!IHHIHHHI!hHHI!iHHI!!!HI!!HHhHHHI!IHHIHHHI!hHHI!iHHI!!!HI!!HIhHHHI!IHHIHHHI!hHHI!iHHI!!!HI!!H!hHHHI!IHHIHHHI!hHHI!iHHI!!!HI!!H!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hHhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!ihHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!!" + "'", str22, "hHhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!ihHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!!");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test7737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7737");
        char[] charArray9 = new char[] {};
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("hi!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("Hhhi!ihhi!!", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("hH", charArray9);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("HHH", charArray9);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("hhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HihHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!H!hHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HHhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HihHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!H!hHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HIhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HihHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!H!hHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!H!", charArray9);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("hHHi!iHHi!hHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!", charArray9);
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
    public void test7738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7738");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHI!IHHI!HHhhhi!ihhi!hi!!h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!ihhi!hhhhhi!ihhi!hi!!h" + "'", str1, "Hhhi!ihhi!hhhhhi!ihhi!hi!!h");
    }

    @Test
    public void test7739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7739");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHHHH", (int) '4', "HhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HIhhHHHI!IHhHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhi!ihhi!!!Hhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhi!ihhi!!!Hhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhi!ihhi!!!Hhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhi!ihhi!!!Hhhhi!hhhiHhhi!hhhi!ihhi!!!Hhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhi!ihhi!!!Hhhhi!hhhiHhhi!hhhi!ihhi!!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHHHH" + "'", str4, "hHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHHHH");
    }

    @Test
    public void test7740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7740");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HhH", (int) '#', (int) (byte) 1, "hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!ihhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end 35, length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7741");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("Hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhhi!hhhi!hhi!hhhi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhhi!hhhi!hhi!hhhi!" + "'", str1, "Hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhhi!hhhi!hhi!hhhi!");
    }

    @Test
    public void test7742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7742");
        char[] charArray12 = new char[] { '#', ' ', '4' };
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray12);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray12);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("hH", charArray12);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("hhI!HhI!HhhhHHI!HHHI!Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!", charArray12);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("HHhhi!", charArray12);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("HHHh", charArray12);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.uncapitalize("HHh", charArray12);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.uncapitalize("HHHi!iHHi!HhH", charArray12);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhihhhhi!ihhi!hi!!h", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '#', ' ', '4' });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hi!" + "'", str13, "Hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hi!" + "'", str14, "Hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HH" + "'", str15, "HH");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hhI!HhI!HhhhHHI!HHHI!Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!" + "'", str16, "hhI!HhI!HhhhHHI!HHHI!Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HHhhi!" + "'", str17, "HHhhi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HHHh" + "'", str18, "HHHh");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hHh" + "'", str19, "hHh");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hHHi!iHHi!HhH" + "'", str20, "hHHi!iHHi!HhH");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Hhhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhihhhhi!ihhi!hi!!h" + "'", str21, "Hhhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhihhhhi!ihhi!hi!!h");
    }

    @Test
    public void test7743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7743");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhhi!hhhihhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!" + "'", str1, "Hhhhhi!hhhihhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!");
    }

    @Test
    public void test7744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7744");
        char[] charArray12 = new char[] {};
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray12);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("", charArray12);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("hi!", charArray12);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("", charArray12);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("Hhhi!ihhi!!", charArray12);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("hH", charArray12);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("HHH", charArray12);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("hhhi!hhhi!ihhi!!", charArray12);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhHhh", charArray12);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!ihhi!HI!", charArray12);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalizeFully("hH", charArray12);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhhhhhi!hhhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] {});
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "HHH" + "'", str19, "HHH");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hhhi!hhhi!ihhi!!" + "'", str20, "hhhi!hhhi!ihhi!!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhHhh" + "'", str21, "Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhHhh");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Hhhi!ihhi!HI!" + "'", str22, "Hhhi!ihhi!HI!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hH" + "'", str23, "hH");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhhhhhi!hhhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!" + "'", str24, "Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhhhhhi!hhhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
    }

    @Test
    public void test7745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7745");
        char[] charArray6 = new char[] {};
        java.lang.String str7 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray6);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.initials("", charArray6);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalizeFully("Hh", charArray6);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("hH", charArray6);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("hHHI!IHHI!HI!!", charArray6);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!!hhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!!hhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!!", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Hh" + "'", str9, "Hh");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hHHI!IHHI!HI!!" + "'", str11, "hHHI!IHHI!HI!!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!!hhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!!hhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!!" + "'", str12, "Hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!!hhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!!hhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!!");
    }

    @Test
    public void test7746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7746");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HhHhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihhhhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!!hh!HhhHhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihhhhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!!hh!HHhHhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihhhhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!!hh!HIhHhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihhhhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!!hh!H!", (int) (short) 1, (-1), "HHHHI!HHHIhhHHI!!IHHI!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HhHhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihhhhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!!hh!HhhHhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihhhhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!!hh!HHhHhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihhhhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!!hh!HIhHhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihhhhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!!hh!H!" + "'", str4, "HhHhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihhhhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!!hh!HhhHhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihhhhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!!hh!HHhHhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihhhhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!!hh!HIhHhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihhhhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!!hh!H!");
    }

    @Test
    public void test7747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7747");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hHhi!Ihi!!hHhi!Ihi!!hHhi!Ihi!!hHhi!Ihi!!iHhi!Ihi!!!Hhi!Ihi!!hHhi!Ihi!!hHhi!Ihi!!hHhi!Ihi!!iHhi!Ihi!!!Hhi!Ihi!!iHhi!Ihi!!hHhi!Ihi!!hHhi!Ihi!!iHhi!Ihi!!!Hhi!Ihi!!!", (-1), "HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHhi!Ihi!!hHhi!Ihi!!hHhi!Ihi!!hHhi!Ihi!!iHhi!Ihi!!!Hhi!Ihi!!hHhi!Ihi!!hHhi!Ihi!!hHhi!Ihi!!iHhi!Ihi!!!Hhi!Ihi!!iHhi!Ihi!!hHhi!Ihi!!hHhi!Ihi!!iHhi!Ihi!!!Hhi!Ihi!!!" + "'", str4, "hHhi!Ihi!!hHhi!Ihi!!hHhi!Ihi!!hHhi!Ihi!!iHhi!Ihi!!!Hhi!Ihi!!hHhi!Ihi!!hHhi!Ihi!!hHhi!Ihi!!iHhi!Ihi!!!Hhi!Ihi!!iHhi!Ihi!!hHhi!Ihi!!hHhi!Ihi!!iHhi!Ihi!!!Hhi!Ihi!!!");
    }

    @Test
    public void test7748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7748");
        char[] charArray8 = new char[] {};
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhhi!ihhi!hi!!h", charArray8);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhHhhi!hhhi!hhhi!", charArray8);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("Hhhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!hhhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!hhhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!hhhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!ihhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!!hhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!ihhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!hhhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!hhhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!ihhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!!hhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hi!" + "'", str12, "Hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hhhhhi!ihhi!hi!!h" + "'", str14, "Hhhhhi!ihhi!hi!!h");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhHhhi!hhhi!hhhi!" + "'", str15, "Hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhHhhi!hhhi!hhhi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test7749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7749");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("Hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!" + "'", str1, "Hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
    }

    @Test
    public void test7750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7750");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hHhHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!!Hhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!!Hhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!!Hhi!Ihi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHhHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!!Hhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!!Hhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!!Hhi!Ihi!!!" + "'", str1, "hHhHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!!Hhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!!Hhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!!Hhi!Ihi!!!");
    }

    @Test
    public void test7751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7751");
        char[] charArray7 = new char[] {};
        java.lang.String str8 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("Hh", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("HHhhhi!ihhi!hi!!h", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("hhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!", charArray7);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("hHhhI!IhhI!hhhi!ihhi!!HI!!", charArray7);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("HHhi!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hh" + "'", str10, "Hh");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!" + "'", str12, "hhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hHhhI!IhhI!hhhi!ihhi!!HI!!" + "'", str13, "hHhhI!IhhI!hhhi!ihhi!!HI!!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HHhi!" + "'", str14, "HHhi!");
    }

    @Test
    public void test7752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7752");
        char[] charArray10 = new char[] {};
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("hi!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("Hhhi!ihhi!hhhi!ihhi!!hi!!", charArray10);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!HhhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!HHHI!hHHI!HHhi!", charArray10);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("hhhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhhhhi!hhhihhhi!hhhi!ihhi!!hi!!ihhhhi!ihhi!!!hhhhi!ihhi!!hhhhhhhhhi!hhhihhhi!hhhi!ihhi!!i!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!hhhhi!ihhi!!!hhhhi!ihhi!!ihhhhi!ihhhhhhi!hhhihhhi!hhhi!ihhi!!i!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhihhhhi!hhhihhhi!hhhi!ihhi!!!ihhi!!!hhhhi!ihhi!!!", charArray10);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hi!" + "'", str14, "Hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!" + "'", str16, "hhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hhhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!HhhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!HHHI!hHHI!HHhi!" + "'", str18, "hhhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!HhhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!HHHI!hHHI!HHhi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hhhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhhhhi!hhhihhhi!hhhi!ihhi!!hi!!ihhhhi!ihhi!!!hhhhi!ihhi!!hhhhhhhhhi!hhhihhhi!hhhi!ihhi!!i!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!hhhhi!ihhi!!!hhhhi!ihhi!!ihhhhi!ihhhhhhi!hhhihhhi!hhhi!ihhi!!i!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhihhhhi!hhhihhhi!hhhi!ihhi!!!ihhi!!!hhhhi!ihhi!!!" + "'", str19, "hhhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhhhhi!hhhihhhi!hhhi!ihhi!!hi!!ihhhhi!ihhi!!!hhhhi!ihhi!!hhhhhhhhhi!hhhihhhi!hhhi!ihhi!!i!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!hhhhi!ihhi!!!hhhhi!ihhi!!ihhhhi!ihhhhhhi!hhhihhhi!hhhi!ihhi!!i!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhihhhhi!hhhihhhi!hhhi!ihhi!!!ihhi!!!hhhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test7753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7753");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!" + "'", str2, "hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
    }

    @Test
    public void test7754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7754");
        char[] charArray11 = new char[] { 'a', '4', 'a' };
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("HHHi!iHHi!!", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("hhhI!IhhI!HI!!", charArray11);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("hhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!HhHHHI!HHHI!IHHI!!HhHHHI!HHHI!IHHI!!IhHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!HhHHHI!HHHI!IHHI!!IhHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!!", charArray11);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!ihi!!hi!hhi!ihi!!hi!!hhhhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!ihi!!hi!hhi!ihi!!hi!!hhhhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!ihi!!hi!hhi!ihi!!hi!!hhhhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!ihi!!hi!hhi!ihi!!hi!!h", charArray11);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhi!hhhi!hhi!hhhi!", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { 'a', '4', 'a' });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hHHi!iHHi!!" + "'", str14, "hHHi!iHHi!!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hhhI!IhhI!HI!!" + "'", str16, "hhhI!IhhI!HI!!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!HhHHHI!HHHI!IHHI!!HhHHHI!HHHI!IHHI!!IhHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!HhHHHI!HHHI!IHHI!!IhHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!!" + "'", str17, "hhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!HhHHHI!HHHI!IHHI!!HhHHHI!HHHI!IHHI!!IhHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!HhHHHI!HHHI!IHHI!!IhHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!ihHHHI!HHHI!IHHI!!!hHHHI!HHHI!IHHI!!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hhhhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!ihi!!hi!hhi!ihi!!hi!!hhhhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!ihi!!hi!hhi!ihi!!hi!!hhhhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!ihi!!hi!hhi!ihi!!hi!!hhhhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!ihi!!hi!hhi!ihi!!hi!!h" + "'", str18, "Hhhhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!ihi!!hi!hhi!ihi!!hi!!hhhhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!ihi!!hi!hhi!ihi!!hi!!hhhhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!ihi!!hi!hhi!ihi!!hi!!hhhhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!ihi!!hi!hhi!ihi!!hi!!h");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Hhhhi!hhhi!hhi!hhhi!" + "'", str19, "Hhhhi!hhhi!hhi!hhhi!");
    }

    @Test
    public void test7755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7755");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHHHI!IHHI!HHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHHHHHI!HHHI!HHHI!IHHI!!HHI!IHHI!HHHI!HHHI!IHHI!!HHI!HHHI!IHHI!!HHI!!!HH!H", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHHHI!IHHI!HHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHHHHHI!HHHI!HHHI!IHHI!!HHI!IHHI!HHHI!HHHI!IHHI!!HHI!HHHI!IHHI!!HHI!!!HH!H" + "'", str2, "hHHHI!IHHI!HHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHHHHHI!HHHI!HHHI!IHHI!!HHI!IHHI!HHHI!HHHI!IHHI!!HHI!HHHI!IHHI!!HHI!!!HH!H");
    }

    @Test
    public void test7756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7756");
        char[] charArray10 = new char[] {};
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("hi!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhi!ihhi!hhi!ihi!!hi!!", charArray10);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("", charArray10);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hihhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!h!hhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hihhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!h!hhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hihhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hihhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!h!hhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!h!", charArray10);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHHHHI!IHHI!HHI!IHI!!HI!!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HI!" + "'", str14, "HI!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hi!" + "'", str16, "Hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hhhi!ihhi!hhi!ihi!!hi!!" + "'", str17, "hhhi!ihhi!hhi!ihi!!hi!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Hhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hihhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!h!hhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hihhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!h!hhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hihhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hihhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!h!hhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!h!" + "'", str19, "Hhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hihhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!h!hhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hihhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!h!hhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hihhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hihhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!h!hhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!hhhhhhi!ihhi!hi!!h!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHHHHI!IHHI!HHI!IHI!!HI!!" + "'", str20, "HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHHHHI!IHHI!HHI!IHI!!HI!!");
    }

    @Test
    public void test7757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7757");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hhHhhi!hHhhi!hHhhi!iHhhi!!Hhhi!iHhhhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhhh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHhHHI!HhHHI!HhHHI!IhHHI!!hHHI!IhHHHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHHHH" + "'", str1, "HHhHHI!HhHHI!HhHHI!IhHHI!!hHHI!IhHHHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHHHH");
    }

    @Test
    public void test7758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7758");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HHhhi!hhhi!hHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HhHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!IHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!!HHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!", 0, "HhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!hhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!Hhhhi!hhhi!ihhi!!HHHHI!IHHIHHHI!hHHI!iHHI!!!HI!!H", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHhhi!hhhi!hHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HhHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!IHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!!HHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!" + "'", str4, "HHhhi!hhhi!hHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HhHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!IHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!!HHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!");
    }

    @Test
    public void test7759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7759");
        char[] charArray8 = new char[] {};
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("hI!", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("h", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("HI!", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("hHHi!iHHi!HHHI!IHHI!!hi!!", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("hhhi!Hhhi!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!!", charArray8);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("HhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHHHhhhi!ihhi!!HHhhhi!ihhi!!HHhhhi!ihHhhhi!hhhiHhhi!hhhi!ihhi!!hi!!IHhhhi!ihhi!!!Hhhhi!ihhi!!HHhhhHhhhi!hhhiHhhi!hhhi!ihhi!!i!ihhi!!HHhhhi!ihhi!!HHhhhi!ihhi!!IHhhhi!hhhiHhhi!hhhi!ihhi!!Hhhhi!ihhi!!!Hhhhi!ihhi!!IHhhhi!ihhHhhhi!hhhiHhhi!hhhi!ihhi!!i!!HHhhhi!ihhi!!HHhhhi!ihhi!!IHhhhiHhhhi!hhhiHhhi!hhhi!ihhi!!!ihhi!!!Hhhhi!ihhi!!!", charArray8);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHHHHHHHIHHHHi!iHHi!hi!!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hI!" + "'", str10, "hI!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hHHi!iHHi!HHHI!IHHI!!hi!!" + "'", str13, "hHHi!iHHi!HHHI!IHHI!!hi!!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hhhi!Hhhi!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!!" + "'", str14, "hhhi!Hhhi!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHHHhhhi!ihhi!!HHhhhi!ihhi!!HHhhhi!ihHhhhi!hhhiHhhi!hhhi!ihhi!!hi!!IHhhhi!ihhi!!!Hhhhi!ihhi!!HHhhhHhhhi!hhhiHhhi!hhhi!ihhi!!i!ihhi!!HHhhhi!ihhi!!HHhhhi!ihhi!!IHhhhi!hhhiHhhi!hhhi!ihhi!!Hhhhi!ihhi!!!Hhhhi!ihhi!!IHhhhi!ihhHhhhi!hhhiHhhi!hhhi!ihhi!!i!!HHhhhi!ihhi!!HHhhhi!ihhi!!IHhhhiHhhhi!hhhiHhhi!hhhi!ihhi!!!ihhi!!!Hhhhi!ihhi!!!" + "'", str15, "HhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHHHhhhi!ihhi!!HHhhhi!ihhi!!HHhhhi!ihHhhhi!hhhiHhhi!hhhi!ihhi!!hi!!IHhhhi!ihhi!!!Hhhhi!ihhi!!HHhhhHhhhi!hhhiHhhi!hhhi!ihhi!!i!ihhi!!HHhhhi!ihhi!!HHhhhi!ihhi!!IHhhhi!hhhiHhhi!hhhi!ihhi!!Hhhhi!ihhi!!!Hhhhi!ihhi!!IHhhhi!ihhHhhhi!hhhiHhhi!hhhi!ihhi!!i!!HHhhhi!ihhi!!HHhhhi!ihhi!!IHhhhiHhhhi!hhhiHhhi!hhhi!ihhi!!!ihhi!!!Hhhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hHHHHHHHHIHHHHi!iHHi!hi!!" + "'", str16, "hHHHHHHHHIHHHHi!iHHi!hi!!");
    }

    @Test
    public void test7760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7760");
        char[] charArray7 = new char[] {};
        java.lang.String str8 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("hi!", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray7);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray7);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHHi!iHHihhHHHI!IHHI!!hhHHHI!IHHI!!hhHHHI!IHhHHHI!HHHIhHHI!HHHI!IHHI!!HI!!ihHHHI!IHHI!!!hHHHI!IHHI!!hhHHHhHHHI!HHHIhHHI!HHHI!IHHI!!I!IHHI!!hhHHHI!IHHI!!hhHHHI!IHHI!!ihHHHI!HHHIhHHI!HHHI!IHHI!!hHHHI!IHHI!!!hHHHI!IHHI!!ihHHHI!IHHhHHHI!HHHIhHHI!HHHI!IHHI!!I!!hhHHHI!IHHI!!hhHHHI!IHHI!!ihHHHIhHHHI!HHHIhHHI!HHHI!IHHI!!!IHHI!!!hHHHI!IHHI!!!", charArray7);
        java.lang.Class<?> wildcardClass15 = charArray7.getClass();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hi!" + "'", str11, "Hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hHHHi!iHHihhHHHI!IHHI!!hhHHHI!IHHI!!hhHHHI!IHhHHHI!HHHIhHHI!HHHI!IHHI!!HI!!ihHHHI!IHHI!!!hHHHI!IHHI!!hhHHHhHHHI!HHHIhHHI!HHHI!IHHI!!I!IHHI!!hhHHHI!IHHI!!hhHHHI!IHHI!!ihHHHI!HHHIhHHI!HHHI!IHHI!!hHHHI!IHHI!!!hHHHI!IHHI!!ihHHHI!IHHhHHHI!HHHIhHHI!HHHI!IHHI!!I!!hhHHHI!IHHI!!hhHHHI!IHHI!!ihHHHIhHHHI!HHHIhHHI!HHHI!IHHI!!!IHHI!!!hHHHI!IHHI!!!" + "'", str14, "hHHHi!iHHihhHHHI!IHHI!!hhHHHI!IHHI!!hhHHHI!IHhHHHI!HHHIhHHI!HHHI!IHHI!!HI!!ihHHHI!IHHI!!!hHHHI!IHHI!!hhHHHhHHHI!HHHIhHHI!HHHI!IHHI!!I!IHHI!!hhHHHI!IHHI!!hhHHHI!IHHI!!ihHHHI!HHHIhHHI!HHHI!IHHI!!hHHHI!IHHI!!!hHHHI!IHHI!!ihHHHI!IHHhHHHI!HHHIhHHI!HHHI!IHHI!!I!!hhHHHI!IHHI!!hhHHHI!IHHI!!ihHHHIhHHHI!HHHIhHHI!HHHI!IHHI!!!IHHI!!!hHHHI!IHHI!!!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test7761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7761");
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
        java.lang.String str22 = org.apache.commons.lang.WordUtils.uncapitalize("hhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHHI!IHHIHHHi!iHHi!hHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!", charArray11);
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHHI!IHHIHHHi!iHHi!hHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!" + "'", str22, "hhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHHI!IHHIHHHi!iHHi!hHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!");
    }

    @Test
    public void test7762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7762");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("Hhhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!" + "'", str1, "hHHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!");
    }

    @Test
    public void test7763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7763");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hHhhI!IhhI!hHHHi!iHHi!hi!!HHHhhI!IhhI!hHHHi!iHHi!hi!!HHHhhI!IhhI!hHHHi!iHHi!hi!!HHHhhI!IhhI!hHHHi!iHHhhI!IhhI!hhhi!ihhi!!HI!!", (int) (byte) 10, "HhHhhI!IhhI!!HHhhI!IhhI!!HHhhI!IhhI!!HHhhI!IhhI!!IHhhI!IhhI!!!HhhI!IhhI!!HHhhI!IhhI!!HHhhI!IhhI!!HHhhhHHHHHHHHHHHHHHHIHHH!HHHHHHHHHHHHHHHIHHH!HHHIHHHHHHHHHHHIHHH!HHH!I!IhhI!!IHhhI!IhhI!!!HhhI!IhhI!!IHhhI!IhhI!!HHhhI!IhhI!!HHhhI!IhhI!!IHhhI!IhhI!!!HhhI!IhhI!!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHhhI!IhhI!hHHHi!iHHi!hi!!HHHhhI!IhhI!hHHHi!iHHi!hi!!HHHhhI!IhhI!hHHHi!iHHi!hi!!HHHhhI!IhhI!hHHHi!iHHhhI!IhhI!hhhi!ihhi!!HI!!" + "'", str4, "hHhhI!IhhI!hHHHi!iHHi!hi!!HHHhhI!IhhI!hHHHi!iHHi!hi!!HHHhhI!IhhI!hHHHi!iHHi!hi!!HHHhhI!IhhI!hHHHi!iHHhhI!IhhI!hhhi!ihhi!!HI!!");
    }

    @Test
    public void test7764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7764");
        char[] charArray7 = new char[] {};
        java.lang.String str8 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("h", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("Hhi!", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhHhh", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhhi!hhhiHHhhi!!ihhi!!", charArray7);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("hhhhi!ihhi!hhhi!ihhi!!hi!!", charArray7);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hhi!" + "'", str10, "Hhi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hhhhi!hhhiHHhhi!!ihhi!!" + "'", str12, "hhhhi!hhhiHHhhi!!ihhi!!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!" + "'", str14, "hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
    }

    @Test
    public void test7765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7765");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!ihhi!HHhhi!hhhi!hHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHHI!IHHI!hhHHI!HHHI!Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!ihhi!HHhhi!hhhi!hHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHHI!IHHI!hhHHI!HHHI!Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!" + "'", str1, "Hhhi!ihhi!HHhhi!hhhi!hHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHHI!IHHI!hhHHI!HHHI!Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
    }

    @Test
    public void test7766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7766");
        char[] charArray6 = new char[] { '#' };
        java.lang.String str7 = org.apache.commons.lang.WordUtils.uncapitalize("Hi!", charArray6);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.initials("hHi!", charArray6);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalize("hHHHI!HHHI!IHHI!!", charArray6);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("", charArray6);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("hHHHi!iHHi!hi!!H", charArray6);
        java.lang.Class<?> wildcardClass12 = charArray6.getClass();
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '#' });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "h" + "'", str8, "h");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HHHHI!HHHI!IHHI!!" + "'", str9, "HHHHI!HHHI!IHHI!!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "h" + "'", str11, "h");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test7767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7767");
        char[] charArray11 = new char[] {};
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("H", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("hhI!", charArray11);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("hH", charArray11);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("hHHi!iHHi!!", charArray11);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHi!iHHi!hi!!", charArray11);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.uncapitalize("hhhhi!ihhi!hi!!h", charArray11);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.uncapitalize("hhhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!HhhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!Hhhi!ihhi!HHI!iHI!!hi!!", charArray11);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalize("hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!HhHHi!iHHi!HHHI!IHHI!!hi!!", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] {});
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "HHHi!iHHi!hi!!" + "'", str19, "HHHi!iHHi!hi!!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hhhhi!ihhi!hi!!h" + "'", str20, "hhhhi!ihhi!hi!!h");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hhhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!HhhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!Hhhi!ihhi!HHI!iHI!!hi!!" + "'", str21, "hhhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!HhhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!Hhhi!ihhi!HHI!iHI!!hi!!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!HhHHi!iHHi!HHHI!IHHI!!hi!!" + "'", str22, "hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!HhHHi!iHHi!HHHI!IHHI!!hi!!");
    }

    @Test
    public void test7768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7768");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hhhi!hhhi!ihhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHI!HHHI!IHHI!!" + "'", str1, "HHHI!HHHI!IHHI!!");
    }

    @Test
    public void test7769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7769");
        char[] charArray7 = new char[] {};
        java.lang.String str8 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("H", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("HhhhI!IhhI!HI!!h", charArray7);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("hHHI!IHHI!HI!!", charArray7);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("hHhhhi!ihhhhhhi!ihhi!hhhi!ihhi!!hi!!", charArray7);
        java.lang.Class<?> wildcardClass15 = charArray7.getClass();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HhhhI!IhhI!HI!!h" + "'", str12, "HhhhI!IhhI!HI!!h");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hHHI!IHHI!HI!!" + "'", str13, "hHHI!IHHI!HI!!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hHhhhi!ihhhhhhi!ihhi!hhhi!ihhi!!hi!!" + "'", str14, "hHhhhi!ihhhhhhi!ihhi!hhhi!ihhi!!hi!!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test7770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7770");
        char[] charArray9 = new char[] {};
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("hi!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray9);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("HHhHhHhHhHhHhHhHiHhH!HhHhHhHhHhHhHhHiHhH!HhHiHhHhHhHhHhHiHhH!HhH!", charArray9);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHHHI!HHHI!IHHI!!", charArray9);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhi!ihhihhhi!ihhi!hhhi!ihhi!hi!!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hi!" + "'", str13, "Hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hi!" + "'", str15, "Hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hHHHHI!HHHI!IHHI!!" + "'", str17, "hHHHHI!HHHI!IHHI!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hhhhi!ihhihhhi!ihhi!hhhi!ihhi!hi!!" + "'", str18, "Hhhhi!ihhihhhi!ihhi!hhhi!ihhi!hi!!");
    }

    @Test
    public void test7771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7771");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!!", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!!" + "'", str2, "hHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!!");
    }

    @Test
    public void test7772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7772");
        char[] charArray13 = new char[] { '#', '4', '4', '4' };
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray13);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray13);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("", charArray13);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("H", charArray13);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("hhI!HhI!HhhhHHI!HHHI!Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!", charArray13);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!ihhi!hhhhi!ihhi!hi!!h", charArray13);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.uncapitalize("HhHHHI!IHHI!HI!!H", charArray13);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.initials("Hhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhHHHi!iHHi!hHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!", charArray13);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalizeFully("hhI!HhI!HhhHh", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '#', '4', '4', '4' });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hi!" + "'", str14, "Hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hi!" + "'", str15, "Hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H" + "'", str17, "H");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hhI!HhI!HhhhHHI!HHHI!Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!" + "'", str18, "hhI!HhI!HhhhHHI!HHHI!Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Hhhi!ihhi!hhhhi!ihhi!hi!!h" + "'", str19, "Hhhi!ihhi!hhhhi!ihhi!hi!!h");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hhHHHI!IHHI!HI!!H" + "'", str20, "hhHHHI!IHHI!HI!!H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "H" + "'", str21, "H");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Hhi!hhi!hhhhh" + "'", str22, "Hhi!hhi!hhhhh");
    }

    @Test
    public void test7773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7773");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHhhi!ihhi!HHHi!iHHi!hi!!", (int) (short) 100, 100, "Hhhhi!hhhihhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end 100, length 25");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7774");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hHHHHHI!HHHI!IHHI!!HHHHHI!HHHI!IHHI!!HHHHHI!HHHI!IHHI!!IHHHHI!HHHI!IHHI!!!HHHHI!HHHI!IHHI!!IHHHHI!HHHI!IHHI!!HHHHHI!HHHI!IHHI!!HHHHHI!HHHI!IHHI!!IHHHHI!HHHI!IHHI!!!HHHHI!HHHI!IHHI!!HHHHHI!HHHI!IHHI!!HHHHHI!HHHI!IHHI!!IHHHHI!HHHI!IHHI!!!HHHHI!HHHI!IHHI!!IHHHHI!HHHI!IHHI!!HHHHHI!HHHI!IHHI!!IHHHHI!HHHI!IHHI!!!HHHHI!HHHI!IHHI!!!HHHHI!HHHI!IHHI!!HHHHHI!HHHI!IHHI!!IHHHHI!HHHI!IHHI!!!HHHHI!HHHI!IHHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test7775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7775");
        char[] charArray8 = new char[] {};
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHi!iHHi!hi!!", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!ihhi!hi!!", charArray8);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("HhHhhi!ihhi!hi!!HHhhi!ihhi!hi!!HHhhi!ihhi!hi!!IHhhi!ihhi!hi!!!Hhhi!ihhi!hi!!IHhhi!ihhi!hi!!HHhhi!ihhiHHHI!hHHI!hHi!HHhi!!hi!!HHhhi!ihhi!hi!!IHhhi!ihhi!hi!!!Hhhi!ihhi!hi!!HHhhi!ihhi!hi!!HHhhi!ihhi!hi!!HHhhi!ihhi!hi!!HHhhiHHHI!hHHI!hHi!HHhi!!ihhi!hi!!IHhhi!ihhi!hi!!!Hhhi!ihhi!hi!!IHhhi!ihhi!hi!!HHhhi!ihhi!hi!!HHhhi!ihhi!hi!!IHhhi!ihhi!hi!!HHHI!hHHI!hHi!HHhi!!Hhhi!ihhi!hi!!HHhhi!ihhi!hi!!IHhhi!ihhi!hi!!!Hhhi!ihhi!hi!!!Hhhi!ihhi!hi!!H", charArray8);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("hhhhhi!hhhhhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhHHhHhHhHhHhHhHhHiHhH!HhHhHhHhHhHhHhHiHhH!HhHiHhHhHhHhHhHiHhH!HhH!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HHHi!iHHi!hi!!" + "'", str13, "HHHi!iHHi!hi!!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hhhi!ihhi!hi!!" + "'", str14, "Hhhi!ihhi!hi!!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HhHhhi!ihhi!hi!!HHhhi!ihhi!hi!!HHhhi!ihhi!hi!!IHhhi!ihhi!hi!!!Hhhi!ihhi!hi!!IHhhi!ihhi!hi!!HHhhi!ihhiHHHI!hHHI!hHi!HHhi!!hi!!HHhhi!ihhi!hi!!IHhhi!ihhi!hi!!!Hhhi!ihhi!hi!!HHhhi!ihhi!hi!!HHhhi!ihhi!hi!!HHhhi!ihhi!hi!!HHhhiHHHI!hHHI!hHi!HHhi!!ihhi!hi!!IHhhi!ihhi!hi!!!Hhhi!ihhi!hi!!IHhhi!ihhi!hi!!HHhhi!ihhi!hi!!HHhhi!ihhi!hi!!IHhhi!ihhi!hi!!HHHI!hHHI!hHi!HHhi!!Hhhi!ihhi!hi!!HHhhi!ihhi!hi!!IHhhi!ihhi!hi!!!Hhhi!ihhi!hi!!!Hhhi!ihhi!hi!!H" + "'", str15, "HhHhhi!ihhi!hi!!HHhhi!ihhi!hi!!HHhhi!ihhi!hi!!IHhhi!ihhi!hi!!!Hhhi!ihhi!hi!!IHhhi!ihhi!hi!!HHhhi!ihhiHHHI!hHHI!hHi!HHhi!!hi!!HHhhi!ihhi!hi!!IHhhi!ihhi!hi!!!Hhhi!ihhi!hi!!HHhhi!ihhi!hi!!HHhhi!ihhi!hi!!HHhhi!ihhi!hi!!HHhhiHHHI!hHHI!hHi!HHhi!!ihhi!hi!!IHhhi!ihhi!hi!!!Hhhi!ihhi!hi!!IHhhi!ihhi!hi!!HHhhi!ihhi!hi!!HHhhi!ihhi!hi!!IHhhi!ihhi!hi!!HHHI!hHHI!hHi!HHhi!!Hhhi!ihhi!hi!!HHhhi!ihhi!hi!!IHhhi!ihhi!hi!!!Hhhi!ihhi!hi!!!Hhhi!ihhi!hi!!H");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hhhhhi!hhhhhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhHHhHhHhHhHhHhHhHiHhH!HhHhHhHhHhHhHhHiHhH!HhHiHhHhHhHhHhHiHhH!HhH!" + "'", str16, "hhhhhi!hhhhhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhHHhHhHhHhHhHhHhHiHhH!HhHhHhHhHhHhHhHiHhH!HhHiHhHhHhHhHhHiHhH!HhH!");
    }

    @Test
    public void test7776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7776");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("Hhhi!ihhi!HHhhi!hhhi!hHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HhHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!IHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!!HHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHI!IHHI!hhHHI!HHHI!Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!" + "'", str1, "hHHI!IHHI!hhHHI!HHHI!Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
    }

    @Test
    public void test7777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7777");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhhhi!ihhihhhi!hhhi!ihhi!!!hi!!h", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhhi!ihhihhhi!hhhi!ihhi!!!hi!!h" + "'", str2, "Hhhhi!ihhihhhi!hhhi!ihhi!!!hi!!h");
    }

    @Test
    public void test7778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7778");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHHhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!!", (int) '#', (int) ' ', "hhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!!hHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!!hHHHI!IHHI!HI!!!hHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!!hHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!!hHHHI!IHHI!HI!!!hHHHI!IHHI!HI!!HhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!!hHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!HhHHHI!IHHI!HI!!HhHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!!hHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!HhHHHI!IHHI!HI!!HhHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!!hHHHI!IHHI!HI!!ihHHHI!IHHI!HI!!HhHHHI!IHHI!HI!!HhHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!!hHHHI!IHHI!HI!!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HhhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!!hHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!!hHHHI!IHHI!HI!!!hHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!!hHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!!hHHHI!IHHI!HI!!!hHHHI!IHHI!HI!!HhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!!hHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!HhHHHI!IHHI!HI!!HhHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!!hHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!HhHHHI!IHHI!HI!!HhHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!!hHHHI!IHHI!HI!!ihHHHI!IHHI!HI!!HhHHHI!IHHI!HI!!HhHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!!hHHHI!IHHI!HI!!!" + "'", str4, "HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HhhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!!hHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!!hHHHI!IHHI!HI!!!hHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!!hHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!!hHHHI!IHHI!HI!!!hHHHI!IHHI!HI!!HhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!!hHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!HhHHHI!IHHI!HI!!HhHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!!hHHHI!IHHI!HI!!hhHHHI!IHHI!HI!!HhHHHI!IHHI!HI!!HhHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!!hHHHI!IHHI!HI!!ihHHHI!IHHI!HI!!HhHHHI!IHHI!HI!!HhHHHI!IHHI!HI!!IhHHHI!IHHI!HI!!!hHHHI!IHHI!HI!!!");
    }

    @Test
    public void test7779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7779");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hHhhi!hhhi!hhhi!ihi!!hhhi!ihi!!hhhi!hHHI!IHHI!hi!HHhhi!hhhi!hhhi!ihi!!hhhi!ihi!!hhhi!hHHI!IHHI!hi!HHhhi!hhhi!hhhi!ihi!!hhhi!ihi!!hhhi!hHHI!IHHI!hi!HHhhi!hhhi!hhhi!ihi!!hhhi!ihi!!hhhi!hHHI!IHHI!hi!IHhhi!hhhi!hhhi!ihi!!hhhi!ihi!!hhhi!hHHI!IHHI!hi!!Hhhi!hhhi!hhhi!ihi!!hhhi!ihi!!hhhi!hHHI!IHHI!hi!IHhhi!hhhi!hhhi!ihi!!hhhi!ihi!!hhhi!hHHI!IHHI!hi!HHhhi!hhhi!hhhi!ihi!!hhhi!ihi!!hhhi!hHHI!IHHI!hi!HHhhi!hhhi!hhhi!ihi!!hhhi!ihi!!hhhi!hHHI!IHHI!hi!IHhhi!hhhi!hhhi!ihi!!hhhi!ihi!!hhhi!hHHI!IHHI!hi!!Hhhi!hhhi!hhhi!ihi!!hhhi!ihi!!hhhi!hHHI!IHHI!hi!HHhhi!hhhi!hhhi!ihi!!hhhi!ihi!!hhhi!hHHI!IHHI!hi!IHhhi!hhhi!hhhi!ihi!!hhhi!ihi!!hhhi!hHHI!IHHI!hi!!Hhhi!hhhi!hhhi!ihi!!hhhi!ihi!!hhhi!hHHI!IHHI!hi!!Hhhi!hhhi!hhhi!ihi!!hhhi!ihi!!hhhi!hHHI!IHHI!hi!H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHhhi!hhhi!hhhi!ihi!!hhhi!ihi!!hhhi!hHHI!IHHI!hi!HHhhi!hhhi!hhhi!ihi!!hhhi!ihi!!hhhi!hHHI!IHHI!hi!HHhhi!hhhi!hhhi!ihi!!hhhi!ihi!!hhhi!hHHI!IHHI!hi!HHhhi!hhhi!hhhi!ihi!!hhhi!ihi!!hhhi!hHHI!IHHI!hi!IHhhi!hhhi!hhhi!ihi!!hhhi!ihi!!hhhi!hHHI!IHHI!hi!!Hhhi!hhhi!hhhi!ihi!!hhhi!ihi!!hhhi!hHHI!IHHI!hi!IHhhi!hhhi!hhhi!ihi!!hhhi!ihi!!hhhi!hHHI!IHHI!hi!HHhhi!hhhi!hhhi!ihi!!hhhi!ihi!!hhhi!hHHI!IHHI!hi!HHhhi!hhhi!hhhi!ihi!!hhhi!ihi!!hhhi!hHHI!IHHI!hi!IHhhi!hhhi!hhhi!ihi!!hhhi!ihi!!hhhi!hHHI!IHHI!hi!!Hhhi!hhhi!hhhi!ihi!!hhhi!ihi!!hhhi!hHHI!IHHI!hi!HHhhi!hhhi!hhhi!ihi!!hhhi!ihi!!hhhi!hHHI!IHHI!hi!IHhhi!hhhi!hhhi!ihi!!hhhi!ihi!!hhhi!hHHI!IHHI!hi!!Hhhi!hhhi!hhhi!ihi!!hhhi!ihi!!hhhi!hHHI!IHHI!hi!!Hhhi!hhhi!hhhi!ihi!!hhhi!ihi!!hhhi!hHHI!IHHI!hi!H" + "'", str1, "hHhhi!hhhi!hhhi!ihi!!hhhi!ihi!!hhhi!hHHI!IHHI!hi!HHhhi!hhhi!hhhi!ihi!!hhhi!ihi!!hhhi!hHHI!IHHI!hi!HHhhi!hhhi!hhhi!ihi!!hhhi!ihi!!hhhi!hHHI!IHHI!hi!HHhhi!hhhi!hhhi!ihi!!hhhi!ihi!!hhhi!hHHI!IHHI!hi!IHhhi!hhhi!hhhi!ihi!!hhhi!ihi!!hhhi!hHHI!IHHI!hi!!Hhhi!hhhi!hhhi!ihi!!hhhi!ihi!!hhhi!hHHI!IHHI!hi!IHhhi!hhhi!hhhi!ihi!!hhhi!ihi!!hhhi!hHHI!IHHI!hi!HHhhi!hhhi!hhhi!ihi!!hhhi!ihi!!hhhi!hHHI!IHHI!hi!HHhhi!hhhi!hhhi!ihi!!hhhi!ihi!!hhhi!hHHI!IHHI!hi!IHhhi!hhhi!hhhi!ihi!!hhhi!ihi!!hhhi!hHHI!IHHI!hi!!Hhhi!hhhi!hhhi!ihi!!hhhi!ihi!!hhhi!hHHI!IHHI!hi!HHhhi!hhhi!hhhi!ihi!!hhhi!ihi!!hhhi!hHHI!IHHI!hi!IHhhi!hhhi!hhhi!ihi!!hhhi!ihi!!hhhi!hHHI!IHHI!hi!!Hhhi!hhhi!hhhi!ihi!!hhhi!ihi!!hhhi!hHHI!IHHI!hi!!Hhhi!hhhi!hhhi!ihi!!hhhi!ihi!!hhhi!hHHI!IHHI!hi!H");
    }

    @Test
    public void test7780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7780");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("Hhhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hHHHI!IHHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test7781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7781");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hhhi!ihhi!hhhi!hhhi!hhi!hhhi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test7782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7782");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhi!hhhi!hhhi!ihi!!hhhi!ihi!!hhhi!hHHI!IHHI!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!hhhi!hhhi!ihi!!hhhi!ihi!!hhhi!hhhi!ihhi!hi!" + "'", str1, "Hhhi!hhhi!hhhi!ihi!!hhhi!ihi!!hhhi!hhhi!ihhi!hi!");
    }

    @Test
    public void test7783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7783");
        char[] charArray9 = new char[] {};
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray9);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHHI!IHHIHHHI!IHHHHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!iHHHI!hHHI!iHHIhhhhI!IhhI!HI!!h", charArray9);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("Hhhhi!hhhiHHhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!", charArray9);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hi!" + "'", str13, "Hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "h" + "'", str15, "h");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hhhhi!hhhiHHhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!" + "'", str17, "Hhhhi!hhhiHHhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test7784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7784");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("HhhHhhHhhIhh!hhHhhHhhHhhIhh!hhHhhHhhHhhIhh!hhihhHhhHhhIhh!hh!hhHhhHhhIhh!hhihhHhhHhhIhh!hhHhhHhhHHhhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!hhIhh!hhHhhHhhHhhIhh!hhihhHhhHhhIhh!hh!hhHhhHhhIhh!hhhhhHhhHhhIhh!hhihhHhhHhhIhh!hh!hhHhhHhhIhh!hHhhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!h!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhhhhhhihh!hhhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhihh!hhihhhhhhhhihh!hhhhhhhhhhhhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!hhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhihh!hhhhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!h!" + "'", str1, "Hhhhhhhhhihh!hhhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhihh!hhihhhhhhhhihh!hhhhhhhhhhhhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!hhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhihh!hhhhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!h!");
    }

    @Test
    public void test7785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7785");
        char[] charArray8 = new char[] {};
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("Hh", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("hH", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("hHHI!IHHI!HI!!", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("hhhI!IhhI!Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!", charArray8);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("hhhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hHhhI!IhhIHHHHI!HHHI!IHHI!!", charArray8);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!ihhi!hhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hh" + "'", str11, "Hh");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hHHI!IHHI!HI!!" + "'", str13, "hHHI!IHHI!HI!!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hhhI!IhhI!Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!" + "'", str14, "hhhI!IhhI!Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hhhi!ihhi!hhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!" + "'", str16, "Hhhi!ihhi!hhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
    }

    @Test
    public void test7786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7786");
        char[] charArray11 = new char[] { '#', '4', '4', '4' };
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("HHHi!iHHi!!", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("HhhhI!IhhI!HI!!", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("Hhhhhi!hhhi!ihhi!!", charArray11);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("hHhhI!IhhI!hhhi!ihhi!!HI!!", charArray11);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhi!hhi!hhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhhHhhhHHI!IHHI!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!!HHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!!HHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!!HHHI!IHHI!HHI!IHI!!HI!!!HHHHI!IHHIHHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!!HHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!!HHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!!HHHI!IHHI!HHI!IHI!!HI!!!!HI!!H", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '#', '4', '4', '4' });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hi!" + "'", str12, "Hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hi!" + "'", str13, "Hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H" + "'", str14, "H");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hhhhI!IhhI!HI!!" + "'", str15, "hhhhI!IhhI!HI!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hhhhhi!hhhi!ihhi!!" + "'", str16, "Hhhhhi!hhhi!ihhi!!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hHhhI!IhhI!hhhi!ihhi!!HI!!" + "'", str17, "hHhhI!IhhI!hhhi!ihhi!!HI!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hhi!hhi!hhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhhhhhhhhi!ihhi!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!!hhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!!hhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!!hhhi!ihhi!hhi!ihi!!hi!!!hhhhi!ihhihhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!!hhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!!hhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!!hhhi!ihhi!hhi!ihi!!hi!!!!hi!!h" + "'", str18, "Hhi!hhi!hhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhhhhhhhhi!ihhi!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!!hhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!!hhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!!hhhi!ihhi!hhi!ihi!!hi!!!hhhhi!ihhihhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!!hhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!!hhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!!hhhi!ihhi!hhi!ihi!!hi!!!!hi!!h");
    }

    @Test
    public void test7787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7787");
        char[] charArray9 = new char[] {};
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("Hi!", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray9);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray9);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("HHHi!iHHi!!", charArray9);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("hhHI!", charArray9);
        java.lang.Class<?> wildcardClass19 = charArray9.getClass();
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hi!" + "'", str14, "Hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hi!" + "'", str15, "Hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HHHi!iHHi!!" + "'", str17, "HHHi!iHHi!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hhHI!" + "'", str18, "hhHI!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test7788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7788");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hHHHHI!HHHHHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test7789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7789");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hhh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhh" + "'", str1, "hhh");
    }

    @Test
    public void test7790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7790");
        char[] charArray8 = new char[] { '#', '4', '4', '4' };
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!ihhi!hi!!", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("Hhhhhi!ihhhhhi!ihhi!!i!hi!!h", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("hhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HIhhHHHI!IHhHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhi!ihhi!!!Hhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhi!ihhi!!!Hhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhi!ihhi!!!Hhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhi!ihhi!!!Hhhhi!hhhiHhhi!hhhi!ihhi!!!Hhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhi!ihhi!!!Hhhhi!hhhiHhhi!hhhi!ihhi!!!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '#', '4', '4', '4' });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Hi!" + "'", str9, "Hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hhhi!ihhi!hi!!" + "'", str10, "Hhhi!ihhi!hi!!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H" + "'", str11, "H");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "h" + "'", str12, "h");
    }

    @Test
    public void test7791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7791");
        char[] charArray5 = new char[] {};
        java.lang.String str6 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray5);
        java.lang.String str7 = org.apache.commons.lang.WordUtils.initials("", charArray5);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalize("Hh", charArray5);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("HHhhhi!ihhi!hi!!h", charArray5);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhi!ihhi!hhhhhhhi!ihhi!hhhhhhhi!ihhi!hhhhhhhi!ihhi!hhhhhhhi!ihhi!hhhihhhi!ihhi!hhh!hhhi!ihhi!hhhhhhi!ihhi!hi!!hhhhi!ihhi!hi!!hhhhi!ihhi!hi!!ihhhi!ihhi!hi!!!hhhi!ihhi!hi!!ihhhi!ihhi!hi!!hhhhi!ihhi!hi!!hhhhi!ihhi!hi!!ihhhi!ihhi!hi!!!hhhi!ihhi!hi!!hhhhi!ihhi!hi!!hhhhi!ihhi!hi!!hhhhi!ihhi!hi!!hhhhi!ihhi!hi!!ihhhi!ihhi!hi!!!hhhi!ihhi!hi!!ihhhi!ihhi!hi!!hhhhi!ihhi!hi!!hhhhi!ihhi!hi!!ihhhi!ihhi!hi!!!hhhi!ihhi!hi!!hhhhi!ihhi!hi!!ihhhi!ihhi!hi!!!hhhi!ihhi!hi!!!hhhi!ihhi!hi!!h", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hh" + "'", str8, "Hh");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hhhhi!ihhi!hhhhhhhi!ihhi!hhhhhhhi!ihhi!hhhhhhhi!ihhi!hhhhhhhi!ihhi!hhhihhhi!ihhi!hhh!hhhi!ihhi!hhhhhhi!ihhi!hi!!hhhhi!ihhi!hi!!hhhhi!ihhi!hi!!ihhhi!ihhi!hi!!!hhhi!ihhi!hi!!ihhhi!ihhi!hi!!hhhhi!ihhi!hi!!hhhhi!ihhi!hi!!ihhhi!ihhi!hi!!!hhhi!ihhi!hi!!hhhhi!ihhi!hi!!hhhhi!ihhi!hi!!hhhhi!ihhi!hi!!hhhhi!ihhi!hi!!ihhhi!ihhi!hi!!!hhhi!ihhi!hi!!ihhhi!ihhi!hi!!hhhhi!ihhi!hi!!hhhhi!ihhi!hi!!ihhhi!ihhi!hi!!!hhhi!ihhi!hi!!hhhhi!ihhi!hi!!ihhhi!ihhi!hi!!!hhhi!ihhi!hi!!!hhhi!ihhi!hi!!h" + "'", str10, "Hhhhi!ihhi!hhhhhhhi!ihhi!hhhhhhhi!ihhi!hhhhhhhi!ihhi!hhhhhhhi!ihhi!hhhihhhi!ihhi!hhh!hhhi!ihhi!hhhhhhi!ihhi!hi!!hhhhi!ihhi!hi!!hhhhi!ihhi!hi!!ihhhi!ihhi!hi!!!hhhi!ihhi!hi!!ihhhi!ihhi!hi!!hhhhi!ihhi!hi!!hhhhi!ihhi!hi!!ihhhi!ihhi!hi!!!hhhi!ihhi!hi!!hhhhi!ihhi!hi!!hhhhi!ihhi!hi!!hhhhi!ihhi!hi!!hhhhi!ihhi!hi!!ihhhi!ihhi!hi!!!hhhi!ihhi!hi!!ihhhi!ihhi!hi!!hhhhi!ihhi!hi!!hhhhi!ihhi!hi!!ihhhi!ihhi!hi!!!hhhi!ihhi!hi!!hhhhi!ihhi!hi!!ihhhi!ihhi!hi!!!hhhi!ihhi!hi!!!hhhi!ihhi!hi!!h");
    }

    @Test
    public void test7792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7792");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhhhi!hhhhhhhhi!hhhi!ihhi!!", (int) '#', (int) (short) 10, "hHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHIHHHI!HHHI!IHHI!!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end 35, length 28");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7793");
        char[] charArray8 = new char[] { '#', ' ', '4' };
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("HHHi!iHHi!!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("hhhhi!hhhi!ihhi!!", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!ihi!!hi!hhi!ihi!!hi!!", charArray8);
        java.lang.Class<?> wildcardClass14 = charArray8.getClass();
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '#', ' ', '4' });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Hi!" + "'", str9, "Hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hHHi!iHHi!!" + "'", str11, "hHHi!iHHi!!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hhhhi!hhhi!ihhi!!" + "'", str12, "hhhhi!hhhi!ihhi!!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!ihi!!hi!hhi!ihi!!hi!!" + "'", str13, "Hhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!ihi!!hi!hhi!ihi!!hi!!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test7794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7794");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!H" + "'", str1, "hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!H");
    }

    @Test
    public void test7795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7795");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhHhhi!hhhi!ihhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test7796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7796");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhi!ihhi!hhhi!ihhi!!hi!!hhhhi!ihhi!hhhi!ihhi!!hi!!hhhhi!ihhi!hhhi!ihhi!!hi!!hhhhi!ihhi!hhhi!ihhi!!hi!!ihhhi!ihhi!hhhi!ihhi!!hi!!!hhhi!ihhi!hhhi!ihhi!!hi!!hhhhi!ihhi!hhhi!ihhi!!hi!!hhhhi!ihhi!hhhi!ihhi!!hi!!hhhhi!ihhi!hhhi!ihhi!!hi!!ihhhi!ihhi!hhhi!ihhi!!hi!!!hhhi!ihhi!hhhi!ihhi!!hi!!hhhhi!ihhi!hhhi!ihhi!!hi!!hhhhi!ihhi!hhhi!ihhi!!hi!!hhhhi!ihhi!hhhi!ihhi!!hi!!ihhhi!ihhi!hhhi!ihhi!!hi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhhi!ihhi!hhhi!ihhi!!hi!!hhhhi!ihhi!hhhi!ihhi!!hi!!hhhhi!ihhi!hhhi!ihhi!!hi!!hhhhi!ihhi!hhhi!ihhi!!hi!!ihhhi!ihhi!hhhi!ihhi!!hi!!!hhhi!ihhi!hhhi!ihhi!!hi!!hhhhi!ihhi!hhhi!ihhi!!hi!!hhhhi!ihhi!hhhi!ihhi!!hi!!hhhhi!ihhi!hhhi!ihhi!!hi!!ihhhi!ihhi!hhhi!ihhi!!hi!!!hhhi!ihhi!hhhi!ihhi!!hi!!hhhhi!ihhi!hhhi!ihhi!!hi!!hhhhi!ihhi!hhhi!ihhi!!hi!!hhhhi!ihhi!hhhi!ihhi!!hi!!ihhhi!ihhi!hhhi!ihhi!!hi!!!" + "'", str1, "hhhhi!ihhi!hhhi!ihhi!!hi!!hhhhi!ihhi!hhhi!ihhi!!hi!!hhhhi!ihhi!hhhi!ihhi!!hi!!hhhhi!ihhi!hhhi!ihhi!!hi!!ihhhi!ihhi!hhhi!ihhi!!hi!!!hhhi!ihhi!hhhi!ihhi!!hi!!hhhhi!ihhi!hhhi!ihhi!!hi!!hhhhi!ihhi!hhhi!ihhi!!hi!!hhhhi!ihhi!hhhi!ihhi!!hi!!ihhhi!ihhi!hhhi!ihhi!!hi!!!hhhi!ihhi!hhhi!ihhi!!hi!!hhhhi!ihhi!hhhi!ihhi!!hi!!hhhhi!ihhi!hhhi!ihhi!!hi!!hhhhi!ihhi!hhhi!ihhi!!hi!!ihhhi!ihhi!hhhi!ihhi!!hi!!!");
    }

    @Test
    public void test7797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7797");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHi!iHHi!HHHI!IHHI!!hi!!IHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test7798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7798");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hhHHI!IHHI!hHh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!ihhi!hhh" + "'", str1, "Hhhhi!ihhi!hhh");
    }

    @Test
    public void test7799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7799");
        char[] charArray11 = new char[] {};
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("", charArray11);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("Hi!", charArray11);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray11);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.uncapitalize("hHHi!iHHi!!", charArray11);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("HHhi!", charArray11);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.initials("hHHI!HHHI!IHHI!!", charArray11);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalize("hHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HhHHhHH", charArray11);
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hHHi!iHHi!!" + "'", str19, "hHHi!iHHi!!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HHhi!" + "'", str20, "HHhi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HhHHhHH" + "'", str22, "hHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HhHHhHH");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test7800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7800");
        char[] charArray12 = new char[] {};
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray12);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("", charArray12);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray12);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("hH", charArray12);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("hI!", charArray12);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("HI!", charArray12);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("HI!", charArray12);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhI!IhhI!HI!!", charArray12);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HhHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!IHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!!HHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!", charArray12);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.initials("hHHHI!IHHI!hhi!Ihi!!HI!!HHHHI!IHHI!hhi!Ihi!!HI!!HHHHI!IHHI!hhi!Ihi!!HI!!IHHHI!IHHI!hhi!Ihi!!HI!!!HHHI!IHHI!hhi!Ihi!!HI!!IHHHI!IHHI!hhi!Ihi!!HI!!HHHHI!IHHI!hhi!Ihi!!HI!!HHHHI!IHHI!hhi!Ihi!!HI!!IHHHI!IHHI!hhi!Ihi!!HI!!!HHHI!IHHI!hhi!Ihi!!HI!!hHHHI!IHHI!hhi!Ihi!!HI!!iHHHI!IHHI!hhi!Ihi!!HI!!!", charArray12);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!ihhi!hhhi!ihhi!hi!!", charArray12);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.initials("HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HhHHhHH", charArray12);
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HhHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!IHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!!HHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!" + "'", str21, "hHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HhHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!IHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!!HHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Hhhi!ihhi!hhhi!ihhi!hi!!" + "'", str23, "Hhhi!ihhi!hhhi!ihhi!hi!!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test7801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7801");
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
        java.lang.String str32 = org.apache.commons.lang.WordUtils.capitalize("HHHHi!iHHiHhhi!Hhhi!Ihhi!!!hi!!H", charArray16);
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
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "HHHHi!iHHiHhhi!Hhhi!Ihhi!!!hi!!H" + "'", str32, "HHHHi!iHHiHhhi!Hhhi!Ihhi!!!hi!!H");
    }

    @Test
    public void test7802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7802");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("Hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!!", 100, "HHHi!iHHi!hi!!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihiHHHi!iHHi!hi!!!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihiHHHi!iHHi!hi!!!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihiHHHi!iHHi!hi!!!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihiHHHi!iHHi!hi!!!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihiHHHi!iHHi!hi!!!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihiHHHi!iHHi!hi!!!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!!" + "'", str4, "Hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihiHHHi!iHHi!hi!!!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihiHHHi!iHHi!hi!!!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihiHHHi!iHHi!hi!!!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihiHHHi!iHHi!hi!!!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihiHHHi!iHHi!hi!!!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihiHHHi!iHHi!hi!!!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!!");
    }

    @Test
    public void test7803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7803");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!HhhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!Hhhi!ihhi!HHI!iHI!!hi!!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!HhhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!Hhhi!ihhi!HHI!iHI!!hi!!" + "'", str2, "hhhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!HhhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!Hhhi!ihhi!HHI!iHI!!hi!!");
    }

    @Test
    public void test7804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7804");
        char[] charArray13 = new char[] {};
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray13);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("", charArray13);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray13);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray13);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("Hh", charArray13);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.uncapitalize("Hi!", charArray13);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.uncapitalize("H", charArray13);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalize("hHI!", charArray13);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.uncapitalize("Hh", charArray13);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.initials("hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!iHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!iHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!iHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!iHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!", charArray13);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhi!ihhihhhi!hhhi!ihhi!!!hi!!h", charArray13);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhhhhi!ihhi!hi!!h", charArray13);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.capitalize("hHhhI!IhhI!hhhi!ihhi!!HI!!", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] {});
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hi!" + "'", str16, "Hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hh" + "'", str18, "Hh");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Hi!" + "'", str19, "Hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H" + "'", str20, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hHI!" + "'", str21, "hHI!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Hh" + "'", str22, "Hh");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Hhhhi!ihhihhhi!hhhi!ihhi!!!hi!!h" + "'", str24, "Hhhhi!ihhihhhi!hhhi!ihhi!!!hi!!h");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhhhhi!ihhi!hi!!h" + "'", str25, "Hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhhhhi!ihhi!hi!!h");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hHhhI!IhhI!hhhi!ihhi!!HI!!" + "'", str26, "hHhhI!IhhI!hhhi!ihhi!!HI!!");
    }

    @Test
    public void test7805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7805");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!!" + "'", str1, "hhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!!");
    }

    @Test
    public void test7806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7806");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhi!hhhi!hhhi!hhhi!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!", 0, (int) (short) 10, "hHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!HHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!hHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!hHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!hHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!iHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!!HhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!iHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!hHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!hHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!iHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!!HhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!hHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!iHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!!HhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!!HhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!h");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhi!hhhi!hHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!HHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!hHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!hHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!hHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!iHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!!HhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!iHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!hHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!hHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!iHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!!HhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!hHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!iHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!!HhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!!HhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!h" + "'", str4, "Hhhi!hhhi!hHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!HHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!hHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!hHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!hHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!iHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!!HhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!iHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!hHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!hHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!iHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!!HhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!hHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!iHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!!HhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!!HhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!h");
    }

    @Test
    public void test7807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7807");
        char[] charArray7 = new char[] {};
        java.lang.String str8 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray7);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray7);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!IhHHI!hHHI!iHHI!!!hHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!IhHHI!hHHI!iHHI!!!hHHI!hHHI!iHHI!!IhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!IhHHI!hHHI!iHHI!!!hHHI!hHHI!iHHI!!!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!IhHHI!hHHI!iHHI!!!hHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!IhHHI!hHHI!iHHI!!!hHHI!hHHI!iHHI!!IhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!IhHHI!hHHI!iHHI!!!hHHI!hHHI!iHHI!!!" + "'", str14, "HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!IhHHI!hHHI!iHHI!!!hHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!IhHHI!hHHI!iHHI!!!hHHI!hHHI!iHHI!!IhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!IhHHI!hHHI!iHHI!!!hHHI!hHHI!iHHI!!!");
    }

    @Test
    public void test7808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7808");
        char[] charArray10 = new char[] {};
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("h", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("Hhi!", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("hhhi!Hhhi!Ihhi!!", charArray10);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("Hhhhhhhhhhhhhhhhihhh!hhhhhhhhhhhhhhhihhh!hhhihhhhhhhhhhhihhh!hhh!", charArray10);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.initials("Hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhhhi!", charArray10);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.uncapitalize("HhHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!iHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!iHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!iHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!iHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hi!" + "'", str13, "Hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "h" + "'", str15, "h");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hhhi!Hhhi!Ihhi!!" + "'", str17, "hhhi!Hhhi!Ihhi!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hhhhhhhhhhhhhhhhihhh!hhhhhhhhhhhhhhhihhh!hhhihhhhhhhhhhhihhh!hhh!" + "'", str18, "Hhhhhhhhhhhhhhhhihhh!hhhhhhhhhhhhhhhihhh!hhhihhhhhhhhhhhihhh!hhh!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HhHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!iHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!iHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!iHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!iHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!" + "'", str20, "HhHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!iHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!iHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!iHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!hHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!iHhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!!");
    }

    @Test
    public void test7809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7809");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.uncapitalize("HHHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!iHHHI!hHHI!iHHIhhhhI!IhhI!HI!!h", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!iHHHI!hHHI!iHHIhhhhI!IhhI!HI!!h" + "'", str2, "hHHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!iHHHI!hHHI!iHHIhhhhI!IhhI!HI!!h");
    }

    @Test
    public void test7810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7810");
        char[] charArray10 = new char[] {};
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("Hh", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("HHHI!hHHI!iHHI!!", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhi!hhhiHhhi!hhhi!ihhi!!", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("HHhhi!", charArray10);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("hhhhi!ihhi!hi!!", charArray10);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("hHhhhi!ihhi!!hHhhhi!ihhi!!hHhhhi!ihhi!!hHhhhi!ihhi!!iHhhhi!ihhi!!!Hhhhi!ihhi!!iHhhhi!ihhi!!hHhhhi!ihhi!!hHhhhi!ihhi!!iHhhhi!ihhi!!!Hhhhi!ihhi!!hHhhhi!ihhi!!iHhhhi!ihhi!!!Hhhhi!ihhi!!!Hhhhi!ihhi!!h", charArray10);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.initials("", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hh" + "'", str13, "Hh");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HHHI!hHHI!iHHI!!" + "'", str15, "HHHI!hHHI!iHHI!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hhhhi!hhhiHhhi!hhhi!ihhi!!" + "'", str16, "Hhhhi!hhhiHhhi!hhhi!ihhi!!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hHhhhi!ihhi!!hHhhhi!ihhi!!hHhhhi!ihhi!!hHhhhi!ihhi!!iHhhhi!ihhi!!!Hhhhi!ihhi!!iHhhhi!ihhi!!hHhhhi!ihhi!!hHhhhi!ihhi!!iHhhhi!ihhi!!!Hhhhi!ihhi!!hHhhhi!ihhi!!iHhhhi!ihhi!!!Hhhhi!ihhi!!!Hhhhi!ihhi!!h" + "'", str19, "hHhhhi!ihhi!!hHhhhi!ihhi!!hHhhhi!ihhi!!hHhhhi!ihhi!!iHhhhi!ihhi!!!Hhhhi!ihhi!!iHhhhi!ihhi!!hHhhhi!ihhi!!hHhhhi!ihhi!!iHhhhi!ihhi!!!Hhhhi!ihhi!!hHhhhi!ihhi!!iHhhhi!ihhi!!!Hhhhi!ihhi!!!Hhhhi!ihhi!!h");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test7811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7811");
        char[] charArray13 = new char[] {};
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray13);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("", charArray13);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray13);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray13);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("", charArray13);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray13);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("H", charArray13);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalize("hH", charArray13);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalizeFully("hhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!ihi!!hi!hhi!ihi!!hi!!", charArray13);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalizeFully("HHI!iHI!!", charArray13);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihHhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhhhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihhhhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!!hh!", charArray13);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhi!ihhiHhhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhhhhi!hhhihhhi!hhhi!ihhi!!hi!!ihhhhi!ihhi!!!hhhhi!ihhi!!hhhhhhhhhi!hhhihhhi!hhhi!ihhi!!i!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!hhhhi!ihhi!!!hhhhi!ihhi!!ihhhhi!ihhhhhhi!hhhihhhi!hhhi!ihhi!!i!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhihhhhi!hhhihhhi!hhhi!ihhi!!!ihhi!!!hhhhi!ihhi!!!", charArray13);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.uncapitalize("hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihHHHHHI!IHHI!!HHHHHI!IHHI!!HHHHHI!IHHHHHI!HHHIHHHI!HHHI!IHHI!!HI!!IHHHHI!IHHI!!!HHHHI!IHHI!!HHHHHHhhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhHhhi!ihhi!HHI!iHI!!hi!!HHHI!HHHIHHHI!HHHI!IHHI!!I!IHHI!!HHHHHI!IHHI!!HHHHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHI!IHHI!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhHhhi!ihhi!HHI!iHI!!hi!!!!HHHHI!IHHI!!IHHHHI!IHHHHHHI!HHHIHHHI!HHHI!IHHI!!I!!HHHHHI!IHHI!!HHHHHI!IHHI!!IHHHHIHHHHI!HHHIHHhhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhHhhi!ihhi!HHI!iHI!!hi!!HI!HHHI!IHHI!!!IHHI!!!HHHHI!IHHI!!!", charArray13);
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!ihi!!hi!hhi!ihi!!hi!!" + "'", str22, "hhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!ihi!!hi!hhi!ihi!!hi!!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "HHI!iHI!!" + "'", str23, "HHI!iHI!!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihHhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhhhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihhhhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!!hh!" + "'", str24, "Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihHhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhhhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihhhhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!!hh!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Hhhhi!ihhiHhhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhhhhi!hhhihhhi!hhhi!ihhi!!hi!!ihhhhi!ihhi!!!hhhhi!ihhi!!hhhhhhhhhi!hhhihhhi!hhhi!ihhi!!i!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!hhhhi!ihhi!!!hhhhi!ihhi!!ihhhhi!ihhhhhhi!hhhihhhi!hhhi!ihhi!!i!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhihhhhi!hhhihhhi!hhhi!ihhi!!!ihhi!!!hhhhi!ihhi!!!" + "'", str25, "Hhhhi!ihhiHhhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhhhhi!hhhihhhi!hhhi!ihhi!!hi!!ihhhhi!ihhi!!!hhhhi!ihhi!!hhhhhhhhhi!hhhihhhi!hhhi!ihhi!!i!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!hhhhi!ihhi!!!hhhhi!ihhi!!ihhhhi!ihhhhhhi!hhhihhhi!hhhi!ihhi!!i!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhihhhhi!hhhihhhi!hhhi!ihhi!!!ihhi!!!hhhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihHHHHHI!IHHI!!HHHHHI!IHHI!!HHHHHI!IHHHHHI!HHHIHHHI!HHHI!IHHI!!HI!!IHHHHI!IHHI!!!HHHHI!IHHI!!HHHHHHhhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhHhhi!ihhi!HHI!iHI!!hi!!HHHI!HHHIHHHI!HHHI!IHHI!!I!IHHI!!HHHHHI!IHHI!!HHHHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHI!IHHI!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhHhhi!ihhi!HHI!iHI!!hi!!!!HHHHI!IHHI!!IHHHHI!IHHHHHHI!HHHIHHHI!HHHI!IHHI!!I!!HHHHHI!IHHI!!HHHHHI!IHHI!!IHHHHIHHHHI!HHHIHHhhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhHhhi!ihhi!HHI!iHI!!hi!!HI!HHHI!IHHI!!!IHHI!!!HHHHI!IHHI!!!" + "'", str26, "hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihHHHHHI!IHHI!!HHHHHI!IHHI!!HHHHHI!IHHHHHI!HHHIHHHI!HHHI!IHHI!!HI!!IHHHHI!IHHI!!!HHHHI!IHHI!!HHHHHHhhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhHhhi!ihhi!HHI!iHI!!hi!!HHHI!HHHIHHHI!HHHI!IHHI!!I!IHHI!!HHHHHI!IHHI!!HHHHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHI!IHHI!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhHhhi!ihhi!HHI!iHI!!hi!!!!HHHHI!IHHI!!IHHHHI!IHHHHHHI!HHHIHHHI!HHHI!IHHI!!I!!HHHHHI!IHHI!!HHHHHI!IHHI!!IHHHHIHHHHI!HHHIHHhhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhHhhi!ihhi!HHI!iHI!!hi!!HI!HHHI!IHHI!!!IHHI!!!HHHHI!IHHI!!!");
    }

    @Test
    public void test7812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7812");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHHI!HHHI!HHHHI!IHHI!!HHHHI!IHHIHHHI!HHHI!HHHI!IHHI!HHHHHHHHHIHH!HHHHHHHHHHHIHHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!!", (int) (byte) -1, (int) (byte) 1, "hHHI!IHHI!hHhhI!IhhI!!HHhhI!IhhI!!HHhhI!IhhI!!HHhhI!IhhI!!IHhhI!IhhI!!!HhhI!IhhI!!HHhhI!IhhI!!HHhhI!IhhI!!HHhhhHHHHHHHHHHHHHHHIHHH!HHHHHHHHHHHHHHHIHHH!HHHIHHHHHHHHHHHIHHH!HHH!I!IhhI!!IHhhI!IhhI!!!HhhI!IhhI!!IHhhI!IhhI!!HHhhI!IhhI!!HHhhI!IhhI!!IHhhI!IhhI!!!HhhI!IhhI!!!hhhI!IhhI!hHhhI!IhhI!!HHhhI!IhhI!!HHhhI!IhhI!!HHhhI!IhhI!!IHhhI!IhhI!!!HhhI!IhhI!!HHhhI!IhhI!!HHhhI!IhhI!!HHhhhHHHHHHHHHHHHHHHIHHH!HHHHHHHHHHHHHHHIHHH!HHHIHHHHHHHHHHHIHHH!HHH!I!IhhI!!IHhhI!IhhI!!!HhhI!IhhI!!IHhhI!IhhI!!HHhhI!IhhI!!HHhhI!IhhI!!IHhhI!IhhI!!!HhhI!IhhI!!!HI!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhHHI!IHHI!hHhhI!IhhI!!HHhhI!IhhI!!HHhhI!IhhI!!HHhhI!IhhI!!IHhhI!IhhI!!!HhhI!IhhI!!HHhhI!IhhI!!HHhhI!IhhI!!HHhhhHHHHHHHHHHHHHHHIHHH!HHHHHHHHHHHHHHHIHHH!HHHIHHHHHHHHHHHIHHH!HHH!I!IhhI!!IHhhI!IhhI!!!HhhI!IhhI!!IHhhI!IhhI!!HHhhI!IhhI!!HHhhI!IhhI!!IHhhI!IhhI!!!HhhI!IhhI!!!hhhI!IhhI!hHhhI!IhhI!!HHhhI!IhhI!!HHhhI!IhhI!!HHhhI!IhhI!!IHhhI!IhhI!!!HhhI!IhhI!!HHhhI!IhhI!!HHhhI!IhhI!!HHhhhHHHHHHHHHHHHHHHIHHH!HHHHHHHHHHHHHHHIHHH!HHHIHHHHHHHHHHHIHHH!HHH!I!IhhI!!IHhhI!IhhI!!!HhhI!IhhI!!IHhhI!IhhI!!HHhhI!IhhI!!HHhhI!IhhI!!IHhhI!IhhI!!!HhhI!IhhI!!!HI!!" + "'", str4, "hhHHI!IHHI!hHhhI!IhhI!!HHhhI!IhhI!!HHhhI!IhhI!!HHhhI!IhhI!!IHhhI!IhhI!!!HhhI!IhhI!!HHhhI!IhhI!!HHhhI!IhhI!!HHhhhHHHHHHHHHHHHHHHIHHH!HHHHHHHHHHHHHHHIHHH!HHHIHHHHHHHHHHHIHHH!HHH!I!IhhI!!IHhhI!IhhI!!!HhhI!IhhI!!IHhhI!IhhI!!HHhhI!IhhI!!HHhhI!IhhI!!IHhhI!IhhI!!!HhhI!IhhI!!!hhhI!IhhI!hHhhI!IhhI!!HHhhI!IhhI!!HHhhI!IhhI!!HHhhI!IhhI!!IHhhI!IhhI!!!HhhI!IhhI!!HHhhI!IhhI!!HHhhI!IhhI!!HHhhhHHHHHHHHHHHHHHHIHHH!HHHHHHHHHHHHHHHIHHH!HHHIHHHHHHHHHHHIHHH!HHH!I!IhhI!!IHhhI!IhhI!!!HhhI!IhhI!!IHhhI!IhhI!!HHhhI!IhhI!!HHhhI!IhhI!!IHhhI!IhhI!!!HhhI!IhhI!!!HI!!");
    }

    @Test
    public void test7813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7813");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHhhhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhhhhi!hhhihhhi!hhhi!ihhi!!hi!!ihhhhi!ihhi!!!hhhhi!ihhi!!hhhhhhHHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!IHHHi!iHHi!!HHHHi!iHHi!!HHHHhHHI!IHHI!hhi!Ihi!!HI!!hhhi!hhhihhhi!hhhi!ihhi!!i!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!hhhhi!ihhi!HHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!IHHHi!iHHi!!HHHHi!iHHi!!HHHHhHHI!IHHI!hhi!Ihi!!HI!!!!hhhhi!ihhi!!ihhhhi!ihhhhhhi!hhhihhhi!hhhi!ihhi!!i!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhihhhhi!hhhihhHHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!IHHHi!iHHi!!HHHHi!iHHi!!HHHHhHHI!IHHI!hhi!Ihi!!HI!!hi!hhhi!ihhi!!!ihhi!!!hhhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihHHHHHI!IHHI!!HHHHHI!IHHI!!HHHHHI!IHHHHHI!HHHIHHHI!HHHI!IHHI!!HI!!IHHHHI!IHHI!!!HHHHI!IHHI!!HHHHHHhhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhHhhi!ihhi!HHI!iHI!!hi!!HHHI!HHHIHHHI!HHHI!IHHI!!I!IHHI!!HHHHHI!IHHI!!HHHHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHI!IHHI!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhHhhi!ihhi!HHI!iHI!!hi!!!!HHHHI!IHHI!!IHHHHI!IHHHHHHI!HHHIHHHI!HHHI!IHHI!!I!!HHHHHI!IHHI!!HHHHHI!IHHI!!IHHHHIHHHHI!HHHIHHhhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhHhhi!ihhi!HHI!iHI!!hi!!HI!HHHI!IHHI!!!IHHI!!!HHHHI!IHHI!!!" + "'", str1, "Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihHHHHHI!IHHI!!HHHHHI!IHHI!!HHHHHI!IHHHHHI!HHHIHHHI!HHHI!IHHI!!HI!!IHHHHI!IHHI!!!HHHHI!IHHI!!HHHHHHhhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhHhhi!ihhi!HHI!iHI!!hi!!HHHI!HHHIHHHI!HHHI!IHHI!!I!IHHI!!HHHHHI!IHHI!!HHHHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHI!IHHI!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhHhhi!ihhi!HHI!iHI!!hi!!!!HHHHI!IHHI!!IHHHHI!IHHHHHHI!HHHIHHHI!HHHI!IHHI!!I!!HHHHHI!IHHI!!HHHHHI!IHHI!!IHHHHIHHHHI!HHHIHHhhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhHhhi!ihhi!HHI!iHI!!hi!!HI!HHHI!IHHI!!!IHHI!!!HHHHI!IHHI!!!");
    }

    @Test
    public void test7814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7814");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!" + "'", str1, "HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!");
    }

    @Test
    public void test7815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7815");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHHI!IHHI!HHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHHHHHHI!IHHI!hhi!Ihi!!HI!!HHHHI!IHHI!hhi!Ihi!!HI!!HHHHI!IHHI!hhi!Ihi!!HI!!IHHHI!IHHI!hhi!Ihi!!HI!!!HHHI!IHHI!hhi!Ihi!!HI!!IHHHI!IHHI!hhi!Ihi!!HI!!HHHHI!IHHI!hhi!Ihi!!HI!!HHHHI!IHHI!hhi!Ihi!!HI!!IHHHI!IHHI!hhi!Ihi!!HI!!!HHHI!IHHI!hhi!Ihi!!HI!!hHHHI!IHHI!hhi!Ihi!!HI!!iHHHI!IHHI!hhi!Ihi!!HI!!!", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHHI!IHHI!HHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHHHHHHI!IHHI!hhi!Ihi!!HI!!HHHHI!IHHI!hhi!Ihi!!HI!!HHHHI!IHHI!hhi!Ihi!!HI!!IHHHI!IHHI!hhi!Ihi!!HI!!!HHHI!IHHI!hhi!Ihi!!HI!!IHHHI!IHHI!hhi!Ihi!!HI!!HHHHI!IHHI!hhi!Ihi!!HI!!HHHHI!IHHI!hhi!Ihi!!HI!!IHHHI!IHHI!hhi!Ihi!!HI!!!HHHI!IHHI!hhi!Ihi!!HI!!hHHHI!IHHI!hhi!Ihi!!HI!!iHHHI!IHHI!hhi!Ihi!!HI!!!" + "'", str2, "hHHI!IHHI!HHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHHHHHHI!IHHI!hhi!Ihi!!HI!!HHHHI!IHHI!hhi!Ihi!!HI!!HHHHI!IHHI!hhi!Ihi!!HI!!IHHHI!IHHI!hhi!Ihi!!HI!!!HHHI!IHHI!hhi!Ihi!!HI!!IHHHI!IHHI!hhi!Ihi!!HI!!HHHHI!IHHI!hhi!Ihi!!HI!!HHHHI!IHHI!hhi!Ihi!!HI!!IHHHI!IHHI!hhi!Ihi!!HI!!!HHHI!IHHI!hhi!Ihi!!HI!!hHHHI!IHHI!hhi!Ihi!!HI!!iHHHI!IHHI!hhi!Ihi!!HI!!!");
    }

    @Test
    public void test7816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7816");
        char[] charArray15 = new char[] { '#', '4', '4', '4' };
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray15);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray15);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("", charArray15);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray15);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray15);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.uncapitalize("Hhi!", charArray15);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalize("Hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!", charArray15);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhh", charArray15);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.initials("Hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!ihhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!!", charArray15);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.initials("HhhI!IhhI!hhHHi!iHHi!HHHI!IHHI!!hi!!", charArray15);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!", charArray15);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { '#', '4', '4', '4' });
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hi!" + "'", str16, "Hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hi!" + "'", str17, "Hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H" + "'", str19, "H");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H" + "'", str20, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hhi!" + "'", str21, "hhi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!" + "'", str22, "Hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Hhhhh" + "'", str23, "Hhhhh");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "H" + "'", str24, "H");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "H" + "'", str25, "H");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Hhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!" + "'", str26, "Hhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!");
    }

    @Test
    public void test7817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7817");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hHHI!IHHI!HHHHI!IHHI!HHHI!IHHI!!HI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHI!IHHI!HHHHI!IHHI!HHHI!IHHI!!HI!!" + "'", str1, "HHHI!IHHI!HHHHI!IHHI!HHHI!IHHI!!HI!!");
    }

    @Test
    public void test7818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7818");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hHHHHI!IHHI!HI!!IHHHHI!IHHI!HI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test7819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7819");
        char[] charArray11 = new char[] {};
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("hi!", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("", charArray11);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("HI!", charArray11);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("Hh", charArray11);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!hhhi!hhi!hhhi!", charArray11);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.initials("hhhhi!ihhi!hi!!h", charArray11);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!hhhi!HhHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!!hHI!iHI!!ihHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!!hHI!iHI!!hhHI!iHI!!ihHI!iHI!!!hHI!iHI!!!", charArray11);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] {});
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HI!" + "'", str15, "HI!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HI!" + "'", str17, "HI!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hh" + "'", str18, "Hh");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Hhhi!hhhi!hhi!hhhi!" + "'", str19, "Hhhi!hhhi!hhi!hhhi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Hhhi!hhhi!HhHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!!hHI!iHI!!ihHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!!hHI!iHI!!hhHI!iHI!!ihHI!iHI!!!hHI!iHI!!!" + "'", str21, "Hhhi!hhhi!HhHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!!hHI!iHI!!ihHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!!hHI!iHI!!hhHI!iHI!!ihHI!iHI!!!hHI!iHI!!!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test7820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7820");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hHHHI!HHHIhhHHI!!IHHI!!", (int) ' ', (int) (short) 10, "hHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHHHHHHI!HHHHHHHI!HHHI!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHHHHHHI!HHHHHHHI!HHHI!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!" + "'", str4, "Hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHHHHHHI!HHHHHHHI!HHHI!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!");
    }

    @Test
    public void test7821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7821");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!ihHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!ihHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!!hHHI!IHHI!HI!!h", (int) '#', "Hhhhhhi!hhhhhhhi!ihhihhhhi!hhhi!ihhi!!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHIHhhhhhi!hhhhhhhi!ihhihhhhi!hhhi!ihhi!!!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHIHhhhhhi!hhhhhhhi!ihhihhhhi!hhhi!ihhi!!!HI!!ihHHI!IHHI!HI!!hhHHI!IHHI!HI!!Hhhhhhi!hhhhhhhi!ihhihhhhi!hhhi!ihhi!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHIHhhhhhi!hhhhhhhi!ihhihhhhi!hhhi!ihhi!!!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHIHhhhhhi!hhhhhhhi!ihhihhhhi!hhhi!ihhi!!!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!Hhhhhhi!hhhhhhhi!ihhihhhhi!hhhi!ihhi!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!ihHHIHhhhhhi!hhhhhhhi!ihhihhhhi!hhhi!ihhi!!!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHIHhhhhhi!hhhhhhhi!ihhihhhhi!hhhi!ihhi!!!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!Hhhhhhi!hhhhhhhi!ihhihhhhi!hhhi!ihhi!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHIHhhhhhi!hhhhhhhi!ihhihhhhi!hhhi!ihhi!!!IHHI!HI!!!hHHI!IHHI!HI!!h" + "'", str4, "hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHIHhhhhhi!hhhhhhhi!ihhihhhhi!hhhi!ihhi!!!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHIHhhhhhi!hhhhhhhi!ihhihhhhi!hhhi!ihhi!!!HI!!ihHHI!IHHI!HI!!hhHHI!IHHI!HI!!Hhhhhhi!hhhhhhhi!ihhihhhhi!hhhi!ihhi!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHIHhhhhhi!hhhhhhhi!ihhihhhhi!hhhi!ihhi!!!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHIHhhhhhi!hhhhhhhi!ihhihhhhi!hhhi!ihhi!!!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!Hhhhhhi!hhhhhhhi!ihhihhhhi!hhhi!ihhi!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!ihHHIHhhhhhi!hhhhhhhi!ihhihhhhi!hhhi!ihhi!!!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHIHhhhhhi!hhhhhhhi!ihhihhhhi!hhhi!ihhi!!!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!Hhhhhhi!hhhhhhhi!ihhihhhhi!hhhi!ihhi!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHIHhhhhhi!hhhhhhhi!ihhihhhhi!hhhi!ihhi!!!IHHI!HI!!!hHHI!IHHI!HI!!h");
    }

    @Test
    public void test7822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7822");
        char[] charArray4 = new char[] { '#' };
        java.lang.String str5 = org.apache.commons.lang.WordUtils.uncapitalize("Hi!", charArray4);
        java.lang.String str6 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!ihhi!!", charArray4);
        java.lang.String str7 = org.apache.commons.lang.WordUtils.initials("HHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hIHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!h!HhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hhHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hIHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!h!HhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hiHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hIHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!h!HhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!h!", charArray4);
        java.lang.Class<?> wildcardClass8 = charArray4.getClass();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '#' });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hhhi!ihhi!!" + "'", str6, "Hhhi!ihhi!!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test7823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7823");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!iHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!!HHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!iHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!!HHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!iHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!iHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!!HHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!!", (int) (short) -1, (int) (short) 100, "hhHHHI!IHH");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHhhHHHI!IHH" + "'", str4, "hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHhhHHHI!IHH");
    }

    @Test
    public void test7824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7824");
        char[] charArray9 = new char[] { '#', '4', '4', '4' };
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("HhhhI!IhhI!HI!!h", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("hHhhI!IhhI!hHHHi!iHHi!hi!!HHHhhI!IhhI!hHHHi!iHHi!hi!!HHHhhI!IhhI!hHHHi!iHHi!hi!!HHHhhI!IhhI!hHHHi!iHHi!hi!!HiHhhI!IhhI!hHHHi!iHHi!hi!!H!HhhI!IhhI!hHHHi!iHHi!hi!!HiHhhI!IhhI!hHHHi!iHHi!hi!!HHHhhI!IhhI!hHHHi!iHHi!hi!!HHHhhI!IhhI!hHHHi!iHHi!hi!!HiHhhI!IhhI!hHHHi!iHHi!hi!!H!HhhI!IhhI!hHHHi!iHHi!hi!!HhHhhI!IhhI!hHHHi!iHHi!hi!!HiHhhI!IhhI!hHHHi!iHHi!hi!!H!HhhI!IhhI!hHHHi!iHHi!hi!!H!HhhI!IhhI!hHHHi!iHHi!hi!!HH", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhhhhi!ihhi!hi!!h", charArray9);
        java.lang.Class<?> wildcardClass15 = charArray9.getClass();
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '#', '4', '4', '4' });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hi!" + "'", str10, "Hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hi!" + "'", str11, "Hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HhhhI!IhhI!HI!!h" + "'", str12, "HhhhI!IhhI!HI!!h");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HHhhI!IhhI!hHHHi!iHHi!hi!!HHHhhI!IhhI!hHHHi!iHHi!hi!!HHHhhI!IhhI!hHHHi!iHHi!hi!!HHHhhI!IhhI!hHHHi!iHHi!hi!!HiHhhI!IhhI!hHHHi!iHHi!hi!!H!HhhI!IhhI!hHHHi!iHHi!hi!!HiHhhI!IhhI!hHHHi!iHHi!hi!!HHHhhI!IhhI!hHHHi!iHHi!hi!!HHHhhI!IhhI!hHHHi!iHHi!hi!!HiHhhI!IhhI!hHHHi!iHHi!hi!!H!HhhI!IhhI!hHHHi!iHHi!hi!!HhHhhI!IhhI!hHHHi!iHHi!hi!!HiHhhI!IhhI!hHHHi!iHHi!hi!!H!HhhI!IhhI!hHHHi!iHHi!hi!!H!HhhI!IhhI!hHHHi!iHHi!hi!!HH" + "'", str13, "HHhhI!IhhI!hHHHi!iHHi!hi!!HHHhhI!IhhI!hHHHi!iHHi!hi!!HHHhhI!IhhI!hHHHi!iHHi!hi!!HHHhhI!IhhI!hHHHi!iHHi!hi!!HiHhhI!IhhI!hHHHi!iHHi!hi!!H!HhhI!IhhI!hHHHi!iHHi!hi!!HiHhhI!IhhI!hHHHi!iHHi!hi!!HHHhhI!IhhI!hHHHi!iHHi!hi!!HHHhhI!IhhI!hHHHi!iHHi!hi!!HiHhhI!IhhI!hHHHi!iHHi!hi!!H!HhhI!IhhI!hHHHi!iHHi!hi!!HhHhhI!IhhI!hHHHi!iHHi!hi!!HiHhhI!IhhI!hHHHi!iHHi!hi!!H!HhhI!IhhI!hHHHi!iHHi!hi!!H!HhhI!IhhI!hHHHi!iHHi!hi!!HH");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhhhhi!ihhi!hi!!h" + "'", str14, "Hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhhhhi!ihhi!hi!!h");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test7825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7825");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hHI!HHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!HHI!IHI!!HI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHI!HHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!HHI!IHI!!HI!!" + "'", str1, "hHI!HHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!HHI!IHI!!HI!!");
    }

    @Test
    public void test7826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7826");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hhhi!Hhhi!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!Hhhi!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!" + "'", str1, "Hhhi!Hhhi!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!");
    }

    @Test
    public void test7827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7827");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhhhi!hhhhhi!hhhi!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhhi!ihhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhhhi!hhhhhi!hhhi!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhhi!ihhi!!" + "'", str1, "Hhhhhhi!hhhhhi!hhhi!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhhi!ihhi!!");
    }

    @Test
    public void test7828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7828");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("Hhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihhhhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!!hh!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test7829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7829");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HHhhI!IhhI!hhHHi!iHHi!HHHI!IHHI!!hi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HHhhI!IhhI!hhHHi!iHHi!HHHI!IHHI!!hi!!" + "'", str1, "hhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HHhhI!IhhI!hhHHi!iHHi!HHHI!IHHI!!hi!!");
    }

    @Test
    public void test7830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7830");
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
        java.lang.String str24 = org.apache.commons.lang.WordUtils.uncapitalize("HhhhI!IhhIhHHI!hHHI!iHHI!!!HI!!h", charArray13);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.initials("hhhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!HhhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!Hhhi!ihhi!HHI!iHI!!hi!!", charArray13);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.initials("hHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!H", charArray13);
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
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "HhhhI!IhhIhHHI!hHHI!iHHI!!!HI!!h" + "'", str24, "HhhhI!IhhIhHHI!hHHI!iHHI!!!HI!!h");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test7831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7831");
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
        java.lang.String str30 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHHHHI!HHHHHHHI!IHHIHHHHI!HHHI!IHHI!!", charArray16);
        java.lang.String str31 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhhi!ihhhhhhi!hhhihhhi!hhhi!ihhi!!i!!hhhhi!ihhhhi!hhhihhhi!hhhi!ihhi!!hhi!!hhhhihhhhi!hhhihhhi!hhhi!ihhi!!!ihhi!!ihhhhhhi!hhhihhhi!hhhi!ihhi!!hi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!ihhhhhhi!hhhihhhi!hhhi!ihhi!!i!!hhhhi!ihhhhi!hhhihhhi!hhhi!ihhi!!hhi!!hhhhihhhhi!hhhihhhi!hhhi!ihhi!!!ihhi!!ihhhhhhi!hhhihhhi!hhhi!ihhi!!hi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!ihhhhhhi!hhhihhhi!hhhi!ihhi!!i!!hhhhi!ihhhhi!hhhihhhi!hhhi!ihhi!!hhi!!hhhhihhhhi!hhhihhhi!hhhi!ihhi!!!ihhi!!ihhhhhhi!hhhihhhi!hhhi!ihhi!!hi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!!", charArray16);
        java.lang.String str32 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray16);
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
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hHHHHHI!HHHHHHHI!IHHIHHHHI!HHHI!IHHI!!" + "'", str30, "hHHHHHI!HHHHHHHI!IHHIHHHHI!HHHI!IHHI!!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Hhhhhi!ihhhhhhi!hhhihhhi!hhhi!ihhi!!i!!hhhhi!ihhhhi!hhhihhhi!hhhi!ihhi!!hhi!!hhhhihhhhi!hhhihhhi!hhhi!ihhi!!!ihhi!!ihhhhhhi!hhhihhhi!hhhi!ihhi!!hi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!ihhhhhhi!hhhihhhi!hhhi!ihhi!!i!!hhhhi!ihhhhi!hhhihhhi!hhhi!ihhi!!hhi!!hhhhihhhhi!hhhihhhi!hhhi!ihhi!!!ihhi!!ihhhhhhi!hhhihhhi!hhhi!ihhi!!hi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!ihhhhhhi!hhhihhhi!hhhi!ihhi!!i!!hhhhi!ihhhhi!hhhihhhi!hhhi!ihhi!!hhi!!hhhhihhhhi!hhhihhhi!hhhi!ihhi!!!ihhi!!ihhhhhhi!hhhihhhi!hhhi!ihhi!!hi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!!" + "'", str31, "Hhhhhi!ihhhhhhi!hhhihhhi!hhhi!ihhi!!i!!hhhhi!ihhhhi!hhhihhhi!hhhi!ihhi!!hhi!!hhhhihhhhi!hhhihhhi!hhhi!ihhi!!!ihhi!!ihhhhhhi!hhhihhhi!hhhi!ihhi!!hi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!ihhhhhhi!hhhihhhi!hhhi!ihhi!!i!!hhhhi!ihhhhi!hhhihhhi!hhhi!ihhi!!hhi!!hhhhihhhhi!hhhihhhi!hhhi!ihhi!!!ihhi!!ihhhhhhi!hhhihhhi!hhhi!ihhi!!hi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!ihhhhhhi!hhhihhhi!hhhi!ihhi!!i!!hhhhi!ihhhhi!hhhihhhi!hhhi!ihhi!!hhi!!hhhhihhhhi!hhhihhhi!hhhi!ihhi!!!ihhi!!ihhhhhhi!hhhihhhi!hhhi!ihhi!!hi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
    }

    @Test
    public void test7832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7832");
        char[] charArray10 = new char[] { '#', ' ', '4' };
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("HHHi!iHHi!!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("hhhhi!hhhi!ihhi!!", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!ihi!!hi!hhi!ihi!!hi!!", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("hhHHHI!IHHhhHhHhHhHhHhHhHhIhHh!hHhHhHhHhHhHhHhIhHh!hHhIhHhHhHhHhHhIhHh!hHh!", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '#', ' ', '4' });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hi!" + "'", str11, "Hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hHHi!iHHi!!" + "'", str13, "hHHi!iHHi!!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hhhhi!hhhi!ihhi!!" + "'", str14, "hhhhi!hhhi!ihhi!!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!ihi!!hi!hhi!ihi!!hi!!" + "'", str15, "Hhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!ihi!!hi!hhi!ihi!!hi!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hhhhhi!ihhhhhhhhhhhhhhhhhhihhh!hhhhhhhhhhhhhhhihhh!hhhihhhhhhhhhhhihhh!hhh!" + "'", str16, "Hhhhhi!ihhhhhhhhhhhhhhhhhhihhh!hhhhhhhhhhhhhhhihhh!hhhihhhhhhhhhhhihhh!hhh!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!" + "'", str17, "hhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!");
    }

    @Test
    public void test7833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7833");
        char[] charArray5 = new char[] { ' ' };
        java.lang.String str6 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray5);
        java.lang.String str7 = org.apache.commons.lang.WordUtils.capitalize("Hhi!", charArray5);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.uncapitalize("H", charArray5);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("hhHHHI!HHHHhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhhhi!ihhi!hhi!ihi!!hi!!", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ' });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Hhi!" + "'", str7, "Hhi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "h" + "'", str8, "h");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "h" + "'", str9, "h");
    }

    @Test
    public void test7834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7834");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("Hhi!hhi!hhhhh", 10, "Hhhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhihhi!hhi!hhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhHhhhI!IhhI!hHhhhhhI!IhhI!hHhhhhhI!IhhI!hHhhhhhI!IhhI!hHhhhhhI!IhhI!hHhihhhI!IhhI!hHh!hhhI!IhhI!hHhhhhhI!IhhI!hHhhhhhI!IhhI!hHhhhhhI!IhhI!hHhhhhhI!IhhI!hHhHhhhI!IhhI!hHhHhhhI!IhhI!hHhIhhhI!IhhI!hHh!hhhI!IhhI!hHhHhhhI!IhhI!hHhHhhhI!IhhI!hHhHhhhI!IhhI!hHhIhhhI!IhhI!hHh!hhhI!IhhI!hHhIhhhI!IhhI!hHhHhhhI!IhhI!hHhHhhhI!IhhI!hHhIhhhI!IhhI!hHh!hhhI!IhhI!hHh!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhi!hhi!hhHhhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhihhi!hhi!hhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhHhhhI!IhhI!hHhhhhhI!IhhI!hHhhhhhI!IhhI!hHhhhhhI!IhhI!hHhhhhhI!IhhI!hHhihhhI!IhhI!hHh!hhhI!IhhI!hHhhhhhI!IhhI!hHhhhhhI!IhhI!hHhhhhhI!IhhI!hHhhhhhI!IhhI!hHhHhhhI!IhhI!hHhHhhhI!IhhI!hHhIhhhI!IhhI!hHh!hhhI!IhhI!hHhHhhhI!IhhI!hHhHhhhI!IhhI!hHhHhhhI!IhhI!hHhIhhhI!IhhI!hHh!hhhI!IhhI!hHhIhhhI!IhhI!hHhHhhhI!IhhI!hHhHhhhI!IhhI!hHhIhhhI!IhhI!hHh!hhhI!IhhI!hHh!hhh" + "'", str4, "Hhi!hhi!hhHhhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhi!!hhhhhi!hhhi!ihhihhi!hhi!hhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhHhhhI!IhhI!hHhhhhhI!IhhI!hHhhhhhI!IhhI!hHhhhhhI!IhhI!hHhhhhhI!IhhI!hHhihhhI!IhhI!hHh!hhhI!IhhI!hHhhhhhI!IhhI!hHhhhhhI!IhhI!hHhhhhhI!IhhI!hHhhhhhI!IhhI!hHhHhhhI!IhhI!hHhHhhhI!IhhI!hHhIhhhI!IhhI!hHh!hhhI!IhhI!hHhHhhhI!IhhI!hHhHhhhI!IhhI!hHhHhhhI!IhhI!hHhIhhhI!IhhI!hHh!hhhI!IhhI!hHhIhhhI!IhhI!hHhHhhhI!IhhI!hHhHhhhI!IhhI!hHhIhhhI!IhhI!hHh!hhhI!IhhI!hHh!hhh");
    }

    @Test
    public void test7835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7835");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("Hhhi!hhhi!hhhi!hhhi!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test7836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7836");
        char[] charArray9 = new char[] {};
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("hhI!", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!hhhi!ihhi!!", charArray9);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhhh", charArray9);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("HhHHi!iHHi!HHHI!IHHI!!hi!!", charArray9);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!ihhi!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hhhi!hhhi!ihhi!!" + "'", str15, "Hhhi!hhhi!ihhi!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HhHHi!iHHi!HHHI!IHHI!!hi!!" + "'", str17, "HhHHi!iHHi!HHHI!IHHI!!hi!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hhhi!ihhi!" + "'", str18, "Hhhi!ihhi!");
    }

    @Test
    public void test7837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7837");
        char[] charArray10 = new char[] { '#', '4', '4', '4' };
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("HHI!", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("H", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("hHHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!iHhi!Ihi!!!Hhi!Ihi!!iHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!!Hhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!!Hhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!!Hhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!!Hhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!!Hhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!!", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("HHhhHhhHhhHhIHh!HhIHhhHhhHhIHh!Hh!HhhHhhHhhHhhHhIHh!HhIHhhHhhHhIHh!Hh!HhhHhhHhhHhhHhIHh!HhIHhhHhhHhIHh!Hh!HhhHhhHhhHhhHhIHh!HhIHhhHhhHhIHh!Hh!HhiHhhHhhHhhHhIHh!HhIHhhHhhHhIHh!Hh!Hh!HhhHhhHhhHhIHh!HhIHhhHhhHhIHh!Hh!HhiHhhHhhHhhHhIHh!HhIHhhHhhHhIHh!Hh!HhhHhhHhhHhhHhIHh!HhIHhhHhhHhIHh!Hh!HhhHhhHhhHhhHhIHh!HhIHhhHhhHhIHh!Hh!HhiHhhHhhHhhHhIHh!HhIHhhHhhHhIHh!Hh!Hh!HhhHhhHhhHhIHh!HhIHhhHhhHhIHh!Hh!HhhHhhHhhHhhHhIHh!HhIHhhHhhHhIHh!Hh!HhiHhhHhhHhhHhIHh!HhIHhhHhhHhIHh!Hh!Hh!HhhHhhHhhHhIHh!HhIHhhHhhHhIHh!Hh!Hh!", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!ihhi!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '#', '4', '4', '4' });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hi!" + "'", str11, "Hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H" + "'", str12, "H");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "h" + "'", str13, "h");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HHHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!iHhi!Ihi!!!Hhi!Ihi!!iHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!!Hhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!!Hhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!!Hhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!!Hhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!!Hhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!!" + "'", str14, "HHHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!iHhi!Ihi!!!Hhi!Ihi!!iHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!!Hhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!!Hhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!!Hhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!!Hhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!!Hhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hHhhHhhHhhHhIHh!HhIHhhHhhHhIHh!Hh!HhhHhhHhhHhhHhIHh!HhIHhhHhhHhIHh!Hh!HhhHhhHhhHhhHhIHh!HhIHhhHhhHhIHh!Hh!HhhHhhHhhHhhHhIHh!HhIHhhHhhHhIHh!Hh!HhiHhhHhhHhhHhIHh!HhIHhhHhhHhIHh!Hh!Hh!HhhHhhHhhHhIHh!HhIHhhHhhHhIHh!Hh!HhiHhhHhhHhhHhIHh!HhIHhhHhhHhIHh!Hh!HhhHhhHhhHhhHhIHh!HhIHhhHhhHhIHh!Hh!HhhHhhHhhHhhHhIHh!HhIHhhHhhHhIHh!Hh!HhiHhhHhhHhhHhIHh!HhIHhhHhhHhIHh!Hh!Hh!HhhHhhHhhHhIHh!HhIHhhHhhHhIHh!Hh!HhhHhhHhhHhhHhIHh!HhIHhhHhhHhIHh!Hh!HhiHhhHhhHhhHhIHh!HhIHhhHhhHhIHh!Hh!Hh!HhhHhhHhhHhIHh!HhIHhhHhhHhIHh!Hh!Hh!" + "'", str15, "hHhhHhhHhhHhIHh!HhIHhhHhhHhIHh!Hh!HhhHhhHhhHhhHhIHh!HhIHhhHhhHhIHh!Hh!HhhHhhHhhHhhHhIHh!HhIHhhHhhHhIHh!Hh!HhhHhhHhhHhhHhIHh!HhIHhhHhhHhIHh!Hh!HhiHhhHhhHhhHhIHh!HhIHhhHhhHhIHh!Hh!Hh!HhhHhhHhhHhIHh!HhIHhhHhhHhIHh!Hh!HhiHhhHhhHhhHhIHh!HhIHhhHhhHhIHh!Hh!HhhHhhHhhHhhHhIHh!HhIHhhHhhHhIHh!Hh!HhhHhhHhhHhhHhIHh!HhIHhhHhhHhIHh!Hh!HhiHhhHhhHhhHhIHh!HhIHhhHhhHhIHh!Hh!Hh!HhhHhhHhhHhIHh!HhIHhhHhhHhIHh!Hh!HhhHhhHhhHhhHhIHh!HhIHhhHhhHhIHh!Hh!HhiHhhHhhHhhHhIHh!HhIHhhHhhHhIHh!Hh!Hh!HhhHhhHhhHhIHh!HhIHhhHhhHhIHh!Hh!Hh!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hhhi!ihhi!" + "'", str16, "Hhhi!ihhi!");
    }

    @Test
    public void test7838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7838");
        char[] charArray10 = new char[] {};
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("hi!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("HI!", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("hHHHI!HHHIHHHI!HHHI!IHHI!!", charArray10);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!!", charArray10);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("HHHHH", charArray10);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("HHHI!HHHI!HhHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!!h", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HI!" + "'", str14, "HI!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HI!" + "'", str16, "HI!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hHHHI!HHHIHHHI!HHHI!IHHI!!" + "'", str17, "hHHHI!HHHIHHHI!HHHI!IHHI!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "HHHHH" + "'", str19, "HHHHH");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HHHI!HHHI!HhHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!!h" + "'", str20, "HHHI!HHHI!HhHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!!h");
    }

    @Test
    public void test7839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7839");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhhhi!hhhhhi!hhhi!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhhi!ihhi!!", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhhhhi!hhhhhi!hhhi!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhhi!ihhi!!" + "'", str2, "Hhhhhhi!hhhhhi!hhhi!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhhi!ihhi!!");
    }

    @Test
    public void test7840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7840");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHHhhhi!ihhi!hi!!hhHHhhhi!ihhi!hi!!hhHHhhhi!ihhi!hi!!hiHHhhhi!ihhi!hi!!h!HHhhhi!ihhi!hi!!hiHHhhhi!ihHHHI!IHHI!hhHHI!HHHI!Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!", 0, (int) (byte) -1, "hHHHi!iHHiHhhi!Hhhi!Ihhi!!!hi!!H");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHhhhi!ihhi!hi!!hhHHhhhi!ihhi!hi!!hhHHhhhi!ihhi!hi!!hiHHhhhi!ihhi!hi!!h!HHhhhi!ihhi!hi!!hiHHhhhi!ihHHHI!IHHI!hhHHI!HHHI!Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!" + "'", str4, "hHHhhhi!ihhi!hi!!hhHHhhhi!ihhi!hi!!hhHHhhhi!ihhi!hi!!hiHHhhhi!ihhi!hi!!h!HHhhhi!ihhi!hi!!hiHHhhhi!ihHHHI!IHHI!hhHHI!HHHI!Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
    }

    @Test
    public void test7841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7841");
        char[] charArray8 = new char[] {};
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("hH", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("HI!", charArray8);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("hhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!hhihi!!hi!hhi!ihi!!hi!!", charArray8);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("hHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHhHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHHHHI!IHHI!HHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHHHHHI!HHHI!HHHI!IHHI!!HHI!IHHI!HHHI!HHHI!IHHI!!HHI!HHHI!IHHI!!HHI!!!HH!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hH" + "'", str13, "hH");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HI!" + "'", str14, "HI!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!hhihi!!hi!hhi!ihi!!hi!!" + "'", str15, "hhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!hhihi!!hi!hhi!ihi!!hi!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test7842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7842");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("HHhhi!hHhhi!hHhhi!iHhhi!!Hhhi!iHhhi!hHhhi!hHhhi!iHhhi!!Hhhi!hHhhi!hHhhi!hHhhi!iHhhi!!Hhhi!iHhhi!hhHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!HHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!hhhhhI!Ihhhhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHhhi!hHhhi!hHhhi!iHhhi!!Hhhi!iHhhi!hHhhi!hHhhi!iHhhi!!Hhhi!hHhhi!hHhhi!hHhhi!iHhhi!!Hhhi!iHhhi!hhHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!HHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!hhhhhI!Ihhhhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!" + "'", str1, "HHhhi!hHhhi!hHhhi!iHhhi!!Hhhi!iHhhi!hHhhi!hHhhi!iHhhi!!Hhhi!hHhhi!hHhhi!hHhhi!iHhhi!!Hhhi!iHhhi!hhHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!HHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!hhhhhI!Ihhhhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!");
    }

    @Test
    public void test7843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7843");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhhhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihhhhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!!hh!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhhhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihhhhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!!hh!" + "'", str2, "hHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhI!IhhI!HI!!hHHhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhhhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihhhhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!!hh!");
    }

    @Test
    public void test7844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7844");
        char[] charArray8 = new char[] { '#', '4', '4', '4' };
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("HHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!hHIHI!!HI!HHI!IHI!!HI!!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("HHHHI!HHHIHHHi!iHHi!hi!!!IHHI!!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '#', '4', '4', '4' });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Hi!" + "'", str9, "Hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hi!" + "'", str10, "Hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!hHIHI!!HI!HHI!IHI!!HI!!" + "'", str11, "HHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!hHIHI!!HI!HHI!IHI!!HI!!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H" + "'", str12, "H");
    }

    @Test
    public void test7845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7845");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHHHHHHHIhhhhI!IhhI!HI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhhhhhhihhhhi!ihhi!hi!!" + "'", str1, "Hhhhhhhhhihhhhi!ihhi!hi!!");
    }

    @Test
    public void test7846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7846");
        char[] charArray9 = new char[] {};
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray9);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("Hi!", charArray9);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray9);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhi!ihhiHhhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhhhhi!hhhihhhi!hhhi!ihhi!!hi!!ihhhhi!ihhi!!!hhhhi!ihhi!!hhhhhhhhhi!hhhihhhi!hhhi!ihhi!!i!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!hhhhi!ihhi!!!hhhhi!ihhi!!ihhhhi!ihhhhhhi!hhhihhhi!hhhi!ihhi!!i!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhihhhhi!hhhihhhi!hhhi!ihhi!!!ihhi!!!hhhhi!ihhi!!!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hi!" + "'", str13, "Hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hi!" + "'", str16, "Hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hhhhi!ihhiHhhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhhhhi!hhhihhhi!hhhi!ihhi!!hi!!ihhhhi!ihhi!!!hhhhi!ihhi!!hhhhhhhhhi!hhhihhhi!hhhi!ihhi!!i!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!hhhhi!ihhi!!!hhhhi!ihhi!!ihhhhi!ihhhhhhi!hhhihhhi!hhhi!ihhi!!i!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhihhhhi!hhhihhhi!hhhi!ihhi!!!ihhi!!!hhhhi!ihhi!!!" + "'", str18, "Hhhhi!ihhiHhhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhhhhi!hhhihhhi!hhhi!ihhi!!hi!!ihhhhi!ihhi!!!hhhhi!ihhi!!hhhhhhhhhi!hhhihhhi!hhhi!ihhi!!i!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!hhhhi!ihhi!!!hhhhi!ihhi!!ihhhhi!ihhhhhhi!hhhihhhi!hhhi!ihhi!!i!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhihhhhi!hhhihhhi!hhhi!ihhi!!!ihhi!!!hhhhi!ihhi!!!");
    }

    @Test
    public void test7847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7847");
        char[] charArray7 = new char[] {};
        java.lang.String str8 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("hi!", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("hHHI!hHHI!iHHI!!", charArray7);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhi!hhhi!ihhi!!", charArray7);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("hhhhi!hhhiHhhi!hhhi!ihhi!!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hi!" + "'", str11, "Hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hHHI!hHHI!iHHI!!" + "'", str12, "hHHI!hHHI!iHHI!!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hhhi!hhhi!ihhi!!" + "'", str13, "hhhi!hhhi!ihhi!!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hhhhi!hhhiHhhi!hhhi!ihhi!!" + "'", str14, "hhhhi!hhhiHhhi!hhhi!ihhi!!");
    }

    @Test
    public void test7848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7848");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!H", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!H" + "'", str2, "hHhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!H");
    }

    @Test
    public void test7849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7849");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hHHHHI!HHHIhHHI!HHHI!HHHI!IHHI!!HHI!IHHI!HHHI!HHHI!IHHI!!HHI!HHHI!IHHI!!HHI!!HHHHHI!HHHIhHHI!HHHI!HHHI!IHHI!!HHI!IHHI!HHHI!HHHI!IHHI!!HHI!HHHI!IHHI!!HHI!!HHHHHI!HHHIhHHI!HHHI!HHHI!IHHI!!HHI!IHHI!HHHI!HHHI!IHHI!!HHI!HHHI!IHHI!!HHI!!HHHHHI!HHHIhHHI!HHHI!HHHI!IHHI!!HHI!IHHI!HHHI!HHHI!IHHI!!HHI!HHHI!IHHI!!HHI!!IHHHHI!HHHIhHHI!HHHI!HHHI!IHHI!!HHI!IHHI!HHHI!HHHI!IHHI!!HHI!HHHI!IHHI!!HHI!!!HHHHI!HHHIhHHI!HHHI!HHHI!IHHI!!HHI!IHHI!HHHI!HHHI!IHHI!!HHI!HHHI!IHHI!!HHI!!IHHHHI!HHHIhHHI!HHHI!HHHI!IHHI!!HHI!IHHI!HHHI!HHHI!IHHI!!HHI!HHHI!IHHI!!HHI!!HHHHHI!HHHIhHHI!HHHI!HHHI!IHHI!!HHI!IHHI!HHHI!HHHI!IHHI!!HHI!HHHI!IHHI!!HHI!!HHHHHI!HHHIhHHI!HHHI!HHHI!IHHI!!HHI!IHHI!HHHI!HHHI!IHHI!!HHI!HHHI!IHHI!!HHI!!IHHHHI!HHHIhHHI!HHHI!HHHI!IHHI!!HHI!IHHI!HHHI!HHHI!IHHI!!HHI!HHHI!IHHI!!HHI!!!HHHHI!HHHIhHHI!HHHI!HHHI!IHHI!!HHI!IHHI!HHHI!HHHI!IHHI!!HHI!HHHI!IHHI!!HHI!!!", (int) (byte) 0, "HHHHI!HHHIhHHHHI!IHHI!!HHHHHI!IHHI!!HHHHHI!IHHHHHI!HHHIHHHI!HHHI!IHHI!!HI!!IHHHHI!IHHI!!!HHHHI!IHHI!!HHHHHHHHHI!HHHIHHHI!HHHI!IHHI!!I!IHHI!!HHHHHI!IHHI!!HHHHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHI!IHHI!!!HHHHI!IHHI!!IHHHHI!IHHHHHHI!HHHIHHHI!HHHI!IHHI!!I!!HHHHHI!IHHI!!HHHHHI!IHHI!!IHHHHIHHHHI!HHHIHHHI!HHHI!IHHI!!!IHHI!!!HHHHI!IHHI!!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHHHI!HHHIhHHI!HHHI!HHHI!IHHI!!HHI!IHHI!HHHI!HHHI!IHHI!!HHI!HHHI!IHHI!!HHI!!HHHHHI!HHHIhHHI!HHHI!HHHI!IHHI!!HHI!IHHI!HHHI!HHHI!IHHI!!HHI!HHHI!IHHI!!HHI!!HHHHHI!HHHIhHHI!HHHI!HHHI!IHHI!!HHI!IHHI!HHHI!HHHI!IHHI!!HHI!HHHI!IHHI!!HHI!!HHHHHI!HHHIhHHI!HHHI!HHHI!IHHI!!HHI!IHHI!HHHI!HHHI!IHHI!!HHI!HHHI!IHHI!!HHI!!IHHHHI!HHHIhHHI!HHHI!HHHI!IHHI!!HHI!IHHI!HHHI!HHHI!IHHI!!HHI!HHHI!IHHI!!HHI!!!HHHHI!HHHIhHHI!HHHI!HHHI!IHHI!!HHI!IHHI!HHHI!HHHI!IHHI!!HHI!HHHI!IHHI!!HHI!!IHHHHI!HHHIhHHI!HHHI!HHHI!IHHI!!HHI!IHHI!HHHI!HHHI!IHHI!!HHI!HHHI!IHHI!!HHI!!HHHHHI!HHHIhHHI!HHHI!HHHI!IHHI!!HHI!IHHI!HHHI!HHHI!IHHI!!HHI!HHHI!IHHI!!HHI!!HHHHHI!HHHIhHHI!HHHI!HHHI!IHHI!!HHI!IHHI!HHHI!HHHI!IHHI!!HHI!HHHI!IHHI!!HHI!!IHHHHI!HHHIhHHI!HHHI!HHHI!IHHI!!HHI!IHHI!HHHI!HHHI!IHHI!!HHI!HHHI!IHHI!!HHI!!!HHHHI!HHHIhHHI!HHHI!HHHI!IHHI!!HHI!IHHI!HHHI!HHHI!IHHI!!HHI!HHHI!IHHI!!HHI!!!" + "'", str4, "hHHHHI!HHHIhHHI!HHHI!HHHI!IHHI!!HHI!IHHI!HHHI!HHHI!IHHI!!HHI!HHHI!IHHI!!HHI!!HHHHHI!HHHIhHHI!HHHI!HHHI!IHHI!!HHI!IHHI!HHHI!HHHI!IHHI!!HHI!HHHI!IHHI!!HHI!!HHHHHI!HHHIhHHI!HHHI!HHHI!IHHI!!HHI!IHHI!HHHI!HHHI!IHHI!!HHI!HHHI!IHHI!!HHI!!HHHHHI!HHHIhHHI!HHHI!HHHI!IHHI!!HHI!IHHI!HHHI!HHHI!IHHI!!HHI!HHHI!IHHI!!HHI!!IHHHHI!HHHIhHHI!HHHI!HHHI!IHHI!!HHI!IHHI!HHHI!HHHI!IHHI!!HHI!HHHI!IHHI!!HHI!!!HHHHI!HHHIhHHI!HHHI!HHHI!IHHI!!HHI!IHHI!HHHI!HHHI!IHHI!!HHI!HHHI!IHHI!!HHI!!IHHHHI!HHHIhHHI!HHHI!HHHI!IHHI!!HHI!IHHI!HHHI!HHHI!IHHI!!HHI!HHHI!IHHI!!HHI!!HHHHHI!HHHIhHHI!HHHI!HHHI!IHHI!!HHI!IHHI!HHHI!HHHI!IHHI!!HHI!HHHI!IHHI!!HHI!!HHHHHI!HHHIhHHI!HHHI!HHHI!IHHI!!HHI!IHHI!HHHI!HHHI!IHHI!!HHI!HHHI!IHHI!!HHI!!IHHHHI!HHHIhHHI!HHHI!HHHI!IHHI!!HHI!IHHI!HHHI!HHHI!IHHI!!HHI!HHHI!IHHI!!HHI!!!HHHHI!HHHIhHHI!HHHI!HHHI!IHHI!!HHI!IHHI!HHHI!HHHI!IHHI!!HHI!HHHI!IHHI!!HHI!!!");
    }

    @Test
    public void test7850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7850");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!" + "'", str2, "hhhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Hhhhi!hhhi!ihhi!!Ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!");
    }

    @Test
    public void test7851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7851");
        char[] charArray14 = new char[] {};
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray14);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("", charArray14);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray14);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray14);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("", charArray14);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray14);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalize("H", charArray14);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalize("hH", charArray14);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalizeFully("hhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!ihi!!hi!hhi!ihi!!hi!!", charArray14);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalizeFully("HHI!iHI!!", charArray14);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihHhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhhhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihhhhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!!hh!", charArray14);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhi!ihhiHhhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhhhhi!hhhihhhi!hhhi!ihhi!!hi!!ihhhhi!ihhi!!!hhhhi!ihhi!!hhhhhhhhhi!hhhihhhi!hhhi!ihhi!!i!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!hhhhi!ihhi!!!hhhhi!ihhi!!ihhhhi!ihhhhhhi!hhhihhhi!hhhi!ihhi!!i!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhihhhhi!hhhihhhi!hhhi!ihhi!!!ihhi!!!hhhhi!ihhi!!!", charArray14);
        java.lang.String str27 = org.apache.commons.lang.WordUtils.initials("hHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!hHIHI!!HI!HHI!IHI!!HI!!", charArray14);
        java.lang.String str28 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!hhhi!hhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!iHhHHHHI!HHHHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!HhHhhhi!ihhi!HHHi!iHHi!hi!!", charArray14);
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!ihi!!hi!hhi!ihi!!hi!!" + "'", str23, "hhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!ihi!!hi!hhi!ihi!!hi!!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "HHI!iHI!!" + "'", str24, "HHI!iHI!!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihHhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhhhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihhhhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!!hh!" + "'", str25, "Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihHhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhhhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihhhhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!!hh!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Hhhhi!ihhiHhhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhhhhi!hhhihhhi!hhhi!ihhi!!hi!!ihhhhi!ihhi!!!hhhhi!ihhi!!hhhhhhhhhi!hhhihhhi!hhhi!ihhi!!i!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!hhhhi!ihhi!!!hhhhi!ihhi!!ihhhhi!ihhhhhhi!hhhihhhi!hhhi!ihhi!!i!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhihhhhi!hhhihhhi!hhhi!ihhi!!!ihhi!!!hhhhi!ihhi!!!" + "'", str26, "Hhhhi!ihhiHhhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhhhhi!hhhihhhi!hhhi!ihhi!!hi!!ihhhhi!ihhi!!!hhhhi!ihhi!!hhhhhhhhhi!hhhihhhi!hhhi!ihhi!!i!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!hhhhi!ihhi!!!hhhhi!ihhi!!ihhhhi!ihhhhhhi!hhhihhhi!hhhi!ihhi!!i!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhihhhhi!hhhihhhi!hhhi!ihhi!!!ihhi!!!hhhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Hhhi!hhhi!hhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!iHhHHHHI!HHHHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!HhHhhhi!ihhi!HHHi!iHHi!hi!!" + "'", str28, "Hhhi!hhhi!hhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!iHhHHHHI!HHHHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!HhHhhhi!ihhi!HHHi!iHHi!hi!!");
    }

    @Test
    public void test7852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7852");
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
        java.lang.String str24 = org.apache.commons.lang.WordUtils.uncapitalize("HHHI!HHHI!HHHI!IHI!!HHHI!IHI!!HHhHhhI!IhhI!hhhi!ihhi!!HI!!HI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHIhHhhI!IhhI!hhhi!ihhi!!HI!!!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IhHhhI!IhhI!hhhi!ihhi!!HI!!HI!!!HHI!IHI!!HHHI!IHI!!IHHI!IHIhHhhI!IhhI!hhhi!ihhi!!HI!!!!!HHI!IHI!!!", charArray12);
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
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "HHHI!HHHI!HHHI!IHI!!HHHI!IHI!!HHhHhhI!IhhI!hhhi!ihhi!!HI!!HI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHIhHhhI!IhhI!hhhi!ihhi!!HI!!!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IhHhhI!IhhI!hhhi!ihhi!!HI!!HI!!!HHI!IHI!!HHHI!IHI!!IHHI!IHIhHhhI!IhhI!hhhi!ihhi!!HI!!!!!HHI!IHI!!!" + "'", str24, "HHHI!HHHI!HHHI!IHI!!HHHI!IHI!!HHhHhhI!IhhI!hhhi!ihhi!!HI!!HI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHIhHhhI!IhhI!hhhi!ihhi!!HI!!!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IhHhhI!IhhI!hhhi!ihhi!!HI!!HI!!!HHI!IHI!!HHHI!IHI!!IHHI!IHIhHhhI!IhhI!hhhi!ihhi!!HI!!!!!HHI!IHI!!!");
    }

    @Test
    public void test7853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7853");
        char[] charArray13 = new char[] { '#', '4', '4', '4' };
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray13);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray13);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("", charArray13);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray13);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!ihhi!!", charArray13);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!h", charArray13);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!ihhi!HHhhi!hhhi!hHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HhHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!IHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!!HHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!", charArray13);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.initials("hhHHI!IHHI!!HhHHI!IHHI!!hhHHI!IHHI!!hhHHI!IHHI!!IhHHI!IHHI!!!hHHI!IHHI!!IhHHI!IHHI!!hhHHI!IHHI!!hhHHI!IHHI!!IhHHI!IHHI!!!hHHI!IHHI!!hhHHI!IHHI!!hhHHI!IHHI!!hhHHI!IHHI!!ihHHI!IHHI!!!hHHI!IHHI!!ihHHI!IHHI!!hhHHI!IHHI!!hhHHI!IHHI!!ihHHI!IHHI!!!hHHI!IHHI!!!hHHI!IHHI!!HhHHI!IHHI!!IhHHI!IHHI!!!hHHI!IHHI!!!", charArray13);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalize("hhhi!ihhi!Hhhi!ihhi!HHI!iHI!!hi!!", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '#', '4', '4', '4' });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hi!" + "'", str14, "Hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hi!" + "'", str15, "Hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H" + "'", str17, "H");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hhhi!ihhi!!" + "'", str18, "Hhhi!ihhi!!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!h" + "'", str19, "Hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!h");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hhhi!ihhi!HHhhi!hhhi!hHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HhHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!IHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!!HHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!" + "'", str20, "hhhi!ihhi!HHhhi!hhhi!hHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HhHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!IHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!!HHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "h" + "'", str21, "h");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Hhhi!ihhi!Hhhi!ihhi!HHI!iHI!!hi!!" + "'", str22, "Hhhi!ihhi!Hhhi!ihhi!HHI!iHI!!hi!!");
    }

    @Test
    public void test7854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7854");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!HHI!IHI!!HI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!HHI!IHI!!HI!!" + "'", str1, "HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!HHI!IHI!!HI!!");
    }

    @Test
    public void test7855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7855");
        char[] charArray6 = new char[] {};
        java.lang.String str7 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray6);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.initials("", charArray6);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("hi!", charArray6);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray6);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("hHHI!hHHI!iHHI!!", charArray6);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("Hhhhi!Hhhi!HhI!hhHI!", charArray6);
        java.lang.Class<?> wildcardClass13 = charArray6.getClass();
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hi!" + "'", str10, "Hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hHHI!hHHI!iHHI!!" + "'", str11, "hHHI!hHHI!iHHI!!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hhhhi!Hhhi!HhI!hhHI!" + "'", str12, "Hhhhi!Hhhi!HhI!hhHI!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test7856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7856");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hHhhI!IhhIhhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!Hhihi!!hi!hhi!ihi!!hi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!ihhihhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!hhihi!!hi!hhi!ihi!!hi!!" + "'", str1, "Hhhhi!ihhihhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!hhihi!!hi!hhi!ihi!!hi!!");
    }

    @Test
    public void test7857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7857");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.uncapitalize("hhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHHI!HHHI!HHI!HHHI!", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHHI!HHHI!HHI!HHHI!" + "'", str2, "hhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHHI!HHHI!HHI!HHHI!");
    }

    @Test
    public void test7858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7858");
        char[] charArray8 = new char[] {};
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!hhhi!hhi!hhhi!", charArray8);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!hhhi!HhHHHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!HHI!IHI!!HI!!", charArray8);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhihhhi!hhhi!hhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hi!" + "'", str12, "Hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hhhi!hhhi!hhi!hhhi!" + "'", str14, "Hhhi!hhhi!hhi!hhhi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hhhi!hhhi!HhHHHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!HHI!IHI!!HI!!" + "'", str15, "Hhhi!hhhi!HhHHHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!HHI!IHI!!HI!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhihhhi!hhhi!hhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!" + "'", str16, "Hhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhihhhi!hhhi!hhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!");
    }

    @Test
    public void test7859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7859");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("HHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!Hhhhi!hhhiHHhhi!!ihhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test7860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7860");
        char[] charArray6 = new char[] {};
        java.lang.String str7 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray6);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.initials("", charArray6);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray6);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray6);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhi!Hhhi!Ihhi!!", charArray6);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("hhhi!hhhi!hhhi!Ihhi!!hhi!Ihhi!hhhi!hhhi!Ihhi!!hhi!Hhhi!Ihhi!!hhi!!", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hhhi!Hhhi!Ihhi!!" + "'", str11, "hhhi!Hhhi!Ihhi!!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hhhi!hhhi!hhhi!Ihhi!!hhi!Ihhi!hhhi!hhhi!Ihhi!!hhi!Hhhi!Ihhi!!hhi!!" + "'", str12, "hhhi!hhhi!hhhi!Ihhi!!hhi!Ihhi!hhhi!hhhi!Ihhi!!hhi!Hhhi!Ihhi!!hhi!!");
    }

    @Test
    public void test7861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7861");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hHI!HHI!HHHHHHI!HHHI!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IhhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!IhHHI!hHHI!iHHI!!!hHHI!hHHI!iHHIhHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!iHhhi!Hhhi!Ihhi!!!Hhhi!Hhhi!IHHhhhi!ihhi!hi!!h", 1, "Hhhi!hhhi!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHI!HHI!HHHHHHI!HHHI!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IhhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!IhHHI!hHHI!iHHI!!!hHHI!hHHI!iHHIhHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!iHhhi!Hhhi!Ihhi!!!Hhhi!Hhhi!IHHhhhi!ihhi!hi!!h" + "'", str4, "hHI!HHI!HHHHHHI!HHHI!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IhhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!HhHHI!hHHI!iHHI!!IhHHI!hHHI!iHHI!!!hHHI!hHHI!iHHIhHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!iHhhi!Hhhi!Ihhi!!!Hhhi!Hhhi!IHHhhhi!ihhi!hi!!h");
    }

    @Test
    public void test7862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7862");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hhhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!HhhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!HHHI!hHHI!HHhi!", (int) (short) 0, "hHHHI!IHHIHHHi!iHHi!hHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!HhhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!HHHI!hHHI!HHhi!" + "'", str4, "hhhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!HhhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!HHHI!hHHI!HHhi!");
    }

    @Test
    public void test7863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7863");
        char[] charArray10 = new char[] {};
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhi!Hhhi!Ihhi!!", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("hHHHI!IHHI!HI!!H", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("HHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhhHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!!", charArray10);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("Hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhhhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!!", charArray10);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.uncapitalize("HHhi!hHhi!HHhi!IHhi!!", charArray10);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.initials("HHHHI!HHHI!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!", charArray10);
        java.lang.Class<?> wildcardClass21 = charArray10.getClass();
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hhhi!Hhhi!Ihhi!!" + "'", str15, "hhhi!Hhhi!Ihhi!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hHHHI!IHHI!HI!!H" + "'", str16, "hHHHI!IHHI!HI!!H");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhhhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!!" + "'", str18, "Hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhhhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "HHhi!hHhi!HHhi!IHhi!!" + "'", str19, "HHhi!hHhi!HHhi!IHhi!!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test7864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7864");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hHhhhi!ihhHHhHhHhHhHhHhHhHiHhH!HhHhHhHhHhHhHhHiHhH!HhHiHhHhHhHhHhHiHhH!HhH!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHhhhi!ihhHHhHhHhHhHhHhHhHiHhH!HhHhHhHhHhHhHhHiHhH!HhHiHhHhHhHhHhHiHhH!HhH!" + "'", str1, "HHhhhi!ihhHHhHhHhHhHhHhHhHiHhH!HhHhHhHhHhHhHhHiHhH!HhHiHhHhHhHhHhHiHhH!HhH!");
    }

    @Test
    public void test7865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7865");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!ihhi!hhhhhi!ihhi!hi!!h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!ihhi!hhhhhi!ihhi!hi!!h" + "'", str1, "Hhhi!ihhi!hhhhhi!ihhi!hi!!h");
    }

    @Test
    public void test7866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7866");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("Hhhi!ihhi!hhhi!ihhi!hhhi!ihhi!!hi!!", (int) (byte) -1, "Hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hHHHI!HHHIhhHHI!!IHHI!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhi!ihhi!hhhi!ihhi!hhhi!ihhi!!hi!!" + "'", str4, "Hhhi!ihhi!hhhi!ihhi!hhhi!ihhi!!hi!!");
    }

    @Test
    public void test7867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7867");
        char[] charArray8 = new char[] {};
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("h", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("Hhi!", charArray8);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("hhhi!Hhhi!Ihhi!!", charArray8);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("hHHHI!IHHI!!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hi!" + "'", str11, "Hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "h" + "'", str13, "h");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hhhi!Hhhi!Ihhi!!" + "'", str15, "hhhi!Hhhi!Ihhi!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hHHHI!IHHI!!" + "'", str16, "hHHHI!IHHI!!");
    }

    @Test
    public void test7868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7868");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("Hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhihhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhihhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!" + "'", str1, "Hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhihhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!");
    }

    @Test
    public void test7869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7869");
        char[] charArray9 = new char[] {};
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("hH", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("HI!", charArray9);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("HhHHHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!HHI!IHI!!HI!!", charArray9);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("hhhi!ihhi!hhhhi!ihhi!hi!!h", charArray9);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhhhhhhihhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hH" + "'", str14, "hH");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HI!" + "'", str15, "HI!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HhHHHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!HHI!IHI!!HI!!" + "'", str16, "HhHHHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!HHI!IHI!!HI!!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hhhi!ihhi!hhhhi!ihhi!hi!!h" + "'", str17, "hhhi!ihhi!hhhhi!ihhi!hi!!h");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hhhhhhhhhihhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!" + "'", str18, "Hhhhhhhhhihhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
    }

    @Test
    public void test7870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7870");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("Hhhi!ihhi!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHI!IHHI!HI!" + "'", str1, "hHHI!IHHI!HI!");
    }

    @Test
    public void test7871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7871");
        char[] charArray7 = new char[] { '#' };
        java.lang.String str8 = org.apache.commons.lang.WordUtils.uncapitalize("Hi!", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("hHi!", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("hHHHI!HHHI!IHHI!!", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("hHHHi!iHHi!hi!!H", charArray7);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("HhHHHI!IHHIHHHHI!HHHI!IHHI!!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '#' });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "h" + "'", str9, "h");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HHHHI!HHHI!IHHI!!" + "'", str10, "HHHHI!HHHI!IHHI!!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "h" + "'", str12, "h");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H" + "'", str13, "H");
    }

    @Test
    public void test7872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7872");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IhHHHI!hHHI!hHi!HHhi!HHI!!IHHHI!IHHI!!!HHHHHI!IHHI!!HhHHHI!hHHI!hHi!HHhi!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHhHHHI!hHHI!hHi!HHhi!I!!!HHHi!iHHi!HHHI!IHHI!!hi!!IHHhHHHI!hHHI!hHi!HHhi!HHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHIhHHHI!hHHI!hHi!HHhi!!!IHHHI!IHHI!!!!", 1, 100, "Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!hHHHI!HHHIhHHI!HHHI!IHHI!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IhHHHI!hHHI!hHi!HHhi!HHI!!IHHHI!IHHI!!!HHHHHI!IHHI!!HhHHHI!hHHI!hHi!HHhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!hHHHI!HHHIhHHI!HHHI!IHHI!!" + "'", str4, "hHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IhHHHI!hHHI!hHi!HHhi!HHI!!IHHHI!IHHI!!!HHHHHI!IHHI!!HhHHHI!hHHI!hHi!HHhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!hHHHI!HHHIhHHI!HHHI!IHHI!!");
    }

    @Test
    public void test7873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7873");
        char[] charArray8 = new char[] {};
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("Hh", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("HHHI!hHHI!HHhi!", charArray8);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!", charArray8);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!ihhi!hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hi!" + "'", str11, "Hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hh" + "'", str13, "Hh");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!" + "'", str15, "Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hhhi!ihhi!hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!" + "'", str16, "Hhhi!ihhi!hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!");
    }

    @Test
    public void test7874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7874");
        char[] charArray6 = new char[] {};
        java.lang.String str7 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray6);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.initials("", charArray6);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray6);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray6);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("H", charArray6);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("hHHHHi!iHHHHHI!IHHI!HHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H" + "'", str11, "H");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test7875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7875");
        char[] charArray9 = new char[] {};
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("h", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("Hhi!", charArray9);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("hhhi!Hhhi!Ihhi!!", charArray9);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("Hhhhhhhhhhhhhhhhihhh!hhhhhhhhhhhhhhhihhh!hhhihhhhhhhhhhhihhh!hhh!", charArray9);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("hHHhhhi!ihhi!hi!!hhHHhhhi!ihhi!hi!!hhHHhhhi!ihhi!hi!!hiHHhhhi!ihhi!hi!!h!HHhhhi!ihhi!hi!!hiHHhhhi!ihHhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hi!" + "'", str12, "Hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "h" + "'", str14, "h");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hhhi!Hhhi!Ihhi!!" + "'", str16, "hhhi!Hhhi!Ihhi!!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hhhhhhhhhhhhhhhhihhh!hhhhhhhhhhhhhhhihhh!hhhihhhhhhhhhhhihhh!hhh!" + "'", str17, "Hhhhhhhhhhhhhhhhihhh!hhhhhhhhhhhhhhhihhh!hhhihhhhhhhhhhhihhh!hhh!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test7876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7876");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hhhhi!hhhhi!hhhhi!ihhhi!!hhhi!ihhhi!hhhhi!hhhhi!ihhhi!!hhhi!hhhhi!hhhhi!hhhhi!ihhhi!!hhhi!ihhhi!hhhhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!i!hhhhi!ihhhi!!hhhi!!hhhi!hhhhi!ihhhi!!hhhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhhi!hhhhi!hhhhi!ihhhi!!hhhi!ihhhi!hhhhi!hhhhi!ihhhi!!hhhi!hhhhi!hhhhi!hhhhi!ihhhi!!hhhi!ihhhi!hhhhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!i!hhhhi!ihhhi!!hhhi!!hhhi!hhhhi!ihhhi!!hhhi!!" + "'", str1, "hhhhi!hhhhi!hhhhi!ihhhi!!hhhi!ihhhi!hhhhi!hhhhi!ihhhi!!hhhi!hhhhi!hhhhi!hhhhi!ihhhi!!hhhi!ihhhi!hhhhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!i!hhhhi!ihhhi!!hhhi!!hhhi!hhhhi!ihhhi!!hhhi!!");
    }

    @Test
    public void test7877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7877");
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
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalizeFully("HhhhI!IhhI!HI!!", charArray12);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhhhi!hhhi!hhhi!", charArray12);
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "HhhhI!IhhI!HI!!" + "'", str23, "HhhhI!IhhI!HI!!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhhhi!hhhi!hhhi!" + "'", str24, "Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!Ihhhhi!hhhi!hhhi!");
    }

    @Test
    public void test7878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7878");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("Hhhh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test7879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7879");
        char[] charArray12 = new char[] {};
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray12);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("", charArray12);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray12);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray12);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("hH", charArray12);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!ihhi!hi!!", charArray12);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.uncapitalize("hhhi!hhhi!HHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!hHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!hhhi!Hhhi!hhHI!", charArray12);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("HHhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!", charArray12);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.uncapitalize("HhHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!ihHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!ihHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!!hHHI!IHHI!HI!!h", charArray12);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalize("hHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHhHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHHHHI!IHHI!HHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHHHHHI!HHHI!HHHI!IHHI!!HHI!IHHI!HHHI!HHHI!IHHI!!HHI!HHHI!IHHI!!HHI!!!HH!", charArray12);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhhhhhhihhhhhi!ihhi!hi!!hhh!hhhhhhhhhhhhi!ihhi!hi!!hhhhhihh!hhhhhhhi!ihhi!hi!!hihhhhhhhhihhhhhi!ihhi!hi!!hhh!hh!", charArray12);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] {});
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hH" + "'", str17, "hH");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hhhi!ihhi!hi!!" + "'", str18, "Hhhi!ihhi!hi!!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hhhi!hhhi!HHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!hHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!hhhi!Hhhi!hhHI!" + "'", str19, "hhhi!hhhi!HHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!hHHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!hhhi!Hhhi!hhHI!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HHhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!" + "'", str20, "HHhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "HhHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!ihHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!ihHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!!hHHI!IHHI!HI!!h" + "'", str21, "HhHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!ihHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!ihHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!!hHHI!IHHI!HI!!h");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHhHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHHHHI!IHHI!HHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHHHHHI!HHHI!HHHI!IHHI!!HHI!IHHI!HHHI!HHHI!IHHI!!HHI!HHHI!IHHI!!HHI!!!HH!" + "'", str22, "hHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHhHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHHHHI!IHHI!HHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHHHHHI!HHHI!HHHI!IHHI!!HHI!IHHI!HHHI!HHHI!IHHI!!HHI!HHHI!IHHI!!HHI!!!HH!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Hhhhhhhhhihhhhhi!ihhi!hi!!hhh!hhhhhhhhhhhhi!ihhi!hi!!hhhhhihh!hhhhhhhi!ihhi!hi!!hihhhhhhhhihhhhhi!ihhi!hi!!hhh!hh!" + "'", str23, "Hhhhhhhhhihhhhhi!ihhi!hi!!hhh!hhhhhhhhhhhhi!ihhi!hi!!hhhhhihh!hhhhhhhi!ihhi!hi!!hihhhhhhhhihhhhhi!ihhi!hi!!hhh!hh!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test7880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7880");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHHHI!IHHI!HHHHI!IHHI!HI!!HHHHHI!IHHI!HHHHI!IHHI!HI!!HHHHHI!IHHI!HHHHI!IHHI!HI!!HHHHHI!IHHI!HHHHI!IHHI!HI!!HIHHHI!IHHI!HHHHI!IHHI!HI!!H!HHHI!IHHI!HHHHI!IHHI!HI!!HIHHHI!IHHI!HHHHI!IHHI!HI!!HHHHHI!IHHI!HHHHI!IHHI!HI!!HHHHHI!IHHI!HHHHI!IHHI!HI!!HIHHHI!IHHI!HHHHI!IHHI!HI!!H!HHHI!IHHI!HHHHI!IHHI!HI!!HHHHHI!IHHI!HHHHI!IHHI!HI!!HIHHHI!IHHI!HHHHI!IHHI!HI!!H!HHHI!IHHI!HHHHI!IHHI!HI!!H!HHHI!IHHI!HHHHI!IHHI!HI!!HH", (int) '#', (int) (byte) 1, "HhHHHHI!HHHHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!HhHhhhi!ihhi!HHHi!iHHi!hi!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHHI!IHHI!HHHHI!IHHI!HI!!HHHHHI!IHHhHHHHI!HHHHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!HhHhhhi!ihhi!HHHi!iHHi!hi!!" + "'", str4, "hHHHI!IHHI!HHHHI!IHHI!HI!!HHHHHI!IHHhHHHHI!HHHHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!HhHhhhi!ihhi!HHHi!iHHi!hi!!");
    }

    @Test
    public void test7881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7881");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhhi!ihhihhh", 0, (int) (short) 1, "hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!" + "'", str4, "Hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
    }

    @Test
    public void test7882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7882");
        char[] charArray11 = new char[] {};
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("H", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("hhI!", charArray11);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("hH", charArray11);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("hHHi!iHHi!!", charArray11);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray11);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!ihhi!hhhi!ihhi!hhhi!ihhi!!hi!!", charArray11);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalize("hHHHI!HHHI!IHHI!!", charArray11);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.initials("HhHHHI!HHHHhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhhhi!ihhi!hhi!ihi!!hi!!", charArray11);
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hhhi!ihhi!hhhi!ihhi!hhhi!ihhi!!hi!!" + "'", str20, "Hhhi!ihhi!hhhi!ihhi!hhhi!ihhi!!hi!!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hHHHI!HHHI!IHHI!!" + "'", str21, "hHHHI!HHHI!IHHI!!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test7883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7883");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hHHHi!iHHi!hi!!", (int) (byte) 1, "hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!iHHHI!hHHI!iHHI!!!HHHI!hHHI!iHHI!!iHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!HHHHI!hHHI!iHHI!!HHHHI!hHHI!iHHI!!HHHHI!hHHI!iHHI!!IHHHI!hHHI!iHHI!!!HHHI!hHHI!iHHI!!IHHHI!hHHI!iHHI!!HHHHI!hHHI!iHHI!!HHHHI!hHHI!iHHI!!IHHHI!hHHI!iHHI!!!HHHI!hHHI!iHHI!!HHHHI!hHHI!iHHI!!IHHHI!hHHI!iHHI!!!HHHI!hHHI!iHHI!!!HHHI!hHHI!iHHI!!H", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHHi!iHHi!hi!!" + "'", str4, "hHHHi!iHHi!hi!!");
    }

    @Test
    public void test7884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7884");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HhHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!ihHHI!IHHI!HI!!hhHHI!IHHIhhhi!Hhhi!HhI!hhHI!!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHIhhhi!Hhhi!HhI!hhHI!!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!ihHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!hhhi!Hhhi!HhI!hhHI!!hHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!!hHHI!IHHI!HI!!h", (int) (byte) 100, (int) (short) -1, "Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihHHhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!!H");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HhHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!ihHHI!IHHI!HI!!hhHHI!IHHIhhhi!Hhhi!HhI!hhHI!!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHIhhhi!Hhhi!HhI!hhHI!!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!ihHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!hhhi!Hhhi!HhI!hhHI!!hHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!!hHHI!IHHI!HI!!h" + "'", str4, "HhHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!ihHHI!IHHI!HI!!hhHHI!IHHIhhhi!Hhhi!HhI!hhHI!!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHIhhhi!Hhhi!HhI!hhHI!!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!ihHHI!IHHI!HI!!hhHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!hhhi!Hhhi!HhI!hhHI!!hHHI!IHHI!HI!!hhHHI!IHHI!HI!!ihHHI!IHHI!HI!!!hHHI!IHHI!HI!!!hHHI!IHHI!HI!!h");
    }

    @Test
    public void test7885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7885");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!hHhhhi!ihhihhhI!IhhI!Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihhhHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhi!ihhi!!!Hhhhi!hhhiHhhi!hhhi!ihhi!!HHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhi!ihhi!!!Hhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!HHhhhi!hhhiHhhi!hhhi!ihhi!!IHhhhi!hhhiHhhi!hhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhhi!ihhihhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihhhhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!" + "'", str1, "Hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhhi!ihhihhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihhhhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!");
    }

    @Test
    public void test7886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7886");
        char[] charArray7 = new char[] { '#', '4', '4', '4' };
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("hhI!", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!hhhi!hhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhHHHHHI!IHHI!HI!!H", charArray7);
        java.lang.Class<?> wildcardClass11 = charArray7.getClass();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '#', '4', '4', '4' });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hi!" + "'", str8, "Hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "h" + "'", str9, "h");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hhhi!hhhi!hhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhhhhhhi!ihhi!hi!!h" + "'", str10, "Hhhi!hhhi!hhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhhhhhhi!ihhi!hi!!h");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test7887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7887");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hhhi!ihhi!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!ihhi!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!" + "'", str1, "Hhhi!ihhi!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!hhhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!ihhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!!");
    }

    @Test
    public void test7888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7888");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HHhhhi!ihhi!!HHhhhi!ihhi!!HHhhhi!ihHhhhi!hhhiHhhi!hhhi!ihhi!!hi!!IHhhhi!ihhi!!!Hhhhi!ihhi!!HHhhhHHHHI!HHHI!HHHI!iHHI!!HHI!iHHI!HHHI!HHHI!iHHI!!HHI!hHHI!iHHI!!HHI!!hhhi!hhhiHhhi!hhhi!ihhi!!i!ihhi!!HHhhhi!ihhi!!HHhhhi!ihhi!!IHhhhi!hhhiHhhi!hhhi!ihhi!!Hhhhi!ihhi!HHHI!HHHI!HHHI!iHHI!!HHI!iHHI!HHHI!HHHI!iHHI!!HHI!hHHI!iHHI!!HHI!!!!Hhhhi!ihhi!!IHhhhi!ihhHhhhi!hhhiHhhi!hhhi!ihhi!!i!!HHhhhi!ihhi!!HHhhhi!ihhi!!IHhhhiHhhhi!hhhiHhHHHI!HHHI!HHHI!iHHI!!HHI!iHHI!HHHI!HHHI!iHHI!!HHI!hHHI!iHHI!!HHI!!hi!hhhi!ihhi!!!ihhi!!!Hhhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHhhhi!ihhi!!HHhhhi!ihhi!!HHhhhi!ihHhhhi!hhhiHhhi!hhhi!ihhi!!hi!!IHhhhi!ihhi!!!Hhhhi!ihhi!!HHhhhHHHHI!HHHI!HHHI!iHHI!!HHI!iHHI!HHHI!HHHI!iHHI!!HHI!hHHI!iHHI!!HHI!!hhhi!hhhiHhhi!hhhi!ihhi!!i!ihhi!!HHhhhi!ihhi!!HHhhhi!ihhi!!IHhhhi!hhhiHhhi!hhhi!ihhi!!Hhhhi!ihhi!HHHI!HHHI!HHHI!iHHI!!HHI!iHHI!HHHI!HHHI!iHHI!!HHI!hHHI!iHHI!!HHI!!!!Hhhhi!ihhi!!IHhhhi!ihhHhhhi!hhhiHhhi!hhhi!ihhi!!i!!HHhhhi!ihhi!!HHhhhi!ihhi!!IHhhhiHhhhi!hhhiHhHHHI!HHHI!HHHI!iHHI!!HHI!iHHI!HHHI!HHHI!iHHI!!HHI!hHHI!iHHI!!HHI!!hi!hhhi!ihhi!!!ihhi!!!Hhhhi!ihhi!!!" + "'", str1, "hHhhhi!ihhi!!HHhhhi!ihhi!!HHhhhi!ihHhhhi!hhhiHhhi!hhhi!ihhi!!hi!!IHhhhi!ihhi!!!Hhhhi!ihhi!!HHhhhHHHHI!HHHI!HHHI!iHHI!!HHI!iHHI!HHHI!HHHI!iHHI!!HHI!hHHI!iHHI!!HHI!!hhhi!hhhiHhhi!hhhi!ihhi!!i!ihhi!!HHhhhi!ihhi!!HHhhhi!ihhi!!IHhhhi!hhhiHhhi!hhhi!ihhi!!Hhhhi!ihhi!HHHI!HHHI!HHHI!iHHI!!HHI!iHHI!HHHI!HHHI!iHHI!!HHI!hHHI!iHHI!!HHI!!!!Hhhhi!ihhi!!IHhhhi!ihhHhhhi!hhhiHhhi!hhhi!ihhi!!i!!HHhhhi!ihhi!!HHhhhi!ihhi!!IHhhhiHhhhi!hhhiHhHHHI!HHHI!HHHI!iHHI!!HHI!iHHI!HHHI!HHHI!iHHI!!HHI!hHHI!iHHI!!HHI!!hi!hhhi!ihhi!!!ihhi!!!Hhhhi!ihhi!!!");
    }

    @Test
    public void test7889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7889");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhi!ihhi!hhhhi!ihhi!hhhi!ihhi!!hi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!ihhi!hhhhi!ihhi!hhhi!ihhi!!hi!!" + "'", str1, "Hhhi!ihhi!hhhhi!ihhi!hhhi!ihhi!!hi!!");
    }

    @Test
    public void test7890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7890");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HHHi!iHHi!hi!!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHHi!iHHi!hi!!" + "'", str2, "HHHi!iHHi!hi!!");
    }

    @Test
    public void test7891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7891");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hhhhi!hhhiHHhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhHhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HIhhHHHI!IHhHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhi!ihhi!!!Hhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhi!ihhi!!!Hhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhi!ihhi!!!Hhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhi!ihhi!!!Hhhhi!hhhiHhhi!hhhi!ihhi!!!Hhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhi!ihhi!!!Hhhhi!hhhiHhhi!hhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!hhhiHHhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhHhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HIhhHHHI!IHhHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhi!ihhi!!!Hhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhi!ihhi!!!Hhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhi!ihhi!!!Hhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhi!ihhi!!!Hhhhi!hhhiHhhi!hhhi!ihhi!!!Hhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhi!ihhi!!!Hhhhi!hhhiHhhi!hhhi!ihhi!!!" + "'", str1, "Hhhhi!hhhiHHhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhHhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HIhhHHHI!IHhHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhi!ihhi!!!Hhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhi!ihhi!!!Hhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhi!ihhi!!!Hhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhi!ihhi!!!Hhhhi!hhhiHhhi!hhhi!ihhi!!!Hhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhi!ihhi!!!Hhhhi!hhhiHhhi!hhhi!ihhi!!!");
    }

    @Test
    public void test7892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7892");
        char[] charArray7 = new char[] {};
        java.lang.String str8 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("H", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("hhI!", charArray7);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("Hhhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!", charArray7);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("HhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HhhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HI!!HIhhHHHI!IHHI!HI!!H!hhHHHI!IHHI!HI!!H!", charArray7);
        java.lang.Class<?> wildcardClass15 = charArray7.getClass();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H" + "'", str11, "H");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hhhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!" + "'", str13, "Hhhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test7893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7893");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("Hhhhhhhhhhhhhhhhhihhh!hhhhhhhhhhhhhhhihhh!hhhihhhhhhhhhhhihhh!hhh!", 10, "Hhhhhi!ihhHhhi!ihhi!Hhhi!ihhi!HHI!iHI!!hi!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhhhhhhhhhhhhhhhihhh!hhhhhhhhhhhhhhhihhh!hhhihhhhhhhhhhhihhh!hhh!" + "'", str4, "Hhhhhhhhhhhhhhhhhihhh!hhhhhhhhhhhhhhhihhh!hhhihhhhhhhhhhhihhh!hhh!");
    }

    @Test
    public void test7894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7894");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHHHI!HHHIHHHI!HHHI!IHHI!!", (int) (short) 100, (int) (byte) 1, "hHHHI!IHHIhHi!!!HHHHI!IHhHi!HI!!HHHHI!hHi!IHHI!!HHHHhHi!I!IHHI!!IHhHi!HHI!IHHI!!hHi!!HHHI!IHHIhHi!!!IHHHI!IHhHi!HI!!HHHHI!hHi!IHHI!!HhHHhHi!Hi!iHHi!!HhHi!HHHi!iHHi!hHi!!HHHHi!iHHhHi!i!!HHHHi!ihHi!HHi!!IHHHihHi!!iHHi!!!HHhHi!Hi!iHHi!!IhHi!HHHi!iHHi!hHi!!HHHHi!iHHhHi!i!!HHHHi!ihHi!HHi!!IHHHihHi!!iHHi!!!HHhHi!Hi!iHHi!!HhHi!HHHi!iHHi!hHi!!IHHHi!iHHhHi!i!!!HHHi!ihHi!HHi!!!HHHIhHi!!IHHI!!IHHhHi!HI!IHHI!!!hHi!HHHI!IHHI!hHi!!HHHHI!IHHhHi!I!!IHHHI!IhHi!HHI!!!HHHIhHi!!IHHI!!!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end 100, length 26");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7895");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hHHI!IHHI!HHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHHHHHHI!IHHI!hhi!Ihi!!HI!!HHHHI!IHHI!hhi!Ihi!!HI!!HHHHI!IHHI!hhi!Ihi!!HI!!IHHHI!IHHI!hhi!Ihi!!HI!!!HHHI!IHHI!hhi!Ihi!!HI!!IHHHI!IHHI!hhi!Ihi!!HI!!HHHHI!IHHI!hhi!Ihi!!HI!!HHHHI!IHHI!hhi!Ihi!!HI!!IHHHI!IHHI!hhi!Ihi!!HI!!!HHHI!IHHI!hhi!Ihi!!HI!!hHHHI!IHHI!hhi!Ihi!!HI!!iHHHI!IHHI!hhi!Ihi!!HI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHI!IHHI!HHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHHHHHHI!IHHI!hhi!Ihi!!HI!!HHHHI!IHHI!hhi!Ihi!!HI!!HHHHI!IHHI!hhi!Ihi!!HI!!IHHHI!IHHI!hhi!Ihi!!HI!!!HHHI!IHHI!hhi!Ihi!!HI!!IHHHI!IHHI!hhi!Ihi!!HI!!HHHHI!IHHI!hhi!Ihi!!HI!!HHHHI!IHHI!hhi!Ihi!!HI!!IHHHI!IHHI!hhi!Ihi!!HI!!!HHHI!IHHI!hhi!Ihi!!HI!!hHHHI!IHHI!hhi!Ihi!!HI!!iHHHI!IHHI!hhi!Ihi!!HI!!!" + "'", str1, "hHHI!IHHI!HHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!hHHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHHHHHHI!IHHI!hhi!Ihi!!HI!!HHHHI!IHHI!hhi!Ihi!!HI!!HHHHI!IHHI!hhi!Ihi!!HI!!IHHHI!IHHI!hhi!Ihi!!HI!!!HHHI!IHHI!hhi!Ihi!!HI!!IHHHI!IHHI!hhi!Ihi!!HI!!HHHHI!IHHI!hhi!Ihi!!HI!!HHHHI!IHHI!hhi!Ihi!!HI!!IHHHI!IHHI!hhi!Ihi!!HI!!!HHHI!IHHI!hhi!Ihi!!HI!!hHHHI!IHHI!hhi!Ihi!!HI!!iHHHI!IHHI!hhi!Ihi!!HI!!!");
    }

    @Test
    public void test7896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7896");
        char[] charArray7 = new char[] {};
        java.lang.String str8 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("Hi!", charArray7);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray7);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("Hhhi!ihhi!hhi!hhi!hhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhhhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhhi!hhhi!hhi!hhhi!hhhhi!ihhihhi!hhi!hhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhhhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhhi!hhhi!hhi!hhhi!!hi!!h", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hi!" + "'", str12, "Hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test7897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7897");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HHI!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHI!" + "'", str2, "HHI!");
    }

    @Test
    public void test7898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7898");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhhHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhhHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!!" + "'", str2, "hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhhHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!!");
    }

    @Test
    public void test7899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7899");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!HHhhhi!hhhhHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!hhhhhi!hhhhhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!" + "'", str2, "Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!hhhhhi!hhhhhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
    }

    @Test
    public void test7900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7900");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hHHHI!HHHI!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHIhHHhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!hHhhhi!hhhi!ihhi!!hHhhhi!hhhi!ihhi!!iHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!hHhhhi!hhhi!ihhi!!iHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHHI!HHHI!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHIhHHhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!hHhhhi!hhhi!ihhi!!hHhhhi!hhhi!ihhi!!iHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!hHhhhi!hhhi!ihhi!!iHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!!" + "'", str1, "hHHHI!HHHI!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHIhHHhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!hHhhhi!hhhi!ihhi!!hHhhhi!hhhi!ihhi!!iHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!hHhhhi!hhhi!ihhi!!iHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!HHhhhi!hhhi!ihhi!!IHhhhi!hhhi!ihhi!!!Hhhhi!hhhi!ihhi!!!");
    }

    @Test
    public void test7901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7901");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hHHHI!IHHI!hhhI!IhhI!hhhi!ihhi!!HI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!ihhi!HHHi!iHHi!HHHI!IHHI!!hi!!" + "'", str1, "Hhhhi!ihhi!HHHi!iHHi!HHHI!IHHI!!hi!!");
    }

    @Test
    public void test7902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7902");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HHhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HhHHHHI!IHHHHHI!IHHI!HHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!", 0, "hHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HhHHHHI!IHHHHHI!IHHI!HHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!" + "'", str4, "HHhhHHHI!IHHI!HI!!HHhhHHHI!IHHI!HhHHHHI!IHHHHHI!IHHI!HHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!");
    }

    @Test
    public void test7903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7903");
        char[] charArray8 = new char[] { '#', ' ', '4' };
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("hhhi!hhhi!ihhi!!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("HHHi!iHHi!HhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!!HhhhI!IhhIHhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!!!HI!!h", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhiHHHI!hHHI!Hhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!!", charArray8);
        java.lang.Class<?> wildcardClass14 = charArray8.getClass();
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '#', ' ', '4' });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Hi!" + "'", str9, "Hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hi!" + "'", str10, "Hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hhhi!hhhi!ihhi!!" + "'", str11, "Hhhi!hhhi!ihhi!!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HHHi!iHHi!HhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!!HhhhI!IhhIHhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!!!HI!!h" + "'", str12, "HHHi!iHHi!HhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!!HhhhI!IhhIHhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!!!HI!!h");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhihhhi!hhhi!hhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!" + "'", str13, "Hhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhihhhi!hhhi!hhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test7904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7904");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("Hhhi!hhhi!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!hHhHHHI!IHHI!hhhI!IhhI!HI!!", (int) (short) 0, "HhHHI!IHHIHHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhhHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhi!hhhi!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!hHhHHHI!IHHI!hhhI!IhhI!HI!!" + "'", str4, "Hhhi!hhhi!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!hHhHHHI!IHHI!hhhI!IhhI!HI!!");
    }

    @Test
    public void test7905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7905");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("HHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!Hhhhi!hhhiHHhhi!!ihhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!Hhhhi!hhhiHHhhi!!ihhi!!" + "'", str1, "HHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!Hhhhi!hhhiHHhhi!!ihhi!!");
    }

    @Test
    public void test7906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7906");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hHHI!IHHI!HHhhhi!ihhi!hi!!h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHI!IHHI!HHhhhi!ihhi!hi!!h" + "'", str1, "HHHI!IHHI!HHhhhi!ihhi!hi!!h");
    }

    @Test
    public void test7907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7907");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHhhI!IhhIhHh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhhi!ihhihhh" + "'", str1, "Hhhhhi!ihhihhh");
    }

    @Test
    public void test7908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7908");
        char[] charArray8 = new char[] {};
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhi!Hhhi!Ihhi!!", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("HHhhhi!ihhi!hi!!h", charArray8);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("hhhhI!IhhI!HI!!", charArray8);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("hHHHI!IHHI!HHHHI!IHHI!HHHI!IHHI!!HI!!", charArray8);
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
    public void test7909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7909");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!!" + "'", str1, "hhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!!");
    }

    @Test
    public void test7910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7910");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhhi!hhhiHHHHHI!IHHI!!HHHHHI!IHHI!!HHHHHI!IHHHHHI!HHHIHHHI!HHHI!IHHI!!HI!!IHHHHI!IHHI!!!HHHHI!IHHI!!HHHHHHhhhHHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!HHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!hHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!hHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!hHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!iHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!!HhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!iHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!hHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!hHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!iHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!!HhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!hHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!iHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!!HhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!!HhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!hhhihhhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhhhhi!hhhihhhi!hhhi!ihhi!!hi!!ihhhhi!ihhi!!!hhhhi!ihhi!!hhhhhhhhhhhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!ihhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!ihhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!ihhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!ihhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!h" + "'", str1, "Hhhhi!hhhihhhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhhhhi!hhhihhhi!hhhi!ihhi!!hi!!ihhhhi!ihhi!!!hhhhi!ihhi!!hhhhhhhhhhhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!ihhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!ihhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!ihhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!ihhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!h");
    }

    @Test
    public void test7911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7911");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HHhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!", (-1), "HHHI!hHHI!iHHI!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!" + "'", str4, "HHhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
    }

    @Test
    public void test7912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7912");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHhhi!hhhi!hhhi!Ihhi!!hhi!Ihhi!hhhi!hhhi!Ihhi!!hhi!Hhhi!Ihhi!!hhi!!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHhhi!hhhi!hhhi!Ihhi!!hhi!Ihhi!hhhi!hhhi!Ihhi!!hhi!Hhhi!Ihhi!!hhi!!" + "'", str2, "HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHhhi!hhhi!hhhi!Ihhi!!hhi!Ihhi!hhhi!hhhi!Ihhi!!hhi!Hhhi!Ihhi!!hhi!!");
    }

    @Test
    public void test7913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7913");
        char[] charArray9 = new char[] { '#', '4', '4', '4' };
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!ihhi!hi!!", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("Hhhhhi!ihhhhhi!ihhi!!i!hi!!h", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!iHHHI!hHHI!iHHI!!!HHHI!hHHI!iHHI!!iHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!HHHHI!hHHI!iHHI!!HHHHI!hHHI!iHHI!!HHHHI!hHHI!iHHI!!IHHHI!hHHI!iHHI!!!HHHI!hHHI!iHHI!!IHHHI!hHHI!iHHI!!HHHHI!hHHI!iHHI!!HHHHI!hHHI!iHHI!!IHHHI!hHHI!iHHI!!!HHHI!hHHI!iHHI!!HHHHI!hHHI!iHHI!!IHHHI!hHHI!iHHI!!!HHHI!hHHI!iHHI!!!HHHI!hHHI!iHHI!!H", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("hHhhhi!ihhihhhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhhhhi!hhhihhhi!hhhi!ihhi!!hi!!ihhhhi!ihhi!!!hhhhi!ihhi!!hhhhhhhhhi!hhhihhhi!hhhi!ihhi!!i!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!hhhhi!ihhi!!!hhhhi!ihhi!!ihhhhi!ihhhhhhi!hhhihhhi!hhhi!ihhi!!i!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhihhhhi!hhhihhhi!hhhi!ihhi!!!ihhi!!!hhhhi!ihhi!!!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '#', '4', '4', '4' });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hi!" + "'", str10, "Hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hhhi!ihhi!hi!!" + "'", str11, "Hhhi!ihhi!hi!!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H" + "'", str12, "H");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!iHHHI!hHHI!iHHI!!!HHHI!hHHI!iHHI!!iHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!HHHHI!hHHI!iHHI!!HHHHI!hHHI!iHHI!!HHHHI!hHHI!iHHI!!IHHHI!hHHI!iHHI!!!HHHI!hHHI!iHHI!!IHHHI!hHHI!iHHI!!HHHHI!hHHI!iHHI!!HHHHI!hHHI!iHHI!!IHHHI!hHHI!iHHI!!!HHHI!hHHI!iHHI!!HHHHI!hHHI!iHHI!!IHHHI!hHHI!iHHI!!!HHHI!hHHI!iHHI!!!HHHI!hHHI!iHHI!!H" + "'", str13, "hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!iHHHI!hHHI!iHHI!!!HHHI!hHHI!iHHI!!iHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!HHHHI!hHHI!iHHI!!HHHHI!hHHI!iHHI!!HHHHI!hHHI!iHHI!!IHHHI!hHHI!iHHI!!!HHHI!hHHI!iHHI!!IHHHI!hHHI!iHHI!!HHHHI!hHHI!iHHI!!HHHHI!hHHI!iHHI!!IHHHI!hHHI!iHHI!!!HHHI!hHHI!iHHI!!HHHHI!hHHI!iHHI!!IHHHI!hHHI!iHHI!!!HHHI!hHHI!iHHI!!!HHHI!hHHI!iHHI!!H");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hHhhhi!ihhihhhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhhhhi!hhhihhhi!hhhi!ihhi!!hi!!ihhhhi!ihhi!!!hhhhi!ihhi!!hhhhhhhhhi!hhhihhhi!hhhi!ihhi!!i!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!hhhhi!ihhi!!!hhhhi!ihhi!!ihhhhi!ihhhhhhi!hhhihhhi!hhhi!ihhi!!i!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhihhhhi!hhhihhhi!hhhi!ihhi!!!ihhi!!!hhhhi!ihhi!!!" + "'", str14, "hHhhhi!ihhihhhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhhhhi!hhhihhhi!hhhi!ihhi!!hi!!ihhhhi!ihhi!!!hhhhi!ihhi!!hhhhhhhhhi!hhhihhhi!hhhi!ihhi!!i!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!hhhhi!ihhi!!!hhhhi!ihhi!!ihhhhi!ihhhhhhi!hhhihhhi!hhhi!ihhi!!i!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhihhhhi!hhhihhhi!hhhi!ihhi!!!ihhi!!!hhhhi!ihhi!!!");
    }

    @Test
    public void test7914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7914");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("HhHHHI!IHHhhHhHhHhHhHhHhHhIhHh!hhhhi!hhhi!hhi!hhhi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HhHHHI!IHHhhHhHhHhHhHhHhHhIhHh!hhhhi!hhhi!hhi!hhhi!" + "'", str1, "HhHHHI!IHHhhHhHhHhHhHhHhHhIhHh!hhhhi!hhhi!hhi!hhhi!");
    }

    @Test
    public void test7915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7915");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHHHI!HHHIhHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHI!HHI!HHHHHHHI!HHHI!IHHI!!HHHHHI!HHHI!IHHI!!HHHHHI!HHHI!IHHI!!IHHHHI!HHHI!IHHI!!!HHHHI!HHHI!IHHI!!IHHHHI!HHHI!IHHI!!HHHHHI!HHHI!IHHI!!HHHHHI!HHHI!IHHI!!IHHHHI!HHHI!IHHI!!!HHHHI!HHHI!IHHI!!HHHHHI!HHHI!IHHI!!HHHHHI!HHHI!IHHI!!IHHHHI!HHHI!IHHI!!!HHHHI!HHHI!IHHI!!IHHHHI!HHHI!IHHI!!HHHHHI!HHHI!IHHI!!IHHHHI!HHHI!IHHI!!!HHHHI!HHHI!IHHI!!!HHHHI!HHHI!IHHI!!HHHHHI!HHHI!IHHI!!IHHHHI!HHHI!IHHI!!!HHHHI!HHHI!IHHI!!!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHHHI!HHHIhHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHI!HHI!HHHHHHHI!HHHI!IHHI!!HHHHHI!HHHI!IHHI!!HHHHHI!HHHI!IHHI!!IHHHHI!HHHI!IHHI!!!HHHHI!HHHI!IHHI!!IHHHHI!HHHI!IHHI!!HHHHHI!HHHI!IHHI!!HHHHHI!HHHI!IHHI!!IHHHHI!HHHI!IHHI!!!HHHHI!HHHI!IHHI!!HHHHHI!HHHI!IHHI!!HHHHHI!HHHI!IHHI!!IHHHHI!HHHI!IHHI!!!HHHHI!HHHI!IHHI!!IHHHHI!HHHI!IHHI!!HHHHHI!HHHI!IHHI!!IHHHHI!HHHI!IHHI!!!HHHHI!HHHI!IHHI!!!HHHHI!HHHI!IHHI!!HHHHHI!HHHI!IHHI!!IHHHHI!HHHI!IHHI!!!HHHHI!HHHI!IHHI!!!" + "'", str2, "hHHHI!HHHIhHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHI!HHI!HHHHHHHI!HHHI!IHHI!!HHHHHI!HHHI!IHHI!!HHHHHI!HHHI!IHHI!!IHHHHI!HHHI!IHHI!!!HHHHI!HHHI!IHHI!!IHHHHI!HHHI!IHHI!!HHHHHI!HHHI!IHHI!!HHHHHI!HHHI!IHHI!!IHHHHI!HHHI!IHHI!!!HHHHI!HHHI!IHHI!!HHHHHI!HHHI!IHHI!!HHHHHI!HHHI!IHHI!!IHHHHI!HHHI!IHHI!!!HHHHI!HHHI!IHHI!!IHHHHI!HHHI!IHHI!!HHHHHI!HHHI!IHHI!!IHHHHI!HHHI!IHHI!!!HHHHI!HHHI!IHHI!!!HHHHI!HHHI!IHHI!!HHHHHI!HHHI!IHHI!!IHHHHI!HHHI!IHHI!!!HHHHI!HHHI!IHHI!!!");
    }

    @Test
    public void test7916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7916");
        char[] charArray7 = new char[] { ' ' };
        java.lang.String str8 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("hhhi!Hhhi!Ihhi!!", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("hh", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!H", charArray7);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!ihhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { ' ' });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H" + "'", str8, "H");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H" + "'", str9, "H");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hhhi!Hhhi!Ihhi!!" + "'", str10, "hhhi!Hhhi!Ihhi!!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hh" + "'", str11, "Hh");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!H" + "'", str12, "hHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!H");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "h" + "'", str13, "h");
    }

    @Test
    public void test7917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7917");
        char[] charArray12 = new char[] { '#', '4', '4', '4' };
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray12);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray12);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("H", charArray12);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("", charArray12);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHHi!iHHi!hi!!", charArray12);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("HHhhi!ihhi!!hHhhi!ihhi!!HHhhi!ihhi!!HHhhi!ihhi!!iHhhi!ihhi!!!Hhhi!ihhi!!iHhhi!ihhi!!HHhhi!ihhi!!HHhhi!ihhi!!iHhhi!ihhi!!!Hhhi!ihhi!!HHhhi!ihhi!!HHhhi!ihhi!!HHhhi!ihhi!!IHhhi!ihhi!!!Hhhi!ihhi!!IHhhi!ihhi!!HHhhi!ihhi!!HHhhi!ihhi!!IHhhi!ihhi!!!Hhhi!ihhi!!!Hhhi!ihhi!!hHhhi!ihhi!!iHhhi!ihhi!!!Hhhi!ihhi!!!", charArray12);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.initials("HHhi!Ihi!!hHhi!Ihi!!hHhi!Ihi!!hHhi!Ihi!!iHhi!Ihi!!!Hhi!Ihi!!hHhi!Ihi!!hHhi!Ihi!!hHhi!Ihi!!iHhi!Ihi!!!Hhi!Ihi!!iHhi!Ihi!!hHhi!Ihi!!hHhi!Ihi!!iHhi!Ihi!!!Hhi!Ihi!!!", charArray12);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '#', '4', '4', '4' });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hi!" + "'", str13, "Hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hi!" + "'", str14, "Hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "h" + "'", str15, "h");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hhhhi!ihhi!hi!!" + "'", str17, "Hhhhi!ihhi!hi!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hHhhi!ihhi!!hHhhi!ihhi!!HHhhi!ihhi!!HHhhi!ihhi!!iHhhi!ihhi!!!Hhhi!ihhi!!iHhhi!ihhi!!HHhhi!ihhi!!HHhhi!ihhi!!iHhhi!ihhi!!!Hhhi!ihhi!!HHhhi!ihhi!!HHhhi!ihhi!!HHhhi!ihhi!!IHhhi!ihhi!!!Hhhi!ihhi!!IHhhi!ihhi!!HHhhi!ihhi!!HHhhi!ihhi!!IHhhi!ihhi!!!Hhhi!ihhi!!!Hhhi!ihhi!!hHhhi!ihhi!!iHhhi!ihhi!!!Hhhi!ihhi!!!" + "'", str18, "hHhhi!ihhi!!hHhhi!ihhi!!HHhhi!ihhi!!HHhhi!ihhi!!iHhhi!ihhi!!!Hhhi!ihhi!!iHhhi!ihhi!!HHhhi!ihhi!!HHhhi!ihhi!!iHhhi!ihhi!!!Hhhi!ihhi!!HHhhi!ihhi!!HHhhi!ihhi!!HHhhi!ihhi!!IHhhi!ihhi!!!Hhhi!ihhi!!IHhhi!ihhi!!HHhhi!ihhi!!HHhhi!ihhi!!IHhhi!ihhi!!!Hhhi!ihhi!!!Hhhi!ihhi!!hHhhi!ihhi!!iHhhi!ihhi!!!Hhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H" + "'", str19, "H");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test7918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7918");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hhI!HhI!HhI!HhI!ihI!!hI!ihI!HhI!HhIHhhhhhhhhhhhhhhhihhh!hhhhhhhhhhhhhhhihhh!hhhihhhhhhhhhhhihhh!hhh!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHi!hHi!hHi!hHi!IHi!!Hi!IHi!hHi!hHihHHHHHHHHHHHHHHHIHHH!HHHHHHHHHHHHHHHIHHH!HHHIHHHHHHHHHHHIHHH!HHH!" + "'", str1, "HHi!hHi!hHi!hHi!IHi!!Hi!IHi!hHi!hHihHHHHHHHHHHHHHHHIHHH!HHHHHHHHHHHHHHHIHHH!HHHIHHHHHHHHHHHIHHH!HHH!");
    }

    @Test
    public void test7919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7919");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHI!IHI!!" + "'", str1, "HHI!IHI!!");
    }

    @Test
    public void test7920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7920");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!HHI!IHI!!HI!!", 0, (int) (byte) 10, "HhHHHI!IHHhhhi!hhhi!HhHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!!hHI!iHI!!ihHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!hHhhI!IhhI!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHHHHI!IHHHhHHHI!IHHhhhi!hhhi!HhHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!!hHI!iHI!!ihHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!hHhhI!IhhI!!" + "'", str4, "HHHHHI!IHHHhHHHI!IHHhhhi!hhhi!HhHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!!hHI!iHI!!ihHI!iHI!!hhHI!iHI!!hhHI!iHI!!ihHI!iHI!!hHhhI!IhhI!!");
    }

    @Test
    public void test7921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7921");
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
        java.lang.String str25 = org.apache.commons.lang.WordUtils.capitalize("hHhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!!H", charArray14);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!hhhi!HhHHHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!HHI!IHI!!HI!!", charArray14);
        java.lang.String str27 = org.apache.commons.lang.WordUtils.uncapitalize("hHHHI!HHHIhhHHI!!IHHI!!", charArray14);
        java.lang.String str28 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!h!", charArray14);
        java.lang.Class<?> wildcardClass29 = charArray14.getClass();
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
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hHhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!!H" + "'", str25, "hHhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!!H");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Hhhi!hhhi!HhHHHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!HHI!IHI!!HI!!" + "'", str26, "Hhhi!hhhi!HhHHHI!HHI!HHI!IHI!!HI!IHI!HHI!HHI!IHI!!HI!HHI!IHI!!HI!!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hHHHI!HHHIhhHHI!!IHHI!!" + "'", str27, "hHHHI!HHHIhhHHI!!IHHI!!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Hhhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!h!" + "'", str28, "Hhhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hhhhhhhi!ihhi!hi!!hihhhhhi!ihhi!hi!!h!hhhhhi!ihhi!hi!!h!");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test7922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7922");
        char[] charArray8 = new char[] {};
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("hi!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("HH", charArray8);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("Hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!!", charArray8);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HI!" + "'", str12, "HI!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HH" + "'", str14, "HH");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test7923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7923");
        char[] charArray10 = new char[] { ' ' };
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("hhhi!Hhhi!Ihhi!!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("hh", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("hHHHI!HHHIHHHI!HHHI!IHHI!!", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("hi!", charArray10);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("HhHHI!IHHI!!HhHHI!IHHI!!hhHHI!IHHI!!hhHHI!IHHI!!IhHHI!IHHI!!!hHHI!IHHI!!IhHHI!IHHI!!hhHHI!IHHI!!hhHHI!IHHI!!IhHHI!IHHI!!!hHHI!IHHI!!hhHHI!IHHI!!hhHHI!IHHI!!hhHHI!IHHI!!ihHHI!IHHI!!!hHHI!IHHI!!ihHHI!IHHI!!hhHHI!IHHI!!hhHHI!IHHI!!ihHHI!IHHI!!!hHHI!IHHI!!!hHHI!IHHI!!HhHHI!IHHI!!IhHHI!IHHI!!!hHHI!IHHI!!!", charArray10);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhhhhhhhhhhhhhhihhh!hhhhhhhhhhhhhhhihhh!hhhihhhhhhhhhhhihhh!hhh!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { ' ' });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H" + "'", str11, "H");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H" + "'", str12, "H");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hhhi!Hhhi!Ihhi!!" + "'", str13, "hhhi!Hhhi!Ihhi!!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hh" + "'", str14, "Hh");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!" + "'", str15, "Hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "h" + "'", str16, "h");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "h" + "'", str17, "h");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hhHHI!IHHI!!HhHHI!IHHI!!hhHHI!IHHI!!hhHHI!IHHI!!IhHHI!IHHI!!!hHHI!IHHI!!IhHHI!IHHI!!hhHHI!IHHI!!hhHHI!IHHI!!IhHHI!IHHI!!!hHHI!IHHI!!hhHHI!IHHI!!hhHHI!IHHI!!hhHHI!IHHI!!ihHHI!IHHI!!!hHHI!IHHI!!ihHHI!IHHI!!hhHHI!IHHI!!hhHHI!IHHI!!ihHHI!IHHI!!!hHHI!IHHI!!!hHHI!IHHI!!HhHHI!IHHI!!IhHHI!IHHI!!!hHHI!IHHI!!!" + "'", str18, "hhHHI!IHHI!!HhHHI!IHHI!!hhHHI!IHHI!!hhHHI!IHHI!!IhHHI!IHHI!!!hHHI!IHHI!!IhHHI!IHHI!!hhHHI!IHHI!!hhHHI!IHHI!!IhHHI!IHHI!!!hHHI!IHHI!!hhHHI!IHHI!!hhHHI!IHHI!!hhHHI!IHHI!!ihHHI!IHHI!!!hHHI!IHHI!!ihHHI!IHHI!!hhHHI!IHHI!!hhHHI!IHHI!!ihHHI!IHHI!!!hHHI!IHHI!!!hHHI!IHHI!!HhHHI!IHHI!!IhHHI!IHHI!!!hHHI!IHHI!!!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Hhhhhhhhhhhhhhhhihhh!hhhhhhhhhhhhhhhihhh!hhhihhhhhhhhhhhihhh!hhh!" + "'", str19, "Hhhhhhhhhhhhhhhhihhh!hhhhhhhhhhhhhhhihhh!hhhihhhhhhhhhhhihhh!hhh!");
    }

    @Test
    public void test7924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7924");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!hhhhhi!hhhhhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test7925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7925");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("HHhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IHhhi!hhI!!IhhhI!IhhI!!!HHhhhI!IhhI!!hHhhi!hhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhHhhi!I!!!HHHi!iHHi!HHHI!IHHI!!hi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test7926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7926");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHHI!HHHI!HHI!HHHI!", (int) (byte) 100, "HHI!HHI!HHHHHHI!HHHI!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHHI!HHHI!HHI!HHHI!" + "'", str4, "HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHHI!HHHI!HHI!HHHI!");
    }

    @Test
    public void test7927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7927");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!hHhhhi!ihhihhhI!IhhI!Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!hHhhhi!ihhihhhI!IhhI!Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!" + "'", str1, "hHhhi!Hhhi!Ihhi!!hHhhi!Hhhi!Ihhi!!hHhhhi!ihhihhhI!IhhI!Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!");
    }

    @Test
    public void test7928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7928");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhhi!ihhi!Hhhhi!ihhihHHI!HHHI!HHHI!iHHI!!HHI!iHHI!HHHI!HHHI!iHHI!!HHI!hHHI!iHHI!!HHI!!", 10, (-1), "hHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHhHHI!HHHI!IHHI!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhi!ihhi!Hhhhi!ihhihHHI!HHHI!HHHI!iHHI!!HHI!iHHI!HHHI!HHHI!iHHI!!HHI!hHHI!iHHI!!HHI!!" + "'", str4, "hhhi!ihhi!Hhhhi!ihhihHHI!HHHI!HHHI!iHHI!!HHI!iHHI!HHHI!HHHI!iHHI!!HHI!hHHI!iHHI!!HHI!!");
    }

    @Test
    public void test7929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7929");
        char[] charArray9 = new char[] {};
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("hhhI!IhhI!HI!!", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("hHHI!IHHI!HHHI!IHHI!!HI!!", charArray9);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("hHHI!IHHI!hHhhI!IhhI!!HHhhI!IhhI!!HHhhI!IhhI!!HHhhI!IhhI!!IHhhI!IhhI!!!HhhI!IhhI!!HHhhI!IhhI!!HHhhI!IhhI!!HHhhhHHHHHHHHHHHHHHHIHHH!HHHHHHHHHHHHHHHIHHH!HHHIHHHHHHHHHHHIHHH!HHH!I!IhhI!!IHhhI!IhhI!!!HhhI!IhhI!!IHhhI!IhhI!!HHhhI!IhhI!!HHhhI!IhhI!!IHhhI!IhhI!!!HhhI!IhhI!!!hhhI!IhhI!hHhhI!IhhI!!HHhhI!IhhI!!HHhhI!IhhI!!HHhhI!IhhI!!IHhhI!IhhI!!!HhhI!IhhI!!HHhhI!IhhI!!HHhhI!IhhI!!HHhhhHHHHHHHHHHHHHHHIHHH!HHHHHHHHHHHHHHHIHHH!HHHIHHHHHHHHHHHIHHH!HHH!I!IhhI!!IHhhI!IhhI!!!HhhI!IhhI!!IHhhI!IhhI!!HHhhI!IhhI!!HHhhI!IhhI!!IHhhI!IhhI!!!HhhI!IhhI!!!HI!!", charArray9);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("HHH", charArray9);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hhhI!IhhI!HI!!" + "'", str14, "hhhI!IhhI!HI!!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hHHI!IHHI!HHHI!IHHI!!HI!!" + "'", str15, "hHHI!IHHI!HHHI!IHHI!!HI!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HHH" + "'", str17, "HHH");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!" + "'", str18, "hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!");
    }

    @Test
    public void test7930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7930");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("HHHHI!HHHIHhHHI!hHHI!iHHI!!HhHHIHHHHHI!HHHIhHHI!HHHI!HHHI!IHHI!!HhHHi!iHHihhhhi!hhhi!ihhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test7931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7931");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HhHI!iHI!!HhHI!iHI!!HhHI!iHI!!IhHI!iHI!!!hHI!iHI!!IhHI!iHI!!HhHI!iHI!!HhHI!iHI!!IhHI!iHI!!!hHI!iHI!!HhHI!iHI!!HhHI!iHI!!IhHI!iHI!!!hHI!iHI!!IhHI!iHI!!HhHI!iHI!!IhHI!iHI!!!hHI!iHI!!!hHI!iHI!!HhHI!iHI!!IhHI!iHI!!!hHI!iHI!!!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HhHI!iHI!!HhHI!iHI!!HhHI!iHI!!IhHI!iHI!!!hHI!iHI!!IhHI!iHI!!HhHI!iHI!!HhHI!iHI!!IhHI!iHI!!!hHI!iHI!!HhHI!iHI!!HhHI!iHI!!IhHI!iHI!!!hHI!iHI!!IhHI!iHI!!HhHI!iHI!!IhHI!iHI!!!hHI!iHI!!!hHI!iHI!!HhHI!iHI!!IhHI!iHI!!!hHI!iHI!!!" + "'", str2, "HhHI!iHI!!HhHI!iHI!!HhHI!iHI!!IhHI!iHI!!!hHI!iHI!!IhHI!iHI!!HhHI!iHI!!HhHI!iHI!!IhHI!iHI!!!hHI!iHI!!HhHI!iHI!!HhHI!iHI!!IhHI!iHI!!!hHI!iHI!!IhHI!iHI!!HhHI!iHI!!IhHI!iHI!!!hHI!iHI!!!hHI!iHI!!HhHI!iHI!!IhHI!iHI!!!hHI!iHI!!!");
    }

    @Test
    public void test7932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7932");
        char[] charArray6 = new char[] {};
        java.lang.String str7 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray6);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.initials("", charArray6);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("hi!", charArray6);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray6);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("hHI!", charArray6);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("hHhhhi!ihhi!!hHhhhi!ihhi!!hHhhhi!ihhi!!hHhhhi!ihhi!!hHHHI!IHHIHHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHIHHHHI!IHHI!HI!!HiHhhhi!ihhi!!!Hhhhi!ihhi!!iHhhhi!ihhi!!hHhhhi!ihhi!!hHHHI!IHHIHHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHIHHHHI!IHHI!HI!!HhHhhhi!ihhi!!iHhhhi!ihhi!!!Hhhhi!ihhi!!hHhhhi!ihhi!!hHHHI!IHHIHHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHIHHHHI!IHHI!HI!!HiHhhhi!ihhi!!!Hhhhi!ihhi!!!Hhhhi!ihhi!!h", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HI!" + "'", str10, "HI!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hHI!" + "'", str11, "hHI!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test7933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7933");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHhhhi!ihhHHhhhhi!hhhihhhi!hhhi!ihhi!!hhhhHHhi!hi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhHHhi!hihhhi!hhhi!ihhi!!ihhhhi!hhhihhhHHhi!i!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhHHhi!i!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhHHhi!i!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhHHhi!hhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!HHhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihHHhi!hhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hHHhi!hhi!ihhi!!hhhhhi!hhhihhhi!hhhi!iHHhi!hhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!HHhi!!hhhhi!hhhihhhi!hhhi!ihhi!!ihhhhHHhi!i!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhHHhi!ihhhi!hhhi!ihhi!!ihhhhi!hhhihhhiHHhi!!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhiHHhi!!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhiHHhi!!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhHHhi!hhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hHHhi!hhihhhi!hhhi!ihhi!!!H", 10, (int) (short) 0, "Hhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHhhhi!ihhHhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!" + "'", str4, "HHhhhi!ihhHhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
    }

    @Test
    public void test7934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7934");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHhhi!hhhi!hhhi!Ihhi!!hhi!Ihhi!hhhi!hhhi!Ihhi!!hhi!Hhhi!Ihhi!!hhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHhhi!hhhi!hhhi!Ihhi!!hhi!Ihhi!hhhi!hhhi!Ihhi!!hhi!Hhhi!Ihhi!!hhi!!" + "'", str1, "hHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHhhi!hhhi!hhhi!Ihhi!!hhi!Ihhi!hhhi!hhhi!Ihhi!!hhi!Hhhi!Ihhi!!hhi!!");
    }

    @Test
    public void test7935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7935");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!ihi!!hi!hhi!ihi!!hi!!hhhhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!ihi!!hi!hhi!ihi!!hi!!hhhhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!ihi!!hi!hhi!ihi!!hi!!hhhhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!ihi!!hi!hhi!ihi!!hi!!h", (int) (byte) 1, 1, "hHHHHHHHHIhHHHI!HHHIHHHHI!HHHIHHHI!IHHI!HI!!!IHHI!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HhHHHHHHHHIhHHHI!HHHIHHHHI!HHHIHHHI!IHHI!HI!!!IHHI!!" + "'", str4, "HhHHHHHHHHIhHHHI!HHHIHHHHI!HHHIHHHI!IHHI!HI!!!IHHI!!");
    }

    @Test
    public void test7936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7936");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("Hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhihhhhi!hhhihhhhi!!ihhi!!!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhhhhi!hhhihhhhi!!ihhi!!hi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!hhhhi!hhhihhhhi!!ihhi!!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhhhhhi!hhhihhhhi!!ihhi!!i!ihhi!!!hhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhihhhhi!hhhihhhhi!!ihhi!!!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhhhhi!hhhihhhhi!!ihhi!!hi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!hhhhi!hhhihhhhi!!ihhi!!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhhhhhi!hhhihhhhi!!ihhi!!i!ihhi!!!hhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!h" + "'", str1, "Hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhihhhhi!hhhihhhhi!!ihhi!!!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhhhhi!hhhihhhhi!!ihhi!!hi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!hhhhi!hhhihhhhi!!ihhi!!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhhhhhi!hhhihhhhi!!ihhi!!i!ihhi!!!hhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!h");
    }

    @Test
    public void test7937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7937");
        char[] charArray10 = new char[] { '#', '4', '4', '4' };
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("Hhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!hhihi!!hi!hhi!ihi!!hi!!", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!hhhi!hHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("HhhI!IhhI!hHHHi!iHHi!hi!!H", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '#', '4', '4', '4' });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hi!" + "'", str11, "Hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hi!" + "'", str12, "Hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!hhihi!!hi!hhi!ihi!!hi!!" + "'", str14, "hhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!hhihi!!hi!hhi!ihi!!hi!!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!" + "'", str15, "Hhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HhhI!IhhI!hHHHi!iHHi!hi!!H" + "'", str16, "HhhI!IhhI!hHHHi!iHHi!hi!!H");
    }

    @Test
    public void test7938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7938");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hhhhi!hhhihhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhihhhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!HhhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!ihhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhhi!hhhihhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhihhhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!HhhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!ihhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!!" + "'", str1, "hhhhi!hhhihhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhihhhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!HhhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!ihhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhI!!IhhhI!IhhI!!!!");
    }

    @Test
    public void test7939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7939");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!hhhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!hhhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!hhhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!ihhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!!hhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!ihhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!hhhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!hhhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!ihhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!!hhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!!", (int) (byte) 100, (int) (byte) 10, "HHHHI!HHHIhHHHHI!IHHI!!HHHHHI!IHHI!!HHHHHI!IHHHHHI!HHHIHHHI!HHHI!IHHI!!HI!!IHHHHI!IHHI!!!HHHHI!IHHI!!HHHHHHHHHI!HHHIHHHI!HHHI!IHHI!!I!IHHI!!HHHHHI!IHHI!!HHHHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHI!IHHI!!!HHHHI!IHHI!!IHHHHI!IHHHHHHI!HHHIHHHI!HHHI!IHHI!!I!!HHHHHI!IHHI!!HHHHHI!IHHI!!IHHHHIHHHHI!HHHIHHHI!HHHI!IHHI!!!IHHI!!!HHHHI!IHHI!!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!hhhhhi!hhhiHhhi!hhhi!hhHHHHI!HHHIhHHHHI!IHHI!!HHHHHI!IHHI!!HHHHHI!IHHHHHI!HHHIHHHI!HHHI!IHHI!!HI!!IHHHHI!IHHI!!!HHHHI!IHHI!!HHHHHHHHHI!HHHIHHHI!HHHI!IHHI!!I!IHHI!!HHHHHI!IHHI!!HHHHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHI!IHHI!!!HHHHI!IHHI!!IHHHHI!IHHHHHHI!HHHIHHHI!HHHI!IHHI!!I!!HHHHHI!IHHI!!HHHHHI!IHHI!!IHHHHIHHHHI!HHHIHHHI!HHHI!IHHI!!!IHHI!!!HHHHI!IHHI!!!" + "'", str4, "Hhhhhi!hhhiHhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!hhhhhi!hhhiHhhi!hhhi!hhHHHHI!HHHIhHHHHI!IHHI!!HHHHHI!IHHI!!HHHHHI!IHHHHHI!HHHIHHHI!HHHI!IHHI!!HI!!IHHHHI!IHHI!!!HHHHI!IHHI!!HHHHHHHHHI!HHHIHHHI!HHHI!IHHI!!I!IHHI!!HHHHHI!IHHI!!HHHHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHI!IHHI!!!HHHHI!IHHI!!IHHHHI!IHHHHHHI!HHHIHHHI!HHHI!IHHI!!I!!HHHHHI!IHHI!!HHHHHI!IHHI!!IHHHHIHHHHI!HHHIHHHI!HHHI!IHHI!!!IHHI!!!HHHHI!IHHI!!!");
    }

    @Test
    public void test7940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7940");
        char[] charArray8 = new char[] { '#', ' ', '4' };
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("HHHHI!HHHIHhi!", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!hhhi!hhhi!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '#', ' ', '4' });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Hi!" + "'", str9, "Hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HHHHI!HHHIHhi!" + "'", str12, "HHHHI!HHHIHhi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!hhhi!hhhi!" + "'", str13, "Hhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!hhhi!hhhi!");
    }

    @Test
    public void test7941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7941");
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
        java.lang.String str24 = org.apache.commons.lang.WordUtils.uncapitalize("HhhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhIhHHI!hHHI!iHHI!!", charArray12);
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "HhhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhIhHHI!hHHI!iHHI!!" + "'", str24, "HhhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhIhHHI!hHHI!iHHI!!");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test7942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7942");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HhhhhhhhhiHHHHi!iHHi!hi!!", (int) (byte) -1, (int) (byte) 1, "Hhhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhhhhi!hhhihhhi!hhhi!ihhi!!hi!!ihhhhi!ihhi!!!hhhhi!ihhi!!hhhhhhhhhi!hhhihhhi!hhhi!ihhi!!i!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!hhhhi!ihhi!!!hhhhi!ihhi!!ihhhhi!ihhhhhhi!hhhihhhi!hhhi!ihhi!!i!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhihhhhi!hhhihhhi!hhhi!ihhi!!!ihhi!!!hhhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHhhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhhhhi!hhhihhhi!hhhi!ihhi!!hi!!ihhhhi!ihhi!!!hhhhi!ihhi!!hhhhhhhhhi!hhhihhhi!hhhi!ihhi!!i!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!hhhhi!ihhi!!!hhhhi!ihhi!!ihhhhi!ihhhhhhi!hhhihhhi!hhhi!ihhi!!i!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhihhhhi!hhhihhhi!hhhi!ihhi!!!ihhi!!!hhhhi!ihhi!!!" + "'", str4, "HHhhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhhhhi!hhhihhhi!hhhi!ihhi!!hi!!ihhhhi!ihhi!!!hhhhi!ihhi!!hhhhhhhhhi!hhhihhhi!hhhi!ihhi!!i!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!hhhhi!ihhi!!!hhhhi!ihhi!!ihhhhi!ihhhhhhi!hhhihhhi!hhhi!ihhi!!i!!hhhhhi!ihhi!!hhhhhi!ihhi!!ihhhhihhhhi!hhhihhhi!hhhi!ihhi!!!ihhi!!!hhhhi!ihhi!!!");
    }

    @Test
    public void test7943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7943");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHHI!HHHIhhHHI!!IHHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!hhhihhhhi!!ihhi!!" + "'", str1, "Hhhhi!hhhihhhhi!!ihhi!!");
    }

    @Test
    public void test7944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7944");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("HhhhhhhhhhhhhhhhhhhhihhhhI!IhhI!HI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test7945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7945");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!H" + "'", str1, "Hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!H");
    }

    @Test
    public void test7946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7946");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!" + "'", str2, "hHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!");
    }

    @Test
    public void test7947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7947");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hhhi!ihhi!HHhhi!hhhi!hHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HhHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!IHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!!HHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!ihhi!HHhhi!hhhi!hHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HhHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!IHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!!HHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!" + "'", str1, "Hhhi!ihhi!HHhhi!hhhi!hHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HhHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!IHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!HHHHi!iHHi!!IHHHi!iHHi!!!HHHi!iHHi!!!HHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!");
    }

    @Test
    public void test7948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7948");
        char[] charArray9 = new char[] {};
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("hi!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray9);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("H", charArray9);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("Hhhi!hhhi!hhhi!ihhi!!hhi!hhhi!hhhi!hhhi!ihhi!!hhi!hhhi!hhhi!hhhi!ihhi!!", charArray9);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhhh", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HI!" + "'", str13, "HI!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hi!" + "'", str15, "Hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhhh" + "'", str18, "Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhhh");
    }

    @Test
    public void test7949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7949");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("", (int) (short) 0, "hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test7950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7950");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HHHI!IHHI!hHHHI!IHHI!HI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHI!IHHI!hHHHI!IHHI!HI!!" + "'", str1, "hHHI!IHHI!hHHHI!IHHI!HI!!");
    }

    @Test
    public void test7951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7951");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!h" + "'", str1, "HHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!h");
    }

    @Test
    public void test7952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7952");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHhhI!IhhI!!HHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!iHhhI!IhhI!!!HhhI!IhhI!!iHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!iHhhI!IhhI!!!HhhI!IhhI!!!HhhI!IhhI!!HHhhI!IhhI!!HHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!iHhhI!IhhI!!!HhhI!IhhI!!iHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!iHhhI!IhhI!!!HhhI!IhhI!!!HhhI!IhhI!!HHhhI!IhhI!!HHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!iHhhI!IhhI!!!HhhI!IhhI!!iHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!iHhhI!IhhI!!!HhhI!IhhI!!!HhhI!IhhI!!IHhhI!IhhI!!HHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!iHhhI!IhhI!!!HhhI!IhhI!!iHhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!iHhhI!IhhI!!!HhhI!IhhI!!!HhhI!IhhI!!hHhhI!IhhI!!hHhhI!IhhI!!HHhhI!IhhI!!IHhhI!IhhI!!!", (int) (short) 10, 10, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHhhI!IhhI" + "'", str4, "HHhhI!IhhI");
    }

    @Test
    public void test7953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7953");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("Hhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!ihi!!hi!hhi!ihi!!hi!!", (int) (byte) 0, "hhhhi!Hhhi!HhI!hhHI!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!ihi!!hi!hhi!ihi!!hi!!" + "'", str4, "Hhi!hhi!hhi!ihi!!hi!ihi!hhi!hhi!ihi!!hi!hhi!ihi!!hi!!");
    }

    @Test
    public void test7954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7954");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hhHHHI!HHHhHHHi!iHHi!!HHHHi!iHHi!!HHHHi!iHHHHHI!hHHI!hHi!HHhi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhhi!hhhhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhhhhi!hhhi!hhi!hhhi!" + "'", str1, "Hhhhhi!hhhhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhhhhi!hhhi!hhi!hhhi!");
    }

    @Test
    public void test7955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7955");
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
        java.lang.String str23 = org.apache.commons.lang.WordUtils.uncapitalize("HhHHi!iHHi!HHHI!IHHI!!hi!!", charArray12);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.uncapitalize("hHHhhhi!ihhi!hi!!hhHHhhhi!ihhi!hi!!hhHHhhhi!ihhi!hi!!hiHHhhhi!ihhi!hi!!h!HHhhhi!ihhi!hi!!hiHHhhhi!ihHhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!!", charArray12);
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Hhhhhi!ihhi!hi!!h" + "'", str22, "Hhhhhi!ihhi!hi!!h");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "HhHHi!iHHi!HHHI!IHHI!!hi!!" + "'", str23, "HhHHi!iHHi!HHHI!IHHI!!hi!!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hHHhhhi!ihhi!hi!!hhHHhhhi!ihhi!hi!!hhHHhhhi!ihhi!hi!!hiHHhhhi!ihhi!hi!!h!HHhhhi!ihhi!hi!!hiHHhhhi!ihHhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!!" + "'", str24, "hHHhhhi!ihhi!hi!!hhHHhhhi!ihhi!hi!!hhHHhhhi!ihhi!hi!!hiHHhhhi!ihhi!hi!!h!HHhhhi!ihhi!hi!!hiHHhhhi!ihHhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!!");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test7956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7956");
        char[] charArray8 = new char[] {};
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("hi!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("HHHI!HHHI!HHHI!", charArray8);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("Hhhi!Hhhi!hhHI!", charArray8);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhhi!ihhiHhhi!hhhi!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhhi!ihhi!!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HI!" + "'", str12, "HI!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HI!" + "'", str13, "HI!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hhhhi!ihhiHhhi!hhhi!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhhi!ihhi!!" + "'", str16, "hhhhi!ihhiHhhi!hhhi!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhhi!ihhi!!");
    }

    @Test
    public void test7957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7957");
        char[] charArray8 = new char[] {};
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHi!iHHi!hi!!", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!ihhi!hi!!", charArray8);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("HhHhhi!ihhi!hi!!HHhhi!ihhi!hi!!HHhhi!ihhi!hi!!IHhhi!ihhi!hi!!!Hhhi!ihhi!hi!!IHhhi!ihhi!hi!!HHhhi!ihhiHHHI!hHHI!hHi!HHhi!!hi!!HHhhi!ihhi!hi!!IHhhi!ihhi!hi!!!Hhhi!ihhi!hi!!HHhhi!ihhi!hi!!HHhhi!ihhi!hi!!HHhhi!ihhi!hi!!HHhhiHHHI!hHHI!hHi!HHhi!!ihhi!hi!!IHhhi!ihhi!hi!!!Hhhi!ihhi!hi!!IHhhi!ihhi!hi!!HHhhi!ihhi!hi!!HHhhi!ihhi!hi!!IHhhi!ihhi!hi!!HHHI!hHHI!hHi!HHhi!!Hhhi!ihhi!hi!!HHhhi!ihhi!hi!!IHhhi!ihhi!hi!!!Hhhi!ihhi!hi!!!Hhhi!ihhi!hi!!H", charArray8);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HHHi!iHHi!hi!!" + "'", str13, "HHHi!iHHi!hi!!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hhhi!ihhi!hi!!" + "'", str14, "Hhhi!ihhi!hi!!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HhHhhi!ihhi!hi!!HHhhi!ihhi!hi!!HHhhi!ihhi!hi!!IHhhi!ihhi!hi!!!Hhhi!ihhi!hi!!IHhhi!ihhi!hi!!HHhhi!ihhiHHHI!hHHI!hHi!HHhi!!hi!!HHhhi!ihhi!hi!!IHhhi!ihhi!hi!!!Hhhi!ihhi!hi!!HHhhi!ihhi!hi!!HHhhi!ihhi!hi!!HHhhi!ihhi!hi!!HHhhiHHHI!hHHI!hHi!HHhi!!ihhi!hi!!IHhhi!ihhi!hi!!!Hhhi!ihhi!hi!!IHhhi!ihhi!hi!!HHhhi!ihhi!hi!!HHhhi!ihhi!hi!!IHhhi!ihhi!hi!!HHHI!hHHI!hHi!HHhi!!Hhhi!ihhi!hi!!HHhhi!ihhi!hi!!IHhhi!ihhi!hi!!!Hhhi!ihhi!hi!!!Hhhi!ihhi!hi!!H" + "'", str15, "HhHhhi!ihhi!hi!!HHhhi!ihhi!hi!!HHhhi!ihhi!hi!!IHhhi!ihhi!hi!!!Hhhi!ihhi!hi!!IHhhi!ihhi!hi!!HHhhi!ihhiHHHI!hHHI!hHi!HHhi!!hi!!HHhhi!ihhi!hi!!IHhhi!ihhi!hi!!!Hhhi!ihhi!hi!!HHhhi!ihhi!hi!!HHhhi!ihhi!hi!!HHhhi!ihhi!hi!!HHhhiHHHI!hHHI!hHi!HHhi!!ihhi!hi!!IHhhi!ihhi!hi!!!Hhhi!ihhi!hi!!IHhhi!ihhi!hi!!HHhhi!ihhi!hi!!HHhhi!ihhi!hi!!IHhhi!ihhi!hi!!HHHI!hHHI!hHi!HHhi!!Hhhi!ihhi!hi!!HHhhi!ihhi!hi!!IHhhi!ihhi!hi!!!Hhhi!ihhi!hi!!!Hhhi!ihhi!hi!!H");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test7958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7958");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!" + "'", str2, "HHHHi!iHHi!!HHHHi!iHHi!!hHHHi!iHHi!!iHHHi!iHHi!!!");
    }

    @Test
    public void test7959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7959");
        char[] charArray12 = new char[] {};
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray12);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("", charArray12);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray12);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray12);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("", charArray12);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("Hi!", charArray12);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray12);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.uncapitalize("hH", charArray12);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalize("hHHI!hHHI!iHHI!!", charArray12);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalize("HHHI!hHHI!HHhi!", charArray12);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.initials("Hhhhhi!hhhhHHI!HHHI!IHHI!!", charArray12);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.initials("", charArray12);
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hHHI!hHHI!iHHI!!" + "'", str21, "hHHI!hHHI!iHHI!!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "HHHI!hHHI!HHhi!" + "'", str22, "HHHI!hHHI!HHhi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test7960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7960");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HHHi!iHHi!HhhhI!IhhI!HI!!h", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHHi!iHHi!HhhhI!IhhI!HI!!h" + "'", str2, "HHHi!iHHi!HhhhI!IhhI!HI!!h");
    }

    @Test
    public void test7961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7961");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!hhhi!hhhi!hhhi!hhhi!ihi!!hhhi!hhhi!ihhi!hhhhhi!ihhi!hi!!h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!hhhi!hhhi!hhhi!hhhi!ihi!!hhhi!hhhi!ihhi!hhhhhi!ihhi!hi!!h" + "'", str1, "Hhhi!hhhi!hhhi!hhhi!hhhi!ihi!!hhhi!hhhi!ihhi!hhhhhi!ihhi!hi!!h");
    }

    @Test
    public void test7962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7962");
        char[] charArray8 = new char[] { '#', '4', '4', '4' };
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHi!iHHi!hi!!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHH", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '#', '4', '4', '4' });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Hi!" + "'", str9, "Hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hi!" + "'", str10, "Hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hhhi!ihhi!hi!!" + "'", str11, "Hhhi!ihhi!hi!!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hhhh" + "'", str12, "Hhhh");
    }

    @Test
    public void test7963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7963");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhhi!ihhi!hhhi!ihhi!!hi!!", 0, (int) (short) -1, "hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!!hhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!!hhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!ihhhi!ihhi!hhi!ihi!!hi!!!hhhi!ihhi!hhi!ihi!!hi!!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhhi!ihhi!hhhi!ihhi!!hi!!" + "'", str4, "Hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhhi!ihhi!hhhi!ihhi!!hi!!");
    }

    @Test
    public void test7964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7964");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HHHHHI!IHHHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!hhHHHI!IHHI!!hhHHHI!IHHI!!hhHHHI!IHhHHHI!HHHIhHHI!HHHI!IHHI!!HI!!ihHHHI!IHHI!!!hHHHI!IHHI!!hhHHHhHHHI!HHHIhHHI!HHHI!IHHI!!I!IHHI!!hhHHHI!IHHI!!hhHHHI!IHHI!!ihHHHI!HHHIhHHI!HHHI!IHHI!!hHHHI!IHHI!!!hHHHI!IHHI!!ihHHHI!IHHhHHHI!HHHIhHHI!HHHI!IHHI!!I!!hhHHHI!IHHI!!hhHHHI!IHHI!!ihHHHIhHHHI!HHHIhHHI!HHHI!IHHI!!!IHHI!!!hHHHI!IHHI!!!", (int) (byte) 0, "hHHI!HHHI!HHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHHHHI!IHHHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!hhHHHI!IHHI!!hhHHHI!IHHI!!hhHHHI!IHhHHHI!HHHIhHHI!HHHI!IHHI!!HI!!ihHHHI!IHHI!!!hHHHI!IHHI!!hhHHHhHHHI!HHHIhHHI!HHHI!IHHI!!I!IHHI!!hhHHHI!IHHI!!hhHHHI!IHHI!!ihHHHI!HHHIhHHI!HHHI!IHHI!!hHHHI!IHHI!!!hHHHI!IHHI!!ihHHHI!IHHhHHHI!HHHIhHHI!HHHI!IHHI!!I!!hhHHHI!IHHI!!hhHHHI!IHHI!!ihHHHIhHHHI!HHHIhHHI!HHHI!IHHI!!!IHHI!!!hHHHI!IHHI!!!" + "'", str4, "HHHHHI!IHHHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!hhHHHI!IHHI!!hhHHHI!IHHI!!hhHHHI!IHhHHHI!HHHIhHHI!HHHI!IHHI!!HI!!ihHHHI!IHHI!!!hHHHI!IHHI!!hhHHHhHHHI!HHHIhHHI!HHHI!IHHI!!I!IHHI!!hhHHHI!IHHI!!hhHHHI!IHHI!!ihHHHI!HHHIhHHI!HHHI!IHHI!!hHHHI!IHHI!!!hHHHI!IHHI!!ihHHHI!IHHhHHHI!HHHIhHHI!HHHI!IHHI!!I!!hhHHHI!IHHI!!hhHHHI!IHHI!!ihHHHIhHHHI!HHHIhHHI!HHHI!IHHI!!!IHHI!!!hHHHI!IHHI!!!");
    }

    @Test
    public void test7965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7965");
        char[] charArray12 = new char[] {};
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray12);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("", charArray12);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray12);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray12);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("", charArray12);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray12);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("H", charArray12);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.initials("hi!", charArray12);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalizeFully("H", charArray12);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.uncapitalize("hHHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!!", charArray12);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.initials("hHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHHHHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!HHHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!HHHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!HHHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!IHHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!!HHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!HHHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!HHHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!HHHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!IHHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!!HHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!IHHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!HHHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!HHHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!IHHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!!HHHHHHHHHIHH!HHHHHHHHHHHIHH!HHIHHHHHHHHIHH!HH!!", charArray12);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhhi!ihhihhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihhhhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] {});
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hi!" + "'", str16, "Hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "h" + "'", str18, "h");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H" + "'", str19, "H");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "H" + "'", str21, "H");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hHHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!!" + "'", str22, "hHHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhhi!ihhihhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihhhhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!" + "'", str24, "Hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhhi!ihhihhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihhhhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!");
    }

    @Test
    public void test7966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7966");
        char[] charArray10 = new char[] {};
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("hh", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("hI!", charArray10);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("Hhhi!ihhi!hi!!", charArray10);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!hhhi!hhhi!", charArray10);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.uncapitalize("HHHHI!HHHIhhHHI!!IHHI!!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hh" + "'", str16, "hh");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hI!" + "'", str17, "hI!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Hhhi!hhhi!hhhi!" + "'", str19, "Hhhi!hhhi!hhhi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HHHHI!HHHIhhHHI!!IHHI!!" + "'", str20, "HHHHI!HHHIhhHHI!!IHHI!!");
    }

    @Test
    public void test7967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7967");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test7968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7968");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHHHI!HHHIHHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHHHI!HHHIHHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!" + "'", str2, "hHHHI!HHHIHHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!");
    }

    @Test
    public void test7969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7969");
        char[] charArray9 = new char[] { '#' };
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("Hi!", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("hHi!", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("hHHHI!HHHI!IHHI!!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("hhH", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("hHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHHHH", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("HHhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!ihhhI!IhhI!!hhhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!hhhhI!IhhI!!ihhhI!IhhI!!!hhhI!IhhI!!!", charArray9);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHHI!HHHIhHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!iHHHI!hHHI!iHHI!!!HHHI!hHHI!iHHI!!iHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!iHHHI!hHHI!iHHI!!!HHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!iHHHI!hHHI!iHHI!!!HHHI!hHHI!iHHI!!!HHHI!hHHI!iHHI!!h", charArray9);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("HHHHI!HHHIHhi!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '#' });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "h" + "'", str11, "h");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HHHHI!HHHI!IHHI!!" + "'", str12, "HHHHI!HHHI!IHHI!!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "h" + "'", str13, "h");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "h" + "'", str14, "h");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!" + "'", str15, "Hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hhhhi!hhhihhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!h" + "'", str16, "Hhhhi!hhhihhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!h");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H" + "'", str17, "H");
    }

    @Test
    public void test7970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7970");
        char[] charArray8 = new char[] {};
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("hi!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray8);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("H", charArray8);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("HhHHHi!iHHHHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!IHhhi!ihhi!HHI!iHI!!hi!!!Hhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!IHhhi!ihhi!HHI!iHI!!hi!!!Hhhi!ihhi!HHI!iHI!!hi!!IHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!IHhhi!ihhi!HHI!iHI!!hi!!!Hhhi!ihhi!HHI!iHI!!hi!!!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hi!" + "'", str12, "Hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hi!" + "'", str14, "Hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HhHHHi!iHHHHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!IHhhi!ihhi!HHI!iHI!!hi!!!Hhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!IHhhi!ihhi!HHI!iHI!!hi!!!Hhhi!ihhi!HHI!iHI!!hi!!IHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!IHhhi!ihhi!HHI!iHI!!hi!!!Hhhi!ihhi!HHI!iHI!!hi!!!" + "'", str16, "HhHHHi!iHHHHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!IHhhi!ihhi!HHI!iHI!!hi!!!Hhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!IHhhi!ihhi!HHI!iHI!!hi!!!Hhhi!ihhi!HHI!iHI!!hi!!IHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!HHhhi!ihhi!HHI!iHI!!hi!!IHhhi!ihhi!HHI!iHI!!hi!!!Hhhi!ihhi!HHI!iHI!!hi!!!");
    }

    @Test
    public void test7971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7971");
        char[] charArray8 = new char[] {};
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("hi!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("HI!", charArray8);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("hH", charArray8);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("Hhhhhi!hhhHhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HI!" + "'", str12, "HI!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HI!" + "'", str14, "HI!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hH" + "'", str15, "hH");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hhhhhi!hhhHhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!" + "'", str16, "Hhhhhi!hhhHhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!");
    }

    @Test
    public void test7972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7972");
        char[] charArray9 = new char[] {};
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("Hh", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("HHHI!hHHI!iHHI!!", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhi!hhhiHhhi!hhhi!ihhi!!", charArray9);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("hhH", charArray9);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhh", charArray9);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("", charArray9);
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
    public void test7973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7973");
        char[] charArray10 = new char[] {};
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("hi!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("H", charArray10);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("HhHI!", charArray10);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("HhhhI!IhhI!HI!!h", charArray10);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.initials("hHhhI!IhhI!hHHHi!iHHi!hi!!HHHhhI!IhhI!hHHHi!iHHi!hi!HHHI!hHHI!hHi!HHhi!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HI!" + "'", str14, "HI!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hi!" + "'", str16, "Hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H" + "'", str17, "H");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HhHI!" + "'", str18, "HhHI!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "HhhhI!IhhI!HI!!h" + "'", str19, "HhhhI!IhhI!HI!!h");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test7974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7974");
        char[] charArray10 = new char[] {};
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("hi!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("Hhhi!ihhi!!", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("hH", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("HHH", charArray10);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("hhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HihHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!H!hHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HHhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HihHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!H!hHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HIhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HihHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!H!hHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!H!", charArray10);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!hhhi!hhhi!ihhi!!hhi!hhhi!hhhi!hhhi!ihhi!!hhi!hhhi!hhhi!hhhi!ihhi!!", charArray10);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.initials("hhhi!hhhi!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhi!!!hhhi!hhhi!ihhi!!!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HHH" + "'", str17, "HHH");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HihHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!H!hHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HHhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HihHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!H!hHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HIhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HihHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!H!hHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!H!" + "'", str18, "hhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HihHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!H!hHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HHhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HihHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!H!hHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HIhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HihHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!H!hHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!HhhHHHi!iHHi!hi!!H!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Hhhi!hhhi!hhhi!ihhi!!hhi!hhhi!hhhi!hhhi!ihhi!!hhi!hhhi!hhhi!hhhi!ihhi!!" + "'", str19, "Hhhi!hhhi!hhhi!ihhi!!hhi!hhhi!hhhi!hhhi!ihhi!!hhi!hhhi!hhhi!hhhi!ihhi!!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test7975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7975");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhHHHI!HHHIhHHI!HHHI!IHHI!!hhHHHI!HHHIhHHI!HHHI!IHHI!!hhHHHI!HHHIhHHI!HHHI!IHHI!!hhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!hhHHHI!HHHIhHHI!HHHI!IHHI!!hhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!HhHHHI!HHHIhHHI!HHHI!IHHI!!IhHHHI!HHHIhHHI!HHHI!IHHI!!!hHHHI!HHHIhHHI!HHHI!IHHI!!!", 0, (int) (short) 10, "Hhhhi!ihhihhhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhhhhi!hhhihhhi!hhhi!ihhi!!hi!!ihhhhi!ihhi!!!hhhhi!ihhi!Hhhhi!hhhihhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhHHHI!HHHHhhhi!ihhihhhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhhhhi!hhhihhhi!hhhi!ihhi!!hi!!ihhhhi!ihhi!!!hhhhi!ihhi!Hhhhi!hhhihhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!" + "'", str4, "hhHHHI!HHHHhhhi!ihhihhhhhi!ihhi!!hhhhhi!ihhi!!hhhhhi!ihhhhhi!hhhihhhi!hhhi!ihhi!!hi!!ihhhhi!ihhi!!!hhhhi!ihhi!Hhhhi!hhhihhhi!hhhi!hhhi!ihhi!!hhi!ihhi!hhhi!hhhi!ihhi!!hhi!hhhi!ihhi!!hhi!!");
    }

    @Test
    public void test7976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7976");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("HhhI!IhhI!hHI!HHI!HHHHHHI!HHHI!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHHHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHHI!HHHI!HHI!HHHI!hHHHi!iHHihHI!HHI!HHHHHHI!HHHI!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHHHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHHI!HHHI!HHI!HHHI!!hi!!H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!ihhi!hhi!hhi!hhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhhhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhhi!hhhi!hhi!hhhi!hhhhi!ihhihhi!hhi!hhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhhhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhhi!hhhi!hhi!hhhi!!hi!!h" + "'", str1, "Hhhi!ihhi!hhi!hhi!hhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhhhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhhi!hhhi!hhi!hhhi!hhhhi!ihhihhi!hhi!hhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhhhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhhi!hhhi!hhi!hhhi!!hi!!h");
    }

    @Test
    public void test7977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7977");
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
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhHHhhhi!hhhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!", charArray10);
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhHHhhhi!hhhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!" + "'", str20, "Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hHhhHHhhhi!hhhhhhhi!hhhi!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
    }

    @Test
    public void test7978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7978");
        char[] charArray10 = new char[] {};
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("hi!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("hhhhi!hhhi!ihhi!!", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("Hhhi!", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("hHHHi!iHHi!hi!!H", charArray10);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("hhhi!ihhi!HHI!iHI!!hi!!", charArray10);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.initials("Hh", charArray10);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.initials("hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!hhHHI!IHHI!hhi!Ihi!!HI!!ihHHI!IHHI!hhi!Ihi!!HI!!!hHHI!IHHI!hhi!Ihi!!HI!!!", charArray10);
        java.lang.Class<?> wildcardClass21 = charArray10.getClass();
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hhhhi!hhhi!ihhi!!" + "'", str15, "hhhhi!hhhi!ihhi!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hHHHi!iHHi!hi!!H" + "'", str17, "hHHHi!iHHi!hi!!H");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hhhi!ihhi!HHI!iHI!!hi!!" + "'", str18, "hhhi!ihhi!HHI!iHI!!hi!!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test7979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7979");
        char[] charArray9 = new char[] {};
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("hi!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("", charArray9);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("hhhhhi!hhhhHHI!HHHI!IHHI!!", charArray9);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!hhhi!ihhi!!", charArray9);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("hHHHI!HHHI!IHHI!!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hi!" + "'", str13, "Hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hhhhhi!hhhhHHI!HHHI!IHHI!!" + "'", str16, "hhhhhi!hhhhHHI!HHHI!IHHI!!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hhhi!hhhi!ihhi!!" + "'", str17, "Hhhi!hhhi!ihhi!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hHHHI!HHHI!IHHI!!" + "'", str18, "hHHHI!HHHI!IHHI!!");
    }

    @Test
    public void test7980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7980");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hHHI!IHHI!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!!HHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!!HHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!!HHHI!IHHI!HHI!IHI!!HI!!!HHHHI!IHHIHHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!!HHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!!HHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!!HHHI!IHHI!HHI!IHI!!HI!!!!HI!!H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHI!IHHI!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!!HHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!!HHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!!HHHI!IHHI!HHI!IHI!!HI!!!HHHHI!IHHIHHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!!HHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!!HHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!!HHHI!IHHI!HHI!IHI!!HI!!!!HI!!H" + "'", str1, "HHHI!IHHI!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!!HHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!!HHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!!HHHI!IHHI!HHI!IHI!!HI!!!HHHHI!IHHIHHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!!HHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!!HHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!HHHHI!IHHI!HHI!IHI!!HI!!IHHHI!IHHI!HHI!IHI!!HI!!!HHHI!IHHI!HHI!IHI!!HI!!!!HI!!H");
    }

    @Test
    public void test7981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7981");
        char[] charArray8 = new char[] {};
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("hi!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("HH", charArray8);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("Hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!hhhihhhi!hhhi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!!", charArray8);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("hhHHi!iHHi!HhhhI!IhhI!HI!!hhhHHihhHi!HhHi!HhHi!HhHi!HhHi!IhHi!!hHi!HhHi!HhHi!HhHi!HhHi!HhHi!HhHi!HhHi!HhHi!IhHi!!hHi!IhHi!HhHi!HhHi!IhHi!!hHi!!hHi!HhHi!HhHi!HhHi!HhHi!IhHi!!hHi!IhHi!HhHi!HhHi!IhHi!!hHi!!hHi!HhHi!HhHi!HhHi!HhHi!IhHi!!hHi!IhHi!HhHi!HhHi!IhHi!!hHi!!hHi!HhHi!HhHi!HhHi!HhHi!IhHi!!hHi!IhHi!HhHi!HhHi!IhHi!!hHi!!hHi!IhHi!HhHi!HhHi!HhHi!IhHi!!hHi!IhHi!HhHi!HhHi!IhHi!!hHi!!hHi!!hHi!HhHi!HhHi!HhHi!IhHi!!hHi!IhHi!HhHi!HhHi!IhHi!!hHi!!hHi!IhHi!HhHi!HhHi!HhHi!IhHi!!hHi!IhHi!HhHi!HhHi!IhHi!!hHi!!hHi!HhHi!HhHi!HhHi!HhHi!IhHi!!hHi!IhHi!HhHi!HhHi!IhHi!!hHi!!hHi!HhHi!HhHi!HhHi!HhHi!IhHi!!hHi!IhHi!HhHi!HhHi!IhHi!!hHi!!hHi!IhHi!HhHi!HhHi!HhHi!IhHi!!hHi!IhHi!HhHi!HhHi!IhHi!!hHi!!hHi!!hHi!HhHi!HhHi!HhHi!IhHi!!hHi!IhHi!HhHi!HhHi!IhHi!!hHi!!hHi!HhHi!HhHi!HhHi!HhHi!IhHi!!hHi!IhHi!HhHi!HhHi!IhHi!!hHi!!hHi!IhHi!HhHi!HhHi!HhHi!IhHi!!hHi!IhHi!HhHi!HhHi!IhHi!!hHi!!hHi!!hHi!HhHi!HhHi!HhHi!IhHi!!hHi!IhHi!HhHi!HhHi!IhHi!!hHi!!hHi!!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HI!" + "'", str12, "HI!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HH" + "'", str14, "HH");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hhHHi!iHHi!HhhhI!IhhI!HI!!hhhHHihhHi!HhHi!HhHi!HhHi!HhHi!IhHi!!hHi!HhHi!HhHi!HhHi!HhHi!HhHi!HhHi!HhHi!HhHi!IhHi!!hHi!IhHi!HhHi!HhHi!IhHi!!hHi!!hHi!HhHi!HhHi!HhHi!HhHi!IhHi!!hHi!IhHi!HhHi!HhHi!IhHi!!hHi!!hHi!HhHi!HhHi!HhHi!HhHi!IhHi!!hHi!IhHi!HhHi!HhHi!IhHi!!hHi!!hHi!HhHi!HhHi!HhHi!HhHi!IhHi!!hHi!IhHi!HhHi!HhHi!IhHi!!hHi!!hHi!IhHi!HhHi!HhHi!HhHi!IhHi!!hHi!IhHi!HhHi!HhHi!IhHi!!hHi!!hHi!!hHi!HhHi!HhHi!HhHi!IhHi!!hHi!IhHi!HhHi!HhHi!IhHi!!hHi!!hHi!IhHi!HhHi!HhHi!HhHi!IhHi!!hHi!IhHi!HhHi!HhHi!IhHi!!hHi!!hHi!HhHi!HhHi!HhHi!HhHi!IhHi!!hHi!IhHi!HhHi!HhHi!IhHi!!hHi!!hHi!HhHi!HhHi!HhHi!HhHi!IhHi!!hHi!IhHi!HhHi!HhHi!IhHi!!hHi!!hHi!IhHi!HhHi!HhHi!HhHi!IhHi!!hHi!IhHi!HhHi!HhHi!IhHi!!hHi!!hHi!!hHi!HhHi!HhHi!HhHi!IhHi!!hHi!IhHi!HhHi!HhHi!IhHi!!hHi!!hHi!HhHi!HhHi!HhHi!HhHi!IhHi!!hHi!IhHi!HhHi!HhHi!IhHi!!hHi!!hHi!IhHi!HhHi!HhHi!HhHi!IhHi!!hHi!IhHi!HhHi!HhHi!IhHi!!hHi!!hHi!!hHi!HhHi!HhHi!HhHi!IhHi!!hHi!IhHi!HhHi!HhHi!IhHi!!hHi!!hHi!!" + "'", str16, "hhHHi!iHHi!HhhhI!IhhI!HI!!hhhHHihhHi!HhHi!HhHi!HhHi!HhHi!IhHi!!hHi!HhHi!HhHi!HhHi!HhHi!HhHi!HhHi!HhHi!HhHi!IhHi!!hHi!IhHi!HhHi!HhHi!IhHi!!hHi!!hHi!HhHi!HhHi!HhHi!HhHi!IhHi!!hHi!IhHi!HhHi!HhHi!IhHi!!hHi!!hHi!HhHi!HhHi!HhHi!HhHi!IhHi!!hHi!IhHi!HhHi!HhHi!IhHi!!hHi!!hHi!HhHi!HhHi!HhHi!HhHi!IhHi!!hHi!IhHi!HhHi!HhHi!IhHi!!hHi!!hHi!IhHi!HhHi!HhHi!HhHi!IhHi!!hHi!IhHi!HhHi!HhHi!IhHi!!hHi!!hHi!!hHi!HhHi!HhHi!HhHi!IhHi!!hHi!IhHi!HhHi!HhHi!IhHi!!hHi!!hHi!IhHi!HhHi!HhHi!HhHi!IhHi!!hHi!IhHi!HhHi!HhHi!IhHi!!hHi!!hHi!HhHi!HhHi!HhHi!HhHi!IhHi!!hHi!IhHi!HhHi!HhHi!IhHi!!hHi!!hHi!HhHi!HhHi!HhHi!HhHi!IhHi!!hHi!IhHi!HhHi!HhHi!IhHi!!hHi!!hHi!IhHi!HhHi!HhHi!HhHi!IhHi!!hHi!IhHi!HhHi!HhHi!IhHi!!hHi!!hHi!!hHi!HhHi!HhHi!HhHi!IhHi!!hHi!IhHi!HhHi!HhHi!IhHi!!hHi!!hHi!HhHi!HhHi!HhHi!HhHi!IhHi!!hHi!IhHi!HhHi!HhHi!IhHi!!hHi!!hHi!IhHi!HhHi!HhHi!HhHi!IhHi!!hHi!IhHi!HhHi!HhHi!IhHi!!hHi!!hHi!!hHi!HhHi!HhHi!HhHi!IhHi!!hHi!IhHi!HhHi!HhHi!IhHi!!hHi!!hHi!!");
    }

    @Test
    public void test7982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7982");
        char[] charArray12 = new char[] { '#', '4', '4', '4' };
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray12);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray12);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("H", charArray12);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("hhhi!ihhi!!", charArray12);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("Hhhhi!ihhi!hi!!hhhhi!ihhi!hi!!hhhhi!ihhi!hi!!ihhhi!ihhi!hi!!!hhhi!ihhi!hi!!ihhhi!ihhi!hi!!hhhhi!ihhi!hi!!hhhhi!ihhi!hi!!ihhhi!ihhi!hi!!!hhhi!ihhi!hi!!hhhhi!ihhi!hi!!hhhhi!ihhi!hi!!hhhhi!ihhi!hi!!hhhhi!ihhi!hi!!ihhhi!ihhi!hi!!!hhhi!ihhi!hi!!ihhhi!ihhi!hi!!hhhhi!ihhi!hi!!hhhhi!ihhi!hi!!ihhhi!ihhi!hi!!!hhhi!ihhi!hi!!hhhhi!ihhi!hi!!ihhhi!ihhi!hi!!!hhhi!ihhi!hi!!!hhhi!ihhi!hi!!h", charArray12);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray12);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("hhHHi!iHHi!!", charArray12);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHI!HHHI!hHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!!Hhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!HhHHi!iHHi!!", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '#', '4', '4', '4' });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hi!" + "'", str13, "Hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hi!" + "'", str14, "Hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "h" + "'", str15, "h");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hhhi!ihhi!!" + "'", str16, "hhhi!ihhi!!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H" + "'", str17, "H");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Hhhhi!ihhi!!" + "'", str19, "Hhhhi!ihhi!!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hhhi!hhhi!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhhi!ihhi!!" + "'", str20, "Hhhi!hhhi!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhhi!ihhi!!");
    }

    @Test
    public void test7983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7983");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HhHHHI!HHHHhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!", (int) (byte) 1, (int) '#', "hhhhhi!hhhhhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HhHHHI!HHHHhhhhi!ihhi!!hhhhi!ihhi!!hhhhhi!hhhhhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!" + "'", str4, "HhHHHI!HHHHhhhhi!ihhi!!hhhhi!ihhi!!hhhhhi!hhhhhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
    }

    @Test
    public void test7984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7984");
        char[] charArray8 = new char[] {};
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhi!Hhhi!Ihhi!!", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("hHHHI!IHHI!HI!!H", charArray8);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("HHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhhHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!HHHHHI!HHHIHHHI!HHHI!IHHI!!IHHHHI!HHHIHHHI!HHHI!IHHI!!!HHHHI!HHHIHHHI!HHHI!IHHI!!!", charArray8);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("HhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!ihHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!iHhi!Ihi!!!Hhi!Ihi!!iHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!!Hhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!!Hhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!!Hhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!!Hhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!!Hhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hhhi!Hhhi!Ihhi!!" + "'", str13, "hhhi!Hhhi!Ihhi!!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hHHHI!IHHI!HI!!H" + "'", str14, "hHHHI!IHHI!HI!!H");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!ihHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!iHhi!Ihi!!!Hhi!Ihi!!iHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!!Hhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!!Hhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!!Hhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!!Hhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!!Hhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!!" + "'", str16, "HhHHHi!iHHi!!HHHHi!iHHi!!hHHHi!ihHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!iHhi!Ihi!!!Hhi!Ihi!!iHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!!Hhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!!Hhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!!Hhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!!Hhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!IHhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!!Hhi!Ihi!!HHhi!Ihi!!HHhi!Ihi!!!");
    }

    @Test
    public void test7985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7985");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.capitalizeFully("HhHHi!iHHi!!hhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!IhHHi!iHHi!!!hHHi!iHHi!!IhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!IhHHi!iHHi!!!hHHi!iHHi!!!hHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!IhHHi!iHHi!!!hHHi!iHHi!!IhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!IhHHi!iHHi!!!hHHi!iHHi!!!hHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!IhHHi!iHHi!!!hHHi!iHHi!!IhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!IhHHi!iHHi!!!hHHi!iHHi!!!hHHi!iHHi!!ihHHi!iHHi!!hhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!IhHHi!iHHi!!!hHHi!iHHi!!IhHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!IhHHi!iHHi!!!hHHi!iHHi!!!hHHi!iHHi!!HhHHi!iHHi!!HhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!" + "'", str2, "Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!");
    }

    @Test
    public void test7986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7986");
        char[] charArray8 = new char[] { ' ' };
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("hhI!", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!ihhi!hhhi!ihhi!!hi!!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("HI!", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("HHHI!IHHI!!", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("hhHI!iHI!!HhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHHhhhhhhhhhhhhhhhihhh!hhhhhhhhhhhhhhhihhh!hhhihhhhhhhhhhhihhh!hhh!i!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!ihHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!!", charArray8);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHHHHHHHIhhhhI!IhhI!HI!!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { ' ' });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H" + "'", str9, "H");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hhi!" + "'", str10, "Hhi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hhhi!ihhi!hhhi!ihhi!!hi!!" + "'", str11, "hhhi!ihhi!hhhi!ihhi!!hi!!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H" + "'", str12, "H");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H" + "'", str13, "H");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HhHI!iHI!!HhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHHhhhhhhhhhhhhhhhihhh!hhhhhhhhhhhhhhhihhh!hhhihhhhhhhhhhhihhh!hhh!i!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!ihHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!!" + "'", str14, "HhHI!iHI!!HhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHHhhhhhhhhhhhhhhhihhh!hhhhhhhhhhhhhhhihhh!hhhihhhhhhhhhhhihhh!hhh!i!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!ihHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hhhhhhhhhihhhhi!ihhi!hi!!" + "'", str15, "Hhhhhhhhhihhhhi!ihhi!hi!!");
    }

    @Test
    public void test7987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7987");
        char[] charArray13 = new char[] { '#', '4', '4', '4' };
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray13);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray13);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("", charArray13);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray13);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!ihhi!!", charArray13);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.initials("HHHI!hHHI!iHHI!!", charArray13);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.uncapitalize("HhI!HhI!HhI!HhI!ihI!!hI!ihI!HhI!HhI!ihI!!hI!hhI!ihI!!hI!!", charArray13);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!IhhiHHHHi!iHHi!hi!!H", charArray13);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.initials("Hhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!HHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!IHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!hHHHI!HHHI!IHHI!!iHHHI!HHHI!IHHI!!!HHHI!HHHI!IHHI!!!", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '#', '4', '4', '4' });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hi!" + "'", str14, "Hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hi!" + "'", str15, "Hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H" + "'", str17, "H");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hhhi!ihhi!!" + "'", str18, "Hhhi!ihhi!!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H" + "'", str19, "H");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hhI!HhI!HhI!HhI!ihI!!hI!ihI!HhI!HhI!ihI!!hI!hhI!ihI!!hI!!" + "'", str20, "hhI!HhI!HhI!HhI!ihI!!hI!ihI!HhI!HhI!ihI!!hI!hhI!ihI!!hI!!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Hhhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhihhhhi!ihhi!hi!!h" + "'", str21, "Hhhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!hhhhi!hhhi!ihhi!!ihhhi!hhhi!ihhihhhhi!ihhi!hi!!h");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "H" + "'", str22, "H");
    }

    @Test
    public void test7988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7988");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("Hhhi!ihhi!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!ihi!!hi!!hhhhi!ihhi!hhi!Hhhhhi!hhhHHhhI!IhhIHHHHI!HHHI!IHHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test7989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7989");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hHHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!hHHHI!hHHI!iHHI!!iHHHI!hHHI!iHHhHhhI!IhhI!!HHhhI!IhhI!!HHhhI!IhhI!!HHhhI!IhhI!!IHhhI!IhhI!!!HhhI!IhhI!!HHhhI!IhhI!!HHhhI!IhhI!!HHhhI!IhhI!!IHhhI!IhhI!!!HhhI!IhhI!!IHhhI!IhhI!!HHhhI!IhhI!!HHhhI!IhhI!!IHhhI!IhhI!!!HhhI!IhhI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!IhhHhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!ihHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!!" + "'", str1, "Hhhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Hhhhi!Hhhi!Ihhi!!Ihhhi!Hhhi!IhhHhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!ihHHi!iHHi!!hhHHi!iHHi!!hhHHi!iHHi!!ihHHi!iHHi!!!hHHi!iHHi!!!");
    }

    @Test
    public void test7990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7990");
        char[] charArray8 = new char[] { '4', '4' };
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("HHi!", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("HH", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("hhI!", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhhi!hhhiHHHHHi!iHHhHHHI!HHHIhHHI!HHHI!IHHI!!i!!HHHHi!ihHHHI!HHHIhHHI!HHHI!IHHI!!HHi!!hHHHihHHHI!HHHIhHHI!HHHI!IHHI!!!iHHi!!iHHhHHHI!HHHIhHHI!HHHI!IHHI!!Hi!iHHi!!!hHHHI!HHHIhHHI!HHHI!IHHI!!hHHHHi!iHHhHHHI!HHHIhHHI!HHHI!IHHI!!i!!HHHHi!ihHHHI!HHHIhHHI!HHHI!IHHI!!HHi!!hHHHihHHHI!HHHIhHHI!HHHI!IHHI!!!iHHi!!iHHhHHHI!HHHIhHHI!HHHI!IHHI!!Hi!iHHi!!!hHHHI!HHHIhHHI!HHHI!IHHI!!IHHHHi!iHHhHHHI!HHHIhHHI!HHHI!IHHI!!i!!HHHHi!ihHHHI!HHHIhHHI!HHHI!IHHI!!HHi!!hHHHihHHHI!HHHIhHHI!HHHI!IHHI!!!iHHi!!iHHhHHHI!HHHIhHHI!HHHI!IHHI!!Hi!iHHi!!!hHHHI!HHHIhHHI!HHHI!IHHI!!!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Hi!" + "'", str9, "Hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hhi!" + "'", str10, "Hhi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hH" + "'", str11, "hH");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "h" + "'", str12, "h");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hhhhi!hhhihhhhhi!ihhhhhhi!hhhihhhi!hhhi!ihhi!!i!!hhhhi!ihhhhi!hhhihhhi!hhhi!ihhi!!hhi!!hhhhihhhhi!hhhihhhi!hhhi!ihhi!!!ihhi!!ihhhhhhi!hhhihhhi!hhhi!ihhi!!hi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!ihhhhhhi!hhhihhhi!hhhi!ihhi!!i!!hhhhi!ihhhhi!hhhihhhi!hhhi!ihhi!!hhi!!hhhhihhhhi!hhhihhhi!hhhi!ihhi!!!ihhi!!ihhhhhhi!hhhihhhi!hhhi!ihhi!!hi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!ihhhhhhi!hhhihhhi!hhhi!ihhi!!i!!hhhhi!ihhhhi!hhhihhhi!hhhi!ihhi!!hhi!!hhhhihhhhi!hhhihhhi!hhhi!ihhi!!!ihhi!!ihhhhhhi!hhhihhhi!hhhi!ihhi!!hi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!!" + "'", str14, "Hhhhi!hhhihhhhhi!ihhhhhhi!hhhihhhi!hhhi!ihhi!!i!!hhhhi!ihhhhi!hhhihhhi!hhhi!ihhi!!hhi!!hhhhihhhhi!hhhihhhi!hhhi!ihhi!!!ihhi!!ihhhhhhi!hhhihhhi!hhhi!ihhi!!hi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!hhhhhi!ihhhhhhi!hhhihhhi!hhhi!ihhi!!i!!hhhhi!ihhhhi!hhhihhhi!hhhi!ihhi!!hhi!!hhhhihhhhi!hhhihhhi!hhhi!ihhi!!!ihhi!!ihhhhhhi!hhhihhhi!hhhi!ihhi!!hi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!ihhhhi!ihhhhhhi!hhhihhhi!hhhi!ihhi!!i!!hhhhi!ihhhhi!hhhihhhi!hhhi!ihhi!!hhi!!hhhhihhhhi!hhhihhhi!hhhi!ihhi!!!ihhi!!ihhhhhhi!hhhihhhi!hhhi!ihhi!!hi!ihhi!!!hhhhi!hhhihhhi!hhhi!ihhi!!!");
    }

    @Test
    public void test7991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7991");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!" + "'", str1, "Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
    }

    @Test
    public void test7992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7992");
        char[] charArray9 = new char[] { '#', ' ', '4' };
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("HhhI!IhhI!hHHHi!iHHi!hi!!H", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("HHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!hHhhhi!hhhiHhhi!hhhi!ihhi!!iHhhhi!hhhiHhhi!hhhhHHHi!iHHihhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHI!!hhHHHI!HHHI!IHHIhHI!HHI!HHHHHHI!HHHI!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!HHHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!HHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!HHHHI!IHHI!!IHHHI!IHHI!!!HHHI!IHHI!!!", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("hHHI!IHHI!HHI!IHI!!HI!!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '#', ' ', '4' });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hi!" + "'", str10, "Hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HhhI!IhhI!hHHHi!iHHi!hi!!H" + "'", str13, "HhhI!IhhI!hHHHi!iHHi!hi!!H");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H" + "'", str14, "H");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HHHI!IHHI!HHI!IHI!!HI!!" + "'", str15, "HHHI!IHHI!HHI!IHI!!HI!!");
    }

    @Test
    public void test7993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7993");
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
        java.lang.String str22 = org.apache.commons.lang.WordUtils.initials("Hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!", charArray11);
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test7994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7994");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("Hhhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!ihhhhi!hhhi!hhhi!!hhhhi!hhhi!hhhi!ihhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!ihhhhi!hhhi!hhhi!!hhhhi!hhhi!hhhi!!hhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!ihhhhi!hhhi!hhhi!!hhhhi!hhhi!hhhi!ihhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!ihhhhi!hhhi!hhhi!!hhhhi!hhhi!hhhi!!hhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!ihhhhi!hhhi!hhhi!!hhhhi!hhhi!hhhi!ihhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!ihhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!ihhhhi!hhhi!hhhi!!hhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!ihhhhi!hhhi!hhhi!!hhhhi!hhhi!hhhi!ihhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!hhhhhi!hhhi!hhhi!ihhhhi!hhhi!hhhi!!hhhhi!hhhi!hhhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test7995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7995");
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
        java.lang.String str22 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!ihi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhhhhhhhhhhhhhhhhhihhh!hhhhhhhhhhhhhhhihhh!hhhihhhhhhhhhhhihhh!hhh!i!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!", charArray11);
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Hhhi!ihi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhhhhhhhhhhhhhhhhhihhh!hhhhhhhhhhhhhhhihhh!hhhihhhhhhhhhhhihhh!hhh!i!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!" + "'", str22, "Hhhi!ihi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhhhhhhhhhhhhhhhhhihhh!hhhhhhhhhhhhhhhihhh!hhhihhhhhhhhhhhihhh!hhh!i!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!!");
    }

    @Test
    public void test7996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7996");
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
        java.lang.String str25 = org.apache.commons.lang.WordUtils.initials("Hhhi!ihhi!hi!!", charArray14);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.uncapitalize("HhhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhIhHHI!hHHI!iHHI!!", charArray14);
        java.lang.String str27 = org.apache.commons.lang.WordUtils.initials("hhHHHI!HHHHhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!hhhhi!ihhi!!ihhhi!ihhi!!!hhhi!ihhi!!ihhhi!ihhi!!hhhhi!ihhi!!hhhhhhhi!ihhi!hhi!ihi!!hi!!", charArray14);
        java.lang.String str28 = org.apache.commons.lang.WordUtils.initials("", charArray14);
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
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "HhhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhIhHHI!hHHI!iHHI!!" + "'", str26, "HhhhhI!IhhI!!hhhhI!IhhI!!HhhhI!IhhIhHHI!hHHI!iHHI!!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test7997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7997");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("HhhHHHI!IHHHHI!HHHI!HHI!HHHI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhhhi!ihhhhi!hhhi!hhi!hhhi!" + "'", str1, "Hhhhhhi!ihhhhi!hhhi!hhi!hhhi!");
    }

    @Test
    public void test7998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7998");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HhhI!HhI!HHhhhi!ihhihhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HhhI!HhI!HHhhhi!ihhihhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!" + "'", str2, "HhhI!HhI!HHhhhi!ihhihhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!");
    }

    @Test
    public void test7999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7999");
        char[] charArray11 = new char[] {};
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("", charArray11);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("Hi!", charArray11);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray11);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.uncapitalize("hH", charArray11);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhh", charArray11);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhi!hhhihhhhi!!ihhi!!", charArray11);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.initials("hHHHI!IHHI!HHHI!IHHI!!HI!!", charArray11);
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hhhhh" + "'", str20, "Hhhhh");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Hhhhi!hhhihhhhi!!ihhi!!" + "'", str21, "Hhhhi!hhhihhhhi!!ihhi!!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test8000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test8000");
        char[] charArray7 = new char[] {};
        java.lang.String str8 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("hi!", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray7);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("hHI!", charArray7);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhhhI!Ihhhhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!", charArray7);
        java.lang.Class<?> wildcardClass15 = charArray7.getClass();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HI!" + "'", str11, "HI!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HI!" + "'", str12, "HI!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hHI!" + "'", str13, "hHI!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hhhhhI!Ihhhhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!" + "'", str14, "hhhhhI!Ihhhhhi!ihhi!hhhhhhhhhihh!hhhhhhhhhhhihh!hhihhhhhhhhihh!hh!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }
}

