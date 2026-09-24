package org.apache.commons.lang.text;

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
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale3);
        java.util.Locale locale6 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale6);
        java.text.Format[] formatArray8 = extendedMessageFormat7.getFormats();
        java.text.Format[] formatArray9 = extendedMessageFormat7.getFormats();
        java.text.Format[] formatArray10 = extendedMessageFormat7.getFormatsByArgumentIndex();
        java.lang.String str11 = extendedMessageFormat7.toPattern();
        java.lang.String str12 = extendedMessageFormat7.toPattern();
        java.lang.String str13 = extendedMessageFormat7.toPattern();
        extendedMessageFormat7.applyPattern("hi!");
        java.text.Format[] formatArray16 = extendedMessageFormat7.getFormatsByArgumentIndex();
        java.text.Format[] formatArray17 = extendedMessageFormat7.getFormats();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat4.setFormatsByArgumentIndex(formatArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray8);
        org.junit.Assert.assertArrayEquals(formatArray8, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray9);
        org.junit.Assert.assertArrayEquals(formatArray9, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray10);
        org.junit.Assert.assertArrayEquals(formatArray10, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(formatArray16);
        org.junit.Assert.assertArrayEquals(formatArray16, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray17);
        org.junit.Assert.assertArrayEquals(formatArray17, new java.text.Format[] {});
    }

    @Test
    public void test3502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3502");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map2);
        extendedMessageFormat3.applyPattern("");
        java.util.Locale locale6 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale6);
        java.text.Format[] formatArray8 = extendedMessageFormat7.getFormatsByArgumentIndex();
        java.lang.String str9 = extendedMessageFormat7.toPattern();
        java.util.Locale locale10 = extendedMessageFormat7.getLocale();
        java.lang.String str11 = extendedMessageFormat7.toPattern();
        java.lang.String str12 = extendedMessageFormat7.toPattern();
        java.util.Locale locale13 = extendedMessageFormat7.getLocale();
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray8);
        org.junit.Assert.assertArrayEquals(formatArray8, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "th_TH");
    }

    @Test
    public void test3503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3503");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale5 = extendedMessageFormat4.getLocale();
        java.util.Map map6 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale5, map6);
        java.util.Map map8 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale5, map8);
        java.util.Map map10 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale5, map10);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat19 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale20 = extendedMessageFormat19.getLocale();
        java.util.Map map21 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat22 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale20, map21);
        java.util.Map map23 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat24 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale20, map23);
        java.util.Map map25 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat26 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale20, map25);
        java.util.Locale locale27 = extendedMessageFormat26.getLocale();
        java.util.Locale locale28 = extendedMessageFormat26.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat29 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale28);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat30 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale28);
        java.util.Map map31 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat32 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale28, map31);
        java.util.Locale locale33 = extendedMessageFormat32.getLocale();
        java.lang.StringBuffer stringBuffer34 = null;
        java.text.FieldPosition fieldPosition35 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer36 = extendedMessageFormat11.format((java.lang.Object) locale33, stringBuffer34, fieldPosition35);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.util.Locale cannot be cast to class [Ljava.lang.Object; (java.util.Locale and [Ljava.lang.Object; are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "th_TH");
    }

    @Test
    public void test3504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3504");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale10 = extendedMessageFormat9.getLocale();
        java.util.Map map11 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale10, map11);
        java.util.Map map13 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale10, map13);
        java.util.Map map15 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat16 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale10, map15);
        java.util.Map map17 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat18 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale10, map17);
        java.text.Format[] formatArray19 = extendedMessageFormat18.getFormats();
        java.util.Locale locale20 = extendedMessageFormat18.getLocale();
        java.util.Map map21 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat22 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale20, map21);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat23 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale20);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat24 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale20);
        java.util.Map map25 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat26 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale20, map25);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray19);
        org.junit.Assert.assertArrayEquals(formatArray19, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "th_TH");
    }

    @Test
    public void test3505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3505");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        extendedMessageFormat1.applyPattern("");
        java.text.Format[] formatArray4 = extendedMessageFormat1.getFormats();
        java.lang.Object[] objArray5 = null;
        java.lang.StringBuffer stringBuffer6 = null;
        java.text.FieldPosition fieldPosition7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer8 = extendedMessageFormat1.format(objArray5, stringBuffer6, fieldPosition7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
    }

    @Test
    public void test3506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3506");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale4 = null;
        extendedMessageFormat3.setLocale(locale4);
        java.text.Format[] formatArray6 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.util.Locale locale7 = extendedMessageFormat3.getLocale();
        java.util.Locale locale8 = extendedMessageFormat3.getLocale();
        java.util.Map map12 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map12);
        extendedMessageFormat13.applyPattern("");
        java.util.Locale locale16 = extendedMessageFormat13.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat17 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale16);
        java.text.Format[] formatArray18 = extendedMessageFormat17.getFormatsByArgumentIndex();
        extendedMessageFormat17.applyPattern("");
        java.util.Locale locale21 = extendedMessageFormat17.getLocale();
        java.util.Map map22 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat23 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale21, map22);
        java.util.Locale locale24 = extendedMessageFormat23.getLocale();
        extendedMessageFormat3.setLocale(locale24);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat26 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale24);
        java.util.Map map27 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat28 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale24, map27);
        java.text.Format[] formatArray29 = extendedMessageFormat28.getFormats();
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale7);
        org.junit.Assert.assertNull(locale8);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray18);
        org.junit.Assert.assertArrayEquals(formatArray18, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray29);
        org.junit.Assert.assertArrayEquals(formatArray29, new java.text.Format[] {});
    }

    @Test
    public void test3507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3507");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.lang.String str4 = extendedMessageFormat1.toPattern();
        java.util.Locale locale6 = null;
        java.util.Map map7 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale6, map7);
        java.text.Format[] formatArray9 = extendedMessageFormat8.getFormatsByArgumentIndex();
        java.lang.String str10 = extendedMessageFormat8.toPattern();
        java.text.Format[] formatArray11 = extendedMessageFormat8.getFormats();
        java.text.Format[] formatArray12 = extendedMessageFormat8.getFormatsByArgumentIndex();
        extendedMessageFormat8.applyPattern("");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat20 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale21 = extendedMessageFormat20.getLocale();
        java.util.Map map22 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat23 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale21, map22);
        java.util.Map map24 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat25 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale21, map24);
        java.util.Map map26 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat27 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale21, map26);
        java.util.Map map28 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat29 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale21, map28);
        java.util.Locale locale30 = extendedMessageFormat29.getLocale();
        extendedMessageFormat8.setLocale(locale30);
        java.text.Format[] formatArray32 = extendedMessageFormat8.getFormats();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat1.setFormats(formatArray32);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(formatArray9);
        org.junit.Assert.assertArrayEquals(formatArray9, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(formatArray11);
        org.junit.Assert.assertArrayEquals(formatArray11, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray12);
        org.junit.Assert.assertArrayEquals(formatArray12, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray32);
        org.junit.Assert.assertArrayEquals(formatArray32, new java.text.Format[] {});
    }

    @Test
    public void test3508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3508");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.lang.String str4 = extendedMessageFormat1.toPattern();
        java.text.Format[] formatArray5 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.Object[] objArray7 = extendedMessageFormat1.parse("hi!");
        java.lang.String str8 = extendedMessageFormat1.toPattern();
        java.text.Format[] formatArray9 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.text.Format[] formatArray10 = extendedMessageFormat1.getFormats();
        java.lang.String str11 = extendedMessageFormat1.toPattern();
        extendedMessageFormat1.applyPattern("");
        java.util.Locale locale14 = extendedMessageFormat1.getLocale();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertArrayEquals(objArray7, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(formatArray9);
        org.junit.Assert.assertArrayEquals(formatArray9, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray10);
        org.junit.Assert.assertArrayEquals(formatArray10, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(locale14);
    }

    @Test
    public void test3509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3509");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale11 = extendedMessageFormat10.getLocale();
        java.util.Map map12 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale11, map12);
        java.util.Map map14 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat15 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale11, map14);
        java.util.Map map16 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat17 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale11, map16);
        java.util.Locale locale18 = extendedMessageFormat17.getLocale();
        java.util.Map map19 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat20 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale18, map19);
        java.util.Map map21 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat22 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale18, map21);
        java.util.Map map23 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat24 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale18, map23);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat25 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale18);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat26 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale18);
        java.util.Map map27 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat28 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale18, map27);
        java.lang.String str29 = extendedMessageFormat28.toPattern();
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test3510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3510");
        java.util.Map map5 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map5);
        extendedMessageFormat6.applyPattern("");
        java.util.Locale locale9 = extendedMessageFormat6.getLocale();
        java.util.Map map10 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale9, map10);
        java.util.Map map12 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale9, map12);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale9);
        java.util.Map map15 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat16 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale9, map15);
        java.text.Format[] formatArray17 = extendedMessageFormat16.getFormatsByArgumentIndex();
        java.util.Map map20 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat21 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map20);
        java.util.Locale locale22 = null;
        extendedMessageFormat21.setLocale(locale22);
        java.util.Map map29 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat30 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map29);
        java.lang.String str31 = extendedMessageFormat30.toPattern();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat33 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.lang.String str34 = extendedMessageFormat33.toPattern();
        java.text.Format[] formatArray35 = extendedMessageFormat33.getFormats();
        java.util.Locale locale36 = extendedMessageFormat33.getLocale();
        extendedMessageFormat30.setLocale(locale36);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat38 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale36);
        java.util.Map map39 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat40 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale36, map39);
        java.util.Map map41 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat42 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale36, map41);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat43 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale36);
        extendedMessageFormat21.setLocale(locale36);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat45 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale36);
        extendedMessageFormat16.setLocale(locale36);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray17);
        org.junit.Assert.assertArrayEquals(formatArray17, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(formatArray35);
        org.junit.Assert.assertArrayEquals(formatArray35, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "th_TH");
    }

    @Test
    public void test3511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3511");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale6 = extendedMessageFormat5.getLocale();
        java.util.Map map7 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale6, map7);
        java.util.Map map9 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale6, map9);
        java.util.Map map11 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale6, map11);
        java.util.Locale locale13 = extendedMessageFormat12.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale13);
        java.text.Format[] formatArray15 = extendedMessageFormat14.getFormats();
        java.lang.String str16 = extendedMessageFormat14.toPattern();
        java.util.Locale locale17 = extendedMessageFormat14.getLocale();
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray15);
        org.junit.Assert.assertArrayEquals(formatArray15, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "th_TH");
    }

    @Test
    public void test3512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3512");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormats();
        extendedMessageFormat3.applyPattern("hi!");
        java.lang.String str7 = extendedMessageFormat3.toPattern();
        extendedMessageFormat3.applyPattern("");
        java.util.Locale locale10 = extendedMessageFormat3.getLocale();
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(locale10);
    }

    @Test
    public void test3513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3513");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormats();
        java.util.Locale locale4 = extendedMessageFormat2.getLocale();
        java.util.Map map5 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale4, map5);
        java.util.Locale locale7 = extendedMessageFormat6.getLocale();
        java.lang.String str8 = extendedMessageFormat6.toPattern();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale15 = extendedMessageFormat14.getLocale();
        java.util.Map map16 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat17 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale15, map16);
        java.util.Map map18 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat19 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale15, map18);
        java.util.Map map20 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat21 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale15, map20);
        java.util.Map map22 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat23 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale15, map22);
        extendedMessageFormat6.setLocale(locale15);
        org.junit.Assert.assertNotNull(formatArray3);
        org.junit.Assert.assertArrayEquals(formatArray3, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "th_TH");
    }

    @Test
    public void test3514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3514");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale6 = extendedMessageFormat5.getLocale();
        java.util.Map map7 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale6, map7);
        java.util.Map map9 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale6, map9);
        java.util.Map map11 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale6, map11);
        java.util.Map map13 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale6, map13);
        java.util.Locale locale15 = extendedMessageFormat14.getLocale();
        java.lang.String str16 = extendedMessageFormat14.toPattern();
        java.text.Format[] formatArray17 = extendedMessageFormat14.getFormats();
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(formatArray17);
        org.junit.Assert.assertArrayEquals(formatArray17, new java.text.Format[] {});
    }

    @Test
    public void test3515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3515");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale8 = extendedMessageFormat7.getLocale();
        java.util.Map map9 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale8, map9);
        java.util.Map map11 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale8, map11);
        java.util.Map map13 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale8, map13);
        java.util.Locale locale15 = extendedMessageFormat14.getLocale();
        java.util.Map map16 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat17 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale15, map16);
        java.util.Map map18 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat19 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale15, map18);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat20 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale15);
        java.text.Format[] formatArray21 = extendedMessageFormat20.getFormatsByArgumentIndex();
        java.lang.Class<?> wildcardClass22 = formatArray21.getClass();
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray21);
        org.junit.Assert.assertArrayEquals(formatArray21, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3516");
        java.util.Map map3 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map3);
        extendedMessageFormat4.applyPattern("");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale11 = extendedMessageFormat10.getLocale();
        java.util.Map map12 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale11, map12);
        java.util.Map map14 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat15 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale11, map14);
        extendedMessageFormat4.setLocale(locale11);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat17 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale11);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat18 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale11);
        java.text.Format[] formatArray19 = extendedMessageFormat18.getFormatsByArgumentIndex();
        java.lang.Class<?> wildcardClass20 = extendedMessageFormat18.getClass();
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray19);
        org.junit.Assert.assertArrayEquals(formatArray19, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3517");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale9 = extendedMessageFormat8.getLocale();
        java.util.Map map10 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale9, map10);
        java.util.Map map12 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale9, map12);
        java.util.Map map14 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat15 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale9, map14);
        java.util.Locale locale16 = extendedMessageFormat15.getLocale();
        java.util.Locale locale17 = extendedMessageFormat15.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat18 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale17);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat19 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale17);
        java.util.Map map20 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat21 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale17, map20);
        java.util.Locale locale22 = extendedMessageFormat21.getLocale();
        java.util.Map map23 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat24 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale22, map23);
        java.text.Format[] formatArray25 = extendedMessageFormat24.getFormats();
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray25);
        org.junit.Assert.assertArrayEquals(formatArray25, new java.text.Format[] {});
    }

    @Test
    public void test3518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3518");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale6 = extendedMessageFormat5.getLocale();
        java.util.Map map7 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale6, map7);
        java.util.Map map9 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale6, map9);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale6);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale6);
        java.text.Format[] formatArray13 = extendedMessageFormat12.getFormatsByArgumentIndex();
        java.text.Format[] formatArray14 = extendedMessageFormat12.getFormats();
        java.text.Format[] formatArray15 = extendedMessageFormat12.getFormats();
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray13);
        org.junit.Assert.assertArrayEquals(formatArray13, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray14);
        org.junit.Assert.assertArrayEquals(formatArray14, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray15);
        org.junit.Assert.assertArrayEquals(formatArray15, new java.text.Format[] {});
    }

    @Test
    public void test3519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3519");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.text.Format[] formatArray5 = extendedMessageFormat3.getFormatsByArgumentIndex();
        extendedMessageFormat3.applyPattern("");
        java.lang.String str8 = extendedMessageFormat3.toPattern();
        java.lang.Object obj9 = extendedMessageFormat3.clone();
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test3520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3520");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormats();
        extendedMessageFormat3.applyPattern("");
        java.text.Format[] formatArray7 = extendedMessageFormat3.getFormats();
        java.util.Locale locale9 = null;
        java.util.Map map10 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale9, map10);
        java.text.Format[] formatArray12 = extendedMessageFormat11.getFormats();
        extendedMessageFormat11.applyPattern("");
        java.text.Format[] formatArray15 = extendedMessageFormat11.getFormats();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat21 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale22 = extendedMessageFormat21.getLocale();
        java.util.Map map23 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat24 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale22, map23);
        java.util.Map map25 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat26 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale22, map25);
        java.util.Map map27 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat28 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale22, map27);
        java.util.Map map29 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat30 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale22, map29);
        extendedMessageFormat11.setLocale(locale22);
        extendedMessageFormat3.setLocale(locale22);
        java.lang.String str33 = extendedMessageFormat3.toPattern();
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray12);
        org.junit.Assert.assertArrayEquals(formatArray12, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray15);
        org.junit.Assert.assertArrayEquals(formatArray15, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
    }

    @Test
    public void test3521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3521");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale7 = extendedMessageFormat6.getLocale();
        java.util.Map map8 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale7, map8);
        java.util.Map map10 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale7, map10);
        java.util.Map map12 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale7, map12);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale7);
        java.lang.String str15 = extendedMessageFormat14.toPattern();
        java.util.Map map19 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat20 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map19);
        extendedMessageFormat20.applyPattern("");
        java.util.Locale locale23 = extendedMessageFormat20.getLocale();
        java.util.Map map24 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat25 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale23, map24);
        java.util.Map map26 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat27 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale23, map26);
        extendedMessageFormat14.setLocale(locale23);
        java.util.Map map29 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat30 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale23, map29);
        java.util.Locale locale32 = null;
        java.util.Map map33 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat34 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale32, map33);
        java.text.Format[] formatArray35 = extendedMessageFormat34.getFormatsByArgumentIndex();
        java.util.Locale locale36 = null;
        extendedMessageFormat34.setLocale(locale36);
        java.util.Locale locale38 = null;
        extendedMessageFormat34.setLocale(locale38);
        java.util.Locale locale40 = null;
        extendedMessageFormat34.setLocale(locale40);
        java.lang.Object[] objArray43 = extendedMessageFormat34.parse("hi!");
        java.lang.Object[] objArray45 = extendedMessageFormat34.parse("hi!");
        java.lang.String str46 = extendedMessageFormat30.format((java.lang.Object) objArray45);
        extendedMessageFormat30.applyPattern("hi!");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat54 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale55 = extendedMessageFormat54.getLocale();
        java.util.Map map56 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat57 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale55, map56);
        java.util.Map map58 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat59 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale55, map58);
        java.util.Locale locale60 = extendedMessageFormat59.getLocale();
        java.util.Map map61 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat62 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale60, map61);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat63 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale60);
        java.util.Locale locale64 = extendedMessageFormat63.getLocale();
        extendedMessageFormat30.setLocale(locale64);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray35);
        org.junit.Assert.assertArrayEquals(formatArray35, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertArrayEquals(objArray43, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertArrayEquals(objArray45, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale60);
        org.junit.Assert.assertEquals(locale60.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale64);
        org.junit.Assert.assertEquals(locale64.toString(), "th_TH");
    }

    @Test
    public void test3522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3522");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.lang.String str5 = extendedMessageFormat3.toPattern();
        extendedMessageFormat3.applyPattern("hi!");
        java.text.Format[] formatArray8 = extendedMessageFormat3.getFormats();
        java.lang.Object[] objArray10 = extendedMessageFormat3.parse("hi!");
        java.util.Locale locale11 = extendedMessageFormat3.getLocale();
        java.text.Format[] formatArray12 = extendedMessageFormat3.getFormatsByArgumentIndex();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat16 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale17 = extendedMessageFormat16.getLocale();
        java.util.Map map18 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat19 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale17, map18);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat20 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale17);
        java.util.Locale locale21 = extendedMessageFormat20.getLocale();
        java.lang.StringBuffer stringBuffer22 = null;
        java.text.FieldPosition fieldPosition23 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer24 = extendedMessageFormat3.format((java.lang.Object) locale21, stringBuffer22, fieldPosition23);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.util.Locale cannot be cast to class [Ljava.lang.Object; (java.util.Locale and [Ljava.lang.Object; are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(formatArray8);
        org.junit.Assert.assertArrayEquals(formatArray8, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertArrayEquals(objArray10, new java.lang.Object[] {});
        org.junit.Assert.assertNull(locale11);
        org.junit.Assert.assertNotNull(formatArray12);
        org.junit.Assert.assertArrayEquals(formatArray12, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "th_TH");
    }

    @Test
    public void test3523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3523");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale8 = extendedMessageFormat7.getLocale();
        java.util.Map map9 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale8, map9);
        java.util.Map map11 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale8, map11);
        java.util.Map map13 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale8, map13);
        java.util.Locale locale15 = extendedMessageFormat14.getLocale();
        java.util.Locale locale16 = extendedMessageFormat14.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat17 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale16);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat18 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale16);
        java.util.Locale locale19 = extendedMessageFormat18.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat20 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale19);
        java.util.Locale locale21 = extendedMessageFormat20.getLocale();
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "th_TH");
    }

    @Test
    public void test3524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3524");
        java.util.Map map5 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map5);
        extendedMessageFormat6.applyPattern("");
        java.util.Locale locale9 = extendedMessageFormat6.getLocale();
        java.util.Map map10 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale9, map10);
        java.util.Map map12 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale9, map12);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale9);
        java.util.Map map15 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat16 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale9, map15);
        java.text.Format[] formatArray17 = extendedMessageFormat16.getFormatsByArgumentIndex();
        java.text.Format[] formatArray18 = extendedMessageFormat16.getFormatsByArgumentIndex();
        java.text.Format[] formatArray19 = extendedMessageFormat16.getFormatsByArgumentIndex();
        java.text.Format[] formatArray20 = extendedMessageFormat16.getFormatsByArgumentIndex();
        java.util.Locale locale21 = extendedMessageFormat16.getLocale();
        java.util.Locale locale22 = extendedMessageFormat16.getLocale();
        java.util.Map map25 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat26 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map25);
        java.lang.String str27 = extendedMessageFormat26.toPattern();
        extendedMessageFormat26.applyPattern("");
        java.lang.String str30 = extendedMessageFormat26.toPattern();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat16.setFormat((int) ' ', (java.text.Format) extendedMessageFormat26);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray17);
        org.junit.Assert.assertArrayEquals(formatArray17, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray18);
        org.junit.Assert.assertArrayEquals(formatArray18, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray19);
        org.junit.Assert.assertArrayEquals(formatArray19, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray20);
        org.junit.Assert.assertArrayEquals(formatArray20, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test3525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3525");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.text.Format[] formatArray4 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.util.Locale locale5 = extendedMessageFormat1.getLocale();
        java.util.Locale locale6 = extendedMessageFormat1.getLocale();
        java.util.Map map10 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map10);
        extendedMessageFormat11.applyPattern("");
        java.util.Locale locale14 = extendedMessageFormat11.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat15 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale14);
        java.text.Format[] formatArray16 = extendedMessageFormat15.getFormatsByArgumentIndex();
        extendedMessageFormat15.applyPattern("");
        java.util.Locale locale19 = extendedMessageFormat15.getLocale();
        java.util.Map map20 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat21 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale19, map20);
        java.util.Locale locale22 = extendedMessageFormat21.getLocale();
        extendedMessageFormat1.setLocale(locale22);
        java.text.Format[] formatArray24 = extendedMessageFormat1.getFormats();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray26 = extendedMessageFormat1.parse("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale5);
        org.junit.Assert.assertNull(locale6);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray16);
        org.junit.Assert.assertArrayEquals(formatArray16, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray24);
        org.junit.Assert.assertArrayEquals(formatArray24, new java.text.Format[] {});
    }

    @Test
    public void test3526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3526");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormats();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale11 = extendedMessageFormat10.getLocale();
        java.util.Map map12 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale11, map12);
        java.util.Map map14 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat15 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale11, map14);
        java.util.Map map16 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat17 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale11, map16);
        java.util.Locale locale18 = extendedMessageFormat17.getLocale();
        java.util.Map map19 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat20 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale18, map19);
        java.util.Map map21 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat22 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale18, map21);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat23 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale18);
        extendedMessageFormat1.setLocale(locale18);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat28 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale29 = extendedMessageFormat28.getLocale();
        java.util.Map map30 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat31 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale29, map30);
        java.util.Map map32 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat33 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale29, map32);
        java.lang.String str34 = extendedMessageFormat33.toPattern();
        java.text.Format[] formatArray35 = extendedMessageFormat33.getFormats();
        java.lang.StringBuffer stringBuffer36 = null;
        java.text.FieldPosition fieldPosition37 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer38 = extendedMessageFormat1.format((java.lang.Object[]) formatArray35, stringBuffer36, fieldPosition37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray2);
        org.junit.Assert.assertArrayEquals(formatArray2, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(formatArray35);
        org.junit.Assert.assertArrayEquals(formatArray35, new java.text.Format[] {});
    }

    @Test
    public void test3527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3527");
        java.util.Locale locale2 = null;
        java.util.Map map3 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale2, map3);
        java.text.Format[] formatArray5 = extendedMessageFormat4.getFormatsByArgumentIndex();
        java.lang.String str6 = extendedMessageFormat4.toPattern();
        extendedMessageFormat4.applyPattern("hi!");
        java.text.Format[] formatArray9 = extendedMessageFormat4.getFormats();
        java.util.Locale locale10 = extendedMessageFormat4.getLocale();
        java.text.Format[] formatArray11 = extendedMessageFormat4.getFormatsByArgumentIndex();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat19 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale20 = extendedMessageFormat19.getLocale();
        java.util.Map map21 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat22 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale20, map21);
        java.util.Map map23 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat24 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale20, map23);
        java.util.Map map25 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat26 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale20, map25);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat27 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale20);
        java.lang.String str28 = extendedMessageFormat27.toPattern();
        java.text.Format[] formatArray29 = extendedMessageFormat27.getFormats();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat35 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale36 = extendedMessageFormat35.getLocale();
        java.util.Map map37 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat38 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale36, map37);
        java.util.Map map39 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat40 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale36, map39);
        java.util.Map map41 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat42 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale36, map41);
        java.util.Locale locale43 = extendedMessageFormat42.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat44 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale43);
        java.util.Map map47 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat48 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map47);
        java.lang.String str49 = extendedMessageFormat48.toPattern();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat51 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.lang.String str52 = extendedMessageFormat51.toPattern();
        java.text.Format[] formatArray53 = extendedMessageFormat51.getFormats();
        java.util.Locale locale54 = extendedMessageFormat51.getLocale();
        extendedMessageFormat48.setLocale(locale54);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat56 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale54);
        extendedMessageFormat44.setLocale(locale54);
        extendedMessageFormat27.setLocale(locale54);
        java.util.Map map59 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat60 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale54, map59);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat61 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale54);
        java.util.Locale locale63 = null;
        java.util.Map map64 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat65 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale63, map64);
        java.text.Format[] formatArray66 = extendedMessageFormat65.getFormatsByArgumentIndex();
        java.util.Locale locale67 = null;
        extendedMessageFormat65.setLocale(locale67);
        java.util.Locale locale69 = null;
        extendedMessageFormat65.setLocale(locale69);
        java.util.Locale locale71 = null;
        extendedMessageFormat65.setLocale(locale71);
        java.text.Format[] formatArray73 = extendedMessageFormat65.getFormats();
        java.lang.String str74 = extendedMessageFormat61.format((java.lang.Object) formatArray73);
        java.text.AttributedCharacterIterator attributedCharacterIterator75 = extendedMessageFormat4.formatToCharacterIterator((java.lang.Object) formatArray73);
        java.lang.String str76 = java.text.MessageFormat.format("", (java.lang.Object[]) formatArray73);
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(formatArray9);
        org.junit.Assert.assertArrayEquals(formatArray9, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale10);
        org.junit.Assert.assertNotNull(formatArray11);
        org.junit.Assert.assertArrayEquals(formatArray11, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(formatArray29);
        org.junit.Assert.assertArrayEquals(formatArray29, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNotNull(formatArray53);
        org.junit.Assert.assertArrayEquals(formatArray53, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale54);
        org.junit.Assert.assertEquals(locale54.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray66);
        org.junit.Assert.assertArrayEquals(formatArray66, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray73);
        org.junit.Assert.assertArrayEquals(formatArray73, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertNotNull(attributedCharacterIterator75);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
    }

    @Test
    public void test3528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3528");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale5 = extendedMessageFormat4.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale5);
        java.util.Map map7 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale5, map7);
        java.util.Map map12 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map12);
        extendedMessageFormat13.applyPattern("");
        java.util.Locale locale16 = extendedMessageFormat13.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat17 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale16);
        java.util.Map map18 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat19 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale16, map18);
        extendedMessageFormat8.setLocale(locale16);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat21 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale16);
        java.lang.String str22 = extendedMessageFormat21.toPattern();
        java.lang.String str23 = extendedMessageFormat21.toPattern();
        java.util.Locale locale24 = extendedMessageFormat21.getLocale();
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "th_TH");
    }

    @Test
    public void test3529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3529");
        java.util.Map map6 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map6);
        java.lang.String str8 = extendedMessageFormat7.toPattern();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.lang.String str11 = extendedMessageFormat10.toPattern();
        java.text.Format[] formatArray12 = extendedMessageFormat10.getFormats();
        java.util.Locale locale13 = extendedMessageFormat10.getLocale();
        extendedMessageFormat7.setLocale(locale13);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat15 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale13);
        java.util.Map map16 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat17 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale13, map16);
        java.util.Map map18 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat19 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale13, map18);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat20 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale13);
        java.util.Map map21 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat22 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale13, map21);
        java.lang.String str23 = extendedMessageFormat22.toPattern();
        java.text.Format[] formatArray24 = extendedMessageFormat22.getFormatsByArgumentIndex();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(formatArray12);
        org.junit.Assert.assertArrayEquals(formatArray12, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(formatArray24);
        org.junit.Assert.assertArrayEquals(formatArray24, new java.text.Format[] {});
    }

    @Test
    public void test3530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3530");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale7 = extendedMessageFormat6.getLocale();
        java.util.Map map8 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale7, map8);
        java.util.Map map10 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale7, map10);
        java.util.Map map12 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale7, map12);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale7);
        java.lang.String str15 = extendedMessageFormat14.toPattern();
        java.util.Map map19 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat20 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map19);
        extendedMessageFormat20.applyPattern("");
        java.util.Locale locale23 = extendedMessageFormat20.getLocale();
        java.util.Map map24 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat25 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale23, map24);
        java.util.Map map26 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat27 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale23, map26);
        extendedMessageFormat14.setLocale(locale23);
        java.util.Map map29 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat30 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale23, map29);
        java.text.Format[] formatArray31 = extendedMessageFormat30.getFormatsByArgumentIndex();
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray31);
        org.junit.Assert.assertArrayEquals(formatArray31, new java.text.Format[] {});
    }

    @Test
    public void test3531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3531");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale8 = extendedMessageFormat7.getLocale();
        java.util.Map map9 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale8, map9);
        java.util.Map map11 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale8, map11);
        java.util.Map map13 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale8, map13);
        java.util.Locale locale15 = extendedMessageFormat14.getLocale();
        java.util.Map map16 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat17 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale15, map16);
        java.util.Map map18 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat19 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale15, map18);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat20 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale15);
        java.text.Format[] formatArray21 = extendedMessageFormat20.getFormatsByArgumentIndex();
        java.util.Locale locale22 = extendedMessageFormat20.getLocale();
        java.lang.Class<?> wildcardClass23 = locale22.getClass();
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray21);
        org.junit.Assert.assertArrayEquals(formatArray21, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "th_TH");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3532");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale9 = extendedMessageFormat8.getLocale();
        java.util.Map map10 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale9, map10);
        java.util.Map map12 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale9, map12);
        java.util.Map map14 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat15 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale9, map14);
        java.util.Locale locale16 = extendedMessageFormat15.getLocale();
        java.util.Locale locale17 = extendedMessageFormat15.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat18 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale17);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat19 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale17);
        java.util.Map map20 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat21 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale17, map20);
        java.util.Map map22 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat23 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale17, map22);
        java.lang.Object obj24 = extendedMessageFormat23.clone();
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "th_TH");
        org.junit.Assert.assertNotNull(obj24);
    }

    @Test
    public void test3533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3533");
        java.util.Locale locale1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1);
        java.lang.Object[] objArray4 = extendedMessageFormat2.parse("hi!");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray7 = extendedMessageFormat6.getFormats();
        java.util.Locale locale8 = extendedMessageFormat6.getLocale();
        extendedMessageFormat2.setLocale(locale8);
        java.util.Locale locale11 = null;
        java.util.Map map12 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale11, map12);
        extendedMessageFormat13.applyPattern("hi!");
        java.lang.String str16 = extendedMessageFormat13.toPattern();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat20 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale21 = extendedMessageFormat20.getLocale();
        java.util.Map map22 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat23 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale21, map22);
        java.util.Map map24 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat25 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale21, map24);
        extendedMessageFormat13.setLocale(locale21);
        java.util.Map map33 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat34 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map33);
        extendedMessageFormat34.applyPattern("");
        java.util.Locale locale37 = extendedMessageFormat34.getLocale();
        java.util.Map map38 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat39 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale37, map38);
        java.util.Map map40 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat41 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale37, map40);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat42 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale37);
        java.util.Map map43 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat44 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale37, map43);
        java.text.Format[] formatArray45 = extendedMessageFormat44.getFormatsByArgumentIndex();
        java.text.Format[] formatArray46 = extendedMessageFormat44.getFormatsByArgumentIndex();
        java.util.Locale locale47 = extendedMessageFormat44.getLocale();
        java.lang.String str48 = extendedMessageFormat44.toPattern();
        java.util.Locale locale49 = extendedMessageFormat44.getLocale();
        java.util.Map map50 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat51 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale49, map50);
        extendedMessageFormat13.setLocale(locale49);
        boolean boolean53 = extendedMessageFormat2.equals((java.lang.Object) extendedMessageFormat13);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertArrayEquals(objArray4, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray45);
        org.junit.Assert.assertArrayEquals(formatArray45, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray46);
        org.junit.Assert.assertArrayEquals(formatArray46, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "th_TH");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
    }

    @Test
    public void test3534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3534");
        java.util.Locale locale2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormats();
        java.text.Format[] formatArray5 = extendedMessageFormat3.getFormats();
        java.util.Map map8 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map8);
        java.lang.String str10 = extendedMessageFormat9.toPattern();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.lang.String str13 = extendedMessageFormat12.toPattern();
        java.text.Format[] formatArray14 = extendedMessageFormat12.getFormats();
        java.util.Locale locale15 = extendedMessageFormat12.getLocale();
        extendedMessageFormat9.setLocale(locale15);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat17 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale15);
        extendedMessageFormat3.setLocale(locale15);
        java.util.Map map19 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat20 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale15, map19);
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(formatArray14);
        org.junit.Assert.assertArrayEquals(formatArray14, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "th_TH");
    }

    @Test
    public void test3535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3535");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormats();
        extendedMessageFormat3.applyPattern("");
        java.text.Format[] formatArray7 = extendedMessageFormat3.getFormats();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale14 = extendedMessageFormat13.getLocale();
        java.util.Map map15 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat16 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale14, map15);
        java.util.Map map17 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat18 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale14, map17);
        java.util.Map map19 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat20 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale14, map19);
        java.util.Map map21 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat22 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale14, map21);
        extendedMessageFormat3.setLocale(locale14);
        java.util.Locale locale24 = extendedMessageFormat3.getLocale();
        java.lang.Object obj25 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator26 = extendedMessageFormat3.formatToCharacterIterator(obj25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: formatToCharacterIterator must be passed non-null object");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "th_TH");
    }

    @Test
    public void test3536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3536");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale8 = extendedMessageFormat7.getLocale();
        java.util.Map map9 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale8, map9);
        java.util.Map map11 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale8, map11);
        java.util.Map map13 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale8, map13);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat15 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale8);
        java.lang.String str16 = extendedMessageFormat15.toPattern();
        java.text.Format[] formatArray17 = extendedMessageFormat15.getFormats();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat23 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale24 = extendedMessageFormat23.getLocale();
        java.util.Map map25 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat26 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale24, map25);
        java.util.Map map27 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat28 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale24, map27);
        java.util.Map map29 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat30 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale24, map29);
        java.util.Locale locale31 = extendedMessageFormat30.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat32 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale31);
        java.util.Map map35 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat36 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map35);
        java.lang.String str37 = extendedMessageFormat36.toPattern();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat39 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.lang.String str40 = extendedMessageFormat39.toPattern();
        java.text.Format[] formatArray41 = extendedMessageFormat39.getFormats();
        java.util.Locale locale42 = extendedMessageFormat39.getLocale();
        extendedMessageFormat36.setLocale(locale42);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat44 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale42);
        extendedMessageFormat32.setLocale(locale42);
        extendedMessageFormat15.setLocale(locale42);
        java.util.Map map47 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat48 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale42, map47);
        java.util.Map map49 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat50 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale42, map49);
        extendedMessageFormat50.applyPattern("");
        java.text.Format[] formatArray53 = extendedMessageFormat50.getFormats();
        java.text.Format[] formatArray54 = extendedMessageFormat50.getFormats();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj56 = extendedMessageFormat50.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(formatArray17);
        org.junit.Assert.assertArrayEquals(formatArray17, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(formatArray41);
        org.junit.Assert.assertArrayEquals(formatArray41, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray53);
        org.junit.Assert.assertArrayEquals(formatArray53, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray54);
        org.junit.Assert.assertArrayEquals(formatArray54, new java.text.Format[] {});
    }

    @Test
    public void test3537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3537");
        java.util.Map map6 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map6);
        java.lang.String str8 = extendedMessageFormat7.toPattern();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.lang.String str11 = extendedMessageFormat10.toPattern();
        java.text.Format[] formatArray12 = extendedMessageFormat10.getFormats();
        java.util.Locale locale13 = extendedMessageFormat10.getLocale();
        extendedMessageFormat7.setLocale(locale13);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat15 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale13);
        java.util.Map map16 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat17 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale13, map16);
        java.util.Map map18 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat19 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale13, map18);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat20 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale13);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat21 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray23 = extendedMessageFormat21.parse("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(formatArray12);
        org.junit.Assert.assertArrayEquals(formatArray12, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "th_TH");
    }

    @Test
    public void test3538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3538");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map2);
        java.lang.String str4 = extendedMessageFormat3.toPattern();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.lang.String str7 = extendedMessageFormat6.toPattern();
        java.text.Format[] formatArray8 = extendedMessageFormat6.getFormats();
        java.util.Locale locale9 = extendedMessageFormat6.getLocale();
        extendedMessageFormat3.setLocale(locale9);
        java.util.Map map11 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale9, map11);
        java.lang.Object[] objArray14 = extendedMessageFormat12.parse("hi!");
        java.lang.Class<?> wildcardClass15 = objArray14.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(formatArray8);
        org.junit.Assert.assertArrayEquals(formatArray8, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "th_TH");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertArrayEquals(objArray14, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3539");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.util.Locale locale6 = null;
        java.util.Map map7 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale6, map7);
        java.text.Format[] formatArray9 = extendedMessageFormat8.getFormatsByArgumentIndex();
        java.util.Locale locale10 = null;
        extendedMessageFormat8.setLocale(locale10);
        java.util.Locale locale12 = null;
        extendedMessageFormat8.setLocale(locale12);
        java.util.Locale locale14 = null;
        extendedMessageFormat8.setLocale(locale14);
        java.lang.Object[] objArray17 = extendedMessageFormat8.parse("hi!");
        java.lang.Object[] objArray19 = extendedMessageFormat8.parse("hi!");
        java.text.Format[] formatArray20 = extendedMessageFormat8.getFormats();
        java.lang.String str21 = extendedMessageFormat8.toPattern();
        extendedMessageFormat8.applyPattern("hi!");
        java.text.Format[] formatArray24 = extendedMessageFormat8.getFormatsByArgumentIndex();
        java.lang.StringBuffer stringBuffer25 = null;
        java.text.FieldPosition fieldPosition26 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer27 = extendedMessageFormat3.format((java.lang.Object[]) formatArray24, stringBuffer25, fieldPosition26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray9);
        org.junit.Assert.assertArrayEquals(formatArray9, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertArrayEquals(objArray17, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertArrayEquals(objArray19, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(formatArray20);
        org.junit.Assert.assertArrayEquals(formatArray20, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(formatArray24);
        org.junit.Assert.assertArrayEquals(formatArray24, new java.text.Format[] {});
    }

    @Test
    public void test3540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3540");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map2);
        extendedMessageFormat3.applyPattern("");
        java.util.Locale locale6 = extendedMessageFormat3.getLocale();
        java.util.Map map7 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale6, map7);
        java.util.Locale locale9 = extendedMessageFormat8.getLocale();
        java.text.Format[] formatArray10 = extendedMessageFormat8.getFormatsByArgumentIndex();
        java.lang.String str11 = extendedMessageFormat8.toPattern();
        java.util.Locale locale12 = extendedMessageFormat8.getLocale();
        java.text.ParsePosition parsePosition14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = extendedMessageFormat8.parseObject("hi!", parsePosition14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray10);
        org.junit.Assert.assertArrayEquals(formatArray10, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "th_TH");
    }

    @Test
    public void test3541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3541");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale6 = extendedMessageFormat5.getLocale();
        java.util.Map map7 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale6, map7);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale6);
        java.lang.String str10 = extendedMessageFormat9.toPattern();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat17 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale18 = extendedMessageFormat17.getLocale();
        java.util.Map map19 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat20 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale18, map19);
        java.util.Map map21 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat22 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale18, map21);
        java.util.Map map23 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat24 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale18, map23);
        java.util.Map map25 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat26 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale18, map25);
        java.text.Format[] formatArray27 = extendedMessageFormat26.getFormats();
        java.util.Locale locale28 = extendedMessageFormat26.getLocale();
        java.util.Map map29 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat30 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale28, map29);
        extendedMessageFormat9.setLocale(locale28);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat32 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale28);
        java.util.Map map33 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat34 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale28, map33);
        java.util.Map map41 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat42 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map41);
        extendedMessageFormat42.applyPattern("");
        java.util.Locale locale45 = extendedMessageFormat42.getLocale();
        java.util.Map map46 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat47 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale45, map46);
        java.util.Map map48 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat49 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale45, map48);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat50 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale45);
        java.util.Map map51 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat52 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale45, map51);
        java.text.Format[] formatArray53 = extendedMessageFormat52.getFormatsByArgumentIndex();
        java.text.Format[] formatArray54 = extendedMessageFormat52.getFormatsByArgumentIndex();
        java.lang.String str55 = java.text.MessageFormat.format("", (java.lang.Object[]) formatArray54);
        java.text.AttributedCharacterIterator attributedCharacterIterator56 = extendedMessageFormat34.formatToCharacterIterator((java.lang.Object) formatArray54);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray27);
        org.junit.Assert.assertArrayEquals(formatArray27, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray53);
        org.junit.Assert.assertArrayEquals(formatArray53, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray54);
        org.junit.Assert.assertArrayEquals(formatArray54, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertNotNull(attributedCharacterIterator56);
    }

    @Test
    public void test3542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3542");
        java.util.Locale locale1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1);
        java.lang.Object[] objArray4 = extendedMessageFormat2.parse("hi!");
        extendedMessageFormat2.applyPattern("hi!");
        java.lang.Object[] objArray8 = extendedMessageFormat2.parse("hi!");
        java.lang.Class<?> wildcardClass9 = objArray8.getClass();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertArrayEquals(objArray4, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertArrayEquals(objArray8, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3543");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.text.Format[] formatArray5 = extendedMessageFormat3.getFormats();
        extendedMessageFormat3.applyPattern("");
        java.util.Locale locale8 = extendedMessageFormat3.getLocale();
        extendedMessageFormat3.applyPattern("hi!");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat16 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale17 = extendedMessageFormat16.getLocale();
        java.util.Map map18 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat19 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale17, map18);
        java.util.Map map20 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat21 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale17, map20);
        java.util.Map map22 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat23 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale17, map22);
        java.text.Format[] formatArray24 = extendedMessageFormat23.getFormats();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat29 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale30 = extendedMessageFormat29.getLocale();
        java.util.Map map31 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat32 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale30, map31);
        java.util.Map map33 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat34 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale30, map33);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat35 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale30);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat37 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray38 = extendedMessageFormat37.getFormats();
        java.util.Locale locale39 = extendedMessageFormat37.getLocale();
        extendedMessageFormat35.setLocale(locale39);
        extendedMessageFormat23.setLocale(locale39);
        java.util.Map map42 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat43 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale39, map42);
        boolean boolean44 = extendedMessageFormat3.equals((java.lang.Object) "");
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale8);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray24);
        org.junit.Assert.assertArrayEquals(formatArray24, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray38);
        org.junit.Assert.assertArrayEquals(formatArray38, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "th_TH");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test3544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3544");
        java.util.Map map3 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map3);
        extendedMessageFormat4.applyPattern("");
        java.util.Locale locale7 = extendedMessageFormat4.getLocale();
        java.util.Map map8 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale7, map8);
        java.util.Map map10 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale7, map10);
        java.util.Locale locale12 = extendedMessageFormat11.getLocale();
        java.text.Format[] formatArray13 = extendedMessageFormat11.getFormats();
        java.text.Format[] formatArray14 = extendedMessageFormat11.getFormatsByArgumentIndex();
        java.text.ParsePosition parsePosition16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = extendedMessageFormat11.parseObject("", parsePosition16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray13);
        org.junit.Assert.assertArrayEquals(formatArray13, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray14);
        org.junit.Assert.assertArrayEquals(formatArray14, new java.text.Format[] {});
    }

    @Test
    public void test3545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3545");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        extendedMessageFormat3.applyPattern("hi!");
        java.lang.String str6 = extendedMessageFormat3.toPattern();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale11 = extendedMessageFormat10.getLocale();
        java.util.Map map12 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale11, map12);
        java.util.Map map14 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat15 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale11, map14);
        extendedMessageFormat3.setLocale(locale11);
        java.util.Map map23 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat24 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map23);
        extendedMessageFormat24.applyPattern("");
        java.util.Locale locale27 = extendedMessageFormat24.getLocale();
        java.util.Map map28 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat29 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale27, map28);
        java.util.Map map30 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat31 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale27, map30);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat32 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale27);
        java.util.Map map33 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat34 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale27, map33);
        java.text.Format[] formatArray35 = extendedMessageFormat34.getFormatsByArgumentIndex();
        java.text.Format[] formatArray36 = extendedMessageFormat34.getFormatsByArgumentIndex();
        java.util.Locale locale37 = extendedMessageFormat34.getLocale();
        java.lang.String str38 = extendedMessageFormat34.toPattern();
        java.util.Locale locale39 = extendedMessageFormat34.getLocale();
        java.util.Map map40 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat41 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale39, map40);
        extendedMessageFormat3.setLocale(locale39);
        java.text.ParsePosition parsePosition44 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj45 = extendedMessageFormat3.parseObject("", parsePosition44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray35);
        org.junit.Assert.assertArrayEquals(formatArray35, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray36);
        org.junit.Assert.assertArrayEquals(formatArray36, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "th_TH");
    }

    @Test
    public void test3546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3546");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormats();
        extendedMessageFormat3.applyPattern("");
        java.text.Format[] formatArray7 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.lang.Class<?> wildcardClass8 = extendedMessageFormat3.getClass();
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3547");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale3);
        java.lang.String str5 = extendedMessageFormat4.toPattern();
        extendedMessageFormat4.applyPattern("hi!");
        java.util.Map map12 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map12);
        extendedMessageFormat13.applyPattern("");
        java.util.Locale locale16 = extendedMessageFormat13.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat17 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale16);
        java.util.Map map18 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat19 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale16, map18);
        java.util.Locale locale23 = null;
        java.util.Map map24 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat25 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale23, map24);
        java.text.Format[] formatArray26 = extendedMessageFormat25.getFormats();
        extendedMessageFormat25.applyPattern("");
        java.util.Map map31 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat32 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map31);
        extendedMessageFormat32.applyPattern("");
        java.util.Locale locale35 = extendedMessageFormat32.getLocale();
        java.util.Map map36 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat37 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale35, map36);
        extendedMessageFormat25.setLocale(locale35);
        java.util.Map map39 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat40 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale35, map39);
        java.util.Map map41 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat42 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale35, map41);
        java.util.Locale locale43 = extendedMessageFormat42.getLocale();
        extendedMessageFormat19.setLocale(locale43);
        java.util.Map map45 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat46 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale43, map45);
        java.lang.StringBuffer stringBuffer47 = null;
        java.text.FieldPosition fieldPosition48 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer49 = extendedMessageFormat4.format((java.lang.Object) locale43, stringBuffer47, fieldPosition48);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.util.Locale cannot be cast to class [Ljava.lang.Object; (java.util.Locale and [Ljava.lang.Object; are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray26);
        org.junit.Assert.assertArrayEquals(formatArray26, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "th_TH");
    }

    @Test
    public void test3548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3548");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale6 = extendedMessageFormat5.getLocale();
        java.util.Map map7 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale6, map7);
        java.util.Map map9 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale6, map9);
        java.util.Map map11 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale6, map11);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale6);
        java.lang.String str14 = extendedMessageFormat13.toPattern();
        java.text.Format[] formatArray15 = extendedMessageFormat13.getFormats();
        java.text.Format[] formatArray16 = extendedMessageFormat13.getFormatsByArgumentIndex();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat21 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale22 = extendedMessageFormat21.getLocale();
        java.util.Map map23 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat24 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale22, map23);
        java.util.Map map25 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat26 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale22, map25);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat27 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale22);
        java.lang.StringBuffer stringBuffer28 = null;
        java.text.FieldPosition fieldPosition29 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer30 = extendedMessageFormat13.format((java.lang.Object) "", stringBuffer28, fieldPosition29);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.String cannot be cast to class [Ljava.lang.Object; (java.lang.String and [Ljava.lang.Object; are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(formatArray15);
        org.junit.Assert.assertArrayEquals(formatArray15, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray16);
        org.junit.Assert.assertArrayEquals(formatArray16, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "th_TH");
    }

    @Test
    public void test3549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3549");
        java.util.Locale locale3 = null;
        java.util.Map map4 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale3, map4);
        java.text.Format[] formatArray6 = extendedMessageFormat5.getFormatsByArgumentIndex();
        java.lang.String str7 = extendedMessageFormat5.toPattern();
        extendedMessageFormat5.applyPattern("hi!");
        java.text.Format[] formatArray10 = extendedMessageFormat5.getFormats();
        java.lang.Object[] objArray12 = extendedMessageFormat5.parse("hi!");
        java.lang.String str13 = java.text.MessageFormat.format("", objArray12);
        java.lang.String str14 = java.text.MessageFormat.format("", objArray12);
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(formatArray10);
        org.junit.Assert.assertArrayEquals(formatArray10, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertArrayEquals(objArray12, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test3550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3550");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale6 = extendedMessageFormat5.getLocale();
        java.util.Map map7 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale6, map7);
        java.util.Map map9 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale6, map9);
        java.util.Map map11 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale6, map11);
        java.util.Locale locale16 = null;
        java.util.Map map17 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat18 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale16, map17);
        java.text.Format[] formatArray19 = extendedMessageFormat18.getFormats();
        extendedMessageFormat18.applyPattern("");
        java.util.Map map24 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat25 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map24);
        extendedMessageFormat25.applyPattern("");
        java.util.Locale locale28 = extendedMessageFormat25.getLocale();
        java.util.Map map29 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat30 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale28, map29);
        extendedMessageFormat18.setLocale(locale28);
        java.util.Map map32 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat33 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale28, map32);
        java.util.Map map34 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat35 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale28, map34);
        java.util.Locale locale36 = extendedMessageFormat35.getLocale();
        extendedMessageFormat12.setLocale(locale36);
        java.util.Map map38 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat39 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale36, map38);
        java.lang.String str40 = extendedMessageFormat39.toPattern();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat42 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale43 = null;
        extendedMessageFormat42.setLocale(locale43);
        java.lang.String str45 = extendedMessageFormat42.toPattern();
        java.text.Format[] formatArray46 = extendedMessageFormat42.getFormatsByArgumentIndex();
        java.util.Locale locale47 = extendedMessageFormat42.getLocale();
        java.text.Format[] formatArray48 = extendedMessageFormat42.getFormats();
        java.text.Format[] formatArray49 = extendedMessageFormat42.getFormats();
        boolean boolean50 = extendedMessageFormat39.equals((java.lang.Object) formatArray49);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray19);
        org.junit.Assert.assertArrayEquals(formatArray19, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
        org.junit.Assert.assertNotNull(formatArray46);
        org.junit.Assert.assertArrayEquals(formatArray46, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale47);
        org.junit.Assert.assertNotNull(formatArray48);
        org.junit.Assert.assertArrayEquals(formatArray48, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray49);
        org.junit.Assert.assertArrayEquals(formatArray49, new java.text.Format[] {});
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test3551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3551");
        java.util.Map map3 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map3);
        extendedMessageFormat4.applyPattern("");
        java.util.Locale locale7 = extendedMessageFormat4.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale7);
        java.util.Map map9 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale7, map9);
        java.lang.String str11 = extendedMessageFormat10.toPattern();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat16 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale17 = extendedMessageFormat16.getLocale();
        java.util.Map map18 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat19 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale17, map18);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat20 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale17);
        java.lang.String str21 = extendedMessageFormat20.toPattern();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat28 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale29 = extendedMessageFormat28.getLocale();
        java.util.Map map30 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat31 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale29, map30);
        java.util.Map map32 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat33 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale29, map32);
        java.util.Map map34 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat35 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale29, map34);
        java.util.Map map36 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat37 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale29, map36);
        java.text.Format[] formatArray38 = extendedMessageFormat37.getFormats();
        java.util.Locale locale39 = extendedMessageFormat37.getLocale();
        java.util.Map map40 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat41 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale39, map40);
        extendedMessageFormat20.setLocale(locale39);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat43 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale39);
        extendedMessageFormat10.setLocale(locale39);
        java.util.Locale locale45 = extendedMessageFormat10.getLocale();
        java.lang.Class<?> wildcardClass46 = locale45.getClass();
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray38);
        org.junit.Assert.assertArrayEquals(formatArray38, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "th_TH");
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test3552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3552");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormats();
        extendedMessageFormat3.applyPattern("hi!");
        java.lang.String str7 = extendedMessageFormat3.toPattern();
        java.lang.Object obj8 = extendedMessageFormat3.clone();
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test3553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3553");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.lang.String str4 = extendedMessageFormat1.toPattern();
        java.text.Format[] formatArray5 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.util.Locale locale6 = extendedMessageFormat1.getLocale();
        java.util.Locale locale7 = extendedMessageFormat1.getLocale();
        java.util.Map map13 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map13);
        extendedMessageFormat14.applyPattern("");
        java.util.Locale locale17 = extendedMessageFormat14.getLocale();
        java.util.Map map18 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat19 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale17, map18);
        java.util.Map map20 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat21 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale17, map20);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat22 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale17);
        java.util.Map map23 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat24 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale17, map23);
        java.text.Format[] formatArray25 = extendedMessageFormat24.getFormatsByArgumentIndex();
        java.text.Format[] formatArray26 = extendedMessageFormat24.getFormatsByArgumentIndex();
        java.text.Format[] formatArray27 = extendedMessageFormat24.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat1.setFormatsByArgumentIndex(formatArray27);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale6);
        org.junit.Assert.assertNull(locale7);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray25);
        org.junit.Assert.assertArrayEquals(formatArray25, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray26);
        org.junit.Assert.assertArrayEquals(formatArray26, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray27);
        org.junit.Assert.assertArrayEquals(formatArray27, new java.text.Format[] {});
    }

    @Test
    public void test3554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3554");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.text.Format[] formatArray5 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.util.Locale locale7 = null;
        java.util.Map map8 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale7, map8);
        java.text.Format[] formatArray10 = extendedMessageFormat9.getFormats();
        java.text.AttributedCharacterIterator attributedCharacterIterator11 = extendedMessageFormat3.formatToCharacterIterator((java.lang.Object) formatArray10);
        java.text.Format[] formatArray12 = extendedMessageFormat3.getFormatsByArgumentIndex();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale15 = null;
        extendedMessageFormat14.setLocale(locale15);
        java.lang.String str17 = extendedMessageFormat14.toPattern();
        java.text.Format[] formatArray18 = extendedMessageFormat14.getFormatsByArgumentIndex();
        java.lang.Object[] objArray20 = extendedMessageFormat14.parse("hi!");
        java.lang.String str21 = extendedMessageFormat14.toPattern();
        extendedMessageFormat14.applyPattern("");
        java.text.Format[] formatArray24 = extendedMessageFormat14.getFormats();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat26 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.lang.String str27 = extendedMessageFormat26.toPattern();
        java.text.Format[] formatArray28 = extendedMessageFormat26.getFormats();
        java.lang.String str29 = extendedMessageFormat14.format((java.lang.Object) formatArray28);
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat3.setFormats(formatArray28);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray10);
        org.junit.Assert.assertArrayEquals(formatArray10, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(attributedCharacterIterator11);
        org.junit.Assert.assertNotNull(formatArray12);
        org.junit.Assert.assertArrayEquals(formatArray12, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(formatArray18);
        org.junit.Assert.assertArrayEquals(formatArray18, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertArrayEquals(objArray20, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(formatArray24);
        org.junit.Assert.assertArrayEquals(formatArray24, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(formatArray28);
        org.junit.Assert.assertArrayEquals(formatArray28, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test3555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3555");
        java.util.Locale locale2 = null;
        java.util.Map map3 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale2, map3);
        extendedMessageFormat4.applyPattern("hi!");
        java.lang.String str7 = extendedMessageFormat4.toPattern();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale12 = extendedMessageFormat11.getLocale();
        java.util.Map map13 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale12, map13);
        java.util.Map map15 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat16 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale12, map15);
        extendedMessageFormat4.setLocale(locale12);
        java.util.Map map18 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat19 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale12, map18);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat29 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale30 = extendedMessageFormat29.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat31 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale30);
        java.util.Map map32 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat33 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale30, map32);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat34 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale30);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat35 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale30);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat36 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale30);
        java.util.Map map37 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat38 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale30, map37);
        java.util.Map map39 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat40 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale30, map39);
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat19.setFormat(10, (java.text.Format) extendedMessageFormat40);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "th_TH");
    }

    @Test
    public void test3556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3556");
        java.util.Locale locale2 = null;
        java.util.Map map3 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale2, map3);
        java.text.Format[] formatArray5 = extendedMessageFormat4.getFormatsByArgumentIndex();
        java.text.Format[] formatArray6 = extendedMessageFormat4.getFormats();
        extendedMessageFormat4.applyPattern("");
        java.util.Locale locale9 = extendedMessageFormat4.getLocale();
        java.util.Locale locale11 = null;
        java.util.Map map12 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale11, map12);
        java.text.Format[] formatArray14 = extendedMessageFormat13.getFormats();
        extendedMessageFormat13.applyPattern("");
        java.util.Map map19 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat20 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map19);
        extendedMessageFormat20.applyPattern("");
        java.util.Locale locale23 = extendedMessageFormat20.getLocale();
        java.util.Map map24 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat25 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale23, map24);
        extendedMessageFormat13.setLocale(locale23);
        extendedMessageFormat4.setLocale(locale23);
        java.util.Map map28 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat29 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale23, map28);
        java.text.Format[] formatArray30 = extendedMessageFormat29.getFormats();
        extendedMessageFormat29.applyPattern("hi!");
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale9);
        org.junit.Assert.assertNotNull(formatArray14);
        org.junit.Assert.assertArrayEquals(formatArray14, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray30);
        org.junit.Assert.assertArrayEquals(formatArray30, new java.text.Format[] {});
    }

    @Test
    public void test3557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3557");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale4);
        extendedMessageFormat5.applyPattern("hi!");
        java.text.Format[] formatArray8 = extendedMessageFormat5.getFormatsByArgumentIndex();
        java.util.Map map12 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map12);
        extendedMessageFormat13.applyPattern("");
        java.util.Locale locale16 = extendedMessageFormat13.getLocale();
        java.util.Map map17 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat18 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale16, map17);
        java.util.Map map19 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat20 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale16, map19);
        extendedMessageFormat5.setLocale(locale16);
        java.util.Locale locale22 = extendedMessageFormat5.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat23 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale22);
        java.util.Locale locale24 = extendedMessageFormat23.getLocale();
        java.text.Format[] formatArray25 = extendedMessageFormat23.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj27 = extendedMessageFormat23.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray8);
        org.junit.Assert.assertArrayEquals(formatArray8, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray25);
        org.junit.Assert.assertArrayEquals(formatArray25, new java.text.Format[] {});
    }

    @Test
    public void test3558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3558");
        java.util.Map map5 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map5);
        extendedMessageFormat6.applyPattern("");
        java.util.Locale locale9 = extendedMessageFormat6.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale9);
        java.util.Map map11 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale9, map11);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale9);
        java.util.Map map14 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat15 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale9, map14);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "th_TH");
    }

    @Test
    public void test3559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3559");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map2);
        java.lang.String str4 = extendedMessageFormat3.toPattern();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.lang.String str7 = extendedMessageFormat6.toPattern();
        java.text.Format[] formatArray8 = extendedMessageFormat6.getFormats();
        java.util.Locale locale9 = extendedMessageFormat6.getLocale();
        extendedMessageFormat3.setLocale(locale9);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale9);
        java.util.Locale locale12 = extendedMessageFormat11.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat15 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.lang.String str16 = extendedMessageFormat15.toPattern();
        java.text.Format[] formatArray17 = extendedMessageFormat15.getFormats();
        java.util.Locale locale18 = extendedMessageFormat15.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat19 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale18);
        java.text.Format[] formatArray20 = extendedMessageFormat19.getFormatsByArgumentIndex();
        java.text.Format[] formatArray21 = extendedMessageFormat19.getFormats();
        java.lang.Object[] objArray23 = extendedMessageFormat19.parse("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = extendedMessageFormat11.format((java.lang.Object) extendedMessageFormat19);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(formatArray8);
        org.junit.Assert.assertArrayEquals(formatArray8, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(formatArray17);
        org.junit.Assert.assertArrayEquals(formatArray17, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray20);
        org.junit.Assert.assertArrayEquals(formatArray20, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray21);
        org.junit.Assert.assertArrayEquals(formatArray21, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertArrayEquals(objArray23, new java.lang.Object[] {});
    }

    @Test
    public void test3560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3560");
        java.util.Map map5 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map5);
        extendedMessageFormat6.applyPattern("");
        java.util.Locale locale9 = extendedMessageFormat6.getLocale();
        java.util.Map map10 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale9, map10);
        java.util.Map map12 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale9, map12);
        java.util.Locale locale14 = extendedMessageFormat13.getLocale();
        java.util.Map map15 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat16 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale14, map15);
        java.util.Map map17 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat18 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale14, map17);
        java.lang.String str19 = extendedMessageFormat18.toPattern();
        extendedMessageFormat18.applyPattern("");
        java.lang.String str22 = extendedMessageFormat18.toPattern();
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test3561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3561");
        java.util.Map map3 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map3);
        extendedMessageFormat4.applyPattern("");
        java.util.Locale locale7 = extendedMessageFormat4.getLocale();
        java.util.Map map8 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale7, map8);
        java.util.Map map10 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale7, map10);
        java.lang.String str12 = extendedMessageFormat11.toPattern();
        java.lang.String str13 = extendedMessageFormat11.toPattern();
        java.util.Locale locale16 = null;
        java.util.Map map17 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat18 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale16, map17);
        java.text.Format[] formatArray19 = extendedMessageFormat18.getFormatsByArgumentIndex();
        java.text.Format[] formatArray20 = extendedMessageFormat18.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat11.setFormat((int) (short) 100, (java.text.Format) extendedMessageFormat18);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(formatArray19);
        org.junit.Assert.assertArrayEquals(formatArray19, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray20);
        org.junit.Assert.assertArrayEquals(formatArray20, new java.text.Format[] {});
    }

    @Test
    public void test3562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3562");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.util.Locale locale5 = null;
        extendedMessageFormat3.setLocale(locale5);
        java.lang.String str7 = extendedMessageFormat3.toPattern();
        java.util.Locale locale9 = null;
        java.util.Map map10 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale9, map10);
        java.text.Format[] formatArray12 = extendedMessageFormat11.getFormatsByArgumentIndex();
        java.lang.String str13 = extendedMessageFormat11.toPattern();
        extendedMessageFormat11.applyPattern("hi!");
        java.text.Format[] formatArray16 = extendedMessageFormat11.getFormats();
        java.lang.Object obj17 = null;
        java.lang.String str18 = extendedMessageFormat11.format(obj17);
        java.lang.String str19 = extendedMessageFormat11.toPattern();
        java.lang.StringBuffer stringBuffer20 = null;
        java.text.FieldPosition fieldPosition21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer22 = extendedMessageFormat3.format((java.lang.Object) str19, stringBuffer20, fieldPosition21);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.String cannot be cast to class [Ljava.lang.Object; (java.lang.String and [Ljava.lang.Object; are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(formatArray12);
        org.junit.Assert.assertArrayEquals(formatArray12, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(formatArray16);
        org.junit.Assert.assertArrayEquals(formatArray16, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test3563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3563");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        extendedMessageFormat3.applyPattern("hi!");
        extendedMessageFormat3.applyPattern("");
        java.text.Format[] formatArray8 = extendedMessageFormat3.getFormats();
        org.junit.Assert.assertNotNull(formatArray8);
        org.junit.Assert.assertArrayEquals(formatArray8, new java.text.Format[] {});
    }

    @Test
    public void test3564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3564");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale3);
        extendedMessageFormat4.applyPattern("hi!");
        java.text.Format[] formatArray7 = extendedMessageFormat4.getFormatsByArgumentIndex();
        java.util.Map map11 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map11);
        extendedMessageFormat12.applyPattern("");
        java.util.Locale locale15 = extendedMessageFormat12.getLocale();
        java.util.Map map16 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat17 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale15, map16);
        java.util.Map map18 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat19 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale15, map18);
        extendedMessageFormat4.setLocale(locale15);
        java.text.Format[] formatArray21 = extendedMessageFormat4.getFormatsByArgumentIndex();
        java.text.Format[] formatArray22 = extendedMessageFormat4.getFormats();
        extendedMessageFormat4.applyPattern("hi!");
        java.text.Format[] formatArray25 = extendedMessageFormat4.getFormats();
        java.text.Format[] formatArray26 = null;
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat4.setFormats(formatArray26);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray21);
        org.junit.Assert.assertArrayEquals(formatArray21, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray22);
        org.junit.Assert.assertArrayEquals(formatArray22, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray25);
        org.junit.Assert.assertArrayEquals(formatArray25, new java.text.Format[] {});
    }

    @Test
    public void test3565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3565");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale8 = extendedMessageFormat7.getLocale();
        java.util.Map map9 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale8, map9);
        java.util.Map map11 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale8, map11);
        java.util.Map map13 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale8, map13);
        java.util.Map map15 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat16 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale8, map15);
        java.util.Map map17 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat18 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale8, map17);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat19 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray21 = extendedMessageFormat19.parse("hi!");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "th_TH");
    }

    @Test
    public void test3566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3566");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale7 = extendedMessageFormat6.getLocale();
        java.util.Map map8 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale7, map8);
        java.util.Map map10 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale7, map10);
        java.util.Map map12 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale7, map12);
        java.util.Locale locale14 = extendedMessageFormat13.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat15 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale14);
        java.util.Map map18 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat19 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map18);
        java.lang.String str20 = extendedMessageFormat19.toPattern();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat22 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.lang.String str23 = extendedMessageFormat22.toPattern();
        java.text.Format[] formatArray24 = extendedMessageFormat22.getFormats();
        java.util.Locale locale25 = extendedMessageFormat22.getLocale();
        extendedMessageFormat19.setLocale(locale25);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat27 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale25);
        extendedMessageFormat15.setLocale(locale25);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat29 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale25);
        java.util.Locale locale31 = null;
        java.util.Map map32 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat33 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale31, map32);
        java.text.Format[] formatArray34 = extendedMessageFormat33.getFormatsByArgumentIndex();
        java.lang.String str35 = extendedMessageFormat33.toPattern();
        extendedMessageFormat33.applyPattern("");
        extendedMessageFormat33.applyPattern("");
        java.util.Map map43 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat44 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map43);
        extendedMessageFormat44.applyPattern("");
        java.util.Locale locale47 = extendedMessageFormat44.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat48 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale47);
        java.util.Map map49 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat50 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale47, map49);
        java.lang.String str51 = extendedMessageFormat50.toPattern();
        java.util.Locale locale52 = extendedMessageFormat50.getLocale();
        extendedMessageFormat33.setLocale(locale52);
        java.lang.Class<?> wildcardClass54 = extendedMessageFormat33.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str55 = extendedMessageFormat29.format((java.lang.Object) wildcardClass54);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(formatArray24);
        org.junit.Assert.assertArrayEquals(formatArray24, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray34);
        org.junit.Assert.assertArrayEquals(formatArray34, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "th_TH");
        org.junit.Assert.assertNotNull(wildcardClass54);
    }

    @Test
    public void test3567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3567");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale3 = null;
        extendedMessageFormat2.setLocale(locale3);
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.util.Locale locale7 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale7);
        java.text.Format[] formatArray9 = extendedMessageFormat8.getFormats();
        java.text.Format[] formatArray10 = extendedMessageFormat8.getFormats();
        java.util.Map map13 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map13);
        java.lang.String str15 = extendedMessageFormat14.toPattern();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat17 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.lang.String str18 = extendedMessageFormat17.toPattern();
        java.text.Format[] formatArray19 = extendedMessageFormat17.getFormats();
        java.util.Locale locale20 = extendedMessageFormat17.getLocale();
        extendedMessageFormat14.setLocale(locale20);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat22 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale20);
        extendedMessageFormat8.setLocale(locale20);
        extendedMessageFormat2.setLocale(locale20);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat25 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale20);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat34 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale35 = extendedMessageFormat34.getLocale();
        java.util.Map map36 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat37 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale35, map36);
        java.util.Map map38 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat39 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale35, map38);
        java.util.Map map40 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat41 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale35, map40);
        java.util.Map map42 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat43 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale35, map42);
        java.util.Locale locale44 = extendedMessageFormat43.getLocale();
        java.util.Locale locale46 = null;
        java.util.Map map47 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat48 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale46, map47);
        java.text.Format[] formatArray49 = extendedMessageFormat48.getFormats();
        extendedMessageFormat48.applyPattern("");
        java.util.Map map54 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat55 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map54);
        extendedMessageFormat55.applyPattern("");
        java.util.Locale locale58 = extendedMessageFormat55.getLocale();
        java.util.Map map59 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat60 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale58, map59);
        extendedMessageFormat48.setLocale(locale58);
        extendedMessageFormat43.setLocale(locale58);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat63 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale58);
        java.util.Map map64 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat65 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale58, map64);
        java.text.Format[] formatArray66 = extendedMessageFormat65.getFormats();
        java.text.Format[] formatArray67 = extendedMessageFormat65.getFormats();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat25.setFormat((int) (short) -1, (java.text.Format) extendedMessageFormat65);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray9);
        org.junit.Assert.assertArrayEquals(formatArray9, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray10);
        org.junit.Assert.assertArrayEquals(formatArray10, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(formatArray19);
        org.junit.Assert.assertArrayEquals(formatArray19, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray49);
        org.junit.Assert.assertArrayEquals(formatArray49, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale58);
        org.junit.Assert.assertEquals(locale58.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray66);
        org.junit.Assert.assertArrayEquals(formatArray66, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray67);
        org.junit.Assert.assertArrayEquals(formatArray67, new java.text.Format[] {});
    }

    @Test
    public void test3568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3568");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale4 = null;
        extendedMessageFormat3.setLocale(locale4);
        java.lang.String str6 = extendedMessageFormat3.toPattern();
        java.text.Format[] formatArray7 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.text.Format[] formatArray8 = extendedMessageFormat3.getFormats();
        java.lang.String str9 = java.text.MessageFormat.format("hi!", (java.lang.Object[]) formatArray8);
        java.lang.String str10 = java.text.MessageFormat.format("hi!", (java.lang.Object[]) formatArray8);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray8);
        org.junit.Assert.assertArrayEquals(formatArray8, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test3569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3569");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        java.util.Map map5 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale4, map5);
        java.util.Map map7 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale4, map7);
        java.lang.String str9 = extendedMessageFormat8.toPattern();
        java.util.Locale locale14 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat15 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale14);
        java.text.Format[] formatArray16 = extendedMessageFormat15.getFormats();
        java.text.Format[] formatArray17 = extendedMessageFormat15.getFormats();
        java.util.Map map20 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat21 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map20);
        java.lang.String str22 = extendedMessageFormat21.toPattern();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat24 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.lang.String str25 = extendedMessageFormat24.toPattern();
        java.text.Format[] formatArray26 = extendedMessageFormat24.getFormats();
        java.util.Locale locale27 = extendedMessageFormat24.getLocale();
        extendedMessageFormat21.setLocale(locale27);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat29 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale27);
        extendedMessageFormat15.setLocale(locale27);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat32 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale33 = null;
        extendedMessageFormat32.setLocale(locale33);
        java.util.Locale locale35 = extendedMessageFormat32.getLocale();
        java.text.Format[] formatArray36 = extendedMessageFormat32.getFormats();
        java.text.Format[] formatArray37 = extendedMessageFormat32.getFormatsByArgumentIndex();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat41 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale42 = extendedMessageFormat41.getLocale();
        java.util.Map map43 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat44 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale42, map43);
        java.util.Map map45 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat46 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale42, map45);
        extendedMessageFormat32.setLocale(locale42);
        extendedMessageFormat15.setLocale(locale42);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat49 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale42);
        java.util.Locale locale50 = extendedMessageFormat49.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat51 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale50);
        java.util.Map map52 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat53 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale50, map52);
        java.text.Format[] formatArray54 = extendedMessageFormat53.getFormats();
        java.text.AttributedCharacterIterator attributedCharacterIterator55 = extendedMessageFormat8.formatToCharacterIterator((java.lang.Object) formatArray54);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj57 = extendedMessageFormat8.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(formatArray16);
        org.junit.Assert.assertArrayEquals(formatArray16, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray17);
        org.junit.Assert.assertArrayEquals(formatArray17, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(formatArray26);
        org.junit.Assert.assertArrayEquals(formatArray26, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "th_TH");
        org.junit.Assert.assertNull(locale35);
        org.junit.Assert.assertNotNull(formatArray36);
        org.junit.Assert.assertArrayEquals(formatArray36, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray37);
        org.junit.Assert.assertArrayEquals(formatArray37, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray54);
        org.junit.Assert.assertArrayEquals(formatArray54, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(attributedCharacterIterator55);
    }

    @Test
    public void test3570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3570");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale11 = extendedMessageFormat10.getLocale();
        java.util.Map map12 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale11, map12);
        java.util.Map map14 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat15 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale11, map14);
        java.util.Map map16 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat17 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale11, map16);
        java.util.Locale locale18 = extendedMessageFormat17.getLocale();
        java.util.Map map19 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat20 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale18, map19);
        java.util.Map map21 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat22 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale18, map21);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat23 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale18);
        java.util.Map map24 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat25 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale18, map24);
        java.util.Map map26 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat27 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale18, map26);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat28 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale18);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat36 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale37 = extendedMessageFormat36.getLocale();
        java.util.Map map38 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat39 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale37, map38);
        java.util.Map map40 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat41 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale37, map40);
        java.util.Map map42 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat43 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale37, map42);
        java.util.Map map44 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat45 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale37, map44);
        java.util.Locale locale46 = extendedMessageFormat45.getLocale();
        java.util.Locale locale48 = null;
        java.util.Map map49 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat50 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale48, map49);
        java.text.Format[] formatArray51 = extendedMessageFormat50.getFormats();
        extendedMessageFormat50.applyPattern("");
        java.util.Map map56 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat57 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map56);
        extendedMessageFormat57.applyPattern("");
        java.util.Locale locale60 = extendedMessageFormat57.getLocale();
        java.util.Map map61 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat62 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale60, map61);
        extendedMessageFormat50.setLocale(locale60);
        extendedMessageFormat45.setLocale(locale60);
        java.text.Format[] formatArray65 = extendedMessageFormat45.getFormats();
        extendedMessageFormat45.applyPattern("hi!");
        java.util.Locale locale68 = extendedMessageFormat45.getLocale();
        java.util.Map map69 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat70 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale68, map69);
        java.text.Format[] formatArray71 = extendedMessageFormat70.getFormatsByArgumentIndex();
        extendedMessageFormat70.applyPattern("hi!");
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat28.setFormatByArgumentIndex((int) 'a', (java.text.Format) extendedMessageFormat70);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray51);
        org.junit.Assert.assertArrayEquals(formatArray51, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale60);
        org.junit.Assert.assertEquals(locale60.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray65);
        org.junit.Assert.assertArrayEquals(formatArray65, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale68);
        org.junit.Assert.assertEquals(locale68.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray71);
        org.junit.Assert.assertArrayEquals(formatArray71, new java.text.Format[] {});
    }

    @Test
    public void test3571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3571");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        java.util.Map map5 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale4, map5);
        java.util.Locale locale7 = extendedMessageFormat6.getLocale();
        java.util.Map map8 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale7, map8);
        java.util.Locale locale10 = extendedMessageFormat9.getLocale();
        java.text.Format[] formatArray11 = extendedMessageFormat9.getFormats();
        java.lang.Object obj12 = extendedMessageFormat9.clone();
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray11);
        org.junit.Assert.assertArrayEquals(formatArray11, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(obj12);
    }

    @Test
    public void test3572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3572");
        java.util.Locale locale1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormats();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormats();
        java.util.Map map7 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map7);
        java.lang.String str9 = extendedMessageFormat8.toPattern();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.lang.String str12 = extendedMessageFormat11.toPattern();
        java.text.Format[] formatArray13 = extendedMessageFormat11.getFormats();
        java.util.Locale locale14 = extendedMessageFormat11.getLocale();
        extendedMessageFormat8.setLocale(locale14);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat16 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale14);
        extendedMessageFormat2.setLocale(locale14);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat19 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale20 = null;
        extendedMessageFormat19.setLocale(locale20);
        java.util.Locale locale22 = extendedMessageFormat19.getLocale();
        java.text.Format[] formatArray23 = extendedMessageFormat19.getFormats();
        java.text.Format[] formatArray24 = extendedMessageFormat19.getFormatsByArgumentIndex();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat28 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale29 = extendedMessageFormat28.getLocale();
        java.util.Map map30 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat31 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale29, map30);
        java.util.Map map32 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat33 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale29, map32);
        extendedMessageFormat19.setLocale(locale29);
        extendedMessageFormat2.setLocale(locale29);
        java.lang.String str36 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray37 = extendedMessageFormat2.getFormats();
        java.util.Locale locale38 = extendedMessageFormat2.getLocale();
        java.util.Locale locale39 = extendedMessageFormat2.getLocale();
        org.junit.Assert.assertNotNull(formatArray3);
        org.junit.Assert.assertArrayEquals(formatArray3, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(formatArray13);
        org.junit.Assert.assertArrayEquals(formatArray13, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "th_TH");
        org.junit.Assert.assertNull(locale22);
        org.junit.Assert.assertNotNull(formatArray23);
        org.junit.Assert.assertArrayEquals(formatArray23, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray24);
        org.junit.Assert.assertArrayEquals(formatArray24, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertNotNull(formatArray37);
        org.junit.Assert.assertArrayEquals(formatArray37, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "th_TH");
    }

    @Test
    public void test3573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3573");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale6 = extendedMessageFormat5.getLocale();
        java.util.Map map7 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale6, map7);
        java.util.Map map9 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale6, map9);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale6);
        java.util.Map map12 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale6, map12);
        extendedMessageFormat13.applyPattern("hi!");
        java.util.Locale locale16 = extendedMessageFormat13.getLocale();
        java.lang.Object[] objArray18 = extendedMessageFormat13.parse("hi!");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "th_TH");
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertArrayEquals(objArray18, new java.lang.Object[] {});
    }

    @Test
    public void test3574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3574");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.lang.String str4 = extendedMessageFormat1.toPattern();
        java.text.Format[] formatArray5 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.util.Locale locale6 = extendedMessageFormat1.getLocale();
        java.util.Locale locale7 = extendedMessageFormat1.getLocale();
        java.util.Map map11 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map11);
        extendedMessageFormat12.applyPattern("");
        java.util.Locale locale15 = extendedMessageFormat12.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat16 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale15);
        java.text.Format[] formatArray17 = extendedMessageFormat16.getFormatsByArgumentIndex();
        extendedMessageFormat16.applyPattern("");
        java.util.Locale locale20 = extendedMessageFormat16.getLocale();
        java.util.Map map21 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat22 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale20, map21);
        extendedMessageFormat1.setLocale(locale20);
        extendedMessageFormat1.applyPattern("hi!");
        java.text.Format[] formatArray26 = extendedMessageFormat1.getFormatsByArgumentIndex();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat33 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale34 = extendedMessageFormat33.getLocale();
        java.util.Map map35 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat36 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale34, map35);
        java.util.Map map37 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat38 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale34, map37);
        java.util.Locale locale39 = extendedMessageFormat38.getLocale();
        java.util.Map map40 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat41 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale39, map40);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat42 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale39);
        java.text.Format[] formatArray43 = extendedMessageFormat42.getFormats();
        java.lang.String str44 = java.text.MessageFormat.format("hi!", (java.lang.Object[]) formatArray43);
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat1.setFormats(formatArray43);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale6);
        org.junit.Assert.assertNull(locale7);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray17);
        org.junit.Assert.assertArrayEquals(formatArray17, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray26);
        org.junit.Assert.assertArrayEquals(formatArray26, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray43);
        org.junit.Assert.assertArrayEquals(formatArray43, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
    }

    @Test
    public void test3575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3575");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.lang.String str3 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormats();
        java.util.Locale locale5 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale5);
        java.text.Format[] formatArray7 = extendedMessageFormat6.getFormatsByArgumentIndex();
        java.text.Format[] formatArray8 = extendedMessageFormat6.getFormatsByArgumentIndex();
        extendedMessageFormat6.applyPattern("");
        java.text.Format[] formatArray11 = extendedMessageFormat6.getFormatsByArgumentIndex();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray8);
        org.junit.Assert.assertArrayEquals(formatArray8, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray11);
        org.junit.Assert.assertArrayEquals(formatArray11, new java.text.Format[] {});
    }

    @Test
    public void test3576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3576");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray5 = extendedMessageFormat4.getFormats();
        java.util.Locale locale6 = extendedMessageFormat4.getLocale();
        java.util.Map map7 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale6, map7);
        java.util.Locale locale9 = extendedMessageFormat8.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale9);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale9);
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "th_TH");
    }

    @Test
    public void test3577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3577");
        java.util.Map map5 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map5);
        extendedMessageFormat6.applyPattern("");
        java.util.Locale locale9 = extendedMessageFormat6.getLocale();
        java.util.Map map10 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale9, map10);
        java.util.Map map12 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale9, map12);
        java.util.Locale locale14 = extendedMessageFormat13.getLocale();
        java.util.Map map15 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat16 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale14, map15);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat17 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale14);
        java.lang.String str18 = extendedMessageFormat17.toPattern();
        java.text.Format[] formatArray19 = extendedMessageFormat17.getFormatsByArgumentIndex();
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(formatArray19);
        org.junit.Assert.assertArrayEquals(formatArray19, new java.text.Format[] {});
    }

    @Test
    public void test3578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3578");
        java.util.Map map7 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map7);
        java.lang.String str9 = extendedMessageFormat8.toPattern();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.lang.String str12 = extendedMessageFormat11.toPattern();
        java.text.Format[] formatArray13 = extendedMessageFormat11.getFormats();
        java.util.Locale locale14 = extendedMessageFormat11.getLocale();
        extendedMessageFormat8.setLocale(locale14);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat16 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale14);
        java.util.Map map17 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat18 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale14, map17);
        java.util.Map map19 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat20 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale14, map19);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat21 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale14);
        java.util.Map map22 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat23 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale14, map22);
        java.util.Map map24 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat25 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale14, map24);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(formatArray13);
        org.junit.Assert.assertArrayEquals(formatArray13, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "th_TH");
    }

    @Test
    public void test3579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3579");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale9 = extendedMessageFormat8.getLocale();
        java.util.Map map10 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale9, map10);
        java.util.Map map12 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale9, map12);
        java.util.Map map14 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat15 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale9, map14);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat16 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale9);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat17 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale9);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat18 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale9);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat19 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale9);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "th_TH");
    }

    @Test
    public void test3580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3580");
        java.util.Map map6 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map6);
        extendedMessageFormat7.applyPattern("");
        java.util.Locale locale10 = extendedMessageFormat7.getLocale();
        java.util.Map map11 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale10, map11);
        java.util.Map map13 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale10, map13);
        java.util.Locale locale15 = extendedMessageFormat14.getLocale();
        java.util.Map map16 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat17 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale15, map16);
        java.util.Map map18 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat19 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale15, map18);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat20 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale15);
        java.lang.String str21 = extendedMessageFormat20.toPattern();
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test3581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3581");
        java.util.Locale locale2 = null;
        java.util.Map map3 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale2, map3);
        java.text.Format[] formatArray5 = extendedMessageFormat4.getFormats();
        extendedMessageFormat4.applyPattern("hi!");
        java.text.Format[] formatArray8 = extendedMessageFormat4.getFormats();
        java.text.Format[] formatArray9 = extendedMessageFormat4.getFormatsByArgumentIndex();
        java.lang.String str10 = java.text.MessageFormat.format("hi!", (java.lang.Object[]) formatArray9);
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray8);
        org.junit.Assert.assertArrayEquals(formatArray8, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray9);
        org.junit.Assert.assertArrayEquals(formatArray9, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test3582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3582");
        java.util.Locale locale3 = null;
        java.util.Map map4 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale3, map4);
        java.text.Format[] formatArray6 = extendedMessageFormat5.getFormats();
        extendedMessageFormat5.applyPattern("");
        java.util.Map map11 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map11);
        extendedMessageFormat12.applyPattern("");
        java.util.Locale locale15 = extendedMessageFormat12.getLocale();
        java.util.Map map16 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat17 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale15, map16);
        extendedMessageFormat5.setLocale(locale15);
        java.util.Map map19 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat20 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale15, map19);
        java.util.Map map21 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat22 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale15, map21);
        java.util.Locale locale23 = extendedMessageFormat22.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj25 = extendedMessageFormat22.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "th_TH");
    }

    @Test
    public void test3583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3583");
        java.util.Locale locale2 = null;
        java.util.Map map3 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale2, map3);
        java.text.Format[] formatArray5 = extendedMessageFormat4.getFormatsByArgumentIndex();
        java.lang.String str6 = extendedMessageFormat4.toPattern();
        extendedMessageFormat4.applyPattern("hi!");
        java.text.Format[] formatArray9 = extendedMessageFormat4.getFormatsByArgumentIndex();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale13 = extendedMessageFormat12.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale13);
        extendedMessageFormat14.applyPattern("hi!");
        java.text.Format[] formatArray17 = extendedMessageFormat14.getFormatsByArgumentIndex();
        java.util.Map map21 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat22 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map21);
        extendedMessageFormat22.applyPattern("");
        java.util.Locale locale25 = extendedMessageFormat22.getLocale();
        java.util.Map map26 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat27 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale25, map26);
        java.util.Map map28 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat29 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale25, map28);
        extendedMessageFormat14.setLocale(locale25);
        java.util.Locale locale31 = extendedMessageFormat14.getLocale();
        extendedMessageFormat4.setLocale(locale31);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat33 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale31);
        java.lang.Object[] objArray35 = extendedMessageFormat33.parse("hi!");
        java.text.Format[] formatArray36 = extendedMessageFormat33.getFormats();
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(formatArray9);
        org.junit.Assert.assertArrayEquals(formatArray9, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray17);
        org.junit.Assert.assertArrayEquals(formatArray17, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "th_TH");
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertArrayEquals(objArray35, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(formatArray36);
        org.junit.Assert.assertArrayEquals(formatArray36, new java.text.Format[] {});
    }

    @Test
    public void test3584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3584");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale7 = extendedMessageFormat6.getLocale();
        java.util.Map map8 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale7, map8);
        java.util.Map map10 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale7, map10);
        java.util.Map map12 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale7, map12);
        java.util.Map map14 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat15 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale7, map14);
        java.util.Locale locale16 = extendedMessageFormat15.getLocale();
        java.util.Locale locale18 = null;
        java.util.Map map19 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat20 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale18, map19);
        java.text.Format[] formatArray21 = extendedMessageFormat20.getFormats();
        extendedMessageFormat20.applyPattern("");
        java.util.Map map26 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat27 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map26);
        extendedMessageFormat27.applyPattern("");
        java.util.Locale locale30 = extendedMessageFormat27.getLocale();
        java.util.Map map31 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat32 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale30, map31);
        extendedMessageFormat20.setLocale(locale30);
        extendedMessageFormat15.setLocale(locale30);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat35 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale30);
        java.util.Map map37 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat38 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map37);
        java.util.Locale locale39 = null;
        extendedMessageFormat38.setLocale(locale39);
        java.text.Format[] formatArray41 = extendedMessageFormat38.getFormats();
        java.util.Locale locale42 = extendedMessageFormat38.getLocale();
        java.util.Locale locale44 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat45 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale44);
        java.text.Format[] formatArray46 = extendedMessageFormat45.getFormats();
        java.lang.String str47 = extendedMessageFormat38.format((java.lang.Object) formatArray46);
        java.lang.Class<?> wildcardClass48 = formatArray46.getClass();
        java.lang.StringBuffer stringBuffer49 = null;
        java.text.FieldPosition fieldPosition50 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer51 = extendedMessageFormat35.format((java.lang.Object) formatArray46, stringBuffer49, fieldPosition50);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray21);
        org.junit.Assert.assertArrayEquals(formatArray21, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray41);
        org.junit.Assert.assertArrayEquals(formatArray41, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale42);
        org.junit.Assert.assertNotNull(formatArray46);
        org.junit.Assert.assertArrayEquals(formatArray46, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test3585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3585");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.lang.String str2 = extendedMessageFormat1.toPattern();
        extendedMessageFormat1.applyPattern("hi!");
        java.lang.Object obj5 = extendedMessageFormat1.clone();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void test3586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3586");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormats();
        extendedMessageFormat3.applyPattern("hi!");
        java.lang.String str7 = extendedMessageFormat3.toPattern();
        extendedMessageFormat3.applyPattern("");
        extendedMessageFormat3.applyPattern("hi!");
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test3587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3587");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.lang.String str4 = extendedMessageFormat1.toPattern();
        java.lang.Object[] objArray6 = extendedMessageFormat1.parse("hi!");
        java.util.Locale locale9 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale9);
        java.lang.Object[] objArray12 = extendedMessageFormat10.parse("hi!");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat19 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale20 = extendedMessageFormat19.getLocale();
        java.util.Map map21 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat22 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale20, map21);
        java.util.Map map23 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat24 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale20, map23);
        java.util.Map map25 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat26 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale20, map25);
        java.util.Map map27 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat28 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale20, map27);
        java.util.Map map31 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat32 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map31);
        extendedMessageFormat32.applyPattern("");
        java.util.Locale locale35 = extendedMessageFormat32.getLocale();
        java.util.Map map36 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat37 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale35, map36);
        extendedMessageFormat28.setLocale(locale35);
        java.util.Map map39 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat40 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale35, map39);
        extendedMessageFormat10.setLocale(locale35);
        java.util.Locale locale42 = extendedMessageFormat10.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat43 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale42);
        extendedMessageFormat1.setLocale(locale42);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertArrayEquals(objArray6, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertArrayEquals(objArray12, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "th_TH");
    }

    @Test
    public void test3588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3588");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map1);
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale5 = extendedMessageFormat2.getLocale();
        java.util.Map map8 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map8);
        extendedMessageFormat9.applyPattern("");
        java.util.Locale locale12 = extendedMessageFormat9.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale12);
        extendedMessageFormat2.setLocale(locale12);
        java.text.Format[] formatArray15 = extendedMessageFormat2.getFormats();
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale18 = extendedMessageFormat2.getLocale();
        java.text.Format[] formatArray19 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray20 = extendedMessageFormat2.getFormats();
        java.util.Locale locale21 = extendedMessageFormat2.getLocale();
        java.text.Format[] formatArray22 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.util.Locale locale23 = extendedMessageFormat2.getLocale();
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray15);
        org.junit.Assert.assertArrayEquals(formatArray15, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray19);
        org.junit.Assert.assertArrayEquals(formatArray19, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray20);
        org.junit.Assert.assertArrayEquals(formatArray20, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray22);
        org.junit.Assert.assertArrayEquals(formatArray22, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "th_TH");
    }

    @Test
    public void test3589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3589");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map2);
        extendedMessageFormat3.applyPattern("");
        java.util.Locale locale6 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale6);
        java.text.Format[] formatArray8 = extendedMessageFormat7.getFormatsByArgumentIndex();
        java.text.Format[] formatArray9 = extendedMessageFormat7.getFormats();
        java.util.Locale locale11 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale11);
        java.text.Format[] formatArray13 = extendedMessageFormat12.getFormats();
        java.text.Format[] formatArray14 = extendedMessageFormat12.getFormats();
        java.text.Format[] formatArray15 = extendedMessageFormat12.getFormatsByArgumentIndex();
        java.lang.String str16 = extendedMessageFormat12.toPattern();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat21 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale22 = extendedMessageFormat21.getLocale();
        java.util.Map map23 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat24 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale22, map23);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat25 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale22);
        java.util.Map map26 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat27 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale22, map26);
        extendedMessageFormat12.setLocale(locale22);
        java.lang.Object[] objArray30 = extendedMessageFormat12.parse("hi!");
        java.util.Locale locale33 = null;
        java.util.Map map34 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat35 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale33, map34);
        extendedMessageFormat35.applyPattern("");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat43 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale44 = extendedMessageFormat43.getLocale();
        java.util.Map map45 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat46 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale44, map45);
        java.util.Map map47 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat48 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale44, map47);
        java.util.Map map49 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat50 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale44, map49);
        java.util.Locale locale51 = extendedMessageFormat50.getLocale();
        java.util.Map map52 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat53 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale51, map52);
        extendedMessageFormat35.setLocale(locale51);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat55 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale51);
        extendedMessageFormat12.setLocale(locale51);
        extendedMessageFormat7.setLocale(locale51);
        java.util.Locale locale59 = null;
        java.util.Map map60 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat61 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale59, map60);
        java.text.Format[] formatArray62 = extendedMessageFormat61.getFormatsByArgumentIndex();
        java.text.Format[] formatArray63 = extendedMessageFormat61.getFormatsByArgumentIndex();
        java.util.Locale locale65 = null;
        java.util.Map map66 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat67 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale65, map66);
        java.text.Format[] formatArray68 = extendedMessageFormat67.getFormats();
        java.text.AttributedCharacterIterator attributedCharacterIterator69 = extendedMessageFormat61.formatToCharacterIterator((java.lang.Object) formatArray68);
        java.lang.StringBuffer stringBuffer70 = null;
        java.text.FieldPosition fieldPosition71 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer72 = extendedMessageFormat7.format((java.lang.Object[]) formatArray68, stringBuffer70, fieldPosition71);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray8);
        org.junit.Assert.assertArrayEquals(formatArray8, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray9);
        org.junit.Assert.assertArrayEquals(formatArray9, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray13);
        org.junit.Assert.assertArrayEquals(formatArray13, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray14);
        org.junit.Assert.assertArrayEquals(formatArray14, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray15);
        org.junit.Assert.assertArrayEquals(formatArray15, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "th_TH");
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertArrayEquals(objArray30, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray62);
        org.junit.Assert.assertArrayEquals(formatArray62, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray63);
        org.junit.Assert.assertArrayEquals(formatArray63, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray68);
        org.junit.Assert.assertArrayEquals(formatArray68, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(attributedCharacterIterator69);
    }

    @Test
    public void test3590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3590");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale7 = extendedMessageFormat6.getLocale();
        java.util.Map map8 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale7, map8);
        java.util.Map map10 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale7, map10);
        java.util.Map map12 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale7, map12);
        java.util.Map map14 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat15 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale7, map14);
        java.util.Locale locale16 = extendedMessageFormat15.getLocale();
        java.util.Map map17 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat18 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale16, map17);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "th_TH");
    }

    @Test
    public void test3591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3591");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale5 = extendedMessageFormat4.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale5);
        java.util.Map map7 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale5, map7);
        java.util.Map map9 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale5, map9);
        java.text.Format[] formatArray11 = extendedMessageFormat10.getFormatsByArgumentIndex();
        java.text.Format[] formatArray12 = extendedMessageFormat10.getFormats();
        java.lang.String str13 = extendedMessageFormat10.toPattern();
        java.util.Map map16 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat17 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map16);
        extendedMessageFormat17.applyPattern("");
        java.util.Locale locale20 = extendedMessageFormat17.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat21 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale20);
        extendedMessageFormat21.applyPattern("hi!");
        java.text.Format[] formatArray24 = extendedMessageFormat21.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat10.setFormats(formatArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray11);
        org.junit.Assert.assertArrayEquals(formatArray11, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray12);
        org.junit.Assert.assertArrayEquals(formatArray12, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray24);
        org.junit.Assert.assertArrayEquals(formatArray24, new java.text.Format[] {});
    }

    @Test
    public void test3592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3592");
        java.util.Map map5 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map5);
        java.lang.String str7 = extendedMessageFormat6.toPattern();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.lang.String str10 = extendedMessageFormat9.toPattern();
        java.text.Format[] formatArray11 = extendedMessageFormat9.getFormats();
        java.util.Locale locale12 = extendedMessageFormat9.getLocale();
        extendedMessageFormat6.setLocale(locale12);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale12);
        java.util.Map map15 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat16 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale12, map15);
        java.util.Map map17 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat18 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale12, map17);
        java.util.Map map19 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat20 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale12, map19);
        java.util.Locale locale23 = null;
        java.util.Map map24 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat25 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale23, map24);
        java.text.Format[] formatArray26 = extendedMessageFormat25.getFormats();
        extendedMessageFormat25.applyPattern("");
        java.util.Locale locale29 = extendedMessageFormat25.getLocale();
        java.lang.String str30 = extendedMessageFormat25.toPattern();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat32 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale33 = extendedMessageFormat32.getLocale();
        extendedMessageFormat25.setLocale(locale33);
        java.util.Map map35 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat36 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale33, map35);
        java.text.Format[] formatArray37 = extendedMessageFormat36.getFormatsByArgumentIndex();
        java.lang.String str38 = extendedMessageFormat20.format((java.lang.Object) formatArray37);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(formatArray11);
        org.junit.Assert.assertArrayEquals(formatArray11, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray26);
        org.junit.Assert.assertArrayEquals(formatArray26, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray37);
        org.junit.Assert.assertArrayEquals(formatArray37, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
    }

    @Test
    public void test3593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3593");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        java.util.Map map5 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale4, map5);
        java.util.Locale locale7 = extendedMessageFormat6.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale7);
        java.text.Format[] formatArray9 = extendedMessageFormat8.getFormatsByArgumentIndex();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale13 = extendedMessageFormat12.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale13);
        extendedMessageFormat14.applyPattern("hi!");
        java.text.Format[] formatArray17 = extendedMessageFormat14.getFormatsByArgumentIndex();
        java.util.Map map21 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat22 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map21);
        extendedMessageFormat22.applyPattern("");
        java.util.Locale locale25 = extendedMessageFormat22.getLocale();
        java.util.Map map26 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat27 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale25, map26);
        java.util.Map map28 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat29 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale25, map28);
        extendedMessageFormat14.setLocale(locale25);
        java.text.Format[] formatArray31 = extendedMessageFormat14.getFormatsByArgumentIndex();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat37 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale38 = extendedMessageFormat37.getLocale();
        java.util.Map map39 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat40 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale38, map39);
        java.util.Map map41 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat42 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale38, map41);
        java.util.Map map43 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat44 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale38, map43);
        java.util.Map map45 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat46 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale38, map45);
        java.util.Locale locale47 = extendedMessageFormat46.getLocale();
        java.util.Locale locale49 = null;
        java.util.Map map50 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat51 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale49, map50);
        java.text.Format[] formatArray52 = extendedMessageFormat51.getFormats();
        extendedMessageFormat51.applyPattern("");
        java.util.Map map57 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat58 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map57);
        extendedMessageFormat58.applyPattern("");
        java.util.Locale locale61 = extendedMessageFormat58.getLocale();
        java.util.Map map62 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat63 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale61, map62);
        extendedMessageFormat51.setLocale(locale61);
        extendedMessageFormat46.setLocale(locale61);
        extendedMessageFormat14.setLocale(locale61);
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator67 = extendedMessageFormat8.formatToCharacterIterator((java.lang.Object) extendedMessageFormat14);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.lang.text.ExtendedMessageFormat cannot be cast to class [Ljava.lang.Object; (org.apache.commons.lang.text.ExtendedMessageFormat is in unnamed module of loader 'app'; [Ljava.lang.Object; is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray9);
        org.junit.Assert.assertArrayEquals(formatArray9, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray17);
        org.junit.Assert.assertArrayEquals(formatArray17, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray31);
        org.junit.Assert.assertArrayEquals(formatArray31, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray52);
        org.junit.Assert.assertArrayEquals(formatArray52, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale61);
        org.junit.Assert.assertEquals(locale61.toString(), "th_TH");
    }

    @Test
    public void test3594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3594");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale3);
        extendedMessageFormat4.applyPattern("hi!");
        java.text.Format[] formatArray7 = extendedMessageFormat4.getFormatsByArgumentIndex();
        java.util.Map map11 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map11);
        extendedMessageFormat12.applyPattern("");
        java.util.Locale locale15 = extendedMessageFormat12.getLocale();
        java.util.Map map16 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat17 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale15, map16);
        java.util.Map map18 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat19 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale15, map18);
        extendedMessageFormat4.setLocale(locale15);
        java.util.Locale locale21 = extendedMessageFormat4.getLocale();
        java.util.Locale locale22 = extendedMessageFormat4.getLocale();
        java.util.Locale locale25 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat26 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale25);
        java.text.Format[] formatArray27 = extendedMessageFormat26.getFormats();
        java.text.Format[] formatArray28 = extendedMessageFormat26.getFormats();
        java.lang.Object[] objArray30 = extendedMessageFormat26.parse("hi!");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat35 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale36 = extendedMessageFormat35.getLocale();
        java.util.Map map37 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat38 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale36, map37);
        java.util.Map map39 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat40 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale36, map39);
        java.util.Locale locale41 = extendedMessageFormat40.getLocale();
        java.util.Map map42 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat43 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale41, map42);
        extendedMessageFormat26.setLocale(locale41);
        java.util.Map map45 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat46 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale41, map45);
        java.lang.StringBuffer stringBuffer47 = null;
        java.text.FieldPosition fieldPosition48 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer49 = extendedMessageFormat4.format((java.lang.Object) extendedMessageFormat46, stringBuffer47, fieldPosition48);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.lang.text.ExtendedMessageFormat cannot be cast to class [Ljava.lang.Object; (org.apache.commons.lang.text.ExtendedMessageFormat is in unnamed module of loader 'app'; [Ljava.lang.Object; is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray27);
        org.junit.Assert.assertArrayEquals(formatArray27, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray28);
        org.junit.Assert.assertArrayEquals(formatArray28, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertArrayEquals(objArray30, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "th_TH");
    }

    @Test
    public void test3595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3595");
        java.util.Locale locale3 = null;
        java.util.Map map4 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale3, map4);
        java.text.Format[] formatArray6 = extendedMessageFormat5.getFormatsByArgumentIndex();
        java.lang.String str7 = extendedMessageFormat5.toPattern();
        extendedMessageFormat5.applyPattern("hi!");
        java.text.Format[] formatArray10 = extendedMessageFormat5.getFormatsByArgumentIndex();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale14 = extendedMessageFormat13.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat15 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale14);
        extendedMessageFormat15.applyPattern("hi!");
        java.text.Format[] formatArray18 = extendedMessageFormat15.getFormatsByArgumentIndex();
        java.util.Map map22 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat23 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map22);
        extendedMessageFormat23.applyPattern("");
        java.util.Locale locale26 = extendedMessageFormat23.getLocale();
        java.util.Map map27 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat28 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale26, map27);
        java.util.Map map29 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat30 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale26, map29);
        extendedMessageFormat15.setLocale(locale26);
        java.util.Locale locale32 = extendedMessageFormat15.getLocale();
        extendedMessageFormat5.setLocale(locale32);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat34 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale32);
        java.util.Map map35 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat36 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale32, map35);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat40 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale41 = null;
        extendedMessageFormat40.setLocale(locale41);
        java.lang.String str43 = extendedMessageFormat40.toPattern();
        java.text.Format[] formatArray44 = extendedMessageFormat40.getFormatsByArgumentIndex();
        java.lang.String str45 = java.text.MessageFormat.format("hi!", (java.lang.Object[]) formatArray44);
        java.lang.String str46 = java.text.MessageFormat.format("", (java.lang.Object[]) formatArray44);
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat36.setFormats(formatArray44);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(formatArray10);
        org.junit.Assert.assertArrayEquals(formatArray10, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray18);
        org.junit.Assert.assertArrayEquals(formatArray18, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertNotNull(formatArray44);
        org.junit.Assert.assertArrayEquals(formatArray44, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
    }

    @Test
    public void test3596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3596");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.text.Format[] formatArray4 = extendedMessageFormat1.getFormats();
        java.lang.Object[] objArray6 = extendedMessageFormat1.parse("hi!");
        java.util.Map map8 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map8);
        java.util.Locale locale10 = null;
        extendedMessageFormat9.setLocale(locale10);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray14 = extendedMessageFormat13.getFormats();
        java.text.Format[] formatArray15 = extendedMessageFormat13.getFormatsByArgumentIndex();
        java.text.AttributedCharacterIterator attributedCharacterIterator16 = extendedMessageFormat9.formatToCharacterIterator((java.lang.Object) formatArray15);
        java.lang.String str17 = extendedMessageFormat1.format((java.lang.Object) formatArray15);
        extendedMessageFormat1.applyPattern("");
        java.util.Map map25 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat26 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map25);
        extendedMessageFormat26.applyPattern("");
        java.util.Locale locale29 = extendedMessageFormat26.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat30 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale29);
        java.text.Format[] formatArray31 = extendedMessageFormat30.getFormatsByArgumentIndex();
        extendedMessageFormat30.applyPattern("");
        java.util.Locale locale34 = extendedMessageFormat30.getLocale();
        java.util.Map map35 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat36 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale34, map35);
        java.util.Locale locale37 = extendedMessageFormat36.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat38 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale37);
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat1.setFormatByArgumentIndex((int) (short) -1, (java.text.Format) extendedMessageFormat38);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertArrayEquals(objArray6, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(formatArray14);
        org.junit.Assert.assertArrayEquals(formatArray14, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray15);
        org.junit.Assert.assertArrayEquals(formatArray15, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(attributedCharacterIterator16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray31);
        org.junit.Assert.assertArrayEquals(formatArray31, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "th_TH");
    }

    @Test
    public void test3597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3597");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale8 = extendedMessageFormat7.getLocale();
        java.util.Map map9 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale8, map9);
        java.util.Map map11 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale8, map11);
        java.util.Map map13 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale8, map13);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat15 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale8);
        java.lang.String str16 = extendedMessageFormat15.toPattern();
        java.text.Format[] formatArray17 = extendedMessageFormat15.getFormats();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat23 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale24 = extendedMessageFormat23.getLocale();
        java.util.Map map25 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat26 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale24, map25);
        java.util.Map map27 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat28 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale24, map27);
        java.util.Map map29 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat30 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale24, map29);
        java.util.Locale locale31 = extendedMessageFormat30.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat32 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale31);
        java.util.Map map35 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat36 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map35);
        java.lang.String str37 = extendedMessageFormat36.toPattern();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat39 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.lang.String str40 = extendedMessageFormat39.toPattern();
        java.text.Format[] formatArray41 = extendedMessageFormat39.getFormats();
        java.util.Locale locale42 = extendedMessageFormat39.getLocale();
        extendedMessageFormat36.setLocale(locale42);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat44 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale42);
        extendedMessageFormat32.setLocale(locale42);
        extendedMessageFormat15.setLocale(locale42);
        java.util.Map map47 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat48 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale42, map47);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat49 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale42);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat56 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale57 = extendedMessageFormat56.getLocale();
        java.util.Map map58 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat59 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale57, map58);
        java.util.Map map60 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat61 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale57, map60);
        java.util.Map map62 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat63 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale57, map62);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat64 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale57);
        java.lang.String str65 = extendedMessageFormat64.toPattern();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat49.setFormat((int) (short) 1, (java.text.Format) extendedMessageFormat64);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(formatArray17);
        org.junit.Assert.assertArrayEquals(formatArray17, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(formatArray41);
        org.junit.Assert.assertArrayEquals(formatArray41, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale57);
        org.junit.Assert.assertEquals(locale57.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
    }

    @Test
    public void test3598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3598");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.lang.String str2 = extendedMessageFormat1.toPattern();
        extendedMessageFormat1.applyPattern("hi!");
        java.text.Format[] formatArray5 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.util.Locale locale6 = extendedMessageFormat1.getLocale();
        java.util.Locale locale7 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray8 = extendedMessageFormat1.getFormatsByArgumentIndex();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray8);
        org.junit.Assert.assertArrayEquals(formatArray8, new java.text.Format[] {});
    }

    @Test
    public void test3599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3599");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale9 = extendedMessageFormat8.getLocale();
        java.util.Map map10 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale9, map10);
        java.util.Map map12 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale9, map12);
        java.util.Map map14 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat15 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale9, map14);
        java.util.Map map16 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat17 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale9, map16);
        java.text.Format[] formatArray18 = extendedMessageFormat17.getFormats();
        java.util.Locale locale19 = extendedMessageFormat17.getLocale();
        java.util.Map map20 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat21 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale19, map20);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat22 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale19);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat23 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale19);
        java.lang.Object[] objArray25 = extendedMessageFormat23.parse("hi!");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray18);
        org.junit.Assert.assertArrayEquals(formatArray18, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "th_TH");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertArrayEquals(objArray25, new java.lang.Object[] {});
    }

    @Test
    public void test3600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3600");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale9 = extendedMessageFormat8.getLocale();
        java.util.Map map10 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale9, map10);
        java.util.Map map12 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale9, map12);
        java.util.Map map14 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat15 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale9, map14);
        java.util.Map map16 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat17 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale9, map16);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat18 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale9);
        java.util.Map map19 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat20 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale9, map19);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat21 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale9);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "th_TH");
    }

    @Test
    public void test3601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3601");
        java.util.Map map8 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map8);
        extendedMessageFormat9.applyPattern("");
        java.util.Locale locale12 = extendedMessageFormat9.getLocale();
        java.util.Map map13 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale12, map13);
        java.util.Map map15 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat16 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale12, map15);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat17 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale12);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat18 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale12);
        java.util.Map map19 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat20 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale12, map19);
        java.util.Map map21 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat22 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale12, map21);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat23 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale12);
        java.text.Format[] formatArray24 = extendedMessageFormat23.getFormats();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat30 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale31 = extendedMessageFormat30.getLocale();
        java.util.Map map32 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat33 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale31, map32);
        java.util.Map map34 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat35 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale31, map34);
        java.util.Map map36 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat37 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale31, map36);
        java.util.Locale locale38 = extendedMessageFormat37.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat39 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale38);
        extendedMessageFormat39.applyPattern("hi!");
        java.text.Format[] formatArray42 = extendedMessageFormat39.getFormats();
        extendedMessageFormat39.applyPattern("hi!");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat47 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray48 = extendedMessageFormat47.getFormats();
        java.text.Format[] formatArray49 = extendedMessageFormat47.getFormatsByArgumentIndex();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat55 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale56 = extendedMessageFormat55.getLocale();
        java.util.Map map57 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat58 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale56, map57);
        java.util.Map map59 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat60 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale56, map59);
        java.util.Map map61 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat62 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale56, map61);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat63 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale56);
        extendedMessageFormat47.setLocale(locale56);
        java.util.Map map65 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat66 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale56, map65);
        java.text.Format[] formatArray67 = extendedMessageFormat66.getFormats();
        java.text.Format[] formatArray68 = extendedMessageFormat66.getFormats();
        java.lang.String str69 = extendedMessageFormat39.format((java.lang.Object) formatArray68);
        java.text.Format[] formatArray70 = extendedMessageFormat39.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat23.setFormatsByArgumentIndex(formatArray70);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray24);
        org.junit.Assert.assertArrayEquals(formatArray24, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray42);
        org.junit.Assert.assertArrayEquals(formatArray42, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray48);
        org.junit.Assert.assertArrayEquals(formatArray48, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray49);
        org.junit.Assert.assertArrayEquals(formatArray49, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale56);
        org.junit.Assert.assertEquals(locale56.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray67);
        org.junit.Assert.assertArrayEquals(formatArray67, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray68);
        org.junit.Assert.assertArrayEquals(formatArray68, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "hi!" + "'", str69, "hi!");
        org.junit.Assert.assertNotNull(formatArray70);
        org.junit.Assert.assertArrayEquals(formatArray70, new java.text.Format[] {});
    }

    @Test
    public void test3602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3602");
        java.util.Locale locale3 = null;
        java.util.Map map4 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale3, map4);
        java.text.Format[] formatArray6 = extendedMessageFormat5.getFormats();
        extendedMessageFormat5.applyPattern("");
        java.text.Format[] formatArray9 = extendedMessageFormat5.getFormats();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat15 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale16 = extendedMessageFormat15.getLocale();
        java.util.Map map17 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat18 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale16, map17);
        java.util.Map map19 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat20 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale16, map19);
        java.util.Map map21 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat22 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale16, map21);
        java.util.Map map23 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat24 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale16, map23);
        java.util.Locale locale25 = extendedMessageFormat24.getLocale();
        extendedMessageFormat5.setLocale(locale25);
        java.util.Map map27 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat28 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale25, map27);
        java.util.Locale locale29 = extendedMessageFormat28.getLocale();
        java.util.Map map30 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat31 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale29, map30);
        extendedMessageFormat31.applyPattern("");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat35 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale36 = extendedMessageFormat35.getLocale();
        java.text.Format[] formatArray37 = extendedMessageFormat35.getFormats();
        java.text.Format[] formatArray38 = extendedMessageFormat35.getFormatsByArgumentIndex();
        java.util.Locale locale39 = extendedMessageFormat35.getLocale();
        java.lang.String str40 = extendedMessageFormat35.toPattern();
        java.lang.StringBuffer stringBuffer41 = null;
        java.text.FieldPosition fieldPosition42 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer43 = extendedMessageFormat31.format((java.lang.Object) extendedMessageFormat35, stringBuffer41, fieldPosition42);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.lang.text.ExtendedMessageFormat cannot be cast to class [Ljava.lang.Object; (org.apache.commons.lang.text.ExtendedMessageFormat is in unnamed module of loader 'app'; [Ljava.lang.Object; is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray9);
        org.junit.Assert.assertArrayEquals(formatArray9, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray37);
        org.junit.Assert.assertArrayEquals(formatArray37, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray38);
        org.junit.Assert.assertArrayEquals(formatArray38, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
    }

    @Test
    public void test3603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3603");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        java.util.Map map8 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map8);
        extendedMessageFormat9.applyPattern("");
        java.util.Locale locale12 = extendedMessageFormat9.getLocale();
        java.util.Map map13 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale12, map13);
        java.util.Map map15 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat16 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale12, map15);
        java.util.Locale locale17 = extendedMessageFormat16.getLocale();
        extendedMessageFormat16.applyPattern("hi!");
        java.util.Locale locale20 = extendedMessageFormat16.getLocale();
        extendedMessageFormat2.setLocale(locale20);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat25 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale26 = extendedMessageFormat25.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat27 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale26);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat28 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale26);
        java.util.Locale locale29 = extendedMessageFormat28.getLocale();
        extendedMessageFormat2.setLocale(locale29);
        java.util.Map map31 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat32 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale29, map31);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "th_TH");
    }

    @Test
    public void test3604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3604");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.lang.String str2 = extendedMessageFormat1.toPattern();
        extendedMessageFormat1.applyPattern("hi!");
        java.text.Format[] formatArray5 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.util.Locale locale6 = extendedMessageFormat1.getLocale();
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray9 = extendedMessageFormat1.parse("", parsePosition8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
    }

    @Test
    public void test3605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3605");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map1);
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale5 = extendedMessageFormat2.getLocale();
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray9 = extendedMessageFormat2.parse("", parsePosition8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
    }

    @Test
    public void test3606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3606");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.text.Format[] formatArray5 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.util.Locale locale7 = null;
        java.util.Map map8 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale7, map8);
        java.text.Format[] formatArray10 = extendedMessageFormat9.getFormats();
        java.text.AttributedCharacterIterator attributedCharacterIterator11 = extendedMessageFormat3.formatToCharacterIterator((java.lang.Object) formatArray10);
        extendedMessageFormat3.applyPattern("");
        java.text.Format[] formatArray14 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.lang.String str15 = extendedMessageFormat3.toPattern();
        java.text.ParsePosition parsePosition17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray18 = extendedMessageFormat3.parse("", parsePosition17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray10);
        org.junit.Assert.assertArrayEquals(formatArray10, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(attributedCharacterIterator11);
        org.junit.Assert.assertNotNull(formatArray14);
        org.junit.Assert.assertArrayEquals(formatArray14, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test3607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3607");
        java.util.Locale locale1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormats();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormats();
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.String str6 = extendedMessageFormat2.toPattern();
        java.lang.Object[] objArray8 = extendedMessageFormat2.parse("hi!");
        org.junit.Assert.assertNotNull(formatArray3);
        org.junit.Assert.assertArrayEquals(formatArray3, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertArrayEquals(objArray8, new java.lang.Object[] {});
    }

    @Test
    public void test3608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3608");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        java.lang.String str5 = extendedMessageFormat3.toPattern();
        java.text.Format[] formatArray6 = extendedMessageFormat3.getFormats();
        java.lang.String str7 = extendedMessageFormat3.toPattern();
        java.util.Locale locale8 = extendedMessageFormat3.getLocale();
        java.util.Map map9 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale8, map9);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = extendedMessageFormat11.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "th_TH");
    }

    @Test
    public void test3609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3609");
        java.util.Map map3 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map3);
        extendedMessageFormat4.applyPattern("");
        java.util.Locale locale7 = extendedMessageFormat4.getLocale();
        java.util.Map map8 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale7, map8);
        java.util.Map map10 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale7, map10);
        java.lang.String str12 = extendedMessageFormat11.toPattern();
        java.text.Format[] formatArray13 = extendedMessageFormat11.getFormats();
        java.text.Format[] formatArray14 = extendedMessageFormat11.getFormatsByArgumentIndex();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat21 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale22 = extendedMessageFormat21.getLocale();
        java.util.Map map23 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat24 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale22, map23);
        java.util.Map map25 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat26 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale22, map25);
        java.util.Map map27 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat28 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale22, map27);
        java.util.Map map29 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat30 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale22, map29);
        java.util.Locale locale31 = extendedMessageFormat30.getLocale();
        java.util.Locale locale33 = null;
        java.util.Map map34 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat35 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale33, map34);
        java.text.Format[] formatArray36 = extendedMessageFormat35.getFormats();
        extendedMessageFormat35.applyPattern("");
        java.util.Map map41 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat42 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map41);
        extendedMessageFormat42.applyPattern("");
        java.util.Locale locale45 = extendedMessageFormat42.getLocale();
        java.util.Map map46 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat47 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale45, map46);
        extendedMessageFormat35.setLocale(locale45);
        extendedMessageFormat30.setLocale(locale45);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat50 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale45);
        extendedMessageFormat11.setLocale(locale45);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat56 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale57 = extendedMessageFormat56.getLocale();
        java.util.Map map58 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat59 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale57, map58);
        java.util.Map map60 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat61 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale57, map60);
        java.text.Format[] formatArray62 = extendedMessageFormat61.getFormats();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat11.setFormat(10, (java.text.Format) extendedMessageFormat61);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(formatArray13);
        org.junit.Assert.assertArrayEquals(formatArray13, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray14);
        org.junit.Assert.assertArrayEquals(formatArray14, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray36);
        org.junit.Assert.assertArrayEquals(formatArray36, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale57);
        org.junit.Assert.assertEquals(locale57.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray62);
        org.junit.Assert.assertArrayEquals(formatArray62, new java.text.Format[] {});
    }

    @Test
    public void test3610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3610");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.lang.String str4 = extendedMessageFormat1.toPattern();
        java.text.Format[] formatArray5 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.util.Locale locale6 = extendedMessageFormat1.getLocale();
        java.util.Locale locale7 = extendedMessageFormat1.getLocale();
        extendedMessageFormat1.applyPattern("hi!");
        java.lang.Object[] objArray11 = extendedMessageFormat1.parse("hi!");
        java.lang.String str12 = extendedMessageFormat1.toPattern();
        java.text.Format[] formatArray13 = null;
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat1.setFormats(formatArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale6);
        org.junit.Assert.assertNull(locale7);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertArrayEquals(objArray11, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test3611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3611");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray3 = extendedMessageFormat1.getFormats();
        java.text.Format[] formatArray4 = extendedMessageFormat1.getFormatsByArgumentIndex();
        extendedMessageFormat1.applyPattern("");
        java.text.Format[] formatArray7 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.text.Format[] formatArray8 = extendedMessageFormat1.getFormats();
        java.lang.String str9 = extendedMessageFormat1.toPattern();
        java.util.Locale locale11 = null;
        java.util.Map map12 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale11, map12);
        java.text.Format[] formatArray14 = extendedMessageFormat13.getFormatsByArgumentIndex();
        java.text.Format[] formatArray15 = extendedMessageFormat13.getFormatsByArgumentIndex();
        java.util.Locale locale17 = null;
        java.util.Map map18 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat19 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale17, map18);
        java.text.Format[] formatArray20 = extendedMessageFormat19.getFormats();
        java.text.AttributedCharacterIterator attributedCharacterIterator21 = extendedMessageFormat13.formatToCharacterIterator((java.lang.Object) formatArray20);
        java.lang.Class<?> wildcardClass22 = formatArray20.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator23 = extendedMessageFormat1.formatToCharacterIterator((java.lang.Object) wildcardClass22);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Class cannot be cast to class [Ljava.lang.Object; (java.lang.Class and [Ljava.lang.Object; are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray3);
        org.junit.Assert.assertArrayEquals(formatArray3, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray8);
        org.junit.Assert.assertArrayEquals(formatArray8, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(formatArray14);
        org.junit.Assert.assertArrayEquals(formatArray14, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray15);
        org.junit.Assert.assertArrayEquals(formatArray15, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray20);
        org.junit.Assert.assertArrayEquals(formatArray20, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(attributedCharacterIterator21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3612");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale1, map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormats();
        extendedMessageFormat3.applyPattern("");
        java.text.Format[] formatArray7 = extendedMessageFormat3.getFormatsByArgumentIndex();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale13 = extendedMessageFormat12.getLocale();
        java.util.Map map14 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat15 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale13, map14);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat16 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale13);
        java.lang.String str17 = extendedMessageFormat16.toPattern();
        java.text.Format[] formatArray18 = extendedMessageFormat16.getFormatsByArgumentIndex();
        java.lang.String str19 = java.text.MessageFormat.format("hi!", (java.lang.Object[]) formatArray18);
        java.lang.StringBuffer stringBuffer20 = null;
        java.text.FieldPosition fieldPosition21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer22 = extendedMessageFormat3.format((java.lang.Object[]) formatArray18, stringBuffer20, fieldPosition21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(formatArray18);
        org.junit.Assert.assertArrayEquals(formatArray18, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test3613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3613");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map1);
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale5 = extendedMessageFormat2.getLocale();
        java.util.Map map8 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map8);
        extendedMessageFormat9.applyPattern("");
        java.util.Locale locale12 = extendedMessageFormat9.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale12);
        extendedMessageFormat2.setLocale(locale12);
        java.text.Format[] formatArray15 = extendedMessageFormat2.getFormats();
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale18 = extendedMessageFormat2.getLocale();
        java.text.Format[] formatArray19 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.util.Locale locale20 = extendedMessageFormat2.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = extendedMessageFormat2.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray15);
        org.junit.Assert.assertArrayEquals(formatArray15, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray19);
        org.junit.Assert.assertArrayEquals(formatArray19, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "th_TH");
    }

    @Test
    public void test3614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3614");
        java.util.Locale locale3 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale3);
        java.text.Format[] formatArray5 = extendedMessageFormat4.getFormats();
        java.text.Format[] formatArray6 = extendedMessageFormat4.getFormats();
        java.util.Map map9 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map9);
        java.lang.String str11 = extendedMessageFormat10.toPattern();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.lang.String str14 = extendedMessageFormat13.toPattern();
        java.text.Format[] formatArray15 = extendedMessageFormat13.getFormats();
        java.util.Locale locale16 = extendedMessageFormat13.getLocale();
        extendedMessageFormat10.setLocale(locale16);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat18 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale16);
        extendedMessageFormat4.setLocale(locale16);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat21 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale22 = null;
        extendedMessageFormat21.setLocale(locale22);
        java.util.Locale locale24 = extendedMessageFormat21.getLocale();
        java.text.Format[] formatArray25 = extendedMessageFormat21.getFormats();
        java.text.Format[] formatArray26 = extendedMessageFormat21.getFormatsByArgumentIndex();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat30 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale31 = extendedMessageFormat30.getLocale();
        java.util.Map map32 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat33 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale31, map32);
        java.util.Map map34 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat35 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale31, map34);
        extendedMessageFormat21.setLocale(locale31);
        extendedMessageFormat4.setLocale(locale31);
        java.lang.String str38 = extendedMessageFormat4.toPattern();
        java.text.Format[] formatArray39 = extendedMessageFormat4.getFormats();
        java.lang.String str40 = extendedMessageFormat4.toPattern();
        java.lang.Object[] objArray42 = extendedMessageFormat4.parse("hi!");
        java.lang.String str43 = java.text.MessageFormat.format("", objArray42);
        java.lang.String str44 = java.text.MessageFormat.format("", objArray42);
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(formatArray15);
        org.junit.Assert.assertArrayEquals(formatArray15, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "th_TH");
        org.junit.Assert.assertNull(locale24);
        org.junit.Assert.assertNotNull(formatArray25);
        org.junit.Assert.assertArrayEquals(formatArray25, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray26);
        org.junit.Assert.assertArrayEquals(formatArray26, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertNotNull(formatArray39);
        org.junit.Assert.assertArrayEquals(formatArray39, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertArrayEquals(objArray42, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
    }

    @Test
    public void test3615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3615");
        java.util.Map map3 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map3);
        extendedMessageFormat4.applyPattern("");
        java.util.Locale locale7 = extendedMessageFormat4.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale7);
        java.util.Map map9 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale7, map9);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.lang.String str13 = extendedMessageFormat12.toPattern();
        java.text.Format[] formatArray14 = extendedMessageFormat12.getFormats();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat10.setFormats(formatArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(formatArray14);
        org.junit.Assert.assertArrayEquals(formatArray14, new java.text.Format[] {});
    }

    @Test
    public void test3616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3616");
        java.util.Locale locale3 = null;
        java.util.Map map4 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale3, map4);
        java.text.Format[] formatArray6 = extendedMessageFormat5.getFormatsByArgumentIndex();
        java.lang.String str7 = extendedMessageFormat5.toPattern();
        extendedMessageFormat5.applyPattern("hi!");
        java.text.Format[] formatArray10 = extendedMessageFormat5.getFormats();
        java.lang.String str11 = extendedMessageFormat5.toPattern();
        java.text.Format[] formatArray12 = extendedMessageFormat5.getFormats();
        java.lang.String str13 = java.text.MessageFormat.format("", (java.lang.Object[]) formatArray12);
        java.lang.String str14 = java.text.MessageFormat.format("", (java.lang.Object[]) formatArray12);
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(formatArray10);
        org.junit.Assert.assertArrayEquals(formatArray10, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(formatArray12);
        org.junit.Assert.assertArrayEquals(formatArray12, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test3617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3617");
        java.util.Locale locale2 = null;
        java.util.Map map3 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale2, map3);
        java.text.Format[] formatArray5 = extendedMessageFormat4.getFormats();
        extendedMessageFormat4.applyPattern("");
        java.text.Format[] formatArray8 = extendedMessageFormat4.getFormats();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale15 = extendedMessageFormat14.getLocale();
        java.util.Map map16 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat17 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale15, map16);
        java.util.Map map18 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat19 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale15, map18);
        java.util.Map map20 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat21 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale15, map20);
        java.util.Map map22 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat23 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale15, map22);
        java.util.Locale locale24 = extendedMessageFormat23.getLocale();
        extendedMessageFormat4.setLocale(locale24);
        java.util.Map map26 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat27 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale24, map26);
        java.util.Locale locale28 = extendedMessageFormat27.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat30 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.lang.String str31 = extendedMessageFormat30.toPattern();
        java.text.Format[] formatArray32 = extendedMessageFormat30.getFormats();
        java.lang.Class<?> wildcardClass33 = extendedMessageFormat30.getClass();
        boolean boolean34 = extendedMessageFormat27.equals((java.lang.Object) extendedMessageFormat30);
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray8);
        org.junit.Assert.assertArrayEquals(formatArray8, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(formatArray32);
        org.junit.Assert.assertArrayEquals(formatArray32, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test3618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3618");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale6 = extendedMessageFormat5.getLocale();
        java.util.Map map7 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale6, map7);
        java.util.Map map9 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale6, map9);
        java.util.Map map11 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale6, map11);
        java.util.Map map13 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale6, map13);
        java.util.Locale locale15 = extendedMessageFormat14.getLocale();
        java.lang.String str16 = extendedMessageFormat14.toPattern();
        java.text.ParsePosition parsePosition18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray19 = extendedMessageFormat14.parse("", parsePosition18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }
}

