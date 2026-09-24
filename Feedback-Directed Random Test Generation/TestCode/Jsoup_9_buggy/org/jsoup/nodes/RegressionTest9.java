package org.jsoup.nodes;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest9 {

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
    public void test4501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4501");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode14 = org.jsoup.nodes.Entities.EscapeMode.extended;
        java.lang.String str15 = org.jsoup.nodes.Entities.escape("", charsetEncoder13, escapeMode14);
        java.util.Map<java.lang.Character, java.lang.String> charMap16 = escapeMode14.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap17 = escapeMode14.getMap();
        java.lang.String str18 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode14);
        java.util.Map<java.lang.Character, java.lang.String> charMap19 = escapeMode14.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap20 = escapeMode14.getMap();
        java.lang.String str21 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode14);
        java.lang.String str22 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode14);
        java.util.Map<java.lang.Character, java.lang.String> charMap23 = escapeMode14.getMap();
        java.lang.String str24 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode14);
        java.lang.String str25 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode14);
        java.util.Map<java.lang.Character, java.lang.String> charMap26 = escapeMode14.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap27 = escapeMode14.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap28 = escapeMode14.getMap();
        java.lang.String str29 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode14);
        java.util.Map<java.lang.Character, java.lang.String> charMap30 = escapeMode14.getMap();
        java.lang.Class<?> wildcardClass31 = charMap30.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode14 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.extended + "'", escapeMode14.equals(org.jsoup.nodes.Entities.EscapeMode.extended));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(charMap16);
        org.junit.Assert.assertNotNull(charMap17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(charMap19);
        org.junit.Assert.assertNotNull(charMap20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(charMap23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(charMap26);
        org.junit.Assert.assertNotNull(charMap27);
        org.junit.Assert.assertNotNull(charMap28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(charMap30);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test4502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4502");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode10 = org.jsoup.nodes.Entities.EscapeMode.xhtml;
        java.lang.String str11 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode10);
        java.util.Map<java.lang.Character, java.lang.String> charMap12 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap13 = escapeMode10.getMap();
        java.lang.String str14 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode10);
        java.util.Map<java.lang.Character, java.lang.String> charMap15 = escapeMode10.getMap();
        java.lang.String str16 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode10);
        java.lang.String str17 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode10);
        java.util.Map<java.lang.Character, java.lang.String> charMap18 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap19 = escapeMode10.getMap();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = org.jsoup.nodes.Entities.escape("hi!", charsetEncoder1, escapeMode10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + escapeMode10 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.xhtml + "'", escapeMode10.equals(org.jsoup.nodes.Entities.EscapeMode.xhtml));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(charMap12);
        org.junit.Assert.assertNotNull(charMap13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(charMap15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(charMap18);
        org.junit.Assert.assertNotNull(charMap19);
    }

    @Test
    public void test4503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4503");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode8 = org.jsoup.nodes.Entities.EscapeMode.extended;
        java.util.Map<java.lang.Character, java.lang.String> charMap9 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap10 = escapeMode8.getMap();
        java.lang.String str11 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode8);
        java.lang.String str12 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode8);
        java.util.Map<java.lang.Character, java.lang.String> charMap13 = escapeMode8.getMap();
        java.lang.String str14 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode8);
        java.util.Map<java.lang.Character, java.lang.String> charMap15 = escapeMode8.getMap();
        java.lang.String str16 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode8);
        java.util.Map<java.lang.Character, java.lang.String> charMap17 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap18 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap19 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap20 = escapeMode8.getMap();
        java.lang.Class<?> wildcardClass21 = charMap20.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode8 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.extended + "'", escapeMode8.equals(org.jsoup.nodes.Entities.EscapeMode.extended));
        org.junit.Assert.assertNotNull(charMap9);
        org.junit.Assert.assertNotNull(charMap10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(charMap13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(charMap15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(charMap17);
        org.junit.Assert.assertNotNull(charMap18);
        org.junit.Assert.assertNotNull(charMap19);
        org.junit.Assert.assertNotNull(charMap20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test4504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4504");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode8 = org.jsoup.nodes.Entities.EscapeMode.xhtml;
        java.util.Map<java.lang.Character, java.lang.String> charMap9 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap10 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap11 = escapeMode8.getMap();
        java.lang.String str12 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode8);
        java.util.Map<java.lang.Character, java.lang.String> charMap13 = escapeMode8.getMap();
        java.lang.String str14 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode8);
        java.util.Map<java.lang.Character, java.lang.String> charMap15 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap16 = escapeMode8.getMap();
        java.lang.String str17 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = org.jsoup.nodes.Entities.escape("hi!", charsetEncoder1, escapeMode8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + escapeMode8 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.xhtml + "'", escapeMode8.equals(org.jsoup.nodes.Entities.EscapeMode.xhtml));
        org.junit.Assert.assertNotNull(charMap9);
        org.junit.Assert.assertNotNull(charMap10);
        org.junit.Assert.assertNotNull(charMap11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(charMap13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(charMap15);
        org.junit.Assert.assertNotNull(charMap16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test4505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4505");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode6 = org.jsoup.nodes.Entities.EscapeMode.xhtml;
        java.lang.String str7 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode6);
        java.util.Map<java.lang.Character, java.lang.String> charMap8 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap9 = escapeMode6.getMap();
        java.lang.String str10 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode6);
        java.util.Map<java.lang.Character, java.lang.String> charMap11 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap12 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap13 = escapeMode6.getMap();
        java.lang.String str14 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode6);
        java.util.Map<java.lang.Character, java.lang.String> charMap15 = escapeMode6.getMap();
        java.lang.Class<?> wildcardClass16 = escapeMode6.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode6 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.xhtml + "'", escapeMode6.equals(org.jsoup.nodes.Entities.EscapeMode.xhtml));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(charMap8);
        org.junit.Assert.assertNotNull(charMap9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(charMap11);
        org.junit.Assert.assertNotNull(charMap12);
        org.junit.Assert.assertNotNull(charMap13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(charMap15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4506");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode10 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.util.Map<java.lang.Character, java.lang.String> charMap11 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap12 = escapeMode10.getMap();
        java.lang.String str13 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode10);
        java.util.Map<java.lang.Character, java.lang.String> charMap14 = escapeMode10.getMap();
        java.lang.String str15 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode10);
        java.util.Map<java.lang.Character, java.lang.String> charMap16 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap17 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap18 = escapeMode10.getMap();
        java.lang.String str19 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode10);
        java.util.Map<java.lang.Character, java.lang.String> charMap20 = escapeMode10.getMap();
        java.lang.String str21 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode10);
        java.lang.String str22 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode10);
        org.junit.Assert.assertTrue("'" + escapeMode10 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode10.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charMap11);
        org.junit.Assert.assertNotNull(charMap12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(charMap14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(charMap16);
        org.junit.Assert.assertNotNull(charMap17);
        org.junit.Assert.assertNotNull(charMap18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(charMap20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test4507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4507");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode8 = org.jsoup.nodes.Entities.EscapeMode.xhtml;
        java.lang.String str9 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode8);
        java.util.Map<java.lang.Character, java.lang.String> charMap10 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap11 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap12 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap13 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap14 = escapeMode8.getMap();
        java.lang.String str15 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode8);
        java.util.Map<java.lang.Character, java.lang.String> charMap16 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap17 = escapeMode8.getMap();
        java.lang.String str18 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode8);
        java.lang.String str19 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode8);
        java.util.Map<java.lang.Character, java.lang.String> charMap20 = escapeMode8.getMap();
        java.lang.Class<?> wildcardClass21 = escapeMode8.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode8 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.xhtml + "'", escapeMode8.equals(org.jsoup.nodes.Entities.EscapeMode.xhtml));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(charMap10);
        org.junit.Assert.assertNotNull(charMap11);
        org.junit.Assert.assertNotNull(charMap12);
        org.junit.Assert.assertNotNull(charMap13);
        org.junit.Assert.assertNotNull(charMap14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(charMap16);
        org.junit.Assert.assertNotNull(charMap17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(charMap20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test4508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4508");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        java.nio.charset.CharsetEncoder charsetEncoder15 = null;
        java.nio.charset.CharsetEncoder charsetEncoder17 = null;
        java.nio.charset.CharsetEncoder charsetEncoder19 = null;
        java.nio.charset.CharsetEncoder charsetEncoder21 = null;
        java.nio.charset.CharsetEncoder charsetEncoder23 = null;
        java.nio.charset.CharsetEncoder charsetEncoder25 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode26 = org.jsoup.nodes.Entities.EscapeMode.extended;
        java.util.Map<java.lang.Character, java.lang.String> charMap27 = escapeMode26.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap28 = escapeMode26.getMap();
        java.lang.String str29 = org.jsoup.nodes.Entities.escape("", charsetEncoder25, escapeMode26);
        java.util.Map<java.lang.Character, java.lang.String> charMap30 = escapeMode26.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap31 = escapeMode26.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap32 = escapeMode26.getMap();
        java.lang.String str33 = org.jsoup.nodes.Entities.escape("", charsetEncoder23, escapeMode26);
        java.lang.String str34 = org.jsoup.nodes.Entities.escape("", charsetEncoder21, escapeMode26);
        java.lang.String str35 = org.jsoup.nodes.Entities.escape("", charsetEncoder19, escapeMode26);
        java.util.Map<java.lang.Character, java.lang.String> charMap36 = escapeMode26.getMap();
        java.lang.String str37 = org.jsoup.nodes.Entities.escape("", charsetEncoder17, escapeMode26);
        java.lang.String str38 = org.jsoup.nodes.Entities.escape("", charsetEncoder15, escapeMode26);
        java.lang.String str39 = org.jsoup.nodes.Entities.escape("", charsetEncoder13, escapeMode26);
        java.lang.String str40 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode26);
        java.lang.String str41 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode26);
        java.lang.String str42 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode26);
        java.lang.String str43 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode26);
        java.lang.String str44 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode26);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str45 = org.jsoup.nodes.Entities.escape("hi!", charsetEncoder1, escapeMode26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + escapeMode26 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.extended + "'", escapeMode26.equals(org.jsoup.nodes.Entities.EscapeMode.extended));
        org.junit.Assert.assertNotNull(charMap27);
        org.junit.Assert.assertNotNull(charMap28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(charMap30);
        org.junit.Assert.assertNotNull(charMap31);
        org.junit.Assert.assertNotNull(charMap32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(charMap36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
    }

    @Test
    public void test4509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4509");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode14 = org.jsoup.nodes.Entities.EscapeMode.xhtml;
        java.lang.String str15 = org.jsoup.nodes.Entities.escape("", charsetEncoder13, escapeMode14);
        java.util.Map<java.lang.Character, java.lang.String> charMap16 = escapeMode14.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap17 = escapeMode14.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap18 = escapeMode14.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap19 = escapeMode14.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap20 = escapeMode14.getMap();
        java.lang.String str21 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode14);
        java.util.Map<java.lang.Character, java.lang.String> charMap22 = escapeMode14.getMap();
        java.lang.String str23 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode14);
        java.lang.String str24 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode14);
        java.lang.String str25 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode14);
        java.lang.String str26 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode14);
        java.util.Map<java.lang.Character, java.lang.String> charMap27 = escapeMode14.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap28 = escapeMode14.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap29 = escapeMode14.getMap();
        java.lang.String str30 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode14);
        org.junit.Assert.assertTrue("'" + escapeMode14 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.xhtml + "'", escapeMode14.equals(org.jsoup.nodes.Entities.EscapeMode.xhtml));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(charMap16);
        org.junit.Assert.assertNotNull(charMap17);
        org.junit.Assert.assertNotNull(charMap18);
        org.junit.Assert.assertNotNull(charMap19);
        org.junit.Assert.assertNotNull(charMap20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(charMap22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(charMap27);
        org.junit.Assert.assertNotNull(charMap28);
        org.junit.Assert.assertNotNull(charMap29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test4510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4510");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode10 = org.jsoup.nodes.Entities.EscapeMode.xhtml;
        java.lang.String str11 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode10);
        java.util.Map<java.lang.Character, java.lang.String> charMap12 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap13 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap14 = escapeMode10.getMap();
        java.lang.String str15 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode10);
        java.lang.String str16 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode10);
        java.lang.String str17 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode10);
        java.lang.String str18 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode10);
        java.util.Map<java.lang.Character, java.lang.String> charMap19 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap20 = escapeMode10.getMap();
        org.junit.Assert.assertTrue("'" + escapeMode10 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.xhtml + "'", escapeMode10.equals(org.jsoup.nodes.Entities.EscapeMode.xhtml));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(charMap12);
        org.junit.Assert.assertNotNull(charMap13);
        org.junit.Assert.assertNotNull(charMap14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(charMap19);
        org.junit.Assert.assertNotNull(charMap20);
    }

    @Test
    public void test4511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4511");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode8 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.util.Map<java.lang.Character, java.lang.String> charMap9 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap10 = escapeMode8.getMap();
        java.lang.String str11 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode8);
        java.util.Map<java.lang.Character, java.lang.String> charMap12 = escapeMode8.getMap();
        java.lang.String str13 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode8);
        java.util.Map<java.lang.Character, java.lang.String> charMap14 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap15 = escapeMode8.getMap();
        java.lang.String str16 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode8);
        java.util.Map<java.lang.Character, java.lang.String> charMap17 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap18 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap19 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap20 = escapeMode8.getMap();
        java.lang.String str21 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode8);
        org.junit.Assert.assertTrue("'" + escapeMode8 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode8.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charMap9);
        org.junit.Assert.assertNotNull(charMap10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(charMap12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(charMap14);
        org.junit.Assert.assertNotNull(charMap15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(charMap17);
        org.junit.Assert.assertNotNull(charMap18);
        org.junit.Assert.assertNotNull(charMap19);
        org.junit.Assert.assertNotNull(charMap20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test4512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4512");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode8 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.util.Map<java.lang.Character, java.lang.String> charMap9 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap10 = escapeMode8.getMap();
        java.lang.String str11 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode8);
        java.util.Map<java.lang.Character, java.lang.String> charMap12 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap13 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap14 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap15 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap16 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap17 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap18 = escapeMode8.getMap();
        java.lang.String str19 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode8);
        java.lang.String str20 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = org.jsoup.nodes.Entities.escape("hi!", charsetEncoder1, escapeMode8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + escapeMode8 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode8.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charMap9);
        org.junit.Assert.assertNotNull(charMap10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(charMap12);
        org.junit.Assert.assertNotNull(charMap13);
        org.junit.Assert.assertNotNull(charMap14);
        org.junit.Assert.assertNotNull(charMap15);
        org.junit.Assert.assertNotNull(charMap16);
        org.junit.Assert.assertNotNull(charMap17);
        org.junit.Assert.assertNotNull(charMap18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test4513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4513");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        java.nio.charset.CharsetEncoder charsetEncoder15 = null;
        java.nio.charset.CharsetEncoder charsetEncoder17 = null;
        java.nio.charset.CharsetEncoder charsetEncoder19 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode20 = org.jsoup.nodes.Entities.EscapeMode.extended;
        java.lang.String str21 = org.jsoup.nodes.Entities.escape("", charsetEncoder19, escapeMode20);
        java.lang.String str22 = org.jsoup.nodes.Entities.escape("", charsetEncoder17, escapeMode20);
        java.util.Map<java.lang.Character, java.lang.String> charMap23 = escapeMode20.getMap();
        java.lang.String str24 = org.jsoup.nodes.Entities.escape("", charsetEncoder15, escapeMode20);
        java.lang.String str25 = org.jsoup.nodes.Entities.escape("", charsetEncoder13, escapeMode20);
        java.lang.String str26 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode20);
        java.lang.String str27 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode20);
        java.util.Map<java.lang.Character, java.lang.String> charMap28 = escapeMode20.getMap();
        java.lang.String str29 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode20);
        java.lang.String str30 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode20);
        java.lang.String str31 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode20);
        java.lang.String str32 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode20);
        org.junit.Assert.assertTrue("'" + escapeMode20 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.extended + "'", escapeMode20.equals(org.jsoup.nodes.Entities.EscapeMode.extended));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(charMap23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(charMap28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
    }

    @Test
    public void test4514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4514");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode12 = org.jsoup.nodes.Entities.EscapeMode.extended;
        java.lang.String str13 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode12);
        java.lang.String str14 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode12);
        java.lang.String str15 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode12);
        java.lang.String str16 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode12);
        java.lang.String str17 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode12);
        java.util.Map<java.lang.Character, java.lang.String> charMap18 = escapeMode12.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap19 = escapeMode12.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap20 = escapeMode12.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap21 = escapeMode12.getMap();
        java.lang.String str22 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode12);
        org.junit.Assert.assertTrue("'" + escapeMode12 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.extended + "'", escapeMode12.equals(org.jsoup.nodes.Entities.EscapeMode.extended));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(charMap18);
        org.junit.Assert.assertNotNull(charMap19);
        org.junit.Assert.assertNotNull(charMap20);
        org.junit.Assert.assertNotNull(charMap21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test4515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4515");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode6 = org.jsoup.nodes.Entities.EscapeMode.extended;
        java.lang.String str7 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode6);
        java.util.Map<java.lang.Character, java.lang.String> charMap8 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap9 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap10 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap11 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap12 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap13 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap14 = escapeMode6.getMap();
        java.lang.String str15 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode6);
        java.lang.String str16 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode6);
        java.util.Map<java.lang.Character, java.lang.String> charMap17 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap18 = escapeMode6.getMap();
        java.lang.Class<?> wildcardClass19 = charMap18.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode6 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.extended + "'", escapeMode6.equals(org.jsoup.nodes.Entities.EscapeMode.extended));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(charMap8);
        org.junit.Assert.assertNotNull(charMap9);
        org.junit.Assert.assertNotNull(charMap10);
        org.junit.Assert.assertNotNull(charMap11);
        org.junit.Assert.assertNotNull(charMap12);
        org.junit.Assert.assertNotNull(charMap13);
        org.junit.Assert.assertNotNull(charMap14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(charMap17);
        org.junit.Assert.assertNotNull(charMap18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4516");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode6 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.util.Map<java.lang.Character, java.lang.String> charMap7 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap8 = escapeMode6.getMap();
        java.lang.String str9 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode6);
        java.util.Map<java.lang.Character, java.lang.String> charMap10 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap11 = escapeMode6.getMap();
        java.lang.String str12 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode6);
        java.lang.String str13 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode6);
        java.lang.Class<?> wildcardClass14 = escapeMode6.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode6 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode6.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charMap7);
        org.junit.Assert.assertNotNull(charMap8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(charMap10);
        org.junit.Assert.assertNotNull(charMap11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4517");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode10 = org.jsoup.nodes.Entities.EscapeMode.extended;
        java.util.Map<java.lang.Character, java.lang.String> charMap11 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap12 = escapeMode10.getMap();
        java.lang.String str13 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode10);
        java.util.Map<java.lang.Character, java.lang.String> charMap14 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap15 = escapeMode10.getMap();
        java.lang.String str16 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode10);
        java.util.Map<java.lang.Character, java.lang.String> charMap17 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap18 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap19 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap20 = escapeMode10.getMap();
        java.lang.String str21 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode10);
        java.util.Map<java.lang.Character, java.lang.String> charMap22 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap23 = escapeMode10.getMap();
        java.lang.String str24 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode10);
        java.util.Map<java.lang.Character, java.lang.String> charMap25 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap26 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap27 = escapeMode10.getMap();
        java.lang.String str28 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode10);
        java.util.Map<java.lang.Character, java.lang.String> charMap29 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap30 = escapeMode10.getMap();
        org.junit.Assert.assertTrue("'" + escapeMode10 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.extended + "'", escapeMode10.equals(org.jsoup.nodes.Entities.EscapeMode.extended));
        org.junit.Assert.assertNotNull(charMap11);
        org.junit.Assert.assertNotNull(charMap12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(charMap14);
        org.junit.Assert.assertNotNull(charMap15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(charMap17);
        org.junit.Assert.assertNotNull(charMap18);
        org.junit.Assert.assertNotNull(charMap19);
        org.junit.Assert.assertNotNull(charMap20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(charMap22);
        org.junit.Assert.assertNotNull(charMap23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(charMap25);
        org.junit.Assert.assertNotNull(charMap26);
        org.junit.Assert.assertNotNull(charMap27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(charMap29);
        org.junit.Assert.assertNotNull(charMap30);
    }

    @Test
    public void test4518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4518");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        java.nio.charset.CharsetEncoder charsetEncoder15 = null;
        java.nio.charset.CharsetEncoder charsetEncoder17 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode18 = org.jsoup.nodes.Entities.EscapeMode.extended;
        java.lang.String str19 = org.jsoup.nodes.Entities.escape("", charsetEncoder17, escapeMode18);
        java.lang.String str20 = org.jsoup.nodes.Entities.escape("", charsetEncoder15, escapeMode18);
        java.lang.String str21 = org.jsoup.nodes.Entities.escape("", charsetEncoder13, escapeMode18);
        java.util.Map<java.lang.Character, java.lang.String> charMap22 = escapeMode18.getMap();
        java.lang.String str23 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode18);
        java.lang.String str24 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode18);
        java.util.Map<java.lang.Character, java.lang.String> charMap25 = escapeMode18.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap26 = escapeMode18.getMap();
        java.lang.String str27 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode18);
        java.util.Map<java.lang.Character, java.lang.String> charMap28 = escapeMode18.getMap();
        java.lang.String str29 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode18);
        java.lang.String str30 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode18);
        java.lang.String str31 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode18);
        org.junit.Assert.assertTrue("'" + escapeMode18 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.extended + "'", escapeMode18.equals(org.jsoup.nodes.Entities.EscapeMode.extended));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(charMap22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(charMap25);
        org.junit.Assert.assertNotNull(charMap26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(charMap28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test4519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4519");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode14 = org.jsoup.nodes.Entities.EscapeMode.extended;
        java.lang.String str15 = org.jsoup.nodes.Entities.escape("", charsetEncoder13, escapeMode14);
        java.lang.String str16 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode14);
        java.lang.String str17 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode14);
        java.util.Map<java.lang.Character, java.lang.String> charMap18 = escapeMode14.getMap();
        java.lang.String str19 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode14);
        java.lang.String str20 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode14);
        java.util.Map<java.lang.Character, java.lang.String> charMap21 = escapeMode14.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap22 = escapeMode14.getMap();
        java.lang.String str23 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode14);
        java.util.Map<java.lang.Character, java.lang.String> charMap24 = escapeMode14.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap25 = escapeMode14.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap26 = escapeMode14.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap27 = escapeMode14.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap28 = escapeMode14.getMap();
        java.lang.String str29 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode14);
        java.util.Map<java.lang.Character, java.lang.String> charMap30 = escapeMode14.getMap();
        org.junit.Assert.assertTrue("'" + escapeMode14 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.extended + "'", escapeMode14.equals(org.jsoup.nodes.Entities.EscapeMode.extended));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(charMap18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(charMap21);
        org.junit.Assert.assertNotNull(charMap22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(charMap24);
        org.junit.Assert.assertNotNull(charMap25);
        org.junit.Assert.assertNotNull(charMap26);
        org.junit.Assert.assertNotNull(charMap27);
        org.junit.Assert.assertNotNull(charMap28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(charMap30);
    }

    @Test
    public void test4520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4520");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode10 = org.jsoup.nodes.Entities.EscapeMode.xhtml;
        java.lang.String str11 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode10);
        java.util.Map<java.lang.Character, java.lang.String> charMap12 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap13 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap14 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap15 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap16 = escapeMode10.getMap();
        java.lang.String str17 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode10);
        java.lang.String str18 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode10);
        java.util.Map<java.lang.Character, java.lang.String> charMap19 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap20 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap21 = escapeMode10.getMap();
        java.lang.String str22 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode10);
        java.util.Map<java.lang.Character, java.lang.String> charMap23 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap24 = escapeMode10.getMap();
        java.lang.String str25 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode10);
        java.lang.Class<?> wildcardClass26 = escapeMode10.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode10 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.xhtml + "'", escapeMode10.equals(org.jsoup.nodes.Entities.EscapeMode.xhtml));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(charMap12);
        org.junit.Assert.assertNotNull(charMap13);
        org.junit.Assert.assertNotNull(charMap14);
        org.junit.Assert.assertNotNull(charMap15);
        org.junit.Assert.assertNotNull(charMap16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(charMap19);
        org.junit.Assert.assertNotNull(charMap20);
        org.junit.Assert.assertNotNull(charMap21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(charMap23);
        org.junit.Assert.assertNotNull(charMap24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test4521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4521");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode10 = org.jsoup.nodes.Entities.EscapeMode.extended;
        java.util.Map<java.lang.Character, java.lang.String> charMap11 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap12 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap13 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap14 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap15 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap16 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap17 = escapeMode10.getMap();
        java.lang.String str18 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode10);
        java.lang.String str19 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode10);
        java.util.Map<java.lang.Character, java.lang.String> charMap20 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap21 = escapeMode10.getMap();
        java.lang.String str22 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode10);
        java.lang.String str23 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode10);
        java.util.Map<java.lang.Character, java.lang.String> charMap24 = escapeMode10.getMap();
        java.lang.String str25 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode10);
        org.junit.Assert.assertTrue("'" + escapeMode10 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.extended + "'", escapeMode10.equals(org.jsoup.nodes.Entities.EscapeMode.extended));
        org.junit.Assert.assertNotNull(charMap11);
        org.junit.Assert.assertNotNull(charMap12);
        org.junit.Assert.assertNotNull(charMap13);
        org.junit.Assert.assertNotNull(charMap14);
        org.junit.Assert.assertNotNull(charMap15);
        org.junit.Assert.assertNotNull(charMap16);
        org.junit.Assert.assertNotNull(charMap17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(charMap20);
        org.junit.Assert.assertNotNull(charMap21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(charMap24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test4522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4522");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode12 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.util.Map<java.lang.Character, java.lang.String> charMap13 = escapeMode12.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap14 = escapeMode12.getMap();
        java.lang.String str15 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode12);
        java.util.Map<java.lang.Character, java.lang.String> charMap16 = escapeMode12.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap17 = escapeMode12.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap18 = escapeMode12.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap19 = escapeMode12.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap20 = escapeMode12.getMap();
        java.lang.String str21 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode12);
        java.util.Map<java.lang.Character, java.lang.String> charMap22 = escapeMode12.getMap();
        java.lang.String str23 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode12);
        java.util.Map<java.lang.Character, java.lang.String> charMap24 = escapeMode12.getMap();
        java.lang.String str25 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode12);
        java.util.Map<java.lang.Character, java.lang.String> charMap26 = escapeMode12.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap27 = escapeMode12.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap28 = escapeMode12.getMap();
        java.lang.String str29 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode12);
        java.util.Map<java.lang.Character, java.lang.String> charMap30 = escapeMode12.getMap();
        java.lang.String str31 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode12);
        org.junit.Assert.assertTrue("'" + escapeMode12 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode12.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charMap13);
        org.junit.Assert.assertNotNull(charMap14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(charMap16);
        org.junit.Assert.assertNotNull(charMap17);
        org.junit.Assert.assertNotNull(charMap18);
        org.junit.Assert.assertNotNull(charMap19);
        org.junit.Assert.assertNotNull(charMap20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(charMap22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(charMap24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(charMap26);
        org.junit.Assert.assertNotNull(charMap27);
        org.junit.Assert.assertNotNull(charMap28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(charMap30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test4523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4523");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode10 = org.jsoup.nodes.Entities.EscapeMode.xhtml;
        java.lang.String str11 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode10);
        java.util.Map<java.lang.Character, java.lang.String> charMap12 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap13 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap14 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap15 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap16 = escapeMode10.getMap();
        java.lang.String str17 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode10);
        java.lang.String str18 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode10);
        java.util.Map<java.lang.Character, java.lang.String> charMap19 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap20 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap21 = escapeMode10.getMap();
        java.lang.String str22 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode10);
        java.util.Map<java.lang.Character, java.lang.String> charMap23 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap24 = escapeMode10.getMap();
        java.lang.String str25 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode10);
        java.util.Map<java.lang.Character, java.lang.String> charMap26 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap27 = escapeMode10.getMap();
        java.lang.Class<?> wildcardClass28 = escapeMode10.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode10 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.xhtml + "'", escapeMode10.equals(org.jsoup.nodes.Entities.EscapeMode.xhtml));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(charMap12);
        org.junit.Assert.assertNotNull(charMap13);
        org.junit.Assert.assertNotNull(charMap14);
        org.junit.Assert.assertNotNull(charMap15);
        org.junit.Assert.assertNotNull(charMap16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(charMap19);
        org.junit.Assert.assertNotNull(charMap20);
        org.junit.Assert.assertNotNull(charMap21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(charMap23);
        org.junit.Assert.assertNotNull(charMap24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(charMap26);
        org.junit.Assert.assertNotNull(charMap27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test4524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4524");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode12 = org.jsoup.nodes.Entities.EscapeMode.extended;
        java.lang.String str13 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode12);
        java.lang.String str14 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode12);
        java.lang.String str15 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode12);
        java.util.Map<java.lang.Character, java.lang.String> charMap16 = escapeMode12.getMap();
        java.lang.String str17 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode12);
        java.util.Map<java.lang.Character, java.lang.String> charMap18 = escapeMode12.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap19 = escapeMode12.getMap();
        java.lang.String str20 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode12);
        java.lang.String str21 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode12);
        java.util.Map<java.lang.Character, java.lang.String> charMap22 = escapeMode12.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap23 = escapeMode12.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap24 = escapeMode12.getMap();
        java.lang.Class<?> wildcardClass25 = charMap24.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode12 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.extended + "'", escapeMode12.equals(org.jsoup.nodes.Entities.EscapeMode.extended));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(charMap16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(charMap18);
        org.junit.Assert.assertNotNull(charMap19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(charMap22);
        org.junit.Assert.assertNotNull(charMap23);
        org.junit.Assert.assertNotNull(charMap24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test4525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4525");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode14 = org.jsoup.nodes.Entities.EscapeMode.extended;
        java.lang.String str15 = org.jsoup.nodes.Entities.escape("", charsetEncoder13, escapeMode14);
        java.util.Map<java.lang.Character, java.lang.String> charMap16 = escapeMode14.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap17 = escapeMode14.getMap();
        java.lang.String str18 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode14);
        java.util.Map<java.lang.Character, java.lang.String> charMap19 = escapeMode14.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap20 = escapeMode14.getMap();
        java.lang.String str21 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode14);
        java.util.Map<java.lang.Character, java.lang.String> charMap22 = escapeMode14.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap23 = escapeMode14.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap24 = escapeMode14.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap25 = escapeMode14.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap26 = escapeMode14.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap27 = escapeMode14.getMap();
        java.lang.String str28 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode14);
        java.lang.String str29 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode14);
        java.util.Map<java.lang.Character, java.lang.String> charMap30 = escapeMode14.getMap();
        java.lang.String str31 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode14);
        java.lang.String str32 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode14);
        org.junit.Assert.assertTrue("'" + escapeMode14 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.extended + "'", escapeMode14.equals(org.jsoup.nodes.Entities.EscapeMode.extended));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(charMap16);
        org.junit.Assert.assertNotNull(charMap17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(charMap19);
        org.junit.Assert.assertNotNull(charMap20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(charMap22);
        org.junit.Assert.assertNotNull(charMap23);
        org.junit.Assert.assertNotNull(charMap24);
        org.junit.Assert.assertNotNull(charMap25);
        org.junit.Assert.assertNotNull(charMap26);
        org.junit.Assert.assertNotNull(charMap27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(charMap30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
    }

    @Test
    public void test4526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4526");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        java.nio.charset.CharsetEncoder charsetEncoder15 = null;
        java.nio.charset.CharsetEncoder charsetEncoder17 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode18 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.util.Map<java.lang.Character, java.lang.String> charMap19 = escapeMode18.getMap();
        java.lang.String str20 = org.jsoup.nodes.Entities.escape("", charsetEncoder17, escapeMode18);
        java.lang.String str21 = org.jsoup.nodes.Entities.escape("", charsetEncoder15, escapeMode18);
        java.lang.String str22 = org.jsoup.nodes.Entities.escape("", charsetEncoder13, escapeMode18);
        java.lang.String str23 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode18);
        java.lang.String str24 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode18);
        java.lang.String str25 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode18);
        java.lang.String str26 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode18);
        java.util.Map<java.lang.Character, java.lang.String> charMap27 = escapeMode18.getMap();
        java.lang.String str28 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode18);
        java.lang.String str29 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode18);
        java.util.Map<java.lang.Character, java.lang.String> charMap30 = escapeMode18.getMap();
        java.lang.Class<?> wildcardClass31 = charMap30.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode18 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode18.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charMap19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(charMap27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(charMap30);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test4527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4527");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        java.nio.charset.CharsetEncoder charsetEncoder15 = null;
        java.nio.charset.CharsetEncoder charsetEncoder17 = null;
        java.nio.charset.CharsetEncoder charsetEncoder19 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode20 = org.jsoup.nodes.Entities.EscapeMode.extended;
        java.util.Map<java.lang.Character, java.lang.String> charMap21 = escapeMode20.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap22 = escapeMode20.getMap();
        java.lang.String str23 = org.jsoup.nodes.Entities.escape("", charsetEncoder19, escapeMode20);
        java.util.Map<java.lang.Character, java.lang.String> charMap24 = escapeMode20.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap25 = escapeMode20.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap26 = escapeMode20.getMap();
        java.lang.String str27 = org.jsoup.nodes.Entities.escape("", charsetEncoder17, escapeMode20);
        java.lang.String str28 = org.jsoup.nodes.Entities.escape("", charsetEncoder15, escapeMode20);
        java.lang.String str29 = org.jsoup.nodes.Entities.escape("", charsetEncoder13, escapeMode20);
        java.util.Map<java.lang.Character, java.lang.String> charMap30 = escapeMode20.getMap();
        java.lang.String str31 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode20);
        java.lang.String str32 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode20);
        java.lang.String str33 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode20);
        java.lang.String str34 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode20);
        java.lang.String str35 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode20);
        java.lang.String str36 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode20);
        java.util.Map<java.lang.Character, java.lang.String> charMap37 = escapeMode20.getMap();
        org.junit.Assert.assertTrue("'" + escapeMode20 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.extended + "'", escapeMode20.equals(org.jsoup.nodes.Entities.EscapeMode.extended));
        org.junit.Assert.assertNotNull(charMap21);
        org.junit.Assert.assertNotNull(charMap22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(charMap24);
        org.junit.Assert.assertNotNull(charMap25);
        org.junit.Assert.assertNotNull(charMap26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(charMap30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(charMap37);
    }

    @Test
    public void test4528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4528");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode6 = org.jsoup.nodes.Entities.EscapeMode.extended;
        java.util.Map<java.lang.Character, java.lang.String> charMap7 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap8 = escapeMode6.getMap();
        java.lang.String str9 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode6);
        java.util.Map<java.lang.Character, java.lang.String> charMap10 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap11 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap12 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap13 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap14 = escapeMode6.getMap();
        java.lang.String str15 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode6);
        java.util.Map<java.lang.Character, java.lang.String> charMap16 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap17 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap18 = escapeMode6.getMap();
        java.lang.String str19 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode6);
        java.util.Map<java.lang.Character, java.lang.String> charMap20 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap21 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap22 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap23 = escapeMode6.getMap();
        java.lang.Class<?> wildcardClass24 = charMap23.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode6 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.extended + "'", escapeMode6.equals(org.jsoup.nodes.Entities.EscapeMode.extended));
        org.junit.Assert.assertNotNull(charMap7);
        org.junit.Assert.assertNotNull(charMap8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(charMap10);
        org.junit.Assert.assertNotNull(charMap11);
        org.junit.Assert.assertNotNull(charMap12);
        org.junit.Assert.assertNotNull(charMap13);
        org.junit.Assert.assertNotNull(charMap14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(charMap16);
        org.junit.Assert.assertNotNull(charMap17);
        org.junit.Assert.assertNotNull(charMap18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(charMap20);
        org.junit.Assert.assertNotNull(charMap21);
        org.junit.Assert.assertNotNull(charMap22);
        org.junit.Assert.assertNotNull(charMap23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test4529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4529");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        java.nio.charset.CharsetEncoder charsetEncoder15 = null;
        java.nio.charset.CharsetEncoder charsetEncoder17 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode18 = org.jsoup.nodes.Entities.EscapeMode.extended;
        java.lang.String str19 = org.jsoup.nodes.Entities.escape("", charsetEncoder17, escapeMode18);
        java.util.Map<java.lang.Character, java.lang.String> charMap20 = escapeMode18.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap21 = escapeMode18.getMap();
        java.lang.String str22 = org.jsoup.nodes.Entities.escape("", charsetEncoder15, escapeMode18);
        java.lang.String str23 = org.jsoup.nodes.Entities.escape("", charsetEncoder13, escapeMode18);
        java.lang.String str24 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode18);
        java.util.Map<java.lang.Character, java.lang.String> charMap25 = escapeMode18.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap26 = escapeMode18.getMap();
        java.lang.String str27 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode18);
        java.lang.String str28 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode18);
        java.lang.String str29 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode18);
        java.util.Map<java.lang.Character, java.lang.String> charMap30 = escapeMode18.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap31 = escapeMode18.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap32 = escapeMode18.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap33 = escapeMode18.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap34 = escapeMode18.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap35 = escapeMode18.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap36 = escapeMode18.getMap();
        java.lang.String str37 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode18);
        java.util.Map<java.lang.Character, java.lang.String> charMap38 = escapeMode18.getMap();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str39 = org.jsoup.nodes.Entities.escape("hi!", charsetEncoder1, escapeMode18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + escapeMode18 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.extended + "'", escapeMode18.equals(org.jsoup.nodes.Entities.EscapeMode.extended));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(charMap20);
        org.junit.Assert.assertNotNull(charMap21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(charMap25);
        org.junit.Assert.assertNotNull(charMap26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(charMap30);
        org.junit.Assert.assertNotNull(charMap31);
        org.junit.Assert.assertNotNull(charMap32);
        org.junit.Assert.assertNotNull(charMap33);
        org.junit.Assert.assertNotNull(charMap34);
        org.junit.Assert.assertNotNull(charMap35);
        org.junit.Assert.assertNotNull(charMap36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(charMap38);
    }

    @Test
    public void test4530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4530");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode6 = org.jsoup.nodes.Entities.EscapeMode.xhtml;
        java.util.Map<java.lang.Character, java.lang.String> charMap7 = escapeMode6.getMap();
        java.lang.String str8 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode6);
        java.util.Map<java.lang.Character, java.lang.String> charMap9 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap10 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap11 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap12 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap13 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap14 = escapeMode6.getMap();
        java.lang.String str15 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode6);
        java.util.Map<java.lang.Character, java.lang.String> charMap16 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap17 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap18 = escapeMode6.getMap();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = org.jsoup.nodes.Entities.escape("hi!", charsetEncoder1, escapeMode6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + escapeMode6 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.xhtml + "'", escapeMode6.equals(org.jsoup.nodes.Entities.EscapeMode.xhtml));
        org.junit.Assert.assertNotNull(charMap7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(charMap9);
        org.junit.Assert.assertNotNull(charMap10);
        org.junit.Assert.assertNotNull(charMap11);
        org.junit.Assert.assertNotNull(charMap12);
        org.junit.Assert.assertNotNull(charMap13);
        org.junit.Assert.assertNotNull(charMap14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(charMap16);
        org.junit.Assert.assertNotNull(charMap17);
        org.junit.Assert.assertNotNull(charMap18);
    }

    @Test
    public void test4531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4531");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode10 = org.jsoup.nodes.Entities.EscapeMode.extended;
        java.lang.String str11 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode10);
        java.lang.String str12 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode10);
        java.lang.String str13 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode10);
        java.lang.String str14 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode10);
        java.util.Map<java.lang.Character, java.lang.String> charMap15 = escapeMode10.getMap();
        java.lang.String str16 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode10);
        java.util.Map<java.lang.Character, java.lang.String> charMap17 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap18 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap19 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap20 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap21 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap22 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap23 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap24 = escapeMode10.getMap();
        java.lang.Class<?> wildcardClass25 = charMap24.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode10 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.extended + "'", escapeMode10.equals(org.jsoup.nodes.Entities.EscapeMode.extended));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(charMap15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(charMap17);
        org.junit.Assert.assertNotNull(charMap18);
        org.junit.Assert.assertNotNull(charMap19);
        org.junit.Assert.assertNotNull(charMap20);
        org.junit.Assert.assertNotNull(charMap21);
        org.junit.Assert.assertNotNull(charMap22);
        org.junit.Assert.assertNotNull(charMap23);
        org.junit.Assert.assertNotNull(charMap24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test4532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4532");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode12 = org.jsoup.nodes.Entities.EscapeMode.extended;
        java.lang.String str13 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode12);
        java.util.Map<java.lang.Character, java.lang.String> charMap14 = escapeMode12.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap15 = escapeMode12.getMap();
        java.lang.String str16 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode12);
        java.lang.String str17 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode12);
        java.lang.String str18 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode12);
        java.util.Map<java.lang.Character, java.lang.String> charMap19 = escapeMode12.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap20 = escapeMode12.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap21 = escapeMode12.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap22 = escapeMode12.getMap();
        java.lang.String str23 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode12);
        java.util.Map<java.lang.Character, java.lang.String> charMap24 = escapeMode12.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap25 = escapeMode12.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap26 = escapeMode12.getMap();
        java.lang.String str27 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode12);
        java.util.Map<java.lang.Character, java.lang.String> charMap28 = escapeMode12.getMap();
        java.lang.Class<?> wildcardClass29 = escapeMode12.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode12 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.extended + "'", escapeMode12.equals(org.jsoup.nodes.Entities.EscapeMode.extended));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(charMap14);
        org.junit.Assert.assertNotNull(charMap15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(charMap19);
        org.junit.Assert.assertNotNull(charMap20);
        org.junit.Assert.assertNotNull(charMap21);
        org.junit.Assert.assertNotNull(charMap22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(charMap24);
        org.junit.Assert.assertNotNull(charMap25);
        org.junit.Assert.assertNotNull(charMap26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(charMap28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test4533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4533");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode8 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.util.Map<java.lang.Character, java.lang.String> charMap9 = escapeMode8.getMap();
        java.lang.String str10 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode8);
        java.util.Map<java.lang.Character, java.lang.String> charMap11 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap12 = escapeMode8.getMap();
        java.lang.String str13 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode8);
        java.lang.String str14 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = org.jsoup.nodes.Entities.escape("hi!", charsetEncoder1, escapeMode8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + escapeMode8 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode8.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charMap9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(charMap11);
        org.junit.Assert.assertNotNull(charMap12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test4534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4534");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode12 = org.jsoup.nodes.Entities.EscapeMode.extended;
        java.util.Map<java.lang.Character, java.lang.String> charMap13 = escapeMode12.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap14 = escapeMode12.getMap();
        java.lang.String str15 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode12);
        java.util.Map<java.lang.Character, java.lang.String> charMap16 = escapeMode12.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap17 = escapeMode12.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap18 = escapeMode12.getMap();
        java.lang.String str19 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode12);
        java.lang.String str20 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode12);
        java.util.Map<java.lang.Character, java.lang.String> charMap21 = escapeMode12.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap22 = escapeMode12.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap23 = escapeMode12.getMap();
        java.lang.String str24 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode12);
        java.lang.String str25 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode12);
        java.lang.String str26 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode12);
        org.junit.Assert.assertTrue("'" + escapeMode12 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.extended + "'", escapeMode12.equals(org.jsoup.nodes.Entities.EscapeMode.extended));
        org.junit.Assert.assertNotNull(charMap13);
        org.junit.Assert.assertNotNull(charMap14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(charMap16);
        org.junit.Assert.assertNotNull(charMap17);
        org.junit.Assert.assertNotNull(charMap18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(charMap21);
        org.junit.Assert.assertNotNull(charMap22);
        org.junit.Assert.assertNotNull(charMap23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test4535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4535");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode4 = org.jsoup.nodes.Entities.EscapeMode.extended;
        java.lang.String str5 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode4);
        java.util.Map<java.lang.Character, java.lang.String> charMap6 = escapeMode4.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap7 = escapeMode4.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap8 = escapeMode4.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap9 = escapeMode4.getMap();
        java.lang.String str10 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode4);
        java.util.Map<java.lang.Character, java.lang.String> charMap11 = escapeMode4.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap12 = escapeMode4.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap13 = escapeMode4.getMap();
        java.lang.Class<?> wildcardClass14 = escapeMode4.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode4 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.extended + "'", escapeMode4.equals(org.jsoup.nodes.Entities.EscapeMode.extended));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(charMap6);
        org.junit.Assert.assertNotNull(charMap7);
        org.junit.Assert.assertNotNull(charMap8);
        org.junit.Assert.assertNotNull(charMap9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(charMap11);
        org.junit.Assert.assertNotNull(charMap12);
        org.junit.Assert.assertNotNull(charMap13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4536");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        java.nio.charset.CharsetEncoder charsetEncoder15 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode16 = org.jsoup.nodes.Entities.EscapeMode.extended;
        java.lang.String str17 = org.jsoup.nodes.Entities.escape("", charsetEncoder15, escapeMode16);
        java.lang.String str18 = org.jsoup.nodes.Entities.escape("", charsetEncoder13, escapeMode16);
        java.lang.String str19 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode16);
        java.util.Map<java.lang.Character, java.lang.String> charMap20 = escapeMode16.getMap();
        java.lang.String str21 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode16);
        java.lang.String str22 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode16);
        java.util.Map<java.lang.Character, java.lang.String> charMap23 = escapeMode16.getMap();
        java.lang.String str24 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode16);
        java.util.Map<java.lang.Character, java.lang.String> charMap25 = escapeMode16.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap26 = escapeMode16.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap27 = escapeMode16.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap28 = escapeMode16.getMap();
        java.lang.String str29 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode16);
        java.util.Map<java.lang.Character, java.lang.String> charMap30 = escapeMode16.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap31 = escapeMode16.getMap();
        java.lang.String str32 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode16);
        java.util.Map<java.lang.Character, java.lang.String> charMap33 = escapeMode16.getMap();
        org.junit.Assert.assertTrue("'" + escapeMode16 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.extended + "'", escapeMode16.equals(org.jsoup.nodes.Entities.EscapeMode.extended));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(charMap20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(charMap23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(charMap25);
        org.junit.Assert.assertNotNull(charMap26);
        org.junit.Assert.assertNotNull(charMap27);
        org.junit.Assert.assertNotNull(charMap28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(charMap30);
        org.junit.Assert.assertNotNull(charMap31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(charMap33);
    }

    @Test
    public void test4537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4537");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode10 = org.jsoup.nodes.Entities.EscapeMode.extended;
        java.lang.String str11 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode10);
        java.util.Map<java.lang.Character, java.lang.String> charMap12 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap13 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap14 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap15 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap16 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap17 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap18 = escapeMode10.getMap();
        java.lang.String str19 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode10);
        java.util.Map<java.lang.Character, java.lang.String> charMap20 = escapeMode10.getMap();
        java.lang.String str21 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode10);
        java.lang.String str22 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode10);
        java.util.Map<java.lang.Character, java.lang.String> charMap23 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap24 = escapeMode10.getMap();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = org.jsoup.nodes.Entities.escape("hi!", charsetEncoder1, escapeMode10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + escapeMode10 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.extended + "'", escapeMode10.equals(org.jsoup.nodes.Entities.EscapeMode.extended));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(charMap12);
        org.junit.Assert.assertNotNull(charMap13);
        org.junit.Assert.assertNotNull(charMap14);
        org.junit.Assert.assertNotNull(charMap15);
        org.junit.Assert.assertNotNull(charMap16);
        org.junit.Assert.assertNotNull(charMap17);
        org.junit.Assert.assertNotNull(charMap18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(charMap20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(charMap23);
        org.junit.Assert.assertNotNull(charMap24);
    }

    @Test
    public void test4538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4538");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode10 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.lang.String str11 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode10);
        java.lang.String str12 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode10);
        java.lang.String str13 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode10);
        java.lang.String str14 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = org.jsoup.nodes.Entities.escape("hi!", charsetEncoder1, escapeMode10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + escapeMode10 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode10.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test4539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4539");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode8 = org.jsoup.nodes.Entities.EscapeMode.extended;
        java.lang.String str9 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode8);
        java.util.Map<java.lang.Character, java.lang.String> charMap10 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap11 = escapeMode8.getMap();
        java.lang.String str12 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode8);
        java.util.Map<java.lang.Character, java.lang.String> charMap13 = escapeMode8.getMap();
        java.lang.String str14 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode8);
        java.util.Map<java.lang.Character, java.lang.String> charMap15 = escapeMode8.getMap();
        java.lang.String str16 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode8);
        java.util.Map<java.lang.Character, java.lang.String> charMap17 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap18 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap19 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap20 = escapeMode8.getMap();
        org.junit.Assert.assertTrue("'" + escapeMode8 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.extended + "'", escapeMode8.equals(org.jsoup.nodes.Entities.EscapeMode.extended));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(charMap10);
        org.junit.Assert.assertNotNull(charMap11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(charMap13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(charMap15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(charMap17);
        org.junit.Assert.assertNotNull(charMap18);
        org.junit.Assert.assertNotNull(charMap19);
        org.junit.Assert.assertNotNull(charMap20);
    }

    @Test
    public void test4540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4540");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode10 = org.jsoup.nodes.Entities.EscapeMode.extended;
        java.lang.String str11 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode10);
        java.util.Map<java.lang.Character, java.lang.String> charMap12 = escapeMode10.getMap();
        java.lang.String str13 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode10);
        java.lang.String str14 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode10);
        java.lang.String str15 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode10);
        java.util.Map<java.lang.Character, java.lang.String> charMap16 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap17 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap18 = escapeMode10.getMap();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = org.jsoup.nodes.Entities.escape("hi!", charsetEncoder1, escapeMode10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + escapeMode10 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.extended + "'", escapeMode10.equals(org.jsoup.nodes.Entities.EscapeMode.extended));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(charMap12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(charMap16);
        org.junit.Assert.assertNotNull(charMap17);
        org.junit.Assert.assertNotNull(charMap18);
    }

    @Test
    public void test4541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4541");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode6 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.util.Map<java.lang.Character, java.lang.String> charMap7 = escapeMode6.getMap();
        java.lang.String str8 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode6);
        java.lang.String str9 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode6);
        java.util.Map<java.lang.Character, java.lang.String> charMap10 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap11 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap12 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap13 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap14 = escapeMode6.getMap();
        java.lang.String str15 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode6);
        java.util.Map<java.lang.Character, java.lang.String> charMap16 = escapeMode6.getMap();
        java.lang.Class<?> wildcardClass17 = escapeMode6.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode6 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode6.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charMap7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(charMap10);
        org.junit.Assert.assertNotNull(charMap11);
        org.junit.Assert.assertNotNull(charMap12);
        org.junit.Assert.assertNotNull(charMap13);
        org.junit.Assert.assertNotNull(charMap14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(charMap16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4542");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode12 = org.jsoup.nodes.Entities.EscapeMode.extended;
        java.lang.String str13 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode12);
        java.lang.String str14 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode12);
        java.lang.String str15 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode12);
        java.util.Map<java.lang.Character, java.lang.String> charMap16 = escapeMode12.getMap();
        java.lang.String str17 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode12);
        java.util.Map<java.lang.Character, java.lang.String> charMap18 = escapeMode12.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap19 = escapeMode12.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap20 = escapeMode12.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap21 = escapeMode12.getMap();
        java.lang.String str22 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode12);
        java.lang.String str23 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode12);
        java.util.Map<java.lang.Character, java.lang.String> charMap24 = escapeMode12.getMap();
        org.junit.Assert.assertTrue("'" + escapeMode12 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.extended + "'", escapeMode12.equals(org.jsoup.nodes.Entities.EscapeMode.extended));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(charMap16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(charMap18);
        org.junit.Assert.assertNotNull(charMap19);
        org.junit.Assert.assertNotNull(charMap20);
        org.junit.Assert.assertNotNull(charMap21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(charMap24);
    }

    @Test
    public void test4543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4543");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode8 = org.jsoup.nodes.Entities.EscapeMode.extended;
        java.util.Map<java.lang.Character, java.lang.String> charMap9 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap10 = escapeMode8.getMap();
        java.lang.String str11 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode8);
        java.util.Map<java.lang.Character, java.lang.String> charMap12 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap13 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap14 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap15 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap16 = escapeMode8.getMap();
        java.lang.String str17 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode8);
        java.util.Map<java.lang.Character, java.lang.String> charMap18 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap19 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap20 = escapeMode8.getMap();
        java.lang.String str21 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode8);
        java.util.Map<java.lang.Character, java.lang.String> charMap22 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap23 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap24 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap25 = escapeMode8.getMap();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = org.jsoup.nodes.Entities.escape("hi!", charsetEncoder1, escapeMode8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + escapeMode8 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.extended + "'", escapeMode8.equals(org.jsoup.nodes.Entities.EscapeMode.extended));
        org.junit.Assert.assertNotNull(charMap9);
        org.junit.Assert.assertNotNull(charMap10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(charMap12);
        org.junit.Assert.assertNotNull(charMap13);
        org.junit.Assert.assertNotNull(charMap14);
        org.junit.Assert.assertNotNull(charMap15);
        org.junit.Assert.assertNotNull(charMap16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(charMap18);
        org.junit.Assert.assertNotNull(charMap19);
        org.junit.Assert.assertNotNull(charMap20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(charMap22);
        org.junit.Assert.assertNotNull(charMap23);
        org.junit.Assert.assertNotNull(charMap24);
        org.junit.Assert.assertNotNull(charMap25);
    }

    @Test
    public void test4544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4544");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode10 = org.jsoup.nodes.Entities.EscapeMode.extended;
        java.util.Map<java.lang.Character, java.lang.String> charMap11 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap12 = escapeMode10.getMap();
        java.lang.String str13 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode10);
        java.util.Map<java.lang.Character, java.lang.String> charMap14 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap15 = escapeMode10.getMap();
        java.lang.String str16 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode10);
        java.util.Map<java.lang.Character, java.lang.String> charMap17 = escapeMode10.getMap();
        java.lang.String str18 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode10);
        java.util.Map<java.lang.Character, java.lang.String> charMap19 = escapeMode10.getMap();
        java.lang.String str20 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode10);
        java.lang.String str21 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode10);
        java.util.Map<java.lang.Character, java.lang.String> charMap22 = escapeMode10.getMap();
        java.lang.Class<?> wildcardClass23 = charMap22.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode10 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.extended + "'", escapeMode10.equals(org.jsoup.nodes.Entities.EscapeMode.extended));
        org.junit.Assert.assertNotNull(charMap11);
        org.junit.Assert.assertNotNull(charMap12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(charMap14);
        org.junit.Assert.assertNotNull(charMap15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(charMap17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(charMap19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(charMap22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test4545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4545");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode8 = org.jsoup.nodes.Entities.EscapeMode.xhtml;
        java.lang.String str9 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode8);
        java.util.Map<java.lang.Character, java.lang.String> charMap10 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap11 = escapeMode8.getMap();
        java.lang.String str12 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode8);
        java.util.Map<java.lang.Character, java.lang.String> charMap13 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap14 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap15 = escapeMode8.getMap();
        java.lang.String str16 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode8);
        java.util.Map<java.lang.Character, java.lang.String> charMap17 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap18 = escapeMode8.getMap();
        java.lang.String str19 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode8);
        java.util.Map<java.lang.Character, java.lang.String> charMap20 = escapeMode8.getMap();
        java.lang.Class<?> wildcardClass21 = escapeMode8.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode8 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.xhtml + "'", escapeMode8.equals(org.jsoup.nodes.Entities.EscapeMode.xhtml));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(charMap10);
        org.junit.Assert.assertNotNull(charMap11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(charMap13);
        org.junit.Assert.assertNotNull(charMap14);
        org.junit.Assert.assertNotNull(charMap15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(charMap17);
        org.junit.Assert.assertNotNull(charMap18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(charMap20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test4546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4546");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode12 = org.jsoup.nodes.Entities.EscapeMode.extended;
        java.lang.String str13 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode12);
        java.util.Map<java.lang.Character, java.lang.String> charMap14 = escapeMode12.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap15 = escapeMode12.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap16 = escapeMode12.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap17 = escapeMode12.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap18 = escapeMode12.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap19 = escapeMode12.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap20 = escapeMode12.getMap();
        java.lang.String str21 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode12);
        java.lang.String str22 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode12);
        java.util.Map<java.lang.Character, java.lang.String> charMap23 = escapeMode12.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap24 = escapeMode12.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap25 = escapeMode12.getMap();
        java.lang.String str26 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode12);
        java.util.Map<java.lang.Character, java.lang.String> charMap27 = escapeMode12.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap28 = escapeMode12.getMap();
        java.lang.String str29 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode12);
        java.lang.String str30 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode12);
        java.util.Map<java.lang.Character, java.lang.String> charMap31 = escapeMode12.getMap();
        org.junit.Assert.assertTrue("'" + escapeMode12 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.extended + "'", escapeMode12.equals(org.jsoup.nodes.Entities.EscapeMode.extended));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(charMap14);
        org.junit.Assert.assertNotNull(charMap15);
        org.junit.Assert.assertNotNull(charMap16);
        org.junit.Assert.assertNotNull(charMap17);
        org.junit.Assert.assertNotNull(charMap18);
        org.junit.Assert.assertNotNull(charMap19);
        org.junit.Assert.assertNotNull(charMap20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(charMap23);
        org.junit.Assert.assertNotNull(charMap24);
        org.junit.Assert.assertNotNull(charMap25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(charMap27);
        org.junit.Assert.assertNotNull(charMap28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(charMap31);
    }

    @Test
    public void test4547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4547");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        java.nio.charset.CharsetEncoder charsetEncoder15 = null;
        java.nio.charset.CharsetEncoder charsetEncoder17 = null;
        java.nio.charset.CharsetEncoder charsetEncoder19 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode20 = org.jsoup.nodes.Entities.EscapeMode.extended;
        java.lang.String str21 = org.jsoup.nodes.Entities.escape("", charsetEncoder19, escapeMode20);
        java.util.Map<java.lang.Character, java.lang.String> charMap22 = escapeMode20.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap23 = escapeMode20.getMap();
        java.lang.String str24 = org.jsoup.nodes.Entities.escape("", charsetEncoder17, escapeMode20);
        java.lang.String str25 = org.jsoup.nodes.Entities.escape("", charsetEncoder15, escapeMode20);
        java.lang.String str26 = org.jsoup.nodes.Entities.escape("", charsetEncoder13, escapeMode20);
        java.util.Map<java.lang.Character, java.lang.String> charMap27 = escapeMode20.getMap();
        java.lang.String str28 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode20);
        java.util.Map<java.lang.Character, java.lang.String> charMap29 = escapeMode20.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap30 = escapeMode20.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap31 = escapeMode20.getMap();
        java.lang.String str32 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode20);
        java.lang.String str33 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode20);
        java.lang.String str34 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode20);
        java.lang.String str35 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode20);
        java.util.Map<java.lang.Character, java.lang.String> charMap36 = escapeMode20.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap37 = escapeMode20.getMap();
        java.lang.String str38 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode20);
        java.lang.Class<?> wildcardClass39 = escapeMode20.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode20 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.extended + "'", escapeMode20.equals(org.jsoup.nodes.Entities.EscapeMode.extended));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(charMap22);
        org.junit.Assert.assertNotNull(charMap23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(charMap27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(charMap29);
        org.junit.Assert.assertNotNull(charMap30);
        org.junit.Assert.assertNotNull(charMap31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(charMap36);
        org.junit.Assert.assertNotNull(charMap37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test4548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4548");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode10 = org.jsoup.nodes.Entities.EscapeMode.extended;
        java.lang.String str11 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode10);
        java.lang.String str12 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode10);
        java.util.Map<java.lang.Character, java.lang.String> charMap13 = escapeMode10.getMap();
        java.lang.String str14 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode10);
        java.util.Map<java.lang.Character, java.lang.String> charMap15 = escapeMode10.getMap();
        java.lang.String str16 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode10);
        java.lang.String str17 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode10);
        java.util.Map<java.lang.Character, java.lang.String> charMap18 = escapeMode10.getMap();
        java.lang.Class<?> wildcardClass19 = charMap18.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode10 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.extended + "'", escapeMode10.equals(org.jsoup.nodes.Entities.EscapeMode.extended));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(charMap13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(charMap15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(charMap18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4549");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode6 = org.jsoup.nodes.Entities.EscapeMode.xhtml;
        java.lang.String str7 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode6);
        java.util.Map<java.lang.Character, java.lang.String> charMap8 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap9 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap10 = escapeMode6.getMap();
        java.lang.String str11 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode6);
        java.lang.String str12 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode6);
        java.util.Map<java.lang.Character, java.lang.String> charMap13 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap14 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap15 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap16 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap17 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap18 = escapeMode6.getMap();
        org.junit.Assert.assertTrue("'" + escapeMode6 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.xhtml + "'", escapeMode6.equals(org.jsoup.nodes.Entities.EscapeMode.xhtml));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(charMap8);
        org.junit.Assert.assertNotNull(charMap9);
        org.junit.Assert.assertNotNull(charMap10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(charMap13);
        org.junit.Assert.assertNotNull(charMap14);
        org.junit.Assert.assertNotNull(charMap15);
        org.junit.Assert.assertNotNull(charMap16);
        org.junit.Assert.assertNotNull(charMap17);
        org.junit.Assert.assertNotNull(charMap18);
    }

    @Test
    public void test4550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4550");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode12 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.util.Map<java.lang.Character, java.lang.String> charMap13 = escapeMode12.getMap();
        java.lang.String str14 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode12);
        java.util.Map<java.lang.Character, java.lang.String> charMap15 = escapeMode12.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap16 = escapeMode12.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap17 = escapeMode12.getMap();
        java.lang.String str18 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode12);
        java.util.Map<java.lang.Character, java.lang.String> charMap19 = escapeMode12.getMap();
        java.lang.String str20 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode12);
        java.lang.String str21 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode12);
        java.lang.String str22 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode12);
        java.util.Map<java.lang.Character, java.lang.String> charMap23 = escapeMode12.getMap();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = org.jsoup.nodes.Entities.escape("hi!", charsetEncoder1, escapeMode12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + escapeMode12 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode12.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charMap13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(charMap15);
        org.junit.Assert.assertNotNull(charMap16);
        org.junit.Assert.assertNotNull(charMap17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(charMap19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(charMap23);
    }

    @Test
    public void test4551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4551");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode10 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.util.Map<java.lang.Character, java.lang.String> charMap11 = escapeMode10.getMap();
        java.lang.String str12 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode10);
        java.lang.String str13 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode10);
        java.util.Map<java.lang.Character, java.lang.String> charMap14 = escapeMode10.getMap();
        java.lang.String str15 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode10);
        java.lang.String str16 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode10);
        java.lang.String str17 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode10);
        java.util.Map<java.lang.Character, java.lang.String> charMap18 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap19 = escapeMode10.getMap();
        java.lang.Class<?> wildcardClass20 = escapeMode10.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode10 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode10.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charMap11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(charMap14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(charMap18);
        org.junit.Assert.assertNotNull(charMap19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4552");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode10 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.util.Map<java.lang.Character, java.lang.String> charMap11 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap12 = escapeMode10.getMap();
        java.lang.String str13 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode10);
        java.util.Map<java.lang.Character, java.lang.String> charMap14 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap15 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap16 = escapeMode10.getMap();
        java.lang.String str17 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode10);
        java.util.Map<java.lang.Character, java.lang.String> charMap18 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap19 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap20 = escapeMode10.getMap();
        java.lang.String str21 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode10);
        java.lang.String str22 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode10);
        java.util.Map<java.lang.Character, java.lang.String> charMap23 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap24 = escapeMode10.getMap();
        java.lang.String str25 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode10);
        java.util.Map<java.lang.Character, java.lang.String> charMap26 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap27 = escapeMode10.getMap();
        org.junit.Assert.assertTrue("'" + escapeMode10 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode10.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charMap11);
        org.junit.Assert.assertNotNull(charMap12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(charMap14);
        org.junit.Assert.assertNotNull(charMap15);
        org.junit.Assert.assertNotNull(charMap16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(charMap18);
        org.junit.Assert.assertNotNull(charMap19);
        org.junit.Assert.assertNotNull(charMap20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(charMap23);
        org.junit.Assert.assertNotNull(charMap24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(charMap26);
        org.junit.Assert.assertNotNull(charMap27);
    }

    @Test
    public void test4553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4553");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode6 = org.jsoup.nodes.Entities.EscapeMode.xhtml;
        java.lang.String str7 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode6);
        java.util.Map<java.lang.Character, java.lang.String> charMap8 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap9 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap10 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap11 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap12 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap13 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap14 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap15 = escapeMode6.getMap();
        java.lang.String str16 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode6);
        java.lang.String str17 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode6);
        java.util.Map<java.lang.Character, java.lang.String> charMap18 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap19 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap20 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap21 = escapeMode6.getMap();
        java.lang.Class<?> wildcardClass22 = escapeMode6.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode6 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.xhtml + "'", escapeMode6.equals(org.jsoup.nodes.Entities.EscapeMode.xhtml));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(charMap8);
        org.junit.Assert.assertNotNull(charMap9);
        org.junit.Assert.assertNotNull(charMap10);
        org.junit.Assert.assertNotNull(charMap11);
        org.junit.Assert.assertNotNull(charMap12);
        org.junit.Assert.assertNotNull(charMap13);
        org.junit.Assert.assertNotNull(charMap14);
        org.junit.Assert.assertNotNull(charMap15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(charMap18);
        org.junit.Assert.assertNotNull(charMap19);
        org.junit.Assert.assertNotNull(charMap20);
        org.junit.Assert.assertNotNull(charMap21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4554");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        java.nio.charset.CharsetEncoder charsetEncoder15 = null;
        java.nio.charset.CharsetEncoder charsetEncoder17 = null;
        java.nio.charset.CharsetEncoder charsetEncoder19 = null;
        java.nio.charset.CharsetEncoder charsetEncoder21 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode22 = org.jsoup.nodes.Entities.EscapeMode.extended;
        java.lang.String str23 = org.jsoup.nodes.Entities.escape("", charsetEncoder21, escapeMode22);
        java.util.Map<java.lang.Character, java.lang.String> charMap24 = escapeMode22.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap25 = escapeMode22.getMap();
        java.lang.String str26 = org.jsoup.nodes.Entities.escape("", charsetEncoder19, escapeMode22);
        java.lang.String str27 = org.jsoup.nodes.Entities.escape("", charsetEncoder17, escapeMode22);
        java.lang.String str28 = org.jsoup.nodes.Entities.escape("", charsetEncoder15, escapeMode22);
        java.util.Map<java.lang.Character, java.lang.String> charMap29 = escapeMode22.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap30 = escapeMode22.getMap();
        java.lang.String str31 = org.jsoup.nodes.Entities.escape("", charsetEncoder13, escapeMode22);
        java.lang.String str32 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode22);
        java.lang.String str33 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode22);
        java.util.Map<java.lang.Character, java.lang.String> charMap34 = escapeMode22.getMap();
        java.lang.String str35 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode22);
        java.lang.String str36 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode22);
        java.util.Map<java.lang.Character, java.lang.String> charMap37 = escapeMode22.getMap();
        java.lang.String str38 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode22);
        java.util.Map<java.lang.Character, java.lang.String> charMap39 = escapeMode22.getMap();
        java.lang.String str40 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode22);
        org.junit.Assert.assertTrue("'" + escapeMode22 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.extended + "'", escapeMode22.equals(org.jsoup.nodes.Entities.EscapeMode.extended));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(charMap24);
        org.junit.Assert.assertNotNull(charMap25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(charMap29);
        org.junit.Assert.assertNotNull(charMap30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(charMap34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(charMap37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(charMap39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
    }

    @Test
    public void test4555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4555");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode14 = org.jsoup.nodes.Entities.EscapeMode.extended;
        java.lang.String str15 = org.jsoup.nodes.Entities.escape("", charsetEncoder13, escapeMode14);
        java.util.Map<java.lang.Character, java.lang.String> charMap16 = escapeMode14.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap17 = escapeMode14.getMap();
        java.lang.String str18 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode14);
        java.lang.String str19 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode14);
        java.lang.String str20 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode14);
        java.util.Map<java.lang.Character, java.lang.String> charMap21 = escapeMode14.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap22 = escapeMode14.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap23 = escapeMode14.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap24 = escapeMode14.getMap();
        java.lang.String str25 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode14);
        java.util.Map<java.lang.Character, java.lang.String> charMap26 = escapeMode14.getMap();
        java.lang.String str27 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode14);
        java.lang.String str28 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode14);
        java.util.Map<java.lang.Character, java.lang.String> charMap29 = escapeMode14.getMap();
        org.junit.Assert.assertTrue("'" + escapeMode14 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.extended + "'", escapeMode14.equals(org.jsoup.nodes.Entities.EscapeMode.extended));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(charMap16);
        org.junit.Assert.assertNotNull(charMap17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(charMap21);
        org.junit.Assert.assertNotNull(charMap22);
        org.junit.Assert.assertNotNull(charMap23);
        org.junit.Assert.assertNotNull(charMap24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(charMap26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(charMap29);
    }

    @Test
    public void test4556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4556");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        java.nio.charset.CharsetEncoder charsetEncoder15 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode16 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.util.Map<java.lang.Character, java.lang.String> charMap17 = escapeMode16.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap18 = escapeMode16.getMap();
        java.lang.String str19 = org.jsoup.nodes.Entities.escape("", charsetEncoder15, escapeMode16);
        java.util.Map<java.lang.Character, java.lang.String> charMap20 = escapeMode16.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap21 = escapeMode16.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap22 = escapeMode16.getMap();
        java.lang.String str23 = org.jsoup.nodes.Entities.escape("", charsetEncoder13, escapeMode16);
        java.util.Map<java.lang.Character, java.lang.String> charMap24 = escapeMode16.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap25 = escapeMode16.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap26 = escapeMode16.getMap();
        java.lang.String str27 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode16);
        java.lang.String str28 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode16);
        java.util.Map<java.lang.Character, java.lang.String> charMap29 = escapeMode16.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap30 = escapeMode16.getMap();
        java.lang.String str31 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode16);
        java.util.Map<java.lang.Character, java.lang.String> charMap32 = escapeMode16.getMap();
        java.lang.String str33 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode16);
        java.lang.String str34 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str35 = org.jsoup.nodes.Entities.escape("hi!", charsetEncoder1, escapeMode16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + escapeMode16 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode16.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charMap17);
        org.junit.Assert.assertNotNull(charMap18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(charMap20);
        org.junit.Assert.assertNotNull(charMap21);
        org.junit.Assert.assertNotNull(charMap22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(charMap24);
        org.junit.Assert.assertNotNull(charMap25);
        org.junit.Assert.assertNotNull(charMap26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(charMap29);
        org.junit.Assert.assertNotNull(charMap30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(charMap32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
    }

    @Test
    public void test4557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4557");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode14 = org.jsoup.nodes.Entities.EscapeMode.extended;
        java.lang.String str15 = org.jsoup.nodes.Entities.escape("", charsetEncoder13, escapeMode14);
        java.util.Map<java.lang.Character, java.lang.String> charMap16 = escapeMode14.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap17 = escapeMode14.getMap();
        java.lang.String str18 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode14);
        java.lang.String str19 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode14);
        java.lang.String str20 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode14);
        java.util.Map<java.lang.Character, java.lang.String> charMap21 = escapeMode14.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap22 = escapeMode14.getMap();
        java.lang.String str23 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode14);
        java.util.Map<java.lang.Character, java.lang.String> charMap24 = escapeMode14.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap25 = escapeMode14.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap26 = escapeMode14.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap27 = escapeMode14.getMap();
        java.lang.String str28 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode14);
        java.util.Map<java.lang.Character, java.lang.String> charMap29 = escapeMode14.getMap();
        java.lang.String str30 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode14);
        java.util.Map<java.lang.Character, java.lang.String> charMap31 = escapeMode14.getMap();
        org.junit.Assert.assertTrue("'" + escapeMode14 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.extended + "'", escapeMode14.equals(org.jsoup.nodes.Entities.EscapeMode.extended));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(charMap16);
        org.junit.Assert.assertNotNull(charMap17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(charMap21);
        org.junit.Assert.assertNotNull(charMap22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(charMap24);
        org.junit.Assert.assertNotNull(charMap25);
        org.junit.Assert.assertNotNull(charMap26);
        org.junit.Assert.assertNotNull(charMap27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(charMap29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(charMap31);
    }

    @Test
    public void test4558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4558");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode8 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.util.Map<java.lang.Character, java.lang.String> charMap9 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap10 = escapeMode8.getMap();
        java.lang.String str11 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode8);
        java.util.Map<java.lang.Character, java.lang.String> charMap12 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap13 = escapeMode8.getMap();
        java.lang.String str14 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode8);
        java.lang.String str15 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode8);
        java.lang.String str16 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode8);
        java.util.Map<java.lang.Character, java.lang.String> charMap17 = escapeMode8.getMap();
        org.junit.Assert.assertTrue("'" + escapeMode8 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode8.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charMap9);
        org.junit.Assert.assertNotNull(charMap10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(charMap12);
        org.junit.Assert.assertNotNull(charMap13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(charMap17);
    }

    @Test
    public void test4559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4559");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode12 = org.jsoup.nodes.Entities.EscapeMode.extended;
        java.lang.String str13 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode12);
        java.util.Map<java.lang.Character, java.lang.String> charMap14 = escapeMode12.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap15 = escapeMode12.getMap();
        java.lang.String str16 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode12);
        java.lang.String str17 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode12);
        java.lang.String str18 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode12);
        java.util.Map<java.lang.Character, java.lang.String> charMap19 = escapeMode12.getMap();
        java.lang.String str20 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode12);
        java.util.Map<java.lang.Character, java.lang.String> charMap21 = escapeMode12.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap22 = escapeMode12.getMap();
        java.lang.String str23 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode12);
        java.util.Map<java.lang.Character, java.lang.String> charMap24 = escapeMode12.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap25 = escapeMode12.getMap();
        org.junit.Assert.assertTrue("'" + escapeMode12 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.extended + "'", escapeMode12.equals(org.jsoup.nodes.Entities.EscapeMode.extended));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(charMap14);
        org.junit.Assert.assertNotNull(charMap15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(charMap19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(charMap21);
        org.junit.Assert.assertNotNull(charMap22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(charMap24);
        org.junit.Assert.assertNotNull(charMap25);
    }

    @Test
    public void test4560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4560");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode8 = org.jsoup.nodes.Entities.EscapeMode.xhtml;
        java.util.Map<java.lang.Character, java.lang.String> charMap9 = escapeMode8.getMap();
        java.lang.String str10 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode8);
        java.util.Map<java.lang.Character, java.lang.String> charMap11 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap12 = escapeMode8.getMap();
        java.lang.String str13 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode8);
        java.lang.String str14 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode8);
        java.lang.String str15 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode8);
        java.util.Map<java.lang.Character, java.lang.String> charMap16 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap17 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap18 = escapeMode8.getMap();
        org.junit.Assert.assertTrue("'" + escapeMode8 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.xhtml + "'", escapeMode8.equals(org.jsoup.nodes.Entities.EscapeMode.xhtml));
        org.junit.Assert.assertNotNull(charMap9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(charMap11);
        org.junit.Assert.assertNotNull(charMap12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(charMap16);
        org.junit.Assert.assertNotNull(charMap17);
        org.junit.Assert.assertNotNull(charMap18);
    }

    @Test
    public void test4561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4561");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode12 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.util.Map<java.lang.Character, java.lang.String> charMap13 = escapeMode12.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap14 = escapeMode12.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap15 = escapeMode12.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap16 = escapeMode12.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap17 = escapeMode12.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap18 = escapeMode12.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap19 = escapeMode12.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap20 = escapeMode12.getMap();
        java.lang.String str21 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode12);
        java.util.Map<java.lang.Character, java.lang.String> charMap22 = escapeMode12.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap23 = escapeMode12.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap24 = escapeMode12.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap25 = escapeMode12.getMap();
        java.lang.String str26 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode12);
        java.util.Map<java.lang.Character, java.lang.String> charMap27 = escapeMode12.getMap();
        java.lang.String str28 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode12);
        java.lang.String str29 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode12);
        java.lang.String str30 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str31 = org.jsoup.nodes.Entities.escape("hi!", charsetEncoder1, escapeMode12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + escapeMode12 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode12.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charMap13);
        org.junit.Assert.assertNotNull(charMap14);
        org.junit.Assert.assertNotNull(charMap15);
        org.junit.Assert.assertNotNull(charMap16);
        org.junit.Assert.assertNotNull(charMap17);
        org.junit.Assert.assertNotNull(charMap18);
        org.junit.Assert.assertNotNull(charMap19);
        org.junit.Assert.assertNotNull(charMap20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(charMap22);
        org.junit.Assert.assertNotNull(charMap23);
        org.junit.Assert.assertNotNull(charMap24);
        org.junit.Assert.assertNotNull(charMap25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(charMap27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test4562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4562");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode10 = org.jsoup.nodes.Entities.EscapeMode.extended;
        java.util.Map<java.lang.Character, java.lang.String> charMap11 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap12 = escapeMode10.getMap();
        java.lang.String str13 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode10);
        java.util.Map<java.lang.Character, java.lang.String> charMap14 = escapeMode10.getMap();
        java.lang.String str15 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode10);
        java.lang.String str16 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode10);
        java.lang.String str17 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = org.jsoup.nodes.Entities.escape("hi!", charsetEncoder1, escapeMode10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + escapeMode10 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.extended + "'", escapeMode10.equals(org.jsoup.nodes.Entities.EscapeMode.extended));
        org.junit.Assert.assertNotNull(charMap11);
        org.junit.Assert.assertNotNull(charMap12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(charMap14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test4563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4563");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        java.nio.charset.CharsetEncoder charsetEncoder15 = null;
        java.nio.charset.CharsetEncoder charsetEncoder17 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode18 = org.jsoup.nodes.Entities.EscapeMode.extended;
        java.lang.String str19 = org.jsoup.nodes.Entities.escape("", charsetEncoder17, escapeMode18);
        java.util.Map<java.lang.Character, java.lang.String> charMap20 = escapeMode18.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap21 = escapeMode18.getMap();
        java.lang.String str22 = org.jsoup.nodes.Entities.escape("", charsetEncoder15, escapeMode18);
        java.util.Map<java.lang.Character, java.lang.String> charMap23 = escapeMode18.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap24 = escapeMode18.getMap();
        java.lang.String str25 = org.jsoup.nodes.Entities.escape("", charsetEncoder13, escapeMode18);
        java.lang.String str26 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode18);
        java.util.Map<java.lang.Character, java.lang.String> charMap27 = escapeMode18.getMap();
        java.lang.String str28 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode18);
        java.lang.String str29 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode18);
        java.lang.String str30 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode18);
        java.util.Map<java.lang.Character, java.lang.String> charMap31 = escapeMode18.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap32 = escapeMode18.getMap();
        java.lang.String str33 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode18);
        java.util.Map<java.lang.Character, java.lang.String> charMap34 = escapeMode18.getMap();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str35 = org.jsoup.nodes.Entities.escape("hi!", charsetEncoder1, escapeMode18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + escapeMode18 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.extended + "'", escapeMode18.equals(org.jsoup.nodes.Entities.EscapeMode.extended));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(charMap20);
        org.junit.Assert.assertNotNull(charMap21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(charMap23);
        org.junit.Assert.assertNotNull(charMap24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(charMap27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(charMap31);
        org.junit.Assert.assertNotNull(charMap32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(charMap34);
    }

    @Test
    public void test4564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4564");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode12 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.util.Map<java.lang.Character, java.lang.String> charMap13 = escapeMode12.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap14 = escapeMode12.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap15 = escapeMode12.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap16 = escapeMode12.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap17 = escapeMode12.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap18 = escapeMode12.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap19 = escapeMode12.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap20 = escapeMode12.getMap();
        java.lang.String str21 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode12);
        java.lang.String str22 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode12);
        java.util.Map<java.lang.Character, java.lang.String> charMap23 = escapeMode12.getMap();
        java.lang.String str24 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode12);
        java.util.Map<java.lang.Character, java.lang.String> charMap25 = escapeMode12.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap26 = escapeMode12.getMap();
        java.lang.String str27 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode12);
        java.lang.String str28 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode12);
        java.lang.String str29 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode12);
        java.lang.Class<?> wildcardClass30 = escapeMode12.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode12 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode12.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charMap13);
        org.junit.Assert.assertNotNull(charMap14);
        org.junit.Assert.assertNotNull(charMap15);
        org.junit.Assert.assertNotNull(charMap16);
        org.junit.Assert.assertNotNull(charMap17);
        org.junit.Assert.assertNotNull(charMap18);
        org.junit.Assert.assertNotNull(charMap19);
        org.junit.Assert.assertNotNull(charMap20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(charMap23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(charMap25);
        org.junit.Assert.assertNotNull(charMap26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test4565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4565");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode10 = org.jsoup.nodes.Entities.EscapeMode.extended;
        java.util.Map<java.lang.Character, java.lang.String> charMap11 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap12 = escapeMode10.getMap();
        java.lang.String str13 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode10);
        java.lang.String str14 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode10);
        java.util.Map<java.lang.Character, java.lang.String> charMap15 = escapeMode10.getMap();
        java.lang.String str16 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode10);
        java.util.Map<java.lang.Character, java.lang.String> charMap17 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap18 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap19 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap20 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap21 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap22 = escapeMode10.getMap();
        java.lang.String str23 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode10);
        java.util.Map<java.lang.Character, java.lang.String> charMap24 = escapeMode10.getMap();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = org.jsoup.nodes.Entities.escape("hi!", charsetEncoder1, escapeMode10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + escapeMode10 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.extended + "'", escapeMode10.equals(org.jsoup.nodes.Entities.EscapeMode.extended));
        org.junit.Assert.assertNotNull(charMap11);
        org.junit.Assert.assertNotNull(charMap12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(charMap15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(charMap17);
        org.junit.Assert.assertNotNull(charMap18);
        org.junit.Assert.assertNotNull(charMap19);
        org.junit.Assert.assertNotNull(charMap20);
        org.junit.Assert.assertNotNull(charMap21);
        org.junit.Assert.assertNotNull(charMap22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(charMap24);
    }

    @Test
    public void test4566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4566");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode14 = org.jsoup.nodes.Entities.EscapeMode.extended;
        java.lang.String str15 = org.jsoup.nodes.Entities.escape("", charsetEncoder13, escapeMode14);
        java.lang.String str16 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode14);
        java.lang.String str17 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode14);
        java.lang.String str18 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode14);
        java.util.Map<java.lang.Character, java.lang.String> charMap19 = escapeMode14.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap20 = escapeMode14.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap21 = escapeMode14.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap22 = escapeMode14.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap23 = escapeMode14.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap24 = escapeMode14.getMap();
        java.lang.String str25 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode14);
        java.lang.String str26 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode14);
        java.lang.String str27 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode14);
        java.util.Map<java.lang.Character, java.lang.String> charMap28 = escapeMode14.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap29 = escapeMode14.getMap();
        org.junit.Assert.assertTrue("'" + escapeMode14 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.extended + "'", escapeMode14.equals(org.jsoup.nodes.Entities.EscapeMode.extended));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(charMap19);
        org.junit.Assert.assertNotNull(charMap20);
        org.junit.Assert.assertNotNull(charMap21);
        org.junit.Assert.assertNotNull(charMap22);
        org.junit.Assert.assertNotNull(charMap23);
        org.junit.Assert.assertNotNull(charMap24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(charMap28);
        org.junit.Assert.assertNotNull(charMap29);
    }

    @Test
    public void test4567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4567");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode10 = org.jsoup.nodes.Entities.EscapeMode.extended;
        java.util.Map<java.lang.Character, java.lang.String> charMap11 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap12 = escapeMode10.getMap();
        java.lang.String str13 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode10);
        java.util.Map<java.lang.Character, java.lang.String> charMap14 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap15 = escapeMode10.getMap();
        java.lang.String str16 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode10);
        java.util.Map<java.lang.Character, java.lang.String> charMap17 = escapeMode10.getMap();
        java.lang.String str18 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode10);
        java.lang.String str19 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode10);
        java.util.Map<java.lang.Character, java.lang.String> charMap20 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap21 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap22 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap23 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap24 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap25 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap26 = escapeMode10.getMap();
        java.lang.String str27 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode10);
        org.junit.Assert.assertTrue("'" + escapeMode10 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.extended + "'", escapeMode10.equals(org.jsoup.nodes.Entities.EscapeMode.extended));
        org.junit.Assert.assertNotNull(charMap11);
        org.junit.Assert.assertNotNull(charMap12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(charMap14);
        org.junit.Assert.assertNotNull(charMap15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(charMap17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(charMap20);
        org.junit.Assert.assertNotNull(charMap21);
        org.junit.Assert.assertNotNull(charMap22);
        org.junit.Assert.assertNotNull(charMap23);
        org.junit.Assert.assertNotNull(charMap24);
        org.junit.Assert.assertNotNull(charMap25);
        org.junit.Assert.assertNotNull(charMap26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test4568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4568");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        java.nio.charset.CharsetEncoder charsetEncoder15 = null;
        java.nio.charset.CharsetEncoder charsetEncoder17 = null;
        java.nio.charset.CharsetEncoder charsetEncoder19 = null;
        java.nio.charset.CharsetEncoder charsetEncoder21 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode22 = org.jsoup.nodes.Entities.EscapeMode.extended;
        java.lang.String str23 = org.jsoup.nodes.Entities.escape("", charsetEncoder21, escapeMode22);
        java.util.Map<java.lang.Character, java.lang.String> charMap24 = escapeMode22.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap25 = escapeMode22.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap26 = escapeMode22.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap27 = escapeMode22.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap28 = escapeMode22.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap29 = escapeMode22.getMap();
        java.lang.String str30 = org.jsoup.nodes.Entities.escape("", charsetEncoder19, escapeMode22);
        java.lang.String str31 = org.jsoup.nodes.Entities.escape("", charsetEncoder17, escapeMode22);
        java.lang.String str32 = org.jsoup.nodes.Entities.escape("", charsetEncoder15, escapeMode22);
        java.lang.String str33 = org.jsoup.nodes.Entities.escape("", charsetEncoder13, escapeMode22);
        java.util.Map<java.lang.Character, java.lang.String> charMap34 = escapeMode22.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap35 = escapeMode22.getMap();
        java.lang.String str36 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode22);
        java.util.Map<java.lang.Character, java.lang.String> charMap37 = escapeMode22.getMap();
        java.lang.String str38 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode22);
        java.lang.String str39 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode22);
        java.lang.String str40 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode22);
        java.util.Map<java.lang.Character, java.lang.String> charMap41 = escapeMode22.getMap();
        java.lang.String str42 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode22);
        java.lang.String str43 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode22);
        java.util.Map<java.lang.Character, java.lang.String> charMap44 = escapeMode22.getMap();
        org.junit.Assert.assertTrue("'" + escapeMode22 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.extended + "'", escapeMode22.equals(org.jsoup.nodes.Entities.EscapeMode.extended));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(charMap24);
        org.junit.Assert.assertNotNull(charMap25);
        org.junit.Assert.assertNotNull(charMap26);
        org.junit.Assert.assertNotNull(charMap27);
        org.junit.Assert.assertNotNull(charMap28);
        org.junit.Assert.assertNotNull(charMap29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(charMap34);
        org.junit.Assert.assertNotNull(charMap35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(charMap37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(charMap41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(charMap44);
    }

    @Test
    public void test4569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4569");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        java.nio.charset.CharsetEncoder charsetEncoder15 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode16 = org.jsoup.nodes.Entities.EscapeMode.extended;
        java.util.Map<java.lang.Character, java.lang.String> charMap17 = escapeMode16.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap18 = escapeMode16.getMap();
        java.lang.String str19 = org.jsoup.nodes.Entities.escape("", charsetEncoder15, escapeMode16);
        java.util.Map<java.lang.Character, java.lang.String> charMap20 = escapeMode16.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap21 = escapeMode16.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap22 = escapeMode16.getMap();
        java.lang.String str23 = org.jsoup.nodes.Entities.escape("", charsetEncoder13, escapeMode16);
        java.lang.String str24 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode16);
        java.util.Map<java.lang.Character, java.lang.String> charMap25 = escapeMode16.getMap();
        java.lang.String str26 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode16);
        java.lang.String str27 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode16);
        java.lang.String str28 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode16);
        java.lang.String str29 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode16);
        java.lang.String str30 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode16);
        java.util.Map<java.lang.Character, java.lang.String> charMap31 = escapeMode16.getMap();
        java.lang.Class<?> wildcardClass32 = escapeMode16.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode16 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.extended + "'", escapeMode16.equals(org.jsoup.nodes.Entities.EscapeMode.extended));
        org.junit.Assert.assertNotNull(charMap17);
        org.junit.Assert.assertNotNull(charMap18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(charMap20);
        org.junit.Assert.assertNotNull(charMap21);
        org.junit.Assert.assertNotNull(charMap22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(charMap25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(charMap31);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test4570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4570");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode12 = org.jsoup.nodes.Entities.EscapeMode.xhtml;
        java.lang.String str13 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode12);
        java.util.Map<java.lang.Character, java.lang.String> charMap14 = escapeMode12.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap15 = escapeMode12.getMap();
        java.lang.String str16 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode12);
        java.util.Map<java.lang.Character, java.lang.String> charMap17 = escapeMode12.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap18 = escapeMode12.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap19 = escapeMode12.getMap();
        java.lang.String str20 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode12);
        java.util.Map<java.lang.Character, java.lang.String> charMap21 = escapeMode12.getMap();
        java.lang.String str22 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode12);
        java.lang.String str23 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode12);
        java.util.Map<java.lang.Character, java.lang.String> charMap24 = escapeMode12.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap25 = escapeMode12.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap26 = escapeMode12.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap27 = escapeMode12.getMap();
        java.lang.String str28 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode12);
        org.junit.Assert.assertTrue("'" + escapeMode12 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.xhtml + "'", escapeMode12.equals(org.jsoup.nodes.Entities.EscapeMode.xhtml));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(charMap14);
        org.junit.Assert.assertNotNull(charMap15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(charMap17);
        org.junit.Assert.assertNotNull(charMap18);
        org.junit.Assert.assertNotNull(charMap19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(charMap21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(charMap24);
        org.junit.Assert.assertNotNull(charMap25);
        org.junit.Assert.assertNotNull(charMap26);
        org.junit.Assert.assertNotNull(charMap27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test4571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4571");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode6 = org.jsoup.nodes.Entities.EscapeMode.extended;
        java.util.Map<java.lang.Character, java.lang.String> charMap7 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap8 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap9 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap10 = escapeMode6.getMap();
        java.lang.String str11 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode6);
        java.lang.String str12 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode6);
        java.util.Map<java.lang.Character, java.lang.String> charMap13 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap14 = escapeMode6.getMap();
        java.lang.String str15 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode6);
        java.util.Map<java.lang.Character, java.lang.String> charMap16 = escapeMode6.getMap();
        org.junit.Assert.assertTrue("'" + escapeMode6 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.extended + "'", escapeMode6.equals(org.jsoup.nodes.Entities.EscapeMode.extended));
        org.junit.Assert.assertNotNull(charMap7);
        org.junit.Assert.assertNotNull(charMap8);
        org.junit.Assert.assertNotNull(charMap9);
        org.junit.Assert.assertNotNull(charMap10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(charMap13);
        org.junit.Assert.assertNotNull(charMap14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(charMap16);
    }

    @Test
    public void test4572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4572");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode10 = org.jsoup.nodes.Entities.EscapeMode.extended;
        java.util.Map<java.lang.Character, java.lang.String> charMap11 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap12 = escapeMode10.getMap();
        java.lang.String str13 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode10);
        java.util.Map<java.lang.Character, java.lang.String> charMap14 = escapeMode10.getMap();
        java.lang.String str15 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode10);
        java.lang.String str16 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode10);
        java.lang.String str17 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode10);
        java.util.Map<java.lang.Character, java.lang.String> charMap18 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap19 = escapeMode10.getMap();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = org.jsoup.nodes.Entities.escape("hi!", charsetEncoder1, escapeMode10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + escapeMode10 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.extended + "'", escapeMode10.equals(org.jsoup.nodes.Entities.EscapeMode.extended));
        org.junit.Assert.assertNotNull(charMap11);
        org.junit.Assert.assertNotNull(charMap12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(charMap14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(charMap18);
        org.junit.Assert.assertNotNull(charMap19);
    }

    @Test
    public void test4573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4573");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode12 = org.jsoup.nodes.Entities.EscapeMode.extended;
        java.util.Map<java.lang.Character, java.lang.String> charMap13 = escapeMode12.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap14 = escapeMode12.getMap();
        java.lang.String str15 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode12);
        java.util.Map<java.lang.Character, java.lang.String> charMap16 = escapeMode12.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap17 = escapeMode12.getMap();
        java.lang.String str18 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode12);
        java.util.Map<java.lang.Character, java.lang.String> charMap19 = escapeMode12.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap20 = escapeMode12.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap21 = escapeMode12.getMap();
        java.lang.String str22 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode12);
        java.util.Map<java.lang.Character, java.lang.String> charMap23 = escapeMode12.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap24 = escapeMode12.getMap();
        java.lang.String str25 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode12);
        java.lang.String str26 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode12);
        java.lang.String str27 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode12);
        java.util.Map<java.lang.Character, java.lang.String> charMap28 = escapeMode12.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap29 = escapeMode12.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap30 = escapeMode12.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap31 = escapeMode12.getMap();
        org.junit.Assert.assertTrue("'" + escapeMode12 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.extended + "'", escapeMode12.equals(org.jsoup.nodes.Entities.EscapeMode.extended));
        org.junit.Assert.assertNotNull(charMap13);
        org.junit.Assert.assertNotNull(charMap14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(charMap16);
        org.junit.Assert.assertNotNull(charMap17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(charMap19);
        org.junit.Assert.assertNotNull(charMap20);
        org.junit.Assert.assertNotNull(charMap21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(charMap23);
        org.junit.Assert.assertNotNull(charMap24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(charMap28);
        org.junit.Assert.assertNotNull(charMap29);
        org.junit.Assert.assertNotNull(charMap30);
        org.junit.Assert.assertNotNull(charMap31);
    }

    @Test
    public void test4574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4574");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode4 = org.jsoup.nodes.Entities.EscapeMode.xhtml;
        java.lang.String str5 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode4);
        java.util.Map<java.lang.Character, java.lang.String> charMap6 = escapeMode4.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap7 = escapeMode4.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap8 = escapeMode4.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap9 = escapeMode4.getMap();
        java.lang.String str10 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode4);
        java.util.Map<java.lang.Character, java.lang.String> charMap11 = escapeMode4.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap12 = escapeMode4.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap13 = escapeMode4.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap14 = escapeMode4.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap15 = escapeMode4.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap16 = escapeMode4.getMap();
        java.lang.Class<?> wildcardClass17 = escapeMode4.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode4 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.xhtml + "'", escapeMode4.equals(org.jsoup.nodes.Entities.EscapeMode.xhtml));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(charMap6);
        org.junit.Assert.assertNotNull(charMap7);
        org.junit.Assert.assertNotNull(charMap8);
        org.junit.Assert.assertNotNull(charMap9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(charMap11);
        org.junit.Assert.assertNotNull(charMap12);
        org.junit.Assert.assertNotNull(charMap13);
        org.junit.Assert.assertNotNull(charMap14);
        org.junit.Assert.assertNotNull(charMap15);
        org.junit.Assert.assertNotNull(charMap16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4575");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode8 = org.jsoup.nodes.Entities.EscapeMode.extended;
        java.util.Map<java.lang.Character, java.lang.String> charMap9 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap10 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap11 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap12 = escapeMode8.getMap();
        java.lang.String str13 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode8);
        java.util.Map<java.lang.Character, java.lang.String> charMap14 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap15 = escapeMode8.getMap();
        java.lang.String str16 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode8);
        java.util.Map<java.lang.Character, java.lang.String> charMap17 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap18 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap19 = escapeMode8.getMap();
        java.lang.String str20 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode8);
        java.lang.String str21 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode8);
        java.lang.Class<?> wildcardClass22 = escapeMode8.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode8 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.extended + "'", escapeMode8.equals(org.jsoup.nodes.Entities.EscapeMode.extended));
        org.junit.Assert.assertNotNull(charMap9);
        org.junit.Assert.assertNotNull(charMap10);
        org.junit.Assert.assertNotNull(charMap11);
        org.junit.Assert.assertNotNull(charMap12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(charMap14);
        org.junit.Assert.assertNotNull(charMap15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(charMap17);
        org.junit.Assert.assertNotNull(charMap18);
        org.junit.Assert.assertNotNull(charMap19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4576");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode6 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.util.Map<java.lang.Character, java.lang.String> charMap7 = escapeMode6.getMap();
        java.lang.String str8 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode6);
        java.lang.String str9 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode6);
        java.util.Map<java.lang.Character, java.lang.String> charMap10 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap11 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap12 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap13 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap14 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap15 = escapeMode6.getMap();
        java.lang.String str16 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode6);
        org.junit.Assert.assertTrue("'" + escapeMode6 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode6.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charMap7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(charMap10);
        org.junit.Assert.assertNotNull(charMap11);
        org.junit.Assert.assertNotNull(charMap12);
        org.junit.Assert.assertNotNull(charMap13);
        org.junit.Assert.assertNotNull(charMap14);
        org.junit.Assert.assertNotNull(charMap15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test4577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4577");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        java.nio.charset.CharsetEncoder charsetEncoder15 = null;
        java.nio.charset.CharsetEncoder charsetEncoder17 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode18 = org.jsoup.nodes.Entities.EscapeMode.extended;
        java.lang.String str19 = org.jsoup.nodes.Entities.escape("", charsetEncoder17, escapeMode18);
        java.util.Map<java.lang.Character, java.lang.String> charMap20 = escapeMode18.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap21 = escapeMode18.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap22 = escapeMode18.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap23 = escapeMode18.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap24 = escapeMode18.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap25 = escapeMode18.getMap();
        java.lang.String str26 = org.jsoup.nodes.Entities.escape("", charsetEncoder15, escapeMode18);
        java.lang.String str27 = org.jsoup.nodes.Entities.escape("", charsetEncoder13, escapeMode18);
        java.lang.String str28 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode18);
        java.lang.String str29 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode18);
        java.util.Map<java.lang.Character, java.lang.String> charMap30 = escapeMode18.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap31 = escapeMode18.getMap();
        java.lang.String str32 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode18);
        java.util.Map<java.lang.Character, java.lang.String> charMap33 = escapeMode18.getMap();
        java.lang.String str34 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode18);
        java.lang.String str35 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode18);
        java.lang.String str36 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode18);
        java.util.Map<java.lang.Character, java.lang.String> charMap37 = escapeMode18.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap38 = escapeMode18.getMap();
        java.lang.Class<?> wildcardClass39 = charMap38.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode18 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.extended + "'", escapeMode18.equals(org.jsoup.nodes.Entities.EscapeMode.extended));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(charMap20);
        org.junit.Assert.assertNotNull(charMap21);
        org.junit.Assert.assertNotNull(charMap22);
        org.junit.Assert.assertNotNull(charMap23);
        org.junit.Assert.assertNotNull(charMap24);
        org.junit.Assert.assertNotNull(charMap25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(charMap30);
        org.junit.Assert.assertNotNull(charMap31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(charMap33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(charMap37);
        org.junit.Assert.assertNotNull(charMap38);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test4578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4578");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode4 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.util.Map<java.lang.Character, java.lang.String> charMap5 = escapeMode4.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap6 = escapeMode4.getMap();
        java.lang.String str7 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode4);
        java.util.Map<java.lang.Character, java.lang.String> charMap8 = escapeMode4.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap9 = escapeMode4.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap10 = escapeMode4.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap11 = escapeMode4.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap12 = escapeMode4.getMap();
        java.lang.String str13 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode4);
        java.util.Map<java.lang.Character, java.lang.String> charMap14 = escapeMode4.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap15 = escapeMode4.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap16 = escapeMode4.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap17 = escapeMode4.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap18 = escapeMode4.getMap();
        org.junit.Assert.assertTrue("'" + escapeMode4 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode4.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charMap5);
        org.junit.Assert.assertNotNull(charMap6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(charMap8);
        org.junit.Assert.assertNotNull(charMap9);
        org.junit.Assert.assertNotNull(charMap10);
        org.junit.Assert.assertNotNull(charMap11);
        org.junit.Assert.assertNotNull(charMap12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(charMap14);
        org.junit.Assert.assertNotNull(charMap15);
        org.junit.Assert.assertNotNull(charMap16);
        org.junit.Assert.assertNotNull(charMap17);
        org.junit.Assert.assertNotNull(charMap18);
    }

    @Test
    public void test4579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4579");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode14 = org.jsoup.nodes.Entities.EscapeMode.extended;
        java.lang.String str15 = org.jsoup.nodes.Entities.escape("", charsetEncoder13, escapeMode14);
        java.util.Map<java.lang.Character, java.lang.String> charMap16 = escapeMode14.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap17 = escapeMode14.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap18 = escapeMode14.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap19 = escapeMode14.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap20 = escapeMode14.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap21 = escapeMode14.getMap();
        java.lang.String str22 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode14);
        java.lang.String str23 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode14);
        java.lang.String str24 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode14);
        java.lang.String str25 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode14);
        java.util.Map<java.lang.Character, java.lang.String> charMap26 = escapeMode14.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap27 = escapeMode14.getMap();
        java.lang.String str28 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode14);
        java.util.Map<java.lang.Character, java.lang.String> charMap29 = escapeMode14.getMap();
        java.lang.String str30 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode14);
        java.util.Map<java.lang.Character, java.lang.String> charMap31 = escapeMode14.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap32 = escapeMode14.getMap();
        java.lang.Class<?> wildcardClass33 = escapeMode14.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode14 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.extended + "'", escapeMode14.equals(org.jsoup.nodes.Entities.EscapeMode.extended));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(charMap16);
        org.junit.Assert.assertNotNull(charMap17);
        org.junit.Assert.assertNotNull(charMap18);
        org.junit.Assert.assertNotNull(charMap19);
        org.junit.Assert.assertNotNull(charMap20);
        org.junit.Assert.assertNotNull(charMap21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(charMap26);
        org.junit.Assert.assertNotNull(charMap27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(charMap29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(charMap31);
        org.junit.Assert.assertNotNull(charMap32);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test4580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4580");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        java.nio.charset.CharsetEncoder charsetEncoder15 = null;
        java.nio.charset.CharsetEncoder charsetEncoder17 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode18 = org.jsoup.nodes.Entities.EscapeMode.xhtml;
        java.lang.String str19 = org.jsoup.nodes.Entities.escape("", charsetEncoder17, escapeMode18);
        java.util.Map<java.lang.Character, java.lang.String> charMap20 = escapeMode18.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap21 = escapeMode18.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap22 = escapeMode18.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap23 = escapeMode18.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap24 = escapeMode18.getMap();
        java.lang.String str25 = org.jsoup.nodes.Entities.escape("", charsetEncoder15, escapeMode18);
        java.lang.String str26 = org.jsoup.nodes.Entities.escape("", charsetEncoder13, escapeMode18);
        java.util.Map<java.lang.Character, java.lang.String> charMap27 = escapeMode18.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap28 = escapeMode18.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap29 = escapeMode18.getMap();
        java.lang.String str30 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode18);
        java.lang.String str31 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode18);
        java.lang.String str32 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode18);
        java.lang.String str33 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode18);
        java.util.Map<java.lang.Character, java.lang.String> charMap34 = escapeMode18.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap35 = escapeMode18.getMap();
        java.lang.String str36 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode18);
        java.lang.String str37 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode18);
        java.util.Map<java.lang.Character, java.lang.String> charMap38 = escapeMode18.getMap();
        org.junit.Assert.assertTrue("'" + escapeMode18 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.xhtml + "'", escapeMode18.equals(org.jsoup.nodes.Entities.EscapeMode.xhtml));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(charMap20);
        org.junit.Assert.assertNotNull(charMap21);
        org.junit.Assert.assertNotNull(charMap22);
        org.junit.Assert.assertNotNull(charMap23);
        org.junit.Assert.assertNotNull(charMap24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(charMap27);
        org.junit.Assert.assertNotNull(charMap28);
        org.junit.Assert.assertNotNull(charMap29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(charMap34);
        org.junit.Assert.assertNotNull(charMap35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(charMap38);
    }

    @Test
    public void test4581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4581");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode6 = org.jsoup.nodes.Entities.EscapeMode.extended;
        java.lang.String str7 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode6);
        java.util.Map<java.lang.Character, java.lang.String> charMap8 = escapeMode6.getMap();
        java.lang.String str9 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode6);
        java.util.Map<java.lang.Character, java.lang.String> charMap10 = escapeMode6.getMap();
        java.lang.String str11 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode6);
        java.lang.Class<?> wildcardClass12 = escapeMode6.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode6 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.extended + "'", escapeMode6.equals(org.jsoup.nodes.Entities.EscapeMode.extended));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(charMap8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(charMap10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4582");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode10 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.util.Map<java.lang.Character, java.lang.String> charMap11 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap12 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap13 = escapeMode10.getMap();
        java.lang.String str14 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode10);
        java.lang.String str15 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode10);
        java.lang.String str16 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode10);
        java.lang.String str17 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode10);
        java.util.Map<java.lang.Character, java.lang.String> charMap18 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap19 = escapeMode10.getMap();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = org.jsoup.nodes.Entities.escape("hi!", charsetEncoder1, escapeMode10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + escapeMode10 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode10.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charMap11);
        org.junit.Assert.assertNotNull(charMap12);
        org.junit.Assert.assertNotNull(charMap13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(charMap18);
        org.junit.Assert.assertNotNull(charMap19);
    }

    @Test
    public void test4583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4583");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode4 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.util.Map<java.lang.Character, java.lang.String> charMap5 = escapeMode4.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap6 = escapeMode4.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap7 = escapeMode4.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap8 = escapeMode4.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap9 = escapeMode4.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap10 = escapeMode4.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap11 = escapeMode4.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap12 = escapeMode4.getMap();
        java.lang.String str13 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode4);
        java.util.Map<java.lang.Character, java.lang.String> charMap14 = escapeMode4.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap15 = escapeMode4.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap16 = escapeMode4.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap17 = escapeMode4.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap18 = escapeMode4.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap19 = escapeMode4.getMap();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = org.jsoup.nodes.Entities.escape("hi!", charsetEncoder1, escapeMode4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + escapeMode4 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode4.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charMap5);
        org.junit.Assert.assertNotNull(charMap6);
        org.junit.Assert.assertNotNull(charMap7);
        org.junit.Assert.assertNotNull(charMap8);
        org.junit.Assert.assertNotNull(charMap9);
        org.junit.Assert.assertNotNull(charMap10);
        org.junit.Assert.assertNotNull(charMap11);
        org.junit.Assert.assertNotNull(charMap12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(charMap14);
        org.junit.Assert.assertNotNull(charMap15);
        org.junit.Assert.assertNotNull(charMap16);
        org.junit.Assert.assertNotNull(charMap17);
        org.junit.Assert.assertNotNull(charMap18);
        org.junit.Assert.assertNotNull(charMap19);
    }

    @Test
    public void test4584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4584");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode6 = org.jsoup.nodes.Entities.EscapeMode.extended;
        java.util.Map<java.lang.Character, java.lang.String> charMap7 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap8 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap9 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap10 = escapeMode6.getMap();
        java.lang.String str11 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode6);
        java.util.Map<java.lang.Character, java.lang.String> charMap12 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap13 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap14 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap15 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap16 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap17 = escapeMode6.getMap();
        java.lang.String str18 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode6);
        java.util.Map<java.lang.Character, java.lang.String> charMap19 = escapeMode6.getMap();
        java.lang.String str20 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode6);
        java.lang.Class<?> wildcardClass21 = escapeMode6.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode6 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.extended + "'", escapeMode6.equals(org.jsoup.nodes.Entities.EscapeMode.extended));
        org.junit.Assert.assertNotNull(charMap7);
        org.junit.Assert.assertNotNull(charMap8);
        org.junit.Assert.assertNotNull(charMap9);
        org.junit.Assert.assertNotNull(charMap10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(charMap12);
        org.junit.Assert.assertNotNull(charMap13);
        org.junit.Assert.assertNotNull(charMap14);
        org.junit.Assert.assertNotNull(charMap15);
        org.junit.Assert.assertNotNull(charMap16);
        org.junit.Assert.assertNotNull(charMap17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(charMap19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test4585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4585");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode6 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.util.Map<java.lang.Character, java.lang.String> charMap7 = escapeMode6.getMap();
        java.lang.String str8 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode6);
        java.lang.String str9 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode6);
        java.util.Map<java.lang.Character, java.lang.String> charMap10 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap11 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap12 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap13 = escapeMode6.getMap();
        java.lang.String str14 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode6);
        java.util.Map<java.lang.Character, java.lang.String> charMap15 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap16 = escapeMode6.getMap();
        java.lang.Class<?> wildcardClass17 = charMap16.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode6 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode6.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charMap7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(charMap10);
        org.junit.Assert.assertNotNull(charMap11);
        org.junit.Assert.assertNotNull(charMap12);
        org.junit.Assert.assertNotNull(charMap13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(charMap15);
        org.junit.Assert.assertNotNull(charMap16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4586");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode8 = org.jsoup.nodes.Entities.EscapeMode.extended;
        java.util.Map<java.lang.Character, java.lang.String> charMap9 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap10 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap11 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap12 = escapeMode8.getMap();
        java.lang.String str13 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode8);
        java.util.Map<java.lang.Character, java.lang.String> charMap14 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap15 = escapeMode8.getMap();
        java.lang.String str16 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode8);
        java.util.Map<java.lang.Character, java.lang.String> charMap17 = escapeMode8.getMap();
        java.lang.String str18 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode8);
        java.lang.String str19 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode8);
        java.util.Map<java.lang.Character, java.lang.String> charMap20 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap21 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap22 = escapeMode8.getMap();
        java.lang.Class<?> wildcardClass23 = escapeMode8.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode8 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.extended + "'", escapeMode8.equals(org.jsoup.nodes.Entities.EscapeMode.extended));
        org.junit.Assert.assertNotNull(charMap9);
        org.junit.Assert.assertNotNull(charMap10);
        org.junit.Assert.assertNotNull(charMap11);
        org.junit.Assert.assertNotNull(charMap12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(charMap14);
        org.junit.Assert.assertNotNull(charMap15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(charMap17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(charMap20);
        org.junit.Assert.assertNotNull(charMap21);
        org.junit.Assert.assertNotNull(charMap22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test4587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4587");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode4 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.util.Map<java.lang.Character, java.lang.String> charMap5 = escapeMode4.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap6 = escapeMode4.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap7 = escapeMode4.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap8 = escapeMode4.getMap();
        java.lang.String str9 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode4);
        java.util.Map<java.lang.Character, java.lang.String> charMap10 = escapeMode4.getMap();
        java.lang.String str11 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode4);
        java.util.Map<java.lang.Character, java.lang.String> charMap12 = escapeMode4.getMap();
        java.lang.Class<?> wildcardClass13 = escapeMode4.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode4 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode4.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charMap5);
        org.junit.Assert.assertNotNull(charMap6);
        org.junit.Assert.assertNotNull(charMap7);
        org.junit.Assert.assertNotNull(charMap8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(charMap10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(charMap12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4588");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode2 = org.jsoup.nodes.Entities.EscapeMode.xhtml;
        java.util.Map<java.lang.Character, java.lang.String> charMap3 = escapeMode2.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap4 = escapeMode2.getMap();
        java.lang.String str5 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode2);
        java.util.Map<java.lang.Character, java.lang.String> charMap6 = escapeMode2.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap7 = escapeMode2.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap8 = escapeMode2.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap9 = escapeMode2.getMap();
        java.lang.Class<?> wildcardClass10 = charMap9.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode2 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.xhtml + "'", escapeMode2.equals(org.jsoup.nodes.Entities.EscapeMode.xhtml));
        org.junit.Assert.assertNotNull(charMap3);
        org.junit.Assert.assertNotNull(charMap4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(charMap6);
        org.junit.Assert.assertNotNull(charMap7);
        org.junit.Assert.assertNotNull(charMap8);
        org.junit.Assert.assertNotNull(charMap9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4589");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode10 = org.jsoup.nodes.Entities.EscapeMode.extended;
        java.lang.String str11 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode10);
        java.util.Map<java.lang.Character, java.lang.String> charMap12 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap13 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap14 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap15 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap16 = escapeMode10.getMap();
        java.lang.String str17 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode10);
        java.util.Map<java.lang.Character, java.lang.String> charMap18 = escapeMode10.getMap();
        java.lang.String str19 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode10);
        java.util.Map<java.lang.Character, java.lang.String> charMap20 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap21 = escapeMode10.getMap();
        java.lang.String str22 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode10);
        java.util.Map<java.lang.Character, java.lang.String> charMap23 = escapeMode10.getMap();
        java.lang.String str24 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode10);
        java.util.Map<java.lang.Character, java.lang.String> charMap25 = escapeMode10.getMap();
        java.lang.Class<?> wildcardClass26 = escapeMode10.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode10 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.extended + "'", escapeMode10.equals(org.jsoup.nodes.Entities.EscapeMode.extended));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(charMap12);
        org.junit.Assert.assertNotNull(charMap13);
        org.junit.Assert.assertNotNull(charMap14);
        org.junit.Assert.assertNotNull(charMap15);
        org.junit.Assert.assertNotNull(charMap16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(charMap18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(charMap20);
        org.junit.Assert.assertNotNull(charMap21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(charMap23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(charMap25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test4590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4590");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode12 = org.jsoup.nodes.Entities.EscapeMode.xhtml;
        java.lang.String str13 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode12);
        java.util.Map<java.lang.Character, java.lang.String> charMap14 = escapeMode12.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap15 = escapeMode12.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap16 = escapeMode12.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap17 = escapeMode12.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap18 = escapeMode12.getMap();
        java.lang.String str19 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode12);
        java.lang.String str20 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode12);
        java.util.Map<java.lang.Character, java.lang.String> charMap21 = escapeMode12.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap22 = escapeMode12.getMap();
        java.lang.String str23 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode12);
        java.util.Map<java.lang.Character, java.lang.String> charMap24 = escapeMode12.getMap();
        java.lang.String str25 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode12);
        java.lang.String str26 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode12);
        org.junit.Assert.assertTrue("'" + escapeMode12 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.xhtml + "'", escapeMode12.equals(org.jsoup.nodes.Entities.EscapeMode.xhtml));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(charMap14);
        org.junit.Assert.assertNotNull(charMap15);
        org.junit.Assert.assertNotNull(charMap16);
        org.junit.Assert.assertNotNull(charMap17);
        org.junit.Assert.assertNotNull(charMap18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(charMap21);
        org.junit.Assert.assertNotNull(charMap22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(charMap24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test4591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4591");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        java.nio.charset.CharsetEncoder charsetEncoder15 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode16 = org.jsoup.nodes.Entities.EscapeMode.extended;
        java.util.Map<java.lang.Character, java.lang.String> charMap17 = escapeMode16.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap18 = escapeMode16.getMap();
        java.lang.String str19 = org.jsoup.nodes.Entities.escape("", charsetEncoder15, escapeMode16);
        java.lang.String str20 = org.jsoup.nodes.Entities.escape("", charsetEncoder13, escapeMode16);
        java.util.Map<java.lang.Character, java.lang.String> charMap21 = escapeMode16.getMap();
        java.lang.String str22 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode16);
        java.util.Map<java.lang.Character, java.lang.String> charMap23 = escapeMode16.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap24 = escapeMode16.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap25 = escapeMode16.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap26 = escapeMode16.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap27 = escapeMode16.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap28 = escapeMode16.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap29 = escapeMode16.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap30 = escapeMode16.getMap();
        java.lang.String str31 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode16);
        java.lang.String str32 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode16);
        java.util.Map<java.lang.Character, java.lang.String> charMap33 = escapeMode16.getMap();
        java.lang.String str34 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode16);
        java.lang.String str35 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str36 = org.jsoup.nodes.Entities.escape("hi!", charsetEncoder1, escapeMode16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + escapeMode16 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.extended + "'", escapeMode16.equals(org.jsoup.nodes.Entities.EscapeMode.extended));
        org.junit.Assert.assertNotNull(charMap17);
        org.junit.Assert.assertNotNull(charMap18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(charMap21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(charMap23);
        org.junit.Assert.assertNotNull(charMap24);
        org.junit.Assert.assertNotNull(charMap25);
        org.junit.Assert.assertNotNull(charMap26);
        org.junit.Assert.assertNotNull(charMap27);
        org.junit.Assert.assertNotNull(charMap28);
        org.junit.Assert.assertNotNull(charMap29);
        org.junit.Assert.assertNotNull(charMap30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(charMap33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
    }

    @Test
    public void test4592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4592");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode4 = org.jsoup.nodes.Entities.EscapeMode.xhtml;
        java.lang.String str5 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode4);
        java.util.Map<java.lang.Character, java.lang.String> charMap6 = escapeMode4.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap7 = escapeMode4.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap8 = escapeMode4.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap9 = escapeMode4.getMap();
        java.lang.String str10 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode4);
        java.util.Map<java.lang.Character, java.lang.String> charMap11 = escapeMode4.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap12 = escapeMode4.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap13 = escapeMode4.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap14 = escapeMode4.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap15 = escapeMode4.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap16 = escapeMode4.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap17 = escapeMode4.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap18 = escapeMode4.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap19 = escapeMode4.getMap();
        org.junit.Assert.assertTrue("'" + escapeMode4 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.xhtml + "'", escapeMode4.equals(org.jsoup.nodes.Entities.EscapeMode.xhtml));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(charMap6);
        org.junit.Assert.assertNotNull(charMap7);
        org.junit.Assert.assertNotNull(charMap8);
        org.junit.Assert.assertNotNull(charMap9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(charMap11);
        org.junit.Assert.assertNotNull(charMap12);
        org.junit.Assert.assertNotNull(charMap13);
        org.junit.Assert.assertNotNull(charMap14);
        org.junit.Assert.assertNotNull(charMap15);
        org.junit.Assert.assertNotNull(charMap16);
        org.junit.Assert.assertNotNull(charMap17);
        org.junit.Assert.assertNotNull(charMap18);
        org.junit.Assert.assertNotNull(charMap19);
    }

    @Test
    public void test4593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4593");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode4 = org.jsoup.nodes.Entities.EscapeMode.extended;
        java.util.Map<java.lang.Character, java.lang.String> charMap5 = escapeMode4.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap6 = escapeMode4.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap7 = escapeMode4.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap8 = escapeMode4.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap9 = escapeMode4.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap10 = escapeMode4.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap11 = escapeMode4.getMap();
        java.lang.String str12 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode4);
        java.lang.String str13 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode4);
        java.util.Map<java.lang.Character, java.lang.String> charMap14 = escapeMode4.getMap();
        java.lang.Class<?> wildcardClass15 = charMap14.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode4 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.extended + "'", escapeMode4.equals(org.jsoup.nodes.Entities.EscapeMode.extended));
        org.junit.Assert.assertNotNull(charMap5);
        org.junit.Assert.assertNotNull(charMap6);
        org.junit.Assert.assertNotNull(charMap7);
        org.junit.Assert.assertNotNull(charMap8);
        org.junit.Assert.assertNotNull(charMap9);
        org.junit.Assert.assertNotNull(charMap10);
        org.junit.Assert.assertNotNull(charMap11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(charMap14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4594");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode6 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.util.Map<java.lang.Character, java.lang.String> charMap7 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap8 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap9 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap10 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap11 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap12 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap13 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap14 = escapeMode6.getMap();
        java.lang.String str15 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode6);
        java.util.Map<java.lang.Character, java.lang.String> charMap16 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap17 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap18 = escapeMode6.getMap();
        java.lang.String str19 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode6);
        java.lang.String str20 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode6);
        java.util.Map<java.lang.Character, java.lang.String> charMap21 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap22 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap23 = escapeMode6.getMap();
        org.junit.Assert.assertTrue("'" + escapeMode6 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode6.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charMap7);
        org.junit.Assert.assertNotNull(charMap8);
        org.junit.Assert.assertNotNull(charMap9);
        org.junit.Assert.assertNotNull(charMap10);
        org.junit.Assert.assertNotNull(charMap11);
        org.junit.Assert.assertNotNull(charMap12);
        org.junit.Assert.assertNotNull(charMap13);
        org.junit.Assert.assertNotNull(charMap14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(charMap16);
        org.junit.Assert.assertNotNull(charMap17);
        org.junit.Assert.assertNotNull(charMap18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(charMap21);
        org.junit.Assert.assertNotNull(charMap22);
        org.junit.Assert.assertNotNull(charMap23);
    }

    @Test
    public void test4595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4595");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode6 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.util.Map<java.lang.Character, java.lang.String> charMap7 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap8 = escapeMode6.getMap();
        java.lang.String str9 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode6);
        java.util.Map<java.lang.Character, java.lang.String> charMap10 = escapeMode6.getMap();
        java.lang.String str11 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode6);
        java.util.Map<java.lang.Character, java.lang.String> charMap12 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap13 = escapeMode6.getMap();
        java.lang.String str14 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode6);
        java.util.Map<java.lang.Character, java.lang.String> charMap15 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap16 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap17 = escapeMode6.getMap();
        java.lang.Class<?> wildcardClass18 = charMap17.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode6 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode6.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charMap7);
        org.junit.Assert.assertNotNull(charMap8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(charMap10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(charMap12);
        org.junit.Assert.assertNotNull(charMap13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(charMap15);
        org.junit.Assert.assertNotNull(charMap16);
        org.junit.Assert.assertNotNull(charMap17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4596");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode8 = org.jsoup.nodes.Entities.EscapeMode.extended;
        java.util.Map<java.lang.Character, java.lang.String> charMap9 = escapeMode8.getMap();
        java.lang.String str10 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode8);
        java.util.Map<java.lang.Character, java.lang.String> charMap11 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap12 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap13 = escapeMode8.getMap();
        java.lang.String str14 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode8);
        java.lang.String str15 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode8);
        java.util.Map<java.lang.Character, java.lang.String> charMap16 = escapeMode8.getMap();
        java.lang.String str17 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode8);
        java.util.Map<java.lang.Character, java.lang.String> charMap18 = escapeMode8.getMap();
        java.lang.Class<?> wildcardClass19 = escapeMode8.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode8 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.extended + "'", escapeMode8.equals(org.jsoup.nodes.Entities.EscapeMode.extended));
        org.junit.Assert.assertNotNull(charMap9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(charMap11);
        org.junit.Assert.assertNotNull(charMap12);
        org.junit.Assert.assertNotNull(charMap13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(charMap16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(charMap18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4597");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode8 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.util.Map<java.lang.Character, java.lang.String> charMap9 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap10 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap11 = escapeMode8.getMap();
        java.lang.String str12 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode8);
        java.util.Map<java.lang.Character, java.lang.String> charMap13 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap14 = escapeMode8.getMap();
        java.lang.String str15 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode8);
        java.lang.String str16 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode8);
        java.util.Map<java.lang.Character, java.lang.String> charMap17 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap18 = escapeMode8.getMap();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = org.jsoup.nodes.Entities.escape("hi!", charsetEncoder1, escapeMode8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + escapeMode8 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode8.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charMap9);
        org.junit.Assert.assertNotNull(charMap10);
        org.junit.Assert.assertNotNull(charMap11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(charMap13);
        org.junit.Assert.assertNotNull(charMap14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(charMap17);
        org.junit.Assert.assertNotNull(charMap18);
    }

    @Test
    public void test4598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4598");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode6 = org.jsoup.nodes.Entities.EscapeMode.extended;
        java.util.Map<java.lang.Character, java.lang.String> charMap7 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap8 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap9 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap10 = escapeMode6.getMap();
        java.lang.String str11 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode6);
        java.lang.String str12 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode6);
        java.util.Map<java.lang.Character, java.lang.String> charMap13 = escapeMode6.getMap();
        java.lang.String str14 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode6);
        java.util.Map<java.lang.Character, java.lang.String> charMap15 = escapeMode6.getMap();
        java.lang.Class<?> wildcardClass16 = charMap15.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode6 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.extended + "'", escapeMode6.equals(org.jsoup.nodes.Entities.EscapeMode.extended));
        org.junit.Assert.assertNotNull(charMap7);
        org.junit.Assert.assertNotNull(charMap8);
        org.junit.Assert.assertNotNull(charMap9);
        org.junit.Assert.assertNotNull(charMap10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(charMap13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(charMap15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4599");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode12 = org.jsoup.nodes.Entities.EscapeMode.extended;
        java.lang.String str13 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode12);
        java.util.Map<java.lang.Character, java.lang.String> charMap14 = escapeMode12.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap15 = escapeMode12.getMap();
        java.lang.String str16 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode12);
        java.lang.String str17 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode12);
        java.lang.String str18 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode12);
        java.util.Map<java.lang.Character, java.lang.String> charMap19 = escapeMode12.getMap();
        java.lang.String str20 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode12);
        java.util.Map<java.lang.Character, java.lang.String> charMap21 = escapeMode12.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap22 = escapeMode12.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap23 = escapeMode12.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap24 = escapeMode12.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap25 = escapeMode12.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap26 = escapeMode12.getMap();
        java.lang.String str27 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode12);
        java.lang.Class<?> wildcardClass28 = escapeMode12.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode12 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.extended + "'", escapeMode12.equals(org.jsoup.nodes.Entities.EscapeMode.extended));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(charMap14);
        org.junit.Assert.assertNotNull(charMap15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(charMap19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(charMap21);
        org.junit.Assert.assertNotNull(charMap22);
        org.junit.Assert.assertNotNull(charMap23);
        org.junit.Assert.assertNotNull(charMap24);
        org.junit.Assert.assertNotNull(charMap25);
        org.junit.Assert.assertNotNull(charMap26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test4600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4600");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode12 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.util.Map<java.lang.Character, java.lang.String> charMap13 = escapeMode12.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap14 = escapeMode12.getMap();
        java.lang.String str15 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode12);
        java.util.Map<java.lang.Character, java.lang.String> charMap16 = escapeMode12.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap17 = escapeMode12.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap18 = escapeMode12.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap19 = escapeMode12.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap20 = escapeMode12.getMap();
        java.lang.String str21 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode12);
        java.util.Map<java.lang.Character, java.lang.String> charMap22 = escapeMode12.getMap();
        java.lang.String str23 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode12);
        java.util.Map<java.lang.Character, java.lang.String> charMap24 = escapeMode12.getMap();
        java.lang.String str25 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode12);
        java.util.Map<java.lang.Character, java.lang.String> charMap26 = escapeMode12.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap27 = escapeMode12.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap28 = escapeMode12.getMap();
        java.lang.String str29 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode12);
        java.util.Map<java.lang.Character, java.lang.String> charMap30 = escapeMode12.getMap();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str31 = org.jsoup.nodes.Entities.escape("hi!", charsetEncoder1, escapeMode12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + escapeMode12 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode12.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charMap13);
        org.junit.Assert.assertNotNull(charMap14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(charMap16);
        org.junit.Assert.assertNotNull(charMap17);
        org.junit.Assert.assertNotNull(charMap18);
        org.junit.Assert.assertNotNull(charMap19);
        org.junit.Assert.assertNotNull(charMap20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(charMap22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(charMap24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(charMap26);
        org.junit.Assert.assertNotNull(charMap27);
        org.junit.Assert.assertNotNull(charMap28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(charMap30);
    }

    @Test
    public void test4601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4601");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode12 = org.jsoup.nodes.Entities.EscapeMode.xhtml;
        java.lang.String str13 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode12);
        java.util.Map<java.lang.Character, java.lang.String> charMap14 = escapeMode12.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap15 = escapeMode12.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap16 = escapeMode12.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap17 = escapeMode12.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap18 = escapeMode12.getMap();
        java.lang.String str19 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode12);
        java.lang.String str20 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode12);
        java.util.Map<java.lang.Character, java.lang.String> charMap21 = escapeMode12.getMap();
        java.lang.String str22 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode12);
        java.util.Map<java.lang.Character, java.lang.String> charMap23 = escapeMode12.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap24 = escapeMode12.getMap();
        java.lang.String str25 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode12);
        java.lang.String str26 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode12);
        java.util.Map<java.lang.Character, java.lang.String> charMap27 = escapeMode12.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap28 = escapeMode12.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap29 = escapeMode12.getMap();
        org.junit.Assert.assertTrue("'" + escapeMode12 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.xhtml + "'", escapeMode12.equals(org.jsoup.nodes.Entities.EscapeMode.xhtml));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(charMap14);
        org.junit.Assert.assertNotNull(charMap15);
        org.junit.Assert.assertNotNull(charMap16);
        org.junit.Assert.assertNotNull(charMap17);
        org.junit.Assert.assertNotNull(charMap18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(charMap21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(charMap23);
        org.junit.Assert.assertNotNull(charMap24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(charMap27);
        org.junit.Assert.assertNotNull(charMap28);
        org.junit.Assert.assertNotNull(charMap29);
    }

    @Test
    public void test4602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4602");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode12 = org.jsoup.nodes.Entities.EscapeMode.extended;
        java.util.Map<java.lang.Character, java.lang.String> charMap13 = escapeMode12.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap14 = escapeMode12.getMap();
        java.lang.String str15 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode12);
        java.lang.String str16 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode12);
        java.util.Map<java.lang.Character, java.lang.String> charMap17 = escapeMode12.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap18 = escapeMode12.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap19 = escapeMode12.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap20 = escapeMode12.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap21 = escapeMode12.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap22 = escapeMode12.getMap();
        java.lang.String str23 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode12);
        java.util.Map<java.lang.Character, java.lang.String> charMap24 = escapeMode12.getMap();
        java.lang.String str25 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode12);
        java.lang.String str26 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode12);
        java.util.Map<java.lang.Character, java.lang.String> charMap27 = escapeMode12.getMap();
        java.lang.String str28 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode12);
        org.junit.Assert.assertTrue("'" + escapeMode12 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.extended + "'", escapeMode12.equals(org.jsoup.nodes.Entities.EscapeMode.extended));
        org.junit.Assert.assertNotNull(charMap13);
        org.junit.Assert.assertNotNull(charMap14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(charMap17);
        org.junit.Assert.assertNotNull(charMap18);
        org.junit.Assert.assertNotNull(charMap19);
        org.junit.Assert.assertNotNull(charMap20);
        org.junit.Assert.assertNotNull(charMap21);
        org.junit.Assert.assertNotNull(charMap22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(charMap24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(charMap27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test4603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4603");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode12 = org.jsoup.nodes.Entities.EscapeMode.extended;
        java.util.Map<java.lang.Character, java.lang.String> charMap13 = escapeMode12.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap14 = escapeMode12.getMap();
        java.lang.String str15 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode12);
        java.lang.String str16 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode12);
        java.util.Map<java.lang.Character, java.lang.String> charMap17 = escapeMode12.getMap();
        java.lang.String str18 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode12);
        java.util.Map<java.lang.Character, java.lang.String> charMap19 = escapeMode12.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap20 = escapeMode12.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap21 = escapeMode12.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap22 = escapeMode12.getMap();
        java.lang.String str23 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode12);
        java.lang.String str24 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode12);
        java.util.Map<java.lang.Character, java.lang.String> charMap25 = escapeMode12.getMap();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = org.jsoup.nodes.Entities.escape("hi!", charsetEncoder1, escapeMode12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + escapeMode12 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.extended + "'", escapeMode12.equals(org.jsoup.nodes.Entities.EscapeMode.extended));
        org.junit.Assert.assertNotNull(charMap13);
        org.junit.Assert.assertNotNull(charMap14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(charMap17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(charMap19);
        org.junit.Assert.assertNotNull(charMap20);
        org.junit.Assert.assertNotNull(charMap21);
        org.junit.Assert.assertNotNull(charMap22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(charMap25);
    }

    @Test
    public void test4604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4604");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode14 = org.jsoup.nodes.Entities.EscapeMode.extended;
        java.lang.String str15 = org.jsoup.nodes.Entities.escape("", charsetEncoder13, escapeMode14);
        java.lang.String str16 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode14);
        java.lang.String str17 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode14);
        java.util.Map<java.lang.Character, java.lang.String> charMap18 = escapeMode14.getMap();
        java.lang.String str19 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode14);
        java.lang.String str20 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode14);
        java.util.Map<java.lang.Character, java.lang.String> charMap21 = escapeMode14.getMap();
        java.lang.String str22 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode14);
        java.lang.String str23 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode14);
        java.util.Map<java.lang.Character, java.lang.String> charMap24 = escapeMode14.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap25 = escapeMode14.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap26 = escapeMode14.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap27 = escapeMode14.getMap();
        org.junit.Assert.assertTrue("'" + escapeMode14 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.extended + "'", escapeMode14.equals(org.jsoup.nodes.Entities.EscapeMode.extended));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(charMap18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(charMap21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(charMap24);
        org.junit.Assert.assertNotNull(charMap25);
        org.junit.Assert.assertNotNull(charMap26);
        org.junit.Assert.assertNotNull(charMap27);
    }

    @Test
    public void test4605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4605");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode14 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.util.Map<java.lang.Character, java.lang.String> charMap15 = escapeMode14.getMap();
        java.lang.String str16 = org.jsoup.nodes.Entities.escape("", charsetEncoder13, escapeMode14);
        java.util.Map<java.lang.Character, java.lang.String> charMap17 = escapeMode14.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap18 = escapeMode14.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap19 = escapeMode14.getMap();
        java.lang.String str20 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode14);
        java.util.Map<java.lang.Character, java.lang.String> charMap21 = escapeMode14.getMap();
        java.lang.String str22 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode14);
        java.lang.String str23 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode14);
        java.lang.String str24 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode14);
        java.lang.String str25 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode14);
        java.lang.String str26 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode14);
        java.util.Map<java.lang.Character, java.lang.String> charMap27 = escapeMode14.getMap();
        java.lang.Class<?> wildcardClass28 = escapeMode14.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode14 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode14.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charMap15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(charMap17);
        org.junit.Assert.assertNotNull(charMap18);
        org.junit.Assert.assertNotNull(charMap19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(charMap21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(charMap27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test4606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4606");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode10 = org.jsoup.nodes.Entities.EscapeMode.extended;
        java.lang.String str11 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode10);
        java.lang.String str12 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode10);
        java.lang.String str13 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode10);
        java.util.Map<java.lang.Character, java.lang.String> charMap14 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap15 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap16 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap17 = escapeMode10.getMap();
        java.lang.String str18 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode10);
        java.lang.String str19 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode10);
        org.junit.Assert.assertTrue("'" + escapeMode10 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.extended + "'", escapeMode10.equals(org.jsoup.nodes.Entities.EscapeMode.extended));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(charMap14);
        org.junit.Assert.assertNotNull(charMap15);
        org.junit.Assert.assertNotNull(charMap16);
        org.junit.Assert.assertNotNull(charMap17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test4607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4607");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode10 = org.jsoup.nodes.Entities.EscapeMode.xhtml;
        java.lang.String str11 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode10);
        java.util.Map<java.lang.Character, java.lang.String> charMap12 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap13 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap14 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap15 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap16 = escapeMode10.getMap();
        java.lang.String str17 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode10);
        java.util.Map<java.lang.Character, java.lang.String> charMap18 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap19 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap20 = escapeMode10.getMap();
        java.lang.String str21 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode10);
        java.util.Map<java.lang.Character, java.lang.String> charMap22 = escapeMode10.getMap();
        java.lang.String str23 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode10);
        java.lang.String str24 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode10);
        java.lang.Class<?> wildcardClass25 = escapeMode10.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode10 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.xhtml + "'", escapeMode10.equals(org.jsoup.nodes.Entities.EscapeMode.xhtml));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(charMap12);
        org.junit.Assert.assertNotNull(charMap13);
        org.junit.Assert.assertNotNull(charMap14);
        org.junit.Assert.assertNotNull(charMap15);
        org.junit.Assert.assertNotNull(charMap16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(charMap18);
        org.junit.Assert.assertNotNull(charMap19);
        org.junit.Assert.assertNotNull(charMap20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(charMap22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test4608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4608");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode10 = org.jsoup.nodes.Entities.EscapeMode.xhtml;
        java.lang.String str11 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode10);
        java.util.Map<java.lang.Character, java.lang.String> charMap12 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap13 = escapeMode10.getMap();
        java.lang.String str14 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode10);
        java.util.Map<java.lang.Character, java.lang.String> charMap15 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap16 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap17 = escapeMode10.getMap();
        java.lang.String str18 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode10);
        java.util.Map<java.lang.Character, java.lang.String> charMap19 = escapeMode10.getMap();
        java.lang.String str20 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode10);
        java.util.Map<java.lang.Character, java.lang.String> charMap21 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap22 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap23 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap24 = escapeMode10.getMap();
        java.lang.String str25 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode10);
        java.util.Map<java.lang.Character, java.lang.String> charMap26 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap27 = escapeMode10.getMap();
        org.junit.Assert.assertTrue("'" + escapeMode10 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.xhtml + "'", escapeMode10.equals(org.jsoup.nodes.Entities.EscapeMode.xhtml));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(charMap12);
        org.junit.Assert.assertNotNull(charMap13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(charMap15);
        org.junit.Assert.assertNotNull(charMap16);
        org.junit.Assert.assertNotNull(charMap17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(charMap19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(charMap21);
        org.junit.Assert.assertNotNull(charMap22);
        org.junit.Assert.assertNotNull(charMap23);
        org.junit.Assert.assertNotNull(charMap24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(charMap26);
        org.junit.Assert.assertNotNull(charMap27);
    }

    @Test
    public void test4609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4609");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode14 = org.jsoup.nodes.Entities.EscapeMode.extended;
        java.util.Map<java.lang.Character, java.lang.String> charMap15 = escapeMode14.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap16 = escapeMode14.getMap();
        java.lang.String str17 = org.jsoup.nodes.Entities.escape("", charsetEncoder13, escapeMode14);
        java.util.Map<java.lang.Character, java.lang.String> charMap18 = escapeMode14.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap19 = escapeMode14.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap20 = escapeMode14.getMap();
        java.lang.String str21 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode14);
        java.lang.String str22 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode14);
        java.lang.String str23 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode14);
        java.util.Map<java.lang.Character, java.lang.String> charMap24 = escapeMode14.getMap();
        java.lang.String str25 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode14);
        java.lang.String str26 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode14);
        java.util.Map<java.lang.Character, java.lang.String> charMap27 = escapeMode14.getMap();
        java.lang.String str28 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode14);
        java.util.Map<java.lang.Character, java.lang.String> charMap29 = escapeMode14.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap30 = escapeMode14.getMap();
        org.junit.Assert.assertTrue("'" + escapeMode14 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.extended + "'", escapeMode14.equals(org.jsoup.nodes.Entities.EscapeMode.extended));
        org.junit.Assert.assertNotNull(charMap15);
        org.junit.Assert.assertNotNull(charMap16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(charMap18);
        org.junit.Assert.assertNotNull(charMap19);
        org.junit.Assert.assertNotNull(charMap20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(charMap24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(charMap27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(charMap29);
        org.junit.Assert.assertNotNull(charMap30);
    }

    @Test
    public void test4610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4610");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode14 = org.jsoup.nodes.Entities.EscapeMode.extended;
        java.util.Map<java.lang.Character, java.lang.String> charMap15 = escapeMode14.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap16 = escapeMode14.getMap();
        java.lang.String str17 = org.jsoup.nodes.Entities.escape("", charsetEncoder13, escapeMode14);
        java.util.Map<java.lang.Character, java.lang.String> charMap18 = escapeMode14.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap19 = escapeMode14.getMap();
        java.lang.String str20 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode14);
        java.util.Map<java.lang.Character, java.lang.String> charMap21 = escapeMode14.getMap();
        java.lang.String str22 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode14);
        java.util.Map<java.lang.Character, java.lang.String> charMap23 = escapeMode14.getMap();
        java.lang.String str24 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode14);
        java.util.Map<java.lang.Character, java.lang.String> charMap25 = escapeMode14.getMap();
        java.lang.String str26 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode14);
        java.lang.String str27 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode14);
        java.util.Map<java.lang.Character, java.lang.String> charMap28 = escapeMode14.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap29 = escapeMode14.getMap();
        java.lang.String str30 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode14);
        java.util.Map<java.lang.Character, java.lang.String> charMap31 = escapeMode14.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap32 = escapeMode14.getMap();
        java.lang.Class<?> wildcardClass33 = escapeMode14.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode14 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.extended + "'", escapeMode14.equals(org.jsoup.nodes.Entities.EscapeMode.extended));
        org.junit.Assert.assertNotNull(charMap15);
        org.junit.Assert.assertNotNull(charMap16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(charMap18);
        org.junit.Assert.assertNotNull(charMap19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(charMap21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(charMap23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(charMap25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(charMap28);
        org.junit.Assert.assertNotNull(charMap29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(charMap31);
        org.junit.Assert.assertNotNull(charMap32);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test4611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4611");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode8 = org.jsoup.nodes.Entities.EscapeMode.extended;
        java.util.Map<java.lang.Character, java.lang.String> charMap9 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap10 = escapeMode8.getMap();
        java.lang.String str11 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode8);
        java.lang.String str12 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode8);
        java.util.Map<java.lang.Character, java.lang.String> charMap13 = escapeMode8.getMap();
        java.lang.String str14 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode8);
        java.util.Map<java.lang.Character, java.lang.String> charMap15 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap16 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap17 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap18 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap19 = escapeMode8.getMap();
        java.lang.String str20 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode8);
        java.util.Map<java.lang.Character, java.lang.String> charMap21 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap22 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap23 = escapeMode8.getMap();
        java.lang.Class<?> wildcardClass24 = charMap23.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode8 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.extended + "'", escapeMode8.equals(org.jsoup.nodes.Entities.EscapeMode.extended));
        org.junit.Assert.assertNotNull(charMap9);
        org.junit.Assert.assertNotNull(charMap10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(charMap13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(charMap15);
        org.junit.Assert.assertNotNull(charMap16);
        org.junit.Assert.assertNotNull(charMap17);
        org.junit.Assert.assertNotNull(charMap18);
        org.junit.Assert.assertNotNull(charMap19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(charMap21);
        org.junit.Assert.assertNotNull(charMap22);
        org.junit.Assert.assertNotNull(charMap23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test4612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4612");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode2 = org.jsoup.nodes.Entities.EscapeMode.xhtml;
        java.util.Map<java.lang.Character, java.lang.String> charMap3 = escapeMode2.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap4 = escapeMode2.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap5 = escapeMode2.getMap();
        java.lang.String str6 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode2);
        java.util.Map<java.lang.Character, java.lang.String> charMap7 = escapeMode2.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap8 = escapeMode2.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap9 = escapeMode2.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap10 = escapeMode2.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap11 = escapeMode2.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap12 = escapeMode2.getMap();
        org.junit.Assert.assertTrue("'" + escapeMode2 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.xhtml + "'", escapeMode2.equals(org.jsoup.nodes.Entities.EscapeMode.xhtml));
        org.junit.Assert.assertNotNull(charMap3);
        org.junit.Assert.assertNotNull(charMap4);
        org.junit.Assert.assertNotNull(charMap5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(charMap7);
        org.junit.Assert.assertNotNull(charMap8);
        org.junit.Assert.assertNotNull(charMap9);
        org.junit.Assert.assertNotNull(charMap10);
        org.junit.Assert.assertNotNull(charMap11);
        org.junit.Assert.assertNotNull(charMap12);
    }

    @Test
    public void test4613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4613");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode14 = org.jsoup.nodes.Entities.EscapeMode.extended;
        java.lang.String str15 = org.jsoup.nodes.Entities.escape("", charsetEncoder13, escapeMode14);
        java.lang.String str16 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode14);
        java.lang.String str17 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode14);
        java.util.Map<java.lang.Character, java.lang.String> charMap18 = escapeMode14.getMap();
        java.lang.String str19 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode14);
        java.util.Map<java.lang.Character, java.lang.String> charMap20 = escapeMode14.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap21 = escapeMode14.getMap();
        java.lang.String str22 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode14);
        java.lang.String str23 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode14);
        java.util.Map<java.lang.Character, java.lang.String> charMap24 = escapeMode14.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap25 = escapeMode14.getMap();
        java.lang.String str26 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode14);
        org.junit.Assert.assertTrue("'" + escapeMode14 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.extended + "'", escapeMode14.equals(org.jsoup.nodes.Entities.EscapeMode.extended));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(charMap18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(charMap20);
        org.junit.Assert.assertNotNull(charMap21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(charMap24);
        org.junit.Assert.assertNotNull(charMap25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test4614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4614");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode10 = org.jsoup.nodes.Entities.EscapeMode.extended;
        java.lang.String str11 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode10);
        java.util.Map<java.lang.Character, java.lang.String> charMap12 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap13 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap14 = escapeMode10.getMap();
        java.lang.String str15 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode10);
        java.lang.String str16 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode10);
        java.lang.String str17 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode10);
        java.lang.String str18 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode10);
        java.util.Map<java.lang.Character, java.lang.String> charMap19 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap20 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap21 = escapeMode10.getMap();
        java.lang.Class<?> wildcardClass22 = charMap21.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode10 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.extended + "'", escapeMode10.equals(org.jsoup.nodes.Entities.EscapeMode.extended));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(charMap12);
        org.junit.Assert.assertNotNull(charMap13);
        org.junit.Assert.assertNotNull(charMap14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(charMap19);
        org.junit.Assert.assertNotNull(charMap20);
        org.junit.Assert.assertNotNull(charMap21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4615");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode8 = org.jsoup.nodes.Entities.EscapeMode.xhtml;
        java.util.Map<java.lang.Character, java.lang.String> charMap9 = escapeMode8.getMap();
        java.lang.String str10 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode8);
        java.lang.String str11 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode8);
        java.util.Map<java.lang.Character, java.lang.String> charMap12 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap13 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap14 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap15 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap16 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap17 = escapeMode8.getMap();
        java.lang.String str18 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode8);
        java.lang.String str19 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode8);
        org.junit.Assert.assertTrue("'" + escapeMode8 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.xhtml + "'", escapeMode8.equals(org.jsoup.nodes.Entities.EscapeMode.xhtml));
        org.junit.Assert.assertNotNull(charMap9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(charMap12);
        org.junit.Assert.assertNotNull(charMap13);
        org.junit.Assert.assertNotNull(charMap14);
        org.junit.Assert.assertNotNull(charMap15);
        org.junit.Assert.assertNotNull(charMap16);
        org.junit.Assert.assertNotNull(charMap17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test4616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4616");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode4 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.util.Map<java.lang.Character, java.lang.String> charMap5 = escapeMode4.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap6 = escapeMode4.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap7 = escapeMode4.getMap();
        java.lang.String str8 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode4);
        java.util.Map<java.lang.Character, java.lang.String> charMap9 = escapeMode4.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap10 = escapeMode4.getMap();
        java.lang.String str11 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode4);
        java.util.Map<java.lang.Character, java.lang.String> charMap12 = escapeMode4.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap13 = escapeMode4.getMap();
        org.junit.Assert.assertTrue("'" + escapeMode4 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode4.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charMap5);
        org.junit.Assert.assertNotNull(charMap6);
        org.junit.Assert.assertNotNull(charMap7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(charMap9);
        org.junit.Assert.assertNotNull(charMap10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(charMap12);
        org.junit.Assert.assertNotNull(charMap13);
    }

    @Test
    public void test4617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4617");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode10 = org.jsoup.nodes.Entities.EscapeMode.xhtml;
        java.util.Map<java.lang.Character, java.lang.String> charMap11 = escapeMode10.getMap();
        java.lang.String str12 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode10);
        java.util.Map<java.lang.Character, java.lang.String> charMap13 = escapeMode10.getMap();
        java.lang.String str14 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode10);
        java.util.Map<java.lang.Character, java.lang.String> charMap15 = escapeMode10.getMap();
        java.lang.String str16 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode10);
        java.util.Map<java.lang.Character, java.lang.String> charMap17 = escapeMode10.getMap();
        java.lang.String str18 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode10);
        java.lang.String str19 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode10);
        java.util.Map<java.lang.Character, java.lang.String> charMap20 = escapeMode10.getMap();
        java.lang.Class<?> wildcardClass21 = charMap20.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode10 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.xhtml + "'", escapeMode10.equals(org.jsoup.nodes.Entities.EscapeMode.xhtml));
        org.junit.Assert.assertNotNull(charMap11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(charMap13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(charMap15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(charMap17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(charMap20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test4618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4618");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode10 = org.jsoup.nodes.Entities.EscapeMode.extended;
        java.lang.String str11 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode10);
        java.util.Map<java.lang.Character, java.lang.String> charMap12 = escapeMode10.getMap();
        java.lang.String str13 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode10);
        java.util.Map<java.lang.Character, java.lang.String> charMap14 = escapeMode10.getMap();
        java.lang.String str15 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode10);
        java.lang.String str16 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode10);
        java.util.Map<java.lang.Character, java.lang.String> charMap17 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap18 = escapeMode10.getMap();
        java.lang.String str19 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode10);
        org.junit.Assert.assertTrue("'" + escapeMode10 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.extended + "'", escapeMode10.equals(org.jsoup.nodes.Entities.EscapeMode.extended));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(charMap12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(charMap14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(charMap17);
        org.junit.Assert.assertNotNull(charMap18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test4619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4619");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode8 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.util.Map<java.lang.Character, java.lang.String> charMap9 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap10 = escapeMode8.getMap();
        java.lang.String str11 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode8);
        java.util.Map<java.lang.Character, java.lang.String> charMap12 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap13 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap14 = escapeMode8.getMap();
        java.lang.String str15 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode8);
        java.util.Map<java.lang.Character, java.lang.String> charMap16 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap17 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap18 = escapeMode8.getMap();
        java.lang.String str19 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode8);
        java.lang.String str20 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode8);
        java.util.Map<java.lang.Character, java.lang.String> charMap21 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap22 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap23 = escapeMode8.getMap();
        org.junit.Assert.assertTrue("'" + escapeMode8 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode8.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charMap9);
        org.junit.Assert.assertNotNull(charMap10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(charMap12);
        org.junit.Assert.assertNotNull(charMap13);
        org.junit.Assert.assertNotNull(charMap14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(charMap16);
        org.junit.Assert.assertNotNull(charMap17);
        org.junit.Assert.assertNotNull(charMap18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(charMap21);
        org.junit.Assert.assertNotNull(charMap22);
        org.junit.Assert.assertNotNull(charMap23);
    }

    @Test
    public void test4620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4620");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode10 = org.jsoup.nodes.Entities.EscapeMode.xhtml;
        java.lang.String str11 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode10);
        java.util.Map<java.lang.Character, java.lang.String> charMap12 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap13 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap14 = escapeMode10.getMap();
        java.lang.String str15 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode10);
        java.lang.String str16 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode10);
        java.util.Map<java.lang.Character, java.lang.String> charMap17 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap18 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap19 = escapeMode10.getMap();
        java.lang.String str20 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode10);
        java.util.Map<java.lang.Character, java.lang.String> charMap21 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap22 = escapeMode10.getMap();
        java.lang.String str23 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode10);
        java.util.Map<java.lang.Character, java.lang.String> charMap24 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap25 = escapeMode10.getMap();
        java.lang.Class<?> wildcardClass26 = charMap25.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode10 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.xhtml + "'", escapeMode10.equals(org.jsoup.nodes.Entities.EscapeMode.xhtml));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(charMap12);
        org.junit.Assert.assertNotNull(charMap13);
        org.junit.Assert.assertNotNull(charMap14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(charMap17);
        org.junit.Assert.assertNotNull(charMap18);
        org.junit.Assert.assertNotNull(charMap19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(charMap21);
        org.junit.Assert.assertNotNull(charMap22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(charMap24);
        org.junit.Assert.assertNotNull(charMap25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test4621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4621");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode4 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.util.Map<java.lang.Character, java.lang.String> charMap5 = escapeMode4.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap6 = escapeMode4.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap7 = escapeMode4.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap8 = escapeMode4.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap9 = escapeMode4.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap10 = escapeMode4.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap11 = escapeMode4.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap12 = escapeMode4.getMap();
        java.lang.String str13 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode4);
        java.util.Map<java.lang.Character, java.lang.String> charMap14 = escapeMode4.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap15 = escapeMode4.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap16 = escapeMode4.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap17 = escapeMode4.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap18 = escapeMode4.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap19 = escapeMode4.getMap();
        java.lang.String str20 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode4);
        java.lang.Class<?> wildcardClass21 = escapeMode4.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode4 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode4.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charMap5);
        org.junit.Assert.assertNotNull(charMap6);
        org.junit.Assert.assertNotNull(charMap7);
        org.junit.Assert.assertNotNull(charMap8);
        org.junit.Assert.assertNotNull(charMap9);
        org.junit.Assert.assertNotNull(charMap10);
        org.junit.Assert.assertNotNull(charMap11);
        org.junit.Assert.assertNotNull(charMap12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(charMap14);
        org.junit.Assert.assertNotNull(charMap15);
        org.junit.Assert.assertNotNull(charMap16);
        org.junit.Assert.assertNotNull(charMap17);
        org.junit.Assert.assertNotNull(charMap18);
        org.junit.Assert.assertNotNull(charMap19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test4622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4622");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode14 = org.jsoup.nodes.Entities.EscapeMode.extended;
        java.util.Map<java.lang.Character, java.lang.String> charMap15 = escapeMode14.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap16 = escapeMode14.getMap();
        java.lang.String str17 = org.jsoup.nodes.Entities.escape("", charsetEncoder13, escapeMode14);
        java.util.Map<java.lang.Character, java.lang.String> charMap18 = escapeMode14.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap19 = escapeMode14.getMap();
        java.lang.String str20 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode14);
        java.util.Map<java.lang.Character, java.lang.String> charMap21 = escapeMode14.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap22 = escapeMode14.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap23 = escapeMode14.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap24 = escapeMode14.getMap();
        java.lang.String str25 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode14);
        java.util.Map<java.lang.Character, java.lang.String> charMap26 = escapeMode14.getMap();
        java.lang.String str27 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode14);
        java.lang.String str28 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode14);
        java.lang.String str29 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode14);
        java.util.Map<java.lang.Character, java.lang.String> charMap30 = escapeMode14.getMap();
        java.lang.String str31 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode14);
        java.util.Map<java.lang.Character, java.lang.String> charMap32 = escapeMode14.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap33 = escapeMode14.getMap();
        org.junit.Assert.assertTrue("'" + escapeMode14 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.extended + "'", escapeMode14.equals(org.jsoup.nodes.Entities.EscapeMode.extended));
        org.junit.Assert.assertNotNull(charMap15);
        org.junit.Assert.assertNotNull(charMap16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(charMap18);
        org.junit.Assert.assertNotNull(charMap19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(charMap21);
        org.junit.Assert.assertNotNull(charMap22);
        org.junit.Assert.assertNotNull(charMap23);
        org.junit.Assert.assertNotNull(charMap24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(charMap26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(charMap30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(charMap32);
        org.junit.Assert.assertNotNull(charMap33);
    }

    @Test
    public void test4623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4623");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode6 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.util.Map<java.lang.Character, java.lang.String> charMap7 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap8 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap9 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap10 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap11 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap12 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap13 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap14 = escapeMode6.getMap();
        java.lang.String str15 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode6);
        java.lang.String str16 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode6);
        java.util.Map<java.lang.Character, java.lang.String> charMap17 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap18 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap19 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap20 = escapeMode6.getMap();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = org.jsoup.nodes.Entities.escape("hi!", charsetEncoder1, escapeMode6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + escapeMode6 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode6.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charMap7);
        org.junit.Assert.assertNotNull(charMap8);
        org.junit.Assert.assertNotNull(charMap9);
        org.junit.Assert.assertNotNull(charMap10);
        org.junit.Assert.assertNotNull(charMap11);
        org.junit.Assert.assertNotNull(charMap12);
        org.junit.Assert.assertNotNull(charMap13);
        org.junit.Assert.assertNotNull(charMap14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(charMap17);
        org.junit.Assert.assertNotNull(charMap18);
        org.junit.Assert.assertNotNull(charMap19);
        org.junit.Assert.assertNotNull(charMap20);
    }

    @Test
    public void test4624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4624");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode10 = org.jsoup.nodes.Entities.EscapeMode.extended;
        java.util.Map<java.lang.Character, java.lang.String> charMap11 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap12 = escapeMode10.getMap();
        java.lang.String str13 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode10);
        java.lang.String str14 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode10);
        java.util.Map<java.lang.Character, java.lang.String> charMap15 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap16 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap17 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap18 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap19 = escapeMode10.getMap();
        java.lang.String str20 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode10);
        java.util.Map<java.lang.Character, java.lang.String> charMap21 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap22 = escapeMode10.getMap();
        java.lang.String str23 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode10);
        java.lang.String str24 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode10);
        java.util.Map<java.lang.Character, java.lang.String> charMap25 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap26 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap27 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap28 = escapeMode10.getMap();
        java.lang.Class<?> wildcardClass29 = escapeMode10.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode10 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.extended + "'", escapeMode10.equals(org.jsoup.nodes.Entities.EscapeMode.extended));
        org.junit.Assert.assertNotNull(charMap11);
        org.junit.Assert.assertNotNull(charMap12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(charMap15);
        org.junit.Assert.assertNotNull(charMap16);
        org.junit.Assert.assertNotNull(charMap17);
        org.junit.Assert.assertNotNull(charMap18);
        org.junit.Assert.assertNotNull(charMap19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(charMap21);
        org.junit.Assert.assertNotNull(charMap22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(charMap25);
        org.junit.Assert.assertNotNull(charMap26);
        org.junit.Assert.assertNotNull(charMap27);
        org.junit.Assert.assertNotNull(charMap28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test4625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4625");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode4 = org.jsoup.nodes.Entities.EscapeMode.extended;
        java.lang.String str5 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode4);
        java.util.Map<java.lang.Character, java.lang.String> charMap6 = escapeMode4.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap7 = escapeMode4.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap8 = escapeMode4.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap9 = escapeMode4.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap10 = escapeMode4.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap11 = escapeMode4.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap12 = escapeMode4.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap13 = escapeMode4.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap14 = escapeMode4.getMap();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = org.jsoup.nodes.Entities.escape("hi!", charsetEncoder1, escapeMode4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + escapeMode4 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.extended + "'", escapeMode4.equals(org.jsoup.nodes.Entities.EscapeMode.extended));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(charMap6);
        org.junit.Assert.assertNotNull(charMap7);
        org.junit.Assert.assertNotNull(charMap8);
        org.junit.Assert.assertNotNull(charMap9);
        org.junit.Assert.assertNotNull(charMap10);
        org.junit.Assert.assertNotNull(charMap11);
        org.junit.Assert.assertNotNull(charMap12);
        org.junit.Assert.assertNotNull(charMap13);
        org.junit.Assert.assertNotNull(charMap14);
    }

    @Test
    public void test4626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4626");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode8 = org.jsoup.nodes.Entities.EscapeMode.extended;
        java.lang.String str9 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode8);
        java.util.Map<java.lang.Character, java.lang.String> charMap10 = escapeMode8.getMap();
        java.lang.String str11 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode8);
        java.util.Map<java.lang.Character, java.lang.String> charMap12 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap13 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap14 = escapeMode8.getMap();
        java.lang.String str15 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode8);
        java.util.Map<java.lang.Character, java.lang.String> charMap16 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap17 = escapeMode8.getMap();
        java.lang.String str18 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode8);
        java.util.Map<java.lang.Character, java.lang.String> charMap19 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap20 = escapeMode8.getMap();
        org.junit.Assert.assertTrue("'" + escapeMode8 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.extended + "'", escapeMode8.equals(org.jsoup.nodes.Entities.EscapeMode.extended));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(charMap10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(charMap12);
        org.junit.Assert.assertNotNull(charMap13);
        org.junit.Assert.assertNotNull(charMap14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(charMap16);
        org.junit.Assert.assertNotNull(charMap17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(charMap19);
        org.junit.Assert.assertNotNull(charMap20);
    }

    @Test
    public void test4627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4627");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode12 = org.jsoup.nodes.Entities.EscapeMode.extended;
        java.lang.String str13 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode12);
        java.util.Map<java.lang.Character, java.lang.String> charMap14 = escapeMode12.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap15 = escapeMode12.getMap();
        java.lang.String str16 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode12);
        java.util.Map<java.lang.Character, java.lang.String> charMap17 = escapeMode12.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap18 = escapeMode12.getMap();
        java.lang.String str19 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode12);
        java.util.Map<java.lang.Character, java.lang.String> charMap20 = escapeMode12.getMap();
        java.lang.String str21 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode12);
        java.lang.String str22 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode12);
        java.util.Map<java.lang.Character, java.lang.String> charMap23 = escapeMode12.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap24 = escapeMode12.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap25 = escapeMode12.getMap();
        java.lang.String str26 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode12);
        java.util.Map<java.lang.Character, java.lang.String> charMap27 = escapeMode12.getMap();
        java.lang.Class<?> wildcardClass28 = charMap27.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode12 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.extended + "'", escapeMode12.equals(org.jsoup.nodes.Entities.EscapeMode.extended));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(charMap14);
        org.junit.Assert.assertNotNull(charMap15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(charMap17);
        org.junit.Assert.assertNotNull(charMap18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(charMap20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(charMap23);
        org.junit.Assert.assertNotNull(charMap24);
        org.junit.Assert.assertNotNull(charMap25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(charMap27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test4628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4628");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode6 = org.jsoup.nodes.Entities.EscapeMode.xhtml;
        java.util.Map<java.lang.Character, java.lang.String> charMap7 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap8 = escapeMode6.getMap();
        java.lang.String str9 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode6);
        java.util.Map<java.lang.Character, java.lang.String> charMap10 = escapeMode6.getMap();
        java.lang.String str11 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode6);
        java.lang.String str12 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode6);
        java.lang.Class<?> wildcardClass13 = escapeMode6.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode6 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.xhtml + "'", escapeMode6.equals(org.jsoup.nodes.Entities.EscapeMode.xhtml));
        org.junit.Assert.assertNotNull(charMap7);
        org.junit.Assert.assertNotNull(charMap8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(charMap10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4629");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode14 = org.jsoup.nodes.Entities.EscapeMode.extended;
        java.util.Map<java.lang.Character, java.lang.String> charMap15 = escapeMode14.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap16 = escapeMode14.getMap();
        java.lang.String str17 = org.jsoup.nodes.Entities.escape("", charsetEncoder13, escapeMode14);
        java.util.Map<java.lang.Character, java.lang.String> charMap18 = escapeMode14.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap19 = escapeMode14.getMap();
        java.lang.String str20 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode14);
        java.util.Map<java.lang.Character, java.lang.String> charMap21 = escapeMode14.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap22 = escapeMode14.getMap();
        java.lang.String str23 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode14);
        java.util.Map<java.lang.Character, java.lang.String> charMap24 = escapeMode14.getMap();
        java.lang.String str25 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode14);
        java.lang.String str26 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode14);
        java.util.Map<java.lang.Character, java.lang.String> charMap27 = escapeMode14.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap28 = escapeMode14.getMap();
        java.lang.String str29 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode14);
        java.util.Map<java.lang.Character, java.lang.String> charMap30 = escapeMode14.getMap();
        java.lang.String str31 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode14);
        org.junit.Assert.assertTrue("'" + escapeMode14 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.extended + "'", escapeMode14.equals(org.jsoup.nodes.Entities.EscapeMode.extended));
        org.junit.Assert.assertNotNull(charMap15);
        org.junit.Assert.assertNotNull(charMap16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(charMap18);
        org.junit.Assert.assertNotNull(charMap19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(charMap21);
        org.junit.Assert.assertNotNull(charMap22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(charMap24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(charMap27);
        org.junit.Assert.assertNotNull(charMap28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(charMap30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test4630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4630");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode10 = org.jsoup.nodes.Entities.EscapeMode.extended;
        java.util.Map<java.lang.Character, java.lang.String> charMap11 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap12 = escapeMode10.getMap();
        java.lang.String str13 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode10);
        java.lang.String str14 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode10);
        java.util.Map<java.lang.Character, java.lang.String> charMap15 = escapeMode10.getMap();
        java.lang.String str16 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode10);
        java.util.Map<java.lang.Character, java.lang.String> charMap17 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap18 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap19 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap20 = escapeMode10.getMap();
        java.lang.String str21 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode10);
        java.util.Map<java.lang.Character, java.lang.String> charMap22 = escapeMode10.getMap();
        java.lang.String str23 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode10);
        java.lang.Class<?> wildcardClass24 = escapeMode10.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode10 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.extended + "'", escapeMode10.equals(org.jsoup.nodes.Entities.EscapeMode.extended));
        org.junit.Assert.assertNotNull(charMap11);
        org.junit.Assert.assertNotNull(charMap12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(charMap15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(charMap17);
        org.junit.Assert.assertNotNull(charMap18);
        org.junit.Assert.assertNotNull(charMap19);
        org.junit.Assert.assertNotNull(charMap20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(charMap22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test4631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4631");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode8 = org.jsoup.nodes.Entities.EscapeMode.xhtml;
        java.lang.String str9 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode8);
        java.util.Map<java.lang.Character, java.lang.String> charMap10 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap11 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap12 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap13 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap14 = escapeMode8.getMap();
        java.lang.String str15 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode8);
        java.util.Map<java.lang.Character, java.lang.String> charMap16 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap17 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap18 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap19 = escapeMode8.getMap();
        java.lang.String str20 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = org.jsoup.nodes.Entities.escape("hi!", charsetEncoder1, escapeMode8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + escapeMode8 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.xhtml + "'", escapeMode8.equals(org.jsoup.nodes.Entities.EscapeMode.xhtml));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(charMap10);
        org.junit.Assert.assertNotNull(charMap11);
        org.junit.Assert.assertNotNull(charMap12);
        org.junit.Assert.assertNotNull(charMap13);
        org.junit.Assert.assertNotNull(charMap14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(charMap16);
        org.junit.Assert.assertNotNull(charMap17);
        org.junit.Assert.assertNotNull(charMap18);
        org.junit.Assert.assertNotNull(charMap19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test4632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4632");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode8 = org.jsoup.nodes.Entities.EscapeMode.extended;
        java.lang.String str9 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode8);
        java.util.Map<java.lang.Character, java.lang.String> charMap10 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap11 = escapeMode8.getMap();
        java.lang.String str12 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode8);
        java.util.Map<java.lang.Character, java.lang.String> charMap13 = escapeMode8.getMap();
        java.lang.String str14 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode8);
        java.util.Map<java.lang.Character, java.lang.String> charMap15 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap16 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap17 = escapeMode8.getMap();
        java.lang.String str18 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode8);
        java.util.Map<java.lang.Character, java.lang.String> charMap19 = escapeMode8.getMap();
        java.lang.Class<?> wildcardClass20 = charMap19.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode8 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.extended + "'", escapeMode8.equals(org.jsoup.nodes.Entities.EscapeMode.extended));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(charMap10);
        org.junit.Assert.assertNotNull(charMap11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(charMap13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(charMap15);
        org.junit.Assert.assertNotNull(charMap16);
        org.junit.Assert.assertNotNull(charMap17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(charMap19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4633");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode8 = org.jsoup.nodes.Entities.EscapeMode.extended;
        java.util.Map<java.lang.Character, java.lang.String> charMap9 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap10 = escapeMode8.getMap();
        java.lang.String str11 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode8);
        java.lang.String str12 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode8);
        java.util.Map<java.lang.Character, java.lang.String> charMap13 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap14 = escapeMode8.getMap();
        java.lang.String str15 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode8);
        java.lang.String str16 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode8);
        java.util.Map<java.lang.Character, java.lang.String> charMap17 = escapeMode8.getMap();
        java.lang.Class<?> wildcardClass18 = charMap17.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode8 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.extended + "'", escapeMode8.equals(org.jsoup.nodes.Entities.EscapeMode.extended));
        org.junit.Assert.assertNotNull(charMap9);
        org.junit.Assert.assertNotNull(charMap10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(charMap13);
        org.junit.Assert.assertNotNull(charMap14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(charMap17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4634");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode12 = org.jsoup.nodes.Entities.EscapeMode.extended;
        java.util.Map<java.lang.Character, java.lang.String> charMap13 = escapeMode12.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap14 = escapeMode12.getMap();
        java.lang.String str15 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode12);
        java.util.Map<java.lang.Character, java.lang.String> charMap16 = escapeMode12.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap17 = escapeMode12.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap18 = escapeMode12.getMap();
        java.lang.String str19 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode12);
        java.lang.String str20 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode12);
        java.lang.String str21 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode12);
        java.util.Map<java.lang.Character, java.lang.String> charMap22 = escapeMode12.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap23 = escapeMode12.getMap();
        java.lang.String str24 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode12);
        java.util.Map<java.lang.Character, java.lang.String> charMap25 = escapeMode12.getMap();
        java.lang.String str26 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode12);
        java.util.Map<java.lang.Character, java.lang.String> charMap27 = escapeMode12.getMap();
        org.junit.Assert.assertTrue("'" + escapeMode12 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.extended + "'", escapeMode12.equals(org.jsoup.nodes.Entities.EscapeMode.extended));
        org.junit.Assert.assertNotNull(charMap13);
        org.junit.Assert.assertNotNull(charMap14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(charMap16);
        org.junit.Assert.assertNotNull(charMap17);
        org.junit.Assert.assertNotNull(charMap18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(charMap22);
        org.junit.Assert.assertNotNull(charMap23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(charMap25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(charMap27);
    }

    @Test
    public void test4635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4635");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode12 = org.jsoup.nodes.Entities.EscapeMode.extended;
        java.util.Map<java.lang.Character, java.lang.String> charMap13 = escapeMode12.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap14 = escapeMode12.getMap();
        java.lang.String str15 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode12);
        java.util.Map<java.lang.Character, java.lang.String> charMap16 = escapeMode12.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap17 = escapeMode12.getMap();
        java.lang.String str18 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode12);
        java.util.Map<java.lang.Character, java.lang.String> charMap19 = escapeMode12.getMap();
        java.lang.String str20 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode12);
        java.lang.String str21 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode12);
        java.lang.String str22 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode12);
        java.lang.String str23 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode12);
        java.util.Map<java.lang.Character, java.lang.String> charMap24 = escapeMode12.getMap();
        org.junit.Assert.assertTrue("'" + escapeMode12 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.extended + "'", escapeMode12.equals(org.jsoup.nodes.Entities.EscapeMode.extended));
        org.junit.Assert.assertNotNull(charMap13);
        org.junit.Assert.assertNotNull(charMap14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(charMap16);
        org.junit.Assert.assertNotNull(charMap17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(charMap19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(charMap24);
    }

    @Test
    public void test4636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4636");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        java.nio.charset.CharsetEncoder charsetEncoder15 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode16 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.util.Map<java.lang.Character, java.lang.String> charMap17 = escapeMode16.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap18 = escapeMode16.getMap();
        java.lang.String str19 = org.jsoup.nodes.Entities.escape("", charsetEncoder15, escapeMode16);
        java.util.Map<java.lang.Character, java.lang.String> charMap20 = escapeMode16.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap21 = escapeMode16.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap22 = escapeMode16.getMap();
        java.lang.String str23 = org.jsoup.nodes.Entities.escape("", charsetEncoder13, escapeMode16);
        java.util.Map<java.lang.Character, java.lang.String> charMap24 = escapeMode16.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap25 = escapeMode16.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap26 = escapeMode16.getMap();
        java.lang.String str27 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode16);
        java.lang.String str28 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode16);
        java.util.Map<java.lang.Character, java.lang.String> charMap29 = escapeMode16.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap30 = escapeMode16.getMap();
        java.lang.String str31 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode16);
        java.util.Map<java.lang.Character, java.lang.String> charMap32 = escapeMode16.getMap();
        java.lang.String str33 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode16);
        java.lang.String str34 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode16);
        java.lang.String str35 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode16);
        org.junit.Assert.assertTrue("'" + escapeMode16 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode16.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charMap17);
        org.junit.Assert.assertNotNull(charMap18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(charMap20);
        org.junit.Assert.assertNotNull(charMap21);
        org.junit.Assert.assertNotNull(charMap22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(charMap24);
        org.junit.Assert.assertNotNull(charMap25);
        org.junit.Assert.assertNotNull(charMap26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(charMap29);
        org.junit.Assert.assertNotNull(charMap30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(charMap32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
    }

    @Test
    public void test4637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4637");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode10 = org.jsoup.nodes.Entities.EscapeMode.xhtml;
        java.util.Map<java.lang.Character, java.lang.String> charMap11 = escapeMode10.getMap();
        java.lang.String str12 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode10);
        java.util.Map<java.lang.Character, java.lang.String> charMap13 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap14 = escapeMode10.getMap();
        java.lang.String str15 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode10);
        java.lang.String str16 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode10);
        java.lang.String str17 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode10);
        java.lang.String str18 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode10);
        java.util.Map<java.lang.Character, java.lang.String> charMap19 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap20 = escapeMode10.getMap();
        java.lang.Class<?> wildcardClass21 = escapeMode10.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode10 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.xhtml + "'", escapeMode10.equals(org.jsoup.nodes.Entities.EscapeMode.xhtml));
        org.junit.Assert.assertNotNull(charMap11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(charMap13);
        org.junit.Assert.assertNotNull(charMap14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(charMap19);
        org.junit.Assert.assertNotNull(charMap20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test4638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4638");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode8 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.util.Map<java.lang.Character, java.lang.String> charMap9 = escapeMode8.getMap();
        java.lang.String str10 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode8);
        java.util.Map<java.lang.Character, java.lang.String> charMap11 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap12 = escapeMode8.getMap();
        java.lang.String str13 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode8);
        java.lang.String str14 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode8);
        java.lang.String str15 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode8);
        java.lang.Class<?> wildcardClass16 = escapeMode8.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode8 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode8.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charMap9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(charMap11);
        org.junit.Assert.assertNotNull(charMap12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4639");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode12 = org.jsoup.nodes.Entities.EscapeMode.extended;
        java.util.Map<java.lang.Character, java.lang.String> charMap13 = escapeMode12.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap14 = escapeMode12.getMap();
        java.lang.String str15 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode12);
        java.lang.String str16 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode12);
        java.lang.String str17 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode12);
        java.lang.String str18 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode12);
        java.util.Map<java.lang.Character, java.lang.String> charMap19 = escapeMode12.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap20 = escapeMode12.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap21 = escapeMode12.getMap();
        java.lang.String str22 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode12);
        java.lang.String str23 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode12);
        java.util.Map<java.lang.Character, java.lang.String> charMap24 = escapeMode12.getMap();
        org.junit.Assert.assertTrue("'" + escapeMode12 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.extended + "'", escapeMode12.equals(org.jsoup.nodes.Entities.EscapeMode.extended));
        org.junit.Assert.assertNotNull(charMap13);
        org.junit.Assert.assertNotNull(charMap14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(charMap19);
        org.junit.Assert.assertNotNull(charMap20);
        org.junit.Assert.assertNotNull(charMap21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(charMap24);
    }

    @Test
    public void test4640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4640");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode4 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.util.Map<java.lang.Character, java.lang.String> charMap5 = escapeMode4.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap6 = escapeMode4.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap7 = escapeMode4.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap8 = escapeMode4.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap9 = escapeMode4.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap10 = escapeMode4.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap11 = escapeMode4.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap12 = escapeMode4.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap13 = escapeMode4.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap14 = escapeMode4.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap15 = escapeMode4.getMap();
        java.lang.String str16 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode4);
        java.util.Map<java.lang.Character, java.lang.String> charMap17 = escapeMode4.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap18 = escapeMode4.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap19 = escapeMode4.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap20 = escapeMode4.getMap();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = org.jsoup.nodes.Entities.escape("hi!", charsetEncoder1, escapeMode4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + escapeMode4 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode4.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charMap5);
        org.junit.Assert.assertNotNull(charMap6);
        org.junit.Assert.assertNotNull(charMap7);
        org.junit.Assert.assertNotNull(charMap8);
        org.junit.Assert.assertNotNull(charMap9);
        org.junit.Assert.assertNotNull(charMap10);
        org.junit.Assert.assertNotNull(charMap11);
        org.junit.Assert.assertNotNull(charMap12);
        org.junit.Assert.assertNotNull(charMap13);
        org.junit.Assert.assertNotNull(charMap14);
        org.junit.Assert.assertNotNull(charMap15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(charMap17);
        org.junit.Assert.assertNotNull(charMap18);
        org.junit.Assert.assertNotNull(charMap19);
        org.junit.Assert.assertNotNull(charMap20);
    }

    @Test
    public void test4641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4641");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode8 = org.jsoup.nodes.Entities.EscapeMode.extended;
        java.lang.String str9 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode8);
        java.util.Map<java.lang.Character, java.lang.String> charMap10 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap11 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap12 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap13 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap14 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap15 = escapeMode8.getMap();
        java.lang.String str16 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode8);
        java.lang.String str17 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode8);
        java.lang.String str18 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode8);
        java.util.Map<java.lang.Character, java.lang.String> charMap19 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap20 = escapeMode8.getMap();
        org.junit.Assert.assertTrue("'" + escapeMode8 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.extended + "'", escapeMode8.equals(org.jsoup.nodes.Entities.EscapeMode.extended));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(charMap10);
        org.junit.Assert.assertNotNull(charMap11);
        org.junit.Assert.assertNotNull(charMap12);
        org.junit.Assert.assertNotNull(charMap13);
        org.junit.Assert.assertNotNull(charMap14);
        org.junit.Assert.assertNotNull(charMap15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(charMap19);
        org.junit.Assert.assertNotNull(charMap20);
    }

    @Test
    public void test4642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4642");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode10 = org.jsoup.nodes.Entities.EscapeMode.xhtml;
        java.lang.String str11 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode10);
        java.util.Map<java.lang.Character, java.lang.String> charMap12 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap13 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap14 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap15 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap16 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap17 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap18 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap19 = escapeMode10.getMap();
        java.lang.String str20 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode10);
        java.lang.String str21 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode10);
        java.util.Map<java.lang.Character, java.lang.String> charMap22 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap23 = escapeMode10.getMap();
        java.lang.String str24 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode10);
        java.util.Map<java.lang.Character, java.lang.String> charMap25 = escapeMode10.getMap();
        java.lang.String str26 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode10);
        java.util.Map<java.lang.Character, java.lang.String> charMap27 = escapeMode10.getMap();
        org.junit.Assert.assertTrue("'" + escapeMode10 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.xhtml + "'", escapeMode10.equals(org.jsoup.nodes.Entities.EscapeMode.xhtml));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(charMap12);
        org.junit.Assert.assertNotNull(charMap13);
        org.junit.Assert.assertNotNull(charMap14);
        org.junit.Assert.assertNotNull(charMap15);
        org.junit.Assert.assertNotNull(charMap16);
        org.junit.Assert.assertNotNull(charMap17);
        org.junit.Assert.assertNotNull(charMap18);
        org.junit.Assert.assertNotNull(charMap19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(charMap22);
        org.junit.Assert.assertNotNull(charMap23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(charMap25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(charMap27);
    }

    @Test
    public void test4643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4643");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode8 = org.jsoup.nodes.Entities.EscapeMode.extended;
        java.util.Map<java.lang.Character, java.lang.String> charMap9 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap10 = escapeMode8.getMap();
        java.lang.String str11 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode8);
        java.lang.String str12 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode8);
        java.util.Map<java.lang.Character, java.lang.String> charMap13 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap14 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap15 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap16 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap17 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap18 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap19 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap20 = escapeMode8.getMap();
        java.lang.String str21 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode8);
        java.lang.String str22 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode8);
        org.junit.Assert.assertTrue("'" + escapeMode8 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.extended + "'", escapeMode8.equals(org.jsoup.nodes.Entities.EscapeMode.extended));
        org.junit.Assert.assertNotNull(charMap9);
        org.junit.Assert.assertNotNull(charMap10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(charMap13);
        org.junit.Assert.assertNotNull(charMap14);
        org.junit.Assert.assertNotNull(charMap15);
        org.junit.Assert.assertNotNull(charMap16);
        org.junit.Assert.assertNotNull(charMap17);
        org.junit.Assert.assertNotNull(charMap18);
        org.junit.Assert.assertNotNull(charMap19);
        org.junit.Assert.assertNotNull(charMap20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }
}

